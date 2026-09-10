package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public final class Yb0 extends L9 implements Handler.Callback {
    public long A;
    public long B;
    public long C;
    public final Handler m;
    public final Wb0 n;
    public final InterfaceC4759ua0 o;
    public final C3692iN p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public C4619sw u;
    public InterfaceC4583sa0 v;
    public C4935wa0 w;
    public AbstractC5023xa0 x;
    public AbstractC5023xa0 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yb0(SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os, Looper looper) {
        Handler handler;
        super(3);
        C2443Gk c2443Gk = InterfaceC4759ua0.f5085a;
        this.n = surfaceHolderCallbackC2658Os;
        if (looper == null) {
            handler = null;
        } else {
            int i = Ug0.f3833a;
            handler = new Handler(looper, this);
        }
        this.m = handler;
        this.o = c2443Gk;
        this.p = new C3692iN(28);
        this.A = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.C = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final String e() {
        return "TextRenderer";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final boolean g() {
        return this.r;
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
        y((C2469Hk) message.obj);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void i() {
        this.u = null;
        this.A = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        C2469Hk c2469Hk = new C2469Hk(x(this.C), C3965lY.e);
        Handler handler = this.m;
        if (handler != null) {
            handler.obtainMessage(0, c2469Hk).sendToTarget();
        } else {
            y(c2469Hk);
        }
        this.B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.C = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        z();
        InterfaceC4583sa0 interfaceC4583sa0 = this.v;
        interfaceC4583sa0.getClass();
        interfaceC4583sa0.release();
        this.v = null;
        this.t = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void k(long j, boolean z) {
        this.C = j;
        C2469Hk c2469Hk = new C2469Hk(x(this.C), C3965lY.e);
        Handler handler = this.m;
        if (handler != null) {
            handler.obtainMessage(0, c2469Hk).sendToTarget();
        } else {
            y(c2469Hk);
        }
        this.q = false;
        this.r = false;
        this.A = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        if (this.t == 0) {
            z();
            InterfaceC4583sa0 interfaceC4583sa0 = this.v;
            interfaceC4583sa0.getClass();
            interfaceC4583sa0.flush();
            return;
        }
        z();
        InterfaceC4583sa0 interfaceC4583sa1 = this.v;
        interfaceC4583sa1.getClass();
        interfaceC4583sa1.release();
        this.v = null;
        this.t = 0;
        this.s = true;
        C4619sw c4619sw = this.u;
        c4619sw.getClass();
        this.v = ((C2443Gk) this.o).d(c4619sw);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void o(C4619sw[] c4619swArr, long j, long j2) {
        this.B = j2;
        C4619sw c4619sw = c4619swArr[0];
        this.u = c4619sw;
        if (this.v != null) {
            this.t = 1;
            return;
        }
        this.s = true;
        c4619sw.getClass();
        this.v = ((C2443Gk) this.o).d(c4619sw);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x011d  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:65:0x015a  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final void q(long j, long j2) {
        boolean z;
        int nextEventTimeIndex;
        long eventTime;
        C2469Hk c2469Hk;
        C3692iN c3692iN = this.p;
        this.C = j;
        if (this.k) {
            long j3 = this.A;
            if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && j >= j3) {
                z();
                this.r = true;
            }
        }
        if (this.r) {
            return;
        }
        AbstractC5023xa0 abstractC5023xa0 = this.y;
        InterfaceC4759ua0 interfaceC4759ua0 = this.o;
        Handler handler = this.m;
        if (abstractC5023xa0 == null) {
            InterfaceC4583sa0 interfaceC4583sa0 = this.v;
            interfaceC4583sa0.getClass();
            interfaceC4583sa0.setPositionUs(j);
            try {
                InterfaceC4583sa0 interfaceC4583sa1 = this.v;
                interfaceC4583sa1.getClass();
                this.y = (AbstractC5023xa0) interfaceC4583sa1.dequeueOutputBuffer();
            } catch (C4671ta0 e) {
                AbstractC4038mJ.d("Subtitle decoding failed. streamFormat=" + this.u, e);
                C2469Hk c2469Hk2 = new C2469Hk(x(this.C), C3965lY.e);
                if (handler != null) {
                    handler.obtainMessage(0, c2469Hk2).sendToTarget();
                } else {
                    y(c2469Hk2);
                }
                z();
                InterfaceC4583sa0 interfaceC4583sa2 = this.v;
                interfaceC4583sa2.getClass();
                interfaceC4583sa2.release();
                this.v = null;
                this.t = 0;
                this.s = true;
                C4619sw c4619sw = this.u;
                c4619sw.getClass();
                this.v = ((C2443Gk) interfaceC4759ua0).d(c4619sw);
                return;
            }
        }
        if (this.f != 2) {
            return;
        }
        if (this.x != null) {
            long jW = w();
            z = false;
            while (jW <= j) {
                this.z++;
                jW = w();
                z = true;
            }
        } else {
            z = false;
        }
        AbstractC5023xa0 abstractC5023xa1 = this.y;
        if (abstractC5023xa1 != null) {
            if (!abstractC5023xa1.c(4)) {
                if (abstractC5023xa1.c <= j) {
                    AbstractC5023xa0 abstractC5023xa2 = this.x;
                    if (abstractC5023xa2 != null) {
                        abstractC5023xa2.e();
                    }
                    this.z = abstractC5023xa1.getNextEventTimeIndex(j);
                    this.x = abstractC5023xa1;
                    this.y = null;
                }
                this.x.getClass();
                nextEventTimeIndex = this.x.getNextEventTimeIndex(j);
                if (nextEventTimeIndex != 0) {
                    eventTime = this.x.c;
                } else {
                    eventTime = this.x.c;
                }
                c2469Hk = new C2469Hk(x(eventTime), this.x.getCues(j));
                if (handler != null) {
                    handler.obtainMessage(0, c2469Hk).sendToTarget();
                } else {
                    y(c2469Hk);
                }
            } else if (!z && w() == Long.MAX_VALUE) {
                if (this.t == 2) {
                    z();
                    InterfaceC4583sa0 interfaceC4583sa3 = this.v;
                    interfaceC4583sa3.getClass();
                    interfaceC4583sa3.release();
                    this.v = null;
                    this.t = 0;
                    this.s = true;
                    C4619sw c4619sw2 = this.u;
                    c4619sw2.getClass();
                    this.v = ((C2443Gk) interfaceC4759ua0).d(c4619sw2);
                } else {
                    z();
                    this.r = true;
                }
            }
            if (z) {
                this.x.getClass();
                nextEventTimeIndex = this.x.getNextEventTimeIndex(j);
                if (nextEventTimeIndex != 0) {
                    eventTime = this.x.c;
                } else {
                    eventTime = this.x.c;
                }
                c2469Hk = new C2469Hk(x(eventTime), this.x.getCues(j));
                if (handler != null) {
                    handler.obtainMessage(0, c2469Hk).sendToTarget();
                } else {
                    y(c2469Hk);
                }
            }
        } else if (z) {
            this.x.getClass();
            nextEventTimeIndex = this.x.getNextEventTimeIndex(j);
            if (nextEventTimeIndex != 0 || this.x.getEventTimeCount() == 0) {
                eventTime = this.x.c;
            } else if (nextEventTimeIndex == -1) {
                AbstractC5023xa0 abstractC5023xa3 = this.x;
                eventTime = abstractC5023xa3.getEventTime(abstractC5023xa3.getEventTimeCount() - 1);
            } else {
                eventTime = this.x.getEventTime(nextEventTimeIndex - 1);
            }
            c2469Hk = new C2469Hk(x(eventTime), this.x.getCues(j));
            if (handler != null) {
                handler.obtainMessage(0, c2469Hk).sendToTarget();
            } else {
                y(c2469Hk);
            }
        }
        if (this.t == 2) {
            return;
        }
        while (!this.q) {
            try {
                C4935wa0 c4935wa0 = this.w;
                if (c4935wa0 == null) {
                    InterfaceC4583sa0 interfaceC4583sa4 = this.v;
                    interfaceC4583sa4.getClass();
                    c4935wa0 = (C4935wa0) interfaceC4583sa4.dequeueInputBuffer();
                    if (c4935wa0 == null) {
                        return;
                    } else {
                        this.w = c4935wa0;
                    }
                }
                if (this.t == 1) {
                    c4935wa0.b = 4;
                    InterfaceC4583sa0 interfaceC4583sa5 = this.v;
                    interfaceC4583sa5.getClass();
                    interfaceC4583sa5.a(c4935wa0);
                    this.w = null;
                    this.t = 2;
                    return;
                }
                int iP = p(c3692iN, c4935wa0, 0);
                if (iP == -4) {
                    if (c4935wa0.c(4)) {
                        this.q = true;
                        this.s = false;
                    } else {
                        C4619sw c4619sw3 = (C4619sw) c3692iN.c;
                        if (c4619sw3 == null) {
                            return;
                        }
                        c4935wa0.j = c4619sw3.p;
                        c4935wa0.h();
                        this.s &= !c4935wa0.c(1);
                    }
                    if (!this.s) {
                        InterfaceC4583sa0 interfaceC4583sa6 = this.v;
                        interfaceC4583sa6.getClass();
                        interfaceC4583sa6.a(c4935wa0);
                        this.w = null;
                    }
                } else if (iP == -3) {
                    return;
                }
            } catch (C4671ta0 e2) {
                AbstractC4038mJ.d("Subtitle decoding failed. streamFormat=" + this.u, e2);
                C2469Hk c2469Hk3 = new C2469Hk(x(this.C), C3965lY.e);
                if (handler != null) {
                    handler.obtainMessage(0, c2469Hk3).sendToTarget();
                } else {
                    y(c2469Hk3);
                }
                z();
                InterfaceC4583sa0 interfaceC4583sa7 = this.v;
                interfaceC4583sa7.getClass();
                interfaceC4583sa7.release();
                this.v = null;
                this.t = 0;
                this.s = true;
                C4619sw c4619sw4 = this.u;
                c4619sw4.getClass();
                this.v = ((C2443Gk) interfaceC4759ua0).d(c4619sw4);
                return;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L9
    public final int u(C4619sw c4619sw) {
        if (((C2443Gk) this.o).f(c4619sw)) {
            return AbstractC3950lJ.b(c4619sw.G == 0 ? 4 : 2, 0, 0);
        }
        return AbstractC5011xP.l(c4619sw.l) ? AbstractC3950lJ.b(1, 0, 0) : AbstractC3950lJ.b(0, 0, 0);
    }

    public final long w() {
        if (this.z == -1) {
            return Long.MAX_VALUE;
        }
        this.x.getClass();
        if (this.z >= this.x.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.x.getEventTime(this.z);
    }

    public final long x(long j) {
        FW.s(j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        FW.s(this.B != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        return j - this.B;
    }

    public final void y(C2469Hk c2469Hk) {
        AC ac = c2469Hk.f3181a;
        Wb0 wb0 = this.n;
        ((SurfaceHolderCallbackC2658Os) wb0).f3526a.l.e(27, new Md0(ac, 13));
        C2736Rs c2736Rs = ((SurfaceHolderCallbackC2658Os) wb0).f3526a;
        c2736Rs.b0 = c2469Hk;
        c2736Rs.l.e(27, new Md0(c2469Hk, 14));
    }

    public final void z() {
        this.w = null;
        this.z = -1;
        AbstractC5023xa0 abstractC5023xa0 = this.x;
        if (abstractC5023xa0 != null) {
            abstractC5023xa0.e();
            this.x = null;
        }
        AbstractC5023xa0 abstractC5023xa1 = this.y;
        if (abstractC5023xa1 != null) {
            abstractC5023xa1.e();
            this.y = null;
        }
    }
}
