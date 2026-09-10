package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e2 implements ConsentInformation.OnConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b3 f23010a;

    public /* synthetic */ e2(b3 b3Var) {
        this.f23010a = b3Var;
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public void onConsentInfoUpdateFailure(FormError formError) {
        b3 b3Var = this.f23010a;
        synchronized (b3Var.f22948e) {
            b3Var.f22951h = false;
        }
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        b3 b3Var = this.f23010a;
        synchronized (b3Var.f22948e) {
            b3Var.f22951h = false;
        }
    }
}
