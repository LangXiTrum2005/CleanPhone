package com.smartdigimkt.w3;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f39373e = new v(1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f39375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39376c;
    private final int d;

    public v(float f) {
        this(f, 1.0f, false);
    }

    public long a(long j) {
        return j * ((long) this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            if (this.f39374a == vVar.f39374a && this.f39375b == vVar.f39375b && this.f39376c == vVar.f39376c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.f39375b) + ((Float.floatToRawIntBits(this.f39374a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31) + (this.f39376c ? 1 : 0);
    }

    public v(float f, float f2) {
        this(f, f2, false);
    }

    public v(float f, float f2, boolean z2) {
        com.smartdigimkt.p4.a.a(f > 0.0f);
        com.smartdigimkt.p4.a.a(f2 > 0.0f);
        this.f39374a = f;
        this.f39375b = f2;
        this.f39376c = z2;
        this.d = Math.round(f * 1000.0f);
    }
}
