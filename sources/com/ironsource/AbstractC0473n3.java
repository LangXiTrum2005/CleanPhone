package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0473n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0376hd f29792d;

    public AbstractC0473n3(int i10, String placementName, boolean z10, C0376hd c0376hd) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        this.f29789a = i10;
        this.f29790b = placementName;
        this.f29791c = z10;
        this.f29792d = c0376hd;
    }

    public final C0376hd a() {
        return this.f29792d;
    }

    public final int b() {
        return this.f29789a;
    }

    public final String c() {
        return this.f29790b;
    }

    public final boolean d() {
        return this.f29791c;
    }

    public String toString() {
        return defpackage.e.n("placement name: ", this.f29790b);
    }

    public final boolean a(int i10) {
        return this.f29789a == i10;
    }

    public /* synthetic */ AbstractC0473n3(int i10, String str, boolean z10, C0376hd c0376hd, int i11, kotlin.jvm.internal.g gVar) {
        this((i11 & 1) != 0 ? 0 : i10, str, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? null : c0376hd);
    }
}
