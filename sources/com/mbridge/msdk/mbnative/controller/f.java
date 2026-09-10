package com.mbridge.msdk.mbnative.controller;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.WeakHashMap;
import m0.s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    public static View a(Context context, View view) {
        View viewA = a(context);
        return viewA != null ? viewA : a(view);
    }

    private static View a(Context context) {
        if (context != null && (context instanceof Activity)) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }

    private static View a(View view) {
        if (view == null) {
            return null;
        }
        try {
            WeakHashMap weakHashMap = s0.f45746a;
            view.isAttachedToWindow();
        } catch (Throwable unused) {
        }
        try {
            View rootView = view.getRootView();
            if (rootView == null) {
                return null;
            }
            View viewFindViewById = rootView.findViewById(R.id.content);
            return viewFindViewById != null ? viewFindViewById : rootView;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
