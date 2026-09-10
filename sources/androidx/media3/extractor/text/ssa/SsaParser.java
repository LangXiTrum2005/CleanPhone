package androidx.media3.extractor.text.ssa;

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
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class SsaParser implements SubtitleParser {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SsaDialogueFormat f7330b;
    public LinkedHashMap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f7332e = -3.4028235E38f;
    public float f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ParsableByteArray f7331c = new ParsableByteArray();

    public SsaParser(List list) {
        if (list == null || list.isEmpty()) {
            this.f7329a = false;
            this.f7330b = null;
            return;
        }
        this.f7329a = true;
        String strN = Util.n((byte[]) list.get(0));
        Assertions.b(strN.startsWith("Format:"));
        SsaDialogueFormat ssaDialogueFormatA = SsaDialogueFormat.a(strN);
        ssaDialogueFormatA.getClass();
        this.f7330b = ssaDialogueFormatA;
        e(new ParsableByteArray((byte[]) list.get(1)), Charsets.f19705c);
    }

    public static int d(long j, ArrayList arrayList, ArrayList arrayList2) {
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

    public static long f(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i2 = Util.f5683a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        SsaDialogueFormat ssaDialogueFormat;
        Layout.Alignment alignment;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        Integer num;
        int iA;
        int i9;
        SsaParser ssaParser = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray parsableByteArray = ssaParser.f7331c;
        parsableByteArray.E(bArr, i2 + i3);
        parsableByteArray.G(i2);
        Charset charsetC = parsableByteArray.C();
        if (charsetC == null) {
            charsetC = Charsets.f19705c;
        }
        boolean z2 = ssaParser.f7329a;
        if (!z2) {
            ssaParser.e(parsableByteArray, charsetC);
        }
        SsaDialogueFormat ssaDialogueFormatA = z2 ? ssaParser.f7330b : null;
        while (true) {
            String strH = parsableByteArray.h(charsetC);
            if (strH == null) {
                long j = outputOptions.f7217a;
                ArrayList arrayList3 = (j == -9223372036854775807L || !outputOptions.f7218b) ? null : new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    List list = (List) arrayList.get(i10);
                    if (!list.isEmpty() || i10 == 0) {
                        if (i10 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i10)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i10 + 1)).longValue() - ((Long) arrayList2.get(i10)).longValue();
                        if (j == -9223372036854775807L || jLongValue >= j) {
                            consumer.accept(new CuesWithTiming(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new CuesWithTiming(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        consumer.accept((CuesWithTiming) it.next());
                    }
                    return;
                }
                return;
            }
            if (strH.startsWith("Format:")) {
                ssaDialogueFormatA = SsaDialogueFormat.a(strH);
            } else {
                if (strH.startsWith("Dialogue:")) {
                    if (ssaDialogueFormatA == null) {
                        Log.g("SsaParser", "Skipping dialogue line before complete format: ".concat(strH));
                    } else {
                        Assertions.b(strH.startsWith("Dialogue:"));
                        String strSubstring = strH.substring(9);
                        int i11 = ssaDialogueFormatA.f7328e;
                        String[] strArrSplit = strSubstring.split(",", i11);
                        if (strArrSplit.length != i11) {
                            Log.g("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strH));
                        } else {
                            if (f(strArrSplit[ssaDialogueFormatA.f7325a]) == -9223372036854775807L) {
                                Log.g("SsaParser", "Skipping invalid timing: ".concat(strH));
                            } else {
                                long jF = f(strArrSplit[ssaDialogueFormatA.f7326b]);
                                if (jF == -9223372036854775807L) {
                                    Log.g("SsaParser", "Skipping invalid timing: ".concat(strH));
                                } else {
                                    LinkedHashMap linkedHashMap = ssaParser.d;
                                    SsaStyle ssaStyle = (linkedHashMap == null || (i9 = ssaDialogueFormatA.f7327c) == -1) ? null : (SsaStyle) linkedHashMap.get(strArrSplit[i9].trim());
                                    String str = strArrSplit[ssaDialogueFormatA.d];
                                    Matcher matcher = SsaStyle.Overrides.f7345a.matcher(str);
                                    int i12 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        SsaDialogueFormat ssaDialogueFormat2 = ssaDialogueFormatA;
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
                                                i12 = iA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        ssaDialogueFormatA = ssaDialogueFormat2;
                                    }
                                    ssaDialogueFormat = ssaDialogueFormatA;
                                    String strReplace = SsaStyle.Overrides.f7345a.matcher(str).replaceAll("").replace("\\N", IOUtils.LINE_SEPARATOR_UNIX).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX).replace("\\h", " ");
                                    float f2 = ssaParser.f7332e;
                                    float f3 = ssaParser.f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    Cue.Builder builder = new Cue.Builder();
                                    builder.f5604a = spannableString;
                                    if (ssaStyle != null) {
                                        Integer num2 = ssaStyle.f7335c;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (ssaStyle.j == 3 && (num = ssaStyle.d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f4 = ssaStyle.f7336e;
                                        if (f4 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                            builder.k = f4 / f3;
                                            builder.j = 1;
                                        }
                                        boolean z3 = ssaStyle.g;
                                        boolean z4 = ssaStyle.f;
                                        if (z4 && z3) {
                                            i7 = 0;
                                            i8 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i7 = 0;
                                            i8 = 33;
                                            if (z4) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z3) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (ssaStyle.f7337h) {
                                            spannableString.setSpan(new UnderlineSpan(), i7, spannableString.length(), i8);
                                        }
                                        if (ssaStyle.f7338i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i7, spannableString.length(), i8);
                                        }
                                    } else {
                                        parsableByteArray = parsableByteArray;
                                        f2 = f2;
                                        f3 = f3;
                                    }
                                    int i13 = i12;
                                    int i14 = -1;
                                    if (i13 != -1) {
                                        i14 = i13;
                                    } else if (ssaStyle != null) {
                                        i14 = ssaStyle.f7334b;
                                    }
                                    switch (i14) {
                                        case 0:
                                        default:
                                            a.C(i14, "Unknown alignment: ", "SsaParser");
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
                                    builder.f5606c = alignment;
                                    int i15 = Integer.MIN_VALUE;
                                    switch (i14) {
                                        case 0:
                                        default:
                                            a.C(i14, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i4 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i4 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i4 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i4 = 2;
                                            break;
                                    }
                                    builder.f5609i = i4;
                                    switch (i14) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            a.C(i14, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i15 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i15 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i15 = 0;
                                            break;
                                    }
                                    builder.g = i15;
                                    PointF pointF2 = pointF;
                                    if (pointF2 == null || f3 == -3.4028235E38f || f2 == -3.4028235E38f) {
                                        int i16 = builder.f5609i;
                                        float f5 = 0.05f;
                                        if (i16 != 0) {
                                            i5 = 1;
                                            if (i16 != 1) {
                                                i6 = 2;
                                                f = i16 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i6 = 2;
                                                f = 0.5f;
                                            }
                                        } else {
                                            i5 = 1;
                                            i6 = 2;
                                            f = 0.05f;
                                        }
                                        builder.f5608h = f;
                                        if (i15 != 0) {
                                            f5 = i15 != i5 ? i15 != i6 ? -3.4028235E38f : 0.95f : 0.5f;
                                        }
                                        builder.f5607e = f5;
                                        builder.f = 0;
                                    } else {
                                        builder.f5608h = pointF2.x / f2;
                                        builder.f5607e = pointF2.y / f3;
                                        builder.f = 0;
                                    }
                                    Cue cueA = builder.a();
                                    int iD = d(jF, arrayList2, arrayList);
                                    for (int iD2 = d(r12, arrayList2, arrayList); iD2 < iD; iD2++) {
                                        ((List) arrayList.get(iD2)).add(cueA);
                                    }
                                }
                            }
                        }
                    }
                    ssaDialogueFormat = ssaDialogueFormatA;
                    parsableByteArray = parsableByteArray;
                } else {
                    ssaDialogueFormat = ssaDialogueFormatA;
                    parsableByteArray = parsableByteArray;
                }
                ssaParser = this;
                charsetC = charsetC;
                ssaDialogueFormatA = ssaDialogueFormat;
                parsableByteArray = parsableByteArray;
            }
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final int c() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x02d3  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void e(ParsableByteArray parsableByteArray, Charset charset) {
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
                            this.f7332e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strB.equals("playresy")) {
                            try {
                                this.f = Float.parseFloat(strArrSplit[1].trim());
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
                                        Log.g("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strH3));
                                    } else {
                                        Assertions.b(strH3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strH3.substring(i5), ",");
                                        int length = strArrSplit3.length;
                                        int i20 = format.k;
                                        if (length != i20) {
                                            int length2 = strArrSplit3.length;
                                            int i21 = Util.f5683a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbP = a.p(i20, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            sbP.append(strH3);
                                            sbP.append("'");
                                            Log.g("SsaStyle", sbP.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[format.f7339a].trim();
                                                int i22 = format.f7340b;
                                                int iA = i22 != -1 ? SsaStyle.a(strArrSplit3[i22].trim()) : -1;
                                                int i23 = format.f7341c;
                                                Integer numC = i23 != -1 ? SsaStyle.c(strArrSplit3[i23].trim()) : null;
                                                int i24 = format.d;
                                                Integer numC2 = i24 != -1 ? SsaStyle.c(strArrSplit3[i24].trim()) : null;
                                                int i25 = format.f7342e;
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
                                                int i28 = format.f7343h;
                                                boolean z4 = i28 != -1 && SsaStyle.b(strArrSplit3[i28].trim());
                                                int i29 = format.f7344i;
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
                                                linkedHashMap.put(ssaStyle.f7333a, ssaStyle);
                                            }
                                        }
                                        ssaStyle = null;
                                        if (ssaStyle != null) {
                                            linkedHashMap.put(ssaStyle.f7333a, ssaStyle);
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
                    this.d = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(strH)) {
                    Log.f("SsaParser", "[V4 Styles] are not supported");
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
