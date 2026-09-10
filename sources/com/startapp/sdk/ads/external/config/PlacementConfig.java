package com.startapp.sdk.ads.external.config;

import com.p004ironsource.x4;
import com.startapp.sdk.internal.ke;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/startapp/sdk/ads/external/config/PlacementConfig;", "Ljava/io/Serializable;", "<init>", "()V", "", "isFallbackActive", "()Z", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "ratio", "D", "getRatio", "()D", "setRatio", "(D)V", "options", "I", "getOptions", "setOptions", "(I)V", "Companion", "com/startapp/sdk/internal/ke", "sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlacementConfig implements Serializable {
    public static final ke Companion = new ke();
    public static final int DELEGATION_BY_CHANCE = 1;
    public static final int FALLBACK_DELEGATION = 2;
    private static final long serialVersionUID = 6500975630965743999L;
    private int options;
    private double ratio;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !JvmClassMappingKt.e(PlacementConfig.class).equals(JvmClassMappingKt.e(other.getClass()))) {
            return false;
        }
        PlacementConfig placementConfig = (PlacementConfig) other;
        return Double.compare(this.ratio, placementConfig.ratio) == 0 && Intrinsics.h(this.options, placementConfig.options) == 0;
    }

    public final int getOptions() {
        return this.options;
    }

    public final double getRatio() {
        return this.ratio;
    }

    public int hashCode() {
        Object[] objArr = {Double.valueOf(this.ratio), Integer.valueOf(this.options)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final boolean isFallbackActive() {
        return (this.options & 2) == 2;
    }

    public final void setOptions(int i2) {
        this.options = i2;
    }

    public final void setRatio(double d) {
        this.ratio = d;
    }
}
