package v3;

import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.google.android.gms.internal.ads.ta1;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.d0;
import i1.e0;
import i1.o;
import i1.p;
import java.math.RoundingMode;
import l1.q;
import l1.y;
import n2.a0;
import n2.l;
import n2.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f52453m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f52454n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, InterfaceC0435l1.a.b.f29088h, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f52455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f52456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ta1 f52457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f52459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f52460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f52461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f52462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f52463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f52464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f52465k;
    public long l;

    public a(m mVar, a0 a0Var, ta1 ta1Var) throws e0 {
        this.f52455a = mVar;
        this.f52456b = a0Var;
        this.f52457c = ta1Var;
        int i10 = ta1Var.f20275b;
        int iMax = Math.max(1, i10 / 10);
        this.f52461g = iMax;
        q qVar = new q(ta1Var.f20278e);
        qVar.s();
        int iS = qVar.s();
        this.f52458d = iS;
        int i11 = ta1Var.f20274a;
        int i12 = ta1Var.f20276c;
        int i13 = (((i12 - (i11 * 4)) * 8) / (ta1Var.f20277d * i11)) + 1;
        if (iS != i13) {
            throw e0.a(null, "Expected frames per block: " + i13 + "; got: " + iS);
        }
        int iG = y.g(iMax, iS);
        this.f52459e = new byte[iG * i12];
        this.f52460f = new q(iS * 2 * i11 * iG);
        int i14 = ((i12 * i10) * 8) / iS;
        o oVar = new o();
        oVar.f42600m = d0.n(MimeTypes.AUDIO_RAW);
        oVar.f42596h = i14;
        oVar.f42597i = i14;
        oVar.f42601n = iMax * 2 * i11;
        oVar.E = i11;
        oVar.F = i10;
        oVar.G = 2;
        this.f52462h = new p(oVar);
    }

    public final void a(int i10) {
        long j10 = this.f52464j;
        long j11 = this.l;
        ta1 ta1Var = this.f52457c;
        long j12 = ta1Var.f20275b;
        String str = y.f44830a;
        long jU = j10 + y.U(j11, 1000000L, j12, RoundingMode.DOWN);
        int i11 = i10 * 2 * ta1Var.f20274a;
        this.f52456b.a(jU, 1, i11, this.f52465k - i11, null);
        this.l += (long) i10;
        this.f52465k -= i11;
    }

    @Override // v3.b
    public final void b(int i10, long j10) {
        e eVar = new e(this.f52457c, this.f52458d, i10, j10);
        this.f52455a.u(eVar);
        p pVar = this.f52462h;
        a0 a0Var = this.f52456b;
        a0Var.b(pVar);
        a0Var.e(eVar.f52479e);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // v3.b
    public final boolean d(l lVar, long j10) {
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        q qVar;
        int i13;
        int i14;
        int i15;
        byte[] bArr2;
        int i16;
        int i17;
        int iJ;
        int iMin;
        int[] iArr;
        int i18;
        int i19;
        int i20;
        byte b10;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = this.f52465k;
        ta1 ta1Var = this.f52457c;
        int i28 = i27 / (ta1Var.f20274a * 2);
        int i29 = this.f52461g;
        int i30 = this.f52458d;
        int iG = y.g(i29 - i28, i30);
        int i31 = ta1Var.f20276c;
        int i32 = iG * i31;
        boolean z10 = j10 == 0;
        while (true) {
            bArr = this.f52459e;
            if (z10 && (i25 = this.f52463i) < i32) {
                i26 = lVar.read(bArr, this.f52463i, (int) Math.min(i32 - i25, j10));
                if (i26 == -1) {
                    break;
                }
                this.f52463i += i26;
                bArr = this.f52459e;
                if (z10) {
                }
            }
            i10 = this.f52463i / i31;
            if (i10 > 0) {
                i12 = 0;
                while (true) {
                    qVar = this.f52460f;
                    if (i12 < i10) {
                        break;
                    }
                    i14 = 0;
                    while (true) {
                        i15 = ta1Var.f20274a;
                        if (i14 < i15) {
                            bArr2 = qVar.f44813a;
                            int i33 = (i14 * 4) + (i12 * i31);
                            i16 = (i15 * 4) + i33;
                            i17 = (i31 / i15) - 4;
                            iJ = (short) ((bArr[i33] & 255) | ((bArr[i33 + 1] & 255) << 8));
                            int i34 = i10;
                            iMin = Math.min(bArr[i33 + 2] & 255, 88);
                            iArr = f52454n;
                            i18 = iArr[iMin];
                            i19 = ((i12 * i30 * i15) + i14) * 2;
                            bArr2[i19] = (byte) (iJ & 255);
                            bArr2[i19 + 1] = (byte) (iJ >> 8);
                            int i35 = i12;
                            i20 = 0;
                            while (i20 < i17 * 2) {
                                b10 = bArr[((i20 / 8) * i15 * 4) + i16 + ((i20 / 2) % 4)];
                                i21 = i20;
                                i22 = b10 & 255;
                                if (i21 % 2 == 0) {
                                    i23 = b10 & 15;
                                } else {
                                    i23 = i22 >> 4;
                                }
                                i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                iJ = y.j(iJ + i24, -32768, 32767);
                                i19 = (i15 * 2) + i19;
                                bArr2[i19] = (byte) (iJ & 255);
                                bArr2[i19 + 1] = (byte) (iJ >> 8);
                                iMin = y.j(iMin + f52453m[i23], 0, 88);
                                i18 = iArr[iMin];
                                i20 = i21 + 1;
                            }
                            i14++;
                            i10 = i34;
                            i12 = i35;
                        }
                    }
                    i12++;
                }
                int i36 = i10;
                int i37 = i30 * i36 * 2 * ta1Var.f20274a;
                qVar.M(0);
                qVar.L(i37);
                this.f52463i -= i36 * i31;
                int i38 = qVar.f44815c;
                this.f52456b.g(i38, qVar);
                i13 = this.f52465k + i38;
                this.f52465k = i13;
                if (i13 / (ta1Var.f20274a * 2) >= i29) {
                    a(i29);
                }
            }
            if (z10 && (i11 = this.f52465k / (ta1Var.f20274a * 2)) > 0) {
                a(i11);
            }
            return z10;
        }
        while (true) {
            bArr = this.f52459e;
            if (z10) {
            }
            i10 = this.f52463i / i31;
            if (i10 > 0) {
                i12 = 0;
                while (true) {
                    qVar = this.f52460f;
                    if (i12 < i10) {
                        break;
                        break;
                    }
                    i14 = 0;
                    while (true) {
                        i15 = ta1Var.f20274a;
                        if (i14 < i15) {
                            bArr2 = qVar.f44813a;
                            int i39 = (i14 * 4) + (i12 * i31);
                            i16 = (i15 * 4) + i39;
                            i17 = (i31 / i15) - 4;
                            iJ = (short) ((bArr[i39] & 255) | ((bArr[i39 + 1] & 255) << 8));
                            int i310 = i10;
                            iMin = Math.min(bArr[i39 + 2] & 255, 88);
                            iArr = f52454n;
                            i18 = iArr[iMin];
                            i19 = ((i12 * i30 * i15) + i14) * 2;
                            bArr2[i19] = (byte) (iJ & 255);
                            bArr2[i19 + 1] = (byte) (iJ >> 8);
                            int i311 = i12;
                            i20 = 0;
                            while (i20 < i17 * 2) {
                                b10 = bArr[((i20 / 8) * i15 * 4) + i16 + ((i20 / 2) % 4)];
                                i21 = i20;
                                i22 = b10 & 255;
                                if (i21 % 2 == 0) {
                                    i23 = b10 & 15;
                                } else {
                                    i23 = i22 >> 4;
                                }
                                i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                iJ = y.j(iJ + i24, -32768, 32767);
                                i19 = (i15 * 2) + i19;
                                bArr2[i19] = (byte) (iJ & 255);
                                bArr2[i19 + 1] = (byte) (iJ >> 8);
                                iMin = y.j(iMin + f52453m[i23], 0, 88);
                                i18 = iArr[iMin];
                                i20 = i21 + 1;
                            }
                            i14++;
                            i10 = i310;
                            i12 = i311;
                        }
                    }
                    i12++;
                }
                int i312 = i10;
                int i313 = i30 * i312 * 2 * ta1Var.f20274a;
                qVar.M(0);
                qVar.L(i313);
                this.f52463i -= i312 * i31;
                int i314 = qVar.f44815c;
                this.f52456b.g(i314, qVar);
                i13 = this.f52465k + i314;
                this.f52465k = i13;
                if (i13 / (ta1Var.f20274a * 2) >= i29) {
                    a(i29);
                }
            }
            if (z10) {
                a(i11);
            }
            return z10;
            this.f52463i += i26;
        }
    }

    @Override // v3.b
    public final void e(long j10) {
        this.f52463i = 0;
        this.f52464j = j10;
        this.f52465k = 0;
        this.l = 0L;
    }
}
