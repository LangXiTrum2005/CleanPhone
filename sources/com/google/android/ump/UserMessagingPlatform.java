package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.b3;
import com.google.android.gms.internal.consent_sdk.c0;
import com.google.android.gms.internal.consent_sdk.d;
import com.google.android.gms.internal.consent_sdk.e2;
import com.google.android.gms.internal.consent_sdk.g6;
import com.google.android.gms.internal.consent_sdk.h0;
import com.google.android.gms.internal.consent_sdk.j;
import com.google.android.gms.internal.consent_sdk.j7;
import com.google.android.gms.internal.consent_sdk.m7;
import com.google.android.gms.internal.consent_sdk.n7;
import com.google.android.gms.internal.consent_sdk.p;
import com.google.android.gms.internal.consent_sdk.q;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class UserMessagingPlatform {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface OnConsentFormLoadFailureListener {
        void onConsentFormLoadFailure(@RecentlyNonNull FormError formError);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface OnConsentFormLoadSuccessListener {
        void onConsentFormLoadSuccess(@RecentlyNonNull ConsentForm consentForm);
    }

    @RecentlyNonNull
    public static ConsentInformation getConsentInformation(@RecentlyNonNull Context context) {
        return (b3) ((j7) d.v(context).f22988h).zzb();
    }

    public static void loadAndShowConsentFormIfRequired(@RecentlyNonNull Activity activity, @RecentlyNonNull ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        d dVarV = d.v(activity);
        if (((b3) ((j7) dVarV.f22988h).zzb()).canRequestAds()) {
            onConsentFormDismissedListener.onConsentFormDismissed(null);
            return;
        }
        ((Queue) ((c0) ((j7) dVarV.f22987g).zzb()).f22973i.get()).add(Long.valueOf(System.currentTimeMillis()));
        q qVar = (q) ((j7) dVarV.f22985e).zzb();
        h0.a();
        p pVar = new p(activity, onConsentFormDismissedListener);
        Objects.requireNonNull(onConsentFormDismissedListener);
        qVar.a(pVar, new g6(onConsentFormDismissedListener, 2), true);
    }

    public static void loadConsentForm(@RecentlyNonNull Context context, @RecentlyNonNull OnConsentFormLoadSuccessListener onConsentFormLoadSuccessListener, @RecentlyNonNull OnConsentFormLoadFailureListener onConsentFormLoadFailureListener) {
        d dVarV = d.v(context);
        ((Queue) ((c0) ((j7) dVarV.f22987g).zzb()).f22971g.get()).add(Long.valueOf(System.currentTimeMillis()));
        ((q) ((j7) dVarV.f22985e).zzb()).a(onConsentFormLoadSuccessListener, onConsentFormLoadFailureListener, false);
    }

    public static void showPrivacyOptionsForm(@RecentlyNonNull Activity activity, @RecentlyNonNull final ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        boolean z10;
        boolean z11;
        q qVar = (q) ((j7) d.v(activity).f22985e).zzb();
        qVar.getClass();
        h0.a();
        b3 b3Var = (b3) ((j7) d.v(activity).f22988h).zzb();
        if (b3Var == null) {
            final int i10 = 0;
            h0.f23034a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.o
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            onConsentFormDismissedListener.onConsentFormDismissed(new p1(1, "No consentInformation.").d());
                            break;
                        case 1:
                            onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "No valid response received yet.").d());
                            break;
                        case 2:
                            onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "Privacy options form is not required.").d());
                            break;
                        default:
                            onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "Privacy options form is being loading. Please try again later.").d());
                            break;
                    }
                }
            });
            return;
        }
        if (b3Var.isConsentFormAvailable() || b3Var.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
            if (b3Var.getPrivacyOptionsRequirementStatus() == ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED) {
                final int i11 = 2;
                h0.f23034a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                onConsentFormDismissedListener.onConsentFormDismissed(new p1(1, "No consentInformation.").d());
                                break;
                            case 1:
                                onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "No valid response received yet.").d());
                                break;
                            case 2:
                                onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "Privacy options form is not required.").d());
                                break;
                            default:
                                onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "Privacy options form is being loading. Please try again later.").d());
                                break;
                        }
                    }
                });
                return;
            }
            ConsentForm consentForm = (ConsentForm) qVar.f23168d.get();
            if (consentForm == null) {
                final int i12 = 3;
                h0.f23034a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                onConsentFormDismissedListener.onConsentFormDismissed(new p1(1, "No consentInformation.").d());
                                break;
                            case 1:
                                onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "No valid response received yet.").d());
                                break;
                            case 2:
                                onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "Privacy options form is not required.").d());
                                break;
                            default:
                                onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "Privacy options form is being loading. Please try again later.").d());
                                break;
                        }
                    }
                });
                return;
            } else {
                consentForm.show(activity, onConsentFormDismissedListener);
                qVar.f23166b.execute(new j(qVar, 1));
                return;
            }
        }
        final int i13 = 1;
        h0.f23034a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.o
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        onConsentFormDismissedListener.onConsentFormDismissed(new p1(1, "No consentInformation.").d());
                        break;
                    case 1:
                        onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "No valid response received yet.").d());
                        break;
                    case 2:
                        onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "Privacy options form is not required.").d());
                        break;
                    default:
                        onConsentFormDismissedListener.onConsentFormDismissed(new p1(3, "Privacy options form is being loading. Please try again later.").d());
                        break;
                }
            }
        });
        if (b3Var.a()) {
            synchronized (b3Var.f22948e) {
                z11 = b3Var.f22951h;
            }
            if (!z11) {
                synchronized (b3Var.f22948e) {
                    b3Var.f22951h = true;
                }
                n7 n7Var = b3Var.f22945b;
                ConsentRequestParameters consentRequestParameters = b3Var.f22952i;
                e2 e2Var = new e2(b3Var);
                e2 e2Var2 = new e2(b3Var);
                n7Var.getClass();
                n7Var.f23119c.execute(new m7(n7Var, activity, consentRequestParameters, e2Var, e2Var2, 0));
                return;
            }
        }
        boolean zA = b3Var.a();
        synchronized (b3Var.f22948e) {
            z10 = b3Var.f22951h;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zA + ", retryRequestIsInProgress=" + z10);
    }
}
