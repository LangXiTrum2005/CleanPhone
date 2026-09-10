package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    public final ClockHandView h0;
    public final Rect i0;
    public final RectF j0;
    public final Rect k0;
    public final SparseArray l0;
    public final AccessibilityDelegateCompat m0;
    public final int[] n0;
    public final float[] o0;
    public final int p0;
    public final int q0;
    public final int r0;
    public final int s0;
    public String[] t0;
    public float u0;
    public final ColorStateList v0;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i0 = new Rect();
        this.j0 = new RectF();
        this.k0 = new Rect();
        this.l0 = new SparseArray();
        this.o0 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.g, com.charging.screenshow.battery.animations.themes.R.attr.materialClockStyle, com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListA = MaterialResources.a(context, typedArrayObtainStyledAttributes, 1);
        this.v0 = colorStateListA;
        LayoutInflater.from(context).inflate(com.charging.screenshow.battery.animations.themes.R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.material_clock_hand);
        this.h0 = clockHandView;
        this.p0 = resources.getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.n0 = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.n0.add(this);
        int defaultColor = ContextCompat.getColorStateList(context, com.charging.screenshow.battery.animations.themes.R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListA2 = MaterialResources.a(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                ClockFaceView clockFaceView = ClockFaceView.this;
                if (!clockFaceView.isShown()) {
                    return true;
                }
                clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
                int height = ((clockFaceView.getHeight() / 2) - clockFaceView.h0.o0) - clockFaceView.p0;
                if (height != clockFaceView.f0) {
                    clockFaceView.f0 = height;
                    clockFaceView.l();
                    int i2 = clockFaceView.f0;
                    ClockHandView clockHandView2 = clockFaceView.h0;
                    clockHandView2.x0 = i2;
                    clockHandView2.invalidate();
                }
                return true;
            }
        });
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.m0 = new AccessibilityDelegateCompat() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                View.AccessibilityDelegate accessibilityDelegate = this.f4417a;
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                int iIntValue = ((Integer) view.getTag(com.charging.screenshow.battery.animations.themes.R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    accessibilityNodeInfo.setTraversalAfter((View) ClockFaceView.this.l0.get(iIntValue - 1));
                }
                accessibilityNodeInfoCompat.l(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 1, iIntValue, 1, view.isSelected()));
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfoCompat.b(AccessibilityNodeInfoCompat.AccessibilityActionCompat.g);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final boolean g(View view, int i2, Bundle bundle) {
                if (i2 != 16) {
                    return super.g(view, i2, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                ClockFaceView clockFaceView = ClockFaceView.this;
                view.getHitRect(clockFaceView.i0);
                float fCenterX = clockFaceView.i0.centerX();
                float fCenterY = clockFaceView.i0.centerY();
                clockFaceView.h0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                clockFaceView.h0.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        q(0, strArr);
        this.q0 = resources.getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.material_time_picker_minimum_screen_height);
        this.r0 = resources.getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.material_time_picker_minimum_screen_width);
        this.s0 = resources.getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public final void b(float f, boolean z2) {
        if (Math.abs(this.u0 - f) > 0.001f) {
            this.u0 = f;
            p();
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void l() {
        super.l();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.l0;
            if (i2 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i2)).setVisibility(0);
            i2++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).k(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(1, this.t0.length, 1, false));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.s0 / Math.max(Math.max(this.q0 / displayMetrics.heightPixels, this.r0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public final void p() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.h0.r0;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i2 = 0;
        while (true) {
            sparseArray = this.l0;
            int size = sparseArray.size();
            rectF = this.j0;
            rect = this.i0;
            if (i2 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i2++;
        }
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            TextView textView3 = (TextView) sparseArray.get(i3);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.k0;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.n0, this.o0, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    public final void q(int i2, String[] strArr) {
        this.t0 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        SparseArray sparseArray = this.l0;
        int size = sparseArray.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < Math.max(this.t0.length, size); i3++) {
            TextView textView = (TextView) sparseArray.get(i3);
            if (i3 >= this.t0.length) {
                removeView(textView);
                sparseArray.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(com.charging.screenshow.battery.animations.themes.R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i3, textView);
                    addView(textView);
                }
                textView.setText(this.t0[i3]);
                textView.setTag(com.charging.screenshow.battery.animations.themes.R.id.material_value_index, Integer.valueOf(i3));
                int i4 = (i3 / 12) + 1;
                textView.setTag(com.charging.screenshow.battery.animations.themes.R.id.material_clock_level, Integer.valueOf(i4));
                if (i4 > 1) {
                    z2 = true;
                }
                ViewCompat.z(textView, this.m0);
                textView.setTextColor(this.v0);
                if (i2 != 0) {
                    textView.setContentDescription(getResources().getString(i2, this.t0[i3]));
                }
            }
        }
        ClockHandView clockHandView = this.h0;
        if (clockHandView.m0 && !z2) {
            clockHandView.y0 = 1;
        }
        clockHandView.m0 = z2;
        clockHandView.invalidate();
    }
}
