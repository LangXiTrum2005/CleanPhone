package com.vungle.ads.internal.util;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: RangeUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lcom/vungle/ads/internal/util/molybdenite;", "", "<init>", "()V", "", "value", "start", "endInclusive", "", "isInRange", "(III)Z", "", "(FFF)Z", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class molybdenite {
    public static final molybdenite INSTANCE = new molybdenite();

    private molybdenite() {
    }

    public static /* synthetic */ boolean isInRange$default(molybdenite molybdeniteVar, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return molybdeniteVar.isInRange(i, i2, i3);
    }

    public final boolean isInRange(float value, float start, float endInclusive) {
        return start <= value && value <= endInclusive;
    }

    public static /* synthetic */ boolean isInRange$default(molybdenite molybdeniteVar, float f, float f2, float f3, int i, Object obj) {
        if ((i & 4) != 0) {
            f3 = Float.MAX_VALUE;
        }
        return molybdeniteVar.isInRange(f, f2, f3);
    }

    public final boolean isInRange(int value, int start, int endInclusive) {
        return start <= value && value <= endInclusive;
    }
}
