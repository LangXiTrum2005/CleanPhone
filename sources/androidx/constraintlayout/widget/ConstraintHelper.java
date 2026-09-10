package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {
    public int[] e0;
    public int f0;
    public Context g0;
    public HelperWidget h0;
    public String i0;
    public View[] j0;
    public HashMap k0;

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.g0 == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, strTrim);
            if (designInformation instanceof Integer) {
                identifier = ((Integer) designInformation).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = d(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            Context context = this.g0;
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.k0.put(Integer.valueOf(identifier), strTrim);
            b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f0 + 1;
        int[] iArr = this.e0;
        if (i3 > iArr.length) {
            this.e0 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.e0;
        int i4 = this.f0;
        iArr2[i4] = i2;
        this.f0 = i4 + 1;
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f0; i2++) {
            View viewById = constraintLayout.getViewById(this.e0[i2]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.g0.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final View[] e(ConstraintLayout constraintLayout) {
        View[] viewArr = this.j0;
        if (viewArr == null || viewArr.length != this.f0) {
            this.j0 = new View[this.f0];
        }
        for (int i2 = 0; i2 < this.f0; i2++) {
            this.j0[i2] = constraintLayout.getViewById(this.e0[i2]);
        }
        return this.j0;
    }

    public void f(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f4127b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 19) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.i0 = string;
                    setIds(string);
                }
            }
        }
    }

    public void g(ConstraintWidget constraintWidget, boolean z2) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.e0, this.f0);
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public final void j() {
        if (this.h0 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).l0 = this.h0;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.i0;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.i0 = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f0 = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i2);
            if (iIndexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.i0 = null;
        this.f0 = 0;
        for (int i2 : iArr) {
            b(i2);
        }
    }

    public void h() {
    }
}
