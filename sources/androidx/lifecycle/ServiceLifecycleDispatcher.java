package androidx.lifecycle;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher;", "", "DispatchRunnable", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ServiceLifecycleDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleRegistry f5275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f5276b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DispatchRunnable f5277c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ServiceLifecycleDispatcher$DispatchRunnable;", "Ljava/lang/Runnable;", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DispatchRunnable implements Runnable {
        public final LifecycleRegistry X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final Lifecycle.Event f5278Y;
        public boolean Z;

        public DispatchRunnable(LifecycleRegistry registry, Lifecycle.Event event) {
            Intrinsics.f(registry, "registry");
            Intrinsics.f(event, "event");
            this.X = registry;
            this.f5278Y = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.Z) {
                return;
            }
            this.X.f(this.f5278Y);
            this.Z = true;
        }
    }

    public ServiceLifecycleDispatcher(LifecycleService lifecycleService) {
        this.f5275a = new LifecycleRegistry(lifecycleService);
    }

    public final void a(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.f5277c;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.f5275a, event);
        this.f5277c = dispatchRunnable2;
        this.f5276b.postAtFrontOfQueue(dispatchRunnable2);
    }
}
