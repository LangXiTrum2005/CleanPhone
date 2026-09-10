package com.chartboost.heliumsdk.domain;

import androidx.datastore.preferences.protobuf.a;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002IJB\u008f\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\u0011\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0000H\u0096\u0002J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018Jz\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u00100\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001J!\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HHÇ\u0001R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0019\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u001eR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u001eR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u001eR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u001eR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010\u001eR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010.¨\u0006K"}, d2 = {"Lcom/chartboost/heliumsdk/domain/BidInfo;", "", "seen1", "", "id", "", "impressionId", "price", "", "lurl", "nurl", "adm", "burl", BidInfo.EXT_KEY, "Lcom/chartboost/heliumsdk/domain/BidInfoExt;", "adaptiveBannerWidth", "adaptiveBannerHeight", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/chartboost/heliumsdk/domain/BidInfoExt;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/chartboost/heliumsdk/domain/BidInfoExt;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAdaptiveBannerHeight$annotations", "()V", "getAdaptiveBannerHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAdaptiveBannerWidth$annotations", "getAdaptiveBannerWidth", "getAdm$annotations", "getAdm", "()Ljava/lang/String;", "getBurl$annotations", "getBurl", "getExt$annotations", "getExt", "()Lcom/chartboost/heliumsdk/domain/BidInfoExt;", "getId$annotations", "getId", "getImpressionId$annotations", "getImpressionId", "getLurl$annotations", "getLurl", "getNurl$annotations", "getNurl", "getPrice$annotations", "getPrice", "()D", "compareTo", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/chartboost/heliumsdk/domain/BidInfoExt;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/chartboost/heliumsdk/domain/BidInfo;", "equals", "", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable
public final /* data */ class BidInfo implements Comparable<BidInfo> {
    private static final String ADM_KEY = "adm";
    private static final String BURL_KEY = "burl";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String EXT_KEY = "ext";
    private static final String HEIGHT_KEY = "h";
    private static final String ID_KEY = "id";
    private static final String IMP_ID = "impid";
    private static final String LURL_KEY = "lurl";
    private static final String NURL_KEY = "nurl";
    private static final String PRICE_KEY = "price";
    private static final String WIDTH_KEY = "w";
    private final Integer adaptiveBannerHeight;
    private final Integer adaptiveBannerWidth;
    private final String adm;
    private final String burl;
    private final BidInfoExt ext;
    private final String id;
    private final String impressionId;
    private final String lurl;
    private final String nurl;
    private final double price;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/chartboost/heliumsdk/domain/BidInfo$Companion;", "", "()V", "ADM_KEY", "", "BURL_KEY", "EXT_KEY", "HEIGHT_KEY", "ID_KEY", "IMP_ID", "LURL_KEY", "NURL_KEY", "PRICE_KEY", "WIDTH_KEY", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/BidInfo;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BidInfo> serializer() {
            return BidInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated
    public /* synthetic */ BidInfo(int i2, @SerialName("id") String str, @SerialName(IMP_ID) String str2, @SerialName("price") double d, @SerialName("lurl") String str3, @SerialName("nurl") String str4, @SerialName("adm") String str5, @SerialName("burl") String str6, @SerialName(EXT_KEY) BidInfoExt bidInfoExt, @SerialName(WIDTH_KEY) Integer num, @SerialName("h") Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i2, 3, BidInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.impressionId = str2;
        if ((i2 & 4) == 0) {
            this.price = 0.0d;
        } else {
            this.price = d;
        }
        if ((i2 & 8) == 0) {
            this.lurl = "";
        } else {
            this.lurl = str3;
        }
        if ((i2 & 16) == 0) {
            this.nurl = "";
        } else {
            this.nurl = str4;
        }
        if ((i2 & 32) == 0) {
            this.adm = null;
        } else {
            this.adm = str5;
        }
        if ((i2 & 64) == 0) {
            this.burl = "";
        } else {
            this.burl = str6;
        }
        if ((i2 & 128) == 0) {
            this.ext = null;
        } else {
            this.ext = bidInfoExt;
        }
        if ((i2 & 256) == 0) {
            this.adaptiveBannerWidth = null;
        } else {
            this.adaptiveBannerWidth = num;
        }
        if ((i2 & 512) == 0) {
            this.adaptiveBannerHeight = null;
        } else {
            this.adaptiveBannerHeight = num2;
        }
    }

    public static /* synthetic */ BidInfo copy$default(BidInfo bidInfo, String str, String str2, double d, String str3, String str4, String str5, String str6, BidInfoExt bidInfoExt, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bidInfo.id;
        }
        if ((i2 & 2) != 0) {
            str2 = bidInfo.impressionId;
        }
        if ((i2 & 4) != 0) {
            d = bidInfo.price;
        }
        if ((i2 & 8) != 0) {
            str3 = bidInfo.lurl;
        }
        if ((i2 & 16) != 0) {
            str4 = bidInfo.nurl;
        }
        if ((i2 & 32) != 0) {
            str5 = bidInfo.adm;
        }
        if ((i2 & 64) != 0) {
            str6 = bidInfo.burl;
        }
        if ((i2 & 128) != 0) {
            bidInfoExt = bidInfo.ext;
        }
        if ((i2 & 256) != 0) {
            num = bidInfo.adaptiveBannerWidth;
        }
        if ((i2 & 512) != 0) {
            num2 = bidInfo.adaptiveBannerHeight;
        }
        Integer num3 = num;
        Integer num4 = num2;
        BidInfoExt bidInfoExt2 = bidInfoExt;
        String str7 = str5;
        String str8 = str3;
        double d2 = d;
        return bidInfo.copy(str, str2, d2, str8, str4, str7, str6, bidInfoExt2, num3, num4);
    }

    @SerialName("h")
    public static /* synthetic */ void getAdaptiveBannerHeight$annotations() {
    }

    @SerialName(WIDTH_KEY)
    public static /* synthetic */ void getAdaptiveBannerWidth$annotations() {
    }

    @SerialName("adm")
    public static /* synthetic */ void getAdm$annotations() {
    }

    @SerialName("burl")
    public static /* synthetic */ void getBurl$annotations() {
    }

    @SerialName(EXT_KEY)
    public static /* synthetic */ void getExt$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName(IMP_ID)
    public static /* synthetic */ void getImpressionId$annotations() {
    }

    @SerialName("lurl")
    public static /* synthetic */ void getLurl$annotations() {
    }

    @SerialName("nurl")
    public static /* synthetic */ void getNurl$annotations() {
    }

    @SerialName("price")
    public static /* synthetic */ void getPrice$annotations() {
    }

    @JvmStatic
    public static final void write$Self(BidInfo self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.impressionId);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.price, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.price);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.a(self.lurl, "")) {
            output.encodeStringElement(serialDesc, 3, self.lurl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.a(self.nurl, "")) {
            output.encodeStringElement(serialDesc, 4, self.nurl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.adm != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.adm);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.a(self.burl, "")) {
            output.encodeStringElement(serialDesc, 6, self.burl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.ext != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, BidInfoExt$$serializer.INSTANCE, self.ext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.adaptiveBannerWidth != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, IntSerializer.INSTANCE, self.adaptiveBannerWidth);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.adaptiveBannerHeight == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, IntSerializer.INSTANCE, self.adaptiveBannerHeight);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getAdaptiveBannerHeight() {
        return this.adaptiveBannerHeight;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImpressionId() {
        return this.impressionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLurl() {
        return this.lurl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNurl() {
        return this.nurl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAdm() {
        return this.adm;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBurl() {
        return this.burl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BidInfoExt getExt() {
        return this.ext;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getAdaptiveBannerWidth() {
        return this.adaptiveBannerWidth;
    }

    public final BidInfo copy(String id, String impressionId, double price, String lurl, String nurl, String adm, String burl, BidInfoExt ext, Integer adaptiveBannerWidth, Integer adaptiveBannerHeight) {
        Intrinsics.f(id, "id");
        Intrinsics.f(impressionId, "impressionId");
        Intrinsics.f(lurl, "lurl");
        Intrinsics.f(nurl, "nurl");
        Intrinsics.f(burl, "burl");
        return new BidInfo(id, impressionId, price, lurl, nurl, adm, burl, ext, adaptiveBannerWidth, adaptiveBannerHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BidInfo)) {
            return false;
        }
        BidInfo bidInfo = (BidInfo) other;
        return Intrinsics.a(this.id, bidInfo.id) && Intrinsics.a(this.impressionId, bidInfo.impressionId) && Double.compare(this.price, bidInfo.price) == 0 && Intrinsics.a(this.lurl, bidInfo.lurl) && Intrinsics.a(this.nurl, bidInfo.nurl) && Intrinsics.a(this.adm, bidInfo.adm) && Intrinsics.a(this.burl, bidInfo.burl) && Intrinsics.a(this.ext, bidInfo.ext) && Intrinsics.a(this.adaptiveBannerWidth, bidInfo.adaptiveBannerWidth) && Intrinsics.a(this.adaptiveBannerHeight, bidInfo.adaptiveBannerHeight);
    }

    public final Integer getAdaptiveBannerHeight() {
        return this.adaptiveBannerHeight;
    }

    public final Integer getAdaptiveBannerWidth() {
        return this.adaptiveBannerWidth;
    }

    public final String getAdm() {
        return this.adm;
    }

    public final String getBurl() {
        return this.burl;
    }

    public final BidInfoExt getExt() {
        return this.ext;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImpressionId() {
        return this.impressionId;
    }

    public final String getLurl() {
        return this.lurl;
    }

    public final String getNurl() {
        return this.nurl;
    }

    public final double getPrice() {
        return this.price;
    }

    public int hashCode() {
        int iB = a.b(this.nurl, a.b(this.lurl, (Double.hashCode(this.price) + a.b(this.impressionId, this.id.hashCode() * 31, 31)) * 31, 31), 31);
        String str = this.adm;
        int iB2 = a.b(this.burl, (iB + (str == null ? 0 : str.hashCode())) * 31, 31);
        BidInfoExt bidInfoExt = this.ext;
        int iHashCode = (iB2 + (bidInfoExt == null ? 0 : bidInfoExt.hashCode())) * 31;
        Integer num = this.adaptiveBannerWidth;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.adaptiveBannerHeight;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "BidInfo(id=" + this.id + ", impressionId=" + this.impressionId + ", price=" + this.price + ", lurl=" + this.lurl + ", nurl=" + this.nurl + ", adm=" + this.adm + ", burl=" + this.burl + ", ext=" + this.ext + ", adaptiveBannerWidth=" + this.adaptiveBannerWidth + ", adaptiveBannerHeight=" + this.adaptiveBannerHeight + ')';
    }

    public BidInfo(String id, String impressionId, double d, String lurl, String nurl, String str, String burl, BidInfoExt bidInfoExt, Integer num, Integer num2) {
        Intrinsics.f(id, "id");
        Intrinsics.f(impressionId, "impressionId");
        Intrinsics.f(lurl, "lurl");
        Intrinsics.f(nurl, "nurl");
        Intrinsics.f(burl, "burl");
        this.id = id;
        this.impressionId = impressionId;
        this.price = d;
        this.lurl = lurl;
        this.nurl = nurl;
        this.adm = str;
        this.burl = burl;
        this.ext = bidInfoExt;
        this.adaptiveBannerWidth = num;
        this.adaptiveBannerHeight = num2;
    }

    @Override // java.lang.Comparable
    public int compareTo(BidInfo other) {
        Intrinsics.f(other, "other");
        return Double.compare(this.price, other.price);
    }

    public /* synthetic */ BidInfo(String str, String str2, double d, String str3, String str4, String str5, String str6, BidInfoExt bidInfoExt, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? null : bidInfoExt, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? null : num2);
    }
}
