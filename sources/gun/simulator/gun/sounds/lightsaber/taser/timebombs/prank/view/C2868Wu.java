package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2868Wu implements InterfaceC4889w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3945a;
    public long b;

    public /* synthetic */ C2868Wu(int i) {
        this.f3945a = i;
    }

    public static C2868Wu d(InterfaceC4265ot interfaceC4265ot, JT jt) {
        interfaceC4265ot.peekFully(jt.f3266a, 0, 8);
        jt.E(0);
        return new C2868Wu(jt.f(), jt.k(), 0);
    }

    public InterfaceC4977x00 a(int i) throws IOException {
        switch (this.f3945a) {
            case 2:
                Cd0 cd0 = new Cd0(this.b);
                cd0.d(FW.G(i * 2));
                return cd0;
            default:
                C3715if0 c3715if0 = new C3715if0(this.b);
                C3715if0 c3715if1 = new C3715if0(this.b);
                try {
                    c3715if0.f4513a.d(FW.G(0));
                    int iB = c3715if0.b();
                    boolean z = iB % 2 == 0;
                    c3715if1.f4513a.d(FW.G(z ? iB + 1 : iB - 1));
                    if (z) {
                        c3715if0.b = c3715if1;
                        return c3715if0;
                    }
                    c3715if1.b = c3715if0;
                    return c3715if1;
                } catch (IOException e) {
                    FW.v(c3715if0);
                    FW.v(c3715if1);
                    throw e;
                }
        }
    }

    public C2868Wu b() {
        switch (this.f3945a) {
            case 2:
                return null;
            default:
                return new C2868Wu(this.b, 2);
        }
    }

    public boolean c() {
        int i = this.f3945a;
        return i == 0 || i == 1;
    }

    public /* synthetic */ C2868Wu(int i, long j, int i2) {
        this.f3945a = i;
        this.b = j;
    }

    public /* synthetic */ C2868Wu(long j, int i) {
        this.f3945a = i;
        this.b = j;
    }

    public C2868Wu(int i, long j) {
        FW.h(j >= 0);
        this.f3945a = i;
        this.b = j;
    }
}
