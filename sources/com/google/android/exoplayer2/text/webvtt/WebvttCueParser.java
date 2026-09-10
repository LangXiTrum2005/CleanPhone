package com.google.android.exoplayer2.text.webvtt;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.applovin.impl.Z;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.HorizontalTextInVerticalContextSpan;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.span.SpanUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import com.smartdigimkt.q8.i;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttCueParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f18644a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f18645b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f18646c;
    public static final Map d;

    public static class Element {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f18647c = new a(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartTag f18648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18649b;

        public Element(StartTag startTag, int i2) {
            this.f18648a = startTag;
            this.f18649b = i2;
        }
    }

    public static final class StartTag {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f18652c;
        public final Set d;

        public StartTag(String str, int i2, String str2, Set set) {
            this.f18651b = i2;
            this.f18650a = str;
            this.f18652c = str2;
            this.d = set;
        }
    }

    public static final class StyleMatch implements Comparable<StyleMatch> {
        public final int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final WebvttCssStyle f18653Y;

        public StyleMatch(int i2, WebvttCssStyle webvttCssStyle) {
            this.X = i2;
            this.f18653Y = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public final int compareTo(StyleMatch styleMatch) {
            return Integer.compare(this.X, styleMatch.X);
        }
    }

    public static final class WebvttCueInfoBuilder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f18656c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18654a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18655b = 0;
        public int d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f18657e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f18658h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f18659i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        /* JADX WARN: Code duplicated, block: B:20:0x0032  */
        /* JADX WARN: Code duplicated, block: B:21:0x0034  */
        /* JADX WARN: Code duplicated, block: B:29:0x004f  */
        /* JADX WARN: Code duplicated, block: B:31:0x0055  */
        /* JADX WARN: Code duplicated, block: B:39:0x006b  */
        public final Cue.Builder a() {
            Layout.Alignment alignment;
            float f = this.f18658h;
            float f2 = -3.4028235E38f;
            if (f == -3.4028235E38f) {
                int i2 = this.d;
                if (i2 != 4) {
                    f = i2 != 5 ? 0.5f : 1.0f;
                } else {
                    f = 0.0f;
                }
            }
            int i3 = this.f18659i;
            if (i3 == Integer.MIN_VALUE) {
                int i4 = this.d;
                if (i4 == 1) {
                    i3 = 0;
                } else if (i4 == 3) {
                    i3 = 2;
                } else if (i4 == 4) {
                    i3 = 0;
                } else if (i4 != 5) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
            }
            Cue.Builder builder = new Cue.Builder();
            int i5 = this.d;
            if (i5 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i5 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i5 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i5 == 4) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i5 != 5) {
                Z.s(i5, "Unknown textAlignment: ", "WebvttCueParser");
                alignment = null;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            builder.f18456c = alignment;
            float f3 = this.f18657e;
            int i6 = this.f;
            if (f3 != -3.4028235E38f && i6 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
                f2 = 1.0f;
            } else if (f3 != -3.4028235E38f) {
                f2 = f3;
            } else if (i6 == 0) {
                f2 = 1.0f;
            }
            builder.f18457e = f2;
            builder.f = i6;
            builder.g = this.g;
            builder.f18458h = f;
            builder.f18459i = i3;
            float f4 = this.j;
            if (i3 == 0) {
                f = 1.0f - f;
            } else if (i3 == 1) {
                f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            } else if (i3 != 2) {
                throw new IllegalStateException(String.valueOf(i3));
            }
            builder.f18460l = Math.min(f4, f);
            builder.f18462p = this.k;
            CharSequence charSequence = this.f18656c;
            if (charSequence != null) {
                builder.f18454a = charSequence;
            }
            return builder;
        }
    }

    static {
        HashMap map = new HashMap();
        androidx.media3.extractor.text.ttml.a.w(255, 255, 255, map, "white");
        androidx.media3.extractor.text.ttml.a.w(0, 255, 0, map, "lime");
        androidx.media3.extractor.text.ttml.a.w(0, 255, 255, map, "cyan");
        androidx.media3.extractor.text.ttml.a.w(255, 0, 0, map, "red");
        androidx.media3.extractor.text.ttml.a.w(255, 255, 0, map, "yellow");
        androidx.media3.extractor.text.ttml.a.w(255, 0, 255, map, "magenta");
        androidx.media3.extractor.text.ttml.a.w(0, 0, 255, map, "blue");
        androidx.media3.extractor.text.ttml.a.w(0, 0, 0, map, "black");
        f18646c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        androidx.media3.extractor.text.ttml.a.w(255, 255, 255, map2, "bg_white");
        androidx.media3.extractor.text.ttml.a.w(0, 255, 0, map2, "bg_lime");
        androidx.media3.extractor.text.ttml.a.w(0, 255, 255, map2, "bg_cyan");
        androidx.media3.extractor.text.ttml.a.w(255, 0, 0, map2, "bg_red");
        androidx.media3.extractor.text.ttml.a.w(255, 255, 0, map2, "bg_yellow");
        androidx.media3.extractor.text.ttml.a.w(255, 0, 255, map2, "bg_magenta");
        androidx.media3.extractor.text.ttml.a.w(0, 0, 255, map2, "bg_blue");
        androidx.media3.extractor.text.ttml.a.w(0, 0, 0, map2, "bg_black");
        d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, StartTag startTag, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i2 = startTag.f18651b;
        int length = spannableStringBuilder.length();
        String str2 = startTag.f18650a;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                androidx.datastore.preferences.protobuf.a.t(1, spannableStringBuilder, i2, length, 33);
                break;
            case "c":
                for (String str3 : startTag.d) {
                    Map map = f18646c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i2, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case "i":
                androidx.datastore.preferences.protobuf.a.t(2, spannableStringBuilder, i2, length, 33);
                break;
            case "u":
                androidx.datastore.preferences.protobuf.a.w(spannableStringBuilder, i2, length, 33);
                break;
            case "ruby":
                c(list2, str, startTag);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, Element.f18647c);
                int i3 = startTag.f18651b;
                int length2 = 0;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if ("rt".equals(((Element) arrayList.get(i4)).f18648a.f18650a)) {
                        Element element = (Element) arrayList.get(i4);
                        c(list2, str, element.f18648a);
                        int i5 = element.f18648a.f18651b - length2;
                        int i6 = element.f18649b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        charSequenceSubSequence.toString();
                        spannableStringBuilder.setSpan(new RubySpan(), i3, i5, 33);
                        length2 += charSequenceSubSequence.length();
                        i3 = i5;
                    }
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, startTag);
        for (int i7 = 0; i7 < arrayListB.size(); i7++) {
            WebvttCssStyle webvttCssStyle = ((StyleMatch) arrayListB.get(i7)).f18653Y;
            int i8 = webvttCssStyle.f18638l;
            if (((i8 == -1 && webvttCssStyle.m == -1) ? -1 : (i8 == 1 ? (char) 1 : (char) 0) | (webvttCssStyle.m == 1 ? (char) 2 : (char) 0)) != -1) {
                int i9 = webvttCssStyle.f18638l;
                SpanUtil.a(spannableStringBuilder, new StyleSpan((i9 == -1 && webvttCssStyle.m == -1) ? -1 : (i9 == 1 ? 1 : 0) | (webvttCssStyle.m == 1 ? 2 : 0)), i2, length);
            }
            if (webvttCssStyle.j == 1) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, length, 33);
            }
            if (webvttCssStyle.k == 1) {
                androidx.datastore.preferences.protobuf.a.w(spannableStringBuilder, i2, length, 33);
            }
            if (webvttCssStyle.g) {
                if (!webvttCssStyle.g) {
                    throw new IllegalStateException("Font color not defined");
                }
                SpanUtil.a(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.f), i2, length);
            }
            if (webvttCssStyle.f18637i) {
                if (!webvttCssStyle.f18637i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                SpanUtil.a(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.f18636h), i2, length);
            }
            if (webvttCssStyle.f18635e != null) {
                SpanUtil.a(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.f18635e), i2, length);
            }
            int i10 = webvttCssStyle.f18639n;
            if (i10 == 1) {
                SpanUtil.a(spannableStringBuilder, new AbsoluteSizeSpan((int) webvttCssStyle.o, true), i2, length);
            } else if (i10 == 2) {
                SpanUtil.a(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.o), i2, length);
            } else if (i10 == 3) {
                SpanUtil.a(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.o / 100.0f), i2, length);
            }
            if (webvttCssStyle.q) {
                spannableStringBuilder.setSpan(new HorizontalTextInVerticalContextSpan(), i2, length, 33);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, StartTag startTag) {
        ?? r4;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            WebvttCssStyle webvttCssStyle = (WebvttCssStyle) list.get(i2);
            String str2 = startTag.f18650a;
            if (webvttCssStyle.f18632a.isEmpty() && webvttCssStyle.f18633b.isEmpty() && webvttCssStyle.f18634c.isEmpty() && webvttCssStyle.d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = WebvttCssStyle.a(WebvttCssStyle.a(WebvttCssStyle.a(0, webvttCssStyle.f18632a, str, 1073741824), webvttCssStyle.f18633b, str2, 2), webvttCssStyle.d, startTag.f18652c, 4);
                if (iA != -1) {
                    if (startTag.d.containsAll(webvttCssStyle.f18634c)) {
                        size = iA + (webvttCssStyle.f18634c.size() * 4);
                    } else {
                        r4 = 0;
                    }
                } else {
                    r4 = 0;
                }
            }
            if (r4 > 0) {
                r4 = size;
                r4 = zIsEmpty;
                arrayList.add(new StyleMatch(r4, webvttCssStyle));
            } else {
                r4 = size;
                r4 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void c(List list, String str, StartTag startTag) {
        ArrayList arrayListB = b(list, str, startTag);
        for (int i2 = 0; i2 < arrayListB.size() && ((StyleMatch) arrayListB.get(i2)).f18653Y.f18640p == -1; i2++) {
        }
    }

    public static WebvttCueInfo d(String str, Matcher matcher, ParsableByteArray parsableByteArray, ArrayList arrayList) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            webvttCueInfoBuilder.f18654a = WebvttParserUtil.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            webvttCueInfoBuilder.f18655b = WebvttParserUtil.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, webvttCueInfoBuilder);
            StringBuilder sb = new StringBuilder();
            parsableByteArray.getClass();
            String strH = parsableByteArray.h(Charsets.f19705c);
            while (!TextUtils.isEmpty(strH)) {
                if (sb.length() > 0) {
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                }
                sb.append(strH.trim());
                strH = parsableByteArray.h(Charsets.f19705c);
            }
            webvttCueInfoBuilder.f18656c = f(str, sb.toString(), arrayList);
            return new WebvttCueInfo(webvttCueInfoBuilder.a().a(), webvttCueInfoBuilder.f18654a, webvttCueInfoBuilder.f18655b);
        } catch (NumberFormatException unused) {
            Log.g("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int i2;
        int i3;
        int i4;
        Matcher matcher = f18645b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, webvttCueInfoBuilder);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i2 = 2;
                            break;
                        case "end":
                            i2 = 3;
                            break;
                        case "left":
                            i2 = 4;
                            break;
                        case "right":
                            i2 = 5;
                            break;
                        case "start":
                            i2 = 1;
                            break;
                        default:
                            Log.g("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i2 = 2;
                            break;
                    }
                    webvttCueInfoBuilder.d = i2;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "line-left":
                            case "start":
                                i3 = 0;
                                break;
                            case "center":
                            case "middle":
                                i3 = 1;
                                break;
                            case "line-right":
                            case "end":
                                i3 = 2;
                                break;
                            default:
                                Log.g("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                i3 = Integer.MIN_VALUE;
                                break;
                        }
                        webvttCueInfoBuilder.f18659i = i3;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    webvttCueInfoBuilder.f18658h = WebvttParserUtil.a(strGroup2);
                } else if ("size".equals(strGroup)) {
                    webvttCueInfoBuilder.j = WebvttParserUtil.a(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i4 = 2;
                    } else if (strGroup2.equals("rl")) {
                        i4 = 1;
                    } else {
                        Log.g("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                        i4 = Integer.MIN_VALUE;
                    }
                    webvttCueInfoBuilder.k = i4;
                } else {
                    Log.g("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                Log.g("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0105. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SpannedString f(String str, String str2, List list) {
        int i2;
        char c2;
        int i3 = 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            String strTrim = "";
            if (i4 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (StartTag) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new StartTag("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i4);
            if (cCharAt == '&') {
                i4++;
                int iIndexOf = str2.indexOf(59, i4);
                int iIndexOf2 = str2.indexOf(32, i4);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i4, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            Log.g("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i4 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i4++;
            } else {
                int length = i4 + 1;
                if (length < str2.length()) {
                    boolean z2 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i5 = length - 2;
                    boolean z3 = str2.charAt(i5) == '/';
                    int i6 = i4 + (z2 ? i3 : 1);
                    if (!z3) {
                        i5 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i6, i5);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        Assertions.b(!strTrim2.isEmpty());
                        int i7 = Util.f18979a;
                        String str3 = strTrim2.split("[ \\.]", i3)[0];
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case 98:
                                i2 = str3.equals("b") ? 0 : -1;
                                break;
                            case 99:
                                i2 = str3.equals("c") ? 1 : -1;
                                break;
                            case 105:
                                i2 = str3.equals(i.f37957c) ? i3 : -1;
                                break;
                            case 117:
                                i2 = str3.equals("u") ? 3 : -1;
                                break;
                            case 118:
                                i2 = str3.equals("v") ? 4 : -1;
                                break;
                            case 3650:
                                i2 = str3.equals("rt") ? 5 : -1;
                                break;
                            case 3314158:
                                i2 = str3.equals("lang") ? 6 : -1;
                                break;
                            case 3511770:
                                i2 = str3.equals("ruby") ? 7 : -1;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                        switch (i2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z2) {
                                    while (!arrayDeque.isEmpty()) {
                                        StartTag startTag = (StartTag) arrayDeque.pop();
                                        a(str, startTag, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new Element(startTag, spannableStringBuilder.length()));
                                        }
                                        if (startTag.f18650a.equals(str3)) {
                                            break;
                                        }
                                    }
                                } else if (!z3) {
                                    int length2 = spannableStringBuilder.length();
                                    String strTrim3 = strSubstring2.trim();
                                    Assertions.b(!strTrim3.isEmpty());
                                    int iIndexOf4 = strTrim3.indexOf(" ");
                                    if (iIndexOf4 == -1) {
                                        c2 = 0;
                                    } else {
                                        strTrim = strTrim3.substring(iIndexOf4).trim();
                                        c2 = 0;
                                        strTrim3 = strTrim3.substring(0, iIndexOf4);
                                    }
                                    String[] strArrSplit = strTrim3.split("\\.", -1);
                                    String str4 = strArrSplit[c2];
                                    HashSet hashSet = new HashSet();
                                    for (int i8 = 1; i8 < strArrSplit.length; i8++) {
                                        hashSet.add(strArrSplit[i8]);
                                    }
                                    arrayDeque.push(new StartTag(str4, length2, strTrim, hashSet));
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    i4 = length;
                }
                i4 = length;
            }
            i3 = 2;
        }
    }

    public static void g(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int i2 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i2 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i2 = 0;
                    break;
                default:
                    Log.g("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i2 = Integer.MIN_VALUE;
                    break;
            }
            webvttCueInfoBuilder.g = i2;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            webvttCueInfoBuilder.f18657e = WebvttParserUtil.a(str);
            webvttCueInfoBuilder.f = 0;
        } else {
            webvttCueInfoBuilder.f18657e = Integer.parseInt(str);
            webvttCueInfoBuilder.f = 1;
        }
    }
}
