package com.bumptech.glide.load.model;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Options;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class MultiModelLoaderFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Factory f12585e = new Factory();
    public static final ModelLoader f = new EmptyModelLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Factory f12587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f12588c;
    public final Pools.Pool d;

    public static class EmptyModelLoader implements ModelLoader<Object, Object> {
        @Override // com.bumptech.glide.load.model.ModelLoader
        public final boolean a(Object obj) {
            return false;
        }

        @Override // com.bumptech.glide.load.model.ModelLoader
        public final ModelLoader.LoadData b(Object obj, int i2, int i3, Options options) {
            return null;
        }
    }

    public static class Entry<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f12589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f12590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ModelLoaderFactory f12591c;

        public Entry(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
            this.f12589a = cls;
            this.f12590b = cls2;
            this.f12591c = modelLoaderFactory;
        }
    }

    public static class Factory {
    }

    public MultiModelLoaderFactory(Pools.Pool pool) {
        Factory factory = f12585e;
        this.f12586a = new ArrayList();
        this.f12588c = new HashSet();
        this.d = pool;
        this.f12587b = factory;
    }

    public final synchronized ModelLoader a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            for (Entry entry : this.f12586a) {
                if (this.f12588c.contains(entry)) {
                    z2 = true;
                } else if (entry.f12589a.isAssignableFrom(cls) && entry.f12590b.isAssignableFrom(cls2)) {
                    this.f12588c.add(entry);
                    arrayList.add(entry.f12591c.d(this));
                    this.f12588c.remove(entry);
                }
            }
            if (arrayList.size() > 1) {
                Factory factory = this.f12587b;
                Pools.Pool pool = this.d;
                factory.getClass();
                return new MultiModelLoader(arrayList, pool);
            }
            if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            }
            if (z2) {
                return f;
            }
            throw new Registry.NoModelLoaderAvailableException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f12588c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Entry entry : this.f12586a) {
                if (!this.f12588c.contains(entry) && entry.f12589a.isAssignableFrom(cls)) {
                    this.f12588c.add(entry);
                    arrayList.add(entry.f12591c.d(this));
                    this.f12588c.remove(entry);
                }
            }
        } catch (Throwable th) {
            this.f12588c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Entry entry : this.f12586a) {
            if (!arrayList.contains(entry.f12590b) && entry.f12589a.isAssignableFrom(cls)) {
                arrayList.add(entry.f12590b);
            }
        }
        return arrayList;
    }
}
