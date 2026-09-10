package com.thinkup.core.common;

import android.content.Context;
import com.thinkup.network.myoffer.MyOfferAPI;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o0m {
    public static final String m = "isDefaultOffer";
    public static final int o = 35;
    private static volatile o0m on;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Method f42141n;
    Method o0;
    Method om;
    Method oo;

    private o0m() {
        try {
            this.f42141n = MyOfferAPI.class.getDeclaredMethod("preloadTopOnOffer", Context.class, String.class, JSONObject.class);
            this.o0 = MyOfferAPI.class.getDeclaredMethod("getOutOfCapOfferIds", Context.class);
            this.oo = MyOfferAPI.class.getDeclaredMethod("getDefaultOfferId", Context.class, String.class);
            this.om = MyOfferAPI.class.getDeclaredMethod("checkOffersOutOfCap", Context.class, String.class);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static o0m o() {
        if (on == null) {
            synchronized (o0m.class) {
                try {
                    if (on == null) {
                        on = new o0m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return on;
    }

    public final boolean m(Context context, String str) {
        try {
            Method method = this.om;
            if (method != null) {
                return ((Boolean) method.invoke(null, context, str)).booleanValue();
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public final void o(Context context, String str, JSONObject jSONObject) {
        try {
            Method method = this.f42141n;
            if (method != null) {
                method.invoke(null, context, str, jSONObject);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final JSONArray o(Context context) {
        try {
            Method method = this.o0;
            if (method != null) {
                return new JSONArray(method.invoke(null, context).toString());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return new JSONArray();
    }

    public final String o(Context context, String str) {
        try {
            Method method = this.oo;
            if (method != null) {
                return method.invoke(null, context, str).toString();
            }
            return "";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
