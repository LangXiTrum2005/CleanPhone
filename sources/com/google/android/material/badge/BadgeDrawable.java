package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public final WeakReference X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final MaterialShapeDrawable f19106Y;
    public final TextDrawableHelper Z;
    public final Rect e0;
    public final BadgeState f0;
    public float g0;
    public float h0;
    public final int i0;
    public float j0;
    public float k0;
    public float l0;
    public WeakReference m0;
    public WeakReference n0;

    /* JADX INFO: renamed from: com.google.android.material.badge.BadgeDrawable$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    public BadgeDrawable(Context context, BadgeState.State state) {
        TextAppearance textAppearance;
        WeakReference weakReference = new WeakReference(context);
        this.X = weakReference;
        ThemeEnforcement.c(context, "Theme.MaterialComponents", ThemeEnforcement.f19351b);
        this.e0 = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.Z = textDrawableHelper;
        TextPaint textPaint = textDrawableHelper.f19345a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, state);
        this.f0 = badgeState;
        boolean zF = f();
        BadgeState.State state2 = badgeState.f19108b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.a(context, zF ? state2.h0.intValue() : state2.f0.intValue(), f() ? state2.i0.intValue() : state2.g0.intValue()).a());
        this.f19106Y = materialShapeDrawable;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && textDrawableHelper.g != (textAppearance = new TextAppearance(context2, state2.e0.intValue()))) {
            textDrawableHelper.c(textAppearance, context2);
            textPaint.setColor(state2.Z.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i2 = state2.m0;
        if (i2 != -2) {
            this.i0 = ((int) Math.pow(10.0d, ((double) i2) - 1.0d)) - 1;
        } else {
            this.i0 = state2.n0;
        }
        textDrawableHelper.f19348e = true;
        j();
        invalidateSelf();
        textDrawableHelper.f19348e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(state2.f19113Y.intValue());
        if (materialShapeDrawable.X.f19419c != colorStateListValueOf) {
            materialShapeDrawable.l(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.Z.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.m0;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.m0.get();
            WeakReference weakReference3 = this.n0;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(state2.u0.booleanValue(), false);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        BadgeState badgeState = this.f0;
        BadgeState.State state = badgeState.f19108b;
        String str = state.k0;
        boolean z2 = str != null;
        WeakReference weakReference = this.X;
        if (z2) {
            int i2 = state.m0;
            if (i2 == -2 || str == null || str.length() <= i2) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
        }
        if (!g()) {
            return null;
        }
        int i3 = this.i0;
        BadgeState.State state2 = badgeState.f19108b;
        if (i3 == -2 || e() <= this.i0) {
            return NumberFormat.getInstance(state2.o0).format(e());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(state2.o0, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.i0), "+");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        BadgeState badgeState = this.f0;
        BadgeState.State state = badgeState.f19108b;
        String str = state.k0;
        if (str != null) {
            String str2 = state.p0;
            return str2 != null ? str2 : str;
        }
        boolean zG = g();
        BadgeState.State state2 = badgeState.f19108b;
        if (!zG) {
            return state2.q0;
        }
        if (state2.r0 == 0 || (context = (Context) this.X.get()) == null) {
            return null;
        }
        if (this.i0 != -2) {
            int iE = e();
            int i2 = this.i0;
            if (iE > i2) {
                return context.getString(state2.s0, Integer.valueOf(i2));
            }
        }
        return context.getResources().getQuantityString(state2.r0, e(), Integer.valueOf(e()));
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.n0;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strB;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f19106Y.draw(canvas);
        if (!f() || (strB = b()) == null) {
            return;
        }
        Rect rect = new Rect();
        TextDrawableHelper textDrawableHelper = this.Z;
        textDrawableHelper.f19345a.getTextBounds(strB, 0, strB.length(), rect);
        float fExactCenterY = this.h0 - rect.exactCenterY();
        canvas.drawText(strB, this.g0, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), textDrawableHelper.f19345a);
    }

    public final int e() {
        int i2 = this.f0.f19108b.l0;
        if (i2 != -1) {
            return i2;
        }
        return 0;
    }

    public final boolean f() {
        return this.f0.f19108b.k0 != null || g();
    }

    public final boolean g() {
        BadgeState.State state = this.f0.f19108b;
        return state.k0 == null && state.l0 != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f0.f19108b.j0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.e0.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.e0.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.X.get();
        if (context == null) {
            return;
        }
        boolean zF = f();
        BadgeState badgeState = this.f0;
        this.f19106Y.setShapeAppearanceModel(ShapeAppearanceModel.a(context, zF ? badgeState.f19108b.h0.intValue() : badgeState.f19108b.f0.intValue(), f() ? badgeState.f19108b.i0.intValue() : badgeState.f19108b.g0.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.m0 = new WeakReference(view);
        this.n0 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0239  */
    /* JADX WARN: Code duplicated, block: B:102:0x0251  */
    /* JADX WARN: Code duplicated, block: B:105:0x0256  */
    /* JADX WARN: Code duplicated, block: B:108:0x0263  */
    /* JADX WARN: Code duplicated, block: B:111:0x0270  */
    /* JADX WARN: Code duplicated, block: B:114:0x027d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0218  */
    /* JADX WARN: Code duplicated, block: B:98:0x0230  */
    public final void j() {
        float y;
        float x;
        float y2;
        float x2;
        float height;
        float width;
        float f;
        WeakReference weakReference = this.X;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.m0;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.e0;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.n0;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zF = f();
        BadgeState badgeState = this.f0;
        float f2 = zF ? badgeState.d : badgeState.f19109c;
        this.j0 = f2;
        if (f2 != -1.0f) {
            this.k0 = f2;
            this.l0 = f2;
        } else {
            this.k0 = Math.round((f() ? badgeState.g : badgeState.f19110e) / 2.0f);
            this.l0 = Math.round((f() ? badgeState.f19111h : badgeState.f) / 2.0f);
        }
        if (f()) {
            String strB = b();
            float f3 = this.k0;
            TextDrawableHelper textDrawableHelper = this.Z;
            this.k0 = Math.max(f3, (textDrawableHelper.a(strB) / 2.0f) + badgeState.f19108b.v0.intValue());
            float f4 = this.l0;
            if (textDrawableHelper.f19348e) {
                textDrawableHelper.b(strB);
                f = textDrawableHelper.d;
            } else {
                f = textDrawableHelper.d;
            }
            float fMax = Math.max(f4, (f / 2.0f) + badgeState.f19108b.w0.intValue());
            this.l0 = fMax;
            this.k0 = Math.max(this.k0, fMax);
        }
        int iIntValue = badgeState.f19108b.y0.intValue();
        boolean zF2 = f();
        BadgeState.State state = badgeState.f19108b;
        if (zF2) {
            iIntValue = state.A0.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = AnimationUtils.c(AnimationUtils.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue, iIntValue - state.D0.intValue());
            }
        }
        int i2 = badgeState.k;
        if (i2 == 0) {
            iIntValue -= Math.round(this.l0);
        }
        int iIntValue2 = state.C0.intValue() + iIntValue;
        int iIntValue3 = state.t0.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.h0 = rect3.bottom - iIntValue2;
        } else {
            this.h0 = rect3.top + iIntValue2;
        }
        int iIntValue4 = f() ? state.z0.intValue() : state.x0.intValue();
        if (i2 == 1) {
            iIntValue4 += f() ? badgeState.j : badgeState.f19112i;
        }
        int iIntValue5 = state.B0.intValue() + iIntValue4;
        int iIntValue6 = state.t0.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            this.g0 = view.getLayoutDirection() == 0 ? (rect3.left - this.k0) + iIntValue5 : (rect3.right + this.k0) - iIntValue5;
        } else {
            WeakHashMap weakHashMap2 = ViewCompat.f4466a;
            this.g0 = view.getLayoutDirection() == 0 ? (rect3.right + this.k0) - iIntValue5 : (rect3.left - this.k0) + iIntValue5;
        }
        if (state.E0.booleanValue()) {
            View viewD = d();
            if (viewD != null) {
                FrameLayout frameLayoutD = d();
                if (frameLayoutD == null || frameLayoutD.getId() != R.id.mtrl_anchor_parent) {
                    y = 0.0f;
                    x = 0.0f;
                } else if (viewD.getParent() instanceof View) {
                    y = viewD.getY();
                    x = viewD.getX();
                    viewD = (View) viewD.getParent();
                }
                y2 = viewD.getY() + (this.h0 - this.l0) + y;
                x2 = viewD.getX() + (this.g0 - this.k0) + x;
                if (viewD.getParent() instanceof View) {
                    height = ((this.h0 + this.l0) - (((View) viewD.getParent()).getHeight() - viewD.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewD.getParent() instanceof View) {
                    width = ((this.g0 + this.k0) - (((View) viewD.getParent()).getWidth() - viewD.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.h0 = Math.abs(y2) + this.h0;
                }
                if (x2 < 0.0f) {
                    this.g0 = Math.abs(x2) + this.g0;
                }
                if (height > 0.0f) {
                    this.h0 -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.g0 -= Math.abs(width);
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                x = view.getX();
                View view2 = (View) view.getParent();
                y = y3;
                viewD = view2;
                y2 = viewD.getY() + (this.h0 - this.l0) + y;
                x2 = viewD.getX() + (this.g0 - this.k0) + x;
                if (viewD.getParent() instanceof View) {
                    height = ((this.h0 + this.l0) - (((View) viewD.getParent()).getHeight() - viewD.getY())) + y;
                } else {
                    height = 0.0f;
                }
                if (viewD.getParent() instanceof View) {
                    width = ((this.g0 + this.k0) - (((View) viewD.getParent()).getWidth() - viewD.getX())) + x;
                } else {
                    width = 0.0f;
                }
                if (y2 < 0.0f) {
                    this.h0 = Math.abs(y2) + this.h0;
                }
                if (x2 < 0.0f) {
                    this.g0 = Math.abs(x2) + this.g0;
                }
                if (height > 0.0f) {
                    this.h0 -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.g0 -= Math.abs(width);
                }
            }
        }
        float f5 = this.g0;
        float f6 = this.h0;
        float f7 = this.k0;
        float f8 = this.l0;
        rect2.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
        float f9 = this.j0;
        MaterialShapeDrawable materialShapeDrawable = this.f19106Y;
        if (f9 != -1.0f) {
            ShapeAppearanceModel.Builder builderF = materialShapeDrawable.X.f19417a.f();
            builderF.c(f9);
            materialShapeDrawable.setShapeAppearanceModel(builderF.a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        materialShapeDrawable.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        BadgeState badgeState = this.f0;
        badgeState.f19107a.j0 = i2;
        badgeState.f19108b.j0 = i2;
        this.Z.f19345a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
