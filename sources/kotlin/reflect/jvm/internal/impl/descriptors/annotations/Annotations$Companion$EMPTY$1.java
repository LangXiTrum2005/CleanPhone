package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import kotlin.collections.EmptyIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class Annotations$Companion$EMPTY$1 implements Annotations {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean E0(FqName fqName) {
        return Annotations.DefaultImpls.b(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final AnnotationDescriptor b(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return EmptyIterator.X;
    }

    public final String toString() {
        return "EMPTY";
    }
}
