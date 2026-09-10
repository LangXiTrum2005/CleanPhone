package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\"\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\"\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0017\u0010$\u001a\u0004\u0018\u00010!*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0017\u0010&\u001a\u0004\u0018\u00010!*\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010#\"\u0017\u0010(\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0011\"\u0017\u0010,\u001a\u0004\u0018\u00010)*\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/NativeConfigurationKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "-initializenativeConfiguration", "(Ljk/b;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "nativeConfiguration", "copy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;Ljk/b;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "getDiagnosticEventsOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "diagnosticEventsOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "getInitPolicyOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$RequestPolicy;", "initPolicyOrNull", "getAdPolicyOrNull", "adPolicyOrNull", "getOperativeEventPolicyOrNull", "operativeEventPolicyOrNull", "getOtherPolicyOrNull", "otherPolicyOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "getAdOperationsOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$AdOperationsConfiguration;", "adOperationsOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlagsOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "featureFlagsOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "getCachedAssetsConfigurationOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "cachedAssetsConfigurationOrNull", "getCachedWebviewFilesConfigurationOrNull", "cachedWebviewFilesConfigurationOrNull", "getDownloadPolicyOrNull", "downloadPolicyOrNull", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "getDebugSettingsOrNull", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfigurationOrBuilder;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "debugSettingsOrNull", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class NativeConfigurationKtKt {
    /* JADX INFO: renamed from: -initializenativeConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.NativeConfiguration m3304initializenativeConfiguration(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.NativeConfiguration.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.NativeConfiguration copy(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, jk.b block) {
        kotlin.jvm.internal.n.f(nativeConfiguration, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        NativeConfigurationKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperationsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasAdOperations()) {
            return nativeConfigurationOrBuilder.getAdOperations();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getAdPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasAdPolicy()) {
            return nativeConfigurationOrBuilder.getAdPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfigurationOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasCachedAssetsConfiguration()) {
            return nativeConfigurationOrBuilder.getCachedAssetsConfiguration();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfigurationOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasCachedWebviewFilesConfiguration()) {
            return nativeConfigurationOrBuilder.getCachedWebviewFilesConfiguration();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.DebugSettings getDebugSettingsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasDebugSettings()) {
            return nativeConfigurationOrBuilder.getDebugSettings();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEventsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasDiagnosticEvents()) {
            return nativeConfigurationOrBuilder.getDiagnosticEvents();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasDownloadPolicy()) {
            return nativeConfigurationOrBuilder.getDownloadPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.FeatureFlags getFeatureFlagsOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasFeatureFlags()) {
            return nativeConfigurationOrBuilder.getFeatureFlags();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getInitPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasInitPolicy()) {
            return nativeConfigurationOrBuilder.getInitPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasOperativeEventPolicy()) {
            return nativeConfigurationOrBuilder.getOperativeEventPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestPolicy getOtherPolicyOrNull(NativeConfigurationOuterClass.NativeConfigurationOrBuilder nativeConfigurationOrBuilder) {
        kotlin.jvm.internal.n.f(nativeConfigurationOrBuilder, "<this>");
        if (nativeConfigurationOrBuilder.hasOtherPolicy()) {
            return nativeConfigurationOrBuilder.getOtherPolicy();
        }
        return null;
    }
}
