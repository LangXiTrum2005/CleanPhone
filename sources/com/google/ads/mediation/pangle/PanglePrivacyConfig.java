package com.google.ads.mediation.pangle;

import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;

/* JADX INFO: loaded from: classes2.dex */
public class PanglePrivacyConfig {
    public static int b = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PangleSdkWrapper f772a;

    public PanglePrivacyConfig(PangleSdkWrapper pangleSdkWrapper) {
        this.f772a = pangleSdkWrapper;
    }

    public static int getCoppa() {
        return b;
    }

    public void setCoppa(int i) {
        PangleSdkWrapper pangleSdkWrapper = this.f772a;
        if (i == 0) {
            pangleSdkWrapper.getClass();
            if (PAGSdk.isInitSuccess()) {
                pangleSdkWrapper.getClass();
                PAGConfig.setChildDirected(0);
            }
            b = 0;
            return;
        }
        if (i != 1) {
            pangleSdkWrapper.getClass();
            if (PAGSdk.isInitSuccess()) {
                pangleSdkWrapper.getClass();
                PAGConfig.setChildDirected(-1);
            }
            b = -1;
            return;
        }
        pangleSdkWrapper.getClass();
        if (PAGSdk.isInitSuccess()) {
            pangleSdkWrapper.getClass();
            PAGConfig.setChildDirected(1);
        }
        b = 1;
    }
}
