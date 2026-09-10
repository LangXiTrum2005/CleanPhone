package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14260c;

    public /* synthetic */ f6(boolean z10, boolean z11, boolean z12) {
        this.f14258a = z10;
        this.f14259b = z11;
        this.f14260c = z12;
    }

    public r1.c a() {
        if (this.f14258a || !(this.f14259b || this.f14260c)) {
            return new r1.c(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public boolean b() {
        return (this.f14260c || this.f14259b) && this.f14258a;
    }

    public p02 c() {
        if (this.f14258a || !(this.f14259b || this.f14260c)) {
            return new p02(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
