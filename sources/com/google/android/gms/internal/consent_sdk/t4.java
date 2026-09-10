package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.gms.internal.ads.z40;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f23202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f23203b;

    public t4(Application application, h hVar) {
        this.f23202a = application;
        this.f23203b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    public final z40 a(Activity activity, ConsentRequestParameters consentRequestParameters) throws p1 {
        Bundle bundle;
        List list;
        PackageInfo packageInfo;
        ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
        Application application = this.f23202a;
        if (consentDebugSettings == null) {
            consentDebugSettings = new ConsentDebugSettings.Builder(application).build();
        }
        z40 z40Var = new z40();
        z40Var.f22496f = Collections.EMPTY_MAP;
        z40Var.f22500j = Collections.EMPTY_LIST;
        String strZza = consentRequestParameters.zza();
        if (TextUtils.isEmpty(strZza)) {
            try {
                bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strZza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(strZza)) {
                throw new p1(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        z40Var.f22491a = strZza;
        if (consentDebugSettings.isTestDevice()) {
            ArrayList arrayList = new ArrayList();
            int debugGeography = consentDebugSettings.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(y.f23275a);
            } else if (debugGeography == 2) {
                arrayList.add(y.f23278d);
            } else if (debugGeography == 3) {
                arrayList.add(y.f23276b);
            } else if (debugGeography == 4) {
                arrayList.add(y.f23277c);
            }
            arrayList.add(y.f23279e);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        z40Var.f22500j = list;
        z40Var.f22496f = this.f23203b.a();
        z40Var.f22495e = Boolean.valueOf(consentRequestParameters.isTagForUnderAgeOfConsent());
        z40Var.f22494d = Locale.getDefault().toLanguageTag();
        b2.p pVar = new b2.p((byte) 0, 4);
        pVar.f5363b = 1;
        pVar.f5365d = Integer.valueOf(Build.VERSION.SDK_INT);
        pVar.f5364c = Build.MODEL;
        pVar.f5363b = 2;
        z40Var.f22493c = pVar;
        Configuration configuration = application.getResources().getConfiguration();
        application.getResources().getConfiguration();
        k5.g gVar = new k5.g();
        Object arrayList2 = Collections.EMPTY_LIST;
        gVar.f44328d = arrayList2;
        gVar.f44325a = Integer.valueOf(configuration.screenWidthDp);
        gVar.f44326b = Integer.valueOf(configuration.screenHeightDp);
        gVar.f44327c = Double.valueOf(application.getResources().getDisplayMetrics().density);
        Window window = activity == null ? null : activity.getWindow();
        View decorView = window == null ? null : window.getDecorView();
        WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
        DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
        if (displayCutout != null) {
            displayCutout.getSafeInsetBottom();
            arrayList2 = new ArrayList();
            for (Rect rect : displayCutout.getBoundingRects()) {
                if (rect != null) {
                    z zVar = new z();
                    zVar.f23284b = Integer.valueOf(rect.left);
                    zVar.f23285c = Integer.valueOf(rect.right);
                    zVar.f23283a = Integer.valueOf(rect.top);
                    zVar.f23286d = Integer.valueOf(rect.bottom);
                    arrayList2.add(zVar);
                }
            }
        }
        gVar.f44328d = arrayList2;
        z40Var.f22497g = gVar;
        try {
            packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        v9.e eVar = new v9.e(4, false);
        eVar.f52503b = application.getPackageName();
        CharSequence applicationLabel = application.getPackageManager().getApplicationLabel(application.getApplicationInfo());
        eVar.f52504c = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            eVar.f52505d = Long.toString(packageInfo.getLongVersionCode());
        }
        z40Var.f22498h = eVar;
        z40Var.f22499i = new o4(23);
        z40Var.f22492b = consentRequestParameters.getConsentSyncId();
        return z40Var;
    }
}
