package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.marial;
import genesic.impromptu;
import genesic.rotuma;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class apical extends marial implements impromptu {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Class<?> f30225saneness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apical(marial marialVar, Class<?> klass) {
        super(marialVar, null);
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f30225saneness = klass;
    }

    @Override // genesic.impromptu
    public rotuma saneness() {
        return rotuma.f30257attabal.attabal(this.f30225saneness);
    }
}
