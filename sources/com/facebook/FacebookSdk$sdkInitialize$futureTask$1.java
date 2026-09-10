package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.AppEventQueue;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.facebook.appevents.FlushReason;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", NotificationCompat.CATEGORY_CALL}, k = 3, mv = {1, 5, 1})
final class FacebookSdk$sdkInitialize$futureTask$1<V> implements Callable {
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[Catch: all -> 0x00ab, NameNotFoundException -> 0x00dd, TryCatch #5 {NameNotFoundException -> 0x00dd, all -> 0x00ab, blocks: (B:33:0x0094, B:35:0x00a8, B:40:0x00b0, B:42:0x00ba, B:44:0x00ca, B:45:0x00d4), top: B:65:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca A[Catch: all -> 0x00ab, NameNotFoundException -> 0x00dd, TryCatch #5 {NameNotFoundException -> 0x00dd, all -> 0x00ab, blocks: (B:33:0x0094, B:35:0x00a8, B:40:0x00b0, B:42:0x00ba, B:44:0x00ca, B:45:0x00d4), top: B:65:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        AccessToken accessTokenA;
        ProfileManager.Companion companion;
        ProfileManager profileManagerA;
        String string;
        Profile profile;
        Context contextB;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Bundle bundle2;
        AppEventsLoggerImpl appEventsLoggerImpl;
        AccessToken accessTokenB;
        AccessTokenManager accessTokenManagerA = AccessTokenManager.g.a();
        SharedPreferences sharedPreferences = accessTokenManagerA.f15882e.f15878a;
        if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
            String string2 = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
            if (string2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string2);
                    Date date = AccessToken.m0;
                    accessTokenA = AccessToken.Companion.a(jSONObject);
                } catch (JSONException unused) {
                    accessTokenA = null;
                }
            }
            if (accessTokenA != null) {
                accessTokenManagerA.c(accessTokenA, false);
            }
            companion = ProfileManager.f15957e;
            profileManagerA = companion.a();
            string = profileManagerA.f15960c.f15956a.getString("com.facebook.ProfileManager.CachedProfile", null);
            if (string != null) {
                try {
                    profile = new Profile(new JSONObject(string));
                } catch (JSONException unused2) {
                    profile = null;
                }
            } else {
                profile = null;
            }
            if (profile != null) {
                profileManagerA.a(profile, false);
            }
            Date date2 = AccessToken.m0;
            if (AccessToken.Companion.c() && companion.a().f15958a == null && (accessTokenB = AccessToken.Companion.b()) != null) {
                if (AccessToken.Companion.c()) {
                    Utility.q(new Profile$Companion$fetchProfileForCurrentAccessToken$1(), accessTokenB.f0);
                } else {
                    companion.a().a(null, true);
                }
            }
            AppEventsLogger.Companion.c(FacebookSdk.b(), FacebookSdk.f15917c);
            if (!CrashShieldHandler.b(UserSettingsManager.class)) {
                try {
                    contextB = FacebookSdk.b();
                    applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
                    if (applicationInfo != null) {
                        bundle = applicationInfo.metaData;
                    } else {
                        bundle = null;
                    }
                    if (bundle != null && applicationInfo.metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(contextB);
                        bundle2 = new Bundle();
                        if (!Utility.z()) {
                            bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                            Log.w("com.facebook.UserSettingsManager", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                        }
                        internalAppEventsLogger.a(bundle2, "fb_auto_applink");
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                } catch (Throwable th) {
                    CrashShieldHandler.a(UserSettingsManager.class, th);
                }
            }
            Context applicationContext = FacebookSdk.b().getApplicationContext();
            Intrinsics.e(applicationContext, "getApplicationContext().applicationContext");
            appEventsLoggerImpl = new AppEventsLogger(applicationContext).f16011a;
            appEventsLoggerImpl.getClass();
            if (!CrashShieldHandler.b(appEventsLoggerImpl)) {
                try {
                    AppEventQueue.d(FlushReason.X);
                } catch (Throwable th2) {
                    CrashShieldHandler.a(appEventsLoggerImpl, th2);
                }
            }
            return null;
        }
        HashSet hashSet = FacebookSdk.f15915a;
        accessTokenA = null;
        if (accessTokenA != null) {
            accessTokenManagerA.c(accessTokenA, false);
        }
        companion = ProfileManager.f15957e;
        profileManagerA = companion.a();
        string = profileManagerA.f15960c.f15956a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            profile = new Profile(new JSONObject(string));
        } else {
            profile = null;
        }
        if (profile != null) {
            profileManagerA.a(profile, false);
        }
        Date date3 = AccessToken.m0;
        if (AccessToken.Companion.c()) {
            if (AccessToken.Companion.c()) {
                companion.a().a(null, true);
            } else {
                Utility.q(new Profile$Companion$fetchProfileForCurrentAccessToken$1(), accessTokenB.f0);
            }
        }
        AppEventsLogger.Companion.c(FacebookSdk.b(), FacebookSdk.f15917c);
        if (!CrashShieldHandler.b(UserSettingsManager.class)) {
            contextB = FacebookSdk.b();
            applicationInfo = contextB.getPackageManager().getApplicationInfo(contextB.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            } else {
                bundle = null;
            }
            if (bundle != null) {
                InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(contextB);
                bundle2 = new Bundle();
                if (!Utility.z()) {
                    bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    Log.w("com.facebook.UserSettingsManager", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                }
                internalAppEventsLogger2.a(bundle2, "fb_auto_applink");
            }
        }
        Context applicationContext2 = FacebookSdk.b().getApplicationContext();
        Intrinsics.e(applicationContext2, "getApplicationContext().applicationContext");
        appEventsLoggerImpl = new AppEventsLogger(applicationContext2).f16011a;
        appEventsLoggerImpl.getClass();
        if (!CrashShieldHandler.b(appEventsLoggerImpl)) {
            AppEventQueue.d(FlushReason.X);
        }
        return null;
    }
}
