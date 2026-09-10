package j$.time.format;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class k implements InterfaceC3555f {
    static final String[] d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final k f43100e = new k("+HH:MM:ss", "Z");
    static final k f = new k("+HH:MM:ss", "0");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43103c;

    k(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        int i2 = 0;
        while (true) {
            String[] strArr = d;
            if (i2 < 22) {
                if (strArr[i2].equals(str)) {
                    this.f43102b = i2;
                    this.f43103c = i2 % 11;
                    this.f43101a = str2;
                    return;
                }
                i2++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.InterfaceC3555f
    public final boolean p(z zVar, StringBuilder sb) {
        Long lE = zVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z2 = false;
        if (lE == null) {
            return false;
        }
        int intExact = Math.toIntExact(lE.longValue());
        String str = this.f43101a;
        if (intExact == 0) {
            sb.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / com.smartdigimkt.o1.b.l2) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb.length();
        sb.append(intExact < 0 ? TokenBuilder.TOKEN_DELIMITER : "+");
        if (this.f43102b < 11 || iAbs >= 10) {
            a(false, iAbs, sb);
        } else {
            sb.append((char) (iAbs + 48));
        }
        int i2 = this.f43103c;
        if ((i2 >= 3 && i2 <= 8) || ((i2 >= 9 && iAbs3 > 0) || (i2 >= 1 && iAbs2 > 0))) {
            a(i2 > 0 && i2 % 2 == 0, iAbs2, sb);
            iAbs += iAbs2;
            if (i2 == 7 || i2 == 8 || (i2 >= 5 && iAbs3 > 0)) {
                if (i2 > 0 && i2 % 2 == 0) {
                    z2 = true;
                }
                a(z2, iAbs3, sb);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    private static void a(boolean z2, int i2, StringBuilder sb) {
        sb.append(z2 ? ":" : "");
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
    }

    @Override // j$.time.format.InterfaceC3555f
    public final int r(w wVar, CharSequence charSequence, int i2) {
        CharSequence charSequence2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length = charSequence.length();
        int length2 = this.f43101a.length();
        if (length2 == 0) {
            if (i2 == length) {
                return wVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i2);
            }
            charSequence2 = charSequence;
        } else {
            if (i2 == length) {
                return ~i2;
            }
            charSequence2 = charSequence;
            if (wVar.s(charSequence2, i2, this.f43101a, 0, length2)) {
                return wVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i2 + length2);
            }
        }
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt == '+' || cCharAt == '-') {
            int i7 = cCharAt == '-' ? -1 : 1;
            int i8 = this.f43103c;
            boolean z2 = i8 > 0 && i8 % 2 == 0;
            int i9 = this.f43102b;
            boolean z3 = i9 < 11;
            int[] iArr = new int[4];
            iArr[0] = i2 + 1;
            if (!wVar.l()) {
                if (z3) {
                    if (z2 || (i9 == 0 && length > (i6 = i2 + 3) && charSequence2.charAt(i6) == ':')) {
                        i9 = 10;
                        z2 = true;
                    } else {
                        i9 = 9;
                    }
                } else if (z2 || (i9 == 11 && length > (i5 = i2 + 3) && (charSequence2.charAt(i2 + 2) == ':' || charSequence2.charAt(i5) == ':'))) {
                    i9 = 21;
                    z2 = true;
                } else {
                    i9 = 20;
                }
            }
            switch (i9) {
                case 0:
                case 11:
                    c(charSequence2, z3, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence2, z3, iArr);
                    d(charSequence2, z2, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence2, z3, iArr);
                    d(charSequence2, z2, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence2, z3, iArr);
                    d(charSequence2, z2, true, iArr);
                    b(charSequence2, z2, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence2, z3, iArr);
                    d(charSequence2, z2, true, iArr);
                    if (!b(charSequence2, z2, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence2, z3, iArr);
                    if (b(charSequence2, z2, 2, iArr)) {
                        b(charSequence2, z2, 3, iArr);
                    }
                    break;
                case 12:
                    e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i10 = iArr[0];
            if (i10 > 0) {
                int i11 = iArr[1];
                if (i11 > 23 || (i3 = iArr[2]) > 59 || (i4 = iArr[3]) > 59) {
                    throw new j$.time.c("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return wVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i3) * 60) + (((long) i11) * com.smartdigimkt.o1.b.f37307P) + ((long) i4)) * ((long) i7), i2, i10);
            }
        }
        return length2 == 0 ? wVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i2) : ~i2;
    }

    private static void c(CharSequence charSequence, boolean z2, int[] iArr) {
        if (z2) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    private static void d(CharSequence charSequence, boolean z2, boolean z3, int[] iArr) {
        if (b(charSequence, z2, 2, iArr) || !z3) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    private static boolean b(CharSequence charSequence, boolean z2, int i2, int[] iArr) {
        int i3;
        char cCharAt;
        char cCharAt2;
        int i4;
        int i5 = iArr[0];
        if (i5 < 0) {
            return true;
        }
        if (z2 && i2 != 1) {
            int i6 = i5 + 1;
            if (i6 <= charSequence.length() && charSequence.charAt(i5) == ':') {
                i5 = i6;
                i3 = i5 + 2;
                if (i3 <= charSequence.length()) {
                    int i7 = i5 + 1;
                    cCharAt = charSequence.charAt(i5);
                    cCharAt2 = charSequence.charAt(i7);
                    if (cCharAt >= '0') {
                        i4 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                        if (i4 >= 0) {
                            iArr[i2] = i4;
                            iArr[0] = i3;
                            return true;
                        }
                    }
                }
            }
        } else {
            i3 = i5 + 2;
            if (i3 <= charSequence.length()) {
                int i8 = i5 + 1;
                cCharAt = charSequence.charAt(i5);
                cCharAt2 = charSequence.charAt(i8);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    i4 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (i4 >= 0 && i4 <= 59) {
                        iArr[i2] = i4;
                        iArr[0] = i3;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static void e(CharSequence charSequence, int i2, int i3, int[] iArr) {
        int i4;
        char cCharAt;
        int i5 = iArr[0];
        char[] cArr = new char[i3];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3 && (i4 = i5 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i5)) >= '0' && cCharAt <= '9') {
            cArr[i6] = cCharAt;
            i7++;
            i6++;
            i5 = i4;
        }
        if (i7 < i2) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i7) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i5;
    }

    public final String toString() {
        String strReplace = this.f43101a.replace("'", "''");
        return "Offset(" + d[this.f43102b] + ",'" + strReplace + "')";
    }
}
