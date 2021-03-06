package com.activemq.demo;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * 消息接收者
 * 异步接收消息
 */

public class QueueReceiver {

    // tcp 地址
    public static final String BROKER_URL = "tcp://localhost:61616";

    // 目标，在ActiveMQ管理员控制台创建 http://localhost:8161/admin/queues.jsp
    public static final String TARGET = "hoo.mq.queue";

    public static void run() throws Exception {

        QueueConnection connection = null;
        QueueSession session = null;

        try {

            // 创建链接工厂
            QueueConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER, ActiveMQConnection.DEFAULT_PASSWORD, BROKER_URL);

            // 通过工厂创建一个连接
            connection = factory.createQueueConnection();

            // 启动连接
            connection.start();

            // 创建一个session会话
            /**
             * 通过connection创建QueueSession对象；
             * 其中第一个参数为是否支持事务，TRUE为支持，false为不支持；
             * 若设为true,则需要手动COMMIT;
             * 第二个参数为响应的模式，一般情况下就设为QueueSession.AUTO_ACKNOWLEDGE
             * */
            session = connection.createQueueSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

            // 创建一个消息队列
            Queue queue = session.createQueue(TARGET);

            // 创建消息制作者
            javax.jms.QueueReceiver receiver = session.createReceiver(queue);

            //异步接收消息
            receiver.setMessageListener(new MessageListener() {

                public void onMessage(Message msg) {
                    if (msg != null) {
                        MapMessage map = (MapMessage) msg;
                        try {
                            System.out.println(map.getLong("time") + "接收#" + map.getString("text"));
                        } catch (JMSException e) {
                            e.printStackTrace();
                        }
                    }
                }

            });

            // 休眠10s再关闭
            Thread.sleep(1000 * 10);

        } catch (Exception e) {
            throw e;
        } finally {

            // 关闭释放资源
            if (session != null) {
                session.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
    }

    public static void main(String[] args) throws Exception {

        QueueReceiver.run();

    }

}
