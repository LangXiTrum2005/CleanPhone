package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements UserMessagingPlatform.OnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserMessagingPlatform.OnConsentFormLoadSuccessListener f23072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserMessagingPlatform.OnConsentFormLoadFailureListener f23073b;

    public /* synthetic */ l(UserMessagingPlatform.OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        this.f23072a = onConsentFormLoadSuccessListener;
        this.f23073b = onConsentFormLoadFailureListener;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public final void onConsentFormLoadFailure(FormError formError) {
        this.f23073b.onConsentFormLoadFailure(formError);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        this.f23072a.onConsentFormLoadSuccess(consentForm);
    }
}
