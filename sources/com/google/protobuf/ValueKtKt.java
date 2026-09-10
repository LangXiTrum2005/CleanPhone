package com.google.protobuf;

import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/ValueKt$Dsl;", "Lwj/r;", "block", "Lcom/google/protobuf/Value;", "-initializevalue", "(Ljk/b;)Lcom/google/protobuf/Value;", X3.i.X, "copy", "(Lcom/google/protobuf/Value;Ljk/b;)Lcom/google/protobuf/Value;", "Lcom/google/protobuf/ValueOrBuilder;", "Lcom/google/protobuf/Struct;", "getStructValueOrNull", "(Lcom/google/protobuf/ValueOrBuilder;)Lcom/google/protobuf/Struct;", "structValueOrNull", "Lcom/google/protobuf/ListValue;", "getListValueOrNull", "(Lcom/google/protobuf/ValueOrBuilder;)Lcom/google/protobuf/ListValue;", "listValueOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ValueKtKt {
    /* JADX INFO: renamed from: -initializevalue, reason: not valid java name */
    public static final Value m197initializevalue(jk.b block) {
        kotlin.jvm.internal.n.f(block, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.INSTANCE;
        Value.Builder builderNewBuilder = Value.newBuilder();
        kotlin.jvm.internal.n.e(builderNewBuilder, "newBuilder()");
        ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Value copy(Value value, jk.b block) {
        kotlin.jvm.internal.n.f(value, "<this>");
        kotlin.jvm.internal.n.f(block, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.INSTANCE;
        Value.Builder builder = value.toBuilder();
        kotlin.jvm.internal.n.e(builder, "this.toBuilder()");
        ValueKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ListValue getListValueOrNull(ValueOrBuilder valueOrBuilder) {
        kotlin.jvm.internal.n.f(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasListValue()) {
            return valueOrBuilder.getListValue();
        }
        return null;
    }

    public static final Struct getStructValueOrNull(ValueOrBuilder valueOrBuilder) {
        kotlin.jvm.internal.n.f(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasStructValue()) {
            return valueOrBuilder.getStructValue();
        }
        return null;
    }
}
