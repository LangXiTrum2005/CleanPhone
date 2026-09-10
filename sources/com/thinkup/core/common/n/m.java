package com.thinkup.core.common.n;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile m f41887n = null;
    private static final String o = "AdLifecycleManager";
    private static final long om = 500;
    private Runnable mn;
    private volatile boolean o0;
    private String oo;
    private final Handler on = new Handler(Looper.getMainLooper());
    private int m0 = 0;
    private boolean mo = true;
    private boolean mm = false;
    private final List<Application.ActivityLifecycleCallbacks> n0 = new ArrayList();
    private final Set<WeakReference<o>> m = new HashSet();

    /* JADX INFO: renamed from: com.thinkup.core.common.n.m$1, reason: invalid class name */
    public class AnonymousClass1 implements Application.ActivityLifecycleCallbacks {
        public AnonymousClass1() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Objects.toString(activity);
            Objects.toString(bundle);
            m.this.oo = activity.getClass().getName();
            m.o(m.this, activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Objects.toString(activity);
            m.oo(m.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Objects.toString(activity);
            m.n(m.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Objects.toString(activity);
            m.this.oo = activity.getClass().getName();
            m.m(m.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Objects.toString(activity);
            Objects.toString(bundle);
            m.this.o(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Objects.toString(activity);
            m.o(m.this);
            if (m.this.m0 == 1 && m.this.mo) {
                m.this.mo = false;
                o0n.m().oo(true);
            }
            m.this.mm = false;
            o0n.m().o(activity);
            m.o(m.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Objects.toString(activity);
            m.o0(m.this);
            m.this.mm = activity.isChangingConfigurations();
            try {
                if (m.this.mn != null) {
                    m.this.on.removeCallbacks(m.this.mn);
                }
                m.this.mn = new Runnable() { // from class: com.thinkup.core.common.n.m.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (m.this.m0 != 0 || m.this.mm) {
                            return;
                        }
                        m.this.mo = true;
                        o0n.m().oo(false);
                    }
                };
                m.this.on.postDelayed(m.this.mn, 500L);
            } catch (Throwable unused) {
            }
            m.o0(m.this, activity);
        }
    }

    public interface o {
        void onCreate(Activity activity);

        void onDestroy(Activity activity);

        void onPause(Activity activity);

        void onResume(Activity activity);

        void onStart(Activity activity);

        void onStop(Activity activity);
    }

    public static /* synthetic */ int o(m mVar) {
        int i2 = mVar.m0;
        mVar.m0 = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int o0(m mVar) {
        int i2 = mVar.m0;
        mVar.m0 = i2 - 1;
        return i2;
    }

    public static m n() {
        if (f41887n == null) {
            synchronized (m.class) {
                try {
                    if (f41887n == null) {
                        f41887n = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f41887n;
    }

    private WeakReference<o> o0(o oVar) {
        for (WeakReference<o> weakReference : new CopyOnWriteArraySet(this.m)) {
            if (weakReference.get() == oVar) {
                return weakReference;
            }
        }
        return null;
    }

    private void oo(Activity activity) {
        try {
            synchronized (this.n0) {
                try {
                    if (!this.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityDestroyed(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onDestroy(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final boolean m() {
        return this.mo;
    }

    private void m(Application application) {
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new AnonymousClass1());
    }

    private void o0(Activity activity) {
        try {
            synchronized (this.n0) {
                try {
                    if (!this.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStopped(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onStop(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void m(o oVar) {
        try {
            synchronized (this.m) {
                try {
                    Iterator<WeakReference<o>> it = this.m.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == oVar) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final String o() {
        return this.oo;
    }

    public final void o(Application application) {
        try {
            if (this.o0) {
                return;
            }
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new AnonymousClass1());
            }
            this.o0 = true;
        } catch (Throwable unused) {
        }
    }

    private boolean n(o oVar) {
        try {
            Iterator it = new CopyOnWriteArraySet(this.m).iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == oVar) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void o(o oVar) {
        try {
            synchronized (this.m) {
                try {
                    if (!n(oVar)) {
                        this.m.add(new WeakReference<>(oVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void n(Activity activity) {
        try {
            synchronized (this.n0) {
                try {
                    if (!this.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityResumed(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onResume(activity);
                }
            }
            com.thinkup.core.common.o0.o.o();
            if (activity != null) {
                o0n.m();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void m(Activity activity, Bundle bundle) {
        try {
            synchronized (this.n0) {
                try {
                    if (!this.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onCreate(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void oo(m mVar, Activity activity) {
        try {
            synchronized (mVar.n0) {
                try {
                    if (!mVar.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityDestroyed(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onDestroy(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void o(Activity activity) {
        try {
            synchronized (this.n0) {
                try {
                    if (!this.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStarted(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onStart(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void o0(m mVar, Activity activity) {
        try {
            synchronized (mVar.n0) {
                try {
                    if (!mVar.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStopped(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onStop(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void m(Activity activity) {
        try {
            synchronized (this.n0) {
                try {
                    if (!this.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityPaused(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onPause(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void n(m mVar, Activity activity) {
        try {
            synchronized (mVar.n0) {
                try {
                    if (!mVar.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityPaused(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onPause(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void o(Activity activity, Bundle bundle) {
        try {
            synchronized (this.n0) {
                try {
                    if (!this.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void o(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        try {
            synchronized (this.n0) {
                try {
                    if (!this.n0.contains(activityLifecycleCallbacks)) {
                        this.n0.add(activityLifecycleCallbacks);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void m(m mVar, Activity activity) {
        try {
            synchronized (mVar.n0) {
                try {
                    if (!mVar.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityResumed(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onResume(activity);
                }
            }
            com.thinkup.core.common.o0.o.o();
            if (activity != null) {
                o0n.m();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static /* synthetic */ void o(m mVar, Activity activity) {
        try {
            synchronized (mVar.n0) {
                try {
                    if (!mVar.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStarted(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onStart(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void o(m mVar, Activity activity, Bundle bundle) {
        try {
            synchronized (mVar.n0) {
                try {
                    if (!mVar.n0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.n0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.m).iterator();
            while (it.hasNext()) {
                o oVar = (o) ((WeakReference) it.next()).get();
                if (oVar != null) {
                    oVar.onCreate(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
