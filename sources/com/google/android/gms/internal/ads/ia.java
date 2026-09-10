package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ia implements ja {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f15679m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f15680n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, InterfaceC0435l1.a.b.f29088h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f15681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f15682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma f15683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f15685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final np0 f15686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g22 f15688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f15690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15691k;
    public long l;

    public ia(o2 o2Var, h3 h3Var, ma maVar) throws ab {
        this.f15681a = o2Var;
        this.f15682b = h3Var;
        this.f15683c = maVar;
        int i10 = maVar.f17361b;
        int iMax = Math.max(1, i10 / 10);
        this.f15687g = iMax;
        np0 np0Var = new np0((byte[]) maVar.f17365f);
        np0Var.M();
        int iM = np0Var.M();
        this.f15684d = iM;
        int i11 = maVar.f17360a;
        int i12 = maVar.f17362c;
        int iD = defpackage.e.D(i12 - (i11 * 4), 8, maVar.f17363d * i11, 1);
        if (iM != iD) {
            throw ab.a(null, l1.d.j(new StringBuilder(String.valueOf(iD).length() + 34 + String.valueOf(iM).length()), iD, "Expected frames per block: ", iM, "; got: "));
        }
        String str = uu0.f20901a;
        int i13 = ((iMax + iM) - 1) / iM;
        this.f15685e = new byte[i13 * i12];
        this.f15686f = new np0((iM + iM) * i11 * i13);
        int i14 = ((i12 * i10) * 8) / iM;
        i12 i12Var = new i12();
        i12Var.e(MimeTypes.AUDIO_RAW);
        i12Var.f15506h = i14;
        i12Var.f15507i = i14;
        i12Var.f15512o = (iMax + iMax) * i11;
        i12Var.F = i11;
        int i15 = maVar.f17364e;
        i12Var.G = i15 != 0 ? i15 << 2 : -1;
        i12Var.H = i10;
        i12Var.I = 2;
        this.f15688h = new g22(i12Var);
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final void a(int i10, long j10) {
        this.f15681a.o(new oa(this.f15683c, this.f15684d, i10, j10));
        this.f15682b.f(this.f15688h);
    }

    public final void b(int i10) {
        ma maVar = this.f15683c;
        long jV = this.f15690j + uu0.v(this.l, 1000000L, maVar.f17361b, RoundingMode.DOWN);
        int i11 = (i10 + i10) * maVar.f17360a;
        this.f15682b.c(jV, 1, i11, this.f15691k - i11, null);
        this.l += (long) i10;
        this.f15691k -= i11;
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final void c(long j10) {
        this.f15689i = 0;
        this.f15690j = j10;
        this.f15691k = 0;
        this.l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0142  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010d A[EDGE_INSN: B:47:0x010d->B:35:0x010d BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0105], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0021). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.ja
    public final boolean f(n2 n2Var, long j10) {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        np0 np0Var;
        int i13;
        int i14;
        int i15;
        int i16;
        byte[] bArr2;
        int i17;
        int i18;
        int iMin;
        int[] iArr;
        int i19;
        int iMax;
        int i20;
        int i21;
        byte b10;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int iT;
        int i27 = this.f15691k;
        ma maVar = this.f15683c;
        int i28 = maVar.f17360a;
        int i29 = i27 / (i28 + i28);
        int i30 = this.f15687g;
        String str = uu0.f20901a;
        int i31 = this.f15684d;
        int i32 = maVar.f17362c;
        int i33 = ((((i30 - i29) + i31) - 1) / i31) * i32;
        boolean z10 = j10 == 0;
        while (true) {
            bArr = this.f15685e;
            if (z10 && (i26 = this.f15689i) < i33) {
                iT = n2Var.t(bArr, this.f15689i, (int) Math.min(i33 - i26, j10));
                if (iT == -1) {
                    break;
                }
                this.f15689i += iT;
                bArr = this.f15685e;
                if (z10) {
                }
            }
            i10 = this.f15689i / i32;
            if (i10 > 0) {
                i12 = 0;
                while (true) {
                    np0Var = this.f15686f;
                    if (i12 < i10) {
                        break;
                    }
                    i15 = 0;
                    while (true) {
                        i16 = maVar.f17360a;
                        if (i15 < i16) {
                            bArr2 = np0Var.f17880a;
                            i17 = (i32 / i16) - 4;
                            i18 = (i15 * 4) + (i12 * i32);
                            int i34 = bArr[i18 + 1] & 255;
                            int i35 = bArr[i18] & 255;
                            int i36 = i10;
                            iMin = Math.min(bArr[i18 + 2] & 255, 88);
                            iArr = f15680n;
                            i19 = iArr[iMin];
                            int i37 = (i12 * i31 * i16) + i15;
                            iMax = (short) (i35 | (i34 << 8));
                            i20 = i37 + i37;
                            bArr2[i20] = (byte) (iMax & 255);
                            bArr2[i20 + 1] = (byte) (iMax >> 8);
                            i21 = 0;
                            while (i21 < i17 + i17) {
                                b10 = bArr[((i21 / 8) * i16 * 4) + (i16 * 4) + i18 + ((i21 / 2) % 4)];
                                i22 = i21;
                                i23 = b10 & 255;
                                if (i22 % 2 == 0) {
                                    i24 = b10 & 15;
                                } else {
                                    i24 = i23 >> 4;
                                }
                                int i38 = i24 & 7;
                                i25 = (((i38 + i38) + 1) * i19) >> 3;
                                if ((i24 & 8) != 0) {
                                    i25 = -i25;
                                }
                                iMax = Math.max(-32768, Math.min(iMax + i25, 32767));
                                i20 = i16 + i16 + i20;
                                bArr2[i20] = (byte) (iMax & 255);
                                bArr2[i20 + 1] = (byte) (iMax >> 8);
                                iMin = Math.max(0, Math.min(iMin + f15679m[i24], 88));
                                i19 = iArr[iMin];
                                i21 = i22 + 1;
                            }
                            i15++;
                            i10 = i36;
                        }
                    }
                    i12++;
                }
                int i39 = i10;
                int i40 = i31 * i39;
                int i41 = (i40 + i40) * maVar.f17360a;
                np0Var.E(0);
                np0Var.C(i41);
                this.f15689i -= i39 * i32;
                int i42 = np0Var.f17882c;
                this.f15682b.b(i42, np0Var);
                i13 = this.f15691k + i42;
                this.f15691k = i13;
                i14 = maVar.f17360a;
                if (i13 / (i14 + i14) >= i30) {
                    b(i30);
                }
            }
            if (z10) {
                int i43 = this.f15691k;
                int i44 = maVar.f17360a;
                i11 = i43 / (i44 + i44);
                if (i11 > 0) {
                    b(i11);
                }
            }
            return z10;
        }
        while (true) {
            bArr = this.f15685e;
            if (z10) {
            }
            i10 = this.f15689i / i32;
            if (i10 > 0) {
                i12 = 0;
                while (true) {
                    np0Var = this.f15686f;
                    if (i12 < i10) {
                        break;
                        break;
                    }
                    i15 = 0;
                    while (true) {
                        i16 = maVar.f17360a;
                        if (i15 < i16) {
                            bArr2 = np0Var.f17880a;
                            i17 = (i32 / i16) - 4;
                            i18 = (i15 * 4) + (i12 * i32);
                            int i310 = bArr[i18 + 1] & 255;
                            int i311 = bArr[i18] & 255;
                            int i312 = i10;
                            iMin = Math.min(bArr[i18 + 2] & 255, 88);
                            iArr = f15680n;
                            i19 = iArr[iMin];
                            int i313 = (i12 * i31 * i16) + i15;
                            iMax = (short) (i311 | (i310 << 8));
                            i20 = i313 + i313;
                            bArr2[i20] = (byte) (iMax & 255);
                            bArr2[i20 + 1] = (byte) (iMax >> 8);
                            i21 = 0;
                            while (i21 < i17 + i17) {
                                b10 = bArr[((i21 / 8) * i16 * 4) + (i16 * 4) + i18 + ((i21 / 2) % 4)];
                                i22 = i21;
                                i23 = b10 & 255;
                                if (i22 % 2 == 0) {
                                    i24 = b10 & 15;
                                } else {
                                    i24 = i23 >> 4;
                                }
                                int i314 = i24 & 7;
                                i25 = (((i314 + i314) + 1) * i19) >> 3;
                                if ((i24 & 8) != 0) {
                                    i25 = -i25;
                                }
                                iMax = Math.max(-32768, Math.min(iMax + i25, 32767));
                                i20 = i16 + i16 + i20;
                                bArr2[i20] = (byte) (iMax & 255);
                                bArr2[i20 + 1] = (byte) (iMax >> 8);
                                iMin = Math.max(0, Math.min(iMin + f15679m[i24], 88));
                                i19 = iArr[iMin];
                                i21 = i22 + 1;
                            }
                            i15++;
                            i10 = i312;
                        }
                    }
                    i12++;
                }
                int i315 = i10;
                int i45 = i31 * i315;
                int i46 = (i45 + i45) * maVar.f17360a;
                np0Var.E(0);
                np0Var.C(i46);
                this.f15689i -= i315 * i32;
                int i47 = np0Var.f17882c;
                this.f15682b.b(i47, np0Var);
                i13 = this.f15691k + i47;
                this.f15691k = i13;
                i14 = maVar.f17360a;
                if (i13 / (i14 + i14) >= i30) {
                    b(i30);
                }
            }
            if (z10) {
                int i48 = this.f15691k;
                int i49 = maVar.f17360a;
                i11 = i48 / (i49 + i49);
                if (i11 > 0) {
                    b(i11);
                }
            }
            return z10;
            this.f15689i += iT;
        }
    }
}
