package com.applovin.impl.privacy.cmp;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ConsentInformation.OnConsentInfoUpdateFailureListener, UserMessagingPlatform.OnConsentFormLoadSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f9016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC0014a f9017b;

    public /* synthetic */ b(a aVar, a.InterfaceC0014a interfaceC0014a) {
        this.f9016a = aVar;
        this.f9017b = interfaceC0014a;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        this.f9016a.a(this.f9017b, formError);
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        this.f9016a.a(this.f9017b, consentForm);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        this.f9016a.b(this.f9017b, formError);
    }
}
