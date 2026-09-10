package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2589Mb implements InterfaceC4353pt, InterfaceC2618Ne {
    public static final C2868Wu j = new C2868Wu(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4177nt f3410a;
    public final int b;
    public final C4619sw c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public InterfaceC2592Me f;
    public long g;
    public O30 h;
    public C4619sw[] i;

    public C2589Mb(InterfaceC4177nt interfaceC4177nt, int i, C4619sw c4619sw) {
        this.f3410a = interfaceC4177nt;
        this.b = i;
        this.c = c4619sw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final void a(O30 o30) {
        this.h = o30;
    }

    public final void b(InterfaceC2592Me interfaceC2592Me, long j2, long j3) {
        this.f = interfaceC2592Me;
        this.g = j3;
        boolean z = this.e;
        InterfaceC4177nt interfaceC4177nt = this.f3410a;
        if (!z) {
            interfaceC4177nt.d(this);
            if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                interfaceC4177nt.seek(0L, j2);
            }
            this.e = true;
            return;
        }
        if (j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j2 = 0;
        }
        interfaceC4177nt.seek(0L, j2);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            C2564Lb c2564Lb = (C2564Lb) sparseArray.valueAt(i);
            if (interfaceC2592Me == null) {
                c2564Lb.e = c2564Lb.c;
            } else {
                c2564Lb.f = j3;
                InterfaceC4326pd0 interfaceC4326pd0A = ((F9) interfaceC2592Me).a(c2564Lb.f3359a);
                c2564Lb.e = interfaceC4326pd0A;
                C4619sw c4619sw = c2564Lb.d;
                if (c4619sw != null) {
                    interfaceC4326pd0A.e(c4619sw);
                }
            }
            i++;
        }
    }

    public final void c() {
        this.f3410a.release();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final void endTracks() {
        SparseArray sparseArray = this.d;
        C4619sw[] c4619swArr = new C4619sw[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            C4619sw c4619sw = ((C2564Lb) sparseArray.valueAt(i)).d;
            FW.t(c4619sw);
            c4619swArr[i] = c4619sw;
        }
        this.i = c4619swArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4353pt
    public final InterfaceC4326pd0 track(int i, int i2) {
        SparseArray sparseArray = this.d;
        C2564Lb c2564Lb = (C2564Lb) sparseArray.get(i);
        if (c2564Lb == null) {
            FW.s(this.i == null);
            c2564Lb = new C2564Lb(i, i2, i2 == this.b ? this.c : null);
            InterfaceC2592Me interfaceC2592Me = this.f;
            long j2 = this.g;
            if (interfaceC2592Me == null) {
                c2564Lb.e = c2564Lb.c;
            } else {
                c2564Lb.f = j2;
                InterfaceC4326pd0 interfaceC4326pd0A = ((F9) interfaceC2592Me).a(i2);
                c2564Lb.e = interfaceC4326pd0A;
                C4619sw c4619sw = c2564Lb.d;
                if (c4619sw != null) {
                    interfaceC4326pd0A.e(c4619sw);
                }
            }
            sparseArray.put(i, c2564Lb);
        }
        return c2564Lb;
    }
}
