package com.ironsource.mediationsdk;

import com.ironsource.C0257b2;
import com.ironsource.C0265ba;
import com.ironsource.C0400j2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f29534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<C0400j2> f29535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Object> f29539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f29540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C0257b2 f29542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C0265ba f29543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f29544k;
    private ISBannerSize l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f29545m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f29546n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f29547o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f29548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f29549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Boolean f29550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Double f29551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f29552t;

    public h(IronSource.a adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        this.f29534a = adUnit;
        this.f29535b = new ArrayList<>();
        this.f29537d = "";
        this.f29539f = new HashMap();
        this.f29540g = new ArrayList();
        this.f29541h = -1;
        this.f29544k = "";
    }

    public final IronSource.a a() {
        return this.f29534a;
    }

    public final void b(boolean z10) {
        this.f29538e = z10;
    }

    public final IronSource.a c() {
        return this.f29534a;
    }

    public final void d(boolean z10) {
        this.f29546n = z10;
    }

    public final C0257b2 e() {
        return this.f29542i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f29534a == ((h) obj).f29534a;
    }

    public final ISBannerSize f() {
        return this.l;
    }

    public final Double g() {
        return this.f29551s;
    }

    public final Map<String, Object> h() {
        return this.f29539f;
    }

    public int hashCode() {
        return this.f29534a.hashCode();
    }

    public final String j() {
        return this.f29537d;
    }

    public final ArrayList<C0400j2> k() {
        return this.f29535b;
    }

    public final List<String> l() {
        return this.f29540g;
    }

    public final String n() {
        return this.f29552t;
    }

    public final C0265ba o() {
        return this.f29543j;
    }

    public final int p() {
        return this.f29541h;
    }

    public final boolean q() {
        return this.f29546n;
    }

    public final boolean r() {
        return this.f29547o;
    }

    public final String s() {
        return this.f29544k;
    }

    public final boolean t() {
        return this.f29545m;
    }

    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f29534a + ")";
    }

    public final boolean u() {
        return this.f29538e;
    }

    public final Boolean v() {
        return this.f29550r;
    }

    public final boolean w() {
        return this.f29536c;
    }

    public final h a(IronSource.a adUnit) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        return new h(adUnit);
    }

    public final void b(String str) {
        this.f29548p = str;
    }

    public final void c(boolean z10) {
        this.f29536c = z10;
    }

    public final String d() {
        return this.f29548p;
    }

    public final void e(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f29544k = str;
    }

    public static /* synthetic */ h a(h hVar, IronSource.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = hVar.f29534a;
        }
        return hVar.a(aVar);
    }

    public final String b() {
        return this.f29549q;
    }

    public final void c(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f29537d = str;
    }

    public final void d(String str) {
        this.f29552t = str;
    }

    public final void e(boolean z10) {
        this.f29547o = z10;
    }

    public final void a(C0400j2 instanceInfo) {
        kotlin.jvm.internal.n.f(instanceInfo, "instanceInfo");
        this.f29535b.add(instanceInfo);
    }

    public final void a(Map<String, Object> map) {
        kotlin.jvm.internal.n.f(map, "<set-?>");
        this.f29539f = map;
    }

    public final void a(List<String> list) {
        kotlin.jvm.internal.n.f(list, "<set-?>");
        this.f29540g = list;
    }

    public final void a(int i10) {
        this.f29541h = i10;
    }

    public final void a(C0257b2 c0257b2) {
        this.f29542i = c0257b2;
    }

    public final void a(C0265ba c0265ba) {
        this.f29543j = c0265ba;
    }

    public final void a(ISBannerSize iSBannerSize) {
        this.l = iSBannerSize;
    }

    public final void a(boolean z10) {
        this.f29545m = z10;
    }

    public final void a(String str) {
        this.f29549q = str;
    }

    public final void a(Boolean bool) {
        this.f29550r = bool;
    }

    public final void a(Double d10) {
        this.f29551s = d10;
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void m() {
    }
}
