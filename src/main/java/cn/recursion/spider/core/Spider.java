package cn.recursion.spider.core;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class Spider {

    private CloseableHttpClient client;

    public Spider() {
        if (null == client) {
            client = HttpClients.createDefault();
        }
    }

    public void get() {
        
    }
    
    public void post() {
        
    }

}
