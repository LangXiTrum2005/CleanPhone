package com.google.android.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Tx3gDecoder extends SimpleSubtitleDecoder {
    public final ParsableByteArray o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f18626p;
    public final int q;
    public final int r;
    public final String s;
    public final float t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f18627u;

    public Tx3gDecoder(List list) {
        super("Tx3gDecoder");
        this.o = new ParsableByteArray();
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.q = 0;
            this.r = -1;
            this.s = "sans-serif";
            this.f18626p = false;
            this.t = 0.85f;
            this.f18627u = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.q = bArr[24];
        this.r = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.s = "Serif".equals(new String(bArr, 43, bArr.length - 43, Charsets.f19705c)) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.f18627u = i2;
        boolean z2 = (bArr[0] & 32) != 0;
        this.f18626p = z2;
        if (z2) {
            this.t = Util.i(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i2, 0.0f, 0.95f);
        } else {
            this.t = 0.85f;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z2 = (i2 & 1) != 0;
            boolean z3 = (i2 & 2) != 0;
            if (z2) {
                if (z3) {
                    a.t(3, spannableStringBuilder, i4, i5, i7);
                } else {
                    a.t(1, spannableStringBuilder, i4, i5, i7);
                }
            } else if (z3) {
                a.t(2, spannableStringBuilder, i4, i5, i7);
            }
            boolean z4 = (i2 & 4) != 0;
            if (z4) {
                a.w(spannableStringBuilder, i4, i5, i7);
            }
            if (z4 || z2 || z3) {
                return;
            }
            a.t(0, spannableStringBuilder, i4, i5, i7);
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final Subtitle e(byte[] bArr, int i2, boolean z2) throws SubtitleDecoderException {
        String strS;
        ParsableByteArray parsableByteArray = this.o;
        parsableByteArray.D(bArr, i2);
        int i3 = 2;
        if (parsableByteArray.a() < 2) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
        int iZ = parsableByteArray.z();
        if (iZ == 0) {
            strS = "";
        } else {
            int i4 = parsableByteArray.f18957b;
            Charset charsetB = parsableByteArray.B();
            int i5 = iZ - (parsableByteArray.f18957b - i4);
            if (charsetB == null) {
                charsetB = Charsets.f19705c;
            }
            strS = parsableByteArray.s(i5, charsetB);
        }
        if (strS.isEmpty()) {
            return Tx3gSubtitle.f18628Y;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        g(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
        f(spannableStringBuilder, this.r, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        int i6 = 0;
        String str = this.s;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.t;
        while (parsableByteArray.a() >= 8) {
            int i7 = parsableByteArray.f18957b;
            int iG = parsableByteArray.g();
            int iG2 = parsableByteArray.g();
            if (iG2 == 1937013100) {
                if (parsableByteArray.a() < i3) {
                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                }
                int iZ2 = parsableByteArray.z();
                int i8 = i6;
                while (i8 < iZ2) {
                    if (parsableByteArray.a() < 12) {
                        throw new SubtitleDecoderException("Unexpected subtitle format.");
                    }
                    int iZ3 = parsableByteArray.z();
                    int iZ4 = parsableByteArray.z();
                    parsableByteArray.G(i3);
                    int iU = parsableByteArray.u();
                    parsableByteArray.G(1);
                    int iG3 = parsableByteArray.g();
                    if (iZ4 > spannableStringBuilder.length()) {
                        StringBuilder sbU = android.support.v4.media.a.u(iZ4, "Truncating styl end (", ") to cueText.length() (");
                        sbU.append(spannableStringBuilder.length());
                        sbU.append(").");
                        Log.g("Tx3gDecoder", sbU.toString());
                        iZ4 = spannableStringBuilder.length();
                    }
                    int i9 = iZ4;
                    if (iZ3 >= i9) {
                        Log.g("Tx3gDecoder", a.e(iZ3, i9, "Ignoring styl with start (", ") >= end (", ")."));
                    } else {
                        g(spannableStringBuilder, iU, this.q, iZ3, i9, 0);
                        f(spannableStringBuilder, iG3, this.r, iZ3, i9, 0);
                    }
                    i8++;
                    i3 = 2;
                }
            } else if (iG2 == 1952608120 && this.f18626p) {
                i3 = 2;
                if (parsableByteArray.a() < 2) {
                    throw new SubtitleDecoderException("Unexpected subtitle format.");
                }
                fI = Util.i(parsableByteArray.z() / this.f18627u, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            parsableByteArray.F(i7 + iG);
            i6 = 0;
        }
        Cue.Builder builder = new Cue.Builder();
        builder.f18454a = spannableStringBuilder;
        builder.f18457e = fI;
        builder.f = 0;
        builder.g = 0;
        return new Tx3gSubtitle(builder.a());
    }
}
