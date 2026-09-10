package com.google.android.datatransport.runtime.scheduling.persistence;

import com.thinkup.core.oo.m0;

/* JADX INFO: loaded from: classes3.dex */
abstract class EventStoreConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoValue_EventStoreConfig f16954a;

    public static abstract class Builder {
    }

    static {
        AutoValue_EventStoreConfig.Builder builder = new AutoValue_EventStoreConfig.Builder();
        builder.f16947a = 10485760L;
        builder.f16948b = 200;
        builder.f16949c = 10000;
        builder.d = Long.valueOf(m0.om);
        builder.f16950e = 81920;
        String strM = builder.f16947a == null ? " maxStorageSizeInBytes" : "";
        if (builder.f16948b == null) {
            strM = strM.concat(" loadBatchSize");
        }
        if (builder.f16949c == null) {
            strM = android.support.v4.media.a.m(strM, " criticalSectionEnterTimeoutMs");
        }
        if (builder.d == null) {
            strM = android.support.v4.media.a.m(strM, " eventCleanUpAge");
        }
        if (builder.f16950e == null) {
            strM = android.support.v4.media.a.m(strM, " maxBlobByteSizePerRow");
        }
        if (!strM.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }
        f16954a = new AutoValue_EventStoreConfig(builder.f16948b.intValue(), builder.f16949c.intValue(), builder.f16950e.intValue(), builder.f16947a.longValue(), builder.d.longValue());
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
