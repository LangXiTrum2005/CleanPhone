package com.facebook.appevents.ondeviceprocessing;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import java.util.Arrays;
import l7.s;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;
import q7.q;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f10603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10604d;

    public /* synthetic */ a(Context context, String str, String str2) {
        this.f10601a = 1;
        this.f10602b = str;
        this.f10603c = context;
        this.f10604d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JSONObject jSONObject;
        switch (this.f10601a) {
            case 0:
                OnDeviceProcessingManager.sendInstallEventAsync$lambda$0(this.f10603c, this.f10602b, this.f10604d);
                return;
            case 1:
                String str = this.f10602b;
                Context context = this.f10603c;
                String str2 = this.f10604d;
                q qVar = q.f48751a;
                JSONObject jSONObjectA = q.a();
                if (jSONObjectA.length() != 0) {
                    q.e(str, jSONObjectA);
                    context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectA.toString()).apply();
                    q.f48755e = Long.valueOf(System.currentTimeMillis());
                }
                q.f();
                q.f48752b.set(false);
                return;
            default:
                Context context2 = this.f10603c;
                String str3 = this.f10602b;
                String str4 = this.f10604d;
                u uVar = u.f48786a;
                SharedPreferences sharedPreferences = context2.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                r rVarE = null;
                String string = sharedPreferences.getString(str3, null);
                if (!e0.w(string)) {
                    if (string == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e10) {
                        e0.A("FacebookSDK", e10);
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        rVarE = u.e(str4, jSONObject);
                    }
                    break;
                }
                JSONObject jSONObjectA2 = u.a();
                u.e(str4, jSONObjectA2);
                sharedPreferences.edit().putString(str3, jSONObjectA2.toString()).apply();
                if (rVarE != null) {
                    String str5 = rVarE.f48765i;
                    if (!u.f48791f && str5.length() > 0) {
                        u.f48791f = true;
                        Log.w("u", str5);
                    }
                }
                q qVar2 = q.f48751a;
                JSONObject jSONObjectA3 = q.a();
                s.b().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str4}, 1)), jSONObjectA3.toString()).apply();
                q.e(str4, jSONObjectA3);
                AutomaticAnalyticsLogger.logActivateAppEvent();
                u.f48789d.set(u.f48788c.containsKey(str4) ? q7.s.f48783c : q7.s.f48784d);
                uVar.j();
                return;
        }
    }

    public /* synthetic */ a(Context context, String str, String str2, int i10) {
        this.f10601a = i10;
        this.f10603c = context;
        this.f10602b = str;
        this.f10604d = str2;
    }
}
