package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2736Rs;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3692iN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3867kO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3955lO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4747uP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4659tP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Md0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SurfaceHolderCallbackC2658Os;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends L9 implements Handler.Callback {
    public final InterfaceC4659tP m;
    public final SurfaceHolderCallbackC2658Os n;
    public final Handler o;
    public final C4747uP p;
    public FW q;
    public boolean r;
    public boolean s;
    public long t;
    public Metadata u;
    public long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os, Looper looper) {
        Handler handler;
        super(5);
        G7 g7 = InterfaceC4659tP.s1;
        this.n = surfaceHolderCallbackC2658Os;
        if (looper == null) {
            handler = null;
        } else {
            int i = Ug0.f3833a;
            handler = new Handler(looper, this);
        }
        this.o = handler;
        this.m = g7;
        this.p = new C4747uP(1);
        this.v = C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final String e() {
        return "MetadataRenderer";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final boolean g() {
        return this.s;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final boolean h() {
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        y((Metadata) message.obj);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void i() {
        this.u = null;
        this.q = null;
        this.v = C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void k(long j, boolean z) {
        this.u = null;
        this.r = false;
        this.s = false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void o(C4619sw[] c4619swArr, long j, long j2) {
        this.q = ((G7) this.m).r(c4619swArr[0]);
        Metadata metadata = this.u;
        if (metadata != null) {
            this.u = metadata.d((metadata.presentationTimeUs + this.v) - j2);
        }
        this.v = j2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void q(long j, long j2) {
        boolean z;
        do {
            z = false;
            if (!this.r && this.u == null) {
                C4747uP c4747uP = this.p;
                c4747uP.e();
                C3692iN c3692iN = this.b;
                c3692iN.m();
                int iP = p(c3692iN, c4747uP, 0);
                if (iP == -4) {
                    if (c4747uP.c(4)) {
                        this.r = true;
                    } else {
                        c4747uP.j = this.t;
                        c4747uP.h();
                        FW fw = this.q;
                        int i = Ug0.f3833a;
                        Metadata metadataY = fw.y(c4747uP);
                        if (metadataY != null) {
                            ArrayList arrayList = new ArrayList(metadataY.f());
                            w(metadataY, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.u = new Metadata(x(c4747uP.f), arrayList);
                            }
                        }
                    }
                } else if (iP == -5) {
                    C4619sw c4619sw = (C4619sw) c3692iN.c;
                    c4619sw.getClass();
                    this.t = c4619sw.p;
                }
            }
            Metadata metadata = this.u;
            if (metadata != null && metadata.presentationTimeUs <= x(j)) {
                Metadata metadata2 = this.u;
                Handler handler = this.o;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    y(metadata2);
                }
                this.u = null;
                z = true;
            }
            if (this.r && this.u == null) {
                this.s = true;
            }
        } while (z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final int u(C4619sw c4619sw) {
        if (((G7) this.m).E(c4619sw)) {
            return AbstractC3950lJ.b(c4619sw.G == 0 ? 4 : 2, 0, 0);
        }
        return AbstractC3950lJ.b(0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    public final void w(Metadata metadata, ArrayList arrayList) {
        for (int i = 0; i < metadata.f(); i++) {
            C4619sw c4619swK = metadata.e(i).k();
            if (c4619swK != null) {
                G7 g7 = (G7) this.m;
                if (g7.E(c4619swK)) {
                    FW fwR = g7.r(c4619swK);
                    byte[] bArrN = metadata.e(i).n();
                    bArrN.getClass();
                    C4747uP c4747uP = this.p;
                    c4747uP.e();
                    c4747uP.g(bArrN.length);
                    c4747uP.d.put(bArrN);
                    c4747uP.h();
                    Metadata metadataY = fwR.y(c4747uP);
                    if (metadataY != null) {
                        w(metadataY, arrayList);
                    }
                } else {
                    arrayList.add(metadata.e(i));
                }
            } else {
                arrayList.add(metadata.e(i));
            }
        }
    }

    public final long x(long j) {
        FW.s(j != C.TIME_UNSET);
        FW.s(this.v != C.TIME_UNSET);
        return j - this.v;
    }

    public final void y(Metadata metadata) {
        SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = this.n;
        C2736Rs c2736Rs = surfaceHolderCallbackC2658Os.f3526a;
        C3867kO c3867kOA = c2736Rs.g0.a();
        for (int i = 0; i < metadata.f(); i++) {
            metadata.e(i).a(c3867kOA);
        }
        c2736Rs.g0 = new C3955lO(c3867kOA);
        C3955lO c3955lOI = c2736Rs.i();
        boolean zEquals = c3955lOI.equals(c2736Rs.N);
        EI ei = c2736Rs.l;
        if (!zEquals) {
            c2736Rs.N = c3955lOI;
            ei.c(14, new Md0(surfaceHolderCallbackC2658Os, 15));
        }
        ei.c(28, new Md0(metadata, 16));
        ei.b();
    }
}
