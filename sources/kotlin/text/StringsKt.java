package kotlin.text;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/text/StringsKt__AppendableKt", "kotlin/text/StringsKt__IndentKt", "kotlin/text/StringsKt__RegexExtensionsJVMKt", "kotlin/text/StringsKt__RegexExtensionsKt", "kotlin/text/StringsKt__StringBuilderJVMKt", "kotlin/text/StringsKt__StringBuilderKt", "kotlin/text/StringsKt__StringNumberConversionsJVMKt", "kotlin/text/StringsKt__StringNumberConversionsKt", "kotlin/text/StringsKt__StringsJVMKt", "kotlin/text/StringsKt__StringsKt", "kotlin/text/StringsKt___StringsJvmKt", "kotlin/text/StringsKt___StringsKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class StringsKt extends StringsKt___StringsKt {
    public static String A(int i2, String str) {
        CharSequence charSequenceSubSequence;
        Intrinsics.f(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.k("Desired length ", i2, " is less than zero."));
        }
        if (i2 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            int length = i2 - str.length();
            int i3 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String B(String str) {
        Intrinsics.f(str, "<this>");
        return SequencesKt.n(SequencesKt.o(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(str), new a("    ", 1)), IOUtils.LINE_SEPARATOR_UNIX);
    }

    public static boolean C(String str, int i2, String other, int i3, int i4, boolean z2) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(other, "other");
        return !z2 ? str.regionMatches(i2, other, i3, i4) : str.regionMatches(z2, i2, other, i3, i4);
    }

    public static String D(String str, String prefix) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(prefix, "prefix");
        if (!StringsKt__StringsKt.i(str, prefix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String E(String str, String str2) {
        Intrinsics.f(str, "<this>");
        if (!p(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String F(String str) {
        Intrinsics.f(str, "<this>");
        if (str.length() < 2 || !StringsKt__StringsKt.i(str, "\"") || !p(str, "\"", false)) {
            return str;
        }
        String strSubstring = str.substring(1, str.length() - 1);
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String G(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + '.').toString());
        }
        if (i2 == 0) {
            return "";
        }
        int i3 = 1;
        if (i2 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i2);
        if (1 <= i2) {
            while (true) {
                sb.append((CharSequence) str);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        String string = sb.toString();
        Intrinsics.c(string);
        return string;
    }

    public static String H(String str, char c2, char c3) {
        Intrinsics.f(str, "<this>");
        String strReplace = str.replace(c2, c3);
        Intrinsics.e(strReplace, "replace(...)");
        return strReplace;
    }

    public static String I(String str, String oldValue, String newValue) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(oldValue, "oldValue");
        Intrinsics.f(newValue, "newValue");
        int iC = StringsKt__StringsKt.c(str, oldValue, 0, false);
        if (iC < 0) {
            return str;
        }
        int length = oldValue.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, iC);
            sb.append(newValue);
            i3 = iC + length;
            if (iC >= str.length()) {
                break;
            }
            iC = StringsKt__StringsKt.c(str, oldValue, iC + i2, false);
        } while (iC > 0);
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public static List J(String str, int i2, int i3, String[] strArr) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        Intrinsics.f(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return StringsKt__StringsKt.h(i2, str, str2);
            }
        }
        StringsKt__StringsKt.g(i2);
        DelimitedRangesSequence<IntRange> delimitedRangesSequence = new DelimitedRangesSequence(str, i2, new b(ArraysKt.e(strArr), 1));
        ArrayList arrayList = new ArrayList(CollectionsKt.n(new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(delimitedRangesSequence), 10));
        for (IntRange range : delimitedRangesSequence) {
            Intrinsics.f(range, "range");
            arrayList.add(str.subSequence(range.X, range.f43343Y + 1).toString());
        }
        return arrayList;
    }

    public static List K(String str, char[] cArr, int i2) {
        int i3 = (i2 & 4) != 0 ? 0 : 2;
        Intrinsics.f(str, "<this>");
        if (cArr.length == 1) {
            return StringsKt__StringsKt.h(i3, str, String.valueOf(cArr[0]));
        }
        StringsKt__StringsKt.g(i3);
        DelimitedRangesSequence<IntRange> delimitedRangesSequence = new DelimitedRangesSequence(str, i3, new b(cArr, 0));
        ArrayList arrayList = new ArrayList(CollectionsKt.n(new SequencesKt___SequencesKt$asIterable$$inlined$Iterable$1(delimitedRangesSequence), 10));
        for (IntRange range : delimitedRangesSequence) {
            Intrinsics.f(range, "range");
            arrayList.add(str.subSequence(range.X, range.f43343Y + 1).toString());
        }
        return arrayList;
    }

    public static boolean L(String str, int i2, String str2, boolean z2) {
        Intrinsics.f(str, "<this>");
        return !z2 ? str.startsWith(str2, i2) : C(str, i2, str2, 0, str2.length(), z2);
    }

    public static boolean M(String str, String prefix, boolean z2) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : C(str, 0, prefix, 0, prefix.length(), z2);
    }

    public static boolean N(String str, char c2) {
        return str.length() > 0 && CharsKt__CharKt.a(str.charAt(0), c2, false);
    }

    public static String O(char c2, String str, String str2) {
        int iU = u(str, c2, 0, 6);
        if (iU == -1) {
            return str2;
        }
        String strSubstring = str.substring(iU + 1, str.length());
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String P(String str, String delimiter, String str2) {
        Intrinsics.f(delimiter, "delimiter");
        int iV = v(str, delimiter, 0, false, 6);
        if (iV == -1) {
            return str2;
        }
        String strSubstring = str.substring(delimiter.length() + iV, str.length());
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Q(char c2, String str, String missingDelimiterValue) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(missingDelimiterValue, "missingDelimiterValue");
        int iZ = z(str, c2, 0, 6);
        if (iZ == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iZ + 1, str.length());
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String R(String missingDelimiterValue, String str) {
        Intrinsics.f(missingDelimiterValue, "<this>");
        Intrinsics.f(missingDelimiterValue, "missingDelimiterValue");
        int iY = y(6, str, missingDelimiterValue);
        if (iY == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(str.length() + iY, missingDelimiterValue.length());
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S(String missingDelimiterValue, char c2) {
        Intrinsics.f(missingDelimiterValue, "<this>");
        Intrinsics.f(missingDelimiterValue, "missingDelimiterValue");
        int iU = u(missingDelimiterValue, c2, 0, 6);
        if (iU == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iU);
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String T(String missingDelimiterValue, String str) {
        Intrinsics.f(missingDelimiterValue, "<this>");
        Intrinsics.f(missingDelimiterValue, "missingDelimiterValue");
        int iV = v(missingDelimiterValue, str, 0, false, 6);
        if (iV == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iV);
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String U(String str, String str2, String missingDelimiterValue) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(missingDelimiterValue, "missingDelimiterValue");
        int iY = y(6, str2, str);
        if (iY == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iY);
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String V(int i2, String str) {
        Intrinsics.f(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.k("Requested character count ", i2, " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String strSubstring = str.substring(0, i2);
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static Double W(String str) {
        Intrinsics.f(str, "<this>");
        try {
            if (StringsKt__StringNumberConversionsJVMKt.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float X(String str) {
        Intrinsics.f(str, "<this>");
        try {
            if (StringsKt__StringNumberConversionsJVMKt.a(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Integer Y(String str) {
        boolean z2;
        int i2;
        int i3;
        Intrinsics.f(str, "<this>");
        CharsKt.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (Intrinsics.h(cCharAt, 48) < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z2 = true;
            }
        } else {
            z2 = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / 10))) || (i3 = i4 * 10) < i5 + iDigit) {
                return null;
            }
            i4 = i3 - iDigit;
            i2++;
        }
        return z2 ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long Z(String str) {
        boolean z2;
        Intrinsics.f(str, "<this>");
        CharsKt.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (Intrinsics.h(cCharAt, 48) < 0) {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
                i2 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z2 = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / ((long) 10);
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * ((long) 10);
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i2++;
        }
        return z2 ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static CharSequence a0(CharSequence charSequence) {
        Intrinsics.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zC = CharsKt.c(charSequence.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static String b0(String str, char... cArr) {
        Intrinsics.f(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean zH = ArraysKt.h(cArr, str.charAt(!z2 ? i2 : length));
            if (z2) {
                if (!zH) {
                    break;
                }
                length--;
            } else if (zH) {
                i2++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    public static String c0(String str) {
        int length;
        Comparable comparable;
        Intrinsics.f(str, "<this>");
        List listV = SequencesKt.v(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(str));
        List list = listV;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!w((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!CharsKt.c(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listV.size();
        int iA = CollectionsKt.A(listV);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i2 = length + 1;
            if (length < 0) {
                CollectionsKt.f0();
                throw null;
            }
            String str3 = (String) obj2;
            String strO = ((length == 0 || length == iA) && w(str3)) ? null : o(iIntValue, str3);
            if (strO != null) {
                arrayList3.add(strO);
            }
            length = i2;
        }
        StringBuilder sb = new StringBuilder(length3);
        CollectionsKt.C(arrayList3, sb, IOUtils.LINE_SEPARATOR_UNIX, null, null, null, 124);
        return sb.toString();
    }

    public static String d0(String str) {
        Intrinsics.f(str, "<this>");
        if (w(com.smartdigimkt.b0.a.U1)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listV = SequencesKt.v(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(str));
        int length = str.length();
        listV.size();
        int iA = CollectionsKt.A(listV);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : listV) {
            int i3 = i2 + 1;
            String strSubstring = null;
            if (i2 < 0) {
                CollectionsKt.f0();
                throw null;
            }
            String str2 = (String) obj;
            if ((i2 != 0 && i2 != iA) || !w(str2)) {
                int length2 = str2.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!CharsKt.c(str2.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1 && L(str2, i4, com.smartdigimkt.b0.a.U1, false)) {
                    strSubstring = str2.substring(com.smartdigimkt.b0.a.U1.length() + i4);
                    Intrinsics.e(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(length);
        CollectionsKt.C(arrayList, sb, IOUtils.LINE_SEPARATOR_UNIX, null, null, null, 124);
        return sb.toString();
    }

    public static void j(StringBuilder sb, Object obj, Function1 function1) {
        Intrinsics.f(sb, "<this>");
        if (function1 != null) {
            sb.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static String k(char[] cArr, int i2, int i3) {
        Intrinsics.f(cArr, "<this>");
        AbstractList.Companion companion = AbstractList.INSTANCE;
        int length = cArr.length;
        companion.getClass();
        AbstractList.Companion.a(i2, i3, length);
        return new String(cArr, i2, i3 - i2);
    }

    public static boolean l(CharSequence charSequence, String other, boolean z2) {
        Intrinsics.f(charSequence, "<this>");
        Intrinsics.f(other, "other");
        return v(charSequence, other, 0, z2, 2) >= 0;
    }

    public static boolean m(CharSequence charSequence, char c2) {
        Intrinsics.f(charSequence, "<this>");
        return u(charSequence, c2, 0, 2) >= 0;
    }

    public static String n(byte[] bArr) {
        return new String(bArr, Charsets.f44691a);
    }

    public static String o(int i2, String str) {
        Intrinsics.f(str, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.k("Requested character count ", i2, " is less than zero.").toString());
        }
        int length = str.length();
        if (i2 > length) {
            i2 = length;
        }
        String strSubstring = str.substring(i2);
        Intrinsics.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean p(String str, String suffix, boolean z2) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(suffix, "suffix");
        return !z2 ? str.endsWith(suffix) : C(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static boolean q(String str, char c2) {
        Intrinsics.f(str, "<this>");
        return str.length() > 0 && CharsKt__CharKt.a(str.charAt(t(str)), c2, false);
    }

    public static boolean r(String str, String str2, boolean z2) {
        if (str == null) {
            return str2 == null;
        }
        return !z2 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static void s() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.e(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    }

    public static int t(CharSequence charSequence) {
        Intrinsics.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int u(CharSequence charSequence, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Intrinsics.f(charSequence, "<this>");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.e(charSequence, new char[]{c2}, i2, false) : ((String) charSequence).indexOf(c2, i2);
    }

    public static /* synthetic */ int v(CharSequence charSequence, String str, int i2, boolean z2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return StringsKt__StringsKt.c(charSequence, str, i2, z2);
    }

    public static boolean w(CharSequence charSequence) {
        Intrinsics.f(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!CharsKt.c(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static char x(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(t(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int y(int i2, String string, CharSequence charSequence) {
        int iT = (i2 & 2) != 0 ? t(charSequence) : 0;
        Intrinsics.f(charSequence, "<this>");
        Intrinsics.f(string, "string");
        return !(charSequence instanceof String) ? StringsKt__StringsKt.d(charSequence, string, iT, 0, false, true) : ((String) charSequence).lastIndexOf(string, iT);
    }

    public static int z(String str, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = t(str);
        }
        Intrinsics.f(str, "<this>");
        return str.lastIndexOf(c2, i2);
    }
}
