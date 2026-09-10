package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttDecoder extends SimpleSubtitleDecoder {
    public final ParsableByteArray o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WebvttCssParser f18660p;

    public WebvttDecoder() {
        super("WebvttDecoder");
        this.o = new ParsableByteArray();
        this.f18660p = new WebvttCssParser();
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0228  */
    /* JADX WARN: Code duplicated, block: B:129:0x024a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0255  */
    /* JADX WARN: Code duplicated, block: B:132:0x025e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0268  */
    /* JADX WARN: Code duplicated, block: B:135:0x0270  */
    /* JADX WARN: Code duplicated, block: B:137:0x0278  */
    /* JADX WARN: Code duplicated, block: B:138:0x027c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0284  */
    /* JADX WARN: Code duplicated, block: B:141:0x0289  */
    /* JADX WARN: Code duplicated, block: B:143:0x0291  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:163:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:166:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:173:0x030f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0329  */
    /* JADX WARN: Code duplicated, block: B:177:0x033a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0343  */
    /* JADX WARN: Code duplicated, block: B:181:0x0345  */
    /* JADX WARN: Code duplicated, block: B:184:0x034e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0350  */
    /* JADX WARN: Code duplicated, block: B:188:0x0359  */
    /* JADX WARN: Code duplicated, block: B:192:0x0363  */
    /* JADX WARN: Code duplicated, block: B:193:0x0368  */
    /* JADX WARN: Code duplicated, block: B:194:0x036d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0380  */
    /* JADX WARN: Code duplicated, block: B:237:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x030f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public final Subtitle e(byte[] bArr, int i2, boolean z2) throws SubtitleDecoderException {
        char c2;
        int i3;
        WebvttCueInfo webvttCueInfoD;
        String strTrim;
        int i4;
        String string;
        Matcher matcher;
        String strGroup;
        byte b2;
        boolean z3;
        WebvttDecoder webvttDecoder = this;
        char c3 = 2;
        boolean z4 = false;
        int i5 = -1;
        int i6 = 1;
        ParsableByteArray parsableByteArray = webvttDecoder.o;
        parsableByteArray.D(bArr, i2);
        ArrayList arrayList = new ArrayList();
        try {
            WebvttParserUtil.c(parsableByteArray);
            while (!TextUtils.isEmpty(parsableByteArray.h(Charsets.f19705c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i7 = z4 ? 1 : 0;
                int i8 = i5;
                while (i8 == i5) {
                    i7 = parsableByteArray.f18957b;
                    String strH = parsableByteArray.h(Charsets.f19705c);
                    if (strH == null) {
                        i8 = z4 ? 1 : 0;
                    } else if ("STYLE".equals(strH)) {
                        i8 = c3;
                    } else {
                        i8 = strH.startsWith("NOTE") ? i6 : 3;
                    }
                }
                parsableByteArray.F(i7);
                if (i8 == 0) {
                    return new WebvttSubtitle(arrayList2);
                }
                if (i8 == i6) {
                    while (!TextUtils.isEmpty(parsableByteArray.h(Charsets.f19705c))) {
                    }
                } else {
                    String str = null;
                    if (i8 != c3) {
                        c2 = c3;
                        i3 = i6;
                        if (i8 == 3) {
                            Pattern pattern = WebvttCueParser.f18644a;
                            Charset charset = Charsets.f19705c;
                            String strH2 = parsableByteArray.h(charset);
                            if (strH2 == null) {
                                webvttCueInfoD = null;
                            } else {
                                Pattern pattern2 = WebvttCueParser.f18644a;
                                Matcher matcher2 = pattern2.matcher(strH2);
                                if (matcher2.matches()) {
                                    webvttCueInfoD = WebvttCueParser.d(null, matcher2, parsableByteArray, arrayList);
                                } else {
                                    webvttCueInfoD = null;
                                    String strH3 = parsableByteArray.h(charset);
                                    if (strH3 != null) {
                                        Matcher matcher3 = pattern2.matcher(strH3);
                                        if (matcher3.matches()) {
                                            webvttCueInfoD = WebvttCueParser.d(strH2.trim(), matcher3, parsableByteArray, arrayList);
                                        }
                                    }
                                }
                            }
                            if (webvttCueInfoD != null) {
                                arrayList2.add(webvttCueInfoD);
                            }
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new SubtitleDecoderException("A style block was found after the first cue.");
                        }
                        parsableByteArray.h(Charsets.f19705c);
                        WebvttCssParser webvttCssParser = webvttDecoder.f18660p;
                        StringBuilder sb = webvttCssParser.f18631b;
                        sb.setLength(z4 ? 1 : 0);
                        int i9 = parsableByteArray.f18957b;
                        while (!TextUtils.isEmpty(parsableByteArray.h(Charsets.f19705c))) {
                        }
                        byte[] bArr2 = parsableByteArray.f18956a;
                        int i10 = parsableByteArray.f18957b;
                        ParsableByteArray parsableByteArray2 = webvttCssParser.f18630a;
                        parsableByteArray2.D(bArr2, i10);
                        parsableByteArray2.F(i9);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            WebvttCssParser.c(parsableByteArray2);
                            if (parsableByteArray2.a() >= 5 && "::cue".equals(parsableByteArray2.s(5, Charsets.f19705c))) {
                                int i11 = parsableByteArray2.f18957b;
                                String strB = WebvttCssParser.b(parsableByteArray2, sb);
                                if (strB == null) {
                                    strTrim = str;
                                } else if ("{".equals(strB)) {
                                    parsableByteArray2.F(i11);
                                    strTrim = "";
                                } else {
                                    if ("(".equals(strB)) {
                                        int i12 = parsableByteArray2.f18957b;
                                        int i13 = parsableByteArray2.f18958c;
                                        int i14 = z4 ? 1 : 0;
                                        while (i12 < i13 && i14 == 0) {
                                            int i15 = i12 + 1;
                                            int i16 = ((char) parsableByteArray2.f18956a[i12]) == ')' ? i6 : z4 ? 1 : 0;
                                            i12 = i15;
                                            i14 = i16;
                                        }
                                        strTrim = parsableByteArray2.s((i12 + i5) - parsableByteArray2.f18957b, Charsets.f19705c).trim();
                                    } else {
                                        strTrim = str;
                                    }
                                    if (!")".equals(WebvttCssParser.b(parsableByteArray2, sb))) {
                                        strTrim = str;
                                    }
                                }
                            } else {
                                strTrim = str;
                            }
                            if (strTrim != null && "{".equals(WebvttCssParser.b(parsableByteArray2, sb))) {
                                WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
                                webvttCssStyle.f18632a = "";
                                webvttCssStyle.f18633b = "";
                                webvttCssStyle.f18634c = Collections.EMPTY_SET;
                                webvttCssStyle.d = "";
                                webvttCssStyle.f18635e = str;
                                webvttCssStyle.g = z4;
                                webvttCssStyle.f18637i = z4;
                                webvttCssStyle.j = i5;
                                webvttCssStyle.k = i5;
                                webvttCssStyle.f18638l = i5;
                                webvttCssStyle.m = i5;
                                webvttCssStyle.f18639n = i5;
                                webvttCssStyle.f18640p = i5;
                                webvttCssStyle.q = z4;
                                if (!"".equals(strTrim)) {
                                    int iIndexOf = strTrim.indexOf(91);
                                    if (iIndexOf != i5) {
                                        Matcher matcher4 = WebvttCssParser.f18629c.matcher(strTrim.substring(iIndexOf));
                                        if (matcher4.matches()) {
                                            String strGroup2 = matcher4.group(i6);
                                            strGroup2.getClass();
                                            webvttCssStyle.d = strGroup2;
                                        }
                                        strTrim = strTrim.substring(z4 ? 1 : 0, iIndexOf);
                                    }
                                    int i17 = Util.f18979a;
                                    String[] strArrSplit = strTrim.split("\\.", i5);
                                    String str2 = strArrSplit[z4 ? 1 : 0];
                                    int iIndexOf2 = str2.indexOf(35);
                                    if (iIndexOf2 != i5) {
                                        webvttCssStyle.f18633b = str2.substring(z4 ? 1 : 0, iIndexOf2);
                                        webvttCssStyle.f18632a = str2.substring(iIndexOf2 + i6);
                                    } else {
                                        webvttCssStyle.f18633b = str2;
                                    }
                                    if (strArrSplit.length > i6) {
                                        int length = strArrSplit.length;
                                        Assertions.b(length <= strArrSplit.length ? i6 : z4 ? 1 : 0);
                                        webvttCssStyle.f18634c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i6, length)));
                                    }
                                }
                                ?? r0 = z4 ? 1 : 0;
                                String strB2 = null;
                                while (r0 == 0) {
                                    int i18 = parsableByteArray2.f18957b;
                                    strB2 = WebvttCssParser.b(parsableByteArray2, sb);
                                    ?? r14 = (strB2 == null || "}".equals(strB2)) ? i6 : z4;
                                    if (r14 == 0) {
                                        parsableByteArray2.F(i18);
                                        WebvttCssParser.c(parsableByteArray2);
                                        String strA = WebvttCssParser.a(parsableByteArray2, sb);
                                        if (!"".equals(strA) && ":".equals(WebvttCssParser.b(parsableByteArray2, sb))) {
                                            WebvttCssParser.c(parsableByteArray2);
                                            StringBuilder sb2 = new StringBuilder();
                                            boolean z5 = false;
                                            while (true) {
                                                if (z5) {
                                                    string = sb2.toString();
                                                } else {
                                                    int i19 = parsableByteArray2.f18957b;
                                                    boolean z6 = z5;
                                                    String strB3 = WebvttCssParser.b(parsableByteArray2, sb);
                                                    if (strB3 == null) {
                                                        string = null;
                                                    } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                        parsableByteArray2.F(i19);
                                                        z5 = true;
                                                    } else {
                                                        sb2.append(strB3);
                                                        z5 = z6;
                                                    }
                                                }
                                            }
                                            if (string == null || "".equals(string)) {
                                                i4 = 1;
                                            } else {
                                                int i20 = parsableByteArray2.f18957b;
                                                String strB4 = WebvttCssParser.b(parsableByteArray2, sb);
                                                if (!";".equals(strB4)) {
                                                    if ("}".equals(strB4)) {
                                                        parsableByteArray2.F(i20);
                                                        if ("color".equals(strA)) {
                                                            i4 = 1;
                                                            webvttCssStyle.f = ColorParser.a(string, true);
                                                            webvttCssStyle.g = true;
                                                        } else {
                                                            i4 = 1;
                                                            if ("background-color".equals(strA)) {
                                                                webvttCssStyle.f18636h = ColorParser.a(string, true);
                                                                webvttCssStyle.f18637i = true;
                                                            } else if (!"ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    webvttCssStyle.f18640p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    webvttCssStyle.f18640p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if (!"all".equals(string) || string.startsWith("digits")) {
                                                                    z3 = true;
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                                webvttCssStyle.q = z3;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if (TtmlNode.UNDERLINE.equals(string)) {
                                                                    i4 = 1;
                                                                    webvttCssStyle.k = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                webvttCssStyle.f18635e = Ascii.b(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                i4 = 1;
                                                                if ("font-style".equals(strA)) {
                                                                    if (TtmlNode.ITALIC.equals(string)) {
                                                                        webvttCssStyle.m = 1;
                                                                    }
                                                                } else if ("font-size".equals(strA)) {
                                                                    matcher = WebvttCssParser.d.matcher(Ascii.b(string));
                                                                    if (matcher.matches()) {
                                                                        strGroup = matcher.group(2);
                                                                        strGroup.getClass();
                                                                        switch (strGroup.hashCode()) {
                                                                            case 37:
                                                                                if (!strGroup.equals("%")) {
                                                                                    b2 = 0;
                                                                                }
                                                                                switch (b2) {
                                                                                    case 0:
                                                                                        i4 = 1;
                                                                                        webvttCssStyle.f18639n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i4 = 1;
                                                                                        webvttCssStyle.f18639n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i4 = 1;
                                                                                        webvttCssStyle.f18639n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup3 = matcher.group(i4);
                                                                                strGroup3.getClass();
                                                                                webvttCssStyle.o = Float.parseFloat(strGroup3);
                                                                                break;
                                                                            case 3240:
                                                                                if (!strGroup.equals("em")) {
                                                                                    b2 = 1;
                                                                                }
                                                                                switch (b2) {
                                                                                    case 0:
                                                                                        i4 = 1;
                                                                                        webvttCssStyle.f18639n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i4 = 1;
                                                                                        webvttCssStyle.f18639n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i4 = 1;
                                                                                        webvttCssStyle.f18639n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup4 = matcher.group(i4);
                                                                                strGroup4.getClass();
                                                                                webvttCssStyle.o = Float.parseFloat(strGroup4);
                                                                                break;
                                                                            case 3592:
                                                                                if (!strGroup.equals("px")) {
                                                                                    b2 = 2;
                                                                                }
                                                                                switch (b2) {
                                                                                    case 0:
                                                                                        i4 = 1;
                                                                                        webvttCssStyle.f18639n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i4 = 1;
                                                                                        webvttCssStyle.f18639n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i4 = 1;
                                                                                        webvttCssStyle.f18639n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup5 = matcher.group(i4);
                                                                                strGroup5.getClass();
                                                                                webvttCssStyle.o = Float.parseFloat(strGroup5);
                                                                                break;
                                                                        }
                                                                        b2 = -1;
                                                                        switch (b2) {
                                                                            case 0:
                                                                                i4 = 1;
                                                                                webvttCssStyle.f18639n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i4 = 1;
                                                                                webvttCssStyle.f18639n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i4 = 1;
                                                                                webvttCssStyle.f18639n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String strGroup6 = matcher.group(i4);
                                                                        strGroup6.getClass();
                                                                        webvttCssStyle.o = Float.parseFloat(strGroup6);
                                                                    } else {
                                                                        Log.g("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                    }
                                                                }
                                                            } else if (TtmlNode.BOLD.equals(string)) {
                                                                i4 = 1;
                                                                webvttCssStyle.f18638l = 1;
                                                            }
                                                        }
                                                    }
                                                    i4 = 1;
                                                } else if ("color".equals(strA)) {
                                                    i4 = 1;
                                                    webvttCssStyle.f = ColorParser.a(string, true);
                                                    webvttCssStyle.g = true;
                                                } else {
                                                    i4 = 1;
                                                    if ("background-color".equals(strA)) {
                                                        webvttCssStyle.f18636h = ColorParser.a(string, true);
                                                        webvttCssStyle.f18637i = true;
                                                    } else if (!"ruby-position".equals(strA)) {
                                                        if ("text-combine-upright".equals(strA)) {
                                                            if ("all".equals(string)) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            webvttCssStyle.q = z3;
                                                        } else if ("text-decoration".equals(strA)) {
                                                            if (TtmlNode.UNDERLINE.equals(string)) {
                                                                i4 = 1;
                                                                webvttCssStyle.k = 1;
                                                            }
                                                        } else if ("font-family".equals(strA)) {
                                                            webvttCssStyle.f18635e = Ascii.b(string);
                                                        } else if ("font-weight".equals(strA)) {
                                                            i4 = 1;
                                                            if ("font-style".equals(strA)) {
                                                                if (TtmlNode.ITALIC.equals(string)) {
                                                                    webvttCssStyle.m = 1;
                                                                }
                                                            } else if ("font-size".equals(strA)) {
                                                                matcher = WebvttCssParser.d.matcher(Ascii.b(string));
                                                                if (matcher.matches()) {
                                                                    Log.g("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                } else {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case 37:
                                                                            if (!strGroup.equals("%")) {
                                                                                b2 = 0;
                                                                            }
                                                                            switch (b2) {
                                                                                case 0:
                                                                                    i4 = 1;
                                                                                    webvttCssStyle.f18639n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i4 = 1;
                                                                                    webvttCssStyle.f18639n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i4 = 1;
                                                                                    webvttCssStyle.f18639n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup7 = matcher.group(i4);
                                                                            strGroup7.getClass();
                                                                            webvttCssStyle.o = Float.parseFloat(strGroup7);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b2 = 1;
                                                                            }
                                                                            switch (b2) {
                                                                                case 0:
                                                                                    i4 = 1;
                                                                                    webvttCssStyle.f18639n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i4 = 1;
                                                                                    webvttCssStyle.f18639n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i4 = 1;
                                                                                    webvttCssStyle.f18639n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup8 = matcher.group(i4);
                                                                            strGroup8.getClass();
                                                                            webvttCssStyle.o = Float.parseFloat(strGroup8);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b2 = 2;
                                                                            }
                                                                            switch (b2) {
                                                                                case 0:
                                                                                    i4 = 1;
                                                                                    webvttCssStyle.f18639n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i4 = 1;
                                                                                    webvttCssStyle.f18639n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i4 = 1;
                                                                                    webvttCssStyle.f18639n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup9 = matcher.group(i4);
                                                                            strGroup9.getClass();
                                                                            webvttCssStyle.o = Float.parseFloat(strGroup9);
                                                                            break;
                                                                    }
                                                                    b2 = -1;
                                                                    switch (b2) {
                                                                        case 0:
                                                                            i4 = 1;
                                                                            webvttCssStyle.f18639n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i4 = 1;
                                                                            webvttCssStyle.f18639n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i4 = 1;
                                                                            webvttCssStyle.f18639n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup10 = matcher.group(i4);
                                                                    strGroup10.getClass();
                                                                    webvttCssStyle.o = Float.parseFloat(strGroup10);
                                                                }
                                                            }
                                                        } else if (TtmlNode.BOLD.equals(string)) {
                                                            i4 = 1;
                                                            webvttCssStyle.f18638l = 1;
                                                        }
                                                        i4 = 1;
                                                    } else if ("over".equals(string)) {
                                                        webvttCssStyle.f18640p = 1;
                                                    } else {
                                                        if ("under".equals(string)) {
                                                            webvttCssStyle.f18640p = 2;
                                                        }
                                                        i4 = 1;
                                                    }
                                                }
                                            }
                                        } else {
                                            i4 = i6;
                                        }
                                    } else {
                                        i4 = i6;
                                    }
                                    i6 = i4;
                                    r0 = r14;
                                    z4 = false;
                                }
                                int i21 = i6;
                                if ("}".equals(strB2)) {
                                    arrayList3.add(webvttCssStyle);
                                }
                                i6 = i21;
                                z4 = false;
                                i5 = -1;
                                str = null;
                            }
                        }
                        i3 = i6;
                        c2 = 2;
                        arrayList.addAll(arrayList3);
                    }
                    c3 = c2;
                    i6 = i3;
                    z4 = false;
                    i5 = -1;
                    webvttDecoder = this;
                }
            }
        } catch (ParserException e2) {
            throw new SubtitleDecoderException(e2);
        }
    }
}
