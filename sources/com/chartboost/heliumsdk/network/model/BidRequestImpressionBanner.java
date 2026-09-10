package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.utils.Environment;
import com.smartdigimkt.m3.h;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006BM\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010B1\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0011J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0016\u0010\f\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0017\u0010\u0013¨\u0006!"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionBanner;", "", "size", "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "adType", "", "(Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;I)V", "seen1", "width", "height", "position", "topFrame", "ext", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionExt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIILcom/chartboost/heliumsdk/network/model/BidRequestImpressionExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(IIIILcom/chartboost/heliumsdk/network/model/BidRequestImpressionExt;)V", "getExt$annotations", "()V", "getHeight$annotations", "getPosition$annotations", "getTopFrame$annotations", "getWidth$annotations", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestImpressionBanner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BidRequestImpressionExt ext;
    private final int height;
    private final int position;
    private final int topFrame;
    private final int width;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionBanner$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionBanner;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestImpressionBanner> serializer() {
            return BidRequestImpressionBanner$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestImpressionBanner(int i2, @SerialName("w") int i3, @SerialName(h.f36614b) int i4, @SerialName("pos") int i5, @SerialName("topframe") int i6, @SerialName("ext") BidRequestImpressionExt bidRequestImpressionExt, SerializationConstructorMarker serializationConstructorMarker) {
        if (23 != (i2 & 23)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 23, BidRequestImpressionBanner$$serializer.INSTANCE.getDescriptor());
        }
        this.width = i3;
        this.height = i4;
        this.position = i5;
        if ((i2 & 8) == 0) {
            this.topFrame = 1;
        } else {
            this.topFrame = i6;
        }
        this.ext = bidRequestImpressionExt;
    }

    @SerialName("ext")
    private static /* synthetic */ void getExt$annotations() {
    }

    @SerialName(h.f36614b)
    private static /* synthetic */ void getHeight$annotations() {
    }

    @SerialName("pos")
    private static /* synthetic */ void getPosition$annotations() {
    }

    @SerialName("topframe")
    private static /* synthetic */ void getTopFrame$annotations() {
    }

    @SerialName("w")
    private static /* synthetic */ void getWidth$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestImpressionBanner self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeIntElement(serialDesc, 0, self.width);
        output.encodeIntElement(serialDesc, 1, self.height);
        output.encodeIntElement(serialDesc, 2, self.position);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.topFrame != 1) {
            output.encodeIntElement(serialDesc, 3, self.topFrame);
        }
        output.encodeSerializableElement(serialDesc, 4, BidRequestImpressionExt$$serializer.INSTANCE, self.ext);
    }

    private BidRequestImpressionBanner(int i2, int i3, int i4, int i5, BidRequestImpressionExt bidRequestImpressionExt) {
        this.width = i2;
        this.height = i3;
        this.position = i4;
        this.topFrame = i5;
        this.ext = bidRequestImpressionExt;
    }

    public /* synthetic */ BidRequestImpressionBanner(int i2, int i3, int i4, int i5, BidRequestImpressionExt bidRequestImpressionExt, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, (i6 & 8) != 0 ? 1 : i5, bidRequestImpressionExt);
    }

    public BidRequestImpressionBanner(HeliumBannerAd.HeliumBannerSize heliumBannerSize, int i2) {
        this(heliumBannerSize != null ? heliumBannerSize.getWidth() : Environment.INSTANCE.getDisplayWidth(), heliumBannerSize != null ? heliumBannerSize.getHeight() : Environment.INSTANCE.getDisplayHeight(), (i2 == 2 || i2 == 4) ? 1 : 7, 0, new BidRequestImpressionExt(i2), 8, (DefaultConstructorMarker) null);
    }
}
