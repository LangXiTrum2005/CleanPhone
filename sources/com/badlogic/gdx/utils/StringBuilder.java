package com.badlogic.gdx.utils;

import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class StringBuilder implements Appendable, CharSequence {
    static final int INITIAL_CAPACITY = 16;
    private static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public char[] chars;
    public int length;

    public StringBuilder() {
        this.chars = new char[16];
    }

    private void enlargeBuffer(int i) {
        char[] cArr = this.chars;
        int length = (cArr.length >> 1) + cArr.length + 2;
        if (i <= length) {
            i = length;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(cArr, 0, cArr2, 0, this.length);
        this.chars = cArr2;
    }

    private void move(int i, int i2) {
        char[] cArr = this.chars;
        int length = cArr.length;
        int i3 = this.length;
        if (length - i3 >= i) {
            System.arraycopy(cArr, i2, cArr, i + i2, i3 - i2);
            return;
        }
        int i4 = i3 + i;
        int length2 = (cArr.length << 1) + 2;
        if (i4 <= length2) {
            i4 = length2;
        }
        char[] cArr2 = new char[i4];
        System.arraycopy(cArr, 0, cArr2, 0, i2);
        System.arraycopy(this.chars, i2, cArr2, i + i2, this.length - i2);
        this.chars = cArr2;
    }

    public static int numChars(int i, int i2) {
        int i3 = i < 0 ? 2 : 1;
        while (true) {
            i /= i2;
            if (i == 0) {
                return i3;
            }
            i3++;
        }
    }

    public final void append0(char[] cArr) {
        int length = this.length + cArr.length;
        if (length > this.chars.length) {
            enlargeBuffer(length);
        }
        System.arraycopy(cArr, 0, this.chars, this.length, cArr.length);
        this.length = length;
    }

    public StringBuilder appendCodePoint(int i) {
        append0(Character.toChars(i));
        return this;
    }

    public StringBuilder appendLine(String str) {
        append0(str);
        append0('\n');
        return this;
    }

    public final void appendNull() {
        int i = this.length + 4;
        if (i > this.chars.length) {
            enlargeBuffer(i);
        }
        char[] cArr = this.chars;
        int i2 = this.length;
        cArr[i2] = 'n';
        cArr[i2 + 1] = 'u';
        cArr[i2 + 2] = 'l';
        this.length = i2 + 4;
        cArr[i2 + 3] = 'l';
    }

    public int capacity() {
        return this.chars.length;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        if (i < 0 || i >= this.length) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return this.chars[i];
    }

    public void clear() {
        this.length = 0;
    }

    public int codePointAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.length)) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return Character.codePointAt(this.chars, i, i2);
    }

    public int codePointBefore(int i) {
        if (i < 1 || i > this.length) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return Character.codePointBefore(this.chars, i);
    }

    public int codePointCount(int i, int i2) {
        if (i < 0 || i2 > this.length || i > i2) {
            throw new StringIndexOutOfBoundsException();
        }
        return Character.codePointCount(this.chars, i, i2 - i);
    }

    public boolean contains(String str) {
        return indexOf(str, 0) != -1;
    }

    public boolean containsIgnoreCase(String str) {
        return indexOfIgnoreCase(str, 0) != -1;
    }

    public StringBuilder delete(int i, int i2) {
        delete0(i, i2);
        return this;
    }

    public final void delete0(int i, int i2) {
        if (i >= 0) {
            int i3 = this.length;
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 == i) {
                return;
            }
            if (i2 > i) {
                int i4 = i3 - i2;
                if (i4 >= 0) {
                    char[] cArr = this.chars;
                    System.arraycopy(cArr, i2, cArr, i, i4);
                }
                this.length -= i2 - i;
                return;
            }
        }
        throw new StringIndexOutOfBoundsException();
    }

    public StringBuilder deleteCharAt(int i) {
        deleteCharAt0(i);
        return this;
    }

    public final void deleteCharAt0(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.length)) {
            throw new StringIndexOutOfBoundsException(i);
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            char[] cArr = this.chars;
            System.arraycopy(cArr, i + 1, cArr, i, i3);
        }
        this.length--;
    }

    public void ensureCapacity(int i) {
        char[] cArr = this.chars;
        if (i > cArr.length) {
            int length = (cArr.length << 1) + 2;
            if (length > i) {
                i = length;
            }
            enlargeBuffer(i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StringBuilder stringBuilder = (StringBuilder) obj;
        int i = this.length;
        if (i != stringBuilder.length) {
            return false;
        }
        char[] cArr = this.chars;
        char[] cArr2 = stringBuilder.chars;
        for (int i2 = 0; i2 < i; i2++) {
            if (cArr[i2] != cArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public boolean equalsIgnoreCase(@Null StringBuilder stringBuilder) {
        int i;
        if (this == stringBuilder) {
            return true;
        }
        if (stringBuilder == null || (i = this.length) != stringBuilder.length) {
            return false;
        }
        char[] cArr = this.chars;
        char[] cArr2 = stringBuilder.chars;
        for (int i2 = 0; i2 < i; i2++) {
            char c = cArr[i2];
            char upperCase = Character.toUpperCase(cArr2[i2]);
            if (c != upperCase && c != Character.toLowerCase(upperCase)) {
                return false;
            }
        }
        return true;
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        int i4 = this.length;
        if (i > i4 || i2 > i4 || i > i2) {
            throw new StringIndexOutOfBoundsException();
        }
        System.arraycopy(this.chars, i, cArr, i3, i2 - i);
    }

    public final char[] getValue() {
        return this.chars;
    }

    public int hashCode() {
        int i = this.length + 31;
        for (int i2 = 0; i2 < this.length; i2++) {
            i = (i * 31) + this.chars[i2];
        }
        return i;
    }

    public int indexOf(String str) {
        return indexOf(str, 0);
    }

    public int indexOfIgnoreCase(String str, int i) {
        char c;
        char upperCase;
        if (i < 0) {
            i = 0;
        }
        int length = str.length();
        if (length == 0) {
            int i2 = this.length;
            return (i < i2 || i == 0) ? i : i2;
        }
        int i3 = this.length - length;
        if (i > i3) {
            return -1;
        }
        char upperCase2 = Character.toUpperCase(str.charAt(0));
        char lowerCase = Character.toLowerCase(upperCase2);
        while (i <= i3) {
            char c2 = this.chars[i];
            if (c2 == upperCase2 || c2 == lowerCase) {
                int i4 = i;
                int i5 = 0;
                while (true) {
                    i5++;
                    if (i5 >= length || ((c = this.chars[(i4 = i4 + 1)]) != (upperCase = Character.toUpperCase(str.charAt(i5))) && c != Character.toLowerCase(upperCase))) {
                        break;
                    }
                }
                if (i5 == length) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    public StringBuilder insert(int i, boolean z) {
        insert0(i, z ? "true" : "false");
        return this;
    }

    public final void insert0(int i, char[] cArr) {
        if (i < 0 || i > this.length) {
            throw new StringIndexOutOfBoundsException(i);
        }
        if (cArr.length != 0) {
            move(cArr.length, i);
            System.arraycopy(cArr, 0, cArr, i, cArr.length);
            this.length += cArr.length;
        }
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int lastIndexOf(String str) {
        return lastIndexOf(str, this.length);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.length;
    }

    public boolean notEmpty() {
        return this.length != 0;
    }

    public int offsetByCodePoints(int i, int i2) {
        return Character.offsetByCodePoints(this.chars, 0, this.length, i, i2);
    }

    public StringBuilder replace(int i, int i2, String str) {
        replace0(i, i2, str);
        return this;
    }

    public final void replace0(int i, int i2, String str) {
        if (i >= 0) {
            int i3 = this.length;
            if (i2 > i3) {
                i2 = i3;
            }
            if (i2 > i) {
                int length = str.length();
                int i4 = (i2 - i) - length;
                if (i4 > 0) {
                    char[] cArr = this.chars;
                    System.arraycopy(cArr, i2, cArr, i + length, this.length - i2);
                } else if (i4 < 0) {
                    move(-i4, i2);
                }
                str.getChars(0, length, this.chars, i);
                this.length -= i4;
                return;
            }
            if (i == i2) {
                str.getClass();
                insert0(i, str);
                return;
            }
        }
        throw new StringIndexOutOfBoundsException();
    }

    public StringBuilder reverse() {
        reverse0();
        return this;
    }

    public final void reverse0() {
        int i;
        int i2 = this.length;
        if (i2 < 2) {
            return;
        }
        int i3 = i2 - 1;
        char[] cArr = this.chars;
        char c = cArr[0];
        char c2 = cArr[i3];
        int i4 = i2 / 2;
        int i5 = 0;
        boolean z = true;
        boolean z2 = true;
        while (i5 < i4) {
            char[] cArr2 = this.chars;
            int i6 = i5 + 1;
            char c3 = cArr2[i6];
            int i7 = i3 - 1;
            char c4 = cArr2[i7];
            boolean z3 = z && c3 >= 56320 && c3 <= 57343 && c >= 55296 && c <= 56319;
            if (z3 && this.length < 3) {
                return;
            }
            if (z3 == (z2 && c4 >= 55296 && c4 <= 56319 && c2 >= 56320 && c2 <= 57343)) {
                if (z3) {
                    cArr2[i3] = c3;
                    cArr2[i7] = c;
                    cArr2[i5] = c4;
                    cArr2[i6] = c2;
                    char c5 = cArr2[i5 + 2];
                    c2 = cArr2[i3 - 2];
                    i3--;
                    c = c5;
                    i5 = i6;
                } else {
                    cArr2[i3] = c;
                    cArr2[i5] = c2;
                    c = c3;
                    c2 = c4;
                }
                i = 1;
                z = true;
            } else {
                if (z3) {
                    cArr2[i3] = c3;
                    cArr2[i5] = c2;
                    c2 = c4;
                    i = 1;
                    z = false;
                } else {
                    cArr2[i3] = c;
                    cArr2[i5] = c4;
                    c = c3;
                    i = 1;
                    z = true;
                    z2 = false;
                }
                i5 += i;
                i3--;
            }
            z2 = true;
            i5 += i;
            i3--;
        }
        if ((this.length & 1) == 1) {
            if (z && z2) {
                return;
            }
            char[] cArr3 = this.chars;
            if (!z) {
                c2 = c;
            }
            cArr3[i3] = c2;
        }
    }

    public void setCharAt(int i, char c) {
        if (i < 0 || i >= this.length) {
            throw new StringIndexOutOfBoundsException(i);
        }
        this.chars[i] = c;
    }

    public void setLength(int i) {
        if (i < 0) {
            throw new StringIndexOutOfBoundsException(i);
        }
        char[] cArr = this.chars;
        if (i > cArr.length) {
            enlargeBuffer(i);
        } else {
            int i2 = this.length;
            if (i2 < i) {
                Arrays.fill(cArr, i2, i, (char) 0);
            }
        }
        this.length = i;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return substring(i, i2);
    }

    public String substring(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.length)) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return i == i2 ? "" : new String(this.chars, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        int i = this.length;
        return i == 0 ? "" : new String(this.chars, 0, i);
    }

    public String toStringAndClear() {
        String string = toString();
        clear();
        return string;
    }

    public void trimToSize() {
        int i = this.length;
        char[] cArr = this.chars;
        if (i < cArr.length) {
            char[] cArr2 = new char[i];
            System.arraycopy(cArr, 0, cArr2, 0, i);
            this.chars = cArr2;
        }
    }

    public static int numChars(long j, int i) {
        int i2 = j < 0 ? 2 : 1;
        while (true) {
            j /= (long) i;
            if (j == 0) {
                return i2;
            }
            i2++;
        }
    }

    public int indexOf(String str, int i) {
        if (i < 0) {
            i = 0;
        }
        int length = str.length();
        if (length == 0) {
            int i2 = this.length;
            return (i < i2 || i == 0) ? i : i2;
        }
        int i3 = this.length - length;
        if (i > i3) {
            return -1;
        }
        char cCharAt = str.charAt(0);
        while (i <= i3) {
            if (this.chars[i] == cCharAt) {
                int i4 = i;
                int i5 = 0;
                do {
                    i5++;
                    if (i5 >= length) {
                        break;
                    }
                    i4++;
                } while (this.chars[i4] == str.charAt(i5));
                if (i5 == length) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    public StringBuilder insert(int i, char c) {
        insert0(i, c);
        return this;
    }

    public int lastIndexOf(String str, int i) {
        int length = str.length();
        int i2 = this.length;
        if (length > i2 || i < 0) {
            return -1;
        }
        if (length <= 0) {
            return i < i2 ? i : i2;
        }
        if (i > i2 - length) {
            i = i2 - length;
        }
        char cCharAt = str.charAt(0);
        while (i >= 0) {
            if (this.chars[i] == cCharAt) {
                int i3 = i;
                int i4 = 0;
                do {
                    i4++;
                    if (i4 >= length) {
                        break;
                    }
                    i3++;
                } while (this.chars[i3] == str.charAt(i4));
                if (i4 == length) {
                    return i;
                }
                i--;
            } else {
                i--;
            }
        }
        return -1;
    }

    public StringBuilder replace(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        while (true) {
            int iIndexOf = indexOf(str, i);
            if (iIndexOf == -1) {
                return this;
            }
            replace0(iIndexOf, iIndexOf + length, str2);
            i = iIndexOf + length2;
        }
    }

    public StringBuilder(int i) {
        if (i >= 0) {
            this.chars = new char[i];
            return;
        }
        throw new NegativeArraySizeException();
    }

    public StringBuilder insert(int i, int i2) {
        insert0(i, Integer.toString(i2));
        return this;
    }

    public StringBuilder append(boolean z) {
        append0(z ? "true" : "false");
        return this;
    }

    public StringBuilder insert(int i, long j) {
        insert0(i, Long.toString(j));
        return this;
    }

    @Override // java.lang.Appendable
    public StringBuilder append(char c) {
        append0(c);
        return this;
    }

    public StringBuilder insert(int i, float f) {
        insert0(i, Float.toString(f));
        return this;
    }

    public StringBuilder replace(char c, String str) {
        int length = str.length();
        int i = 0;
        while (i != this.length) {
            if (this.chars[i] == c) {
                replace0(i, i + 1, str);
                i += length;
            } else {
                i++;
            }
        }
        return this;
    }

    public String substring(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.length) {
            throw new StringIndexOutOfBoundsException();
        }
        if (i == i2) {
            return "";
        }
        return new String(this.chars, i, i2 - i);
    }

    public StringBuilder(CharSequence charSequence) {
        this(charSequence.toString());
    }

    public StringBuilder append(int i) {
        return append(i, 0);
    }

    public final void append0(char[] cArr, int i, int i2) {
        if (i <= cArr.length && i >= 0) {
            if (i2 >= 0 && cArr.length - i >= i2) {
                int i3 = this.length + i2;
                if (i3 > this.chars.length) {
                    enlargeBuffer(i3);
                }
                System.arraycopy(cArr, i, this.chars, this.length, i2);
                this.length = i3;
                return;
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC3950lJ.p("Length out of bounds: ", i2));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC3950lJ.p("Offset out of bounds: ", i));
    }

    public StringBuilder insert(int i, double d) {
        insert0(i, Double.toString(d));
        return this;
    }

    public StringBuilder(StringBuilder stringBuilder) {
        int i = stringBuilder.length;
        this.length = i;
        char[] cArr = new char[i + 16];
        this.chars = cArr;
        System.arraycopy(stringBuilder.chars, 0, cArr, 0, i);
    }

    public StringBuilder append(int i, int i2) {
        return append(i, i2, '0');
    }

    public boolean equalsIgnoreCase(@Null String str) {
        int i;
        if (str == null || (i = this.length) != str.length()) {
            return false;
        }
        char[] cArr = this.chars;
        for (int i2 = 0; i2 < i; i2++) {
            char c = cArr[i2];
            char upperCase = Character.toUpperCase(str.charAt(i2));
            if (c != upperCase && c != Character.toLowerCase(upperCase)) {
                return false;
            }
        }
        return true;
    }

    public StringBuilder insert(int i, Object obj) {
        insert0(i, obj == null ? "null" : obj.toString());
        return this;
    }

    public final void insert0(int i, char[] cArr, int i2, int i3) {
        if (i >= 0 && i <= i3) {
            if (i2 < 0 || i3 < 0 || i3 > cArr.length - i2) {
                java.lang.StringBuilder sbT = AbstractC3950lJ.t("offset ", i2, ", length ", i3, ", char[].length ");
                sbT.append(cArr.length);
                throw new StringIndexOutOfBoundsException(sbT.toString());
            }
            if (i3 != 0) {
                move(i3, i);
                System.arraycopy(cArr, i2, this.chars, i, i3);
                this.length += i3;
                return;
            }
            return;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public StringBuilder append(int i, int i2, char c) {
        if (i == Integer.MIN_VALUE) {
            append0("-2147483648");
            return this;
        }
        if (i < 0) {
            append0('-');
            i = -i;
        }
        if (i2 > 1) {
            for (int iNumChars = i2 - numChars(i, 10); iNumChars > 0; iNumChars--) {
                append(c);
            }
        }
        if (i >= 10000) {
            if (i >= 1000000000) {
                append0(digits[(int) ((((long) i) % 10000000000L) / C.NANOS_PER_SECOND)]);
            }
            if (i >= 100000000) {
                append0(digits[(i % 1000000000) / 100000000]);
            }
            if (i >= 10000000) {
                append0(digits[(i % 100000000) / 10000000]);
            }
            if (i >= 1000000) {
                append0(digits[(i % 10000000) / 1000000]);
            }
            if (i >= 100000) {
                append0(digits[(i % 1000000) / DefaultOggSeeker.MATCH_BYTE_RANGE]);
            }
            append0(digits[(i % DefaultOggSeeker.MATCH_BYTE_RANGE) / 10000]);
        }
        if (i >= 1000) {
            append0(digits[(i % 10000) / 1000]);
        }
        if (i >= 100) {
            append0(digits[(i % 1000) / 100]);
        }
        if (i >= 10) {
            append0(digits[(i % 100) / 10]);
        }
        append0(digits[i % 10]);
        return this;
    }

    public StringBuilder insert(int i, String str) {
        insert0(i, str);
        return this;
    }

    public StringBuilder insert(int i, char[] cArr) {
        insert0(i, cArr);
        return this;
    }

    public StringBuilder insert(int i, char[] cArr, int i2, int i3) {
        insert0(i, cArr, i2, i3);
        return this;
    }

    public StringBuilder(String str) {
        int length = str.length();
        this.length = length;
        char[] cArr = new char[length + 16];
        this.chars = cArr;
        str.getChars(0, length, cArr, 0);
    }

    public StringBuilder insert(int i, CharSequence charSequence) {
        insert0(i, charSequence == null ? "null" : charSequence.toString());
        return this;
    }

    public StringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        insert0(i, charSequence, i2, i3);
        return this;
    }

    public final void insert0(int i, char c) {
        if (i >= 0 && i <= this.length) {
            move(1, i);
            this.chars[i] = c;
            this.length++;
            return;
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public StringBuilder append(long j) {
        return append(j, 0);
    }

    public StringBuilder append(long j, int i) {
        return append(j, i, '0');
    }

    public StringBuilder append(long j, int i, char c) {
        if (j == Long.MIN_VALUE) {
            append0("-9223372036854775808");
            return this;
        }
        if (j < 0) {
            append0('-');
            j = -j;
        }
        if (i > 1) {
            for (int iNumChars = i - numChars(j, 10); iNumChars > 0; iNumChars--) {
                append(c);
            }
        }
        if (j >= WorkRequest.MIN_BACKOFF_MILLIS) {
            if (j >= 1000000000000000000L) {
                append0(digits[(int) ((j % 1.0E19d) / 1.0E18d)]);
            }
            if (j >= 100000000000000000L) {
                append0(digits[(int) ((j % 1000000000000000000L) / 100000000000000000L)]);
            }
            if (j >= 10000000000000000L) {
                append0(digits[(int) ((j % 100000000000000000L) / 10000000000000000L)]);
            }
            if (j >= 1000000000000000L) {
                append0(digits[(int) ((j % 10000000000000000L) / 1000000000000000L)]);
            }
            if (j >= 100000000000000L) {
                append0(digits[(int) ((j % 1000000000000000L) / 100000000000000L)]);
            }
            if (j >= 10000000000000L) {
                append0(digits[(int) ((j % 100000000000000L) / 10000000000000L)]);
            }
            if (j >= 1000000000000L) {
                append0(digits[(int) ((j % 10000000000000L) / 1000000000000L)]);
            }
            if (j >= 100000000000L) {
                append0(digits[(int) ((j % 1000000000000L) / 100000000000L)]);
            }
            if (j >= 10000000000L) {
                append0(digits[(int) ((j % 100000000000L) / 10000000000L)]);
            }
            if (j >= C.NANOS_PER_SECOND) {
                append0(digits[(int) ((j % 10000000000L) / C.NANOS_PER_SECOND)]);
            }
            if (j >= 100000000) {
                append0(digits[(int) ((j % C.NANOS_PER_SECOND) / 100000000)]);
            }
            if (j >= 10000000) {
                append0(digits[(int) ((j % 100000000) / 10000000)]);
            }
            if (j >= 1000000) {
                append0(digits[(int) ((j % 10000000) / 1000000)]);
            }
            if (j >= 100000) {
                append0(digits[(int) ((j % 1000000) / 100000)]);
            }
            append0(digits[(int) ((j % 100000) / WorkRequest.MIN_BACKOFF_MILLIS)]);
        }
        if (j >= 1000) {
            append0(digits[(int) ((j % WorkRequest.MIN_BACKOFF_MILLIS) / 1000)]);
        }
        if (j >= 100) {
            append0(digits[(int) ((j % 1000) / 100)]);
        }
        if (j >= 10) {
            append0(digits[(int) ((j % 100) / 10)]);
        }
        append0(digits[(int) (j % 10)]);
        return this;
    }

    public final void insert0(int i, String str) {
        if (i >= 0 && i <= this.length) {
            if (str == null) {
                str = "null";
            }
            int length = str.length();
            if (length != 0) {
                move(length, i);
                str.getChars(0, length, this.chars, i);
                this.length += length;
                return;
            }
            return;
        }
        throw new StringIndexOutOfBoundsException(i);
    }

    public final void append0(char c) {
        int i = this.length;
        if (i == this.chars.length) {
            enlargeBuffer(i + 1);
        }
        char[] cArr = this.chars;
        int i2 = this.length;
        this.length = i2 + 1;
        cArr[i2] = c;
    }

    public final void append0(String str) {
        if (str == null) {
            appendNull();
            return;
        }
        int length = str.length();
        int i = this.length + length;
        if (i > this.chars.length) {
            enlargeBuffer(i);
        }
        str.getChars(0, length, this.chars, this.length);
        this.length = i;
    }

    public final void insert0(int i, CharSequence charSequence, int i2, int i3) {
        if (charSequence == null) {
            charSequence = "null";
        }
        if (i >= 0 && i <= this.length && i2 >= 0 && i3 >= 0 && i2 <= i3 && i3 <= charSequence.length()) {
            insert0(i, charSequence.subSequence(i2, i3).toString());
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void append0(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        if (i >= 0 && i2 >= 0 && i <= i2 && i2 <= charSequence.length()) {
            append0(charSequence.subSequence(i, i2).toString());
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public StringBuilder append(float f) {
        append0(Float.toString(f));
        return this;
    }

    public StringBuilder append(double d) {
        append0(Double.toString(d));
        return this;
    }

    public StringBuilder append(Object obj) {
        if (obj == null) {
            appendNull();
        } else {
            append0(obj.toString());
        }
        return this;
    }

    public StringBuilder append(String str) {
        append0(str);
        return this;
    }

    public StringBuilder append(String str, String str2) {
        if (this.length > 0) {
            append0(str2);
        }
        append0(str);
        return this;
    }

    public StringBuilder append(char[] cArr) {
        append0(cArr);
        return this;
    }

    public StringBuilder append(char[] cArr, int i, int i2) {
        append0(cArr, i, i2);
        return this;
    }

    @Override // java.lang.Appendable
    public StringBuilder append(CharSequence charSequence) {
        if (charSequence == null) {
            appendNull();
        } else if (charSequence instanceof StringBuilder) {
            StringBuilder stringBuilder = (StringBuilder) charSequence;
            append0(stringBuilder.chars, 0, stringBuilder.length);
        } else {
            append0(charSequence.toString());
        }
        return this;
    }

    public StringBuilder append(StringBuilder stringBuilder) {
        if (stringBuilder == null) {
            appendNull();
        } else {
            append0(stringBuilder.chars, 0, stringBuilder.length);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public StringBuilder append(CharSequence charSequence, int i, int i2) {
        append0(charSequence, i, i2);
        return this;
    }

    public StringBuilder append(StringBuilder stringBuilder, int i, int i2) {
        if (stringBuilder == null) {
            appendNull();
        } else {
            append0(stringBuilder.chars, i, i2);
        }
        return this;
    }
}
