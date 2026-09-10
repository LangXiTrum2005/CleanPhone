package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/CachedAssetsConfigurationKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "-initializecachedAssetsConfiguration", "(Ljk/b;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "cachedAssetsConfiguration", "copy", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;Ljk/b;)Lgatewayprotocol/v1/NativeConfigurationOuterClass$CachedAssetsConfiguration;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CachedAssetsConfigurationKtKt {
    /* JADX INFO: renamed from: -initializecachedAssetsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration m3271initializecachedAssetsConfiguration(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        CachedAssetsConfigurationKt.Dsl.Companion companion = CachedAssetsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.CachedAssetsConfiguration.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        CachedAssetsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.CachedAssetsConfiguration copy(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration, jk.b block) {
        kotlin.jvm.internal.n.f(cachedAssetsConfiguration, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        CachedAssetsConfigurationKt.Dsl.Companion companion = CachedAssetsConfigurationKt.Dsl.INSTANCE;
        NativeConfigurationOuterClass.CachedAssetsConfiguration.Builder builder = cachedAssetsConfiguration.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        CachedAssetsConfigurationKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
