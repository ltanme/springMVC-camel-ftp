package com.upgrade.ftp;

/**
 * Created by twl-thinkpad on 2015-04-20.
 */
public class FtpPropertiesImpl implements FtpProperties {
    private String Protocol;
    private String UserName;
    private String Password;
    private String Host;
    private String RemoteDirectory;
    private boolean PassiveMode;

    public FtpPropertiesImpl(String protocol, String userName, String password, String host, String remoteDirectory, boolean passiveMode) {
        Protocol = protocol;
        UserName = userName;
        Password = password;
        Host = host;
        RemoteDirectory = remoteDirectory;
        PassiveMode = passiveMode;
    }

    @Override
    public String getProtocol() {
        return Protocol;
    }

    public void setProtocol(String protocol) {
        Protocol = protocol;
    }

    @Override
    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    @Override
    public String getRemoteDirectory() {
        return RemoteDirectory;
    }

    public void setRemoteDirectory(String remoteDirectory) {
        RemoteDirectory = remoteDirectory;
    }

    @Override
    public boolean getPassiveMode() {
        return true;
    }

    @Override
    public String toString() {
        return "FtpPropertiesImpl{" +
                "Protocol='" + Protocol + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", Host='" + Host + '\'' +
                ", RemoteDirectory='" + RemoteDirectory + '\'' +
                ", PassiveMode=" + PassiveMode +
                '}';
    }
}
