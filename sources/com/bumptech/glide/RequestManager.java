package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class RequestManager implements ComponentCallbacks2, LifecycleListener, ModelTypes<RequestBuilder<Drawable>> {
    public static final RequestOptions l0;
    public final Glide X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Context f12312Y;
    public final Lifecycle Z;
    public final RequestTracker e0;
    public final RequestManagerTreeNode f0;
    public final TargetTracker g0;
    public final Runnable h0;
    public final ConnectivityMonitor i0;
    public final CopyOnWriteArrayList j0;
    public final RequestOptions k0;

    public static class ClearTarget extends CustomViewTarget<View, Object> {
        @Override // com.bumptech.glide.request.target.Target
        public final void g(Object obj, Transition transition) {
        }

        @Override // com.bumptech.glide.request.target.Target
        public final void j(Drawable drawable) {
        }
    }

    public class RequestManagerConnectivityListener implements ConnectivityMonitor.ConnectivityListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestTracker f12313a;

        public RequestManagerConnectivityListener(RequestTracker requestTracker) {
            this.f12313a = requestTracker;
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public final void a(boolean z2) {
            if (z2) {
                synchronized (RequestManager.this) {
                    RequestTracker requestTracker = this.f12313a;
                    for (Request request : Util.e(requestTracker.f12755a)) {
                        if (!request.e() && !request.c()) {
                            request.clear();
                            if (requestTracker.f12757c) {
                                requestTracker.f12756b.add(request);
                            } else {
                                request.h();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        RequestOptions requestOptions = (RequestOptions) new RequestOptions().d(Bitmap.class);
        requestOptions.m0 = true;
        l0 = requestOptions;
        ((RequestOptions) new RequestOptions().d(GifDrawable.class)).m0 = true;
    }

    public RequestManager(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        RequestOptions requestOptions;
        RequestTracker requestTracker = new RequestTracker();
        DefaultConnectivityMonitorFactory defaultConnectivityMonitorFactory = glide.g0;
        this.g0 = new TargetTracker();
        Runnable runnable = new Runnable() { // from class: com.bumptech.glide.RequestManager.1
            @Override // java.lang.Runnable
            public final void run() {
                RequestManager requestManager = RequestManager.this;
                requestManager.Z.b(requestManager);
            }
        };
        this.h0 = runnable;
        this.X = glide;
        this.Z = lifecycle;
        this.f0 = requestManagerTreeNode;
        this.e0 = requestTracker;
        this.f12312Y = context;
        ConnectivityMonitor connectivityMonitorA = defaultConnectivityMonitorFactory.a(context.getApplicationContext(), new RequestManagerConnectivityListener(requestTracker));
        this.i0 = connectivityMonitorA;
        synchronized (glide.h0) {
            if (glide.h0.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            glide.h0.add(this);
        }
        char[] cArr = Util.f12851a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lifecycle.b(this);
        } else {
            Util.f().post(runnable);
        }
        lifecycle.b(connectivityMonitorA);
        this.j0 = new CopyOnWriteArrayList(glide.Z.f12294e);
        GlideContext glideContext = glide.Z;
        synchronized (glideContext) {
            try {
                if (glideContext.j == null) {
                    ((GlideBuilder.AnonymousClass1) glideContext.d).getClass();
                    RequestOptions requestOptions2 = new RequestOptions();
                    requestOptions2.m0 = true;
                    glideContext.j = requestOptions2;
                }
                requestOptions = glideContext.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            RequestOptions requestOptions3 = (RequestOptions) requestOptions.clone();
            if (requestOptions3.m0 && !requestOptions3.n0) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            requestOptions3.n0 = true;
            requestOptions3.m0 = true;
            this.k0 = requestOptions3;
        }
    }

    public final void b(Target target) {
        if (target == null) {
            return;
        }
        boolean zM = m(target);
        Request requestE = target.e();
        if (zM) {
            return;
        }
        Glide glide = this.X;
        synchronized (glide.h0) {
            try {
                Iterator it = glide.h0.iterator();
                while (it.hasNext()) {
                    if (((RequestManager) it.next()).m(target)) {
                        return;
                    }
                }
                if (requestE != null) {
                    target.i(null);
                    requestE.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final RequestBuilder h(String str) {
        return new RequestBuilder(this.X, this, Drawable.class, this.f12312Y).A(str);
    }

    public final synchronized void k() {
        RequestTracker requestTracker = this.e0;
        requestTracker.f12757c = true;
        for (Request request : Util.e(requestTracker.f12755a)) {
            if (request.isRunning()) {
                request.pause();
                requestTracker.f12756b.add(request);
            }
        }
    }

    public final synchronized void l() {
        RequestTracker requestTracker = this.e0;
        requestTracker.f12757c = false;
        for (Request request : Util.e(requestTracker.f12755a)) {
            if (!request.e() && !request.isRunning()) {
                request.h();
            }
        }
        requestTracker.f12756b.clear();
    }

    public final synchronized boolean m(Target target) {
        Request requestE = target.e();
        if (requestE == null) {
            return true;
        }
        if (!this.e0.a(requestE)) {
            return false;
        }
        this.g0.X.remove(target);
        target.i(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onDestroy() {
        try {
            this.g0.onDestroy();
            Iterator it = Util.e(this.g0.X).iterator();
            while (it.hasNext()) {
                b((Target) it.next());
            }
            this.g0.X.clear();
            RequestTracker requestTracker = this.e0;
            Iterator it2 = Util.e(requestTracker.f12755a).iterator();
            while (it2.hasNext()) {
                requestTracker.a((Request) it2.next());
            }
            requestTracker.f12756b.clear();
            this.Z.a(this);
            this.Z.a(this.i0);
            Util.f().removeCallbacks(this.h0);
            Glide glide = this.X;
            synchronized (glide.h0) {
                if (!glide.h0.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                glide.h0.remove(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onStart() {
        l();
        this.g0.onStart();
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final synchronized void onStop() {
        k();
        this.g0.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.e0 + ", treeNode=" + this.f0 + "}";
    }
}
