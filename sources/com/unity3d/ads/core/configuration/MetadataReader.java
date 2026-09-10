package com.unity3d.ads.core.configuration;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import com.unity3d.services.core.misc.JsonStorage;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\f\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u0001H\u0001H\u0086\b¢\u0006\u0002\u0010\u000eJ$\u0010\u000f\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u0001H\u0001H\u0086\b¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/configuration/MetadataReader;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "jsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", X3.i.W, "", "(Lcom/unity3d/services/core/misc/JsonStorage;Ljava/lang/String;)V", "getJsonStorage", "()Lcom/unity3d/services/core/misc/JsonStorage;", "getKey", "()Ljava/lang/String;", "read", "defaultValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "readAndDelete", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public abstract class MetadataReader<T> {
    private final JsonStorage jsonStorage;
    private final String key;

    public MetadataReader(JsonStorage jsonStorage, String key) {
        n.f(jsonStorage, "jsonStorage");
        n.f(key, "key");
        this.jsonStorage = jsonStorage;
        this.key = key;
    }

    public static Object read$default(MetadataReader metadataReader, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if (metadataReader.getJsonStorage().get(metadataReader.getKey()) == null) {
            return obj;
        }
        n.k();
        throw null;
    }

    public static Object readAndDelete$default(MetadataReader metadataReader, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAndDelete");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if (metadataReader.getJsonStorage().get(metadataReader.getKey()) != null) {
            n.k();
            throw null;
        }
        if (metadataReader.getJsonStorage().get(metadataReader.getKey()) != null) {
            metadataReader.getJsonStorage().delete(metadataReader.getKey());
        }
        return obj;
    }

    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final String getKey() {
        return this.key;
    }

    public final <T> T read(T defaultValue) {
        if (getJsonStorage().get(getKey()) == null) {
            return defaultValue;
        }
        n.k();
        throw null;
    }

    public final <T> T readAndDelete(T defaultValue) {
        if (getJsonStorage().get(getKey()) != null) {
            n.k();
            throw null;
        }
        if (getJsonStorage().get(getKey()) != null) {
            getJsonStorage().delete(getKey());
        }
        return defaultValue;
    }
}
