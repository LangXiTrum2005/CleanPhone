package ce;

import defpackage.e;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f6377a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i10, char c4) {
        return i10 < str.length() && str.charAt(i10) == c4;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f4 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TRY_LEAVE, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:39:0x00a5, B:41:0x00ab, B:46:0x00b8, B:49:0x00c3, B:60:0x00ee, B:62:0x00f4, B:88:0x01a6, B:88:0x01a6, B:70:0x0106, B:70:0x0106, B:71:0x0121, B:71:0x0121, B:72:0x0122, B:72:0x0122, B:76:0x013f, B:76:0x013f, B:78:0x014c, B:78:0x014c, B:81:0x0155, B:81:0x0155, B:83:0x0174, B:83:0x0174, B:86:0x0183, B:86:0x0183, B:87:0x01a5, B:87:0x01a5, B:75:0x012e, B:75:0x012e, B:90:0x01d7, B:90:0x01d7, B:91:0x01de, B:91:0x01de, B:53:0x00d3, B:54:0x00d6, B:48:0x00bf), top: B:102:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:74:0x012d  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:39:0x00a5, B:41:0x00ab, B:46:0x00b8, B:49:0x00c3, B:60:0x00ee, B:62:0x00f4, B:88:0x01a6, B:88:0x01a6, B:70:0x0106, B:70:0x0106, B:71:0x0121, B:71:0x0121, B:72:0x0122, B:72:0x0122, B:76:0x013f, B:76:0x013f, B:78:0x014c, B:78:0x014c, B:81:0x0155, B:81:0x0155, B:83:0x0174, B:83:0x0174, B:86:0x0183, B:86:0x0183, B:87:0x01a5, B:87:0x01a5, B:75:0x012e, B:75:0x012e, B:90:0x01d7, B:90:0x01d7, B:91:0x01de, B:91:0x01de, B:53:0x00d3, B:54:0x00d6, B:48:0x00bf), top: B:102:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d7 A[Catch: IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, TryCatch #0 {IllegalArgumentException | IndexOutOfBoundsException -> 0x004e, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:19:0x0058, B:21:0x0068, B:22:0x006a, B:24:0x0076, B:25:0x0079, B:27:0x007f, B:31:0x0089, B:36:0x0099, B:38:0x00a1, B:39:0x00a5, B:41:0x00ab, B:46:0x00b8, B:49:0x00c3, B:60:0x00ee, B:62:0x00f4, B:88:0x01a6, B:88:0x01a6, B:70:0x0106, B:70:0x0106, B:71:0x0121, B:71:0x0121, B:72:0x0122, B:72:0x0122, B:76:0x013f, B:76:0x013f, B:78:0x014c, B:78:0x014c, B:81:0x0155, B:81:0x0155, B:83:0x0174, B:83:0x0174, B:86:0x0183, B:86:0x0183, B:87:0x01a5, B:87:0x01a5, B:75:0x012e, B:75:0x012e, B:90:0x01d7, B:90:0x01d7, B:91:0x01de, B:91:0x01de, B:53:0x00d3, B:54:0x00d6, B:48:0x00bf), top: B:102:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x012e, please report this as an issue */
    public static Date b(String str, ParsePosition parsePosition) throws ParseException {
        int i10;
        int i11;
        int iC;
        int iC2;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str2;
        String id2;
        char cCharAt2;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i12 = index + 4;
            int iC3 = c(index, i12, str);
            if (a(str, i12, '-')) {
                i12 = index + 5;
            }
            int i13 = i12 + 2;
            int iC4 = c(i12, i13, str);
            if (a(str, i13, '-')) {
                i13 = i12 + 3;
            }
            int i14 = i13 + 2;
            int iC5 = c(i13, i14, str);
            boolean zA = a(str, i14, 'T');
            if (!zA && str.length() <= i14) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iC3, iC4 - 1, iC5);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i14);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i15 = i13 + 5;
                int iC6 = c(i13 + 3, i15, str);
                if (a(str, i15, ':')) {
                    i15 = i13 + 6;
                }
                int i16 = i15 + 2;
                int iC7 = c(i15, i16, str);
                if (a(str, i16, ':')) {
                    i16 = i15 + 3;
                }
                if (str.length() <= i16 || (cCharAt2 = str.charAt(i16)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i14 = i16;
                    i10 = iC6;
                    i11 = iC7;
                } else {
                    int i17 = i16 + 2;
                    iC2 = c(i16, i17, str);
                    if (iC2 > 59 && iC2 < 63) {
                        iC2 = 59;
                    }
                    if (a(str, i17, '.')) {
                        int i18 = i16 + 3;
                        int i19 = i16 + 4;
                        while (true) {
                            if (i19 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(i19);
                            if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                                i19++;
                            }
                            length2 = i19;
                            break;
                        }
                        int iMin = Math.min(length2, i16 + 6);
                        iC = c(i18, iMin, str);
                        int i20 = iMin - i18;
                        if (i20 == 1) {
                            iC *= 100;
                        } else if (i20 == 2) {
                            iC *= 10;
                        }
                        i10 = iC6;
                        i14 = length2;
                        i11 = iC7;
                    } else {
                        i10 = iC6;
                        i14 = i17;
                        i11 = iC7;
                        iC = 0;
                    }
                }
                if (str.length() > i14) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i14);
                timeZone = f6377a;
                if (cCharAt == 'Z') {
                    length = i14 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i14);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i14 + strSubstring.length();
                    if (!strSubstring.equals("+0000") && !strSubstring.equals("+00:00")) {
                        str2 = "GMT" + strSubstring;
                        timeZone = TimeZone.getTimeZone(str2);
                        id2 = timeZone.getID();
                        if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iC3);
                gregorianCalendar2.set(2, iC4 - 1);
                gregorianCalendar2.set(5, iC5);
                gregorianCalendar2.set(11, i10);
                gregorianCalendar2.set(12, i11);
                gregorianCalendar2.set(13, iC2);
                gregorianCalendar2.set(14, iC);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i10 = 0;
            i11 = 0;
            iC = 0;
            iC2 = 0;
            if (str.length() > i14) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i14);
            timeZone = f6377a;
            if (cCharAt == 'Z') {
                length = i14 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i14);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i14 + strSubstring.length();
                if (!strSubstring.equals("+0000")) {
                    str2 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str2);
                    id2 = timeZone.getID();
                    if (!id2.equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iC3);
            gregorianCalendar3.set(2, iC4 - 1);
            gregorianCalendar3.set(5, iC5);
            gregorianCalendar3.set(11, i10);
            gregorianCalendar3.set(12, i11);
            gregorianCalendar3.set(13, iC2);
            gregorianCalendar3.set(14, iC);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e10) {
            String strF = str == null ? null : e.f('\"', "\"", str);
            String message = e10.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e10.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(d.g("Failed to parse date [", strF, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e10);
            throw parseException;
        }
    }

    public static int c(int i10, int i11, String str) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }
}
