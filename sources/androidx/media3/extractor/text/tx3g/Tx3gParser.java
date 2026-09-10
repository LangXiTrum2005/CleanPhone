package androidx.media3.extractor.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Tx3gParser implements SubtitleParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7391a = new ParsableByteArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7393c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f7394e;
    public final float f;
    public final int g;

    public Tx3gParser(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f7393c = 0;
            this.d = -1;
            this.f7394e = "sans-serif";
            this.f7392b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f7393c = bArr[24];
        this.d = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f7394e = "Serif".equals(new String(bArr, 43, bArr.length - 43, Charsets.f19705c)) ? "serif" : "sans-serif";
        int i2 = bArr[25] * 20;
        this.g = i2;
        boolean z2 = (bArr[0] & 32) != 0;
        this.f7392b = z2;
        if (z2) {
            this.f = Util.i(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i2, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        String strS;
        int i4;
        ParsableByteArray parsableByteArray = this.f7391a;
        parsableByteArray.E(bArr, i2 + i3);
        parsableByteArray.G(i2);
        int i5 = 1;
        int i6 = 2;
        int i7 = 0;
        Assertions.b(parsableByteArray.a() >= 2);
        int iA = parsableByteArray.A();
        if (iA == 0) {
            strS = "";
        } else {
            int i8 = parsableByteArray.f5668b;
            Charset charsetC = parsableByteArray.C();
            int i9 = iA - (parsableByteArray.f5668b - i8);
            if (charsetC == null) {
                charsetC = Charsets.f19705c;
            }
            strS = parsableByteArray.s(i9, charsetC);
        }
        if (strS.isEmpty()) {
            consumer.accept(new CuesWithTiming(ImmutableList.x(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strS);
        e(spannableStringBuilder, this.f7393c, 0, 0, spannableStringBuilder.length(), 16711680);
        d(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f7394e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.f;
        while (parsableByteArray.a() >= 8) {
            int i10 = parsableByteArray.f5668b;
            int iG = parsableByteArray.g();
            int iG2 = parsableByteArray.g();
            if (iG2 == 1937013100) {
                Assertions.b(parsableByteArray.a() >= i6 ? i5 : i7);
                int iA2 = parsableByteArray.A();
                int i11 = i7;
                while (i11 < iA2) {
                    Assertions.b(parsableByteArray.a() >= 12 ? i5 : i7);
                    int iA3 = parsableByteArray.A();
                    int iA4 = parsableByteArray.A();
                    parsableByteArray.H(i6);
                    int i12 = i11;
                    int iU = parsableByteArray.u();
                    parsableByteArray.H(i5);
                    int iG3 = parsableByteArray.g();
                    if (iA4 > spannableStringBuilder.length()) {
                        StringBuilder sbU = android.support.v4.media.a.u(iA4, "Truncating styl end (", ") to cueText.length() (");
                        sbU.append(spannableStringBuilder.length());
                        sbU.append(").");
                        Log.g("Tx3gParser", sbU.toString());
                        iA4 = spannableStringBuilder.length();
                    }
                    if (iA3 >= iA4) {
                        Log.g("Tx3gParser", a.e(iA3, iA4, "Ignoring styl with start (", ") >= end (", ")."));
                    } else {
                        int i13 = iA4;
                        e(spannableStringBuilder, iU, this.f7393c, iA3, i13, 0);
                        d(spannableStringBuilder, iG3, this.d, iA3, i13, 0);
                    }
                    i11 = i12 + 1;
                    i5 = 1;
                    i6 = 2;
                    i7 = 0;
                }
                i4 = i6;
            } else if (iG2 == 1952608120 && this.f7392b) {
                i4 = 2;
                Assertions.b(parsableByteArray.a() >= 2);
                fI = Util.i(parsableByteArray.A() / this.g, 0.0f, 0.95f);
            } else {
                i4 = 2;
            }
            parsableByteArray.G(i10 + iG);
            i6 = i4;
            i5 = 1;
            i7 = 0;
        }
        Cue.Builder builder = new Cue.Builder();
        builder.f5604a = spannableStringBuilder;
        builder.f5607e = fI;
        builder.f = 0;
        builder.g = 0;
        consumer.accept(new CuesWithTiming(ImmutableList.z(builder.a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final int c() {
        return 2;
    }
}
