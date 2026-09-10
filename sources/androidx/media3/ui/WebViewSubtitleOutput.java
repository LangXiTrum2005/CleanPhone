package androidx.media3.ui;

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
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.Output {
    public final CanvasSubtitleOutput e0;
    public final WebView f0;
    public List g0;
    public CaptionStyleCompat h0;
    public float i0;
    public float j0;

    /* JADX INFO: renamed from: androidx.media3.ui.WebViewSubtitleOutput$1, reason: invalid class name */
    class AnonymousClass1 extends WebView {
        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.WebViewSubtitleOutput$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7751a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f7751a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7751a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7751a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        super(context, null);
        this.g0 = Collections.EMPTY_LIST;
        this.h0 = CaptionStyleCompat.g;
        this.i0 = 0.0533f;
        this.j0 = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.e0 = canvasSubtitleOutput;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, null);
        this.f0 = anonymousClass1;
        anonymousClass1.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(anonymousClass1);
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public final void a(List list, CaptionStyleCompat captionStyleCompat, float f, float f2) {
        this.h0 = captionStyleCompat;
        this.i0 = f;
        this.j0 = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = (Cue) list.get(i2);
            if (cue.d != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.g0.isEmpty() || !arrayList2.isEmpty()) {
            this.g0 = arrayList2;
            c();
        }
        this.e0.a(arrayList, captionStyleCompat, f, f2);
        invalidate();
    }

    public final String b(float f, int i2) {
        float fB = SubtitleViewUtils.b(i2, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fB == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fB / getContext().getResources().getDisplayMetrics().density)};
        int i3 = Util.f5683a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0254  */
    /* JADX WARN: Code duplicated, block: B:102:0x0269  */
    /* JADX WARN: Code duplicated, block: B:104:0x0287 A[LOOP:2: B:103:0x0285->B:104:0x0287, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02ac A[LOOP:3: B:106:0x02a6->B:108:0x02ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x0301  */
    /* JADX WARN: Code duplicated, block: B:113:0x030d  */
    /* JADX WARN: Code duplicated, block: B:116:0x031d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0323  */
    /* JADX WARN: Code duplicated, block: B:119:0x033b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0341  */
    /* JADX WARN: Code duplicated, block: B:122:0x0357  */
    /* JADX WARN: Code duplicated, block: B:124:0x035d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0360  */
    /* JADX WARN: Code duplicated, block: B:127:0x0364  */
    /* JADX WARN: Code duplicated, block: B:129:0x036d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0373  */
    /* JADX WARN: Code duplicated, block: B:132:0x038d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0391  */
    /* JADX WARN: Code duplicated, block: B:135:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:141:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:143:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:145:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:147:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:153:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:155:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:157:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:162:0x0403  */
    /* JADX WARN: Code duplicated, block: B:163:0x0407  */
    /* JADX WARN: Code duplicated, block: B:164:0x040b  */
    /* JADX WARN: Code duplicated, block: B:165:0x040f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0413  */
    /* JADX WARN: Code duplicated, block: B:168:0x0417  */
    /* JADX WARN: Code duplicated, block: B:170:0x041b  */
    /* JADX WARN: Code duplicated, block: B:172:0x042c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0430  */
    /* JADX WARN: Code duplicated, block: B:176:0x0436  */
    /* JADX WARN: Code duplicated, block: B:178:0x043e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0441 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x0443  */
    /* JADX WARN: Code duplicated, block: B:183:0x0446  */
    /* JADX WARN: Code duplicated, block: B:184:0x044a  */
    /* JADX WARN: Code duplicated, block: B:185:0x0450  */
    /* JADX WARN: Code duplicated, block: B:186:0x0456  */
    /* JADX WARN: Code duplicated, block: B:187:0x045c  */
    /* JADX WARN: Code duplicated, block: B:190:0x046a  */
    /* JADX WARN: Code duplicated, block: B:191:0x046d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0480  */
    /* JADX WARN: Code duplicated, block: B:206:0x0498  */
    /* JADX WARN: Code duplicated, block: B:236:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:238:0x050d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0522  */
    /* JADX WARN: Code duplicated, block: B:247:0x0555  */
    /* JADX WARN: Code duplicated, block: B:250:0x057d A[LOOP:6: B:248:0x0577->B:250:0x057d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:254:0x059a A[LOOP:7: B:252:0x0594->B:254:0x059a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:260:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:262:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:266:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:270:0x060f  */
    /* JADX WARN: Code duplicated, block: B:272:0x0612  */
    /* JADX WARN: Code duplicated, block: B:276:0x0619  */
    /* JADX WARN: Code duplicated, block: B:279:0x0634  */
    /* JADX WARN: Code duplicated, block: B:282:0x0651  */
    /* JADX WARN: Code duplicated, block: B:284:0x065c  */
    /* JADX WARN: Code duplicated, block: B:286:0x065f  */
    /* JADX WARN: Code duplicated, block: B:287:0x0662  */
    /* JADX WARN: Code duplicated, block: B:288:0x0665  */
    /* JADX WARN: Code duplicated, block: B:290:0x0683  */
    /* JADX WARN: Code duplicated, block: B:308:0x052f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0172  */
    /* JADX WARN: Code duplicated, block: B:52:0x0185  */
    /* JADX WARN: Code duplicated, block: B:55:0x0192  */
    /* JADX WARN: Code duplicated, block: B:56:0x0199  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x020c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0235  */
    /* JADX WARN: Code duplicated, block: B:99:0x024e  */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x02ac, please report this as an issue */
    public final void c() {
        String strConcat;
        String str;
        String str2;
        int i2;
        float f;
        String str3;
        String str4;
        Layout.Alignment alignment;
        int i3;
        int i4;
        Object obj;
        int i5;
        String str5;
        int i6;
        String str6;
        String str7;
        Object obj2;
        String str8;
        float f2;
        String str9;
        CharSequence charSequence;
        String str10;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i7;
        HashMap map;
        Iterator it;
        String str11;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i8;
        StringBuilder sb;
        int i9;
        int i10;
        SpannedToHtmlConverter.HtmlAndCss htmlAndCss;
        Iterator it2;
        Iterator it3;
        Object obj3;
        boolean z2;
        boolean z3;
        int i11;
        TextEmphasisSpan textEmphasisSpan;
        int i12;
        StringBuilder sb2;
        int i13;
        int i14;
        String str12;
        String strN;
        int i15;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str13;
        int spanStart;
        int spanEnd;
        SpannedToHtmlConverter.Transition transition;
        SpannedToHtmlConverter.Transition transition2;
        float f3;
        String str14;
        String str15;
        Layout.Alignment alignment2;
        int i16;
        int i17;
        String str16;
        String str17;
        String str18;
        boolean z4;
        WebViewSubtitleOutput webViewSubtitleOutput = this;
        int i18 = 1;
        StringBuilder sb3 = new StringBuilder();
        String strA = HtmlUtils.a(webViewSubtitleOutput.h0.f7686a);
        int i19 = 0;
        String strB = webViewSubtitleOutput.b(webViewSubtitleOutput.i0, 0);
        float f4 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        CaptionStyleCompat captionStyleCompat = webViewSubtitleOutput.h0;
        int i20 = captionStyleCompat.d;
        int i21 = 2;
        int i22 = captionStyleCompat.f7689e;
        if (i20 == 1) {
            Object[] objArr = {HtmlUtils.a(i22)};
            int i23 = Util.f5683a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr);
        } else if (i20 == 2) {
            String strA2 = HtmlUtils.a(i22);
            int i24 = Util.f5683a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strA2);
        } else if (i20 == 3) {
            String strA3 = HtmlUtils.a(i22);
            int i25 = Util.f5683a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strA3);
        } else if (i20 != 4) {
            strConcat = "unset";
        } else {
            String strA4 = HtmlUtils.a(i22);
            int i26 = Util.f5683a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strA4);
        }
        Object[] objArr2 = {strA, strB, fValueOf, strConcat};
        int i27 = Util.f5683a;
        sb3.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr2));
        HashMap map2 = new HashMap();
        String strA5 = HtmlUtils.a(webViewSubtitleOutput.h0.f7687b);
        String str19 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(strA5);
        String str20 = ";";
        sb4.append(";");
        map2.put(".default_bg,.default_bg *", sb4.toString());
        int i28 = 0;
        while (i28 < webViewSubtitleOutput.g0.size()) {
            Cue cue = (Cue) webViewSubtitleOutput.g0.get(i28);
            float f5 = cue.f5599h;
            float f6 = f5 != -3.4028235E38f ? f5 * 100.0f : 50.0f;
            int i29 = -100;
            float f7 = f4;
            int i30 = cue.f5600i;
            int i31 = i30 != i18 ? i30 != i21 ? i19 : -100 : -50;
            float f8 = cue.f5598e;
            int i32 = cue.f5603p;
            if (f8 != r14) {
                if (cue.f != i18) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f8 * 100.0f));
                    int i33 = cue.g;
                    if (i32 == i18) {
                        i29 = -(i33 != i18 ? i33 != i21 ? 0 : -100 : -50);
                    } else if (i33 == i18) {
                        i29 = -50;
                    } else if (i33 != i21) {
                        i29 = 0;
                    }
                } else if (f8 >= 0.0f) {
                    str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f8 * f7));
                    i2 = 0;
                    i29 = 0;
                } else {
                    str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f8) - 1.0f) * f7));
                    i29 = 0;
                    i2 = i18;
                }
                f = cue.j;
                if (f != -8388609) {
                    str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str21 = str3;
                str4 = TtmlNode.CENTER;
                alignment = cue.f5596b;
                if (alignment == null) {
                    obj = TtmlNode.CENTER;
                    i5 = 1;
                    i4 = 2;
                } else {
                    i3 = AnonymousClass2.f7751a[alignment.ordinal()];
                    if (i3 != 1) {
                        i4 = 2;
                        if (i3 != 2) {
                            obj = TtmlNode.CENTER;
                        } else {
                            obj = TtmlNode.END;
                        }
                    } else {
                        i4 = 2;
                        obj = "start";
                    }
                    i5 = 1;
                }
                if (i32 != i5) {
                    str5 = "vertical-rl";
                } else if (i32 != i4) {
                    str5 = "horizontal-tb";
                } else {
                    str5 = "vertical-lr";
                }
                String str22 = str5;
                String strB2 = webViewSubtitleOutput.b(cue.o, cue.f5602n);
                if (cue.f5601l) {
                    i6 = cue.m;
                } else {
                    i6 = webViewSubtitleOutput.h0.f7688c;
                }
                String strA6 = HtmlUtils.a(i6);
                if (i32 != 1) {
                    if (i2 != 0) {
                        str6 = TtmlNode.LEFT;
                    } else {
                        str6 = TtmlNode.RIGHT;
                    }
                    str7 = str6;
                    obj2 = "top";
                } else if (i32 != 2) {
                    str7 = i2 != 0 ? "bottom" : "top";
                    obj2 = TtmlNode.LEFT;
                } else {
                    if (i2 != 0) {
                        str6 = TtmlNode.RIGHT;
                    } else {
                        str6 = TtmlNode.LEFT;
                    }
                    str7 = str6;
                    obj2 = "top";
                }
                if (i32 != 2 || i32 == 1) {
                    str8 = "height";
                    int i34 = i29;
                    i29 = i31;
                    i31 = i34;
                } else {
                    str8 = "width";
                }
                String str23 = str8;
                f2 = webViewSubtitleOutput.getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = SpannedToHtmlConverter.f7722a;
                int i35 = i31;
                str9 = "";
                int i36 = i28;
                charSequence = cue.f5595a;
                if (charSequence == null) {
                    str10 = "start";
                    htmlAndCss = new SpannedToHtmlConverter.HtmlAndCss("", ImmutableMap.o());
                } else {
                    str10 = "start";
                    if (charSequence instanceof Spanned) {
                        str9 = "";
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i7 = 0;
                        while (i7 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i7].getBackgroundColor()));
                            i7++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strH = android.support.v4.media.a.h(iIntValue, "bg_");
                            Iterator it4 = it;
                            String strN2 = androidx.datastore.preferences.protobuf.a.n(mo.ono, strH, ",.", strH, " *");
                            String strA7 = HtmlUtils.a(iIntValue);
                            int i37 = Util.f5683a;
                            Locale locale4 = Locale.US;
                            map.put(strN2, str19 + strA7 + str20);
                            it = it4;
                            str4 = str4;
                        }
                        str11 = str4;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i8 = 0;
                        for (length2 = spans.length; i8 < length2; length2 = i11) {
                            String str24 = str20;
                            obj3 = spans[i8];
                            String str25 = str19;
                            z2 = obj3 instanceof StrikethroughSpan;
                            String strR = null;
                            if (z2) {
                                z3 = z2;
                                strN = "<span style='text-decoration:line-through;'>";
                            } else {
                                z3 = z2;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strA8 = HtmlUtils.a(((ForegroundColorSpan) obj3).getForegroundColor());
                                    int i38 = Util.f5683a;
                                    Locale locale5 = Locale.US;
                                    strN = android.support.v4.media.a.n("<span style='color:", strA8, ";'>");
                                } else {
                                    spans = spans;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        int i39 = Util.f5683a;
                                        Locale locale6 = Locale.US;
                                        i11 = length2;
                                        strN = androidx.datastore.preferences.protobuf.a.k("<span class='bg_", backgroundColor, "'>");
                                    } else {
                                        i11 = length2;
                                        if (obj3 instanceof HorizontalTextInVerticalContextSpan) {
                                            strN = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr3 = {Float.valueOf(size)};
                                            int i40 = Util.f5683a;
                                            strN = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr3);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr4 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            int i41 = Util.f5683a;
                                            strN = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr4);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                int i42 = Util.f5683a;
                                                Locale locale7 = Locale.US;
                                                strN = android.support.v4.media.a.n("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strN = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strN = "<b>";
                                            } else if (style != 2) {
                                                strN = "<i>";
                                            } else if (style != 3) {
                                                strN = null;
                                            } else {
                                                strN = "<b><i>";
                                            }
                                        } else if (obj3 instanceof RubySpan) {
                                            i15 = ((RubySpan) obj3).f5621b;
                                            if (i15 != -1) {
                                                strN = "<ruby style='ruby-position:unset;'>";
                                            } else if (i15 != 1) {
                                                strN = "<ruby style='ruby-position:over;'>";
                                            } else if (i15 != 2) {
                                                strN = null;
                                            } else {
                                                strN = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strN = "<u>";
                                        } else if (obj3 instanceof TextEmphasisSpan) {
                                            textEmphasisSpan = (TextEmphasisSpan) obj3;
                                            i12 = textEmphasisSpan.f5623a;
                                            sb2 = new StringBuilder();
                                            i13 = textEmphasisSpan.f5624b;
                                            if (i13 != 1) {
                                                i14 = 2;
                                                if (i13 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i14 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i12 != 0) {
                                                sb2.append("none");
                                            } else if (i12 != 1) {
                                                sb2.append("circle");
                                            } else if (i12 != i14) {
                                                sb2.append("dot");
                                            } else if (i12 != 3) {
                                                sb2.append("unset");
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (textEmphasisSpan.f5625c != 2) {
                                                str12 = "over right";
                                            } else {
                                                str12 = "under left";
                                            }
                                            Object[] objArr5 = {string, str12};
                                            int i43 = Util.f5683a;
                                            strN = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr5);
                                        } else {
                                            strN = null;
                                        }
                                    }
                                }
                                if (z3 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof HorizontalTextInVerticalContextSpan) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof TextEmphasisSpan)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str13 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                strR = "</b>";
                                            } else if (style2 == 2) {
                                                strR = "</i>";
                                            } else if (style2 == 3) {
                                                strR = "</i></b>";
                                            }
                                        } else if (obj3 instanceof RubySpan) {
                                            strR = android.support.v4.media.a.r(new StringBuilder("<rt>"), SpannedToHtmlConverter.a(((RubySpan) obj3).f5620a), "</rt></ruby>");
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strR = "</u>";
                                        }
                                        str13 = strR;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strN != null) {
                                    str13.getClass();
                                    SpannedToHtmlConverter.SpanInfo spanInfo = new SpannedToHtmlConverter.SpanInfo(spanStart, spanEnd, strN, str13);
                                    transition = (SpannedToHtmlConverter.Transition) sparseArray.get(spanStart);
                                    if (transition == null) {
                                        transition = new SpannedToHtmlConverter.Transition();
                                        sparseArray.put(spanStart, transition);
                                    }
                                    transition.f7729a.add(spanInfo);
                                    transition2 = (SpannedToHtmlConverter.Transition) sparseArray.get(spanEnd);
                                    if (transition2 == null) {
                                        transition2 = new SpannedToHtmlConverter.Transition();
                                        sparseArray.put(spanEnd, transition2);
                                    }
                                    transition2.f7730b.add(spanInfo);
                                }
                                i8++;
                                str20 = str24;
                                str19 = str25;
                                spans = spans;
                            }
                            i11 = length2;
                            str13 = z3 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strN != null) {
                                str13.getClass();
                                SpannedToHtmlConverter.SpanInfo spanInfo2 = new SpannedToHtmlConverter.SpanInfo(spanStart, spanEnd, strN, str13);
                                transition = (SpannedToHtmlConverter.Transition) sparseArray.get(spanStart);
                                if (transition == null) {
                                    transition = new SpannedToHtmlConverter.Transition();
                                    sparseArray.put(spanStart, transition);
                                }
                                transition.f7729a.add(spanInfo2);
                                transition2 = (SpannedToHtmlConverter.Transition) sparseArray.get(spanEnd);
                                if (transition2 == null) {
                                    transition2 = new SpannedToHtmlConverter.Transition();
                                    sparseArray.put(spanEnd, transition2);
                                }
                                transition2.f7730b.add(spanInfo2);
                            }
                            i8++;
                            str20 = str24;
                            str19 = str25;
                            spans = spans;
                        }
                        str20 = str20;
                        str19 = str19;
                        sb = new StringBuilder(spanned.length());
                        i9 = 0;
                        i10 = 0;
                        while (i10 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i10);
                            sb.append(SpannedToHtmlConverter.a(spanned.subSequence(i9, iKeyAt)));
                            SpannedToHtmlConverter.Transition transition3 = (SpannedToHtmlConverter.Transition) sparseArray.get(iKeyAt);
                            Collections.sort(transition3.f7730b, SpannedToHtmlConverter.SpanInfo.f);
                            it2 = transition3.f7730b.iterator();
                            while (it2.hasNext()) {
                                sb.append(((SpannedToHtmlConverter.SpanInfo) it2.next()).d);
                            }
                            ArrayList arrayList = transition3.f7729a;
                            Collections.sort(arrayList, SpannedToHtmlConverter.SpanInfo.f7725e);
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                sb.append(((SpannedToHtmlConverter.SpanInfo) it3.next()).f7728c);
                            }
                            i10++;
                            i9 = iKeyAt;
                        }
                        sb.append(SpannedToHtmlConverter.a(spanned.subSequence(i9, spanned.length())));
                        htmlAndCss = new SpannedToHtmlConverter.HtmlAndCss(sb.toString(), map);
                    } else {
                        htmlAndCss = new SpannedToHtmlConverter.HtmlAndCss(SpannedToHtmlConverter.a(charSequence), ImmutableMap.o());
                    }
                    for (String str26 : map2.keySet()) {
                        str18 = (String) map2.put(str26, (String) map2.get(str26));
                        if (str18 != null || str18.equals(map2.get(str26))) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        Assertions.e(z4);
                    }
                    Integer numValueOf = Integer.valueOf(i36);
                    Float fValueOf2 = Float.valueOf(f6);
                    Integer numValueOf2 = Integer.valueOf(i35);
                    Integer numValueOf3 = Integer.valueOf(i29);
                    f3 = cue.q;
                    if (f3 != 0.0f) {
                        if (i32 != 2 || i32 == 1) {
                            str17 = "skewY";
                        } else {
                            str17 = "skewX";
                        }
                        Object[] objArr6 = {str17, Float.valueOf(f3)};
                        int i44 = Util.f5683a;
                        str14 = String.format(Locale.US, "%s(%.2fdeg)", objArr6);
                    } else {
                        str14 = str9;
                    }
                    sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str7, str2, str23, str21, obj, str22, strB2, strA6, numValueOf2, numValueOf3, str14));
                    sb3.append("<span class='default_bg'>");
                    str15 = htmlAndCss.f7723a;
                    alignment2 = cue.f5597c;
                    if (alignment2 != null) {
                        i17 = AnonymousClass2.f7751a[alignment2.ordinal()];
                        if (i17 != 1) {
                            i16 = 2;
                            if (i17 != 2) {
                                str16 = str11;
                            } else {
                                str16 = TtmlNode.END;
                            }
                        } else {
                            i16 = 2;
                            str16 = str10;
                        }
                        sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                        sb3.append(str15);
                        sb3.append("</span>");
                    } else {
                        i16 = 2;
                        sb3.append(str15);
                    }
                    sb3.append("</span></div>");
                    i28 = i36 + 1;
                    webViewSubtitleOutput = this;
                    i21 = i16;
                    f4 = f7;
                    str20 = str20;
                    str19 = str19;
                    i18 = 1;
                    i19 = 0;
                }
                str11 = TtmlNode.CENTER;
                while (r0.hasNext()) {
                    str18 = (String) map2.put(str26, (String) map2.get(str26));
                    if (str18 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    Assertions.e(z4);
                }
                Integer numValueOf4 = Integer.valueOf(i36);
                Float fValueOf3 = Float.valueOf(f6);
                Integer numValueOf5 = Integer.valueOf(i35);
                Integer numValueOf6 = Integer.valueOf(i29);
                f3 = cue.q;
                if (f3 != 0.0f) {
                    if (i32 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr7 = {str17, Float.valueOf(f3)};
                    int i45 = Util.f5683a;
                    str14 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                } else {
                    str14 = str9;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str7, str2, str23, str21, obj, str22, strB2, strA6, numValueOf5, numValueOf6, str14));
                sb3.append("<span class='default_bg'>");
                str15 = htmlAndCss.f7723a;
                alignment2 = cue.f5597c;
                if (alignment2 != null) {
                    i17 = AnonymousClass2.f7751a[alignment2.ordinal()];
                    if (i17 != 1) {
                        i16 = 2;
                        if (i17 != 2) {
                            str16 = str11;
                        } else {
                            str16 = TtmlNode.END;
                        }
                    } else {
                        i16 = 2;
                        str16 = str10;
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb3.append(str15);
                    sb3.append("</span>");
                } else {
                    i16 = 2;
                    sb3.append(str15);
                }
                sb3.append("</span></div>");
                i28 = i36 + 1;
                webViewSubtitleOutput = this;
                i21 = i16;
                f4 = f7;
                str20 = str20;
                str19 = str19;
                i18 = 1;
                i19 = 0;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - webViewSubtitleOutput.j0) * 100.0f));
            }
            str2 = str;
            i2 = 0;
            f = cue.j;
            if (f != -8388609) {
                str3 = String.format(Locale.US, "%.2f%%", Float.valueOf(f * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str27 = str3;
            str4 = TtmlNode.CENTER;
            alignment = cue.f5596b;
            if (alignment == null) {
                obj = TtmlNode.CENTER;
                i5 = 1;
                i4 = 2;
            } else {
                i3 = AnonymousClass2.f7751a[alignment.ordinal()];
                if (i3 != 1) {
                    i4 = 2;
                    if (i3 != 2) {
                        obj = TtmlNode.CENTER;
                    } else {
                        obj = TtmlNode.END;
                    }
                } else {
                    i4 = 2;
                    obj = "start";
                }
                i5 = 1;
            }
            if (i32 != i5) {
                str5 = "vertical-rl";
            } else if (i32 != i4) {
                str5 = "horizontal-tb";
            } else {
                str5 = "vertical-lr";
            }
            String str28 = str5;
            String strB3 = webViewSubtitleOutput.b(cue.o, cue.f5602n);
            if (cue.f5601l) {
                i6 = cue.m;
            } else {
                i6 = webViewSubtitleOutput.h0.f7688c;
            }
            String strA9 = HtmlUtils.a(i6);
            if (i32 != 1) {
                if (i2 != 0) {
                    str6 = TtmlNode.LEFT;
                } else {
                    str6 = TtmlNode.RIGHT;
                }
                str7 = str6;
                obj2 = "top";
            } else if (i32 != 2) {
                str7 = i2 != 0 ? "bottom" : "top";
                obj2 = TtmlNode.LEFT;
            } else {
                if (i2 != 0) {
                    str6 = TtmlNode.RIGHT;
                } else {
                    str6 = TtmlNode.LEFT;
                }
                str7 = str6;
                obj2 = "top";
            }
            if (i32 != 2) {
                str8 = "height";
                int i310 = i29;
                i29 = i31;
                i31 = i310;
            } else {
                str8 = "height";
                int i311 = i29;
                i29 = i31;
                i31 = i311;
            }
            String str29 = str8;
            f2 = webViewSubtitleOutput.getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = SpannedToHtmlConverter.f7722a;
            int i312 = i31;
            str9 = "";
            int i313 = i28;
            charSequence = cue.f5595a;
            if (charSequence == null) {
                str10 = "start";
                htmlAndCss = new SpannedToHtmlConverter.HtmlAndCss("", ImmutableMap.o());
            } else {
                str10 = "start";
                if (charSequence instanceof Spanned) {
                    htmlAndCss = new SpannedToHtmlConverter.HtmlAndCss(SpannedToHtmlConverter.a(charSequence), ImmutableMap.o());
                } else {
                    str9 = "";
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i7 = 0;
                    while (i7 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i7].getBackgroundColor()));
                        i7++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strH2 = android.support.v4.media.a.h(iIntValue2, "bg_");
                        Iterator it5 = it;
                        String strN3 = androidx.datastore.preferences.protobuf.a.n(mo.ono, strH2, ",.", strH2, " *");
                        String strA10 = HtmlUtils.a(iIntValue2);
                        int i314 = Util.f5683a;
                        Locale locale8 = Locale.US;
                        map.put(strN3, str19 + strA10 + str20);
                        it = it5;
                        str4 = str4;
                    }
                    str11 = str4;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i8 = 0;
                    while (i8 < length2) {
                        String str210 = str20;
                        obj3 = spans[i8];
                        String str211 = str19;
                        z2 = obj3 instanceof StrikethroughSpan;
                        String strR2 = null;
                        if (z2) {
                            z3 = z2;
                            strN = "<span style='text-decoration:line-through;'>";
                        } else {
                            z3 = z2;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strA11 = HtmlUtils.a(((ForegroundColorSpan) obj3).getForegroundColor());
                                int i315 = Util.f5683a;
                                Locale locale9 = Locale.US;
                                strN = android.support.v4.media.a.n("<span style='color:", strA11, ";'>");
                            } else {
                                spans = spans;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    int i316 = Util.f5683a;
                                    Locale locale10 = Locale.US;
                                    i11 = length2;
                                    strN = androidx.datastore.preferences.protobuf.a.k("<span class='bg_", backgroundColor2, "'>");
                                } else {
                                    i11 = length2;
                                    if (obj3 instanceof HorizontalTextInVerticalContextSpan) {
                                        strN = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr8 = {Float.valueOf(size)};
                                        int i46 = Util.f5683a;
                                        strN = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr8);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr9 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        int i47 = Util.f5683a;
                                        strN = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr9);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            int i48 = Util.f5683a;
                                            Locale locale11 = Locale.US;
                                            strN = android.support.v4.media.a.n("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strN = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strN = "<b>";
                                        } else if (style != 2) {
                                            strN = "<i>";
                                        } else if (style != 3) {
                                            strN = null;
                                        } else {
                                            strN = "<b><i>";
                                        }
                                    } else if (obj3 instanceof RubySpan) {
                                        i15 = ((RubySpan) obj3).f5621b;
                                        if (i15 != -1) {
                                            strN = "<ruby style='ruby-position:unset;'>";
                                        } else if (i15 != 1) {
                                            strN = "<ruby style='ruby-position:over;'>";
                                        } else if (i15 != 2) {
                                            strN = null;
                                        } else {
                                            strN = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strN = "<u>";
                                    } else if (obj3 instanceof TextEmphasisSpan) {
                                        textEmphasisSpan = (TextEmphasisSpan) obj3;
                                        i12 = textEmphasisSpan.f5623a;
                                        sb2 = new StringBuilder();
                                        i13 = textEmphasisSpan.f5624b;
                                        if (i13 != 1) {
                                            i14 = 2;
                                            if (i13 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i14 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i12 != 0) {
                                            sb2.append("none");
                                        } else if (i12 != 1) {
                                            sb2.append("circle");
                                        } else if (i12 != i14) {
                                            sb2.append("dot");
                                        } else if (i12 != 3) {
                                            sb2.append("unset");
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (textEmphasisSpan.f5625c != 2) {
                                            str12 = "over right";
                                        } else {
                                            str12 = "under left";
                                        }
                                        Object[] objArr10 = {string2, str12};
                                        int i49 = Util.f5683a;
                                        strN = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr10);
                                    } else {
                                        strN = null;
                                    }
                                }
                            }
                            if (z3) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strN != null) {
                                str13.getClass();
                                SpannedToHtmlConverter.SpanInfo spanInfo3 = new SpannedToHtmlConverter.SpanInfo(spanStart, spanEnd, strN, str13);
                                transition = (SpannedToHtmlConverter.Transition) sparseArray.get(spanStart);
                                if (transition == null) {
                                    transition = new SpannedToHtmlConverter.Transition();
                                    sparseArray.put(spanStart, transition);
                                }
                                transition.f7729a.add(spanInfo3);
                                transition2 = (SpannedToHtmlConverter.Transition) sparseArray.get(spanEnd);
                                if (transition2 == null) {
                                    transition2 = new SpannedToHtmlConverter.Transition();
                                    sparseArray.put(spanEnd, transition2);
                                }
                                transition2.f7730b.add(spanInfo3);
                            }
                            i8++;
                            str20 = str210;
                            str19 = str211;
                            spans = spans;
                        }
                        i11 = length2;
                        if (z3) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strN != null) {
                            str13.getClass();
                            SpannedToHtmlConverter.SpanInfo spanInfo4 = new SpannedToHtmlConverter.SpanInfo(spanStart, spanEnd, strN, str13);
                            transition = (SpannedToHtmlConverter.Transition) sparseArray.get(spanStart);
                            if (transition == null) {
                                transition = new SpannedToHtmlConverter.Transition();
                                sparseArray.put(spanStart, transition);
                            }
                            transition.f7729a.add(spanInfo4);
                            transition2 = (SpannedToHtmlConverter.Transition) sparseArray.get(spanEnd);
                            if (transition2 == null) {
                                transition2 = new SpannedToHtmlConverter.Transition();
                                sparseArray.put(spanEnd, transition2);
                            }
                            transition2.f7730b.add(spanInfo4);
                        }
                        i8++;
                        str20 = str210;
                        str19 = str211;
                        spans = spans;
                    }
                    str20 = str20;
                    str19 = str19;
                    sb = new StringBuilder(spanned.length());
                    i9 = 0;
                    i10 = 0;
                    while (i10 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i10);
                        sb.append(SpannedToHtmlConverter.a(spanned.subSequence(i9, iKeyAt2)));
                        SpannedToHtmlConverter.Transition transition4 = (SpannedToHtmlConverter.Transition) sparseArray.get(iKeyAt2);
                        Collections.sort(transition4.f7730b, SpannedToHtmlConverter.SpanInfo.f);
                        it2 = transition4.f7730b.iterator();
                        while (it2.hasNext()) {
                            sb.append(((SpannedToHtmlConverter.SpanInfo) it2.next()).d);
                        }
                        ArrayList arrayList2 = transition4.f7729a;
                        Collections.sort(arrayList2, SpannedToHtmlConverter.SpanInfo.f7725e);
                        it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            sb.append(((SpannedToHtmlConverter.SpanInfo) it3.next()).f7728c);
                        }
                        i10++;
                        i9 = iKeyAt2;
                    }
                    sb.append(SpannedToHtmlConverter.a(spanned.subSequence(i9, spanned.length())));
                    htmlAndCss = new SpannedToHtmlConverter.HtmlAndCss(sb.toString(), map);
                }
                while (r0.hasNext()) {
                    str18 = (String) map2.put(str26, (String) map2.get(str26));
                    if (str18 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    Assertions.e(z4);
                }
                Integer numValueOf7 = Integer.valueOf(i313);
                Float fValueOf4 = Float.valueOf(f6);
                Integer numValueOf8 = Integer.valueOf(i312);
                Integer numValueOf9 = Integer.valueOf(i29);
                f3 = cue.q;
                if (f3 != 0.0f) {
                    if (i32 != 2) {
                        str17 = "skewY";
                    } else {
                        str17 = "skewY";
                    }
                    Object[] objArr11 = {str17, Float.valueOf(f3)};
                    int i410 = Util.f5683a;
                    str14 = String.format(Locale.US, "%s(%.2fdeg)", objArr11);
                } else {
                    str14 = str9;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str7, str2, str29, str27, obj, str28, strB3, strA9, numValueOf8, numValueOf9, str14));
                sb3.append("<span class='default_bg'>");
                str15 = htmlAndCss.f7723a;
                alignment2 = cue.f5597c;
                if (alignment2 != null) {
                    i17 = AnonymousClass2.f7751a[alignment2.ordinal()];
                    if (i17 != 1) {
                        i16 = 2;
                        if (i17 != 2) {
                            str16 = str11;
                        } else {
                            str16 = TtmlNode.END;
                        }
                    } else {
                        i16 = 2;
                        str16 = str10;
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                    sb3.append(str15);
                    sb3.append("</span>");
                } else {
                    i16 = 2;
                    sb3.append(str15);
                }
                sb3.append("</span></div>");
                i28 = i313 + 1;
                webViewSubtitleOutput = this;
                i21 = i16;
                f4 = f7;
                str20 = str20;
                str19 = str19;
                i18 = 1;
                i19 = 0;
            }
            str11 = TtmlNode.CENTER;
            while (r0.hasNext()) {
                str18 = (String) map2.put(str26, (String) map2.get(str26));
                if (str18 != null) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                Assertions.e(z4);
            }
            Integer numValueOf10 = Integer.valueOf(i313);
            Float fValueOf5 = Float.valueOf(f6);
            Integer numValueOf11 = Integer.valueOf(i312);
            Integer numValueOf12 = Integer.valueOf(i29);
            f3 = cue.q;
            if (f3 != 0.0f) {
                if (i32 != 2) {
                    str17 = "skewY";
                } else {
                    str17 = "skewY";
                }
                Object[] objArr12 = {str17, Float.valueOf(f3)};
                int i411 = Util.f5683a;
                str14 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
            } else {
                str14 = str9;
            }
            sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str7, str2, str29, str27, obj, str28, strB3, strA9, numValueOf11, numValueOf12, str14));
            sb3.append("<span class='default_bg'>");
            str15 = htmlAndCss.f7723a;
            alignment2 = cue.f5597c;
            if (alignment2 != null) {
                i17 = AnonymousClass2.f7751a[alignment2.ordinal()];
                if (i17 != 1) {
                    i16 = 2;
                    if (i17 != 2) {
                        str16 = str11;
                    } else {
                        str16 = TtmlNode.END;
                    }
                } else {
                    i16 = 2;
                    str16 = str10;
                }
                sb3.append("<span style='display:inline-block; text-align:" + str16 + ";'>");
                sb3.append(str15);
                sb3.append("</span>");
            } else {
                i16 = 2;
                sb3.append(str15);
            }
            sb3.append("</span></div>");
            i28 = i313 + 1;
            webViewSubtitleOutput = this;
            i21 = i16;
            f4 = f7;
            str20 = str20;
            str19 = str19;
            i18 = 1;
            i19 = 0;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder("<html><head><style>");
        for (String str30 : map2.keySet()) {
            sb5.append(str30);
            sb5.append("{");
            sb5.append((String) map2.get(str30));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb3.insert(0, sb5.toString());
        this.f0.loadData(Base64.encodeToString(sb3.toString().getBytes(Charsets.f19705c), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (!z2 || this.g0.isEmpty()) {
            return;
        }
        c();
    }
}
