package com.adjust.sdk;

import androidx.core.app.NotificationCompat;
import com.ironsource.Y3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT,
    PURCHASE_VERIFICATION;

    public static ActivityKind fromString(String str) {
        if ("session".equals(str)) {
            return SESSION;
        }
        if (NotificationCompat.CATEGORY_EVENT.equals(str)) {
            return EVENT;
        }
        if ("click".equals(str)) {
            return CLICK;
        }
        if (Y3.f27960c.equals(str)) {
            return ATTRIBUTION;
        }
        if (Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH.equals(str)) {
            return INFO;
        }
        if ("gdpr".equals(str)) {
            return GDPR;
        }
        if ("ad_revenue".equals(str)) {
            return AD_REVENUE;
        }
        if ("subscription".equals(str)) {
            return SUBSCRIPTION;
        }
        if ("third_party_sharing".equals(str)) {
            return THIRD_PARTY_SHARING;
        }
        if ("measurement_consent".equals(str)) {
            return MEASUREMENT_CONSENT;
        }
        return "purchase_verification".equals(str) ? PURCHASE_VERIFICATION : UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (g0.f6846a[ordinal()]) {
            case 1:
                return "session";
            case 2:
                return NotificationCompat.CATEGORY_EVENT;
            case 3:
                return "click";
            case 4:
                return Y3.f27960c;
            case 5:
                return Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH;
            case 6:
                return "gdpr";
            case 7:
                return "ad_revenue";
            case 8:
                return "subscription";
            case 9:
                return "third_party_sharing";
            case 10:
                return "measurement_consent";
            case 11:
                return "purchase_verification";
            default:
                return "unknown";
        }
    }
}
