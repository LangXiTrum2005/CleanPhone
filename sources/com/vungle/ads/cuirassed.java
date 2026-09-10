package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Metrics.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/cuirassed;", "Lcom/vungle/ads/monoploid;", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "metricType", "<init>", "(Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;)V", "", "markTime", "()V", "", "add", "addValue", "(J)V", "getValue", "()J", "value", "Ljava/lang/Long;", "()Ljava/lang/Long;", "setValue", "(Ljava/lang/Long;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class cuirassed extends monoploid {
    private Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuirassed(Sdk$SDKMetric.SDKMetricType metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final void addValue(long add) {
        Long l = this.value;
        this.value = Long.valueOf((l != null ? l.longValue() : 0L) + add);
    }

    public final Long getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(Long l) {
        this.value = l;
    }

    @Override // com.vungle.ads.monoploid
    public long getValue() {
        Long l = this.value;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
