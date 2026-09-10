package com.bykv.vk.openvk.preload.falconx.loader;

import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface ILoader {
    boolean exist(String str) throws Exception;

    Map<String, Long> getChannelVersion();

    InputStream getInputStream(String str) throws Exception;

    String getResRootDir();

    void release() throws Exception;
}
