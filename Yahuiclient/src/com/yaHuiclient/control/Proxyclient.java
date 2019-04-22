package com.yaHuiclient.control;

import java.lang.reflect.Proxy;

//作用  通过网络连接服务器端获取代理对象
public class Proxyclient {
    public static <T> T getClient(Class<T> clazz,String ip,int port){
    	//1.当前对象的类加载器 2.客户端中介 3.实际代理接口
		return (T) Proxy.newProxyInstance(Proxyclient.class.getClassLoader(), new Class[]{clazz}, new clienthandler(ip, port));
    }
}
