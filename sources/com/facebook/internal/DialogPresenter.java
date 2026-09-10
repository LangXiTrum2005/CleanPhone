package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Pair;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.media3.extractor.text.ttml.a;
import com.facebook.CallbackManager;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.p004ironsource.d9;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/DialogPresenter;", "", "ParameterProvider", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class DialogPresenter {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/DialogPresenter$ParameterProvider;", "", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface ParameterProvider {
        Bundle a();

        Bundle getParameters();
    }

    public static final boolean a(DialogFeature dialogFeature) {
        return b(dialogFeature).f16366b != -1;
    }

    public static final NativeProtocol.ProtocolVersionQueryResult b(DialogFeature feature) {
        int[] iArr;
        Intrinsics.f(feature, "feature");
        String strC = FacebookSdk.c();
        String strG = feature.g();
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfigA = FetchedAppSettings.Companion.a(strC, strG, feature.name());
        if (dialogFeatureConfigA == null || (iArr = dialogFeatureConfigA.d) == null) {
            iArr = new int[]{feature.d()};
        }
        ArrayList arrayList = NativeProtocol.f16360a;
        if (CrashShieldHandler.b(NativeProtocol.class)) {
            return null;
        }
        try {
            List list = (List) NativeProtocol.f16361b.get(strG);
            if (list == null) {
                list = EmptyList.X;
            }
            return NativeProtocol.f16363e.l(list, iArr);
        } catch (Throwable th) {
            CrashShieldHandler.a(NativeProtocol.class, th);
            return null;
        }
    }

    public static final void c(AppCall appCall, Bundle bundle) {
        Validate.a(FacebookSdk.b(), CustomTabUtils.b());
        Context context = FacebookSdk.b();
        Intrinsics.f(context, "context");
        Validate.c(context, true);
        Intent intent = new Intent(FacebookSdk.b(), (Class<?>) CustomTabMainActivity.class);
        int i2 = CustomTabMainActivity.Z;
        intent.putExtra("CustomTabMainActivity.extra_action", "apprequests");
        intent.putExtra("CustomTabMainActivity.extra_params", bundle);
        intent.putExtra("CustomTabMainActivity.extra_chromePackage", CustomTabUtils.a());
        NativeProtocol.r(intent, appCall.b().toString(), "apprequests", NativeProtocol.m(), null);
        appCall.e(intent);
    }

    public static final void d(AppCall appCall, ParameterProvider parameterProvider, DialogFeature feature) {
        Intent intentT;
        Intrinsics.f(feature, "feature");
        Context context = FacebookSdk.b();
        String strG = feature.g();
        NativeProtocol.ProtocolVersionQueryResult protocolVersionQueryResultB = b(feature);
        int i2 = protocolVersionQueryResultB.f16366b;
        if (i2 == -1) {
            throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        }
        Bundle parameters = NativeProtocol.q(i2) ? parameterProvider.getParameters() : parameterProvider.a();
        if (parameters == null) {
            parameters = new Bundle();
        }
        String string = appCall.b().toString();
        Intent intent = null;
        if (!CrashShieldHandler.b(NativeProtocol.class)) {
            try {
                Intrinsics.f(context, "context");
                NativeProtocol.NativeAppInfo nativeAppInfo = protocolVersionQueryResultB.f16365a;
                if (nativeAppInfo != null && (intentT = NativeProtocol.t(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(nativeAppInfo.c()).addCategory("android.intent.category.DEFAULT"))) != null) {
                    NativeProtocol.r(intentT, string, strG, protocolVersionQueryResultB.f16366b, parameters);
                    intent = intentT;
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(NativeProtocol.class, th);
            }
        }
        if (intent == null) {
            throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        appCall.e(intent);
    }

    public static final void e(AppCall appCall, FacebookException facebookException) {
        Intrinsics.f(appCall, "appCall");
        Context context = FacebookSdk.b();
        Intrinsics.f(context, "context");
        Validate.b(context, true);
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.b(), FacebookActivity.class);
        intent.setAction("PassThrough");
        NativeProtocol.r(intent, appCall.b().toString(), null, NativeProtocol.m(), NativeProtocol.c(facebookException));
        appCall.e(intent);
    }

    public static final void f(AppCall appCall, String str, Bundle bundle) {
        Context context = FacebookSdk.b();
        Intrinsics.f(context, "context");
        Validate.b(context, true);
        Context context2 = FacebookSdk.b();
        Intrinsics.f(context2, "context");
        Validate.c(context2, true);
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        NativeProtocol.r(intent, appCall.b().toString(), str, NativeProtocol.m(), bundle2);
        intent.setClass(FacebookSdk.b(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        appCall.e(intent);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0059  */
    public static final void g(AppCall appCall, Bundle bundle, DialogFeature dialogFeature) {
        PackageManager packageManager;
        String strEncodeToString;
        Context context = FacebookSdk.b();
        Intrinsics.f(context, "context");
        Validate.b(context, true);
        Context context2 = FacebookSdk.b();
        Intrinsics.f(context2, "context");
        Validate.c(context2, true);
        String strName = dialogFeature.name();
        FetchedAppSettings.DialogFeatureConfig dialogFeatureConfigA = FetchedAppSettings.Companion.a(FacebookSdk.c(), dialogFeature.g(), dialogFeature.name());
        Bundle bundle2 = null;
        Uri uri = dialogFeatureConfigA != null ? dialogFeatureConfigA.f16304c : null;
        if (uri == null) {
            throw new FacebookException(a.i('\'', "Unable to fetch the Url for the DialogFeature : '", strName));
        }
        int iM = NativeProtocol.m();
        String string = appCall.b().toString();
        Intrinsics.e(string, "appCall.callId.toString()");
        Collection collection = ServerProtocol.f16370a;
        LoggingBehavior loggingBehavior = LoggingBehavior.g0;
        Context contextB = FacebookSdk.b();
        if (CrashShieldHandler.b(FacebookSdk.class)) {
            strEncodeToString = null;
        } else {
            try {
                Validate.h();
                if (contextB == null || (packageManager = contextB.getPackageManager()) == null) {
                    strEncodeToString = null;
                } else {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(contextB.getPackageName(), 64);
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr == null || signatureArr.length == 0) {
                            strEncodeToString = null;
                        } else {
                            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
                            messageDigest.update(packageInfo.signatures[0].toByteArray());
                            strEncodeToString = Base64.encodeToString(messageDigest.digest(), 9);
                        }
                    } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(FacebookSdk.class, th);
            }
        }
        if (!Utility.C(strEncodeToString)) {
            Bundle bundleD = a.d("android_key_hash", strEncodeToString);
            bundleD.putString("app_id", FacebookSdk.c());
            bundleD.putInt("version", iM);
            bundleD.putString(d9.h.d, "touch");
            Bundle bundle3 = new Bundle();
            bundle3.putString("action_id", string);
            try {
                JSONObject jSONObjectB = BundleJSONConverter.b(bundle3);
                JSONObject jSONObjectB2 = BundleJSONConverter.b(bundle);
                bundleD.putString("bridge_args", jSONObjectB.toString());
                bundleD.putString("method_args", jSONObjectB2.toString());
                bundle2 = bundleD;
            } catch (IllegalArgumentException e2) {
                HashMap map = Logger.d;
                Logger.Companion.b(loggingBehavior, "com.facebook.internal.ServerProtocol", "Error creating Url -- " + e2);
            } catch (JSONException e3) {
                HashMap map2 = Logger.d;
                Logger.Companion.b(loggingBehavior, "com.facebook.internal.ServerProtocol", "Error creating Url -- " + e3);
            }
        }
        if (bundle2 == null) {
            throw new FacebookException("Unable to fetch the app's key-hash");
        }
        Uri uriB = uri.isRelative() ? Utility.b(bundle2, ServerProtocol.a(), uri.toString()) : Utility.b(bundle2, uri.getAuthority(), uri.getPath());
        Bundle bundle4 = new Bundle();
        bundle4.putString("url", uriB.toString());
        bundle4.putBoolean("is_fallback", true);
        Intent intent = new Intent();
        NativeProtocol.r(intent, appCall.b().toString(), dialogFeature.g(), NativeProtocol.m(), bundle4);
        intent.setClass(FacebookSdk.b(), FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        appCall.e(intent);
    }

    public static final void h(ActivityResultRegistry activityResultRegistry, final CallbackManager callbackManager, Intent intent, final int i2) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.X = null;
        ActivityResultLauncher activityResultLauncherD = activityResultRegistry.d(android.support.v4.media.a.h(i2, "facebook-dialog-request-"), new DialogPresenter$startActivityForResultWithAndroidX$1(), new ActivityResultCallback() { // from class: com.facebook.internal.DialogPresenter$startActivityForResultWithAndroidX$2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                Pair pair = (Pair) obj;
                CallbackManager callbackManagerImpl = callbackManager;
                if (callbackManagerImpl == null) {
                    callbackManagerImpl = new CallbackManagerImpl();
                }
                int i3 = i2;
                Object obj2 = pair.first;
                Intrinsics.e(obj2, "result.first");
                callbackManagerImpl.onActivityResult(i3, ((Number) obj2).intValue(), (Intent) pair.second);
                ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) objectRef.X;
                if (activityResultLauncher != null) {
                    synchronized (activityResultLauncher) {
                        activityResultLauncher.b();
                        objectRef.X = null;
                    }
                }
            }
        });
        objectRef.X = activityResultLauncherD;
        activityResultLauncherD.a(intent);
    }
}
