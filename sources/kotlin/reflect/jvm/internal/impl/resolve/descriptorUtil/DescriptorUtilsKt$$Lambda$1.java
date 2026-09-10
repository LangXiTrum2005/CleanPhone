package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes7.dex */
class DescriptorUtilsKt$$Lambda$1 implements DFS.Neighbors {
    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable a(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        int i2 = DescriptorUtilsKt.f44314a;
        Collection collectionL = callableMemberDescriptor != null ? callableMemberDescriptor.l() : null;
        return collectionL == null ? EmptyList.X : collectionL;
    }
}
