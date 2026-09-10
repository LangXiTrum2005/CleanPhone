package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c8 implements q7 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f13079g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7 f13081b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashMap f13083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13084e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13085f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f13082c = new np0();

    public c8(List list) {
        if (list == null || list.isEmpty()) {
            this.f13080a = false;
            this.f13081b = null;
            return;
        }
        this.f13080a = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        ps1.v(str.startsWith("Format:"));
        t7 t7VarB = t7.b(str);
        t7VarB.getClass();
        this.f13081b = t7VarB;
        a(new np0((byte[]) list.get(1)), charset);
    }

    public static long c(String str) {
        Matcher matcher = f13079g.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String strGroup = matcher.group(1);
        String str2 = uu0.f20901a;
        long j10 = Long.parseLong(strGroup) * 3600000000L;
        long j11 = Long.parseLong(matcher.group(2)) * 60000000;
        return j10 + j11 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * Xa.f27908s);
    }

    public static int d(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x02d7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(np0 np0Var, Charset charset) {
        int i10;
        float f10;
        int i11;
        f8 f8Var;
        int i12;
        while (true) {
            String strN = np0Var.n(charset);
            if (strN == null) {
                return;
            }
            int i13 = 91;
            int i14 = 0;
            if ("[Script Info]".equalsIgnoreCase(strN)) {
                while (true) {
                    String strN2 = np0Var.n(charset);
                    if (strN2 == null) {
                        break;
                    }
                    if (np0Var.B() != 0) {
                        int iT = np0Var.t(charset);
                        if ((iT != 0 ? gc1.a(iT >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strN2.split(":");
                    if (strArrSplit.length == 2) {
                        String strE = x10.e(strArrSplit[0].trim());
                        switch (strE.hashCode()) {
                            case 1879649548:
                                if (strE.equals("playresx")) {
                                    this.f13084e = Float.parseFloat(strArrSplit[1].trim());
                                }
                                break;
                            case 1879649549:
                                if (strE.equals("playresy")) {
                                    try {
                                        this.f13085f = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                break;
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    d8 d8Var = null;
                    while (true) {
                        String strN3 = np0Var.n(charset);
                        if (strN3 != null) {
                            if (np0Var.B() != 0) {
                                int iT2 = np0Var.t(charset);
                                if ((iT2 != 0 ? gc1.a(iT2 >>> 8) : 1114112) == i13) {
                                }
                            }
                            if (strN3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strN3.substring(7), ",");
                                int i15 = i14;
                                int i16 = -1;
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i20 = -1;
                                int i21 = -1;
                                int i22 = -1;
                                int i23 = -1;
                                int i24 = -1;
                                int i25 = -1;
                                while (true) {
                                    int length = strArrSplit2.length;
                                    if (i15 < length) {
                                        String strE2 = x10.e(strArrSplit2[i15].trim());
                                        switch (strE2.hashCode()) {
                                            case -1178781136:
                                                if (strE2.equals(TtmlNode.ITALIC)) {
                                                    i22 = i15;
                                                }
                                                break;
                                            case -1026963764:
                                                if (strE2.equals(TtmlNode.UNDERLINE)) {
                                                    i23 = i15;
                                                }
                                                break;
                                            case -192095652:
                                                if (strE2.equals("strikeout")) {
                                                    i24 = i15;
                                                }
                                                break;
                                            case -70925746:
                                                if (strE2.equals("primarycolour")) {
                                                    i18 = i15;
                                                }
                                                break;
                                            case 3029637:
                                                if (strE2.equals(TtmlNode.BOLD)) {
                                                    i21 = i15;
                                                }
                                                break;
                                            case 3373707:
                                                if (strE2.equals("name")) {
                                                    i16 = i15;
                                                }
                                                break;
                                            case 366554320:
                                                if (strE2.equals("fontsize")) {
                                                    i20 = i15;
                                                }
                                                break;
                                            case 767321349:
                                                if (strE2.equals("borderstyle")) {
                                                    i25 = i15;
                                                }
                                                break;
                                            case 1767875043:
                                                if (strE2.equals("alignment")) {
                                                    i17 = i15;
                                                }
                                                break;
                                            case 1988365454:
                                                if (strE2.equals("outlinecolour")) {
                                                    i19 = i15;
                                                }
                                                break;
                                        }
                                        i15++;
                                    } else if (i16 != -1) {
                                        d8Var = new d8(i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, length);
                                    }
                                }
                            } else {
                                if (strN3.startsWith("Style:")) {
                                    if (d8Var == null) {
                                        v71.y("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strN3));
                                    } else {
                                        ps1.v(strN3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strN3.substring(6), ",");
                                        int length2 = strArrSplit3.length;
                                        int i26 = d8Var.f13457k;
                                        if (length2 != i26) {
                                            String str = uu0.f20901a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbL = l1.d.l("Skipping malformed 'Style:' line (expected ", i26, " values, found ", length2, "): '");
                                            sbL.append(strN3);
                                            sbL.append("'");
                                            v71.y("SsaStyle", sbL.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[d8Var.f13447a].trim();
                                                int i27 = d8Var.f13448b;
                                                if (i27 != -1) {
                                                    String strTrim2 = strArrSplit3[i27].trim();
                                                    try {
                                                        i12 = Integer.parseInt(strTrim2.trim());
                                                        switch (i12) {
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                            case 7:
                                                            case 8:
                                                            case 9:
                                                                break;
                                                            default:
                                                                v71.y("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(strTrim2)));
                                                                i12 = -1;
                                                                break;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i10 = i12;
                                                } else {
                                                    i10 = -1;
                                                }
                                                int i28 = d8Var.f13449c;
                                                Integer numA = i28 != -1 ? f8.a(strArrSplit3[i28].trim()) : null;
                                                int i29 = d8Var.f13450d;
                                                Integer numA2 = i29 != -1 ? f8.a(strArrSplit3[i29].trim()) : null;
                                                int i30 = d8Var.f13451e;
                                                if (i30 != -1) {
                                                    String strTrim3 = strArrSplit3[i30].trim();
                                                    try {
                                                        f10 = Float.parseFloat(strTrim3);
                                                    } catch (NumberFormatException e10) {
                                                        StringBuilder sb2 = new StringBuilder(String.valueOf(strTrim3).length() + 29);
                                                        sb2.append("Failed to parse font size: '");
                                                        sb2.append(strTrim3);
                                                        sb2.append("'");
                                                        v71.B("SsaStyle", sb2.toString(), e10);
                                                        f10 = -3.4028235E38f;
                                                    }
                                                } else {
                                                    f10 = -3.4028235E38f;
                                                }
                                                int i31 = d8Var.f13452f;
                                                boolean z10 = i31 != -1 && f8.b(strArrSplit3[i31].trim());
                                                int i32 = d8Var.f13453g;
                                                boolean z11 = i32 != -1 && f8.b(strArrSplit3[i32].trim());
                                                int i33 = d8Var.f13454h;
                                                boolean z12 = i33 != -1 && f8.b(strArrSplit3[i33].trim());
                                                int i34 = d8Var.f13455i;
                                                boolean z13 = i34 != -1 && f8.b(strArrSplit3[i34].trim());
                                                int i35 = d8Var.f13456j;
                                                if (i35 != -1) {
                                                    String strTrim4 = strArrSplit3[i35].trim();
                                                    try {
                                                        int i36 = Integer.parseInt(strTrim4.trim());
                                                        if (i36 == 1 || i36 == 3) {
                                                            i11 = i36;
                                                        } else {
                                                            v71.y("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim4)));
                                                            i11 = -1;
                                                        }
                                                    } catch (NumberFormatException unused3) {
                                                    }
                                                } else {
                                                    i11 = -1;
                                                }
                                                f8Var = new f8(strTrim, i10, numA, numA2, f10, z10, z11, z12, z13, i11);
                                            } catch (RuntimeException e11) {
                                                v71.B("SsaStyle", q4.a.j(new StringBuilder(strN3.length() + 36), "Skipping malformed 'Style:' line: '", strN3, "'"), e11);
                                                f8Var = null;
                                            }
                                            if (f8Var != null) {
                                                linkedHashMap.put(f8Var.f14306a, f8Var);
                                            }
                                        }
                                        f8Var = null;
                                        if (f8Var != null) {
                                            linkedHashMap.put(f8Var.f14306a, f8Var);
                                        }
                                    }
                                }
                                i13 = 91;
                                i14 = 0;
                            }
                        }
                    }
                }
                this.f13083d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strN)) {
                v71.r("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strN)) {
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:187:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:197:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[Catch: RuntimeException -> 0x01e1, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01e1, blocks: (B:75:0x01a3, B:77:0x01af, B:79:0x01b6, B:83:0x01cf, B:81:0x01c1), top: B:199:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c1 A[Catch: RuntimeException -> 0x01e1, TRY_ENTER, TryCatch #1 {RuntimeException -> 0x01e1, blocks: (B:75:0x01a3, B:77:0x01af, B:79:0x01b6, B:83:0x01cf, B:81:0x01c1), top: B:199:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf A[Catch: RuntimeException -> 0x01e1, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01e1, blocks: (B:75:0x01a3, B:77:0x01af, B:79:0x01b6, B:83:0x01cf, B:81:0x01c1), top: B:199:0x01a3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e1  */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x01be. Please report as an issue. */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.q7
    public final void b(int i10, int i11, b2.d0 d0Var, byte[] bArr) {
        t7 t7VarB;
        Charset charset;
        t7 t7Var;
        np0 np0Var;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        Layout.Alignment alignment;
        int i15;
        float f12;
        float f13;
        float f14;
        float f15;
        Integer num;
        Matcher matcher;
        int i16;
        String strGroup;
        PointF pointF;
        String strGroup2;
        String strGroup3;
        int i17;
        c8 c8Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        np0 np0Var2 = c8Var.f13082c;
        np0Var2.z(i10 + i11, bArr);
        np0Var2.E(i10);
        Charset charsetQ = np0Var2.q();
        if (charsetQ == null) {
            charsetQ = StandardCharsets.UTF_8;
        }
        if (c8Var.f13080a) {
            t7VarB = c8Var.f13081b;
        } else {
            c8Var.a(np0Var2, charsetQ);
            t7VarB = null;
        }
        while (true) {
            String strN = np0Var2.n(charsetQ);
            int i18 = 1;
            if (strN == null) {
                int i19 = 0;
                while (i19 < arrayList.size()) {
                    List list = (List) arrayList.get(i19);
                    if (!list.isEmpty()) {
                        if (i19 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i19)).longValue();
                        d0Var.mo161zza(new m7(list, jLongValue, ((Long) arrayList2.get(i19 + 1)).longValue() - jLongValue));
                    } else if (i19 == 0) {
                        i19 = 0;
                        if (i19 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue2 = ((Long) arrayList2.get(i19)).longValue();
                        d0Var.mo161zza(new m7(list, jLongValue2, ((Long) arrayList2.get(i19 + 1)).longValue() - jLongValue2));
                    }
                    i19++;
                }
                return;
            }
            if (strN.startsWith("Format:")) {
                t7VarB = t7.b(strN);
            } else {
                if (strN.startsWith("Dialogue:")) {
                    if (t7VarB == null) {
                        v71.y("SsaParser", "Skipping dialogue line before complete format: ".concat(strN));
                    } else {
                        int i20 = t7VarB.f20227a;
                        ps1.v(strN.startsWith("Dialogue:"));
                        String strSubstring = strN.substring(9);
                        int i21 = t7VarB.f20232f;
                        String[] strArrSplit = strSubstring.split(",", i21);
                        if (strArrSplit.length != i21) {
                            v71.y("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strN));
                        } else {
                            if (i20 != -1) {
                                try {
                                    i12 = Integer.parseInt(strArrSplit[i20].trim());
                                } catch (RuntimeException unused) {
                                    com.applovin.impl.ca.q(strArrSplit[i20], "Fail to parse layer: ", "SsaParser");
                                    i12 = 0;
                                }
                            } else {
                                i12 = 0;
                            }
                            long jC = c(strArrSplit[t7VarB.f20228b]);
                            if (jC == C.TIME_UNSET) {
                                v71.y("SsaParser", "Skipping invalid timing: ".concat(strN));
                                charset = charsetQ;
                                t7Var = t7VarB;
                                np0Var = np0Var2;
                            } else {
                                long jC2 = c(strArrSplit[t7VarB.f20229c]);
                                if (jC2 == C.TIME_UNSET || jC2 <= jC) {
                                    charset = charsetQ;
                                    t7Var = t7VarB;
                                    np0Var = np0Var2;
                                    v71.y("SsaParser", "Skipping invalid timing: ".concat(strN));
                                } else {
                                    LinkedHashMap linkedHashMap = c8Var.f13083d;
                                    f8 f8Var = (linkedHashMap == null || (i17 = t7VarB.f20230d) == -1) ? null : (f8) linkedHashMap.get(strArrSplit[i17].trim());
                                    String str = strArrSplit[t7VarB.f20231e];
                                    Matcher matcher2 = e8.f13871a.matcher(str);
                                    PointF pointF2 = null;
                                    int i22 = -1;
                                    while (matcher2.find()) {
                                        String strGroup4 = matcher2.group(i18);
                                        strGroup4.getClass();
                                        charsetQ = charsetQ;
                                        try {
                                            Matcher matcher3 = e8.f13872b.matcher(strGroup4);
                                            t7VarB = t7VarB;
                                            try {
                                                Matcher matcher4 = e8.f13873c.matcher(strGroup4);
                                                boolean zFind = matcher3.find();
                                                boolean zFind2 = matcher4.find();
                                                if (zFind) {
                                                    if (zFind2) {
                                                        np0Var2 = np0Var2;
                                                        matcher2 = matcher2;
                                                        try {
                                                            StringBuilder sb2 = new StringBuilder(strGroup4.length() + 82);
                                                            sb2.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                                                            sb2.append(strGroup4);
                                                            sb2.append("'");
                                                            v71.r("SsaStyle.Overrides", sb2.toString());
                                                        } catch (RuntimeException unused2) {
                                                        }
                                                    } else {
                                                        np0Var2 = np0Var2;
                                                        matcher2 = matcher2;
                                                    }
                                                    strGroup2 = matcher3.group(1);
                                                    strGroup3 = matcher3.group(2);
                                                } else {
                                                    np0Var2 = np0Var2;
                                                    matcher2 = matcher2;
                                                    if (zFind2) {
                                                        String strGroup5 = matcher4.group(1);
                                                        String strGroup6 = matcher4.group(2);
                                                        strGroup2 = strGroup5;
                                                        strGroup3 = strGroup6;
                                                    } else {
                                                        pointF = null;
                                                    }
                                                    if (pointF != null) {
                                                        pointF2 = pointF;
                                                    }
                                                    try {
                                                        matcher = e8.f13874d.matcher(strGroup4);
                                                        if (!matcher.find()) {
                                                            strGroup = matcher.group(1);
                                                            if (strGroup != null) {
                                                                throw null;
                                                            }
                                                            try {
                                                                i16 = Integer.parseInt(strGroup.trim());
                                                                switch (i16) {
                                                                    case 1:
                                                                    case 2:
                                                                    case 3:
                                                                    case 4:
                                                                    case 5:
                                                                    case 6:
                                                                    case 7:
                                                                    case 8:
                                                                    case 9:
                                                                        break;
                                                                    default:
                                                                        v71.y("SsaStyle", "Ignoring unknown alignment: ".concat(strGroup));
                                                                        i16 = -1;
                                                                        break;
                                                                }
                                                            } catch (NumberFormatException unused3) {
                                                            }
                                                        } else {
                                                            i16 = -1;
                                                        }
                                                        if (i16 != -1) {
                                                            i22 = i16;
                                                        }
                                                    } catch (RuntimeException unused4) {
                                                    }
                                                    i18 = 1;
                                                }
                                                if (strGroup2 == null) {
                                                    throw null;
                                                }
                                                float f16 = Float.parseFloat(strGroup2.trim());
                                                if (strGroup3 == null) {
                                                    throw null;
                                                }
                                                pointF = new PointF(f16, Float.parseFloat(strGroup3.trim()));
                                                if (pointF != null) {
                                                    pointF2 = pointF;
                                                }
                                                matcher = e8.f13874d.matcher(strGroup4);
                                                if (!matcher.find()) {
                                                    strGroup = matcher.group(1);
                                                    if (strGroup != null) {
                                                        throw null;
                                                    }
                                                    i16 = Integer.parseInt(strGroup.trim());
                                                    switch (i16) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            break;
                                                        default:
                                                            v71.y("SsaStyle", "Ignoring unknown alignment: ".concat(strGroup));
                                                            i16 = -1;
                                                            break;
                                                    }
                                                } else {
                                                    i16 = -1;
                                                }
                                                if (i16 != -1) {
                                                    i22 = i16;
                                                }
                                                i18 = 1;
                                            } catch (RuntimeException unused5) {
                                                np0Var2 = np0Var2;
                                                matcher2 = matcher2;
                                            }
                                        } catch (RuntimeException unused6) {
                                            t7VarB = t7VarB;
                                        }
                                    }
                                    charset = charsetQ;
                                    t7Var = t7VarB;
                                    np0Var = np0Var2;
                                    String strReplace = e8.f13871a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f17 = c8Var.f13084e;
                                    float f18 = c8Var.f13085f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (f8Var != null) {
                                        boolean z10 = f8Var.f14312g;
                                        Integer num2 = f8Var.f14308c;
                                        if (num2 != null) {
                                            f10 = -3.4028235E38f;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            f10 = -3.4028235E38f;
                                        }
                                        if (f8Var.f14315j == 3 && (num = f8Var.f14309d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f19 = f8Var.f14310e;
                                        if (f19 == f10 || f18 == f10) {
                                            f15 = -3.4028235E38f;
                                            i14 = Integer.MIN_VALUE;
                                        } else {
                                            f15 = f19 / f18;
                                            i14 = 1;
                                        }
                                        boolean z11 = f8Var.f14311f;
                                        if (z11 && z10) {
                                            i13 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i13 = 0;
                                            if (z11) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z10) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (f8Var.f14313h) {
                                            spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), 33);
                                        }
                                        if (f8Var.f14314i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), 33);
                                        }
                                        f11 = f15;
                                    } else {
                                        i13 = 0;
                                        f10 = -3.4028235E38f;
                                        f11 = -3.4028235E38f;
                                        i14 = Integer.MIN_VALUE;
                                    }
                                    if (i22 == -1) {
                                        i22 = f8Var != null ? f8Var.f14307b : -1;
                                    }
                                    switch (i22) {
                                        case 0:
                                        default:
                                            com.applovin.impl.ca.p(com.applovin.impl.ca.e(i22, 19), i22, "Unknown alignment: ", "SsaParser");
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
                                    int i23 = Integer.MIN_VALUE;
                                    switch (i22) {
                                        case 0:
                                        default:
                                            com.applovin.impl.ca.p(com.applovin.impl.ca.e(i22, 19), i22, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            i15 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i15 = i13;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i15 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i15 = 2;
                                            break;
                                    }
                                    switch (i22) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            com.applovin.impl.ca.p(com.applovin.impl.ca.e(i22, 19), i22, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i23 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i23 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i23 = i13;
                                            break;
                                    }
                                    if (pointF2 == 0 || f18 == f10 || f17 == f10) {
                                        float f20 = 0.05f;
                                        if (i15 == 0) {
                                            f12 = 0.05f;
                                        } else if (i15 != 1) {
                                            f12 = i15 != 2 ? f10 : 0.95f;
                                        } else {
                                            f12 = 0.5f;
                                        }
                                        if (i23 != 0) {
                                            f20 = i23 != 1 ? i23 != 2 ? f10 : 0.95f : 0.5f;
                                        }
                                        f13 = f12;
                                        f14 = f20;
                                    } else {
                                        f13 = pointF2.x / f17;
                                        f14 = pointF2.y / f18;
                                    }
                                    l80 l80Var = new l80(spannableString, alignment, null, null, f14, i13, i23, f13, i15, i14, f11, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i12);
                                    int iD = d(jC2, arrayList2, arrayList);
                                    for (int iD2 = d(jC, arrayList2, arrayList); iD2 < iD; iD2++) {
                                        ((List) arrayList.get(iD2)).add(l80Var);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetQ;
                    t7Var = t7VarB;
                    np0Var = np0Var2;
                } else {
                    charset = charsetQ;
                    t7Var = t7VarB;
                    np0Var = np0Var2;
                }
                c8Var = this;
                charsetQ = charset;
                t7VarB = t7Var;
                np0Var2 = np0Var;
            }
        }
    }
}
