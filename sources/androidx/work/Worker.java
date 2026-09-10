package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.a0;
import com.google.common.util.concurrent.ListenableFuture;
import d5.n;
import o5.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f5009a;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract n doWork();

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final ListenableFuture startWork() {
        this.f5009a = new j();
        getBackgroundExecutor().execute(new a0(this, 8));
        return this.f5009a;
    }
}
