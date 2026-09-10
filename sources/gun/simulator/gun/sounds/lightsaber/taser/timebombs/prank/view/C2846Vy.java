package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2846Vy implements InterfaceC2656Oq {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fg0 f3901a;
    public final JT b;
    public final boolean[] c = new boolean[4];
    public final C2794Ty d;
    public final C4836vQ e;
    public C2820Uy f;
    public long g;
    public String h;
    public InterfaceC4326pd0 i;
    public boolean j;
    public long k;

    public C2846Vy(Fg0 fg0) {
        this.f3901a = fg0;
        C2794Ty c2794Ty = new C2794Ty();
        c2794Ty.e = new byte[128];
        this.d = c2794Ty;
        this.k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.e = new C4836vQ(178);
        this.b = new JT();
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0217  */
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
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void a(JT jt) {
        int i;
        int i2;
        float f;
        float f2;
        FW.t(this.f);
        FW.t(this.i);
        int i3 = jt.b;
        int i4 = jt.c;
        byte[] bArr = jt.f3266a;
        this.g += (long) jt.a();
        this.i.d(jt.a(), jt);
        while (true) {
            int iB = AbstractC5188zQ.b(bArr, i3, i4, this.c);
            C2794Ty c2794Ty = this.d;
            C4836vQ c4836vQ = this.e;
            if (iB == i4) {
                if (!this.j) {
                    c2794Ty.a(bArr, i3, i4);
                }
                this.f.a(bArr, i3, i4);
                if (c4836vQ != null) {
                    c4836vQ.a(bArr, i3, i4);
                    return;
                }
                return;
            }
            int i5 = iB + 3;
            int i6 = jt.f3266a[i5];
            int i7 = i6 & 255;
            int i8 = iB - i3;
            if (this.j) {
                i = i5;
            } else {
                if (i8 > 0) {
                    c2794Ty.a(bArr, i3, iB);
                }
                int i9 = i8 < 0 ? -i8 : 0;
                int i10 = c2794Ty.b;
                if (i10 != 0) {
                    i = i5;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    throw new IllegalStateException();
                                }
                                if (i7 == 179 || i7 == 181) {
                                    c2794Ty.c -= i9;
                                    c2794Ty.f3802a = false;
                                    InterfaceC4326pd0 interfaceC4326pd0 = this.i;
                                    int i11 = c2794Ty.d;
                                    String str = this.h;
                                    str.getClass();
                                    byte[] bArrCopyOf = Arrays.copyOf(c2794Ty.e, c2794Ty.c);
                                    Uh0 uh0 = new Uh0(bArrCopyOf, 2, (Object) null);
                                    uh0.t(i11);
                                    uh0.t(4);
                                    uh0.r();
                                    uh0.s(8);
                                    if (uh0.h()) {
                                        uh0.s(4);
                                        uh0.s(3);
                                    }
                                    int i12 = uh0.i(4);
                                    if (i12 == 15) {
                                        int i13 = uh0.i(8);
                                        int i14 = uh0.i(8);
                                        if (i14 == 0) {
                                            AbstractC4038mJ.f();
                                            f2 = 1.0f;
                                        } else {
                                            f2 = i13 / i14;
                                        }
                                        f = f2;
                                    } else if (i12 < 7) {
                                        f = l[i12];
                                    } else {
                                        AbstractC4038mJ.f();
                                        f = 1.0f;
                                    }
                                    if (uh0.h()) {
                                        uh0.s(2);
                                        uh0.s(1);
                                        if (uh0.h()) {
                                            uh0.s(15);
                                            uh0.r();
                                            uh0.s(15);
                                            uh0.r();
                                            uh0.s(15);
                                            uh0.r();
                                            uh0.s(3);
                                            uh0.s(11);
                                            uh0.r();
                                            uh0.s(15);
                                            uh0.r();
                                        }
                                    }
                                    if (uh0.i(2) != 0) {
                                        AbstractC4038mJ.f();
                                    }
                                    uh0.r();
                                    int i15 = uh0.i(16);
                                    uh0.r();
                                    if (uh0.h()) {
                                        if (i15 == 0) {
                                            AbstractC4038mJ.f();
                                        } else {
                                            int i16 = 0;
                                            for (int i17 = i15 - 1; i17 > 0; i17 >>= 1) {
                                                i16++;
                                            }
                                            uh0.s(i16);
                                        }
                                    }
                                    uh0.r();
                                    int i18 = uh0.i(13);
                                    uh0.r();
                                    int i19 = uh0.i(13);
                                    uh0.r();
                                    uh0.r();
                                    C4531rw c4531rw = new C4531rw();
                                    c4531rw.f4954a = str;
                                    c4531rw.k = MimeTypes.VIDEO_MP4V;
                                    c4531rw.p = i18;
                                    c4531rw.q = i19;
                                    c4531rw.t = f;
                                    c4531rw.m = Collections.singletonList(bArrCopyOf);
                                    interfaceC4326pd0.e(new C4619sw(c4531rw));
                                    this.j = true;
                                }
                            } else if ((i6 & PsExtractor.VIDEO_STREAM_MASK) != 32) {
                                AbstractC4038mJ.f();
                                c2794Ty.f3802a = false;
                                c2794Ty.c = 0;
                                c2794Ty.b = 0;
                            } else {
                                c2794Ty.d = c2794Ty.c;
                                c2794Ty.b = 4;
                            }
                        } else if (i7 > 31) {
                            AbstractC4038mJ.f();
                            c2794Ty.f3802a = false;
                            c2794Ty.c = 0;
                            c2794Ty.b = 0;
                        } else {
                            c2794Ty.b = 3;
                        }
                    } else if (i7 != 181) {
                        AbstractC4038mJ.f();
                        c2794Ty.f3802a = false;
                        c2794Ty.c = 0;
                        c2794Ty.b = 0;
                    } else {
                        c2794Ty.b = 2;
                    }
                } else {
                    i = i5;
                    if (i7 == 176) {
                        c2794Ty.b = 1;
                        c2794Ty.f3802a = true;
                    }
                }
                c2794Ty.a(C2794Ty.f, 0, 3);
            }
            this.f.a(bArr, i3, iB);
            if (c4836vQ != null) {
                if (i8 > 0) {
                    c4836vQ.a(bArr, i3, iB);
                    i2 = 0;
                } else {
                    i2 = -i8;
                }
                if (c4836vQ.b(i2)) {
                    int iE = AbstractC5188zQ.e(c4836vQ.d, c4836vQ.e);
                    int i20 = Ug0.f3833a;
                    byte[] bArr2 = c4836vQ.d;
                    JT jt2 = this.b;
                    jt2.C(bArr2, iE);
                    this.f3901a.a(this.k, jt2);
                }
                if (i7 == 178) {
                    if (jt.f3266a[iB + 2] == 1) {
                        c4836vQ.d(i7);
                    }
                }
            }
            int i21 = i4 - iB;
            long j = this.g - ((long) i21);
            C2820Uy c2820Uy = this.f;
            boolean z = this.j;
            if (c2820Uy.e == 182 && z && c2820Uy.b) {
                long j2 = c2820Uy.h;
                if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    c2820Uy.f3850a.a(j2, c2820Uy.d ? 1 : 0, (int) (j - c2820Uy.g), i21, null);
                }
            }
            if (c2820Uy.e != 179) {
                c2820Uy.g = j;
            }
            C2820Uy c2820Uy2 = this.f;
            long j3 = this.k;
            c2820Uy2.e = i7;
            c2820Uy2.d = false;
            c2820Uy2.b = i7 == 182 || i7 == 179;
            c2820Uy2.c = i7 == 182;
            c2820Uy2.f = 0;
            c2820Uy2.h = j3;
            i3 = i;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void b(int i, long j) {
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.k = j;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void c(InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        c4416qe0.a();
        c4416qe0.b();
        this.h = c4416qe0.e;
        c4416qe0.b();
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(c4416qe0.d, 2);
        this.i = interfaceC4326pd0Track;
        this.f = new C2820Uy(interfaceC4326pd0Track);
        Fg0 fg0 = this.f3901a;
        if (fg0 != null) {
            fg0.b(interfaceC4353pt, c4416qe0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void seek() {
        AbstractC5188zQ.a(this.c);
        C2794Ty c2794Ty = this.d;
        c2794Ty.f3802a = false;
        c2794Ty.c = 0;
        c2794Ty.b = 0;
        C2820Uy c2820Uy = this.f;
        if (c2820Uy != null) {
            c2820Uy.b = false;
            c2820Uy.c = false;
            c2820Uy.d = false;
            c2820Uy.e = -1;
        }
        C4836vQ c4836vQ = this.e;
        if (c4836vQ != null) {
            c4836vQ.c();
        }
        this.g = 0L;
        this.k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void packetFinished() {
    }
}
