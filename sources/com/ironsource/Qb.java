package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Qb {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f27093m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f27094n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private J1 f27096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f27098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList<C0267bc> f27100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0267bc f27101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C0561s2 f27103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f27104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f27105k;
    private boolean l;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public Qb(int i10, long j10, boolean z10, J1 events, C0561s2 auctionSettings, int i11, long j11, boolean z11, boolean z12, boolean z13) {
        kotlin.jvm.internal.n.f(events, "events");
        kotlin.jvm.internal.n.f(auctionSettings, "auctionSettings");
        this.f27095a = z13;
        this.f27100f = new ArrayList<>();
        this.f27097c = i10;
        this.f27098d = j10;
        this.f27099e = z10;
        this.f27096b = events;
        this.f27102h = i11;
        this.f27103i = auctionSettings;
        this.f27104j = j11;
        this.f27105k = z11;
        this.l = z12;
    }

    public final void a(J1 j10) {
        kotlin.jvm.internal.n.f(j10, "<set-?>");
        this.f27096b = j10;
    }

    public final int b() {
        return this.f27097c;
    }

    public final long c() {
        return this.f27098d;
    }

    public final C0561s2 d() {
        return this.f27103i;
    }

    public final C0267bc e() {
        for (C0267bc c0267bc : this.f27100f) {
            if (c0267bc.d()) {
                return c0267bc;
            }
        }
        return this.f27101g;
    }

    public final int f() {
        return this.f27102h;
    }

    public final J1 g() {
        return this.f27096b;
    }

    public final long h() {
        return this.f27104j;
    }

    public final boolean i() {
        return this.f27105k;
    }

    public final boolean j() {
        return this.f27095a;
    }

    public final boolean k() {
        return this.l;
    }

    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.f27097c + ", bidderExclusive=" + this.f27099e + "}";
    }

    public final void a(int i10) {
        this.f27097c = i10;
    }

    public final void b(int i10) {
        this.f27102h = i10;
    }

    public final void c(boolean z10) {
        this.l = z10;
    }

    public final void a(long j10) {
        this.f27098d = j10;
    }

    public final void b(long j10) {
        this.f27104j = j10;
    }

    public final boolean a() {
        return this.f27099e;
    }

    public final void b(boolean z10) {
        this.f27105k = z10;
    }

    public final void a(boolean z10) {
        this.f27099e = z10;
    }

    public final void a(C0561s2 c0561s2) {
        kotlin.jvm.internal.n.f(c0561s2, "<set-?>");
        this.f27103i = c0561s2;
    }

    public final void a(C0267bc c0267bc) {
        if (c0267bc != null) {
            this.f27100f.add(c0267bc);
            if (this.f27101g == null) {
                this.f27101g = c0267bc;
            } else if (c0267bc.b() == 0) {
                this.f27101g = c0267bc;
            }
        }
    }

    public final C0267bc a(String placementName) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        for (C0267bc c0267bc : this.f27100f) {
            if (kotlin.jvm.internal.n.a(c0267bc.c(), placementName)) {
                return c0267bc;
            }
        }
        return null;
    }
}
