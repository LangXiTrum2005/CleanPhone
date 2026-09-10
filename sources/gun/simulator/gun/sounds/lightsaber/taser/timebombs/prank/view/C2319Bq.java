package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2319Bq implements InterfaceC2656Oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2895a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public C2319Bq(List list) {
        this.f2895a = 0;
        this.f = list;
        this.g = new InterfaceC4326pd0[list.size()];
        this.c = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void a(JT jt) {
        switch (this.f2895a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (jt.a() != 0) {
                            if (jt.t() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            if (!this.b) {
                            }
                        }
                    }
                    if (this.d == 1) {
                        if (jt.a() != 0) {
                            if (jt.t() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            if (!this.b) {
                            }
                        }
                    }
                    int i = jt.b;
                    int iA = jt.a();
                    for (InterfaceC4326pd0 interfaceC4326pd0 : (InterfaceC4326pd0[]) this.g) {
                        jt.E(i);
                        interfaceC4326pd0.d(iA, jt);
                    }
                    this.e += iA;
                }
                break;
            default:
                FW.t((InterfaceC4326pd0) this.g);
                if (this.b) {
                    int iA2 = jt.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        byte[] bArr = jt.f3266a;
                        int i3 = jt.b;
                        JT jt2 = (JT) this.f;
                        System.arraycopy(bArr, i3, jt2.f3266a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            jt2.E(0);
                            if (73 == jt2.t() && 68 == jt2.t() && 51 == jt2.t()) {
                                jt2.F(3);
                                this.d = jt2.s() + 10;
                            } else {
                                AbstractC4038mJ.f();
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((InterfaceC4326pd0) this.g).d(iMin2, jt);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void b(int i, long j) {
        switch (this.f2895a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        this.c = j;
                    }
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        this.c = j;
                    }
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void c(InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        switch (this.f2895a) {
            case 0:
                for (int i = 0; i < ((InterfaceC4326pd0[]) this.g).length; i++) {
                    C4328pe0 c4328pe0 = (C4328pe0) ((List) this.f).get(i);
                    c4416qe0.a();
                    c4416qe0.b();
                    InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(c4416qe0.d, 3);
                    C4531rw c4531rw = new C4531rw();
                    c4416qe0.b();
                    c4531rw.f4954a = c4416qe0.e;
                    c4531rw.k = MimeTypes.APPLICATION_DVBSUBS;
                    c4531rw.m = Collections.singletonList(c4328pe0.b);
                    c4531rw.c = c4328pe0.f4843a;
                    interfaceC4326pd0Track.e(new C4619sw(c4531rw));
                    ((InterfaceC4326pd0[]) this.g)[i] = interfaceC4326pd0Track;
                }
                break;
            default:
                c4416qe0.a();
                c4416qe0.b();
                InterfaceC4326pd0 interfaceC4326pd0Track2 = interfaceC4353pt.track(c4416qe0.d, 5);
                this.g = interfaceC4326pd0Track2;
                C4531rw c4531rw2 = new C4531rw();
                c4416qe0.b();
                c4531rw2.f4954a = c4416qe0.e;
                c4531rw2.k = MimeTypes.APPLICATION_ID3;
                interfaceC4326pd0Track2.e(new C4619sw(c4531rw2));
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void packetFinished() {
        int i;
        switch (this.f2895a) {
            case 0:
                if (this.b) {
                    if (this.c != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        for (InterfaceC4326pd0 interfaceC4326pd0 : (InterfaceC4326pd0[]) this.g) {
                            interfaceC4326pd0.a(this.c, 1, this.e, 0, null);
                        }
                    }
                    this.b = false;
                }
                break;
            default:
                FW.t((InterfaceC4326pd0) this.g);
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    long j = this.c;
                    if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        ((InterfaceC4326pd0) this.g).a(j, 1, i, 0, null);
                    }
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void seek() {
        switch (this.f2895a) {
            case 0:
                this.b = false;
                this.c = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                break;
            default:
                this.b = false;
                this.c = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                break;
        }
    }

    public C2319Bq() {
        this.f2895a = 1;
        this.f = new JT(10);
        this.c = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }
}
