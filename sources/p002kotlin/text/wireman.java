package p002kotlin.text;

import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0013\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a3\u0010 \u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b \u0010!\u001a3\u0010\"\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\"\u0010!\u001a\u001b\u0010$\u001a\u00020#*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0001H\u0002¢\u0006\u0004\b$\u0010%\"\u001a\u0010*\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0014\u0010+\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'\"\u0014\u0010,\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'\"\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010.¨\u00060"}, d2 = {"", "", "startIndex", "endIndex", "Lkotlin/text/marial;", "format", "", "marial", "(Ljava/lang/String;IILkotlin/text/marial;)J", "typeHexLength", "competently", "(Ljava/lang/String;IILkotlin/text/marial;I)J", "prefix", "suffix", "", "ignoreCase", "", "saneness", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ZI)V", "attabal", "(Ljava/lang/String;III)V", "dern", "(Ljava/lang/String;II)V", "impromptu", "(Ljava/lang/String;II)J", "specifier", "expected", "cutely", "(Ljava/lang/String;IILjava/lang/String;I)V", "index", "part", "partName", "formularize", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "apical", "", "taiyuan", "(Ljava/lang/String;I)Ljava/lang/Void;", "", "[I", "wireman", "()[I", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "", "[J", "HEX_DIGITS_TO_LONG_DECIMAL", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f32067attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int[] f32068dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f32069saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final long[] f32070wireman;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        f32067attabal = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        f32069saneness = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        f32068dern = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        f32070wireman = jArr;
    }

    public static final void apical(String str, int i, int i2, String str2, String str3) {
        Intrinsics.competently(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    public static final void attabal(String str, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 1) {
            cutely(str, i, i2, "at least", 1);
        } else if (i4 > i3) {
            dern(str, i, (i4 + i) - i3);
        }
    }

    public static /* synthetic */ long beachfront(String str, int i, int i2, HexFormat hexFormat, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            hexFormat = HexFormat.INSTANCE.attabal();
        }
        return marial(str, i, i2, hexFormat);
    }

    public static final long competently(String str, int i, int i2, HexFormat hexFormat, int i3) {
        p002kotlin.collections.wireman.INSTANCE.attabal(i, i2, str.length());
        HexFormat.NumberHexFormat number = hexFormat.getNumber();
        if (number.getIsDigitsOnly()) {
            attabal(str, i, i2, i3);
            return impromptu(str, i, i2);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        saneness(str, i, i2, prefix, suffix, number.getIgnoreCase(), i3);
        return impromptu(str, i + prefix.length(), i2 - suffix.length());
    }

    public static final void cutely(String str, int i, int i2, String str2, int i3) {
        Intrinsics.competently(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was \"" + strSubstring + "\" of length " + (i2 - i));
    }

    public static final void dern(String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i + ", but was '" + str.charAt(i) + "'.\nThe result won't fit the type being parsed.");
            }
            i++;
        }
    }

    public static final void formularize(String str, int i, int i2, String str2, String str3) {
        int iCompetently = p002kotlin.ranges.wireman.competently(str2.length() + i, i2);
        Intrinsics.competently(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, iCompetently);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i + ", but was " + strSubstring);
    }

    public static final long impromptu(String str, int i, int i2) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j3 = f32070wireman[cCharAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            taiyuan(str, i);
            throw new KotlinNothingValueException();
        }
        return j;
    }

    public static final long marial(String str, int i, int i2, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return competently(str, i, i2, format, 16);
    }

    public static final void saneness(String str, int i, int i2, String str2, String str3, boolean z, int i3) {
        if ((i2 - i) - str2.length() <= str3.length()) {
            apical(str, i, i2, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (!attabal.dern(str2.charAt(i4), str.charAt(i + i4), z)) {
                    formularize(str, i, i2, str2, "prefix");
                }
            }
            i += str2.length();
        }
        int length2 = i2 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i5 = 0; i5 < length3; i5++) {
                if (!attabal.dern(str3.charAt(i5), str.charAt(length2 + i5), z)) {
                    formularize(str, length2, i2, str3, "suffix");
                }
            }
        }
        attabal(str, i, length2, i3);
    }

    public static final Void taiyuan(String str, int i) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i + ", but was " + str.charAt(i));
    }

    public static final int[] wireman() {
        return f32067attabal;
    }
}
