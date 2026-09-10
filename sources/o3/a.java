package o3;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.ads.d8;
import com.google.android.gms.internal.ads.t7;
import com.google.android.gms.internal.play_billing.q1;
import com.ironsource.Xa;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import d5.u;
import go.k;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.l;
import k3.m;
import l1.d;
import l1.g;
import l1.q;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f47074g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t7 f47076b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashMap f47078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f47079e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f47080f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f47077c = new q();

    public a(List list) {
        if (list == null || list.isEmpty()) {
            this.f47075a = false;
            this.f47076b = null;
            return;
        }
        this.f47075a = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        k.i(str.startsWith("Format:"));
        t7 t7VarA = t7.a(str);
        t7VarA.getClass();
        this.f47076b = t7VarA;
        b(new q((byte[]) list.get(1)), charset);
    }

    public static int a(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
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
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long c(String str) {
        Matcher matcher = f47074g.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String strGroup = matcher.group(1);
        String str2 = y.f44830a;
        return (Long.parseLong(matcher.group(4)) * Xa.f27908s) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02e8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(q qVar, Charset charset) {
        int i10;
        c cVar;
        while (true) {
            String strN = qVar.n(charset);
            if (strN == null) {
                return;
            }
            int i11 = 0;
            int i12 = 91;
            if ("[Script Info]".equalsIgnoreCase(strN)) {
                while (true) {
                    String strN2 = qVar.n(charset);
                    if (strN2 == null) {
                        break;
                    }
                    if (qVar.a() != 0) {
                        int iH = qVar.h(charset);
                        if ((iH != 0 ? com.bumptech.glide.c.c(iH >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strN2.split(":");
                    if (strArrSplit.length == 2) {
                        String strF = q1.F(strArrSplit[0].trim());
                        strF.getClass();
                        if (strF.equals("playresx")) {
                            this.f47079e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strF.equals("playresy")) {
                            try {
                                this.f47080f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strN)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                d8 d8Var = null;
                while (true) {
                    String strN3 = qVar.n(charset);
                    if (strN3 != null) {
                        if (qVar.a() != 0) {
                            int iH2 = qVar.h(charset);
                            if ((iH2 != 0 ? com.bumptech.glide.c.c(iH2 >>> 8) : 1114112) == i12) {
                            }
                        }
                        int i13 = -1;
                        if (strN3.startsWith("Format:")) {
                            String[] strArrSplit2 = TextUtils.split(strN3.substring(7), ",");
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = -1;
                            int i17 = -1;
                            int i18 = -1;
                            int i19 = -1;
                            int i20 = -1;
                            int i21 = -1;
                            int i22 = -1;
                            int i23 = -1;
                            for (int i24 = i11; i24 < strArrSplit2.length; i24++) {
                                String strF2 = q1.F(strArrSplit2[i24].trim());
                                strF2.getClass();
                                switch (strF2.hashCode()) {
                                    case -1178781136:
                                        i10 = strF2.equals(TtmlNode.ITALIC) ? i11 : -1;
                                        break;
                                    case -1026963764:
                                        i10 = strF2.equals(TtmlNode.UNDERLINE) ? 1 : -1;
                                        break;
                                    case -192095652:
                                        i10 = strF2.equals("strikeout") ? 2 : -1;
                                        break;
                                    case -70925746:
                                        i10 = strF2.equals("primarycolour") ? 3 : -1;
                                        break;
                                    case 3029637:
                                        i10 = strF2.equals(TtmlNode.BOLD) ? 4 : -1;
                                        break;
                                    case 3373707:
                                        i10 = strF2.equals("name") ? 5 : -1;
                                        break;
                                    case 366554320:
                                        i10 = strF2.equals("fontsize") ? 6 : -1;
                                        break;
                                    case 767321349:
                                        i10 = strF2.equals("borderstyle") ? 7 : -1;
                                        break;
                                    case 1767875043:
                                        i10 = strF2.equals("alignment") ? 8 : -1;
                                        break;
                                    case 1988365454:
                                        i10 = strF2.equals("outlinecolour") ? 9 : -1;
                                        break;
                                    default:
                                        i10 = -1;
                                        break;
                                }
                                switch (i10) {
                                    case 0:
                                        i20 = i24;
                                        break;
                                    case 1:
                                        i21 = i24;
                                        break;
                                    case 2:
                                        i22 = i24;
                                        break;
                                    case 3:
                                        i16 = i24;
                                        break;
                                    case 4:
                                        i19 = i24;
                                        break;
                                    case 5:
                                        i14 = i24;
                                        break;
                                    case 6:
                                        i18 = i24;
                                        break;
                                    case 7:
                                        i23 = i24;
                                        break;
                                    case 8:
                                        i15 = i24;
                                        break;
                                    case 9:
                                        i17 = i24;
                                        break;
                                }
                            }
                            d8Var = i14 != -1 ? new d8(i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, strArrSplit2.length) : null;
                        } else {
                            if (strN3.startsWith("Style:")) {
                                if (d8Var == null) {
                                    l1.a.s("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strN3));
                                } else {
                                    k.i(strN3.startsWith("Style:"));
                                    String[] strArrSplit3 = TextUtils.split(strN3.substring(6), ",");
                                    int length = strArrSplit3.length;
                                    int i25 = d8Var.f13457k;
                                    if (length != i25) {
                                        int length2 = strArrSplit3.length;
                                        String str = y.f44830a;
                                        Locale locale = Locale.US;
                                        StringBuilder sbL = d.l("Skipping malformed 'Style:' line (expected ", i25, " values, found ", length2, "): '");
                                        sbL.append(strN3);
                                        sbL.append("'");
                                        l1.a.s("SsaStyle", sbL.toString());
                                    } else {
                                        try {
                                            String strTrim = strArrSplit3[d8Var.f13447a].trim();
                                            int i26 = d8Var.f13448b;
                                            int iA = i26 != -1 ? c.a(strArrSplit3[i26].trim()) : -1;
                                            int i27 = d8Var.f13449c;
                                            Integer numC = i27 != -1 ? c.c(strArrSplit3[i27].trim()) : null;
                                            int i28 = d8Var.f13450d;
                                            Integer numC2 = i28 != -1 ? c.c(strArrSplit3[i28].trim()) : null;
                                            int i29 = d8Var.f13451e;
                                            float f10 = -3.4028235E38f;
                                            if (i29 != -1) {
                                                String strTrim2 = strArrSplit3[i29].trim();
                                                try {
                                                    f10 = Float.parseFloat(strTrim2);
                                                } catch (NumberFormatException e10) {
                                                    l1.a.t("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e10);
                                                }
                                            }
                                            float f11 = f10;
                                            int i30 = d8Var.f13452f;
                                            boolean z10 = i30 != -1 && c.b(strArrSplit3[i30].trim());
                                            int i31 = d8Var.f13453g;
                                            boolean z11 = i31 != -1 && c.b(strArrSplit3[i31].trim());
                                            int i32 = d8Var.f13454h;
                                            boolean z12 = i32 != -1 && c.b(strArrSplit3[i32].trim());
                                            int i33 = d8Var.f13455i;
                                            boolean z13 = i33 != -1 && c.b(strArrSplit3[i33].trim());
                                            int i34 = d8Var.f13456j;
                                            if (i34 != -1) {
                                                String strTrim3 = strArrSplit3[i34].trim();
                                                try {
                                                    int i35 = Integer.parseInt(strTrim3.trim());
                                                    if (i35 == 1 || i35 == 3) {
                                                        i13 = i35;
                                                    } else {
                                                        l1.a.s("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            cVar = new c(strTrim, iA, numC, numC2, f11, z10, z11, z12, z13, i13);
                                        } catch (RuntimeException e11) {
                                            l1.a.t("SsaStyle", "Skipping malformed 'Style:' line: '" + strN3 + "'", e11);
                                            cVar = null;
                                        }
                                        if (cVar != null) {
                                            linkedHashMap.put(cVar.f47085a, cVar);
                                        }
                                    }
                                    cVar = null;
                                    if (cVar != null) {
                                        linkedHashMap.put(cVar.f47085a, cVar);
                                    }
                                }
                            }
                            i11 = 0;
                            i12 = 91;
                        }
                    }
                }
                this.f47078d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strN)) {
                l1.a.j("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strN)) {
                return;
            }
        }
    }

    @Override // k3.m
    public final void e(byte[] bArr, int i10, int i11, l lVar, g gVar) {
        Charset charset;
        q qVar;
        long j10;
        int i12;
        int i13;
        float f10;
        int i14;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i15;
        int i16;
        int i17;
        float f11;
        float f12;
        float f13;
        int i18;
        int i19;
        float f14;
        int i20;
        int i21;
        float f15;
        int i22;
        int iA;
        int i23;
        a aVar = this;
        long j11 = lVar.f44296a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        q qVar2 = aVar.f47077c;
        qVar2.K(bArr, i10 + i11);
        qVar2.M(i10);
        Charset charsetI = qVar2.I();
        if (charsetI == null) {
            charsetI = StandardCharsets.UTF_8;
        }
        boolean z10 = aVar.f47075a;
        if (!z10) {
            aVar.b(qVar2, charsetI);
        }
        t7 t7VarA = z10 ? aVar.f47076b : null;
        while (true) {
            String strN = qVar2.n(charsetI);
            if (strN == null) {
                long j12 = j11;
                ArrayList arrayList3 = (j12 == C.TIME_UNSET || !lVar.f44297b) ? null : new ArrayList();
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    List list = (List) arrayList.get(i24);
                    if (!list.isEmpty() || i24 == 0) {
                        if (i24 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i24)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i24 + 1)).longValue();
                        k3.a aVar2 = new k3.a(list, jLongValue, jLongValue2 - jLongValue);
                        if (j12 == C.TIME_UNSET || jLongValue2 >= j12) {
                            gVar.accept(aVar2);
                        } else if (arrayList3 != null) {
                            arrayList3.add(aVar2);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        gVar.accept((k3.a) it.next());
                    }
                    return;
                }
                return;
            }
            if (strN.startsWith("Format:")) {
                t7VarA = t7.a(strN);
            } else {
                if (strN.startsWith("Dialogue:")) {
                    if (t7VarA == null) {
                        l1.a.s("SsaParser", "Skipping dialogue line before complete format: ".concat(strN));
                    } else {
                        int i25 = t7VarA.f20232f;
                        k.i(strN.startsWith("Dialogue:"));
                        String strSubstring = strN.substring(9);
                        int i26 = t7VarA.f20227a;
                        String[] strArrSplit = strSubstring.split(",", i25);
                        if (strArrSplit.length != i25) {
                            l1.a.s("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strN));
                        } else {
                            if (i26 != -1) {
                                try {
                                    i12 = Integer.parseInt(strArrSplit[i26].trim());
                                } catch (RuntimeException unused) {
                                    l1.a.s("SsaParser", "Fail to parse layer: " + strArrSplit[i26]);
                                    i12 = 0;
                                }
                            } else {
                                i12 = 0;
                            }
                            long jC = c(strArrSplit[t7VarA.f20228b]);
                            charset = charsetI;
                            if (jC == C.TIME_UNSET) {
                                l1.a.s("SsaParser", "Skipping invalid timing: ".concat(strN));
                                j10 = j11;
                                qVar = qVar2;
                            } else {
                                j10 = j11;
                                long jC2 = c(strArrSplit[t7VarA.f20229c]);
                                if (jC2 == C.TIME_UNSET || jC2 <= jC) {
                                    qVar = qVar2;
                                    l1.a.s("SsaParser", "Skipping invalid timing: ".concat(strN));
                                } else {
                                    LinkedHashMap linkedHashMap = aVar.f47078d;
                                    c cVar = (linkedHashMap == null || (i23 = t7VarA.f20230d) == -1) ? null : (c) linkedHashMap.get(strArrSplit[i23].trim());
                                    String str = strArrSplit[t7VarA.f20231e];
                                    Matcher matcher = b.f47081a.matcher(str);
                                    PointF pointF = null;
                                    int i27 = -1;
                                    while (matcher.find()) {
                                        q qVar3 = qVar2;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = b.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        try {
                                            Matcher matcher2 = b.f47084d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = c.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i27 = iA;
                                            }
                                        } catch (RuntimeException unused3) {
                                        }
                                        qVar2 = qVar3;
                                    }
                                    qVar = qVar2;
                                    String strReplace = b.f47081a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f16 = aVar.f47079e;
                                    float f17 = aVar.f47080f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (cVar != null) {
                                        boolean z11 = cVar.f47091g;
                                        Integer num = cVar.f47088d;
                                        Integer num2 = cVar.f47087c;
                                        if (num2 != null) {
                                            i18 = 33;
                                            i19 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i18 = 33;
                                            i19 = 0;
                                        }
                                        if (cVar.f47094j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i19, spannableString.length(), i18);
                                        }
                                        float f18 = cVar.f47089e;
                                        if (f18 == -3.4028235E38f || f17 == -3.4028235E38f) {
                                            f14 = -3.4028235E38f;
                                            i20 = Integer.MIN_VALUE;
                                        } else {
                                            f14 = f18 / f17;
                                            i20 = 1;
                                        }
                                        boolean z12 = cVar.f47090f;
                                        if (z12 && z11) {
                                            i21 = i20;
                                            f15 = f14;
                                            i22 = 33;
                                            i13 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i21 = i20;
                                            f15 = f14;
                                            i22 = 33;
                                            i13 = 0;
                                            if (z12) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z11 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (cVar.f47092h) {
                                            spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i22);
                                        }
                                        if (cVar.f47093i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i22);
                                        }
                                        i14 = i21;
                                        f10 = f15;
                                    } else {
                                        f16 = f16;
                                        f17 = f17;
                                        i13 = 0;
                                        f10 = -3.4028235E38f;
                                        i14 = Integer.MIN_VALUE;
                                    }
                                    if (i27 == -1) {
                                        i27 = cVar != null ? cVar.f47086b : -1;
                                    }
                                    switch (i27) {
                                        case 0:
                                        default:
                                            u.v(i27, "Unknown alignment: ", "SsaParser");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i28 = Integer.MIN_VALUE;
                                    switch (i27) {
                                        case 0:
                                        default:
                                            u.v(i27, "Unknown alignment: ", "SsaParser");
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
                                    switch (i27) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            u.v(i27, "Unknown alignment: ", "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i28 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i28 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i28 = i13;
                                            break;
                                    }
                                    if (pointF == null || f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                        float f19 = 0.95f;
                                        if (i15 != 0) {
                                            i16 = 1;
                                            if (i15 != 1) {
                                                i17 = 2;
                                                f11 = i15 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i17 = 2;
                                                f11 = 0.5f;
                                            }
                                        } else {
                                            i16 = 1;
                                            i17 = 2;
                                            f11 = 0.05f;
                                        }
                                        if (i28 == 0) {
                                            f19 = 0.05f;
                                        } else if (i28 == i16) {
                                            f19 = 0.5f;
                                        } else if (i28 != i17) {
                                            f19 = -3.4028235E38f;
                                        }
                                        f12 = f19;
                                        f13 = f11;
                                    } else {
                                        f13 = pointF.x / f16;
                                        f12 = pointF.y / f17;
                                    }
                                    k1.b bVar = new k1.b(spannableString, alignment2, null, null, f12, i13, i28, f13, i15, i14, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i12);
                                    int iA2 = a(jC2, arrayList2, arrayList);
                                    for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                        ((List) arrayList.get(iA3)).add(bVar);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetI;
                    j10 = j11;
                    qVar = qVar2;
                } else {
                    charset = charsetI;
                    j10 = j11;
                    qVar = qVar2;
                }
                aVar = this;
                charsetI = charset;
                j11 = j10;
                t7VarA = t7VarA;
                qVar2 = qVar;
            }
        }
    }

    @Override // k3.m
    public final int i() {
        return 1;
    }
}
