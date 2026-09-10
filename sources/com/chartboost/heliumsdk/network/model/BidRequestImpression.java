package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.domain.AdIdentifier;
import com.vungle.ads.internal.Constants;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002&'B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006Bi\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015BE\b\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0016J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÇ\u0001R\u0016\u0010\u0011\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0018R\u0016\u0010\f\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0018R\u0016\u0010\r\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001e\u0010\u0018¨\u0006("}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestImpression;", "", "adIdentifier", "Lcom/chartboost/heliumsdk/domain/AdIdentifier;", "size", "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "(Lcom/chartboost/heliumsdk/domain/AdIdentifier;Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;)V", "seen1", "", "displayManager", "", "displayManagerVersion", Constants.TEMPLATE_TYPE_FULLSCREEN, "tagId", "secure", "video", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionVideo;", "banner", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionBanner;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILcom/chartboost/heliumsdk/network/model/BidRequestImpressionVideo;Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionBanner;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILcom/chartboost/heliumsdk/network/model/BidRequestImpressionVideo;Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionBanner;)V", "getBanner$annotations", "()V", "getDisplayManager$annotations", "getDisplayManagerVersion$annotations", "getFullscreen$annotations", "getSecure$annotations", "getTagId$annotations", "getVideo$annotations", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestImpression {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BidRequestImpressionBanner banner;
    private final String displayManager;
    private final String displayManagerVersion;
    private final int fullscreen;
    private final int secure;
    private final String tagId;
    private final BidRequestImpressionVideo video;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestImpression$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpression;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestImpression> serializer() {
            return BidRequestImpression$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestImpression(int i2, @SerialName("displaymanager") String str, @SerialName("displaymanagerver") String str2, @SerialName("instl") int i3, @SerialName("tagid") String str3, @SerialName("secure") int i4, @SerialName("video") BidRequestImpressionVideo bidRequestImpressionVideo, @SerialName("banner") BidRequestImpressionBanner bidRequestImpressionBanner, SerializationConstructorMarker serializationConstructorMarker) {
        if (108 != (i2 & 108)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 108, BidRequestImpression$$serializer.INSTANCE.getDescriptor());
        }
        this.displayManager = (i2 & 1) == 0 ? "Helium" : str;
        if ((i2 & 2) == 0) {
            this.displayManagerVersion = HeliumSdk.INSTANCE.getVersion();
        } else {
            this.displayManagerVersion = str2;
        }
        this.fullscreen = i3;
        this.tagId = str3;
        if ((i2 & 16) == 0) {
            this.secure = 1;
        } else {
            this.secure = i4;
        }
        this.video = bidRequestImpressionVideo;
        this.banner = bidRequestImpressionBanner;
    }

    @SerialName("banner")
    private static /* synthetic */ void getBanner$annotations() {
    }

    @SerialName("displaymanager")
    private static /* synthetic */ void getDisplayManager$annotations() {
    }

    @SerialName("displaymanagerver")
    private static /* synthetic */ void getDisplayManagerVersion$annotations() {
    }

    @SerialName("instl")
    private static /* synthetic */ void getFullscreen$annotations() {
    }

    @SerialName("secure")
    private static /* synthetic */ void getSecure$annotations() {
    }

    @SerialName("tagid")
    private static /* synthetic */ void getTagId$annotations() {
    }

    @SerialName("video")
    private static /* synthetic */ void getVideo$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestImpression self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.a(self.displayManager, "Helium")) {
            output.encodeStringElement(serialDesc, 0, self.displayManager);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.a(self.displayManagerVersion, HeliumSdk.INSTANCE.getVersion())) {
            output.encodeStringElement(serialDesc, 1, self.displayManagerVersion);
        }
        output.encodeIntElement(serialDesc, 2, self.fullscreen);
        output.encodeStringElement(serialDesc, 3, self.tagId);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.secure != 1) {
            output.encodeIntElement(serialDesc, 4, self.secure);
        }
        output.encodeSerializableElement(serialDesc, 5, BidRequestImpressionVideo$$serializer.INSTANCE, self.video);
        output.encodeSerializableElement(serialDesc, 6, BidRequestImpressionBanner$$serializer.INSTANCE, self.banner);
    }

    private BidRequestImpression(String str, String str2, int i2, String str3, int i3, BidRequestImpressionVideo bidRequestImpressionVideo, BidRequestImpressionBanner bidRequestImpressionBanner) {
        this.displayManager = str;
        this.displayManagerVersion = str2;
        this.fullscreen = i2;
        this.tagId = str3;
        this.secure = i3;
        this.video = bidRequestImpressionVideo;
        this.banner = bidRequestImpressionBanner;
    }

    public /* synthetic */ BidRequestImpression(String str, String str2, int i2, String str3, int i3, BidRequestImpressionVideo bidRequestImpressionVideo, BidRequestImpressionBanner bidRequestImpressionBanner, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "Helium" : str, (i4 & 2) != 0 ? HeliumSdk.INSTANCE.getVersion() : str2, i2, str3, (i4 & 16) != 0 ? 1 : i3, bidRequestImpressionVideo, bidRequestImpressionBanner);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BidRequestImpression(AdIdentifier adIdentifier, HeliumBannerAd.HeliumBannerSize heliumBannerSize) {
        this((String) null, (String) null, (adIdentifier.getAdType() == 2 || adIdentifier.getAdType() == 4) ? 0 : 1, adIdentifier.getPlacementName(), 0, new BidRequestImpressionVideo(heliumBannerSize, adIdentifier.getAdType()), new BidRequestImpressionBanner(heliumBannerSize, adIdentifier.getAdType()), 19, (DefaultConstructorMarker) null);
        Intrinsics.f(adIdentifier, "adIdentifier");
    }
}
