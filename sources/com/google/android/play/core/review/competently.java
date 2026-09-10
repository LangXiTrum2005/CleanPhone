package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import collectively.graveside;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public class competently extends collectively.competently {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final collectively.taiyuan f21485dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final /* synthetic */ taiyuan f21486marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final TaskCompletionSource f21487wireman;

    public competently(taiyuan taiyuanVar, collectively.taiyuan taiyuanVar2, TaskCompletionSource taskCompletionSource) {
        this.f21486marial = taiyuanVar;
        this.f21485dern = taiyuanVar2;
        this.f21487wireman = taskCompletionSource;
    }

    @Override // collectively.impromptu
    public void zzb(Bundle bundle) throws RemoteException {
        graveside gravesideVar = this.f21486marial.f21490attabal;
        if (gravesideVar != null) {
            gravesideVar.adultoid(this.f21487wireman);
        }
        this.f21485dern.dern("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
