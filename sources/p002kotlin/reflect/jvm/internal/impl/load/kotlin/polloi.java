package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.peridotite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* JADX INFO: compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class polloi implements walach {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final LazyJavaPackageFragment f30798saneness;

    public polloi(LazyJavaPackageFragment packageFragment) {
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f30798saneness = packageFragment;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.walach
    public peridotite saneness() {
        peridotite NO_SOURCE_FILE = peridotite.f30200attabal;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return this.f30798saneness + ": " + this.f30798saneness.mastfed().keySet();
    }
}
