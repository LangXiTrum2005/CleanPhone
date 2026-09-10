package androidx.media3.extractor.text.webvtt;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ColorParser;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.SubtitleParser;
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

/* JADX INFO: loaded from: classes.dex */
public final class WebvttParser implements SubtitleParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f7427a = new ParsableByteArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebvttCssParser f7428b = new WebvttCssParser();

    /* JADX WARN: Code duplicated, block: B:119:0x022d  */
    /* JADX WARN: Code duplicated, block: B:129:0x024f  */
    /* JADX WARN: Code duplicated, block: B:130:0x025a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0263  */
    /* JADX WARN: Code duplicated, block: B:133:0x026d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0275  */
    /* JADX WARN: Code duplicated, block: B:137:0x027d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0281  */
    /* JADX WARN: Code duplicated, block: B:140:0x0289  */
    /* JADX WARN: Code duplicated, block: B:141:0x028d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0295  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:171:0x0303  */
    /* JADX WARN: Code duplicated, block: B:173:0x0313  */
    /* JADX WARN: Code duplicated, block: B:174:0x032d  */
    /* JADX WARN: Code duplicated, block: B:177:0x033e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0347  */
    /* JADX WARN: Code duplicated, block: B:181:0x0349  */
    /* JADX WARN: Code duplicated, block: B:184:0x0352  */
    /* JADX WARN: Code duplicated, block: B:185:0x0354  */
    /* JADX WARN: Code duplicated, block: B:188:0x035d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0367  */
    /* JADX WARN: Code duplicated, block: B:193:0x036c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0371  */
    /* JADX WARN: Code duplicated, block: B:196:0x0384  */
    /* JADX WARN: Code duplicated, block: B:237:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x0313, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
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
    @Override // androidx.media3.extractor.text.SubtitleParser
    public final void a(byte[] bArr, int i2, int i3, SubtitleParser.OutputOptions outputOptions, Consumer consumer) {
        char c2;
        int i4;
        WebvttCueInfo webvttCueInfoD;
        String strTrim;
        int i5;
        String string;
        Matcher matcher;
        String strGroup;
        byte b2;
        boolean z2;
        WebvttParser webvttParser = this;
        char c3 = 2;
        boolean z3 = false;
        int i6 = -1;
        int i7 = 1;
        ParsableByteArray parsableByteArray = webvttParser.f7427a;
        parsableByteArray.E(bArr, i2 + i3);
        parsableByteArray.G(i2);
        ArrayList arrayList = new ArrayList();
        try {
            WebvttParserUtil.c(parsableByteArray);
            while (!TextUtils.isEmpty(parsableByteArray.h(Charsets.f19705c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i8 = z3 ? 1 : 0;
                int i9 = i6;
                while (i9 == i6) {
                    i8 = parsableByteArray.f5668b;
                    String strH = parsableByteArray.h(Charsets.f19705c);
                    if (strH == null) {
                        i9 = z3 ? 1 : 0;
                    } else if ("STYLE".equals(strH)) {
                        i9 = c3;
                    } else {
                        i9 = strH.startsWith("NOTE") ? i7 : 3;
                    }
                }
                parsableByteArray.G(i8);
                if (i9 == 0) {
                    LegacySubtitleUtil.b(new WebvttSubtitle(arrayList2), outputOptions, consumer);
                    return;
                }
                if (i9 == i7) {
                    while (!TextUtils.isEmpty(parsableByteArray.h(Charsets.f19705c))) {
                    }
                } else {
                    String str = null;
                    if (i9 != c3) {
                        c2 = c3;
                        i4 = i7;
                        if (i9 == 3) {
                            Pattern pattern = WebvttCueParser.f7411a;
                            Charset charset = Charsets.f19705c;
                            String strH2 = parsableByteArray.h(charset);
                            if (strH2 == null) {
                                webvttCueInfoD = null;
                            } else {
                                Pattern pattern2 = WebvttCueParser.f7411a;
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
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        parsableByteArray.h(Charsets.f19705c);
                        WebvttCssParser webvttCssParser = webvttParser.f7428b;
                        StringBuilder sb = webvttCssParser.f7398b;
                        sb.setLength(z3 ? 1 : 0);
                        int i10 = parsableByteArray.f5668b;
                        while (!TextUtils.isEmpty(parsableByteArray.h(Charsets.f19705c))) {
                        }
                        byte[] bArr2 = parsableByteArray.f5667a;
                        int i11 = parsableByteArray.f5668b;
                        ParsableByteArray parsableByteArray2 = webvttCssParser.f7397a;
                        parsableByteArray2.E(bArr2, i11);
                        parsableByteArray2.G(i10);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            WebvttCssParser.c(parsableByteArray2);
                            if (parsableByteArray2.a() >= 5 && "::cue".equals(parsableByteArray2.s(5, Charsets.f19705c))) {
                                int i12 = parsableByteArray2.f5668b;
                                String strB = WebvttCssParser.b(parsableByteArray2, sb);
                                if (strB == null) {
                                    strTrim = str;
                                } else if ("{".equals(strB)) {
                                    parsableByteArray2.G(i12);
                                    strTrim = "";
                                } else {
                                    if ("(".equals(strB)) {
                                        int i13 = parsableByteArray2.f5668b;
                                        int i14 = parsableByteArray2.f5669c;
                                        int i15 = z3 ? 1 : 0;
                                        while (i13 < i14 && i15 == 0) {
                                            int i16 = i13 + 1;
                                            i15 = ((char) parsableByteArray2.f5667a[i13]) == ')' ? i7 : z3 ? 1 : 0;
                                            i13 = i16;
                                        }
                                        strTrim = parsableByteArray2.s((i13 + i6) - parsableByteArray2.f5668b, Charsets.f19705c).trim();
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
                                webvttCssStyle.f7399a = "";
                                webvttCssStyle.f7400b = "";
                                webvttCssStyle.f7401c = Collections.EMPTY_SET;
                                webvttCssStyle.d = "";
                                webvttCssStyle.f7402e = str;
                                webvttCssStyle.g = z3;
                                webvttCssStyle.f7404i = z3;
                                webvttCssStyle.j = i6;
                                webvttCssStyle.k = i6;
                                webvttCssStyle.f7405l = i6;
                                webvttCssStyle.m = i6;
                                webvttCssStyle.f7406n = i6;
                                webvttCssStyle.f7407p = i6;
                                webvttCssStyle.q = z3;
                                if (!"".equals(strTrim)) {
                                    int iIndexOf = strTrim.indexOf(91);
                                    if (iIndexOf != i6) {
                                        Matcher matcher4 = WebvttCssParser.f7396c.matcher(strTrim.substring(iIndexOf));
                                        if (matcher4.matches()) {
                                            String strGroup2 = matcher4.group(i7);
                                            strGroup2.getClass();
                                            webvttCssStyle.d = strGroup2;
                                        }
                                        strTrim = strTrim.substring(z3 ? 1 : 0, iIndexOf);
                                    }
                                    int i17 = Util.f5683a;
                                    String[] strArrSplit = strTrim.split("\\.", i6);
                                    String str2 = strArrSplit[z3 ? 1 : 0];
                                    int iIndexOf2 = str2.indexOf(35);
                                    if (iIndexOf2 != i6) {
                                        webvttCssStyle.f7400b = str2.substring(z3 ? 1 : 0, iIndexOf2);
                                        webvttCssStyle.f7399a = str2.substring(iIndexOf2 + i7);
                                    } else {
                                        webvttCssStyle.f7400b = str2;
                                    }
                                    if (strArrSplit.length > i7) {
                                        int length = strArrSplit.length;
                                        Assertions.b(length <= strArrSplit.length ? i7 : z3 ? 1 : 0);
                                        webvttCssStyle.f7401c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i7, length)));
                                    }
                                }
                                ?? r2 = z3 ? 1 : 0;
                                String strB2 = null;
                                while (r2 == 0) {
                                    int i18 = parsableByteArray2.f5668b;
                                    strB2 = WebvttCssParser.b(parsableByteArray2, sb);
                                    ?? r14 = (strB2 == null || "}".equals(strB2)) ? i7 : z3;
                                    if (r14 == 0) {
                                        parsableByteArray2.G(i18);
                                        WebvttCssParser.c(parsableByteArray2);
                                        String strA = WebvttCssParser.a(parsableByteArray2, sb);
                                        if (!"".equals(strA) && ":".equals(WebvttCssParser.b(parsableByteArray2, sb))) {
                                            WebvttCssParser.c(parsableByteArray2);
                                            StringBuilder sb2 = new StringBuilder();
                                            boolean z4 = false;
                                            while (true) {
                                                if (z4) {
                                                    string = sb2.toString();
                                                } else {
                                                    int i19 = parsableByteArray2.f5668b;
                                                    boolean z5 = z4;
                                                    String strB3 = WebvttCssParser.b(parsableByteArray2, sb);
                                                    if (strB3 == null) {
                                                        string = null;
                                                    } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                        parsableByteArray2.G(i19);
                                                        z4 = true;
                                                    } else {
                                                        sb2.append(strB3);
                                                        z4 = z5;
                                                    }
                                                }
                                            }
                                            if (string == null || "".equals(string)) {
                                                i5 = 1;
                                            } else {
                                                int i20 = parsableByteArray2.f5668b;
                                                String strB4 = WebvttCssParser.b(parsableByteArray2, sb);
                                                if (!";".equals(strB4)) {
                                                    if ("}".equals(strB4)) {
                                                        parsableByteArray2.G(i20);
                                                        if ("color".equals(strA)) {
                                                            i5 = 1;
                                                            webvttCssStyle.f = ColorParser.a(string, true);
                                                            webvttCssStyle.g = true;
                                                        } else {
                                                            i5 = 1;
                                                            if ("background-color".equals(strA)) {
                                                                webvttCssStyle.f7403h = ColorParser.a(string, true);
                                                                webvttCssStyle.f7404i = true;
                                                            } else if (!"ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    webvttCssStyle.f7407p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    webvttCssStyle.f7407p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if (!"all".equals(string) || string.startsWith("digits")) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                webvttCssStyle.q = z2;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if (TtmlNode.UNDERLINE.equals(string)) {
                                                                    i5 = 1;
                                                                    webvttCssStyle.k = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                webvttCssStyle.f7402e = Ascii.b(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                i5 = 1;
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
                                                                                        i5 = 1;
                                                                                        webvttCssStyle.f7406n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i5 = 1;
                                                                                        webvttCssStyle.f7406n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i5 = 1;
                                                                                        webvttCssStyle.f7406n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup3 = matcher.group(i5);
                                                                                strGroup3.getClass();
                                                                                webvttCssStyle.o = Float.parseFloat(strGroup3);
                                                                                break;
                                                                            case 3240:
                                                                                if (!strGroup.equals("em")) {
                                                                                    b2 = 1;
                                                                                }
                                                                                switch (b2) {
                                                                                    case 0:
                                                                                        i5 = 1;
                                                                                        webvttCssStyle.f7406n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i5 = 1;
                                                                                        webvttCssStyle.f7406n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i5 = 1;
                                                                                        webvttCssStyle.f7406n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup4 = matcher.group(i5);
                                                                                strGroup4.getClass();
                                                                                webvttCssStyle.o = Float.parseFloat(strGroup4);
                                                                                break;
                                                                            case 3592:
                                                                                if (!strGroup.equals("px")) {
                                                                                    b2 = 2;
                                                                                }
                                                                                switch (b2) {
                                                                                    case 0:
                                                                                        i5 = 1;
                                                                                        webvttCssStyle.f7406n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i5 = 1;
                                                                                        webvttCssStyle.f7406n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i5 = 1;
                                                                                        webvttCssStyle.f7406n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup5 = matcher.group(i5);
                                                                                strGroup5.getClass();
                                                                                webvttCssStyle.o = Float.parseFloat(strGroup5);
                                                                                break;
                                                                        }
                                                                        b2 = -1;
                                                                        switch (b2) {
                                                                            case 0:
                                                                                i5 = 1;
                                                                                webvttCssStyle.f7406n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i5 = 1;
                                                                                webvttCssStyle.f7406n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i5 = 1;
                                                                                webvttCssStyle.f7406n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String strGroup6 = matcher.group(i5);
                                                                        strGroup6.getClass();
                                                                        webvttCssStyle.o = Float.parseFloat(strGroup6);
                                                                    } else {
                                                                        Log.g("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                    }
                                                                }
                                                            } else if (TtmlNode.BOLD.equals(string)) {
                                                                i5 = 1;
                                                                webvttCssStyle.f7405l = 1;
                                                            }
                                                        }
                                                    }
                                                    i5 = 1;
                                                } else if ("color".equals(strA)) {
                                                    i5 = 1;
                                                    webvttCssStyle.f = ColorParser.a(string, true);
                                                    webvttCssStyle.g = true;
                                                } else {
                                                    i5 = 1;
                                                    if ("background-color".equals(strA)) {
                                                        webvttCssStyle.f7403h = ColorParser.a(string, true);
                                                        webvttCssStyle.f7404i = true;
                                                    } else if (!"ruby-position".equals(strA)) {
                                                        if ("text-combine-upright".equals(strA)) {
                                                            if ("all".equals(string)) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = true;
                                                            }
                                                            webvttCssStyle.q = z2;
                                                        } else if ("text-decoration".equals(strA)) {
                                                            if (TtmlNode.UNDERLINE.equals(string)) {
                                                                i5 = 1;
                                                                webvttCssStyle.k = 1;
                                                            }
                                                        } else if ("font-family".equals(strA)) {
                                                            webvttCssStyle.f7402e = Ascii.b(string);
                                                        } else if ("font-weight".equals(strA)) {
                                                            i5 = 1;
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
                                                                                    i5 = 1;
                                                                                    webvttCssStyle.f7406n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i5 = 1;
                                                                                    webvttCssStyle.f7406n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i5 = 1;
                                                                                    webvttCssStyle.f7406n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup7 = matcher.group(i5);
                                                                            strGroup7.getClass();
                                                                            webvttCssStyle.o = Float.parseFloat(strGroup7);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b2 = 1;
                                                                            }
                                                                            switch (b2) {
                                                                                case 0:
                                                                                    i5 = 1;
                                                                                    webvttCssStyle.f7406n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i5 = 1;
                                                                                    webvttCssStyle.f7406n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i5 = 1;
                                                                                    webvttCssStyle.f7406n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup8 = matcher.group(i5);
                                                                            strGroup8.getClass();
                                                                            webvttCssStyle.o = Float.parseFloat(strGroup8);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b2 = 2;
                                                                            }
                                                                            switch (b2) {
                                                                                case 0:
                                                                                    i5 = 1;
                                                                                    webvttCssStyle.f7406n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i5 = 1;
                                                                                    webvttCssStyle.f7406n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i5 = 1;
                                                                                    webvttCssStyle.f7406n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup9 = matcher.group(i5);
                                                                            strGroup9.getClass();
                                                                            webvttCssStyle.o = Float.parseFloat(strGroup9);
                                                                            break;
                                                                    }
                                                                    b2 = -1;
                                                                    switch (b2) {
                                                                        case 0:
                                                                            i5 = 1;
                                                                            webvttCssStyle.f7406n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i5 = 1;
                                                                            webvttCssStyle.f7406n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i5 = 1;
                                                                            webvttCssStyle.f7406n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup10 = matcher.group(i5);
                                                                    strGroup10.getClass();
                                                                    webvttCssStyle.o = Float.parseFloat(strGroup10);
                                                                }
                                                            }
                                                        } else if (TtmlNode.BOLD.equals(string)) {
                                                            i5 = 1;
                                                            webvttCssStyle.f7405l = 1;
                                                        }
                                                        i5 = 1;
                                                    } else if ("over".equals(string)) {
                                                        webvttCssStyle.f7407p = 1;
                                                    } else {
                                                        if ("under".equals(string)) {
                                                            webvttCssStyle.f7407p = 2;
                                                        }
                                                        i5 = 1;
                                                    }
                                                }
                                            }
                                        } else {
                                            i5 = i7;
                                        }
                                    } else {
                                        i5 = i7;
                                    }
                                    i7 = i5;
                                    r2 = r14;
                                    z3 = false;
                                }
                                int i21 = i7;
                                if ("}".equals(strB2)) {
                                    arrayList3.add(webvttCssStyle);
                                }
                                i7 = i21;
                                z3 = false;
                                i6 = -1;
                                str = null;
                            }
                        }
                        i4 = i7;
                        c2 = 2;
                        arrayList.addAll(arrayList3);
                    }
                    c3 = c2;
                    i7 = i4;
                    z3 = false;
                    i6 = -1;
                    webvttParser = this;
                }
            }
        } catch (ParserException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public final int c() {
        return 1;
    }
}
