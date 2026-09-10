package com.p004ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ke {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Rect f2855 = new Rect();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static <E extends View> void m2787(Activity activity, Class<E> cls, int i2, String str, boolean z2, boolean z3, List<Integer> list, List<String> list2, List<E> list3) {
        if (i2 != -1) {
            View viewFindViewById = activity.findViewById(i2);
            if (cls.isInstance(viewFindViewById)) {
                list3.add(viewFindViewById);
                if (z2) {
                    return;
                }
            }
            m2795(viewFindViewById, cls, str, z2, z3, list, list2, list3);
            if (list3.size() > 0 && z2) {
                return;
            }
        }
        View viewFindViewById2 = activity.findViewById(R.id.content);
        if (viewFindViewById2 != null) {
            m2790(viewFindViewById2, cls, str, z2, z3, list, list2, list3);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> E m2788(Activity activity, Class<E> cls, int i2, List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        m2787(activity, cls, i2, str, true, false, null, list, arrayList);
        if (arrayList.size() > 0) {
            return (E) arrayList.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <E extends View> void m2795(View view, Class<E> cls, String str, boolean z2, boolean z3, List<Integer> list, List<String> list2, List<E> list3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                E e2 = (E) viewGroup.getChildAt(i2);
                if (m2798(e2, cls, str, list, list2)) {
                    list3.add(e2);
                    if (z2) {
                        return;
                    }
                    if (z3) {
                        m2795(e2, cls, str, z2, z3, list, list2, list3);
                    }
                } else {
                    m2795(e2, cls, str, z2, z3, list, list2, list3);
                    if (list3 != null && list3.size() > 0 && z2) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static View m2797(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <E extends View> void m2800(Activity activity, Class<E> cls, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        m2787(activity, cls, -1, null, false, z2, list, list2, list3);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> boolean m2798(View view, Class<E> cls, String str, List<Integer> list, List<String> list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        if ((m2793(list) || list.contains(Integer.valueOf(view.getId()))) && !m2796(list2, view)) {
            return str == null || view.getClass().getName().startsWith(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Activity m2799(View view) {
        if (view != null) {
            View view2 = view;
            while (view2.getId() != 16908290 && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
            }
            for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            View viewFindViewById = view.findViewById(R.id.content);
            if (viewFindViewById != null && (viewFindViewById.getContext() instanceof Activity)) {
                return (Activity) viewFindViewById.getContext();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <E extends View> void m2790(View view, Class<E> cls, String str, boolean z2, boolean z3, List<Integer> list, List<String> list2, List<E> list3) {
        while (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            view = (View) view.getParent();
        }
        m2795(view, cls, str, z2, z3, list, list2, list3);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> E m2789(View view, Class<E> cls, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m2791(view, cls, true, z2, null, null, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (E) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2796(List<String> list, View view) {
        return list != null && list.contains(view.getClass().getName());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static View m2794(View view) {
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> void m2791(View view, Class<E> cls, boolean z2, boolean z3, List<Integer> list, List<String> list2, List<E> list3) {
        m2795(view, cls, null, z2, z3, list, list2, list3);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2793(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m2792(View view) {
        view.getHitRect(f2855);
        return view.getGlobalVisibleRect(f2855);
    }
}
