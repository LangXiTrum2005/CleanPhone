package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.charging.screenshow.battery.animations.themes.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class RadialViewGroup extends ConstraintLayout {
    public final b e0;
    public int f0;
    public final MaterialShapeDrawable g0;

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.g0 = materialShapeDrawable;
        RelativeCornerSize relativeCornerSize = new RelativeCornerSize(0.5f);
        ShapeAppearanceModel.Builder builderF = materialShapeDrawable.X.f19417a.f();
        builderF.f19437e = relativeCornerSize;
        builderF.f = relativeCornerSize;
        builderF.g = relativeCornerSize;
        builderF.f19438h = relativeCornerSize;
        materialShapeDrawable.setShapeAppearanceModel(builderF.a());
        this.g0.l(ColorStateList.valueOf(-1));
        MaterialShapeDrawable materialShapeDrawable2 = this.g0;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        setBackground(materialShapeDrawable2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f19077z, R.attr.materialClockStyle, 0);
        this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.e0 = new b(this, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            b bVar = this.e0;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    public void l() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.e(this);
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!map.containsKey(i3)) {
                    map.put(i3, new ArrayList());
                }
                ((List) map.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.f0 * 0.66f) : this.f0;
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                ConstraintSet.Layout layout = constraintSet.k(((View) it.next()).getId()).d;
                layout.x = R.id.circle_center;
                layout.y = iRound;
                layout.f4108z = size;
                size += 360.0f / list.size();
            }
        }
        constraintSet.b(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            b bVar = this.e0;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i2) {
        this.g0.l(ColorStateList.valueOf(i2));
    }
}
