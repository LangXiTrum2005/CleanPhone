package com.startapp.sdk.adsbase.remoteconfig;

/* JADX INFO: loaded from: classes6.dex */
public enum MetaDataRequest$RequestReason {
    LAUNCH(1),
    APP_IDLE(2),
    IN_APP_PURCHASE(3),
    CUSTOM(4),
    PERIODIC(5),
    PAS(6),
    CONSENT(7),
    IMPLICIT_LAUNCH(8),
    EXTRAS(9);

    private int index;

    MetaDataRequest$RequestReason(int i2) {
        this.index = i2;
    }
}
