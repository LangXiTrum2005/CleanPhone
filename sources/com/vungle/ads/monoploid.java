package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Metrics.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/monoploid;", "", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "metricType", "<init>", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V", "", "getValue", "()J", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "getMetricType", "()Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "setMetricType", "", "meta", "Ljava/lang/String;", "getMeta", "()Ljava/lang/String;", "setMeta", "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class monoploid {
    private String meta;
    private Sdk$SDKMetric.SDKMetricType metricType;

    public monoploid(Sdk$SDKMetric.SDKMetricType metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.metricType = metricType;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final Sdk$SDKMetric.SDKMetricType getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(String str) {
        this.meta = str;
    }

    public final void setMetricType(Sdk$SDKMetric.SDKMetricType sDKMetricType) {
        Intrinsics.checkNotNullParameter(sDKMetricType, "<set-?>");
        this.metricType = sDKMetricType;
    }
}
