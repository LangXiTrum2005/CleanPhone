package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.cuirassed;

/* JADX INFO: compiled from: TabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes3.dex */
public class dern {
    public static RectF attabal(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        return (tabLayout.isTabIndicatorFullWidth() || !(view instanceof TabLayout.TabView)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : saneness((TabLayout.TabView) view, 24);
    }

    public static RectF saneness(TabLayout.TabView tabView, int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iCompetently = (int) cuirassed.competently(tabView.getContext(), i);
        if (contentWidth < iCompetently) {
            contentWidth = iCompetently;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(left - i2, top - (contentHeight / 2), i2 + left, top + (left / 2));
    }

    public void dern(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFAttabal = attabal(tabLayout, view);
        drawable.setBounds((int) rectFAttabal.left, drawable.getBounds().top, (int) rectFAttabal.right, drawable.getBounds().bottom);
    }

    public void wireman(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFAttabal = attabal(tabLayout, view);
        RectF rectFAttabal2 = attabal(tabLayout, view2);
        drawable.setBounds(phrasemonger.saneness.dern((int) rectFAttabal.left, (int) rectFAttabal2.left, f), drawable.getBounds().top, phrasemonger.saneness.dern((int) rectFAttabal.right, (int) rectFAttabal2.right, f), drawable.getBounds().bottom);
    }
}
