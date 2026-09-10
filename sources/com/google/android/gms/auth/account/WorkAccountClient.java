package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth.zzal;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public class WorkAccountClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private final WorkAccountApi zza;

    public WorkAccountClient(Activity activity) {
        super(activity, WorkAccount.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zza = new zzal();
    }

    public Task<Account> addWorkAccount(String str) {
        return PendingResultUtil.toTask(this.zza.addWorkAccount(asGoogleApiClient(), str), new zzg(this));
    }

    public Task<Void> removeWorkAccount(Account account) {
        return PendingResultUtil.toVoidTask(this.zza.removeWorkAccount(asGoogleApiClient(), account));
    }

    public Task<Void> setWorkAuthenticatorEnabled(boolean z2) {
        return PendingResultUtil.toVoidTask(this.zza.setWorkAuthenticatorEnabledWithResult(asGoogleApiClient(), z2));
    }

    public WorkAccountClient(Context context) {
        super(context, WorkAccount.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zza = new zzal();
    }
}
