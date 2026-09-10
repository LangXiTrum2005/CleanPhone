package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import byname.dern;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CompositeAnnotations implements marial {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final List<marial> f29925kowloon;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(List<? extends marial> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f29925kowloon = delegates;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public dern attabal(final dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (dern) SequencesKt___SequencesKt.trm(SequencesKt___SequencesKt.merc(CollectionsKt.clubfoot(this.f29925kowloon), new Function1<marial, dern>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations$findAnnotation$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final dern invoke(marial it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.attabal(fqName);
            }
        }));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean isEmpty() {
        List<marial> list = this.f29925kowloon;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((marial) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<dern> iterator() {
        return SequencesKt___SequencesKt.oilcan(CollectionsKt.clubfoot(this.f29925kowloon), new Function1<marial, Sequence<? extends dern>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations.iterator.1
            @Override // p002kotlin.jvm.functions.Function1
            public final Sequence<dern> invoke(marial it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CollectionsKt.clubfoot(it);
            }
        }).iterator();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean restrictive(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = CollectionsKt.clubfoot(this.f29925kowloon).iterator();
        while (it.hasNext()) {
            if (((marial) it.next()).restrictive(fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(marial... delegates) {
        this((List<? extends marial>) polloi.unconsolidated(delegates));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }
}
