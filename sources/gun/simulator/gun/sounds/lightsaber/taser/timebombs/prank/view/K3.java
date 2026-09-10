package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class K3 implements InterfaceC2656Oq {
    public static final byte[] v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3296a;
    public final String d;
    public String e;
    public InterfaceC4326pd0 f;
    public InterfaceC4326pd0 g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public InterfaceC4326pd0 t;
    public long u;
    public final Uh0 b = new Uh0(new byte[7], 2, (Object) null);
    public final JT c = new JT(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public int m = -1;
    public int n = -1;
    public long q = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    public long s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public K3(boolean z, String str) {
        this.f3296a = z;
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01c1  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void a(JT jt) throws KT {
        int i;
        int i2;
        int i3;
        this.f.getClass();
        int i4 = Ug0.f3833a;
        while (jt.a() > 0) {
            int i5 = this.h;
            int i6 = 4;
            int i7 = 1;
            int i8 = 0;
            JT jt2 = this.c;
            Uh0 uh0 = this.b;
            if (i5 == 0) {
                byte[] bArr = jt.f3266a;
                int i9 = jt.b;
                int i10 = jt.c;
                while (true) {
                    if (i9 < i10) {
                        int i11 = i9 + 1;
                        byte b = bArr[i9];
                        int i12 = b & 255;
                        if (this.j == 512 && ((65280 | (((byte) i12) & 255)) & 65526) == 65520) {
                            if (!this.l) {
                                int i13 = i9 - 1;
                                jt.E(i9);
                                byte[] bArr2 = uh0.d;
                                if (jt.a() >= i7) {
                                    jt.d(bArr2, i8, i7);
                                    uh0.p(i6);
                                    int i14 = uh0.i(i7);
                                    int i15 = this.m;
                                    if (i15 == -1 || i14 == i15) {
                                        if (this.n != -1) {
                                            byte[] bArr3 = uh0.d;
                                            if (jt.a() >= i7) {
                                                jt.d(bArr3, i8, i7);
                                                uh0.p(2);
                                                i = 4;
                                                if (uh0.i(4) == this.n) {
                                                    jt.E(i11);
                                                }
                                            }
                                        } else {
                                            i = 4;
                                        }
                                        byte[] bArr4 = uh0.d;
                                        if (jt.a() >= i) {
                                            jt.d(bArr4, i8, i);
                                            uh0.p(14);
                                            int i16 = uh0.i(13);
                                            if (i16 >= 7) {
                                                byte[] bArr5 = jt.f3266a;
                                                int i17 = jt.c;
                                                int i18 = i13 + i16;
                                                if (i18 < i17) {
                                                    byte b2 = bArr5[i18];
                                                    if (b2 == -1) {
                                                        int i19 = i18 + 1;
                                                        if (i19 != i17) {
                                                            byte b3 = bArr5[i19];
                                                            if (((65280 | (b3 & 255)) & 65526) == 65520 && ((b3 & 8) >> 3) == i14) {
                                                            }
                                                        }
                                                    } else if (b2 == 73 && ((i2 = i18 + 1) == i17 || (bArr5[i2] == 68 && ((i3 = i18 + 2) == i17 || bArr5[i3] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            this.o = (b & 8) >> 3;
                            this.k = (b & 1) == 0;
                            if (this.l) {
                                this.h = 3;
                                this.i = 0;
                            } else {
                                this.h = 1;
                                this.i = 0;
                            }
                            jt.E(i11);
                        }
                        int i20 = this.j;
                        int i21 = i12 | i20;
                        if (i21 == 329) {
                            this.j = 768;
                        } else if (i21 == 511) {
                            this.j = 512;
                        } else if (i21 == 836) {
                            this.j = 1024;
                        } else if (i21 != 1075) {
                            if (i20 != 256) {
                                this.j = 256;
                            }
                            i6 = 4;
                            i7 = 1;
                            i8 = 0;
                        } else {
                            this.h = 2;
                            this.i = 3;
                            this.r = 0;
                            jt2.E(0);
                            jt.E(i11);
                        }
                        i9 = i11;
                        i6 = 4;
                        i7 = 1;
                        i8 = 0;
                    } else {
                        jt.E(i9);
                    }
                }
            } else if (i5 != 1) {
                if (i5 == 2) {
                    byte[] bArr6 = jt2.f3266a;
                    int iMin = Math.min(jt.a(), 10 - this.i);
                    jt.d(bArr6, this.i, iMin);
                    int i22 = this.i + iMin;
                    this.i = i22;
                    if (i22 == 10) {
                        this.g.d(10, jt2);
                        jt2.E(6);
                        InterfaceC4326pd0 interfaceC4326pd0 = this.g;
                        int iS = jt2.s() + 10;
                        this.h = 4;
                        this.i = 10;
                        this.t = interfaceC4326pd0;
                        this.u = 0L;
                        this.r = iS;
                    }
                } else if (i5 == 3) {
                    int i23 = this.k ? 7 : 5;
                    byte[] bArr7 = uh0.d;
                    int iMin2 = Math.min(jt.a(), i23 - this.i);
                    jt.d(bArr7, this.i, iMin2);
                    int i24 = this.i + iMin2;
                    this.i = i24;
                    if (i24 == i23) {
                        uh0.p(0);
                        if (this.p) {
                            uh0.s(10);
                        } else {
                            int i25 = uh0.i(2) + 1;
                            if (i25 != 2) {
                                AbstractC4038mJ.f();
                                i25 = 2;
                            }
                            uh0.s(5);
                            byte[] bArrM = AbstractC2845Vx.M(i25, this.n, uh0.i(3));
                            C3129c c3129cA0 = AbstractC2845Vx.a0(new Uh0(bArrM, 2, (Object) null), false);
                            C4531rw c4531rw = new C4531rw();
                            c4531rw.f4954a = this.e;
                            c4531rw.k = MimeTypes.AUDIO_AAC;
                            c4531rw.h = c3129cA0.f4197a;
                            c4531rw.x = c3129cA0.c;
                            c4531rw.y = c3129cA0.b;
                            c4531rw.m = Collections.singletonList(bArrM);
                            c4531rw.c = this.d;
                            C4619sw c4619sw = new C4619sw(c4531rw);
                            this.q = 1024000000 / ((long) c4619sw.z);
                            this.f.e(c4619sw);
                            this.p = true;
                        }
                        uh0.s(4);
                        int i26 = uh0.i(13);
                        int i27 = i26 - 7;
                        if (this.k) {
                            i27 = i26 - 9;
                        }
                        InterfaceC4326pd0 interfaceC4326pd1 = this.f;
                        long j = this.q;
                        this.h = 4;
                        this.i = 0;
                        this.t = interfaceC4326pd1;
                        this.u = j;
                        this.r = i27;
                    }
                } else {
                    if (i5 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(jt.a(), this.r - this.i);
                    this.t.d(iMin3, jt);
                    int i28 = this.i + iMin3;
                    this.i = i28;
                    int i29 = this.r;
                    if (i28 == i29) {
                        long j2 = this.s;
                        if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            this.t.a(j2, 1, i29, 0, null);
                            this.s += this.u;
                        }
                        this.h = 0;
                        this.i = 0;
                        this.j = 256;
                    }
                }
            } else if (jt.a() != 0) {
                uh0.d[0] = jt.f3266a[jt.b];
                uh0.p(2);
                int i30 = uh0.i(4);
                int i31 = this.n;
                if (i31 == -1 || i30 == i31) {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.o;
                        this.n = i30;
                    }
                    this.h = 3;
                    this.i = 0;
                } else {
                    this.l = false;
                    this.h = 0;
                    this.i = 0;
                    this.j = 256;
                }
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void b(int i, long j) {
        if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            this.s = j;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void c(InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
        c4416qe0.a();
        c4416qe0.b();
        this.e = c4416qe0.e;
        c4416qe0.b();
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(c4416qe0.d, 1);
        this.f = interfaceC4326pd0Track;
        this.t = interfaceC4326pd0Track;
        if (!this.f3296a) {
            this.g = new C4262oq();
            return;
        }
        c4416qe0.a();
        c4416qe0.b();
        InterfaceC4326pd0 interfaceC4326pd0Track2 = interfaceC4353pt.track(c4416qe0.d, 5);
        this.g = interfaceC4326pd0Track2;
        C4531rw c4531rw = new C4531rw();
        c4416qe0.b();
        c4531rw.f4954a = c4416qe0.e;
        c4531rw.k = MimeTypes.APPLICATION_ID3;
        interfaceC4326pd0Track2.e(new C4619sw(c4531rw));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void seek() {
        this.s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void packetFinished() {
    }
}
