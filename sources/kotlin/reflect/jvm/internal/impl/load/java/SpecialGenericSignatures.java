package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.media3.extractor.text.ttml.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes7.dex */
public class SpecialGenericSignatures {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f43789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f43790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f43791c;
    public static final LinkedHashMap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f43792e;
    public static final Set f;
    public static final Companion.NameAndSignature g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f43793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f43794i;
    public static final ArrayList j;
    public static final LinkedHashMap k;

    public static final class Companion {

        public static final class NameAndSignature {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Name f43795a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f43796b;

            public NameAndSignature(Name name, String signature) {
                Intrinsics.f(signature, "signature");
                this.f43795a = name;
                this.f43796b = signature;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.a(this.f43795a, nameAndSignature.f43795a) && Intrinsics.a(this.f43796b, nameAndSignature.f43796b);
            }

            public final int hashCode() {
                return this.f43796b.hashCode() + (this.f43795a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(name=");
                sb.append(this.f43795a);
                sb.append(", signature=");
                return a.p(sb, this.f43796b, ')');
            }
        }

        public static final NameAndSignature a(String str, String str2, String str3, String str4) {
            ArrayList arrayList = SpecialGenericSignatures.f43789a;
            return new NameAndSignature(Name.g(str2), SignatureBuildingComponents.f(str, str2 + '(' + str3 + ')' + str4));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SpecialSignatureInfo {
        public static final SpecialSignatureInfo X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final SpecialSignatureInfo f43797Y;
        public static final SpecialSignatureInfo Z;
        public static final /* synthetic */ SpecialSignatureInfo[] e0;

        static {
            SpecialSignatureInfo specialSignatureInfo = new SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0);
            X = specialSignatureInfo;
            SpecialSignatureInfo specialSignatureInfo2 = new SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1);
            f43797Y = specialSignatureInfo2;
            SpecialSignatureInfo specialSignatureInfo3 = new SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2);
            Z = specialSignatureInfo3;
            e0 = new SpecialSignatureInfo[]{specialSignatureInfo, specialSignatureInfo2, specialSignatureInfo3};
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) e0.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final TypeSafeBarrierDescription f43798Y;
        public static final TypeSafeBarrierDescription Z;
        public static final TypeSafeBarrierDescription e0;
        public static final TypeSafeBarrierDescription f0;
        public static final /* synthetic */ TypeSafeBarrierDescription[] g0;
        public final Object X;

        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
        }

        static {
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription("NULL", 0, null);
            f43798Y = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription("INDEX", 1, -1);
            Z = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
            e0 = typeSafeBarrierDescription3;
            MAP_GET_OR_DEFAULT map_get_or_default = new MAP_GET_OR_DEFAULT("MAP_GET_OR_DEFAULT", 3, null);
            f0 = map_get_or_default;
            g0 = new TypeSafeBarrierDescription[]{typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, map_get_or_default};
        }

