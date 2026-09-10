package com.google.protobuf.kotlin;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aZ\u0010\b\u001a\u00028\u0002\"\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000\"\u0012\b\u0001\u0010\u0003*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0004*\u00028\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001af\u0010\u000e\u001a\u00020\r\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\b\b\u0002\u0010\u0005*\u00020\u0004*\u00028\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\f\u001a\u00028\u0002H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001aN\u0010\u0012\u001a\u00020\u0011\"\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000\"\u0012\b\u0001\u0010\u0010*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002*\u00028\u00012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessage;", "M", "Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;", "MOrBT", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/google/protobuf/ExtensionLite;", "extension", "get", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "Lcom/google/protobuf/GeneratedMessageLite$ExtendableBuilder;", "B", X3.i.X, "Lwj/r;", "set", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableBuilder;Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V", "MorBT", "", "contains", "(Lcom/google/protobuf/GeneratedMessageLite$ExtendableMessageOrBuilder;Lcom/google/protobuf/ExtensionLite;)Z", "java_kotlin-lite-lite_extensions"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ExtendableMessageLiteExtensionsKt {
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MorBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>> boolean contains(MorBT morbt, ExtensionLite<M, ?> extension) {
        n.f(morbt, "<this>");
        n.f(extension, "extension");
        return morbt.hasExtension(extension);
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MOrBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>, T> T get(MOrBT morbt, ExtensionLite<M, T> extension) {
        n.f(morbt, "<this>");
        n.f(extension, "extension");
        T t10 = (T) morbt.getExtension(extension);
        n.e(t10, "getExtension(extension)");
        return t10;
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, B>, B extends GeneratedMessageLite.ExtendableBuilder<M, B>, T> void set(B b10, ExtensionLite<M, T> extension, T value) {
        n.f(b10, "<this>");
        n.f(extension, "extension");
        n.f(value, "value");
        b10.setExtension(extension, value);
    }
}
