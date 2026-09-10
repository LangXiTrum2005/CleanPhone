package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.t0;
import com.google.android.gms.internal.consent_sdk.m7;
import com.google.common.util.concurrent.ListenableFuture;
import d5.f;
import d5.h;
import d5.x;
import g9.k;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import n5.o;
import n5.p;
import o5.j;
import p5.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;

    @NonNull
    private WorkerParameters mWorkerParams;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f5015f;
    }

    @NonNull
    public ListenableFuture getForegroundInfoAsync() {
        j jVar = new j();
        jVar.i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.f5010a;
    }

    @NonNull
    public final f getInputData() {
        return this.mWorkerParams.f5011b;
    }

    @Nullable
    public final Network getNetwork() {
        return (Network) this.mWorkerParams.f5013d.f52505d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.f5014e;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.f5012c;
    }

    @NonNull
    public a getTaskExecutor() {
        return this.mWorkerParams.f5016g;
    }

    @NonNull
    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.f5013d.f52503b;
    }

    @NonNull
    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.f5013d.f52504c;
    }

    @NonNull
    public x getWorkerFactory() {
        return this.mWorkerParams.f5017h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    @NonNull
    public final ListenableFuture setForegroundAsync(@NonNull h hVar) {
        this.mRunInForeground = true;
        o oVar = this.mWorkerParams.f5019j;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        oVar.getClass();
        j jVar = new j();
        ((k) oVar.f46549a).k(new m7(oVar, jVar, id2, hVar, applicationContext, 4, false));
        return jVar;
    }

    @NonNull
    public ListenableFuture setProgressAsync(@NonNull f fVar) {
        p pVar = this.mWorkerParams.f5018i;
        getApplicationContext();
        UUID id2 = getId();
        pVar.getClass();
        j jVar = new j();
        ((k) pVar.f46554b).k(new t0(pVar, id2, fVar, jVar, 10));
        return jVar;
    }

    public void setRunInForeground(boolean z10) {
        this.mRunInForeground = z10;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }

    public void onStopped() {
    }
}
