package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import b2.o;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a f32059h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32060a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32061b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32062c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32063d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32064e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f32065f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicBoolean f32066g = new AtomicBoolean(false);

    private a() {
    }

    public static a b() {
        if (f32059h == null) {
            synchronized (a.class) {
                try {
                    if (f32059h == null) {
                        f32059h = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32059h;
    }

    private void c() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f32061b = com.mbridge.msdk.config.component.common.util.b.a(contextD).a(com.ironsource.sdk.controller.f.b.f30388c, "");
        this.f32063d = com.mbridge.msdk.config.component.common.util.b.a(contextD).a("isLimitAdId", -1);
    }

    public Map<String, Object> a() {
        String str;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(this.f32060a)) {
            str = TextUtils.isEmpty(this.f32061b) ? "" : this.f32061b;
        } else {
            str = this.f32060a;
        }
        int i10 = this.f32062c;
        if (i10 == -1 && (i10 = this.f32063d) == -1) {
            i10 = 0;
        }
        map.put(com.ironsource.sdk.controller.f.b.f30388c, str);
        map.put("adIdB64", TextUtils.isEmpty(str) ? "" : k0.b(str));
        map.put("adIdLimit", String.valueOf(i10));
        map.put("amazonIdInfo", this.f32064e);
        map.put("amazonIdInfoB64", this.f32065f);
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        try {
            Map<String, Object> mapA = a(com.mbridge.msdk.foundation.controller.c.n().d());
            a(this.f32060a, this.f32062c);
            if (aVar != null) {
                aVar.a(mapA);
            }
        } catch (Throwable th2) {
            q0.b("ADIDProvider", th2.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.info.provider.listener.a aVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new o(19, this, aVar));
    }

    public Map<String, Object> a(Context context) {
        String str;
        if (context == null) {
            return new HashMap();
        }
        try {
            c();
            try {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                    this.f32060a = advertisingIdInfo.getId();
                    this.f32062c = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                } catch (Exception unused) {
                    com.mbridge.msdk.foundation.tools.c.b bVarA = new com.mbridge.msdk.foundation.tools.c().a(context);
                    this.f32060a = bVarA.a();
                    this.f32062c = bVarA.b() ? 1 : 0;
                } catch (Throwable th2) {
                    q0.b("ADIDProvider", th2.getMessage());
                }
            } catch (Exception unused2) {
                q0.d("ADIDProvider", "GET ADID FROM GOOGLE PLAY APP ERROR");
            }
            if (!b(context)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                    int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                    String string = Settings.Secure.getString(contentResolver, "advertising_id");
                    jSONObject.put("status", i10);
                    jSONObject.put("amazonId", string);
                    String string2 = jSONObject.toString();
                    if (!TextUtils.isEmpty(string2)) {
                        this.f32064e = string2;
                        this.f32065f = k0.b(string2);
                    }
                } catch (Throwable th3) {
                    q0.b("ADIDProvider", th3.getMessage());
                }
            }
        } catch (Throwable th4) {
            q0.b("ADIDProvider", th4.getMessage());
        }
        if (TextUtils.isEmpty(this.f32060a)) {
            str = TextUtils.isEmpty(this.f32061b) ? "" : this.f32061b;
        } else {
            str = this.f32060a;
        }
        this.f32060a = str;
        int i11 = this.f32062c;
        if (i11 == -1 && (i11 = this.f32063d) == -1) {
            i11 = 0;
        }
        this.f32062c = i11;
        this.f32066g.set(true);
        HashMap map = new HashMap();
        map.put(com.ironsource.sdk.controller.f.b.f30388c, this.f32060a);
        map.put("adIdB64", k0.b(this.f32060a));
        map.put("isLimitAdId", Integer.valueOf(this.f32062c));
        map.put("amazonIdInfo", this.f32064e);
        map.put("amazonIdInfoB64", this.f32065f);
        return map;
    }

    private boolean b(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || (context != null ? context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") : false);
    }

    private void a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (str.equals(this.f32061b) && i10 == this.f32063d) {
            return;
        }
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b(com.ironsource.sdk.controller.f.b.f30388c, str);
        com.mbridge.msdk.config.component.common.util.b.a(contextD).b("isLimitAdId", i10);
    }
}
