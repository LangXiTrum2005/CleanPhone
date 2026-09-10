package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r30 f18109b;

    public /* synthetic */ o30(r30 r30Var, int i10) {
        this.f18108a = i10;
        this.f18109b = r30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18108a) {
            case 0:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                this.f18109b.n0();
                break;
        }
    }
}
