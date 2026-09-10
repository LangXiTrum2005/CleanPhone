package com.chartboost.heliumsdk.domain;

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
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB3\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J!\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,HÇ\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R&\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006/"}, d2 = {"Lcom/chartboost/heliumsdk/domain/BidsExt;", "", "seen1", "", "responseTimeMillis", "Lkotlinx/serialization/json/JsonElement;", "ilrd", BidsExt.ERRORS_KEY, "rewardedCallbackData", "Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/json/JsonElement;Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;)V", "getErrors$annotations", "()V", "getErrors", "()Lkotlinx/serialization/json/JsonElement;", "getIlrd$annotations", "getIlrd", "getResponseTimeMillis$annotations", "getResponseTimeMillis", "getRewardedCallbackData$annotations", "getRewardedCallbackData", "()Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;", "setRewardedCallbackData", "(Lcom/chartboost/heliumsdk/domain/RewardedCallbackData;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class BidsExt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ERRORS_KEY = "errors";
    private static final String ILRD_KEY = "ilrd";
    private static final String RESPONSE_TIME_MILLIS_KEY = "responsetimemillis";
    private static final String REWARDED_CALLBACK_KEY = "rewarded_callback";
    private final JsonElement errors;
    private final JsonElement ilrd;
    private final JsonElement responseTimeMillis;
    private RewardedCallbackData rewardedCallbackData;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/chartboost/heliumsdk/domain/BidsExt$Companion;", "", "()V", "ERRORS_KEY", "", "ILRD_KEY", "RESPONSE_TIME_MILLIS_KEY", "REWARDED_CALLBACK_KEY", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/BidsExt;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidsExt> serializer() {
            return BidsExt$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidsExt(int i2, @SerialName(RESPONSE_TIME_MILLIS_KEY) JsonElement jsonElement, @SerialName("ilrd") JsonElement jsonElement2, @SerialName(ERRORS_KEY) JsonElement jsonElement3, @SerialName(REWARDED_CALLBACK_KEY) RewardedCallbackData rewardedCallbackData, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 1, BidsExt$$serializer.INSTANCE.getDescriptor());
        }
        this.responseTimeMillis = jsonElement;
        if ((i2 & 2) == 0) {
            this.ilrd = null;
        } else {
            this.ilrd = jsonElement2;
        }
        if ((i2 & 4) == 0) {
            this.errors = null;
        } else {
            this.errors = jsonElement3;
        }
        if ((i2 & 8) == 0) {
            this.rewardedCallbackData = null;
        } else {
            this.rewardedCallbackData = rewardedCallbackData;
        }
    }

    public static /* synthetic */ BidsExt copy$default(BidsExt bidsExt, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, RewardedCallbackData rewardedCallbackData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jsonElement = bidsExt.responseTimeMillis;
        }
        if ((i2 & 2) != 0) {
            jsonElement2 = bidsExt.ilrd;
        }
        if ((i2 & 4) != 0) {
            jsonElement3 = bidsExt.errors;
        }
        if ((i2 & 8) != 0) {
            rewardedCallbackData = bidsExt.rewardedCallbackData;
        }
        return bidsExt.copy(jsonElement, jsonElement2, jsonElement3, rewardedCallbackData);
    }

    @SerialName(ERRORS_KEY)
    public static /* synthetic */ void getErrors$annotations() {
    }

    @SerialName("ilrd")
    public static /* synthetic */ void getIlrd$annotations() {
    }

    @SerialName(RESPONSE_TIME_MILLIS_KEY)
    public static /* synthetic */ void getResponseTimeMillis$annotations() {
    }

    @SerialName(REWARDED_CALLBACK_KEY)
    public static /* synthetic */ void getRewardedCallbackData$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidsExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, jsonElementSerializer, self.responseTimeMillis);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ilrd != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, jsonElementSerializer, self.ilrd);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.errors != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, jsonElementSerializer, self.errors);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.rewardedCallbackData == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, RewardedCallbackData$$serializer.INSTANCE, self.rewardedCallbackData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonElement getResponseTimeMillis() {
        return this.responseTimeMillis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonElement getIlrd() {
        return this.ilrd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JsonElement getErrors() {
        return this.errors;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RewardedCallbackData getRewardedCallbackData() {
        return this.rewardedCallbackData;
    }

    public final BidsExt copy(JsonElement responseTimeMillis, JsonElement ilrd, JsonElement errors, RewardedCallbackData rewardedCallbackData) {
        return new BidsExt(responseTimeMillis, ilrd, errors, rewardedCallbackData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidsExt)) {
            return false;
        }
        BidsExt bidsExt = (BidsExt) other;
        return Intrinsics.a(this.responseTimeMillis, bidsExt.responseTimeMillis) && Intrinsics.a(this.ilrd, bidsExt.ilrd) && Intrinsics.a(this.errors, bidsExt.errors) && Intrinsics.a(this.rewardedCallbackData, bidsExt.rewardedCallbackData);
    }

    public final JsonElement getErrors() {
        return this.errors;
    }

    public final JsonElement getIlrd() {
        return this.ilrd;
    }

    public final JsonElement getResponseTimeMillis() {
        return this.responseTimeMillis;
    }

    public final RewardedCallbackData getRewardedCallbackData() {
        return this.rewardedCallbackData;
    }

    public int hashCode() {
        JsonElement jsonElement = this.responseTimeMillis;
        int iHashCode = (jsonElement == null ? 0 : jsonElement.hashCode()) * 31;
        JsonElement jsonElement2 = this.ilrd;
        int iHashCode2 = (iHashCode + (jsonElement2 == null ? 0 : jsonElement2.hashCode())) * 31;
        JsonElement jsonElement3 = this.errors;
        int iHashCode3 = (iHashCode2 + (jsonElement3 == null ? 0 : jsonElement3.hashCode())) * 31;
        RewardedCallbackData rewardedCallbackData = this.rewardedCallbackData;
        return iHashCode3 + (rewardedCallbackData != null ? rewardedCallbackData.hashCode() : 0);
    }

    public final void setRewardedCallbackData(RewardedCallbackData rewardedCallbackData) {
        this.rewardedCallbackData = rewardedCallbackData;
    }

    public String toString() {
        return "BidsExt(responseTimeMillis=" + this.responseTimeMillis + ", ilrd=" + this.ilrd + ", errors=" + this.errors + ", rewardedCallbackData=" + this.rewardedCallbackData + ')';
    }

    public BidsExt(JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, RewardedCallbackData rewardedCallbackData) {
        this.responseTimeMillis = jsonElement;
        this.ilrd = jsonElement2;
        this.errors = jsonElement3;
        this.rewardedCallbackData = rewardedCallbackData;
    }

    public /* synthetic */ BidsExt(JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, RewardedCallbackData rewardedCallbackData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonElement, (i2 & 2) != 0 ? null : jsonElement2, (i2 & 4) != 0 ? null : jsonElement3, (i2 & 8) != 0 ? null : rewardedCallbackData);
    }
}
