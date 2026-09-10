package rl;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import pm.c0;
import pm.y;
import tl.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements lm.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f49626b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f49627c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f49628d = new e();

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static j b(String representation) {
        gm.c cVar;
        kotlin.jvm.internal.n.f(representation, "representation");
        char cCharAt = representation.charAt(0);
        gm.c[] cVarArrValues = gm.c.values();
        int length = cVarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cVar = null;
                break;
            }
            cVar = cVarArrValues[i10];
            if (cVar.d().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (cVar != null) {
            return new i(cVar);
        }
        if (cCharAt == 'V') {
            return new i(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            return new g(b(strSubstring));
        }
        if (cCharAt == 'L' && representation.length() > 0) {
            go.c.q(representation.charAt(an.h.s0(representation)), ';', false);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        kotlin.jvm.internal.n.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new h(strSubstring2);
    }

    public static h d(String internalName) {
        kotlin.jvm.internal.n.f(internalName, "internalName");
        return new h(internalName);
    }

    public static LinkedHashSet e(String internalName, String... signatures) {
        kotlin.jvm.internal.n.f(internalName, "internalName");
        kotlin.jvm.internal.n.f(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet f(String str, String... signatures) {
        kotlin.jvm.internal.n.f(signatures, "signatures");
        return e("java/lang/".concat(str), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static LinkedHashSet g(String str, String... strArr) {
        return e("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String h(j type) {
        String strD;
        kotlin.jvm.internal.n.f(type, "type");
        if (type instanceof g) {
            return X3.j.f27834d + h(((g) type).f49632i);
        }
        if (type instanceof i) {
            gm.c cVar = ((i) type).f49634i;
            return (cVar == null || (strD = cVar.d()) == null) ? "V" : strD;
        }
        if (type instanceof h) {
            return wi.d.k(new StringBuilder("L"), ((h) type).f49633i, ';');
        }
        throw new aa.b((byte) 0, 20);
    }

    @Override // lm.l
    public y c(q0 proto, String flexibleId, c0 lowerBound, c0 upperBound) {
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(flexibleId, "flexibleId");
        kotlin.jvm.internal.n.f(lowerBound, "lowerBound");
        kotlin.jvm.internal.n.f(upperBound, "upperBound");
        if (flexibleId.equals("kotlin.jvm.PlatformType")) {
            return proto.o(wl.k.f53472g) ? new nl.f(lowerBound, upperBound) : pm.f.j(lowerBound, upperBound);
        }
        return rm.i.c(rm.h.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}
