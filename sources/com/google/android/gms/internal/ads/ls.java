package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ls implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms f17117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17118c;

    public /* synthetic */ ls(ms msVar, String str, int i10) {
        this.f17116a = i10;
        this.f17117b = msVar;
        this.f17118c = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f17116a) {
            case 0:
                b30 b30Var = this.f17117b.f17535a;
                if (b30Var != null) {
                    b30Var.loadData(this.f17118c, "text/html", "UTF-8");
                }
                break;
            case 1:
                b30 b30Var2 = this.f17117b.f17535a;
                if (b30Var2 != null) {
                    b30Var2.loadData(this.f17118c, "text/html", "UTF-8");
                }
                break;
            case 2:
                b30 b30Var3 = this.f17117b.f17535a;
                if (b30Var3 != null) {
                    b30Var3.loadUrl(this.f17118c);
                }
                break;
            default:
                b30 b30Var4 = this.f17117b.f17535a;
                if (b30Var4 != null) {
                    b30Var4.zza(this.f17118c);
                }
                break;
        }
    }
}
