package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: loaded from: classes7.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaPackageFragment f44010b;

    public KotlinJvmBinaryPackageSourceElement(LazyJavaPackageFragment packageFragment) {
        Intrinsics.f(packageFragment, "packageFragment");
        this.f44010b = packageFragment;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        LazyJavaPackageFragment lazyJavaPackageFragment = this.f44010b;
        sb.append(lazyJavaPackageFragment);
        sb.append(": ");
        lazyJavaPackageFragment.getClass();
        sb.append(((Map) StorageKt.a(lazyJavaPackageFragment.k0, LazyJavaPackageFragment.p0[0])).keySet());
        return sb.toString();
    }
}
