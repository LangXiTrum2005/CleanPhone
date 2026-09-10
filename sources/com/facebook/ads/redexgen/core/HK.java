package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.CommentFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HK {
    public static byte[] A02;
    public static final Pattern A03;
    public int A00 = -1;
    public int A01 = -1;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{64, 62, 69, 46, 51, 39, AbstractJsonLexerKt.TC_INVALID, 51, 120, 95, 51, 88, 67, 101, 38, 99, 62, 54, 69, 46, 51, 39, AbstractJsonLexerKt.TC_INVALID, 51, 120, 95, 51, 88, 67, 101, 38, 99, 55, 62, 54, 69, 46, 51, 39, AbstractJsonLexerKt.TC_INVALID, 51, 120, 95, 51, 88, 67, 101, 38, 99, 55, 40, 36, 38, 101, 42, 59, 59, 39, 46, 101, 34, 31, 62, 37, 46, 56, 86, 107, 74, 81, 108, 114, 111, 125};
    }

    static {
        A01();
        A03 = Pattern.compile(A00(0, 50, 25));
    }

    private boolean A02(String str) {
        Matcher matcher = A03.matcher(str);
        if (matcher.find()) {
            try {
                int i2 = Integer.parseInt((String) C5C.A0f(matcher.group(1)), 16);
                int i3 = Integer.parseInt((String) C5C.A0f(matcher.group(2)), 16);
                if (i2 > 0 || i3 > 0) {
                    this.A00 = i2;
                    this.A01 = i3;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean A03() {
        return (this.A00 == -1 || this.A01 == -1) ? false : true;
    }

    public final boolean A04(int i2) {
        int encoderPadding = i2 >> 12;
        int encoderDelay = i2 & 4095;
        if (encoderPadding > 0 || encoderDelay > 0) {
            this.A00 = encoderPadding;
            this.A01 = encoderDelay;
            return true;
        }
        return false;
    }

    public final boolean A05(Metadata metadata) {
        for (int i2 = 0; i2 < i; i2++) {
            Metadata.Entry entryA03 = metadata.A03(i2);
            boolean z2 = entryA03 instanceof CommentFrame;
            String strA00 = A00(66, 8, 56);
            if (z2) {
                CommentFrame commentFrame = (CommentFrame) entryA03;
                if (strA00.equals(commentFrame.A00) && A02(commentFrame.A02)) {
                    return true;
                }
            } else if (entryA03 instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryA03;
                if (A00(50, 16, 76).equals(internalFrame.A01) && strA00.equals(internalFrame.A00) && A02(internalFrame.A02)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
