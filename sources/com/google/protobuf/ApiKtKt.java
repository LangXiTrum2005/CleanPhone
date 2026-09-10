package com.google.protobuf;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/ApiKt$Dsl;", "Lwj/r;", "block", "Lcom/google/protobuf/Api;", "-initializeapi", "(Ljk/b;)Lcom/google/protobuf/Api;", "api", "copy", "(Lcom/google/protobuf/Api;Ljk/b;)Lcom/google/protobuf/Api;", "Lcom/google/protobuf/ApiOrBuilder;", "Lcom/google/protobuf/SourceContext;", "getSourceContextOrNull", "(Lcom/google/protobuf/ApiOrBuilder;)Lcom/google/protobuf/SourceContext;", "sourceContextOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ApiKtKt {
    /* JADX INFO: renamed from: -initializeapi, reason: not valid java name */
    public static final Api m173initializeapi(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.INSTANCE;
        Api.Builder builderNewBuilder = Api.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Api copy(Api api, jk.b block) {
        kotlin.jvm.internal.n.f(api, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.INSTANCE;
        Api.Builder builder = api.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext getSourceContextOrNull(ApiOrBuilder apiOrBuilder) {
        kotlin.jvm.internal.n.f(apiOrBuilder, "<this>");
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
