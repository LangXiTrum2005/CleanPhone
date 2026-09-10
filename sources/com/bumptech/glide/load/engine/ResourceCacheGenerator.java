package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.util.MultiClassKey;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ResourceCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {
    public final DataFetcherGenerator.FetcherReadyCallback X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DecodeHelper f12471Y;
    public int Z;
    public int e0 = -1;
    public Key f0;
    public List g0;
    public int h0;
    public volatile ModelLoader.LoadData i0;
    public File j0;
    public ResourceCacheKey k0;

    public ResourceCacheGenerator(DecodeHelper decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.f12471Y = decodeHelper;
        this.X = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean b() {
        List list;
        ArrayList arrayListC;
        ArrayList arrayListA = this.f12471Y.a();
        boolean z2 = false;
        if (!arrayListA.isEmpty()) {
            DecodeHelper decodeHelper = this.f12471Y;
            Registry registryA = decodeHelper.f12406c.a();
            Class<?> cls = decodeHelper.d.getClass();
            Class cls2 = decodeHelper.g;
            Class cls3 = decodeHelper.k;
            ModelToResourceClassCache modelToResourceClassCache = registryA.f12305h;
            MultiClassKey multiClassKey = (MultiClassKey) modelToResourceClassCache.f12777a.getAndSet(null);
            if (multiClassKey == null) {
                multiClassKey = new MultiClassKey(cls, cls2, cls3);
            } else {
                multiClassKey.f12848a = cls;
                multiClassKey.f12849b = cls2;
                multiClassKey.f12850c = cls3;
            }
            synchronized (modelToResourceClassCache.f12778b) {
                list = (List) modelToResourceClassCache.f12778b.get(multiClassKey);
            }
            modelToResourceClassCache.f12777a.set(multiClassKey);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                ModelLoaderRegistry modelLoaderRegistry = registryA.f12301a;
                synchronized (modelLoaderRegistry) {
                    arrayListC = modelLoaderRegistry.f12578a.c(cls);
                }
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : registryA.f12303c.d((Class) it.next(), cls2)) {
                        if (!registryA.f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                ModelToResourceClassCache modelToResourceClassCache2 = registryA.f12305h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (modelToResourceClassCache2.f12778b) {
                    modelToResourceClassCache2.f12778b.put(new MultiClassKey(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.g0;
                    if (list3 != null && this.h0 < list3.size()) {
                        this.i0 = null;
                        while (!z2 && this.h0 < this.g0.size()) {
                            List list4 = this.g0;
                            int i2 = this.h0;
                            this.h0 = i2 + 1;
                            ModelLoader modelLoader = (ModelLoader) list4.get(i2);
                            File file = this.j0;
                            DecodeHelper decodeHelper2 = this.f12471Y;
                            this.i0 = modelLoader.b(file, decodeHelper2.f12407e, decodeHelper2.f, decodeHelper2.f12409i);
                            if (this.i0 != null && this.f12471Y.c(this.i0.f12577c.a()) != null) {
                                this.i0.f12577c.e(this.f12471Y.o, this);
                                z2 = true;
                            }
                        }
                        return z2;
                    }
                    int i3 = this.e0 + 1;
                    this.e0 = i3;
                    if (i3 >= list2.size()) {
                        int i4 = this.Z + 1;
                        this.Z = i4;
                        if (i4 >= arrayListA.size()) {
                            break;
                        }
                        this.e0 = 0;
                    }
                    Key key = (Key) arrayListA.get(this.Z);
                    Class cls5 = (Class) list2.get(this.e0);
                    Transformation transformationD = this.f12471Y.d(cls5);
                    DecodeHelper decodeHelper3 = this.f12471Y;
                    this.k0 = new ResourceCacheKey(decodeHelper3.f12406c.f12291a, key, decodeHelper3.f12411n, decodeHelper3.f12407e, decodeHelper3.f, transformationD, cls5, decodeHelper3.f12409i);
                    File fileB = decodeHelper3.f12408h.a().b(this.k0);
                    this.j0 = fileB;
                    if (fileB != null) {
                        this.f0 = key;
                        this.g0 = this.f12471Y.f12406c.a().f12301a.b(fileB);
                        this.h0 = 0;
                    }
                }
            } else if (!File.class.equals(this.f12471Y.k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.f12471Y.d.getClass() + " to " + this.f12471Y.k);
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void c(Exception exc) {
        ((DecodeJob) this.X).a(this.k0, exc, this.i0.f12577c, DataSource.e0);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        ModelLoader.LoadData loadData = this.i0;
        if (loadData != null) {
            loadData.f12577c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void f(Object obj) {
        this.X.d(this.f0, obj, this.i0.f12577c, DataSource.e0, this.k0);
    }
}
