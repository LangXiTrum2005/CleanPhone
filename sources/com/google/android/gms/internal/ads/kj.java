package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kj extends m00 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16455b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16456c;

    public kj(Object obj) {
        this.f16456c = obj;
    }

    public void a() {
        zzc(this.f16456c);
    }

    @Override // com.google.android.gms.internal.ads.m00, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        switch (this.f16455b) {
            case 0:
                ((t6.l) this.f16456c).i();
                break;
        }
        return super.cancel(z10);
    }

    public kj(t6.l lVar) {
        this.f16456c = lVar;
    }
}
