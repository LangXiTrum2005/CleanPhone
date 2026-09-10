package t6;

import a7.p;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.h1;
import androidx.lifecycle.o;
import java.io.File;
import java.util.HashMap;
import m0.s1;
import n6.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Handler.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ne.c f50542d = new ne.c(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile com.bumptech.glide.k f50543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne.a f50544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f50545c = new s1(f50542d);

    public i() {
        File file = s.f46607d;
        this.f50544b = new ne.a(16);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final com.bumptech.glide.k b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = p.f3444a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                if (!(Looper.myLooper() == Looper.getMainLooper())) {
                    return b(fragmentActivity.getApplicationContext());
                }
                if (fragmentActivity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f50544b.getClass();
                Activity activityA = a(fragmentActivity);
                boolean z10 = activityA == null || !activityA.isFinishing();
                com.bumptech.glide.b bVarA = com.bumptech.glide.b.a(fragmentActivity.getApplicationContext());
                s1 s1Var = this.f50545c;
                o lifecycle = fragmentActivity.getLifecycle();
                h1 h1VarF = fragmentActivity.F();
                s1Var.getClass();
                p.a();
                p.a();
                com.bumptech.glide.k kVar = (com.bumptech.glide.k) ((HashMap) s1Var.f45751b).get(lifecycle);
                if (kVar != null) {
                    return kVar;
                }
                e eVar = new e(lifecycle);
                ne.c cVar = (ne.c) s1Var.f45752c;
                ne.a aVar = new ne.a(s1Var, h1VarF);
                cVar.getClass();
                com.bumptech.glide.k kVar2 = new com.bumptech.glide.k(bVarA, eVar, aVar, fragmentActivity);
                ((HashMap) s1Var.f45751b).put(lifecycle, kVar2);
                eVar.c(new g(s1Var, lifecycle));
                if (z10) {
                    kVar2.onStart();
                }
                return kVar2;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return b(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f50543a == null) {
            synchronized (this) {
                try {
                    if (this.f50543a == null) {
                        this.f50543a = new com.bumptech.glide.k(com.bumptech.glide.b.a(context.getApplicationContext()), new ne.a(15), new ne.c(16), context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f50543a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
