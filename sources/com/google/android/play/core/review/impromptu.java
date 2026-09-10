package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class impromptu extends competently {
    public impromptu(taiyuan taiyuanVar, TaskCompletionSource taskCompletionSource, String str) {
        super(taiyuanVar, new collectively.taiyuan("OnRequestInstallCallback"), taskCompletionSource);
    }

    @Override // com.google.android.play.core.review.competently, collectively.impromptu
    public final void zzb(Bundle bundle) throws RemoteException {
        super.zzb(bundle);
        this.f21487wireman.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
