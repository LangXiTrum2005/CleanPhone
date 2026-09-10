package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4658tO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5186zO f5033a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public C4658tO(C5186zO c5186zO, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        FW.h(!z4 || z2);
        FW.h(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        FW.h(z5);
        this.f5033a = c5186zO;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final C4658tO a(long j) {
        if (j == this.c) {
            return this;
        }
        return new C4658tO(this.f5033a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final C4658tO b(long j) {
        if (j == this.b) {
            return this;
        }
        return new C4658tO(this.f5033a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4658tO.class != obj.getClass()) {
            return false;
        }
        C4658tO c4658tO = (C4658tO) obj;
        return this.b == c4658tO.b && this.c == c4658tO.c && this.d == c4658tO.d && this.e == c4658tO.e && this.f == c4658tO.f && this.g == c4658tO.g && this.h == c4658tO.h && this.i == c4658tO.i && Ug0.a(this.f5033a, c4658tO.f5033a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f5033a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
