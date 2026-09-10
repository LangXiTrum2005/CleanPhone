package com.google.android.play.core.review.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zzq extends zzj {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ zzr f19656Y;

    public zzq(zzr zzrVar) {
        this.f19656Y = zzrVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void b() {
        zzt zztVar = this.f19656Y.X;
        zztVar.f19659b.a("unlinkToDeath", new Object[0]);
        zztVar.m.asBinder().unlinkToDeath(zztVar.j, 0);
        zztVar.m = null;
        zztVar.g = false;
    }
}
