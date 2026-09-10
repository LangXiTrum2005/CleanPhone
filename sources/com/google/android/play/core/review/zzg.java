package com.google.android.play.core.review;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzt;

/* JADX INFO: loaded from: classes4.dex */
class zzg extends com.google.android.play.core.review.internal.zzg {
    public final com.google.android.play.core.review.internal.zzi X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final TaskCompletionSource f19672Y;
    public final /* synthetic */ zzi Z;

    public zzg(zzi zziVar, com.google.android.play.core.review.internal.zzi zziVar2, TaskCompletionSource taskCompletionSource) {
        this.Z = zziVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.X = zziVar2;
        this.f19672Y = taskCompletionSource;
    }

    @Override // com.google.android.play.core.review.internal.zzh
    public void zzb(Bundle bundle) {
        zzt zztVar = this.Z.f19674a;
        if (zztVar != null) {
            zztVar.d(this.f19672Y);
        }
        this.X.a("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
