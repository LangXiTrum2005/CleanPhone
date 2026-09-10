package com.thinkup.network.facebook;

import com.thinkup.core.api.TUInitConfig;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookTUInitConfig extends TUInitConfig {
    public FacebookTUInitConfig() {
        this.initMediation = FacebookTUInitManager.getInstance();
    }
}
