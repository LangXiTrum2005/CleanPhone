package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class z1 {
    public static final Collection i0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f41728A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f41729B;
    public String C;
    public String D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f41730E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f41731F;
    public String G;
    public String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f41732I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f41733J;
    public final String K;
    public int L;
    public int M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public float f41734N;
    public Boolean O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f41735P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f41736Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public String f41737R;
    public int S;
    public boolean T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f41738U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f41739V;
    public boolean W;
    public String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f41740Y;
    public final int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41741a;
    public Long a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f41742b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Integer f41743b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41744c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Boolean f41745c0;
    public final TreeMap d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Boolean f41746d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f41747e;
    public Boolean e0;
    public String f;
    public Boolean f0;
    public l0 g;
    public v0 g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f41748h;
    public boolean h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f41749i;
    public String j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f41750l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f41751n;
    public cc o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public fa f41752p;
    public Boolean q;
    public Boolean r;
    public String s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f41753u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f41754w;
    public String x;
    public String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f41755z;

    static {
        ArrayList arrayList = new ArrayList();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            arrayList.add(23);
        }
        if (i2 >= 26) {
            arrayList.add(22);
        }
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(8);
        i0 = Collections.unmodifiableCollection(arrayList);
    }

    public z1(int i2) {
        new HashMap();
        this.f41744c = "5.2.4";
        this.d = new TreeMap();
        this.K = "android";
        this.f41735P = 3;
        this.Z = i2;
    }

    public Set a() {
        return Collections.EMPTY_SET;
    }

    public boolean b() {
        return false;
    }

    public final void c(Context context) {
        if (this.f41742b == null) {
            r0 r0Var = (r0) com.startapp.sdk.components.a.a(context).m.a();
            String string = r0Var.f41421c;
            if (string == null) {
                synchronized (r0Var.f41419a) {
                    try {
                        string = r0Var.f41421c;
                        if (string == null) {
                            string = r0Var.f41420b.getString("c88d4eab540fab77", null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f41741a = string;
            this.f41742b = r0Var.a();
        }
        this.f41748h = context.getPackageName();
    }

    public final void d(Context context) {
        int iA;
        this.s = ud.a(context);
        String str = ((yh) com.startapp.sdk.components.a.a(context).g.a()).f41719h;
        this.H = str;
        this.v = str;
        try {
            f6 f6Var = ((g6) com.startapp.sdk.components.a.a(context).t.a()).f40998e;
            iA = f6Var != null ? f6Var.a() : -1;
        } catch (Throwable th) {
            if (!vi.a(th, RemoteException.class)) {
                g9.a(th);
            }
        }
        this.f41753u = iA;
    }

    public final void e(Context context) {
        mh mhVar = (mh) ((ph) com.startapp.sdk.components.a.a(context).f.a()).b();
        Object objOpt = mhVar.f41256a.opt(String.valueOf(7));
        if ((objOpt instanceof Number ? ((Number) objOpt).intValue() : 0) == 5) {
            this.f41754w = mhVar.a(8);
            this.x = mhVar.a(9);
            this.y = mhVar.a(15);
            this.f41755z = mhVar.a(16);
        }
        Object objOpt2 = mhVar.f41256a.opt(String.valueOf(10));
        int iIntValue = objOpt2 instanceof Number ? ((Number) objOpt2).intValue() : 0;
        if (iIntValue != 0 && iIntValue != 2) {
            this.f41728A = mhVar.a(11);
            this.f41729B = mhVar.a(12);
        }
        this.C = mhVar.a(4);
        this.D = mhVar.a(3);
        this.f41730E = mhVar.a(5);
        this.f41731F = mhVar.a(1);
        this.G = mhVar.a(2);
        this.f41732I = mhVar.a(13);
        Object objOpt3 = mhVar.f41256a.opt(String.valueOf(14));
        this.t = (objOpt3 instanceof Number ? ((Number) objOpt3).intValue() : 0) == 1;
    }

    public final void a(Context context) {
        if (MetaData.E().s()) {
            return;
        }
        this.g = ((com.startapp.sdk.common.advertisingid.b) com.startapp.sdk.components.a.a(context).f40738h.a()).a();
        try {
            this.j = ((ia) com.startapp.sdk.components.a.a(context).k.a()).a();
        } catch (Throwable th) {
            g9.a(th);
        }
        try {
            this.f41747e = ((vf) com.startapp.sdk.components.a.a(context).f40728I.a()).getAll();
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }

    public void b(Context context, AdPreferences adPreferences) {
        String str;
        boolean z2;
        boolean zA;
        DisplayMetrics displayMetrics;
        NetworkInfo activeNetworkInfo;
        this.f41736Q = pg.d.f41371a;
        this.m = Build.MANUFACTURER;
        this.f41750l = Build.MODEL;
        this.f41751n = Integer.toString(Build.VERSION.SDK_INT);
        if (adPreferences != null) {
            this.f = adPreferences.getAge(context);
        }
        this.f41749i = ((ah) ((bh) com.startapp.sdk.components.a.a(context).o.a()).b()).f40813a;
        int i2 = q0.f41381a;
        boolean zA2 = false;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        this.f41737R = str;
        this.S = q0.a(context);
        try {
            z2 = Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1;
        } catch (Throwable unused2) {
        }
        this.q = Boolean.valueOf(z2);
        this.T = q0.b(context);
        try {
            zA = ze.a(context);
        } catch (Throwable unused3) {
            zA = false;
        }
        this.f41738U = zA;
        try {
            zA2 = v6.a(context);
        } catch (Throwable unused4) {
        }
        this.f41739V = zA2;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.r = (connectivityManager == null || !q0.a(context, "android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? null : Boolean.valueOf(activeNetworkInfo.isRoaming());
        this.W = vi.d(context);
        this.h0 = vi.e(context);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.L = displayMetrics.widthPixels;
            this.M = displayMetrics.heightPixels;
            this.f41734N = displayMetrics.density;
        }
        com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
        this.o = (cc) ((dc) aVarA.d.a()).b();
        this.f41752p = (fa) ((ha) aVarA.f40737e.a()).b();
        vf vfVar = (vf) aVarA.G.a();
        this.X = vfVar.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", null);
        TreeMap treeMap = this.d;
        String string = vfVar.getString("sharedPrefsWrappers", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    treeMap.put(next, (String) jSONObject.get(next));
                }
            } catch (JSONException unused5) {
            }
        }
        this.O = Boolean.valueOf(vi.c(context));
    }

    public final void a(Context context, AdPreferences adPreferences) {
        try {
            this.g0 = (v0) com.startapp.sdk.components.a.a(context).f40732Q.a();
        } catch (Throwable th) {
            g9.a(th);
        }
        c(context);
        try {
            b(context, adPreferences);
        } catch (Throwable unused) {
        }
        try {
            d(context);
        } catch (Throwable th2) {
            g9.a(th2);
        }
        try {
            e(context);
        } catch (Throwable th3) {
            g9.a(th3);
        }
        try {
            this.k = qg.a(context);
        } catch (Throwable th4) {
            g9.a(th4);
        }
        try {
            this.f41733J = ((hf) com.startapp.sdk.components.a.a(context).f40739i.a()).a(this);
        } catch (Throwable th5) {
            g9.a(th5);
        }
        try {
            a(context);
        } catch (Throwable th6) {
            g9.a(th6);
        }
        try {
            b(context);
        } catch (Throwable th7) {
            g9.a(th7);
        }
    }

    public final s8 a(boolean z2) {
        hb hbVar = new hb(a());
        a(hbVar);
        byte[] bytes = hbVar.f41048b.toString().getBytes();
        String str = null;
        if (z2) {
            try {
                WeakHashMap weakHashMap = vi.f41589a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                bytes = byteArrayOutputStream.toByteArray();
                str = com.smartdigimkt.o0.b.d;
            } catch (IOException e2) {
                g9.a(e2);
            }
        }
        return new s8(bytes, "application/json", str);
    }

    public final String a(String str) {
        pd pdVar = new pd(a());
        a(pdVar);
        String string = pdVar.toString();
        if (str.contains("?") && string.startsWith("?")) {
            StringBuilder sbX = android.support.v4.media.a.x(str, com.ironsource.d9.i.f24749c);
            sbX.append(string.substring(1));
            return sbX.toString();
        }
        return android.support.v4.media.a.m(str, string);
    }

    public final void b(Context context) {
        try {
            this.a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
        } catch (Throwable th) {
            g9.a(th);
        }
        boolean z2 = true;
        try {
            this.f41745c0 = null;
            this.f41743b0 = null;
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                if (intentRegisterReceiver.hasExtra("status")) {
                    int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                    this.f41745c0 = Boolean.valueOf(intExtra == 2 || intExtra == 5);
                }
                if (intentRegisterReceiver.hasExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL) && intentRegisterReceiver.hasExtra("scale")) {
                    int intExtra2 = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.f41743b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        try {
            this.f41746d0 = null;
            Object systemService = context.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                AudioDeviceInfo[] devices = ((AudioManager) systemService).getDevices(2);
                if (devices == null) {
                    z2 = false;
                    break;
                }
                int length = devices.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        AudioDeviceInfo audioDeviceInfo = devices[i2];
                        if (audioDeviceInfo != null && i0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                this.f41746d0 = Boolean.valueOf(z2);
            }
        } catch (Throwable th3) {
            g9.a(th3);
        }
        try {
            this.e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                this.e0 = Boolean.valueOf(((PowerManager) systemService2).isPowerSaveMode());
            }
        } catch (Throwable th4) {
            g9.a(th4);
        }
        try {
            this.f0 = null;
            int i3 = context.getResources().getConfiguration().uiMode & 48;
            if (i3 == 32) {
                this.f0 = Boolean.TRUE;
            } else if (i3 == 16) {
                this.f0 = Boolean.FALSE;
            }
        } catch (Throwable th5) {
            g9.a(th5);
        }
    }

    public void a(ve veVar) {
        Map map = this.f41747e;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                veVar.a((String) entry.getKey(), entry.getValue(), false, true);
            }
        }
        veVar.a("publisherId", this.f41741a, false, true);
        veVar.a(InAppPurchaseMetaData.KEY_PRODUCT_ID, this.f41742b, b(), true);
        veVar.a(com.p004ironsource.ne.f26256E, this.K, true, true);
        veVar.a("sdkVersion", this.f41744c, false, true);
        veVar.a("flavor", Integer.valueOf(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE), false, true);
        TreeMap treeMap = this.d;
        if (treeMap != null && !treeMap.isEmpty()) {
            String strR = "";
            for (String str : this.d.keySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(strR);
                sb.append(str);
                sb.append(":");
                strR = android.support.v4.media.a.r(sb, (String) this.d.get(str), ";");
            }
            veVar.a("frameworksData", android.support.v4.media.a.f(1, 0, strR), false, false);
        }
        veVar.a("packageId", this.f41748h, false, true);
        veVar.a("installerPkg", this.f41749i, false, true);
        veVar.a("age", this.f, false, true);
        l0 l0Var = this.g;
        if (l0Var != null) {
            veVar.a("userAdvertisingId", l0Var.f41193a, false, true);
            boolean z2 = this.g.f41195c;
            if (z2) {
                veVar.a("limat", Boolean.valueOf(z2), false, true);
            }
            veVar.a("advertisingIdSource", this.g.f41194b, false, true);
        }
        String str2 = this.j;
        if (str2 != null) {
            veVar.a("duid", str2, false, true);
        }
        String str3 = this.k;
        if (str3 != null) {
            veVar.a("vendorId", str3, false, true);
        }
        veVar.a("model", this.f41750l, false, true);
        veVar.a("manufacturer", this.m, false, true);
        veVar.a("deviceVersion", this.f41751n, false, true);
        cc ccVar = this.o;
        if (ccVar != null) {
            veVar.a("locale", ccVar.f40871a, false, true);
            int i2 = this.Z;
            if (i2 == 4 || i2 == 2) {
                veVar.a("localeList", this.o.f40872b, false, true);
            }
        }
        int i3 = this.Z;
        if (i3 == 4 || i3 == 2) {
            veVar.a("inputLangs", this.f41752p, false, true);
        }
        veVar.a("isp", this.f41754w, false, true);
        veVar.a("ispName", this.x, false, true);
        veVar.a("ispCarrId", this.y, false, true);
        veVar.a("ispCarrIdName", this.f41755z, false, true);
        veVar.a("netOper", this.f41728A, false, true);
        veVar.a("networkOperName", this.f41729B, false, true);
        veVar.a("cid", this.C, false, true);
        veVar.a("lac", this.D, false, true);
        veVar.a("tac", this.f41730E, false, true);
        veVar.a("blat", this.f41731F, false, true);
        veVar.a("blon", this.G, false, true);
        veVar.a("subPublisherId", null, false, true);
        veVar.a("subProductId", null, false, true);
        veVar.a("retryCount", null, false, true);
        veVar.a("roaming", this.r, false, true);
        veVar.a("grid", this.s, false, true);
        if (this.t) {
            veVar.a("c5g", "1", false, false);
        }
        int i4 = this.f41753u;
        if (i4 >= 0) {
            veVar.a(NotificationCompat.CATEGORY_TRANSPORT, String.valueOf(i4), false, false);
        }
        if (this.h0) {
            veVar.a("tv", Boolean.TRUE, false, false);
        }
        veVar.a("silev", this.v, false, true);
        veVar.a("cellSignalLevel", this.H, false, true);
        veVar.a("cellTimingAdv", this.f41732I, false, true);
        veVar.a("outsource", this.q, false, true);
        veVar.a("width", String.valueOf(this.L), false, true);
        veVar.a("height", String.valueOf(this.M), false, true);
        veVar.a("density", String.valueOf(this.f41734N), false, true);
        veVar.a("fgApp", this.O, false, true);
        veVar.a("sdkId", String.valueOf(this.f41735P), true, true);
        veVar.a("clientSessionId", this.f41736Q, false, true);
        veVar.a(com.ironsource.d9.i.W, this.f41737R, false, true);
        veVar.a("appCode", Integer.valueOf(this.S), false, true);
        veVar.a("timeSinceBoot", Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        veVar.a("udbg", Boolean.valueOf(this.T), false, true);
        veVar.a("root", Boolean.valueOf(this.f41738U), false, true);
        veVar.a("smltr", Boolean.valueOf(this.f41739V), false, true);
        veVar.a("isddbg", Boolean.valueOf(this.W), false, true);
        veVar.a("pas", this.X, false, true);
        veVar.a("prm", this.f41740Y, false, false);
        veVar.a("free", this.a0, false, false);
        veVar.a("chr", this.f41745c0, false, false);
        veVar.a("blp", this.f41743b0, false, false);
        veVar.a("hs", this.f41746d0, false, false);
        veVar.a(com.p004ironsource.ne.X0, this.e0, false, false);
        veVar.a(com.smartdigimkt.b0.a.O, this.f0, false, false);
        v0 v0Var = this.g0;
        if (v0Var != null) {
            long jElapsedRealtime = 0;
            if (v0Var.d > 0) {
                v0Var.f41553a.getClass();
                jElapsedRealtime = SystemClock.elapsedRealtime() - v0Var.d;
            }
            veVar.a("appSessionDuration", Long.valueOf(jElapsedRealtime / 1000), false, false);
        }
        veVar.a("rsc", this.f41733J, false, true);
    }
}
