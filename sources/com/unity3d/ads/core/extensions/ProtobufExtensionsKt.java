package com.unity3d.ads.core.extensions;

import an.a;
import android.util.Base64;
import com.google.protobuf.ByteString;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\t\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u000b\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"URL_SAFE_AND_NO_WRAP", "", "fromBase64", "Lcom/google/protobuf/ByteString;", "", "urlSafe", "", "toBase64", "toByteString", "Ljava/util/UUID;", "toISO8859ByteString", "toISO8859String", "toUUID", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    public static final ByteString fromBase64(String str, boolean z10) {
        n.f(str, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(Base64.decode(str, z10 ? 10 : 2));
        n.e(byteStringCopyFrom, "copyFrom(android.util.Base64.decode(this, flag))");
        return byteStringCopyFrom;
    }

    public static /* synthetic */ ByteString fromBase64$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return fromBase64(str, z10);
    }

    public static final String toBase64(ByteString byteString, boolean z10) {
        n.f(byteString, "<this>");
        String strEncodeToString = Base64.encodeToString(byteString.toByteArray(), z10 ? 10 : 2);
        n.e(strEncodeToString, "encodeToString(this.toByteArray(), flag)");
        return strEncodeToString;
    }

    public static /* synthetic */ String toBase64$default(ByteString byteString, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toBase64(byteString, z10);
    }

    public static final ByteString toByteString(UUID uuid) {
        n.f(uuid, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        n.e(byteStringCopyFrom, "copyFrom(bytes.array())");
        return byteStringCopyFrom;
    }

    public static final ByteString toISO8859ByteString(String str) {
        n.f(str, "<this>");
        byte[] bytes = str.getBytes(a.f3769b);
        n.e(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bytes);
        n.e(byteStringCopyFrom, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return byteStringCopyFrom;
    }

    public static final String toISO8859String(ByteString byteString) {
        n.f(byteString, "<this>");
        String string = byteString.toString(a.f3769b);
        n.e(string, "this.toString(Charsets.ISO_8859_1)");
        return string;
    }

    public static final UUID toUUID(ByteString byteString) {
        n.f(byteString, "<this>");
        ByteBuffer byteBufferAsReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        n.e(byteBufferAsReadOnlyByteBuffer, "this.asReadOnlyByteBuffer()");
        if (byteBufferAsReadOnlyByteBuffer.remaining() == 36) {
            UUID uuidFromString = UUID.fromString(byteString.toStringUtf8());
            n.e(uuidFromString, "fromString(uuidString)");
            return uuidFromString;
        }
        if (byteBufferAsReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(byteBufferAsReadOnlyByteBuffer.getLong(), byteBufferAsReadOnlyByteBuffer.getLong());
        }
        throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
    }
}
