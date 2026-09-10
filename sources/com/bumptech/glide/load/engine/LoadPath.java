package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class LoadPath<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools.Pool f12467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12469c;

    public LoadPath(Class cls, Class cls2, Class cls3, List list, Pools.Pool pool) {
        this.f12467a = pool;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f12468b = list;
        this.f12469c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final Resource a(DataRewinder dataRewinder, Options options, int i2, int i3, DecodeJob.DecodeCallback decodeCallback, List list) throws GlideException {
        List list2 = this.f12468b;
        int size = list2.size();
        Resource resourceA = null;
        for (int i4 = 0; i4 < size; i4++) {
            DecodePath decodePath = (DecodePath) list2.get(i4);
            try {
                Pools.Pool pool = decodePath.d;
                Object objB = pool.b();
                Preconditions.c(objB, "Argument must not be null");
                List list3 = (List) objB;
                try {
                    Resource resourceA2 = decodePath.a(dataRewinder, i2, i3, options, list3);
                    pool.a(list3);
                    try {
                        resourceA = decodePath.f12429c.a(decodeCallback.a(resourceA2), options);
                    } catch (GlideException e2) {
                        e = e2;
                        list.add(e);
                    }
                } catch (Throwable th) {
                    pool.a(list3);
                    throw th;
                }
            } catch (GlideException e3) {
                e = e3;
            }
            if (resourceA != null) {
                break;
            }
        }
        if (resourceA != null) {
            return resourceA;
        }
        throw new GlideException(this.f12469c, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f12468b.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
