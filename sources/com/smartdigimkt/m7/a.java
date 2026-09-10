package com.smartdigimkt.m7;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
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

/* JADX INFO: loaded from: classes4.dex */
public class a {
    private static final String k = "sdm_AdLifecycleManager";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile a f36876l = null;
    private static final long m = 500;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f36878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36879c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Runnable f36881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f36882i;
    private final Handler d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36880e = 0;
    private boolean f = true;
    private boolean g = false;
    private final List<Application.ActivityLifecycleCallbacks> j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<WeakReference<b>> f36877a = new HashSet();

    /* JADX INFO: renamed from: com.smartdigimkt.m7.a$a, reason: collision with other inner class name */
    public class C0546a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: com.smartdigimkt.m7.a$a$a, reason: collision with other inner class name */
        public class RunnableC0547a implements Runnable {
            final /* synthetic */ Activity X;

            public RunnableC0547a(Activity activity) {
                this.X = activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f36880e != 0 || a.this.g) {
                    return;
                }
                a.this.f = true;
                Context applicationContext = this.X;
                if (applicationContext != null) {
                    applicationContext = applicationContext.getApplicationContext();
                }
                com.smartdigimkt.r7.a.a().a(applicationContext, false);
                com.smartdigimkt.m6.b.p().d(false);
            }
        }

        public C0546a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Objects.toString(activity);
            Objects.toString(bundle);
            a.this.f36879c = activity.getClass().getName();
            a.this.a(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Objects.toString(activity);
            a.this.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Objects.toString(activity);
            a.this.b(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Objects.toString(activity);
            a.this.f36879c = activity.getClass().getName();
            a.this.c(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Objects.toString(activity);
            Objects.toString(bundle);
            a.this.b(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Objects.toString(activity);
            a.b(a.this);
            if (a.this.f36880e == 1 && a.this.f) {
                a.this.f = false;
                com.smartdigimkt.r7.a.a().a(activity != null ? activity.getApplicationContext() : activity, true);
                com.smartdigimkt.m6.b.p().d(true);
            }
            a.this.g = false;
            a.this.d(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Objects.toString(activity);
            a.c(a.this);
            a.this.g = activity.isChangingConfigurations();
            try {
                if (a.this.f36881h != null) {
                    a.this.d.removeCallbacks(a.this.f36881h);
                }
                a.this.f36881h = new RunnableC0547a(activity);
                a.this.d.postDelayed(a.this.f36881h, 500L);
            } catch (Throwable unused) {
            }
            a.this.e(activity);
        }
    }

    public interface b {
        void a(Activity activity);

        void b(Activity activity);

        void c(Activity activity);

        void d(Activity activity);

        void e(Activity activity);

        void f(Activity activity);
    }

    public static /* synthetic */ int b(a aVar) {
        int i2 = aVar.f36880e;
        aVar.f36880e = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int c(a aVar) {
        int i2 = aVar.f36880e;
        aVar.f36880e = i2 - 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Activity activity) {
        try {
            synchronized (this.j) {
                try {
                    if (!this.j.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.j) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStopped(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f36877a).iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.a(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String c() {
        return this.f36879c;
    }

    public boolean d() {
        return this.f;
    }

    private boolean c(b bVar) {
        try {
            Iterator it = new CopyOnWriteArraySet(this.f36877a).iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == bVar) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void b(Application application) {
        try {
            if (this.f36878b) {
                return;
            }
            if (application != null) {
                this.f36882i = application.getApplicationContext();
            }
            a(application);
            this.f36878b = true;
        } catch (Throwable unused) {
        }
    }

    public void d(b bVar) {
        if (bVar == null) {
            return;
        }
        try {
            synchronized (this.f36877a) {
                try {
                    Iterator<WeakReference<b>> it = this.f36877a.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == bVar) {
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

    private void a(Application application) {
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new C0546a());
    }

    public static a b() {
        if (f36876l == null) {
            synchronized (a.class) {
                try {
                    if (f36876l == null) {
                        f36876l = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f36876l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Activity activity) {
        try {
            synchronized (this.j) {
                try {
                    if (!this.j.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.j) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityResumed(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f36877a).iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.f(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(b bVar) {
        if (bVar == null) {
            return;
        }
        try {
            synchronized (this.f36877a) {
                try {
                    if (!c(bVar)) {
                        this.f36877a.add(new WeakReference<>(bVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Activity activity) {
        try {
            synchronized (this.j) {
                try {
                    if (!this.j.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.j) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStarted(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f36877a).iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.c(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity, Bundle bundle) {
        try {
            synchronized (this.j) {
                try {
                    if (!this.j.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.j) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f36877a).iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.d(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private WeakReference<b> b(b bVar) {
        for (WeakReference<b> weakReference : new CopyOnWriteArraySet(this.f36877a)) {
            if (weakReference.get() == bVar) {
                return weakReference;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Activity activity) {
        try {
            synchronized (this.j) {
                try {
                    if (!this.j.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.j) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityPaused(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f36877a).iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.b(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        try {
            synchronized (this.j) {
                try {
                    if (!this.j.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.j) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityDestroyed(activity);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f36877a).iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.e(activity);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void b(Activity activity, Bundle bundle) {
        try {
            synchronized (this.j) {
                try {
                    if (!this.j.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.j) {
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

    public void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (activityLifecycleCallbacks == null) {
            return;
        }
        try {
            synchronized (this.j) {
                try {
                    if (!this.j.contains(activityLifecycleCallbacks)) {
                        this.j.add(activityLifecycleCallbacks);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public Context a() {
        return this.f36882i;
    }
}
