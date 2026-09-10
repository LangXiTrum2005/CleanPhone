package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBCusRoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Xfermode f32940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f32946k;
    private int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float[] f32949o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float[] f32950p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RectF f32951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RectF f32952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f32953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f32954t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Path f32955u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Paint f32956v;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f32957a;

        static {
            int[] iArr = new int[c.values().length];
            f32957a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32957a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32957a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32957a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32957a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32957a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32957a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32957a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32957a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32957a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32957a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32957a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32957a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32957a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32957a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32957a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBCusRoundImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f32947m, this.f32948n, this.f32952r, this.f32949o);
    }

    private void b() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f32949o == null || this.f32950p == null) {
                return;
            }
            int i13 = 0;
            while (true) {
                i10 = 2;
                if (i13 >= 2) {
                    break;
                }
                float[] fArr = this.f32949o;
                float f10 = this.f32944i;
                fArr[i13] = f10;
                this.f32950p[i13] = f10 - (this.f32947m / 2.0f);
                i13++;
            }
            while (true) {
                i11 = 4;
                if (i10 >= 4) {
                    break;
                }
                float[] fArr2 = this.f32949o;
                float f11 = this.f32945j;
                fArr2[i10] = f11;
                this.f32950p[i10] = f11 - (this.f32947m / 2.0f);
                i10++;
            }
            while (true) {
                if (i11 >= 6) {
                    break;
                }
                float[] fArr3 = this.f32949o;
                float f12 = this.f32946k;
                fArr3[i11] = f12;
                this.f32950p[i11] = f12 - (this.f32947m / 2.0f);
                i11++;
            }
            for (i12 = 6; i12 < 8; i12++) {
                float[] fArr4 = this.f32949o;
                float f13 = this.l;
                fArr4[i12] = f13;
                this.f32950p[i12] = f13 - (this.f32947m / 2.0f);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f32952r;
        if (rectF != null) {
            float f10 = this.f32947m / 2.0f;
            rectF.set(f10, f10, this.f32941f - f10, this.f32942g - f10);
        }
    }

    private void d() {
        RectF rectF = this.f32951q;
        if (rectF != null) {
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f32941f, this.f32942g);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f32957a[cVar.ordinal()];
                if (i11 == 6) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i11 == 13) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith("f") || attributeValue2.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue2);
                    }
                } else if (i11 == 14) {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (attributeValue3.startsWith("f") || attributeValue3.startsWith("m")) {
                        layoutParams.height = -1;
                    } else if (attributeValue3.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue3);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f32951q, null, 31);
            int i10 = this.f32941f;
            int i11 = this.f32947m * 2;
            float f10 = (i10 - i11) * 1.0f;
            float f11 = i10;
            int i12 = this.f32942g;
            float f12 = i12;
            canvas.scale(f10 / f11, ((i12 - i11) * 1.0f) / f12, f11 / 2.0f, f12 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f32956v;
            if (paint != null) {
                paint.reset();
                this.f32956v.setAntiAlias(true);
                this.f32956v.setStyle(Paint.Style.FILL);
                this.f32956v.setXfermode(this.f32940e);
            }
            Path path = this.f32955u;
            if (path != null) {
                path.reset();
                this.f32955u.addRoundRect(this.f32951q, this.f32950p, Path.Direction.CCW);
            }
            canvas.drawPath(this.f32955u, this.f32956v);
            Paint paint2 = this.f32956v;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f32953s) {
                a(canvas);
            }
        } catch (Exception e10) {
            q0.a("MBridgeImageView", e10.getMessage());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        try {
            this.f32941f = i10;
            this.f32942g = i11;
            if (this.f32954t) {
                b();
            } else {
                a();
            }
            c();
            d();
        } catch (Exception e10) {
            q0.b("MBridgeImageView", e10.getMessage());
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f32957a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                        }
                        break;
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i10), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArrSplit = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArrSplit = null;
                            }
                            if (strArrSplit != null && strArrSplit.length <= 2) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            } else if (strArrSplit == null || strArrSplit.length != 3) {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                            } else {
                                try {
                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                    gradientDrawable.setGradientType(0);
                                    setBackground(gradientDrawable);
                                } catch (Exception unused2) {
                                    setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                }
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.utils.b.f33289a.get(attributeValue3.substring(8));
                            if (!TextUtils.isEmpty(charSequence)) {
                                setContentDescription(charSequence);
                            }
                        }
                        break;
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue4)) {
                            String str = com.mbridge.msdk.dycreator.utils.b.f33289a.get(attributeValue4.substring(8));
                            if (!TextUtils.isEmpty(str)) {
                                setTag(str);
                            }
                        }
                        break;
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue5)) {
                            if (attributeValue5.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue5.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                        break;
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (!TextUtils.isEmpty(attributeValue6)) {
                            if (attributeValue6.equals("fitXY")) {
                                setScaleType(ImageView.ScaleType.FIT_XY);
                            } else if (attributeValue6.equals("centerInside")) {
                                setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            } else if (attributeValue6.equals("centerCrop")) {
                                setScaleType(ImageView.ScaleType.CENTER_CROP);
                            }
                        }
                        break;
                    case 8:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f32939d = iA;
                        this.f32938c = iA;
                        this.f32937b = iA;
                        this.f32936a = iA;
                        setPadding(iA, iA, iA, iA);
                        break;
                    case 9:
                        int iA2 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f32937b = iA2;
                        setPadding(this.f32936a, iA2, this.f32938c, this.f32939d);
                        break;
                    case 10:
                        int iA3 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f32939d = iA3;
                        setPadding(this.f32936a, this.f32937b, this.f32938c, iA3);
                        break;
                    case 11:
                        int iA4 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f32936a = iA4;
                        setPadding(iA4, this.f32937b, this.f32938c, this.f32939d);
                        break;
                    case 12:
                        int iA5 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f32938c = iA5;
                        setPadding(this.f32936a, this.f32937b, iA5, this.f32939d);
                        break;
                }
            }
        }
    }

    public void setBorder(int i10, int i11, int i12) {
        this.f32953s = true;
        this.f32947m = i11;
        this.f32948n = i12;
        this.f32943h = i10;
    }

    public void setCornerRadius(int i10) {
        this.f32943h = i10;
    }

    public void setCustomBorder(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f32953s = true;
        this.f32954t = true;
        this.f32947m = i14;
        this.f32948n = i15;
        this.f32944i = i10;
        this.f32946k = i12;
        this.f32945j = i11;
        this.l = i13;
    }

    public MBCusRoundImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(Canvas canvas, int i10, int i11, RectF rectF, float[] fArr) {
        try {
            a(i10, i11);
            Path path = this.f32955u;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f32955u, this.f32956v);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32955u = new Path();
        this.f32956v = new Paint();
        this.f32949o = new float[8];
        this.f32950p = new float[8];
        this.f32952r = new RectF();
        this.f32951q = new RectF();
        this.f32940e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i10, int i11) {
        Path path = this.f32955u;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f32956v;
        if (paint != null) {
            paint.setStrokeWidth(i10);
            this.f32956v.setColor(i11);
            this.f32956v.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f32949o == null || this.f32950p == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            try {
                float[] fArr = this.f32949o;
                if (i10 >= fArr.length) {
                    return;
                }
                float f10 = this.f32943h;
                fArr[i10] = f10;
                this.f32950p[i10] = f10 - (this.f32947m / 2.0f);
                i10++;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
    }
}
