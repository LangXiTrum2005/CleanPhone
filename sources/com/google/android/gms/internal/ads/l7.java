package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l7 extends k7 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public hz f16759n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public if1 f16762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z61 f16763r;

    @Override // com.google.android.gms.internal.ads.k7
    public final void e(boolean z10) {
        super.e(z10);
        if (z10) {
            this.f16759n = null;
            this.f16762q = null;
            this.f16763r = null;
        }
        this.f16760o = 0;
        this.f16761p = false;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final long f(np0 np0Var) {
        if ((np0Var.f17880a[0] & 1) == 1) {
            return -1L;
        }
        hz hzVar = this.f16759n;
        hzVar.getClass();
        byte b10 = np0Var.f17880a[0];
        if1 if1Var = (if1) hzVar.f15433b;
        n6[] n6VarArr = (n6[]) hzVar.f15436e;
        int i10 = n6VarArr[(b10 >> 1) & (255 >>> (8 - zw1.b(n6VarArr.length + (-1))))].f17679b ? if1Var.f15732f : if1Var.f15731e;
        int i11 = this.f16761p ? (this.f16760o + i10) / 4 : 0;
        byte[] bArr = np0Var.f17880a;
        int length = bArr.length;
        int i12 = np0Var.f17882c;
        if (length < i12 + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i12 + 4);
            np0Var.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            np0Var.C(i12 + 4);
        }
        long j10 = i11;
        byte[] bArr2 = np0Var.f17880a;
        int i13 = np0Var.f17882c;
        bArr2[i13 - 4] = (byte) (j10 & 255);
        bArr2[i13 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f16761p = true;
        this.f16760o = i10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x03d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:163:0x03dc  */
    @Override // com.google.android.gms.internal.ads.k7
    public final boolean g(np0 np0Var, long j10, md0 md0Var) throws ab {
        hz hzVar;
        int i10;
        if (this.f16759n != null) {
            ((g22) md0Var.f17399b).getClass();
            return false;
        }
        if1 if1Var = this.f16762q;
        int i11 = 1;
        if (if1Var != null) {
            int i12 = 4;
            z61 z61Var = this.f16763r;
            if (z61Var == null) {
                this.f16763r = zw1.h(np0Var, true, true);
            } else {
                int i13 = np0Var.f17882c;
                byte[] bArr = new byte[i13];
                System.arraycopy(np0Var.f17880a, 0, bArr, 0, i13);
                int i14 = if1Var.f15727a;
                int i15 = 5;
                zw1.m(5, np0Var, false);
                int iK = np0Var.K() + 1;
                xd1 xd1Var = new xd1(np0Var.f17880a, 0, (byte) 0);
                int i16 = 8;
                xd1Var.x(np0Var.f17881b * 8);
                int i17 = 0;
                while (true) {
                    int i18 = 2;
                    int i19 = 16;
                    if (i17 < iK) {
                        int i20 = i16;
                        if (xd1Var.w(24) != 5653314) {
                            int i21 = (xd1Var.f21845d * 8) + xd1Var.f21846e;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i21).length() + 55);
                            sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb2.append(i21);
                            throw ab.a(null, sb2.toString());
                        }
                        int iW = xd1Var.w(16);
                        int iW2 = xd1Var.w(24);
                        if (xd1Var.v()) {
                            xd1Var.x(i15);
                            for (int iW3 = 0; iW3 < iW2; iW3 += xd1Var.w(zw1.b(iW2 - iW3))) {
                            }
                        } else {
                            boolean zV = xd1Var.v();
                            for (int i22 = 0; i22 < iW2; i22++) {
                                if (!zV) {
                                    xd1Var.x(i15);
                                } else if (xd1Var.v()) {
                                    xd1Var.x(i15);
                                }
                            }
                        }
                        int i23 = i12;
                        int iW4 = xd1Var.w(i23);
                        if (iW4 > 2) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iW4).length() + 42);
                            sb3.append("lookup type greater than 2 not decodable: ");
                            sb3.append(iW4);
                            throw ab.a(null, sb3.toString());
                        }
                        if (iW4 != i11) {
                            if (iW4 != 2) {
                                i11 = i11;
                            }
                            i17++;
                            i16 = i20;
                            i11 = i11;
                            i12 = 4;
                            i15 = 5;
                        } else {
                            i18 = iW4;
                        }
                        xd1Var.x(32);
                        xd1Var.x(32);
                        int iW5 = xd1Var.w(i23) + i11;
                        xd1Var.x(i11);
                        xd1Var.x((int) ((i18 == i11 ? iW != 0 ? (long) Math.floor(Math.pow(iW2, 1.0d / ((double) iW))) : 0L : ((long) iW2) * ((long) iW)) * ((long) iW5)));
                        i17++;
                        i16 = i20;
                        i11 = i11;
                        i12 = 4;
                        i15 = 5;
                    } else {
                        int i24 = i16;
                        int i25 = i11;
                        int i26 = 6;
                        int iW6 = xd1Var.w(6) + 1;
                        for (int i27 = 0; i27 < iW6; i27++) {
                            if (xd1Var.w(16) != 0) {
                                throw ab.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int iW7 = xd1Var.w(6) + 1;
                        int i28 = 0;
                        while (true) {
                            int i29 = 3;
                            if (i28 >= iW7) {
                                int iW8 = xd1Var.w(i26) + 1;
                                int i30 = 0;
                                while (i30 < iW8) {
                                    if (xd1Var.w(16) > 2) {
                                        throw ab.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    xd1Var.x(24);
                                    xd1Var.x(24);
                                    xd1Var.x(24);
                                    int iW9 = xd1Var.w(i26) + 1;
                                    int i31 = 8;
                                    xd1Var.x(8);
                                    int[] iArr = new int[iW9];
                                    for (int i32 = 0; i32 < iW9; i32++) {
                                        iArr[i32] = ((xd1Var.v() ? xd1Var.w(5) : 0) * 8) + xd1Var.w(3);
                                    }
                                    int i33 = 0;
                                    while (i33 < iW9) {
                                        int i34 = 0;
                                        while (i34 < i31) {
                                            if ((iArr[i33] & (1 << i34)) != 0) {
                                                xd1Var.x(i31);
                                            }
                                            i34++;
                                            i31 = 8;
                                        }
                                        i33++;
                                        i31 = 8;
                                    }
                                    i30++;
                                    i26 = 6;
                                }
                                int iW10 = xd1Var.w(i26) + 1;
                                for (int i35 = 0; i35 < iW10; i35++) {
                                    int iW11 = xd1Var.w(16);
                                    if (iW11 != 0) {
                                        StringBuilder sb4 = new StringBuilder(com.applovin.impl.ca.e(iW11, 41));
                                        sb4.append("mapping type other than 0 not supported: ");
                                        sb4.append(iW11);
                                        v71.F("VorbisUtil", sb4.toString());
                                    } else {
                                        int iW12 = xd1Var.v() ? xd1Var.w(4) + 1 : 1;
                                        if (xd1Var.v()) {
                                            int iW13 = xd1Var.w(8) + 1;
                                            for (int i36 = 0; i36 < iW13; i36++) {
                                                int i37 = i14 - 1;
                                                xd1Var.x(zw1.b(i37));
                                                xd1Var.x(zw1.b(i37));
                                            }
                                        }
                                        if (xd1Var.w(2) != 0) {
                                            throw ab.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iW12 > 1) {
                                            for (int i38 = 0; i38 < i14; i38++) {
                                                xd1Var.x(4);
                                            }
                                        }
                                        for (int i39 = 0; i39 < iW12; i39++) {
                                            xd1Var.x(8);
                                            xd1Var.x(8);
                                            xd1Var.x(8);
                                        }
                                    }
                                }
                                int iW14 = xd1Var.w(6) + 1;
                                n6[] n6VarArr = new n6[iW14];
                                for (int i40 = 0; i40 < iW14; i40++) {
                                    boolean zV2 = xd1Var.v();
                                    xd1Var.w(16);
                                    xd1Var.w(16);
                                    xd1Var.w(8);
                                    n6VarArr[i40] = new n6(zV2, 6);
                                }
                                if (!xd1Var.v()) {
                                    throw ab.a(null, "framing bit after modes not set as expected");
                                }
                                hzVar = new hz(if1Var, z61Var, bArr, n6VarArr, 1);
                                break;
                            }
                            int iW15 = xd1Var.w(i19);
                            if (iW15 == 0) {
                                int i41 = i24;
                                xd1Var.x(i41);
                                xd1Var.x(16);
                                xd1Var.x(16);
                                xd1Var.x(6);
                                xd1Var.x(i41);
                                int iW16 = xd1Var.w(4) + 1;
                                int i42 = 0;
                                while (i42 < iW16) {
                                    xd1Var.x(i41);
                                    i42++;
                                    i41 = 8;
                                }
                            } else {
                                if (iW15 != i25) {
                                    StringBuilder sb5 = new StringBuilder(com.applovin.impl.ca.e(iW15, 41));
                                    sb5.append("floor type greater than 1 not decodable: ");
                                    sb5.append(iW15);
                                    throw ab.a(null, sb5.toString());
                                }
                                int iW17 = xd1Var.w(5);
                                int[] iArr2 = new int[iW17];
                                int i43 = -1;
                                for (int i44 = 0; i44 < iW17; i44++) {
                                    int iW18 = xd1Var.w(4);
                                    iArr2[i44] = iW18;
                                    if (iW18 > i43) {
                                        i43 = iW18;
                                    }
                                }
                                int i45 = i43 + 1;
                                int[] iArr3 = new int[i45];
                                int i46 = 0;
                                while (i46 < i45) {
                                    iArr3[i46] = xd1Var.w(i29) + 1;
                                    int iW19 = xd1Var.w(2);
                                    if (iW19 > 0) {
                                        i10 = i24;
                                        xd1Var.x(i10);
                                    } else {
                                        i10 = i24;
                                    }
                                    int i47 = i45;
                                    int i48 = 0;
                                    for (int i49 = 1; i48 < (i49 << iW19); i49 = 1) {
                                        xd1Var.x(i10);
                                        i48++;
                                        i10 = 8;
                                    }
                                    i46++;
                                    i45 = i47;
                                    i24 = 8;
                                    i29 = 3;
                                }
                                xd1Var.x(2);
                                int iW20 = xd1Var.w(4);
                                int i50 = 0;
                                int i51 = 0;
                                for (int i52 = 0; i52 < iW17; i52++) {
                                    i50 += iArr3[iArr2[i52]];
                                    while (i51 < i50) {
                                        xd1Var.x(iW20);
                                        i51++;
                                    }
                                }
                            }
                            i28++;
                            i24 = 8;
                            i26 = 6;
                            i19 = 16;
                            i25 = 1;
                        }
                    }
                }
            }
            this.f16759n = hzVar;
            if (hzVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            if1 if1Var2 = (if1) hzVar.f15433b;
            arrayList.add((byte[]) if1Var2.f15733g);
            arrayList.add((byte[]) hzVar.f15435d);
            s8 s8VarA = j3.a(ca1.z((String[]) ((z61) hzVar.f15434c).f22523a));
            i12 i12Var = new i12();
            i12Var.d("audio/ogg");
            i12Var.e(MimeTypes.AUDIO_VORBIS);
            i12Var.f15506h = if1Var2.f15730d;
            i12Var.f15507i = if1Var2.f15729c;
            i12Var.F = if1Var2.f15727a;
            i12Var.H = if1Var2.f15728b;
            i12Var.f15514q = arrayList;
            i12Var.f15509k = s8VarA;
            md0Var.f17399b = new g22(i12Var);
            return true;
        }
        zw1.m(1, np0Var, false);
        np0Var.i();
        int iK2 = np0Var.K();
        int i53 = np0Var.i();
        int iC = np0Var.c();
        int i54 = iC <= 0 ? -1 : iC;
        int iC2 = np0Var.c();
        int i55 = iC2 <= 0 ? -1 : iC2;
        np0Var.c();
        int iK3 = np0Var.K();
        int iPow = (int) Math.pow(2.0d, iK3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iK3 & PsExtractor.VIDEO_STREAM_MASK) >> 4);
        np0Var.K();
        this.f16762q = new if1(iK2, i53, i54, i55, iPow, iPow2, Arrays.copyOf(np0Var.f17880a, np0Var.f17882c));
        hzVar = null;
        this.f16759n = hzVar;
        if (hzVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        if1 if1Var3 = (if1) hzVar.f15433b;
        arrayList2.add((byte[]) if1Var3.f15733g);
        arrayList2.add((byte[]) hzVar.f15435d);
        s8 s8VarA2 = j3.a(ca1.z((String[]) ((z61) hzVar.f15434c).f22523a));
        i12 i12Var2 = new i12();
        i12Var2.d("audio/ogg");
        i12Var2.e(MimeTypes.AUDIO_VORBIS);
        i12Var2.f15506h = if1Var3.f15730d;
        i12Var2.f15507i = if1Var3.f15729c;
        i12Var2.F = if1Var3.f15727a;
        i12Var2.H = if1Var3.f15728b;
        i12Var2.f15514q = arrayList2;
        i12Var2.f15509k = s8VarA2;
        md0Var.f17399b = new g22(i12Var2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void h(long j10) {
        this.f16349c = j10;
        this.f16761p = j10 != 0;
        if1 if1Var = this.f16762q;
        this.f16760o = if1Var != null ? if1Var.f15731e : 0;
    }
}
