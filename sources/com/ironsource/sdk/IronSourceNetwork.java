package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C0474n4;
import com.ironsource.C0532q8;
import com.ironsource.C0639w8;
import com.ironsource.C0657x8;
import com.ironsource.C0675y8;
import com.ironsource.D5;
import com.ironsource.K9;
import com.ironsource.Mc;
import com.ironsource.P9;
import com.ironsource.V9;
import com.ironsource.Y9;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class IronSourceNetwork {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f30212a = "IronSourceNetwork";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static V9 f30213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<Mc> f30214c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Y9 f30215d;

    private static void a(Context context, JSONObject jSONObject, String str, String str2, String str3, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            D5 d5A = C0657x8.a(jSONObject);
            if (d5A.a()) {
                C0639w8.a(d5A, C0657x8.a(context, str, str2, str3, map));
            }
        }
    }

    public static synchronized void addInitListener(Mc mc2) {
        Y9 y10 = f30215d;
        if (y10 == null) {
            f30214c.add(mc2);
        } else if (y10.b()) {
            mc2.onSuccess();
        } else {
            mc2.onFail(f30215d.a());
        }
    }

    public static synchronized void destroyAd(K9 k10) throws Exception {
        a();
        f30213b.b(k10);
    }

    public static synchronized e getControllerManager() {
        return f30213b.a();
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        Context context2;
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            Logger.e(f30212a, "applicationKey is NULL");
            return;
        }
        if (f30213b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                context2 = context;
                str3 = str;
                str4 = str2;
                try {
                    a(context2, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str4, str3, C0675y8.a(), map);
                } catch (Exception e10) {
                    e = e10;
                    Exception exc = e;
                    C0474n4.d().a(exc);
                    Logger.e(f30212a, "Failed to init event tracker: " + exc.getMessage());
                }
            } catch (Exception e11) {
                e = e11;
                context2 = context;
                str3 = str;
                str4 = str2;
            }
            f30213b = P9.a(context2, str3, str4);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(K9 k10) {
        V9 v10 = f30213b;
        if (v10 == null) {
            return false;
        }
        return v10.a(k10);
    }

    public static synchronized void loadAd(K9 k10, Map<String, String> map) throws Exception {
        a();
        f30213b.a(k10, map);
    }

    public static synchronized void loadAdView(Activity activity, K9 k10, Map<String, String> map) throws Exception {
        a();
        f30213b.b(activity, k10, map);
    }

    public static void onPause(Activity activity) {
        V9 v10 = f30213b;
        if (v10 == null) {
            return;
        }
        v10.b(activity);
    }

    public static void onResume(Activity activity) {
        V9 v10 = f30213b;
        if (v10 == null) {
            return;
        }
        v10.a(activity);
    }

    public static synchronized void release(Activity activity) {
        V9 v10 = f30213b;
        if (v10 == null) {
            return;
        }
        v10.c(activity);
    }

    public static synchronized void showAd(Activity activity, K9 k10, Map<String, String> map) throws Exception {
        a();
        f30213b.a(activity, k10, map);
    }

    public static synchronized void updateInitFailed(C0532q8 c0532q8) {
        try {
            f30215d = new Y9(c0532q8);
            Iterator<Mc> it = f30214c.iterator();
            while (it.hasNext()) {
                it.next().onFail(c0532q8);
            }
            f30214c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void updateInitSucceeded() {
        try {
            f30215d = new Y9();
            Iterator<Mc> it = f30214c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            f30214c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void a() throws Exception {
        if (f30213b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }
}
