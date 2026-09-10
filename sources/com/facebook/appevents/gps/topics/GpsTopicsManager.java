package com.facebook.appevents.gps.topics;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.ironsource.Ve;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import r9.b;
import v7.a;
import wj.d;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/facebook/appevents/gps/topics/GpsTopicsManager;", "", "<init>", "()V", "Lwj/r;", "enableTopicsObservation", "Ljava/util/concurrent/CompletableFuture;", "", "Lcom/facebook/appevents/gps/topics/TopicData;", "getTopics", "()Ljava/util/concurrent/CompletableFuture;", "", "shouldObserveTopics", "()Z", "Lb/a;", Ve.f27442n, "processObservedTopics", "(Lb/a;)Ljava/util/List;", "RECORD_OBSERVATION", "Z", "", "TAG", "Ljava/lang/String;", "Ljava/util/concurrent/Executor;", "executor$delegate", "Lwj/d;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTopicsObservationEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class GpsTopicsManager {
    public static final GpsTopicsManager INSTANCE = new GpsTopicsManager();
    private static final boolean RECORD_OBSERVATION = true;
    private static final String TAG;

    /* JADX INFO: renamed from: executor$delegate, reason: from kotlin metadata */
    private static final d executor;
    private static final AtomicBoolean isTopicsObservationEnabled;

    static {
        String string = GpsTopicsManager.class.toString();
        n.e(string, "GpsTopicsManager::class.java.toString()");
        TAG = string;
        executor = b.u(GpsTopicsManager$executor$2.INSTANCE);
        isTopicsObservationEnabled = new AtomicBoolean(false);
    }

    private GpsTopicsManager() {
    }

    public static final /* synthetic */ String access$getTAG$p() {
        if (a.b(GpsTopicsManager.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            a.a(GpsTopicsManager.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ List access$processObservedTopics(GpsTopicsManager gpsTopicsManager, b.a aVar) {
        if (a.b(GpsTopicsManager.class)) {
            return null;
        }
        try {
            return gpsTopicsManager.processObservedTopics(aVar);
        } catch (Throwable th2) {
            a.a(GpsTopicsManager.class, th2);
            return null;
        }
    }

    public static final void enableTopicsObservation() {
        if (a.b(GpsTopicsManager.class)) {
            return;
        }
        try {
            isTopicsObservationEnabled.set(true);
        } catch (Throwable th2) {
            a.a(GpsTopicsManager.class, th2);
        }
    }

    private final Executor getExecutor() {
        if (a.b(this)) {
            return null;
        }
        try {
            Object value = executor.getValue();
            n.e(value, "<get-executor>(...)");
            return (Executor) value;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    @TargetApi(34)
    public static final CompletableFuture<List<TopicData>> getTopics() {
        if (a.b(GpsTopicsManager.class)) {
            return null;
        }
        try {
            if (!shouldObserveTopics()) {
                CompletableFuture<List<TopicData>> completableFutureCompletedFuture = CompletableFuture.completedFuture(v.f53866a);
                n.e(completableFutureCompletedFuture, "completedFuture(emptyList())");
                return completableFutureCompletedFuture;
            }
            final CompletableFuture<List<TopicData>> completableFuture = new CompletableFuture<>();
            try {
                s.b();
                new OutcomeReceiver() { // from class: com.facebook.appevents.gps.topics.GpsTopicsManager$getTopics$callback$1
                    public void onResult(b.a response) {
                        n.f(response, "response");
                        throw null;
                    }

                    public void onError(Exception error) {
                        n.f(error, "error");
                        Log.w(GpsTopicsManager.access$getTAG$p(), "GPS_TOPICS_OBSERVATION_FAILURE", error);
                        completableFuture.completeExceptionally(error);
                    }

                    public /* synthetic */ void onResult(Object obj) {
                        if (obj != null) {
                            throw new ClassCastException();
                        }
                        onResult((b.a) null);
                    }
                };
                throw new RuntimeException("Stub!");
            } catch (Throwable th2) {
                Log.w(TAG, "GPS_TOPICS_OBSERVATION_FAILURE", th2);
                completableFuture.completeExceptionally(th2);
                return completableFuture;
            }
        } catch (Throwable th3) {
            a.a(GpsTopicsManager.class, th3);
            return null;
        }
    }

    @TargetApi(34)
    private final List<TopicData> processObservedTopics(b.a response) {
        if (a.b(this)) {
            return null;
        }
        try {
            throw null;
        } catch (Throwable th2) {
            a.a(this, th2);
            return null;
        }
    }

    public static final boolean shouldObserveTopics() {
        if (a.b(GpsTopicsManager.class)) {
            return false;
        }
        try {
            return isTopicsObservationEnabled.get() && Build.VERSION.SDK_INT >= 33;
        } catch (Throwable th2) {
            a.a(GpsTopicsManager.class, th2);
            return false;
        }
    }
}
