package com.google.android.play.core.review.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zzn extends zzj {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ zzt f19654Y;

    public zzn(zzt zztVar) {
        this.f19654Y = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void b() {
        synchronized (this.f19654Y.f) {
            try {
                if (this.f19654Y.k.get() > 0 && this.f19654Y.k.decrementAndGet() > 0) {
                    this.f19654Y.f19659b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                zzt zztVar = this.f19654Y;
                if (zztVar.m != null) {
                    zztVar.f19659b.a("Unbind from service.", new Object[0]);
                    zzt zztVar2 = this.f19654Y;
                    zztVar2.f19658a.unbindService(zztVar2.f19664l);
                    zzt zztVar3 = this.f19654Y;
                    zztVar3.g = false;
                    zztVar3.m = null;
                    zztVar3.f19664l = null;
                }
                this.f19654Y.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
