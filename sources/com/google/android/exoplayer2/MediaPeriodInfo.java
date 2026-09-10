package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
final class MediaPeriodInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f17145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17147c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17148e;
    public final boolean f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f17149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f17150i;

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        Assertions.b(!z5 || z3);
        Assertions.b(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        Assertions.b(z6);
        this.f17145a = mediaPeriodId;
        this.f17146b = j;
        this.f17147c = j2;
        this.d = j3;
        this.f17148e = j4;
        this.f = z2;
        this.g = z3;
        this.f17149h = z4;
        this.f17150i = z5;
    }

    public final MediaPeriodInfo a(long j) {
        if (j == this.f17147c) {
            return this;
        }
        return new MediaPeriodInfo(this.f17145a, this.f17146b, j, this.d, this.f17148e, this.f, this.g, this.f17149h, this.f17150i);
    }

    public final MediaPeriodInfo b(long j) {
        if (j == this.f17146b) {
            return this;
        }
        return new MediaPeriodInfo(this.f17145a, j, this.f17147c, this.d, this.f17148e, this.f, this.g, this.f17149h, this.f17150i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MediaPeriodInfo.class == obj.getClass()) {
            MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
            if (this.f17146b == mediaPeriodInfo.f17146b && this.f17147c == mediaPeriodInfo.f17147c && this.d == mediaPeriodInfo.d && this.f17148e == mediaPeriodInfo.f17148e && this.f == mediaPeriodInfo.f && this.g == mediaPeriodInfo.g && this.f17149h == mediaPeriodInfo.f17149h && this.f17150i == mediaPeriodInfo.f17150i && Util.a(this.f17145a, mediaPeriodInfo.f17145a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f17145a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f17146b)) * 31) + ((int) this.f17147c)) * 31) + ((int) this.d)) * 31) + ((int) this.f17148e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.f17149h ? 1 : 0)) * 31) + (this.f17150i ? 1 : 0);
    }
}
