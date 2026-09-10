package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0965u0 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f11921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f11922b;

    /* JADX INFO: renamed from: com.applovin.impl.u0$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11923a;

        static {
            int[] iArr = new int[AppLovinSdkConfiguration.ConsentFlowUserGeography.values().length];
            f11923a = iArr;
            try {
                iArr[AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11923a[AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11923a[AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.u0$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f11926c;
        private AppLovinCmpError d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private C0960s0 f11927e;

        public b() {
        }

        public boolean b() {
            return this.f11924a;
        }

        public void c() {
            this.f11926c = true;
            this.f11924a = true;
        }

        public void d() {
            this.f11925b = true;
            this.f11924a = true;
        }

        public b(C0960s0 c0960s0) {
            this.f11927e = c0960s0;
        }

        public boolean a() {
            return this.f11926c;
        }

        public void a(AppLovinCmpError appLovinCmpError) {
            this.d = appLovinCmpError;
        }

        public void a(C0960s0 c0960s0) {
            this.f11927e = c0960s0;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.u0$c */
    public interface c {
        void a(b bVar);
    }

    public C0965u0(com.applovin.impl.sdk.k kVar) {
        this.f11921a = kVar;
        this.f11922b = new z0(kVar);
        if (n7.k(com.applovin.impl.sdk.k.o())) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    public static TermsAndPrivacyPolicyFlowSettingsImpl a(Context context) {
        if (context == null) {
            com.applovin.impl.sdk.o.h("ConsentFlowManager", "Failed to get default Terms and Privacy Policy flow settings.");
            return new TermsAndPrivacyPolicyFlowSettingsImpl(false, false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, null, null);
        }
        String strA = n7.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (com.applovin.impl.sdk.k) null);
        JSONObject jSONObject = JsonUtils.getJSONObject(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject(), "consent_flow_settings", new JSONObject());
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", bool);
        Boolean bool3 = JsonUtils.getBoolean(jSONObject, "consent_flow_show_terms_and_privacy_policy_alert_in_gdpr", bool);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri uri = URLUtil.isValidUrl(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new TermsAndPrivacyPolicyFlowSettingsImpl(bool2.booleanValue(), bool3.booleanValue(), a(string), URLUtil.isValidUrl(string3) ? Uri.parse(string3) : null, uri);
    }

    public JSONObject b() {
        TermsAndPrivacyPolicyFlowSettingsImpl termsAndPrivacyPolicyFlowSettingsImplC = c();
        Uri privacyPolicyUri = termsAndPrivacyPolicyFlowSettingsImplC.getPrivacyPolicyUri();
        Uri termsOfServiceUri = termsAndPrivacyPolicyFlowSettingsImplC.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(j()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public Uri h() {
        return c().getTermsOfServiceUri();
    }

    public boolean i() {
        return this.f11922b.a();
    }

    public boolean j() {
        Map<String, String> extraParameters = this.f11921a.n0().getExtraParameters();
        return extraParameters.containsKey("consent_flow_enabled") ? Boolean.parseBoolean(extraParameters.get("consent_flow_enabled")) : c().isEnabled();
    }

    public boolean k() {
        if (n7.c(this.f11921a)) {
            int i2 = a.f11923a[d().ordinal()];
            if (i2 == 1) {
                return true;
            }
            if (i2 == 2) {
                return false;
            }
        }
        return this.f11921a.v().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
    }

    public boolean l() {
        return this.f11921a.n0().getExtraParameters().containsKey("terms_flow_settings");
    }

    public boolean m() {
        return c().shouldShowTermsAndPrivacyPolicyAlertInGdpr();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f11922b.a(this.f11921a.u0(), new E(this, 4));
    }

    private TermsAndPrivacyPolicyFlowSettingsImpl c() {
        return (TermsAndPrivacyPolicyFlowSettingsImpl) this.f11921a.n0().getTermsAndPrivacyPolicyFlowSettings();
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography d() {
        return c().getDebugUserGeography();
    }

    public String e() {
        Object objF = f();
        Object objH = h();
        StringBuilder sb = new StringBuilder("\nConsent Flow Enabled - ");
        sb.append(j());
        sb.append("\nTerms of Service - ");
        if (objH == null) {
            objH = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(objH);
        sb.append("\nPrivacy Policy - ");
        if (objF == null) {
            objF = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(objF);
        return sb.toString();
    }

    public Uri f() {
        return c().getPrivacyPolicyUri();
    }

    public String g() {
        return "Migrate to the new Terms and Privacy Policy Flow by following these steps:\n\t1. Delete the 'terms_flow_settings' entry from your 'applovin_settings.xml' file.\n\t2. Follow the integration instructions in our documentation: " + a();
    }

    private void b(Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new D(24, this, activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Uri uri, DialogInterface dialogInterface, int i2) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    public void a(Activity activity, c cVar) {
        if (!j()) {
            cVar.a(new b(new C0960s0(C0960s0.f11574c, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
        } else if (c().getPrivacyPolicyUri() == null) {
            b(activity);
        } else {
            this.f11922b.a(activity, new G(this, cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, b bVar) {
        if (bVar.f11927e == null) {
            this.f11921a.b(z4.t, Boolean.FALSE);
        }
        cVar.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        if (bVar.f11927e == null) {
            this.f11921a.b(z4.t, Boolean.FALSE);
        }
        AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }

    private static AppLovinSdkConfiguration.ConsentFlowUserGeography a(String str) {
        if ("gdpr".equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        if (com.p004ironsource.x4.DEFAULT_AUCTION_FALLBACK_VALUE.equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER;
        }
        return AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        final Uri uriA = a();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.Q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.X.a(uriA, dialogInterface, i2);
            }
        }).setNegativeButton("DISMISS", new E0(uriA, 1)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Uri uri, DialogInterface dialogInterface, int i2) {
        k7.a(uri, com.applovin.impl.sdk.k.o(), this.f11921a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    private Uri a() {
        return Uri.parse((String) this.f11921a.a(this.f11921a.H0() ? x4.Z6 : x4.Y6));
    }
}
