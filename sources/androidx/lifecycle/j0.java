package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends g {
    final /* synthetic */ k0 this$0;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends g {
        final /* synthetic */ k0 this$0;

        public a(k0 k0Var) {
            this.this$0 = k0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.n.f(activity, "activity");
            k0 k0Var = this.this$0;
            int i10 = k0Var.f4557b + 1;
            k0Var.f4557b = i10;
            if (i10 == 1) {
                if (k0Var.f4558c) {
                    k0Var.f4561f.e(m.ON_RESUME);
                    k0Var.f4558c = false;
                } else {
                    Handler handler = k0Var.f4560e;
                    kotlin.jvm.internal.n.c(handler);
                    handler.removeCallbacks(k0Var.f4562g);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.n.f(activity, "activity");
            k0 k0Var = this.this$0;
            int i10 = k0Var.f4556a + 1;
            k0Var.f4556a = i10;
            if (i10 == 1 && k0Var.f4559d) {
                k0Var.f4561f.e(m.ON_START);
                k0Var.f4559d = false;
            }
        }
    }

    public j0(k0 k0Var) {
        this.this$0 = k0Var;
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.n.f(activity, "activity");
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        k0 k0Var = this.this$0;
        int i10 = k0Var.f4557b - 1;
        k0Var.f4557b = i10;
        if (i10 == 0) {
            Handler handler = k0Var.f4560e;
            kotlin.jvm.internal.n.c(handler);
            handler.postDelayed(k0Var.f4562g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.n.f(activity, "activity");
        i0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        k0 k0Var = this.this$0;
        int i10 = k0Var.f4556a - 1;
        k0Var.f4556a = i10;
        if (i10 == 0 && k0Var.f4558c) {
            k0Var.f4561f.e(m.ON_STOP);
            k0Var.f4559d = true;
        }
    }
}
