package com.google.android.exoplayer2.source;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes3.dex */
public class MediaPeriodId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18349c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18350e;

    public MediaPeriodId(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean a() {
        return this.f18348b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPeriodId)) {
            return false;
        }
        MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
        return this.f18347a.equals(mediaPeriodId.f18347a) && this.f18348b == mediaPeriodId.f18348b && this.f18349c == mediaPeriodId.f18349c && this.d == mediaPeriodId.d && this.f18350e == mediaPeriodId.f18350e;
    }

    public final int hashCode() {
        return ((((((((this.f18347a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f18348b) * 31) + this.f18349c) * 31) + ((int) this.d)) * 31) + this.f18350e;
    }

    public MediaPeriodId(MediaPeriodId mediaPeriodId) {
        this.f18347a = mediaPeriodId.f18347a;
        this.f18348b = mediaPeriodId.f18348b;
        this.f18349c = mediaPeriodId.f18349c;
        this.d = mediaPeriodId.d;
        this.f18350e = mediaPeriodId.f18350e;
    }

    public MediaPeriodId(Object obj, int i2, int i3, long j, int i4) {
        this.f18347a = obj;
        this.f18348b = i2;
        this.f18349c = i3;
        this.d = j;
        this.f18350e = i4;
    }
}
