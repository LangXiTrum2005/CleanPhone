package com.facebook.ads;

/* JADX INFO: loaded from: classes3.dex */
public interface FullScreenAd extends Ad {

    public interface ShowAdConfig {
    }

    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
