package com.bumptech.glide;

import androidx.core.util.Pools;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Registry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModelLoaderRegistry f12301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EncoderRegistry f12302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceDecoderRegistry f12303c;
    public final ResourceEncoderRegistry d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DataRewinderRegistry f12304e;
    public final TranscoderRegistry f;
    public final ImageHeaderParserRegistry g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ModelToResourceClassCache f12305h = new ModelToResourceClassCache();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LoadPathCache f12306i = new LoadPathCache();
    public final Pools.Pool j;

    public static class MissingComponentException extends RuntimeException {
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
    }

    public Registry() {
        Pools.Pool poolB = FactoryPools.b();
        this.j = poolB;
        this.f12301a = new ModelLoaderRegistry(poolB);
        this.f12302b = new EncoderRegistry();
        this.f12303c = new ResourceDecoderRegistry();
        this.d = new ResourceEncoderRegistry();
        this.f12304e = new DataRewinderRegistry();
        this.f = new TranscoderRegistry();
        this.g = new ImageHeaderParserRegistry();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        ResourceDecoderRegistry resourceDecoderRegistry = this.f12303c;
        synchronized (resourceDecoderRegistry) {
            try {
                ArrayList<String> arrayList2 = new ArrayList(resourceDecoderRegistry.f12779a);
                resourceDecoderRegistry.f12779a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    resourceDecoderRegistry.f12779a.add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        resourceDecoderRegistry.f12779a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(ResourceDecoder resourceDecoder, Class cls, Class cls2, String str) {
        this.f12303c.a(resourceDecoder, cls, cls2, str);
    }

    public final ArrayList b() {
        ArrayList arrayList;
        ImageHeaderParserRegistry imageHeaderParserRegistry = this.g;
        synchronized (imageHeaderParserRegistry) {
            arrayList = imageHeaderParserRegistry.f12773a;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final DataRewinder c(Object obj) {
        DataRewinder dataRewinderB;
        DataRewinderRegistry dataRewinderRegistry = this.f12304e;
        synchronized (dataRewinderRegistry) {
            try {
                Preconditions.b(obj);
                DataRewinder.Factory factory = (DataRewinder.Factory) dataRewinderRegistry.f12374a.get(obj.getClass());
                if (factory == null) {
                    for (DataRewinder.Factory factory2 : dataRewinderRegistry.f12374a.values()) {
                        if (factory2.a().isAssignableFrom(obj.getClass())) {
                            factory = factory2;
                            break;
                        }
                    }
                }
                if (factory == null) {
                    factory = DataRewinderRegistry.f12373b;
                }
                dataRewinderB = factory.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataRewinderB;
    }

    public final void d(DataRewinder.Factory factory) {
        DataRewinderRegistry dataRewinderRegistry = this.f12304e;
        synchronized (dataRewinderRegistry) {
            dataRewinderRegistry.f12374a.put(factory.a(), factory);
        }
    }
}
