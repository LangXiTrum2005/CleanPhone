package com.smartdigimkt.n8;

import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.d9;
import com.smartdigimkt.sdk.api.SDMSDK;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37214a = "sdm";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f37215b = "sdm_sdk";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37216c = 0;
    private static final int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37217e = 2;
    private static final Executor f = com.smartdigimkt.l7.b.a().c();

    public class a implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f37218Y;
        final /* synthetic */ String Z;
        final /* synthetic */ com.smartdigimkt.l8.f e0;
        final /* synthetic */ com.smartdigimkt.y6.a f0;

        public a(String str, String str2, String str3, com.smartdigimkt.l8.f fVar, com.smartdigimkt.y6.a aVar) {
            this.X = str;
            this.f37218Y = str2;
            this.Z = str3;
            this.e0 = fVar;
            this.f0 = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", com.smartdigimkt.m6.a.r.f36800z);
                jSONObject.put("result", this.X);
                jSONObject.put("placementId", this.f37218Y);
                jSONObject.put("adtype", this.Z);
                jSONObject.put("adsourceId", this.e0.h());
                jSONObject.put("networkFirmId", this.e0.t0());
                jSONObject.put("content", this.e0.L());
                jSONObject.put("msg", this.e0.Z());
                n.a("sdm_sdk", jSONObject.toString(), TextUtils.equals("fail", this.X));
            } catch (Throwable unused) {
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f37219Y;
        final /* synthetic */ String Z;
        final /* synthetic */ String e0;

        public b(String str, String str2, String str3, String str4) {
            this.X = str;
            this.f37219Y = str2;
            this.Z = str3;
            this.e0 = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", com.smartdigimkt.m6.a.r.f36787A);
                jSONObject.put("result", this.X);
                jSONObject.put("placementId", this.f37219Y);
                jSONObject.put("adtype", this.Z);
                jSONObject.put("errorMsg", this.e0);
                n.a("sdm_sdk", jSONObject.toString(), TextUtils.equals("fail", this.X));
            } catch (Throwable unused) {
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f37220Y;
        final /* synthetic */ String Z;
        final /* synthetic */ String e0;
        final /* synthetic */ String f0;

        public c(String str, String str2, String str3, String str4, String str5) {
            this.X = str;
            this.f37220Y = str2;
            this.Z = str3;
            this.e0 = str4;
            this.f0 = str5;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("placementId", this.X);
                jSONObject.put("adtype", this.f37220Y);
                jSONObject.put("api", this.Z);
                jSONObject.put("result", this.e0);
                jSONObject.put("reason", this.f0);
                Log.i("sdm_sdk".concat(com.smartdigimkt.m6.b.p().C() ? "(DebuggerMode)" : ""), jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ com.smartdigimkt.a7.a X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f37221Y;
        final /* synthetic */ String Z;
        final /* synthetic */ String e0;

        public d(com.smartdigimkt.a7.a aVar, String str, String str2, String str3) {
            this.X = aVar;
            this.f37221Y = str;
            this.Z = str2;
            this.e0 = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject = new JSONObject();
            try {
                if (this.X == null) {
                    jSONObject.put("action", this.f37221Y);
                    jSONObject.put("result", this.Z);
                    jSONObject.put("isHB", 1);
                    jSONObject.put("msg", this.e0);
                } else {
                    if (TextUtils.equals(this.f37221Y, "click") && this.X.g0()) {
                        return;
                    }
                    int iW = this.X.W();
                    jSONObject.put("placementId", this.X.Y());
                    jSONObject.put("adType", this.X.b());
                    jSONObject.put("action", this.f37221Y);
                    jSONObject.put("result", this.Z);
                    jSONObject.put("adSourceId", this.X.d0());
                    jSONObject.put("networkFirmId", iW);
                    jSONObject.put("networkName", this.X.v());
                    jSONObject.put("networkVersion", this.X.X());
                    jSONObject.put("networkUnit", this.X.V());
                    jSONObject.put("isHB", 1);
                    jSONObject.put("msg", this.e0);
                }
            } catch (Throwable unused) {
            }
            n.b("sdk", jSONObject.toString());
        }
    }

    public static void a(String str, String str2, String str3, com.smartdigimkt.l8.f fVar, com.smartdigimkt.y6.a aVar) {
        Executor executor;
        if (!SDMSDK.getInstance().isNetworkLogDebug() || (executor = f) == null) {
            return;
        }
        executor.execute(new a(str, str2, str3, fVar, aVar));
    }

    public static void b(String str, String str2) {
        if (SDMSDK.getInstance().isNetworkLogDebug()) {
            a("sdm_" + str, str2, false);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        Executor executor;
        if (!SDMSDK.getInstance().isNetworkLogDebug() || (executor = f) == null) {
            return;
        }
        executor.execute(new b(str, str2, str3, str4));
    }

    public static void b(String str, String str2, String str3, String str4, String str5) {
        String str6;
        if (SDMSDK.getInstance().isNetworkLogDebug()) {
            str2.getClass();
            switch (str2) {
                case "0":
                    str6 = "native";
                    break;
                case "1":
                    str6 = "reward";
                    break;
                case "2":
                    str6 = "banner";
                    break;
                case "3":
                    str6 = com.smartdigimkt.m6.a.r.r;
                    break;
                case "4":
                    str6 = "splash";
                    break;
                default:
                    str6 = "";
                    break;
            }
            a(str, str6, str3, str4, str5, false);
        }
    }

    public static void a(String str, String str2, boolean z2) {
        if (z2) {
            a(str, str2, 1);
        } else {
            a(str, str2, 0);
        }
    }

    public static void a(String str, String str2, int i2) {
        String property = System.getProperty("line.separator");
        try {
            if (str2.startsWith("{")) {
                str2 = new JSONObject(str2).toString(4);
            } else if (str2.startsWith(d9.i.d)) {
                str2 = new JSONArray(str2).toString(4);
            }
        } catch (JSONException unused) {
        }
        String strD = "╔═══════════════════════════════════════════════════════════════════════════════════════";
        for (String str3 : str2.split(property)) {
            strD = android.support.v4.media.a.D(android.support.v4.media.a.m(strD, IOUtils.LINE_SEPARATOR_UNIX), "║ ", str3);
        }
        String strM = android.support.v4.media.a.m(strD, "\n╚═══════════════════════════════════════════════════════════════════════════════════════");
        StringBuilder sbW = android.support.v4.media.a.w(str);
        sbW.append(com.smartdigimkt.m6.b.p().C() ? "(DebuggerMode)" : "");
        String string = sbW.toString();
        String strC = android.support.v4.media.a.C(" \n", strM);
        if (i2 == 1) {
            Log.e(string, strC);
        } else if (i2 != 2) {
            Log.i(string, strC);
        } else {
            Log.w(string, strC);
        }
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        a(str, str2, str3, str4, str5, false);
    }

    public static void a(String str, String str2, String str3, String str4, String str5, boolean z2) {
        Executor executor;
        if (!SDMSDK.getInstance().isNetworkLogDebug() || (executor = f) == null) {
            return;
        }
        executor.execute(new c(str, str2, str3, str4, str5));
    }

    public static void a(String str, String str2) {
        if (SDMSDK.getInstance().isNetworkLogDebug()) {
            Log.d(str, str2);
        }
    }

    public static void a(com.smartdigimkt.a7.a aVar, String str, String str2, String str3) {
        Executor executor;
        if (!SDMSDK.getInstance().isNetworkLogDebug() || (executor = f) == null) {
            return;
        }
        executor.execute(new d(aVar, str, str2, str3));
    }
}
