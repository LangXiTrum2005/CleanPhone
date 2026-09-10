package capitulant;

import android.app.Activity;
import android.content.Context;
import artsy.beachfront;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdmobUmpManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcapitulant/wireman;", "", "<init>", "()V", "Landroid/app/Activity;", "context", "", "testDeviceId", "Lartsy/beachfront;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "wireman", "(Landroid/app/Activity;Ljava/lang/String;Lartsy/beachfront;)V", "Landroid/content/Context;", "", "isConsentGranted", "taiyuan", "(Landroid/content/Context;Z)V", "impromptu", "(Z)V", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f15376attabal = new wireman();

    public static final void beachfront(ConsentInformation consentInformation, Activity activity, beachfront beachfrontVar, FormError formError) {
        boolean zCanRequestAds = consentInformation.canRequestAds();
        wireman wiremanVar = f15376attabal;
        Context applicationContext = activity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        wiremanVar.taiyuan(applicationContext, zCanRequestAds);
        wiremanVar.impromptu(zCanRequestAds);
        if (beachfrontVar != null) {
            beachfrontVar.attabal(zCanRequestAds);
        }
    }

    public static final void marial(final Activity activity, final ConsentInformation consentInformation, final beachfront beachfrontVar) {
        UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: capitulant.dern
            @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(FormError formError) {
                wireman.beachfront(consentInformation, activity, beachfrontVar, formError);
            }
        });
    }

    public final void impromptu(boolean isConsentGranted) {
        try {
            AppsFlyerLib.getInstance().setConsentData(AppsFlyerConsent.INSTANCE.forGDPRUser(isConsentGranted, isConsentGranted));
        } catch (Exception unused) {
        }
    }

    public final void taiyuan(Context context, boolean isConsentGranted) {
        try {
            FirebaseAnalytics.ConsentStatus consentStatus = isConsentGranted ? FirebaseAnalytics.ConsentStatus.GRANTED : FirebaseAnalytics.ConsentStatus.DENIED;
            HashMap map = new HashMap();
            map.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus);
            map.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
            map.put(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus);
            map.put(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus);
            FirebaseAnalytics.getInstance(context).saneness(map);
        } catch (Exception unused) {
        }
    }

    public final void wireman(final Activity context, String testDeviceId, final beachfront listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        ConsentDebugSettings.Builder builder = new ConsentDebugSettings.Builder(context.getApplicationContext());
        if (testDeviceId != null && testDeviceId.length() != 0) {
            builder.addTestDeviceHashedId(testDeviceId);
        }
        ConsentRequestParameters consentRequestParametersBuild = new ConsentRequestParameters.Builder().setConsentDebugSettings(builder.build()).build();
        final ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(context.getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(consentInformation, "getConsentInformation(...)");
        consentInformation.requestConsentInfoUpdate(context, consentRequestParametersBuild, new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: capitulant.attabal
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                wireman.marial(context, consentInformation, listener);
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: capitulant.saneness
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                wireman.competently(formError);
            }
        });
    }

    public static final void competently(FormError formError) {
    }
}
