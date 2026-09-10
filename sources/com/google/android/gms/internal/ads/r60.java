package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r60 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u60 f19435b;

    public /* synthetic */ r60(u60 u60Var, int i10) {
        this.f19434a = i10;
        this.f19435b = u60Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f19434a) {
            case 0:
                u60 u60Var = this.f19435b;
                u60Var.f20649b.execute(new r60(u60Var, 1));
                break;
            default:
                this.f19435b.v();
                break;
        }
    }
}
