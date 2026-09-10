package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.bonny;
import saneness.moveable;

/* JADX INFO: loaded from: classes.dex */
public final class o12 {
    public Integer A;
    public ro2 B;
    public d42 C;
    public final Boolean D;
    public final Integer E;
    public final Integer F;
    public f83 G;
    public u22 H;
    public w11 I;
    public int J;
    public int K;
    public int a;
    public final l13 b;
    public final no0 c;
    public final List d;
    public final UUID e;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public po0 l;
    public boolean m;
    public Throwable n;
    public Throwable o;
    public long p;
    public long q;
    public long r;
    public final List s;
    public wq2 t;
    public qk2 u;
    public xr0 v;
    public hg1 w;
    public ro0 x;
    public bb1 y;
    public String z;

    public o12(int i, l13 traceMetaSet, no0 cuiName, List tags, UUID rootTraceId, int i2, int i3, long j, long j2, long j3, boolean z, po0 po0Var, boolean z2, Throwable th, Throwable th2, long j4, long j5, long j6, List errorMessages, wq2 wq2Var, qk2 qk2Var, xr0 xr0Var, hg1 hg1Var, ro0 processState, bb1 bb1Var, String str, Integer num, ro2 ro2Var, d42 d42Var, Boolean bool, Integer num2, Integer num3, f83 f83Var, u22 u22Var, w11 w11Var, int i4, int i5) {
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(rootTraceId, "rootTraceId");
        Intrinsics.checkNotNullParameter(errorMessages, "errorMessages");
        Intrinsics.checkNotNullParameter(processState, "processState");
        this.a = i;
        this.b = traceMetaSet;
        this.c = cuiName;
        this.d = tags;
        this.e = rootTraceId;
        this.f = i2;
        this.g = i3;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = z;
        this.l = po0Var;
        this.m = z2;
        this.n = th;
        this.o = th2;
        this.p = j4;
        this.q = j5;
        this.r = j6;
        this.s = errorMessages;
        this.t = wq2Var;
        this.u = qk2Var;
        this.v = xr0Var;
        this.w = hg1Var;
        this.x = processState;
        this.y = bb1Var;
        this.z = str;
        this.A = num;
        this.B = ro2Var;
        this.C = d42Var;
        this.D = bool;
        this.E = num2;
        this.F = num3;
        this.G = f83Var;
        this.H = u22Var;
        this.I = w11Var;
        this.J = i4;
        this.K = i5;
    }

    public final long a() {
        return this.r;
    }

    public final long b() {
        return this.q;
    }

