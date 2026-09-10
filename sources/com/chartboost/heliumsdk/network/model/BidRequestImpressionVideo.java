package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.ad.HeliumBannerAd;
import com.chartboost.heliumsdk.utils.Environment;
import com.smartdigimkt.m3.h;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006Bq\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\r\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0005\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014BM\b\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0015J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÇ\u0001R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0019\u0010\u0017R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u001d\u0010\u0017¨\u0006'"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionVideo;", "", "size", "Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;", "adType", "", "(Lcom/chartboost/heliumsdk/ad/HeliumBannerAd$HeliumBannerSize;I)V", "seen1", "mimes", "", "", "width", "height", "placement", "position", "companionType", "ext", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionExt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;IIIILjava/util/List;Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;IIIILjava/util/List;Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionExt;)V", "getCompanionType$annotations", "()V", "getExt$annotations", "getHeight$annotations", "getMimes$annotations", "getPlacement$annotations", "getPosition$annotations", "getWidth$annotations", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestImpressionVideo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Integer> companionType;
    private final BidRequestImpressionExt ext;
    private final int height;
    private final List<String> mimes;
    private final int placement;
    private final int position;
    private final int width;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionVideo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpressionVideo;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestImpressionVideo> serializer() {
            return BidRequestImpressionVideo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestImpressionVideo(int i2, @SerialName("mimes") List list, @SerialName("w") int i3, @SerialName(h.f36614b) int i4, @SerialName("placement") int i5, @SerialName("pos") int i6, @SerialName("companiontype") List list2, @SerialName("ext") BidRequestImpressionExt bidRequestImpressionExt, SerializationConstructorMarker serializationConstructorMarker) {
        if (126 != (i2 & 126)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 126, BidRequestImpressionVideo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i2 & 1) == 0) {
            this.mimes = CollectionsKt.H("video/mp4");
        } else {
            this.mimes = list;
        }
        this.width = i3;
        this.height = i4;
        this.placement = i5;
        this.position = i6;
        this.companionType = list2;
        this.ext = bidRequestImpressionExt;
    }

    @SerialName("companiontype")
    private static /* synthetic */ void getCompanionType$annotations() {
    }

    @SerialName("ext")
    private static /* synthetic */ void getExt$annotations() {
    }

    @SerialName(h.f36614b)
    private static /* synthetic */ void getHeight$annotations() {
    }

    @SerialName("mimes")
    private static /* synthetic */ void getMimes$annotations() {
    }

    @SerialName("placement")
    private static /* synthetic */ void getPlacement$annotations() {
    }

    @SerialName("pos")
    private static /* synthetic */ void getPosition$annotations() {
    }

    @SerialName("w")
    private static /* synthetic */ void getWidth$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestImpressionVideo self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.a(self.mimes, CollectionsKt.H("video/mp4"))) {
            output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(StringSerializer.INSTANCE), self.mimes);
        }
        output.encodeIntElement(serialDesc, 1, self.width);
        output.encodeIntElement(serialDesc, 2, self.height);
        output.encodeIntElement(serialDesc, 3, self.placement);
        output.encodeIntElement(serialDesc, 4, self.position);
        output.encodeSerializableElement(serialDesc, 5, new ArrayListSerializer(IntSerializer.INSTANCE), self.companionType);
        output.encodeSerializableElement(serialDesc, 6, BidRequestImpressionExt$$serializer.INSTANCE, self.ext);
    }

    private BidRequestImpressionVideo(List<String> list, int i2, int i3, int i4, int i5, List<Integer> list2, BidRequestImpressionExt bidRequestImpressionExt) {
        this.mimes = list;
        this.width = i2;
        this.height = i3;
        this.placement = i4;
        this.position = i5;
        this.companionType = list2;
        this.ext = bidRequestImpressionExt;
    }

    public /* synthetic */ BidRequestImpressionVideo(List list, int i2, int i3, int i4, int i5, List list2, BidRequestImpressionExt bidRequestImpressionExt, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? CollectionsKt.H("video/mp4") : list, i2, i3, i4, i5, list2, bidRequestImpressionExt);
    }

    public BidRequestImpressionVideo(HeliumBannerAd.HeliumBannerSize heliumBannerSize, int i2) {
        this((List) null, heliumBannerSize != null ? heliumBannerSize.getWidth() : Environment.INSTANCE.getDisplayWidth(), heliumBannerSize != null ? heliumBannerSize.getHeight() : Environment.INSTANCE.getDisplayHeight(), (i2 == 2 || i2 == 4) ? 2 : 5, (i2 == 2 || i2 == 4) ? 1 : 7, CollectionsKt.I(1, 2), new BidRequestImpressionExt(i2), 1, (DefaultConstructorMarker) null);
    }
}
