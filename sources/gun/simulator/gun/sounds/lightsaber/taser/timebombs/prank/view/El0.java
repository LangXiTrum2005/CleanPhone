package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.efs.sdk.base.Constants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class El0 extends FrameLayout implements InterfaceC5199za0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2876Xc f3036a;
    public final C2547Kk b;
    public List c;
    public C2902Yc d;
    public float e;
    public int f;
    public float g;

    public El0(Context context) {
        super(context, null);
        this.c = Collections.emptyList();
        this.d = C2902Yc.g;
        this.e = 0.0533f;
        this.f = 0;
        this.g = 0.08f;
        C2876Xc c2876Xc = new C2876Xc(context);
        this.f3036a = c2876Xc;
        C2547Kk c2547Kk = new C2547Kk(context);
        this.b = c2547Kk;
        c2547Kk.setBackgroundColor(0);
        addView(c2876Xc);
        addView(c2547Kk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5199za0
    public final void a(List list, C2902Yc c2902Yc, float f, int i, float f2) {
        this.d = c2902Yc;
        this.e = f;
        this.f = i;
        this.g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C2417Fk c2417Fk = (C2417Fk) list.get(i2);
            if (c2417Fk.d != null) {
                arrayList.add(c2417Fk);
            } else {
                arrayList2.add(c2417Fk);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.f3036a.a(arrayList, c2902Yc, f, i, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float fL0 = AbstractC2995aW.l0(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fL0 == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fL0 / getContext().getResources().getDisplayMetrics().density)};
        int i2 = Ug0.f3833a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0276  */
    /* JADX WARN: Code duplicated, block: B:102:0x0292 A[LOOP:2: B:101:0x0290->B:102:0x0292, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02b5 A[LOOP:3: B:104:0x02af->B:106:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x030e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0318  */
    /* JADX WARN: Code duplicated, block: B:112:0x032a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0330  */
    /* JADX WARN: Code duplicated, block: B:115:0x034f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0355  */
    /* JADX WARN: Code duplicated, block: B:119:0x0370  */
    /* JADX WARN: Code duplicated, block: B:121:0x0376  */
    /* JADX WARN: Code duplicated, block: B:122:0x0379  */
    /* JADX WARN: Code duplicated, block: B:124:0x037d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0386  */
    /* JADX WARN: Code duplicated, block: B:127:0x038c  */
    /* JADX WARN: Code duplicated, block: B:129:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:131:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:132:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:134:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:140:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:142:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:144:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:146:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:147:0x0402  */
    /* JADX WARN: Code duplicated, block: B:148:0x0406  */
    /* JADX WARN: Code duplicated, block: B:149:0x040a  */
    /* JADX WARN: Code duplicated, block: B:150:0x040e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0412  */
    /* JADX WARN: Code duplicated, block: B:154:0x041a  */
    /* JADX WARN: Code duplicated, block: B:156:0x041d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0421  */
    /* JADX WARN: Code duplicated, block: B:160:0x0425  */
    /* JADX WARN: Code duplicated, block: B:161:0x0429  */
    /* JADX WARN: Code duplicated, block: B:162:0x042d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0431  */
    /* JADX WARN: Code duplicated, block: B:165:0x0435  */
    /* JADX WARN: Code duplicated, block: B:167:0x0439  */
    /* JADX WARN: Code duplicated, block: B:169:0x044c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0450  */
    /* JADX WARN: Code duplicated, block: B:173:0x0456  */
    /* JADX WARN: Code duplicated, block: B:175:0x045e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0461 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0463  */
    /* JADX WARN: Code duplicated, block: B:180:0x0466  */
    /* JADX WARN: Code duplicated, block: B:181:0x046a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0470  */
    /* JADX WARN: Code duplicated, block: B:183:0x0476  */
    /* JADX WARN: Code duplicated, block: B:184:0x047c  */
    /* JADX WARN: Code duplicated, block: B:187:0x048a  */
    /* JADX WARN: Code duplicated, block: B:188:0x048d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0514  */
    /* JADX WARN: Code duplicated, block: B:231:0x0520  */
    /* JADX WARN: Code duplicated, block: B:233:0x0530  */
    /* JADX WARN: Code duplicated, block: B:236:0x0545  */
    /* JADX WARN: Code duplicated, block: B:242:0x0579  */
    /* JADX WARN: Code duplicated, block: B:245:0x05a1 A[LOOP:6: B:243:0x059b->B:245:0x05a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:249:0x05be A[LOOP:7: B:247:0x05b8->B:249:0x05be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x0615  */
    /* JADX WARN: Code duplicated, block: B:265:0x0662  */
    /* JADX WARN: Code duplicated, block: B:270:0x066e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0686  */
    /* JADX WARN: Code duplicated, block: B:275:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:277:0x06af  */
    /* JADX WARN: Code duplicated, block: B:279:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:280:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:281:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:283:0x06da  */
    /* JADX WARN: Code duplicated, block: B:301:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0180  */
    /* JADX WARN: Code duplicated, block: B:54:0x0195  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x01be  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01df  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:83:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0203  */
    /* JADX WARN: Code duplicated, block: B:86:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0212  */
    /* JADX WARN: Code duplicated, block: B:96:0x0240  */
    /* JADX WARN: Code duplicated, block: B:97:0x0257  */
    /* JADX WARN: Code duplicated, block: B:99:0x025d  */
    /* JADX WARN: Instruction removed from duplicated block: B:106:0x02b5, please report this as an issue */
    public final void c() {
        String strConcat;
        String str;
        boolean z;
        float f;
        String str2;
        Layout.Alignment alignment;
        int i;
        String str3;
        int i2;
        String str4;
        int i3;
        String str5;
        int i4;
        String str6;
        String str7;
        String str8;
        float f2;
        StringBuilder sb;
        C4405qY c4405qY;
        String str9;
        CharSequence charSequence;
        String str10;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i5;
        HashMap map;
        Iterator it;
        String str11;
        String str12;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i6;
        String str13;
        String str14;
        String str15;
        StringBuilder sb2;
        int i7;
        int i8;
        B4 b4;
        Iterator it2;
        Iterator it3;
        Object obj;
        boolean z2;
        int i9;
        String str16;
        String str17;
        Lb0 lb0;
        int i10;
        StringBuilder sb3;
        int i11;
        int i12;
        String str18;
        String strB;
        int i13;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str19;
        int spanStart;
        int spanEnd;
        C4026m80 c4026m80;
        C4026m80 c4026m81;
        float f3;
        String str20;
        String str21;
        Layout.Alignment alignment2;
        int i14;
        String str22;
        String str23;
        String str24;
        boolean z3;
        El0 el0 = this;
        StringBuilder sb4 = new StringBuilder();
        Object[] objArr = new Object[4];
        char c = 0;
        objArr[0] = AbstractC2995aW.A0(el0.d.f4025a);
        int i15 = 1;
        objArr[1] = el0.b(el0.e, el0.f);
        int i16 = 2;
        objArr[2] = Float.valueOf(1.2f);
        C2902Yc c2902Yc = el0.d;
        int i17 = c2902Yc.d;
        int i18 = c2902Yc.e;
        if (i17 == 1) {
            Object[] objArr2 = {AbstractC2995aW.A0(i18)};
            int i19 = Ug0.f3833a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i17 == 2) {
            String strA0 = AbstractC2995aW.A0(i18);
            int i20 = Ug0.f3833a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strA0);
        } else if (i17 == 3) {
            String strA1 = AbstractC2995aW.A0(i18);
            int i21 = Ug0.f3833a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strA1);
        } else if (i17 != 4) {
            strConcat = "unset";
        } else {
            String strA2 = AbstractC2995aW.A0(i18);
            int i22 = Ug0.f3833a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strA2);
        }
        objArr[3] = strConcat;
        int i23 = Ug0.f3833a;
        sb4.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr));
        HashMap map2 = new HashMap();
        String strA3 = AbstractC2995aW.A0(el0.d.b);
        String str25 = "background-color:";
        StringBuilder sb5 = new StringBuilder("background-color:");
        sb5.append(strA3);
        String str26 = ";";
        sb5.append(";");
        map2.put(".default_bg,.default_bg *", sb5.toString());
        int i24 = 0;
        while (i24 < el0.c.size()) {
            C2417Fk c2417Fk = (C2417Fk) el0.c.get(i24);
            float f4 = c2417Fk.h;
            float f5 = f4 != -3.4028235E38f ? f4 * 100.0f : 50.0f;
            int i25 = -100;
            int i26 = c2417Fk.i;
            int i27 = i26 != i15 ? i26 != i16 ? 0 : -100 : -50;
            int i28 = c2417Fk.p;
            float f6 = c2417Fk.e;
            if (f6 != -3.4028235E38f) {
                if (c2417Fk.f != i15) {
                    Object[] objArr3 = new Object[i15];
                    objArr3[c] = Float.valueOf(f6 * 100.0f);
                    str = String.format(Locale.US, "%.2f%%", objArr3);
                    int i29 = c2417Fk.g;
                    if (i28 == i15) {
                        i25 = -(i29 != i15 ? i29 != 2 ? 0 : -100 : -50);
                    } else {
                        i25 = i29 != i15 ? i29 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    if (f6 >= 0.0f) {
                        Object[] objArr4 = new Object[i15];
                        objArr4[0] = Float.valueOf(f6 * 1.2f);
                        str = String.format(Locale.US, "%.2fem", objArr4);
                        z = false;
                    } else {
                        Object[] objArr5 = new Object[i15];
                        objArr5[0] = Float.valueOf(((-f6) - 1.0f) * 1.2f);
                        str = String.format(Locale.US, "%.2fem", objArr5);
                        z = true;
                    }
                    i25 = 0;
                }
                f = c2417Fk.j;
                if (f != -3.4028235E38f) {
                    Object[] objArr6 = new Object[i15];
                    objArr6[0] = Float.valueOf(f * 100.0f);
                    str2 = String.format(Locale.US, "%.2f%%", objArr6);
                } else {
                    str2 = "fit-content";
                }
                alignment = c2417Fk.b;
                if (alignment == null) {
                    str3 = "start";
                    str4 = TtmlNode.CENTER;
                    i3 = 1;
                    i2 = 2;
                } else {
                    i = Dl0.f2988a[alignment.ordinal()];
                    str3 = "start";
                    if (i != 1) {
                        i2 = 2;
                        if (i != 2) {
                            str4 = TtmlNode.CENTER;
                        } else {
                            str4 = TtmlNode.END;
                        }
                    } else {
                        i2 = 2;
                        str4 = str3;
                    }
                    i3 = 1;
                }
                if (i28 != i3) {
                    str5 = "vertical-rl";
                } else if (i28 != i2) {
                    str5 = "horizontal-tb";
                } else {
                    str5 = "vertical-lr";
                }
                String strB2 = el0.b(c2417Fk.o, c2417Fk.n);
                if (c2417Fk.l) {
                    i4 = c2417Fk.m;
                } else {
                    i4 = el0.d.c;
                }
                String strA4 = AbstractC2995aW.A0(i4);
                str6 = TtmlNode.RIGHT;
                str7 = "top";
                if (i28 != 1) {
                    if (i28 != 2) {
                        str6 = z ? "bottom" : "top";
                        str7 = TtmlNode.LEFT;
                    } else if (!z) {
                        str6 = TtmlNode.LEFT;
                    }
                } else if (z) {
                    str6 = TtmlNode.LEFT;
                }
                if (i28 != 2 || i28 == 1) {
                    str8 = "height";
                    int i30 = i25;
                    i25 = i27;
                    i27 = i30;
                } else {
                    str8 = "width";
                }
                f2 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = AbstractC4114n80.f4732a;
                sb = sb4;
                c4405qY = C4405qY.g;
                str9 = ";'>";
                charSequence = c2417Fk.f3084a;
                if (charSequence == null) {
                    b4 = new B4("", c4405qY);
                    str11 = str8;
                    str12 = str2;
                    str13 = ";'>";
                    str14 = str26;
                    str15 = str25;
                    str10 = "";
                } else {
                    str10 = "";
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        i5 = 0;
                        for (length = backgroundColorSpanArr.length; i5 < length; length = length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i5].getBackgroundColor()));
                            i5++;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strP = AbstractC3950lJ.p("bg_", iIntValue);
                            Iterator it4 = it;
                            String str27 = str2;
                            String str28 = str8;
                            String strN = AbstractC5044xl.n(".", strP, ",.", strP, " *");
                            String strA5 = AbstractC2995aW.A0(iIntValue);
                            int i31 = Ug0.f3833a;
                            Locale locale4 = Locale.US;
                            map.put(strN, str25 + strA5 + str26);
                            it = it4;
                            str2 = str27;
                            str8 = str28;
                        }
                        str11 = str8;
                        str12 = str2;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        length2 = spans.length;
                        i6 = 0;
                        while (i6 < length2) {
                            obj = spans[i6];
                            Object[] objArr7 = spans;
                            z2 = obj instanceof StrikethroughSpan;
                            String str29 = null;
                            if (z2) {
                                str16 = str26;
                                str17 = str25;
                                i9 = length2;
                                strB = "<span style='text-decoration:line-through;'>";
                            } else {
                                i9 = length2;
                                if (obj instanceof ForegroundColorSpan) {
                                    String strA6 = AbstractC2995aW.A0(((ForegroundColorSpan) obj).getForegroundColor());
                                    int i32 = Ug0.f3833a;
                                    Locale locale5 = Locale.US;
                                    str16 = str26;
                                    strB = DM.B("<span style='color:", strA6, str9);
                                    str17 = str25;
                                } else {
                                    str16 = str26;
                                    if (obj instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj).getBackgroundColor();
                                        int i33 = Ug0.f3833a;
                                        Locale locale6 = Locale.US;
                                        str17 = str25;
                                        strB = AbstractC5044xl.g("<span class='bg_", backgroundColor, "'>");
                                    } else {
                                        str17 = str25;
                                        if (obj instanceof C3679iA) {
                                            strB = "<span style='text-combine-upright:all;'>";
                                        } else if (obj instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr8 = {Float.valueOf(size)};
                                            int i34 = Ug0.f3833a;
                                            strB = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr8);
                                        } else if (obj instanceof RelativeSizeSpan) {
                                            Object[] objArr9 = {Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f)};
                                            int i35 = Ug0.f3833a;
                                            strB = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr9);
                                        } else if (obj instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj).getFamily();
                                            if (family != null) {
                                                int i36 = Ug0.f3833a;
                                                Locale locale7 = Locale.US;
                                                strB = DM.B("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strB = null;
                                            }
                                        } else if (obj instanceof StyleSpan) {
                                            style = ((StyleSpan) obj).getStyle();
                                            if (style != 1) {
                                                strB = "<b>";
                                            } else if (style != 2) {
                                                strB = "<i>";
                                            } else if (style != 3) {
                                                strB = null;
                                            } else {
                                                strB = "<b><i>";
                                            }
                                        } else if (obj instanceof C3836k10) {
                                            i13 = ((C3836k10) obj).b;
                                            if (i13 != -1) {
                                                strB = "<ruby style='ruby-position:unset;'>";
                                            } else if (i13 != 1) {
                                                strB = "<ruby style='ruby-position:over;'>";
                                            } else if (i13 != 2) {
                                                strB = null;
                                            } else {
                                                strB = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj instanceof UnderlineSpan) {
                                            strB = "<u>";
                                        } else if (obj instanceof Lb0) {
                                            lb0 = (Lb0) obj;
                                            i10 = lb0.f3360a;
                                            sb3 = new StringBuilder();
                                            i11 = lb0.b;
                                            if (i11 != 1) {
                                                i12 = 2;
                                                if (i11 == 2) {
                                                    sb3.append("open ");
                                                }
                                            } else {
                                                i12 = 2;
                                                sb3.append("filled ");
                                            }
                                            if (i10 != 0) {
                                                sb3.append(Constants.CP_NONE);
                                            } else if (i10 != 1) {
                                                sb3.append("circle");
                                            } else if (i10 != i12) {
                                                sb3.append("dot");
                                            } else if (i10 != 3) {
                                                sb3.append("unset");
                                            } else {
                                                sb3.append("sesame");
                                            }
                                            String string = sb3.toString();
                                            if (lb0.c != 2) {
                                                str18 = "over right";
                                            } else {
                                                str18 = "under left";
                                            }
                                            Object[] objArr10 = {string, str18};
                                            int i37 = Ug0.f3833a;
                                            strB = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr10);
                                        } else {
                                            strB = null;
                                        }
                                    }
                                }
                            }
                            if (!z2 || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof C3679iA) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof Lb0)) {
                                str19 = "</span>";
                            } else {
                                if (obj instanceof TypefaceSpan) {
                                    if (((TypefaceSpan) obj).getFamily() != null) {
                                        str29 = "</span>";
                                    }
                                } else if (obj instanceof StyleSpan) {
                                    int style2 = ((StyleSpan) obj).getStyle();
                                    if (style2 == 1) {
                                        str29 = "</b>";
                                    } else if (style2 == 2) {
                                        str29 = "</i>";
                                    } else if (style2 == 3) {
                                        str29 = "</i></b>";
                                    }
                                } else if (obj instanceof C3836k10) {
                                    str29 = "<rt>" + AbstractC4114n80.a(((C3836k10) obj).f4580a) + "</rt></ruby>";
                                } else if (obj instanceof UnderlineSpan) {
                                    str29 = "</u>";
                                }
                                str19 = str29;
                            }
                            spanStart = spanned.getSpanStart(obj);
                            spanEnd = spanned.getSpanEnd(obj);
                            if (strB != null) {
                                str19.getClass();
                                C3938l80 c3938l80 = new C3938l80(spanStart, spanEnd, strB, str19);
                                c4026m80 = (C4026m80) sparseArray.get(spanStart);
                                if (c4026m80 == null) {
                                    c4026m80 = new C4026m80();
                                    sparseArray.put(spanStart, c4026m80);
                                }
                                c4026m80.f4684a.add(c3938l80);
                                c4026m81 = (C4026m80) sparseArray.get(spanEnd);
                                if (c4026m81 == null) {
                                    c4026m81 = new C4026m80();
                                    sparseArray.put(spanEnd, c4026m81);
                                }
                                c4026m81.b.add(c3938l80);
                            }
                            i6++;
                            spans = objArr7;
                            length2 = i9;
                            str26 = str16;
                            str25 = str17;
                            f2 = f2;
                            str9 = str9;
                        }
                        str13 = str9;
                        str14 = str26;
                        str15 = str25;
                        sb2 = new StringBuilder(spanned.length());
                        i7 = 0;
                        i8 = 0;
                        while (i7 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i7);
                            sb2.append(AbstractC4114n80.a(spanned.subSequence(i8, iKeyAt)));
                            C4026m80 c4026m82 = (C4026m80) sparseArray.get(iKeyAt);
                            Collections.sort(c4026m82.b, C3938l80.f);
                            it2 = c4026m82.b.iterator();
                            while (it2.hasNext()) {
                                sb2.append(((C3938l80) it2.next()).d);
                            }
                            ArrayList arrayList = c4026m82.f4684a;
                            Collections.sort(arrayList, C3938l80.e);
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                sb2.append(((C3938l80) it3.next()).c);
                            }
                            i7++;
                            i8 = iKeyAt;
                        }
                        sb2.append(AbstractC4114n80.a(spanned.subSequence(i8, spanned.length())));
                        b4 = new B4(sb2.toString(), map);
                    } else {
                        b4 = new B4(AbstractC4114n80.a(charSequence), c4405qY);
                        str11 = str8;
                        str12 = str2;
                        str13 = ";'>";
                        str14 = str26;
                        str15 = str25;
                    }
                }
                for (String str30 : map2.keySet()) {
                    str24 = (String) map2.put(str30, (String) map2.get(str30));
                    if (str24 != null || str24.equals(map2.get(str30))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    FW.s(z3);
                }
                Object[] objArr11 = new Object[14];
                objArr11[0] = Integer.valueOf(i24);
                objArr11[1] = str7;
                objArr11[2] = Float.valueOf(f5);
                objArr11[3] = str6;
                objArr11[4] = str;
                objArr11[5] = str11;
                objArr11[6] = str12;
                objArr11[7] = str4;
                objArr11[8] = str5;
                objArr11[9] = strB2;
                objArr11[10] = strA4;
                objArr11[11] = Integer.valueOf(i27);
                objArr11[12] = Integer.valueOf(i25);
                f3 = c2417Fk.q;
                if (f3 != 0.0f) {
                    if (i28 != 2 || i28 == 1) {
                        str23 = "skewY";
                    } else {
                        str23 = "skewX";
                    }
                    Object[] objArr12 = {str23, Float.valueOf(f3)};
                    int i38 = Ug0.f3833a;
                    str20 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
                } else {
                    str20 = str10;
                }
                objArr11[13] = str20;
                sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr11));
                sb.append("<span class='default_bg'>");
                str21 = b4.f2852a;
                alignment2 = c2417Fk.c;
                if (alignment2 != null) {
                    i14 = Dl0.f2988a[alignment2.ordinal()];
                    if (i14 != 1) {
                        str22 = str3;
                    } else if (i14 != 2) {
                        str22 = TtmlNode.CENTER;
                    } else {
                        str22 = TtmlNode.END;
                    }
                    sb.append("<span style='display:inline-block; text-align:" + str22 + str13);
                    sb.append(str21);
                    sb.append("</span>");
                } else {
                    sb.append(str21);
                }
                sb.append("</span></div>");
                i24++;
                c = 0;
                i15 = 1;
                i16 = 2;
                el0 = this;
                sb4 = sb;
                str26 = str14;
                str25 = str15;
            } else {
                Object[] objArr13 = new Object[i15];
                objArr13[0] = Float.valueOf((1.0f - el0.g) * 100.0f);
                str = String.format(Locale.US, "%.2f%%", objArr13);
            }
            z = false;
            f = c2417Fk.j;
            if (f != -3.4028235E38f) {
                Object[] objArr14 = new Object[i15];
                objArr14[0] = Float.valueOf(f * 100.0f);
                str2 = String.format(Locale.US, "%.2f%%", objArr14);
            } else {
                str2 = "fit-content";
            }
            alignment = c2417Fk.b;
            if (alignment == null) {
                str3 = "start";
                str4 = TtmlNode.CENTER;
                i3 = 1;
                i2 = 2;
            } else {
                i = Dl0.f2988a[alignment.ordinal()];
                str3 = "start";
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        str4 = TtmlNode.CENTER;
                    } else {
                        str4 = TtmlNode.END;
                    }
                } else {
                    i2 = 2;
                    str4 = str3;
                }
                i3 = 1;
            }
            if (i28 != i3) {
                str5 = "vertical-rl";
            } else if (i28 != i2) {
                str5 = "horizontal-tb";
            } else {
                str5 = "vertical-lr";
            }
            String strB3 = el0.b(c2417Fk.o, c2417Fk.n);
            if (c2417Fk.l) {
                i4 = c2417Fk.m;
            } else {
                i4 = el0.d.c;
            }
            String strA7 = AbstractC2995aW.A0(i4);
            str6 = TtmlNode.RIGHT;
            str7 = "top";
            if (i28 != 1) {
                if (i28 != 2) {
                    str6 = z ? "bottom" : "top";
                    str7 = TtmlNode.LEFT;
                } else if (!z) {
                    str6 = TtmlNode.LEFT;
                }
            } else if (z) {
                str6 = TtmlNode.LEFT;
            }
            if (i28 != 2) {
                str8 = "height";
                int i39 = i25;
                i25 = i27;
                i27 = i39;
            } else {
                str8 = "height";
                int i310 = i25;
                i25 = i27;
                i27 = i310;
            }
            f2 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = AbstractC4114n80.f4732a;
            sb = sb4;
            c4405qY = C4405qY.g;
            str9 = ";'>";
            charSequence = c2417Fk.f3084a;
            if (charSequence == null) {
                b4 = new B4("", c4405qY);
                str11 = str8;
                str12 = str2;
                str13 = ";'>";
                str14 = str26;
                str15 = str25;
                str10 = "";
            } else {
                str10 = "";
                if (charSequence instanceof Spanned) {
                    b4 = new B4(AbstractC4114n80.a(charSequence), c4405qY);
                    str11 = str8;
                    str12 = str2;
                    str13 = ";'>";
                    str14 = str26;
                    str15 = str25;
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    i5 = 0;
                    while (i5 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i5].getBackgroundColor()));
                        i5++;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strP2 = AbstractC3950lJ.p("bg_", iIntValue2);
                        Iterator it5 = it;
                        String str210 = str2;
                        String str211 = str8;
                        String strN2 = AbstractC5044xl.n(".", strP2, ",.", strP2, " *");
                        String strA8 = AbstractC2995aW.A0(iIntValue2);
                        int i311 = Ug0.f3833a;
                        Locale locale8 = Locale.US;
                        map.put(strN2, str25 + strA8 + str26);
                        it = it5;
                        str2 = str210;
                        str8 = str211;
                    }
                    str11 = str8;
                    str12 = str2;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    length2 = spans.length;
                    i6 = 0;
                    while (i6 < length2) {
                        obj = spans[i6];
                        Object[] objArr15 = spans;
                        z2 = obj instanceof StrikethroughSpan;
                        String str212 = null;
                        if (z2) {
                            str16 = str26;
                            str17 = str25;
                            i9 = length2;
                            strB = "<span style='text-decoration:line-through;'>";
                        } else {
                            i9 = length2;
                            if (obj instanceof ForegroundColorSpan) {
                                String strA9 = AbstractC2995aW.A0(((ForegroundColorSpan) obj).getForegroundColor());
                                int i312 = Ug0.f3833a;
                                Locale locale9 = Locale.US;
                                str16 = str26;
                                strB = DM.B("<span style='color:", strA9, str9);
                                str17 = str25;
                            } else {
                                str16 = str26;
                                if (obj instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj).getBackgroundColor();
                                    int i313 = Ug0.f3833a;
                                    Locale locale10 = Locale.US;
                                    str17 = str25;
                                    strB = AbstractC5044xl.g("<span class='bg_", backgroundColor2, "'>");
                                } else {
                                    str17 = str25;
                                    if (obj instanceof C3679iA) {
                                        strB = "<span style='text-combine-upright:all;'>";
                                    } else if (obj instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr16 = {Float.valueOf(size)};
                                        int i314 = Ug0.f3833a;
                                        strB = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr16);
                                    } else if (obj instanceof RelativeSizeSpan) {
                                        Object[] objArr17 = {Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f)};
                                        int i315 = Ug0.f3833a;
                                        strB = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr17);
                                    } else if (obj instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj).getFamily();
                                        if (family != null) {
                                            int i316 = Ug0.f3833a;
                                            Locale locale11 = Locale.US;
                                            strB = DM.B("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strB = null;
                                        }
                                    } else if (obj instanceof StyleSpan) {
                                        style = ((StyleSpan) obj).getStyle();
                                        if (style != 1) {
                                            strB = "<b>";
                                        } else if (style != 2) {
                                            strB = "<i>";
                                        } else if (style != 3) {
                                            strB = null;
                                        } else {
                                            strB = "<b><i>";
                                        }
                                    } else if (obj instanceof C3836k10) {
                                        i13 = ((C3836k10) obj).b;
                                        if (i13 != -1) {
                                            strB = "<ruby style='ruby-position:unset;'>";
                                        } else if (i13 != 1) {
                                            strB = "<ruby style='ruby-position:over;'>";
                                        } else if (i13 != 2) {
                                            strB = null;
                                        } else {
                                            strB = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj instanceof UnderlineSpan) {
                                        strB = "<u>";
                                    } else if (obj instanceof Lb0) {
                                        lb0 = (Lb0) obj;
                                        i10 = lb0.f3360a;
                                        sb3 = new StringBuilder();
                                        i11 = lb0.b;
                                        if (i11 != 1) {
                                            i12 = 2;
                                            if (i11 == 2) {
                                                sb3.append("open ");
                                            }
                                        } else {
                                            i12 = 2;
                                            sb3.append("filled ");
                                        }
                                        if (i10 != 0) {
                                            sb3.append(Constants.CP_NONE);
                                        } else if (i10 != 1) {
                                            sb3.append("circle");
                                        } else if (i10 != i12) {
                                            sb3.append("dot");
                                        } else if (i10 != 3) {
                                            sb3.append("unset");
                                        } else {
                                            sb3.append("sesame");
                                        }
                                        String string2 = sb3.toString();
                                        if (lb0.c != 2) {
                                            str18 = "over right";
                                        } else {
                                            str18 = "under left";
                                        }
                                        Object[] objArr18 = {string2, str18};
                                        int i317 = Ug0.f3833a;
                                        strB = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr18);
                                    } else {
                                        strB = null;
                                    }
                                }
                            }
                        }
                        if (z2) {
                            str19 = "</span>";
                        } else {
                            str19 = "</span>";
                        }
                        spanStart = spanned.getSpanStart(obj);
                        spanEnd = spanned.getSpanEnd(obj);
                        if (strB != null) {
                            str19.getClass();
                            C3938l80 c3938l81 = new C3938l80(spanStart, spanEnd, strB, str19);
                            c4026m80 = (C4026m80) sparseArray.get(spanStart);
                            if (c4026m80 == null) {
                                c4026m80 = new C4026m80();
                                sparseArray.put(spanStart, c4026m80);
                            }
                            c4026m80.f4684a.add(c3938l81);
                            c4026m81 = (C4026m80) sparseArray.get(spanEnd);
                            if (c4026m81 == null) {
                                c4026m81 = new C4026m80();
                                sparseArray.put(spanEnd, c4026m81);
                            }
                            c4026m81.b.add(c3938l81);
                        }
                        i6++;
                        spans = objArr15;
                        length2 = i9;
                        str26 = str16;
                        str25 = str17;
                        f2 = f2;
                        str9 = str9;
                    }
                    str13 = str9;
                    str14 = str26;
                    str15 = str25;
                    sb2 = new StringBuilder(spanned.length());
                    i7 = 0;
                    i8 = 0;
                    while (i7 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i7);
                        sb2.append(AbstractC4114n80.a(spanned.subSequence(i8, iKeyAt2)));
                        C4026m80 c4026m83 = (C4026m80) sparseArray.get(iKeyAt2);
                        Collections.sort(c4026m83.b, C3938l80.f);
                        it2 = c4026m83.b.iterator();
                        while (it2.hasNext()) {
                            sb2.append(((C3938l80) it2.next()).d);
                        }
                        ArrayList arrayList2 = c4026m83.f4684a;
                        Collections.sort(arrayList2, C3938l80.e);
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            sb2.append(((C3938l80) it3.next()).c);
                        }
                        i7++;
                        i8 = iKeyAt2;
                    }
                    sb2.append(AbstractC4114n80.a(spanned.subSequence(i8, spanned.length())));
                    b4 = new B4(sb2.toString(), map);
                }
            }
            while (r0.hasNext()) {
                str24 = (String) map2.put(str30, (String) map2.get(str30));
                if (str24 != null) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                FW.s(z3);
            }
            Object[] objArr19 = new Object[14];
            objArr19[0] = Integer.valueOf(i24);
            objArr19[1] = str7;
            objArr19[2] = Float.valueOf(f5);
            objArr19[3] = str6;
            objArr19[4] = str;
            objArr19[5] = str11;
            objArr19[6] = str12;
            objArr19[7] = str4;
            objArr19[8] = str5;
            objArr19[9] = strB3;
            objArr19[10] = strA7;
            objArr19[11] = Integer.valueOf(i27);
            objArr19[12] = Integer.valueOf(i25);
            f3 = c2417Fk.q;
            if (f3 != 0.0f) {
                if (i28 != 2) {
                    str23 = "skewY";
                } else {
                    str23 = "skewY";
                }
                Object[] objArr110 = {str23, Float.valueOf(f3)};
                int i318 = Ug0.f3833a;
                str20 = String.format(Locale.US, "%s(%.2fdeg)", objArr110);
            } else {
                str20 = str10;
            }
            objArr19[13] = str20;
            sb.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", objArr19));
            sb.append("<span class='default_bg'>");
            str21 = b4.f2852a;
            alignment2 = c2417Fk.c;
            if (alignment2 != null) {
                i14 = Dl0.f2988a[alignment2.ordinal()];
                if (i14 != 1) {
                    str22 = str3;
                } else if (i14 != 2) {
                    str22 = TtmlNode.CENTER;
                } else {
                    str22 = TtmlNode.END;
                }
                sb.append("<span style='display:inline-block; text-align:" + str22 + str13);
                sb.append(str21);
                sb.append("</span>");
            } else {
                sb.append(str21);
            }
            sb.append("</span></div>");
            i24++;
            c = 0;
            i15 = 1;
            i16 = 2;
            el0 = this;
            sb4 = sb;
            str26 = str14;
            str25 = str15;
        }
        StringBuilder sb6 = sb4;
        sb6.append("</div></body></html>");
        StringBuilder sb7 = new StringBuilder("<html><head><style>");
        for (String str31 : map2.keySet()) {
            sb7.append(str31);
            sb7.append("{");
            sb7.append((String) map2.get(str31));
            sb7.append("}");
        }
        sb7.append("</style></head>");
        sb6.insert(0, sb7.toString());
        this.b.loadData(Base64.encodeToString(sb6.toString().getBytes(AbstractC2333Ce.c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
