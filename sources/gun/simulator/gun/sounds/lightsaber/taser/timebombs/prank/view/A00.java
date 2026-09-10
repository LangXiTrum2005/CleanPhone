package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.Input;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class A00 implements K00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2795a;
    public final J00 b;
    public InterfaceC4326pd0 c;
    public long d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;

    public A00(J00 j00, int i) {
        this.f2795a = i;
        if (i != 1) {
            this.b = j00;
            this.d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            this.g = -1;
            return;
        }
        this.b = j00;
        this.d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.g = -1;
        this.h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.e = 0L;
        this.f = -1;
        this.i = -1;
        this.j = -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void a(InterfaceC4353pt interfaceC4353pt, int i) {
        int i2 = this.f2795a;
        J00 j00 = this.b;
        switch (i2) {
            case 0:
                InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(i, 2);
                this.c = interfaceC4326pd0Track;
                interfaceC4326pd0Track.e(j00.c);
                break;
            default:
                InterfaceC4326pd0 interfaceC4326pd0Track2 = interfaceC4353pt.track(i, 2);
                this.c = interfaceC4326pd0Track2;
                interfaceC4326pd0Track2.e(j00.c);
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void b(long j) {
        switch (this.f2795a) {
            case 0:
                FW.s(this.d == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                this.d = j;
                break;
            default:
                FW.s(this.d == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
                this.d = j;
                break;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void c(int i, long j, JT jt, boolean z) {
        int i2;
        int i3;
        int i4 = this.f2795a;
        J00 j00 = this.b;
        switch (i4) {
            case 0:
                FW.t(this.c);
                int i5 = jt.b;
                int iY = jt.y();
                boolean z2 = (iY & 1024) > 0;
                if ((iY & 512) == 0 && (iY & 504) == 0 && (iY & 7) == 0) {
                    if (z2) {
                        if (this.m && this.f > 0) {
                            InterfaceC4326pd0 interfaceC4326pd0 = this.c;
                            interfaceC4326pd0.getClass();
                            interfaceC4326pd0.a(this.h, this.k ? 1 : 0, this.f, 0, null);
                            this.f = 0;
                            this.h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                            this.k = false;
                            this.m = false;
                        }
                        this.m = true;
                        if ((jt.c() & 252) < 128) {
                            AbstractC4038mJ.f();
                        } else {
                            byte[] bArr = jt.f3266a;
                            bArr[i5] = 0;
                            bArr[i5 + 1] = 0;
                            jt.E(i5);
                        }
                    } else if (!this.m) {
                        AbstractC4038mJ.f();
                    } else if (i < G00.a(this.g)) {
                        int i6 = Ug0.f3833a;
                        Locale locale = Locale.US;
                        AbstractC4038mJ.f();
                    }
                    if (this.f == 0) {
                        boolean z3 = this.l;
                        int i7 = jt.b;
                        if (((jt.u() >> 10) & 63) == 32) {
                            int iC = jt.c();
                            int i8 = (iC >> 1) & 1;
                            if (!z3 && i8 == 0) {
                                int i9 = (iC >> 2) & 7;
                                if (i9 == 1) {
                                    this.i = 128;
                                    this.j = 96;
                                } else {
                                    int i10 = i9 - 2;
                                    this.i = 176 << i10;
                                    this.j = Input.Keys.NUMPAD_0 << i10;
                                }
                            }
                            jt.E(i7);
                            this.k = i8 == 0;
                        } else {
                            jt.E(i7);
                            this.k = false;
                        }
                        if (!this.l && this.k) {
                            int i11 = this.i;
                            C4619sw c4619sw = j00.c;
                            if (i11 != c4619sw.q || this.j != c4619sw.r) {
                                InterfaceC4326pd0 interfaceC4326pd1 = this.c;
                                C4531rw c4531rwA = c4619sw.a();
                                c4531rwA.p = this.i;
                                c4531rwA.q = this.j;
                                interfaceC4326pd1.e(new C4619sw(c4531rwA));
                            }
                            this.l = true;
                        }
                    }
                    int iA = jt.a();
                    this.c.d(iA, jt);
                    this.f += iA;
                    this.h = FW.i0(this.e, j, this.d, 90000);
                    if (z) {
                        InterfaceC4326pd0 interfaceC4326pd2 = this.c;
                        interfaceC4326pd2.getClass();
                        interfaceC4326pd2.a(this.h, this.k ? 1 : 0, this.f, 0, null);
                        this.f = 0;
                        this.h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                        this.k = false;
                        this.m = false;
                    }
                    this.g = i;
                } else {
                    AbstractC4038mJ.f();
                }
                break;
            default:
                FW.t(this.c);
                int iT = jt.t();
                if ((iT & 8) == 8) {
                    if (this.k && this.g > 0) {
                        InterfaceC4326pd0 interfaceC4326pd3 = this.c;
                        interfaceC4326pd3.getClass();
                        interfaceC4326pd3.a(this.h, this.m ? 1 : 0, this.g, 0, null);
                        this.g = -1;
                        this.h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                        this.k = false;
                    }
                    this.k = true;
                } else if (!this.k) {
                    AbstractC4038mJ.f();
                } else if (i < G00.a(this.f)) {
                    int i12 = Ug0.f3833a;
                    Locale locale2 = Locale.US;
                    AbstractC4038mJ.f();
                }
                if ((iT & 128) == 0 || (128 & jt.t()) == 0 || jt.a() >= 1) {
                    int i13 = iT & 16;
                    FW.i(i13 == 0, "VP9 flexible mode is not supported.");
                    if ((iT & 32) != 0) {
                        jt.F(1);
                        if (jt.a() >= 1) {
                            if (i13 == 0) {
                                jt.F(1);
                            }
                        }
                    }
                    if ((iT & 2) != 0) {
                        int iT2 = jt.t();
                        int i14 = (iT2 >> 5) & 7;
                        if ((iT2 & 16) != 0) {
                            int i15 = i14 + 1;
                            if (jt.a() >= i15 * 4) {
                                for (int i16 = 0; i16 < i15; i16++) {
                                    this.i = jt.y();
                                    this.j = jt.y();
                                }
                            }
                        }
                        if ((iT2 & 8) != 0) {
                            int iT3 = jt.t();
                            if (jt.a() >= iT3) {
                                for (int i17 = 0; i17 < iT3; i17++) {
                                    int iY2 = (jt.y() & 12) >> 2;
                                    if (jt.a() >= iY2) {
                                        jt.F(iY2);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (this.g == -1 && this.k) {
                        this.m = (jt.c() & 4) == 0;
                    }
                    if (!this.l && (i2 = this.i) != -1 && (i3 = this.j) != -1) {
                        C4619sw c4619sw2 = j00.c;
                        if (i2 != c4619sw2.q || i3 != c4619sw2.r) {
                            InterfaceC4326pd0 interfaceC4326pd4 = this.c;
                            C4531rw c4531rwA2 = c4619sw2.a();
                            c4531rwA2.p = this.i;
                            c4531rwA2.q = this.j;
                            interfaceC4326pd4.e(new C4619sw(c4531rwA2));
                        }
                        this.l = true;
                    }
                    int iA2 = jt.a();
                    this.c.d(iA2, jt);
                    int i18 = this.g;
                    if (i18 == -1) {
                        this.g = iA2;
                    } else {
                        this.g = i18 + iA2;
                    }
                    this.h = FW.i0(this.e, j, this.d, 90000);
                    if (z) {
                        InterfaceC4326pd0 interfaceC4326pd5 = this.c;
                        interfaceC4326pd5.getClass();
                        interfaceC4326pd5.a(this.h, this.m ? 1 : 0, this.g, 0, null);
                        this.g = -1;
                        this.h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                        this.k = false;
                    }
                    this.f = i;
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void seek(long j, long j2) {
        switch (this.f2795a) {
            case 0:
                this.d = j;
                this.f = 0;
                this.e = j2;
                break;
            default:
                this.d = j;
                this.g = -1;
                this.e = j2;
                break;
        }
    }
}
