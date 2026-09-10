package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import m5.k;
import v.a;
import v1.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f4001f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f4002g = new j(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f4005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f4006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f4007e;

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.storage.androidcleaner.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f4005c = rect;
        this.f4006d = new Rect();
        k kVar = new k(this, 27);
        this.f4007e = kVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f52277a, com.storage.androidcleaner.R.attr.cardViewStyle, com.storage.androidcleaner.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f4001f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.storage.androidcleaner.R.color.cardview_light_background) : getResources().getColor(com.storage.androidcleaner.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f4003a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f4004b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        w.a aVar = new w.a(colorStateListValueOf, dimension);
        kVar.f45902b = aVar;
        setBackgroundDrawable(aVar);
        setClipToOutline(true);
        setElevation(dimension2);
        f4002g.g(kVar, dimension3);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((w.a) ((Drawable) this.f4007e.f45902b)).f52729h;
    }

    public float getCardElevation() {
        return ((CardView) this.f4007e.f45903c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f4005c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4005c.left;
    }

    public int getContentPaddingRight() {
        return this.f4005c.right;
    }

    public int getContentPaddingTop() {
        return this.f4005c.top;
    }

    public float getMaxCardElevation() {
        return ((w.a) ((Drawable) this.f4007e.f45902b)).f52726e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4004b;
    }

    public float getRadius() {
        return ((w.a) ((Drawable) this.f4007e.f45902b)).f52722a;
    }

    public boolean getUseCompatPadding() {
        return this.f4003a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        w.a aVar = (w.a) ((Drawable) this.f4007e.f45902b);
        if (colorStateListValueOf == null) {
            aVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        aVar.f52729h = colorStateListValueOf;
        aVar.f52723b.setColor(colorStateListValueOf.getColorForState(aVar.getState(), aVar.f52729h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((CardView) this.f4007e.f45903c).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f4002g.g(this.f4007e, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f4004b) {
            this.f4004b = z10;
            k kVar = this.f4007e;
            f4002g.g(kVar, ((w.a) ((Drawable) kVar.f45902b)).f52726e);
        }
    }

    public void setRadius(float f10) {
        w.a aVar = (w.a) ((Drawable) this.f4007e.f45902b);
        if (f10 == aVar.f52722a) {
            return;
        }
        aVar.f52722a = f10;
        aVar.b(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f4003a != z10) {
            this.f4003a = z10;
            k kVar = this.f4007e;
            f4002g.g(kVar, ((w.a) ((Drawable) kVar.f45902b)).f52726e);
        }
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        w.a aVar = (w.a) ((Drawable) this.f4007e.f45902b);
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.f52729h = colorStateList;
        aVar.f52723b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.f52729h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
