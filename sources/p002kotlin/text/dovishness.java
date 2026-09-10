package p002kotlin.text;

import com.ironsource.A5;
import com.ironsource.C3414a2;
import java.util.Comparator;
import p002kotlin.Metadata;
import p002kotlin.collections.wireman;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.gintrap;

/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0002*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0000*\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0016\u001a\u00020\u0000*\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0000*\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0018*\u00020\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001e\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0005\u001a+\u0010\u001f\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\"\u001a\u00020\u0002*\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\u0005\u001a;\u0010&\u001a\u00020\u0002*\u00020\u00002\u0006\u0010#\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010*\u001a\u00020\u0000*\u00020(2\u0006\u0010)\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+\"%\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00000-j\b\u0012\u0004\u0012\u00020\u0000`.*\u00020,8F¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"", C3414a2.d, "", "ignoreCase", "stratoscope", "(Ljava/lang/String;Ljava/lang/String;Z)Z", "", "oldChar", "newChar", "supplicat", "(Ljava/lang/String;CCZ)Ljava/lang/String;", "oldValue", "newValue", "restrictive", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "seminary", "", "dovishness", "([C)Ljava/lang/String;", "", "startIndex", "endIndex", "gintrap", "([CII)Ljava/lang/String;", "", "rotuma", "([B)Ljava/lang/String;", "preprohormone", "(Ljava/lang/String;)[B", "prefix", "privatdozent", "saran", "(Ljava/lang/String;Ljava/lang/String;IZ)Z", "suffix", "cord", "thisOffset", "otherOffset", "length", "yemenite", "(Ljava/lang/String;ILjava/lang/String;IIZ)Z", "", A5.q, "kattegat", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "Lkotlin/String$Companion;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "oilcan", "(Lkotlin/jvm/internal/gintrap;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class dovishness extends StringsKt__StringNumberConversionsKt {
    public static boolean cord(String str, String suffix, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z ? str.endsWith(suffix) : yemenite(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean creditor(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return saran(str, str2, i, z);
    }

    public static /* synthetic */ boolean cuirassed(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cord(str, str2, z);
    }

    public static String dovishness(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new String(cArr);
    }

    public static String gintrap(char[] cArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        wireman.INSTANCE.attabal(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static /* synthetic */ String grimness(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return seminary(str, str2, str3, z);
    }

    public static String kattegat(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append(charSequence);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        Intrinsics.beachfront(string);
        return string;
    }

    public static /* synthetic */ String merc(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return supplicat(str, c, c2, z);
    }

    public static Comparator<String> oilcan(gintrap gintrapVar) {
        Intrinsics.checkNotNullParameter(gintrapVar, "<this>");
        Comparator<String> CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }

    public static /* synthetic */ String polder(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return restrictive(str, str2, str3, z);
    }

    public static byte[] preprohormone(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean privatdozent(String str, String prefix, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z ? str.startsWith(prefix) : yemenite(str, 0, prefix, 0, prefix.length(), z);
    }

    public static final String restrictive(String str, String oldValue, String newValue, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i = 0;
        int iItchy = StringsKt__StringsKt.itchy(str, oldValue, 0, z);
        if (iItchy < 0) {
            return str;
        }
        int length = oldValue.length();
        int iWireman = p002kotlin.ranges.wireman.wireman(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iItchy);
            sb.append(newValue);
            i = iItchy + length;
            if (iItchy >= str.length()) {
                break;
            }
            iItchy = StringsKt__StringsKt.itchy(str, oldValue, iItchy + iWireman, z);
        } while (iItchy > 0);
        sb.append((CharSequence) str, i, str.length());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static String rotuma(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }

    public static boolean saran(String str, String prefix, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z ? str.startsWith(prefix, i) : yemenite(str, i, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean sealless(String str, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return yemenite(str, i, str2, i2, i3, z);
    }

    public static final String seminary(String str, String oldValue, String newValue, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int iLotta = StringsKt__StringsKt.lotta(str, oldValue, 0, z, 2, null);
        return iLotta < 0 ? str : StringsKt__StringsKt.dhss(str, iLotta, oldValue.length() + iLotta, newValue).toString();
    }

    public static /* synthetic */ boolean starveling(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return privatdozent(str, str2, z);
    }

    public static boolean stratoscope(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final String supplicat(String str, char c, char c2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z) {
            String strReplace = str.replace(c, c2);
            Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (attabal.dern(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean trm(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return stratoscope(str, str2, z);
    }

    public static boolean yemenite(String str, int i, String other, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z ? str.regionMatches(i, other, i2, i3) : str.regionMatches(z, i, other, i2, i3);
    }
}
