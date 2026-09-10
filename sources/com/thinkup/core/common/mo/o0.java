package com.thinkup.core.common.mo;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.thinkup.core.api.TUDebuggerConfig;
import com.thinkup.core.common.n.o0n;

/* JADX INFO: loaded from: classes6.dex */
public class o0 {
    private static volatile o0 o;
    private final ConsentInformation m;

    public interface o {
        void o(String str);

        void o(boolean z2);
    }

    private o0(Context context) {
        this.m = UserMessagingPlatform.getConsentInformation(context);
    }

    public static o0 o(Context context) {
        if (o == null) {
            synchronized (o0.class) {
                try {
                    if (o == null) {
                        o = new o0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public final void o(final Activity activity, final o oVar) {
        ConsentRequestParameters consentRequestParametersBuild;
        Context applicationContext = activity.getApplicationContext();
        TUDebuggerConfig tUDebuggerConfigOn0 = o0n.m().on0();
        if (tUDebuggerConfigOn0 != null && !TextUtils.isEmpty(tUDebuggerConfigOn0.getUMPTestDeviceId())) {
            consentRequestParametersBuild = new ConsentRequestParameters.Builder().setConsentDebugSettings(new ConsentDebugSettings.Builder(applicationContext).setDebugGeography(1).addTestDeviceHashedId(tUDebuggerConfigOn0.getUMPTestDeviceId()).build()).build();
        } else {
            consentRequestParametersBuild = new ConsentRequestParameters.Builder().build();
        }
        this.m.requestConsentInfoUpdate(activity, consentRequestParametersBuild, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.thinkup.core.common.mo.o0.1
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                if (!o0.this.m.isConsentFormAvailable()) {
                    oVar.o("UMP Consent failed to load form.");
                } else if (o0.this.m.getConsentStatus() != 2) {
                    oVar.o(false);
                } else {
                    UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.thinkup.core.common.mo.o0.1.1
                        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                        public final void onConsentFormDismissed(FormError formError) {
                            if (formError != null) {
                                oVar.o("UMP Consent failed to show form.");
                            } else {
                                oVar.o(true);
                            }
                        }
                    });
                }
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.thinkup.core.common.mo.o0.2
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                o oVar2 = oVar;
                if (oVar2 != null) {
                    if (formError == null) {
                        oVar2.o("UMP Consent InfoUpdateFailure");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("UMP Consent InfoUpdateFailure,error:");
                    sb.append(formError.getErrorCode());
                    sb.append(",");
                    sb.append(formError.getMessage());
                    oVar2.o(sb.toString() != null ? formError.getMessage() : "");
                }
            }
        });
    }

    public final boolean o() {
        return this.m.canRequestAds();
    }
}
