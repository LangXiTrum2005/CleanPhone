package com.google.android.gms.ads.nonagon.signalgeneration;

import a.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ia1;
import com.google.android.gms.internal.ads.ja1;
import com.google.android.gms.internal.ads.ln;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import r4.g;
import r9.c;
import s4.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f11364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f11366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f11367e = new JSONObject();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f11368f = new AtomicBoolean(false);

    public zza(Context context, ArrayList arrayList, VersionInfoParcel versionInfoParcel) {
        this.f11363a = context;
        this.f11364b = context.getApplicationInfo();
        this.f11365c = arrayList;
        this.f11366d = versionInfoParcel;
    }

    public final void zza(@Nullable WebView webView) {
        if (this.f11368f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoF = null;
        ApplicationInfo applicationInfo = this.f11364b;
        if (applicationInfo != null) {
            try {
                packageInfoF = c.a(this.f11363a).f(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f11367e;
        if (packageInfoF != null) {
            try {
                jSONObject.put("vc", packageInfoF.versionCode);
                jSONObject.put("vnm", packageInfoF.versionName);
            } catch (JSONException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().d("PawAppSignalGenerator.initialize", e10);
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.f11365c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12379ub)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.f11366d.afmaVersion);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) ln.f17063b.o()).booleanValue() && a.x("DOCUMENT_START_SCRIPT") && webView != null) {
            String str2 = String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(am.f12364tb), zzb());
            int i10 = ia1.f15692c;
            ja1 ja1Var = new ja1("*");
            WeakHashMap weakHashMap = g.f49404a;
            if (!m.f50119e.a()) {
                throw m.a();
            }
        }
    }

    public final JSONObject zzb() {
        if (!this.f11368f.get()) {
            zza(null);
        }
        return this.f11367e;
    }
}
