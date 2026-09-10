package com.facebook.ads.redexgen.core;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1145Wy {
    public static String[] A08 = {"ZlBfYAKNGoaEoOfXvHwMWEEt86OhxI6B", "LUt7xf4ry7QMbgRq", "3UMO73rfFvDVUTBA3PzWSO", "RukvTyNKzj8npqFzjDhdMWvuokdbQYJ5", "WpVtknp2YD2cnCa6Giy0t1YOkqbih8Aj", "qv428Rpw3Cwz", "c5BlJ3WOj1u8KduDqMtpOA1oyL0HcZ67", "QVjctD50nJf8yNgx9rZn2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C1144Wx> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    public C1145Wy(int i, int i2) {
        A0C(i);
        this.A01 = i2;
    }

    private SpannableString A04() {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int length = spannableStringBuilder.length();
        int i2 = -1;
        int nextColor = -1;
        int i3 = 0;
        int color = -1;
        boolean z = false;
        int colorStartPosition = -1;
        for (int italicStartPosition = 0; italicStartPosition < this.A06.size(); italicStartPosition++) {
            C1144Wx c1144Wx = this.A06.get(italicStartPosition);
            boolean z2 = c1144Wx.A02;
            int length2 = c1144Wx.A01;
            if (length2 != 8) {
                z = length2 == 7;
                if (length2 != 7) {
                    colorStartPosition = C1C.A0Q[length2];
                }
            }
            int underlineStartPosition = c1144Wx.A00;
            if (italicStartPosition + 1 < this.A06.size()) {
                i = this.A06.get(italicStartPosition + 1).A00;
            } else {
                i = length;
            }
            if (underlineStartPosition != i) {
                if (i2 != -1 && !z2) {
                    A06(spannableStringBuilder, i2, underlineStartPosition);
                    i2 = -1;
                } else if (i2 == -1 && z2) {
                    i2 = underlineStartPosition;
                }
                String[] strArr = A08;
                if (strArr[0].charAt(9) == strArr[3].charAt(9)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "kePNqBKHXCizwUbHoA5sKxa5GvuFfgvO";
                strArr2[3] = "Y8jZiBwK43L2ugJcc0epidRtXTdO8YAX";
                if (nextColor != -1 && !z) {
                    A05(spannableStringBuilder, nextColor, underlineStartPosition);
                    nextColor = -1;
                } else {
                    String[] strArr3 = A08;
                    if (strArr3[0].charAt(9) == strArr3[3].charAt(9)) {
                        throw new RuntimeException();
                    }
                    A08[7] = "o96AaNGdtXn3nHhJHBOhn";
                    if (nextColor == -1 && z) {
                        nextColor = underlineStartPosition;
                    }
                }
                if (colorStartPosition != color) {
                    A07(spannableStringBuilder, i3, underlineStartPosition, color);
                    color = colorStartPosition;
                    i3 = underlineStartPosition;
                }
            }
        }
        if (i2 != -1 && i2 != length) {
            A06(spannableStringBuilder, i2, length);
        }
        if (nextColor != -1 && nextColor != length) {
            A05(spannableStringBuilder, nextColor, length);
        }
        if (i3 != length) {
            A07(spannableStringBuilder, i3, length, color);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
    }

    public static void A07(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        if (i3 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    public final C0982Qh A08(int i) {
        int startPadding;
        float f;
        int endPadding;
        int endPadding2 = this.A02 + this.A04;
        int i2 = 32 - endPadding2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int maxTextLength = 0; maxTextLength < startPadding; maxTextLength++) {
            spannableStringBuilder.append(AbstractC1600gE.A0e(this.A07.get(maxTextLength), i2));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append(AbstractC1600gE.A0e(A04(), i2));
        int startPadding2 = spannableStringBuilder.length();
        if (startPadding2 == 0) {
            return null;
        }
        int startPadding3 = spannableStringBuilder.length();
        int i3 = (32 - endPadding2) - startPadding3;
        int startEndPaddingDelta = endPadding2 - i3;
        if (i == Integer.MIN_VALUE) {
            int startPadding4 = this.A00;
            if (startPadding4 == 2) {
                int maxTextLength2 = Math.abs(startEndPaddingDelta);
                if (maxTextLength2 < 3 || i3 < 0) {
                    i = 1;
                } else {
                    startPadding = this.A00;
                    if (startPadding != 2 && startEndPaddingDelta > 0) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                }
            } else {
                startPadding = this.A00;
                if (startPadding != 2) {
                    i = 0;
                } else {
                    i = 0;
                }
            }
        }
        int maxTextLength3 = A08[6].charAt(5);
        if (maxTextLength3 != 51) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[1] = "bCfDQ2BXm1bSS7qt";
        strArr[5] = "f4rSn2t6WRYt";
        switch (i) {
            case 1:
                f = 0.5f;
                break;
            case 2:
                int startPadding5 = 32 - i3;
                f = (0.8f * (startPadding5 / 32.0f)) + 0.1f;
                break;
            default:
                f = (0.8f * (endPadding2 / 32.0f)) + 0.1f;
                break;
        }
        int maxTextLength4 = this.A03;
        if (maxTextLength4 > 7) {
            int startPadding6 = this.A03;
            endPadding = (startPadding6 - 15) - 2;
        } else {
            int startPadding7 = this.A00;
            if (startPadding7 == 1) {
                int endPadding3 = this.A03;
                String[] strArr2 = A08;
                String str = strArr2[4];
                String str2 = strArr2[2];
                int maxTextLength5 = str.length();
                int startPadding8 = str2.length();
                if (maxTextLength5 != startPadding8) {
                    String[] strArr3 = A08;
                    strArr3[0] = "NOu7OMIYasFEiXq0c9PDzTnJMjbbQOpM";
                    strArr3[3] = "S1R3y1ay0PpamxWbE9k9f51b82qIy5AF";
                    int startPadding9 = this.A01;
                    endPadding = endPadding3 - (startPadding9 - 1);
                } else {
                    String[] strArr4 = A08;
                    strArr4[0] = "sQ1jswtsSUT50xAdgNWFMy5qR6Kx5385";
                    strArr4[3] = "t4357pzjOVQ5Aw1zLzQ6EpfiUT5gzDP4";
                    int startPadding10 = this.A01;
                    endPadding = endPadding3 - (startPadding10 - 1);
                }
            } else {
                endPadding = this.A03;
            }
        }
        return new C1374cY().A0G(spannableStringBuilder).A0F(Layout.Alignment.ALIGN_NORMAL).A07(endPadding, 1).A04(f).A0A(i).A0H();
    }

    public final void A09() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i = length3 - 1; i >= 0; i--) {
                C1144Wx c1144Wx = this.A06.get(i);
                int length4 = c1144Wx.A00;
                if (length4 == length) {
                    int length5 = c1144Wx.A00;
                    c1144Wx.A00 = length5 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void A0A() {
        this.A07.add(A04());
        this.A05.setLength(0);
        this.A06.clear();
        int iMin = Math.min(this.A01, this.A03);
        while (numRows >= iMin) {
            List<SpannableString> list = this.A07;
            String[] strArr = A08;
            String str = strArr[0];
            String str2 = strArr[3];
            int iCharAt = str.charAt(9);
            int numRows = str2.charAt(9);
            if (iCharAt == numRows) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[1] = "RGosVt0uGPjOGt4u";
            strArr2[5] = "bwvEW4AK2khj";
            list.remove(0);
        }
    }

    public final void A0B(char c) {
        if (this.A05.length() < 32) {
            this.A05.append(c);
        }
    }

    public final void A0C(int i) {
        this.A00 = i;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0D(int i) {
        this.A00 = i;
    }

    public final void A0E(int i) {
        this.A01 = i;
    }

    public final void A0F(int i, boolean z) {
        this.A06.add(new C1144Wx(i, z, this.A05.length()));
    }

    public final boolean A0G() {
        return this.A06.isEmpty() && this.A07.isEmpty() && this.A05.length() == 0;
    }
}
