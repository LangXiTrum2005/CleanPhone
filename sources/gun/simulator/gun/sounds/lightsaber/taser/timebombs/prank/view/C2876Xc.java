package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2876Xc extends View implements InterfaceC5199za0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3979a;
    public List b;
    public int c;
    public float d;
    public C2902Yc e;
    public float f;

    public C2876Xc(Context context) {
        super(context, null);
        this.f3979a = new ArrayList();
        this.b = Collections.emptyList();
        this.c = 0;
        this.d = 0.0533f;
        this.e = C2902Yc.g;
        this.f = 0.08f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5199za0
    public final void a(List list, C2902Yc c2902Yc, float f, int i, float f2) {
        this.b = list;
        this.e = c2902Yc;
        this.d = f;
        this.c = i;
        this.f = f2;
        while (true) {
            ArrayList arrayList = this.f3979a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C5111ya0(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:199:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:201:0x04c0  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TextPaint textPaint;
        int i6;
        int i7;
        Canvas canvas2;
        boolean z;
        float f;
        int i8;
        float f2;
        int i9;
        int iMax;
        int iMin;
        int iRound;
        C2876Xc c2876Xc = this;
        Canvas canvas3 = canvas;
        List list = c2876Xc.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fL0 = AbstractC2995aW.l0(c2876Xc.c, c2876Xc.d, height, i10);
        if (fL0 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            C2417Fk c2417FkA = (C2417Fk) list.get(i11);
            if (c2417FkA.p != Integer.MIN_VALUE) {
                C2391Ek c2391EkA = c2417FkA.a();
                c2391EkA.h = -3.4028235E38f;
                c2391EkA.i = Integer.MIN_VALUE;
                c2391EkA.c = null;
                int i12 = c2417FkA.f;
                float f3 = c2417FkA.e;
                if (i12 == 0) {
                    c2391EkA.e = 1.0f - f3;
                    c2391EkA.f = 0;
                } else {
                    c2391EkA.e = (-f3) - 1.0f;
                    c2391EkA.f = 1;
                }
                int i13 = c2417FkA.g;
                if (i13 == 0) {
                    c2391EkA.g = 2;
                } else if (i13 == 2) {
                    c2391EkA.g = 0;
                }
                c2417FkA = c2391EkA.a();
            }
            float fL1 = AbstractC2995aW.l0(c2417FkA.n, c2417FkA.o, height, i10);
            C5111ya0 c5111ya0 = (C5111ya0) c2876Xc.f3979a.get(i11);
            C2902Yc c2902Yc = c2876Xc.e;
            List list2 = list;
            float f4 = c2876Xc.f;
            c5111ya0.getClass();
            Bitmap bitmap = c2417FkA.d;
            int i14 = height;
            int i15 = i10;
            boolean z2 = bitmap == null;
            CharSequence charSequence = c2417FkA.f3084a;
            if (z2) {
                if (TextUtils.isEmpty(charSequence)) {
                    canvas2 = canvas3;
                    i7 = paddingLeft;
                    i5 = paddingTop;
                    i4 = width;
                    i6 = paddingBottom;
                    i = size;
                    i3 = i11;
                } else {
                    i = size;
                    i2 = c2417FkA.l ? c2417FkA.m : c2902Yc.c;
                }
                i11 = i3 + 1;
                canvas3 = canvas2;
                list = list2;
                height = i14;
                i10 = i15;
                size = i;
                fL0 = fL0;
                paddingBottom = i6;
                width = i4;
                paddingTop = i5;
                paddingLeft = i7;
                c2876Xc = this;
            } else {
                i = size;
                i2 = ViewCompat.MEASURED_STATE_MASK;
            }
            i3 = i11;
            CharSequence charSequence2 = c5111ya0.i;
            TextPaint textPaint2 = c5111ya0.f;
            boolean z3 = z2;
            float f5 = c2417FkA.k;
            int i16 = paddingBottom;
            float f6 = c2417FkA.j;
            i4 = width;
            int i17 = c2417FkA.i;
            i5 = paddingTop;
            float f7 = c2417FkA.h;
            int i18 = paddingLeft;
            int i19 = c2417FkA.g;
            int i20 = c2417FkA.f;
            float f8 = c2417FkA.e;
            Layout.Alignment alignment = c2417FkA.b;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Ug0.a(c5111ya0.j, alignment) && c5111ya0.k == bitmap && c5111ya0.l == f8 && c5111ya0.m == i20) {
                if (Ug0.a(Integer.valueOf(c5111ya0.n), Integer.valueOf(i19)) && c5111ya0.o == f7 && Ug0.a(Integer.valueOf(c5111ya0.p), Integer.valueOf(i17)) && c5111ya0.q == f6 && c5111ya0.r == f5 && c5111ya0.s == c2902Yc.f4025a && c5111ya0.t == c2902Yc.b && c5111ya0.u == i2 && c5111ya0.w == c2902Yc.d && c5111ya0.v == c2902Yc.e && Ug0.a(textPaint2.getTypeface(), c2902Yc.f) && c5111ya0.x == fL0 && c5111ya0.y == fL1 && c5111ya0.z == f4) {
                    if (c5111ya0.A == i18) {
                        if (c5111ya0.B != i5) {
                            i5 = i5;
                        } else if (c5111ya0.C != i4) {
                            i5 = i5;
                            i4 = i4;
                        } else if (c5111ya0.D == i16) {
                            i5 = i5;
                            i4 = i4;
                            i6 = i16;
                            i7 = i18;
                            c5111ya0.a(canvas, z3);
                            canvas2 = canvas;
                            i11 = i3 + 1;
                            canvas3 = canvas2;
                            list = list2;
                            height = i14;
                            i10 = i15;
                            size = i;
                            fL0 = fL0;
                            paddingBottom = i6;
                            width = i4;
                            paddingTop = i5;
                            paddingLeft = i7;
                            c2876Xc = this;
                        } else {
                            i5 = i5;
                            i4 = i4;
                            i16 = i16;
                        }
                        i18 = i18;
                        textPaint = textPaint2;
                    } else {
                        i18 = i18;
                    }
                }
                textPaint = textPaint2;
            } else {
                textPaint = textPaint2;
            }
            c5111ya0.i = charSequence;
            c5111ya0.j = alignment;
            c5111ya0.k = bitmap;
            c5111ya0.l = f8;
            c5111ya0.m = i20;
            c5111ya0.n = i19;
            c5111ya0.o = f7;
            c5111ya0.p = i17;
            c5111ya0.q = f6;
            c5111ya0.r = f5;
            c5111ya0.s = c2902Yc.f4025a;
            c5111ya0.t = c2902Yc.b;
            c5111ya0.u = i2;
            c5111ya0.w = c2902Yc.d;
            c5111ya0.v = c2902Yc.e;
            textPaint.setTypeface(c2902Yc.f);
            c5111ya0.x = fL0;
            c5111ya0.y = fL1;
            c5111ya0.z = f4;
            int i21 = i18;
            c5111ya0.A = i21;
            i5 = i5;
            c5111ya0.B = i5;
            i4 = i4;
            c5111ya0.C = i4;
            i6 = i16;
            c5111ya0.D = i6;
            if (z3 != 0) {
                c5111ya0.i.getClass();
                CharSequence charSequence3 = c5111ya0.i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(c5111ya0.i);
                int i22 = c5111ya0.C - c5111ya0.A;
                int i23 = c5111ya0.D - c5111ya0.B;
                textPaint.setTextSize(c5111ya0.x);
                int i24 = (int) ((c5111ya0.x * 0.125f) + 0.5f);
                int i25 = i24 * 2;
                int i26 = i22 - i25;
                float f9 = c5111ya0.q;
                if (f9 != -3.4028235E38f) {
                    i26 = (int) (i26 * f9);
                }
                if (i26 <= 0) {
                    AbstractC4038mJ.f();
                    i7 = i21;
                    z = z3;
                    i5 = i5;
                    i6 = i6;
                    i4 = i4;
                    fL0 = fL0;
                } else {
                    i7 = i21;
                    if (c5111ya0.y > 0.0f) {
                        i9 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c5111ya0.y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        i9 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (c5111ya0.w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i9, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i27 = 0;
                        for (int length = foregroundColorSpanArr.length; i27 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i27]);
                            i27++;
                        }
                    }
                    if (Color.alpha(c5111ya0.t) > 0) {
                        int i28 = c5111ya0.w;
                        if (i28 == 0 || i28 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(c5111ya0.t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(c5111ya0.t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = c5111ya0.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i26, alignment2, c5111ya0.d, c5111ya0.e, true);
                    c5111ya0.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = c5111ya0.E.getLineCount();
                    fL0 = fL0;
                    int iMax2 = 0;
                    int i29 = 0;
                    while (i29 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(c5111ya0.E.getLineWidth(i29)), iMax2);
                        i29++;
                        lineCount = lineCount;
                        z3 = z3;
                    }
                    z = z3;
                    if (c5111ya0.q == -3.4028235E38f || iMax2 >= i26) {
                        i26 = iMax2;
                    }
                    int i30 = i26 + i25;
                    float f10 = c5111ya0.o;
                    if (f10 != -3.4028235E38f) {
                        int iRound2 = Math.round(i22 * f10);
                        int i31 = c5111ya0.A;
                        int i32 = iRound2 + i31;
                        int i33 = c5111ya0.p;
                        if (i33 == 1) {
                            i32 = ((i32 * 2) - i30) / 2;
                        } else if (i33 == 2) {
                            i32 -= i30;
                        }
                        iMax = Math.max(i32, i31);
                        iMin = Math.min(i30 + iMax, c5111ya0.C);
                    } else {
                        iMax = c5111ya0.A + ((i22 - i30) / 2);
                        iMin = iMax + i30;
                    }
                    int i34 = iMin - iMax;
                    if (i34 <= 0) {
                        AbstractC4038mJ.f();
                    } else {
                        float f11 = c5111ya0.l;
                        if (f11 != -3.4028235E38f) {
                            if (c5111ya0.m == 0) {
                                iRound = Math.round(i23 * f11) + c5111ya0.B;
                                int i35 = c5111ya0.n;
                                if (i35 == 2) {
                                    iRound -= height2;
                                } else if (i35 == 1) {
                                    iRound = ((iRound * 2) - height2) / 2;
                                }
                            } else {
                                int lineBottom = c5111ya0.E.getLineBottom(0) - c5111ya0.E.getLineTop(0);
                                float f12 = c5111ya0.l;
                                iRound = f12 >= 0.0f ? Math.round(f12 * lineBottom) + c5111ya0.B : (Math.round((f12 + 1.0f) * lineBottom) + c5111ya0.D) - height2;
                            }
                            int i36 = iRound + height2;
                            int i37 = c5111ya0.D;
                            if (i36 > i37) {
                                iRound = i37 - height2;
                            } else {
                                int i38 = c5111ya0.B;
                                if (iRound < i38) {
                                    iRound = i38;
                                }
                            }
                        } else {
                            iRound = (c5111ya0.D - height2) - ((int) (i23 * c5111ya0.z));
                        }
                        TextPaint textPaint3 = textPaint;
                        Layout.Alignment alignment3 = alignment2;
                        c5111ya0.E = new StaticLayout(spannableStringBuilder, textPaint3, i34, alignment3, c5111ya0.d, c5111ya0.e, true);
                        c5111ya0.F = new StaticLayout(spannableStringBuilder2, textPaint3, i34, alignment3, c5111ya0.d, c5111ya0.e, true);
                        c5111ya0.G = iMax;
                        c5111ya0.H = iRound;
                        c5111ya0.I = i24;
                    }
                }
            } else {
                i7 = i21;
                z = z3;
                i5 = i5;
                i6 = i6;
                i4 = i4;
                fL0 = fL0;
                c5111ya0.k.getClass();
                Bitmap bitmap2 = c5111ya0.k;
                int i39 = c5111ya0.C;
                int i40 = c5111ya0.A;
                int i41 = c5111ya0.D;
                int i42 = c5111ya0.B;
                float f13 = i39 - i40;
                float f14 = (c5111ya0.o * f13) + i40;
                float f15 = i41 - i42;
                float f16 = (c5111ya0.l * f15) + i42;
                int iRound3 = Math.round(f13 * c5111ya0.q);
                float f17 = c5111ya0.r;
                int iRound4 = f17 != -3.4028235E38f ? Math.round(f15 * f17) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                int i43 = c5111ya0.p;
                if (i43 == 2) {
                    f = iRound3;
                } else {
                    if (i43 == 1) {
                        f = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f14);
                    i8 = c5111ya0.n;
                    if (i8 == 2) {
                        f2 = iRound4;
                    } else {
                        if (i8 == 1) {
                            f2 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f16);
                        c5111ya0.J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f16 -= f2;
                    int iRound7 = Math.round(f16);
                    c5111ya0.J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f14 -= f;
                int iRound8 = Math.round(f14);
                i8 = c5111ya0.n;
                if (i8 == 2) {
                    f2 = iRound4;
                } else {
                    if (i8 == 1) {
                        f2 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f16);
                    c5111ya0.J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f16 -= f2;
                int iRound10 = Math.round(f16);
                c5111ya0.J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            canvas2 = canvas;
            c5111ya0.a(canvas2, z);
            i11 = i3 + 1;
            canvas3 = canvas2;
            list = list2;
            height = i14;
            i10 = i15;
            size = i;
            fL0 = fL0;
            paddingBottom = i6;
            width = i4;
            paddingTop = i5;
            paddingLeft = i7;
            c2876Xc = this;
        }
    }
}
