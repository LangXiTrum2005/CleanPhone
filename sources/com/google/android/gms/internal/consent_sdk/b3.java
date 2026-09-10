package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import java.util.HashSet;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 implements ConsentInformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f22944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n7 f22945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f22946c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f22949f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f22947d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f22948e = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22950g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22951h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ConsentRequestParameters f22952i = new ConsentRequestParameters.Builder().build();

    public b3(h hVar, n7 n7Var, q qVar, c0 c0Var) {
        this.f22944a = hVar;
        this.f22945b = n7Var;
        this.f22946c = qVar;
        this.f22949f = c0Var;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f22947d) {
            z10 = this.f22950g;
        }
        return z10;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean canRequestAds() {
        h hVar = this.f22944a;
        if (!hVar.f23032b.getBoolean("is_pub_misconfigured", false)) {
            int i10 = !a() ? 0 : hVar.f23032b.getInt("consent_status", 0);
            if (i10 != 1 && i10 != 3) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final int getConsentStatus() {
        if (a()) {
            return this.f22944a.f23032b.getInt("consent_status", 0);
        }
        return 0;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus() {
        if (!a()) {
            return ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;
        }
        h hVar = this.f22944a;
        hVar.getClass();
        return ConsentInformation.PrivacyOptionsRequirementStatus.valueOf(hVar.f23032b.getString("privacy_options_requirement_status", ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN.name()));
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean isConsentFormAvailable() {
        return this.f22946c.f23167c.get() != null;
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void requestConsentInfoUpdate(Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        synchronized (this.f22947d) {
            this.f22950g = true;
        }
        this.f22952i = consentRequestParameters;
        ((Queue) this.f22949f.f22970f.get()).add(Long.valueOf(System.currentTimeMillis()));
        n7 n7Var = this.f22945b;
        n7Var.getClass();
        n7Var.f23119c.execute(new m7(n7Var, activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener, 0));
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void reset() {
        this.f22946c.f23167c.set(null);
        h hVar = this.f22944a;
        Application application = hVar.f23031a;
        HashSet hashSet = hVar.f23033c;
        j0.e(application, hashSet);
        hashSet.clear();
        hVar.f23032b.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
        synchronized (this.f22947d) {
            this.f22950g = false;
        }
    }
}
