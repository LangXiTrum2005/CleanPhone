package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;

/* JADX INFO: loaded from: classes7.dex */
public final class PackagePartScopeCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializedDescriptorResolver f43668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReflectKotlinClassFinder f43669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f43670c = new ConcurrentHashMap();

    public PackagePartScopeCache(ReflectKotlinClassFinder reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        this.f43668a = deserializedDescriptorResolver;
        this.f43669b = reflectKotlinClassFinder;
    }
}
