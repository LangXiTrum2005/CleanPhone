package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.domain.Keywords;
import com.chartboost.heliumsdk.domain.serializers.KeywordsSerializer;
import com.chartboost.heliumsdk.utils.Environment;
import com.p004ironsource.d9;
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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002'(B!\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bBQ\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B9\b\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0011J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0018¨\u0006)"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestUserExt;", "", "consentGiven", "", "impressionDepth", "", "keywords", "Lcom/chartboost/heliumsdk/domain/Keywords;", "(Ljava/lang/Boolean;ILcom/chartboost/heliumsdk/domain/Keywords;)V", "seen1", d9.i.f24748b0, "", "sessionDuration", "publisherUserId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IILjava/lang/String;Lcom/chartboost/heliumsdk/domain/Keywords;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;IILjava/lang/String;Lcom/chartboost/heliumsdk/domain/Keywords;)V", "getConsent$annotations", "()V", "getConsent", "()Ljava/lang/String;", "getImpressionDepth$annotations", "getImpressionDepth", "()I", "getKeywords$annotations", "getKeywords", "()Lcom/chartboost/heliumsdk/domain/Keywords;", "getPublisherUserId$annotations", "getPublisherUserId", "getSessionDuration$annotations", "getSessionDuration", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestUserExt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String consent;
    private final int impressionDepth;
    private final Keywords keywords;
    private final String publisherUserId;
    private final int sessionDuration;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestUserExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestUserExt;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestUserExt> serializer() {
            return BidRequestUserExt$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestUserExt(int i2, @SerialName(d9.i.f24748b0) String str, @SerialName("impdepth") int i3, @SerialName("sessionduration") int i4, @SerialName("publisher_user_id") String str2, @SerialName("keywords") Keywords keywords, SerializationConstructorMarker serializationConstructorMarker) {
        if (18 != (i2 & 18)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 18, BidRequestUserExt$$serializer.INSTANCE.getDescriptor());
        }
        String str3 = null;
        if ((i2 & 1) == 0) {
            this.consent = null;
        } else {
            this.consent = str;
        }
        this.impressionDepth = i3;
        if ((i2 & 4) == 0) {
            this.sessionDuration = Environment.INSTANCE.getSessionTimeSeconds();
        } else {
            this.sessionDuration = i4;
        }
        if ((i2 & 8) == 0) {
            String userIdentifier = HeliumSdk.INSTANCE.getUserIdentifier();
            if (userIdentifier != null && userIdentifier.length() > 0) {
                str3 = userIdentifier;
            }
            this.publisherUserId = str3;
        } else {
            this.publisherUserId = str2;
        }
        this.keywords = keywords;
    }

    @SerialName(d9.i.f24748b0)
    public static /* synthetic */ void getConsent$annotations() {
    }

    @SerialName("impdepth")
    public static /* synthetic */ void getImpressionDepth$annotations() {
    }

    @SerialName("keywords")
    public static /* synthetic */ void getKeywords$annotations() {
    }

    @SerialName("publisher_user_id")
    public static /* synthetic */ void getPublisherUserId$annotations() {
    }

    @SerialName("sessionduration")
    public static /* synthetic */ void getSessionDuration$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    @JvmStatic
    public static final void write$Self(BidRequestUserExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.consent != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.consent);
        }
        output.encodeIntElement(serialDesc, 1, self.impressionDepth);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.sessionDuration != Environment.INSTANCE.getSessionTimeSeconds()) {
            output.encodeIntElement(serialDesc, 2, self.sessionDuration);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3)) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.publisherUserId);
        } else {
            String str = self.publisherUserId;
            String userIdentifier = HeliumSdk.INSTANCE.getUserIdentifier();
            String str2 = null;
            if (userIdentifier != null) {
                if (userIdentifier.length() <= 0) {
                    userIdentifier = null;
                }
                str2 = userIdentifier;
            }
            if (!Intrinsics.a(str, str2)) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.publisherUserId);
            }
        }
        output.encodeSerializableElement(serialDesc, 4, KeywordsSerializer.INSTANCE, self.keywords);
    }

    public final String getConsent() {
        return this.consent;
    }

    public final int getImpressionDepth() {
        return this.impressionDepth;
    }

    public final Keywords getKeywords() {
        return this.keywords;
    }

    public final String getPublisherUserId() {
        return this.publisherUserId;
    }

    public final int getSessionDuration() {
        return this.sessionDuration;
    }

    private BidRequestUserExt(String str, int i2, int i3, String str2, Keywords keywords) {
        this.consent = str;
        this.impressionDepth = i2;
        this.sessionDuration = i3;
        this.publisherUserId = str2;
        this.keywords = keywords;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BidRequestUserExt(String str, int i2, int i3, String str2, Keywords keywords, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i4 & 1) != 0 ? null : str;
        i3 = (i4 & 4) != 0 ? Environment.INSTANCE.getSessionTimeSeconds() : i3;
        if ((i4 & 8) != 0 && ((str2 = HeliumSdk.INSTANCE.getUserIdentifier()) == null || str2.length() <= 0)) {
            str2 = null;
        }
        this(str, i2, i3, str2, keywords);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BidRequestUserExt(Boolean bool, int i2, Keywords keywords) {
        this(Intrinsics.a(bool, Boolean.TRUE) ? "1" : null, i2, 0, (String) null, keywords, 12, (DefaultConstructorMarker) null);
        Intrinsics.f(keywords, "keywords");
    }
}
