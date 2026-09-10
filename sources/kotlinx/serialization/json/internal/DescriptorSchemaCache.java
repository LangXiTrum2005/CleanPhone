package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00072\u0006\u0010\u000e\u001a\u0002H\u000bH\u0086\u0002¢\u0006\u0002\u0010\u000fJ9\u0010\u0010\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012¢\u0006\u0002\u0010\u0013J0\u0010\u0014\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0007H\u0086\u0002¢\u0006\u0002\u0010\u0015R6\u0010\u0004\u001a*\u0012\u0004\u0012\u00020\u0006\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0005j\b\u0012\u0004\u0012\u00020\u0001`\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "", "<init>", "()V", "map", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "Lkotlinx/serialization/json/internal/DescriptorData;", "set", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "descriptor", "key", "value", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Ljava/lang/Object;)V", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "get", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;)Ljava/lang/Object;", "Key", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DescriptorSchemaCache {
    private final Map<SerialDescriptor, Map<Key<Object>, Object>> map = CreateMapForCacheKt.createMapForCache(16);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key<T> {
    }

    public final <T> T get(SerialDescriptor descriptor, Key<T> key) {
        Intrinsics.f(descriptor, "descriptor");
        Intrinsics.f(key, "key");
        Map<Key<Object>, Object> map = this.map.get(descriptor);
        T t = map != null ? (T) map.get(key) : null;
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T> T getOrPut(SerialDescriptor descriptor, Key<T> key, Function0<? extends T> defaultValue) {
        Intrinsics.f(descriptor, "descriptor");
        Intrinsics.f(key, "key");
        Intrinsics.f(defaultValue, "defaultValue");
        T t = (T) get(descriptor, key);
        if (t != null) {
            return t;
        }
        T t2 = (T) defaultValue.invoke();
        set(descriptor, key, t2);
        return t2;
    }

    public final <T> void set(SerialDescriptor descriptor, Key<T> key, T value) {
        Intrinsics.f(descriptor, "descriptor");
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        Map<SerialDescriptor, Map<Key<Object>, Object>> map = this.map;
        Map<Key<Object>, Object> mapCreateMapForCache = map.get(descriptor);
        if (mapCreateMapForCache == null) {
            mapCreateMapForCache = CreateMapForCacheKt.createMapForCache(2);
            map.put(descriptor, mapCreateMapForCache);
        }
        mapCreateMapForCache.put(key, value);
    }
}
