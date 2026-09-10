package com.smartdigimkt.b4;

import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f33925c = new l(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f33927b;

    public l(long j, long j2) {
        this.f33926a = j;
        this.f33927b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f33926a == lVar.f33926a && this.f33927b == lVar.f33927b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f33926a) * 31) + ((int) this.f33927b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f33926a);
        sb.append(", position=");
        return android.support.v4.media.a.j(this.f33927b, d9.i.f24752e, sb);
    }
}
