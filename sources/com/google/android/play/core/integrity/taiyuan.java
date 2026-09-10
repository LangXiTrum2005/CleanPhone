package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan extends dirl.gintrap {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final dirl.preprohormone f21475dern = new dirl.preprohormone("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final /* synthetic */ cutely f21476marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final TaskCompletionSource f21477wireman;

    public taiyuan(cutely cutelyVar, TaskCompletionSource taskCompletionSource) {
        this.f21476marial = cutelyVar;
        this.f21477wireman = taskCompletionSource;
    }

    @Override // dirl.rotuma
    public final void dern(Bundle bundle) {
        this.f21476marial.f21451marial.dovishness(this.f21477wireman);
        this.f21475dern.dern("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionAttabal = this.f21476marial.f21453wireman.attabal(bundle);
        if (apiExceptionAttabal != null) {
            this.f21477wireman.trySetException(apiExceptionAttabal);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f21477wireman.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        impromptu impromptuVar = new impromptu(this, this.f21476marial.f21452saneness, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f21477wireman;
        attabal attabalVar = new attabal();
        attabalVar.saneness(string);
        attabalVar.attabal(impromptuVar);
        taskCompletionSource.trySetResult(attabalVar.dern());
    }
}
