package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzhe;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f16529attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public staphylococcal.impromptu f16530saneness;

    public polloi(Context context) {
        try {
            lehua.adultoid.beachfront(context);
            this.f16530saneness = lehua.adultoid.dern().competently(denizen.attabal.f25185competently).attabal("PLAY_BILLING_LIBRARY", zzhe.class, staphylococcal.dern.saneness("proto"), new staphylococcal.competently() { // from class: com.android.billingclient.api.zzci
                @Override // staphylococcal.competently
                public final Object apply(Object obj) {
                    return ((zzhe) obj).zzc();
                }
            });
        } catch (Throwable unused) {
            this.f16529attabal = true;
        }
    }

    public final void attabal(zzhe zzheVar) {
        if (this.f16529attabal) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f16530saneness.attabal(staphylococcal.wireman.beachfront(zzheVar));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingLogger", "logging failed.");
        }
    }
}