    public final long c() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o12)) {
            return false;
        }
        o12 o12Var = (o12) obj;
        return this.a == o12Var.a && Intrinsics.wireman(this.b, o12Var.b) && this.c == o12Var.c && Intrinsics.wireman(this.d, o12Var.d) && Intrinsics.wireman(this.e, o12Var.e) && this.f == o12Var.f && this.g == o12Var.g && this.h == o12Var.h && this.i == o12Var.i && this.j == o12Var.j && this.k == o12Var.k && this.l == o12Var.l && this.m == o12Var.m && Intrinsics.wireman(this.n, o12Var.n) && Intrinsics.wireman(this.o, o12Var.o) && p002kotlin.time.saneness.kowloon(this.p, o12Var.p) && p002kotlin.time.saneness.kowloon(this.q, o12Var.q) && p002kotlin.time.saneness.kowloon(this.r, o12Var.r) && Intrinsics.wireman(this.s, o12Var.s) && Intrinsics.wireman(this.t, o12Var.t) && Intrinsics.wireman(this.u, o12Var.u) && Intrinsics.wireman(this.v, o12Var.v) && Intrinsics.wireman(this.w, o12Var.w) && this.x == o12Var.x && Intrinsics.wireman(this.y, o12Var.y) && Intrinsics.wireman(this.z, o12Var.z) && Intrinsics.wireman(this.A, o12Var.A) && Intrinsics.wireman(this.B, o12Var.B) && Intrinsics.wireman(this.C, o12Var.C) && Intrinsics.wireman(this.D, o12Var.D) && Intrinsics.wireman(this.E, o12Var.E) && Intrinsics.wireman(this.F, o12Var.F) && Intrinsics.wireman(this.G, o12Var.G) && Intrinsics.wireman(this.H, o12Var.H) && Intrinsics.wireman(this.I, o12Var.I) && this.J == o12Var.J && this.K == o12Var.K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final int hashCode() {
        int iHashCode = (Long.hashCode(this.j) + ((Long.hashCode(this.i) + ((Long.hashCode(this.h) + bonny.attabal(this.g, bonny.attabal(this.f, (this.e.hashCode() + moveable.attabal(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31, 31)) * 31, 31), 31)) * 31)) * 31)) * 31;
        boolean z = this.k;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        po0 po0Var = this.l;
        int iHashCode2 = (i + (po0Var == null ? 0 : po0Var.hashCode())) * 31;
        boolean z2 = this.m;
        int i2 = (iHashCode2 + (z2 ? 1 : z2)) * 31;
        Throwable th = this.n;
        int iHashCode3 = (i2 + (th == null ? 0 : th.hashCode())) * 31;
        Throwable th2 = this.o;
        int iAttabal = moveable.attabal(this.s, (p002kotlin.time.saneness.trm(this.r) + ((p002kotlin.time.saneness.trm(this.q) + ((p002kotlin.time.saneness.trm(this.p) + ((iHashCode3 + (th2 == null ? 0 : th2.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
        wq2 wq2Var = this.t;
        int iHashCode4 = (iAttabal + (wq2Var == null ? 0 : wq2Var.hashCode())) * 31;
        qk2 qk2Var = this.u;
        int iHashCode5 = (iHashCode4 + (qk2Var == null ? 0 : qk2Var.hashCode())) * 31;
        xr0 xr0Var = this.v;
        int iHashCode6 = (iHashCode5 + (xr0Var == null ? 0 : xr0Var.hashCode())) * 31;
        hg1 hg1Var = this.w;
        int iHashCode7 = (this.x.hashCode() + ((iHashCode6 + (hg1Var == null ? 0 : hg1Var.hashCode())) * 31)) * 31;
        bb1 bb1Var = this.y;
        int iHashCode8 = (iHashCode7 + (bb1Var == null ? 0 : bb1Var.hashCode())) * 31;
        String str = this.z;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        ro2 ro2Var = this.B;
        int iHashCode11 = (iHashCode10 + (ro2Var == null ? 0 : ro2Var.hashCode())) * 31;
        d42 d42Var = this.C;
        int iHashCode12 = (iHashCode11 + (d42Var == null ? 0 : d42Var.hashCode())) * 31;
        Boolean bool = this.D;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.E;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.F;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        f83 f83Var = this.G;
        int iHashCode16 = (iHashCode15 + (f83Var == null ? 0 : f83Var.hashCode())) * 31;
        u22 u22Var = this.H;
        int iHashCode17 = (iHashCode16 + (u22Var == null ? 0 : u22Var.hashCode())) * 31;
        w11 w11Var = this.I;
        return Integer.hashCode(this.K) + bonny.attabal(this.J, (iHashCode17 + (w11Var != null ? w11Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "PerTraceMeta(id=" + this.a + ", traceMetaSet=" + this.b + ", cuiName=" + this.c + ", tags=" + this.d + ", rootTraceId=" + this.e + ", parentTraceId=" + this.f + ", traceDepth=" + this.g + ", startTimeMillis=" + this.h + ", timeSinceSdkInitStartMillis=" + this.i + ", timeSinceSdkInitCompleteMillis=" + this.j + ", useAsyncAndroidTrace=" + this.k + ", gmsgName=" + this.l + ", isSuccess=" + this.m + ", exception=" + this.n + ", causingException=" + this.o + ", latency=" + p002kotlin.time.saneness.starveling(this.p) + ", cpuTime=" + p002kotlin.time.saneness.starveling(this.q) + ", childCpuTime=" + p002kotlin.time.saneness.starveling(this.r) + ", errorMessages=" + this.s + ", signalMeta=" + this.t + ", scarCacheEvictionData=" + this.u + ", h5Data=" + this.v + ", mraidData=" + this.w + ", processState=" + this.x + ", jsEngineData=" + this.y + ", cronetProvider=" + this.z + ", customTabsNavigationEvent=" + this.A + ", signalCacheData=" + this.B + ", preloadData=" + this.C + ", hasNetworkConnectivity=" + this.D + ", networkType=" + this.E + ", networkTypeCoarse=" + this.F + ", webViewData=" + this.G + ", postClickLifecycleMonitoringData=" + this.H + ", installReferrerDetails=" + this.I + ", previousAppExitReason=" + this.J + ", previousAppExitSignal=" + this.K + ")";
    }

    public final void a(long j) {
        this.r = j;
    }

    public final void b(long j) {
        this.q = j;
    }

    public /* synthetic */ o12(int i, l13 l13Var, no0 no0Var, List list, UUID uuid, int i2, int i3, long j, long j2, long j3, boolean z, po0 po0Var, boolean z2, Throwable th, Throwable th2, long j4, long j5, long j6, List list2, wq2 wq2Var, qk2 qk2Var, xr0 xr0Var, hg1 hg1Var, ro0 ro0Var, bb1 bb1Var, String str, Integer num, ro2 ro2Var, d42 d42Var, Boolean bool, Integer num2, Integer num3, f83 f83Var, u22 u22Var, w11 w11Var, int i4, int i5, int i6) {
        this(i, l13Var, no0Var, list, uuid, i2, i3, j, j2, j3, z, po0Var, z2, th, th2, j4, j5, j6, list2, wq2Var, qk2Var, xr0Var, hg1Var, ro0Var, bb1Var, str, num, ro2Var, d42Var, bool, num2, num3, f83Var, u22Var, w11Var, i4, i5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ o12(int i, l13 l13Var, no0 no0Var, List list, UUID uuid, int i2, int i3, long j, long j2, long j3, boolean z, Boolean bool, Integer num, Integer num2, int i4) {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        this(i, l13Var, no0Var, list, uuid, i2, i3, j, j2, j3, z, null, true, null, null, p002kotlin.time.dern.molybdenite(0, durationUnit), p002kotlin.time.dern.molybdenite(0, durationUnit), p002kotlin.time.dern.molybdenite(0, durationUnit), new ArrayList(), null, null, null, null, ro0.PROCESS_STATE_UNKNOWN, null, null, null, null, null, (i4 & 536870912) != 0 ? null : bool, (i4 & 1073741824) != 0 ? null : num, (i4 & Integer.MIN_VALUE) != 0 ? null : num2, null, null, null, -1, -1, 0);
    }
}
