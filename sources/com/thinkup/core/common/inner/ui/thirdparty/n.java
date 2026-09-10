package com.thinkup.core.common.inner.ui.thirdparty;

import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.ooo.mm;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    private static final String o = "Y29tLmh1YXdlaS5vcGVuYWxsaWFuY2UuYWQudmlld3MuVmlkZW9WaWV3";

    private static void m(View view) {
        o(view, mm.m(o));
    }

    private static void n(View view) {
        o0(view);
    }

    private static void o(View view, String str) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null && childAt.getClass().getName().equals(str)) {
                    o(childAt);
                    return;
                }
                o(childAt, str);
            }
        }
    }

    private static void o0(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                o(childAt);
                o0(childAt);
            }
        }
    }

    public static void o(final View view) {
        if (view != null) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.core.common.inner.ui.thirdparty.n.1
                @Override // java.lang.Runnable
                public final void run() {
                    View view2 = view;
                    if (view2 != null) {
                        view2.setClickable(false);
                        view.setEnabled(false);
                    }
                }
            });
        }
    }
}
