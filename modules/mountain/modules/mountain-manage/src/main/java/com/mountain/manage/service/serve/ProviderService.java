package com.mountain.manage.service.serve;

import com.mountain.manage.model.vo.QueryVo;
import com.mountain.manage.model.vo.ServiceVo;
import com.util.BeanCopyUtil;
import com.util.page.CollectionPage;
import com.util.page.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 提供服务的服务类
 */
@Service
public class ProviderService {

    public Page<ServiceVo> queryList(QueryVo queryVo)
    {
        List<ServiceVo> list = testData();
        Page<ServiceVo> page = new CollectionPage<ServiceVo>(list,queryVo.getPage(),queryVo.getRows());
        return page;
    }

    public List<ServiceVo> testData()
    {
        List<ServiceVo> list = new ArrayList<ServiceVo>();
        ServiceVo vo = new ServiceVo();
        vo.setId(1);
        vo.setPid(5112);
        vo.setService("tt-cc-ww-server:1.0");
        vo.setApplication("tt-cc-ww-app");
        vo.setUrl("provider://172.0.0.1:20000/tt-cc-ww-server");
        vo.setOwner("cc开发");
        vo.setNote("测试服务1");
        vo.setUseable(true);
        vo.setWeight(100);
        vo.setAddress("172.0.0.1:20000");
        vo.setParameters("application=tt-cc-ww-app&category=providers&owner=cc开发&pid=5112&timestamp=1469679206966&version=1.0");


        ServiceVo vo2 = new ServiceVo();
        vo2.setId(1);
        vo2.setPid(3322);
        vo2.setService("tt-aa-bb-server:1.1");
        vo2.setApplication("tt-aa-bb-app");
        vo2.setUrl("provider://172.0.0.1:20002/tt-aa-bb-server");
        vo2.setOwner("aa开发");
        vo2.setUseable(false);
        vo2.setWeight(100);
        vo2.setAddress("172.0.0.1:20002");
        vo2.setParameters("application=tt-aa-bb-app&category=providers&owner=aa开发&pid=3322&timestamp=1459679206966&version=1.1");
        vo2.setInvokeFailCnt(0l);
        vo2.setInvokeFailTotalCnt(2l);
        vo2.setInvokeSuccessCnt(120l);
        vo2.setInvokeSucTotalCnt(130000l);

        list.add(vo);
        list.add(vo2);

        for(int i=0;i<20;i++) {
            ServiceVo vo3 = new ServiceVo();
            BeanCopyUtil.copyProperties(vo3, vo2);
            vo3.setId(i+3);
            list.add(vo3);
        }
        return list;
    }
}