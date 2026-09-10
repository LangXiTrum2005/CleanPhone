package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mf0 f20345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qf f20346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f20347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zza f20348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pj f20349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f20350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final eo f20351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bg0 f20352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final eh0 f20353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f20354k;
    public final rg0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yh0 f20355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final mx0 f20356n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ul0 f20357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zl0 f20358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pu0 f20359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wh0 f20360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ji0 f20361s;

    public tf0(Context context, mf0 mf0Var, qf qfVar, VersionInfoParcel versionInfoParcel, zza zzaVar, pj pjVar, k00 k00Var, ou0 ou0Var, bg0 bg0Var, eh0 eh0Var, ScheduledExecutorService scheduledExecutorService, yh0 yh0Var, mx0 mx0Var, ul0 ul0Var, rg0 rg0Var, zl0 zl0Var, pu0 pu0Var, wh0 wh0Var, ji0 ji0Var) {
        this.f20344a = context;
        this.f20345b = mf0Var;
        this.f20346c = qfVar;
        this.f20347d = versionInfoParcel;
        this.f20348e = zzaVar;
        this.f20349f = pjVar;
        this.f20350g = k00Var;
        this.f20351h = ou0Var.f18369j;
        this.f20352i = bg0Var;
        this.f20353j = eh0Var;
        this.f20354k = scheduledExecutorService;
        this.f20355m = yh0Var;
        this.f20356n = mx0Var;
        this.f20357o = ul0Var;
        this.l = rg0Var;
        this.f20358p = zl0Var;
        this.f20359q = pu0Var;
        this.f20360r = wh0Var;
        this.f20361s = ji0Var;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final zzew f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new zzew(strOptString, strOptString2);
    }

    public final ListenableFuture a(JSONArray jSONArray, boolean z10, boolean z11, int i10) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zw1.d(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), this.f20360r, com.applovin.impl.ca.b(i10));
        }
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(b(jSONArray.optJSONObject(i11), z10, 0));
        }
        return zw1.z(new pd1(ca1.y(arrayList), true), i6.f15609i, this.f20350g);
    }

    public final ListenableFuture b(JSONObject jSONObject, boolean z10, int i10) {
        if (jSONObject == null) {
            return be1.f12743b;
        }
        HashMap map = null;
        if (((Boolean) zzba.zzc().a(am.X4)).booleanValue()) {
            if (jSONObject.has((String) zzba.zzc().a(am.Y4))) {
                map = new HashMap();
                for (String str : ((String) zzba.zzc().a(am.Z4)).split(",")) {
                    try {
                        map.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        HashMap map2 = map;
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map2 == null) {
            return be1.f12743b;
        }
        if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue() && i10 != 0) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), this.f20360r, com.applovin.impl.ca.b(i10));
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z10 || map2 != null) {
            double d10 = dOptDouble;
            return zw1.d(new yn(null, Uri.parse(strOptString), d10, iOptInt, iOptInt2, map2));
        }
        final mf0 mf0Var = this.f20345b;
        Executor executor = mf0Var.f17425c;
        return e("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), zw1.z((((Boolean) zzba.zzc().a(am.f12240l7)).booleanValue() && strOptString != null && strOptString.startsWith("data:")) ? zw1.o(executor, new Callable() { // from class: com.google.android.gms.internal.ads.kf0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                mf0 mf0Var2 = mf0Var;
                mf0Var2.getClass();
                String str2 = strOptString;
                int iIndexOf = str2.indexOf(",");
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Bad data URL: no ',' found for base64 data");
                }
                if (!str2.substring(0, iIndexOf).endsWith(";base64")) {
                    throw new IllegalArgumentException("Bad data URL: only base64 is supported");
                }
                int iIndexOf2 = str2.indexOf(":");
                int iIndexOf3 = str2.indexOf(";");
                if (iIndexOf2 == -1 || !str2.substring(iIndexOf2 + 1, iIndexOf3).startsWith("image/")) {
                    throw new IllegalArgumentException("Bad data URL: only image media is supported");
                }
                return mf0Var2.a(Base64.decode(str2.substring(iIndexOf + 1), 0), dOptDouble, zOptBoolean);
            }
        }) : zw1.z(mf0Var.f17423a.zza(strOptString), new d81() { // from class: com.google.android.gms.internal.ads.lf0
            @Override // com.google.android.gms.internal.ads.d81
            public final /* synthetic */ Object apply(Object obj) {
                mf0 mf0Var2 = mf0Var;
                mf0Var2.getClass();
                return mf0Var2.a(((fb) obj).f14355b, dOptDouble, zOptBoolean);
            }
        }, executor), new d81() { // from class: com.google.android.gms.internal.ads.pf0
            @Override // com.google.android.gms.internal.ads.d81
            public final /* synthetic */ Object apply(Object obj) {
                return new yn(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.f20350g));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    public final fd1 d(JSONObject jSONObject, du0 du0Var, fu0 fu0Var, zzb zzbVar, zy zyVar) {
        zzr zzrVar;
        bg0 bg0Var;
        String strOptString = jSONObject.optString("base_url");
        String strOptString2 = jSONObject.optString("html");
        int i10 = 0;
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        if (iOptInt == 0) {
            if (iOptInt2 == 0) {
                zzrVar = zzr.zzb();
            }
            bg0Var = this.f20352i;
            bg0Var.getClass();
            if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
                com.applovin.impl.ca.s((p9.b) zzt.zzk(), bg0Var.f12773i, "native-assets-loading-video-composition-start");
            }
            fd1 fd1VarX = zw1.x(be1.f12743b, new rf0(bg0Var, zzrVar, du0Var, fu0Var, zzbVar, zyVar, strOptString, strOptString2, 1), bg0Var.f12766b);
            return zw1.x(fd1VarX, new sf0(fd1VarX, 1), l00.f16615h);
        }
        i10 = iOptInt;
        zzrVar = new zzr(this.f20344a, new AdSize(i10, iOptInt2));
        bg0Var = this.f20352i;
        bg0Var.getClass();
        if (((Boolean) zzba.zzc().a(am.Z2)).booleanValue()) {
            com.applovin.impl.ca.s((p9.b) zzt.zzk(), bg0Var.f12773i, "native-assets-loading-video-composition-start");
        }
        fd1 fd1VarX2 = zw1.x(be1.f12743b, new rf0(bg0Var, zzrVar, du0Var, fu0Var, zzbVar, zyVar, strOptString, strOptString2, 1), bg0Var.f12766b);
        return zw1.x(fd1VarX2, new sf0(fd1VarX2, 1), l00.f16615h);
    }

    public final ud1 e(String str, boolean z10, ListenableFuture listenableFuture) {
        if (((Boolean) zzba.zzc().a(am.f12062a3)).booleanValue()) {
            v71.j(listenableFuture, str, this.f20350g);
        }
        return z10 ? zw1.x(listenableFuture, new mt(1, listenableFuture), l00.f16615h) : zw1.u(listenableFuture, Exception.class, new c60(1), l00.f16615h);
    }
}
