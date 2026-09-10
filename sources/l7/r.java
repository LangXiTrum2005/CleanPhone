package l7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import java.util.Date;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45211a;

    public /* synthetic */ r(int i10) {
        this.f45211a = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a aVarB;
        h0 h0Var;
        a aVarD;
        String string;
        switch (this.f45211a) {
            case 0:
                Context context = s.f45220i;
                if (context != null) {
                    return context.getCacheDir();
                }
                kotlin.jvm.internal.n.l("applicationContext");
                throw null;
            case 1:
                j2.n nVar = j0.f45174d;
                f fVarT = f.f45113f.t();
                SharedPreferences sharedPreferences = (SharedPreferences) fVarT.f45116b.f50111a;
                if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        Date date = a.l;
                        aVarB = go.k.B(jSONObject);
                    } catch (JSONException unused) {
                        aVarB = null;
                    }
                    break;
                } else {
                    aVarB = null;
                }
                if (aVarB != null) {
                    fVarT.c(aVarB, false);
                }
                j0 j0VarV = nVar.v();
                String string2 = j0VarV.f45177b.f45154a.getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string2 != null) {
                    try {
                        h0Var = new h0(new JSONObject(string2));
                    } catch (JSONException unused2) {
                        h0Var = null;
                    }
                    break;
                } else {
                    h0Var = null;
                }
                if (h0Var != null) {
                    j0VarV.a(h0Var, false);
                }
                Date date2 = a.l;
                if (go.k.P() && nVar.v().f45178c == null && (aVarD = go.k.D()) != null) {
                    if (go.k.P()) {
                        q7.e0.o(aVarD.f45075e, new jj.d(15));
                    } else {
                        nVar.v().a(null, true);
                    }
                }
                AppEventsLogger.INSTANCE.initializeLib(s.b(), s.f45215d);
                m0 m0Var = m0.f45190a;
                if (!v7.a.b(m0.class)) {
                    try {
                        Context contextB = s.b();
                        ApplicationInfo applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
                        kotlin.jvm.internal.n.e(applicationInfo, "ctx.packageManager.getAp…ageManager.GET_META_DATA)");
                        Bundle bundle = applicationInfo.metaData;
                        if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                            InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(contextB);
                            Bundle bundle2 = new Bundle();
                            if (!q7.e0.t()) {
                                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                Log.w("l7.m0", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                            }
                            internalAppEventsLogger.logEvent("fb_auto_applink", bundle2);
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused3) {
                    } catch (Throwable th2) {
                        v7.a.a(m0.class, th2);
                    }
                }
                AppEventsLogger.Companion companion = AppEventsLogger.INSTANCE;
                Context applicationContext = s.b().getApplicationContext();
                kotlin.jvm.internal.n.e(applicationContext, "getApplicationContext().applicationContext");
                companion.newLogger(applicationContext).flush();
                return null;
            default:
                return null;
        }
    }
}
