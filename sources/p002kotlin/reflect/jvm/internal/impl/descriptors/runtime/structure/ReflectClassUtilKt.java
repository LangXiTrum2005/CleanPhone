package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import gibeonite.attabal;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kurbash.wireman;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import patroclinal.beachfront;
import patroclinal.formularize;
import tetrahedral.apical;
import tetrahedral.arytenoidectomy;
import tetrahedral.competently;
import tetrahedral.cutely;
import tetrahedral.dern;
import tetrahedral.graveside;
import tetrahedral.impassible;
import tetrahedral.impromptu;
import tetrahedral.kowloon;
import tetrahedral.marial;
import tetrahedral.molybdenite;
import tetrahedral.monoploid;
import tetrahedral.saneness;
import tetrahedral.taiyuan;
import tetrahedral.triweekly;

/* JADX INFO: compiled from: reflectClassUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ReflectClassUtilKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final List<wireman<? extends Object>> f30219attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f30220dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f30221saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Map<Class<? extends beachfront<?>>, Integer> f30222wireman;

    static {
        int i = 0;
        List<wireman<? extends Object>> listKowloon = adultoid.kowloon(polloi.saneness(Boolean.TYPE), polloi.saneness(Byte.TYPE), polloi.saneness(Character.TYPE), polloi.saneness(Double.TYPE), polloi.saneness(Float.TYPE), polloi.saneness(Integer.TYPE), polloi.saneness(Long.TYPE), polloi.saneness(Short.TYPE));
        f30219attabal = listKowloon;
        List<wireman<? extends Object>> list = listKowloon;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            wireman wiremanVar = (wireman) it.next();
            arrayList.add(formularize.attabal(attabal.dern(wiremanVar), attabal.wireman(wiremanVar)));
        }
        f30221saneness = seminary.dovishness(arrayList);
        List<wireman<? extends Object>> list2 = f30219attabal;
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            wireman wiremanVar2 = (wireman) it2.next();
            arrayList2.add(formularize.attabal(attabal.wireman(wiremanVar2), attabal.dern(wiremanVar2)));
        }
        f30220dern = seminary.dovishness(arrayList2);
        List listKowloon2 = adultoid.kowloon(Function0.class, Function1.class, Function2.class, triweekly.class, kowloon.class, arytenoidectomy.class, monoploid.class, tetrahedral.polloi.class, molybdenite.class, graveside.class, tetrahedral.attabal.class, saneness.class, dern.class, tetrahedral.wireman.class, marial.class, tetrahedral.beachfront.class, competently.class, impromptu.class, taiyuan.class, cutely.class, apical.class, tetrahedral.formularize.class, impassible.class);
        ArrayList arrayList3 = new ArrayList(dovishness.gintrap(listKowloon2, 10));
        for (Object obj : listKowloon2) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            arrayList3.add(formularize.attabal((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f30222wireman = seminary.dovishness(arrayList3);
    }

    public static final byname.saneness attabal(Class<?> cls) {
        byname.saneness sanenessVarImpassible;
        byname.saneness sanenessVarAttabal;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null || (sanenessVarAttabal = attabal(declaringClass)) == null || (sanenessVarImpassible = sanenessVarAttabal.wireman(byname.marial.cutely(cls.getSimpleName()))) == null) {
                    sanenessVarImpassible = byname.saneness.impassible(new byname.dern(cls.getName()));
                }
                Intrinsics.beachfront(sanenessVarImpassible);
                return sanenessVarImpassible;
            }
        }
        byname.dern dernVar = new byname.dern(cls.getName());
        return new byname.saneness(dernVar.marial(), byname.dern.apical(dernVar.competently()), true);
    }

    public static final ClassLoader beachfront(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class<?> competently(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return f30220dern.get(cls);
    }

    public static final Integer dern(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return f30222wireman.get(cls);
    }

    public static final boolean impromptu(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }

    public static final Class<?> marial(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return f30221saneness.get(cls);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String saneness(Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return p002kotlin.text.dovishness.merc(name, '.', '/', false, 4, null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append('L');
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb.append(p002kotlin.text.dovishness.merc(name2, '.', '/', false, 4, null));
            sb.append(';');
            return sb.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List<Type> wireman(Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return adultoid.formularize();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt___SequencesKt.hydrovane(SequencesKt___SequencesKt.oilcan(p002kotlin.sequences.arytenoidectomy.triweekly(type, new Function1<ParameterizedType, ParameterizedType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$parameterizedTypeArguments$1
                @Override // p002kotlin.jvm.functions.Function1
                public final ParameterizedType invoke(ParameterizedType it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Type ownerType = it.getOwnerType();
                    if (ownerType instanceof ParameterizedType) {
                        return (ParameterizedType) ownerType;
                    }
                    return null;
                }
            }), new Function1<ParameterizedType, Sequence<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$parameterizedTypeArguments$2
                @Override // p002kotlin.jvm.functions.Function1
                public final Sequence<Type> invoke(ParameterizedType it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Type[] actualTypeArguments = it.getActualTypeArguments();
                    Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                    return p002kotlin.collections.polloi.sealless(actualTypeArguments);
                }
            }));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return p002kotlin.collections.polloi.unconsolidated(actualTypeArguments);
    }
}
