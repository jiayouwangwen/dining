package com.yaHuiclient.control;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.Socket;

public class clienthandler implements InvocationHandler{
	private String ip;
	private int port;
	
	public clienthandler(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}
	//1.代理对象 2.方法 3.方法的参数
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//创建套接字对象
		Socket client=new Socket(ip,port);
		//获取输出流
		ObjectOutputStream out=new ObjectOutputStream(client.getOutputStream());
		//将代理的方法名称发送给服务器
		out.writeUTF(method.getName());
		out.flush();
		//将代理方法的参数类型发送给服务器
		out.writeObject(method.getParameterTypes());
		out.flush();
		//将方法的参数发送给服务器端
		out.writeObject(args);
		out.flush();
		//服务器返回结果进行接收
		ObjectInputStream in=new ObjectInputStream(client.getInputStream());
		return in.readObject();
	}

}
