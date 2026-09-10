package com.thinkup.network.vungle;

import com.thinkup.core.api.TUInitConfig;

/* JADX INFO: loaded from: classes6.dex */
public class VungleTUInitConfig extends TUInitConfig {
    public VungleTUInitConfig(String str) {
        this.paramMap.put("app_id", str);
        this.initMediation = VungleTUInitManager.getInstance();
    }
}
