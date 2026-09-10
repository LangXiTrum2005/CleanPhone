package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n4 implements v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17637a;

    public n4(long j10) {
        this.f17637a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n4.class == obj.getClass() && this.f17637a == ((n4) obj).f17637a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17637a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        long j10 = this.f17637a;
        return defpackage.e.s(new StringBuilder(String.valueOf(j10).length() + 38), "ThumbnailMetadata: presentationTimeUs=", j10);
    }
}
