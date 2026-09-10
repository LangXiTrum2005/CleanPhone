package com.vungle.ads.internal.executor;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.util.arytenoidectomy;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FutureResult.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002:\u0001\u0018B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\r\u0010\u0013R\u001f\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/vungle/ads/internal/executor/saneness;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "", "mayInterruptIfRunning", "cancel", "(Z)Z", "isCancelled", "()Z", "isDone", "get", "()Ljava/lang/Object;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "Ljava/util/concurrent/Future;", "getFuture", "()Ljava/util/concurrent/Future;", "Companion", "attabal", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class saneness<T> implements Future<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = saneness.class.getSimpleName();
    private final Future<T> future;

    /* JADX INFO: renamed from: com.vungle.ads.internal.executor.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FutureResult.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/executor/saneness$attabal;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return saneness.TAG;
        }

        private Companion() {
        }
    }

    public saneness(Future<T> future) {
        this.future = future;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        Future<T> future = this.future;
        if (future != null) {
            return future.cancel(mayInterruptIfRunning);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            arytenoidectomy.Companion companion2 = arytenoidectomy.INSTANCE;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            companion2.e(TAG3, "error on execution", e);
            return null;
        }
    }

    public final Future<T> getFuture() {
        return this.future;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Future<T> future = this.future;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        try {
            Future<T> future = this.future;
            if (future != null) {
                return future.get(timeout, unit);
            }
            return null;
        } catch (InterruptedException unused) {
            arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.w(TAG2, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            arytenoidectomy.Companion companion2 = arytenoidectomy.INSTANCE;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            companion2.e(TAG3, "error on execution", e);
            return null;
        } catch (TimeoutException e2) {
            arytenoidectomy.Companion companion3 = arytenoidectomy.INSTANCE;
            String TAG4 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            companion3.e(TAG4, "error on timeout", e2);
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            companion3.w(TAG4, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}
