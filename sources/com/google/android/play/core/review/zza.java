package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.support.v4.media.a;

/* JADX INFO: loaded from: classes4.dex */
final class zza extends ReviewInfo {
    public final PendingIntent X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f19668Y;

    public zza(PendingIntent pendingIntent, boolean z2) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.X = pendingIntent;
        this.f19668Y = z2;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.X;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean b() {
        return this.f19668Y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReviewInfo)) {
            return false;
        }
        ReviewInfo reviewInfo = (ReviewInfo) obj;
        return this.X.equals(reviewInfo.a()) && this.f19668Y == reviewInfo.b();
    }

    public final int hashCode() {
        return ((this.X.hashCode() ^ 1000003) * 1000003) ^ (true != this.f19668Y ? 1237 : 1231);
    }

    public final String toString() {
        return a.t(a.y("ReviewInfo{pendingIntent=", this.X.toString(), ", isNoOp="), this.f19668Y, "}");
    }
}
