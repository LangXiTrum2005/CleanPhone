package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.dern;
import byname.marial;
import genesic.attabal;
import genesic.competently;
import genesic.cutely;
import genesic.gintrap;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lemures.saneness;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.milliradian;
import p002kotlin.reflect.jvm.internal.impl.descriptors.treadless;
import p002kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ReflectJavaClass extends triweekly implements competently, graveside, competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Class<?> f30223attabal;

    public ReflectJavaClass(Class<?> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f30223attabal = klass;
    }

    @Override // genesic.molybdenite
    public boolean apical() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // genesic.wireman
    public /* bridge */ /* synthetic */ attabal attabal(dern dernVar) {
        return attabal(dernVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.competently
    /* JADX INFO: renamed from: creditor, reason: merged with bridge method [inline-methods] */
    public Class<?> getElement() {
        return this.f30223attabal;
    }

    @Override // genesic.competently
    public Collection<cutely> cuirassed() throws IllegalAccessException, InvocationTargetException {
        Class<?>[] clsArrDern = saneness.f30258attabal.dern(this.f30223attabal);
        if (clsArrDern == null) {
            return adultoid.formularize();
        }
        ArrayList arrayList = new ArrayList(clsArrDern.length);
        for (Class<?> cls : clsArrDern) {
            arrayList.add(new formularize(cls));
        }
        return arrayList;
    }

    @Override // genesic.competently
    public Collection<cutely> cutely() {
        if (Intrinsics.wireman(this.f30223attabal, Object.class)) {
            return adultoid.formularize();
        }
        dovishness dovishnessVar = new dovishness(2);
        Type genericSuperclass = this.f30223attabal.getGenericSuperclass();
        dovishnessVar.attabal(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = this.f30223attabal.getGenericInterfaces();
        Intrinsics.checkNotNullExpressionValue(genericInterfaces, "getGenericInterfaces(...)");
        dovishnessVar.saneness(genericInterfaces);
        List listKowloon = adultoid.kowloon(dovishnessVar.wireman(new Type[dovishnessVar.dern()]));
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(listKowloon, 10));
        Iterator it = listKowloon.iterator();
        while (it.hasNext()) {
            arrayList.add(new formularize((Type) it.next()));
        }
        return arrayList;
    }

    @Override // genesic.competently
    public boolean dovishness() {
        return this.f30223attabal.isEnum();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaClass) && Intrinsics.wireman(this.f30223attabal, ((ReflectJavaClass) obj).f30223attabal);
    }

    @Override // genesic.wireman
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.graveside
    public int getModifiers() {
        return this.f30223attabal.getModifiers();
    }

    @Override // genesic.graveside
    public marial getName() {
        if (!this.f30223attabal.isAnonymousClass()) {
            marial marialVarCutely = marial.cutely(this.f30223attabal.getSimpleName());
            Intrinsics.beachfront(marialVarCutely);
            return marialVarCutely;
        }
        String name = this.f30223attabal.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        marial marialVarCutely2 = marial.cutely(StringsKt.fastrack(name, ".", null, 2, null));
        Intrinsics.beachfront(marialVarCutely2);
        return marialVarCutely2;
    }

    @Override // genesic.cord
    public List<preprohormone> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f30223attabal.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new preprohormone(typeVariable));
        }
        return arrayList;
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
        return this.f30223attabal.hashCode();
    }

    @Override // genesic.competently
    /* JADX INFO: renamed from: hydrovane, reason: merged with bridge method [inline-methods] */
    public List<marial> cord() {
        Class<?>[] declaredClasses = this.f30223attabal.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        return SequencesKt___SequencesKt.hydrovane(SequencesKt___SequencesKt.merc(SequencesKt___SequencesKt.cord(polloi.sealless(declaredClasses), new Function1<Class<?>, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$innerClassNames$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(Class<?> cls) {
                String simpleName = cls.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return Boolean.valueOf(simpleName.length() == 0);
            }
        }), new Function1<Class<?>, marial>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$innerClassNames$2
            @Override // p002kotlin.jvm.functions.Function1
            public final marial invoke(Class<?> cls) {
                String simpleName = cls.getSimpleName();
                if (!marial.formularize(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return marial.cutely(simpleName);
                }
                return null;
            }
        }));
    }

    @Override // genesic.competently
    public Collection<gintrap> impassible() {
        Object[] objArrWireman = saneness.f30258attabal.wireman(this.f30223attabal);
        if (objArrWireman == null) {
            objArrWireman = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrWireman.length);
        for (Object obj : objArrWireman) {
            arrayList.add(new gintrap(obj));
        }
        return arrayList;
    }

    @Override // genesic.molybdenite
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // genesic.molybdenite
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // genesic.competently
    public boolean kowloon() {
        return this.f30223attabal.isAnnotation();
    }

    @Override // genesic.competently
    public dern marial() {
        dern dernVarSaneness = ReflectClassUtilKt.attabal(this.f30223attabal).saneness();
        Intrinsics.checkNotNullExpressionValue(dernVarSaneness, "asSingleFqName(...)");
        return dernVarSaneness;
    }

    public final boolean mathsort(Method method) {
        String name = method.getName();
        if (Intrinsics.wireman(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (Intrinsics.wireman(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // genesic.competently
    public boolean monoploid() throws IllegalAccessException, InvocationTargetException {
        Boolean boolMarial = saneness.f30258attabal.marial(this.f30223attabal);
        if (boolMarial != null) {
            return boolMarial.booleanValue();
        }
        return false;
    }

    @Override // genesic.competently
    /* JADX INFO: renamed from: peridotite, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass formularize() {
        Class<?> declaringClass = this.f30223attabal.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }

    @Override // genesic.competently
    public boolean polloi() {
        return false;
    }

    @Override // genesic.competently
    /* JADX INFO: renamed from: privatdozent, reason: merged with bridge method [inline-methods] */
    public List<impassible> taiyuan() {
        Constructor<?>[] declaredConstructors = this.f30223attabal.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        return SequencesKt___SequencesKt.hydrovane(SequencesKt___SequencesKt.restrictive(SequencesKt___SequencesKt.cord(polloi.sealless(declaredConstructors), ReflectJavaClass$constructors$1.INSTANCE), ReflectJavaClass$constructors$2.INSTANCE));
    }

    @Override // genesic.competently
    public LightClassOriginKind restrictive() {
        return null;
    }

    @Override // genesic.competently
    public boolean rotuma() throws IllegalAccessException, InvocationTargetException {
        Boolean boolBeachfront = saneness.f30258attabal.beachfront(this.f30223attabal);
        if (boolBeachfront != null) {
            return boolBeachfront.booleanValue();
        }
        return false;
    }

    @Override // genesic.competently
    /* JADX INFO: renamed from: starveling, reason: merged with bridge method [inline-methods] */
    public List<arytenoidectomy> getFields() {
        Field[] declaredFields = this.f30223attabal.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        return SequencesKt___SequencesKt.hydrovane(SequencesKt___SequencesKt.restrictive(SequencesKt___SequencesKt.cord(polloi.sealless(declaredFields), ReflectJavaClass$fields$1.INSTANCE), ReflectJavaClass$fields$2.INSTANCE));
    }

    @Override // genesic.wireman
    public boolean stratoscope() {
        return false;
    }

    @Override // genesic.competently
    public boolean supplicat() {
        return this.f30223attabal.isInterface();
    }

    public String toString() {
        return ReflectJavaClass.class.getName() + ": " + this.f30223attabal;
    }

    @Override // genesic.competently
    /* JADX INFO: renamed from: walach, reason: merged with bridge method [inline-methods] */
    public List<molybdenite> getMethods() {
        Method[] declaredMethods = this.f30223attabal.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return SequencesKt___SequencesKt.hydrovane(SequencesKt___SequencesKt.restrictive(SequencesKt___SequencesKt.preprohormone(polloi.sealless(declaredMethods), new Function1<Method, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:9:0x001c  */
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(Method method) {
                boolean z = false;
                if (!method.isSynthetic()) {
                    if (this.this$0.dovishness()) {
                        ReflectJavaClass reflectJavaClass = this.this$0;
                        Intrinsics.beachfront(method);
                        if (!reflectJavaClass.mathsort(method)) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        }), ReflectJavaClass$methods$2.INSTANCE));
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
