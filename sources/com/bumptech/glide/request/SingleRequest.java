package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.media.a;
import android.util.Log;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.Model;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.StateVerifier;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class SingleRequest<R> implements Request, SizeReadyCallback, ResourceCallback {
    public static final boolean C = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f12794A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final RuntimeException f12795B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateVerifier f12797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12798c;
    public final Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f12799e;
    public final GlideContext f;
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f12800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final BaseRequestOptions f12801i;
    public final int j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Priority f12802l;
    public final Target m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f12803n;
    public final TransitionFactory o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Executor f12804p;
    public Resource q;
    public Engine.LoadStatus r;
    public long s;
    public volatile Engine t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Status f12805u;
    public Drawable v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f12806w;
    public Drawable x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12807z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final Status X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Status f12808Y;
        public static final Status Z;
        public static final Status e0;
        public static final Status f0;
        public static final Status g0;
        public static final /* synthetic */ Status[] h0;

        static {
            Status status = new Status("PENDING", 0);
            X = status;
            Status status2 = new Status("RUNNING", 1);
            f12808Y = status2;
            Status status3 = new Status("WAITING_FOR_SIZE", 2);
            Z = status3;
            Status status4 = new Status("COMPLETE", 3);
            e0 = status4;
            Status status5 = new Status("FAILED", 4);
            f0 = status5;
            Status status6 = new Status("CLEARED", 5);
            g0 = status6;
            h0 = new Status[]{status, status2, status3, status4, status5, status6};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) h0.clone();
        }
    }

    public SingleRequest(Context context, GlideContext glideContext, Object obj, Object obj2, Class cls, BaseRequestOptions baseRequestOptions, int i2, int i3, Priority priority, Target target, ArrayList arrayList, RequestCoordinator requestCoordinator, Engine engine, TransitionFactory transitionFactory) {
        Executor executor = Executors.f12837a;
        this.f12796a = C ? String.valueOf(hashCode()) : null;
        this.f12797b = StateVerifier.a();
        this.f12798c = obj;
        this.f12799e = context;
        this.f = glideContext;
        this.g = obj2;
        this.f12800h = cls;
        this.f12801i = baseRequestOptions;
        this.j = i2;
        this.k = i3;
        this.f12802l = priority;
        this.m = target;
        this.f12803n = arrayList;
        this.d = requestCoordinator;
        this.t = engine;
        this.o = transitionFactory;
        this.f12804p = executor;
        this.f12805u = Status.X;
        if (this.f12795B == null && glideContext.f12295h.f12297a.containsKey(GlideBuilder.LogRequestOrigins.class)) {
            this.f12795B = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean a() {
        boolean z2;
        synchronized (this.f12798c) {
            z2 = this.f12805u == Status.e0;
        }
        return z2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bumptech.glide.request.target.SizeReadyCallback
    public final void b(int i2, int i3) {
        Object obj;
        SingleRequest<R> singleRequest = this;
        int iRound = i2;
        singleRequest.f12797b.b();
        Object obj2 = singleRequest.f12798c;
        synchronized (obj2) {
            try {
                try {
                    boolean z2 = C;
                    if (z2) {
                        singleRequest.i("Got onSizeReady in " + LogTime.a(singleRequest.s));
                    }
                    if (singleRequest.f12805u == Status.Z) {
                        Status status = Status.f12808Y;
                        singleRequest.f12805u = status;
                        singleRequest.f12801i.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        singleRequest.y = iRound;
                        singleRequest.f12807z = i3 == Integer.MIN_VALUE ? i3 : Math.round(1.0f * i3);
                        if (z2) {
                            singleRequest.i("finished setup for calling load in " + LogTime.a(singleRequest.s));
                        }
                        Engine engine = singleRequest.t;
                        GlideContext glideContext = singleRequest.f;
                        Object obj3 = singleRequest.g;
                        BaseRequestOptions baseRequestOptions = singleRequest.f12801i;
                        Key key = baseRequestOptions.h0;
                        try {
                            int i4 = singleRequest.y;
                            int i5 = singleRequest.f12807z;
                            Class cls = baseRequestOptions.l0;
                            try {
                                Class cls2 = singleRequest.f12800h;
                                Priority priority = singleRequest.f12802l;
                                DiskCacheStrategy diskCacheStrategy = baseRequestOptions.f12787Y;
                                try {
                                    CachedHashCodeArrayMap cachedHashCodeArrayMap = baseRequestOptions.k0;
                                    boolean z3 = baseRequestOptions.i0;
                                    boolean z4 = baseRequestOptions.o0;
                                    try {
                                        Options options = baseRequestOptions.j0;
                                        boolean z5 = baseRequestOptions.e0;
                                        boolean z6 = baseRequestOptions.p0;
                                        Executor executor = singleRequest.f12804p;
                                        Object obj4 = obj2;
                                        try {
                                            singleRequest.r = engine.a(glideContext, obj3, key, i4, i5, cls, cls2, priority, diskCacheStrategy, cachedHashCodeArrayMap, z3, z4, options, z5, z6, singleRequest, executor);
                                            if (singleRequest.f12805u != status) {
                                                singleRequest.r = null;
                                            }
                                            if (z2) {
                                                singleRequest.i("finished onSizeReady in " + LogTime.a(singleRequest.s));
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            obj = obj4;
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj = obj2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                obj = obj2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    obj = obj2;
                }
            } catch (Throwable th7) {
                th = th7;
                obj = singleRequest;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean c() {
        boolean z2;
        synchronized (this.f12798c) {
            z2 = this.f12805u == Status.g0;
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.f12798c) {
            try {
                if (this.f12794A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f12797b.b();
                Status status = this.f12805u;
                Status status2 = Status.g0;
                if (status == status2) {
                    return;
                }
                if (this.f12794A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f12797b.b();
                this.m.a(this);
                Engine.LoadStatus loadStatus = this.r;
                Resource resource = null;
                if (loadStatus != null) {
                    loadStatus.a();
                    this.r = null;
                }
                Resource resource2 = this.q;
                if (resource2 != null) {
                    this.q = null;
                    resource = resource2;
                }
                ?? r1 = this.d;
                if (r1 == 0 || r1.j(this)) {
                    this.m.f(f());
                }
                this.f12805u = status2;
                if (resource != null) {
                    this.t.getClass();
                    Engine.g(resource);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object d() {
        this.f12797b.b();
        return this.f12798c;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean e() {
        boolean z2;
        synchronized (this.f12798c) {
            z2 = this.f12805u == Status.e0;
        }
        return z2;
    }

    public final Drawable f() {
        if (this.f12806w == null) {
            this.f12801i.getClass();
            this.f12806w = null;
        }
        return this.f12806w;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean g(Request request) {
        int i2;
        int i3;
        Object obj;
        Class cls;
        BaseRequestOptions baseRequestOptions;
        Priority priority;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class cls2;
        BaseRequestOptions baseRequestOptions2;
        Priority priority2;
        int size2;
        boolean zA;
        if (!(request instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f12798c) {
            try {
                i2 = this.j;
                i3 = this.k;
                obj = this.g;
                cls = this.f12800h;
                baseRequestOptions = this.f12801i;
                priority = this.f12802l;
                ArrayList arrayList = this.f12803n;
                size = arrayList != null ? arrayList.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        SingleRequest singleRequest = (SingleRequest) request;
        synchronized (singleRequest.f12798c) {
            try {
                i4 = singleRequest.j;
                i5 = singleRequest.k;
                obj2 = singleRequest.g;
                cls2 = singleRequest.f12800h;
                baseRequestOptions2 = singleRequest.f12801i;
                priority2 = singleRequest.f12802l;
                ArrayList arrayList2 = singleRequest.f12803n;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i2 != i4 || i3 != i5) {
            return false;
        }
        char[] cArr = Util.f12851a;
        if (obj == null) {
            zA = obj2 == null;
        } else {
            zA = obj instanceof Model ? ((Model) obj).a() : obj.equals(obj2);
        }
        return zA && cls.equals(cls2) && baseRequestOptions.equals(baseRequestOptions2) && priority == priority2 && size == size2;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.Request
    public final void h() {
        synchronized (this.f12798c) {
            try {
                if (this.f12794A) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f12797b.b();
                int i2 = LogTime.f12842b;
                this.s = SystemClock.elapsedRealtimeNanos();
                if (this.g == null) {
                    if (Util.j(this.j, this.k)) {
                        this.y = this.j;
                        this.f12807z = this.k;
                    }
                    if (this.x == null) {
                        this.f12801i.getClass();
                        this.x = null;
                    }
                    j(new GlideException("Received null model"), this.x == null ? 5 : 3);
                    return;
                }
                Status status = this.f12805u;
                if (status == Status.f12808Y) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.e0) {
                    k(this.q, DataSource.f0, false);
                    return;
                }
                ArrayList<RequestListener> arrayList = this.f12803n;
                if (arrayList != null) {
                    for (RequestListener requestListener : arrayList) {
                        if (requestListener instanceof ExperimentalRequestListener) {
                            ((ExperimentalRequestListener) requestListener).getClass();
                        }
                    }
                }
                Status status2 = Status.Z;
                this.f12805u = status2;
                if (Util.j(this.j, this.k)) {
                    b(this.j, this.k);
                } else {
                    this.m.c(this);
                }
                Status status3 = this.f12805u;
                if (status3 == Status.f12808Y || status3 == status2) {
                    ?? r1 = this.d;
                    if (r1 == 0 || r1.b(this)) {
                        this.m.d(f());
                    }
                }
                if (C) {
                    i("finished run method in " + LogTime.a(this.s));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(String str) {
        StringBuilder sbX = a.x(str, " this: ");
        sbX.append(this.f12796a);
        Log.v("GlideRequest", sbX.toString());
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z2;
        synchronized (this.f12798c) {
            try {
                Status status = this.f12805u;
                z2 = status == Status.f12808Y || status == Status.Z;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    public final void j(GlideException glideException, int i2) {
        boolean zH;
        Drawable drawableF;
        this.f12797b.b();
        synchronized (this.f12798c) {
            try {
                glideException.getClass();
                int i3 = this.f.f12296i;
                if (i3 <= i2) {
                    Log.w("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.y + "x" + this.f12807z + d9.i.f24752e, glideException);
                    if (i3 <= 4) {
                        glideException.d();
                    }
                }
                this.r = null;
                this.f12805u = Status.f0;
                ?? r0 = this.d;
                if (r0 != 0) {
                    r0.f(this);
                }
                boolean z2 = true;
                this.f12794A = true;
                try {
                    ArrayList<RequestListener> arrayList = this.f12803n;
                    if (arrayList != null) {
                        zH = false;
                        for (RequestListener requestListener : arrayList) {
                            ?? r6 = this.d;
                            if (r6 != 0) {
                                r6.getRoot().a();
                            }
                            zH |= requestListener.h(glideException);
                        }
                    } else {
                        zH = false;
                    }
                    if (!zH) {
                        ?? r8 = this.d;
                        if (r8 != 0 && !r8.b(this)) {
                            z2 = false;
                        }
                        if (z2) {
                            if (this.g == null) {
                                if (this.x == null) {
                                    this.f12801i.getClass();
                                    this.x = null;
                                }
                                drawableF = this.x;
                            } else {
                                drawableF = null;
                            }
                            if (drawableF == null) {
                                if (this.v == null) {
                                    this.f12801i.getClass();
                                    this.v = null;
                                }
                                drawableF = this.v;
                            }
                            if (drawableF == null) {
                                drawableF = f();
                            }
                            this.m.j(drawableF);
                        }
                    }
                    this.f12794A = false;
                } catch (Throwable th) {
                    this.f12794A = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    public final void k(Resource resource, DataSource dataSource, boolean z2) {
        this.f12797b.b();
        Resource resource2 = null;
        try {
            synchronized (this.f12798c) {
                try {
                    this.r = null;
                    if (resource == null) {
                        j(new GlideException("Expected to receive a Resource<R> with an object of " + this.f12800h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = resource.get();
                    try {
                        if (obj == null || !this.f12800h.isAssignableFrom(obj.getClass())) {
                            this.q = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f12800h);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(resource);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            j(new GlideException(sb.toString()), 5);
                        } else {
                            ?? r9 = this.d;
                            if (r9 == 0 || r9.d(this)) {
                                l(resource, obj, dataSource);
                                return;
                            } else {
                                this.q = null;
                                this.f12805u = Status.e0;
                            }
                        }
                        this.t.getClass();
                        Engine.g(resource);
                    } catch (Throwable th) {
                        resource2 = resource;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (resource2 != null) {
                this.t.getClass();
                Engine.g(resource2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    public final void l(Resource resource, Object obj, DataSource dataSource) {
        boolean zB;
        ?? r0 = this.d;
        boolean z2 = r0 == 0 || !r0.getRoot().a();
        this.f12805u = Status.e0;
        this.q = resource;
        if (this.f.f12296i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + dataSource + " for " + this.g + " with size [" + this.y + "x" + this.f12807z + "] in " + LogTime.a(this.s) + " ms");
        }
        if (r0 != 0) {
            r0.i(this);
        }
        this.f12794A = true;
        try {
            ArrayList arrayList = this.f12803n;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                zB = false;
                while (it.hasNext()) {
                    zB |= ((RequestListener) it.next()).b(obj);
                }
            } else {
                zB = false;
            }
            if (!zB) {
                this.m.g(obj, this.o.a(dataSource, z2));
            }
        } finally {
            this.f12794A = false;
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.f12798c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f12798c) {
            obj = this.g;
            cls = this.f12800h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + d9.i.f24752e;
    }
}
