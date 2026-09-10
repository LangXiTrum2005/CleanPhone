package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.os.Handler;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements UserMessagingPlatform.OnConsentFormLoadSuccessListener, k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23159b;

    public /* synthetic */ p(Object obj, Object obj2) {
        this.f23158a = obj;
        this.f23159b = obj2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t zzb() {
        u uVar = (u) ((j7) this.f23158a).zzb();
        Handler handler = h0.f23034a;
        j0.c(handler);
        return new t(uVar, handler, ((x) this.f23159b).zzb());
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public void onConsentFormLoadSuccess(ConsentForm consentForm) {
        consentForm.show((Activity) this.f23158a, (ConsentForm.OnConsentFormDismissedListener) this.f23159b);
    }
}
