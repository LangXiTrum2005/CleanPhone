package i3;

import com.google.android.gms.internal.ads.if1;
import com.google.android.gms.internal.ads.k7;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import eb.d0;
import i1.c0;
import i1.e0;
import i1.o;
import i1.p;
import java.util.ArrayList;
import java.util.Arrays;
import l1.q;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends k7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f42857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f42858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f42859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public if1 f42860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public od.c f42861r;

    @Override // com.google.android.gms.internal.ads.k7
    public final void a(long j10) {
        this.f16349c = j10;
        this.f42859p = j10 != 0;
        if1 if1Var = this.f42860q;
        this.f42858o = if1Var != null ? if1Var.f15731e : 0;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final long b(q qVar) {
        byte b10 = qVar.f44813a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        f fVar = this.f42857n;
        fVar.getClass();
        int i10 = fVar.f42852b;
        if1 if1Var = (if1) fVar.f42853c;
        int i11 = !((mb.b[]) fVar.f42856f)[(b10 >> 1) & (255 >>> (8 - i10))].f45919a ? if1Var.f15731e : if1Var.f15732f;
        long j10 = this.f42859p ? (this.f42858o + i11) / 4 : 0;
        byte[] bArr = qVar.f44813a;
        int length = bArr.length;
        int i12 = qVar.f44815c + 4;
        if (length < i12) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
            qVar.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            qVar.L(i12);
        }
        byte[] bArr2 = qVar.f44813a;
        int i13 = qVar.f44815c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f42859p = true;
        this.f42858o = i11;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x039f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x03a2  */
    @Override // com.google.android.gms.internal.ads.k7
    public final boolean c(q qVar, long j10, d0 d0Var) throws e0 {
        f fVar;
        if (this.f42857n != null) {
            ((p) d0Var.f39976b).getClass();
            return false;
        }
        if1 if1Var = this.f42860q;
        int i10 = 4;
        if (if1Var != null) {
            od.c cVar = this.f42861r;
            if (cVar == null) {
                this.f42861r = n2.b.z(qVar, true, true);
            } else {
                int i11 = qVar.f44815c;
                byte[] bArr = new byte[i11];
                System.arraycopy(qVar.f44813a, 0, bArr, 0, i11);
                int i12 = if1Var.f15727a;
                int i13 = 5;
                n2.b.B(5, qVar, false);
                int iZ = qVar.z() + 1;
                xd1 xd1Var = new xd1(qVar.f44813a, 4, (byte) 0);
                int i14 = 8;
                xd1Var.t(qVar.f44814b * 8);
                int i15 = 0;
                while (true) {
                    int i16 = i14;
                    int i17 = 16;
                    if (i15 >= iZ) {
                        int i18 = 6;
                        int i19 = xd1Var.i(6) + 1;
                        for (int i20 = 0; i20 < i19; i20++) {
                            if (xd1Var.i(16) != 0) {
                                throw e0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i21 = 1;
                        int i22 = xd1Var.i(6) + 1;
                        int i23 = 0;
                        while (true) {
                            int i24 = 3;
                            if (i23 >= i22) {
                                int i25 = xd1Var.i(i18) + 1;
                                int i26 = 0;
                                while (i26 < i25) {
                                    if (xd1Var.i(16) > 2) {
                                        throw e0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    xd1Var.t(24);
                                    xd1Var.t(24);
                                    xd1Var.t(24);
                                    int i27 = xd1Var.i(i18) + 1;
                                    int i28 = 8;
                                    xd1Var.t(8);
                                    int[] iArr = new int[i27];
                                    for (int i29 = 0; i29 < i27; i29++) {
                                        iArr[i29] = ((xd1Var.h() ? xd1Var.i(5) : 0) * 8) + xd1Var.i(3);
                                    }
                                    int i30 = 0;
                                    while (i30 < i27) {
                                        int i31 = 0;
                                        while (i31 < i28) {
                                            if ((iArr[i30] & (1 << i31)) != 0) {
                                                xd1Var.t(i28);
                                            }
                                            i31++;
                                            i28 = 8;
                                        }
                                        i30++;
                                        i28 = 8;
                                    }
                                    i26++;
                                    i18 = 6;
                                }
                                int i32 = xd1Var.i(i18) + 1;
                                for (int i33 = 0; i33 < i32; i33++) {
                                    int i34 = xd1Var.i(16);
                                    if (i34 != 0) {
                                        l1.a.e("VorbisUtil", "mapping type other than 0 not supported: " + i34);
                                    } else {
                                        int i35 = xd1Var.h() ? xd1Var.i(4) + 1 : 1;
                                        if (xd1Var.h()) {
                                            int i36 = xd1Var.i(8) + 1;
                                            for (int i37 = 0; i37 < i36; i37++) {
                                                int i38 = i12 - 1;
                                                int i39 = 0;
                                                for (int i40 = i38; i40 > 0; i40 >>>= 1) {
                                                    i39++;
                                                }
                                                xd1Var.t(i39);
                                                int i41 = 0;
                                                while (i38 > 0) {
                                                    i41++;
                                                    i38 >>>= 1;
                                                }
                                                xd1Var.t(i41);
                                            }
                                        }
                                        if (xd1Var.i(2) != 0) {
                                            throw e0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i35 > 1) {
                                            for (int i42 = 0; i42 < i12; i42++) {
                                                xd1Var.t(4);
                                            }
                                        }
                                        for (int i43 = 0; i43 < i35; i43++) {
                                            xd1Var.t(8);
                                            xd1Var.t(8);
                                            xd1Var.t(8);
                                        }
                                    }
                                }
                                int i44 = xd1Var.i(6);
                                int i45 = i44 + 1;
                                mb.b[] bVarArr = new mb.b[i45];
                                for (int i46 = 0; i46 < i45; i46++) {
                                    boolean zH = xd1Var.h();
                                    xd1Var.i(16);
                                    xd1Var.i(16);
                                    xd1Var.i(8);
                                    bVarArr[i46] = new mb.b(zH);
                                }
                                if (!xd1Var.h()) {
                                    throw e0.a(null, "framing bit after modes not set as expected");
                                }
                                int i47 = 0;
                                while (i44 > 0) {
                                    i47++;
                                    i44 >>>= 1;
                                }
                                fVar = new f(if1Var, cVar, bArr, bVarArr, i47);
                                break;
                            }
                            int i48 = xd1Var.i(i17);
                            if (i48 == 0) {
                                int i49 = i16;
                                xd1Var.t(i49);
                                xd1Var.t(16);
                                xd1Var.t(16);
                                xd1Var.t(6);
                                xd1Var.t(i49);
                                int i50 = xd1Var.i(4) + 1;
                                int i51 = 0;
                                while (i51 < i50) {
                                    xd1Var.t(i49);
                                    i51++;
                                    i49 = 8;
                                }
                            } else {
                                if (i48 != i21) {
                                    throw e0.a(null, "floor type greater than 1 not decodable: " + i48);
                                }
                                int i52 = xd1Var.i(5);
                                int[] iArr2 = new int[i52];
                                int i53 = -1;
                                for (int i54 = 0; i54 < i52; i54++) {
                                    int i55 = xd1Var.i(i10);
                                    iArr2[i54] = i55;
                                    if (i55 > i53) {
                                        i53 = i55;
                                    }
                                }
                                int i56 = i53 + 1;
                                int[] iArr3 = new int[i56];
                                int i57 = 0;
                                while (i57 < i56) {
                                    iArr3[i57] = xd1Var.i(i24) + 1;
                                    int i58 = xd1Var.i(2);
                                    int i59 = i16;
                                    if (i58 > 0) {
                                        xd1Var.t(i59);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i60 = 0;
                                    for (int i61 = 1; i60 < (i61 << i58); i61 = 1) {
                                        xd1Var.t(i59);
                                        i60++;
                                        i59 = 8;
                                    }
                                    i57++;
                                    iArr3 = iArr4;
                                    i16 = 8;
                                    i24 = 3;
                                }
                                int[] iArr5 = iArr3;
                                xd1Var.t(2);
                                int i62 = xd1Var.i(4);
                                int i63 = 0;
                                int i64 = 0;
                                for (int i65 = 0; i65 < i52; i65++) {
                                    i63 += iArr5[iArr2[i65]];
                                    while (i64 < i63) {
                                        xd1Var.t(i62);
                                        i64++;
                                    }
                                }
                            }
                            i23++;
                            i16 = 8;
                            i18 = 6;
                            i17 = 16;
                            i10 = 4;
                            i21 = 1;
                        }
                    } else {
                        if (xd1Var.i(24) != 5653314) {
                            throw e0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((xd1Var.f21845d * 8) + xd1Var.f21846e));
                        }
                        int i66 = xd1Var.i(16);
                        int i67 = xd1Var.i(24);
                        if (xd1Var.h()) {
                            xd1Var.t(i13);
                            int i68 = 0;
                            while (i68 < i67) {
                                int i69 = 0;
                                for (int i70 = i67 - i68; i70 > 0; i70 >>>= 1) {
                                    i69++;
                                }
                                i68 += xd1Var.i(i69);
                            }
                        } else {
                            boolean zH2 = xd1Var.h();
                            for (int i71 = 0; i71 < i67; i71++) {
                                if (!zH2) {
                                    xd1Var.t(i13);
                                } else if (xd1Var.h()) {
                                    xd1Var.t(i13);
                                }
                            }
                        }
                        int i72 = xd1Var.i(4);
                        if (i72 > 2) {
                            throw e0.a(null, "lookup type greater than 2 not decodable: " + i72);
                        }
                        if (i72 == 1 || i72 == 2) {
                            xd1Var.t(32);
                            xd1Var.t(32);
                            int i73 = xd1Var.i(4) + 1;
                            xd1Var.t(1);
                            xd1Var.t((int) ((i72 == 1 ? i66 != 0 ? (long) Math.floor(Math.pow(i67, 1.0d / ((double) i66))) : 0L : ((long) i66) * ((long) i67)) * ((long) i73)));
                        }
                        i15++;
                        i14 = i16;
                        i13 = 5;
                    }
                }
            }
            this.f42857n = fVar;
            if (fVar == null) {
                return true;
            }
            if1 if1Var2 = (if1) fVar.f42853c;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) if1Var2.f15733g);
            arrayList.add((byte[]) fVar.f42855e);
            c0 c0VarW = n2.b.w(j0.y((String[]) ((od.c) fVar.f42854d).f47386b));
            o oVar = new o();
            oVar.l = i1.d0.n("audio/ogg");
            oVar.f42600m = i1.d0.n(MimeTypes.AUDIO_VORBIS);
            oVar.f42596h = if1Var2.f15730d;
            oVar.f42597i = if1Var2.f15729c;
            oVar.E = if1Var2.f15727a;
            oVar.F = if1Var2.f15728b;
            oVar.f42603p = arrayList;
            oVar.f42599k = c0VarW;
            d0Var.f39976b = new p(oVar);
            return true;
        }
        n2.b.B(1, qVar, false);
        qVar.r();
        int iZ2 = qVar.z();
        int iR = qVar.r();
        int iO = qVar.o();
        int i74 = iO <= 0 ? -1 : iO;
        int iO2 = qVar.o();
        int i75 = iO2 <= 0 ? -1 : iO2;
        qVar.o();
        int iZ3 = qVar.z();
        int iPow = (int) Math.pow(2.0d, iZ3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iZ3 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
        qVar.z();
        this.f42860q = new if1(iZ2, iR, i74, i75, iPow, iPow2, Arrays.copyOf(qVar.f44813a, qVar.f44815c));
        fVar = null;
        this.f42857n = fVar;
        if (fVar == null) {
            return true;
        }
        if1 if1Var3 = (if1) fVar.f42853c;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) if1Var3.f15733g);
        arrayList2.add((byte[]) fVar.f42855e);
        c0 c0VarW2 = n2.b.w(j0.y((String[]) ((od.c) fVar.f42854d).f47386b));
        o oVar2 = new o();
        oVar2.l = i1.d0.n("audio/ogg");
        oVar2.f42600m = i1.d0.n(MimeTypes.AUDIO_VORBIS);
        oVar2.f42596h = if1Var3.f15730d;
        oVar2.f42597i = if1Var3.f15729c;
        oVar2.E = if1Var3.f15727a;
        oVar2.F = if1Var3.f15728b;
        oVar2.f42603p = arrayList2;
        oVar2.f42599k = c0VarW2;
        d0Var.f39976b = new p(oVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f42857n = null;
            this.f42860q = null;
            this.f42861r = null;
        }
        this.f42858o = 0;
        this.f42859p = false;
    }
}
