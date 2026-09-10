package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.controllers.PrivacyController;
import com.chartboost.sdk.privacy.model.CCPA;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B/\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bHÇ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestRegsExt;", "", "gdpr", "", "ccpaConsent", "", "(ILjava/lang/Boolean;)V", "seen1", "usPrivacy", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;)V", "getGdpr$annotations", "()V", "getGdpr", "()I", "getUsPrivacy$annotations", "getUsPrivacy", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestRegsExt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int gdpr;
    private final String usPrivacy;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestRegsExt$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestRegsExt;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestRegsExt> serializer() {
            return BidRequestRegsExt$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestRegsExt(int i2, @SerialName("gdpr") int i3, @SerialName(CCPA.CCPA_STANDARD) String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 3, BidRequestRegsExt$$serializer.INSTANCE.getDescriptor());
        }
        this.gdpr = i3;
        this.usPrivacy = str;
    }

    @SerialName("gdpr")
    public static /* synthetic */ void getGdpr$annotations() {
    }

    @SerialName(CCPA.CCPA_STANDARD)
    public static /* synthetic */ void getUsPrivacy$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestRegsExt self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.gdpr);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.usPrivacy);
    }

    public final int getGdpr() {
        return this.gdpr;
    }

    public final String getUsPrivacy() {
        return this.usPrivacy;
    }

    private BidRequestRegsExt(int i2, String str) {
        this.gdpr = i2;
        this.usPrivacy = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BidRequestRegsExt(int i2, Boolean bool) {
        String consentString;
        PrivacyController.PrivacySetting privacySetting = PrivacyController.PrivacySetting.TRUE;
        int value = i2 == privacySetting.getValue() ? privacySetting.getValue() : PrivacyController.PrivacySetting.FALSE.getValue();
        if (Intrinsics.a(bool, Boolean.TRUE)) {
            consentString = PrivacyController.PrivacyString.GRANTED.getConsentString();
        } else if (Intrinsics.a(bool, Boolean.FALSE)) {
            consentString = PrivacyController.PrivacyString.DENIED.getConsentString();
        } else {
            if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            consentString = null;
        }
        this(value, consentString);
    }
}
