package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.view.MotionEventCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4086mq implements InterfaceC2656Oq {
    public final String b;
    public String c;
    public InterfaceC4326pd0 d;
    public int f;
    public int g;
    public long h;
    public C4619sw i;
    public int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JT f4719a = new JT(new byte[18]);
    public int e = 0;
    public long k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;

    public C4086mq(String str) {
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x020e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0216  */
    /* JADX WARN: Code duplicated, block: B:69:0x0219  */
    /* JADX WARN: Code duplicated, block: B:71:0x021d  */
    /* JADX WARN: Code duplicated, block: B:73:0x022c  */
    /* JADX WARN: Code duplicated, block: B:74:0x023a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0249  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void a(JT jt) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Uh0 uh0;
        int i9;
        int i10;
        FW.t(this.d);
        while (jt.a() > 0) {
            int i11 = this.e;
            int i12 = 2;
            int i13 = 8;
            JT jt2 = this.f4719a;
            if (i11 == 0) {
                while (jt.a() > 0) {
                    int i14 = this.g << 8;
                    this.g = i14;
                    int iT = i14 | jt.t();
                    this.g = iT;
                    if (iT == 2147385345 || iT == -25230976 || iT == 536864768 || iT == -14745368) {
                        byte[] bArr = jt2.f3266a;
                        bArr[0] = (byte) ((iT >> 24) & 255);
                        bArr[1] = (byte) ((iT >> 16) & 255);
                        bArr[2] = (byte) ((iT >> 8) & 255);
                        bArr[3] = (byte) (iT & 255);
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i11 == 1) {
                byte[] bArr2 = jt2.f3266a;
                int iMin = Math.min(jt.a(), 18 - this.f);
                jt.d(bArr2, this.f, iMin);
                int i15 = this.f + iMin;
                this.f = i15;
                if (i15 == 18) {
                    byte[] bArr3 = jt2.f3266a;
                    if (this.i == null) {
                        String str = this.c;
                        if (bArr3[0] == 127) {
                            uh0 = new Uh0(bArr3, 2, (Object) null);
                        } else {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b = bArrCopyOf[0];
                            if (b == -2 || b == -1) {
                                for (int i16 = 0; i16 < bArrCopyOf.length - 1; i16 += 2) {
                                    byte b2 = bArrCopyOf[i16];
                                    int i17 = i16 + 1;
                                    bArrCopyOf[i16] = bArrCopyOf[i17];
                                    bArrCopyOf[i17] = b2;
                                }
                            }
                            Uh0 uh1 = new Uh0(bArrCopyOf, 2, (Object) null);
                            if (bArrCopyOf[0] == 31) {
                                Uh0 uh2 = new Uh0(bArrCopyOf, 2, (Object) null);
                                while (uh2.b() >= 16) {
                                    uh2.s(i12);
                                    int i18 = uh2.i(14) & 16383;
                                    int iMin2 = Math.min(8 - uh1.c, 14);
                                    int i19 = uh1.c;
                                    int i20 = (8 - i19) - iMin2;
                                    int i21 = (MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i19) | ((1 << i20) - 1);
                                    byte[] bArr4 = uh1.d;
                                    int i22 = uh1.b;
                                    byte b3 = (byte) (bArr4[i22] & i21);
                                    bArr4[i22] = b3;
                                    int i23 = 14 - iMin2;
                                    bArr4[i22] = (byte) (b3 | ((i18 >>> i23) << i20));
                                    int i24 = i22 + 1;
                                    while (i23 > i13) {
                                        uh1.d[i24] = (byte) (i18 >>> (i23 - 8));
                                        i23 -= 8;
                                        i24++;
                                        i13 = 8;
                                    }
                                    int i25 = 8 - i23;
                                    byte[] bArr5 = uh1.d;
                                    byte b4 = (byte) (bArr5[i24] & ((1 << i25) - 1));
                                    bArr5[i24] = b4;
                                    bArr5[i24] = (byte) (((i18 & ((1 << i23) - 1)) << i25) | b4);
                                    uh1.s(14);
                                    uh1.a();
                                    i12 = 2;
                                    i13 = 8;
                                }
                            }
                            uh1.o(bArrCopyOf, bArrCopyOf.length);
                            uh0 = uh1;
                        }
                        uh0.s(60);
                        int i26 = AbstractC2340Cl.b[uh0.i(6)];
                        int i27 = AbstractC2340Cl.c[uh0.i(4)];
                        int i28 = uh0.i(5);
                        if (i28 >= 29) {
                            i10 = -1;
                            i9 = 2;
                        } else {
                            int i29 = AbstractC2340Cl.d[i28] * 1000;
                            i9 = 2;
                            i10 = i29 / 2;
                        }
                        uh0.s(10);
                        int i30 = i26 + (uh0.i(i9) > 0 ? 1 : 0);
                        C4531rw c4531rw = new C4531rw();
                        c4531rw.f4954a = str;
                        c4531rw.k = MimeTypes.AUDIO_DTS;
                        c4531rw.f = i10;
                        c4531rw.x = i30;
                        c4531rw.y = i27;
                        c4531rw.n = null;
                        c4531rw.c = this.b;
                        C4619sw c4619sw = new C4619sw(c4531rw);
                        this.i = c4619sw;
                        this.d.e(c4619sw);
                    }
                    byte b5 = bArr3[0];
                    if (b5 != -2) {
                        if (b5 == -1) {
                            i7 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            i8 = (bArr3[9] & 60) >> 2;
                        } else if (b5 != 31) {
                            i = ((3 & bArr3[5]) << 12) | ((bArr3[6] & 255) << 4) | ((bArr3[7] & 240) >> 4);
                        } else {
                            i7 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                            i8 = (bArr3[8] & 60) >> 2;
                        }
                        i2 = (i7 | i8) + 1;
                        z = true;
                        if (z) {
                            i2 = (i2 * 16) / 14;
                        }
                        this.j = i2;
                        if (b5 != -2) {
                            if (b5 != -1) {
                                i6 = ((bArr3[7] & 60) >> 2) | ((bArr3[4] & 7) << 4);
                            } else if (b5 != 31) {
                                i4 = (bArr3[4] & 1) << 6;
                                i5 = bArr3[5] & 252;
                                i3 = 2;
                            } else {
                                i3 = 2;
                                i4 = (7 & bArr3[5]) << 4;
                                i5 = bArr3[6] & 60;
                            }
                            this.h = (int) ((((long) ((i6 + 1) * 32)) * 1000000) / ((long) this.i.z));
                            jt2.E(0);
                            this.d.d(18, jt2);
                            this.e = 2;
                        } else {
                            i3 = 2;
                            i4 = (bArr3[5] & 1) << 6;
                            i5 = bArr3[4] & 252;
                        }
                        i6 = (i5 >> i3) | i4;
                        this.h = (int) ((((long) ((i6 + 1) * 32)) * 1000000) / ((long) this.i.z));
                        jt2.E(0);
                        this.d.d(18, jt2);
                        this.e = 2;
                    } else {
                        i = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4) | ((bArr3[6] & 240) >> 4);
                    }
                    i2 = i + 1;
                    z = false;
                    if (z) {
                        i2 = (i2 * 16) / 14;
                    }
                    this.j = i2;
                    if (b5 != -2) {
                        if (b5 != -1) {
                            i6 = ((bArr3[7] & 60) >> 2) | ((bArr3[4] & 7) << 4);
                        } else if (b5 != 31) {
                            i4 = (bArr3[4] & 1) << 6;
                            i5 = bArr3[5] & 252;
                            i3 = 2;
                        } else {
                            i3 = 2;
                            i4 = (7 & bArr3[5]) << 4;
                            i5 = bArr3[6] & 60;
                        }
                        this.h = (int) ((((long) ((i6 + 1) * 32)) * 1000000) / ((long) this.i.z));
                        jt2.E(0);
                        this.d.d(18, jt2);
                        this.e = 2;
                    } else {
                        i3 = 2;
                        i4 = (bArr3[5] & 1) << 6;
                        i5 = bArr3[4] & 252;
                    }
                    i6 = (i5 >> i3) | i4;
                    this.h = (int) ((((long) ((i6 + 1) * 32)) * 1000000) / ((long) this.i.z));
                    jt2.E(0);
                    this.d.d(18, jt2);
                    this.e = 2;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException();
                }
                int iMin3 = Math.min(jt.a(), this.j - this.f);
                this.d.d(iMin3, jt);
                int i31 = this.f + iMin3;
                this.f = i31;
                int i32 = this.j;
                if (i31 == i32) {
                    long j = this.k;
                    if (j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        this.d.a(j, 1, i32, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
            }
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
        this.c = c4416qe0.e;
        c4416qe0.b();
        this.d = interfaceC4353pt.track(c4416qe0.d, 1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void seek() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2656Oq
    public final void packetFinished() {
    }
}
