package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class ToolbarUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator f19352a = new AnonymousClass1();

    /* JADX INFO: renamed from: com.google.android.material.internal.ToolbarUtils$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static ActionMenuView a(SearchBar searchBar) {
        for (int i2 = 0; i2 < searchBar.getChildCount(); i2++) {
            View childAt = searchBar.getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static ImageButton b(SearchBar searchBar) {
        Drawable navigationIcon = searchBar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i2 = 0; i2 < searchBar.getChildCount(); i2++) {
            View childAt = searchBar.getChildAt(i2);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList c(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
