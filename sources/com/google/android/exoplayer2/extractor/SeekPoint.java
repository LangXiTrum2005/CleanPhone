package com.google.android.exoplayer2.extractor;

import android.support.v4.media.a;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes3.dex */
public final class SeekPoint {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SeekPoint f17559c = new SeekPoint(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17561b;

    public SeekPoint(long j, long j2) {
        this.f17560a = j;
        this.f17561b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SeekPoint.class == obj.getClass()) {
            SeekPoint seekPoint = (SeekPoint) obj;
            if (this.f17560a == seekPoint.f17560a && this.f17561b == seekPoint.f17561b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f17560a) * 31) + ((int) this.f17561b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f17560a);
        sb.append(", position=");
        return a.j(this.f17561b, d9.i.f24752e, sb);
    }
}
