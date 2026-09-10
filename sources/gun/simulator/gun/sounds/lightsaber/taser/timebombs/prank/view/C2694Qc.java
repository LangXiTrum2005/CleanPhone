package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2694Qc extends L9 {
    public final C2677Pl m;
    public final JT n;
    public long o;
    public InterfaceC2668Pc p;
    public long q;

    public C2694Qc() {
        super(6);
        this.m = new C2677Pl(1);
        this.n = new JT();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final String e() {
        return "CameraMotionRenderer";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final boolean g() {
        return f();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final boolean h() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YU
    public final void handleMessage(int i, Object obj) {
        if (i == 8) {
            this.p = (InterfaceC2668Pc) obj;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void i() {
        InterfaceC2668Pc interfaceC2668Pc = this.p;
        if (interfaceC2668Pc != null) {
            interfaceC2668Pc.c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void k(long j, boolean z) {
        this.q = Long.MIN_VALUE;
        InterfaceC2668Pc interfaceC2668Pc = this.p;
        if (interfaceC2668Pc != null) {
            interfaceC2668Pc.c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void o(C4619sw[] c4619swArr, long j, long j2) {
        this.o = j2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void q(long j, long j2) {
        float[] fArr;
        while (!f() && this.q < 100000 + j) {
            C2677Pl c2677Pl = this.m;
            c2677Pl.e();
            C3692iN c3692iN = this.b;
            c3692iN.m();
            if (p(c3692iN, c2677Pl, 0) != -4 || c2677Pl.c(4)) {
                return;
            }
            this.q = c2677Pl.f;
            if (this.p != null && !c2677Pl.c(Integer.MIN_VALUE)) {
                c2677Pl.h();
                ByteBuffer byteBuffer = c2677Pl.d;
                int i = Ug0.f3833a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    JT jt = this.n;
                    jt.C(bArrArray, iLimit);
                    jt.E(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(jt.h());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.p.b(this.q - this.o, fArr);
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final int u(C4619sw c4619sw) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(c4619sw.l) ? AbstractC3950lJ.b(4, 0, 0) : AbstractC3950lJ.b(0, 0, 0);
    }
}
