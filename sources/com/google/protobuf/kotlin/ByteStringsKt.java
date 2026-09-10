package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0015\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\n\u001a\n\u0010\t\u001a\u00020\u0002*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\u0002*\u00020\r¨\u0006\u000e"}, d2 = {"get", "", "Lcom/google/protobuf/ByteString;", "index", "", "isNotEmpty", "", "plus", "other", "toByteString", "Ljava/nio/ByteBuffer;", "", "toByteStringUtf8", "", "java_kotlin-bytestring_lib"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ByteStringsKt {
    public static final byte get(ByteString byteString, int i10) {
        n.f(byteString, "<this>");
        return byteString.byteAt(i10);
    }

    public static final boolean isNotEmpty(ByteString byteString) {
        n.f(byteString, "<this>");
        return !byteString.isEmpty();
    }

    public static final ByteString plus(ByteString byteString, ByteString other) {
        n.f(byteString, "<this>");
        n.f(other, "other");
        ByteString byteStringConcat = byteString.concat(other);
        n.e(byteStringConcat, "concat(other)");
        return byteStringConcat;
    }

    public static final ByteString toByteString(byte[] bArr) {
        n.f(bArr, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bArr);
        n.e(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }

    public static final ByteString toByteStringUtf8(String str) {
        n.f(str, "<this>");
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(str);
        n.e(byteStringCopyFromUtf8, "copyFromUtf8(this)");
        return byteStringCopyFromUtf8;
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        n.f(byteBuffer, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(byteBuffer);
        n.e(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }
}
