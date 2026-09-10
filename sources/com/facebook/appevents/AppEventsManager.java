package com.facebook.appevents;

import com.applovin.impl.sdk.b0;
import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.cloudbridge.AppEventsCAPIManager;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.gps.pa.PACustomAudienceClient;
import com.facebook.appevents.gps.topics.GpsTopicsManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.integrity.BannedParamManager;
import com.facebook.appevents.integrity.BlocklistEventsManager;
import com.facebook.appevents.integrity.MACARuleMatchingManager;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.integrity.RedactedEventsManager;
import com.facebook.appevents.integrity.SensitiveParamsManager;
import com.facebook.appevents.integrity.StdParamsEnforcementManager;
import com.facebook.appevents.integrity.VVPManager;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import q7.n;
import q7.p;
import q7.r;
import q7.t;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/AppEventsManager;", "", "<init>", "()V", "Lwj/r;", "start", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventsManager {
    public static final AppEventsManager INSTANCE = new AppEventsManager();

    private AppEventsManager() {
    }

    public static final void start() {
        if (v7.a.b(AppEventsManager.class)) {
            return;
        }
        try {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            u uVar = u.f48786a;
            u.f48790e.add(anonymousClass1);
            u.d();
        } catch (Throwable th2) {
            v7.a.a(AppEventsManager.class, th2);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.AppEventsManager$start$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/facebook/appevents/AppEventsManager$start$1", "Lq7/t;", "Lq7/r;", "fetchedAppSettings", "Lwj/r;", "onSuccess", "(Lq7/r;)V", "onError", "()V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AnonymousClass1 implements t {
        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$0(boolean z10) {
            if (z10) {
                MetadataIndexer.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$1(boolean z10) {
            if (z10) {
                RestrictiveDataManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$10(boolean z10) {
            if (z10) {
                RedactedEventsManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$11(boolean z10) {
            if (z10) {
                SensitiveParamsManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$12(boolean z10) {
            if (z10) {
                AppEventsCAPIManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$13(boolean z10) {
            if (z10) {
                GpsAraTriggersManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$14(boolean z10) {
            if (z10) {
                PACustomAudienceClient.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$15(boolean z10) {
            if (z10) {
                GpsTopicsManager.enableTopicsObservation();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$16(boolean z10) {
            if (z10) {
                VVPManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$2(boolean z10) {
            if (z10) {
                ModelManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$3(boolean z10) {
            if (z10) {
                EventDeactivationManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$4(boolean z10) {
            if (z10) {
                BannedParamManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$5(boolean z10) {
            if (z10) {
                InAppPurchaseManager.enableAutoLogging();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$6(boolean z10) {
            if (z10) {
                StdParamsEnforcementManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$7(boolean z10) {
            if (z10) {
                ProtectedModeManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$8(boolean z10) {
            if (z10) {
                MACARuleMatchingManager.enable();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onSuccess$lambda$9(boolean z10) {
            if (z10) {
                BlocklistEventsManager.enable();
            }
        }

        @Override // q7.t
        public void onSuccess(r fetchedAppSettings) {
            p.a(new b0(4), n.AAM);
            p.a(new b0(19), n.RestrictiveDataFiltering);
            p.a(new b0(20), n.PrivacyProtection);
            p.a(new b0(5), n.EventDeactivation);
            p.a(new b0(6), n.BannedParamFiltering);
            p.a(new b0(7), n.IapLogging);
            p.a(new b0(8), n.StdParamEnforcement);
            p.a(new b0(9), n.ProtectedMode);
            p.a(new b0(10), n.MACARuleMatching);
            p.a(new b0(11), n.BlocklistEvents);
            p.a(new b0(12), n.FilterRedactedEvents);
            p.a(new b0(13), n.FilterSensitiveParams);
            p.a(new b0(14), n.CloudBridge);
            p.a(new b0(15), n.GPSARATriggers);
            p.a(new b0(16), n.GPSPACAProcessing);
            p.a(new b0(17), n.GPSTopicsObservation);
            p.a(new b0(18), n.VVP);
        }

        @Override // q7.t
        public void onError() {
        }
    }
}
