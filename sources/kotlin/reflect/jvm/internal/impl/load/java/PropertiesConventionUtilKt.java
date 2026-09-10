package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class PropertiesConventionUtilKt {
    public static Name a(Name name, String str, String str2, int i2) {
        char cCharAt;
        char cCharAt2;
        Object next;
        boolean z2 = (i2 & 4) != 0;
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if (!name.f44171Y) {
            String strD = name.d();
            if (StringsKt.M(strD, str, false) && strD.length() != str.length() && ('a' > (cCharAt = strD.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return Name.g(str2.concat(StringsKt.D(strD, str)));
                }
                if (!z2) {
                    return name;
                }
                String strD2 = StringsKt.D(strD, str);
                if (strD2.length() != 0 && CapitalizeDecapitalizeKt.b(0, strD2)) {
                    if (strD2.length() != 1 && CapitalizeDecapitalizeKt.b(1, strD2)) {
                        Iterator<Integer> it = new IntRange(0, strD2.length() - 1, 1).iterator();
                        do {
                            if (!((IntProgressionIterator) it).Z) {
                                next = null;
                                break;
                            }
                            next = ((IntIterator) it).next();
                        } while (CapitalizeDecapitalizeKt.b(((Number) next).intValue(), strD2));
                        Integer num = (Integer) next;
                        if (num != null) {
                            int iIntValue = num.intValue() - 1;
                            String strSubstring = strD2.substring(0, iIntValue);
                            Intrinsics.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String strC = CapitalizeDecapitalizeKt.c(strSubstring);
                            String strSubstring2 = strD2.substring(iIntValue);
                            Intrinsics.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            strD2 = strC.concat(strSubstring2);
                        } else {
                            strD2 = CapitalizeDecapitalizeKt.c(strD2);
                        }
                    } else if (strD2.length() != 0 && 'A' <= (cCharAt2 = strD2.charAt(0)) && cCharAt2 < '[') {
                        char lowerCase = Character.toLowerCase(cCharAt2);
                        String strSubstring3 = strD2.substring(1);
                        Intrinsics.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
                        strD2 = lowerCase + strSubstring3;
                    }
                }
                if (Name.h(strD2)) {
                    return Name.g(strD2);
                }
            }
        }
        return null;
    }
}
