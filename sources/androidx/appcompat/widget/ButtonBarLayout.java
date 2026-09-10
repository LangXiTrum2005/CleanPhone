package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.storage.androidcleaner.R;
import j.a;
import java.util.WeakHashMap;
import m0.p0;
import m0.s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3933c;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3933c = -1;
        int[] iArr = a.f43527k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        WeakHashMap weakHashMap = s0.f45746a;
        p0.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f3931a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f3931a);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f3932b != z10) {
            if (!z10 || this.f3931a) {
                this.f3932b = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f3931a) {
            if (size > this.f3933c && this.f3932b) {
                setStacked(false);
            }
            this.f3933c = size;
        }
        if (this.f3932b || View.MeasureSpec.getMode(i10) != 1073741824) {
            iMakeMeasureSpec = i10;
            z10 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f3931a && !this.f3932b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            i12 = -1;
            if (i13 >= childCount) {
                i13 = -1;
                break;
            } else if (getChildAt(i13).getVisibility() == 0) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 >= 0) {
            View childAt = getChildAt(i13);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f3932b) {
                int childCount2 = getChildCount();
                for (int i14 = i13 + 1; i14 < childCount2; i14++) {
                    if (getChildAt(i14).getVisibility() == 0) {
                        i12 = i14;
                        break;
                    }
                }
                paddingBottom = i12 >= 0 ? getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = s0.f45746a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f3931a != z10) {
            this.f3931a = z10;
            if (!z10 && this.f3932b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
