package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    public static final int c(CharSequence charSequence, String string, int i2, boolean z2) {
        Intrinsics.f(charSequence, "<this>");
        Intrinsics.f(string, "string");
        return (z2 || !(charSequence instanceof String)) ? d(charSequence, string, i2, charSequence.length(), z2, false) : ((String) charSequence).indexOf(string, i2);
    }

    public static final int d(CharSequence charSequence, String str, int i2, int i3, boolean z2, boolean z3) {
        IntProgression intProgression;
        int i4 = i2;
        int i5 = i3;
        if (z3) {
            int iT = StringsKt.t(charSequence);
            if (i4 > iT) {
                i4 = iT;
            }
            if (i5 < 0) {
                i5 = 0;
            }
            intProgression = new IntProgression(i4, i5, -1);
        } else {
            if (i4 < 0) {
                i4 = 0;
            }
            int length = charSequence.length();
            if (i5 > length) {
                i5 = length;
            }
            intProgression = new IntRange(i4, i5, 1);
        }
        boolean z4 = charSequence instanceof String;
        int i6 = intProgression.Z;
        int i7 = intProgression.f43343Y;
        int i8 = intProgression.X;
        if (!z4 || str == null) {
            if ((i6 > 0 && i8 <= i7) || (i6 < 0 && i7 <= i8)) {
                int i9 = i8;
                while (!f(str, 0, charSequence, i9, str.length(), z2)) {
                    if (i9 != i7) {
                        i9 += i6;
                    }
                }
                return i9;
            }
        } else if ((i6 > 0 && i8 <= i7) || (i6 < 0 && i7 <= i8)) {
            int i10 = i8;
            while (!StringsKt.C(str, 0, (String) charSequence, i10, str.length(), z2)) {
                if (i10 != i7) {
                    i10 += i6;
                }
            }
            return i10;
        }
        return -1;
    }

    public static final int e(CharSequence charSequence, char[] cArr, int i2, boolean z2) {
        Intrinsics.f(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i2);
        }
        if (i2 < 0) {
            i2 = 0;
        }
        int iT = StringsKt.t(charSequence);
        if (i2 > iT) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i2);
            for (char c2 : cArr) {
                if (CharsKt__CharKt.a(c2, cCharAt, z2)) {
                    return i2;
                }
            }
            if (i2 == iT) {
                return -1;
            }
            i2++;
        }
    }

    public static final boolean f(String str, int i2, CharSequence other, int i3, int i4, boolean z2) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(other, "other");
        if (i3 >= 0 && i2 >= 0 && i2 <= str.length() - i4 && i3 <= other.length() - i4) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (CharsKt__CharKt.a(str.charAt(i2 + i5), other.charAt(i3 + i5), z2)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void g(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List h(int i2, String str, String str2) {
        g(i2);
        int iC = c(str, str2, 0, false);
        if (iC == -1 || i2 == 1) {
            return CollectionsKt.H(str.toString());
        }
        boolean z2 = i2 > 0;
        int i3 = 10;
        if (z2 && i2 <= 10) {
            i3 = i2;
        }
        ArrayList arrayList = new ArrayList(i3);
        int length = 0;
        do {
            arrayList.add(str.subSequence(length, iC).toString());
            length = str2.length() + iC;
            if (z2 && arrayList.size() == i2 - 1) {
                break;
            }
            iC = c(str, str2, length, false);
        } while (iC != -1);
        arrayList.add(str.subSequence(length, str.length()).toString());
        return arrayList;
    }

    public static boolean i(String str, String prefix) {
        Intrinsics.f(str, "<this>");
        Intrinsics.f(prefix, "prefix");
        return StringsKt.M(str, prefix, false);
    }
}
