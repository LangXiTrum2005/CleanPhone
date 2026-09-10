package com.p004ironsource;

import androidx.media3.extractor.text.ttml.a;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ironsource/g2;", "", "", "a", "impressionTimeout", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "J", "b", "()J", "<init>", "(J)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long impressionTimeout;

    public g2(long j) {
        this.impressionTimeout = j;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getImpressionTimeout() {
        return this.impressionTimeout;
    }

    public final long b() {
        return this.impressionTimeout;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof g2) && this.impressionTimeout == ((g2) other).impressionTimeout;
    }

    public int hashCode() {
        return Long.hashCode(this.impressionTimeout);
    }

    public String toString() {
        return a.o(new StringBuilder("AdUnitInteractionData(impressionTimeout="), this.impressionTimeout, ')');
    }

    public final g2 a(long impressionTimeout) {
        return new g2(impressionTimeout);
    }

    public static /* synthetic */ g2 a(g2 g2Var, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = g2Var.impressionTimeout;
        }
        return g2Var.a(j);
    }
}
