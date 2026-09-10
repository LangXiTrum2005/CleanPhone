package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.dern;
import byname.marial;
import genesic.attabal;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaTypeParameter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class preprohormone extends triweekly implements competently, genesic.preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final TypeVariable<?> f30256attabal;

    public preprohormone(TypeVariable<?> typeVariable) {
        Intrinsics.checkNotNullParameter(typeVariable, "typeVariable");
        this.f30256attabal = typeVariable;
    }

    @Override // genesic.wireman
    public /* bridge */ /* synthetic */ attabal attabal(dern dernVar) {
        return attabal(dernVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof preprohormone) && Intrinsics.wireman(this.f30256attabal, ((preprohormone) obj).f30256attabal);
    }

    @Override // genesic.wireman
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.competently
    public AnnotatedElement getElement() {
        TypeVariable<?> typeVariable = this.f30256attabal;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // genesic.graveside
    public marial getName() {
        marial marialVarCutely = marial.cutely(this.f30256attabal.getName());
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        return marialVarCutely;
    }

    public int hashCode() {
        return this.f30256attabal.hashCode();
    }

    @Override // genesic.preprohormone
    /* JADX INFO: renamed from: saran, reason: merged with bridge method [inline-methods] */
    public List<formularize> getUpperBounds() {
        Type[] bounds = this.f30256attabal.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new formularize(type));
        }
        formularize formularizeVar = (formularize) CollectionsKt.outmarry(arrayList);
        return Intrinsics.wireman(formularizeVar != null ? formularizeVar.saran() : null, Object.class) ? adultoid.formularize() : arrayList;
    }

    @Override // genesic.wireman
    public boolean stratoscope() {
        return false;
    }

    public String toString() {
        return preprohormone.class.getName() + ": " + this.f30256attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.competently, genesic.wireman
    public wireman attabal(dern fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return impromptu.attabal(declaredAnnotations, fqName);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.competently, genesic.wireman
    public List<wireman> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<wireman> listSaneness;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (listSaneness = impromptu.saneness(declaredAnnotations)) == null) ? adultoid.formularize() : listSaneness;
    }
}
