package com.vungle.ads.internal.model;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.x4;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\""}, d2 = {"Lcom/vungle/ads/internal/model/OmSdkData;", "", "seen1", "", "params", "", "vendorKey", "vendorURL", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getParams", "()Ljava/lang/String;", "getVendorKey", "getVendorURL", "component1", "component2", "component3", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final /* data */ class OmSdkData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String params;
    private final String vendorKey;
    private final String vendorURL;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/model/OmSdkData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/internal/model/OmSdkData;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OmSdkData> serializer() {
            return OmSdkData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OmSdkData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ OmSdkData copy$default(OmSdkData omSdkData, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = omSdkData.params;
        }
        if ((i2 & 2) != 0) {
            str2 = omSdkData.vendorKey;
        }
        if ((i2 & 4) != 0) {
            str3 = omSdkData.vendorURL;
        }
        return omSdkData.copy(str, str2, str3);
    }

    @JvmStatic
    public static final void write$Self(OmSdkData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.params != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.params);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.vendorKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.vendorKey);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.vendorURL == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.vendorURL);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParams() {
        return this.params;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVendorKey() {
        return this.vendorKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVendorURL() {
        return this.vendorURL;
    }

    public final OmSdkData copy(String params, String vendorKey, String vendorURL) {
        return new OmSdkData(params, vendorKey, vendorURL);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OmSdkData)) {
            return false;
        }
        OmSdkData omSdkData = (OmSdkData) other;
        return Intrinsics.a(this.params, omSdkData.params) && Intrinsics.a(this.vendorKey, omSdkData.vendorKey) && Intrinsics.a(this.vendorURL, omSdkData.vendorURL);
    }

    public final String getParams() {
        return this.params;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVendorURL() {
        return this.vendorURL;
    }

    public int hashCode() {
        String str = this.params;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vendorKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vendorURL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OmSdkData(params=");
        sb.append(this.params);
        sb.append(", vendorKey=");
        sb.append(this.vendorKey);
        sb.append(", vendorURL=");
        return a.p(sb, this.vendorURL, ')');
    }

    @Deprecated
    public /* synthetic */ OmSdkData(int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.params = null;
        } else {
            this.params = str;
        }
        if ((i2 & 2) == 0) {
            this.vendorKey = null;
        } else {
            this.vendorKey = str2;
        }
        if ((i2 & 4) == 0) {
            this.vendorURL = null;
        } else {
            this.vendorURL = str3;
        }
    }

    public OmSdkData(String str, String str2, String str3) {
        this.params = str;
        this.vendorKey = str2;
        this.vendorURL = str3;
    }

    public /* synthetic */ OmSdkData(String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
    }
}
