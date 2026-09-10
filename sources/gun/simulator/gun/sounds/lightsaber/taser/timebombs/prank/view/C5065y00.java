package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5065y00 implements LI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5255a;
    public final C2956a10 b;
    public final Md0 c;
    public final InterfaceC4353pt d;
    public final InterfaceC4889w00 f;
    public C5153z00 g;
    public volatile boolean h;
    public volatile long j;
    public final Handler e = Ug0.m(null);
    public volatile long i = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public C5065y00(int i, C2956a10 c2956a10, Md0 md0, U00 u00, InterfaceC4889w00 interfaceC4889w00) {
        this.f5255a = i;
        this.b = c2956a10;
        this.c = md0;
        this.d = u00;
        this.f = interfaceC4889w00;
    }

    public final void a(long j, long j2) {
        this.i = j;
        this.j = j2;
    }

    public final void b(int i) {
        C5153z00 c5153z00 = this.g;
        c5153z00.getClass();
        if (c5153z00.h) {
            return;
        }
        this.g.j = i;
    }

    public final void c(long j) {
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            C5153z00 c5153z00 = this.g;
            c5153z00.getClass();
            if (c5153z00.h) {
                return;
            }
            this.g.i = j;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void cancelLoad() {
        this.h = true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void load() {
        InterfaceC4977x00 interfaceC4977x00A = null;
        try {
            interfaceC4977x00A = ((C2868Wu) this.f).a(this.f5255a);
            this.e.post(new RunnableC4746uO(this, interfaceC4977x00A.a(), interfaceC4977x00A, 6));
            C2938Zm c2938Zm = new C2938Zm(interfaceC4977x00A, 0L, -1L);
            C5153z00 c5153z00 = new C5153z00(this.b.f4104a, this.f5255a);
            this.g = c5153z00;
            c5153z00.d(this.d);
            while (!this.h) {
                if (this.i != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    this.g.seek(this.j, this.i);
                    this.i = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                }
                if (this.g.a(c2938Zm, new C2868Wu(1)) == -1) {
                }
            }
        } finally {
            FW.v(interfaceC4977x00A);
        }
    }
}
