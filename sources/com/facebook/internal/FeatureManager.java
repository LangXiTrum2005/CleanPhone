package com.facebook.internal;

import android.R;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/FeatureManager;", "", "Callback", "Feature", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FeatureManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FeatureManager f16285b = new FeatureManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f16284a = new HashMap();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FeatureManager$Callback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        void a(boolean z2);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/FeatureManager$Feature;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum Feature {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        /* JADX INFO: Fake field, exist only in values array */
        Login(16777216),
        ChromeCustomTabsPrefetching(R.attr.theme),
        IgnoreAppSwitchToLoggedOut(R.id.background),
        BypassAppSwitch(R.style.Animation),
        /* JADX INFO: Fake field, exist only in values array */
        Share(33554432),
        /* JADX INFO: Fake field, exist only in values array */
        Places(50331648);

        public final int X;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/FeatureManager$Feature$Companion;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public static Feature a(int i2) {
                for (Feature feature : Feature.values()) {
                    if (feature.X == i2) {
                        return feature;
                    }
                }
                return Feature.Unknown;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1})
        public final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Feature.values().length];
                iArr[1] = 1;
                iArr[2] = 2;
                iArr[3] = 3;
                iArr[4] = 4;
                iArr[15] = 5;
                iArr[16] = 6;
                iArr[17] = 7;
                iArr[18] = 8;
                iArr[19] = 9;
                iArr[20] = 10;
                iArr[5] = 11;
                iArr[6] = 12;
                iArr[7] = 13;
                iArr[8] = 14;
                iArr[9] = 15;
                iArr[10] = 16;
                iArr[11] = 17;
                iArr[12] = 18;
                iArr[13] = 19;
                iArr[14] = 20;
                iArr[21] = 21;
                iArr[22] = 22;
                iArr[23] = 23;
                iArr[24] = 24;
                iArr[25] = 25;
                iArr[26] = 26;
                iArr[27] = 27;
            }
        }

        Feature(int i2) {
            this.X = i2;
        }

        @Override // java.lang.Enum
        public final String toString() {
            switch (ordinal()) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "AAM";
                case 6:
                    return "PrivacyProtection";
                case 7:
                    return "SuggestedEvents";
                case 8:
                    return "IntelligentIntegrity";
                case 9:
                    return "ModelRequest";
                case 10:
                    return "EventDeactivation";
                case 11:
                    return "OnDeviceEventProcessing";
                case 12:
                    return "OnDevicePostInstallEventProcessing";
                case 13:
                    return "IAPLogging";
                case 14:
                    return "IAPLoggingLib2";
                case 15:
                    return "Instrument";
                case 16:
                    return "CrashReport";
                case 17:
                    return "CrashShield";
                case 18:
                    return "ThreadCheck";
                case 19:
                    return "ErrorReport";
                case 20:
                    return "AnrReport";
                case 21:
                    return "Monitoring";
                case 22:
                    return "LoginKit";
                case 23:
                    return "ChromeCustomTabsPrefetching";
                case 24:
                    return "IgnoreAppSwitchToLoggedOut";
                case 25:
                    return "BypassAppSwitch";
                case 26:
                    return "ShareKit";
                case 27:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Feature.values().length];
            iArr[4] = 1;
            iArr[15] = 2;
            iArr[16] = 3;
            iArr[17] = 4;
            iArr[18] = 5;
            iArr[19] = 6;
            iArr[20] = 7;
            iArr[5] = 8;
            iArr[6] = 9;
            iArr[7] = 10;
            iArr[8] = 11;
            iArr[9] = 12;
            iArr[10] = 13;
            iArr[11] = 14;
            iArr[12] = 15;
            iArr[13] = 16;
            iArr[14] = 17;
            iArr[23] = 18;
            iArr[21] = 19;
            iArr[24] = 20;
            iArr[25] = 21;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.internal.FeatureManager$checkFeature$1] */
    public static final void a(final Callback callback, final Feature feature) {
        Intrinsics.f(feature, "feature");
        Intrinsics.f(callback, "callback");
        FetchedAppGateKeepersManager.c(new FetchedAppGateKeepersManager.Callback() { // from class: com.facebook.internal.FeatureManager$checkFeature$1
            @Override // com.facebook.internal.FetchedAppGateKeepersManager.Callback
            public final void a() {
                callback.a(FeatureManager.b(feature));
            }
        });
    }

    public static final boolean b(Feature feature) {
        Feature featureA;
        boolean z2;
        Intrinsics.f(feature, "feature");
        boolean z3 = false;
        if (Feature.Unknown != feature) {
            if (Feature.Core != feature) {
                String string = FacebookSdk.b().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + feature, null);
                if (string == null || !string.equals("12.1.0")) {
                    int i2 = feature.X;
                    if ((i2 & 255) > 0) {
                        featureA = Feature.Companion.a(i2 & (-256));
                    } else if ((65280 & i2) > 0) {
                        featureA = Feature.Companion.a(i2 & (-65536));
                    } else {
                        featureA = (16711680 & i2) > 0 ? Feature.Companion.a(i2 & (-16777216)) : Feature.Companion.a(0);
                    }
                    if (featureA == feature) {
                        switch (feature.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 23:
                            case 24:
                            case 25:
                                break;
                            case 22:
                            default:
                                z3 = true;
                                break;
                        }
                        return FetchedAppGateKeepersManager.b("FBSDKFeature" + feature, FacebookSdk.c(), z3);
                    }
                    if (b(featureA)) {
                        switch (feature.ordinal()) {
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 23:
                            case 24:
                            case 25:
                                z2 = false;
                                break;
                            case 22:
                            default:
                                z2 = true;
                                break;
                        }
                        if (FetchedAppGateKeepersManager.b("FBSDKFeature" + feature, FacebookSdk.c(), z2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
