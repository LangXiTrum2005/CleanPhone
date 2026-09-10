package f3;

import android.util.Pair;
import android.util.SparseArray;
import b2.w;
import bc.s;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.i3;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.q2;
import com.google.android.gms.internal.ads.w2;
import com.google.android.gms.internal.ads.xd1;
import com.google.android.gms.internal.ads.z1;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import d5.u;
import i1.b0;
import i1.c0;
import i1.d0;
import i1.e0;
import i1.g;
import i1.o;
import i1.p;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import l1.q;
import l1.y;
import m1.n;
import n2.a0;
import n2.h;
import n2.k;
import n2.l;
import n2.m;
import n2.z;
import oa.j0;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements k {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final byte[] f40573k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final byte[] f40574l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final byte[] f40575m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final byte[] f40576n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final UUID f40577o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Map f40578p0;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5 f40579a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f40580a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f40581b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f40582b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f40583c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f40584c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f40585d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f40586d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40587e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f40588e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k3.k f40589f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f40590f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f40591g;
    public int g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f40592h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public byte f40593h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f40594i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f40595i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f40596j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public m f40597j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q f40598k;
    public final q l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f40599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f40600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f40601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f40602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f40603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f40604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f40605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f40606t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f40607u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f40608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f40609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f40610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f40611y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f40612z;

    static {
        String str = y.f44830a;
        f40574l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f40575m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f40576n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f40577o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        u.p(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        u.p(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f40578p0 = Collections.unmodifiableMap(map);
    }

    public e(k3.k kVar, int i10) {
        k5 k5Var = new k5(1);
        this.f40605s = -1L;
        this.f40606t = C.TIME_UNSET;
        this.f40607u = C.TIME_UNSET;
        this.f40608v = C.TIME_UNSET;
        this.E = C.TIME_UNSET;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = C.TIME_UNSET;
        this.f40579a = k5Var;
        k5Var.f16323g = new i(this);
        this.f40589f = kVar;
        this.C = new SparseArray();
        this.f40585d = (i10 & 1) == 0;
        this.f40587e = (i10 & 2) == 0;
        this.f40581b = new f();
        this.f40583c = new SparseArray();
        this.f40594i = new q(4);
        this.f40596j = new q(ByteBuffer.allocate(4).putInt(-1).array());
        this.f40598k = new q(4);
        this.f40591g = new q(n.f45820a);
        this.f40592h = new q(4);
        this.l = new q();
        this.f40599m = new q();
        this.f40600n = new q(8);
        this.f40601o = new q();
        this.f40602p = new q();
        this.T = new int[1];
        this.f40610x = true;
    }

    public static byte[] h(long j10, long j11, String str) {
        go.k.i(j10 != C.TIME_UNSET);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        String str3 = y.f44830a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // n2.k
    public final boolean a(l lVar) {
        w wVar = new w((byte) 0, 11);
        q qVar = (q) wVar.f5411c;
        h hVar = (h) lVar;
        long j10 = hVar.f46465c;
        long j11 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (j10 != -1 && j10 <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j11 = j10;
        }
        int i10 = (int) j11;
        hVar.peekFully(qVar.f44813a, 0, 4, false);
        wVar.f5410b = 4;
        for (long jB = qVar.B(); jB != 440786851; jB = ((jB << 8) & (-256)) | ((long) (qVar.f44813a[0] & 255))) {
            int i11 = wVar.f5410b + 1;
            wVar.f5410b = i11;
            if (i11 == i10) {
                return false;
            }
            hVar.peekFully(qVar.f44813a, 0, 1, false);
        }
        long jF = wVar.f(hVar);
        long j12 = wVar.f5410b;
        if (jF != Long.MIN_VALUE && (j10 == -1 || j12 + jF < j10)) {
            while (true) {
                long j13 = wVar.f5410b;
                long j14 = j12 + jF;
                if (j13 < j14) {
                    if (wVar.f(hVar) == Long.MIN_VALUE) {
                        break;
                    }
                    long jF2 = wVar.f(hVar);
                    if (jF2 < 0 || jF2 > 2147483647L) {
                        break;
                    }
                    if (jF2 != 0) {
                        int i12 = (int) jF2;
                        hVar.b(i12, false);
                        wVar.f5410b += i12;
                    }
                } else if (j13 == j14) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x0364  */
    /* JADX WARN: Code duplicated, block: B:325:0x0529  */
    /* JADX WARN: Code duplicated, block: B:487:0x07b5 A[PHI: r0
  0x07b5: PHI (r0v126 int) = (r0v70 int), (r0v122 int), (r0v123 int), (r0v124 int), (r0v128 int) binds: [B:610:0x0a23, B:499:0x07d4, B:496:0x07cd, B:493:0x07c6, B:484:0x079a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:622:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:627:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:628:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:631:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:632:0x0a97  */
    /* JADX WARN: Code duplicated, block: B:634:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:636:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:638:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:641:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:643:0x0ab3  */
    /* JADX WARN: Code duplicated, block: B:646:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:649:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:652:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:654:0x0ad3  */
    /* JADX WARN: Code duplicated, block: B:674:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:676:0x0ba5  */
    /* JADX WARN: Code duplicated, block: B:679:0x0baa  */
    /* JADX WARN: Code duplicated, block: B:682:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:685:0x0bc2  */
    /* JADX WARN: Code duplicated, block: B:691:0x0bdb  */
    /* JADX WARN: Code duplicated, block: B:692:0x0bdd  */
    /* JADX WARN: Code duplicated, block: B:694:0x0be7  */
    /* JADX WARN: Code duplicated, block: B:695:0x0bea  */
    /* JADX WARN: Code duplicated, block: B:697:0x0bf4  */
    /* JADX WARN: Code duplicated, block: B:703:0x0c0c  */
    /* JADX WARN: Code duplicated, block: B:705:0x0c25  */
    /* JADX WARN: Code duplicated, block: B:707:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:722:0x0c56  */
    /* JADX WARN: Code duplicated, block: B:727:0x0c6a  */
    /* JADX WARN: Code duplicated, block: B:728:0x0c6d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0198  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [s4.i] */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v16, types: [n2.l] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4, types: [n2.l] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r35v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v121 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.k5] */
    /* JADX WARN: Type inference failed for: r8v1, types: [f3.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // n2.k
    public final int b(l lVar, q2 q2Var) throws e0 {
        boolean z10;
        int i10;
        int i11;
        int i12;
        String str;
        ?? r10;
        int i13;
        int iA;
        ?? r2;
        boolean z11;
        ?? r3;
        int i14;
        byte b10;
        List listSingletonList;
        int iC;
        ?? r11;
        int i15;
        ArrayList arrayList;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        String str3;
        List list;
        List listB;
        String str4;
        List list2;
        List list3;
        int i16;
        o oVar;
        boolean zI;
        int i17;
        int i18;
        float f10;
        i1.h hVar;
        String str5;
        int iIntValue;
        byte[] bArr;
        int i19;
        int i20;
        int i21;
        String str6;
        String str7;
        hn.u uVarB;
        List list4;
        int i22;
        List list5;
        int i23;
        long j10;
        long j11;
        long j12;
        c0 c0Var;
        w2.c cVar;
        c0 c0VarA;
        e eVar = this;
        boolean z12 = false;
        eVar.N = false;
        boolean z13 = true;
        boolean z14 = true;
        while (z14 && !eVar.N) {
            ?? r12 = eVar.f40579a;
            ?? r13 = (f) r12.f16322f;
            ArrayDeque arrayDeque = r12.f16318b;
            ((i) r12.f16323g).getClass();
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || lVar.getPosition() < aVar.f40537b) {
                    boolean z15 = z12 ? 1 : 0;
                    ?? r14 = lVar;
                    if (r12.f16319c == 0) {
                        int i24 = 4;
                        long jB = r13.b(r14, true, z15, 4);
                        if (jB == -2) {
                            byte[] bArr2 = r12.f16317a;
                            r14.resetPeekPosition();
                            ?? r15 = z15;
                            while (true) {
                                r14.peekFully(bArr2, r15, i24);
                                byte b11 = bArr2[r15];
                                int i25 = 0;
                                while (true) {
                                    if (i25 >= 8) {
                                        i13 = -1;
                                    } else if ((f.f40613d[i25] & ((long) b11)) != 0) {
                                        i13 = i25 + 1;
                                    } else {
                                        i25++;
                                    }
                                }
                                if (i13 != -1 && i13 <= 4) {
                                    iA = (int) f.a(bArr2, i13, false);
                                    Object obj = ((i) r12.f16323g).f50111a;
                                    if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                    }
                                }
                                r14.skipFully(1);
                                i24 = 4;
                                r15 = 0;
                            }
                            r14.skipFully(i13);
                            jB = iA;
                        }
                        z10 = true;
                        if (jB == -1) {
                            r10 = 0;
                            z14 = false;
                            r2 = r14;
                        } else {
                            r12.f16320d = (int) jB;
                            r12.f16319c = 1;
                        }
                    } else {
                        z10 = true;
                    }
                    if (r12.f16319c == z10) {
                        r12.f16321e = r13.b(r14, false, z10, 8);
                        r12.f16319c = 2;
                    }
                    ?? r0 = (i) r12.f16323g;
                    int i26 = r12.f16320d;
                    Object obj2 = r0.f50111a;
                    switch (i26) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case PsExtractor.VIDEO_STREAM_MASK /* 240 */:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i10 = 2;
                            break;
                        case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i10 = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i10 = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i10 = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i10 = 5;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    if (i10 == 0) {
                        r14.skipFully((int) r12.f16321e);
                        r12.f16319c = 0;
                        z12 = false;
                        z13 = true;
                    } else if (i10 == 1) {
                        long position = r14.getPosition();
                        arrayDeque.push(new a(r12.f16320d, r12.f16321e + position));
                        ((i) r12.f16323g).q(r12.f16320d, position, r12.f16321e);
                        i11 = 0;
                        r12.f16319c = 0;
                        r3 = r14;
                    } else if (i10 == 2) {
                        long j13 = r12.f16321e;
                        if (j13 > 8) {
                            throw e0.a(null, "Invalid integer size: " + r12.f16321e);
                        }
                        r0.m(i26, r12.a(r14, (int) j13));
                        i11 = 0;
                        r12.f16319c = 0;
                        r3 = r14;
                    } else if (i10 == 3) {
                        long j14 = r12.f16321e;
                        if (j14 > 2147483647L) {
                            throw e0.a(null, "String element size: " + r12.f16321e);
                        }
                        int i27 = (int) j14;
                        if (i27 == 0) {
                            str = "";
                            i12 = 0;
                        } else {
                            byte[] bArr3 = new byte[i27];
                            r14.readFully(bArr3, 0, i27);
                            while (i27 > 0 && bArr3[i27 - 1] == 0) {
                                i27--;
                            }
                            i12 = 0;
                            str = new String(bArr3, 0, i27);
                        }
                        r0.r(i26, str);
                        r12.f16319c = i12;
                        i11 = i12;
                        r3 = r14;
                    } else if (i10 == 4) {
                        r0.i(i26, (int) r12.f16321e, r14);
                        i11 = 0;
                        r12.f16319c = 0;
                        r3 = r14;
                    } else {
                        if (i10 != 5) {
                            throw e0.a(null, "Invalid element type " + i10);
                        }
                        long j15 = r12.f16321e;
                        if (j15 != 4 && j15 != 8) {
                            throw e0.a(null, "Invalid float size: " + r12.f16321e);
                        }
                        int i28 = (int) j15;
                        long jA = r12.a(r14, i28);
                        double dIntBitsToFloat = i28 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
                        e eVar2 = (e) r0.f50111a;
                        if (i26 == 181) {
                            eVar2.f(i26);
                            eVar2.f40611y.S = (int) dIntBitsToFloat;
                        } else if (i26 != 17545) {
                            switch (i26) {
                                case 21969:
                                    eVar2.f(i26);
                                    eVar2.f40611y.F = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    eVar2.f(i26);
                                    eVar2.f40611y.G = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    eVar2.f(i26);
                                    eVar2.f40611y.H = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    eVar2.f(i26);
                                    eVar2.f40611y.I = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    eVar2.f(i26);
                                    eVar2.f40611y.J = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    eVar2.f(i26);
                                    eVar2.f40611y.K = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    eVar2.f(i26);
                                    eVar2.f40611y.L = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    eVar2.f(i26);
                                    eVar2.f40611y.M = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    eVar2.f(i26);
                                    eVar2.f40611y.N = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    eVar2.f(i26);
                                    eVar2.f40611y.O = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i26) {
                                        case 30323:
                                            eVar2.f(i26);
                                            eVar2.f40611y.f40567u = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            eVar2.f(i26);
                                            eVar2.f40611y.f40568v = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            eVar2.f(i26);
                                            eVar2.f40611y.f40569w = (float) dIntBitsToFloat;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            eVar2.f40607u = (long) dIntBitsToFloat;
                        }
                        i11 = 0;
                        r12.f16319c = 0;
                        r3 = r14;
                    }
                } else {
                    i iVar = (i) r12.f16323g;
                    int i29 = ((a) arrayDeque.pop()).f40536a;
                    e eVar3 = (e) iVar.f50111a;
                    SparseArray sparseArray = eVar3.C;
                    SparseArray sparseArray2 = eVar3.f40583c;
                    eVar3.f40597j0.getClass();
                    if (i29 != 160) {
                        if (i29 == 174) {
                            d dVar = eVar3.f40611y;
                            dVar.getClass();
                            String str8 = dVar.f40549c;
                            if (str8 == null) {
                                throw e0.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str8) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i30 = dVar.f40551d;
                                    switch (str8) {
                                        case "V_MPEG4/ISO/AP":
                                            b10 = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b10 = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b10 = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b10 = 3;
                                            break;
                                        case "A_VORBIS":
                                            b10 = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b10 = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b10 = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b10 = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b10 = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b10 = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b10 = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b10 = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b10 = 12;
                                            break;
                                        case "A_AAC":
                                            b10 = 13;
                                            break;
                                        case "A_AC3":
                                            b10 = 14;
                                            break;
                                        case "A_DTS":
                                            b10 = 15;
                                            break;
                                        case "V_AV1":
                                            b10 = 16;
                                            break;
                                        case "V_VP8":
                                            b10 = 17;
                                            break;
                                        case "V_VP9":
                                            b10 = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b10 = 19;
                                            break;
                                        case "V_THEORA":
                                            b10 = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b10 = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b10 = 22;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b10 = 23;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b10 = 24;
                                            break;
                                        case "S_TEXT/ASS":
                                            b10 = 25;
                                            break;
                                        case "S_TEXT/SSA":
                                            b10 = 26;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b10 = 27;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b10 = 28;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b10 = 29;
                                            break;
                                        case "V_MPEG2":
                                            b10 = 30;
                                            break;
                                        case "A_EAC3":
                                            b10 = 31;
                                            break;
                                        case "A_FLAC":
                                            b10 = 32;
                                            break;
                                        case "A_OPUS":
                                            b10 = 33;
                                            break;
                                        default:
                                            b10 = -1;
                                            break;
                                    }
                                    String str9 = MimeTypes.VIDEO_UNKNOWN;
                                    switch (b10) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            byte[] bArr4 = dVar.l;
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str9 = MimeTypes.VIDEO_MP4V;
                                            listB = listSingletonList;
                                            iC = -1;
                                            i15 = -1;
                                            list4 = listB;
                                            str3 = null;
                                            list3 = list4;
                                            if (dVar.P != null && (uVarB = hn.u.b(new q(dVar.P))) != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z16 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31 = (z16 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17 || (i19 = dVar.f40564r) == i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = (dVar.f40561o * i18) / (dVar.f40560n * i19);
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f || dVar.G == -1.0f || dVar.H == -1.0f || dVar.I == -1.0f || dVar.J == -1.0f || dVar.K == -1.0f || dVar.L == -1.0f || dVar.M == -1.0f || dVar.N == -1.0f || dVar.O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((dVar.F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((dVar.M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (dVar.N + 0.5f));
                                                        byteBufferOrder.putShort((short) (dVar.O + 0.5f));
                                                        byteBufferOrder.putShort((short) dVar.D);
                                                        byteBufferOrder.putShort((short) dVar.E);
                                                        bArr = bArr5;
                                                    }
                                                    int i32 = dVar.A;
                                                    int i33 = dVar.C;
                                                    int i34 = dVar.B;
                                                    int i35 = dVar.f40562p;
                                                    hVar = new i1.h(i32, i33, i34, i35, i35, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null && map.containsKey(str5)) {
                                                    iIntValue = ((Integer) map.get(dVar.f40547b)).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0 && Float.compare(dVar.f40567u, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && Float.compare(dVar.f40568v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0 || Float.compare(dVar.f40569w, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(dVar.f40569w, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9) && !MimeTypes.TEXT_SSA.equals(str9) && !MimeTypes.TEXT_VTT.equals(str9) && !MimeTypes.APPLICATION_VOBSUB.equals(str9) && !MimeTypes.APPLICATION_PGS.equals(str9) && !MimeTypes.APPLICATION_DVBSUBS.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null && !map.containsKey(str6)) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 2:
                                            q qVar = new q(dVar.a(dVar.f40549c));
                                            try {
                                                int iS = qVar.s();
                                                if (iS != 1) {
                                                    if (iS == 65534) {
                                                        qVar.M(24);
                                                        long jT = qVar.t();
                                                        UUID uuid = f40577o0;
                                                        if (jT != uuid.getMostSignificantBits() || qVar.t() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str9 = MimeTypes.AUDIO_UNKNOWN;
                                                        iC = -1;
                                                        i15 = -1;
                                                        str3 = null;
                                                        list3 = null;
                                                        if (dVar.P != null) {
                                                            str3 = uVarB.f42458b;
                                                            str9 = "video/dolby-vision";
                                                        }
                                                        boolean z17 = dVar.Y;
                                                        if (dVar.X) {
                                                            i16 = 2;
                                                        } else {
                                                            i16 = 0;
                                                        }
                                                        int i36 = (z17 ? 1 : 0) | i16;
                                                        oVar = new o();
                                                        zI = d0.i(str9);
                                                        Map map2 = f40578p0;
                                                        if (zI) {
                                                            oVar.E = dVar.Q;
                                                            oVar.F = dVar.S;
                                                            oVar.G = iC;
                                                        } else if (d0.m(str9)) {
                                                            if (dVar.f40565s == 0) {
                                                                i20 = dVar.f40563q;
                                                                i17 = -1;
                                                                if (i20 == -1) {
                                                                    i20 = dVar.f40560n;
                                                                }
                                                                dVar.f40563q = i20;
                                                                i21 = dVar.f40564r;
                                                                if (i21 == -1) {
                                                                    i21 = dVar.f40561o;
                                                                }
                                                                dVar.f40564r = i21;
                                                            } else {
                                                                i17 = -1;
                                                            }
                                                            i18 = dVar.f40563q;
                                                            if (i18 != i17) {
                                                                f10 = -1.0f;
                                                            } else {
                                                                f10 = -1.0f;
                                                            }
                                                            if (dVar.f40572z) {
                                                                if (dVar.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i37 = dVar.A;
                                                                int i38 = dVar.C;
                                                                int i39 = dVar.B;
                                                                int i310 = dVar.f40562p;
                                                                hVar = new i1.h(i37, i38, i39, i310, i310, bArr);
                                                            } else {
                                                                hVar = null;
                                                            }
                                                            str5 = dVar.f40547b;
                                                            if (str5 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (dVar.f40566t == 0) {
                                                                if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            oVar.f42607t = dVar.f40560n;
                                                            oVar.f42608u = dVar.f40561o;
                                                            oVar.f42613z = f10;
                                                            oVar.f42612y = iIntValue;
                                                            oVar.A = dVar.f40570x;
                                                            oVar.B = dVar.f40571y;
                                                            oVar.C = hVar;
                                                        } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                            throw e0.a(null, "Unexpected MIME type.");
                                                        }
                                                        str6 = dVar.f40547b;
                                                        if (str6 != null) {
                                                            oVar.f42590b = dVar.f40547b;
                                                        }
                                                        oVar.f42589a = Integer.toString(i30);
                                                        if (dVar.f40545a) {
                                                            str7 = "video/webm";
                                                        } else {
                                                            str7 = "video/x-matroska";
                                                        }
                                                        oVar.l = d0.n(str7);
                                                        oVar.f42600m = d0.n(str9);
                                                        oVar.f42601n = i15;
                                                        oVar.f42592d = dVar.Z;
                                                        oVar.f42593e = i36;
                                                        oVar.f42603p = list3;
                                                        oVar.f42598j = str3;
                                                        oVar.f42604q = dVar.f40559m;
                                                        dVar.f40548b0 = oVar.a();
                                                        dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                                        sparseArray2.put(dVar.f40551d, dVar);
                                                    }
                                                    l1.a.s("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str9 = MimeTypes.AUDIO_UNKNOWN;
                                                    iC = -1;
                                                    i15 = -1;
                                                    str3 = null;
                                                    list3 = null;
                                                    if (dVar.P != null) {
                                                        str3 = uVarB.f42458b;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z18 = dVar.Y;
                                                    if (dVar.X) {
                                                        i16 = 2;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    int i311 = (z18 ? 1 : 0) | i16;
                                                    oVar = new o();
                                                    zI = d0.i(str9);
                                                    Map map3 = f40578p0;
                                                    if (zI) {
                                                        oVar.E = dVar.Q;
                                                        oVar.F = dVar.S;
                                                        oVar.G = iC;
                                                    } else if (d0.m(str9)) {
                                                        if (dVar.f40565s == 0) {
                                                            i20 = dVar.f40563q;
                                                            i17 = -1;
                                                            if (i20 == -1) {
                                                                i20 = dVar.f40560n;
                                                            }
                                                            dVar.f40563q = i20;
                                                            i21 = dVar.f40564r;
                                                            if (i21 == -1) {
                                                                i21 = dVar.f40561o;
                                                            }
                                                            dVar.f40564r = i21;
                                                        } else {
                                                            i17 = -1;
                                                        }
                                                        i18 = dVar.f40563q;
                                                        if (i18 != i17) {
                                                            f10 = -1.0f;
                                                        } else {
                                                            f10 = -1.0f;
                                                        }
                                                        if (dVar.f40572z) {
                                                            if (dVar.F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i312 = dVar.A;
                                                            int i313 = dVar.C;
                                                            int i314 = dVar.B;
                                                            int i315 = dVar.f40562p;
                                                            hVar = new i1.h(i312, i313, i314, i315, i315, bArr);
                                                        } else {
                                                            hVar = null;
                                                        }
                                                        str5 = dVar.f40547b;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (dVar.f40566t == 0) {
                                                            if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        oVar.f42607t = dVar.f40560n;
                                                        oVar.f42608u = dVar.f40561o;
                                                        oVar.f42613z = f10;
                                                        oVar.f42612y = iIntValue;
                                                        oVar.A = dVar.f40570x;
                                                        oVar.B = dVar.f40571y;
                                                        oVar.C = hVar;
                                                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                        throw e0.a(null, "Unexpected MIME type.");
                                                    }
                                                    str6 = dVar.f40547b;
                                                    if (str6 != null) {
                                                        oVar.f42590b = dVar.f40547b;
                                                    }
                                                    oVar.f42589a = Integer.toString(i30);
                                                    if (dVar.f40545a) {
                                                        str7 = "video/webm";
                                                    } else {
                                                        str7 = "video/x-matroska";
                                                    }
                                                    oVar.l = d0.n(str7);
                                                    oVar.f42600m = d0.n(str9);
                                                    oVar.f42601n = i15;
                                                    oVar.f42592d = dVar.Z;
                                                    oVar.f42593e = i311;
                                                    oVar.f42603p = list3;
                                                    oVar.f42598j = str3;
                                                    oVar.f42604q = dVar.f40559m;
                                                    dVar.f40548b0 = oVar.a();
                                                    dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                                    sparseArray2.put(dVar.f40551d, dVar);
                                                    break;
                                                }
                                                int i40 = dVar.R;
                                                String str10 = y.f44830a;
                                                iC = y.C(i40, ByteOrder.LITTLE_ENDIAN);
                                                if (iC == 0) {
                                                    l1.a.s("MatroskaExtractor", "Unsupported PCM bit depth: " + dVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = MimeTypes.AUDIO_UNKNOWN;
                                                    iC = -1;
                                                } else {
                                                    str9 = MimeTypes.AUDIO_RAW;
                                                }
                                                i15 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (dVar.P != null) {
                                                    str3 = uVarB.f42458b;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z19 = dVar.Y;
                                                if (dVar.X) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i316 = (z19 ? 1 : 0) | i16;
                                                oVar = new o();
                                                zI = d0.i(str9);
                                                Map map4 = f40578p0;
                                                if (zI) {
                                                    oVar.E = dVar.Q;
                                                    oVar.F = dVar.S;
                                                    oVar.G = iC;
                                                } else if (d0.m(str9)) {
                                                    if (dVar.f40565s == 0) {
                                                        i20 = dVar.f40563q;
                                                        i17 = -1;
                                                        if (i20 == -1) {
                                                            i20 = dVar.f40560n;
                                                        }
                                                        dVar.f40563q = i20;
                                                        i21 = dVar.f40564r;
                                                        if (i21 == -1) {
                                                            i21 = dVar.f40561o;
                                                        }
                                                        dVar.f40564r = i21;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = dVar.f40563q;
                                                    if (i18 != i17) {
                                                        f10 = -1.0f;
                                                    } else {
                                                        f10 = -1.0f;
                                                    }
                                                    if (dVar.f40572z) {
                                                        if (dVar.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i317 = dVar.A;
                                                        int i318 = dVar.C;
                                                        int i319 = dVar.B;
                                                        int i3110 = dVar.f40562p;
                                                        hVar = new i1.h(i317, i318, i319, i3110, i3110, bArr);
                                                    } else {
                                                        hVar = null;
                                                    }
                                                    str5 = dVar.f40547b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dVar.f40566t == 0) {
                                                        if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    oVar.f42607t = dVar.f40560n;
                                                    oVar.f42608u = dVar.f40561o;
                                                    oVar.f42613z = f10;
                                                    oVar.f42612y = iIntValue;
                                                    oVar.A = dVar.f40570x;
                                                    oVar.B = dVar.f40571y;
                                                    oVar.C = hVar;
                                                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                    throw e0.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = dVar.f40547b;
                                                if (str6 != null) {
                                                    oVar.f42590b = dVar.f40547b;
                                                }
                                                oVar.f42589a = Integer.toString(i30);
                                                if (dVar.f40545a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                oVar.l = d0.n(str7);
                                                oVar.f42600m = d0.n(str9);
                                                oVar.f42601n = i15;
                                                oVar.f42592d = dVar.Z;
                                                oVar.f42593e = i316;
                                                oVar.f42603p = list3;
                                                oVar.f42598j = str3;
                                                oVar.f42604q = dVar.f40559m;
                                                dVar.f40548b0 = oVar.a();
                                                dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                                sparseArray2.put(dVar.f40551d, dVar);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw e0.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            dVar.V = new i3(1);
                                            str9 = MimeTypes.AUDIO_TRUEHD;
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z110 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111 = (z110 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map5 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3112 = dVar.A;
                                                    int i3113 = dVar.C;
                                                    int i3114 = dVar.B;
                                                    int i3115 = dVar.f40562p;
                                                    hVar = new i1.h(i3112, i3113, i3114, i3115, i3115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i3111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 4:
                                            byte[] bArrA = dVar.a(str8);
                                            try {
                                                r11 = bArrA[0];
                                                try {
                                                    if (r11 != 2) {
                                                        throw e0.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i41 = 0;
                                                    int i42 = 1;
                                                    while (true) {
                                                        int i43 = bArrA[i42] & 255;
                                                        if (i43 != 255) {
                                                            int i44 = i42 + 1;
                                                            int i45 = i41 + i43;
                                                            int i46 = 0;
                                                            while (true) {
                                                                int i47 = bArrA[i44] & 255;
                                                                if (i47 != 255) {
                                                                    int i48 = i44 + 1;
                                                                    int i49 = i46 + i47;
                                                                    if (bArrA[i48] != 1) {
                                                                        throw e0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i45];
                                                                    System.arraycopy(bArrA, i48, bArr6, 0, i45);
                                                                    int i50 = i48 + i45;
                                                                    if (bArrA[i50] != 3) {
                                                                        throw e0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i51 = i50 + i49;
                                                                    if (bArrA[i51] != 5) {
                                                                        throw e0.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrA.length - i51];
                                                                    System.arraycopy(bArrA, i51, bArr7, 0, bArrA.length - i51);
                                                                    ArrayList arrayList2 = new ArrayList(2);
                                                                    arrayList2.add(bArr6);
                                                                    arrayList2.add(bArr7);
                                                                    str9 = MimeTypes.AUDIO_VORBIS;
                                                                    i15 = Segment.SIZE;
                                                                    arrayList = arrayList2;
                                                                    iC = -1;
                                                                    list4 = arrayList;
                                                                    str3 = null;
                                                                    list3 = list4;
                                                                    if (dVar.P != null) {
                                                                        str3 = uVarB.f42458b;
                                                                        str9 = "video/dolby-vision";
                                                                    }
                                                                    boolean z111 = dVar.Y;
                                                                    if (dVar.X) {
                                                                        i16 = 2;
                                                                    } else {
                                                                        i16 = 0;
                                                                    }
                                                                    int i3116 = (z111 ? 1 : 0) | i16;
                                                                    oVar = new o();
                                                                    zI = d0.i(str9);
                                                                    Map map6 = f40578p0;
                                                                    if (zI) {
                                                                        oVar.E = dVar.Q;
                                                                        oVar.F = dVar.S;
                                                                        oVar.G = iC;
                                                                    } else if (d0.m(str9)) {
                                                                        if (dVar.f40565s == 0) {
                                                                            i20 = dVar.f40563q;
                                                                            i17 = -1;
                                                                            if (i20 == -1) {
                                                                                i20 = dVar.f40560n;
                                                                            }
                                                                            dVar.f40563q = i20;
                                                                            i21 = dVar.f40564r;
                                                                            if (i21 == -1) {
                                                                                i21 = dVar.f40561o;
                                                                            }
                                                                            dVar.f40564r = i21;
                                                                        } else {
                                                                            i17 = -1;
                                                                        }
                                                                        i18 = dVar.f40563q;
                                                                        if (i18 != i17) {
                                                                            f10 = -1.0f;
                                                                        } else {
                                                                            f10 = -1.0f;
                                                                        }
                                                                        if (dVar.f40572z) {
                                                                            if (dVar.F != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i3117 = dVar.A;
                                                                            int i3118 = dVar.C;
                                                                            int i3119 = dVar.B;
                                                                            int i31110 = dVar.f40562p;
                                                                            hVar = new i1.h(i3117, i3118, i3119, i31110, i31110, bArr);
                                                                        } else {
                                                                            hVar = null;
                                                                        }
                                                                        str5 = dVar.f40547b;
                                                                        if (str5 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (dVar.f40566t == 0) {
                                                                            if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        oVar.f42607t = dVar.f40560n;
                                                                        oVar.f42608u = dVar.f40561o;
                                                                        oVar.f42613z = f10;
                                                                        oVar.f42612y = iIntValue;
                                                                        oVar.A = dVar.f40570x;
                                                                        oVar.B = dVar.f40571y;
                                                                        oVar.C = hVar;
                                                                    } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                                        throw e0.a(null, "Unexpected MIME type.");
                                                                    }
                                                                    str6 = dVar.f40547b;
                                                                    if (str6 != null) {
                                                                        oVar.f42590b = dVar.f40547b;
                                                                    }
                                                                    oVar.f42589a = Integer.toString(i30);
                                                                    if (dVar.f40545a) {
                                                                        str7 = "video/webm";
                                                                    } else {
                                                                        str7 = "video/x-matroska";
                                                                    }
                                                                    oVar.l = d0.n(str7);
                                                                    oVar.f42600m = d0.n(str9);
                                                                    oVar.f42601n = i15;
                                                                    oVar.f42592d = dVar.Z;
                                                                    oVar.f42593e = i3116;
                                                                    oVar.f42603p = list3;
                                                                    oVar.f42598j = str3;
                                                                    oVar.f42604q = dVar.f40559m;
                                                                    dVar.f40548b0 = oVar.a();
                                                                    dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                                                    sparseArray2.put(dVar.f40551d, dVar);
                                                                } else {
                                                                    i46 += 255;
                                                                    i44++;
                                                                }
                                                            }
                                                        } else {
                                                            i41 += 255;
                                                            i42++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw e0.a(r11, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r11 = 0;
                                            }
                                            break;
                                        case 5:
                                            str9 = MimeTypes.AUDIO_MPEG_L2;
                                            iC = -1;
                                            i15 = 4096;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z112 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111 = (z112 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map7 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31112 = dVar.A;
                                                    int i31113 = dVar.C;
                                                    int i31114 = dVar.B;
                                                    int i31115 = dVar.f40562p;
                                                    hVar = new i1.h(i31112, i31113, i31114, i31115, i31115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 6:
                                            str9 = MimeTypes.AUDIO_MPEG;
                                            iC = -1;
                                            i15 = 4096;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z113 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31116 = (z113 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map8 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31117 = dVar.A;
                                                    int i31118 = dVar.C;
                                                    int i31119 = dVar.B;
                                                    int i311110 = dVar.f40562p;
                                                    hVar = new i1.h(i31117, i31118, i31119, i311110, i311110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 7:
                                            q qVar2 = new q(dVar.a(dVar.f40549c));
                                            try {
                                                qVar2.N(16);
                                                long jQ = qVar2.q();
                                                if (jQ == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                    }
                                                } else {
                                                    if (jQ == 859189832) {
                                                        pair = new Pair(MimeTypes.VIDEO_H263, null);
                                                    } else {
                                                        if (jQ == 826496599) {
                                                            int i52 = qVar2.f44814b + 20;
                                                            byte[] bArr8 = qVar2.f44813a;
                                                            while (true) {
                                                                if (i52 < bArr8.length - 4) {
                                                                    if (bArr8[i52] == 0 && bArr8[i52 + 1] == 0 && bArr8[i52 + 2] == 1) {
                                                                        if (bArr8[i52 + 3] == 15) {
                                                                            pair = new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr8, i52, bArr8.length)));
                                                                        }
                                                                    }
                                                                    i52++;
                                                                } else {
                                                                    runtimeException = null;
                                                                    try {
                                                                        throw e0.a(null, "Failed to find FourCC VC1 initialization data");
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                    }
                                                                }
                                                                throw e0.a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        l1.a.s("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                                                    }
                                                    str2 = null;
                                                }
                                                str9 = (String) pair.first;
                                                str3 = str2;
                                                list = (List) pair.second;
                                                iC = -1;
                                                i15 = -1;
                                                list3 = list;
                                                if (dVar.P != null) {
                                                    str3 = uVarB.f42458b;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z114 = dVar.Y;
                                                if (dVar.X) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i311111 = (z114 ? 1 : 0) | i16;
                                                oVar = new o();
                                                zI = d0.i(str9);
                                                Map map9 = f40578p0;
                                                if (zI) {
                                                    oVar.E = dVar.Q;
                                                    oVar.F = dVar.S;
                                                    oVar.G = iC;
                                                } else if (d0.m(str9)) {
                                                    if (dVar.f40565s == 0) {
                                                        i20 = dVar.f40563q;
                                                        i17 = -1;
                                                        if (i20 == -1) {
                                                            i20 = dVar.f40560n;
                                                        }
                                                        dVar.f40563q = i20;
                                                        i21 = dVar.f40564r;
                                                        if (i21 == -1) {
                                                            i21 = dVar.f40561o;
                                                        }
                                                        dVar.f40564r = i21;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = dVar.f40563q;
                                                    if (i18 != i17) {
                                                        f10 = -1.0f;
                                                    } else {
                                                        f10 = -1.0f;
                                                    }
                                                    if (dVar.f40572z) {
                                                        if (dVar.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311112 = dVar.A;
                                                        int i311113 = dVar.C;
                                                        int i311114 = dVar.B;
                                                        int i311115 = dVar.f40562p;
                                                        hVar = new i1.h(i311112, i311113, i311114, i311115, i311115, bArr);
                                                    } else {
                                                        hVar = null;
                                                    }
                                                    str5 = dVar.f40547b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (dVar.f40566t == 0) {
                                                        if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    oVar.f42607t = dVar.f40560n;
                                                    oVar.f42608u = dVar.f40561o;
                                                    oVar.f42613z = f10;
                                                    oVar.f42612y = iIntValue;
                                                    oVar.A = dVar.f40570x;
                                                    oVar.B = dVar.f40571y;
                                                    oVar.C = hVar;
                                                } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                    throw e0.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = dVar.f40547b;
                                                if (str6 != null) {
                                                    oVar.f42590b = dVar.f40547b;
                                                }
                                                oVar.f42589a = Integer.toString(i30);
                                                if (dVar.f40545a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                oVar.l = d0.n(str7);
                                                oVar.f42600m = d0.n(str9);
                                                oVar.f42601n = i15;
                                                oVar.f42592d = dVar.Z;
                                                oVar.f42593e = i311111;
                                                oVar.f42603p = list3;
                                                oVar.f42598j = str3;
                                                oVar.f42604q = dVar.f40559m;
                                                dVar.f40548b0 = oVar.a();
                                                dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                                sparseArray2.put(dVar.f40551d, dVar);
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(dVar.a(str8), 0, bArr9, 0, 4);
                                            listB = j0.B(bArr9);
                                            str9 = MimeTypes.APPLICATION_DVBSUBS;
                                            iC = -1;
                                            i15 = -1;
                                            list4 = listB;
                                            str3 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z115 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311116 = (z115 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map10 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311117 = dVar.A;
                                                    int i311118 = dVar.C;
                                                    int i311119 = dVar.B;
                                                    int i3111110 = dVar.f40562p;
                                                    hVar = new i1.h(i311117, i311118, i311119, i3111110, i3111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i311116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 10:
                                            z1 z1VarA = z1.a(new q(dVar.a(dVar.f40549c)));
                                            ArrayList arrayList3 = z1VarA.f22446a;
                                            dVar.f40550c0 = z1VarA.f22447b;
                                            str4 = z1VarA.l;
                                            str9 = "video/avc";
                                            list2 = arrayList3;
                                            str3 = str4;
                                            list = list2;
                                            iC = -1;
                                            i15 = -1;
                                            list3 = list;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z116 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111 = (z116 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map11 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111112 = dVar.A;
                                                    int i3111113 = dVar.C;
                                                    int i3111114 = dVar.B;
                                                    int i3111115 = dVar.f40562p;
                                                    hVar = new i1.h(i3111112, i3111113, i3111114, i3111115, i3111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i3111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 11:
                                            listB = j0.B(dVar.a(str8));
                                            str9 = MimeTypes.APPLICATION_VOBSUB;
                                            iC = -1;
                                            i15 = -1;
                                            list4 = listB;
                                            str3 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z117 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111116 = (z117 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map12 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111117 = dVar.A;
                                                    int i3111118 = dVar.C;
                                                    int i3111119 = dVar.B;
                                                    int i31111110 = dVar.f40562p;
                                                    hVar = new i1.h(i3111117, i3111118, i3111119, i31111110, i31111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i3111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 12:
                                            str9 = MimeTypes.AUDIO_DTS_HD;
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z118 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111 = (z118 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map13 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111112 = dVar.A;
                                                    int i31111113 = dVar.C;
                                                    int i31111114 = dVar.B;
                                                    int i31111115 = dVar.f40562p;
                                                    hVar = new i1.h(i31111112, i31111113, i31111114, i31111115, i31111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 13:
                                            List listSingletonList2 = Collections.singletonList(dVar.a(str8));
                                            byte[] bArr10 = dVar.l;
                                            n2.a aVarS = n2.b.s(new xd1(bArr10, bArr10.length), false);
                                            dVar.S = aVarS.f46421b;
                                            dVar.Q = aVarS.f46422c;
                                            String str11 = aVarS.f46420a;
                                            str9 = MimeTypes.AUDIO_AAC;
                                            list = listSingletonList2;
                                            str3 = str11;
                                            iC = -1;
                                            i15 = -1;
                                            list3 = list;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z119 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111116 = (z119 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map14 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111117 = dVar.A;
                                                    int i31111118 = dVar.C;
                                                    int i31111119 = dVar.B;
                                                    int i311111110 = dVar.f40562p;
                                                    hVar = new i1.h(i31111117, i31111118, i31111119, i311111110, i311111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 14:
                                            str9 = MimeTypes.AUDIO_AC3;
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1110 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111111 = (z1110 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map15 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111112 = dVar.A;
                                                    int i311111113 = dVar.C;
                                                    int i311111114 = dVar.B;
                                                    int i311111115 = dVar.f40562p;
                                                    hVar = new i1.h(i311111112, i311111113, i311111114, i311111115, i311111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i311111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 15:
                                        case 21:
                                            dVar.W = true;
                                            str9 = MimeTypes.AUDIO_DTS;
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1111 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111116 = (z1111 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map16 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111117 = dVar.A;
                                                    int i311111118 = dVar.C;
                                                    int i311111119 = dVar.B;
                                                    int i3111111110 = dVar.f40562p;
                                                    hVar = new i1.h(i311111117, i311111118, i311111119, i3111111110, i3111111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i311111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 16:
                                            byte[] bArr11 = dVar.l;
                                            listSingletonList = bArr11 == null ? null : j0.B(bArr11);
                                            str9 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                            listB = listSingletonList;
                                            iC = -1;
                                            i15 = -1;
                                            list4 = listB;
                                            str3 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1112 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111111 = (z1112 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map17 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111112 = dVar.A;
                                                    int i3111111113 = dVar.C;
                                                    int i3111111114 = dVar.B;
                                                    int i3111111115 = dVar.f40562p;
                                                    hVar = new i1.h(i3111111112, i3111111113, i3111111114, i3111111115, i3111111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i3111111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 17:
                                            str9 = MimeTypes.VIDEO_VP8;
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1113 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111116 = (z1113 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map18 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111117 = dVar.A;
                                                    int i3111111118 = dVar.C;
                                                    int i3111111119 = dVar.B;
                                                    int i31111111110 = dVar.f40562p;
                                                    hVar = new i1.h(i3111111117, i3111111118, i3111111119, i31111111110, i31111111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i3111111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 18:
                                            byte[] bArr12 = dVar.l;
                                            listSingletonList = bArr12 == null ? null : j0.B(bArr12);
                                            str9 = MimeTypes.VIDEO_VP9;
                                            listB = listSingletonList;
                                            iC = -1;
                                            i15 = -1;
                                            list4 = listB;
                                            str3 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1114 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111111 = (z1114 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map19 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111112 = dVar.A;
                                                    int i31111111113 = dVar.C;
                                                    int i31111111114 = dVar.B;
                                                    int i31111111115 = dVar.f40562p;
                                                    hVar = new i1.h(i31111111112, i31111111113, i31111111114, i31111111115, i31111111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31111111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 19:
                                            str9 = MimeTypes.APPLICATION_PGS;
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1115 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111116 = (z1115 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map110 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111117 = dVar.A;
                                                    int i31111111118 = dVar.C;
                                                    int i31111111119 = dVar.B;
                                                    int i311111111110 = dVar.f40562p;
                                                    hVar = new i1.h(i31111111117, i31111111118, i31111111119, i311111111110, i311111111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31111111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 20:
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1116 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111111111 = (z1116 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map111 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111112 = dVar.A;
                                                    int i311111111113 = dVar.C;
                                                    int i311111111114 = dVar.B;
                                                    int i311111111115 = dVar.f40562p;
                                                    hVar = new i1.h(i311111111112, i311111111113, i311111111114, i311111111115, i311111111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i311111111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 22:
                                            if (dVar.R == 32) {
                                                str9 = MimeTypes.AUDIO_RAW;
                                                iC = 4;
                                            } else {
                                                l1.a.s("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + dVar.R + ". Setting mimeType to audio/x-unknown");
                                                str9 = MimeTypes.AUDIO_UNKNOWN;
                                                iC = -1;
                                            }
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1117 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111111116 = (z1117 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map112 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111117 = dVar.A;
                                                    int i311111111118 = dVar.C;
                                                    int i311111111119 = dVar.B;
                                                    int i3111111111110 = dVar.f40562p;
                                                    hVar = new i1.h(i311111111117, i311111111118, i311111111119, i3111111111110, i3111111111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i311111111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 23:
                                            int i53 = dVar.R;
                                            if (i53 == 8) {
                                                str9 = MimeTypes.AUDIO_RAW;
                                                iC = 3;
                                            } else {
                                                if (i53 == 16) {
                                                    iC = 268435456;
                                                } else if (i53 == 24) {
                                                    iC = 1342177280;
                                                } else if (i53 == 32) {
                                                    iC = 1610612736;
                                                } else {
                                                    l1.a.s("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + dVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = MimeTypes.AUDIO_UNKNOWN;
                                                    iC = -1;
                                                }
                                                str9 = MimeTypes.AUDIO_RAW;
                                            }
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1118 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111111111 = (z1118 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map113 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111112 = dVar.A;
                                                    int i3111111111113 = dVar.C;
                                                    int i3111111111114 = dVar.B;
                                                    int i3111111111115 = dVar.f40562p;
                                                    hVar = new i1.h(i3111111111112, i3111111111113, i3111111111114, i3111111111115, i3111111111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i3111111111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 24:
                                            int i54 = dVar.R;
                                            String str12 = y.f44830a;
                                            iC = y.C(i54, ByteOrder.LITTLE_ENDIAN);
                                            if (iC == 0) {
                                                l1.a.s("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + dVar.R + ". Setting mimeType to audio/x-unknown");
                                                str9 = MimeTypes.AUDIO_UNKNOWN;
                                                iC = -1;
                                            } else {
                                                str9 = MimeTypes.AUDIO_RAW;
                                            }
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1119 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111111116 = (z1119 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map114 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111117 = dVar.A;
                                                    int i3111111111118 = dVar.C;
                                                    int i3111111111119 = dVar.B;
                                                    int i31111111111110 = dVar.f40562p;
                                                    hVar = new i1.h(i3111111111117, i3111111111118, i3111111111119, i31111111111110, i31111111111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i3111111111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 25:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                                            listB = j0.C(f40574l0, dVar.a(str8));
                                            str9 = MimeTypes.TEXT_SSA;
                                            iC = -1;
                                            i15 = -1;
                                            list4 = listB;
                                            str3 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11110 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111111111 = (z11110 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map115 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111112 = dVar.A;
                                                    int i31111111111113 = dVar.C;
                                                    int i31111111111114 = dVar.B;
                                                    int i31111111111115 = dVar.f40562p;
                                                    hVar = new i1.h(i31111111111112, i31111111111113, i31111111111114, i31111111111115, i31111111111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31111111111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 27:
                                            w2 w2VarA = w2.a(new q(dVar.a(dVar.f40549c)), false, null);
                                            List list6 = w2VarA.f21376a;
                                            dVar.f40550c0 = w2VarA.f21377b;
                                            str4 = w2VarA.f21388n;
                                            str9 = "video/hevc";
                                            list2 = list6;
                                            str3 = str4;
                                            list = list2;
                                            iC = -1;
                                            i15 = -1;
                                            list3 = list;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11111 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111111116 = (z11111 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map116 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111117 = dVar.A;
                                                    int i31111111111118 = dVar.C;
                                                    int i31111111111119 = dVar.B;
                                                    int i311111111111110 = dVar.f40562p;
                                                    hVar = new i1.h(i31111111111117, i31111111111118, i31111111111119, i311111111111110, i311111111111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31111111111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                                            str9 = MimeTypes.TEXT_VTT;
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11112 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111111111111 = (z11112 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map117 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111111112 = dVar.A;
                                                    int i311111111111113 = dVar.C;
                                                    int i311111111111114 = dVar.B;
                                                    int i311111111111115 = dVar.f40562p;
                                                    hVar = new i1.h(i311111111111112, i311111111111113, i311111111111114, i311111111111115, i311111111111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i311111111111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                                            str9 = MimeTypes.APPLICATION_SUBRIP;
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11113 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111111111116 = (z11113 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map118 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111111117 = dVar.A;
                                                    int i311111111111118 = dVar.C;
                                                    int i311111111111119 = dVar.B;
                                                    int i3111111111111110 = dVar.f40562p;
                                                    hVar = new i1.h(i311111111111117, i311111111111118, i311111111111119, i3111111111111110, i3111111111111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i311111111111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                                            str9 = MimeTypes.VIDEO_MPEG2;
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11114 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111111111111 = (z11114 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map119 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111111112 = dVar.A;
                                                    int i3111111111111113 = dVar.C;
                                                    int i3111111111111114 = dVar.B;
                                                    int i3111111111111115 = dVar.f40562p;
                                                    hVar = new i1.h(i3111111111111112, i3111111111111113, i3111111111111114, i3111111111111115, i3111111111111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i3111111111111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 31:
                                            str9 = MimeTypes.AUDIO_E_AC3;
                                            iC = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11115 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111111111116 = (z11115 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map1110 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111111117 = dVar.A;
                                                    int i3111111111111118 = dVar.C;
                                                    int i3111111111111119 = dVar.B;
                                                    int i31111111111111110 = dVar.f40562p;
                                                    hVar = new i1.h(i3111111111111117, i3111111111111118, i3111111111111119, i31111111111111110, i31111111111111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i3111111111111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 32:
                                            listSingletonList = Collections.singletonList(dVar.a(str8));
                                            str9 = MimeTypes.AUDIO_FLAC;
                                            listB = listSingletonList;
                                            iC = -1;
                                            i15 = -1;
                                            list4 = listB;
                                            str3 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11116 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111111111111 = (z11116 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map1111 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111111112 = dVar.A;
                                                    int i31111111111111113 = dVar.C;
                                                    int i31111111111111114 = dVar.B;
                                                    int i31111111111111115 = dVar.f40562p;
                                                    hVar = new i1.h(i31111111111111112, i31111111111111113, i31111111111111114, i31111111111111115, i31111111111111115, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31111111111111111;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        case 33:
                                            ArrayList arrayList4 = new ArrayList(3);
                                            arrayList4.add(dVar.a(dVar.f40549c));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(dVar.T).array());
                                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(dVar.U).array());
                                            str9 = MimeTypes.AUDIO_OPUS;
                                            i15 = 5760;
                                            arrayList = arrayList4;
                                            iC = -1;
                                            list4 = arrayList;
                                            str3 = null;
                                            list3 = list4;
                                            if (dVar.P != null) {
                                                str3 = uVarB.f42458b;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11117 = dVar.Y;
                                            if (dVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111111111116 = (z11117 ? 1 : 0) | i16;
                                            oVar = new o();
                                            zI = d0.i(str9);
                                            Map map1112 = f40578p0;
                                            if (zI) {
                                                oVar.E = dVar.Q;
                                                oVar.F = dVar.S;
                                                oVar.G = iC;
                                            } else if (d0.m(str9)) {
                                                if (dVar.f40565s == 0) {
                                                    i20 = dVar.f40563q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = dVar.f40560n;
                                                    }
                                                    dVar.f40563q = i20;
                                                    i21 = dVar.f40564r;
                                                    if (i21 == -1) {
                                                        i21 = dVar.f40561o;
                                                    }
                                                    dVar.f40564r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = dVar.f40563q;
                                                if (i18 != i17) {
                                                    f10 = -1.0f;
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (dVar.f40572z) {
                                                    if (dVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111111117 = dVar.A;
                                                    int i31111111111111118 = dVar.C;
                                                    int i31111111111111119 = dVar.B;
                                                    int i311111111111111110 = dVar.f40562p;
                                                    hVar = new i1.h(i31111111111111117, i31111111111111118, i31111111111111119, i311111111111111110, i311111111111111110, bArr);
                                                } else {
                                                    hVar = null;
                                                }
                                                str5 = dVar.f40547b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (dVar.f40566t == 0) {
                                                    if (Float.compare(dVar.f40569w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(dVar.f40569w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(dVar.f40569w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oVar.f42607t = dVar.f40560n;
                                                oVar.f42608u = dVar.f40561o;
                                                oVar.f42613z = f10;
                                                oVar.f42612y = iIntValue;
                                                oVar.A = dVar.f40570x;
                                                oVar.B = dVar.f40571y;
                                                oVar.C = hVar;
                                            } else if (!MimeTypes.APPLICATION_SUBRIP.equals(str9)) {
                                                throw e0.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = dVar.f40547b;
                                            if (str6 != null) {
                                                oVar.f42590b = dVar.f40547b;
                                            }
                                            oVar.f42589a = Integer.toString(i30);
                                            if (dVar.f40545a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            oVar.l = d0.n(str7);
                                            oVar.f42600m = d0.n(str9);
                                            oVar.f42601n = i15;
                                            oVar.f42592d = dVar.Z;
                                            oVar.f42593e = i31111111111111116;
                                            oVar.f42603p = list3;
                                            oVar.f42598j = str3;
                                            oVar.f42604q = dVar.f40559m;
                                            dVar.f40548b0 = oVar.a();
                                            dVar.f40546a0 = eVar3.f40597j0.track(dVar.f40551d, dVar.f40552e);
                                            sparseArray2.put(dVar.f40551d, dVar);
                                            break;
                                        default:
                                            throw e0.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    eVar3.f40611y = null;
                                    break;
                            }
                        } else if (i29 != 183) {
                            if (i29 == 19899) {
                                int i55 = eVar3.A;
                                if (i55 != -1) {
                                    long j16 = eVar3.B;
                                    if (j16 != -1) {
                                        if (i55 == 475249515) {
                                            eVar3.K = j16;
                                        }
                                    }
                                }
                                throw e0.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i29 == 25152) {
                                eVar3.f(i29);
                                d dVar2 = eVar3.f40611y;
                                if (dVar2.f40556i) {
                                    z zVar = dVar2.f40558k;
                                    if (zVar == null) {
                                        throw e0.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    dVar2.f40559m = new i1.m(new i1.l(g.f42538a, null, "video/webm", zVar.f46505b));
                                }
                            } else if (i29 == 28032) {
                                eVar3.f(i29);
                                d dVar3 = eVar3.f40611y;
                                if (dVar3.f40556i && dVar3.f40557j != null) {
                                    throw e0.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i29 == 357149030) {
                                if (eVar3.f40606t == C.TIME_UNSET) {
                                    eVar3.f40606t = 1000000L;
                                }
                                long j17 = eVar3.f40607u;
                                if (j17 != C.TIME_UNSET) {
                                    eVar3.f40608v = eVar3.l(j17);
                                }
                            } else if (i29 == 374648427) {
                                boolean z20 = z12 ? 1 : 0;
                                if (sparseArray2.size() == 0) {
                                    throw e0.a(null, "No valid tracks were found");
                                }
                                boolean z21 = (!eVar3.f40585d || eVar3.K == -1) ? true : z20 ? 1 : 0;
                                int i56 = -1;
                                int i57 = -1;
                                int i58 = -1;
                                int i59 = -1;
                                for (int i60 = z20 ? 1 : 0; i60 < sparseArray2.size(); i60++) {
                                    d dVar4 = (d) sparseArray2.valueAt(i60);
                                    int i61 = dVar4.f40552e;
                                    if (i61 == 2) {
                                        if (dVar4.Y) {
                                            i56 = dVar4.f40551d;
                                        }
                                        if (i57 == -1) {
                                            i57 = dVar4.f40551d;
                                        }
                                    } else if (i61 == 1) {
                                        if (dVar4.Y) {
                                            i58 = dVar4.f40551d;
                                        }
                                        if (i59 == -1) {
                                            i59 = dVar4.f40551d;
                                        }
                                    }
                                    if (z21) {
                                        dVar4.f40546a0.getClass();
                                        if (!dVar4.W) {
                                            a0 a0Var = dVar4.f40546a0;
                                            p pVar = dVar4.f40548b0;
                                            pVar.getClass();
                                            a0Var.b(pVar);
                                        }
                                    }
                                }
                                if (i56 != -1) {
                                    eVar3.I = i56;
                                } else if (i57 != -1) {
                                    eVar3.I = i57;
                                } else if (i58 != -1) {
                                    eVar3.I = i58;
                                } else if (i59 != -1) {
                                    eVar3.I = i59;
                                } else {
                                    eVar3.I = sparseArray2.size() > 0 ? ((d) sparseArray2.valueAt(z20 ? 1 : 0)).f40551d : -1;
                                }
                                if (z21) {
                                    eVar3.i();
                                }
                            } else if (i29 == 475249515 && !eVar3.f40612z) {
                                int i62 = z12 ? 1 : 0;
                                while (true) {
                                    if (i62 < sparseArray.size()) {
                                        if (((List) sparseArray.valueAt(i62)).isEmpty()) {
                                            i62++;
                                        } else if (eVar3.f40608v != C.TIME_UNSET) {
                                            for (int i63 = z12 ? 1 : 0; i63 < sparseArray.size(); i63++) {
                                                Collections.sort((List) sparseArray.valueAt(i63));
                                            }
                                            eVar3.f40597j0.u(new c(sparseArray, eVar3.f40608v, eVar3.I, eVar3.f40605s, eVar3.f40604r));
                                        }
                                    }
                                    eVar3.f40597j0.u(new n2.o(eVar3.f40608v));
                                }
                                eVar3.f40612z = z13;
                                eVar3.D = z12;
                                int i64 = z12 ? 1 : 0;
                                while (i64 < sparseArray2.size()) {
                                    d dVar5 = (d) sparseArray2.valueAt(i64);
                                    long j18 = eVar3.f40608v;
                                    long j19 = eVar3.f40605s;
                                    long j20 = eVar3.f40604r;
                                    boolean z22 = z12;
                                    int i65 = z13;
                                    if (dVar5.f40552e != 2 || (list5 = (List) sparseArray.get(dVar5.f40551d)) == null || list5.isEmpty()) {
                                        i23 = i64;
                                    } else {
                                        if (list5.isEmpty()) {
                                            i23 = i64;
                                        } else {
                                            i23 = i64;
                                            int iMin = Math.min(list5.size(), 20);
                                            double d10 = 0.0d;
                                            int i66 = z22 ? 1 : 0;
                                            int i67 = -1;
                                            while (i66 < iMin) {
                                                b bVar = (b) list5.get(i66);
                                                long j21 = j19;
                                                long j22 = bVar.f40538a;
                                                long j23 = bVar.f40540c;
                                                long j24 = bVar.f40539b;
                                                if (j22 > 10000000) {
                                                    if (i67 == -1) {
                                                        j10 = ((b) list5.get(i67 == true ? 1 : 0)).f40538a;
                                                    }
                                                    if (j10 != C.TIME_UNSET) {
                                                        p pVar2 = dVar5.f40548b0;
                                                        pVar2.getClass();
                                                        c0Var = pVar2.l;
                                                        cVar = new w2.c(j10);
                                                        if (c0Var == null) {
                                                            b0[] b0VarArr = new b0[i65];
                                                            b0VarArr[z22 ? 1 : 0] = cVar;
                                                            c0VarA = new c0(b0VarArr);
                                                        } else {
                                                            b0[] b0VarArr2 = new b0[i65];
                                                            b0VarArr2[z22 ? 1 : 0] = cVar;
                                                            c0VarA = c0Var.a(b0VarArr2);
                                                        }
                                                        o oVarA = dVar5.f40548b0.a();
                                                        oVarA.f42599k = c0VarA;
                                                        dVar5.f40548b0 = new p(oVarA);
                                                    }
                                                } else {
                                                    if (i66 < list5.size() - 1) {
                                                        b bVar2 = (b) list5.get(i66 + 1);
                                                        j11 = (bVar2.f40539b + bVar2.f40540c) - (j24 + j23);
                                                        j12 = bVar2.f40538a - j22;
                                                    } else {
                                                        j11 = (j21 + j20) - (j24 + j23);
                                                        j12 = j18 - j22;
                                                    }
                                                    if (j12 > 0) {
                                                        double d11 = j11 / j12;
                                                        if (d11 > d10) {
                                                            d10 = d11;
                                                            i67 = i66;
                                                        }
                                                    }
                                                    i66++;
                                                    j19 = j21;
                                                }
                                            }
                                            if (i67 == -1) {
                                                j10 = ((b) list5.get(i67 == true ? 1 : 0)).f40538a;
                                            }
                                            if (j10 != C.TIME_UNSET) {
                                                p pVar3 = dVar5.f40548b0;
                                                pVar3.getClass();
                                                c0Var = pVar3.l;
                                                cVar = new w2.c(j10);
                                                if (c0Var == null) {
                                                    b0[] b0VarArr3 = new b0[i65];
                                                    b0VarArr3[z22 ? 1 : 0] = cVar;
                                                    c0VarA = new c0(b0VarArr3);
                                                } else {
                                                    b0[] b0VarArr4 = new b0[i65];
                                                    b0VarArr4[z22 ? 1 : 0] = cVar;
                                                    c0VarA = c0Var.a(b0VarArr4);
                                                }
                                                o oVarA2 = dVar5.f40548b0.a();
                                                oVarA2.f42599k = c0VarA;
                                                dVar5.f40548b0 = new p(oVarA2);
                                            }
                                        }
                                        j10 = -9223372036854775807L;
                                        if (j10 != C.TIME_UNSET) {
                                            p pVar4 = dVar5.f40548b0;
                                            pVar4.getClass();
                                            c0Var = pVar4.l;
                                            cVar = new w2.c(j10);
                                            if (c0Var == null) {
                                                b0[] b0VarArr5 = new b0[i65];
                                                b0VarArr5[z22 ? 1 : 0] = cVar;
                                                c0VarA = new c0(b0VarArr5);
                                            } else {
                                                b0[] b0VarArr6 = new b0[i65];
                                                b0VarArr6[z22 ? 1 : 0] = cVar;
                                                c0VarA = c0Var.a(b0VarArr6);
                                            }
                                            o oVarA3 = dVar5.f40548b0.a();
                                            oVarA3.f42599k = c0VarA;
                                            dVar5.f40548b0 = new p(oVarA3);
                                        }
                                    }
                                    if (!dVar5.W) {
                                        dVar5.f40546a0.getClass();
                                        a0 a0Var2 = dVar5.f40546a0;
                                        p pVar5 = dVar5.f40548b0;
                                        pVar5.getClass();
                                        a0Var2.b(pVar5);
                                    }
                                    i64 = i23 + 1;
                                    z12 = z22 ? 1 : 0;
                                    z13 = true;
                                }
                                eVar3.i();
                                i14 = z12 ? 1 : 0;
                            }
                        } else if (!eVar3.f40612z) {
                            eVar3.e(i29);
                            if (eVar3.E != C.TIME_UNSET && (i22 = eVar3.F) != -1 && eVar3.G != -1) {
                                List arrayList5 = (List) sparseArray.get(i22);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    sparseArray.put(eVar3.F, arrayList5);
                                }
                                arrayList5.add(new b(eVar3.E, eVar3.f40605s + eVar3.G, eVar3.H));
                            }
                        }
                        i14 = 0;
                    } else if (eVar3.O != 2) {
                        i14 = 0;
                    } else {
                        d dVar6 = (d) sparseArray2.get(eVar3.U);
                        dVar6.f40546a0.getClass();
                        if (eVar3.Z > 0 && "A_OPUS".equals(dVar6.f40549c)) {
                            q qVar3 = eVar3.f40602p;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(eVar3.Z).array();
                            qVar3.getClass();
                            qVar3.K(bArrArray, bArrArray.length);
                        }
                        int i68 = 0;
                        for (int i69 = 0; i69 < eVar3.S; i69++) {
                            i68 += eVar3.T[i69];
                        }
                        int i70 = 0;
                        while (i70 < eVar3.S) {
                            long j25 = eVar3.P + ((long) ((dVar6.f40553f * i70) / 1000));
                            int i71 = eVar3.W;
                            if (i70 == 0 && !eVar3.Y) {
                                i71 |= 1;
                            }
                            int i72 = eVar3.T[i70];
                            int i73 = i68 - i72;
                            eVar3.g(dVar6, j25, i71, i72, i73);
                            i70++;
                            i68 = i73;
                        }
                        i14 = 0;
                        eVar3.O = 0;
                    }
                    r3 = lVar;
                    i11 = i14;
                }
                z14 = true;
                r2 = r3;
                r10 = i11;
            }
            if (z14) {
                long position2 = r2.getPosition();
                eVar = this;
                if (eVar.J) {
                    eVar.L = position2;
                    q2Var.f18888a = eVar.K;
                    eVar.J = r10;
                    return 1;
                }
                z11 = true;
                if (eVar.f40612z) {
                    long j26 = eVar.L;
                    if (j26 != -1) {
                        q2Var.f18888a = j26;
                        eVar.L = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                z11 = true;
                eVar = this;
            }
            z13 = z11;
            z12 = false;
        }
        if (z14) {
            return 0;
        }
        int i74 = 0;
        while (true) {
            SparseArray sparseArray3 = eVar.f40583c;
            if (i74 >= sparseArray3.size()) {
                return -1;
            }
            d dVar7 = (d) sparseArray3.valueAt(i74);
            dVar7.f40546a0.getClass();
            i3 i3Var = dVar7.V;
            if (i3Var != null) {
                i3Var.a(dVar7.f40546a0, dVar7.f40558k);
            }
            i74++;
        }
    }

    @Override // n2.k
    public final void c(m mVar) {
        if (this.f40587e) {
            mVar = new s(mVar, this.f40589f);
        }
        this.f40597j0 = mVar;
    }

    public final void e(int i10) {
        if (this.D) {
            return;
        }
        throw e0.a(null, "Element " + i10 + " must be in a Cues");
    }

    public final void f(int i10) {
        if (this.f40611y != null) {
            return;
        }
        throw e0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    public final void g(d dVar, long j10, int i10, int i11, int i12) {
        byte[] bArrH;
        int i13;
        int i14;
        i3 i3Var = dVar.V;
        if (i3Var != null) {
            i3Var.b(dVar.f40546a0, j10, i10, i11, i12, dVar.f40558k);
        } else {
            if ("S_TEXT/UTF8".equals(dVar.f40549c) || "S_TEXT/ASS".equals(dVar.f40549c) || "S_TEXT/SSA".equals(dVar.f40549c) || "S_TEXT/WEBVTT".equals(dVar.f40549c)) {
                if (this.S > 1) {
                    l1.a.s("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.Q;
                    if (j11 == C.TIME_UNSET) {
                        l1.a.s("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = dVar.f40549c;
                        q qVar = this.f40599m;
                        byte[] bArr = qVar.f44813a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrH = h(j11, Xa.f27908s, "%01d:%02d:%02d:%02d");
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrH = h(j11, 1000L, "%02d:%02d:%02d.%03d");
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrH = h(j11, 1000L, "%02d:%02d:%02d,%03d");
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrH, 0, bArr, i13, bArrH.length);
                        for (int i15 = qVar.f44814b; i15 < qVar.f44815c; i15++) {
                            if (qVar.f44813a[i15] == 0) {
                                qVar.L(i15);
                                dVar.f40546a0.g(qVar.f44815c, qVar);
                                i14 = i11 + qVar.f44815c;
                            }
                        }
                        dVar.f40546a0.g(qVar.f44815c, qVar);
                        i14 = i11 + qVar.f44815c;
                    }
                }
                i14 = i11;
            } else {
                i14 = i11;
            }
            if ((i10 & 268435456) != 0) {
                int i16 = this.S;
                q qVar2 = this.f40602p;
                if (i16 > 1) {
                    qVar2.J(0);
                } else {
                    int i17 = qVar2.f44815c;
                    dVar.f40546a0.d(qVar2, i17, 2);
                    i14 += i17;
                }
            }
            dVar.f40546a0.a(j10, i10, i14, i12, dVar.f40558k);
        }
        this.N = true;
    }

    public final void i() {
        if (!this.f40610x) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f40583c;
            if (i10 >= sparseArray.size()) {
                m mVar = this.f40597j0;
                mVar.getClass();
                mVar.endTracks();
                this.f40610x = false;
                return;
            }
            if (((d) sparseArray.valueAt(i10)).W) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void j(l lVar, int i10) {
        q qVar = this.f40594i;
        if (qVar.f44815c >= i10) {
            return;
        }
        byte[] bArr = qVar.f44813a;
        if (bArr.length < i10) {
            qVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = qVar.f44813a;
        int i11 = qVar.f44815c;
        lVar.readFully(bArr2, i11, i10 - i11);
        qVar.L(i10);
    }

    public final void k() {
        this.f40580a0 = 0;
        this.f40582b0 = 0;
        this.f40584c0 = 0;
        this.f40586d0 = false;
        this.f40588e0 = false;
        this.f40590f0 = false;
        this.g0 = 0;
        this.f40593h0 = (byte) 0;
        this.f40595i0 = false;
        this.l.J(0);
    }

    public final long l(long j10) throws e0 {
        long j11 = this.f40606t;
        if (j11 == C.TIME_UNSET) {
            throw e0.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = y.f44830a;
        return y.U(j10, j11, 1000L, RoundingMode.DOWN);
    }

    public final int m(l lVar, d dVar, int i10, boolean z10) {
        int iC;
        int iC2;
        boolean z11;
        int i11;
        if ("S_TEXT/UTF8".equals(dVar.f40549c)) {
            n(lVar, f40573k0, i10);
            int i12 = this.f40582b0;
            k();
            return i12;
        }
        if ("S_TEXT/ASS".equals(dVar.f40549c) || "S_TEXT/SSA".equals(dVar.f40549c)) {
            n(lVar, f40575m0, i10);
            int i13 = this.f40582b0;
            k();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(dVar.f40549c)) {
            n(lVar, f40576n0, i10);
            int i14 = this.f40582b0;
            k();
            return i14;
        }
        if (dVar.W) {
            dVar.f40548b0.getClass();
            q qVar = new q(i10);
            if (lVar.peekFully(qVar.f44813a, 0, i10, true)) {
                lVar.resetPeekPosition();
                if (n2.b.l(qVar.i()) == 1 && qVar.a() >= 10) {
                    byte[] bArr = new byte[10];
                    qVar.k(bArr, 0, 10);
                    qVar.M(0);
                    int iJ = n2.b.j(bArr);
                    if (iJ > 0 && qVar.a() >= iJ + 4) {
                        qVar.N(iJ);
                        if (n2.b.l(qVar.m()) == 2) {
                            o oVarA = dVar.f40548b0.a();
                            oVarA.f42600m = d0.n(MimeTypes.AUDIO_DTS_HD);
                            dVar.f40548b0 = new p(oVarA);
                        }
                    }
                }
            }
            dVar.f40546a0.b(dVar.f40548b0);
            dVar.W = false;
            i();
        }
        a0 a0Var = dVar.f40546a0;
        boolean z12 = this.f40586d0;
        q qVar2 = this.l;
        if (!z12) {
            boolean z13 = dVar.f40556i;
            q qVar3 = this.f40594i;
            if (z13) {
                this.W &= -1073741825;
                if (!this.f40588e0) {
                    lVar.readFully(qVar3.f44813a, 0, 1);
                    this.f40580a0++;
                    byte b10 = qVar3.f44813a[0];
                    if ((b10 & 128) == 128) {
                        throw e0.a(null, "Extension bit is set in signal byte");
                    }
                    this.f40593h0 = b10;
                    this.f40588e0 = true;
                }
                byte b11 = this.f40593h0;
                if ((b11 & 1) == 1) {
                    boolean z14 = (b11 & 2) == 2;
                    this.W |= 1073741824;
                    if (!this.f40595i0) {
                        q qVar4 = this.f40600n;
                        lVar.readFully(qVar4.f44813a, 0, 8);
                        this.f40580a0 += 8;
                        this.f40595i0 = true;
                        qVar3.f44813a[0] = (byte) ((z14 ? 128 : 0) | 8);
                        qVar3.M(0);
                        a0Var.d(qVar3, 1, 1);
                        this.f40582b0++;
                        qVar4.M(0);
                        a0Var.d(qVar4, 8, 1);
                        this.f40582b0 += 8;
                    }
                    if (z14) {
                        if (!this.f40590f0) {
                            lVar.readFully(qVar3.f44813a, 0, 1);
                            this.f40580a0++;
                            qVar3.M(0);
                            this.g0 = qVar3.z();
                            this.f40590f0 = true;
                        }
                        int i15 = this.g0 * 4;
                        qVar3.J(i15);
                        lVar.readFully(qVar3.f44813a, 0, i15);
                        this.f40580a0 += i15;
                        short s10 = (short) ((this.g0 / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f40603q;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f40603q = ByteBuffer.allocate(i16);
                        }
                        this.f40603q.position(0);
                        this.f40603q.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.g0;
                            if (i17 >= i11) {
                                break;
                            }
                            int iD = qVar3.D();
                            if (i17 % 2 == 0) {
                                this.f40603q.putShort((short) (iD - i18));
                            } else {
                                this.f40603q.putInt(iD - i18);
                            }
                            i17++;
                            i18 = iD;
                        }
                        int i19 = (i10 - this.f40580a0) - i18;
                        if (i11 % 2 == 1) {
                            this.f40603q.putInt(i19);
                        } else {
                            this.f40603q.putShort((short) i19);
                            this.f40603q.putInt(0);
                        }
                        byte[] bArrArray = this.f40603q.array();
                        q qVar5 = this.f40601o;
                        qVar5.K(bArrArray, i16);
                        a0Var.d(qVar5, i16, 1);
                        this.f40582b0 += i16;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f40557j;
                if (bArr2 != null) {
                    qVar2.K(bArr2, bArr2.length);
                }
            }
            if ("A_OPUS".equals(dVar.f40549c)) {
                z11 = z10;
            } else {
                z11 = dVar.f40554g > 0;
            }
            if (z11) {
                this.W |= 268435456;
                this.f40602p.J(0);
                int i20 = (qVar2.f44815c + i10) - this.f40580a0;
                qVar3.J(4);
                byte[] bArr3 = qVar3.f44813a;
                bArr3[0] = (byte) ((i20 >> 24) & 255);
                bArr3[1] = (byte) ((i20 >> 16) & 255);
                bArr3[2] = (byte) ((i20 >> 8) & 255);
                bArr3[3] = (byte) (i20 & 255);
                a0Var.d(qVar3, 4, 2);
                this.f40582b0 += 4;
            }
            this.f40586d0 = true;
        }
        int i21 = i10 + qVar2.f44815c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f40549c) && !"V_MPEGH/ISO/HEVC".equals(dVar.f40549c)) {
            if (dVar.V != null) {
                go.k.t(qVar2.f44815c == 0);
                dVar.V.c(lVar);
            }
            while (true) {
                int i22 = this.f40580a0;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int iA = qVar2.a();
                if (iA > 0) {
                    iC2 = Math.min(i23, iA);
                    a0Var.g(iC2, qVar2);
                } else {
                    iC2 = a0Var.c(lVar, i23, false);
                }
                this.f40580a0 += iC2;
                this.f40582b0 += iC2;
            }
        } else {
            q qVar6 = this.f40592h;
            byte[] bArr4 = qVar6.f44813a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i24 = dVar.f40550c0;
            int i25 = 4 - i24;
            while (this.f40580a0 < i21) {
                int i26 = this.f40584c0;
                if (i26 == 0) {
                    int iMin = Math.min(i24, qVar2.a());
                    lVar.readFully(bArr4, i25 + iMin, i24 - iMin);
                    if (iMin > 0) {
                        qVar2.k(bArr4, i25, iMin);
                    }
                    this.f40580a0 += i24;
                    qVar6.M(0);
                    this.f40584c0 = qVar6.D();
                    q qVar7 = this.f40591g;
                    qVar7.M(0);
                    a0Var.g(4, qVar7);
                    this.f40582b0 += 4;
                } else {
                    int iA2 = qVar2.a();
                    if (iA2 > 0) {
                        iC = Math.min(i26, iA2);
                        a0Var.g(iC, qVar2);
                    } else {
                        iC = a0Var.c(lVar, i26, false);
                    }
                    this.f40580a0 += iC;
                    this.f40582b0 += iC;
                    this.f40584c0 -= iC;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.f40549c)) {
            q qVar8 = this.f40596j;
            qVar8.M(0);
            a0Var.g(4, qVar8);
            this.f40582b0 += 4;
        }
        int i27 = this.f40582b0;
        k();
        return i27;
    }

    public final void n(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        q qVar = this.f40599m;
        byte[] bArr2 = qVar.f44813a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i10);
            qVar.getClass();
            qVar.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(qVar.f44813a, bArr.length, i10);
        qVar.M(0);
        qVar.L(length);
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        this.M = C.TIME_UNSET;
        this.O = 0;
        k5 k5Var = this.f40579a;
        k5Var.f16319c = 0;
        k5Var.f16318b.clear();
        f fVar = (f) k5Var.f16322f;
        fVar.f40615b = 0;
        fVar.f40616c = 0;
        f fVar2 = this.f40581b;
        fVar2.f40615b = 0;
        fVar2.f40616c = 0;
        k();
        this.D = false;
        this.E = C.TIME_UNSET;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f40612z) {
            this.C.clear();
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f40583c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            i3 i3Var = ((d) sparseArray.valueAt(i10)).V;
            if (i3Var != null) {
                i3Var.f15549b = false;
                i3Var.f15550c = 0;
            }
            i10++;
        }
    }

    @Override // n2.k
    public final void release() {
    }
}
