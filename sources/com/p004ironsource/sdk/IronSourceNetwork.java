package com.p004ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.dk;
import com.p004ironsource.fc;
import com.p004ironsource.ik;
import com.p004ironsource.lk;
import com.p004ironsource.nh;
import com.p004ironsource.pp;
import com.p004ironsource.q9;
import com.p004ironsource.sdk.controller.e;
import com.p004ironsource.sdk.utils.Logger;
import com.p004ironsource.sdk.utils.SDKUtils;
import com.p004ironsource.th;
import com.p004ironsource.uh;
import com.p004ironsource.zj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class IronSourceNetwork {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f26794a = "IronSourceNetwork";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ik f26795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<pp> f26796c = new ArrayList();
    private static lk d;

    private static synchronized void a() throws Exception {
        if (f26795b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }

    public static synchronized void addInitListener(pp ppVar) {
        lk lkVar = d;
        if (lkVar == null) {
            f26796c.add(ppVar);
        } else if (lkVar.b()) {
            ppVar.onSuccess();
        } else {
            ppVar.onFail(d.getError());
        }
    }

    public static synchronized void destroyAd(zj zjVar) throws Exception {
        a();
        f26795b.b(zjVar);
    }

    public static synchronized e getControllerManager() {
        return f26795b.a();
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            Logger.e(f26794a, "applicationKey is NULL");
            return;
        }
        if (f26795b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
            } catch (Exception e2) {
                q9.d().a(e2);
                Logger.e(f26794a, "Failed to init event tracker: " + e2.getMessage());
            }
            f26795b = dk.a(context, str, str2);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(zj zjVar) {
        ik ikVar = f26795b;
        if (ikVar == null) {
            return false;
        }
        return ikVar.a(zjVar);
    }

    public static synchronized void loadAd(zj zjVar, Map<String, String> map) throws Exception {
        a();
        f26795b.a(zjVar, map);
    }

    public static synchronized void loadAdView(Activity activity, zj zjVar, Map<String, String> map) throws Exception {
        a();
        f26795b.b(activity, zjVar, map);
    }

    public static void onPause(Activity activity) {
        ik ikVar = f26795b;
        if (ikVar == null) {
            return;
        }
        ikVar.onPause(activity);
    }

    public static void onResume(Activity activity) {
        ik ikVar = f26795b;
        if (ikVar == null) {
            return;
        }
        ikVar.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        ik ikVar = f26795b;
        if (ikVar == null) {
            return;
        }
        ikVar.a(activity);
    }

    public static synchronized void showAd(Activity activity, zj zjVar, Map<String, String> map) throws Exception {
        a();
        f26795b.a(activity, zjVar, map);
    }

    public static synchronized void updateInitFailed(nh nhVar) {
        try {
            d = new lk(nhVar);
            Iterator<pp> it = f26796c.iterator();
            while (it.hasNext()) {
                it.next().onFail(nhVar);
            }
            f26796c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void updateInitSucceeded() {
        try {
            d = new lk();
            Iterator<pp> it = f26796c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            f26796c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private static void a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            fc fcVarA = uh.a(jSONObject);
            if (fcVarA.a()) {
                th.a(fcVarA, uh.a(context, str, str2, map));
            }
        }
    }
}
