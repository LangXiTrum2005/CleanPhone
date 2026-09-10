package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbdq {
    public static int zza(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return MurmurHash3.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100 A[DONT_INVERT] */
    public static String[] zzb(String str, boolean z2) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int i2 = 0;
        boolean z3 = false;
        int i3 = 0;
        while (i2 < str.length()) {
            int iCodePointAt = Character.codePointAt(charArray, i2);
            int iCharCount = Character.charCount(iCodePointAt);
            if (Character.isLetter(iCodePointAt)) {
                Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iCodePointAt);
                if (unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO) || unicodeBlockOf.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || unicodeBlockOf.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || unicodeBlockOf.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_JAMO) || unicodeBlockOf.equals(Character.UnicodeBlock.HANGUL_SYLLABLES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIRAGANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA) || unicodeBlockOf.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS) || ((iCodePointAt >= 65382 && iCodePointAt <= 65437) || (iCodePointAt >= 65441 && iCodePointAt <= 65500))) {
                    if (z3) {
                        arrayList.add(new String(charArray, i3, i2 - i3));
                    }
                    arrayList.add(new String(charArray, i2, iCharCount));
                } else {
                    if (!Character.isLetterOrDigit(iCodePointAt) || Character.getType(iCodePointAt) == 6 || Character.getType(iCodePointAt) == 8) {
                        if (true != z3) {
                            i3 = i2;
                        }
                    } else if (z2 && Character.charCount(iCodePointAt) == 1 && Character.toChars(iCodePointAt)[0] == '\'') {
                        if (true != z3) {
                            i3 = i2;
                        }
                    } else if (z3) {
                        arrayList.add(new String(charArray, i3, i2 - i3));
                    }
                    z3 = true;
                }
                z3 = false;
            } else {
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    if (true != z3) {
                        i3 = i2;
                    }
                } else if (true != z3) {
                    i3 = i2;
                }
                z3 = true;
            }
            i2 += iCharCount;
        }
        if (z3) {
            arrayList.add(new String(charArray, i3, i2 - i3));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
