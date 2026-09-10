package com.bumptech.glide.load.model;

import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class ModelCache<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f12572a = new AnonymousClass1(500);

    /* JADX INFO: renamed from: com.bumptech.glide.load.model.ModelCache$1, reason: invalid class name */
    class AnonymousClass1 extends LruCache<ModelKey<Object>, Object> {
        @Override // com.bumptech.glide.util.LruCache
        public final void d(Object obj, Object obj2) {
            ModelKey modelKey = (ModelKey) obj;
            modelKey.getClass();
            ArrayDeque arrayDeque = ModelKey.f12573b;
            synchronized (arrayDeque) {
                arrayDeque.offer(modelKey);
            }
        }
    }

    public static final class ModelKey<A> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final ArrayDeque f12573b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f12574a;

        static {
            char[] cArr = Util.f12851a;
            f12573b = new ArrayDeque(0);
        }

        public static ModelKey a(Object obj) {
            ModelKey modelKey;
            ArrayDeque arrayDeque = f12573b;
            synchronized (arrayDeque) {
                modelKey = (ModelKey) arrayDeque.poll();
            }
            if (modelKey == null) {
                modelKey = new ModelKey();
            }
            modelKey.f12574a = obj;
            return modelKey;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ModelKey)) {
                return false;
            }
            ModelKey modelKey = (ModelKey) obj;
            modelKey.getClass();
            return this.f12574a.equals(modelKey.f12574a);
        }

        public final int hashCode() {
            return this.f12574a.hashCode();
        }
    }

    public final Object a(Object obj) {
        ModelKey modelKeyA = ModelKey.a(obj);
        Object objB = this.f12572a.b(modelKeyA);
        ArrayDeque arrayDeque = ModelKey.f12573b;
        synchronized (arrayDeque) {
            arrayDeque.offer(modelKeyA);
        }
        return objB;
    }

    public final void b(Object obj, Object obj2) {
        this.f12572a.e(ModelKey.a(obj), obj2);
    }
}
