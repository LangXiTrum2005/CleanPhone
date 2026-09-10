package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;

/* JADX INFO: loaded from: classes7.dex */
public final class RuntimeModuleData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializationComponents f43678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PackagePartScopeCache f43679b;

    public static final class Companion {
    }

    public RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache) {
        this.f43678a = deserializationComponents;
        this.f43679b = packagePartScopeCache;
    }
}
