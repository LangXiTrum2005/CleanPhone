package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes7.dex */
class DescriptorUtilsKt$$Lambda$0 implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DescriptorUtilsKt$$Lambda$0 f44315a = new DescriptorUtilsKt$$Lambda$0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable a(Object obj) {
        int i2 = DescriptorUtilsKt.f44314a;
        Collection collectionL = ((ValueParameterDescriptor) obj).l();
        ArrayList arrayList = new ArrayList(CollectionsKt.n(collectionL, 10));
        Iterator it = collectionL.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).y0());
        }
        return arrayList;
    }
}
