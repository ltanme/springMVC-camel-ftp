package com.upgrade.ftp;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created by twl-thinkpad on 2015-04-20.
 */
public class FtpRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:D:/Intellij_IDEA_project/java/upgrade/src/main/webapp/upload").to("ftp://srtuser@42.121.104.88/testjava?password=dota.123&passiveMode=true");
    }
}
