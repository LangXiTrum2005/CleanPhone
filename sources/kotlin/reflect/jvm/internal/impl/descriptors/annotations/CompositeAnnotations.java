package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes7.dex */
public final class CompositeAnnotations implements Annotations {
    public final List X;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$iterator$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Annotations, Sequence<? extends AnnotationDescriptor>> {
        public static final AnonymousClass1 X = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Annotations it = (Annotations) obj;
            Intrinsics.f(it, "it");
            return CollectionsKt.k(it);
        }
    }

    public CompositeAnnotations(List list) {
        this.X = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean E0(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        Iterator it = CollectionsKt.k(this.X).f43273a.iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).E0(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final AnnotationDescriptor b(final FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
        return (AnnotationDescriptor) (!anonymousClass1.hasNext() ? null : anonymousClass1.next());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        List list = this.X;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return new FlatteningSequence.AnonymousClass1();
    }

    public CompositeAnnotations(Annotations... annotationsArr) {
        this.X = ArraysKt.M(annotationsArr);
    }
}
