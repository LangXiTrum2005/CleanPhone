package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class W {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f27501q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f27502r = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f27503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<NetworkSettings> f27505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0561s2 f27506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f27508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f27510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f27511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final O0 f27512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final J0 f27513k;
    private final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f27514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f27515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f27516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f27517p;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public W(IronSource.a adUnit, String str, List<? extends NetworkSettings> list, C0561s2 auctionSettings, int i10, int i11, boolean z10, int i12, int i13, O0 loadingData, J0 interactionData, long j10, boolean z11, boolean z12, boolean z13, boolean z14) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.n.f(loadingData, "loadingData");
        kotlin.jvm.internal.n.f(interactionData, "interactionData");
        this.f27503a = adUnit;
        this.f27504b = str;
        this.f27505c = list;
        this.f27506d = auctionSettings;
        this.f27507e = i10;
        this.f27508f = i11;
        this.f27509g = z10;
        this.f27510h = i12;
        this.f27511i = i13;
        this.f27512j = loadingData;
        this.f27513k = interactionData;
        this.l = j10;
        this.f27514m = z11;
        this.f27515n = z12;
        this.f27516o = z13;
        this.f27517p = z14;
    }

    public final void a(int i10) {
        this.f27507e = i10;
    }

    public final IronSource.a b() {
        return this.f27503a;
    }

    public final boolean c() {
        return this.f27509g;
    }

    public final C0561s2 d() {
        return this.f27506d;
    }

    public final long e() {
        return this.l;
    }

    public final int f() {
        return this.f27510h;
    }

    public final J0 g() {
        return this.f27513k;
    }

    public final O0 h() {
        return this.f27512j;
    }

    public final int i() {
        return this.f27507e;
    }

    public List<NetworkSettings> j() {
        return this.f27505c;
    }

    public final boolean k() {
        return this.f27514m;
    }

    public final boolean l() {
        return this.f27516o;
    }

    public final boolean m() {
        return this.f27517p;
    }

    public final int n() {
        return this.f27508f;
    }

    public String o() {
        return this.f27504b;
    }

    public final boolean p() {
        return this.f27515n;
    }

    public final boolean q() {
        return this.f27506d.g() > 0;
    }

    public final String r() {
        return String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f29352x, Integer.valueOf(this.f27507e), com.ironsource.mediationsdk.d.f29353y, Boolean.valueOf(this.f27509g), com.ironsource.mediationsdk.d.f29354z, Boolean.valueOf(this.f27517p));
    }

    public final void a(boolean z10) {
        this.f27509g = z10;
    }

    public final void b(boolean z10) {
        this.f27517p = z10;
    }

    public final int a() {
        return this.f27511i;
    }

    public final NetworkSettings a(String instanceName) {
        kotlin.jvm.internal.n.f(instanceName, "instanceName");
        List<NetworkSettings> listJ = j();
        Object obj = null;
        if (listJ == null) {
            return null;
        }
        for (Object obj2 : listJ) {
            if (((NetworkSettings) obj2).getProviderInstanceName().equals(instanceName)) {
                obj = obj2;
                break;
            }
        }
        return (NetworkSettings) obj;
    }

    public /* synthetic */ W(IronSource.a aVar, String str, List list, C0561s2 c0561s2, int i10, int i11, boolean z10, int i12, int i13, O0 o6, J0 j10, long j11, boolean z11, boolean z12, boolean z13, boolean z14, int i14, kotlin.jvm.internal.g gVar) {
        this(aVar, str, list, c0561s2, i10, i11, z10, i12, i13, o6, j10, j11, z11, z12, z13, (i14 & 32768) != 0 ? false : z14);
    }
}
