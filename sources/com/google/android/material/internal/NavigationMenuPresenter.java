package com.google.android.material.internal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.charging.screenshow.battery.animations.themes.R;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationMenuPresenter implements MenuPresenter {

    /* JADX INFO: renamed from: com.google.android.material.internal.NavigationMenuPresenter$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    public static class HeaderViewHolder extends ViewHolder {
    }

    public class NavigationMenuAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* JADX INFO: renamed from: com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter$1, reason: invalid class name */
        class AnonymousClass1 extends AccessibilityDelegateCompat {
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                this.f4417a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f4534a);
                throw null;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long getItemId(int i2) {
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            if (i2 == 0) {
                throw null;
            }
            if (i2 == 1) {
                throw null;
            }
            if (i2 == 2) {
                throw null;
            }
            if (i2 != 3) {
                return null;
            }
            throw null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            if (viewHolder2 instanceof NormalViewHolder) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder2.itemView;
                FrameLayout frameLayout = navigationMenuItemView.E0;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.D0.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    public interface NavigationMenuItem {
    }

    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {
    }

    public static class NavigationMenuTextItem implements NavigationMenuItem {
    }

    public class NavigationMenuViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.d(view, accessibilityNodeInfoCompat);
            throw null;
        }
    }

    public static class NormalViewHolder extends ViewHolder {
    }

    public static class SeparatorViewHolder extends ViewHolder {
    }

    public static class SubheaderViewHolder extends ViewHolder {
    }

    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void b(MenuBuilder menuBuilder, boolean z2) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean d(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean f(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void g(boolean z2) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void i(Context context, MenuBuilder menuBuilder) {
        LayoutInflater.from(context);
        context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }
}
