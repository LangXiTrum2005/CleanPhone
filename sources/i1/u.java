package i1;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f42697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f42698e;

    static {
        new t().a();
        l1.y.G(0);
        l1.y.G(1);
        l1.y.G(2);
        l1.y.G(3);
        l1.y.G(4);
    }

    public u(t tVar) {
        long j10 = tVar.f42668a;
        long j11 = tVar.f42669b;
        long j12 = tVar.f42670c;
        float f10 = tVar.f42671d;
        float f11 = tVar.f42672e;
        this.f42694a = j10;
        this.f42695b = j11;
        this.f42696c = j12;
        this.f42697d = f10;
        this.f42698e = f11;
    }

    public final t a() {
        t tVar = new t();
        tVar.f42668a = this.f42694a;
        tVar.f42669b = this.f42695b;
        tVar.f42670c = this.f42696c;
        tVar.f42671d = this.f42697d;
        tVar.f42672e = this.f42698e;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f42694a == uVar.f42694a && this.f42695b == uVar.f42695b && this.f42696c == uVar.f42696c && this.f42697d == uVar.f42697d && this.f42698e == uVar.f42698e;
    }

    public final int hashCode() {
        long j10 = this.f42694a;
        long j11 = this.f42695b;
        int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f42696c;
        int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
        float f10 = this.f42697d;
        int iFloatToIntBits = (i11 + (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f42698e;
        return iFloatToIntBits + (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f11) : 0);
    }
}
