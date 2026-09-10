package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.domain.Keywords;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002 !B!\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB1\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B\u001b\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0011J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestUser;", "", d9.i.f24748b0, "", "impressionDepth", "", "keywords", "Lcom/chartboost/heliumsdk/domain/Keywords;", "(Ljava/lang/Boolean;ILcom/chartboost/heliumsdk/domain/Keywords;)V", "seen1", "bidRequestUserExt", "Lcom/chartboost/heliumsdk/network/model/BidRequestUserExt;", "tcConsentString", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/chartboost/heliumsdk/network/model/BidRequestUserExt;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/chartboost/heliumsdk/network/model/BidRequestUserExt;Ljava/lang/String;)V", "getBidRequestUserExt$annotations", "()V", "getBidRequestUserExt", "()Lcom/chartboost/heliumsdk/network/model/BidRequestUserExt;", "getTcConsentString$annotations", "getTcConsentString", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestUser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BidRequestUserExt bidRequestUserExt;
    private final String tcConsentString;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestUser$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestUser;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestUser> serializer() {
            return BidRequestUser$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestUser(int i2, @SerialName("ext") BidRequestUserExt bidRequestUserExt, @SerialName(d9.i.f24748b0) String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i2 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 1, BidRequestUser$$serializer.INSTANCE.getDescriptor());
        }
        this.bidRequestUserExt = bidRequestUserExt;
        if ((i2 & 2) != 0) {
            this.tcConsentString = str;
        } else {
            String tcString = Environment.INSTANCE.getTcString();
            this.tcConsentString = (tcString == null || tcString.length() <= 0) ? null : tcString;
        }
    }

    @SerialName("ext")
    public static /* synthetic */ void getBidRequestUserExt$annotations() {
    }

    @SerialName(d9.i.f24748b0)
    public static /* synthetic */ void getTcConsentString$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestUser self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, BidRequestUserExt$$serializer.INSTANCE, self.bidRequestUserExt);
        if (!output.shouldEncodeElementDefault(serialDesc, 1)) {
            String str = self.tcConsentString;
            String tcString = Environment.INSTANCE.getTcString();
            String str2 = null;
            if (tcString != null) {
                if (tcString.length() <= 0) {
                    tcString = null;
                }
                str2 = tcString;
            }
            if (Intrinsics.a(str, str2)) {
                return;
            }
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.tcConsentString);
    }

    public final BidRequestUserExt getBidRequestUserExt() {
        return this.bidRequestUserExt;
    }

    public final String getTcConsentString() {
        return this.tcConsentString;
    }

    private BidRequestUser(BidRequestUserExt bidRequestUserExt, String str) {
        this.bidRequestUserExt = bidRequestUserExt;
        this.tcConsentString = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BidRequestUser(BidRequestUserExt bidRequestUserExt, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0 && ((str = Environment.INSTANCE.getTcString()) == null || str.length() <= 0)) {
            str = null;
        }
        this(bidRequestUserExt, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BidRequestUser(Boolean bool, int i2, Keywords keywords) {
        this(new BidRequestUserExt(bool, i2, keywords), (String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.f(keywords, "keywords");
    }
}
