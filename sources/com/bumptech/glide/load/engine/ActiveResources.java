package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class ActiveResources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f12392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f12393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferenceQueue f12394c;
    public Engine d;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.ActiveResources$1, reason: invalid class name */
    class AnonymousClass1 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            return new Thread(new Runnable() { // from class: com.bumptech.glide.load.engine.ActiveResources.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    Process.setThreadPriority(10);
                    runnable.run();
                }
            }, "glide-active-resources");
        }
    }

    public interface DequeuedResourceCallback {
    }

    public static final class ResourceWeakReference extends WeakReference<EngineResource<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Key f12395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f12396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Resource f12397c;

        public ResourceWeakReference(Key key, EngineResource engineResource, ReferenceQueue referenceQueue) {
            super(engineResource, referenceQueue);
            Preconditions.c(key, "Argument must not be null");
            this.f12395a = key;
            boolean z2 = engineResource.X;
            this.f12397c = null;
            this.f12396b = z2;
        }
    }

    public ActiveResources() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new AnonymousClass1());
        this.f12393b = new HashMap();
        this.f12394c = new ReferenceQueue();
        this.f12392a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.bumptech.glide.load.engine.ActiveResources.2
            @Override // java.lang.Runnable
            public final void run() {
                ActiveResources activeResources = ActiveResources.this;
                activeResources.getClass();
                while (true) {
                    try {
                        activeResources.b((ResourceWeakReference) activeResources.f12394c.remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
    }

    public final synchronized void a(Key key, EngineResource engineResource) {
        ResourceWeakReference resourceWeakReference = (ResourceWeakReference) this.f12393b.put(key, new ResourceWeakReference(key, engineResource, this.f12394c));
        if (resourceWeakReference != null) {
            resourceWeakReference.f12397c = null;
            resourceWeakReference.clear();
        }
    }

    public final void b(ResourceWeakReference resourceWeakReference) {
        Resource resource;
        synchronized (this) {
            this.f12393b.remove(resourceWeakReference.f12395a);
            if (resourceWeakReference.f12396b && (resource = resourceWeakReference.f12397c) != null) {
                this.d.e(resourceWeakReference.f12395a, new EngineResource(resource, true, false, resourceWeakReference.f12395a, this.d));
            }
        }
    }
}
