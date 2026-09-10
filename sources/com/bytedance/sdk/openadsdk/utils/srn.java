package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class srn {

    public interface lr {
        void lr();

        void ri();

        void ri(View view, boolean z);

        void ri(boolean z);
    }

    public class ri implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ boolean ik;
        final /* synthetic */ ViewGroup lr;
        View ri = null;

        public ri(ViewGroup viewGroup, boolean z) {
            this.lr = viewGroup;
            this.ik = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                lr lrVar = (lr) this.lr.getTag(520093765);
                if (this.ri == null) {
                    ViewGroup viewGroup = this.lr;
                    srn.lr(viewGroup, lrVar, (Integer) viewGroup.getTag(520093766), this.ik);
                    return;
                }
                Rect rect = new Rect();
                this.ri.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.lr.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (lrVar != null) {
                        lrVar.ri(this.lr, false);
                    }
                    this.lr.setTag(520093763, Boolean.FALSE);
                } else {
                    if (lrVar != null) {
                        lrVar.ri(this.lr, true);
                    }
                    this.lr.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.lr.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(View view, lr lrVar, Integer num, boolean z) {
        if (lrVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        lrVar.ri(view, ri(view, num.intValue(), z));
    }

    public static void ri(final ViewGroup viewGroup, boolean z, int i, final boolean z2, lr lrVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, lrVar);
        viewGroup.setTag(520093766, Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final ri riVar = new ri(viewGroup, z2);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.srn.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        riVar.ri = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        riVar.ri = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(riVar);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.srn.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        lr lrVar2 = (lr) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        srn.lr(viewGroup2, lrVar2, (Integer) viewGroup2.getTag(520093766), z2);
                    } catch (Exception e) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.srn.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z3) {
                try {
                    lr lrVar2 = (lr) viewGroup.getTag(520093765);
                    if (lrVar2 != null) {
                        lrVar2.ri(z3);
                        ViewGroup viewGroup2 = viewGroup;
                        srn.lr(viewGroup2, lrVar2, (Integer) viewGroup2.getTag(520093766), z2);
                    }
                } catch (Exception e) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.srn.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                lr lrVar2 = (lr) viewGroup.getTag(520093765);
                if (lrVar2 != null) {
                    lrVar2.ri();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                lr lrVar2 = (lr) viewGroup.getTag(520093765);
                if (lrVar2 != null) {
                    lrVar2.lr();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean ri(View view, int i, boolean z) {
        return com.bytedance.sdk.openadsdk.core.pv.ri(view, 20, i, z);
    }

    public static ArrayList<View> ri(View view, int i) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i > 1 && parent != null) {
                arrayList.addAll(ri((View) parent, i - 1));
            }
        }
        return arrayList;
    }

    public static View ri(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (cls.isInstance(parent)) {
            return (View) parent;
        }
        return ri((View) parent, cls);
    }
}
