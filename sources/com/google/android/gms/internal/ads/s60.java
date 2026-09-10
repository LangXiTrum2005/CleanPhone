package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s60 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u60 f19875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19877d;

    public /* synthetic */ s60(u60 u60Var, int i10, int i11, int i12) {
        this.f19874a = i12;
        this.f19875b = u60Var;
        this.f19876c = i10;
        this.f19877d = i11;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f19874a) {
            case 0:
                u60 u60Var = this.f19875b;
                u60Var.f20649b.execute(new s60(u60Var, this.f19876c, this.f19877d, 1));
                break;
            default:
                this.f19875b.b(this.f19876c - 1, this.f19877d);
                break;
        }
    }
}
