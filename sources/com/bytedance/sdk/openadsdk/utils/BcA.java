package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BcA {

    public interface LD {
        void LD();

        void Lxb();

        void Lxb(View view, boolean z);

        void Lxb(boolean z);
    }

    public class Lxb implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ViewGroup LD;
        View Lxb = null;

        public Lxb(ViewGroup viewGroup) {
            this.LD = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                LD ld = (LD) this.LD.getTag(520093765);
                if (this.Lxb == null) {
                    ViewGroup viewGroup = this.LD;
                    BcA.LD(viewGroup, ld, (Integer) viewGroup.getTag(520093766));
                    return;
                }
                Rect rect = new Rect();
                this.Lxb.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.LD.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (ld != null) {
                        ld.Lxb(this.LD, false);
                    }
                    this.LD.setTag(520093763, Boolean.FALSE);
                } else {
                    if (ld != null) {
                        ld.Lxb(this.LD, true);
                    }
                    this.LD.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.LD.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(View view, LD ld, Integer num) {
        if (ld == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        ld.Lxb(view, Lxb(view, num.intValue()));
    }

    public static void Lxb(final ViewGroup viewGroup, boolean z, int i, LD ld, List<ViewGroup> list) {
        viewGroup.setTag(520093765, ld);
        viewGroup.setTag(520093766, Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final Lxb lxb = new Lxb(viewGroup);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.BcA.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        lxb.Lxb = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        lxb.Lxb = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(lxb);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.BcA.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        LD ld2 = (LD) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        BcA.LD(viewGroup2, ld2, (Integer) viewGroup2.getTag(520093766));
                    } catch (Exception e) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.BcA.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z2) {
                try {
                    LD ld2 = (LD) viewGroup.getTag(520093765);
                    if (ld2 != null) {
                        ld2.Lxb(z2);
                        ViewGroup viewGroup2 = viewGroup;
                        BcA.LD(viewGroup2, ld2, (Integer) viewGroup2.getTag(520093766));
                    }
                } catch (Exception e) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.BcA.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                LD ld2 = (LD) viewGroup.getTag(520093765);
                if (ld2 != null) {
                    ld2.Lxb();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                LD ld2 = (LD) viewGroup.getTag(520093765);
                if (ld2 != null) {
                    ld2.LD();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean Lxb(View view, int i) {
        return com.bytedance.sdk.openadsdk.core.nE.Lxb(view, 20, i);
    }
}
