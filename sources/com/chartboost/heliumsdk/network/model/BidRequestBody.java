package com.chartboost.heliumsdk.network.model;

import com.chartboost.heliumsdk.HeliumSdk;
import com.chartboost.heliumsdk.controllers.PartnerController;
import com.chartboost.heliumsdk.controllers.PrivacyController;
import com.chartboost.heliumsdk.domain.AdLoadParams;
import com.p004ironsource.d9;
import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0002>?BG\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\u000b¢\u0006\u0002\u0010\rBq\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\t\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\u0002\u0010\u001fBI\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010 J!\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=HÇ\u0001R\u001c\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\"\u001a\u0004\b&\u0010'R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\"\u001a\u0004\b)\u0010*R\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\"\u001a\u0004\b,\u0010-R\u001c\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\"\u001a\u0004\b/\u00100R\u001c\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\"\u001a\u0004\b2\u00103R\u001c\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\"\u001a\u0004\b5\u00106¨\u0006@"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestBody;", "", "adLoadParams", "Lcom/chartboost/heliumsdk/domain/AdLoadParams;", "partnerController", "Lcom/chartboost/heliumsdk/controllers/PartnerController;", "privacyController", "Lcom/chartboost/heliumsdk/controllers/PrivacyController;", "impressionDepth", "", "bidTokens", "", "", "(Lcom/chartboost/heliumsdk/domain/AdLoadParams;Lcom/chartboost/heliumsdk/controllers/PartnerController;Lcom/chartboost/heliumsdk/controllers/PrivacyController;ILjava/util/Map;)V", "seen1", "user", "Lcom/chartboost/heliumsdk/network/model/BidRequestUser;", "testFlag", "impressionList", "", "Lcom/chartboost/heliumsdk/network/model/BidRequestImpression;", "app", "Lcom/chartboost/heliumsdk/network/model/BidRequestApp;", d9.h.G, "Lcom/chartboost/heliumsdk/network/model/BidRequestDevice;", "regs", "Lcom/chartboost/heliumsdk/network/model/BidRequestRegs;", "ext", "Lcom/chartboost/heliumsdk/network/model/BidRequestExt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/chartboost/heliumsdk/network/model/BidRequestUser;ILjava/util/List;Lcom/chartboost/heliumsdk/network/model/BidRequestApp;Lcom/chartboost/heliumsdk/network/model/BidRequestDevice;Lcom/chartboost/heliumsdk/network/model/BidRequestRegs;Lcom/chartboost/heliumsdk/network/model/BidRequestExt;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/chartboost/heliumsdk/network/model/BidRequestUser;ILjava/util/List;Lcom/chartboost/heliumsdk/network/model/BidRequestApp;Lcom/chartboost/heliumsdk/network/model/BidRequestDevice;Lcom/chartboost/heliumsdk/network/model/BidRequestRegs;Lcom/chartboost/heliumsdk/network/model/BidRequestExt;)V", "getApp$annotations", "()V", "getApp", "()Lcom/chartboost/heliumsdk/network/model/BidRequestApp;", "getDevice$annotations", "getDevice", "()Lcom/chartboost/heliumsdk/network/model/BidRequestDevice;", "getExt$annotations", "getExt", "()Lcom/chartboost/heliumsdk/network/model/BidRequestExt;", "getImpressionList$annotations", "getImpressionList", "()Ljava/util/List;", "getRegs$annotations", "getRegs", "()Lcom/chartboost/heliumsdk/network/model/BidRequestRegs;", "getTestFlag$annotations", "getTestFlag", "()I", "getUser$annotations", "getUser", "()Lcom/chartboost/heliumsdk/network/model/BidRequestUser;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final class BidRequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final BidRequestApp app;
    private final BidRequestDevice device;
    private final BidRequestExt ext;
    private final List<BidRequestImpression> impressionList;
    private final BidRequestRegs regs;
    private final int testFlag;
    private final BidRequestUser user;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/network/model/BidRequestBody$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/network/model/BidRequestBody;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidRequestBody> serializer() {
            return BidRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidRequestBody(int i2, @SerialName("user") BidRequestUser bidRequestUser, @SerialName("test") int i3, @SerialName("imp") List list, @SerialName("app") BidRequestApp bidRequestApp, @SerialName(d9.h.G) BidRequestDevice bidRequestDevice, @SerialName("regs") BidRequestRegs bidRequestRegs, @SerialName("ext") BidRequestExt bidRequestExt, SerializationConstructorMarker serializationConstructorMarker) {
        if (125 != (i2 & 125)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 125, BidRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.user = bidRequestUser;
        if ((i2 & 2) == 0) {
            this.testFlag = HeliumSdk.INSTANCE.getTestMode();
        } else {
            this.testFlag = i3;
        }
        this.impressionList = list;
        this.app = bidRequestApp;
        this.device = bidRequestDevice;
        this.regs = bidRequestRegs;
        this.ext = bidRequestExt;
    }

    @SerialName("app")
    public static /* synthetic */ void getApp$annotations() {
    }

    @SerialName(d9.h.G)
    public static /* synthetic */ void getDevice$annotations() {
    }

    @SerialName("ext")
    public static /* synthetic */ void getExt$annotations() {
    }

    @SerialName("imp")
    public static /* synthetic */ void getImpressionList$annotations() {
    }

    @SerialName("regs")
    public static /* synthetic */ void getRegs$annotations() {
    }

    @SerialName("test")
    public static /* synthetic */ void getTestFlag$annotations() {
    }

    @SerialName("user")
    public static /* synthetic */ void getUser$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidRequestBody self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, BidRequestUser$$serializer.INSTANCE, self.user);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.testFlag != HeliumSdk.INSTANCE.getTestMode()) {
            output.encodeIntElement(serialDesc, 1, self.testFlag);
        }
        output.encodeSerializableElement(serialDesc, 2, new ArrayListSerializer(BidRequestImpression$$serializer.INSTANCE), self.impressionList);
        output.encodeSerializableElement(serialDesc, 3, BidRequestApp$$serializer.INSTANCE, self.app);
        output.encodeSerializableElement(serialDesc, 4, BidRequestDevice$$serializer.INSTANCE, self.device);
        output.encodeSerializableElement(serialDesc, 5, BidRequestRegs$$serializer.INSTANCE, self.regs);
        output.encodeNullableSerializableElement(serialDesc, 6, BidRequestExt$$serializer.INSTANCE, self.ext);
    }

    public final BidRequestApp getApp() {
        return this.app;
    }

    public final BidRequestDevice getDevice() {
        return this.device;
    }

    public final BidRequestExt getExt() {
        return this.ext;
    }

    public final List<BidRequestImpression> getImpressionList() {
        return this.impressionList;
    }

    public final BidRequestRegs getRegs() {
        return this.regs;
    }

    public final int getTestFlag() {
        return this.testFlag;
    }

    public final BidRequestUser getUser() {
        return this.user;
    }

    private BidRequestBody(BidRequestUser bidRequestUser, int i2, List<BidRequestImpression> list, BidRequestApp bidRequestApp, BidRequestDevice bidRequestDevice, BidRequestRegs bidRequestRegs, BidRequestExt bidRequestExt) {
        this.user = bidRequestUser;
        this.testFlag = i2;
        this.impressionList = list;
        this.app = bidRequestApp;
        this.device = bidRequestDevice;
        this.regs = bidRequestRegs;
        this.ext = bidRequestExt;
    }

    public /* synthetic */ BidRequestBody(BidRequestUser bidRequestUser, int i2, List list, BidRequestApp bidRequestApp, BidRequestDevice bidRequestDevice, BidRequestRegs bidRequestRegs, BidRequestExt bidRequestExt, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(bidRequestUser, (i3 & 2) != 0 ? HeliumSdk.INSTANCE.getTestMode() : i2, list, bidRequestApp, bidRequestDevice, bidRequestRegs, bidRequestExt);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BidRequestBody(AdLoadParams adLoadParams, PartnerController partnerController, PrivacyController privacyController, int i2, Map<String, ? extends Map<String, String>> bidTokens) {
        this(new BidRequestUser(privacyController.getUserConsent(), i2, adLoadParams.getKeywords()), 0, CollectionsKt.H(new BidRequestImpression(adLoadParams.getAdIdentifier(), adLoadParams.getBannerSize())), new BidRequestApp(), new BidRequestDevice(adLoadParams.getBannerSize()), new BidRequestRegs(privacyController.getCoppa(), privacyController.getGdpr(), privacyController.getCcpaConsent()), new BidRequestExt(partnerController.getAdapters(), bidTokens, adLoadParams.getLoadId(), partnerController.getInitStatuses()), 2, (DefaultConstructorMarker) null);
        Intrinsics.f(adLoadParams, "adLoadParams");
        Intrinsics.f(partnerController, "partnerController");
        Intrinsics.f(privacyController, "privacyController");
        Intrinsics.f(bidTokens, "bidTokens");
    }
}
