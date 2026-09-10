package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaFormat;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2684Ps implements InterfaceC4685th0, InterfaceC2668Pc, YU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC4685th0 f3577a;
    public InterfaceC2668Pc b;
    public InterfaceC4685th0 c;
    public InterfaceC2668Pc d;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4685th0
    public final void a(long j, long j2, C4619sw c4619sw, MediaFormat mediaFormat) {
        InterfaceC4685th0 interfaceC4685th0 = this.c;
        if (interfaceC4685th0 != null) {
            interfaceC4685th0.a(j, j2, c4619sw, mediaFormat);
        }
        InterfaceC4685th0 interfaceC4685th1 = this.f3577a;
        if (interfaceC4685th1 != null) {
            interfaceC4685th1.a(j, j2, c4619sw, mediaFormat);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2668Pc
    public final void b(long j, float[] fArr) {
        InterfaceC2668Pc interfaceC2668Pc = this.d;
        if (interfaceC2668Pc != null) {
            interfaceC2668Pc.b(j, fArr);
        }
        InterfaceC2668Pc interfaceC2668Pc2 = this.b;
        if (interfaceC2668Pc2 != null) {
            interfaceC2668Pc2.b(j, fArr);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2668Pc
    public final void c() {
        InterfaceC2668Pc interfaceC2668Pc = this.d;
        if (interfaceC2668Pc != null) {
            interfaceC2668Pc.c();
        }
        InterfaceC2668Pc interfaceC2668Pc2 = this.b;
        if (interfaceC2668Pc2 != null) {
            interfaceC2668Pc2.c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YU
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.f3577a = (InterfaceC4685th0) obj;
            return;
        }
        if (i == 8) {
            this.b = (InterfaceC2668Pc) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        A80 a80 = (A80) obj;
        if (a80 == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = a80.getVideoFrameMetadataListener();
            this.d = a80.getCameraMotionListener();
        }
    }
}
