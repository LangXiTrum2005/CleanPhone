package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b30 f17231b;

    public /* synthetic */ m30(b30 b30Var, int i10) {
        this.f17230a = i10;
        this.f17231b = b30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17230a) {
            case 0:
                this.f17231b.destroy();
                break;
            case 1:
                this.f17231b.destroy();
                break;
            case 2:
                this.f17231b.onPause();
                break;
            case 3:
                this.f17231b.onResume();
                break;
            case 4:
                this.f17231b.destroy();
                break;
            case 5:
                this.f17231b.e("onSdkImpression", new x.e(0));
                break;
            case 6:
                this.f17231b.destroy();
                break;
            default:
                this.f17231b.s();
                break;
        }
    }
}
