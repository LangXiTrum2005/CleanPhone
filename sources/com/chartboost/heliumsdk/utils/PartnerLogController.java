package com.chartboost.heliumsdk.utils;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.p004ironsource.mediationsdk.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/chartboost/heliumsdk/utils/PartnerLogController;", "", "()V", "Companion", "PartnerAdapterEvents", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartnerLogController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String PRIVACY_TAG = "[Privacy]";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/chartboost/heliumsdk/utils/PartnerLogController$Companion;", "", "()V", "PRIVACY_TAG", "", "log", "", "event", "Lcom/chartboost/heliumsdk/utils/PartnerLogController$PartnerAdapterEvents;", PglCryptUtils.KEY_MESSAGE, "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void log$default(Companion companion, PartnerAdapterEvents partnerAdapterEvents, String str, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            companion.log(partnerAdapterEvents, str);
        }

        public final void log(PartnerAdapterEvents event, String message) {
            Intrinsics.f(event, "event");
            Intrinsics.f(message, "message");
            LogController logController = LogController.INSTANCE;
            if (logController.getLogLevel().getValue() < LogController.LogLevel.DEBUG.getValue()) {
                return;
            }
            Log.d(LogController.TAG, logController.buildLogMsg$Helium_release(logController.getClassAndMethod$Helium_release(5), event.getMessage() + ". " + message));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lcom/chartboost/heliumsdk/utils/PartnerLogController$PartnerAdapterEvents;", "", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "SETUP_STARTED", "BIDDER_INFO_FETCH_STARTED", "LOAD_STARTED", "SHOW_STARTED", "INVALIDATE_STARTED", "SETUP_SUCCEEDED", "BIDDER_INFO_FETCH_SUCCEEDED", "LOAD_SUCCEEDED", "SHOW_SUCCEEDED", "INVALIDATE_SUCCEEDED", "SETUP_FAILED", "BIDDER_INFO_FETCH_FAILED", "LOAD_FAILED", "SHOW_FAILED", "INVALIDATE_FAILED", "DID_TRACK_IMPRESSION", "DID_CLICK", "DID_REWARD", "DID_DISMISS", "DID_EXPIRE", "GDPR_UNKNOWN", "GDPR_APPLICABLE", "GDPR_NOT_APPLICABLE", "GDPR_CONSENT_GRANTED", "GDPR_CONSENT_DENIED", "GDPR_CONSENT_UNKNOWN", "CCPA_CONSENT_GRANTED", "CCPA_CONSENT_DENIED", "COPPA_SUBJECT", "COPPA_NOT_SUBJECT", l.f, "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PartnerAdapterEvents {
        SETUP_STARTED("Partner setup started"),
        BIDDER_INFO_FETCH_STARTED("Partner bidder info fetch started"),
        LOAD_STARTED("Partner ad load started"),
        SHOW_STARTED("Partner ad show started"),
        INVALIDATE_STARTED("Partner ad invalidate started"),
        SETUP_SUCCEEDED("Partner setup succeeded"),
        BIDDER_INFO_FETCH_SUCCEEDED("Partner bidder info fetch succeeded"),
        LOAD_SUCCEEDED("Partner ad load succeeded"),
        SHOW_SUCCEEDED("Partner ad show succeeded"),
        INVALIDATE_SUCCEEDED("Partner ad invalidate succeeded"),
        SETUP_FAILED("Partner setup failed"),
        BIDDER_INFO_FETCH_FAILED("Partner bidder info fetch failed"),
        LOAD_FAILED("Partner ad load failed"),
        SHOW_FAILED("Partner ad show failed"),
        INVALIDATE_FAILED("Partner ad invalidate failed"),
        DID_TRACK_IMPRESSION("Partner ad did track impression"),
        DID_CLICK("Partner ad did click"),
        DID_REWARD("Partner ad did reward"),
        DID_DISMISS("Partner ad did dismiss"),
        DID_EXPIRE("Partner ad did expire"),
        GDPR_UNKNOWN("[Privacy] GDPR applicability is unknown"),
        GDPR_APPLICABLE("[Privacy] GDPR is applicable"),
        GDPR_NOT_APPLICABLE("[Privacy] GDPR is not applicable"),
        GDPR_CONSENT_GRANTED("[Privacy] GDPR consent granted"),
        GDPR_CONSENT_DENIED("[Privacy] GDPR consent denied"),
        GDPR_CONSENT_UNKNOWN("[Privacy] GDPR consent unknown"),
        CCPA_CONSENT_GRANTED("[Privacy] CCPA consent granted"),
        CCPA_CONSENT_DENIED("[Privacy] CCPA consent denied"),
        COPPA_SUBJECT("[Privacy] User is subject to COPPA"),
        COPPA_NOT_SUBJECT("[Privacy] User is not subject to COPPA"),
        CUSTOM("");

        private final String message;

        PartnerAdapterEvents(String str) {
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }
}
