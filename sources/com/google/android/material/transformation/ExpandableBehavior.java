package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    public final int X = 0;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableBehavior$1, reason: invalid class name */
    class AnonymousClass1 implements ViewTreeObserver.OnPreDrawListener {
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            throw null;
        }
    }

    public ExpandableBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean h(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ((ExpandableWidget) view2).a();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i2) {
        ExpandableWidget expandableWidget;
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        if (!view.isLaidOut()) {
            ArrayList arrayListF = coordinatorLayout.f(view);
            int size = arrayListF.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    expandableWidget = null;
                    break;
                }
                View view2 = (View) arrayListF.get(i3);
                if (h(view, view2)) {
                    expandableWidget = (ExpandableWidget) view2;
                    break;
                }
                i3++;
            }
            if (expandableWidget != null) {
                expandableWidget.a();
                throw null;
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
