package com.thinkup.network.gtm;

import com.thinkup.core.api.TUInitConfig;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTUInitConfig extends TUInitConfig {
    public GTMTUInitConfig(String str, String str2) {
        this.paramMap.put("appid", str);
        this.paramMap.put("appkey", str2);
        this.initMediation = GTMTUInitManager.getInstance();
    }
}
