package com.chartboost.heliumsdk.domain;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BG\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010¨\u0006+"}, d2 = {"Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;", "", "seen1", "", "url", "", "method", "maxRetries", "body", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getBody$annotations", "()V", "getBody", "()Ljava/lang/String;", "getMaxRetries$annotations", "getMaxRetries", "()I", "getMethod$annotations", "getMethod", "getUrl$annotations", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class RewardedCallbackData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_MAX_RETRIES = 2;
    private static final String REWARDED_CALLBACK_BODY_FIELD_NAME = "body";
    private static final String REWARDED_CALLBACK_MAX_RETRIES_FIELD_NAME = "max_retries";
    private static final String REWARDED_CALLBACK_METHOD_FIELD_NAME = "method";
    private static final String REWARDED_CALLBACK_URL_FIELD_NAME = "url";
    private final String body;
    private final int maxRetries;
    private final String method;
    private final String url;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/chartboost/heliumsdk/domain/RewardedCallbackData$Companion;", "", "()V", "DEFAULT_MAX_RETRIES", "", "REWARDED_CALLBACK_BODY_FIELD_NAME", "", "REWARDED_CALLBACK_MAX_RETRIES_FIELD_NAME", "REWARDED_CALLBACK_METHOD_FIELD_NAME", "REWARDED_CALLBACK_URL_FIELD_NAME", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RewardedCallbackData> serializer() {
            return RewardedCallbackData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ RewardedCallbackData(int i2, @SerialName("url") String str, @SerialName("method") String str2, @SerialName(REWARDED_CALLBACK_MAX_RETRIES_FIELD_NAME) int i3, @SerialName("body") String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i2 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 11, RewardedCallbackData$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.method = str2;
        if ((i2 & 4) == 0) {
            this.maxRetries = 2;
        } else {
            this.maxRetries = i3;
        }
        this.body = str3;
    }

    public static /* synthetic */ RewardedCallbackData copy$default(RewardedCallbackData rewardedCallbackData, String str, String str2, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = rewardedCallbackData.url;
        }
        if ((i3 & 2) != 0) {
            str2 = rewardedCallbackData.method;
        }
        if ((i3 & 4) != 0) {
            i2 = rewardedCallbackData.maxRetries;
        }
        if ((i3 & 8) != 0) {
            str3 = rewardedCallbackData.body;
        }
        return rewardedCallbackData.copy(str, str2, i2, str3);
    }

    @SerialName("body")
    public static /* synthetic */ void getBody$annotations() {
    }

    @SerialName(REWARDED_CALLBACK_MAX_RETRIES_FIELD_NAME)
    public static /* synthetic */ void getMaxRetries$annotations() {
    }

    @SerialName("method")
    public static /* synthetic */ void getMethod$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    @JvmStatic
    public static final void write$Self(RewardedCallbackData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.url);
        output.encodeStringElement(serialDesc, 1, self.method);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.maxRetries != 2) {
            output.encodeIntElement(serialDesc, 2, self.maxRetries);
        }
        output.encodeStringElement(serialDesc, 3, self.body);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxRetries() {
        return this.maxRetries;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final RewardedCallbackData copy(String url, String method, int maxRetries, String body) {
        Intrinsics.f(url, "url");
        Intrinsics.f(method, "method");
        Intrinsics.f(body, "body");
        return new RewardedCallbackData(url, method, maxRetries, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardedCallbackData)) {
            return false;
        }
        RewardedCallbackData rewardedCallbackData = (RewardedCallbackData) other;
        return Intrinsics.a(this.url, rewardedCallbackData.url) && Intrinsics.a(this.method, rewardedCallbackData.method) && this.maxRetries == rewardedCallbackData.maxRetries && Intrinsics.a(this.body, rewardedCallbackData.body);
    }

    public final String getBody() {
        return this.body;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.body.hashCode() + a.a(this.maxRetries, androidx.datastore.preferences.protobuf.a.b(this.method, this.url.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RewardedCallbackData(url=");
        sb.append(this.url);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", maxRetries=");
        sb.append(this.maxRetries);
        sb.append(", body=");
        return a.p(sb, this.body, ')');
    }

    public RewardedCallbackData(String url, String method, int i2, String body) {
        Intrinsics.f(url, "url");
        Intrinsics.f(method, "method");
        Intrinsics.f(body, "body");
        this.url = url;
        this.method = method;
        this.maxRetries = i2;
        this.body = body;
    }

    public /* synthetic */ RewardedCallbackData(String str, String str2, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? 2 : i2, str3);
    }
}
