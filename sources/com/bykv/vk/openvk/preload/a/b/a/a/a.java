package com.bykv.vk.openvk.preload.a.b.a.a;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f229a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Code duplicated, block: B:85:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ca  */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x01ca, please report this as an issue */
    public static Date a(String str, ParsePosition parsePosition) throws ParseException {
        String strR;
        String message;
        int i;
        int i2;
        int i3;
        int iA;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i4 = index + 4;
            int iA2 = a(str, index, i4);
            if (a(str, i4, '-')) {
                i4 = index + 5;
            }
            int i5 = i4 + 2;
            int iA3 = a(str, i4, i5);
            if (a(str, i5, '-')) {
                i5 = i4 + 3;
            }
            int i6 = i5 + 2;
            int iA4 = a(str, i5, i6);
            boolean zA = a(str, i6, 'T');
            if (!zA && str.length() <= i6) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iA2, iA3 - 1, iA4);
                parsePosition.setIndex(i6);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i7 = i5 + 5;
                int iA5 = a(str, i5 + 3, i7);
                if (a(str, i7, ':')) {
                    i7 = i5 + 6;
                }
                int i8 = i7 + 2;
                int iA6 = a(str, i7, i8);
                if (a(str, i8, ':')) {
                    i8 = i7 + 3;
                }
                if (str.length() <= i8 || (cCharAt = str.charAt(i8)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i2 = iA6;
                    i3 = 0;
                    iA = 0;
                    i6 = i8;
                    i = iA5;
                } else {
                    int i9 = i8 + 2;
                    iA = a(str, i8, i9);
                    if (iA > 59 && iA < 63) {
                        iA = 59;
                    }
                    if (a(str, i9, '.')) {
                        int i10 = i8 + 3;
                        int iA7 = a(str, i8 + 4);
                        int iMin = Math.min(iA7, i8 + 6);
                        int iA8 = a(str, i10, iMin);
                        int i11 = iMin - i10;
                        if (i11 == 1) {
                            iA8 *= 100;
                        } else if (i11 == 2) {
                            iA8 *= 10;
                        }
                        i = iA5;
                        i6 = iA7;
                        i2 = iA6;
                        i3 = iA8;
                    } else {
                        i = iA5;
                        i6 = i9;
                        i2 = iA6;
                        i3 = 0;
                    }
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                iA = 0;
            }
            if (str.length() <= i6) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 == 'Z') {
                timeZone = f229a;
                length = i6 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i6);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring.concat("00");
                }
                length = i6 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = f229a;
                } else {
                    String strConcat = "GMT".concat(strSubstring);
                    TimeZone timeZone2 = TimeZone.getTimeZone(strConcat);
                    String id = timeZone2.getID();
                    if (!id.equals(strConcat) && !id.replace(":", "").equals(strConcat)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iA2);
            gregorianCalendar2.set(2, iA3 - 1);
            gregorianCalendar2.set(5, iA4);
            gregorianCalendar2.set(11, i);
            gregorianCalendar2.set(12, i2);
            gregorianCalendar2.set(13, iA);
            gregorianCalendar2.set(14, i3);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException e) {
            e = e;
            if (str == null) {
                strR = null;
            } else {
                strR = AbstractC3950lJ.r("\"", str, '\"');
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(AbstractC5044xl.m("Failed to parse date [", strR, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e2) {
            e = e2;
            if (str == null) {
                strR = null;
            } else {
                strR = AbstractC3950lJ.r("\"", str, '\"');
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(AbstractC5044xl.m("Failed to parse date [", strR, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e3) {
            e = e3;
            if (str == null) {
                strR = null;
            } else {
                strR = AbstractC3950lJ.r("\"", str, '\"');
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException(AbstractC5044xl.m("Failed to parse date [", strR, "]: ", message), parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    private static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int a(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
