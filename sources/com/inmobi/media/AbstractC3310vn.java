package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3310vn {
    public static final void a(ProgressBar progressBar, int i) {
        Intrinsics.checkNotNullParameter(progressBar, "<this>");
        progressBar.setProgress(i, true);
    }

    public static final boolean b(View view, ViewGroup parentView) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (view.isAttachedToWindow()) {
            return a(view, parentView);
        }
        return false;
    }

    public static final boolean a(View view, ViewGroup parentView) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            if (Intrinsics.wireman(parent, parentView)) {
                return true;
            }
            parent = parent instanceof ViewGroup ? ((ViewGroup) parent).getParent() : null;
        }
        return false;
    }

    public static final void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