        public TypeSafeBarrierDescription(String str, int i2, Object obj) {
            super(str, i2);
            this.X = obj;
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) g0.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setO = ArraysKt.O(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(CollectionsKt.n(setO, 10));
        for (String str : setO) {
            String strD = JvmPrimitiveType.BOOLEAN.d();
            Intrinsics.e(strD, "BOOLEAN.desc");
            arrayList.add(Companion.a("java/util/Collection", str, "Ljava/util/Collection;", strD));
        }
        f43789a = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Companion.NameAndSignature) it.next()).f43796b);
        }
        f43790b = arrayList2;
        ArrayList arrayList3 = f43789a;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.n(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it2.next()).f43795a.b());
        }
        String strConcat = "java/util/".concat("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String strD2 = jvmPrimitiveType.d();
        Intrinsics.e(strD2, "BOOLEAN.desc");
        Companion.NameAndSignature nameAndSignatureA = Companion.a(strConcat, "contains", "Ljava/lang/Object;", strD2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.e0;
        Pair pair = new Pair(nameAndSignatureA, typeSafeBarrierDescription);
        String strConcat2 = "java/util/".concat("Collection");
        String strD3 = jvmPrimitiveType.d();
        Intrinsics.e(strD3, "BOOLEAN.desc");
        Pair pair2 = new Pair(Companion.a(strConcat2, "remove", "Ljava/lang/Object;", strD3), typeSafeBarrierDescription);
        String strConcat3 = "java/util/".concat("Map");
        String strD4 = jvmPrimitiveType.d();
        Intrinsics.e(strD4, "BOOLEAN.desc");
        Pair pair3 = new Pair(Companion.a(strConcat3, "containsKey", "Ljava/lang/Object;", strD4), typeSafeBarrierDescription);
        String strConcat4 = "java/util/".concat("Map");
        String strD5 = jvmPrimitiveType.d();
        Intrinsics.e(strD5, "BOOLEAN.desc");
        Pair pair4 = new Pair(Companion.a(strConcat4, "containsValue", "Ljava/lang/Object;", strD5), typeSafeBarrierDescription);
        String strConcat5 = "java/util/".concat("Map");
        String strD6 = jvmPrimitiveType.d();
        Intrinsics.e(strD6, "BOOLEAN.desc");
        Pair pair5 = new Pair(Companion.a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strD6), typeSafeBarrierDescription);
        Pair pair6 = new Pair(Companion.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.f0);
        Companion.NameAndSignature nameAndSignatureA2 = Companion.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.f43798Y;
        Pair pair7 = new Pair(nameAndSignatureA2, typeSafeBarrierDescription2);
        Pair pair8 = new Pair(Companion.a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strConcat6 = "java/util/".concat("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String strD7 = jvmPrimitiveType2.d();
        Intrinsics.e(strD7, "INT.desc");
        Companion.NameAndSignature nameAndSignatureA3 = Companion.a(strConcat6, "indexOf", "Ljava/lang/Object;", strD7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.Z;
        Pair pair9 = new Pair(nameAndSignatureA3, typeSafeBarrierDescription3);
        String strConcat7 = "java/util/".concat("List");
        String strD8 = jvmPrimitiveType2.d();
        Intrinsics.e(strD8, "INT.desc");
        Map mapJ = MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(Companion.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strD8), typeSafeBarrierDescription3));
        f43791c = mapJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(mapJ.size()));
        for (Map.Entry entry : mapJ.entrySet()) {
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).f43796b, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetF = SetsKt.f(f43791c.keySet(), f43789a);
        ArrayList arrayList5 = new ArrayList(CollectionsKt.n(linkedHashSetF, 10));
        Iterator it3 = linkedHashSetF.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it3.next()).f43795a);
        }
        f43792e = CollectionsKt.l0(arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.n(linkedHashSetF, 10));
        Iterator it4 = linkedHashSetF.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it4.next()).f43796b);
        }
        f = CollectionsKt.l0(arrayList6);
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String strD9 = jvmPrimitiveType3.d();
        Intrinsics.e(strD9, "INT.desc");
        Companion.NameAndSignature nameAndSignatureA4 = Companion.a("java/util/List", "removeAt", strD9, "Ljava/lang/Object;");
        g = nameAndSignatureA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strD10 = JvmPrimitiveType.BYTE.d();
        Intrinsics.e(strD10, "BYTE.desc");
        Pair pair10 = new Pair(Companion.a(strConcat8, "toByte", "", strD10), Name.g("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strD11 = JvmPrimitiveType.SHORT.d();
        Intrinsics.e(strD11, "SHORT.desc");
        Pair pair11 = new Pair(Companion.a(strConcat9, "toShort", "", strD11), Name.g("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strD12 = jvmPrimitiveType3.d();
        Intrinsics.e(strD12, "INT.desc");
        Pair pair12 = new Pair(Companion.a(strConcat10, "toInt", "", strD12), Name.g("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strD13 = JvmPrimitiveType.LONG.d();
        Intrinsics.e(strD13, "LONG.desc");
        Pair pair13 = new Pair(Companion.a(strConcat11, "toLong", "", strD13), Name.g("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strD14 = JvmPrimitiveType.FLOAT.d();
        Intrinsics.e(strD14, "FLOAT.desc");
        Pair pair14 = new Pair(Companion.a(strConcat12, "toFloat", "", strD14), Name.g("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strD15 = JvmPrimitiveType.DOUBLE.d();
        Intrinsics.e(strD15, "DOUBLE.desc");
        Pair pair15 = new Pair(Companion.a(strConcat13, "toDouble", "", strD15), Name.g("doubleValue"));
        Pair pair16 = new Pair(nameAndSignatureA4, Name.g("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strD16 = jvmPrimitiveType3.d();
        Intrinsics.e(strD16, "INT.desc");
        String strD17 = JvmPrimitiveType.CHAR.d();
        Intrinsics.e(strD17, "CHAR.desc");
        Map mapJ2 = MapsKt.j(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(Companion.a(strConcat14, "get", strD16, strD17), Name.g("charAt")));
        f43793h = mapJ2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.h(mapJ2.size()));
        for (Map.Entry entry2 : mapJ2.entrySet()) {
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).f43796b, entry2.getValue());
        }
        f43794i = linkedHashMap2;
        Set setKeySet = f43793h.keySet();
        ArrayList arrayList7 = new ArrayList(CollectionsKt.n(setKeySet, 10));
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((Companion.NameAndSignature) it5.next()).f43795a);
        }
        j = arrayList7;
        Set<Map.Entry> setEntrySet = f43793h.entrySet();
        ArrayList<Pair> arrayList8 = new ArrayList(CollectionsKt.n(setEntrySet, 10));
        for (Map.Entry entry3 : setEntrySet) {
            arrayList8.add(new Pair(((Companion.NameAndSignature) entry3.getKey()).f43795a, entry3.getValue()));
        }
        int iH = MapsKt.h(CollectionsKt.n(arrayList8, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iH);
        for (Pair pair17 : arrayList8) {
            linkedHashMap3.put((Name) pair17.f43249Y, (Name) pair17.X);
        }
        k = linkedHashMap3;
    }
}
