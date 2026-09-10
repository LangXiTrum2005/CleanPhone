package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes7.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CacheWithNullableValues f44325a;

    public SamConversionResolverImpl(LockBasedStorageManager lockBasedStorageManager) {
        this.f44325a = lockBasedStorageManager.f();
    }
}
