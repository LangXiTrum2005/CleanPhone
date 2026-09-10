package p002kotlin.reflect.jvm.internal.impl.load.java.lazy;

import genesic.attabal;
import genesic.wireman;
import java.util.Iterator;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.load.java.components.saneness;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import yeast.competently;

/* JADX INFO: compiled from: LazyJavaAnnotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaAnnotations implements marial {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final wireman f30442arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final wireman f30443kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final boolean f30444monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final competently<attabal, dern> f30445polloi;

    public LazyJavaAnnotations(wireman c, wireman annotationOwner, boolean z) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.f30443kowloon = c;
        this.f30442arytenoidectomy = annotationOwner;
        this.f30444monoploid = z;
        this.f30445polloi = c.attabal().adultoid().competently(new Function1<attabal, dern>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations$annotationDescriptors$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final dern invoke(attabal annotation) {
                Intrinsics.checkNotNullParameter(annotation, "annotation");
                return saneness.f30389attabal.marial(annotation, this.this$0.f30443kowloon, this.this$0.f30444monoploid);
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public dern attabal(byname.dern fqName) {
        dern dernVarInvoke;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        attabal attabalVarAttabal = this.f30442arytenoidectomy.attabal(fqName);
        return (attabalVarAttabal == null || (dernVarInvoke = this.f30445polloi.invoke(attabalVarAttabal)) == null) ? saneness.f30389attabal.attabal(fqName, this.f30442arytenoidectomy, this.f30443kowloon) : dernVarInvoke;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean isEmpty() {
        return this.f30442arytenoidectomy.getAnnotations().isEmpty() && !this.f30442arytenoidectomy.stratoscope();
    }

    @Override // java.lang.Iterable
    public Iterator<dern> iterator() {
        return SequencesKt___SequencesKt.cuirassed(SequencesKt___SequencesKt.seminary(SequencesKt___SequencesKt.restrictive(CollectionsKt.clubfoot(this.f30442arytenoidectomy.getAnnotations()), this.f30445polloi), saneness.f30389attabal.attabal(kotlin.reflect.jvm.internal.impl.builtins.competently.attabal.f29753preprohormone, this.f30442arytenoidectomy, this.f30443kowloon))).iterator();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean restrictive(byname.dern dernVar) {
        return marial.saneness.saneness(this, dernVar);
    }

    public /* synthetic */ LazyJavaAnnotations(wireman wiremanVar, wireman wiremanVar2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wiremanVar, wiremanVar2, (i & 4) != 0 ? false : z);
    }
}
