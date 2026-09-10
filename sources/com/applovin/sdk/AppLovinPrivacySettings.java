package com.applovin.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.q0;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinPrivacySettings {
    @Nullable
    public static Boolean getAdditionalConsentStatus(int i10) {
        l lVarF = q7.f();
        if (lVarF != null) {
            return lVarF.t0().a(i10);
        }
        p.h("AppLovinPrivacySettings", "Unable to retrieve additional consent status");
        return null;
    }

    @Nullable
    public static Boolean getPurposeConsentStatus(int i10) {
        l lVarF = q7.f();
        if (lVarF != null) {
            return lVarF.t0().b(i10);
        }
        p.h("AppLovinPrivacySettings", "Unable to retrieve purpose consent status");
        return null;
    }

    @Nullable
    public static Boolean getSpecialFeatureOptInStatus(int i10) {
        l lVarF = q7.f();
        if (lVarF != null) {
            return lVarF.t0().c(i10);
        }
        p.h("AppLovinPrivacySettings", "Unable to retrieve special feature opt in status");
        return null;
    }

    @Nullable
    public static Boolean getTcfVendorConsentStatus(int i10) {
        l lVarF = q7.f();
        if (lVarF != null) {
            return lVarF.t0().d(i10);
        }
        p.h("AppLovinPrivacySettings", "Unable to retrieve TCF vendor consent status");
        return null;
    }

    public static boolean hasUserConsent() {
        return hasUserConsent(l.p());
    }

    public static boolean isDoNotSell() {
        return isDoNotSell(l.p());
    }

    public static boolean isDoNotSellSet() {
        return isDoNotSellSet(l.p());
    }

    public static boolean isUserConsentSet() {
        return isUserConsentSet(l.p());
    }

    public static void setDoNotSell(boolean z10) {
        setDoNotSell(z10, l.p());
    }

    public static void setHasUserConsent(boolean z10) {
        setHasUserConsent(z10, l.p());
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean boolB = q0.b().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean boolB = q0.a().b(context);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        return q0.a().b(context) != null;
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        return q0.b().b(context) != null;
    }

    @Deprecated
    public static void setDoNotSell(boolean z10, Context context) {
        p.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (q0.a(z10, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z10));
        }
    }

    @Deprecated
    public static void setHasUserConsent(boolean z10, Context context) {
        p.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (q0.b(z10, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z10), null);
        }
    }
}
