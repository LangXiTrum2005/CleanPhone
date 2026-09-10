package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: AnimateLayoutChangeDetector.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final ViewGroup.MarginLayoutParams f13959saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public LinearLayoutManager f13960attabal;

    /* JADX INFO: renamed from: androidx.viewpager2.widget.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimateLayoutChangeDetector.java */
    public class C0107attabal implements Comparator<int[]> {
        public C0107attabal() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f13959saneness = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public attabal(LinearLayoutManager linearLayoutManager) {
        this.f13960attabal = linearLayoutManager;
    }

    public static boolean dern(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (dern(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean attabal() {
        int top;
        int i;
        int bottom;
        int i2;
        int childCount = this.f13960attabal.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z = this.f13960attabal.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.f13960attabal.getChildAt(i3);
            if (childAt == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f13959saneness;
            int[] iArr2 = iArr[i3];
            if (z) {
                top = childAt.getLeft();
                i = marginLayoutParams.leftMargin;
            } else {
                top = childAt.getTop();
                i = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i;
            int[] iArr3 = iArr[i3];
            if (z) {
                bottom = childAt.getRight();
                i2 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i2 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i2;
        }
        Arrays.sort(iArr, new C0107attabal());
        for (int i4 = 1; i4 < childCount; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i5 = iArr4[1];
        int i6 = iArr4[0];
        return i6 <= 0 && iArr[childCount - 1][1] >= i5 - i6;
    }

    public final boolean saneness() {
        int childCount = this.f13960attabal.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (dern(this.f13960attabal.getChildAt(i))) {
                return true;
            }
        }
        return false;
    }

    public boolean wireman() {
        return (!attabal() || this.f13960attabal.getChildCount() <= 1) && saneness();
    }
}
