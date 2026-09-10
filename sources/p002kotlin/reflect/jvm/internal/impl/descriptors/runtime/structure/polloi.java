package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.competently;
import byname.dern;
import byname.marial;
import genesic.attabal;
import genesic.monoploid;
import genesic.stratoscope;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lemures.saneness;
import org.objectweb.asm.signature.SignatureVisitor;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.milliradian;
import p002kotlin.reflect.jvm.internal.impl.descriptors.treadless;

/* JADX INFO: compiled from: ReflectJavaMember.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class polloi extends triweekly implements competently, graveside, monoploid {
    @Override // genesic.molybdenite
    public boolean apical() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // genesic.wireman
    public /* bridge */ /* synthetic */ attabal attabal(dern dernVar) {
        return attabal(dernVar);
    }

    public final List<stratoscope> creditor(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z) throws IllegalAccessException, InvocationTargetException {
        String str;
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List<String> listSaneness = dern.f30243attabal.saneness(privatdozent());
        int size = listSaneness != null ? listSaneness.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i = 0;
        while (i < length) {
            rotuma rotumaVarAttabal = rotuma.f30257attabal.attabal(parameterTypes[i]);
            if (listSaneness != null) {
                str = (String) CollectionsKt.lotta(listSaneness, i + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + SignatureVisitor.EXTENDS + size + " (name=" + getName() + " type=" + rotumaVarAttabal + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new cord(rotumaVarAttabal, parameterAnnotations[i], str, z && i == p002kotlin.collections.polloi.walach(parameterTypes)));
            i++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof polloi) && Intrinsics.wireman(privatdozent(), ((polloi) obj).privatdozent());
    }

    @Override // genesic.wireman
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.competently
    public AnnotatedElement getElement() {
        Member memberPrivatdozent = privatdozent();
        Intrinsics.competently(memberPrivatdozent, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberPrivatdozent;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.graveside
    public int getModifiers() {
        return privatdozent().getModifiers();
    }

    @Override // genesic.graveside
    public marial getName() {
        String name = privatdozent().getName();
        marial marialVarCutely = name != null ? marial.cutely(name) : null;
        return marialVarCutely == null ? competently.f15244saneness : marialVarCutely;
    }

    @Override // genesic.molybdenite
    public treadless getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return milliradian.impromptu.f30193saneness;
        }
        if (Modifier.isPrivate(modifiers)) {
            return milliradian.marial.f30194saneness;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? lemures.dern.f32738saneness : saneness.f32739saneness;
        }
        return lemures.attabal.f32737saneness;
    }

    public int hashCode() {
        return privatdozent().hashCode();
    }

    @Override // genesic.molybdenite
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // genesic.molybdenite
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    public abstract Member privatdozent();

    @Override // genesic.monoploid
    /* JADX INFO: renamed from: saran, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass grimness() {
        Class<?> declaringClass = privatdozent().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return new ReflectJavaClass(declaringClass);
    }

    @Override // genesic.wireman
    public boolean stratoscope() {
        return false;
    }

    public String toString() {
        return getClass().getName() + ": " + privatdozent();
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
