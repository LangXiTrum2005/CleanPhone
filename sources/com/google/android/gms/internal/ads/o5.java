package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o5 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public byte[] P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public long U;
    public long V;
    public i3 W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18119a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f18120a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18121b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public h3 f18122b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18123c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public g22 f18124c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18125d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f18126d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18131i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18132j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f18133k;
    public g3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f18134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g02 f18135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18136o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18137p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18139r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18140s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18141t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18142u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f18143v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f18144w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f18145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte[] f18146y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f18147z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0197  */
    /* JADX WARN: Code duplicated, block: B:129:0x0239 A[PHI: r1
  0x0239: PHI (r1v65 int) = (r1v54 int), (r1v58 int), (r1v62 int), (r1v67 int) binds: [B:160:0x02f8, B:134:0x0274, B:131:0x0245, B:127:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:212:0x0454 A[PHI: r15
  0x0454: PHI (r15v16 java.lang.String) = (r15v0 java.lang.String), (r15v1 java.lang.String), (r15v3 java.lang.String), (r15v5 java.lang.String) binds: [B:109:0x01b5, B:273:0x05a6, B:262:0x0571, B:260:0x0569] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:276:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:278:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:279:0x05c1 A[PHI: r2 r22
  0x05c1: PHI (r2v192 java.lang.Object) = (r2v191 java.lang.Object), (r2v232 java.lang.Object) binds: [B:275:0x05ac, B:278:0x05bd] A[DONT_GENERATE, DONT_INLINE]
  0x05c1: PHI (r22v22 java.lang.String) = (r22v21 java.lang.String), (r22v25 java.lang.String) binds: [B:275:0x05ac, B:278:0x05bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:282:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:283:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:286:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:287:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:289:0x0602  */
    /* JADX WARN: Code duplicated, block: B:291:0x0606  */
    /* JADX WARN: Code duplicated, block: B:293:0x060b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0613  */
    /* JADX WARN: Code duplicated, block: B:298:0x0618  */
    /* JADX WARN: Code duplicated, block: B:301:0x061f  */
    /* JADX WARN: Code duplicated, block: B:304:0x062d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0630 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:307:0x0632  */
    /* JADX WARN: Code duplicated, block: B:309:0x0639  */
    /* JADX WARN: Code duplicated, block: B:310:0x063b  */
    /* JADX WARN: Code duplicated, block: B:313:0x0643 A[PHI: r9 r13 r15
  0x0643: PHI (r9v27 int) = (r9v26 int), (r9v28 int), (r9v29 int) binds: [B:305:0x062e, B:314:0x0646, B:312:0x063f] A[DONT_GENERATE, DONT_INLINE]
  0x0643: PHI (r13v7 int) = (r13v6 int), (r13v15 int), (r13v6 int) binds: [B:305:0x062e, B:314:0x0646, B:312:0x063f] A[DONT_GENERATE, DONT_INLINE]
  0x0643: PHI (r15v41 int) = (r15v40 int), (r15v43 int), (r15v44 int) binds: [B:305:0x062e, B:314:0x0646, B:312:0x063f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:314:0x0646  */
    /* JADX WARN: Code duplicated, block: B:316:0x064f  */
    /* JADX WARN: Code duplicated, block: B:319:0x0656 A[PHI: r7
  0x0656: PHI (r7v51 int) = (r7v49 int), (r7v53 int) binds: [B:315:0x064d, B:317:0x0651] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:321:0x065a  */
    /* JADX WARN: Code duplicated, block: B:323:0x065e  */
    /* JADX WARN: Code duplicated, block: B:324:0x0661  */
    /* JADX WARN: Code duplicated, block: B:325:0x0664  */
    /* JADX WARN: Code duplicated, block: B:328:0x066c  */
    /* JADX WARN: Code duplicated, block: B:346:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:350:0x072f  */
    /* JADX WARN: Code duplicated, block: B:352:0x0737  */
    /* JADX WARN: Code duplicated, block: B:353:0x0744  */
    /* JADX WARN: Code duplicated, block: B:356:0x0749  */
    /* JADX WARN: Code duplicated, block: B:374:0x0795  */
    /* JADX WARN: Code duplicated, block: B:376:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:378:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:393:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:398:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:399:0x07f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.o5] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v225, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.RuntimeException] */
    public final void a(int i10) {
        byte b10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        List list;
        int iB;
        String str;
        int i17;
        int i18;
        int i19;
        int i20;
        String str2;
        List list2;
        List list3;
        Pair pair;
        Object obj;
        String str3;
        List list4;
        String str4;
        List list5;
        Object obj2;
        String str5;
        int i21;
        i12 i12Var;
        int i22;
        int i23;
        float f10;
        int i24;
        int i25;
        int i26;
        int i27;
        byte[] bArr;
        String str6;
        int iIntValue;
        int i28;
        Map map;
        int i29;
        int i30;
        int i31;
        int i32;
        String str7;
        String str8;
        tf1 tf1VarA;
        List list6;
        List list7;
        ya1 ya1Var;
        ?? r0 = this;
        String str9 = r0.f18123c;
        ?? r10 = 4;
        switch (str9) {
            case "V_MPEG4/ISO/AP":
                b10 = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b10 = 4;
                break;
            case "A_MS/ACM":
                b10 = 23;
                break;
            case "A_TRUEHD":
                b10 = 18;
                break;
            case "A_VORBIS":
                b10 = 11;
                break;
            case "A_MPEG/L2":
                b10 = 14;
                break;
            case "A_MPEG/L3":
                b10 = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b10 = 9;
                break;
            case "S_DVBSUB":
                b10 = 33;
                break;
            case "V_MPEG4/ISO/ASP":
                b10 = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b10 = 7;
                break;
            case "S_VOBSUB":
                b10 = 31;
                break;
            case "A_DTS/LOSSLESS":
                b10 = 21;
                break;
            case "A_AAC":
                b10 = 13;
                break;
            case "A_AC3":
                b10 = 16;
                break;
            case "A_DTS":
                b10 = 19;
                break;
            case "V_AV1":
                b10 = 2;
                break;
            case "V_VP8":
                b10 = 0;
                break;
            case "V_VP9":
                b10 = 1;
                break;
            case "S_HDMV/PGS":
                b10 = 32;
                break;
            case "V_THEORA":
                b10 = 10;
                break;
            case "A_DTS/EXPRESS":
                b10 = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b10 = 26;
                break;
            case "A_PCM/INT/BIG":
                b10 = 25;
                break;
            case "A_PCM/INT/LIT":
                b10 = 24;
                break;
            case "S_TEXT/ASS":
                b10 = 28;
                break;
            case "S_TEXT/SSA":
                b10 = 29;
                break;
            case "V_MPEGH/ISO/HEVC":
                b10 = 8;
                break;
            case "S_TEXT/WEBVTT":
                b10 = 30;
                break;
            case "S_TEXT/UTF8":
                b10 = 27;
                break;
            case "V_MPEG2":
                b10 = 3;
                break;
            case "A_EAC3":
                b10 = 17;
                break;
            case "A_FLAC":
                b10 = 22;
                break;
            case "A_OPUS":
                b10 = 12;
                break;
            default:
                b10 = -1;
                break;
        }
        String str10 = MimeTypes.VIDEO_UNKNOWN;
        String str11 = MimeTypes.AUDIO_UNKNOWN;
        ArrayList arrayList = null;
        Object obj3 = null;
        list = null;
        list = null;
        List list8 = null;
        List list9 = null;
        List list10 = null;
        switch (b10) {
            case 0:
                str10 = MimeTypes.VIDEO_VP8;
                str11 = str10;
                iB = -1;
                obj3 = null;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = null;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z10 = r0.Z;
                List list11 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i33 = (z10 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22 || (i30 = r0.f18140s) == i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = (r0.f18137p * i23) / (r0.f18136o * i30);
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22 && r0.C == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i34 = i12;
                    int i35 = i16;
                    if (i15 == i22 || (i15 = r0.f18138q) != i22) {
                        i25 = i15;
                    } else {
                        i25 = 8;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f || r0.G == -1.0f || r0.H == -1.0f || r0.I == -1.0f || r0.J == -1.0f || r0.K == -1.0f || r0.L == -1.0f || r0.M == -1.0f || r0.N == -1.0f || r0.O == -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        byte[] bArr2 = new byte[25];
                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                        i27 = 0;
                        byteBufferOrder.put((byte) 0);
                        byteBufferOrder.putShort((short) ((r0.F * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((r0.G * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((r0.H * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((r0.I * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((r0.J * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((r0.K * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((r0.L * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) ((r0.M * 50000.0f) + 0.5f));
                        byteBufferOrder.putShort((short) (r0.N + 0.5f));
                        byteBufferOrder.putShort((short) (r0.O + 0.5f));
                        byteBufferOrder.putShort((short) r0.D);
                        byteBufferOrder.putShort((short) r0.E);
                        bArr = bArr2;
                    }
                    lq1 lq1Var = new lq1(i24, i34, i35, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0 || Float.compare(r0.f18143v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 || Float.compare(r0.f18144w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0) {
                        i28 = iIntValue;
                    } else if (Float.compare(r0.f18145x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                        i28 = i27;
                    } else if (Float.compare(r0.f18145x, 90.0f) == 0) {
                        i28 = 90;
                    } else {
                        i28 = 180;
                        if (Float.compare(r0.f18145x, -180.0f) != 0 && Float.compare(r0.f18145x, 180.0f) != 0) {
                            if (Float.compare(r0.f18145x, -90.0f) == 0) {
                                i28 = 270;
                            } else {
                                i28 = iIntValue;
                            }
                        }
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5) && !MimeTypes.TEXT_SSA.equals(str5) && !MimeTypes.TEXT_VTT.equals(str5) && !MimeTypes.APPLICATION_VOBSUB.equals(str5) && !MimeTypes.APPLICATION_PGS.equals(str5) && !MimeTypes.APPLICATION_DVBSUBS.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null && !p5.r0.containsKey(str7)) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i33;
                i12Var.f15514q = list11;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 1:
                byte[] bArr3 = r0.f18134m;
                ya1 ya1VarU = bArr3 == null ? null : ca1.u(bArr3);
                str10 = MimeTypes.VIDEO_VP9;
                list = ya1VarU;
                list = ya1VarU;
                list9 = list;
                str11 = str10;
                iB = -1;
                obj3 = null;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z11 = r0.Z;
                List list12 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i36 = (z11 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i37 = i12;
                    int i38 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var2 = new lq1(i24, i37, i38, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var2;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i36;
                i12Var.f15514q = list12;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 2:
                byte[] bArr4 = r0.f18134m;
                str10 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                if (bArr4 == null) {
                    str11 = str10;
                    iB = -1;
                    obj3 = null;
                    i15 = -1;
                    i11 = -1;
                    i14 = -1;
                    list4 = null;
                } else {
                    ya1 ya1VarU2 = ca1.u(bArr4);
                    y1 y1VarB = y1.b(r0.f18134m);
                    if (y1VarB != null) {
                        list = ya1VarU2;
                        String str12 = (String) y1VarB.f22071e;
                        i11 = y1VarB.f22067a;
                        int i39 = y1VarB.f22069c;
                        int i40 = y1VarB.f22070d;
                        int i41 = y1VarB.f22068b;
                        i12 = i39;
                        str11 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                        i13 = -1;
                        i14 = i41;
                        obj3 = str12;
                        i15 = i11;
                        i16 = i40;
                        list6 = ya1VarU2;
                        list3 = list6;
                        iB = -1;
                        list5 = list3;
                        if (r0.P != null) {
                            obj2 = obj3;
                            tf1VarA = tf1.a(new np0(r0.P));
                            if (tf1VarA != null) {
                                obj3 = tf1VarA.f20372b;
                                str11 = "video/dolby-vision";
                                obj2 = obj3;
                            }
                        } else {
                            obj2 = obj3;
                        }
                        str5 = str11;
                        boolean z12 = r0.Z;
                        List list13 = list5;
                        if (true != r0.Y) {
                            i21 = 0;
                        } else {
                            i21 = 2;
                        }
                        int i310 = (z12 ? 1 : 0) | i21;
                        i12Var = new i12();
                        if ("audio".equals(na.i(str5))) {
                            i12Var.F = r0.Q;
                            i12Var.G = r0.S;
                            i12Var.H = r0.T;
                            i12Var.I = iB;
                        } else if (na.a(str5)) {
                            if (r0.f18141t == 0) {
                                i31 = r0.f18139r;
                                i22 = -1;
                                if (i31 == -1) {
                                    i31 = r0.f18136o;
                                }
                                r0.f18139r = i31;
                                i32 = r0.f18140s;
                                if (i32 == -1) {
                                    i32 = r0.f18137p;
                                }
                                r0.f18140s = i32;
                            } else {
                                i22 = -1;
                            }
                            i23 = r0.f18139r;
                            if (i23 != i22) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (i14 != i22) {
                                i24 = i14;
                            } else if (i16 != i22) {
                                i24 = i22;
                            } else {
                                if (i12 == i22) {
                                    i14 = r0.A;
                                    i16 = r0.B;
                                    i12 = r0.C;
                                } else {
                                    i14 = r0.A;
                                    i16 = r0.B;
                                    i12 = r0.C;
                                }
                                i24 = i14;
                            }
                            int i311 = i12;
                            int i312 = i16;
                            if (i15 == i22) {
                                i25 = i15;
                            } else {
                                i25 = i15;
                            }
                            if (i11 == i22) {
                                i29 = r0.f18138q;
                                if (i29 == i22) {
                                    i26 = 8;
                                } else {
                                    i26 = i29;
                                }
                            } else {
                                i26 = i11;
                            }
                            if (r0.F != -1.0f) {
                                i27 = 0;
                                bArr = null;
                            } else {
                                i27 = 0;
                                bArr = null;
                            }
                            lq1 lq1Var3 = new lq1(i24, i311, i312, i25, i26, bArr);
                            str6 = r0.f18121b;
                            if (str6 != null) {
                                map = p5.r0;
                                if (map.containsKey(str6)) {
                                    iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                                } else {
                                    iIntValue = i22;
                                }
                            } else {
                                iIntValue = i22;
                            }
                            if (r0.f18142u == 0) {
                                i28 = iIntValue;
                            } else {
                                i28 = iIntValue;
                            }
                            i12Var.f15518u = r0.f18136o;
                            i12Var.f15519v = r0.f18137p;
                            i12Var.A = f10;
                            i12Var.f15523z = i28;
                            i12Var.B = r0.f18146y;
                            i12Var.C = r0.f18147z;
                            i12Var.D = lq1Var3;
                        } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                            throw ab.a(null, "Unexpected MIME type.");
                        }
                        str7 = r0.f18121b;
                        if (str7 != null) {
                            i12Var.f15500b = r0.f18121b;
                        }
                        i12Var.c(i10);
                        if (true != r0.f18119a) {
                            str8 = "video/x-matroska";
                        } else {
                            str8 = "video/webm";
                        }
                        i12Var.d(str8);
                        i12Var.e(str5);
                        i12Var.f15512o = i13;
                        i12Var.f15502d = r0.f18120a0;
                        i12Var.f15503e = i310;
                        i12Var.f15514q = list13;
                        i12Var.f15508j = obj2;
                        i12Var.f15515r = r0.f18135n;
                        r0.f18124c0 = new g22(i12Var);
                        return;
                    }
                    list = ya1VarU2;
                    list9 = list;
                    str11 = str10;
                    iB = -1;
                    obj3 = null;
                    i15 = -1;
                    i11 = -1;
                    i14 = -1;
                    list4 = list9;
                }
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z13 = r0.Z;
                List list14 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i313 = (z13 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i314 = i12;
                    int i315 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var4 = new lq1(i24, i314, i315, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var4;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i313;
                i12Var.f15514q = list14;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 3:
                str10 = MimeTypes.VIDEO_MPEG2;
                str11 = str10;
                iB = -1;
                obj3 = null;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = null;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z14 = r0.Z;
                List list15 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i316 = (z14 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i317 = i12;
                    int i318 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var5 = new lq1(i24, i317, i318, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var5;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i316;
                i12Var.f15514q = list15;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr5 = r0.f18134m;
                List listSingletonList = bArr5 == null ? null : Collections.singletonList(bArr5);
                str10 = MimeTypes.VIDEO_MP4V;
                list = listSingletonList;
                list = ya1VarU2;
                list9 = list;
                str11 = str10;
                iB = -1;
                obj3 = null;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z15 = r0.Z;
                List list16 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i319 = (z15 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3110 = i12;
                    int i3111 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var6 = new lq1(i24, i3110, i3111, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var6;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i319;
                i12Var.f15514q = list16;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 7:
                z1 z1VarB = z1.b(new np0(r0.b(r0.f18123c)));
                ArrayList arrayList2 = z1VarB.f22446a;
                r0.f18126d0 = z1VarB.f22447b;
                str = z1VarB.l;
                i14 = z1VarB.f22452g;
                i17 = z1VarB.f22454i;
                i18 = z1VarB.f22453h;
                i19 = z1VarB.f22450e;
                i20 = z1VarB.f22451f;
                str2 = "video/avc";
                list2 = arrayList2;
                i12 = i18;
                str11 = str2;
                i13 = -1;
                i16 = i17;
                list3 = list2;
                obj3 = str;
                i15 = i19;
                i11 = i20;
                iB = -1;
                list5 = list3;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z16 = r0.Z;
                List list17 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i3112 = (z16 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3113 = i12;
                    int i3114 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var7 = new lq1(i24, i3113, i3114, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var7;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i3112;
                i12Var.f15514q = list17;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 8:
                w2 w2VarB = w2.b(new np0(r0.b(r0.f18123c)), false, null);
                List list18 = w2VarB.f21376a;
                r0.f18126d0 = w2VarB.f21377b;
                str = w2VarB.f21388n;
                i14 = w2VarB.f21383h;
                i17 = w2VarB.f21385j;
                i18 = w2VarB.f21384i;
                i19 = w2VarB.f21381f;
                i20 = w2VarB.f21382g;
                str2 = "video/hevc";
                list2 = list18;
                i12 = i18;
                str11 = str2;
                i13 = -1;
                i16 = i17;
                list3 = list2;
                obj3 = str;
                i15 = i19;
                i11 = i20;
                iB = -1;
                list5 = list3;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z17 = r0.Z;
                List list19 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i3115 = (z17 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3116 = i12;
                    int i3117 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var8 = new lq1(i24, i3116, i3117, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var8;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i3115;
                i12Var.f15514q = list19;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 9:
                np0 np0Var = new np0(r0.b(r0.f18123c));
                try {
                    np0Var.G(16);
                    long jA = np0Var.a();
                    try {
                        if (jA == 1482049860) {
                            pair = new Pair("video/divx", null);
                        } else {
                            if (jA != 859189832) {
                                if (jA == 826496599) {
                                    int i42 = np0Var.f17881b + 20;
                                    byte[] bArr6 = np0Var.f17880a;
                                    while (true) {
                                        int length = bArr6.length;
                                        if (i42 >= length - 4) {
                                            throw ab.a(null, "Failed to find FourCC VC1 initialization data");
                                        }
                                        int i43 = i42 + 1;
                                        if (bArr6[i42] == 0 && bArr6[i43] == 0 && bArr6[i42 + 2] == 1) {
                                            if (bArr6[i42 + 3] == 15) {
                                                pair = new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr6, i42, length)));
                                            }
                                        }
                                        i42 = i43;
                                    }
                                } else {
                                    v71.y("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                    obj = null;
                                    pair = new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                                }
                                str3 = (String) pair.first;
                                list10 = (List) pair.second;
                                obj3 = obj;
                                str11 = str3;
                                list8 = list10;
                                iB = -1;
                                list9 = list8;
                                i15 = -1;
                                i11 = -1;
                                i14 = -1;
                                list4 = list9;
                                i12 = -1;
                                i16 = -1;
                                i13 = -1;
                                list5 = list4;
                                if (r0.P != null) {
                                    obj2 = obj3;
                                    tf1VarA = tf1.a(new np0(r0.P));
                                    if (tf1VarA != null) {
                                        obj3 = tf1VarA.f20372b;
                                        str11 = "video/dolby-vision";
                                        obj2 = obj3;
                                    }
                                } else {
                                    obj2 = obj3;
                                }
                                str5 = str11;
                                boolean z18 = r0.Z;
                                List list110 = list5;
                                if (true != r0.Y) {
                                    i21 = 0;
                                } else {
                                    i21 = 2;
                                }
                                int i3118 = (z18 ? 1 : 0) | i21;
                                i12Var = new i12();
                                if ("audio".equals(na.i(str5))) {
                                    i12Var.F = r0.Q;
                                    i12Var.G = r0.S;
                                    i12Var.H = r0.T;
                                    i12Var.I = iB;
                                } else if (na.a(str5)) {
                                    if (r0.f18141t == 0) {
                                        i31 = r0.f18139r;
                                        i22 = -1;
                                        if (i31 == -1) {
                                            i31 = r0.f18136o;
                                        }
                                        r0.f18139r = i31;
                                        i32 = r0.f18140s;
                                        if (i32 == -1) {
                                            i32 = r0.f18137p;
                                        }
                                        r0.f18140s = i32;
                                    } else {
                                        i22 = -1;
                                    }
                                    i23 = r0.f18139r;
                                    if (i23 != i22) {
                                        f10 = -1.0f;
                                    } else {
                                        f10 = -1.0f;
                                    }
                                    if (i14 != i22) {
                                        i24 = i14;
                                    } else if (i16 != i22) {
                                        i24 = i22;
                                    } else {
                                        if (i12 == i22) {
                                            i14 = r0.A;
                                            i16 = r0.B;
                                            i12 = r0.C;
                                        } else {
                                            i14 = r0.A;
                                            i16 = r0.B;
                                            i12 = r0.C;
                                        }
                                        i24 = i14;
                                    }
                                    int i3119 = i12;
                                    int i31110 = i16;
                                    if (i15 == i22) {
                                        i25 = i15;
                                    } else {
                                        i25 = i15;
                                    }
                                    if (i11 == i22) {
                                        i29 = r0.f18138q;
                                        if (i29 == i22) {
                                            i26 = 8;
                                        } else {
                                            i26 = i29;
                                        }
                                    } else {
                                        i26 = i11;
                                    }
                                    if (r0.F != -1.0f) {
                                        i27 = 0;
                                        bArr = null;
                                    } else {
                                        i27 = 0;
                                        bArr = null;
                                    }
                                    lq1 lq1Var9 = new lq1(i24, i3119, i31110, i25, i26, bArr);
                                    str6 = r0.f18121b;
                                    if (str6 != null) {
                                        map = p5.r0;
                                        if (map.containsKey(str6)) {
                                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                                        } else {
                                            iIntValue = i22;
                                        }
                                    } else {
                                        iIntValue = i22;
                                    }
                                    if (r0.f18142u == 0) {
                                        i28 = iIntValue;
                                    } else {
                                        i28 = iIntValue;
                                    }
                                    i12Var.f15518u = r0.f18136o;
                                    i12Var.f15519v = r0.f18137p;
                                    i12Var.A = f10;
                                    i12Var.f15523z = i28;
                                    i12Var.B = r0.f18146y;
                                    i12Var.C = r0.f18147z;
                                    i12Var.D = lq1Var9;
                                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                                    throw ab.a(null, "Unexpected MIME type.");
                                }
                                str7 = r0.f18121b;
                                if (str7 != null) {
                                    i12Var.f15500b = r0.f18121b;
                                }
                                i12Var.c(i10);
                                if (true != r0.f18119a) {
                                    str8 = "video/x-matroska";
                                } else {
                                    str8 = "video/webm";
                                }
                                i12Var.d(str8);
                                i12Var.e(str5);
                                i12Var.f15512o = i13;
                                i12Var.f15502d = r0.f18120a0;
                                i12Var.f15503e = i3118;
                                i12Var.f15514q = list110;
                                i12Var.f15508j = obj2;
                                i12Var.f15515r = r0.f18135n;
                                r0.f18124c0 = new g22(i12Var);
                                return;
                            }
                            pair = new Pair(MimeTypes.VIDEO_H263, null);
                        }
                        obj = null;
                        str3 = (String) pair.first;
                        list10 = (List) pair.second;
                        obj3 = obj;
                        str11 = str3;
                        list8 = list10;
                        iB = -1;
                        list9 = list8;
                        i15 = -1;
                        i11 = -1;
                        i14 = -1;
                        list4 = list9;
                        i12 = -1;
                        i16 = -1;
                        i13 = -1;
                        list5 = list4;
                        if (r0.P != null) {
                            obj2 = obj3;
                            tf1VarA = tf1.a(new np0(r0.P));
                            if (tf1VarA != null) {
                                obj3 = tf1VarA.f20372b;
                                str11 = "video/dolby-vision";
                                obj2 = obj3;
                            }
                        } else {
                            obj2 = obj3;
                        }
                        str5 = str11;
                        boolean z19 = r0.Z;
                        List list111 = list5;
                        if (true != r0.Y) {
                            i21 = 0;
                        } else {
                            i21 = 2;
                        }
                        int i31111 = (z19 ? 1 : 0) | i21;
                        i12Var = new i12();
                        if ("audio".equals(na.i(str5))) {
                            i12Var.F = r0.Q;
                            i12Var.G = r0.S;
                            i12Var.H = r0.T;
                            i12Var.I = iB;
                        } else if (na.a(str5)) {
                            if (r0.f18141t == 0) {
                                i31 = r0.f18139r;
                                i22 = -1;
                                if (i31 == -1) {
                                    i31 = r0.f18136o;
                                }
                                r0.f18139r = i31;
                                i32 = r0.f18140s;
                                if (i32 == -1) {
                                    i32 = r0.f18137p;
                                }
                                r0.f18140s = i32;
                            } else {
                                i22 = -1;
                            }
                            i23 = r0.f18139r;
                            if (i23 != i22) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (i14 != i22) {
                                i24 = i14;
                            } else if (i16 != i22) {
                                i24 = i22;
                            } else {
                                if (i12 == i22) {
                                    i14 = r0.A;
                                    i16 = r0.B;
                                    i12 = r0.C;
                                } else {
                                    i14 = r0.A;
                                    i16 = r0.B;
                                    i12 = r0.C;
                                }
                                i24 = i14;
                            }
                            int i31112 = i12;
                            int i31113 = i16;
                            if (i15 == i22) {
                                i25 = i15;
                            } else {
                                i25 = i15;
                            }
                            if (i11 == i22) {
                                i29 = r0.f18138q;
                                if (i29 == i22) {
                                    i26 = 8;
                                } else {
                                    i26 = i29;
                                }
                            } else {
                                i26 = i11;
                            }
                            if (r0.F != -1.0f) {
                                i27 = 0;
                                bArr = null;
                            } else {
                                i27 = 0;
                                bArr = null;
                            }
                            lq1 lq1Var10 = new lq1(i24, i31112, i31113, i25, i26, bArr);
                            str6 = r0.f18121b;
                            if (str6 != null) {
                                map = p5.r0;
                                if (map.containsKey(str6)) {
                                    iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                                } else {
                                    iIntValue = i22;
                                }
                            } else {
                                iIntValue = i22;
                            }
                            if (r0.f18142u == 0) {
                                i28 = iIntValue;
                            } else {
                                i28 = iIntValue;
                            }
                            i12Var.f15518u = r0.f18136o;
                            i12Var.f15519v = r0.f18137p;
                            i12Var.A = f10;
                            i12Var.f15523z = i28;
                            i12Var.B = r0.f18146y;
                            i12Var.C = r0.f18147z;
                            i12Var.D = lq1Var10;
                        } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                            throw ab.a(null, "Unexpected MIME type.");
                        }
                        str7 = r0.f18121b;
                        if (str7 != null) {
                            i12Var.f15500b = r0.f18121b;
                        }
                        i12Var.c(i10);
                        if (true != r0.f18119a) {
                            str8 = "video/x-matroska";
                        } else {
                            str8 = "video/webm";
                        }
                        i12Var.d(str8);
                        i12Var.e(str5);
                        i12Var.f15512o = i13;
                        i12Var.f15502d = r0.f18120a0;
                        i12Var.f15503e = i31111;
                        i12Var.f15514q = list111;
                        i12Var.f15508j = obj2;
                        i12Var.f15515r = r0.f18135n;
                        r0.f18124c0 = new g22(i12Var);
                        return;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw ab.a(r10, "Error parsing FourCC private data");
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    r10 = 0;
                }
                break;
            case 10:
                str11 = str10;
                iB = -1;
                obj3 = null;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = null;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z110 = r0.Z;
                List list112 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i31114 = (z110 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i31115 = i12;
                    int i31116 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var11 = new lq1(i24, i31115, i31116, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var11;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i31114;
                i12Var.f15514q = list112;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 11:
                byte[] bArrB = r0.b(str9);
                try {
                    try {
                        if (bArrB[0] != 2) {
                            throw ab.a(null, "Error parsing vorbis codec private");
                        }
                        int i44 = 1;
                        int i45 = 0;
                        while (true) {
                            int i46 = bArrB[i44];
                            i44++;
                            int i47 = i46 & 255;
                            if (i47 == 255) {
                                i45 += 255;
                            } else {
                                int i48 = i45 + i47;
                                int i49 = 0;
                                while (true) {
                                    try {
                                        int i50 = bArrB[i44];
                                        i44++;
                                        int i51 = i50 & 255;
                                        if (i51 != 255) {
                                            int i52 = i49 + i51;
                                            if (bArrB[i44] != 1) {
                                                throw ab.a(null, "Error parsing vorbis codec private");
                                            }
                                            byte[] bArr7 = new byte[i48];
                                            System.arraycopy(bArrB, i44, bArr7, 0, i48);
                                            int i53 = i44 + i48;
                                            if (bArrB[i53] != 3) {
                                                throw ab.a(null, "Error parsing vorbis codec private");
                                            }
                                            int i54 = i53 + i52;
                                            if (bArrB[i54] != 5) {
                                                throw ab.a(null, "Error parsing vorbis codec private");
                                            }
                                            int length2 = bArrB.length - i54;
                                            byte[] bArr8 = new byte[length2];
                                            System.arraycopy(bArrB, i54, bArr8, 0, length2);
                                            ArrayList arrayList3 = new ArrayList(2);
                                            arrayList3.add(bArr7);
                                            arrayList3.add(bArr8);
                                            arrayList = arrayList3;
                                            i13 = 8192;
                                            str11 = MimeTypes.AUDIO_VORBIS;
                                            iB = -1;
                                            obj3 = null;
                                            i15 = -1;
                                            i11 = -1;
                                            i14 = -1;
                                            i12 = -1;
                                            i16 = -1;
                                            list5 = arrayList;
                                            if (r0.P != null) {
                                                obj2 = obj3;
                                                tf1VarA = tf1.a(new np0(r0.P));
                                                if (tf1VarA != null) {
                                                    obj3 = tf1VarA.f20372b;
                                                    str11 = "video/dolby-vision";
                                                    obj2 = obj3;
                                                }
                                            } else {
                                                obj2 = obj3;
                                            }
                                            str5 = str11;
                                            boolean z111 = r0.Z;
                                            List list113 = list5;
                                            if (true != r0.Y) {
                                                i21 = 0;
                                            } else {
                                                i21 = 2;
                                            }
                                            int i31117 = (z111 ? 1 : 0) | i21;
                                            i12Var = new i12();
                                            if ("audio".equals(na.i(str5))) {
                                                i12Var.F = r0.Q;
                                                i12Var.G = r0.S;
                                                i12Var.H = r0.T;
                                                i12Var.I = iB;
                                            } else if (na.a(str5)) {
                                                if (r0.f18141t == 0) {
                                                    i31 = r0.f18139r;
                                                    i22 = -1;
                                                    if (i31 == -1) {
                                                        i31 = r0.f18136o;
                                                    }
                                                    r0.f18139r = i31;
                                                    i32 = r0.f18140s;
                                                    if (i32 == -1) {
                                                        i32 = r0.f18137p;
                                                    }
                                                    r0.f18140s = i32;
                                                } else {
                                                    i22 = -1;
                                                }
                                                i23 = r0.f18139r;
                                                if (i23 != i22) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (i14 != i22) {
                                                    i24 = i14;
                                                } else if (i16 != i22) {
                                                    i24 = i22;
                                                } else {
                                                    if (i12 == i22) {
                                                        i14 = r0.A;
                                                        i16 = r0.B;
                                                        i12 = r0.C;
                                                    } else {
                                                        i14 = r0.A;
                                                        i16 = r0.B;
                                                        i12 = r0.C;
                                                    }
                                                    i24 = i14;
                                                }
                                                int i31118 = i12;
                                                int i31119 = i16;
                                                if (i15 == i22) {
                                                    i25 = i15;
                                                } else {
                                                    i25 = i15;
                                                }
                                                if (i11 == i22) {
                                                    i29 = r0.f18138q;
                                                    if (i29 == i22) {
                                                        i26 = 8;
                                                    } else {
                                                        i26 = i29;
                                                    }
                                                } else {
                                                    i26 = i11;
                                                }
                                                if (r0.F != -1.0f) {
                                                    i27 = 0;
                                                    bArr = null;
                                                } else {
                                                    i27 = 0;
                                                    bArr = null;
                                                }
                                                lq1 lq1Var12 = new lq1(i24, i31118, i31119, i25, i26, bArr);
                                                str6 = r0.f18121b;
                                                if (str6 != null) {
                                                    map = p5.r0;
                                                    if (map.containsKey(str6)) {
                                                        iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                                                    } else {
                                                        iIntValue = i22;
                                                    }
                                                } else {
                                                    iIntValue = i22;
                                                }
                                                if (r0.f18142u == 0) {
                                                    i28 = iIntValue;
                                                } else {
                                                    i28 = iIntValue;
                                                }
                                                i12Var.f15518u = r0.f18136o;
                                                i12Var.f15519v = r0.f18137p;
                                                i12Var.A = f10;
                                                i12Var.f15523z = i28;
                                                i12Var.B = r0.f18146y;
                                                i12Var.C = r0.f18147z;
                                                i12Var.D = lq1Var12;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                                                throw ab.a(null, "Unexpected MIME type.");
                                            }
                                            str7 = r0.f18121b;
                                            if (str7 != null) {
                                                i12Var.f15500b = r0.f18121b;
                                            }
                                            i12Var.c(i10);
                                            if (true != r0.f18119a) {
                                                str8 = "video/x-matroska";
                                            } else {
                                                str8 = "video/webm";
                                            }
                                            i12Var.d(str8);
                                            i12Var.e(str5);
                                            i12Var.f15512o = i13;
                                            i12Var.f15502d = r0.f18120a0;
                                            i12Var.f15503e = i31117;
                                            i12Var.f15514q = list113;
                                            i12Var.f15508j = obj2;
                                            i12Var.f15515r = r0.f18135n;
                                            r0.f18124c0 = new g22(i12Var);
                                            return;
                                        }
                                        i49 += 255;
                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                        r0 = 0;
                                    }
                                }
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException unused4) {
                    }
                } catch (ArrayIndexOutOfBoundsException unused5) {
                    r0 = 0;
                }
                throw ab.a(r0, "Error parsing vorbis codec private");
            case 12:
                ArrayList arrayList4 = new ArrayList(3);
                arrayList4.add(r0.b(r0.f18123c));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(r0.U).array());
                arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r0.V).array());
                obj3 = null;
                str11 = MimeTypes.AUDIO_OPUS;
                i13 = 5760;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                i12 = -1;
                i16 = -1;
                list6 = arrayList4;
                list3 = list6;
                iB = -1;
                list5 = list3;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z112 = r0.Z;
                List list114 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i311110 = (z112 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i311111 = i12;
                    int i311112 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var13 = new lq1(i24, i311111, i311112, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var13;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i311110;
                i12Var.f15514q = list114;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(r0.b(str9));
                byte[] bArr9 = r0.f18134m;
                v1 v1VarP = dv.p(new gp0(bArr9, bArr9.length), false);
                r0.T = v1VarP.f20994b;
                r0.Q = v1VarP.f20995c;
                obj3 = v1VarP.f20993a;
                str3 = MimeTypes.AUDIO_AAC;
                list10 = listSingletonList2;
                str11 = str3;
                list8 = list10;
                iB = -1;
                list9 = list8;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z113 = r0.Z;
                List list115 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i311113 = (z113 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i311114 = i12;
                    int i311115 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var14 = new lq1(i24, i311114, i311115, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var14;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i311113;
                i12Var.f15514q = list115;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 14:
                str4 = MimeTypes.AUDIO_MPEG_L2;
                obj3 = null;
                str11 = str4;
                i13 = 4096;
                iB = -1;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                i12 = -1;
                i16 = -1;
                list5 = arrayList;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z114 = r0.Z;
                List list116 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i311116 = (z114 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i311117 = i12;
                    int i311118 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var15 = new lq1(i24, i311117, i311118, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var15;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i311116;
                i12Var.f15514q = list116;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 15:
                str4 = MimeTypes.AUDIO_MPEG;
                obj3 = null;
                str11 = str4;
                i13 = 4096;
                iB = -1;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                i12 = -1;
                i16 = -1;
                list5 = arrayList;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z115 = r0.Z;
                List list117 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i311119 = (z115 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3111110 = i12;
                    int i3111111 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var16 = new lq1(i24, i3111110, i3111111, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var16;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i311119;
                i12Var.f15514q = list117;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 16:
                str3 = MimeTypes.AUDIO_AC3;
                obj3 = null;
                str11 = str3;
                list8 = list10;
                iB = -1;
                list9 = list8;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z116 = r0.Z;
                List list118 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i3111112 = (z116 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3111113 = i12;
                    int i3111114 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var17 = new lq1(i24, i3111113, i3111114, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var17;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i3111112;
                i12Var.f15514q = list118;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 17:
                str3 = MimeTypes.AUDIO_E_AC3;
                obj3 = null;
                str11 = str3;
                list8 = list10;
                iB = -1;
                list9 = list8;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z117 = r0.Z;
                List list119 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i3111115 = (z117 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3111116 = i12;
                    int i3111117 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var18 = new lq1(i24, i3111116, i3111117, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var18;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i3111115;
                i12Var.f15514q = list119;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 18:
                r0.W = new i3(0);
                str3 = MimeTypes.AUDIO_TRUEHD;
                obj3 = null;
                str11 = str3;
                list8 = list10;
                iB = -1;
                list9 = list8;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z118 = r0.Z;
                List list1110 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i3111118 = (z118 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3111119 = i12;
                    int i31111110 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var19 = new lq1(i24, i3111119, i31111110, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var19;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i3111118;
                i12Var.f15514q = list1110;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 19:
            case 20:
                r0.X = true;
                str3 = MimeTypes.AUDIO_DTS;
                obj3 = null;
                str11 = str3;
                list8 = list10;
                iB = -1;
                list9 = list8;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z119 = r0.Z;
                List list1111 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i31111111 = (z119 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i31111112 = i12;
                    int i31111113 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var110 = new lq1(i24, i31111112, i31111113, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var110;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i31111111;
                i12Var.f15514q = list1111;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 21:
                str3 = MimeTypes.AUDIO_DTS_HD;
                obj3 = null;
                str11 = str3;
                list8 = list10;
                iB = -1;
                list9 = list8;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1110 = r0.Z;
                List list1112 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i31111114 = (z1110 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i31111115 = i12;
                    int i31111116 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var111 = new lq1(i24, i31111115, i31111116, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var111;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i31111114;
                i12Var.f15514q = list1112;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 22:
                List listSingletonList3 = Collections.singletonList(r0.b(str9));
                str11 = MimeTypes.AUDIO_FLAC;
                list7 = listSingletonList3;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list6 = list7;
                list3 = list6;
                iB = -1;
                list5 = list3;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1111 = r0.Z;
                List list1113 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i31111117 = (z1111 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i31111118 = i12;
                    int i31111119 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var112 = new lq1(i24, i31111118, i31111119, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var112;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i31111117;
                i12Var.f15514q = list1113;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 23:
                np0 np0Var2 = new np0(r0.b(r0.f18123c));
                try {
                    int iM = np0Var2.M();
                    if (iM != 1) {
                        if (iM == 65534) {
                            np0Var2.E(20);
                            int i55 = np0Var2.i();
                            if ((i55 >> 18) == 0 && (i55 == 0 || Integer.bitCount(i55) == r0.Q)) {
                                r0.S = i55 == 0 ? -1 : i55 << 2;
                            }
                            long jD = np0Var2.d();
                            UUID uuid = p5.f18492q0;
                            if (jD != uuid.getMostSignificantBits() || np0Var2.d() != uuid.getLeastSignificantBits()) {
                            }
                            obj3 = null;
                            iB = -1;
                            list9 = list8;
                            i15 = -1;
                            i11 = -1;
                            i14 = -1;
                            list4 = list9;
                            i12 = -1;
                            i16 = -1;
                            i13 = -1;
                            list5 = list4;
                            if (r0.P != null) {
                                obj2 = obj3;
                                tf1VarA = tf1.a(new np0(r0.P));
                                if (tf1VarA != null) {
                                    obj3 = tf1VarA.f20372b;
                                    str11 = "video/dolby-vision";
                                    obj2 = obj3;
                                }
                            } else {
                                obj2 = obj3;
                            }
                            str5 = str11;
                            boolean z1112 = r0.Z;
                            List list1114 = list5;
                            if (true != r0.Y) {
                                i21 = 0;
                            } else {
                                i21 = 2;
                            }
                            int i311111110 = (z1112 ? 1 : 0) | i21;
                            i12Var = new i12();
                            if ("audio".equals(na.i(str5))) {
                                i12Var.F = r0.Q;
                                i12Var.G = r0.S;
                                i12Var.H = r0.T;
                                i12Var.I = iB;
                            } else if (na.a(str5)) {
                                if (r0.f18141t == 0) {
                                    i31 = r0.f18139r;
                                    i22 = -1;
                                    if (i31 == -1) {
                                        i31 = r0.f18136o;
                                    }
                                    r0.f18139r = i31;
                                    i32 = r0.f18140s;
                                    if (i32 == -1) {
                                        i32 = r0.f18137p;
                                    }
                                    r0.f18140s = i32;
                                } else {
                                    i22 = -1;
                                }
                                i23 = r0.f18139r;
                                if (i23 != i22) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (i14 != i22) {
                                    i24 = i14;
                                } else if (i16 != i22) {
                                    i24 = i22;
                                } else {
                                    if (i12 == i22) {
                                        i14 = r0.A;
                                        i16 = r0.B;
                                        i12 = r0.C;
                                    } else {
                                        i14 = r0.A;
                                        i16 = r0.B;
                                        i12 = r0.C;
                                    }
                                    i24 = i14;
                                }
                                int i311111111 = i12;
                                int i311111112 = i16;
                                if (i15 == i22) {
                                    i25 = i15;
                                } else {
                                    i25 = i15;
                                }
                                if (i11 == i22) {
                                    i29 = r0.f18138q;
                                    if (i29 == i22) {
                                        i26 = 8;
                                    } else {
                                        i26 = i29;
                                    }
                                } else {
                                    i26 = i11;
                                }
                                if (r0.F != -1.0f) {
                                    i27 = 0;
                                    bArr = null;
                                } else {
                                    i27 = 0;
                                    bArr = null;
                                }
                                lq1 lq1Var113 = new lq1(i24, i311111111, i311111112, i25, i26, bArr);
                                str6 = r0.f18121b;
                                if (str6 != null) {
                                    map = p5.r0;
                                    if (map.containsKey(str6)) {
                                        iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                                    } else {
                                        iIntValue = i22;
                                    }
                                } else {
                                    iIntValue = i22;
                                }
                                if (r0.f18142u == 0) {
                                    i28 = iIntValue;
                                } else {
                                    i28 = iIntValue;
                                }
                                i12Var.f15518u = r0.f18136o;
                                i12Var.f15519v = r0.f18137p;
                                i12Var.A = f10;
                                i12Var.f15523z = i28;
                                i12Var.B = r0.f18146y;
                                i12Var.C = r0.f18147z;
                                i12Var.D = lq1Var113;
                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                                throw ab.a(null, "Unexpected MIME type.");
                            }
                            str7 = r0.f18121b;
                            if (str7 != null) {
                                i12Var.f15500b = r0.f18121b;
                            }
                            i12Var.c(i10);
                            if (true != r0.f18119a) {
                                str8 = "video/x-matroska";
                            } else {
                                str8 = "video/webm";
                            }
                            i12Var.d(str8);
                            i12Var.e(str5);
                            i12Var.f15512o = i13;
                            i12Var.f15502d = r0.f18120a0;
                            i12Var.f15503e = i311111110;
                            i12Var.f15514q = list1114;
                            i12Var.f15508j = obj2;
                            i12Var.f15515r = r0.f18135n;
                            r0.f18124c0 = new g22(i12Var);
                            return;
                        }
                        v71.y("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        obj3 = null;
                        iB = -1;
                        list9 = list8;
                        i15 = -1;
                        i11 = -1;
                        i14 = -1;
                        list4 = list9;
                        i12 = -1;
                        i16 = -1;
                        i13 = -1;
                        list5 = list4;
                        if (r0.P != null) {
                            obj2 = obj3;
                            tf1VarA = tf1.a(new np0(r0.P));
                            if (tf1VarA != null) {
                                obj3 = tf1VarA.f20372b;
                                str11 = "video/dolby-vision";
                                obj2 = obj3;
                            }
                        } else {
                            obj2 = obj3;
                        }
                        str5 = str11;
                        boolean z1113 = r0.Z;
                        List list1115 = list5;
                        if (true != r0.Y) {
                            i21 = 0;
                        } else {
                            i21 = 2;
                        }
                        int i311111113 = (z1113 ? 1 : 0) | i21;
                        i12Var = new i12();
                        if ("audio".equals(na.i(str5))) {
                            i12Var.F = r0.Q;
                            i12Var.G = r0.S;
                            i12Var.H = r0.T;
                            i12Var.I = iB;
                        } else if (na.a(str5)) {
                            if (r0.f18141t == 0) {
                                i31 = r0.f18139r;
                                i22 = -1;
                                if (i31 == -1) {
                                    i31 = r0.f18136o;
                                }
                                r0.f18139r = i31;
                                i32 = r0.f18140s;
                                if (i32 == -1) {
                                    i32 = r0.f18137p;
                                }
                                r0.f18140s = i32;
                            } else {
                                i22 = -1;
                            }
                            i23 = r0.f18139r;
                            if (i23 != i22) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (i14 != i22) {
                                i24 = i14;
                            } else if (i16 != i22) {
                                i24 = i22;
                            } else {
                                if (i12 == i22) {
                                    i14 = r0.A;
                                    i16 = r0.B;
                                    i12 = r0.C;
                                } else {
                                    i14 = r0.A;
                                    i16 = r0.B;
                                    i12 = r0.C;
                                }
                                i24 = i14;
                            }
                            int i311111114 = i12;
                            int i311111115 = i16;
                            if (i15 == i22) {
                                i25 = i15;
                            } else {
                                i25 = i15;
                            }
                            if (i11 == i22) {
                                i29 = r0.f18138q;
                                if (i29 == i22) {
                                    i26 = 8;
                                } else {
                                    i26 = i29;
                                }
                            } else {
                                i26 = i11;
                            }
                            if (r0.F != -1.0f) {
                                i27 = 0;
                                bArr = null;
                            } else {
                                i27 = 0;
                                bArr = null;
                            }
                            lq1 lq1Var114 = new lq1(i24, i311111114, i311111115, i25, i26, bArr);
                            str6 = r0.f18121b;
                            if (str6 != null) {
                                map = p5.r0;
                                if (map.containsKey(str6)) {
                                    iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                                } else {
                                    iIntValue = i22;
                                }
                            } else {
                                iIntValue = i22;
                            }
                            if (r0.f18142u == 0) {
                                i28 = iIntValue;
                            } else {
                                i28 = iIntValue;
                            }
                            i12Var.f15518u = r0.f18136o;
                            i12Var.f15519v = r0.f18137p;
                            i12Var.A = f10;
                            i12Var.f15523z = i28;
                            i12Var.B = r0.f18146y;
                            i12Var.C = r0.f18147z;
                            i12Var.D = lq1Var114;
                        } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                            throw ab.a(null, "Unexpected MIME type.");
                        }
                        str7 = r0.f18121b;
                        if (str7 != null) {
                            i12Var.f15500b = r0.f18121b;
                        }
                        i12Var.c(i10);
                        if (true != r0.f18119a) {
                            str8 = "video/x-matroska";
                        } else {
                            str8 = "video/webm";
                        }
                        i12Var.d(str8);
                        i12Var.e(str5);
                        i12Var.f15512o = i13;
                        i12Var.f15502d = r0.f18120a0;
                        i12Var.f15503e = i311111113;
                        i12Var.f15514q = list1115;
                        i12Var.f15508j = obj2;
                        i12Var.f15515r = r0.f18135n;
                        r0.f18124c0 = new g22(i12Var);
                        return;
                    }
                    iB = uu0.b(r0.R, ByteOrder.LITTLE_ENDIAN);
                    if (iB == 0) {
                        int i56 = r0.R;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i56).length() + 64);
                        sb2.append("Unsupported PCM bit depth: ");
                        sb2.append(i56);
                        sb2.append(". Setting mimeType to audio/x-unknown");
                        v71.y("MatroskaExtractor", sb2.toString());
                        obj3 = null;
                        iB = -1;
                        list9 = list8;
                    } else {
                        obj3 = null;
                        str11 = MimeTypes.AUDIO_RAW;
                    }
                    i15 = -1;
                    i11 = -1;
                    i14 = -1;
                    list4 = list9;
                    i12 = -1;
                    i16 = -1;
                    i13 = -1;
                    list5 = list4;
                    if (r0.P != null) {
                        obj2 = obj3;
                        tf1VarA = tf1.a(new np0(r0.P));
                        if (tf1VarA != null) {
                            obj3 = tf1VarA.f20372b;
                            str11 = "video/dolby-vision";
                            obj2 = obj3;
                        }
                    } else {
                        obj2 = obj3;
                    }
                    str5 = str11;
                    boolean z1114 = r0.Z;
                    List list1116 = list5;
                    if (true != r0.Y) {
                        i21 = 0;
                    } else {
                        i21 = 2;
                    }
                    int i311111116 = (z1114 ? 1 : 0) | i21;
                    i12Var = new i12();
                    if ("audio".equals(na.i(str5))) {
                        i12Var.F = r0.Q;
                        i12Var.G = r0.S;
                        i12Var.H = r0.T;
                        i12Var.I = iB;
                    } else if (na.a(str5)) {
                        if (r0.f18141t == 0) {
                            i31 = r0.f18139r;
                            i22 = -1;
                            if (i31 == -1) {
                                i31 = r0.f18136o;
                            }
                            r0.f18139r = i31;
                            i32 = r0.f18140s;
                            if (i32 == -1) {
                                i32 = r0.f18137p;
                            }
                            r0.f18140s = i32;
                        } else {
                            i22 = -1;
                        }
                        i23 = r0.f18139r;
                        if (i23 != i22) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (i14 != i22) {
                            i24 = i14;
                        } else if (i16 != i22) {
                            i24 = i22;
                        } else {
                            if (i12 == i22) {
                                i14 = r0.A;
                                i16 = r0.B;
                                i12 = r0.C;
                            } else {
                                i14 = r0.A;
                                i16 = r0.B;
                                i12 = r0.C;
                            }
                            i24 = i14;
                        }
                        int i311111117 = i12;
                        int i311111118 = i16;
                        if (i15 == i22) {
                            i25 = i15;
                        } else {
                            i25 = i15;
                        }
                        if (i11 == i22) {
                            i29 = r0.f18138q;
                            if (i29 == i22) {
                                i26 = 8;
                            } else {
                                i26 = i29;
                            }
                        } else {
                            i26 = i11;
                        }
                        if (r0.F != -1.0f) {
                            i27 = 0;
                            bArr = null;
                        } else {
                            i27 = 0;
                            bArr = null;
                        }
                        lq1 lq1Var115 = new lq1(i24, i311111117, i311111118, i25, i26, bArr);
                        str6 = r0.f18121b;
                        if (str6 != null) {
                            map = p5.r0;
                            if (map.containsKey(str6)) {
                                iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                            } else {
                                iIntValue = i22;
                            }
                        } else {
                            iIntValue = i22;
                        }
                        if (r0.f18142u == 0) {
                            i28 = iIntValue;
                        } else {
                            i28 = iIntValue;
                        }
                        i12Var.f15518u = r0.f18136o;
                        i12Var.f15519v = r0.f18137p;
                        i12Var.A = f10;
                        i12Var.f15523z = i28;
                        i12Var.B = r0.f18146y;
                        i12Var.C = r0.f18147z;
                        i12Var.D = lq1Var115;
                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                        throw ab.a(null, "Unexpected MIME type.");
                    }
                    str7 = r0.f18121b;
                    if (str7 != null) {
                        i12Var.f15500b = r0.f18121b;
                    }
                    i12Var.c(i10);
                    if (true != r0.f18119a) {
                        str8 = "video/x-matroska";
                    } else {
                        str8 = "video/webm";
                    }
                    i12Var.d(str8);
                    i12Var.e(str5);
                    i12Var.f15512o = i13;
                    i12Var.f15502d = r0.f18120a0;
                    i12Var.f15503e = i311111116;
                    i12Var.f15514q = list1116;
                    i12Var.f15508j = obj2;
                    i12Var.f15515r = r0.f18135n;
                    r0.f18124c0 = new g22(i12Var);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused6) {
                    throw ab.a(null, "Error parsing MS/ACM codec private");
                }
            case 24:
                iB = uu0.b(r0.R, ByteOrder.LITTLE_ENDIAN);
                if (iB == 0) {
                    int i57 = r0.R;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i57).length() + 78);
                    sb3.append("Unsupported little endian PCM bit depth: ");
                    sb3.append(i57);
                    sb3.append(". Setting mimeType to audio/x-unknown");
                    v71.y("MatroskaExtractor", sb3.toString());
                    obj3 = null;
                    iB = -1;
                    list9 = list8;
                } else {
                    obj3 = null;
                    str11 = MimeTypes.AUDIO_RAW;
                }
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1115 = r0.Z;
                List list1117 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i311111119 = (z1115 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3111111110 = i12;
                    int i3111111111 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var116 = new lq1(i24, i3111111110, i3111111111, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var116;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i311111119;
                i12Var.f15514q = list1117;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 25:
                iB = uu0.b(r0.R, ByteOrder.BIG_ENDIAN);
                if (iB == 0) {
                    int i58 = r0.R;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i58).length() + 75);
                    sb4.append("Unsupported big endian PCM bit depth: ");
                    sb4.append(i58);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    v71.y("MatroskaExtractor", sb4.toString());
                    obj3 = null;
                    iB = -1;
                    list9 = list8;
                } else {
                    obj3 = null;
                    str11 = MimeTypes.AUDIO_RAW;
                }
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1116 = r0.Z;
                List list1118 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i3111111112 = (z1116 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3111111113 = i12;
                    int i3111111114 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var117 = new lq1(i24, i3111111113, i3111111114, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var117;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i3111111112;
                i12Var.f15514q = list1118;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                iB = uu0.c(r0.R, ByteOrder.LITTLE_ENDIAN);
                if (iB == 0) {
                    int i59 = r0.R;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(i59).length() + 79);
                    sb5.append("Unsupported floating point PCM bit depth: ");
                    sb5.append(i59);
                    sb5.append(". Setting mimeType to audio/x-unknown");
                    v71.y("MatroskaExtractor", sb5.toString());
                    obj3 = null;
                    iB = -1;
                    list9 = list8;
                } else {
                    obj3 = null;
                    str11 = MimeTypes.AUDIO_RAW;
                }
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1117 = r0.Z;
                List list1119 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i3111111115 = (z1117 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3111111116 = i12;
                    int i3111111117 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var118 = new lq1(i24, i3111111116, i3111111117, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var118;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i3111111115;
                i12Var.f15514q = list1119;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 27:
                obj3 = null;
                str11 = MimeTypes.APPLICATION_SUBRIP;
                iB = -1;
                list9 = list8;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1118 = r0.Z;
                List list11110 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i3111111118 = (z1118 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i3111111119 = i12;
                    int i31111111110 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var119 = new lq1(i24, i3111111119, i31111111110, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var119;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i3111111118;
                i12Var.f15514q = list11110;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                byte[] bArr10 = p5.f18488m0;
                ya1 ya1VarV = ca1.v(p5.f18489n0, r0.b(r0.f18123c));
                str11 = MimeTypes.TEXT_SSA;
                ya1Var = ya1VarV;
                list7 = ya1Var;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list6 = list7;
                list3 = list6;
                iB = -1;
                list5 = list3;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z1119 = r0.Z;
                List list11111 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i31111111111 = (z1119 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i31111111112 = i12;
                    int i31111111113 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var1110 = new lq1(i24, i31111111112, i31111111113, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var1110;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i31111111111;
                i12Var.f15514q = list11111;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                obj3 = null;
                str11 = MimeTypes.TEXT_VTT;
                iB = -1;
                list9 = list8;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z11110 = r0.Z;
                List list11112 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i31111111114 = (z11110 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i31111111115 = i12;
                    int i31111111116 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var1111 = new lq1(i24, i31111111115, i31111111116, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var1111;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i31111111114;
                i12Var.f15514q = list11112;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 31:
                ya1 ya1VarU3 = ca1.u(r0.b(str9));
                str11 = MimeTypes.APPLICATION_VOBSUB;
                ya1Var = ya1VarU3;
                list7 = ya1Var;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list6 = list7;
                list3 = list6;
                iB = -1;
                list5 = list3;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z11111 = r0.Z;
                List list11113 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i31111111117 = (z11111 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i31111111118 = i12;
                    int i31111111119 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var1112 = new lq1(i24, i31111111118, i31111111119, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var1112;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i31111111117;
                i12Var.f15514q = list11113;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 32:
                str11 = MimeTypes.APPLICATION_PGS;
                obj3 = null;
                iB = -1;
                list9 = list8;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                list4 = list9;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list5 = list4;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z11112 = r0.Z;
                List list11114 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i311111111110 = (z11112 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i311111111111 = i12;
                    int i311111111112 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var1113 = new lq1(i24, i311111111111, i311111111112, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var1113;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i311111111110;
                i12Var.f15514q = list11114;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            case 33:
                byte[] bArr11 = new byte[4];
                System.arraycopy(r0.b(str9), 0, bArr11, 0, 4);
                ya1 ya1VarU4 = ca1.u(bArr11);
                str11 = MimeTypes.APPLICATION_DVBSUBS;
                ya1Var = ya1VarU4;
                list7 = ya1Var;
                i15 = -1;
                i11 = -1;
                i14 = -1;
                i12 = -1;
                i16 = -1;
                i13 = -1;
                list6 = list7;
                list3 = list6;
                iB = -1;
                list5 = list3;
                if (r0.P != null) {
                    obj2 = obj3;
                    tf1VarA = tf1.a(new np0(r0.P));
                    if (tf1VarA != null) {
                        obj3 = tf1VarA.f20372b;
                        str11 = "video/dolby-vision";
                        obj2 = obj3;
                    }
                } else {
                    obj2 = obj3;
                }
                str5 = str11;
                boolean z11113 = r0.Z;
                List list11115 = list5;
                if (true != r0.Y) {
                    i21 = 0;
                } else {
                    i21 = 2;
                }
                int i311111111113 = (z11113 ? 1 : 0) | i21;
                i12Var = new i12();
                if ("audio".equals(na.i(str5))) {
                    i12Var.F = r0.Q;
                    i12Var.G = r0.S;
                    i12Var.H = r0.T;
                    i12Var.I = iB;
                } else if (na.a(str5)) {
                    if (r0.f18141t == 0) {
                        i31 = r0.f18139r;
                        i22 = -1;
                        if (i31 == -1) {
                            i31 = r0.f18136o;
                        }
                        r0.f18139r = i31;
                        i32 = r0.f18140s;
                        if (i32 == -1) {
                            i32 = r0.f18137p;
                        }
                        r0.f18140s = i32;
                    } else {
                        i22 = -1;
                    }
                    i23 = r0.f18139r;
                    if (i23 != i22) {
                        f10 = -1.0f;
                    } else {
                        f10 = -1.0f;
                    }
                    if (i14 != i22) {
                        i24 = i14;
                    } else if (i16 != i22) {
                        i24 = i22;
                    } else {
                        if (i12 == i22) {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        } else {
                            i14 = r0.A;
                            i16 = r0.B;
                            i12 = r0.C;
                        }
                        i24 = i14;
                    }
                    int i311111111114 = i12;
                    int i311111111115 = i16;
                    if (i15 == i22) {
                        i25 = i15;
                    } else {
                        i25 = i15;
                    }
                    if (i11 == i22) {
                        i29 = r0.f18138q;
                        if (i29 == i22) {
                            i26 = 8;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        i26 = i11;
                    }
                    if (r0.F != -1.0f) {
                        i27 = 0;
                        bArr = null;
                    } else {
                        i27 = 0;
                        bArr = null;
                    }
                    lq1 lq1Var1114 = new lq1(i24, i311111111114, i311111111115, i25, i26, bArr);
                    str6 = r0.f18121b;
                    if (str6 != null) {
                        map = p5.r0;
                        if (map.containsKey(str6)) {
                            iIntValue = ((Integer) map.get(r0.f18121b)).intValue();
                        } else {
                            iIntValue = i22;
                        }
                    } else {
                        iIntValue = i22;
                    }
                    if (r0.f18142u == 0) {
                        i28 = iIntValue;
                    } else {
                        i28 = iIntValue;
                    }
                    i12Var.f15518u = r0.f18136o;
                    i12Var.f15519v = r0.f18137p;
                    i12Var.A = f10;
                    i12Var.f15523z = i28;
                    i12Var.B = r0.f18146y;
                    i12Var.C = r0.f18147z;
                    i12Var.D = lq1Var1114;
                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str5)) {
                    throw ab.a(null, "Unexpected MIME type.");
                }
                str7 = r0.f18121b;
                if (str7 != null) {
                    i12Var.f15500b = r0.f18121b;
                }
                i12Var.c(i10);
                if (true != r0.f18119a) {
                    str8 = "video/x-matroska";
                } else {
                    str8 = "video/webm";
                }
                i12Var.d(str8);
                i12Var.e(str5);
                i12Var.f15512o = i13;
                i12Var.f15502d = r0.f18120a0;
                i12Var.f15503e = i311111111113;
                i12Var.f15514q = list11115;
                i12Var.f15508j = obj2;
                i12Var.f15515r = r0.f18135n;
                r0.f18124c0 = new g22(i12Var);
                return;
            default:
                throw ab.a(null, "Unrecognized codec identifier.");
        }
    }

    public final byte[] b(String str) throws ab {
        byte[] bArr = this.f18134m;
        if (bArr != null) {
            return bArr;
        }
        throw ab.a(null, "Missing CodecPrivate for codec ".concat(String.valueOf(str)));
    }
}
