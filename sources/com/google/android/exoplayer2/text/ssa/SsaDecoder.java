package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.datastore.preferences.protobuf.a;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {
    public static final Pattern t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SsaDialogueFormat f18567p;
    public LinkedHashMap q;
    public float r;
    public float s;

    public SsaDecoder(List list) {
        super("SsaDecoder");
        this.r = -3.4028235E38f;
        this.s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.o = false;
            this.f18567p = null;
            return;
        }
        this.o = true;
        byte[] bArr = (byte[]) list.get(0);
        int i2 = Util.f18979a;
        Charset charset = Charsets.f19705c;
        String str = new String(bArr, charset);
        Assertions.b(str.startsWith("Format:"));
        SsaDialogueFormat ssaDialogueFormatA = SsaDialogueFormat.a(str);
        ssaDialogueFormatA.getClass();
        this.f18567p = ssaDialogueFormatA;
        g(new ParsableByteArray((byte[]) list.get(1)), charset);
    }

    public static int f(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i2 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i2 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i2, Long.valueOf(j));
        arrayList2.add(i2, i2 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i2 - 1)));
        return i2;
    }

    public static long h(String str) {
        Matcher matcher = t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i2 = Util.f18979a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final Subtitle e(byte[] bArr, int i2, boolean z2) {
        ParsableByteArray parsableByteArray;
        Layout.Alignment alignment;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        Integer num;
        int iA;
        int i8;
        SsaDecoder ssaDecoder = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(bArr, i2);
        Charset charsetB = parsableByteArray2.B();
        if (charsetB == null) {
            charsetB = Charsets.f19705c;
        }
        boolean z3 = ssaDecoder.o;
        if (!z3) {
            ssaDecoder.g(parsableByteArray2, charsetB);
        }
        SsaDialogueFormat ssaDialogueFormatA = z3 ? ssaDecoder.f18567p : null;
        while (true) {
            String strH = parsableByteArray2.h(charsetB);
            if (strH == null) {
                return new SsaSubtitle(arrayList, arrayList2);
            }
            if (strH.startsWith("Format:")) {
                ssaDialogueFormatA = SsaDialogueFormat.a(strH);
            } else {
                if (strH.startsWith("Dialogue:")) {
                    if (ssaDialogueFormatA == null) {
                        Log.g("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strH));
                    } else {
                        Assertions.b(strH.startsWith("Dialogue:"));
                        String strSubstring = strH.substring(9);
                        int i9 = ssaDialogueFormatA.f18571e;
                        String[] strArrSplit = strSubstring.split(",", i9);
                        if (strArrSplit.length != i9) {
                            Log.g("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strH));
                        } else {
                            if (h(strArrSplit[ssaDialogueFormatA.f18568a]) == -9223372036854775807L) {
                                Log.g("SsaDecoder", "Skipping invalid timing: ".concat(strH));
                            } else {
                                long jH = h(strArrSplit[ssaDialogueFormatA.f18569b]);
                                if (jH == -9223372036854775807L) {
                                    Log.g("SsaDecoder", "Skipping invalid timing: ".concat(strH));
                                } else {
                                    LinkedHashMap linkedHashMap = ssaDecoder.q;
                                    SsaStyle ssaStyle = (linkedHashMap == null || (i8 = ssaDialogueFormatA.f18570c) == -1) ? null : (SsaStyle) linkedHashMap.get(strArrSplit[i8].trim());
                                    String str = strArrSplit[ssaDialogueFormatA.d];
                                    Matcher matcher = SsaStyle.Overrides.f18584a.matcher(str);
                                    int i10 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        ParsableByteArray parsableByteArray3 = parsableByteArray2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = SsaStyle.Overrides.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = SsaStyle.Overrides.d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = SsaStyle.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i10 = iA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        parsableByteArray2 = parsableByteArray3;
                                    }
                                    parsableByteArray = parsableByteArray2;
                                    String strReplace = SsaStyle.Overrides.f18584a.matcher(str).replaceAll("").replace("\\N", IOUtils.LINE_SEPARATOR_UNIX).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX).replace("\\h", " ");
                                    float f2 = ssaDecoder.r;
                                    float f3 = ssaDecoder.s;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    Cue.Builder builder = new Cue.Builder();
                                    builder.f18454a = spannableString;
                                    if (ssaStyle != null) {
                                        Integer num2 = ssaStyle.f18574c;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (ssaStyle.j == 3 && (num = ssaStyle.d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f4 = ssaStyle.f18575e;
                                        if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                            builder.k = f4 / f3;
                                            builder.j = 1;
                                        }
                                        boolean z4 = ssaStyle.g;
                                        boolean z5 = ssaStyle.f;
                                        if (z5 && z4) {
                                            i6 = 0;
                                            i7 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i6 = 0;
                                            i7 = 33;
                                            if (z5) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z4) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (ssaStyle.f18576h) {
                                            spannableString.setSpan(new UnderlineSpan(), i6, spannableString.length(), i7);
                                        }
                                        if (ssaStyle.f18577i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i6, spannableString.length(), i7);
                                        }
                                    } else {
                                        charsetB = charsetB;
                                        ssaDialogueFormatA = ssaDialogueFormatA;
                                        f2 = f2;
                                    }
                                    int i11 = -1;
                                    if (i10 != -1) {
                                        i11 = i10;
                                    } else if (ssaStyle != null) {
                                        i11 = ssaStyle.f18573b;
                                    }
                                    switch (i11) {
                                        case 0:
                                        default:
                                            Z.s(i11, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    builder.f18456c = alignment;
                                    int i12 = Integer.MIN_VALUE;
                                    switch (i11) {
                                        case 0:
                                        default:
                                            Z.s(i11, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            i3 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i3 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i3 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i3 = 2;
                                            break;
                                    }
                                    builder.f18459i = i3;
                                    switch (i11) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            Z.s(i11, "Unknown alignment: ", "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i12 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i12 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i12 = 0;
                                            break;
                                    }
                                    builder.g = i12;
                                    PointF pointF2 = pointF;
                                    if (pointF2 == null || f3 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                        int i13 = builder.f18459i;
                                        float f5 = 0.05f;
                                        if (i13 != 0) {
                                            i5 = 1;
                                            if (i13 != 1) {
                                                i4 = 2;
                                                f = i13 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i4 = 2;
                                                f = 0.5f;
                                            }
                                        } else {
                                            i4 = 2;
                                            i5 = 1;
                                            f = 0.05f;
                                        }
                                        builder.f18458h = f;
                                        if (i12 != 0) {
                                            f5 = i12 != i5 ? i12 != i4 ? -3.4028235E38f : 0.95f : 0.5f;
                                        }
                                        builder.f18457e = f5;
                                        builder.f = 0;
                                    } else {
                                        builder.f18458h = pointF2.x / f2;
                                        builder.f18457e = pointF2.y / f3;
                                        builder.f = 0;
                                    }
                                    Cue cueA = builder.a();
                                    int iF = f(jH, arrayList2, arrayList);
                                    for (int iF2 = f(r10, arrayList2, arrayList); iF2 < iF; iF2++) {
                                        ((List) arrayList.get(iF2)).add(cueA);
                                    }
                                }
                            }
                        }
                    }
                    parsableByteArray = parsableByteArray2;
                    charsetB = charsetB;
                    ssaDialogueFormatA = ssaDialogueFormatA;
                } else {
                    parsableByteArray = parsableByteArray2;
                    charsetB = charsetB;
                    ssaDialogueFormatA = ssaDialogueFormatA;
                }
                ssaDecoder = this;
                parsableByteArray2 = parsableByteArray;
                ssaDialogueFormatA = ssaDialogueFormatA;
                charsetB = charsetB;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x02d3  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void g(ParsableByteArray parsableByteArray, Charset charset) {
        int i2;
        float f;
        int i3;
        SsaStyle ssaStyle;
        int i4;
        float f2;
        int i5 = 6;
        int i6 = 7;
        int i7 = 2;
        int i8 = 0;
        while (true) {
            String strH = parsableByteArray.h(charset);
            if (strH == null) {
                return;
            }
            boolean zEqualsIgnoreCase = "[Script Info]".equalsIgnoreCase(strH);
            char c2 = AbstractJsonLexerKt.BEGIN_LIST;
            if (zEqualsIgnoreCase) {
                while (true) {
                    String strH2 = parsableByteArray.h(charset);
                    if (strH2 == null || (parsableByteArray.a() != 0 && parsableByteArray.c(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strH2.split(":");
                    if (strArrSplit.length == i7) {
                        String strB = Ascii.b(strArrSplit[i8].trim());
                        strB.getClass();
                        if (strB.equals("playresx")) {
                            this.r = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strB.equals("playresy")) {
                            try {
                                this.s = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else {
                if ("[V4+ Styles]".equalsIgnoreCase(strH)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    SsaStyle.Format format = null;
                    while (true) {
                        String strH3 = parsableByteArray.h(charset);
                        if (strH3 != null && (parsableByteArray.a() == 0 || parsableByteArray.c(charset) != c2)) {
                            if (strH3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strH3.substring(i6), ",");
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                int i15 = -1;
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                for (int i19 = i8; i19 < strArrSplit2.length; i19++) {
                                    String strB2 = Ascii.b(strArrSplit2[i19].trim());
                                    strB2.getClass();
                                    switch (strB2.hashCode()) {
                                        case -1178781136:
                                            i2 = strB2.equals(TtmlNode.ITALIC) ? i8 : -1;
                                            break;
                                        case -1026963764:
                                            i2 = strB2.equals(TtmlNode.UNDERLINE) ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i2 = strB2.equals("strikeout") ? i7 : -1;
                                            break;
                                        case -70925746:
                                            i2 = strB2.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i2 = strB2.equals(TtmlNode.BOLD) ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i2 = strB2.equals("name") ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i2 = strB2.equals("fontsize") ? i5 : -1;
                                            break;
                                        case 767321349:
                                            i2 = strB2.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i2 = strB2.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i2 = strB2.equals("outlinecolour") ? 9 : -1;
                                            break;
                                        default:
                                            i2 = -1;
                                            break;
                                    }
                                    switch (i2) {
                                        case 0:
                                            i15 = i19;
                                            break;
                                        case 1:
                                            i16 = i19;
                                            break;
                                        case 2:
                                            i17 = i19;
                                            break;
                                        case 3:
                                            i11 = i19;
                                            break;
                                        case 4:
                                            i14 = i19;
                                            break;
                                        case 5:
                                            i9 = i19;
                                            break;
                                        case 6:
                                            i13 = i19;
                                            break;
                                        case 7:
                                            i18 = i19;
                                            break;
                                        case 8:
                                            i10 = i19;
                                            break;
                                        case 9:
                                            i12 = i19;
                                            break;
                                    }
                                }
                                format = i9 != -1 ? new SsaStyle.Format(i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, strArrSplit2.length) : null;
                                i6 = 7;
                            } else {
                                if (strH3.startsWith("Style:")) {
                                    if (format == null) {
                                        Log.g("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(strH3));
                                    } else {
                                        Assertions.b(strH3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strH3.substring(i5), ",");
                                        int length = strArrSplit3.length;
                                        int i20 = format.k;
                                        if (length != i20) {
                                            int length2 = strArrSplit3.length;
                                            int i21 = Util.f18979a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbP = a.p(i20, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            sbP.append(strH3);
                                            sbP.append("'");
                                            Log.g("SsaStyle", sbP.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[format.f18578a].trim();
                                                int i22 = format.f18579b;
                                                int iA = i22 != -1 ? SsaStyle.a(strArrSplit3[i22].trim()) : -1;
                                                int i23 = format.f18580c;
                                                Integer numC = i23 != -1 ? SsaStyle.c(strArrSplit3[i23].trim()) : null;
                                                int i24 = format.d;
                                                Integer numC2 = i24 != -1 ? SsaStyle.c(strArrSplit3[i24].trim()) : null;
                                                int i25 = format.f18581e;
                                                if (i25 != -1) {
                                                    String strTrim2 = strArrSplit3[i25].trim();
                                                    try {
                                                        f2 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e2) {
                                                        Log.h("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e2);
                                                        f2 = -3.4028235E38f;
                                                    }
                                                    f = f2;
                                                } else {
                                                    f = -3.4028235E38f;
                                                }
                                                int i26 = format.f;
                                                boolean z2 = i26 != -1 && SsaStyle.b(strArrSplit3[i26].trim());
                                                int i27 = format.g;
                                                boolean z3 = i27 != -1 && SsaStyle.b(strArrSplit3[i27].trim());
                                                int i28 = format.f18582h;
                                                boolean z4 = i28 != -1 && SsaStyle.b(strArrSplit3[i28].trim());
                                                int i29 = format.f18583i;
                                                boolean z5 = i29 != -1 && SsaStyle.b(strArrSplit3[i29].trim());
                                                int i30 = format.j;
                                                if (i30 != -1) {
                                                    String strTrim3 = strArrSplit3[i30].trim();
                                                    try {
                                                        i4 = Integer.parseInt(strTrim3.trim());
                                                        if (i4 != 1 && i4 != 3) {
                                                            Log.g("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                            i4 = -1;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i3 = i4;
                                                } else {
                                                    i3 = -1;
                                                }
                                                ssaStyle = new SsaStyle(strTrim, iA, numC, numC2, f, z2, z3, z4, z5, i3);
                                            } catch (RuntimeException e3) {
                                                Log.h("SsaStyle", "Skipping malformed 'Style:' line: '" + strH3 + "'", e3);
                                                ssaStyle = null;
                                            }
                                            if (ssaStyle != null) {
                                                linkedHashMap.put(ssaStyle.f18572a, ssaStyle);
                                            }
                                        }
                                        ssaStyle = null;
                                        if (ssaStyle != null) {
                                            linkedHashMap.put(ssaStyle.f18572a, ssaStyle);
                                        }
                                    }
                                }
                                i5 = 6;
                                i6 = 7;
                                i7 = 2;
                                i8 = 0;
                                c2 = AbstractJsonLexerKt.BEGIN_LIST;
                            }
                        }
                    }
                    this.q = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(strH)) {
                    Log.f("SsaDecoder", "[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strH)) {
                    return;
                }
                i5 = 6;
                i6 = 7;
                i7 = 2;
                i8 = 0;
            }
        }
    }
}
