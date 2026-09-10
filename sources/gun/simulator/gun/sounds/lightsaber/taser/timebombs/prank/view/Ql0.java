package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class Ql0 extends R60 {
    public final JT m = new JT();
    public final Il0 n = new Il0();

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
    /* JADX WARN: Code duplicated, block: B:151:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:155:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:156:0x02be  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:163:0x02de  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:171:0x0300  */
    /* JADX WARN: Code duplicated, block: B:173:0x0310  */
    /* JADX WARN: Code duplicated, block: B:174:0x0314  */
    /* JADX WARN: Code duplicated, block: B:177:0x0325  */
    /* JADX WARN: Code duplicated, block: B:180:0x032e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0330  */
    /* JADX WARN: Code duplicated, block: B:184:0x0339  */
    /* JADX WARN: Code duplicated, block: B:185:0x033b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0344  */
    /* JADX WARN: Code duplicated, block: B:192:0x034e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0353  */
    /* JADX WARN: Code duplicated, block: B:194:0x0358  */
    /* JADX WARN: Code duplicated, block: B:196:0x036b  */
    /* JADX WARN: Code duplicated, block: B:237:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R60
    public final InterfaceC4495ra0 b(byte[] bArr, int i, boolean z) throws C4671ta0 {
        Kl0 kl0D;
        String strTrim;
        String str;
        String string;
        Matcher matcher;
        String strGroup;
        byte b;
        int i2;
        boolean z2;
        String strSubstring;
        Ql0 ql0 = this;
        JT jt = ql0.m;
        jt.C(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            Sl0.d(jt);
            while (!TextUtils.isEmpty(jt.g(AbstractC2333Ce.c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ?? r4 = 0;
                int i3 = -1;
                byte b2 = -1;
                int i4 = 0;
                while (true) {
                    int i5 = 1;
                    if (b2 == -1) {
                        i4 = jt.b;
                        String strG = jt.g(AbstractC2333Ce.c);
                        if (strG == null) {
                            b2 = 0;
                        } else if ("STYLE".equals(strG)) {
                            b2 = 2;
                        } else {
                            b2 = strG.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                        }
                    } else {
                        jt.E(i4);
                        if (b2 == 0) {
                            return new Tl0(arrayList2);
                        }
                        if (b2 == 1) {
                            while (!TextUtils.isEmpty(jt.g(AbstractC2333Ce.c))) {
                            }
                        } else {
                            String str2 = null;
                            if (b2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new C4671ta0("A style block was found after the first cue.", 0);
                                }
                                jt.g(AbstractC2333Ce.c);
                                Il0 il0 = ql0.n;
                                StringBuilder sb = il0.b;
                                sb.setLength(0);
                                int i6 = jt.b;
                                while (!TextUtils.isEmpty(jt.g(AbstractC2333Ce.c))) {
                                }
                                byte[] bArr2 = jt.f3266a;
                                int i7 = jt.b;
                                JT jt2 = il0.f3237a;
                                jt2.C(bArr2, i7);
                                jt2.E(i6);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    Il0.c(jt2);
                                    if (jt2.a() >= 5 && "::cue".equals(jt2.r(5, AbstractC2333Ce.c))) {
                                        int i8 = jt2.b;
                                        String strB = Il0.b(jt2, sb);
                                        if (strB == null) {
                                            str = str2;
                                        } else if ("{".equals(strB)) {
                                            jt2.E(i8);
                                            str = "";
                                        } else {
                                            if ("(".equals(strB)) {
                                                int i9 = jt2.b;
                                                int i10 = jt2.c;
                                                boolean z3 = false;
                                                while (i9 < i10 && !z3) {
                                                    int i11 = i9 + 1;
                                                    boolean z4 = ((char) jt2.f3266a[i9]) == ')';
                                                    i9 = i11;
                                                    z3 = z4;
                                                }
                                                strTrim = jt2.r((i9 - 1) - jt2.b, AbstractC2333Ce.c).trim();
                                            } else {
                                                strTrim = str2;
                                            }
                                            str = strTrim;
                                            if (!")".equals(Il0.b(jt2, sb))) {
                                                str = str2;
                                            }
                                        }
                                    } else {
                                        str = str2;
                                    }
                                    if (str != 0 && "{".equals(Il0.b(jt2, sb))) {
                                        Jl0 jl0 = new Jl0();
                                        jl0.f3281a = "";
                                        jl0.b = "";
                                        jl0.c = Collections.emptySet();
                                        jl0.d = "";
                                        jl0.e = str2;
                                        jl0.g = r4;
                                        jl0.i = r4;
                                        jl0.j = i3;
                                        jl0.k = i3;
                                        jl0.l = i3;
                                        jl0.m = i3;
                                        jl0.n = i3;
                                        jl0.p = i3;
                                        jl0.q = r4;
                                        if (!"".equals(str)) {
                                            int iIndexOf = str.indexOf(91);
                                            if (iIndexOf != i3) {
                                                Matcher matcher2 = Il0.c.matcher(str.substring(iIndexOf));
                                                if (matcher2.matches()) {
                                                    strSubstring = str;
                                                    String strGroup2 = matcher2.group(i5);
                                                    strGroup2.getClass();
                                                    jl0.d = strGroup2;
                                                }
                                                strSubstring = str;
                                                strSubstring = str.substring(r4, iIndexOf);
                                            }
                                            strSubstring = str;
                                            int i12 = Ug0.f3833a;
                                            String[] strArrSplit = strSubstring.split("\\.", i3);
                                            String str3 = strArrSplit[r4];
                                            int iIndexOf2 = str3.indexOf(35);
                                            if (iIndexOf2 != i3) {
                                                jl0.b = str3.substring(r4, iIndexOf2);
                                                jl0.f3281a = str3.substring(iIndexOf2 + 1);
                                            } else {
                                                jl0.b = str3;
                                            }
                                            if (strArrSplit.length > i5) {
                                                int length = strArrSplit.length;
                                                FW.h(length <= strArrSplit.length);
                                                jl0.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i5, length)));
                                            }
                                        }
                                        boolean z5 = false;
                                        String strB2 = null;
                                        while (!z5) {
                                            int i13 = jt2.b;
                                            strB2 = Il0.b(jt2, sb);
                                            boolean z6 = strB2 == null || "}".equals(strB2);
                                            if (!z6) {
                                                jt2.E(i13);
                                                Il0.c(jt2);
                                                String strA = Il0.a(jt2, sb);
                                                if (!"".equals(strA) && ":".equals(Il0.b(jt2, sb))) {
                                                    Il0.c(jt2);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    boolean z7 = false;
                                                    while (true) {
                                                        if (z7) {
                                                            string = sb2.toString();
                                                        } else {
                                                            int i14 = jt2.b;
                                                            boolean z8 = z7;
                                                            String strB3 = Il0.b(jt2, sb);
                                                            if (strB3 == null) {
                                                                string = null;
                                                            } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                                jt2.E(i14);
                                                                z7 = true;
                                                            } else {
                                                                sb2.append(strB3);
                                                                z7 = z8;
                                                            }
                                                        }
                                                    }
                                                    if (string != null && !"".equals(string)) {
                                                        int i15 = jt2.b;
                                                        String strB4 = Il0.b(jt2, sb);
                                                        if (";".equals(strB4)) {
                                                            if ("color".equals(strA)) {
                                                                jl0.f = AbstractC2931Zf.a(string, true);
                                                                jl0.g = true;
                                                            } else if ("background-color".equals(strA)) {
                                                                jl0.h = AbstractC2931Zf.a(string, true);
                                                                jl0.i = true;
                                                            } else if ("ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    jl0.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    jl0.p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string)) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = true;
                                                                }
                                                                jl0.q = z2;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if (TtmlNode.UNDERLINE.equals(string)) {
                                                                    jl0.k = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                jl0.e = FW.h0(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                if (TtmlNode.BOLD.equals(string)) {
                                                                    jl0.l = 1;
                                                                }
                                                            } else if ("font-style".equals(strA)) {
                                                                if (TtmlNode.ITALIC.equals(string)) {
                                                                    jl0.m = 1;
                                                                }
                                                            } else if ("font-size".equals(strA)) {
                                                                matcher = Il0.d.matcher(FW.h0(string));
                                                                if (matcher.matches()) {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case 37:
                                                                            if (!strGroup.equals("%")) {
                                                                                b = 0;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i2 = 1;
                                                                                    jl0.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i2 = 1;
                                                                                    jl0.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i2 = 1;
                                                                                    jl0.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup3 = matcher.group(i2);
                                                                            strGroup3.getClass();
                                                                            jl0.o = Float.parseFloat(strGroup3);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b = 1;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i2 = 1;
                                                                                    jl0.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i2 = 1;
                                                                                    jl0.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i2 = 1;
                                                                                    jl0.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup4 = matcher.group(i2);
                                                                            strGroup4.getClass();
                                                                            jl0.o = Float.parseFloat(strGroup4);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b = 2;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i2 = 1;
                                                                                    jl0.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i2 = 1;
                                                                                    jl0.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i2 = 1;
                                                                                    jl0.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup5 = matcher.group(i2);
                                                                            strGroup5.getClass();
                                                                            jl0.o = Float.parseFloat(strGroup5);
                                                                            break;
                                                                    }
                                                                    b = -1;
                                                                    switch (b) {
                                                                        case 0:
                                                                            i2 = 1;
                                                                            jl0.n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i2 = 1;
                                                                            jl0.n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i2 = 1;
                                                                            jl0.n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup6 = matcher.group(i2);
                                                                    strGroup6.getClass();
                                                                    jl0.o = Float.parseFloat(strGroup6);
                                                                } else {
                                                                    AbstractC4038mJ.f();
                                                                }
                                                            }
                                                        } else if ("}".equals(strB4)) {
                                                            jt2.E(i15);
                                                            if ("color".equals(strA)) {
                                                                jl0.f = AbstractC2931Zf.a(string, true);
                                                                jl0.g = true;
                                                            } else if ("background-color".equals(strA)) {
                                                                jl0.h = AbstractC2931Zf.a(string, true);
                                                                jl0.i = true;
                                                            } else if ("ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    jl0.p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    jl0.p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string) || string.startsWith("digits")) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                jl0.q = z2;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if (TtmlNode.UNDERLINE.equals(string)) {
                                                                    jl0.k = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                jl0.e = FW.h0(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                if (TtmlNode.BOLD.equals(string)) {
                                                                    jl0.l = 1;
                                                                }
                                                            } else if ("font-style".equals(strA)) {
                                                                if (TtmlNode.ITALIC.equals(string)) {
                                                                    jl0.m = 1;
                                                                }
                                                            } else if ("font-size".equals(strA)) {
                                                                matcher = Il0.d.matcher(FW.h0(string));
                                                                if (matcher.matches()) {
                                                                    AbstractC4038mJ.f();
                                                                } else {
                                                                    strGroup = matcher.group(2);
                                                                    strGroup.getClass();
                                                                    switch (strGroup.hashCode()) {
                                                                        case 37:
                                                                            if (!strGroup.equals("%")) {
                                                                                b = 0;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i2 = 1;
                                                                                    jl0.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i2 = 1;
                                                                                    jl0.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i2 = 1;
                                                                                    jl0.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup7 = matcher.group(i2);
                                                                            strGroup7.getClass();
                                                                            jl0.o = Float.parseFloat(strGroup7);
                                                                            break;
                                                                        case 3240:
                                                                            if (!strGroup.equals("em")) {
                                                                                b = 1;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i2 = 1;
                                                                                    jl0.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i2 = 1;
                                                                                    jl0.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i2 = 1;
                                                                                    jl0.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup8 = matcher.group(i2);
                                                                            strGroup8.getClass();
                                                                            jl0.o = Float.parseFloat(strGroup8);
                                                                            break;
                                                                        case 3592:
                                                                            if (!strGroup.equals("px")) {
                                                                                b = 2;
                                                                            }
                                                                            switch (b) {
                                                                                case 0:
                                                                                    i2 = 1;
                                                                                    jl0.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i2 = 1;
                                                                                    jl0.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i2 = 1;
                                                                                    jl0.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    throw new IllegalStateException();
                                                                            }
                                                                            String strGroup9 = matcher.group(i2);
                                                                            strGroup9.getClass();
                                                                            jl0.o = Float.parseFloat(strGroup9);
                                                                            break;
                                                                    }
                                                                    b = -1;
                                                                    switch (b) {
                                                                        case 0:
                                                                            i2 = 1;
                                                                            jl0.n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i2 = 1;
                                                                            jl0.n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i2 = 1;
                                                                            jl0.n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup10 = matcher.group(i2);
                                                                    strGroup10.getClass();
                                                                    jl0.o = Float.parseFloat(strGroup10);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z5 = z6;
                                        }
                                        if ("}".equals(strB2)) {
                                            arrayList3.add(jl0);
                                        }
                                        r4 = 0;
                                        i3 = -1;
                                        str2 = null;
                                        i5 = 1;
                                    }
                                }
                                arrayList.addAll(arrayList3);
                            } else if (b2 == 3) {
                                Pattern pattern = Pl0.f3571a;
                                Charset charset = AbstractC2333Ce.c;
                                String strG2 = jt.g(charset);
                                if (strG2 == null) {
                                    kl0D = null;
                                } else {
                                    Pattern pattern2 = Pl0.f3571a;
                                    Matcher matcher3 = pattern2.matcher(strG2);
                                    if (matcher3.matches()) {
                                        kl0D = Pl0.d(null, matcher3, jt, arrayList);
                                    } else {
                                        kl0D = null;
                                        String strG3 = jt.g(charset);
                                        if (strG3 != null) {
                                            Matcher matcher4 = pattern2.matcher(strG3);
                                            if (matcher4.matches()) {
                                                kl0D = Pl0.d(strG2.trim(), matcher4, jt, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (kl0D != null) {
                                    arrayList2.add(kl0D);
                                }
                            }
                            ql0 = this;
                        }
                    }
                }
            }
        } catch (KT e) {
            throw new C4671ta0(e);
        }
    }
}
