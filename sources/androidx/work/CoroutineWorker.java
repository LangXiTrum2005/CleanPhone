package androidx.work;

import ak.f;
import android.content.Context;
import androidx.lifecycle.a0;
import b4.b;
import bk.a;
import cn.d0;
import cn.h1;
import cn.l;
import cn.n0;
import cn.s;
import cn.w;
import com.google.android.gms.internal.play_billing.q1;
import com.google.common.util.concurrent.ListenableFuture;
import d5.g;
import d5.h;
import g9.k;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hn.d;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import o5.j;
import ta.i0;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010%\u001a\u00020$8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u0019\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ld5/n;", "startWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "Ld5/h;", "getForegroundInfo", "(Lak/f;)Ljava/lang/Object;", "Ld5/f;", "data", "Lwj/r;", "setProgress", "(Ld5/f;Lak/f;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Ld5/h;Lak/f;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "()V", "Lcn/s;", "job", "Lcn/s;", "getJob$work_runtime_ktx_release", "()Lcn/s;", "Lo5/j;", "future", "Lo5/j;", "getFuture$work_runtime_ktx_release", "()Lo5/j;", "Lcn/w;", "coroutineContext", "Lcn/w;", "getCoroutineContext", "()Lcn/w;", "getCoroutineContext$annotations", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public abstract class CoroutineWorker extends ListenableWorker {
    private final w coroutineContext;
    private final j future;
    private final s job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        n.f(appContext, "appContext");
        n.f(params, "params");
        this.job = d0.c();
        j jVar = new j();
        this.future = jVar;
        jVar.addListener(new a0(this, 7), (n5.j) ((k) getTaskExecutor()).f41770b);
        this.coroutineContext = n0.f6748a;
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, f fVar) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(f fVar);

    public w getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(f fVar) {
        return getForegroundInfo$suspendImpl(this, fVar);
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture getForegroundInfoAsync() {
        h1 h1VarC = d0.c();
        d dVarB = d0.b(getCoroutineContext().plus(h1VarC));
        d5.j jVar = new d5.j(h1VarC);
        d0.w(dVarB, null, new b(jVar, this, (f) null, 1), 3);
        return jVar;
    }

    /* JADX INFO: renamed from: getFuture$work_runtime_ktx_release, reason: from getter */
    public final j getFuture() {
        return this.future;
    }

    /* JADX INFO: renamed from: getJob$work_runtime_ktx_release, reason: from getter */
    public final s getJob() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(h hVar, f fVar) throws Throwable {
        Object objS;
        ListenableFuture foregroundAsync = setForegroundAsync(hVar);
        n.e(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                objS = foregroundAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            l lVar = new l(1, q1.t(fVar));
            lVar.t();
            foregroundAsync.addListener(new i0(lVar, false, foregroundAsync, 3), g.f38692a);
            objS = lVar.s();
        }
        return objS == a.f5708a ? objS : r.f53297a;
    }

    public final Object setProgress(d5.f fVar, f fVar2) throws Throwable {
        Object objS;
        ListenableFuture progressAsync = setProgressAsync(fVar);
        n.e(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                objS = progressAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            l lVar = new l(1, q1.t(fVar2));
            lVar.t();
            progressAsync.addListener(new i0(lVar, false, progressAsync, 3), g.f38692a);
            objS = lVar.s();
        }
        return objS == a.f5708a ? objS : r.f53297a;
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture startWork() {
        d0.w(d0.b(getCoroutineContext().plus(this.job)), null, new b4.a(this, null, 2), 3);
        return this.future;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }
}
