package com.bumptech.glide.load.engine;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.MultiClassKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class DecodeHelper<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12404a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12405b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GlideContext f12406c;
    public Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12407e;
    public int f;
    public Class g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Engine.LazyDiskCacheProvider f12408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Options f12409i;
    public CachedHashCodeArrayMap j;
    public Class k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12410l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Key f12411n;
    public Priority o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DiskCacheStrategy f12412p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z2 = this.m;
        ArrayList arrayList = this.f12405b;
        if (!z2) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i2 = 0; i2 < size; i2++) {
                ModelLoader.LoadData loadData = (ModelLoader.LoadData) arrayListB.get(i2);
                if (!arrayList.contains(loadData.f12575a)) {
                    arrayList.add(loadData.f12575a);
                }
                int i3 = 0;
                while (true) {
                    List list = loadData.f12576b;
                    if (i3 < list.size()) {
                        if (!arrayList.contains(list.get(i3))) {
                            arrayList.add(list.get(i3));
                        }
                        i3++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z2 = this.f12410l;
        ArrayList arrayList = this.f12404a;
        if (!z2) {
            this.f12410l = true;
            arrayList.clear();
            Registry registryA = this.f12406c.a();
            List listB = registryA.f12301a.b(this.d);
            int size = listB.size();
            for (int i2 = 0; i2 < size; i2++) {
                ModelLoader.LoadData loadDataB = ((ModelLoader) listB.get(i2)).b(this.d, this.f12407e, this.f, this.f12409i);
                if (loadDataB != null) {
                    arrayList.add(loadDataB);
                }
            }
        }
        return arrayList;
    }

    public final LoadPath c(Class cls) {
        LoadPath loadPath;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5 = cls;
        Registry registryA = this.f12406c.a();
        Class cls6 = this.g;
        Class cls7 = this.k;
        LoadPathCache loadPathCache = registryA.f12306i;
        LoadPath loadPath2 = null;
        MultiClassKey multiClassKey = (MultiClassKey) loadPathCache.f12776b.getAndSet(null);
        if (multiClassKey == null) {
            multiClassKey = new MultiClassKey();
        }
        multiClassKey.f12848a = cls5;
        multiClassKey.f12849b = cls6;
        multiClassKey.f12850c = cls7;
        synchronized (loadPathCache.f12775a) {
            loadPath = (LoadPath) loadPathCache.f12775a.get(multiClassKey);
        }
        loadPathCache.f12776b.set(multiClassKey);
        registryA.f12306i.getClass();
        if (LoadPathCache.f12774c.equals(loadPath)) {
            return null;
        }
        if (loadPath != null) {
            return loadPath;
        }
        ArrayList arrayList = new ArrayList();
        ResourceDecoderRegistry resourceDecoderRegistry = registryA.f12303c;
        for (Class cls8 : resourceDecoderRegistry.d(cls5, cls6)) {
            TranscoderRegistry transcoderRegistry = registryA.f;
            for (Class cls9 : transcoderRegistry.b(cls8, cls7)) {
                arrayList.add(new DecodePath(cls5, cls8, cls9, resourceDecoderRegistry.b(cls5, cls8), transcoderRegistry.a(cls8, cls9), registryA.j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            loadPath2 = new LoadPath(cls2, cls3, cls4, arrayList, registryA.j);
        }
        LoadPathCache loadPathCache2 = registryA.f12306i;
        synchronized (loadPathCache2.f12775a) {
            loadPathCache2.f12775a.put(new MultiClassKey(cls2, cls3, cls4), loadPath2 != null ? loadPath2 : LoadPathCache.f12774c);
        }
        return loadPath2;
    }

    public final Transformation d(Class cls) {
        Transformation transformation = (Transformation) this.j.get(cls);
        if (transformation == null) {
            for (Map.Entry entry : this.j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    transformation = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (transformation != null) {
            return transformation;
        }
        if (!this.j.isEmpty() || !this.q) {
            return UnitTransformation.f12630b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
