package androidx.lifecycle;

import A.RunnableC0883c;
import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "Api29Impl", "Companion", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final ProcessLifecycleOwner j0 = new ProcessLifecycleOwner();
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f5252Y;
    public Handler f0;
    public boolean Z = true;
    public boolean e0 = true;
    public final LifecycleRegistry g0 = new LifecycleRegistry(this);
    public final RunnableC0883c h0 = new RunnableC0883c(this, 28);
    public final ProcessLifecycleOwner$initializationListener$1 i0 = new ProcessLifecycleOwner$initializationListener$1(this);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "", "a", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api29Impl {
        @JvmStatic
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.f(activity, "activity");
            Intrinsics.f(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "Landroidx/lifecycle/ProcessLifecycleOwner;", "newInstance", "Landroidx/lifecycle/ProcessLifecycleOwner;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    public final void a() {
        int i2 = this.f5252Y + 1;
        this.f5252Y = i2;
        if (i2 == 1) {
            if (this.Z) {
                this.g0.f(Lifecycle.Event.ON_RESUME);
                this.Z = false;
            } else {
                Handler handler = this.f0;
                Intrinsics.c(handler);
                handler.removeCallbacks(this.h0);
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.g0;
    }
}
