package io.flutter.plugins;

import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import ci.a;
import cj.m;
import com.adjust.sdk.flutter.AdjustSdk;
import com.applovin.applovin_max.AppLovinMAX;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import com.github.dart_lang.jni.JniPlugin;
import com.github.dart_lang.jni_flutter.JniFlutterPlugin;
import dj.l;
import ei.b;
import ej.d;
import gj.f;
import kj.p;
import lj.h;
import ni.c;
import oj.z;
import qj.c0;
import s5.o;
import tj.t0;
import x5.g;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(@NonNull c cVar) {
        try {
            cVar.f46740d.a(new AdjustSdk());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin adjust_sdk, com.adjust.sdk.flutter.AdjustSdk", e10);
        }
        try {
            cVar.f46740d.a(new a());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin android_id, dev.fluttercommunity.android_id.AndroidIdPlugin", e11);
        }
        try {
            cVar.f46740d.a(new df.a());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin app_links, com.llfbandit.app_links.AppLinksPlugin", e12);
        }
        try {
            cVar.f46740d.a(new wn.a());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin app_set_id, nl.u2312.app_set_id.AppSetIdPlugin", e13);
        }
        try {
            cVar.f46740d.a(new cf.a());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin app_settings_plus, com.kjxbyz.app_settings_plus.AppSettingsPlusPlugin", e14);
        }
        try {
            cVar.f46740d.a(new AppLovinMAX());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin applovin_max, com.applovin.applovin_max.AppLovinMAX", e15);
        }
        try {
            cVar.f46740d.a(new di.a());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin battery_plus, dev.fluttercommunity.plus.battery.BatteryPlusPlugin", e16);
        }
        try {
            cVar.f46740d.a(new c7.a());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin cerebro_v2, com.codeway.cerebro_v2.CerebroV2Plugin", e17);
        }
        try {
            cVar.f46740d.a(new d7.a());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin codewall, com.codeway.codewall.CodewallPlugin", e18);
        }
        try {
            cVar.f46740d.a(new b());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e19);
        }
        try {
            cVar.f46740d.a(new fi.a());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e20);
        }
        try {
            cVar.f46740d.a(new i7.b());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin devicelocale, com.example.devicelocale.DevicelocalePlugin", e21);
        }
        try {
            cVar.f46740d.a(new ki.b());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin facebook_app_events, id.oddbit.flutter.facebook_app_events.FacebookAppEventsPlugin", e22);
        }
        try {
            cVar.f46740d.a(new ue.a());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin file_saver, com.incrediblezayed.file_saver.FileSaverPlugin", e23);
        }
        try {
            cVar.f46740d.a(new m());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e24);
        }
        try {
            cVar.f46740d.a(new l());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e25);
        }
        try {
            cVar.f46740d.a(new d());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e26);
        }
        try {
            cVar.f46740d.a(new f());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e27);
        }
        try {
            cVar.f46740d.a(new hj.f());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin firebase_performance, io.flutter.plugins.firebase.performance.FlutterFirebasePerformancePlugin", e28);
        }
        try {
            cVar.f46740d.a(new o());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin flutter_contacts, co.quis.flutter_contacts.FlutterContactsPlugin", e29);
        }
        try {
            cVar.f46740d.a(new g());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin flutter_install_referrer, com.allwinsolutions.flutter_install_referrer.InstallReferrerPlugin", e30);
        }
        try {
            cVar.f46740d.a(new FlutterLocalNotificationsPlugin());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e31);
        }
        try {
            cVar.f46740d.a(new ij.a());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e32);
        }
        try {
            cVar.f46740d.a(new ye.f());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e33);
        }
        try {
            cVar.f46740d.a(new vn.a());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin flutter_timezone, net.wolverinebeach.flutter_timezone.FlutterTimezonePlugin", e34);
        }
        try {
            cVar.f46740d.a(new jj.c());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e35);
        }
        try {
            cVar.f46740d.a(new p());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e36);
        }
        try {
            cVar.f46740d.a(new h());
        } catch (Exception e37) {
            Log.e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e37);
        }
        try {
            cVar.f46740d.a(new bi.a());
        } catch (Exception e38) {
            Log.e(TAG, "Error registering plugin in_app_review, dev.britannio.in_app_review.InAppReviewPlugin", e38);
        }
        try {
            cVar.f46740d.a(new JniPlugin());
        } catch (Exception e39) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e39);
        }
        try {
            cVar.f46740d.a(new JniFlutterPlugin());
        } catch (Exception e40) {
            Log.e(TAG, "Error registering plugin jni_flutter, com.github.dart_lang.jni_flutter.JniFlutterPlugin", e40);
        }
        try {
            cVar.f46740d.a(new mj.d());
        } catch (Exception e41) {
            Log.e(TAG, "Error registering plugin local_auth_android, io.flutter.plugins.localauth.LocalAuthPlugin", e41);
        }
        try {
            cVar.f46740d.a(new j7.a());
        } catch (Exception e42) {
            Log.e(TAG, "Error registering plugin localized_rich_text, com.example.localized_rich_text.LocalizedRichTextPlugin", e42);
        }
        try {
            cVar.f46740d.a(new gi.a());
        } catch (Exception e43) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e43);
        }
        try {
            cVar.f46740d.a(new b6.b());
        } catch (Exception e44) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e44);
        }
        try {
            cVar.f46740d.a(new b8.b());
        } catch (Exception e45) {
            Log.e(TAG, "Error registering plugin photo_manager, com.fluttercandies.photo_manager.PhotoManagerPlugin", e45);
        }
        try {
            cVar.f46740d.a(new nj.f());
        } catch (Exception e46) {
            Log.e(TAG, "Error registering plugin quick_actions_android, io.flutter.plugins.quickactions.QuickActionsPlugin", e46);
        }
        try {
            cVar.f46740d.a(new e7.a());
        } catch (Exception e47) {
            Log.e(TAG, "Error registering plugin rive_l10n, com.codeway.rive_l10n.RiveL10nPlugin", e47);
        }
        try {
            cVar.f46740d.a(new r5.a());
        } catch (Exception e48) {
            Log.e(TAG, "Error registering plugin rive_native, app.rive.rive_native.RiveNativePlugin", e48);
        }
        try {
            cVar.f46740d.a(new hi.a());
        } catch (Exception e49) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e49);
        }
        try {
            cVar.f46740d.a(new z());
        } catch (Exception e50) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e50);
        }
        try {
            cVar.f46740d.a(new pj.f());
        } catch (Exception e51) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e51);
        }
        try {
            cVar.f46740d.a(new k7.a());
        } catch (Exception e52) {
            Log.e(TAG, "Error registering plugin video_compress, com.example.video_compress.VideoCompressPlugin", e52);
        }
        try {
            cVar.f46740d.a(new c0());
        } catch (Exception e53) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e53);
        }
        try {
            cVar.f46740d.a(new ii.a());
        } catch (Exception e54) {
            Log.e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e54);
        }
        try {
            cVar.f46740d.a(new t0());
        } catch (Exception e55) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e55);
        }
    }
}
