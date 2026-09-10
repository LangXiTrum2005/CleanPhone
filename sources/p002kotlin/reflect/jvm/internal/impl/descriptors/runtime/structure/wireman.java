package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.marial;
import byname.saneness;
import genesic.attabal;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaAnnotation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman extends triweekly implements attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Annotation f30265attabal;

    public wireman(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f30265attabal = annotation;
    }

    @Override // genesic.attabal
    public saneness competently() {
        return ReflectClassUtilKt.attabal(gibeonite.attabal.saneness(gibeonite.attabal.attabal(this.f30265attabal)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof wireman) && this.f30265attabal == ((wireman) obj).f30265attabal;
    }

    public int hashCode() {
        return System.identityHashCode(this.f30265attabal);
    }

    @Override // genesic.attabal
    public boolean impromptu() {
        return false;
    }

    @Override // genesic.attabal
    /* JADX INFO: renamed from: privatdozent, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass graveside() {
        return new ReflectJavaClass(gibeonite.attabal.saneness(gibeonite.attabal.attabal(this.f30265attabal)));
    }

    public final Annotation saran() {
        return this.f30265attabal;
    }

    public String toString() {
        return wireman.class.getName() + ": " + this.f30265attabal;
    }

    @Override // genesic.attabal
    public Collection<genesic.saneness> wireman() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = gibeonite.attabal.saneness(gibeonite.attabal.attabal(this.f30265attabal)).getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            marial.attabal attabalVar = marial.f30254attabal;
            Object objInvoke = method.invoke(this.f30265attabal, null);
            Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
            arrayList.add(attabalVar.attabal(objInvoke, marial.cutely(method.getName())));
        }
        return arrayList;
    }

    @Override // genesic.attabal
    public boolean yemenite() {
        return false;
    }
}
