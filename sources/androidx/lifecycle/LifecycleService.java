package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/LifecycleService;", "Landroid/app/Service;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class LifecycleService extends Service implements LifecycleOwner {
    public final ServiceLifecycleDispatcher X = new ServiceLifecycleDispatcher(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.X.f5275a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.f(intent, "intent");
        this.X.a(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.X.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Lifecycle.Event event = Lifecycle.Event.ON_STOP;
        ServiceLifecycleDispatcher serviceLifecycleDispatcher = this.X;
        serviceLifecycleDispatcher.a(event);
        serviceLifecycleDispatcher.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i2) {
        this.X.a(Lifecycle.Event.ON_START);
        super.onStart(intent, i2);
    }
}
