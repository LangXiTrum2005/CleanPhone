package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class di0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ci0 f13552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13553c;

    public /* synthetic */ di0(ci0 ci0Var, String str, int i10) {
        this.f13551a = i10;
        this.f13552b = ci0Var;
        this.f13553c = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f13551a) {
            case 0:
                this.f13552b.f13172d.zzc(this.f13553c, null);
                break;
            default:
                this.f13552b.f13172d.zzc(this.f13553c, null);
                break;
        }
    }
}
