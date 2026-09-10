package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: ToolbarUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Comparator<View> f20456attabal = new attabal();

    /* JADX INFO: compiled from: ToolbarUtils.java */
    public class attabal implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static ActionMenuView attabal(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static List<TextView> beachfront(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TextView competently(Toolbar toolbar) {
        List<TextView> listBeachfront = beachfront(toolbar, toolbar.getTitle());
        if (listBeachfront.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listBeachfront, f20456attabal);
    }

    public static ImageView dern(Toolbar toolbar) {
        return saneness(toolbar, toolbar.getLogo());
    }

    public static TextView marial(Toolbar toolbar) {
        List<TextView> listBeachfront = beachfront(toolbar, toolbar.getSubtitle());
        if (listBeachfront.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listBeachfront, f20456attabal);
    }

    public static ImageView saneness(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static ImageButton wireman(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }
}
