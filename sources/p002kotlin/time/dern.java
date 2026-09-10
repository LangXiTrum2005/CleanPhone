package p002kotlin.time;

import androidx.media3.common.PlaybackException;
import org.objectweb.asm.signature.SignatureVisitor;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.wireman;
import p002kotlin.text.StringsKt;
import p002kotlin.text.cord;
import p002kotlin.text.dovishness;
import tithonia.saneness;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0016\u001a\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0016\u001a\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0016\u001a\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0016¨\u0006#"}, d2 = {"", "Lkotlin/time/DurationUnit;", "unit", "Lkotlin/time/saneness;", "molybdenite", "(ILkotlin/time/DurationUnit;)J", "", "graveside", "(JLkotlin/time/DurationUnit;)J", "", "polloi", "(DLkotlin/time/DurationUnit;)J", "", "value", "", "strictIso", "arytenoidectomy", "(Ljava/lang/String;Z)J", "monoploid", "(Ljava/lang/String;)J", "nanos", "kowloon", "(J)J", "millis", "triweekly", "normalNanos", "formularize", "normalMillis", "cutely", "normalValue", "unitDiscriminator", "taiyuan", "(JI)J", "impassible", "apical", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class dern {
    public static final long apical(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? cutely(wireman.formularize(j, -4611686018427387903L, 4611686018427387903L)) : formularize(triweekly(j));
    }

    public static final long arytenoidectomy(String str, boolean z) {
        int i;
        char cCharAt;
        char cCharAt2;
        int i2;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        saneness.Companion companion = saneness.INSTANCE;
        long jDern = companion.dern();
        char cCharAt3 = str.charAt(0);
        int length2 = (cCharAt3 == '+' || cCharAt3 == '-') ? 1 : 0;
        boolean z2 = length2 > 0;
        boolean z3 = z2 && StringsKt.deadwork(str, SignatureVisitor.SUPER, false, 2, null);
        if (length <= length2) {
            throw new IllegalArgumentException("No components");
        }
        char c = ':';
        char c2 = '0';
        if (str.charAt(length2) == 'P') {
            int i3 = length2 + 1;
            if (i3 == length) {
                throw new IllegalArgumentException();
            }
            boolean z4 = false;
            DurationUnit durationUnit = null;
            while (i3 < length) {
                if (str.charAt(i3) != 'T') {
                    int i4 = i3;
                    while (true) {
                        if (i4 >= str.length()) {
                            i2 = length;
                            break;
                        }
                        char cCharAt4 = str.charAt(i4);
                        if (c2 > cCharAt4 || cCharAt4 >= c) {
                            i2 = length;
                            if (!StringsKt.splinterproof("+-.", cCharAt4, false, 2, null)) {
                                break;
                            }
                        } else {
                            i2 = length;
                        }
                        i4++;
                        length = i2;
                        c2 = '0';
                        c = ':';
                    }
                    Intrinsics.competently(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring = str.substring(i3, i4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length3 = i3 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    i3 = length3 + 1;
                    DurationUnit durationUnitWireman = tithonia.dern.wireman(cCharAt5, z4);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitWireman) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iNosophobia = StringsKt.nosophobia(strSubstring, '.', 0, false, 6, null);
                    if (durationUnitWireman != DurationUnit.SECONDS || iNosophobia <= 0) {
                        jDern = saneness.polder(jDern, graveside(monoploid(strSubstring), durationUnitWireman));
                    } else {
                        Intrinsics.competently(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring2 = strSubstring.substring(0, iNosophobia);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        long jPolder = saneness.polder(jDern, graveside(monoploid(strSubstring2), durationUnitWireman));
                        Intrinsics.competently(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring3 = strSubstring.substring(iNosophobia);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        jDern = saneness.polder(jPolder, polloi(Double.parseDouble(strSubstring3), durationUnitWireman));
                    }
                    z4 = z4;
                    durationUnit = durationUnitWireman;
                    length = i2;
                    c2 = '0';
                    c = ':';
                } else {
                    if (z4 || (i3 = i3 + 1) == length) {
                        throw new IllegalArgumentException();
                    }
                    z4 = true;
                }
            }
        } else {
            if (z) {
                throw new IllegalArgumentException();
            }
            char c3 = '0';
            if (dovishness.yemenite(str, length2, "Infinity", 0, Math.max(length - length2, 8), true)) {
                jDern = companion.attabal();
            } else {
                boolean z5 = !z2;
                if (z2 && str.charAt(length2) == '(' && cord.liable(str) == ')') {
                    length2++;
                    int i5 = length - 1;
                    if (length2 == i5) {
                        throw new IllegalArgumentException("No components");
                    }
                    i = i5;
                    z5 = true;
                } else {
                    i = length;
                }
                boolean z6 = false;
                DurationUnit durationUnit2 = null;
                while (length2 < i) {
                    if (z6 && z5) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i6 = length2;
                    while (i6 < str.length() && ((c3 <= (cCharAt2 = str.charAt(i6)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i6++;
                    }
                    Intrinsics.competently(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring4 = str.substring(length2, i6);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i7 = length4;
                    while (i7 < str.length() && 'a' <= (cCharAt = str.charAt(i7)) && cCharAt < '{') {
                        i7++;
                    }
                    Intrinsics.competently(str, "null cannot be cast to non-null type java.lang.String");
                    String strSubstring5 = str.substring(length4, i7);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    DurationUnit durationUnitMarial = tithonia.dern.marial(strSubstring5);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitMarial) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iNosophobia2 = StringsKt.nosophobia(strSubstring4, '.', 0, false, 6, null);
                    if (iNosophobia2 > 0) {
                        Intrinsics.competently(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring6 = strSubstring4.substring(0, iNosophobia2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring6, "substring(...)");
                        long jPolder2 = saneness.polder(jDern, graveside(Long.parseLong(strSubstring6), durationUnitMarial));
                        Intrinsics.competently(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        String strSubstring7 = strSubstring4.substring(iNosophobia2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring7, "substring(...)");
                        jDern = saneness.polder(jPolder2, polloi(Double.parseDouble(strSubstring7), durationUnitMarial));
                        if (length2 < i) {
                            throw new IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        jDern = saneness.polder(jDern, graveside(Long.parseLong(strSubstring4), durationUnitMarial));
                    }
                    durationUnit2 = durationUnitMarial;
                    z6 = true;
                    c3 = '0';
                }
            }
        }
        return z3 ? saneness.hydrovane(jDern) : jDern;
    }

    public static final long cutely(long j) {
        return saneness.impassible((j << 1) + 1);
    }

    public static final long formularize(long j) {
        return saneness.impassible(j << 1);
    }

    public static final long graveside(long j, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnit = DurationUnit.NANOSECONDS;
        long jDern = saneness.dern(4611686018426999999L, durationUnit, unit);
        return ((-jDern) > j || j > jDern) ? cutely(wireman.formularize(saneness.saneness(j, unit, DurationUnit.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : formularize(saneness.dern(j, unit, durationUnit));
    }

    public static final long impassible(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? cutely(kowloon(j)) : formularize(j);
    }

    public static final long kowloon(long j) {
        return j / ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE);
    }

    public static final long molybdenite(int i, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(DurationUnit.SECONDS) <= 0 ? formularize(saneness.dern(i, unit, DurationUnit.NANOSECONDS)) : graveside(i, unit);
    }

    public static final long monoploid(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !StringsKt.splinterproof("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i >= length) {
                    if (length - i2 <= 16) {
                        break;
                    }
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == '0') {
                    if (i2 == i) {
                        i2++;
                    }
                } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                    break;
                }
                i++;
            }
        }
        return (!dovishness.starveling(str, "+", false, 2, null) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(cord.decarock(str, 1));
    }

    public static final long polloi(double d, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dAttabal = saneness.attabal(d, unit, DurationUnit.NANOSECONDS);
        if (Double.isNaN(dAttabal)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jMarial = pastie.dern.marial(dAttabal);
        return (-4611686018426999999L > jMarial || jMarial >= 4611686018427000000L) ? apical(pastie.dern.marial(saneness.attabal(d, unit, DurationUnit.MILLISECONDS))) : formularize(jMarial);
    }

    public static final long taiyuan(long j, int i) {
        return saneness.impassible((j << 1) + ((long) i));
    }

    public static final long triweekly(long j) {
        return j * ((long) PlaybackException.CUSTOM_ERROR_CODE_BASE);
    }
}
