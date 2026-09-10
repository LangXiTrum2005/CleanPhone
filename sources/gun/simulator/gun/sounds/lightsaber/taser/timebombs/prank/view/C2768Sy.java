package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2768Sy implements InterfaceC2656Oq {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3744a;
    public InterfaceC4326pd0 b;
    public final Fg0 c;
    public final JT d;
    public final C4836vQ e;
    public final boolean[] f = new boolean[4];
    public final C2742Ry g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public C2768Sy(Fg0 fg0) {
        this.c = fg0;
        C2742Ry c2742Ry = new C2742Ry();
        c2742Ry.d = new byte[128];
        this.g = c2742Ry;
        if (fg0 != null) {
            this.e = new C4836vQ(178);
            this.d = new JT();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:63:0x0188  */
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
        C2742Ry c2742Ry;
        C4836vQ c4836vQ;
        int i;
        int i2;
        boolean z;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        long j;
        JT jt2 = jt;
        FW.t(this.b);
        int i6 = jt2.b;
        int i7 = jt2.c;
        byte[] bArr = jt2.f3266a;
        this.h += (long) jt.a();
        this.b.d(jt.a(), jt2);
        while (true) {
            int iB = AbstractC5188zQ.b(bArr, i6, i7, this.f);
            c2742Ry = this.g;
            c4836vQ = this.e;
            if (iB == i7) {
                break;
            }
            int i8 = iB + 3;
            int i9 = jt2.f3266a[i8] & 255;
            int i10 = iB - i6;
            if (this.j) {
                i = i7;
                i2 = i8;
                i6 = i6;
            } else {
                if (i10 > 0) {
                    c2742Ry.a(bArr, i6, iB);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                if (c2742Ry.f3690a) {
                    int i12 = c2742Ry.b - i11;
                    c2742Ry.b = i12;
                    if (c2742Ry.c == 0 && i9 == 181) {
                        c2742Ry.c = i12;
                        i = i7;
                        i2 = i8;
                        i6 = i6;
                    } else {
                        c2742Ry.f3690a = false;
                        String str = this.f3744a;
                        str.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(c2742Ry.d, c2742Ry.b);
                        int i13 = bArrCopyOf[4] & 255;
                        byte b = bArrCopyOf[5];
                        i2 = i8;
                        i = i7;
                        int i14 = (i13 << 4) | ((b & 255) >> 4);
                        int i15 = (bArrCopyOf[6] & 255) | ((b & com.umeng.analytics.pro.cw.m) << 8);
                        int i16 = (bArrCopyOf[7] & 240) >> 4;
                        if (i16 == 2) {
                            f = i15 * 4;
                            i4 = i14 * 3;
                        } else if (i16 != 3) {
                            if (i16 != 4) {
                                f2 = 1.0f;
                            } else {
                                f = i15 * 121;
                                i4 = i14 * 100;
                            }
                            C4531rw c4531rw = new C4531rw();
                            c4531rw.f4954a = str;
                            c4531rw.k = MimeTypes.VIDEO_MPEG2;
                            c4531rw.p = i14;
                            c4531rw.q = i15;
                            c4531rw.t = f2;
                            c4531rw.m = Collections.singletonList(bArrCopyOf);
                            C4619sw c4619sw = new C4619sw(c4531rw);
                            i5 = (bArrCopyOf[7] & com.umeng.analytics.pro.cw.m) - 1;
                            if (i5 >= 0 || i5 >= 8) {
                                i6 = i6;
                                j = 0;
                            } else {
                                double d = q[i5];
                                byte b2 = bArrCopyOf[c2742Ry.c + 9];
                                int i17 = (b2 & 96) >> 5;
                                int i18 = b2 & 31;
                                if (i17 != i18) {
                                    d *= (((double) i17) + 1.0d) / ((double) (i18 + 1));
                                }
                                j = (long) (1000000.0d / d);
                            }
                            Pair pairCreate = Pair.create(c4619sw, Long.valueOf(j));
                            this.b.e((C4619sw) pairCreate.first);
                            this.k = ((Long) pairCreate.second).longValue();
                            this.j = true;
                        } else {
                            f = i15 * 16;
                            i4 = i14 * 9;
                        }
                        f2 = f / i4;
                        C4531rw c4531rw2 = new C4531rw();
                        c4531rw2.f4954a = str;
                        c4531rw2.k = MimeTypes.VIDEO_MPEG2;
                        c4531rw2.p = i14;
                        c4531rw2.q = i15;
                        c4531rw2.t = f2;
                        c4531rw2.m = Collections.singletonList(bArrCopyOf);
                        C4619sw c4619sw2 = new C4619sw(c4531rw2);
                        i5 = (bArrCopyOf[7] & com.umeng.analytics.pro.cw.m) - 1;
                        if (i5 >= 0) {
                            i6 = i6;
                            j = 0;
                        } else {
                            i6 = i6;
                            j = 0;
                        }
                        Pair pairCreate2 = Pair.create(c4619sw2, Long.valueOf(j));
                        this.b.e((C4619sw) pairCreate2.first);
                        this.k = ((Long) pairCreate2.second).longValue();
                        this.j = true;
                    }
                } else {
                    i = i7;
                    i2 = i8;
                    i6 = i6;
                    if (i9 == 179) {
                        c2742Ry.f3690a = true;
                    }
                }
                c2742Ry.a(C2742Ry.e, 0, 3);
            }
            if (c4836vQ == null) {
                jt2 = jt;
                z = true;
            } else {
                if (i10 > 0) {
                    c4836vQ.a(bArr, i6, iB);
                    i3 = 0;
                } else {
                    i3 = -i10;
                }
                if (c4836vQ.b(i3)) {
                    int iE = AbstractC5188zQ.e(c4836vQ.d, c4836vQ.e);
                    int i19 = Ug0.f3833a;
                    byte[] bArr2 = c4836vQ.d;
                    JT jt3 = this.d;
                    jt3.C(bArr2, iE);
                    this.c.a(this.n, jt3);
                }
                if (i9 == 178) {
                    jt2 = jt;
                    z = true;
                    if (jt2.f3266a[iB + 2] == 1) {
                        c4836vQ.d(i9);
                    }
                } else {
                    jt2 = jt;
                    z = true;
                }
            }
            if (i9 == 0 || i9 == 179) {
                int i20 = i - iB;
                if (this.p && this.j) {
                    long j2 = this.n;
                    if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        this.b.a(j2, this.o ? 1 : 0, ((int) (this.h - this.m)) - i20, i20, null);
                    }
                }
                if (!this.i || this.p) {
                    this.m = this.h - ((long) i20);
                    long j3 = this.l;
                    if (j3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        long j4 = this.n;
                        j3 = j4 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j4 + this.k : -9223372036854775807L;
                    }
                    this.n = j3;
                    this.o = false;
                    this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    this.i = true;
                }
                this.p = i9 == 0;
            } else if (i9 == 184) {
                this.o = z;
            }
            i7 = i;
            i6 = i2;
        }
        if (!this.j) {
            c2742Ry.a(bArr, i6, i7);
        }
        if (c4836vQ != null) {
            c4836vQ.a(bArr, i6, i7);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void b(int i, long j) {
        this.l = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void c(InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        c4416qe0.a();
        c4416qe0.b();
        this.f3744a = c4416qe0.e;
        c4416qe0.b();
        this.b = interfaceC4353pt.track(c4416qe0.d, 2);
        Fg0 fg0 = this.c;
        if (fg0 != null) {
            fg0.b(interfaceC4353pt, c4416qe0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void seek() {
        AbstractC5188zQ.a(this.f);
        C2742Ry c2742Ry = this.g;
        c2742Ry.f3690a = false;
        c2742Ry.b = 0;
        c2742Ry.c = 0;
        C4836vQ c4836vQ = this.e;
        if (c4836vQ != null) {
            c4836vQ.c();
        }
        this.h = 0L;
        this.i = false;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.n = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void packetFinished() {
    }
}
