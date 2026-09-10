package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class Wh0 extends K90 {
    public Vh0 n;
    public int o;
    public boolean p;
    public Yh0 q;
    public A70 r;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K90
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        Yh0 yh0 = this.q;
        this.o = yh0 != null ? yh0.e : 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K90
    public final long b(JT jt) {
        byte b = jt.f3266a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        Vh0 vh0 = this.n;
        FW.t(vh0);
        boolean z = vh0.d[(b >> 1) & (255 >>> (8 - vh0.e))].f3989a;
        Yh0 yh0 = vh0.f3886a;
        int i = !z ? yh0.e : yh0.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = jt.f3266a;
        int length = bArr.length;
        int i2 = jt.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            jt.C(bArrCopyOf, bArrCopyOf.length);
        } else {
            jt.D(i2);
        }
        byte[] bArr2 = jt.f3266a;
        int i3 = jt.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K90
    public final boolean c(JT jt, long j, C3491g4 c3491g4) throws KT {
        int i;
        if (this.n != null) {
            ((C4619sw) c3491g4.b).getClass();
            return false;
        }
        Yh0 yh0 = this.q;
        Vh0 vh0 = null;
        if (yh0 == null) {
            Zh0.d(1, jt, false);
            jt.l();
            int iT = jt.t();
            int iL = jt.l();
            int iH = jt.h();
            int i2 = iH <= 0 ? -1 : iH;
            int iH2 = jt.h();
            int i3 = iH2 <= 0 ? -1 : iH2;
            jt.h();
            int iT2 = jt.t();
            int iPow = (int) Math.pow(2.0d, iT2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iT2 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
            jt.t();
            this.q = new Yh0(iT, iL, i2, i3, iPow, iPow2, Arrays.copyOf(jt.f3266a, jt.c));
        } else {
            A70 a70 = this.r;
            if (a70 == null) {
                this.r = Zh0.c(jt, true, true);
            } else {
                int i4 = jt.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(jt.f3266a, 0, bArr, 0, i4);
                int i5 = 5;
                Zh0.d(5, jt, false);
                int iT3 = jt.t() + 1;
                Uh0 uh0 = new Uh0(jt.f3266a, 0, (Object) null);
                uh0.s(jt.b * 8);
                int i6 = 0;
                while (i6 < iT3) {
                    if (uh0.i(24) != 5653314) {
                        throw KT.a("expected code book to start with [0x56, 0x43, 0x42] at " + uh0.g(), null);
                    }
                    int i7 = uh0.i(16);
                    int i8 = uh0.i(24);
                    long[] jArr = new long[i8];
                    long jFloor = 0;
                    if (uh0.h()) {
                        i = iT3;
                        int i9 = uh0.i(i5) + 1;
                        int i10 = 0;
                        while (i10 < i8) {
                            int i11 = uh0.i(Zh0.a(i8 - i10));
                            int i12 = 0;
                            while (i12 < i11 && i10 < i8) {
                                jArr[i10] = i9;
                                i10++;
                                i12++;
                                bArr = bArr;
                            }
                            i9++;
                            bArr = bArr;
                        }
                    } else {
                        boolean zH = uh0.h();
                        int i13 = 0;
                        while (i13 < i8) {
                            if (!zH) {
                                jArr[i13] = uh0.i(i5) + 1;
                            } else if (uh0.h()) {
                                jArr[i13] = uh0.i(i5) + 1;
                            } else {
                                jArr[i13] = 0;
                            }
                            i13++;
                            iT3 = iT3;
                        }
                        i = iT3;
                    }
                    byte[] bArr2 = bArr;
                    int i14 = uh0.i(4);
                    if (i14 > 2) {
                        throw KT.a("lookup type greater than 2 not decodable: " + i14, null);
                    }
                    if (i14 == 1 || i14 == 2) {
                        uh0.s(32);
                        uh0.s(32);
                        int i15 = uh0.i(4) + 1;
                        uh0.s(1);
                        if (i14 != 1) {
                            jFloor = ((long) i8) * ((long) i7);
                        } else if (i7 != 0) {
                            jFloor = (long) Math.floor(Math.pow(i8, 1.0d / ((double) i7)));
                        }
                        uh0.s((int) (((long) i15) * jFloor));
                    }
                    i6++;
                    iT3 = i;
                    bArr = bArr2;
                    i5 = 5;
                }
                byte[] bArr3 = bArr;
                int i16 = 6;
                int i17 = uh0.i(6) + 1;
                for (int i18 = 0; i18 < i17; i18++) {
                    if (uh0.i(16) != 0) {
                        throw KT.a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i19 = 1;
                int i20 = uh0.i(6) + 1;
                int i21 = 0;
                while (true) {
                    int i22 = 3;
                    if (i21 >= i20) {
                        int i23 = 1;
                        int i24 = uh0.i(i16) + 1;
                        int i25 = 0;
                        while (i25 < i24) {
                            if (uh0.i(16) > 2) {
                                throw KT.a("residueType greater than 2 is not decodable", null);
                            }
                            uh0.s(24);
                            uh0.s(24);
                            uh0.s(24);
                            int i26 = uh0.i(i16) + i23;
                            int i27 = 8;
                            uh0.s(8);
                            int[] iArr = new int[i26];
                            for (int i28 = 0; i28 < i26; i28++) {
                                iArr[i28] = ((uh0.h() ? uh0.i(5) : 0) * 8) + uh0.i(3);
                            }
                            int i29 = 0;
                            while (i29 < i26) {
                                int i30 = 0;
                                while (i30 < i27) {
                                    if ((iArr[i29] & (1 << i30)) != 0) {
                                        uh0.s(i27);
                                    }
                                    i30++;
                                    i27 = 8;
                                }
                                i29++;
                                i27 = 8;
                            }
                            i25++;
                            i16 = 6;
                            i23 = 1;
                        }
                        int i31 = uh0.i(i16) + 1;
                        for (int i32 = 0; i32 < i31; i32++) {
                            if (uh0.i(16) != 0) {
                                AbstractC4038mJ.c();
                            } else {
                                int i33 = uh0.h() ? uh0.i(4) + 1 : 1;
                                boolean zH2 = uh0.h();
                                int i34 = yh0.f4034a;
                                if (zH2) {
                                    int i35 = uh0.i(8) + 1;
                                    for (int i36 = 0; i36 < i35; i36++) {
                                        int i37 = i34 - 1;
                                        uh0.s(Zh0.a(i37));
                                        uh0.s(Zh0.a(i37));
                                    }
                                }
                                if (uh0.i(2) != 0) {
                                    throw KT.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i33 > 1) {
                                    for (int i38 = 0; i38 < i34; i38++) {
                                        uh0.s(4);
                                    }
                                }
                                for (int i39 = 0; i39 < i33; i39++) {
                                    uh0.s(8);
                                    uh0.s(8);
                                    uh0.s(8);
                                }
                            }
                        }
                        int i40 = uh0.i(6);
                        int i41 = i40 + 1;
                        Xh0[] xh0Arr = new Xh0[i41];
                        for (int i42 = 0; i42 < i41; i42++) {
                            boolean zH3 = uh0.h();
                            uh0.i(16);
                            uh0.i(16);
                            uh0.i(8);
                            xh0Arr[i42] = new Xh0(zH3);
                        }
                        if (!uh0.h()) {
                            throw KT.a("framing bit after modes not set as expected", null);
                        }
                        vh0 = new Vh0(yh0, a70, bArr3, xh0Arr, Zh0.a(i40));
                        break;
                    }
                    int i43 = uh0.i(16);
                    if (i43 == 0) {
                        int i44 = 8;
                        uh0.s(8);
                        uh0.s(16);
                        uh0.s(16);
                        uh0.s(6);
                        uh0.s(8);
                        int i45 = uh0.i(4) + 1;
                        int i46 = 0;
                        while (i46 < i45) {
                            uh0.s(i44);
                            i46++;
                            i44 = 8;
                        }
                    } else {
                        if (i43 != i19) {
                            throw KT.a("floor type greater than 1 not decodable: " + i43, null);
                        }
                        int i47 = uh0.i(5);
                        int[] iArr2 = new int[i47];
                        int i48 = -1;
                        for (int i49 = 0; i49 < i47; i49++) {
                            int i50 = uh0.i(4);
                            iArr2[i49] = i50;
                            if (i50 > i48) {
                                i48 = i50;
                            }
                        }
                        int i51 = i48 + 1;
                        int[] iArr3 = new int[i51];
                        int i52 = 0;
                        while (i52 < i51) {
                            iArr3[i52] = uh0.i(i22) + 1;
                            int i53 = uh0.i(2);
                            int i54 = 8;
                            if (i53 > 0) {
                                uh0.s(8);
                            }
                            int i55 = 0;
                            for (int i56 = 1; i55 < (i56 << i53); i56 = 1) {
                                uh0.s(i54);
                                i55++;
                                i54 = 8;
                            }
                            i52++;
                            i22 = 3;
                        }
                        uh0.s(2);
                        int i57 = uh0.i(4);
                        int i58 = 0;
                        int i59 = 0;
                        for (int i60 = 0; i60 < i47; i60++) {
                            i58 += iArr3[iArr2[i60]];
                            while (i59 < i58) {
                                uh0.s(i57);
                                i59++;
                            }
                        }
                    }
                    i21++;
                    i16 = 6;
                    i19 = 1;
                }
            }
        }
        this.n = vh0;
        if (vh0 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Yh0 yh1 = vh0.f3886a;
        arrayList.add(yh1.g);
        arrayList.add(vh0.c);
        Metadata metadataB = Zh0.b(AC.k((String[]) vh0.b.d));
        C4531rw c4531rw = new C4531rw();
        c4531rw.k = MimeTypes.AUDIO_VORBIS;
        c4531rw.f = yh1.d;
        c4531rw.g = yh1.c;
        c4531rw.x = yh1.f4034a;
        c4531rw.y = yh1.b;
        c4531rw.m = arrayList;
        c4531rw.i = metadataB;
        c3491g4.b = new C4619sw(c4531rw);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K90
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
