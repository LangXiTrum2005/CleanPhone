package loungewear;

import com.android.billingclient.api.BillingClient;
import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: loungewear.marial, reason: from toString */
/* JADX INFO: compiled from: PurchaseItem.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\bO\b\u0086\b\u0018\u0000 h2\u00020\u0001:\u0001&Bí\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010%R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010#\"\u0004\b2\u00103R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u00100\u001a\u0004\b4\u0010#\"\u0004\b5\u00103R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u0010#\"\u0004\b8\u00103R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b\n\u0010%\"\u0004\b;\u0010<R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010:\u001a\u0004\b\u000b\u0010%\"\u0004\b=\u0010<R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010:\u001a\u0004\b>\u0010%\"\u0004\b?\u0010<R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u00100\u001a\u0004\bA\u0010#\"\u0004\bB\u00103R\"\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u00100\u001a\u0004\bD\u0010#\"\u0004\bE\u00103R\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u00100\u001a\u0004\bG\u0010#\"\u0004\bH\u00103R\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u00100\u001a\u0004\b6\u0010#\"\u0004\bJ\u00103R\"\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u00100\u001a\u0004\bL\u0010#\"\u0004\bM\u00103R\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010:\u001a\u0004\bO\u0010%\"\u0004\bP\u0010<R\"\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u00100\u001a\u0004\bR\u0010#\"\u0004\bS\u00103R\"\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u00100\u001a\u0004\bU\u0010#\"\u0004\bV\u00103R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u00100\u001a\u0004\bX\u0010#\"\u0004\bY\u00103R\"\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u00100\u001a\u0004\b[\u0010#\"\u0004\b\\\u00103R\"\u0010\u0017\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u00100\u001a\u0004\b&\u0010#\"\u0004\bC\u00103R\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b^\u00100\u001a\u0004\b_\u0010#\"\u0004\b@\u00103R\"\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b`\u00100\u001a\u0004\ba\u0010#\"\u0004\bF\u00103R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\b/\u0010d\"\u0004\bK\u0010eR\"\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bf\u00100\u001a\u0004\b,\u0010#\"\u0004\bI\u00103R\u0011\u0010g\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b9\u0010#¨\u0006i"}, d2 = {"Lloungewear/marial;", "", "", "price", "rawPrice", "", "discount", "buttonTitle", "type", "", "isHot", "isTrial", "weight", "startTime", "endTime", "productName", InAppPurchaseMetaData.KEY_PRODUCT_ID, X3.i.m, IronSourceConstants.EVENTS_DURATION, "promoteDescription", "clientProductTitle", "strikeThroughPrice", "convertedPrice", "localFormattedPrice", "googleProductName", "offerId", "", "openOffer", "offerPrice", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "attabal", "Ljava/lang/Number;", "wireman", "()Ljava/lang/Number;", "setPrice", "(Ljava/lang/Number;)V", "saneness", "competently", "setRawPrice", "dern", "Ljava/lang/String;", "getDiscount", "setDiscount", "(Ljava/lang/String;)V", "getButtonTitle", "setButtonTitle", "marial", "impromptu", "setType", "beachfront", "I", "setHot", "(I)V", "setTrial", "getWeight", "setWeight", "taiyuan", "getStartTime", "setStartTime", "cutely", "getEndTime", "setEndTime", "apical", "getProductName", "setProductName", "formularize", "setProductId", "impassible", "getProductType", "setProductType", "triweekly", "getDuration", "setDuration", "kowloon", "getPromoteDescription", "setPromoteDescription", "arytenoidectomy", "getClientProductTitle", "setClientProductTitle", "monoploid", "getStrikeThroughPrice", "setStrikeThroughPrice", "polloi", "getConvertedPrice", "setConvertedPrice", "molybdenite", "graveside", "getGoogleProductName", "adultoid", "getOfferId", "dovishness", "Z", "()Z", "(Z)V", "gintrap", "purchaseIapType", "rotuma", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PurchaseItem {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("offer_id")
    private String offerId;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("product_name")
    private String productName;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("client_product_title")
    private String clientProductTitle;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("price")
    private Number price;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_hot")
    private int isHot;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_trial")
    private int isTrial;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("end_time")
    private String endTime;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("discount")
    private String discount;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("open_offer")
    private boolean openOffer;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("product_id")
    private String productId;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("offer_price")
    private String offerPrice;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("google_product_name")
    private String googleProductName;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("product_type")
    private String productType;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("weight")
    private int weight;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("promote_description")
    private String promoteDescription;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("type")
    private String type;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("local_formatted_price")
    private String localFormattedPrice;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("strike_through_price")
    private String strikeThroughPrice;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("converted_price")
    private String convertedPrice;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("raw_price")
    private Number rawPrice;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("start_time")
    private String startTime;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(IronSourceConstants.EVENTS_DURATION)
    private int duration;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("button_title")
    private String buttonTitle;

    public PurchaseItem() {
        this(null, null, null, null, null, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, false, null, 8388607, null);
    }

    public final void apical(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.offerId = str;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final String getLocalFormattedPrice() {
        return this.localFormattedPrice;
    }

    public final String beachfront() {
        return Intrinsics.wireman(this.productType, BillingClient.FeatureType.SUBSCRIPTIONS) ? "subs" : "inapp";
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final Number getRawPrice() {
        return this.rawPrice;
    }

    public final void cutely(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localFormattedPrice = str;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final boolean getOpenOffer() {
        return this.openOffer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseItem)) {
            return false;
        }
        PurchaseItem purchaseItem = (PurchaseItem) other;
        return Intrinsics.wireman(purchaseItem.price, this.price) && purchaseItem.isHot == this.isHot && Intrinsics.wireman(purchaseItem.rawPrice, this.rawPrice) && Intrinsics.wireman(purchaseItem.discount, this.discount) && Intrinsics.wireman(purchaseItem.buttonTitle, this.buttonTitle) && Intrinsics.wireman(purchaseItem.type, this.type) && purchaseItem.weight == this.weight && Intrinsics.wireman(purchaseItem.startTime, this.startTime) && Intrinsics.wireman(purchaseItem.endTime, this.endTime) && Intrinsics.wireman(purchaseItem.productId, this.productId) && Intrinsics.wireman(purchaseItem.productType, this.productType) && purchaseItem.duration == this.duration && Intrinsics.wireman(purchaseItem.promoteDescription, this.promoteDescription) && Intrinsics.wireman(purchaseItem.clientProductTitle, this.clientProductTitle) && Intrinsics.wireman(purchaseItem.strikeThroughPrice, this.strikeThroughPrice) && Intrinsics.wireman(purchaseItem.convertedPrice, this.convertedPrice);
    }

    public final void formularize(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.offerPrice = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r1v41, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((this.price.hashCode() * 31) + this.rawPrice.hashCode()) * 31) + this.discount.hashCode()) * 31) + this.buttonTitle.hashCode()) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.isHot)) * 31) + Integer.hashCode(this.isTrial)) * 31) + Integer.hashCode(this.weight)) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.productType.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + this.promoteDescription.hashCode()) * 31) + this.clientProductTitle.hashCode()) * 31) + this.strikeThroughPrice.hashCode()) * 31) + this.convertedPrice.hashCode()) * 31) + this.localFormattedPrice.hashCode()) * 31) + this.googleProductName.hashCode()) * 31) + this.offerId.hashCode()) * 31;
        boolean z = this.openOffer;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.offerPrice.hashCode();
    }

    public final void impassible(boolean z) {
        this.openOffer = z;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: marial, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final String getOfferPrice() {
        return this.offerPrice;
    }

    public final void taiyuan(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.googleProductName = str;
    }

    public String toString() {
        return "PurchaseItem(price=" + this.price + ", rawPrice=" + this.rawPrice + ", discount=" + this.discount + ", buttonTitle=" + this.buttonTitle + ", type=" + this.type + ", isHot=" + this.isHot + ", isTrial=" + this.isTrial + ", weight=" + this.weight + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", productName=" + this.productName + ", productId=" + this.productId + ", productType=" + this.productType + ", duration=" + this.duration + ", promoteDescription=" + this.promoteDescription + ", clientProductTitle=" + this.clientProductTitle + ", strikeThroughPrice=" + this.strikeThroughPrice + ", convertedPrice=" + this.convertedPrice + ", localFormattedPrice=" + this.localFormattedPrice + ", googleProductName=" + this.googleProductName + ", offerId=" + this.offerId + ", openOffer=" + this.openOffer + ", offerPrice=" + this.offerPrice + ')';
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final Number getPrice() {
        return this.price;
    }

    public PurchaseItem(Number price, Number rawPrice, String discount, String buttonTitle, String type, int i, int i2, int i3, String startTime, String endTime, String productName, String productId, String productType, int i4, String promoteDescription, String clientProductTitle, String strikeThroughPrice, String convertedPrice, String localFormattedPrice, String googleProductName, String offerId, boolean z, String offerPrice) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(rawPrice, "rawPrice");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(startTime, "startTime");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(promoteDescription, "promoteDescription");
        Intrinsics.checkNotNullParameter(clientProductTitle, "clientProductTitle");
        Intrinsics.checkNotNullParameter(strikeThroughPrice, "strikeThroughPrice");
        Intrinsics.checkNotNullParameter(convertedPrice, "convertedPrice");
        Intrinsics.checkNotNullParameter(localFormattedPrice, "localFormattedPrice");
        Intrinsics.checkNotNullParameter(googleProductName, "googleProductName");
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(offerPrice, "offerPrice");
        this.price = price;
        this.rawPrice = rawPrice;
        this.discount = discount;
        this.buttonTitle = buttonTitle;
        this.type = type;
        this.isHot = i;
        this.isTrial = i2;
        this.weight = i3;
        this.startTime = startTime;
        this.endTime = endTime;
        this.productName = productName;
        this.productId = productId;
        this.productType = productType;
        this.duration = i4;
        this.promoteDescription = promoteDescription;
        this.clientProductTitle = clientProductTitle;
        this.strikeThroughPrice = strikeThroughPrice;
        this.convertedPrice = convertedPrice;
        this.localFormattedPrice = localFormattedPrice;
        this.googleProductName = googleProductName;
        this.offerId = offerId;
        this.openOffer = z;
        this.offerPrice = offerPrice;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PurchaseItem(Number number, Number number2, String str, String str2, String str3, int i, int i2, int i3, String str4, String str5, String str6, String str7, String str8, int i4, String str9, String str10, String str11, String str12, String str13, String str14, String str15, boolean z, String str16, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        Number number3 = 0;
        this((i5 & 1) != 0 ? number3 : number, (i5 & 2) == 0 ? number2 : 0, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? "" : str2, (i5 & 16) != 0 ? "" : str3, (i5 & 32) != 0 ? 0 : i, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? "" : str4, (i5 & 512) != 0 ? "" : str5, (i5 & 1024) != 0 ? "" : str6, (i5 & 2048) != 0 ? "" : str7, (i5 & 4096) != 0 ? "" : str8, (i5 & 8192) != 0 ? 0 : i4, (i5 & 16384) != 0 ? "" : str9, (i5 & 32768) != 0 ? "" : str10, (i5 & 65536) != 0 ? "" : str11, (i5 & 131072) != 0 ? "" : str12, (i5 & Opcodes.ASM4) != 0 ? "" : str13, (i5 & Opcodes.ASM8) != 0 ? "" : str14, (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? "" : str15, (i5 & 2097152) != 0 ? false : z, (i5 & 4194304) != 0 ? "" : str16);
    }
}
