package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import androidx.datastore.core.a;
import com.charging.screenshow.battery.animations.themes.activity.x;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.NonDisposableHandle;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-android"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HandlerContext extends HandlerDispatcher implements Delay {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Handler f44773Y;
    public final boolean Z;
    public final HandlerContext e0;

    public HandlerContext(Handler handler, boolean z2) {
        this.f44773Y = handler;
        this.Z = z2;
        this.e0 = z2 ? this : new HandlerContext(handler, true);
    }

    @Override // kotlinx.coroutines.Delay
    public final void S(long j, final CancellableContinuationImpl cancellableContinuationImpl) {
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                cancellableContinuationImpl.B(this, Unit.f43263a);
            }
        };
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f44773Y.postDelayed(runnable, j)) {
            cancellableContinuationImpl.s(new x(1, this, runnable));
        } else {
            n0(cancellableContinuationImpl.f0, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void U(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f44773Y.post(runnable)) {
            return;
        }
        n0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean c0(CoroutineContext coroutineContext) {
        return (this.Z && Intrinsics.a(Looper.myLooper(), this.f44773Y.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.f44773Y == this.f44773Y && handlerContext.Z == this.Z;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f44773Y) ^ (this.Z ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    public final DisposableHandle i(long j, Runnable runnable, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f44773Y.postDelayed(runnable, j)) {
            return new a(1, this, runnable);
        }
        n0(coroutineContext, runnable);
        return NonDisposableHandle.X;
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public final MainCoroutineDispatcher j0() {
        return this.e0;
    }

    public final void n0(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        Job job = (Job) coroutineContext.get(Job.Key.X);
        if (job != null) {
            job.a(cancellationException);
        }
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        DefaultIoScheduler.f45062Y.U(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        MainCoroutineDispatcher mainCoroutineDispatcherJ0;
        String str;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatcherLoader.f45042a;
        if (this == mainCoroutineDispatcher) {
            str = "Dispatchers.Main";
        } else {
            try {
                mainCoroutineDispatcherJ0 = mainCoroutineDispatcher.j0();
            } catch (UnsupportedOperationException unused) {
                mainCoroutineDispatcherJ0 = null;
            }
            str = this == mainCoroutineDispatcherJ0 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f44773Y.toString();
        return this.Z ? android.support.v4.media.a.m(string, ".immediate") : string;
    }
}
