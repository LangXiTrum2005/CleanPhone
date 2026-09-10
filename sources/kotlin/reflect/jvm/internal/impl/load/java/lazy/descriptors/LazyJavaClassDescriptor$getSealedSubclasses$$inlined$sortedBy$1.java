package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaClassDescriptor$getSealedSubclasses$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.a(DescriptorUtilsKt.g((ClassDescriptor) obj).b(), DescriptorUtilsKt.g((ClassDescriptor) obj2).b());
    }
}
