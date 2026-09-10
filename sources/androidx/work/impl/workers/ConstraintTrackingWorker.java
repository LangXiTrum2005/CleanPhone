package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import d5.o;
import e5.l;
import i5.b;
import java.util.ArrayList;
import java.util.List;
import o5.j;
import p5.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f5044f = o.i("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkerParameters f5045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f5047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f5048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ListenableWorker f5049e;

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5045a = workerParameters;
        this.f5046b = new Object();
        this.f5047c = false;
        this.f5048d = new j();
    }

    @Override // i5.b
    public final void c(ArrayList arrayList) {
        o.g().e(f5044f, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f5046b) {
            this.f5047c = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public final a getTaskExecutor() {
        return l.b(getApplicationContext()).f39112d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f5049e;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f5049e;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f5049e.stop();
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture startWork() {
        getBackgroundExecutor().execute(new q5.a(this, 0));
        return this.f5048d;
    }

    @Override // i5.b
    public final void f(List list) {
    }
}
