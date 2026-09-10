package com.google.android.material.card;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class MaterialCardViewHelper {
    public static final double y = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f19157z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f19158a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaterialShapeDrawable f19160c;
    public final MaterialShapeDrawable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19161e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f19163i;
    public Drawable j;
    public ColorStateList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f19164l;
    public ShapeAppearanceModel m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f19165n;
    public RippleDrawable o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f19166p;
    public MaterialShapeDrawable q;
    public boolean s;
    public ValueAnimator t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f19167u;
    public final int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19168w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f19159b = new Rect();
    public boolean r = false;
    public float x = 0.0f;

    /* JADX INFO: renamed from: com.google.android.material.card.MaterialCardViewHelper$1, reason: invalid class name */
    class AnonymousClass1 extends InsetDrawable {
        @Override // android.graphics.drawable.Drawable
        public final int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public final boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f19157z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public MaterialCardViewHelper(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f19158a = materialCardView;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.f19160c = materialShapeDrawable;
        materialShapeDrawable.j(materialCardView.getContext());
        materialShapeDrawable.n(-12303292);
        ShapeAppearanceModel.Builder builderF = materialShapeDrawable.X.f19417a.f();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.d, R.attr.materialCardViewStyle, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            builderF.c(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.d = new MaterialShapeDrawable();
        h(builderF.a());
        this.f19167u = MotionUtils.d(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, AnimationUtils.f19078a);
        this.v = MotionUtils.c(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f19168w = MotionUtils.c(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(CornerTreatment cornerTreatment, float f) {
        if (cornerTreatment instanceof RoundedCornerTreatment) {
            return (float) ((1.0d - y) * ((double) f));
        }
        if (cornerTreatment instanceof CutCornerTreatment) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        CornerTreatment cornerTreatment = this.m.f19427a;
        MaterialShapeDrawable materialShapeDrawable = this.f19160c;
        return Math.max(Math.max(b(cornerTreatment, materialShapeDrawable.h()), b(this.m.f19428b, materialShapeDrawable.X.f19417a.f.a(materialShapeDrawable.g()))), Math.max(b(this.m.f19429c, materialShapeDrawable.X.f19417a.g.a(materialShapeDrawable.g())), b(this.m.d, materialShapeDrawable.X.f19417a.f19431h.a(materialShapeDrawable.g()))));
    }

    public final LayerDrawable c() {
        if (this.o == null) {
            this.q = new MaterialShapeDrawable(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.f19166p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.f19166p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f19166p;
    }

    public final Drawable d(Drawable drawable) {
        int iCeil;
        int i2;
        MaterialCardView materialCardView = this.f19158a;
        if (materialCardView.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f));
            i2 = iCeil2;
        } else {
            iCeil = 0;
            i2 = 0;
        }
        return new AnonymousClass1(drawable, iCeil, i2, iCeil, i2);
    }

    public final void e(int i2, int i3) {
        int iCeil;
        int iCeil2;
        int i4;
        int i5;
        if (this.f19166p != null) {
            MaterialCardView materialCardView = this.f19158a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i6 = this.g;
            int i7 = (i6 & 8388613) == 8388613 ? ((i2 - this.f19161e) - this.f) - iCeil2 : this.f19161e;
            int i8 = (i6 & 80) == 80 ? this.f19161e : ((i3 - this.f19161e) - this.f) - iCeil;
            int i9 = (i6 & 8388613) == 8388613 ? this.f19161e : ((i2 - this.f19161e) - this.f) - iCeil2;
            int i10 = (i6 & 80) == 80 ? ((i3 - this.f19161e) - this.f) - iCeil : this.f19161e;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            if (materialCardView.getLayoutDirection() == 1) {
                i5 = i9;
                i4 = i7;
            } else {
                i4 = i9;
                i5 = i7;
            }
            this.f19166p.setLayerInset(2, i5, i10, i4, i8);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = z2 ? 1.0f - this.x : this.x;
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.x, f);
            this.t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.card.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    ColorDrawable colorDrawable = MaterialCardViewHelper.f19157z;
                    MaterialCardViewHelper materialCardViewHelper = this.X;
                    materialCardViewHelper.getClass();
                    float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    materialCardViewHelper.j.setAlpha((int) (255.0f * fFloatValue));
                    materialCardViewHelper.x = fFloatValue;
                }
            });
            this.t.setInterpolator(this.f19167u);
            this.t.setDuration((long) ((z2 ? this.v : this.f19168w) * f2));
            this.t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            DrawableCompat.j(drawableMutate, this.f19164l);
            f(this.f19158a.n0, false);
        } else {
            this.j = f19157z;
        }
        LayerDrawable layerDrawable = this.f19166p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(ShapeAppearanceModel shapeAppearanceModel) {
        this.m = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f19160c;
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        materialShapeDrawable.x0 = !materialShapeDrawable.X.f19417a.e(materialShapeDrawable.g());
        MaterialShapeDrawable materialShapeDrawable2 = this.d;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel);
        }
        MaterialShapeDrawable materialShapeDrawable3 = this.q;
        if (materialShapeDrawable3 != null) {
            materialShapeDrawable3.setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f19158a;
        if (!materialCardView.getPreventCornerOverlap()) {
            return false;
        }
        MaterialShapeDrawable materialShapeDrawable = this.f19160c;
        return materialShapeDrawable.X.f19417a.e(materialShapeDrawable.g()) && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f19158a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.f19163i;
        Drawable drawableC = j() ? c() : this.d;
        this.f19163i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.f19158a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public final void l() {
        boolean z2;
        MaterialCardView materialCardView = this.f19158a;
        if (materialCardView.getPreventCornerOverlap()) {
            MaterialShapeDrawable materialShapeDrawable = this.f19160c;
            if (materialShapeDrawable.X.f19417a.e(materialShapeDrawable.g())) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        float cardViewRadius = 0.0f;
        float fA = (z2 || i()) ? a() : 0.0f;
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i2 = (int) (fA - cardViewRadius);
        Rect rect = this.f19159b;
        materialCardView.d(rect.left + i2, rect.top + i2, rect.right + i2, rect.bottom + i2);
    }

    public final void m() {
        boolean z2 = this.r;
        MaterialCardView materialCardView = this.f19158a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.f19160c));
        }
        materialCardView.setForeground(d(this.f19163i));
    }
}
