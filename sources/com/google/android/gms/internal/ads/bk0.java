package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f12811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f12812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f12813d = new AtomicReference("");

    public bk0(Context context, VersionInfoParcel versionInfoParcel, k00 k00Var) {
        this.f12810a = context;
        this.f12811b = versionInfoParcel;
        this.f12812c = k00Var;
    }

    public static final String c(String str) {
        String str2 = new String(Base64.decode((String) zzba.zzc().a(am.f12074ag), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        y01 y01Var = zzs.zza;
        char[] charArray = str3.toCharArray();
        for (int i10 = 0; i10 < charArray.length; i10++) {
            charArray[i10] = (char) (charArray[i10] ^ str2.charAt(i10 % str2.length()));
        }
        return new String(charArray);
    }

    public final String a() {
        if (((Boolean) zzba.zzc().a(am.Wf)).booleanValue()) {
            if (!((String) zzba.zzc().a(am.Yf)).isEmpty()) {
                if (!((String) zzba.zzc().a(am.Zf)).isEmpty()) {
                    if (!((String) zzba.zzc().a(am.f12074ag)).isEmpty()) {
                        String str = (String) this.f12813d.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.f12812c.execute(new x60(this, 12));
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final String b() {
        String name;
        VersionInfoParcel versionInfoParcel = this.f12811b;
        String strC = null;
        if (versionInfoParcel.isClientJar) {
            name = g30.class.getName();
        } else {
            try {
                name = (String) new JSONObject(c((String) zzba.zzc().a(am.Yf))).get(Integer.toString(versionInfoParcel.clientJarVersion));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e10) {
                if (((Boolean) zzba.zzc().a(am.Xf)).booleanValue()) {
                    zzt.zzh().d("SdkIE", e10);
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return "2";
        }
        try {
            strC = c((String) zzba.zzc().a(am.Zf));
        } catch (IllegalArgumentException e11) {
            if (((Boolean) zzba.zzc().a(am.Xf)).booleanValue()) {
                zzt.zzh().d("SdkIE", e11);
            }
        }
        if (TextUtils.isEmpty(strC)) {
            return "3";
        }
        try {
            for (Method method : this.f12810a.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strC)) {
                    return "1";
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return Gc.f26168e;
        } catch (PatternSyntaxException unused4) {
            return CampaignEx.CLICKMODE_ON;
        }
    }
}
