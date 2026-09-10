package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.ViewCompat;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class Z80 extends R60 {
    public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean m;
    public final C2972a90 n;
    public LinkedHashMap o;
    public float p = -3.4028235E38f;
    public float q = -3.4028235E38f;

    public Z80(List list) {
        if (list == null || list.isEmpty()) {
            this.m = false;
            this.n = null;
            return;
        }
        this.m = true;
        String strO = Ug0.o((byte[]) list.get(0));
        FW.h(strO.startsWith("Format:"));
        C2972a90 c2972a90A = C2972a90.a(strO);
        c2972a90A.getClass();
        this.n = c2972a90A;
        f(new JT((byte[]) list.get(1)));
    }

    public static int e(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long g(String str) {
        Matcher matcher = r.matcher(str.trim());
        if (!matcher.matches()) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        String strGroup = matcher.group(1);
        int i = Ug0.f3833a;
        return (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.R60
    public final InterfaceC4495ra0 b(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        float f;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i4;
        int i5;
        int i6;
        float f2;
        float f3;
        float f4;
        float f5;
        int i7;
        float f6;
        int i8;
        int i9;
        int i10;
        Integer num;
        int iA;
        int i11;
        Z80 z80 = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JT jt = new JT(bArr, i);
        boolean z2 = z80.m;
        if (!z2) {
            z80.f(jt);
        }
        C2972a90 c2972a90A = z2 ? z80.n : null;
        while (true) {
            String strG = jt.g(AbstractC2333Ce.c);
            if (strG == null) {
                return new C3326e90(0, arrayList, arrayList2);
            }
            if (strG.startsWith("Format:")) {
                c2972a90A = C2972a90.a(strG);
            } else {
                if (strG.startsWith("Dialogue:")) {
                    if (c2972a90A == null) {
                        "Skipping dialogue line before complete format: ".concat(strG);
                        AbstractC4038mJ.f();
                    } else {
                        FW.h(strG.startsWith("Dialogue:"));
                        String strSubstring = strG.substring(9);
                        int i12 = c2972a90A.e;
                        String[] strArrSplit = strSubstring.split(",", i12);
                        if (strArrSplit.length != i12) {
                            "Skipping dialogue line with fewer columns than format: ".concat(strG);
                            AbstractC4038mJ.f();
                        } else {
                            if (g(strArrSplit[c2972a90A.f4112a]) == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                "Skipping invalid timing: ".concat(strG);
                                AbstractC4038mJ.f();
                            } else {
                                long jG = g(strArrSplit[c2972a90A.b]);
                                if (jG == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                    "Skipping invalid timing: ".concat(strG);
                                    AbstractC4038mJ.f();
                                } else {
                                    LinkedHashMap linkedHashMap = z80.o;
                                    C3238d90 c3238d90 = (linkedHashMap == null || (i11 = c2972a90A.c) == -1) ? null : (C3238d90) linkedHashMap.get(strArrSplit[i11].trim());
                                    String str = strArrSplit[c2972a90A.d];
                                    Matcher matcher = C3149c90.f4209a.matcher(str);
                                    int i13 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = C3149c90.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = C3149c90.d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = C3238d90.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i13 = iA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                    }
                                    String strReplace = C3149c90.f4209a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = z80.p;
                                    float f8 = z80.q;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    if (c3238d90 != null) {
                                        Integer num2 = c3238d90.c;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (c3238d90.j == 3 && (num = c3238d90.d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f9 = c3238d90.e;
                                        if (f9 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                            f5 = -3.4028235E38f;
                                            i7 = Integer.MIN_VALUE;
                                        } else {
                                            f5 = f9 / f8;
                                            i7 = 1;
                                        }
                                        boolean z3 = c3238d90.g;
                                        boolean z4 = c3238d90.f;
                                        if (z4 && z3) {
                                            f6 = f5;
                                            i8 = i7;
                                            i9 = 0;
                                            i10 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f6 = f5;
                                            i8 = i7;
                                            i9 = 0;
                                            i10 = 33;
                                            if (z4) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z3) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (c3238d90.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i9, spannableString.length(), i10);
                                        }
                                        if (c3238d90.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i9, spannableString.length(), i10);
                                        }
                                        i3 = i8;
                                        f = f6;
                                        i2 = -1;
                                    } else {
                                        jt = jt;
                                        c2972a90A = c2972a90A;
                                        i2 = -1;
                                        i3 = Integer.MIN_VALUE;
                                        f = -3.4028235E38f;
                                    }
                                    if (i13 != i2) {
                                        i2 = i13;
                                    } else if (c3238d90 != null) {
                                        i2 = c3238d90.b;
                                    }
                                    switch (i2) {
                                        case 0:
                                        default:
                                            AbstractC4038mJ.f();
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
                                    int i14 = Integer.MIN_VALUE;
                                    switch (i2) {
                                        case 0:
                                        default:
                                            AbstractC4038mJ.f();
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
                                    switch (i2) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            AbstractC4038mJ.f();
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i14 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i14 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i14 = 0;
                                            break;
                                    }
                                    if (pointF == null || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        float f10 = 0.05f;
                                        if (i4 != 0) {
                                            i5 = 1;
                                            if (i4 != 1) {
                                                i6 = 2;
                                                f2 = i4 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i6 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i5 = 1;
                                            i6 = 2;
                                            f2 = 0.05f;
                                        }
                                        if (i14 != 0) {
                                            f10 = i14 != i5 ? i14 != i6 ? -3.4028235E38f : 0.95f : 0.5f;
                                        }
                                        f3 = f10;
                                        f4 = f2;
                                    } else {
                                        f4 = pointF.x / f7;
                                        f3 = pointF.y / f8;
                                    }
                                    C2417Fk c2417Fk = new C2417Fk(spannableString, alignment2, null, null, f3, 0, i14, f4, i4, i3, f, -3.4028235E38f, -3.4028235E38f, false, ViewCompat.MEASURED_STATE_MASK, Integer.MIN_VALUE, 0.0f);
                                    int iE = e(jG, arrayList2, arrayList);
                                    for (int iE2 = e(r8, arrayList2, arrayList); iE2 < iE; iE2++) {
                                        ((List) arrayList.get(iE2)).add(c2417Fk);
                                    }
                                }
                            }
                        }
                    }
                    jt = jt;
                    c2972a90A = c2972a90A;
                } else {
                    jt = jt;
                    c2972a90A = c2972a90A;
                }
                z80 = this;
                jt = jt;
                c2972a90A = c2972a90A;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:168:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    public final void f(JT jt) {
        float f;
        int i;
        C3238d90 c3238d90;
        while (true) {
            String strG = jt.g(AbstractC2333Ce.c);
            if (strG == null) {
                return;
            }
            int i2 = 91;
            if ("[Script Info]".equalsIgnoreCase(strG)) {
                while (true) {
                    String strG2 = jt.g(AbstractC2333Ce.c);
                    if (strG2 == null || (jt.a() != 0 && jt.c() == 91)) {
                        break;
                    }
                    String[] strArrSplit = strG2.split(":");
                    if (strArrSplit.length == 2) {
                        String strH0 = FW.h0(strArrSplit[0].trim());
                        strH0.getClass();
                        if (strH0.equals("playresx")) {
                            this.p = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strH0.equals("playresy")) {
                            try {
                                this.q = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strG)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    C3061b90 c3061b90 = null;
                    while (true) {
                        String strG3 = jt.g(AbstractC2333Ce.c);
                        if (strG3 != null && (jt.a() == 0 || jt.c() != i2)) {
                            int i3 = -1;
                            if (strG3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strG3.substring(7), ",");
                                int i4 = -1;
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                for (int i14 = 0; i14 < strArrSplit2.length; i14++) {
                                    String strH1 = FW.h0(strArrSplit2[i14].trim());
                                    strH1.getClass();
                                    switch (strH1) {
                                        case "italic":
                                            i10 = i14;
                                            break;
                                        case "underline":
                                            i11 = i14;
                                            break;
                                        case "strikeout":
                                            i12 = i14;
                                            break;
                                        case "primarycolour":
                                            i6 = i14;
                                            break;
                                        case "bold":
                                            i9 = i14;
                                            break;
                                        case "name":
                                            i4 = i14;
                                            break;
                                        case "fontsize":
                                            i8 = i14;
                                            break;
                                        case "borderstyle":
                                            i13 = i14;
                                            break;
                                        case "alignment":
                                            i5 = i14;
                                            break;
                                        case "outlinecolour":
                                            i7 = i14;
                                            break;
                                    }
                                }
                                if (i4 != -1) {
                                    c3061b90 = new C3061b90(i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, strArrSplit2.length);
                                }
                            } else {
                                if (strG3.startsWith("Style:")) {
                                    if (c3061b90 == null) {
                                        "Skipping 'Style:' line before 'Format:' line: ".concat(strG3);
                                        AbstractC4038mJ.f();
                                    } else {
                                        FW.h(strG3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strG3.substring(6), ",");
                                        if (strArrSplit3.length != c3061b90.k) {
                                            int i15 = Ug0.f3833a;
                                            Locale locale = Locale.US;
                                            AbstractC4038mJ.f();
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[c3061b90.f4161a].trim();
                                                int i16 = c3061b90.b;
                                                int iA = i16 != -1 ? C3238d90.a(strArrSplit3[i16].trim()) : -1;
                                                int i17 = c3061b90.c;
                                                Integer numC = i17 != -1 ? C3238d90.c(strArrSplit3[i17].trim()) : null;
                                                int i18 = c3061b90.d;
                                                Integer numC2 = i18 != -1 ? C3238d90.c(strArrSplit3[i18].trim()) : null;
                                                int i19 = c3061b90.e;
                                                float f2 = -3.4028235E38f;
                                                if (i19 != -1) {
                                                    String strTrim2 = strArrSplit3[i19].trim();
                                                    try {
                                                        f2 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e) {
                                                        AbstractC4038mJ.g("Failed to parse font size: '" + strTrim2 + "'", e);
                                                    }
                                                    f = f2;
                                                } else {
                                                    f = -3.4028235E38f;
                                                }
                                                int i20 = c3061b90.f;
                                                boolean z = i20 != -1 && C3238d90.b(strArrSplit3[i20].trim());
                                                int i21 = c3061b90.g;
                                                boolean z2 = i21 != -1 && C3238d90.b(strArrSplit3[i21].trim());
                                                int i22 = c3061b90.h;
                                                boolean z3 = i22 != -1 && C3238d90.b(strArrSplit3[i22].trim());
                                                int i23 = c3061b90.i;
                                                boolean z4 = i23 != -1 && C3238d90.b(strArrSplit3[i23].trim());
                                                int i24 = c3061b90.j;
                                                if (i24 != -1) {
                                                    try {
                                                        int i25 = Integer.parseInt(strArrSplit3[i24].trim().trim());
                                                        if (i25 == 1 || i25 == 3) {
                                                            i3 = i25;
                                                        } else {
                                                            AbstractC4038mJ.f();
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i = i3;
                                                } else {
                                                    i = -1;
                                                }
                                                c3238d90 = new C3238d90(strTrim, iA, numC, numC2, f, z, z2, z3, z4, i);
                                            } catch (RuntimeException e2) {
                                                AbstractC4038mJ.g("Skipping malformed 'Style:' line: '" + strG3 + "'", e2);
                                                c3238d90 = null;
                                            }
                                            if (c3238d90 != null) {
                                                linkedHashMap.put(c3238d90.f4261a, c3238d90);
                                            }
                                        }
                                        c3238d90 = null;
                                        if (c3238d90 != null) {
                                            linkedHashMap.put(c3238d90.f4261a, c3238d90);
                                        }
                                    }
                                }
                                i2 = 91;
                            }
                        }
                    }
                }
                this.o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strG)) {
                AbstractC4038mJ.e();
            } else if ("[Events]".equalsIgnoreCase(strG)) {
                return;
            }
        }
    }
}
