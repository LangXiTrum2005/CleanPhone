package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import bc.r;
import com.applovin.impl.f2;
import com.applovin.impl.m0;
import com.applovin.impl.n9;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import defpackage.e;
import java.util.HashMap;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f9013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConsentForm f9014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9015d;

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface InterfaceC0014a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(l lVar) {
        this.f9012a = lVar;
        this.f9013b = lVar.Q();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(l.p());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public void a() {
        if (this.f9014c != null) {
            this.f9014c = null;
        }
        this.f9015d = 0;
    }

    public String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(l.p()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC0014a interfaceC0014a, FormError formError) {
        b("Failed to request consent info with error: " + formError.getMessage());
        interfaceC0014a.onFlowLoadFailed(a(formError, "Consent info update failed"));
    }

    private boolean c(String str) {
        if (!this.f9012a.c(z4.h7).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.f9012a.a(z4.f10155g7);
        return num.intValue() < 0 || this.f9015d < num.intValue();
    }

    public void a(Activity activity, m0 m0Var, InterfaceC0014a interfaceC0014a) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (q7.c(this.f9012a) && m0Var.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.f9012a.p0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new ac.a(this, activity, interfaceC0014a, 4), new b(this, interfaceC0014a));
    }

    public void b(Activity activity, final m0 m0Var, final InterfaceC0014a interfaceC0014a) {
        if (this.f9014c == null) {
            b("Failed to show - not ready yet");
            interfaceC0014a.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.f9014c.show(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.applovin.impl.privacy.cmp.c
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(FormError formError) {
                    this.f9018a.a(m0Var, interfaceC0014a, formError);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(FormError formError, m0 m0Var, InterfaceC0014a interfaceC0014a) {
        a("Retrying to load and show consent form...");
        this.f9015d++;
        UserMessagingPlatform.loadConsentForm(l.p(), new n9(this, interfaceC0014a, formError, m0Var), new ac.a(this, interfaceC0014a, formError, 5));
    }

    private void b(String str) {
        if (p.a()) {
            this.f9013b.b("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, InterfaceC0014a interfaceC0014a) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean zIsConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + zIsConsentFormAvailable);
        if (!zIsConsentFormAvailable) {
            b("Failed to load form.");
            interfaceC0014a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
        } else if (consentStatus != 2) {
            b(d.e(consentStatus, "Failed to load with consent status: "));
            interfaceC0014a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, d.e(consentStatus, "Consent form not required for consent status: ")));
        } else {
            a("Successfully requested consent info");
            a("Loading consent form...");
            UserMessagingPlatform.loadConsentForm(activity, new b(this, interfaceC0014a), new b(this, interfaceC0014a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0014a interfaceC0014a, ConsentForm consentForm) {
        a("Successfully loaded consent form");
        this.f9014c = consentForm;
        interfaceC0014a.onFlowLoaded(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0014a interfaceC0014a, FormError formError) {
        b("Failed to load with error: " + formError.getMessage());
        interfaceC0014a.onFlowLoadFailed(a(formError, "Consent form load failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m0 m0Var, InterfaceC0014a interfaceC0014a, FormError formError) {
        if (formError != null) {
            String strValueOf = String.valueOf(formError.getErrorCode());
            String message = formError.getMessage();
            HashMap map = new HashMap(2);
            map.put("error_code", strValueOf);
            map.put("error_message", message);
            this.f9012a.E().a(f2.W0, "googleConsentFormDismissed", map);
            if (c(strValueOf)) {
                a(e.n("Consent form was dismissed due to error: ", message));
                AppLovinSdkUtils.runOnUiThread(new r(this, formError, m0Var, interfaceC0014a, 9));
                return;
            } else {
                b(e.n("Failed to show with error: ", message));
                interfaceC0014a.onFlowShowFailed(a(formError, "Consent form show failed"));
                return;
            }
        }
        a("Consent form finished showing");
        interfaceC0014a.onFlowHidden(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0014a interfaceC0014a, FormError formError, m0 m0Var, ConsentForm consentForm) {
        a("Successfully re-loaded consent form");
        this.f9014c = consentForm;
        Activity activityW0 = this.f9012a.w0();
        if (activityW0 == null) {
            interfaceC0014a.onFlowShowFailed(a(formError, "Consent form show failed"));
        } else {
            b(activityW0, m0Var, interfaceC0014a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0014a interfaceC0014a, FormError formError, FormError formError2) {
        b("Retry to load failed with error: " + formError2.getMessage());
        interfaceC0014a.onFlowShowFailed(a(formError, "Consent form show failed"));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    private CmpErrorImpl a(FormError formError, String str) {
        AppLovinCmpError.Code code = AppLovinCmpError.Code.UNSPECIFIED;
        int errorCode = formError.getErrorCode();
        if (errorCode == 1 || errorCode == 2) {
            code = AppLovinCmpError.Code.FORM_UNAVAILABLE;
        } else if (errorCode == 3) {
            code = AppLovinCmpError.Code.INTEGRATION_ERROR;
        } else if (errorCode == 4) {
            code = AppLovinCmpError.Code.FORM_UNAVAILABLE;
        }
        return new CmpErrorImpl(code, str, formError.getErrorCode(), formError.getMessage());
    }

    private void a(String str) {
        if (p.a()) {
            this.f9013b.a("GoogleCmpAdapter", str);
        }
    }
}
