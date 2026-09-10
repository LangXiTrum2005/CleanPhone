package cf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.ironsource.T3;
import com.ironsource.X3;
import fc.f;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import ti.b;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcf/a;", "Lti/b;", "Lxi/n;", "Lui/a;", "<init>", "()V", "app_settings_plus_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements b, n, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f6378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f6379b;

    public final void a(j jVar, boolean z10) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        if (z10) {
            intent.addFlags(268435456);
        }
        Activity activity = this.f6378a;
        if (activity != null) {
            intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            activity.startActivity(intent);
        }
        jVar.a(null);
    }

    public final void b(String str, j jVar, boolean z10) {
        try {
            Intent intent = new Intent(str);
            if (z10) {
                intent.addFlags(268435456);
            }
            Activity activity = this.f6378a;
            if (activity != null) {
                activity.startActivity(intent);
            }
            jVar.a(null);
        } catch (Exception unused) {
            a(jVar, z10);
        }
    }

    @Override // ui.a
    public final void onAttachedToActivity(ui.b binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        this.f6378a = (Activity) ((f) binding).f40780b;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        kotlin.jvm.internal.n.f(flutterPluginBinding, "flutterPluginBinding");
        p pVar = new p(flutterPluginBinding.f50789c, "com.kjxbyz.app_settings_plus/methods");
        this.f6379b = pVar;
        pVar.b(this);
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        this.f6378a = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f6378a = null;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        p pVar = this.f6379b;
        if (pVar != null) {
            pVar.b(null);
        } else {
            kotlin.jvm.internal.n.l("channel");
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xi.n
    public final void onMethodCall(m call, o oVar) {
        kotlin.jvm.internal.n.f(call, "call");
        String str = call.f53822a;
        if (!kotlin.jvm.internal.n.a(str, "openSettings")) {
            if (!kotlin.jvm.internal.n.a(str, "openSettingsPanel")) {
                ((j) oVar).c();
                return;
            }
            Activity activity = this.f6378a;
            if (activity == null) {
                ((j) oVar).a(null);
                return;
            }
            String str2 = (String) call.a("type");
            if (str2 != null) {
                switch (str2.hashCode()) {
                    case -810883302:
                        if (str2.equals("volume")) {
                            activity.startActivity(new Intent("android.settings.panel.action.VOLUME"));
                            ((j) oVar).a(null);
                            return;
                        }
                        break;
                    case 108971:
                        if (str2.equals("nfc")) {
                            activity.startActivity(new Intent("android.settings.panel.action.NFC"));
                            ((j) oVar).a(null);
                            return;
                        }
                        break;
                    case 3649301:
                        if (str2.equals(T3.f27210b)) {
                            activity.startActivity(new Intent("android.settings.panel.action.WIFI"));
                            ((j) oVar).a(null);
                            return;
                        }
                        break;
                    case 21015448:
                        if (str2.equals("internetConnectivity")) {
                            activity.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                            ((j) oVar).a(null);
                            return;
                        }
                        break;
                }
            }
            ((j) oVar).c();
            return;
        }
        Boolean bool = (Boolean) call.a("asAnotherTask");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        String str3 = (String) call.a("type");
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -2045253606:
                    if (str3.equals("batteryOptimization")) {
                        b("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case -1928150741:
                    if (str3.equals("generalSettings")) {
                        b("android.settings.SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case -1335157162:
                    if (str3.equals(X3.i.G)) {
                        b("android.settings.DEVICE_INFO_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case -1000044642:
                    if (str3.equals("wireless")) {
                        b("android.settings.WIRELESS_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case -213139122:
                    if (str3.equals("accessibility")) {
                        b("android.settings.ACCESSIBILITY_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case -114233073:
                    if (str3.equals("dataRoaming")) {
                        b("android.settings.DATA_ROAMING_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case -80681014:
                    if (str3.equals("developer")) {
                        b("android.settings.APPLICATION_DEVELOPMENT_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 96799:
                    if (str3.equals("apn")) {
                        b("android.settings.APN_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 108971:
                    if (str3.equals("nfc")) {
                        b("android.settings.NFC_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 116980:
                    if (str3.equals("vpn")) {
                        b("android.settings.VPN_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 3076014:
                    if (str3.equals("date")) {
                        b("android.settings.DATE_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 3649301:
                    if (str3.equals(T3.f27210b)) {
                        b("android.settings.WIFI_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 92895825:
                    if (str3.equals(NotificationCompat.CATEGORY_ALARM)) {
                        if (Build.VERSION.SDK_INT < 31) {
                            a((j) oVar, zBooleanValue);
                            return;
                        }
                        Activity activity2 = this.f6378a;
                        Uri uriFromParts = activity2 != null ? Uri.fromParts("package", activity2.getPackageName(), null) : null;
                        if (uriFromParts == null) {
                            ((j) oVar).a(null);
                            return;
                        }
                        Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", uriFromParts);
                        j jVar = (j) oVar;
                        if (zBooleanValue) {
                            try {
                                intent.addFlags(268435456);
                            } catch (Exception unused) {
                                a(jVar, zBooleanValue);
                                return;
                            }
                        }
                        Activity activity3 = this.f6378a;
                        if (activity3 != null) {
                            activity3.startActivity(intent);
                        }
                        jVar.a(null);
                        return;
                    }
                    break;
                case 109627663:
                    if (str3.equals("sound")) {
                        b("android.settings.SOUND_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 595233003:
                    if (str3.equals("notification")) {
                        Activity activity4 = this.f6378a;
                        if (activity4 != null) {
                            Intent intentPutExtra = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", activity4.getPackageName());
                            kotlin.jvm.internal.n.e(intentPutExtra, "putExtra(...)");
                            if (zBooleanValue) {
                                intentPutExtra.addFlags(268435456);
                            }
                            activity4.startActivity(intentPutExtra);
                        }
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case 949122880:
                    if (str3.equals("security")) {
                        b("android.settings.SECURITY_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 1039955198:
                    if (str3.equals("internalStorage")) {
                        b("android.settings.INTERNAL_STORAGE_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 1099603663:
                    if (str3.equals("hotspot")) {
                        Intent className = new Intent().setClassName("com.android.settings", "com.android.settings.TetherSettings");
                        kotlin.jvm.internal.n.e(className, "setClassName(...)");
                        j jVar2 = (j) oVar;
                        if (zBooleanValue) {
                            try {
                                className.addFlags(268435456);
                            } catch (Exception unused2) {
                                a(jVar2, zBooleanValue);
                                return;
                            }
                        }
                        Activity activity5 = this.f6378a;
                        if (activity5 != null) {
                            activity5.startActivity(className);
                        }
                        jVar2.a(null);
                        return;
                    }
                    break;
                case 1214667623:
                    if (str3.equals("lockAndPassword")) {
                        b("android.app.action.SET_NEW_PASSWORD", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 1294374875:
                    if (str3.equals("appLocale")) {
                        if (Build.VERSION.SDK_INT < 33) {
                            ((j) oVar).a(null);
                            return;
                        }
                        Intent intent2 = new Intent("android.settings.APP_LOCALE_SETTINGS");
                        if (zBooleanValue) {
                            intent2.addFlags(268435456);
                        }
                        Activity activity6 = this.f6378a;
                        if (activity6 != null) {
                            intent2.setData(Uri.fromParts("package", activity6.getPackageName(), null));
                            activity6.startActivity(intent2);
                        }
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case 1434631203:
                    if (str3.equals("settings")) {
                        a((j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 1671764162:
                    if (str3.equals(X3.i.f27786d)) {
                        b("android.settings.DISPLAY_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 1901043637:
                    if (str3.equals("location")) {
                        b("android.settings.LOCATION_SOURCE_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
                case 1968882350:
                    if (str3.equals(T3.f27212d)) {
                        b("android.settings.BLUETOOTH_SETTINGS", (j) oVar, zBooleanValue);
                        return;
                    }
                    break;
            }
        }
        ((j) oVar).c();
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        this.f6378a = (Activity) ((f) binding).f40780b;
    }
}
