package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b10 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d10 f12595b;

    public /* synthetic */ b10(d10 d10Var, int i10) {
        this.f12594a = i10;
        this.f12595b = d10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12594a) {
            case 0:
                this.f12595b.c("surfaceCreated", new String[0]);
                break;
            case 1:
                this.f12595b.c("surfaceDestroyed", new String[0]);
                break;
            default:
                this.f12595b.c("firstFrameRendered", new String[0]);
                break;
        }
    }
}
