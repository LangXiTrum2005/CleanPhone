package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.marial;
import genesic.attabal;
import genesic.dern;
import java.lang.annotation.Annotation;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront extends marial implements dern {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Annotation f30231saneness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beachfront(marial marialVar, Annotation annotation) {
        super(marialVar, null);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f30231saneness = annotation;
    }

    @Override // genesic.dern
    public attabal attabal() {
        return new wireman(this.f30231saneness);
    }
}
