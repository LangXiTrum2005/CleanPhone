package com.google.android.gms.internal.ads;

import android.util.LongSparseArray;
import android.util.SparseArray;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.io.InterruptedIOException;
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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p5 implements m2 {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final byte[] f18488m0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final byte[] f18489n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final byte[] f18490o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final byte[] f18491p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final UUID f18492q0;
    public static final Map r0;
    public boolean A;
    public int B;
    public long C;
    public final SparseArray D;
    public boolean E;
    public long F;
    public int G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public long L;
    public long M;
    public long N;
    public boolean O;
    public int P;
    public long Q;
    public long R;
    public int S;
    public int T;
    public int[] U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q5 f18493a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f18494a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f18495b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f18496b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LongSparseArray f18497c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f18498c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18499d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f18500d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18501e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f18502e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p7 f18503f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f18504f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final np0 f18505g;
    public boolean g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final np0 f18506h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f18507h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final np0 f18508i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public byte f18509i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final np0 f18510j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f18511j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final np0 f18512k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public o2 f18513k0;
    public final np0 l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final k5 f18514l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final np0 f18515m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final np0 f18516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final np0 f18517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final np0 f18518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f18519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f18520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f18521s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f18522t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f18523u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f18524v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18525w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18526x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l5 f18527y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o5 f18528z;

    static {
        String str = uu0.f20901a;
        f18489n0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f18490o0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f18491p0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f18492q0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        d5.u.p(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        d5.u.p(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        r0 = Collections.unmodifiableMap(map);
    }

    public p5() {
        this(new k5(0), 2, p7.R8);
    }

    public static byte[] q(long j10, long j11, String str) {
        ps1.v(j10 != C.TIME_UNSET);
        Locale locale = Locale.US;
        int i10 = (int) (j10 / 3600000000L);
        Integer numValueOf = Integer.valueOf(i10);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i11);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        String str3 = uu0.f20901a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    public final long a(long j10) throws ab {
        long j11 = this.f18522t;
        if (j11 != C.TIME_UNSET) {
            return uu0.v(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw ab.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final void b() {
        if (!this.f18526x) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f18495b;
            if (i10 >= sparseArray.size()) {
                o2 o2Var = this.f18513k0;
                o2Var.getClass();
                o2Var.zzv();
                this.f18526x = false;
                return;
            }
            if (((o5) sparseArray.valueAt(i10)).X) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(int i10, long j10, long j11) throws ab {
        o2 o2Var = this.f18513k0;
        o2Var.getClass();
        if (i10 == 128) {
            i(i10);
            this.f18527y.f16721h = null;
            i(i10);
            this.f18527y.f16722i = null;
            return;
        }
        if (i10 == 160) {
            this.Z = false;
            this.f18494a0 = 0L;
            return;
        }
        if (i10 == 174) {
            o5 o5Var = new o5();
            o5Var.f18136o = -1;
            o5Var.f18137p = -1;
            o5Var.f18138q = -1;
            o5Var.f18139r = -1;
            o5Var.f18140s = -1;
            o5Var.f18141t = 0;
            o5Var.f18142u = -1;
            o5Var.f18143v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            o5Var.f18144w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            o5Var.f18145x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            o5Var.f18146y = null;
            o5Var.f18147z = -1;
            o5Var.A = -1;
            o5Var.B = -1;
            o5Var.C = -1;
            o5Var.D = 1000;
            o5Var.E = 200;
            o5Var.F = -1.0f;
            o5Var.G = -1.0f;
            o5Var.H = -1.0f;
            o5Var.I = -1.0f;
            o5Var.J = -1.0f;
            o5Var.K = -1.0f;
            o5Var.L = -1.0f;
            o5Var.M = -1.0f;
            o5Var.N = -1.0f;
            o5Var.O = -1.0f;
            o5Var.Q = 1;
            o5Var.R = -1;
            o5Var.S = -1;
            o5Var.T = 8000;
            o5Var.U = 0L;
            o5Var.V = 0L;
            o5Var.X = false;
            o5Var.Z = true;
            o5Var.f18120a0 = "eng";
            this.f18528z = o5Var;
            o5Var.f18119a = this.f18525w;
            return;
        }
        if (i10 == 187) {
            if (this.A) {
                return;
            }
            k(i10);
            this.F = C.TIME_UNSET;
            return;
        }
        if (i10 == 19899) {
            this.B = -1;
            this.C = -1L;
            return;
        }
        if (i10 == 20533) {
            j(i10);
            this.f18528z.f18132j = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f18521s;
            if (j12 != -1 && j12 != j10) {
                throw ab.a(null, "Multiple Segment elements not supported");
            }
            this.f18521s = j10;
            this.f18520r = j11;
            return;
        }
        if (i10 == 475249515) {
            if (this.A) {
                return;
            }
            this.E = true;
            return;
        }
        if (i10 == 524531317) {
            if (this.A) {
                return;
            }
            if (this.f18499d && this.L != -1) {
                this.K = true;
                return;
            } else {
                o2Var.o(new r2(this.f18524v, 0L));
                this.A = true;
                return;
            }
        }
        if (i10 == 182) {
            l5 l5Var = new l5();
            l5Var.f16715b = C.TIME_UNSET;
            l5Var.f16716c = C.TIME_UNSET;
            this.f18527y = l5Var;
            return;
        }
        if (i10 == 183 && !this.A) {
            k(i10);
            this.G = -1;
            this.H = -1L;
            this.I = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) throws EOFException, InterruptedIOException {
        b2.w wVar = new b2.w((byte) 0, 1);
        h2 h2Var = (h2) n2Var;
        long j10 = h2Var.f15062c;
        long j11 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (j10 != -1 && j10 <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j11 = j10;
        }
        np0 np0Var = (np0) wVar.f5411c;
        h2Var.m(np0Var.f17880a, 0, 4, false);
        wVar.f5410b = 4;
        for (long jP = np0Var.P(); jP != 440786851; jP = ((jP << 8) & (-256)) | ((long) (np0Var.f17880a[0] & 255))) {
            int i10 = (int) j11;
            int i11 = wVar.f5410b + 1;
            wVar.f5410b = i11;
            if (i11 == i10) {
                return false;
            }
            h2Var.m(np0Var.f17880a, 0, 1, false);
        }
        long jN = wVar.n(h2Var);
        long j12 = wVar.f5410b;
        if (jN != Long.MIN_VALUE) {
            long j13 = j12 + jN;
            if (j10 == -1 || j13 < j10) {
                while (true) {
                    long j14 = wVar.f5410b;
                    if (j14 < j13) {
                        if (wVar.n(h2Var) == Long.MIN_VALUE) {
                            break;
                        }
                        long jN2 = wVar.n(h2Var);
                        if (jN2 < 0) {
                            break;
                        }
                        if (jN2 != 0) {
                            int i12 = (int) jN2;
                            h2Var.a(i12, false);
                            wVar.f5410b += i12;
                        }
                    } else if (j14 == j13) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        this.N = C.TIME_UNSET;
        this.P = 0;
        k5 k5Var = this.f18514l0;
        k5Var.f16319c = 0;
        k5Var.f16318b.clear();
        q5 q5Var = (q5) k5Var.f16322f;
        q5Var.f18932a = 0;
        q5Var.f18933b = 0;
        q5 q5Var2 = this.f18493a;
        q5Var2.f18932a = 0;
        q5Var2.f18933b = 0;
        o();
        this.E = false;
        this.F = C.TIME_UNSET;
        this.G = -1;
        this.H = -1L;
        this.I = -1L;
        if (!this.A) {
            this.D.clear();
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f18495b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            i3 i3Var = ((o5) sparseArray.valueAt(i10)).W;
            if (i3Var != null) {
                i3Var.f15549b = false;
                i3Var.f15550c = 0;
            }
            i10++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021d  */
    /* JADX WARN: Code duplicated, block: B:103:0x022b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0238  */
    /* JADX WARN: Code duplicated, block: B:108:0x025a  */
    /* JADX WARN: Code duplicated, block: B:330:0x057b  */
    /* JADX WARN: Code duplicated, block: B:408:0x06e9 A[LOOP:1: B:6:0x001a->B:408:0x06e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:418:0x072c  */
    /* JADX WARN: Code duplicated, block: B:419:0x0733  */
    /* JADX WARN: Code duplicated, block: B:422:0x073b  */
    /* JADX WARN: Code duplicated, block: B:424:0x073f  */
    /* JADX WARN: Code duplicated, block: B:425:0x0742  */
    /* JADX WARN: Code duplicated, block: B:426:0x0745  */
    /* JADX WARN: Code duplicated, block: B:428:0x074b  */
    /* JADX WARN: Code duplicated, block: B:429:0x0754  */
    /* JADX WARN: Code duplicated, block: B:430:0x075d  */
    /* JADX WARN: Code duplicated, block: B:431:0x0766  */
    /* JADX WARN: Code duplicated, block: B:432:0x076f  */
    /* JADX WARN: Code duplicated, block: B:433:0x0778  */
    /* JADX WARN: Code duplicated, block: B:434:0x0781  */
    /* JADX WARN: Code duplicated, block: B:435:0x078a  */
    /* JADX WARN: Code duplicated, block: B:436:0x0793  */
    /* JADX WARN: Code duplicated, block: B:437:0x079c  */
    /* JADX WARN: Code duplicated, block: B:438:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:439:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:440:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:441:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:442:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:487:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:489:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:490:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:493:0x08fa  */
    /* JADX WARN: Code duplicated, block: B:494:0x0903  */
    /* JADX WARN: Code duplicated, block: B:496:0x090d  */
    /* JADX WARN: Code duplicated, block: B:498:0x091e  */
    /* JADX WARN: Code duplicated, block: B:500:0x0924  */
    /* JADX WARN: Code duplicated, block: B:501:0x0927  */
    /* JADX WARN: Code duplicated, block: B:504:0x092b  */
    /* JADX WARN: Code duplicated, block: B:506:0x093f  */
    /* JADX WARN: Code duplicated, block: B:508:0x0952  */
    /* JADX WARN: Code duplicated, block: B:509:0x0955  */
    /* JADX WARN: Code duplicated, block: B:512:0x0959  */
    /* JADX WARN: Code duplicated, block: B:515:0x0965  */
    /* JADX WARN: Code duplicated, block: B:516:0x0973  */
    /* JADX WARN: Code duplicated, block: B:518:0x0977  */
    /* JADX WARN: Code duplicated, block: B:521:0x0982  */
    /* JADX WARN: Code duplicated, block: B:525:0x09a1 A[LOOP:17: B:522:0x0986->B:525:0x09a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:527:0x09ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:528:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:531:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:533:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:536:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:540:0x09f2 A[LOOP:20: B:539:0x09f0->B:540:0x09f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:542:0x0a09  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a1b A[LOOP:19: B:534:0x09cd->B:544:0x0a1b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:548:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:561:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:563:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:565:0x0a94  */
    /* JADX WARN: Code duplicated, block: B:567:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:568:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:569:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:573:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:575:0x0ab4 A[LOOP:14: B:575:0x0ab4->B:577:0x0aba, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:577:0x0aba A[LOOP:14: B:575:0x0ab4->B:577:0x0aba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:579:0x0ae8 A[LOOP:15: B:579:0x0ae8->B:581:0x0aef, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:581:0x0aef A[LOOP:15: B:579:0x0ae8->B:581:0x0aef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:585:0x0b0d  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b10  */
    /* JADX WARN: Code duplicated, block: B:588:0x0b13  */
    /* JADX WARN: Code duplicated, block: B:590:0x0b1a  */
    /* JADX WARN: Code duplicated, block: B:592:0x0b20 A[LOOP:21: B:589:0x0b18->B:592:0x0b20, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:596:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:598:0x0b33  */
    /* JADX WARN: Code duplicated, block: B:600:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:602:0x0b3b  */
    /* JADX WARN: Code duplicated, block: B:604:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:607:0x0b46  */
    /* JADX WARN: Code duplicated, block: B:608:0x0b4e  */
    /* JADX WARN: Code duplicated, block: B:609:0x0b56  */
    /* JADX WARN: Code duplicated, block: B:610:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:618:0x0b98  */
    /* JADX WARN: Code duplicated, block: B:619:0x0ba0  */
    /* JADX WARN: Code duplicated, block: B:625:0x0bd3  */
    /* JADX WARN: Code duplicated, block: B:630:0x0c28  */
    /* JADX WARN: Code duplicated, block: B:634:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0c41  */
    /* JADX WARN: Code duplicated, block: B:644:0x0c59  */
    /* JADX WARN: Code duplicated, block: B:646:0x0c68  */
    /* JADX WARN: Code duplicated, block: B:650:0x0c75 A[LOOP:0: B:3:0x0009->B:650:0x0c75, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:662:0x0aa9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x0a53 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0a4b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0bac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x0be0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x0c30 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x0c47 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x0c50 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x06f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x07d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0b03 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x0bcd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x0c01 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x0c72 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0c6f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:714:0x0ae3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:0x0891 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x09a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x0a5b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:721:0x0a23 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x09de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:0x0b22 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:94:0x0203  */
    /* JADX WARN: Code duplicated, block: B:98:0x0211  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        boolean z10;
        long j10;
        int i10;
        p5 p5Var;
        boolean z11;
        long j11;
        long j12;
        int i11;
        byte[] bArr;
        String str;
        int i12;
        int i13;
        np0 np0Var;
        SparseArray sparseArray;
        boolean z12;
        long j13;
        o5 o5Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int length;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        long j14;
        int i27;
        int i28;
        long j15;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int[] iArr2;
        int length2;
        boolean z13;
        long j16;
        int i38;
        long jB;
        double dLongBitsToDouble;
        long j17;
        int i39;
        char c4;
        int i40;
        SparseArray sparseArray2;
        o5 o5Var2;
        i3 i3Var;
        long jZzn;
        long j18;
        String str2;
        int i41;
        SparseArray sparseArray3;
        int i42;
        o5 o5Var3;
        long j19;
        long j20;
        long j21;
        int i43;
        List list;
        int i44;
        int iMin;
        double d10;
        int i45;
        SparseArray sparseArray4;
        int i46;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        int i47;
        long j28;
        long j29;
        double d11;
        s8 s8Var;
        n4 n4Var;
        s8 s8VarC;
        int i48;
        int i49 = 0;
        this.O = false;
        while (!this.O) {
            k5 k5Var = this.f18514l0;
            q5 q5Var = (q5) k5Var.f16322f;
            ((vf) k5Var.f16323g).getClass();
            while (true) {
                ArrayDeque arrayDeque = k5Var.f16318b;
                j5 j5Var = (j5) arrayDeque.peek();
                int i50 = -1;
                int i51 = 8;
                int i52 = 374648427;
                if (j5Var == null || n2Var.zzn() < j5Var.f15983b) {
                    int i53 = k5Var.f16319c;
                    if (i53 == 0) {
                        int i54 = 0;
                        long jC = q5Var.c(n2Var, true, false, 4);
                        if (jC == -2) {
                            n2Var.zzl();
                            while (true) {
                                byte[] bArr2 = k5Var.f16317a;
                                n2Var.v(bArr2, i54, 4);
                                byte b10 = bArr2[i54];
                                int i55 = i51;
                                int i56 = 0;
                                while (true) {
                                    if (i56 < i55) {
                                        i39 = i56 + 1;
                                        j10 = 0;
                                        if ((q5.f18929d[i56] & ((long) b10)) == 0) {
                                            i56 = i39;
                                            i55 = 8;
                                        }
                                    } else {
                                        j10 = 0;
                                        i39 = -1;
                                    }
                                }
                                if (i39 == -1 || i39 > 4) {
                                    c4 = 43366;
                                } else {
                                    int iE = (int) q5.e(bArr2, i39, false);
                                    Object obj = ((vf) k5Var.f16323g).f21157b;
                                    c4 = 43366;
                                    if (iE == 357149030 || iE == 272869232 || iE == 524531317 || iE == 475249515) {
                                        i52 = iE;
                                    } else if (iE == 374648427) {
                                    }
                                }
                                n2Var.zzf(1);
                                i54 = 0;
                                i51 = 8;
                            }
                            n2Var.zzf(i39);
                            j17 = i52;
                        } else {
                            j10 = 0;
                            j17 = jC;
                        }
                        z10 = true;
                        if (j17 == -1) {
                            z13 = false;
                        } else {
                            k5Var.f16320d = (int) j17;
                            k5Var.f16319c = 1;
                        }
                    } else {
                        z10 = true;
                        j10 = 0;
                        if (i53 == 1) {
                        }
                        vf vfVar = (vf) k5Var.f16323g;
                        i10 = k5Var.f16320d;
                        p5Var = (p5) vfVar.f21157b;
                        switch (i10) {
                            case 128:
                            case 143:
                            case 160:
                            case 166:
                            case 174:
                            case 182:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 17849:
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
                            case 272869232:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                long jZzn2 = n2Var.zzn();
                                arrayDeque.push(new j5(i10, k5Var.f16321e + jZzn2));
                                ((p5) ((vf) k5Var.f16323g).f21157b).c(k5Var.f16320d, jZzn2, k5Var.f16321e);
                                z11 = false;
                                k5Var.f16319c = 0;
                                break;
                            case 131:
                            case 136:
                            case 137:
                            case 145:
                            case 146:
                            case 152:
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
                            case 29636:
                            case 29637:
                            case 30114:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                j11 = k5Var.f16321e;
                                if (j11 <= 8) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 22);
                                    sb2.append("Invalid integer size: ");
                                    sb2.append(j11);
                                    throw ab.a(null, sb2.toString());
                                }
                                p5Var.h(i10, k5Var.b(n2Var, (int) j11));
                                z11 = false;
                                k5Var.f16319c = 0;
                                break;
                                break;
                            case 133:
                            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                            case 17026:
                            case 17276:
                            case 21358:
                            case 2274716:
                                j12 = k5Var.f16321e;
                                if (j12 <= 2147483647L) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(j12).length() + 21);
                                    sb3.append("String element size: ");
                                    sb3.append(j12);
                                    throw ab.a(null, sb3.toString());
                                }
                                i11 = (int) j12;
                                if (i11 == 0) {
                                    str = "";
                                } else {
                                    bArr = new byte[i11];
                                    n2Var.p(bArr, 0, i11);
                                    while (i11 > 0) {
                                        i12 = i11 - 1;
                                        if (bArr[i12] == 0) {
                                            i11 = i12;
                                        } else {
                                            str = new String(bArr, 0, i11);
                                        }
                                    }
                                    str = new String(bArr, 0, i11);
                                }
                                p5Var.getClass();
                                if (i10 != 133) {
                                    p5Var.i(i10);
                                    p5Var.f18527y.f16721h = str;
                                } else if (i10 != 134) {
                                    p5Var.j(i10);
                                    p5Var.f18528z.f18123c = str;
                                } else if (i10 != 17026) {
                                    if ("webm".equals(str) && !"matroska".equals(str)) {
                                        StringBuilder sb4 = new StringBuilder(str.length() + 22);
                                        sb4.append("DocType ");
                                        sb4.append(str);
                                        sb4.append(" not supported");
                                        throw ab.a(null, sb4.toString());
                                    }
                                    p5Var.f18525w = str.equals("webm");
                                } else if (i10 != 17276) {
                                    p5Var.i(i10);
                                    p5Var.f18527y.f16722i = str;
                                } else if (i10 != 21358) {
                                    p5Var.j(i10);
                                    p5Var.f18528z.f18121b = str;
                                } else if (i10 == 2274716) {
                                    p5Var.j(i10);
                                    p5Var.f18528z.f18120a0 = str;
                                }
                                z11 = false;
                                k5Var.f16319c = 0;
                                break;
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
                                i13 = (int) k5Var.f16321e;
                                np0Var = p5Var.f18508i;
                                sparseArray = p5Var.f18495b;
                                if (i10 != 161 || i10 == 163) {
                                    z12 = false;
                                    if (p5Var.P == 0) {
                                        q5 q5Var2 = p5Var.f18493a;
                                        j13 = 2147483647L;
                                        p5Var.V = (int) q5Var2.c(n2Var, false, true, 8);
                                        p5Var.W = q5Var2.f18933b;
                                        p5Var.R = C.TIME_UNSET;
                                        p5Var.P = 1;
                                        np0Var.y(0);
                                    } else {
                                        j13 = 2147483647L;
                                    }
                                    o5Var = (o5) sparseArray.get(p5Var.V);
                                    if (o5Var == null) {
                                        n2Var.zzf(i13 - p5Var.W);
                                        p5Var.P = 0;
                                        z11 = z12;
                                    } else {
                                        o5Var.f18122b0.getClass();
                                        if (p5Var.P == 1) {
                                            p5Var.m(n2Var, 3);
                                            i17 = (np0Var.f17880a[2] & 6) >> 1;
                                            if (i17 == 0) {
                                                p5Var.T = 1;
                                                iArr2 = p5Var.U;
                                                if (iArr2 == null) {
                                                    iArr2 = new int[1];
                                                } else {
                                                    length2 = iArr2.length;
                                                    if (length2 < 1) {
                                                        iArr2 = new int[Math.max(length2 + length2, 1)];
                                                    }
                                                }
                                                p5Var.U = iArr2;
                                                iArr2[0] = (i13 - p5Var.W) - 3;
                                            } else {
                                                p5Var.m(n2Var, 4);
                                                i18 = (np0Var.f17880a[3] & 255) + 1;
                                                p5Var.T = i18;
                                                iArr = p5Var.U;
                                                if (iArr == null) {
                                                    iArr = new int[i18];
                                                } else {
                                                    length = iArr.length;
                                                    if (length < i18) {
                                                        iArr = new int[Math.max(length + length, i18)];
                                                    }
                                                }
                                                p5Var.U = iArr;
                                                if (i17 == 2) {
                                                    int i57 = (i13 - p5Var.W) - 4;
                                                    int i58 = p5Var.T;
                                                    Arrays.fill(iArr, 0, i58, i57 / i58);
                                                } else {
                                                    i19 = 0;
                                                    if (i17 == 1) {
                                                        i29 = 0;
                                                        i30 = 0;
                                                        i31 = 4;
                                                        while (true) {
                                                            i32 = p5Var.T - 1;
                                                            if (i29 < i32) {
                                                                p5Var.U[i29] = i19;
                                                                while (true) {
                                                                    i33 = i31 + 1;
                                                                    p5Var.m(n2Var, i33);
                                                                    i34 = np0Var.f17880a[i31] & 255;
                                                                    int[] iArr3 = p5Var.U;
                                                                    i35 = iArr3[i29] + i34;
                                                                    iArr3[i29] = i35;
                                                                    if (i34 != 255) {
                                                                    }
                                                                    i31 = i33;
                                                                    break;
                                                                }
                                                                i30 += i35;
                                                                i29++;
                                                                i31 = i33;
                                                                i19 = 0;
                                                            } else {
                                                                p5Var.U[i32] = ((i13 - p5Var.W) - i31) - i30;
                                                            }
                                                        }
                                                    } else {
                                                        if (i17 != 3) {
                                                            throw ab.a(null, "Unexpected lacing value: 2");
                                                        }
                                                        i20 = 4;
                                                        i21 = 0;
                                                        i22 = 0;
                                                        while (true) {
                                                            i23 = p5Var.T - 1;
                                                            if (i21 < i23) {
                                                                p5Var.U[i21] = 0;
                                                                i24 = i20 + 1;
                                                                p5Var.m(n2Var, i24);
                                                                if (np0Var.f17880a[i20] == 0) {
                                                                    throw ab.a(null, "No valid varint length mask found");
                                                                }
                                                                i25 = 0;
                                                                while (true) {
                                                                    if (i25 < 8) {
                                                                        i27 = 1 << (7 - i25);
                                                                        if ((np0Var.f17880a[i20] & i27) != 0) {
                                                                            i28 = i24 + i25;
                                                                            p5Var.m(n2Var, i28);
                                                                            int i59 = np0Var.f17880a[i20] & 255 & (~i27);
                                                                            i26 = i21;
                                                                            j15 = i59;
                                                                            while (i24 < i28) {
                                                                                j15 = (j15 << 8) | ((long) (np0Var.f17880a[i24] & 255));
                                                                                i24++;
                                                                            }
                                                                            if (i26 > 0) {
                                                                                j15 -= (1 << ((i25 * 7) + 6)) - 1;
                                                                            }
                                                                            long j30 = j15;
                                                                            i20 = i28;
                                                                            j14 = j30;
                                                                        } else {
                                                                            i25++;
                                                                        }
                                                                    } else {
                                                                        i26 = i21;
                                                                        i20 = i24;
                                                                        j14 = j10;
                                                                    }
                                                                }
                                                                if (j14 >= -2147483648L || j14 > j13) {
                                                                    throw ab.a(null, "EBML lacing sample size out of range.");
                                                                }
                                                                int[] iArr4 = p5Var.U;
                                                                int i60 = (int) j14;
                                                                if (i26 != 0) {
                                                                    i60 += iArr4[i26 - 1];
                                                                }
                                                                iArr4[i26] = i60;
                                                                i22 += i60;
                                                                i21 = i26 + 1;
                                                                i13 = i13;
                                                            } else {
                                                                p5Var.U[i23] = ((i13 - p5Var.W) - i20) - i22;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            byte[] bArr3 = np0Var.f17880a;
                                            p5Var.Q = p5Var.a((bArr3[1] & 255) | (bArr3[0] << 8)) + p5Var.N;
                                            if (o5Var.f18128f == 1) {
                                                i36 = 2;
                                                i37 = 1;
                                            } else if (i10 == 163) {
                                                i36 = 2;
                                                if ((np0Var.f17880a[2] & 128) == 128) {
                                                    i37 = 1;
                                                } else {
                                                    i37 = 0;
                                                }
                                                i10 = 163;
                                            } else {
                                                i36 = 2;
                                                i37 = 0;
                                            }
                                            p5Var.X = i37;
                                            p5Var.P = i36;
                                            p5Var.S = 0;
                                            i14 = 163;
                                        } else {
                                            i14 = 163;
                                        }
                                        if (i10 == i14) {
                                            while (true) {
                                                i16 = p5Var.S;
                                                if (i16 < p5Var.T) {
                                                    p5Var.l(o5Var, p5Var.Q + ((long) ((p5Var.S * o5Var.f18129g) / 1000)), p5Var.X, p5Var.n(n2Var, o5Var, p5Var.U[i16], false), 0);
                                                    p5Var.S++;
                                                } else {
                                                    z11 = false;
                                                    p5Var.P = 0;
                                                }
                                            }
                                        } else {
                                            while (true) {
                                                i15 = p5Var.S;
                                                if (i15 < p5Var.T) {
                                                    int[] iArr5 = p5Var.U;
                                                    iArr5[i15] = p5Var.n(n2Var, o5Var, iArr5[i15], true);
                                                    p5Var.S++;
                                                } else {
                                                    z11 = false;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (i10 != 165) {
                                        if (i10 == 16877) {
                                            p5Var.j(i10);
                                            o5 o5Var4 = p5Var.f18528z;
                                            int i61 = o5Var4.f18131i;
                                            if (i61 == 1685485123 || i61 == 1685480259) {
                                                byte[] bArr4 = new byte[i13];
                                                o5Var4.P = bArr4;
                                                z11 = false;
                                                n2Var.p(bArr4, 0, i13);
                                            } else {
                                                n2Var.zzf(i13);
                                            }
                                        } else if (i10 == 16981) {
                                            z11 = false;
                                            p5Var.j(i10);
                                            byte[] bArr5 = new byte[i13];
                                            p5Var.f18528z.f18133k = bArr5;
                                            n2Var.p(bArr5, 0, i13);
                                        } else if (i10 == 18402) {
                                            z11 = false;
                                            byte[] bArr6 = new byte[i13];
                                            n2Var.p(bArr6, 0, i13);
                                            p5Var.j(i10);
                                            p5Var.f18528z.l = new g3(1, bArr6, 0, 0);
                                        } else if (i10 == 21419) {
                                            z11 = false;
                                            np0 np0Var2 = p5Var.f18512k;
                                            Arrays.fill(np0Var2.f17880a, (byte) 0);
                                            n2Var.p(np0Var2.f17880a, 4 - i13, i13);
                                            np0Var2.E(0);
                                            p5Var.B = (int) np0Var2.P();
                                        } else if (i10 == 25506) {
                                            p5Var.j(i10);
                                            byte[] bArr7 = new byte[i13];
                                            p5Var.f18528z.f18134m = bArr7;
                                            z11 = false;
                                            n2Var.p(bArr7, 0, i13);
                                        } else {
                                            if (i10 != 30322) {
                                                StringBuilder sb5 = new StringBuilder(String.valueOf(i10).length() + 15);
                                                sb5.append("Unexpected id: ");
                                                sb5.append(i10);
                                                throw ab.a(null, sb5.toString());
                                            }
                                            p5Var.j(i10);
                                            byte[] bArr8 = new byte[i13];
                                            p5Var.f18528z.f18146y = bArr8;
                                            z11 = false;
                                            n2Var.p(bArr8, 0, i13);
                                        }
                                    } else if (p5Var.P == 2) {
                                        o5 o5Var5 = (o5) sparseArray.get(p5Var.V);
                                        if (p5Var.Y == 4 && "V_VP9".equals(o5Var5.f18123c)) {
                                            np0 np0Var3 = p5Var.f18518p;
                                            np0Var3.y(i13);
                                            z12 = false;
                                            n2Var.p(np0Var3.f17880a, 0, i13);
                                        } else {
                                            z12 = false;
                                            n2Var.zzf(i13);
                                        }
                                        z11 = z12;
                                    }
                                    z11 = false;
                                }
                                k5Var.f16319c = z11 ? 1 : 0;
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
                                j16 = k5Var.f16321e;
                                if (j16 == 4 && j16 != 8) {
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(j16).length() + 20);
                                    sb6.append("Invalid float size: ");
                                    sb6.append(j16);
                                    throw ab.a(null, sb6.toString());
                                }
                                i38 = (int) j16;
                                jB = k5Var.b(n2Var, i38);
                                if (i38 == 4) {
                                    dLongBitsToDouble = Float.intBitsToFloat((int) jB);
                                } else {
                                    dLongBitsToDouble = Double.longBitsToDouble(jB);
                                }
                                if (i10 != 181) {
                                    p5Var.j(i10);
                                    p5Var.f18528z.T = (int) dLongBitsToDouble;
                                } else if (i10 != 17545) {
                                    switch (i10) {
                                        case 21969:
                                            p5Var.j(i10);
                                            p5Var.f18528z.F = (float) dLongBitsToDouble;
                                            break;
                                        case 21970:
                                            p5Var.j(i10);
                                            p5Var.f18528z.G = (float) dLongBitsToDouble;
                                            break;
                                        case 21971:
                                            p5Var.j(i10);
                                            p5Var.f18528z.H = (float) dLongBitsToDouble;
                                            break;
                                        case 21972:
                                            p5Var.j(i10);
                                            p5Var.f18528z.I = (float) dLongBitsToDouble;
                                            break;
                                        case 21973:
                                            p5Var.j(i10);
                                            p5Var.f18528z.J = (float) dLongBitsToDouble;
                                            break;
                                        case 21974:
                                            p5Var.j(i10);
                                            p5Var.f18528z.K = (float) dLongBitsToDouble;
                                            break;
                                        case 21975:
                                            p5Var.j(i10);
                                            p5Var.f18528z.L = (float) dLongBitsToDouble;
                                            break;
                                        case 21976:
                                            p5Var.j(i10);
                                            p5Var.f18528z.M = (float) dLongBitsToDouble;
                                            break;
                                        case 21977:
                                            p5Var.j(i10);
                                            p5Var.f18528z.N = (float) dLongBitsToDouble;
                                            break;
                                        case 21978:
                                            p5Var.j(i10);
                                            p5Var.f18528z.O = (float) dLongBitsToDouble;
                                            break;
                                        default:
                                            switch (i10) {
                                                case 30323:
                                                    p5Var.j(i10);
                                                    p5Var.f18528z.f18143v = (float) dLongBitsToDouble;
                                                    break;
                                                case 30324:
                                                    p5Var.j(i10);
                                                    p5Var.f18528z.f18144w = (float) dLongBitsToDouble;
                                                    break;
                                                case 30325:
                                                    p5Var.j(i10);
                                                    p5Var.f18528z.f18145x = (float) dLongBitsToDouble;
                                                    break;
                                                default:
                                                    p5Var.getClass();
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    p5Var.f18523u = (long) dLongBitsToDouble;
                                }
                                z11 = false;
                                k5Var.f16319c = 0;
                                break;
                                break;
                            default:
                                n2Var.zzf((int) k5Var.f16321e);
                                k5Var.f16319c = 0;
                                break;
                        }
                        z13 = true;
                        if (z13) {
                            jZzn = n2Var.zzn();
                            if (this.K) {
                                this.M = jZzn;
                                q2Var.f18888a = this.L;
                                this.K = z11;
                                return 1;
                            }
                            if (this.A) {
                                j18 = this.M;
                                if (j18 != -1) {
                                    q2Var.f18888a = j18;
                                    this.M = -1L;
                                    return 1;
                                }
                            }
                        }
                        if (z13) {
                            i49 = 0;
                        } else {
                            i40 = 0;
                            while (true) {
                                sparseArray2 = this.f18495b;
                                if (i40 >= sparseArray2.size()) {
                                    return -1;
                                }
                                o5Var2 = (o5) sparseArray2.valueAt(i40);
                                o5Var2.f18122b0.getClass();
                                i3Var = o5Var2.W;
                                if (i3Var != null) {
                                    i3Var.f(o5Var2.f18122b0, o5Var2.l);
                                }
                                i40++;
                            }
                        }
                    }
                    k5Var.f16321e = q5Var.c(n2Var, false, z10, 8);
                    k5Var.f16319c = 2;
                    vf vfVar2 = (vf) k5Var.f16323g;
                    i10 = k5Var.f16320d;
                    p5Var = (p5) vfVar2.f21157b;
                    switch (i10) {
                        case 128:
                        case 143:
                        case 160:
                        case 166:
                        case 174:
                        case 182:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 17849:
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
                        case 272869232:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            long jZzn3 = n2Var.zzn();
                            arrayDeque.push(new j5(i10, k5Var.f16321e + jZzn3));
                            ((p5) ((vf) k5Var.f16323g).f21157b).c(k5Var.f16320d, jZzn3, k5Var.f16321e);
                            z11 = false;
                            k5Var.f16319c = 0;
                            break;
                        case 131:
                        case 136:
                        case 137:
                        case 145:
                        case 146:
                        case 152:
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
                        case 29636:
                        case 29637:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            j11 = k5Var.f16321e;
                            if (j11 <= 8) {
                                StringBuilder sb7 = new StringBuilder(String.valueOf(j11).length() + 22);
                                sb7.append("Invalid integer size: ");
                                sb7.append(j11);
                                throw ab.a(null, sb7.toString());
                            }
                            p5Var.h(i10, k5Var.b(n2Var, (int) j11));
                            z11 = false;
                            k5Var.f16319c = 0;
                            break;
                            break;
                        case 133:
                        case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                        case 17026:
                        case 17276:
                        case 21358:
                        case 2274716:
                            j12 = k5Var.f16321e;
                            if (j12 <= 2147483647L) {
                                StringBuilder sb8 = new StringBuilder(String.valueOf(j12).length() + 21);
                                sb8.append("String element size: ");
                                sb8.append(j12);
                                throw ab.a(null, sb8.toString());
                            }
                            i11 = (int) j12;
                            if (i11 == 0) {
                                str = "";
                            } else {
                                bArr = new byte[i11];
                                n2Var.p(bArr, 0, i11);
                                while (i11 > 0) {
                                    i12 = i11 - 1;
                                    if (bArr[i12] == 0) {
                                        i11 = i12;
                                    } else {
                                        str = new String(bArr, 0, i11);
                                    }
                                }
                                str = new String(bArr, 0, i11);
                            }
                            p5Var.getClass();
                            if (i10 != 133) {
                                p5Var.i(i10);
                                p5Var.f18527y.f16721h = str;
                            } else if (i10 != 134) {
                                p5Var.j(i10);
                                p5Var.f18528z.f18123c = str;
                            } else if (i10 != 17026) {
                                if ("webm".equals(str)) {
                                }
                                p5Var.f18525w = str.equals("webm");
                                break;
                            } else if (i10 != 17276) {
                                p5Var.i(i10);
                                p5Var.f18527y.f16722i = str;
                            } else if (i10 != 21358) {
                                p5Var.j(i10);
                                p5Var.f18528z.f18121b = str;
                            } else if (i10 == 2274716) {
                                p5Var.j(i10);
                                p5Var.f18528z.f18120a0 = str;
                            }
                            z11 = false;
                            k5Var.f16319c = 0;
                            break;
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
                            i13 = (int) k5Var.f16321e;
                            np0Var = p5Var.f18508i;
                            sparseArray = p5Var.f18495b;
                            if (i10 != 161) {
                                z12 = false;
                                if (p5Var.P == 0) {
                                    q5 q5Var3 = p5Var.f18493a;
                                    j13 = 2147483647L;
                                    p5Var.V = (int) q5Var3.c(n2Var, false, true, 8);
                                    p5Var.W = q5Var3.f18933b;
                                    p5Var.R = C.TIME_UNSET;
                                    p5Var.P = 1;
                                    np0Var.y(0);
                                } else {
                                    j13 = 2147483647L;
                                }
                                o5Var = (o5) sparseArray.get(p5Var.V);
                                if (o5Var == null) {
                                    n2Var.zzf(i13 - p5Var.W);
                                    p5Var.P = 0;
                                    z11 = z12;
                                } else {
                                    o5Var.f18122b0.getClass();
                                    if (p5Var.P == 1) {
                                        p5Var.m(n2Var, 3);
                                        i17 = (np0Var.f17880a[2] & 6) >> 1;
                                        if (i17 == 0) {
                                            p5Var.T = 1;
                                            iArr2 = p5Var.U;
                                            if (iArr2 == null) {
                                                iArr2 = new int[1];
                                            } else {
                                                length2 = iArr2.length;
                                                if (length2 < 1) {
                                                    iArr2 = new int[Math.max(length2 + length2, 1)];
                                                }
                                            }
                                            p5Var.U = iArr2;
                                            iArr2[0] = (i13 - p5Var.W) - 3;
                                        } else {
                                            p5Var.m(n2Var, 4);
                                            i18 = (np0Var.f17880a[3] & 255) + 1;
                                            p5Var.T = i18;
                                            iArr = p5Var.U;
                                            if (iArr == null) {
                                                iArr = new int[i18];
                                            } else {
                                                length = iArr.length;
                                                if (length < i18) {
                                                    iArr = new int[Math.max(length + length, i18)];
                                                }
                                            }
                                            p5Var.U = iArr;
                                            if (i17 == 2) {
                                                int i510 = (i13 - p5Var.W) - 4;
                                                int i511 = p5Var.T;
                                                Arrays.fill(iArr, 0, i511, i510 / i511);
                                            } else {
                                                i19 = 0;
                                                if (i17 == 1) {
                                                    i29 = 0;
                                                    i30 = 0;
                                                    i31 = 4;
                                                    while (true) {
                                                        i32 = p5Var.T - 1;
                                                        if (i29 < i32) {
                                                            p5Var.U[i29] = i19;
                                                            while (true) {
                                                                i33 = i31 + 1;
                                                                p5Var.m(n2Var, i33);
                                                                i34 = np0Var.f17880a[i31] & 255;
                                                                int[] iArr6 = p5Var.U;
                                                                i35 = iArr6[i29] + i34;
                                                                iArr6[i29] = i35;
                                                                if (i34 != 255) {
                                                                }
                                                                i31 = i33;
                                                                break;
                                                            }
                                                            i30 += i35;
                                                            i29++;
                                                            i31 = i33;
                                                            i19 = 0;
                                                        } else {
                                                            p5Var.U[i32] = ((i13 - p5Var.W) - i31) - i30;
                                                        }
                                                    }
                                                } else {
                                                    if (i17 != 3) {
                                                        throw ab.a(null, "Unexpected lacing value: 2");
                                                    }
                                                    i20 = 4;
                                                    i21 = 0;
                                                    i22 = 0;
                                                    while (true) {
                                                        i23 = p5Var.T - 1;
                                                        if (i21 < i23) {
                                                            p5Var.U[i21] = 0;
                                                            i24 = i20 + 1;
                                                            p5Var.m(n2Var, i24);
                                                            if (np0Var.f17880a[i20] == 0) {
                                                                throw ab.a(null, "No valid varint length mask found");
                                                            }
                                                            i25 = 0;
                                                            while (true) {
                                                                if (i25 < 8) {
                                                                    i27 = 1 << (7 - i25);
                                                                    if ((np0Var.f17880a[i20] & i27) != 0) {
                                                                        i28 = i24 + i25;
                                                                        p5Var.m(n2Var, i28);
                                                                        int i512 = np0Var.f17880a[i20] & 255 & (~i27);
                                                                        i26 = i21;
                                                                        j15 = i512;
                                                                        while (i24 < i28) {
                                                                            j15 = (j15 << 8) | ((long) (np0Var.f17880a[i24] & 255));
                                                                            i24++;
                                                                        }
                                                                        if (i26 > 0) {
                                                                            j15 -= (1 << ((i25 * 7) + 6)) - 1;
                                                                        }
                                                                        long j31 = j15;
                                                                        i20 = i28;
                                                                        j14 = j31;
                                                                    } else {
                                                                        i25++;
                                                                    }
                                                                } else {
                                                                    i26 = i21;
                                                                    i20 = i24;
                                                                    j14 = j10;
                                                                }
                                                            }
                                                            if (j14 >= -2147483648L) {
                                                            }
                                                            throw ab.a(null, "EBML lacing sample size out of range.");
                                                        }
                                                        p5Var.U[i23] = ((i13 - p5Var.W) - i20) - i22;
                                                        iArr4[i26] = i60;
                                                        i22 += i60;
                                                        i21 = i26 + 1;
                                                        i13 = i13;
                                                    }
                                                }
                                            }
                                        }
                                        byte[] bArr9 = np0Var.f17880a;
                                        p5Var.Q = p5Var.a((bArr9[1] & 255) | (bArr9[0] << 8)) + p5Var.N;
                                        if (o5Var.f18128f == 1) {
                                            i36 = 2;
                                            i37 = 1;
                                        } else if (i10 == 163) {
                                            i36 = 2;
                                            if ((np0Var.f17880a[2] & 128) == 128) {
                                                i37 = 1;
                                            } else {
                                                i37 = 0;
                                            }
                                            i10 = 163;
                                        } else {
                                            i36 = 2;
                                            i37 = 0;
                                        }
                                        p5Var.X = i37;
                                        p5Var.P = i36;
                                        p5Var.S = 0;
                                        i14 = 163;
                                    } else {
                                        i14 = 163;
                                    }
                                    if (i10 == i14) {
                                        while (true) {
                                            i16 = p5Var.S;
                                            if (i16 < p5Var.T) {
                                                p5Var.l(o5Var, p5Var.Q + ((long) ((p5Var.S * o5Var.f18129g) / 1000)), p5Var.X, p5Var.n(n2Var, o5Var, p5Var.U[i16], false), 0);
                                                p5Var.S++;
                                            } else {
                                                z11 = false;
                                                p5Var.P = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i15 = p5Var.S;
                                            if (i15 < p5Var.T) {
                                                int[] iArr7 = p5Var.U;
                                                iArr7[i15] = p5Var.n(n2Var, o5Var, iArr7[i15], true);
                                                p5Var.S++;
                                            } else {
                                                z11 = false;
                                            }
                                        }
                                    }
                                }
                            } else {
                                z12 = false;
                                if (p5Var.P == 0) {
                                    q5 q5Var4 = p5Var.f18493a;
                                    j13 = 2147483647L;
                                    p5Var.V = (int) q5Var4.c(n2Var, false, true, 8);
                                    p5Var.W = q5Var4.f18933b;
                                    p5Var.R = C.TIME_UNSET;
                                    p5Var.P = 1;
                                    np0Var.y(0);
                                } else {
                                    j13 = 2147483647L;
                                }
                                o5Var = (o5) sparseArray.get(p5Var.V);
                                if (o5Var == null) {
                                    n2Var.zzf(i13 - p5Var.W);
                                    p5Var.P = 0;
                                    z11 = z12;
                                } else {
                                    o5Var.f18122b0.getClass();
                                    if (p5Var.P == 1) {
                                        p5Var.m(n2Var, 3);
                                        i17 = (np0Var.f17880a[2] & 6) >> 1;
                                        if (i17 == 0) {
                                            p5Var.T = 1;
                                            iArr2 = p5Var.U;
                                            if (iArr2 == null) {
                                                iArr2 = new int[1];
                                            } else {
                                                length2 = iArr2.length;
                                                if (length2 < 1) {
                                                    iArr2 = new int[Math.max(length2 + length2, 1)];
                                                }
                                            }
                                            p5Var.U = iArr2;
                                            iArr2[0] = (i13 - p5Var.W) - 3;
                                        } else {
                                            p5Var.m(n2Var, 4);
                                            i18 = (np0Var.f17880a[3] & 255) + 1;
                                            p5Var.T = i18;
                                            iArr = p5Var.U;
                                            if (iArr == null) {
                                                iArr = new int[i18];
                                            } else {
                                                length = iArr.length;
                                                if (length < i18) {
                                                    iArr = new int[Math.max(length + length, i18)];
                                                }
                                            }
                                            p5Var.U = iArr;
                                            if (i17 == 2) {
                                                int i513 = (i13 - p5Var.W) - 4;
                                                int i514 = p5Var.T;
                                                Arrays.fill(iArr, 0, i514, i513 / i514);
                                            } else {
                                                i19 = 0;
                                                if (i17 == 1) {
                                                    i29 = 0;
                                                    i30 = 0;
                                                    i31 = 4;
                                                    while (true) {
                                                        i32 = p5Var.T - 1;
                                                        if (i29 < i32) {
                                                            p5Var.U[i29] = i19;
                                                            while (true) {
                                                                i33 = i31 + 1;
                                                                p5Var.m(n2Var, i33);
                                                                i34 = np0Var.f17880a[i31] & 255;
                                                                int[] iArr8 = p5Var.U;
                                                                i35 = iArr8[i29] + i34;
                                                                iArr8[i29] = i35;
                                                                if (i34 != 255) {
                                                                }
                                                                i31 = i33;
                                                                break;
                                                            }
                                                            i30 += i35;
                                                            i29++;
                                                            i31 = i33;
                                                            i19 = 0;
                                                        } else {
                                                            p5Var.U[i32] = ((i13 - p5Var.W) - i31) - i30;
                                                        }
                                                    }
                                                } else {
                                                    if (i17 != 3) {
                                                        throw ab.a(null, "Unexpected lacing value: 2");
                                                    }
                                                    i20 = 4;
                                                    i21 = 0;
                                                    i22 = 0;
                                                    while (true) {
                                                        i23 = p5Var.T - 1;
                                                        if (i21 < i23) {
                                                            p5Var.U[i21] = 0;
                                                            i24 = i20 + 1;
                                                            p5Var.m(n2Var, i24);
                                                            if (np0Var.f17880a[i20] == 0) {
                                                                throw ab.a(null, "No valid varint length mask found");
                                                            }
                                                            i25 = 0;
                                                            while (true) {
                                                                if (i25 < 8) {
                                                                    i27 = 1 << (7 - i25);
                                                                    if ((np0Var.f17880a[i20] & i27) != 0) {
                                                                        i28 = i24 + i25;
                                                                        p5Var.m(n2Var, i28);
                                                                        int i515 = np0Var.f17880a[i20] & 255 & (~i27);
                                                                        i26 = i21;
                                                                        j15 = i515;
                                                                        while (i24 < i28) {
                                                                            j15 = (j15 << 8) | ((long) (np0Var.f17880a[i24] & 255));
                                                                            i24++;
                                                                        }
                                                                        if (i26 > 0) {
                                                                            j15 -= (1 << ((i25 * 7) + 6)) - 1;
                                                                        }
                                                                        long j32 = j15;
                                                                        i20 = i28;
                                                                        j14 = j32;
                                                                    } else {
                                                                        i25++;
                                                                    }
                                                                } else {
                                                                    i26 = i21;
                                                                    i20 = i24;
                                                                    j14 = j10;
                                                                }
                                                            }
                                                            if (j14 >= -2147483648L) {
                                                            }
                                                            throw ab.a(null, "EBML lacing sample size out of range.");
                                                        }
                                                        p5Var.U[i23] = ((i13 - p5Var.W) - i20) - i22;
                                                        iArr4[i26] = i60;
                                                        i22 += i60;
                                                        i21 = i26 + 1;
                                                        i13 = i13;
                                                    }
                                                }
                                            }
                                        }
                                        byte[] bArr10 = np0Var.f17880a;
                                        p5Var.Q = p5Var.a((bArr10[1] & 255) | (bArr10[0] << 8)) + p5Var.N;
                                        if (o5Var.f18128f == 1) {
                                            i36 = 2;
                                            i37 = 1;
                                        } else if (i10 == 163) {
                                            i36 = 2;
                                            if ((np0Var.f17880a[2] & 128) == 128) {
                                                i37 = 1;
                                            } else {
                                                i37 = 0;
                                            }
                                            i10 = 163;
                                        } else {
                                            i36 = 2;
                                            i37 = 0;
                                        }
                                        p5Var.X = i37;
                                        p5Var.P = i36;
                                        p5Var.S = 0;
                                        i14 = 163;
                                    } else {
                                        i14 = 163;
                                    }
                                    if (i10 == i14) {
                                        while (true) {
                                            i16 = p5Var.S;
                                            if (i16 < p5Var.T) {
                                                p5Var.l(o5Var, p5Var.Q + ((long) ((p5Var.S * o5Var.f18129g) / 1000)), p5Var.X, p5Var.n(n2Var, o5Var, p5Var.U[i16], false), 0);
                                                p5Var.S++;
                                            } else {
                                                z11 = false;
                                                p5Var.P = 0;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            i15 = p5Var.S;
                                            if (i15 < p5Var.T) {
                                                int[] iArr9 = p5Var.U;
                                                iArr9[i15] = p5Var.n(n2Var, o5Var, iArr9[i15], true);
                                                p5Var.S++;
                                            } else {
                                                z11 = false;
                                            }
                                        }
                                    }
                                }
                            }
                            k5Var.f16319c = z11 ? 1 : 0;
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
                            j16 = k5Var.f16321e;
                            if (j16 == 4) {
                            }
                            i38 = (int) j16;
                            jB = k5Var.b(n2Var, i38);
                            if (i38 == 4) {
                                dLongBitsToDouble = Float.intBitsToFloat((int) jB);
                            } else {
                                dLongBitsToDouble = Double.longBitsToDouble(jB);
                            }
                            if (i10 != 181) {
                                p5Var.j(i10);
                                p5Var.f18528z.T = (int) dLongBitsToDouble;
                            } else if (i10 != 17545) {
                                switch (i10) {
                                    case 21969:
                                        p5Var.j(i10);
                                        p5Var.f18528z.F = (float) dLongBitsToDouble;
                                        break;
                                    case 21970:
                                        p5Var.j(i10);
                                        p5Var.f18528z.G = (float) dLongBitsToDouble;
                                        break;
                                    case 21971:
                                        p5Var.j(i10);
                                        p5Var.f18528z.H = (float) dLongBitsToDouble;
                                        break;
                                    case 21972:
                                        p5Var.j(i10);
                                        p5Var.f18528z.I = (float) dLongBitsToDouble;
                                        break;
                                    case 21973:
                                        p5Var.j(i10);
                                        p5Var.f18528z.J = (float) dLongBitsToDouble;
                                        break;
                                    case 21974:
                                        p5Var.j(i10);
                                        p5Var.f18528z.K = (float) dLongBitsToDouble;
                                        break;
                                    case 21975:
                                        p5Var.j(i10);
                                        p5Var.f18528z.L = (float) dLongBitsToDouble;
                                        break;
                                    case 21976:
                                        p5Var.j(i10);
                                        p5Var.f18528z.M = (float) dLongBitsToDouble;
                                        break;
                                    case 21977:
                                        p5Var.j(i10);
                                        p5Var.f18528z.N = (float) dLongBitsToDouble;
                                        break;
                                    case 21978:
                                        p5Var.j(i10);
                                        p5Var.f18528z.O = (float) dLongBitsToDouble;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 30323:
                                                p5Var.j(i10);
                                                p5Var.f18528z.f18143v = (float) dLongBitsToDouble;
                                                break;
                                            case 30324:
                                                p5Var.j(i10);
                                                p5Var.f18528z.f18144w = (float) dLongBitsToDouble;
                                                break;
                                            case 30325:
                                                p5Var.j(i10);
                                                p5Var.f18528z.f18145x = (float) dLongBitsToDouble;
                                                break;
                                            default:
                                                p5Var.getClass();
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                p5Var.f18523u = (long) dLongBitsToDouble;
                            }
                            z11 = false;
                            k5Var.f16319c = 0;
                            break;
                        default:
                            n2Var.zzf((int) k5Var.f16321e);
                            k5Var.f16319c = 0;
                            break;
                    }
                    z13 = true;
                    if (z13) {
                        jZzn = n2Var.zzn();
                        if (this.K) {
                            this.M = jZzn;
                            q2Var.f18888a = this.L;
                            this.K = z11;
                            return 1;
                        }
                        if (this.A) {
                            j18 = this.M;
                            if (j18 != -1) {
                                q2Var.f18888a = j18;
                                this.M = -1L;
                                return 1;
                            }
                        }
                    }
                    if (z13) {
                        i40 = 0;
                        while (true) {
                            sparseArray2 = this.f18495b;
                            if (i40 >= sparseArray2.size()) {
                                return -1;
                            }
                            o5Var2 = (o5) sparseArray2.valueAt(i40);
                            o5Var2.f18122b0.getClass();
                            i3Var = o5Var2.W;
                            if (i3Var != null) {
                                i3Var.f(o5Var2.f18122b0, o5Var2.l);
                            }
                            i40++;
                        }
                    } else {
                        i49 = 0;
                    }
                } else {
                    vf vfVar3 = (vf) k5Var.f16323g;
                    int i62 = ((j5) arrayDeque.pop()).f15982a;
                    p5 p5Var2 = (p5) vfVar3.f21157b;
                    LongSparseArray longSparseArray = p5Var2.f18497c;
                    SparseArray sparseArray5 = p5Var2.D;
                    SparseArray sparseArray6 = p5Var2.f18495b;
                    p5Var2.f18513k0.getClass();
                    if (i62 == 128) {
                        l5 l5Var = p5Var2.f18527y;
                        l5Var.getClass();
                        if (l5Var.f16719f == null && (str2 = l5Var.f16721h) != null) {
                            l5Var.f16719f = str2;
                            String str3 = l5Var.f16722i;
                            if (str3 != null) {
                                l5Var.f16720g = str3;
                            }
                        }
                    } else if (i62 != 160) {
                        if (i62 == 174) {
                            o5 o5Var6 = p5Var2.f18528z;
                            o5Var6.getClass();
                            String str4 = o5Var6.f18123c;
                            if (str4 == null) {
                                throw ab.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str4.hashCode()) {
                                case -2095576542:
                                    if (str4.equals("V_MPEG4/ISO/AP")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -2095575984:
                                    if (str4.equals("V_MPEG4/ISO/SP")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -1985379776:
                                    if (str4.equals("A_MS/ACM")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -1784763192:
                                    if (str4.equals("A_TRUEHD")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -1730367663:
                                    if (str4.equals("A_VORBIS")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -1482641358:
                                    if (str4.equals("A_MPEG/L2")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -1482641357:
                                    if (str4.equals("A_MPEG/L3")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -1373388978:
                                    if (str4.equals("V_MS/VFW/FOURCC")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -933872740:
                                    if (str4.equals("S_DVBSUB")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -538363189:
                                    if (str4.equals("V_MPEG4/ISO/ASP")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -538363109:
                                    if (str4.equals("V_MPEG4/ISO/AVC")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -425012669:
                                    if (str4.equals("S_VOBSUB")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case -356037306:
                                    if (str4.equals("A_DTS/LOSSLESS")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 62923557:
                                    if (str4.equals("A_AAC")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 62923603:
                                    if (str4.equals("A_AC3")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 62927045:
                                    if (str4.equals("A_DTS")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 82318131:
                                    if (str4.equals("V_AV1")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 82338133:
                                    if (str4.equals("V_VP8")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 82338134:
                                    if (str4.equals("V_VP9")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 99146302:
                                    if (str4.equals("S_HDMV/PGS")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 444813526:
                                    if (str4.equals("V_THEORA")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 542569478:
                                    if (str4.equals("A_DTS/EXPRESS")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 635596514:
                                    if (str4.equals("A_PCM/FLOAT/IEEE")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 725948237:
                                    if (str4.equals("A_PCM/INT/BIG")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 725957860:
                                    if (str4.equals("A_PCM/INT/LIT")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 738597099:
                                    if (str4.equals("S_TEXT/ASS")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 738614379:
                                    if (str4.equals("S_TEXT/SSA")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 855502857:
                                    if (str4.equals("V_MPEGH/ISO/HEVC")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 1045209816:
                                    if (str4.equals("S_TEXT/WEBVTT")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 1422270023:
                                    if (str4.equals("S_TEXT/UTF8")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 1809237540:
                                    if (str4.equals("V_MPEG2")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 1950749482:
                                    if (str4.equals("A_EAC3")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 1950789798:
                                    if (str4.equals("A_FLAC")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                                case 1951062397:
                                    if (str4.equals("A_OPUS")) {
                                        o5Var6.a(o5Var6.f18125d);
                                        o5Var6.f18122b0 = p5Var2.f18513k0.e(o5Var6.f18125d, o5Var6.f18128f);
                                        sparseArray6.put(o5Var6.f18125d, o5Var6);
                                    }
                                    break;
                            }
                            p5Var2.f18528z = null;
                        } else if (i62 == 17849) {
                            for (int i63 = 0; i63 < sparseArray6.size(); i63++) {
                                o5 o5Var7 = (o5) sparseArray6.valueAt(i63);
                                ArrayList arrayList = new ArrayList(longSparseArray.size());
                                for (int i64 = 0; i64 < longSparseArray.size(); i64++) {
                                    l5 l5Var2 = (l5) longSparseArray.valueAt(i64);
                                    long j33 = l5Var2.f16718e;
                                    if (j33 == 0 || j33 == o5Var7.f18127e) {
                                        long j34 = l5Var2.f16715b;
                                        String str5 = uu0.f20901a;
                                        if (j34 != C.TIME_UNSET && j34 != Long.MIN_VALUE) {
                                            j34 /= 1000000;
                                        }
                                        long j35 = j34;
                                        long j36 = l5Var2.f16716c;
                                        if (j36 != C.TIME_UNSET && j36 != Long.MIN_VALUE) {
                                            j36 /= 1000000;
                                        }
                                        arrayList.add(new l4(j35, j36, l5Var2.f16717d, l5Var2.f16719f != null ? new i32(l5Var2.f16720g, l5Var2.f16719f) : null));
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    g22 g22Var = o5Var7.f18124c0;
                                    g22Var.getClass();
                                    i12 i12Var = new i12(g22Var);
                                    s8 s8Var2 = g22Var.l;
                                    i12Var.f15509k = s8Var2 != null ? s8Var2.c((v7[]) arrayList.toArray(new k4[0])) : new s8(arrayList);
                                    o5Var7.f18124c0 = new g22(i12Var);
                                }
                            }
                        } else {
                            if (i62 == 19899) {
                                int i65 = p5Var2.B;
                                if (i65 != -1) {
                                    long j37 = p5Var2.C;
                                    if (j37 != -1) {
                                        if (i65 == 475249515) {
                                            p5Var2.L = j37;
                                        }
                                    }
                                }
                                throw ab.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i62 == 25152) {
                                p5Var2.j(i62);
                                o5 o5Var8 = p5Var2.f18528z;
                                if (o5Var8.f18132j) {
                                    g3 g3Var = o5Var8.l;
                                    if (g3Var == null) {
                                        throw ab.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    o5Var8.f18135n = new g02(null, true, new c02(v01.f20988a, "video/webm", g3Var.f14691b));
                                }
                            } else if (i62 == 28032) {
                                p5Var2.j(i62);
                                o5 o5Var9 = p5Var2.f18528z;
                                if (o5Var9.f18132j && o5Var9.f18133k != null) {
                                    throw ab.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i62 == 357149030) {
                                if (p5Var2.f18522t == C.TIME_UNSET) {
                                    p5Var2.f18522t = 1000000L;
                                }
                                long j38 = p5Var2.f18523u;
                                if (j38 != C.TIME_UNSET) {
                                    p5Var2.f18524v = p5Var2.a(j38);
                                }
                            } else if (i62 == 374648427) {
                                if (sparseArray6.size() == 0) {
                                    throw ab.a(null, "No valid tracks were found");
                                }
                                boolean z14 = !p5Var2.f18499d || p5Var2.L == -1;
                                int i66 = -1;
                                int i67 = -1;
                                int i68 = -1;
                                int i69 = -1;
                                for (int i70 = 0; i70 < sparseArray6.size(); i70++) {
                                    o5 o5Var10 = (o5) sparseArray6.valueAt(i70);
                                    int i71 = o5Var10.f18128f;
                                    if (i71 == 2) {
                                        if (o5Var10.Z) {
                                            i66 = o5Var10.f18125d;
                                        }
                                        if (i67 == -1) {
                                            i67 = o5Var10.f18125d;
                                        }
                                    } else if (i71 == 1) {
                                        if (o5Var10.Z) {
                                            i68 = o5Var10.f18125d;
                                        }
                                        if (i69 == -1) {
                                            i69 = o5Var10.f18125d;
                                        }
                                    }
                                    if (z14) {
                                        o5Var10.f18122b0.getClass();
                                        if (!o5Var10.X) {
                                            h3 h3Var = o5Var10.f18122b0;
                                            g22 g22Var2 = o5Var10.f18124c0;
                                            g22Var2.getClass();
                                            h3Var.f(g22Var2);
                                        }
                                    }
                                }
                                if (i66 != -1) {
                                    p5Var2.J = i66;
                                } else if (i67 != -1) {
                                    p5Var2.J = i67;
                                } else if (i68 != -1) {
                                    p5Var2.J = i68;
                                } else if (i69 != -1) {
                                    p5Var2.J = i69;
                                } else {
                                    p5Var2.J = sparseArray6.size() > 0 ? ((o5) sparseArray6.valueAt(0)).f18125d : -1;
                                }
                                if (z14) {
                                    p5Var2.b();
                                }
                            } else if (i62 != 475249515) {
                                if (i62 == 182) {
                                    l5 l5Var3 = p5Var2.f18527y;
                                    l5Var3.getClass();
                                    long j39 = l5Var3.f16714a;
                                    if (j39 != 0) {
                                        longSparseArray.put(j39, l5Var3);
                                    }
                                    p5Var2.f18527y = null;
                                } else if (i62 == 183 && !p5Var2.A) {
                                    p5Var2.k(i62);
                                    if (p5Var2.F != C.TIME_UNSET && (i48 = p5Var2.G) != -1 && p5Var2.H != -1) {
                                        List arrayList2 = (List) sparseArray5.get(i48);
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                            sparseArray5.put(p5Var2.G, arrayList2);
                                        }
                                        arrayList2.add(new m5(p5Var2.F, p5Var2.f18521s + p5Var2.H, p5Var2.I));
                                    }
                                }
                            } else if (!p5Var2.A) {
                                int i72 = 0;
                                while (true) {
                                    if (i72 < sparseArray5.size()) {
                                        if (((List) sparseArray5.valueAt(i72)).isEmpty()) {
                                            i72++;
                                        } else {
                                            if (p5Var2.f18524v != C.TIME_UNSET) {
                                                for (int i73 = 0; i73 < sparseArray5.size(); i73++) {
                                                    Collections.sort((List) sparseArray5.valueAt(i73));
                                                }
                                                sparseArray3 = sparseArray5;
                                                p5Var2.f18513k0.o(new n5(sparseArray5, p5Var2.f18524v, p5Var2.J, p5Var2.f18521s, p5Var2.f18520r));
                                            }
                                            p5Var2.A = true;
                                            p5Var2.E = false;
                                            i42 = 0;
                                            while (i42 < sparseArray6.size()) {
                                                o5Var3 = (o5) sparseArray6.valueAt(i42);
                                                j19 = p5Var2.f18524v;
                                                j20 = p5Var2.f18521s;
                                                j21 = p5Var2.f18520r;
                                                i43 = i50;
                                                if (o5Var3.f18128f == 2 || (list = (List) sparseArray3.get(o5Var3.f18125d)) == null || list.isEmpty()) {
                                                    i44 = i42;
                                                    sparseArray4 = sparseArray3;
                                                } else {
                                                    if (list.isEmpty()) {
                                                        i44 = i42;
                                                        sparseArray4 = sparseArray3;
                                                    } else {
                                                        i44 = i42;
                                                        iMin = Math.min(list.size(), 20);
                                                        d10 = 0.0d;
                                                        i45 = 0;
                                                        sparseArray4 = sparseArray3;
                                                        i46 = i43;
                                                        while (i45 < iMin) {
                                                            j23 = j19;
                                                            m5 m5Var = (m5) list.get(i45);
                                                            j24 = j20;
                                                            j25 = m5Var.f17246a;
                                                            j26 = m5Var.f17248c;
                                                            j27 = m5Var.f17247b;
                                                            if (j25 > 10000000) {
                                                                if (i46 == i43) {
                                                                    j22 = ((m5) list.get(i46)).f17246a;
                                                                }
                                                                if (j22 != C.TIME_UNSET) {
                                                                    g22 g22Var3 = o5Var3.f18124c0;
                                                                    g22Var3.getClass();
                                                                    s8Var = g22Var3.l;
                                                                    n4Var = new n4(j22);
                                                                    if (s8Var == null) {
                                                                        s8VarC = new s8(n4Var);
                                                                    } else {
                                                                        s8VarC = s8Var.c(n4Var);
                                                                    }
                                                                    g22 g22Var4 = o5Var3.f18124c0;
                                                                    g22Var4.getClass();
                                                                    i12 i12Var2 = new i12(g22Var4);
                                                                    i12Var2.f15509k = s8VarC;
                                                                    o5Var3.f18124c0 = new g22(i12Var2);
                                                                }
                                                            } else {
                                                                i47 = i45 + 1;
                                                                if (i45 < list.size() - 1) {
                                                                    m5 m5Var2 = (m5) list.get(i47);
                                                                    long j40 = m5Var2.f17247b + m5Var2.f17248c;
                                                                    long j41 = j27 + j26;
                                                                    j29 = m5Var2.f17246a - j25;
                                                                    j28 = j40 - j41;
                                                                } else {
                                                                    long j42 = j23 - j25;
                                                                    j28 = (j24 + j21) - (j27 + j26);
                                                                    j29 = j42;
                                                                }
                                                                if (j29 > 0) {
                                                                    d11 = j28 / j29;
                                                                    if (d11 > d10) {
                                                                        i46 = i45;
                                                                        d10 = d11;
                                                                    }
                                                                }
                                                                i45 = i47;
                                                                j19 = j23;
                                                                j20 = j24;
                                                            }
                                                        }
                                                        if (i46 == i43) {
                                                            j22 = ((m5) list.get(i46)).f17246a;
                                                        }
                                                        if (j22 != C.TIME_UNSET) {
                                                            g22 g22Var5 = o5Var3.f18124c0;
                                                            g22Var5.getClass();
                                                            s8Var = g22Var5.l;
                                                            n4Var = new n4(j22);
                                                            if (s8Var == null) {
                                                                s8VarC = new s8(n4Var);
                                                            } else {
                                                                s8VarC = s8Var.c(n4Var);
                                                            }
                                                            g22 g22Var6 = o5Var3.f18124c0;
                                                            g22Var6.getClass();
                                                            i12 i12Var3 = new i12(g22Var6);
                                                            i12Var3.f15509k = s8VarC;
                                                            o5Var3.f18124c0 = new g22(i12Var3);
                                                        }
                                                    }
                                                    j22 = -9223372036854775807L;
                                                    if (j22 != C.TIME_UNSET) {
                                                        g22 g22Var7 = o5Var3.f18124c0;
                                                        g22Var7.getClass();
                                                        s8Var = g22Var7.l;
                                                        n4Var = new n4(j22);
                                                        if (s8Var == null) {
                                                            s8VarC = new s8(n4Var);
                                                        } else {
                                                            s8VarC = s8Var.c(n4Var);
                                                        }
                                                        g22 g22Var8 = o5Var3.f18124c0;
                                                        g22Var8.getClass();
                                                        i12 i12Var4 = new i12(g22Var8);
                                                        i12Var4.f15509k = s8VarC;
                                                        o5Var3.f18124c0 = new g22(i12Var4);
                                                    }
                                                }
                                                if (!o5Var3.X) {
                                                    o5Var3.f18122b0.getClass();
                                                    h3 h3Var2 = o5Var3.f18122b0;
                                                    g22 g22Var9 = o5Var3.f18124c0;
                                                    g22Var9.getClass();
                                                    h3Var2.f(g22Var9);
                                                }
                                                i42 = i44 + 1;
                                                sparseArray3 = sparseArray4;
                                                i50 = -1;
                                            }
                                            p5Var2.b();
                                        }
                                    }
                                    sparseArray3 = sparseArray5;
                                    p5Var2.f18513k0.o(new r2(p5Var2.f18524v, 0L));
                                    p5Var2.A = true;
                                    p5Var2.E = false;
                                    i42 = 0;
                                    while (i42 < sparseArray6.size()) {
                                        o5Var3 = (o5) sparseArray6.valueAt(i42);
                                        j19 = p5Var2.f18524v;
                                        j20 = p5Var2.f18521s;
                                        j21 = p5Var2.f18520r;
                                        i43 = i50;
                                        if (o5Var3.f18128f == 2) {
                                            i44 = i42;
                                            sparseArray4 = sparseArray3;
                                        } else {
                                            if (list.isEmpty()) {
                                                i44 = i42;
                                                sparseArray4 = sparseArray3;
                                            } else {
                                                i44 = i42;
                                                iMin = Math.min(list.size(), 20);
                                                d10 = 0.0d;
                                                i45 = 0;
                                                sparseArray4 = sparseArray3;
                                                i46 = i43;
                                                while (i45 < iMin) {
                                                    j23 = j19;
                                                    m5 m5Var3 = (m5) list.get(i45);
                                                    j24 = j20;
                                                    j25 = m5Var3.f17246a;
                                                    j26 = m5Var3.f17248c;
                                                    j27 = m5Var3.f17247b;
                                                    if (j25 > 10000000) {
                                                        if (i46 == i43) {
                                                            j22 = ((m5) list.get(i46)).f17246a;
                                                        }
                                                        if (j22 != C.TIME_UNSET) {
                                                            g22 g22Var10 = o5Var3.f18124c0;
                                                            g22Var10.getClass();
                                                            s8Var = g22Var10.l;
                                                            n4Var = new n4(j22);
                                                            if (s8Var == null) {
                                                                s8VarC = new s8(n4Var);
                                                            } else {
                                                                s8VarC = s8Var.c(n4Var);
                                                            }
                                                            g22 g22Var11 = o5Var3.f18124c0;
                                                            g22Var11.getClass();
                                                            i12 i12Var5 = new i12(g22Var11);
                                                            i12Var5.f15509k = s8VarC;
                                                            o5Var3.f18124c0 = new g22(i12Var5);
                                                        }
                                                    } else {
                                                        i47 = i45 + 1;
                                                        if (i45 < list.size() - 1) {
                                                            m5 m5Var4 = (m5) list.get(i47);
                                                            long j43 = m5Var4.f17247b + m5Var4.f17248c;
                                                            long j44 = j27 + j26;
                                                            j29 = m5Var4.f17246a - j25;
                                                            j28 = j43 - j44;
                                                        } else {
                                                            long j45 = j23 - j25;
                                                            j28 = (j24 + j21) - (j27 + j26);
                                                            j29 = j45;
                                                        }
                                                        if (j29 > 0) {
                                                            d11 = j28 / j29;
                                                            if (d11 > d10) {
                                                                i46 = i45;
                                                                d10 = d11;
                                                            }
                                                        }
                                                        i45 = i47;
                                                        j19 = j23;
                                                        j20 = j24;
                                                    }
                                                }
                                                if (i46 == i43) {
                                                    j22 = ((m5) list.get(i46)).f17246a;
                                                }
                                                if (j22 != C.TIME_UNSET) {
                                                    g22 g22Var12 = o5Var3.f18124c0;
                                                    g22Var12.getClass();
                                                    s8Var = g22Var12.l;
                                                    n4Var = new n4(j22);
                                                    if (s8Var == null) {
                                                        s8VarC = new s8(n4Var);
                                                    } else {
                                                        s8VarC = s8Var.c(n4Var);
                                                    }
                                                    g22 g22Var13 = o5Var3.f18124c0;
                                                    g22Var13.getClass();
                                                    i12 i12Var6 = new i12(g22Var13);
                                                    i12Var6.f15509k = s8VarC;
                                                    o5Var3.f18124c0 = new g22(i12Var6);
                                                }
                                            }
                                            j22 = -9223372036854775807L;
                                            if (j22 != C.TIME_UNSET) {
                                                g22 g22Var14 = o5Var3.f18124c0;
                                                g22Var14.getClass();
                                                s8Var = g22Var14.l;
                                                n4Var = new n4(j22);
                                                if (s8Var == null) {
                                                    s8VarC = new s8(n4Var);
                                                } else {
                                                    s8VarC = s8Var.c(n4Var);
                                                }
                                                g22 g22Var15 = o5Var3.f18124c0;
                                                g22Var15.getClass();
                                                i12 i12Var7 = new i12(g22Var15);
                                                i12Var7.f15509k = s8VarC;
                                                o5Var3.f18124c0 = new g22(i12Var7);
                                            }
                                        }
                                        if (!o5Var3.X) {
                                            o5Var3.f18122b0.getClass();
                                            h3 h3Var3 = o5Var3.f18122b0;
                                            g22 g22Var16 = o5Var3.f18124c0;
                                            g22Var16.getClass();
                                            h3Var3.f(g22Var16);
                                        }
                                        i42 = i44 + 1;
                                        sparseArray3 = sparseArray4;
                                        i50 = -1;
                                    }
                                    p5Var2.b();
                                }
                            }
                        }
                    } else if (p5Var2.P == 2) {
                        o5 o5Var11 = (o5) sparseArray6.get(p5Var2.V);
                        o5Var11.f18122b0.getClass();
                        if (p5Var2.f18494a0 > 0 && "A_OPUS".equals(o5Var11.f18123c)) {
                            np0 np0Var4 = p5Var2.f18518p;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(p5Var2.f18494a0).array();
                            np0Var4.z(bArrArray.length, bArrArray);
                        }
                        int i74 = 0;
                        for (int i75 = 0; i75 < p5Var2.T; i75++) {
                            i74 += p5Var2.U[i75];
                        }
                        int i76 = 0;
                        while (i76 < p5Var2.T) {
                            long j46 = p5Var2.Q + ((long) ((o5Var11.f18129g * i76) / 1000));
                            int i77 = p5Var2.X;
                            if (i76 == 0) {
                                if (!p5Var2.Z) {
                                    i77 |= 1;
                                }
                                i41 = i77;
                                i76 = 0;
                            } else {
                                i41 = i77;
                            }
                            int i78 = p5Var2.U[i76];
                            int i79 = i74 - i78;
                            p5Var2.l(o5Var11, j46, i41, i78, i79);
                            i76++;
                            i74 = i79;
                        }
                        p5Var2.P = 0;
                    }
                    z13 = true;
                }
                z11 = false;
                if (z13) {
                    jZzn = n2Var.zzn();
                    if (this.K) {
                        this.M = jZzn;
                        q2Var.f18888a = this.L;
                        this.K = z11;
                        return 1;
                    }
                    if (this.A) {
                        j18 = this.M;
                        if (j18 != -1) {
                            q2Var.f18888a = j18;
                            this.M = -1L;
                            return 1;
                        }
                    }
                }
                if (z13) {
                    i40 = 0;
                    while (true) {
                        sparseArray2 = this.f18495b;
                        if (i40 >= sparseArray2.size()) {
                            return -1;
                        }
                        o5Var2 = (o5) sparseArray2.valueAt(i40);
                        o5Var2.f18122b0.getClass();
                        i3Var = o5Var2.W;
                        if (i3Var != null) {
                            i3Var.f(o5Var2.f18122b0, o5Var2.l);
                        }
                        i40++;
                    }
                } else {
                    i49 = 0;
                }
            }
        }
        return i49;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        if (this.f18501e) {
            o2Var = new bc.s(o2Var, this.f18503f);
        }
        this.f18513k0 = o2Var;
    }

    public final void h(int i10, long j10) throws ab {
        boolean z10;
        if (i10 == 136) {
            z10 = j10 == 1;
            j(i10);
            this.f18528z.Z = z10;
            return;
        }
        if (i10 == 137) {
            i(i10);
            this.f18527y.f16718e = j10;
            return;
        }
        if (i10 == 145) {
            i(i10);
            this.f18527y.f16715b = j10;
            return;
        }
        if (i10 == 146) {
            i(i10);
            this.f18527y.f16716c = j10;
            return;
        }
        if (i10 == 240) {
            if (this.A) {
                return;
            }
            k(i10);
            if (this.I == -1) {
                this.I = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (this.A) {
                return;
            }
            k(i10);
            if (this.H == -1) {
                this.H = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw ab.a(null, sb2.toString());
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw ab.a(null, sb3.toString());
        }
        if (i10 == 29636) {
            i(i10);
            this.f18527y.f16714a = j10;
            return;
        }
        if (i10 == 29637) {
            j(i10);
            this.f18528z.f18127e = j10;
            return;
        }
        switch (i10) {
            case 131:
                int i11 = (int) j10;
                if (i11 == 1) {
                    j(i10);
                    this.f18528z.f18128f = 2;
                    return;
                }
                if (i11 == 2) {
                    j(i10);
                    this.f18528z.f18128f = 1;
                    return;
                } else if (i11 == 17) {
                    j(i10);
                    this.f18528z.f18128f = 3;
                    return;
                } else if (i11 != 33) {
                    j(i10);
                    this.f18528z.f18128f = -1;
                    return;
                } else {
                    j(i10);
                    this.f18528z.f18128f = 5;
                    return;
                }
            case 152:
                z10 = j10 == 1;
                i(i10);
                this.f18527y.f16717d = z10;
                return;
            case 155:
                this.R = a(j10);
                return;
            case 159:
                j(i10);
                this.f18528z.Q = (int) j10;
                return;
            case 176:
                j(i10);
                this.f18528z.f18136o = (int) j10;
                return;
            case 179:
                if (this.A) {
                    return;
                }
                k(i10);
                this.F = a(j10);
                return;
            case 186:
                j(i10);
                this.f18528z.f18137p = (int) j10;
                return;
            case 215:
                j(i10);
                this.f18528z.f18125d = (int) j10;
                return;
            case 231:
                this.N = a(j10);
                return;
            case 238:
                this.Y = (int) j10;
                return;
            case 247:
                if (this.A) {
                    return;
                }
                k(i10);
                this.G = (int) j10;
                return;
            case 251:
                this.Z = true;
                return;
            case 16871:
                j(i10);
                this.f18528z.f18131i = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j10);
                sb4.append(" not supported");
                throw ab.a(null, sb4.toString());
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j10);
                    sb5.append(" not supported");
                    throw ab.a(null, sb5.toString());
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw ab.a(null, sb6.toString());
            case 18401:
                if (j10 == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 29);
                sb7.append("ContentEncAlgo ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw ab.a(null, sb7.toString());
            case 18408:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j10).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j10);
                sb8.append(" not supported");
                throw ab.a(null, sb8.toString());
            case 21420:
                this.C = j10 + this.f18521s;
                return;
            case 21432:
                int i12 = (int) j10;
                j(i10);
                if (i12 == 0) {
                    this.f18528z.f18147z = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f18528z.f18147z = 2;
                    return;
                } else if (i12 == 3) {
                    this.f18528z.f18147z = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.f18528z.f18147z = 3;
                    return;
                }
            case 21680:
                j(i10);
                this.f18528z.f18139r = (int) j10;
                return;
            case 21682:
                j(i10);
                this.f18528z.f18141t = (int) j10;
                return;
            case 21690:
                j(i10);
                this.f18528z.f18140s = (int) j10;
                return;
            case 21930:
                z10 = j10 == 1;
                j(i10);
                this.f18528z.Y = z10;
                return;
            case 21938:
                j(i10);
                this.f18528z.f18138q = (int) j10;
                return;
            case 21998:
                j(i10);
                this.f18528z.f18130h = (int) j10;
                return;
            case 22186:
                j(i10);
                this.f18528z.U = j10;
                return;
            case 22203:
                j(i10);
                this.f18528z.V = j10;
                return;
            case 25188:
                j(i10);
                this.f18528z.R = (int) j10;
                return;
            case 30114:
                this.f18494a0 = j10;
                return;
            case 30321:
                int i13 = (int) j10;
                j(i10);
                if (i13 == 0) {
                    this.f18528z.f18142u = 0;
                    return;
                }
                if (i13 == 1) {
                    this.f18528z.f18142u = 1;
                    return;
                } else if (i13 == 2) {
                    this.f18528z.f18142u = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.f18528z.f18142u = 3;
                    return;
                }
            case 2352003:
                j(i10);
                this.f18528z.f18129g = (int) j10;
                return;
            case 2807729:
                this.f18522t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i14 = (int) j10;
                        j(i10);
                        if (i14 == 1) {
                            this.f18528z.C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.f18528z.C = 1;
                            return;
                        }
                    case 21946:
                        j(i10);
                        int iC = lq1.c((int) j10);
                        if (iC != -1) {
                            this.f18528z.B = iC;
                            return;
                        }
                        return;
                    case 21947:
                        j(i10);
                        int iB = lq1.b((int) j10);
                        if (iB != -1) {
                            this.f18528z.A = iB;
                            return;
                        }
                        return;
                    case 21948:
                        j(i10);
                        this.f18528z.D = (int) j10;
                        return;
                    case 21949:
                        j(i10);
                        this.f18528z.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void i(int i10) throws ab {
        if (this.f18527y != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 35);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in an EditionEntry");
        throw ab.a(null, sb2.toString());
    }

    public final void j(int i10) throws ab {
        if (this.f18528z != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw ab.a(null, sb2.toString());
    }

    public final void k(int i10) throws ab {
        if (this.E) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a Cues");
        throw ab.a(null, sb2.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[LOOP:0: B:36:0x00a8->B:41:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (r2.equals("S_TEXT/SSA") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (r2.equals("S_TEXT/ASS") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        r2 = q(r11, com.ironsource.Xa.f27908s, "%01d:%02d:%02d:%02d");
        r3 = 21;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(com.google.android.gms.internal.ads.o5 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p5.l(com.google.android.gms.internal.ads.o5, long, int, int, int):void");
    }

    public final void m(n2 n2Var, int i10) {
        np0 np0Var = this.f18508i;
        if (np0Var.f17882c >= i10) {
            return;
        }
        byte[] bArr = np0Var.f17880a;
        if (bArr.length < i10) {
            int length = bArr.length;
            np0Var.A(Math.max(length + length, i10));
        }
        byte[] bArr2 = np0Var.f17880a;
        int i11 = np0Var.f17882c;
        n2Var.p(bArr2, i11, i10 - i11);
        np0Var.C(i10);
    }

    public final int n(n2 n2Var, o5 o5Var, int i10, boolean z10) throws ab {
        int iE;
        int iE2;
        int i11;
        String str = o5Var.f18123c;
        if ("S_TEXT/UTF8".equals(str)) {
            p(n2Var, f18488m0, i10);
            int i12 = this.f18498c0;
            o();
            return i12;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            p(n2Var, f18490o0, i10);
            int i13 = this.f18498c0;
            o();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            p(n2Var, f18491p0, i10);
            int i14 = this.f18498c0;
            o();
            return i14;
        }
        if (o5Var.X) {
            o5Var.f18124c0.getClass();
            np0 np0Var = new np0(i10);
            if (n2Var.m(np0Var.f17880a, 0, i10, true)) {
                n2Var.zzl();
                if (v71.a(np0Var.J()) == 1 && np0Var.B() >= 10) {
                    byte[] bArr = new byte[10];
                    np0Var.H(bArr, 0, 10);
                    np0Var.E(0);
                    int iU = v71.u(bArr);
                    if (np0Var.B() >= iU + 4) {
                        np0Var.G(iU);
                        if (v71.a(np0Var.b()) == 2) {
                            g22 g22Var = o5Var.f18124c0;
                            g22Var.getClass();
                            i12 i12Var = new i12(g22Var);
                            i12Var.e(MimeTypes.AUDIO_DTS_HD);
                            o5Var.f18124c0 = new g22(i12Var);
                        }
                    }
                }
            }
            o5Var.f18122b0.f(o5Var.f18124c0);
            o5Var.X = false;
            b();
        }
        h3 h3Var = o5Var.f18122b0;
        boolean z11 = this.f18502e0;
        np0 np0Var2 = this.l;
        if (!z11) {
            boolean z12 = o5Var.f18132j;
            np0 np0Var3 = this.f18508i;
            if (z12) {
                this.X &= -1073741825;
                if (!this.f18504f0) {
                    n2Var.p(np0Var3.f17880a, 0, 1);
                    this.f18496b0++;
                    byte b10 = np0Var3.f17880a[0];
                    if ((b10 & 128) == 128) {
                        throw ab.a(null, "Extension bit is set in signal byte");
                    }
                    this.f18509i0 = b10;
                    this.f18504f0 = true;
                }
                byte b11 = this.f18509i0;
                if ((b11 & 1) == 1) {
                    int i15 = b11 & 2;
                    this.X |= 1073741824;
                    if (!this.f18511j0) {
                        np0 np0Var4 = this.f18516n;
                        n2Var.p(np0Var4.f17880a, 0, 8);
                        this.f18496b0 += 8;
                        this.f18511j0 = true;
                        np0Var3.f17880a[0] = (byte) ((i15 != 2 ? 0 : 128) | 8);
                        np0Var3.E(0);
                        h3Var.g(np0Var3, 1, 1);
                        this.f18498c0++;
                        np0Var4.E(0);
                        h3Var.g(np0Var4, 8, 1);
                        this.f18498c0 += 8;
                    }
                    if (i15 == 2) {
                        if (!this.g0) {
                            n2Var.p(np0Var3.f17880a, 0, 1);
                            this.f18496b0++;
                            np0Var3.E(0);
                            this.f18507h0 = np0Var3.K();
                            this.g0 = true;
                        }
                        int i16 = this.f18507h0 * 4;
                        np0Var3.y(i16);
                        n2Var.p(np0Var3.f17880a, 0, i16);
                        this.f18496b0 += i16;
                        int i17 = (this.f18507h0 >> 1) + 1;
                        int i18 = (i17 * 6) + 2;
                        ByteBuffer byteBuffer = this.f18519q;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.f18519q = ByteBuffer.allocate(i18);
                        }
                        this.f18519q.position(0);
                        this.f18519q.putShort((short) i17);
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            i11 = this.f18507h0;
                            if (i19 >= i11) {
                                break;
                            }
                            int iH = np0Var3.h();
                            int i21 = iH - i20;
                            if (i19 % 2 == 0) {
                                this.f18519q.putShort((short) i21);
                            } else {
                                this.f18519q.putInt(i21);
                            }
                            i19++;
                            i20 = iH;
                        }
                        int i22 = (i10 - this.f18496b0) - i20;
                        if ((i11 & 1) == 1) {
                            this.f18519q.putInt(i22);
                        } else {
                            this.f18519q.putShort((short) i22);
                            this.f18519q.putInt(0);
                        }
                        byte[] bArrArray = this.f18519q.array();
                        np0 np0Var5 = this.f18517o;
                        np0Var5.z(i18, bArrArray);
                        h3Var.g(np0Var5, i18, 1);
                        this.f18498c0 += i18;
                    }
                }
            } else {
                byte[] bArr2 = o5Var.f18133k;
                if (bArr2 != null) {
                    np0Var2.z(bArr2.length, bArr2);
                }
            }
            if (!"A_OPUS".equals(o5Var.f18123c) ? o5Var.f18130h > 0 : z10) {
                this.X |= 268435456;
                this.f18518p.y(0);
                int i23 = (np0Var2.f17882c + i10) - this.f18496b0;
                np0Var3.y(4);
                byte[] bArr3 = np0Var3.f17880a;
                bArr3[0] = (byte) ((i23 >> 24) & 255);
                bArr3[1] = (byte) ((i23 >> 16) & 255);
                bArr3[2] = (byte) ((i23 >> 8) & 255);
                bArr3[3] = (byte) (i23 & 255);
                h3Var.g(np0Var3, 4, 2);
                this.f18498c0 += 4;
            }
            this.f18502e0 = true;
        }
        int i24 = i10 + np0Var2.f17882c;
        String str2 = o5Var.f18123c;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (o5Var.W != null) {
                ps1.c0(np0Var2.f17882c == 0);
                o5Var.W.d(n2Var);
            }
            while (true) {
                int i25 = this.f18496b0;
                if (i25 >= i24) {
                    break;
                }
                int i26 = i24 - i25;
                int iB = np0Var2.B();
                if (iB > 0) {
                    iE2 = Math.min(i26, iB);
                    h3Var.b(iE2, np0Var2);
                } else {
                    iE2 = h3Var.e(n2Var, i26, false);
                }
                this.f18496b0 += iE2;
                this.f18498c0 += iE2;
            }
        } else {
            np0 np0Var6 = this.f18506h;
            byte[] bArr4 = np0Var6.f17880a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i27 = o5Var.f18126d0;
            int i28 = 4 - i27;
            while (this.f18496b0 < i24) {
                int i29 = this.f18500d0;
                if (i29 == 0) {
                    int iMin = Math.min(i27, np0Var2.B());
                    n2Var.p(bArr4, i28 + iMin, i27 - iMin);
                    if (iMin > 0) {
                        np0Var2.H(bArr4, i28, iMin);
                    }
                    this.f18496b0 += i27;
                    np0Var6.E(0);
                    this.f18500d0 = np0Var6.h();
                    np0 np0Var7 = this.f18505g;
                    np0Var7.E(0);
                    h3Var.b(4, np0Var7);
                    this.f18498c0 += 4;
                } else {
                    int iB2 = np0Var2.B();
                    if (iB2 > 0) {
                        iE = Math.min(i29, iB2);
                        h3Var.b(iE, np0Var2);
                    } else {
                        iE = h3Var.e(n2Var, i29, false);
                    }
                    this.f18496b0 += iE;
                    this.f18498c0 += iE;
                    this.f18500d0 -= iE;
                }
            }
        }
        if ("A_VORBIS".equals(o5Var.f18123c)) {
            np0 np0Var8 = this.f18510j;
            np0Var8.E(0);
            h3Var.b(4, np0Var8);
            this.f18498c0 += 4;
        }
        int i30 = this.f18498c0;
        o();
        return i30;
    }

    public final void o() {
        this.f18496b0 = 0;
        this.f18498c0 = 0;
        this.f18500d0 = 0;
        this.f18502e0 = false;
        this.f18504f0 = false;
        this.g0 = false;
        this.f18507h0 = 0;
        this.f18509i0 = (byte) 0;
        this.f18511j0 = false;
        this.l.y(0);
    }

    public final void p(n2 n2Var, byte[] bArr, int i10) {
        int length = bArr.length;
        int i11 = length + i10;
        np0 np0Var = this.f18515m;
        byte[] bArr2 = np0Var.f17880a;
        if (bArr2.length < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            np0Var.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        n2Var.p(np0Var.f17880a, length, i10);
        np0Var.E(0);
        np0Var.C(i11);
    }

    public p5(k5 k5Var, int i10, p7 p7Var) {
        this.f18521s = -1L;
        this.f18522t = C.TIME_UNSET;
        this.f18523u = C.TIME_UNSET;
        this.f18524v = C.TIME_UNSET;
        this.F = C.TIME_UNSET;
        this.G = -1;
        this.H = -1L;
        this.I = -1L;
        this.J = -1;
        this.L = -1L;
        this.M = -1L;
        this.N = C.TIME_UNSET;
        this.f18514l0 = k5Var;
        k5Var.f16323g = new vf(this, 2);
        this.f18503f = p7Var;
        this.D = new SparseArray();
        this.f18499d = true;
        this.f18501e = (i10 & 2) == 0;
        this.f18493a = new q5(0);
        this.f18497c = new LongSparseArray();
        this.f18495b = new SparseArray();
        this.f18508i = new np0(4);
        this.f18510j = new np0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f18512k = new np0(4);
        this.f18505g = new np0(dv.f13741n);
        this.f18506h = new np0(4);
        this.l = new np0();
        this.f18515m = new np0();
        this.f18516n = new np0(8);
        this.f18517o = new np0();
        this.f18518p = new np0();
        this.U = new int[1];
        this.f18526x = true;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
