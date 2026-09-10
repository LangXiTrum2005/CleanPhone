package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {
    public final RecyclerView d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ItemDelegate f8134e;

    public static class ItemDelegate extends AccessibilityDelegateCompat {
        public final RecyclerViewAccessibilityDelegate d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final WeakHashMap f8135e = new WeakHashMap();

        public ItemDelegate(RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.d = recyclerViewAccessibilityDelegate;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f8135e.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.a(view, accessibilityEvent) : this.f4417a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final AccessibilityNodeProviderCompat b(View view) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f8135e.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.b(view) : super.b(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f8135e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = this.d;
            boolean zHasPendingAdapterUpdates = recyclerViewAccessibilityDelegate.d.hasPendingAdapterUpdates();
            View.AccessibilityDelegate accessibilityDelegate = this.f4417a;
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
            if (!zHasPendingAdapterUpdates) {
                RecyclerView recyclerView = recyclerViewAccessibilityDelegate.d;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f8135e.get(view);
                    if (accessibilityDelegateCompat != null) {
                        accessibilityDelegateCompat.d(view, accessibilityNodeInfoCompat);
                        return;
                    } else {
                        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        return;
                    }
                }
            }
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f8135e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f8135e.get(viewGroup);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.f(viewGroup, view, accessibilityEvent) : this.f4417a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean g(View view, int i2, Bundle bundle) {
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = this.d;
            if (!recyclerViewAccessibilityDelegate.d.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = recyclerViewAccessibilityDelegate.d;
                if (recyclerView.getLayoutManager() != null) {
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f8135e.get(view);
                    if (accessibilityDelegateCompat != null) {
                        if (accessibilityDelegateCompat.g(view, i2, bundle)) {
                            return true;
                        }
                    } else if (super.g(view, i2, bundle)) {
                        return true;
                    }
                    return recyclerView.getLayoutManager().performAccessibilityActionForItem(view, i2, bundle);
                }
            }
            return super.g(view, i2, bundle);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void h(View view, int i2) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f8135e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.h(view, i2);
            } else {
                super.h(view, i2);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f8135e.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(RecyclerView recyclerView) {
        this.d = recyclerView;
        ItemDelegate itemDelegate = this.f8134e;
        if (itemDelegate != null) {
            this.f8134e = itemDelegate;
        } else {
            this.f8134e = new ItemDelegate(this);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean g(View view, int i2, Bundle bundle) {
        if (super.g(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i2, bundle);
    }
}
