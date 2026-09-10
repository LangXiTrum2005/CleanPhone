package gatewayprotocol.v1;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lgatewayprotocol/v1/TokenCountersKt$Dsl;", "Lwj/r;", "block", "Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "-initializetokenCounters", "(Ljk/b;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "tokenCounters", "copy", "(Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;Ljk/b;)Lgatewayprotocol/v1/HeaderBiddingTokenOuterClass$TokenCounters;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class TokenCountersKtKt {
    /* JADX INFO: renamed from: -initializetokenCounters, reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.TokenCounters m3322initializetokenCounters(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.INSTANCE;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        TokenCountersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters copy(HeaderBiddingTokenOuterClass.TokenCounters tokenCounters, jk.b block) {
        kotlin.jvm.internal.n.f(tokenCounters, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.INSTANCE;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builder = tokenCounters.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        TokenCountersKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
