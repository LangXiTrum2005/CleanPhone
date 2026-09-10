package com.bumptech.glide.load.model;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ModelLoaderRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultiModelLoaderFactory f12578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModelLoaderCache f12579b;

    public static class ModelLoaderCache {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f12580a = new HashMap();

        public static class Entry<Model> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f12581a;

            public Entry(List list) {
                this.f12581a = list;
            }
        }
    }

    public ModelLoaderRegistry(Pools.Pool pool) {
        MultiModelLoaderFactory multiModelLoaderFactory = new MultiModelLoaderFactory(pool);
        this.f12579b = new ModelLoaderCache();
        this.f12578a = multiModelLoaderFactory;
    }

    public final synchronized void a(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        MultiModelLoaderFactory multiModelLoaderFactory = this.f12578a;
        synchronized (multiModelLoaderFactory) {
            try {
                MultiModelLoaderFactory.Entry entry = new MultiModelLoaderFactory.Entry(cls, cls2, modelLoaderFactory);
                ArrayList arrayList = multiModelLoaderFactory.f12586a;
                arrayList.add(arrayList.size(), entry);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12579b.f12580a.clear();
    }

    public final List b(Object obj) {
        List listUnmodifiableList;
        Class<?> cls = obj.getClass();
        synchronized (this) {
            ModelLoaderCache.Entry entry = (ModelLoaderCache.Entry) this.f12579b.f12580a.get(cls);
            listUnmodifiableList = entry == null ? null : entry.f12581a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(this.f12578a.b(cls));
                if (((ModelLoaderCache.Entry) this.f12579b.f12580a.put(cls, new ModelLoaderCache.Entry(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z2 = true;
        for (int i2 = 0; i2 < size; i2++) {
            ModelLoader modelLoader = (ModelLoader) listUnmodifiableList.get(i2);
            if (modelLoader.a(obj)) {
                if (z2) {
                    arrayList = new ArrayList(size - i2);
                    z2 = false;
                }
                arrayList.add(modelLoader);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new Registry.NoModelLoaderAvailableException("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }
}
