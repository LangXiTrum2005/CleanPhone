package com.vungle.ads.internal.network;

import com.p004ironsource.x4;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000234B]\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fBQ\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003JW\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\bHÖ\u0001J!\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202HÇ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u001f¨\u00065"}, d2 = {"Lcom/vungle/ads/internal/network/FailedTpat;", "", "seen1", "", "method", "Lcom/vungle/ads/internal/network/HttpMethod;", "headers", "", "", "body", "retryAttempt", "retryCount", "tpatKey", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/vungle/ads/internal/network/HttpMethod;Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getMethod", "()Lcom/vungle/ads/internal/network/HttpMethod;", "getRetryAttempt", "()I", "setRetryAttempt", "(I)V", "getRetryCount", "setRetryCount", "getTpatKey", "setTpatKey", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final /* data */ class FailedTpat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String body;
    private final Map<String, String> headers;
    private final HttpMethod method;
    private int retryAttempt;
    private int retryCount;
    private String tpatKey;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/network/FailedTpat$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/network/FailedTpat;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FailedTpat> serializer() {
            return FailedTpat$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ FailedTpat(int i2, HttpMethod httpMethod, Map map, String str, int i3, int i4, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i2 & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 16, FailedTpat$$serializer.INSTANCE.getDescriptor());
        }
        this.method = (i2 & 1) == 0 ? HttpMethod.GET : httpMethod;
        if ((i2 & 2) == 0) {
            this.headers = null;
        } else {
            this.headers = map;
        }
        if ((i2 & 4) == 0) {
            this.body = null;
        } else {
            this.body = str;
        }
        if ((i2 & 8) == 0) {
            this.retryAttempt = 0;
        } else {
            this.retryAttempt = i3;
        }
        this.retryCount = i4;
        if ((i2 & 32) == 0) {
            this.tpatKey = null;
        } else {
            this.tpatKey = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FailedTpat copy$default(FailedTpat failedTpat, HttpMethod httpMethod, Map map, String str, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            httpMethod = failedTpat.method;
        }
        if ((i4 & 2) != 0) {
            map = failedTpat.headers;
        }
        if ((i4 & 4) != 0) {
            str = failedTpat.body;
        }
        if ((i4 & 8) != 0) {
            i2 = failedTpat.retryAttempt;
        }
        if ((i4 & 16) != 0) {
            i3 = failedTpat.retryCount;
        }
        if ((i4 & 32) != 0) {
            str2 = failedTpat.tpatKey;
        }
        int i5 = i3;
        String str3 = str2;
        return failedTpat.copy(httpMethod, map, str, i2, i5, str3);
    }

    @JvmStatic
    public static final void write$Self(FailedTpat self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.method != HttpMethod.GET) {
            output.encodeSerializableElement(serialDesc, 0, HttpMethod$$serializer.INSTANCE, self.method);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.headers != null) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 1, new LinkedHashMapSerializer(stringSerializer, stringSerializer), self.headers);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.body != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.body);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.retryAttempt != 0) {
            output.encodeIntElement(serialDesc, 3, self.retryAttempt);
        }
        output.encodeIntElement(serialDesc, 4, self.retryCount);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.tpatKey == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.tpatKey);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HttpMethod getMethod() {
        return this.method;
    }

    public final Map<String, String> component2() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRetryCount() {
        return this.retryCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTpatKey() {
        return this.tpatKey;
    }

    public final FailedTpat copy(HttpMethod method, Map<String, String> headers, String body, int retryAttempt, int retryCount, String tpatKey) {
        Intrinsics.f(method, "method");
        return new FailedTpat(method, headers, body, retryAttempt, retryCount, tpatKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FailedTpat)) {
            return false;
        }
        FailedTpat failedTpat = (FailedTpat) other;
        return this.method == failedTpat.method && Intrinsics.a(this.headers, failedTpat.headers) && Intrinsics.a(this.body, failedTpat.body) && this.retryAttempt == failedTpat.retryAttempt && this.retryCount == failedTpat.retryCount && Intrinsics.a(this.tpatKey, failedTpat.tpatKey);
    }

    public final String getBody() {
        return this.body;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final HttpMethod getMethod() {
        return this.method;
    }

    public final int getRetryAttempt() {
        return this.retryAttempt;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final String getTpatKey() {
        return this.tpatKey;
    }

    public int hashCode() {
        int iHashCode = this.method.hashCode() * 31;
        Map<String, String> map = this.headers;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.body;
        int iA = androidx.media3.extractor.text.ttml.a.a(this.retryCount, androidx.media3.extractor.text.ttml.a.a(this.retryAttempt, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.tpatKey;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setRetryAttempt(int i2) {
        this.retryAttempt = i2;
    }

    public final void setRetryCount(int i2) {
        this.retryCount = i2;
    }

    public final void setTpatKey(String str) {
        this.tpatKey = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FailedTpat(method=");
        sb.append(this.method);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", retryAttempt=");
        sb.append(this.retryAttempt);
        sb.append(", retryCount=");
        sb.append(this.retryCount);
        sb.append(", tpatKey=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.tpatKey, ')');
    }

    public FailedTpat(HttpMethod method, Map<String, String> map, String str, int i2, int i3, String str2) {
        Intrinsics.f(method, "method");
        this.method = method;
        this.headers = map;
        this.body = str;
        this.retryAttempt = i2;
        this.retryCount = i3;
        this.tpatKey = str2;
    }

    public /* synthetic */ FailedTpat(HttpMethod httpMethod, Map map, String str, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? HttpMethod.GET : httpMethod, (i4 & 2) != 0 ? null : map, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? 0 : i2, i3, (i4 & 32) != 0 ? null : str2);
    }
}
