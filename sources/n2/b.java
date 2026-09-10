package n2;

import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.ads.ma;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.s2;
import com.google.android.gms.internal.ads.t0;
import com.google.android.gms.internal.ads.x1;
import com.google.android.gms.internal.ads.xd1;
import com.ironsource.F9;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import i1.c0;
import i1.e0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f46423a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f46424b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f46425c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f46426d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f46427e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f46428f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f46429g = {32, 40, 48, 56, 64, 80, 96, InterfaceC0435l1.d.b.f29113j, 128, 160, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f46430h = {69, 87, InterfaceC0435l1.d.b.f29108e, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f46431i = {F9.b.f26076b, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, com.ironsource.mediationsdk.metadata.a.f29616n};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f46432j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f46433k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] l = {64, InterfaceC0435l1.d.b.f29113j, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, com.ironsource.mediationsdk.metadata.a.f29616n, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f46434m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f46435n = {5, 8, 10, 12};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f46436o = {6, 9, 12, 15};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f46437p = {2, 4, 6, 8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f46438q = {9, 11, 13, 16};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f46439r = {5, 8, 10, 12};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f46440s = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f46441t = {44100, 48000, 32000};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f46442u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f46443v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f46444w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f46445x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f46446y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static void A(xd1 xd1Var) throws e0 {
        int i10 = xd1Var.i(6);
        if (i10 < 2 || i10 > 42) {
            throw e0.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i10)));
        }
        xd1Var.t(i10 * 8);
    }

    public static boolean B(int i10, l1.q qVar, boolean z10) {
        if (qVar.a() < 7) {
            if (z10) {
                return false;
            }
            throw e0.a(null, "too short header: " + qVar.a());
        }
        if (qVar.z() != i10) {
            if (z10) {
                return false;
            }
            throw e0.a(null, "expected header type " + Integer.toHexString(i10));
        }
        if (qVar.z() == 118 && qVar.z() == 111 && qVar.z() == 114 && qVar.z() == 98 && qVar.z() == 105 && qVar.z() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw e0.a(null, "expected characters 'vorbis'");
    }

    public static byte[] a(int i10, int i11) {
        int i12 = -1;
        for (int i13 = 0; i13 < 13; i13++) {
            if (i10 == f46423a[i13]) {
                i12 = i13;
            }
        }
        int i14 = -1;
        for (int i15 = 0; i15 < 16; i15++) {
            if (i11 == f46424b[i15]) {
                i14 = i15;
            }
        }
        if (i10 == -1 || i14 == -1) {
            throw new IllegalArgumentException(defpackage.e.g(i10, i11, "Invalid sample rate or number of channels: ", ", "));
        }
        return b(2, i12, i14);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        long j10 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * C.NANOS_PER_SECOND) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean d(l1.q qVar, s2 s2Var, int i10, q2 q2Var) {
        long jB = qVar.B();
        long j10 = jB >>> 16;
        if (j10 != i10) {
            return false;
        }
        boolean z10 = (j10 & 1) == 1;
        int i11 = (int) ((jB >> 12) & 15);
        int i12 = (int) ((jB >> 8) & 15);
        int i13 = (int) ((jB >> 4) & 15);
        int i14 = (int) ((jB >> 1) & 7);
        boolean z11 = (jB & 1) == 1;
        if (i13 <= 7) {
            if (i13 != s2Var.f19774g - 1) {
                return false;
            }
        } else if (i13 > 10 || s2Var.f19774g != 2) {
            return false;
        }
        if (!(i14 == 0 || i14 == s2Var.f19776i) || z11) {
            return false;
        }
        try {
            long jH = qVar.H();
            if (!z10) {
                jH *= (long) s2Var.f19769b;
            }
            long j11 = s2Var.f19777j;
            if (j11 != 0 && jH > j11) {
                return false;
            }
            q2Var.f18888a = jH;
            int iX = x(i11, qVar);
            long j12 = s2Var.f19777j;
            boolean z12 = j12 == 0 || jH + ((long) iX) >= j12;
            if (iX == -1) {
                return false;
            }
            if ((!z12 && iX < s2Var.f19768a) || iX > s2Var.f19769b) {
                return false;
            }
            int i15 = s2Var.f19772e;
            if (i12 != 0) {
                if (i12 <= 11) {
                    if (i12 != s2Var.f19773f) {
                        return false;
                    }
                } else if (i12 != 12) {
                    if (i12 > 14) {
                        return false;
                    }
                    int iG = qVar.G();
                    if (i12 == 14) {
                        iG *= 10;
                    }
                    if (iG != i15) {
                        return false;
                    }
                } else if (qVar.z() * 1000 != i15) {
                    return false;
                }
            }
            int iZ = qVar.z();
            int i16 = qVar.f44814b;
            byte[] bArr = qVar.f44813a;
            int i17 = i16 - 1;
            int i18 = 0;
            for (int i19 = qVar.f44814b; i19 < i17; i19++) {
                i18 = l1.y.l[i18 ^ (bArr[i19] & 255)];
            }
            String str = l1.y.f44830a;
            if (iZ != i18) {
                return false;
            }
            if (qVar.a() != 0) {
                int iJ = qVar.j();
                if ((iJ & 128) != 0) {
                    return false;
                }
                int i20 = (iJ & WebSocketProtocol.PAYLOAD_SHORT) >> 1;
                if ((i20 >= 2 && i20 <= 7) || (i20 >= 13 && i20 <= 31)) {
                    l1.a.j("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i20);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static void e(String str, boolean z10) throws e0 {
        if (!z10) {
            throw e0.a(null, str);
        }
    }

    public static void f(long j10, l1.q qVar, a0[] a0VarArr) {
        int i10;
        int iZ;
        while (true) {
            if (qVar.a() <= 1) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (qVar.a() == 0) {
                    i10 = -1;
                    break;
                }
                int iZ2 = qVar.z();
                i11 += iZ2;
                if (iZ2 != 255) {
                    i10 = i11;
                    break;
                }
            }
            int i12 = 0;
            do {
                if (qVar.a() == 0) {
                    i12 = -1;
                    break;
                } else {
                    iZ = qVar.z();
                    i12 += iZ;
                }
            } while (iZ == 255);
            int i13 = qVar.f44814b + i12;
            if (i12 == -1 || i12 > qVar.a()) {
                l1.a.s("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i13 = qVar.f44815c;
            } else if (i10 == 4 && i12 >= 8) {
                int iZ3 = qVar.z();
                int iG = qVar.G();
                int iM = iG == 49 ? qVar.m() : 0;
                int iZ4 = qVar.z();
                if (iG == 47) {
                    qVar.N(1);
                }
                boolean z10 = iZ3 == 181 && (iG == 49 || iG == 47) && iZ4 == 3;
                if (iG == 49) {
                    z10 &= iM == 1195456820;
                }
                if (z10) {
                    g(j10, qVar, a0VarArr);
                }
            }
            qVar.M(i13);
        }
    }

    public static void g(long j10, l1.q qVar, a0[] a0VarArr) {
        int iZ = qVar.z();
        if ((iZ & 64) != 0) {
            qVar.N(1);
            int i10 = (iZ & 31) * 3;
            int i11 = qVar.f44814b;
            for (a0 a0Var : a0VarArr) {
                qVar.M(i11);
                a0Var.g(i10, qVar);
                go.k.t(j10 != C.TIME_UNSET);
                a0Var.a(j10, 1, i10, 0, null);
            }
        }
    }

    public static int h(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0 || i10 >= 3 || i11 < 0 || i12 >= 19) {
            return -1;
        }
        int i13 = f46426d[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + f46430h[i12]) * 2;
        }
        int i14 = f46429g[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static void i(int i10, l1.q qVar) {
        qVar.J(7);
        byte[] bArr = qVar.f44813a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int j(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    public static int k(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f46441t[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f46442u[i13 - 1] : f46443v[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f46444w[i13 - 1] : f46445x[i13 - 1];
        } else {
            i15 = f46446y[i13 - 1];
        }
        if (i11 == 3) {
            return defpackage.e.D(i15, 144, i16, i17);
        }
        return defpackage.e.D(i12 == 1 ? 72 : 144, i15, i16, i17);
    }

    public static int l(int i10) {
        if (i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368) {
            return 1;
        }
        if (i10 == 1683496997 || i10 == 622876772) {
            return 2;
        }
        if (i10 == 1078008818 || i10 == -233094848) {
            return 3;
        }
        return (i10 == 1908687592 || i10 == -398277519) ? 4 : 0;
    }

    public static int m(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static xd1 n(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new xd1(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b12 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b12;
            }
        }
        xd1 xd1Var = new xd1(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            xd1 xd1Var2 = new xd1(bArrCopyOf, bArrCopyOf.length);
            while (xd1Var2.b() >= 16) {
                xd1Var2.t(2);
                int i12 = xd1Var2.i(14) & 16383;
                int iMin = Math.min(8 - xd1Var.f21845d, 14);
                int i13 = xd1Var.f21845d;
                int i14 = (8 - i13) - iMin;
                byte[] bArr2 = xd1Var.f21843b;
                int i15 = xd1Var.f21844c;
                byte b13 = (byte) (((65280 >> i13) | ((1 << i14) - 1)) & bArr2[i15]);
                bArr2[i15] = b13;
                int i16 = 14 - iMin;
                bArr2[i15] = (byte) (b13 | ((i12 >>> i16) << i14));
                int i17 = i15 + 1;
                while (i16 > 8) {
                    xd1Var.f21843b[i17] = (byte) (i12 >>> (i16 - 8));
                    i16 -= 8;
                    i17++;
                }
                int i18 = 8 - i16;
                byte[] bArr3 = xd1Var.f21843b;
                byte b14 = (byte) (bArr3[i17] & ((1 << i18) - 1));
                bArr3[i17] = b14;
                bArr3[i17] = (byte) (((i12 & ((1 << i16) - 1)) << i18) | b14);
                xd1Var.t(14);
                xd1Var.a();
            }
        }
        xd1Var.p(bArrCopyOf, bArrCopyOf.length);
        return xd1Var;
    }

    public static long o(byte b10, byte b11) {
        int i10;
        int i11;
        int i12 = b10 & 255;
        int i13 = b10 & 3;
        if (i13 != 0) {
            i10 = 2;
            if (i13 != 1 && i13 != 2) {
                i10 = b11 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i10 = 1;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = 2500 << i15;
        } else if (i14 >= 12) {
            i11 = 10000 << (i14 & 1);
        } else {
            i11 = i15 == 3 ? 60000 : 10000 << i15;
        }
        return ((long) i10) * ((long) i11);
    }

    public static int p(xd1 xd1Var) throws e0 {
        int i10 = xd1Var.i(4);
        if (i10 == 15) {
            if (xd1Var.b() >= 24) {
                return xd1Var.i(24);
            }
            throw e0.a(null, "AAC header insufficient data");
        }
        if (i10 < 13) {
            return f46423a[i10];
        }
        throw e0.a(null, "AAC header wrong Sampling Frequency Index");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0188  */
    public static ma q(xd1 xd1Var) {
        int iH;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iG = xd1Var.g();
        xd1Var.t(40);
        boolean z10 = xd1Var.i(5) > 10;
        xd1Var.q(iG);
        int[] iArr = f46428f;
        int[] iArr2 = f46426d;
        int i22 = -1;
        if (z10) {
            xd1Var.t(16);
            int i23 = xd1Var.i(2);
            if (i23 == 0) {
                i22 = 0;
            } else if (i23 == 1) {
                i22 = 1;
            } else if (i23 == 2) {
                i22 = 2;
            }
            xd1Var.t(3);
            iH = (xd1Var.i(11) + 1) * 2;
            int i24 = xd1Var.i(2);
            if (i24 == 3) {
                i16 = f46427e[xd1Var.i(2)];
                i15 = 3;
                i17 = 6;
            } else {
                i15 = xd1Var.i(2);
                int i25 = f46425c[i15];
                i16 = iArr2[i24];
                i17 = i25;
            }
            i12 = i17 * NotificationCompat.FLAG_LOCAL_ONLY;
            int i26 = (iH * i16) / (i17 * 32);
            int i27 = xd1Var.i(3);
            boolean zH = xd1Var.h();
            i11 = iArr[i27] + (zH ? 1 : 0);
            xd1Var.t(10);
            if (xd1Var.h()) {
                xd1Var.t(8);
            }
            if (i27 == 0) {
                xd1Var.t(5);
                if (xd1Var.h()) {
                    xd1Var.t(8);
                }
            }
            if (i22 == 1 && xd1Var.h()) {
                xd1Var.t(16);
            }
            if (xd1Var.h()) {
                if (i27 > 2) {
                    xd1Var.t(2);
                }
                if ((i27 & 1) == 0 || i27 <= 2) {
                    i19 = 6;
                } else {
                    i19 = 6;
                    xd1Var.t(6);
                }
                if ((i27 & 4) != 0) {
                    xd1Var.t(i19);
                }
                if (zH && xd1Var.h()) {
                    xd1Var.t(5);
                }
                if (i22 == 0) {
                    if (xd1Var.h()) {
                        i20 = 6;
                        xd1Var.t(6);
                    } else {
                        i20 = 6;
                    }
                    if (i27 == 0 && xd1Var.h()) {
                        xd1Var.t(i20);
                    }
                    if (xd1Var.h()) {
                        xd1Var.t(i20);
                    }
                    int i28 = xd1Var.i(2);
                    if (i28 == 1) {
                        xd1Var.t(5);
                        i21 = 2;
                    } else {
                        if (i28 == 2) {
                            xd1Var.t(12);
                        } else if (i28 == 3) {
                            int i29 = xd1Var.i(5);
                            if (xd1Var.h()) {
                                xd1Var.t(5);
                                if (xd1Var.h()) {
                                    xd1Var.t(4);
                                }
                                if (xd1Var.h()) {
                                    xd1Var.t(4);
                                }
                                if (xd1Var.h()) {
                                    xd1Var.t(4);
                                }
                                if (xd1Var.h()) {
                                    xd1Var.t(4);
                                }
                                if (xd1Var.h()) {
                                    xd1Var.t(4);
                                }
                                if (xd1Var.h()) {
                                    xd1Var.t(4);
                                }
                                if (xd1Var.h()) {
                                    xd1Var.t(4);
                                }
                                if (xd1Var.h()) {
                                    if (xd1Var.h()) {
                                        xd1Var.t(4);
                                    }
                                    if (xd1Var.h()) {
                                        xd1Var.t(4);
                                    }
                                }
                            }
                            if (xd1Var.h()) {
                                xd1Var.t(5);
                                if (xd1Var.h()) {
                                    xd1Var.t(7);
                                    if (xd1Var.h()) {
                                        xd1Var.t(8);
                                        i21 = 2;
                                    } else {
                                        i21 = 2;
                                    }
                                } else {
                                    i21 = 2;
                                }
                            } else {
                                i21 = 2;
                            }
                            xd1Var.t((i29 + i21) * 8);
                            xd1Var.c();
                        }
                        i21 = 2;
                    }
                    if (i27 < i21) {
                        if (xd1Var.h()) {
                            xd1Var.t(14);
                        }
                        if (i27 == 0 && xd1Var.h()) {
                            xd1Var.t(14);
                        }
                    }
                    if (xd1Var.h()) {
                        if (i15 == 0) {
                            xd1Var.t(5);
                        } else {
                            for (int i30 = 0; i30 < i17; i30++) {
                                if (xd1Var.h()) {
                                    xd1Var.t(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xd1Var.h()) {
                xd1Var.t(5);
                if (i27 == 2) {
                    xd1Var.t(4);
                }
                if (i27 >= 6) {
                    xd1Var.t(2);
                }
                if (xd1Var.h()) {
                    xd1Var.t(8);
                }
                if (i27 == 0 && xd1Var.h()) {
                    xd1Var.t(8);
                }
                if (i24 < 3) {
                    xd1Var.s();
                }
            }
            if (i22 == 0 && i15 != 3) {
                xd1Var.s();
            }
            if (i22 == 2 && (i15 == 3 || xd1Var.h())) {
                i18 = 6;
                xd1Var.t(6);
            } else {
                i18 = 6;
            }
            str = (xd1Var.h() && xd1Var.i(i18) == 1 && xd1Var.i(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i14 = i16;
            i13 = i26;
        } else {
            xd1Var.t(32);
            int i31 = xd1Var.i(2);
            String str2 = i31 == 3 ? null : MimeTypes.AUDIO_AC3;
            int i32 = xd1Var.i(6);
            int i33 = f46429g[i32 / 2] * 1000;
            iH = h(i31, i32);
            xd1Var.t(8);
            int i34 = xd1Var.i(3);
            if ((i34 & 1) == 0 || i34 == 1) {
                i10 = 2;
            } else {
                i10 = 2;
                xd1Var.t(2);
            }
            if ((i34 & 4) != 0) {
                xd1Var.t(i10);
            }
            if (i34 == i10) {
                xd1Var.t(i10);
            }
            i22 = i31 < 3 ? iArr2[i31] : -1;
            i11 = iArr[i34] + (xd1Var.h() ? 1 : 0);
            i12 = 1536;
            str = str2;
            i13 = i33;
            i14 = i22;
        }
        return new ma(str, i11, i14, iH, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    public static t0 r(xd1 xd1Var) {
        int i10;
        int i11;
        int i12 = xd1Var.i(16);
        int i13 = xd1Var.i(16);
        if (i13 == 65535) {
            i13 = xd1Var.i(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i14 = i13 + i10;
        if (i12 == 44097) {
            i14 += 2;
        }
        if (xd1Var.i(2) == 3) {
            do {
                xd1Var.i(2);
            } while (xd1Var.h());
        }
        int i15 = xd1Var.i(10);
        if (xd1Var.h() && xd1Var.i(3) > 0) {
            xd1Var.t(2);
        }
        int i16 = xd1Var.h() ? 48000 : 44100;
        int i17 = xd1Var.i(4);
        int[] iArr = f46431i;
        if (i16 == 44100 && i17 == 13) {
            i11 = iArr[i17];
        } else if (i16 != 48000 || i17 >= 14) {
            i11 = 0;
        } else {
            int i18 = iArr[i17];
            int i19 = i15 % 5;
            if (i19 == 1) {
                if (i17 != 3 || i17 == 8) {
                    i11 = i18 + 1;
                } else {
                    i11 = i18;
                }
            } else if (i19 != 2) {
                if (i19 == 3) {
                    if (i17 != 3) {
                    }
                    i11 = i18 + 1;
                } else if (i19 == 4 && (i17 == 3 || i17 == 8 || i17 == 11)) {
                    i11 = i18 + 1;
                } else {
                    i11 = i18;
                }
            } else if (i17 == 8 || i17 == 11) {
                i11 = i18 + 1;
            } else {
                i11 = i18;
            }
        }
        return new t0(i16, i14, i11, false);
    }

    public static a s(xd1 xd1Var, boolean z10) throws e0 {
        int i10 = xd1Var.i(5);
        if (i10 == 31) {
            i10 = xd1Var.i(6) + 32;
        }
        int iP = p(xd1Var);
        int i11 = xd1Var.i(4);
        String strE = l1.d.e(i10, "mp4a.40.");
        if (i10 == 5 || i10 == 29) {
            iP = p(xd1Var);
            int i12 = xd1Var.i(5);
            if (i12 == 31) {
                i12 = xd1Var.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = xd1Var.i(4);
            }
        }
        if (z10) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw e0.c("Unsupported audio object type: " + i10);
                }
            }
            if (xd1Var.h()) {
                l1.a.s("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (xd1Var.h()) {
                xd1Var.t(14);
            }
            boolean zH = xd1Var.h();
            if (i11 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i10 == 6 || i10 == 20) {
                xd1Var.t(3);
            }
            if (zH) {
                if (i10 == 22) {
                    xd1Var.t(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    xd1Var.t(3);
                }
                xd1Var.t(1);
            }
            switch (i10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i13 = xd1Var.i(2);
                    if (i13 == 2 || i13 == 3) {
                        throw e0.c("Unsupported epConfig: " + i13);
                    }
                    break;
            }
        }
        int i14 = f46424b[i11];
        if (i14 != -1) {
            return new a(iP, i14, strE);
        }
        throw e0.a(null, null);
    }

    public static void t(xd1 xd1Var, x1 x1Var) throws e0 {
        int i10 = xd1Var.i(5);
        xd1Var.t(2);
        if (xd1Var.h()) {
            xd1Var.t(5);
        }
        if (i10 >= 7 && i10 <= 10) {
            xd1Var.s();
        }
        if (xd1Var.h()) {
            int i11 = xd1Var.i(3);
            if (x1Var.f21669b == -1 && i10 >= 0 && i10 <= 15 && (i11 == 0 || i11 == 1)) {
                x1Var.f21669b = i10;
            }
            if (xd1Var.h()) {
                A(xd1Var);
            }
        }
    }

    public static void u(xd1 xd1Var, x1 x1Var) throws e0 {
        xd1Var.t(2);
        boolean zH = xd1Var.h();
        int i10 = xd1Var.i(8);
        for (int i11 = 0; i11 < i10; i11++) {
            xd1Var.t(2);
            if (xd1Var.h()) {
                xd1Var.t(5);
            }
            if (zH) {
                xd1Var.t(24);
            } else {
                if (xd1Var.h()) {
                    if (!xd1Var.h()) {
                        xd1Var.t(4);
                    }
                    x1Var.f21670c = xd1Var.i(6) + 1;
                }
                xd1Var.t(4);
            }
        }
        if (xd1Var.h()) {
            xd1Var.t(3);
            if (xd1Var.h()) {
                A(xd1Var);
            }
        }
    }

    public static int v(xd1 xd1Var, int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && xd1Var.h(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return xd1Var.i(iArr[i10]) + i12;
    }

    public static c0 w(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String str2 = l1.y.f44830a;
            String[] strArrSplit = str.split(X3.j.f27830b, 2);
            if (strArrSplit.length != 2) {
                l1.a.s("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(z2.a.d(new l1.q(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    l1.a.t("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new e3.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c0(arrayList);
    }

    public static int x(int i10, l1.q qVar) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return qVar.z() + 1;
            case 7:
                return qVar.G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i10 - 8);
            default:
                return -1;
        }
    }

    public static m5.k y(l1.q qVar) {
        qVar.N(1);
        int iC = qVar.C();
        long j10 = ((long) qVar.f44814b) + ((long) iC);
        int i10 = iC / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jT = qVar.t();
            if (jT == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jT;
            jArrCopyOf2[i11] = qVar.t();
            qVar.N(2);
        }
        qVar.N((int) (j10 - ((long) qVar.f44814b)));
        return new m5.k(3, jArrCopyOf, jArrCopyOf2);
    }

    public static od.c z(l1.q qVar, boolean z10, boolean z11) throws e0 {
        if (z10) {
            B(3, qVar, false);
        }
        qVar.x((int) qVar.q(), StandardCharsets.UTF_8);
        long jQ = qVar.q();
        String[] strArr = new String[(int) jQ];
        for (int i10 = 0; i10 < jQ; i10++) {
            strArr[i10] = qVar.x((int) qVar.q(), StandardCharsets.UTF_8);
        }
        if (z11 && (qVar.z() & 1) == 0) {
            throw e0.a(null, "framing bit expected to be set");
        }
        return new od.c(strArr, 22);
    }
}
