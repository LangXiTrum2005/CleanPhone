package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.marial;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.creditor;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.collections.starveling;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p002kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import patroclinal.formularize;

/* JADX INFO: compiled from: SpecialGenericSignatures.kt */
/* JADX INFO: loaded from: classes5.dex */
public class SpecialGenericSignatures {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Map<String, marial> f30302apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f30303attabal = new attabal(null);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Map<String, TypeSafeBarrierDescription> f30304beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Set<marial> f30305competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final Map<attabal.C0677attabal, marial> f30306cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final List<String> f30307dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final Set<String> f30308formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final List<marial> f30309impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Set<String> f30310impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Map<attabal.C0677attabal, TypeSafeBarrierDescription> f30311marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final List<attabal.C0677attabal> f30312saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final attabal.C0677attabal f30313taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final Map<marial, marial> f30314triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final List<String> f30315wireman;

    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ pussyfooter.attabal f30316arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        SpecialSignatureInfo(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public static final class TypeSafeBarrierDescription {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ pussyfooter.attabal f30318arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final /* synthetic */ TypeSafeBarrierDescription[] f30319kowloon;
        private final Object defaultValue;
        public static final TypeSafeBarrierDescription NULL = new TypeSafeBarrierDescription("NULL", 0, null);
        public static final TypeSafeBarrierDescription INDEX = new TypeSafeBarrierDescription("INDEX", 1, -1);
        public static final TypeSafeBarrierDescription FALSE = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3);

        /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            public MAP_GET_OR_DEFAULT(String str, int i) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                super(str, i, defaultConstructorMarker, defaultConstructorMarker);
            }
        }

        static {
            TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArrAttabal = attabal();
            f30319kowloon = typeSafeBarrierDescriptionArrAttabal;
            f30318arytenoidectomy = p002kotlin.enums.attabal.attabal(typeSafeBarrierDescriptionArrAttabal);
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj);
        }

        public static final /* synthetic */ TypeSafeBarrierDescription[] attabal() {
            return new TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) f30319kowloon.clone();
        }

        public TypeSafeBarrierDescription(String str, int i, Object obj) {
            super(str, i);
            this.defaultValue = obj;
        }
    }

    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
        public static final class C0677attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final String f30320attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public final String f30321dern;
            private final marial name;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final String f30322saneness;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public final String f30323wireman;

            public C0677attabal(String classInternalName, marial name, String parameters, String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                this.f30320attabal = classInternalName;
                this.name = name;
                this.f30322saneness = parameters;
                this.f30321dern = returnType;
                this.f30323wireman = SignatureBuildingComponents.f30687attabal.apical(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ C0677attabal saneness(C0677attabal c0677attabal, String str, marial marialVar, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0677attabal.f30320attabal;
                }
                if ((i & 2) != 0) {
                    marialVar = c0677attabal.name;
                }
                if ((i & 4) != 0) {
                    str2 = c0677attabal.f30322saneness;
                }
                if ((i & 8) != 0) {
                    str3 = c0677attabal.f30321dern;
                }
                return c0677attabal.attabal(str, marialVar, str2, str3);
            }

            public final C0677attabal attabal(String classInternalName, marial name, String parameters, String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                return new C0677attabal(classInternalName, name, parameters, returnType);
            }

            public final marial dern() {
                return this.name;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0677attabal)) {
                    return false;
                }
                C0677attabal c0677attabal = (C0677attabal) obj;
                return Intrinsics.wireman(this.f30320attabal, c0677attabal.f30320attabal) && Intrinsics.wireman(this.name, c0677attabal.name) && Intrinsics.wireman(this.f30322saneness, c0677attabal.f30322saneness) && Intrinsics.wireman(this.f30321dern, c0677attabal.f30321dern);
            }

            public int hashCode() {
                return (((((this.f30320attabal.hashCode() * 31) + this.name.hashCode()) * 31) + this.f30322saneness.hashCode()) * 31) + this.f30321dern.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f30320attabal + ", name=" + this.name + ", parameters=" + this.f30322saneness + ", returnType=" + this.f30321dern + ')';
            }

            public final String wireman() {
                return this.f30323wireman;
            }
        }

        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean apical(marial marialVar) {
            Intrinsics.checkNotNullParameter(marialVar, "<this>");
            return competently().contains(marialVar);
        }

        public final Map<marial, marial> beachfront() {
            return SpecialGenericSignatures.f30314triweekly;
        }

        public final List<marial> competently() {
            return SpecialGenericSignatures.f30309impassible;
        }

        public final Map<String, marial> cutely() {
            return SpecialGenericSignatures.f30302apical;
        }

        public final List<String> dern() {
            return SpecialGenericSignatures.f30307dern;
        }

        public final SpecialSignatureInfo formularize(String builtinSignature) {
            Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
            if (dern().contains(builtinSignature)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            return ((TypeSafeBarrierDescription) seminary.cutely(taiyuan(), builtinSignature)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }

        public final C0677attabal impassible(String str, String str2, String str3, String str4) {
            marial marialVarCutely = marial.cutely(str2);
            Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
            return new C0677attabal(str, marialVarCutely, str3, str4);
        }

        public final C0677attabal impromptu() {
            return SpecialGenericSignatures.f30313taiyuan;
        }

        public final Set<String> marial() {
            return SpecialGenericSignatures.f30310impromptu;
        }

        public final marial saneness(marial name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return beachfront().get(name);
        }

        public final Map<String, TypeSafeBarrierDescription> taiyuan() {
            return SpecialGenericSignatures.f30304beachfront;
        }

        public final Set<marial> wireman() {
            return SpecialGenericSignatures.f30305competently;
        }

        public attabal() {
        }
    }

    static {
        Set<String> setImpromptu = creditor.impromptu("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(dovishness.gintrap(setImpromptu, 10));
        for (String str : setImpromptu) {
            attabal attabalVar = f30303attabal;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
            arrayList.add(attabalVar.impassible("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f30312saneness = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(dovishness.gintrap(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((attabal.C0677attabal) it.next()).wireman());
        }
        f30307dern = arrayList3;
        List<attabal.C0677attabal> list = f30312saneness;
        ArrayList arrayList4 = new ArrayList(dovishness.gintrap(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((attabal.C0677attabal) it2.next()).dern().dern());
        }
        f30315wireman = arrayList4;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f30687attabal;
        attabal attabalVar2 = f30303attabal;
        String strTaiyuan = signatureBuildingComponents.taiyuan("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc2, "getDesc(...)");
        attabal.C0677attabal c0677attabalImpassible = attabalVar2.impassible(strTaiyuan, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Pair pairAttabal = formularize.attabal(c0677attabalImpassible, typeSafeBarrierDescription);
        String strTaiyuan2 = signatureBuildingComponents.taiyuan("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc3, "getDesc(...)");
        Pair pairAttabal2 = formularize.attabal(attabalVar2.impassible(strTaiyuan2, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String strTaiyuan3 = signatureBuildingComponents.taiyuan("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc4, "getDesc(...)");
        Pair pairAttabal3 = formularize.attabal(attabalVar2.impassible(strTaiyuan3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String strTaiyuan4 = signatureBuildingComponents.taiyuan("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc5, "getDesc(...)");
        Pair pairAttabal4 = formularize.attabal(attabalVar2.impassible(strTaiyuan4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String strTaiyuan5 = signatureBuildingComponents.taiyuan("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc6, "getDesc(...)");
        Pair pairAttabal5 = formularize.attabal(attabalVar2.impassible(strTaiyuan5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        Pair pairAttabal6 = formularize.attabal(attabalVar2.impassible(signatureBuildingComponents.taiyuan("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        attabal.C0677attabal c0677attabalImpassible2 = attabalVar2.impassible(signatureBuildingComponents.taiyuan("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        Pair pairAttabal7 = formularize.attabal(c0677attabalImpassible2, typeSafeBarrierDescription2);
        Pair pairAttabal8 = formularize.attabal(attabalVar2.impassible(signatureBuildingComponents.taiyuan("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strTaiyuan6 = signatureBuildingComponents.taiyuan("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc7, "getDesc(...)");
        attabal.C0677attabal c0677attabalImpassible3 = attabalVar2.impassible(strTaiyuan6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Pair pairAttabal9 = formularize.attabal(c0677attabalImpassible3, typeSafeBarrierDescription3);
        String strTaiyuan7 = signatureBuildingComponents.taiyuan("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc8, "getDesc(...)");
        Map<attabal.C0677attabal, TypeSafeBarrierDescription> mapImpassible = seminary.impassible(pairAttabal, pairAttabal2, pairAttabal3, pairAttabal4, pairAttabal5, pairAttabal6, pairAttabal7, pairAttabal8, pairAttabal9, formularize.attabal(attabalVar2.impassible(strTaiyuan7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f30311marial = mapImpassible;
        LinkedHashMap linkedHashMap = new LinkedHashMap(polder.marial(mapImpassible.size()));
        Iterator<T> it3 = mapImpassible.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((attabal.C0677attabal) entry.getKey()).wireman(), entry.getValue());
        }
        f30304beachfront = linkedHashMap;
        Set setApical = starveling.apical(f30311marial.keySet(), f30312saneness);
        ArrayList arrayList5 = new ArrayList(dovishness.gintrap(setApical, 10));
        Iterator it4 = setApical.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((attabal.C0677attabal) it4.next()).dern());
        }
        f30305competently = CollectionsKt.prefect(arrayList5);
        ArrayList arrayList6 = new ArrayList(dovishness.gintrap(setApical, 10));
        Iterator it5 = setApical.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((attabal.C0677attabal) it5.next()).wireman());
        }
        f30310impromptu = CollectionsKt.prefect(arrayList6);
        attabal attabalVar3 = f30303attabal;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc9, "getDesc(...)");
        attabal.C0677attabal c0677attabalImpassible4 = attabalVar3.impassible("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f30313taiyuan = c0677attabalImpassible4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.f30687attabal;
        String strImpromptu = signatureBuildingComponents2.impromptu("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc10, "getDesc(...)");
        Pair pairAttabal10 = formularize.attabal(attabalVar3.impassible(strImpromptu, "toByte", "", desc10), marial.cutely("byteValue"));
        String strImpromptu2 = signatureBuildingComponents2.impromptu("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc11, "getDesc(...)");
        Pair pairAttabal11 = formularize.attabal(attabalVar3.impassible(strImpromptu2, "toShort", "", desc11), marial.cutely("shortValue"));
        String strImpromptu3 = signatureBuildingComponents2.impromptu("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc12, "getDesc(...)");
        Pair pairAttabal12 = formularize.attabal(attabalVar3.impassible(strImpromptu3, "toInt", "", desc12), marial.cutely("intValue"));
        String strImpromptu4 = signatureBuildingComponents2.impromptu("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc13, "getDesc(...)");
        Pair pairAttabal13 = formularize.attabal(attabalVar3.impassible(strImpromptu4, "toLong", "", desc13), marial.cutely("longValue"));
        String strImpromptu5 = signatureBuildingComponents2.impromptu("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc14, "getDesc(...)");
        Pair pairAttabal14 = formularize.attabal(attabalVar3.impassible(strImpromptu5, "toFloat", "", desc14), marial.cutely("floatValue"));
        String strImpromptu6 = signatureBuildingComponents2.impromptu("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc15, "getDesc(...)");
        Pair pairAttabal15 = formularize.attabal(attabalVar3.impassible(strImpromptu6, "toDouble", "", desc15), marial.cutely("doubleValue"));
        Pair pairAttabal16 = formularize.attabal(c0677attabalImpassible4, marial.cutely("remove"));
        String strImpromptu7 = signatureBuildingComponents2.impromptu("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc16, "getDesc(...)");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc17, "getDesc(...)");
        Map<attabal.C0677attabal, marial> mapImpassible2 = seminary.impassible(pairAttabal10, pairAttabal11, pairAttabal12, pairAttabal13, pairAttabal14, pairAttabal15, pairAttabal16, formularize.attabal(attabalVar3.impassible(strImpromptu7, "get", desc16, desc17), marial.cutely("charAt")));
        f30306cutely = mapImpassible2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(polder.marial(mapImpassible2.size()));
        Iterator<T> it6 = mapImpassible2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((attabal.C0677attabal) entry2.getKey()).wireman(), entry2.getValue());
        }
        f30302apical = linkedHashMap2;
        Map<attabal.C0677attabal, marial> map = f30306cutely;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<attabal.C0677attabal, marial> entry3 : map.entrySet()) {
            linkedHashSet.add(attabal.C0677attabal.saneness(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).wireman());
        }
        f30308formularize = linkedHashSet;
        Set<attabal.C0677attabal> setKeySet = f30306cutely.keySet();
        ArrayList arrayList7 = new ArrayList(dovishness.gintrap(setKeySet, 10));
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            arrayList7.add(((attabal.C0677attabal) it7.next()).dern());
        }
        f30309impassible = arrayList7;
        Set<Map.Entry<attabal.C0677attabal, marial>> setEntrySet = f30306cutely.entrySet();
        ArrayList<Pair> arrayList8 = new ArrayList(dovishness.gintrap(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList8.add(new Pair(((attabal.C0677attabal) entry4.getKey()).dern(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(wireman.wireman(polder.marial(dovishness.gintrap(arrayList8, 10)), 16));
        for (Pair pair : arrayList8) {
            linkedHashMap3.put((marial) pair.getSecond(), (marial) pair.getFirst());
        }
        f30314triweekly = linkedHashMap3;
    }
}
