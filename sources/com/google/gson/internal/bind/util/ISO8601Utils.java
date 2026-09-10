package com.google.gson.internal.bind.util;

import androidx.media3.extractor.text.ttml.a;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class ISO8601Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f21311a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa A[Catch: IllegalArgumentException -> 0x00da, NumberFormatException -> 0x00dd, IndexOutOfBoundsException -> 0x00e0, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00da, IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:37:0x00a2, B:39:0x00a8, B:44:0x00b5, B:47:0x00c0, B:64:0x00f4, B:66:0x00fa, B:92:0x01ac, B:74:0x010c, B:75:0x0127, B:76:0x0128, B:80:0x0145, B:82:0x0152, B:85:0x015b, B:87:0x017a, B:90:0x0189, B:91:0x01ab, B:79:0x0134, B:94:0x01dd, B:95:0x01e4, B:51:0x00d0, B:52:0x00d3, B:46:0x00bc), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0102  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:79:0x0134 A[Catch: IllegalArgumentException -> 0x00da, NumberFormatException -> 0x00dd, IndexOutOfBoundsException -> 0x00e0, TryCatch #2 {IllegalArgumentException -> 0x00da, IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:37:0x00a2, B:39:0x00a8, B:44:0x00b5, B:47:0x00c0, B:64:0x00f4, B:66:0x00fa, B:92:0x01ac, B:74:0x010c, B:75:0x0127, B:76:0x0128, B:80:0x0145, B:82:0x0152, B:85:0x015b, B:87:0x017a, B:90:0x0189, B:91:0x01ab, B:79:0x0134, B:94:0x01dd, B:95:0x01e4, B:51:0x00d0, B:52:0x00d3, B:46:0x00bc), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01dd A[Catch: IllegalArgumentException -> 0x00da, NumberFormatException -> 0x00dd, IndexOutOfBoundsException -> 0x00e0, TryCatch #2 {IllegalArgumentException -> 0x00da, IndexOutOfBoundsException -> 0x00e0, NumberFormatException -> 0x00dd, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:17:0x0055, B:19:0x0065, B:20:0x0067, B:22:0x0073, B:23:0x0076, B:25:0x007c, B:29:0x0086, B:34:0x0096, B:36:0x009e, B:37:0x00a2, B:39:0x00a8, B:44:0x00b5, B:47:0x00c0, B:64:0x00f4, B:66:0x00fa, B:92:0x01ac, B:74:0x010c, B:75:0x0127, B:76:0x0128, B:80:0x0145, B:82:0x0152, B:85:0x015b, B:87:0x017a, B:90:0x0189, B:91:0x01ab, B:79:0x0134, B:94:0x01dd, B:95:0x01e4, B:51:0x00d0, B:52:0x00d3, B:46:0x00bc), top: B:106:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e9  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01fd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0134, please report this as an issue */
    public static Date b(String str, ParsePosition parsePosition) throws ParseException {
        String strI;
        String message;
        int i2;
        int i3;
        int iC;
        int iC2;
        char cCharAt;
        TimeZone timeZone;
        String strSubstring;
        int length;
        String str2;
        String id;
        char cCharAt2;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i4 = index + 4;
            int iC3 = c(index, i4, str);
            if (a(str, i4, '-')) {
                i4 = index + 5;
            }
            int i5 = i4 + 2;
            int iC4 = c(i4, i5, str);
            if (a(str, i5, '-')) {
                i5 = i4 + 3;
            }
            int i6 = i5 + 2;
            int iC5 = c(i5, i6, str);
            boolean zA = a(str, i6, 'T');
            if (!zA && str.length() <= i6) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iC3, iC4 - 1, iC5);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i6);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i7 = i5 + 5;
                int iC6 = c(i5 + 3, i7, str);
                if (a(str, i7, AbstractJsonLexerKt.COLON)) {
                    i7 = i5 + 6;
                }
                int i8 = i7 + 2;
                int iC7 = c(i7, i8, str);
                if (a(str, i8, AbstractJsonLexerKt.COLON)) {
                    i8 = i7 + 3;
                }
                if (str.length() <= i8 || (cCharAt2 = str.charAt(i8)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i6 = i8;
                    i2 = iC6;
                    i3 = iC7;
                } else {
                    int i9 = i8 + 2;
                    iC2 = c(i8, i9, str);
                    if (iC2 > 59 && iC2 < 63) {
                        iC2 = 59;
                    }
                    if (a(str, i9, '.')) {
                        int i10 = i8 + 3;
                        int i11 = i8 + 4;
                        while (true) {
                            if (i11 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(i11);
                            if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                                i11++;
                            }
                            length2 = i11;
                            break;
                        }
                        int iMin = Math.min(length2, i8 + 6);
                        iC = c(i10, iMin, str);
                        int i12 = iMin - i10;
                        if (i12 == 1) {
                            iC *= 100;
                        } else if (i12 == 2) {
                            iC *= 10;
                        }
                        i2 = iC6;
                        i6 = length2;
                        i3 = iC7;
                    } else {
                        i2 = iC6;
                        i6 = i9;
                        i3 = iC7;
                        iC = 0;
                    }
                }
                if (str.length() > i6) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i6);
                timeZone = f21311a;
                if (cCharAt == 'Z') {
                    length = i6 + 1;
                } else {
                    if (cCharAt == '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i6);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i6 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                        str2 = "GMT" + strSubstring;
                        timeZone = DesugarTimeZone.getTimeZone(str2);
                        id = timeZone.getID();
                        if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iC3);
                gregorianCalendar2.set(2, iC4 - 1);
                gregorianCalendar2.set(5, iC5);
                gregorianCalendar2.set(11, i2);
                gregorianCalendar2.set(12, i3);
                gregorianCalendar2.set(13, iC2);
                gregorianCalendar2.set(14, iC);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i2 = 0;
            i3 = 0;
            iC = 0;
            iC2 = 0;
            if (str.length() > i6) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i6);
            timeZone = f21311a;
            if (cCharAt == 'Z') {
                length = i6 + 1;
            } else {
                if (cCharAt == '+') {
                }
                strSubstring = str.substring(i6);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i6 + strSubstring.length();
                if (!"+0000".equals(strSubstring)) {
                    str2 = "GMT" + strSubstring;
                    timeZone = DesugarTimeZone.getTimeZone(str2);
                    id = timeZone.getID();
                    if (!id.equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iC3);
            gregorianCalendar3.set(2, iC4 - 1);
            gregorianCalendar3.set(5, iC5);
            gregorianCalendar3.set(11, i2);
            gregorianCalendar3.set(12, i3);
            gregorianCalendar3.set(13, iC2);
            gregorianCalendar3.set(14, iC);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e2) {
            e = e2;
            if (str == null) {
                strI = null;
            } else {
                strI = a.i(AbstractJsonLexerKt.STRING, "\"", str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(android.support.v4.media.a.o("Failed to parse date [", strI, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            if (str == null) {
                strI = null;
            } else {
                strI = a.i(AbstractJsonLexerKt.STRING, "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(android.support.v4.media.a.o("Failed to parse date [", strI, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e4) {
            e = e4;
            if (str == null) {
                strI = null;
            } else {
                strI = a.i(AbstractJsonLexerKt.STRING, "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException(android.support.v4.media.a.o("Failed to parse date [", strI, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    public static int c(int i2, int i3, String str) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i4 = -iDigit;
        } else {
            i4 = 0;
            i5 = i2;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int iDigit2 = Character.digit(str.charAt(i5), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i2, i3));
            }
            i4 = (i4 * 10) - iDigit2;
            i5 = i6;
        }
        return -i4;
    }
}
