package com.mbridge.msdk.config.dynamic.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import d5.u;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static XMLView a(View view) {
        XMLView xMLView = null;
        try {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof View) {
                    View view2 = (View) parent;
                    if (view2 instanceof XMLView) {
                        XMLView xMLView2 = (XMLView) view2;
                        try {
                            if (!(view.getTag() instanceof String)) {
                                return xMLView2;
                            }
                            xMLView2.getRenderMap().put(view.getTag().toString(), view);
                            return xMLView2;
                        } catch (Exception e10) {
                            e = e10;
                            xMLView = xMLView2;
                        }
                    }
                    e.printStackTrace();
                    return xMLView;
                }
            }
            return null;
        } catch (Exception e11) {
            e = e11;
        }
    }

    public static XMLView a(ViewGroup viewGroup, String str) {
        XMLView xMLView = null;
        if (viewGroup != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if ((childAt instanceof XMLView) && str.equals(((XMLView) childAt).getSelfTag())) {
                            xMLView = (XMLView) childAt;
                        }
                    }
                    return xMLView;
                }
            } catch (Exception e10) {
                q0.b("ComponentUtil", e10.getMessage());
            }
        }
        return xMLView;
    }

    public static <T extends View> T a(ViewGroup viewGroup, Class<T> cls) {
        T t10 = null;
        if (viewGroup != null) {
            try {
                if (viewGroup.getChildCount() > 0) {
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (cls.isInstance(childAt)) {
                            return cls.cast(childAt);
                        }
                    }
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        View childAt2 = viewGroup.getChildAt(i11);
                        if ((childAt2 instanceof ViewGroup) && (t10 = (T) a((ViewGroup) childAt2, cls)) != null) {
                            return t10;
                        }
                    }
                    return t10;
                }
            } catch (Exception e10) {
                q0.b("ComponentUtil", e10.getMessage(), e10);
            }
        }
        return null;
    }

    public static Map<String, Object> a(ViewGroup viewGroup) {
        HashMap map = new HashMap();
        a(viewGroup, map);
        return map;
    }

    private static void a(ViewGroup viewGroup, Map<String, Object> map) {
        if (viewGroup == null || map == null) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            try {
                KeyEvent.Callback childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof com.mbridge.msdk.config.dynamic.baseview.inter.b) {
                    try {
                        Map<String, Object> outData = ((com.mbridge.msdk.config.dynamic.baseview.inter.b) childAt).getOutData();
                        if (outData != null && !outData.isEmpty()) {
                            map.putAll(outData);
                        }
                    } catch (Exception e10) {
                        q0.b("ComponentUtil", "Error getting out data from child view: " + e10.getMessage());
                    }
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, map);
                }
            } catch (Exception e11) {
                f2.q(e11, new StringBuilder("Error collecting out data from view group: "), "ComponentUtil");
                return;
            }
        }
    }

    public static Object a(String str, String str2, View view, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (str2.startsWith("$")) {
            com.mbridge.msdk.config.dynamic.binddata.a.a(str, str2, view, aVar);
            return com.mbridge.msdk.config.component.common.express.c.a(str2, aVar);
        }
        if (str2.startsWith("@+id/")) {
            return Integer.valueOf(str2.substring(5).hashCode());
        }
        if (str2.startsWith("#")) {
            return Integer.valueOf(com.mbridge.msdk.config.dynamic.c.a().e(str2));
        }
        if (str2.startsWith("@color/")) {
            return Integer.valueOf(com.mbridge.msdk.config.dynamic.c.a().b(str2));
        }
        if (str2.startsWith("@drawable/")) {
            try {
                return Integer.valueOf(contextD.getResources().getIdentifier(str2.substring(10), "drawable", contextD.getPackageName()));
            } catch (Exception e10) {
                q0.b("ComponentUtil", e10.getMessage());
                return 0;
            }
        }
        if (str2.startsWith("@dimen/")) {
            try {
                int identifier = contextD.getResources().getIdentifier(str2.substring(7), "dimen", contextD.getPackageName());
                if (identifier != 0) {
                    return Integer.valueOf(contextD.getResources().getDimensionPixelSize(identifier));
                }
                q0.b("ComponentUtil", "Invalid dimen resource: ".concat(str2));
                return 0;
            } catch (Exception e11) {
                f2.q(e11, u.k("Error getting dimen resource: ", str2, ", "), "ComponentUtil");
                return 0;
            }
        }
        if (str2.endsWith("dp")) {
            try {
                return Integer.valueOf(com.mbridge.msdk.dycreator.utils.e.a(contextD, Integer.parseInt(str2.substring(0, str2.length() - 2))));
            } catch (Exception e12) {
                f2.q(e12, u.k("Error parsing dp value: ", str2, ", "), "ComponentUtil");
                return 0;
            }
        }
        if (str2.endsWith("dip")) {
            try {
                return Integer.valueOf(com.mbridge.msdk.dycreator.utils.e.a(contextD, Integer.parseInt(str2.substring(0, str2.length() - 3))));
            } catch (Exception e13) {
                f2.q(e13, u.k("Error parsing dp value: ", str2, ", "), "ComponentUtil");
                return 0;
            }
        }
        if (str2.endsWith("sp")) {
            try {
                return Integer.valueOf(com.mbridge.msdk.dycreator.utils.e.b(contextD, Integer.parseInt(str2.substring(0, str2.length() - 2))));
            } catch (Exception e14) {
                f2.q(e14, u.k("Error parsing sp value: ", str2, ", "), "ComponentUtil");
                return 0;
            }
        }
        if (str2.endsWith("px")) {
            try {
                return Integer.valueOf(Math.round(Float.parseFloat(str2.substring(0, str2.length() - 2))));
            } catch (Exception e15) {
                f2.q(e15, u.k("Error parsing px value: ", str2, ", "), "ComponentUtil");
                return 0;
            }
        }
        if (str2.endsWith("pt")) {
            try {
                return Integer.valueOf(com.mbridge.msdk.dycreator.utils.e.d(contextD, Float.parseFloat(str2.substring(0, str2.length() - 2))));
            } catch (Exception e16) {
                f2.q(e16, u.k("Error parsing pt value: ", str2, ", "), "ComponentUtil");
                return 0;
            }
        }
        if (str2.endsWith("mm")) {
            try {
                return Integer.valueOf(com.mbridge.msdk.dycreator.utils.e.c(contextD, Float.parseFloat(str2.substring(0, str2.length() - 2))));
            } catch (Exception e17) {
                f2.q(e17, u.k("Error parsing mm value: ", str2, ", "), "ComponentUtil");
                return 0;
            }
        }
        if (str2.endsWith(ScarConstants.IN_SIGNAL_KEY)) {
            try {
                return Integer.valueOf(com.mbridge.msdk.dycreator.utils.e.b(contextD, Float.parseFloat(str2.substring(0, str2.length() - 2))));
            } catch (Exception e18) {
                f2.q(e18, u.k("Error parsing in value: ", str2, ", "), "ComponentUtil");
                return 0;
            }
        }
        if (str2.startsWith("@string/")) {
            try {
                return contextD.getString(contextD.getResources().getIdentifier(str2.substring(8), "string", contextD.getPackageName()));
            } catch (Exception unused) {
                q0.b("ComponentUtil", "Invalid string resource: ".concat(str2));
            }
        }
        return str2;
    }
}
