package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2523Jm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2618Ne f3282a;
    public final FY b;
    public final U9 c;
    public final InterfaceC3021al d;
    public final long e;
    public final long f;

    public C2523Jm(long j, FY fy, U9 u9, InterfaceC2618Ne interfaceC2618Ne, long j2, InterfaceC3021al interfaceC3021al) {
        this.e = j;
        this.b = fy;
        this.c = u9;
        this.f = j2;
        this.f3282a = interfaceC2618Ne;
        this.d = interfaceC3021al;
    }

    public final C2523Jm a(long j, FY fy) throws C3529ga {
        long jH;
        InterfaceC3021al interfaceC3021alB = this.b.b();
        InterfaceC3021al interfaceC3021alB2 = fy.b();
        if (interfaceC3021alB == null) {
            return new C2523Jm(j, fy, this.c, this.f3282a, this.f, interfaceC3021alB);
        }
        if (!interfaceC3021alB.t()) {
            return new C2523Jm(j, fy, this.c, this.f3282a, this.f, interfaceC3021alB2);
        }
        long jM = interfaceC3021alB.m(j);
        if (jM == 0) {
            return new C2523Jm(j, fy, this.c, this.f3282a, this.f, interfaceC3021alB2);
        }
        long jU = interfaceC3021alB.u();
        long timeUs = interfaceC3021alB.getTimeUs(jU);
        long j2 = jM + jU;
        long j3 = j2 - 1;
        long jC = interfaceC3021alB.c(j3, j) + interfaceC3021alB.getTimeUs(j3);
        long jU2 = interfaceC3021alB2.u();
        long timeUs2 = interfaceC3021alB2.getTimeUs(jU2);
        long j4 = this.f;
        if (jC == timeUs2) {
            jH = (j2 - jU2) + j4;
        } else {
            if (jC < timeUs2) {
                throw new C3529ga();
            }
            jH = timeUs2 < timeUs ? j4 - (interfaceC3021alB2.h(timeUs, j) - jU) : (interfaceC3021alB.h(timeUs2, j) - jU2) + j4;
        }
        return new C2523Jm(j, fy, this.c, this.f3282a, jH, interfaceC3021alB2);
    }

    public final long b(long j) {
        InterfaceC3021al interfaceC3021al = this.d;
        long j2 = this.e;
        return (interfaceC3021al.v(j2, j) + (interfaceC3021al.e(j2, j) + this.f)) - 1;
    }

    public final long c(long j) {
        return this.d.c(j - this.f, this.e) + d(j);
    }

    public final long d(long j) {
        return this.d.getTimeUs(j - this.f);
    }
}
