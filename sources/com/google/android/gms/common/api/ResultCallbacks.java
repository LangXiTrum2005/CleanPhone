package com.google.android.gms.common.api;

import android.util.Log;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    public abstract void onFailure(Status status);

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r) {
        Status status = r.getStatus();
        if (status.isSuccess()) {
            onSuccess(r);
            return;
        }
        onFailure(status);
        if (r instanceof Releasable) {
            try {
                ((Releasable) r).release();
            } catch (RuntimeException e2) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r)), e2);
            }
        }
    }

    public abstract void onSuccess(R r);
}
