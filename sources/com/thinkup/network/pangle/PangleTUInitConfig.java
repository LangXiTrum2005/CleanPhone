package com.thinkup.network.pangle;

import com.thinkup.core.api.TUInitConfig;

/* JADX INFO: loaded from: classes6.dex */
public class PangleTUInitConfig extends TUInitConfig {
    public PangleTUInitConfig(String str) {
        this.paramMap.put("app_id", str);
        this.initMediation = PangleTUInitManager.getInstance();
    }
}
