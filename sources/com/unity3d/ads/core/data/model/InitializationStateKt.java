package com.unity3d.ads.core.data.model;

import aa.b;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"toBold", "Lcom/unity3d/ads/core/data/model/InitializationState;", "Lcom/unity3d/services/core/properties/SdkProperties$InitializationState;", "toLegacy", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InitializationStateKt {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SdkProperties.InitializationState.values().length];
            try {
                iArr2[SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final InitializationState toBold(SdkProperties.InitializationState initializationState) {
        n.f(initializationState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[initializationState.ordinal()];
        if (i10 == 1) {
            return InitializationState.NOT_INITIALIZED;
        }
        if (i10 == 2) {
            return InitializationState.INITIALIZING;
        }
        if (i10 == 3) {
            return InitializationState.INITIALIZED;
        }
        if (i10 == 4) {
            return InitializationState.FAILED;
        }
        throw new b((byte) 0, 20);
    }

    public static final SdkProperties.InitializationState toLegacy(InitializationState initializationState) {
        n.f(initializationState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
        if (i10 == 1) {
            return SdkProperties.InitializationState.NOT_INITIALIZED;
        }
        if (i10 == 2) {
            return SdkProperties.InitializationState.INITIALIZING;
        }
        if (i10 == 3) {
            return SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY;
        }
        if (i10 == 4) {
            return SdkProperties.InitializationState.INITIALIZED_FAILED;
        }
        throw new b((byte) 0, 20);
    }
}
