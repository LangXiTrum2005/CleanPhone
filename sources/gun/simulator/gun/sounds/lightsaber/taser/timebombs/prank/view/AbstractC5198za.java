package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5198za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4758ua f5330a;
    public final InterfaceC5110ya b;
    public C4846va c;
    public final int d;

    public AbstractC5198za(InterfaceC4934wa interfaceC4934wa, InterfaceC5110ya interfaceC5110ya, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = interfaceC5110ya;
        this.d = i;
        this.f5330a = new C4758ua(interfaceC4934wa, j, j2, j3, j4, j5);
    }

    public static int b(InterfaceC4265ot interfaceC4265ot, long j, C2868Wu c2868Wu) {
        if (j == interfaceC4265ot.getPosition()) {
            return 0;
        }
        c2868Wu.b = j;
        return 1;
    }

    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) {
        while (true) {
            C4846va c4846va = this.c;
            FW.t(c4846va);
            long j = c4846va.f;
            long j2 = c4846va.g;
            long j3 = c4846va.h;
            long j4 = j2 - j;
            long j5 = this.d;
            InterfaceC5110ya interfaceC5110ya = this.b;
            if (j4 <= j5) {
                this.c = null;
                interfaceC5110ya.i();
                return b(interfaceC4265ot, j, c2868Wu);
            }
            long position = j3 - interfaceC4265ot.getPosition();
            if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                return b(interfaceC4265ot, j3, c2868Wu);
            }
            interfaceC4265ot.skipFully((int) position);
            interfaceC4265ot.resetPeekPosition();
            C5022xa c5022xaG = interfaceC5110ya.g(interfaceC4265ot, c4846va.b);
            int i = c5022xaG.f5228a;
            if (i == -3) {
                this.c = null;
                interfaceC5110ya.i();
                return b(interfaceC4265ot, j3, c2868Wu);
            }
            long j6 = c5022xaG.b;
            long j7 = c5022xaG.c;
            if (i == -2) {
                c4846va.d = j6;
                c4846va.f = j7;
                c4846va.h = C4846va.a(c4846va.b, j6, c4846va.e, j7, c4846va.g, c4846va.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j7 - interfaceC4265ot.getPosition();
                    if (position2 >= 0 && position2 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        interfaceC4265ot.skipFully((int) position2);
                    }
                    this.c = null;
                    interfaceC5110ya.i();
                    return b(interfaceC4265ot, j7, c2868Wu);
                }
                c4846va.e = j6;
                c4846va.g = j7;
                c4846va.h = C4846va.a(c4846va.b, c4846va.d, j6, c4846va.f, j7, c4846va.c);
            }
        }
    }

    public final void c(long j) {
        C4846va c4846va = this.c;
        if (c4846va == null || c4846va.f5137a != j) {
            C4758ua c4758ua = this.f5330a;
            this.c = new C4846va(j, c4758ua.f5084a.c(j), c4758ua.c, c4758ua.d, c4758ua.e, c4758ua.f, c4758ua.g);
        }
    }
}
