package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1;

/* JADX INFO: loaded from: classes7.dex */
class LazyJavaStaticClassScope$$Lambda$0 implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LazyJavaStaticClassScope$$Lambda$0 f43896a = new LazyJavaStaticClassScope$$Lambda$0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable a(Object obj) {
        int i2 = LazyJavaStaticClassScope.f43894p;
        Collection collectionD = ((ClassDescriptor) obj).h().d();
        Intrinsics.e(collectionD, "it.typeConstructor.supertypes");
        return new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(SequencesKt.p(CollectionsKt.k(collectionD), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1$1.X));
    }
}
