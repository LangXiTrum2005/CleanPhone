package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Base64;
import com.applovin.sdk.AppLovinEventParameters;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.p004ironsource.d9;
import com.p004ironsource.ne;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class AdColony {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ExecutorService f8860a = z0.h();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f8861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f8862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdColonySignalsListener f8863c;

        /* JADX INFO: renamed from: com.adcolony.sdk.AdColony$a$a, reason: collision with other inner class name */
        public class RunnableC0013a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f8864a;

            public RunnableC0013a(String str) {
                this.f8864a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f8864a.isEmpty()) {
                    a.this.f8863c.onFailure();
                } else {
                    a.this.f8863c.onSuccess(this.f8864a);
                }
            }
        }

        public a(k kVar, t0 t0Var, AdColonySignalsListener adColonySignalsListener) {
            this.f8861a = kVar;
            this.f8862b = t0Var;
            this.f8863c = adColonySignalsListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = this.f8861a;
            z0.b(new RunnableC0013a(AdColony.b(kVar, this.f8862b, kVar.y())));
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f8866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8867b;

        public b(AdColonyAdViewListener adColonyAdViewListener, String str) {
            this.f8866a = adColonyAdViewListener;
            this.f8867b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8866a.onRequestNotFilled(AdColony.a(this.f8867b));
        }
    }

    public class c implements Callable<f1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8868a;

        public c(long j) {
            this.f8868a = j;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f1 call() {
            return AdColony.b(this.f8868a);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ double f8869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8871c;
        final /* synthetic */ String d;

        public d(double d, String str, String str2, String str3) {
            this.f8869a = d;
            this.f8870b = str;
            this.f8871c = str2;
            this.d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdColony.b();
            f1 f1VarB = c0.b();
            double d = this.f8869a;
            if (d >= 0.0d) {
                c0.a(f1VarB, "price", d);
            }
            String str = this.f8870b;
            if (str != null && str.length() <= 3) {
                c0.a(f1VarB, "currency_code", this.f8870b);
            }
            c0.a(f1VarB, "product_id", this.f8871c);
            c0.a(f1VarB, AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, this.d);
            new h0("AdColony.on_iap_report", 1, f1VarB).c();
        }
    }

    public class e implements z0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f8873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8874c;
        final /* synthetic */ z0.c d;

        public e(AdColonyAdViewListener adColonyAdViewListener, String str, z0.c cVar) {
            this.f8873b = adColonyAdViewListener;
            this.f8874c = str;
            this.d = cVar;
        }

        @Override // com.adcolony.sdk.z0.b
        public boolean a() {
            return this.f8872a;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (this.f8872a) {
                        return;
                    }
                    this.f8872a = true;
                    AdColony.a(this.f8873b, this.f8874c);
                    if (this.d.a()) {
                        new e0.a().a("RequestNotFilled called due to a native timeout. ").a(android.support.v4.media.a.j(this.d.b(), " ms. ", new StringBuilder("Timeout set to: "))).a(android.support.v4.media.a.j(System.currentTimeMillis() - this.d.c(), " ms. ", new StringBuilder("Execution took: "))).a("AdView request not yet started.").a(e0.f9132i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0.b f8875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdColonyAdViewListener f8877c;
        final /* synthetic */ AdColonyAdSize d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AdColonyAdOptions f8878e;
        final /* synthetic */ z0.c f;

        public f(z0.b bVar, String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions, z0.c cVar) {
            this.f8875a = bVar;
            this.f8876b = str;
            this.f8877c = adColonyAdViewListener;
            this.d = adColonyAdSize;
            this.f8878e = adColonyAdOptions;
            this.f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVarB = com.adcolony.sdk.a.b();
            if (kVarB.E() || kVarB.F()) {
                AdColony.f();
                z0.a(this.f8875a);
            } else {
                if (!AdColony.b() && com.adcolony.sdk.a.c()) {
                    z0.a(this.f8875a);
                    return;
                }
                z0.c(this.f8875a);
                if (this.f8875a.a()) {
                    return;
                }
                kVarB.c().a(this.f8876b, this.f8877c, this.d, this.f8878e, this.f.d());
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdColonyAppOptions f8879a;

        public g(AdColonyAppOptions adColonyAppOptions) {
            this.f8879a = adColonyAppOptions;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdColony.b();
            f1 f1VarB = c0.b();
            c0.a(f1VarB, "options", this.f8879a.b());
            new h0("Options.set_options", 1, f1VarB).c();
        }
    }

    public class h implements z0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f8881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8882c;
        final /* synthetic */ z0.c d;

        public h(AdColonyInterstitialListener adColonyInterstitialListener, String str, z0.c cVar) {
            this.f8881b = adColonyInterstitialListener;
            this.f8882c = str;
            this.d = cVar;
        }

        @Override // com.adcolony.sdk.z0.b
        public boolean a() {
            return this.f8880a;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (this.f8880a) {
                        return;
                    }
                    this.f8880a = true;
                    AdColony.a(this.f8881b, this.f8882c);
                    if (this.d.a()) {
                        new e0.a().a("RequestNotFilled called due to a native timeout. ").a(android.support.v4.media.a.j(this.d.b(), " ms. ", new StringBuilder("Timeout set to: "))).a(android.support.v4.media.a.j(System.currentTimeMillis() - this.d.c(), " ms. ", new StringBuilder("Execution took: "))).a("Interstitial request not yet started.").a(e0.f9132i);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z0.b f8883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f8885c;
        final /* synthetic */ AdColonyAdOptions d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ z0.c f8886e;

        public i(z0.b bVar, String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions, z0.c cVar) {
            this.f8883a = bVar;
            this.f8884b = str;
            this.f8885c = adColonyInterstitialListener;
            this.d = adColonyAdOptions;
            this.f8886e = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVarB = com.adcolony.sdk.a.b();
            if (kVarB.E() || kVarB.F()) {
                AdColony.f();
                z0.a(this.f8883a);
                return;
            }
            if (!AdColony.b() && com.adcolony.sdk.a.c()) {
                z0.a(this.f8883a);
                return;
            }
            AdColonyZone adColonyZone = kVarB.C().get(this.f8884b);
            if (adColonyZone == null) {
                adColonyZone = new AdColonyZone(this.f8884b);
            }
            if (adColonyZone.getZoneType() == 2 || adColonyZone.getZoneType() == 1) {
                z0.a(this.f8883a);
                return;
            }
            z0.c(this.f8883a);
            if (this.f8883a.a()) {
                return;
            }
            kVarB.c().a(this.f8884b, this.f8885c, this.d, this.f8886e.d());
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AdColonyInterstitialListener f8887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8888b;

        public j(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
            this.f8887a = adColonyInterstitialListener;
            this.f8888b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8887a.onRequestNotFilled(AdColony.a(this.f8888b));
        }
    }

    public static boolean addCustomMessageListener(AdColonyCustomMessageListener adColonyCustomMessageListener, String str) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.addCustomMessageListener as AdColony ").a("has not yet been configured.").a(e0.f);
            return false;
        }
        if (z0.e(str)) {
            com.adcolony.sdk.a.b().m().put(str, adColonyCustomMessageListener);
            return true;
        }
        new e0.a().a("Ignoring call to AdColony.addCustomMessageListener.").a(e0.f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(k kVar, t0 t0Var, long j2) {
        q qVarN = kVar.n();
        ArrayList arrayList = new ArrayList(Arrays.asList(z0.c(kVar.u().b()), z0.a(qVarN.d())));
        if (j2 > 0) {
            q0 q0Var = new q0();
            if (qVarN.N()) {
                arrayList.add(qVarN.b());
            } else {
                q0Var.a(qVarN.a(j2));
            }
            if (qVarN.O()) {
                arrayList.add(qVarN.c());
            } else {
                q0Var.a(qVarN.b(j2));
            }
            if (kVar.G()) {
                q0Var.a(new c(j2));
            } else {
                arrayList.add(d());
            }
            if (!q0Var.b()) {
                arrayList.addAll(q0Var.a());
            }
        } else {
            arrayList.add(qVarN.b());
            arrayList.add(qVarN.c());
            arrayList.add(d());
        }
        arrayList.add(kVar.e());
        f1 f1VarA = c0.a((f1[]) arrayList.toArray(new f1[0]));
        t0Var.c();
        c0.b(f1VarA, "signals_count", t0Var.b());
        c0.b(f1VarA, "device_audio", e());
        f1VarA.e();
        byte[] bytes = f1VarA.toString().getBytes(com.adcolony.sdk.h.f9168a);
        return kVar.H() ? a(bytes) : Base64.encodeToString(bytes, 0);
    }

    public static void c() {
        if (f8860a.isShutdown()) {
            f8860a = Executors.newSingleThreadExecutor();
        }
    }

    public static boolean clearCustomMessageListeners() {
        if (com.adcolony.sdk.a.e()) {
            com.adcolony.sdk.a.b().m().clear();
            return true;
        }
        new e0.a().a("Ignoring call to AdColony.clearCustomMessageListeners as AdColony").a(" has not yet been configured.").a(e0.f);
        return false;
    }

    public static void collectSignals(AdColonySignalsListener adColonySignalsListener) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").a(e0.f);
            adColonySignalsListener.onFailure();
        } else {
            k kVarB = com.adcolony.sdk.a.b();
            if (a(new a(kVarB, kVarB.x(), adColonySignalsListener))) {
                return;
            }
            adColonySignalsListener.onFailure();
        }
    }

    @Deprecated
    public static boolean configure(Activity activity, String str, String... strArr) {
        return a(activity, (AdColonyAppOptions) null, str);
    }

    private static f1 d() {
        return b(-1L);
    }

    public static boolean disable() {
        if (!com.adcolony.sdk.a.e()) {
            return false;
        }
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA != null && (contextA instanceof com.adcolony.sdk.b)) {
            ((Activity) contextA).finish();
        }
        k kVarB = com.adcolony.sdk.a.b();
        kVarB.c().b();
        kVarB.R();
        kVarB.T();
        kVarB.b(true);
        return true;
    }

    private static boolean e() {
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA == null) {
            return false;
        }
        return z0.b(z0.a(contextA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        new e0.a().a("The AdColony API is not available while AdColony is disabled.").a(e0.f9131h);
    }

    public static void g() {
        f8860a.shutdown();
    }

    public static AdColonyAppOptions getAppOptions() {
        if (com.adcolony.sdk.a.e()) {
            return com.adcolony.sdk.a.b().u();
        }
        return null;
    }

    public static AdColonyCustomMessageListener getCustomMessageListener(String str) {
        if (com.adcolony.sdk.a.e()) {
            return com.adcolony.sdk.a.b().m().get(str);
        }
        return null;
    }

    public static AdColonyRewardListener getRewardListener() {
        if (com.adcolony.sdk.a.e()) {
            return com.adcolony.sdk.a.b().w();
        }
        return null;
    }

    public static String getSDKVersion() {
        return !com.adcolony.sdk.a.e() ? "" : com.adcolony.sdk.a.b().n().I();
    }

    public static AdColonyZone getZone(String str) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.getZone() as AdColony has not yet been ").a("configured.").a(e0.f);
            return null;
        }
        HashMap<String, AdColonyZone> mapC = com.adcolony.sdk.a.b().C();
        if (mapC.containsKey(str)) {
            return mapC.get(str);
        }
        AdColonyZone adColonyZone = new AdColonyZone(str);
        com.adcolony.sdk.a.b().C().put(str, adColonyZone);
        return adColonyZone;
    }

    public static boolean notifyIAPComplete(String str, String str2) {
        return notifyIAPComplete(str, str2, null, 0.0d);
    }

    public static boolean removeCustomMessageListener(String str) {
        if (com.adcolony.sdk.a.e()) {
            com.adcolony.sdk.a.b().m().remove(str);
            return true;
        }
        new e0.a().a("Ignoring call to AdColony.removeCustomMessageListener as AdColony").a(" has not yet been configured.").a(e0.f);
        return false;
    }

    public static boolean removeRewardListener() {
        if (com.adcolony.sdk.a.e()) {
            com.adcolony.sdk.a.b().a((AdColonyRewardListener) null);
            return true;
        }
        new e0.a().a("Ignoring call to AdColony.removeRewardListener() as AdColony has ").a("not yet been configured.").a(e0.f);
        return false;
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize) {
        return requestAdView(str, adColonyAdViewListener, adColonyAdSize, null);
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener) {
        return requestInterstitial(str, adColonyInterstitialListener, null);
    }

    public static boolean setAppOptions(AdColonyAppOptions adColonyAppOptions) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.setAppOptions() as AdColony has not yet").a(" been configured.").a(e0.f);
            return false;
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        com.adcolony.sdk.a.a(adColonyAppOptions);
        if (com.adcolony.sdk.a.d()) {
            k kVarB = com.adcolony.sdk.a.b();
            if (kVarB.D()) {
                adColonyAppOptions.a(kVarB.u().a());
            }
        }
        com.adcolony.sdk.a.b().b(adColonyAppOptions);
        Context contextA = com.adcolony.sdk.a.a();
        if (contextA != null) {
            adColonyAppOptions.b(contextA);
        }
        return a(new g(adColonyAppOptions));
    }

    public static boolean setRewardListener(AdColonyRewardListener adColonyRewardListener) {
        if (com.adcolony.sdk.a.e()) {
            com.adcolony.sdk.a.b().a(adColonyRewardListener);
            return true;
        }
        new e0.a().a("Ignoring call to AdColony.setRewardListener() as AdColony has not").a(" yet been configured.").a(e0.f);
        return false;
    }

    @Deprecated
    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return a(activity, adColonyAppOptions, str);
    }

    public static boolean notifyIAPComplete(String str, String str2, String str3, double d2) {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to notifyIAPComplete as AdColony has not yet been ").a("configured.").a(e0.f);
            return false;
        }
        if (!z0.e(str) || !z0.e(str2)) {
            new e0.a().a("Ignoring call to notifyIAPComplete as one of the passed Strings ").a("is greater than ").a(128).a(" characters.").a(e0.f);
            return false;
        }
        if (str3 != null && str3.length() > 3) {
            new e0.a().a("You are trying to report an IAP event with a currency String ").a("containing more than 3 characters.").a(e0.f);
        }
        if (a(new d(d2, str3, str, str2))) {
            return true;
        }
        new e0.a().a("Executing AdColony.notifyIAPComplete failed").a(e0.f9132i);
        return false;
    }

    public static boolean requestAdView(String str, AdColonyAdViewListener adColonyAdViewListener, AdColonyAdSize adColonyAdSize, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyAdViewListener == null) {
            new e0.a().a("AdColonyAdViewListener is set to null. ").a("It is required to be non null.").a(e0.f);
        }
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to requestAdView as AdColony has not yet been").a(" configured.").a(e0.f);
            a(adColonyAdViewListener, str);
            return false;
        }
        if (adColonyAdSize.getHeight() <= 0 || adColonyAdSize.getWidth() <= 0) {
            new e0.a().a("Ignoring call to requestAdView as you've provided an AdColonyAdSize").a(" object with an invalid width or height.").a(e0.f);
            a(adColonyAdViewListener, str);
            return false;
        }
        if (r0.a(1, androidx.media3.extractor.text.ttml.a.d("zone_id", str))) {
            a(adColonyAdViewListener, str);
            return false;
        }
        z0.c cVar = new z0.c(com.adcolony.sdk.a.b().d());
        e eVar = new e(adColonyAdViewListener, str, cVar);
        z0.a(eVar, cVar.d());
        if (a(new f(eVar, str, adColonyAdViewListener, adColonyAdSize, adColonyAdOptions, cVar))) {
            return true;
        }
        z0.a((z0.b) eVar);
        return false;
    }

    public static boolean requestInterstitial(String str, AdColonyInterstitialListener adColonyInterstitialListener, AdColonyAdOptions adColonyAdOptions) {
        if (adColonyInterstitialListener == null) {
            new e0.a().a("AdColonyInterstitialListener is set to null. ").a("It is required to be non null.").a(e0.f);
        }
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.requestInterstitial as AdColony has not").a(" yet been configured.").a(e0.f);
            a(adColonyInterstitialListener, str);
            return false;
        }
        if (r0.a(1, androidx.media3.extractor.text.ttml.a.d("zone_id", str))) {
            a(adColonyInterstitialListener, str);
            return false;
        }
        z0.c cVar = new z0.c(com.adcolony.sdk.a.b().d());
        h hVar = new h(adColonyInterstitialListener, str, cVar);
        z0.a(hVar, cVar.d());
        if (a(new i(hVar, str, adColonyInterstitialListener, adColonyAdOptions, cVar))) {
            return true;
        }
        z0.a((z0.b) hVar);
        return false;
    }

    @Deprecated
    public static boolean configure(Application application, String str, String... strArr) {
        return configure(application, (AdColonyAppOptions) null, str);
    }

    public static boolean a(Runnable runnable) {
        return z0.a(f8860a, runnable);
    }

    @Deprecated
    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str, String... strArr) {
        return a(application, adColonyAppOptions, str);
    }

    private static String a(k kVar, t0 t0Var) {
        return b(kVar, t0Var, -1L);
    }

    public static boolean configure(Activity activity, String str) {
        return a(activity, (AdColonyAppOptions) null, str);
    }

    public static String a(byte[] bArr) {
        com.adcolony.sdk.g gVar = new com.adcolony.sdk.g("sa01", "", "{\"origin_store\":\"google\",\"app_id\":\",\"bundle_id\":\",\"os_name\":\"android\",\"zone_ids\":[\"],\"carrier_name\":\",\"screen_width\":,\"screen_height\":,\"device_type\":\"phonetablet\",\"locale_language_code\":\",\"ln\":\",\"locale_country_code\":\",\"locale\":\",\"manufacturer\":\",\"device_brand\":\",\"device_model\":\",\"sdk_type\":\"android_native\",\"sdk_version\":\"4.\",\"network_type\":\"cellwifi\",\"os_version\":\",\"platform\":\"android\",\"app_bundle_name\":\",\"app_bundle_version\":\",\"battery_level\":,\"cell_service_country_code\":\",\"controller_version\":\",\"current_orientation\":,\"cleartext_permitted\":,\"available_stores\":[\"],\"advertiser_id\":\",\"limit_tracking\":false,\"adc_alt_id\":\",\"odt_payload\":{\"config\":{\"Q1\":[\",\\\"session_start\\\"\"],\"Q2\":[\",\\\"configure\\\"\"],\"Q3\":[\"],\"Q4\":[\"],\"Q5\":[\"],\"Q6\":[\"]},\"session\":{},\"events\":{},\"version\":},\"signals_count\":,\"device_audio\":true}", "");
        try {
            byte[] bArrA = gVar.a(bArr);
            f1 f1VarB = c0.b();
            f1VarB.a("a", gVar.b());
            f1VarB.a("b", Base64.encodeToString(bArrA, 0));
            return f1VarB.toString();
        } catch (UnsupportedEncodingException | JSONException unused) {
            return Base64.encodeToString(bArr, 0);
        }
    }

    public static boolean configure(Activity activity, AdColonyAppOptions adColonyAppOptions, String str) {
        return a(activity, adColonyAppOptions, str);
    }

    public static boolean configure(Application application, String str) {
        return configure(application, (AdColonyAppOptions) null, str);
    }

    public static boolean configure(Application application, AdColonyAppOptions adColonyAppOptions, String str) {
        return a(application, adColonyAppOptions, str);
    }

    @Deprecated
    public static String collectSignals() {
        if (!com.adcolony.sdk.a.e()) {
            new e0.a().a("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.").a(e0.f);
            return "";
        }
        k kVarB = com.adcolony.sdk.a.b();
        return a(kVarB, kVarB.x());
    }

    private static boolean a(Context context, AdColonyAppOptions adColonyAppOptions, String str) {
        if (r0.a(0, null)) {
            new e0.a().a("Cannot configure AdColony; configuration mechanism requires 5 ").a("seconds between attempts.").a(e0.f);
            return false;
        }
        if (context == null) {
            context = com.adcolony.sdk.a.a();
        }
        if (context == null) {
            new e0.a().a("Ignoring call to AdColony.configure() as the provided Activity or ").a("Application context is null and we do not currently hold a ").a("reference to either for our use.").a(e0.f);
            return false;
        }
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        if (adColonyAppOptions == null) {
            adColonyAppOptions = new AdColonyAppOptions();
        }
        if (com.adcolony.sdk.a.d() && !c0.b(com.adcolony.sdk.a.b().u().b(), "reconfigurable") && !com.adcolony.sdk.a.b().u().a().equals(str)) {
            new e0.a().a("Ignoring call to AdColony.configure() as the app id does not ").a("match what was used during the initial configuration.").a(e0.f);
            return false;
        }
        if (str.equals("")) {
            new e0.a().a("AdColony.configure() called with an empty app id String.").a(e0.f9131h);
            return false;
        }
        com.adcolony.sdk.a.f8952c = true;
        adColonyAppOptions.a(str);
        com.adcolony.sdk.a.a(context, adColonyAppOptions, false);
        String strR = android.support.v4.media.a.r(new StringBuilder(), com.adcolony.sdk.a.b().z().f(), "/adc3/AppInfo");
        f1 f1VarB = c0.b();
        c0.a(f1VarB, com.smartdigimkt.f3.b.f35043u, str);
        c0.j(f1VarB, strR);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f1 b(long j2) {
        o.b bVarB;
        f1 f1VarB = c0.b();
        if (j2 > 0) {
            bVarB = o0.c().a(j2);
        } else {
            bVarB = o0.c().b();
        }
        if (bVarB != null) {
            c0.a(f1VarB, "odt_payload", bVarB.b());
        }
        return f1VarB;
    }

    public static boolean b() {
        k kVarB = com.adcolony.sdk.a.b();
        kVarB.a(MBInterstitialActivity.WEB_LOAD_TIME);
        return kVarB.I();
    }

    public static AdColonyZone a(String str) {
        AdColonyZone adColonyZone = (com.adcolony.sdk.a.c() || com.adcolony.sdk.a.d()) ? com.adcolony.sdk.a.b().C().get(str) : null;
        if (adColonyZone != null) {
            return adColonyZone;
        }
        AdColonyZone adColonyZone2 = new AdColonyZone(str);
        adColonyZone2.c(6);
        return adColonyZone2;
    }

    public static void a(AdColonyInterstitialListener adColonyInterstitialListener, String str) {
        if (adColonyInterstitialListener != null) {
            z0.b(new j(adColonyInterstitialListener, str));
        }
    }

    public static void a(AdColonyAdViewListener adColonyAdViewListener, String str) {
        if (adColonyAdViewListener != null) {
            z0.b(new b(adColonyAdViewListener, str));
        }
    }

    public static void a(Context context, AdColonyAppOptions adColonyAppOptions) {
        k kVarB = com.adcolony.sdk.a.b();
        q qVarN = kVarB.n();
        if (adColonyAppOptions == null || context == null) {
            return;
        }
        String strD = z0.d(context);
        String strC = z0.c();
        int iD = z0.d();
        String strM = qVarN.m();
        String strE = kVarB.s().e();
        HashMap<String, Object> mapS = androidx.media3.extractor.text.ttml.a.s(JsonStorageKeyNames.SESSION_ID_KEY, "unknown");
        mapS.put("countryLocale", Locale.getDefault().getDisplayLanguage() + " (" + Locale.getDefault().getDisplayCountry() + ")");
        mapS.put("countryLocaleShort", com.adcolony.sdk.a.b().n().p());
        mapS.put("manufacturer", com.adcolony.sdk.a.b().n().C());
        mapS.put("model", com.adcolony.sdk.a.b().n().F());
        mapS.put("osVersion", com.adcolony.sdk.a.b().n().H());
        mapS.put("carrierName", strM);
        mapS.put("networkType", strE);
        mapS.put("platform", "android");
        mapS.put("appName", strD);
        mapS.put(d9.i.W, strC);
        mapS.put("appBuildNumber", Integer.valueOf(iD));
        mapS.put(com.smartdigimkt.f3.b.f35043u, "" + adColonyAppOptions.a());
        mapS.put("apiLevel", Integer.valueOf(Build.VERSION.SDK_INT));
        mapS.put("sdkVersion", com.adcolony.sdk.a.b().n().I());
        mapS.put("controllerVersion", "unknown");
        f1 f1Var = new f1(adColonyAppOptions.getMediationInfo());
        f1 f1Var2 = new f1(adColonyAppOptions.getPluginInfo());
        if (!c0.h(f1Var, "mediation_network").equals("")) {
            mapS.put("mediationNetwork", c0.h(f1Var, "mediation_network"));
            mapS.put("mediationNetworkVersion", c0.h(f1Var, "mediation_network_version"));
        }
        if (!c0.h(f1Var2, ne.K).equals("")) {
            mapS.put(ne.K, c0.h(f1Var2, ne.K));
            mapS.put("pluginVersion", c0.h(f1Var2, "plugin_version"));
        }
        kVarB.q().a(mapS);
    }
}
