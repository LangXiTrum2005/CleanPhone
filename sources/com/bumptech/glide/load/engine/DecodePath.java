package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class DecodePath<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f12427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f12428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceTranscoder f12429c;
    public final Pools.Pool d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12430e;

    public interface DecodeCallback<ResourceType> {
    }

    public DecodePath(Class cls, Class cls2, Class cls3, List list, ResourceTranscoder resourceTranscoder, Pools.Pool pool) {
        this.f12427a = cls;
        this.f12428b = list;
        this.f12429c = resourceTranscoder;
        this.d = pool;
        this.f12430e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final Resource a(DataRewinder dataRewinder, int i2, int i3, Options options, List list) throws GlideException {
        List list2 = this.f12428b;
        int size = list2.size();
        Resource resourceB = null;
        for (int i4 = 0; i4 < size; i4++) {
            ResourceDecoder resourceDecoder = (ResourceDecoder) list2.get(i4);
            try {
                if (resourceDecoder.a(dataRewinder.a(), options)) {
                    resourceB = resourceDecoder.b(dataRewinder.a(), i2, i3, options);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + resourceDecoder, e2);
                }
                list.add(e2);
            }
            if (resourceB != null) {
                break;
            }
        }
        if (resourceB != null) {
            return resourceB;
        }
        throw new GlideException(this.f12430e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f12427a + ", decoders=" + this.f12428b + ", transcoder=" + this.f12429c + AbstractJsonLexerKt.END_OBJ;
    }
}
