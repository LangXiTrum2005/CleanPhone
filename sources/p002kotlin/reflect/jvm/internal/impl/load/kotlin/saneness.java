package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness<A, C> extends AbstractBinaryClassAnnotationLoader.attabal<A> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<graveside, List<A>> f30800attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<graveside, C> f30801dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<graveside, C> f30802saneness;

    /* JADX WARN: Multi-variable type inference failed */
    public saneness(Map<graveside, ? extends List<? extends A>> memberAnnotations, Map<graveside, ? extends C> propertyConstants, Map<graveside, ? extends C> annotationParametersDefaultValues) {
        Intrinsics.checkNotNullParameter(memberAnnotations, "memberAnnotations");
        Intrinsics.checkNotNullParameter(propertyConstants, "propertyConstants");
        Intrinsics.checkNotNullParameter(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f30800attabal = memberAnnotations;
        this.f30802saneness = propertyConstants;
        this.f30801dern = annotationParametersDefaultValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.attabal
    public Map<graveside, List<A>> attabal() {
        return this.f30800attabal;
    }

    public final Map<graveside, C> dern() {
        return this.f30802saneness;
    }

    public final Map<graveside, C> saneness() {
        return this.f30801dern;
    }
}
