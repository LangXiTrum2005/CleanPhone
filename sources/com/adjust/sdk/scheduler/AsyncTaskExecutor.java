package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.m0;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncTaskExecutor<Params, Result> {
    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        Executors.newSingleThreadExecutor().execute(new m0(this, paramsArr, new Handler(Looper.getMainLooper()), 27));
        return this;
    }

    public void onPreExecute() {
    }

    public void onPostExecute(Result result) {
    }
}
