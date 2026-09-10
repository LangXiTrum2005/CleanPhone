package ammonoid;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import com.ironsource.L6;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ammonoid.attabal, reason: from toString */
/* JADX INFO: compiled from: VipStatusResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bH\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010#R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010#R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u00104R\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010 \u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010#R\"\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u0010\u001b\"\u0004\b=\u00104R\"\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u00101\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u00104R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u00101\u001a\u0004\b\u000e\u0010\u001b\"\u0004\bB\u00104R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\b\u001f\u0010E\"\u0004\bF\u0010GR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010 \u001a\u0004\bI\u0010\u0019\"\u0004\bJ\u0010#R\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u00101\u001a\u0004\bL\u0010\u001b\"\u0004\bM\u00104R\"\u0010\u0013\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010D\u001a\u0004\bO\u0010E\"\u0004\bP\u0010GR\"\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010D\u001a\u0004\bR\u0010E\"\u0004\bS\u0010GR\"\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u00101\u001a\u0004\bU\u0010\u001b\"\u0004\bV\u00104¨\u0006W"}, d2 = {"Lammonoid/attabal;", "", "", "uid", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "startTime", "expireTime", "", "autoRenewing", "requestTime", "periodType", "purchaseState", "inGracePeriod", "isTrialPeriod", "", "isVip", "type", L6.H, "useVipServer", "disableAd", "vipLevel", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJIJLjava/lang/String;IIIZLjava/lang/String;IZZI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/String;", "getUid", "setUid", "(Ljava/lang/String;)V", "saneness", "getProductId", "setProductId", "dern", "J", "getStartTime", "()J", "setStartTime", "(J)V", "wireman", "getExpireTime", "setExpireTime", "marial", "I", "getAutoRenewing", "setAutoRenewing", "(I)V", "beachfront", "getRequestTime", "setRequestTime", "competently", "getPeriodType", "setPeriodType", "impromptu", "getPurchaseState", "setPurchaseState", "taiyuan", "getInGracePeriod", "setInGracePeriod", "cutely", "setTrialPeriod", "apical", "Z", "()Z", "setVip", "(Z)V", "formularize", "getType", "setType", "impassible", "getPlatform", "setPlatform", "triweekly", "getUseVipServer", "setUseVipServer", "kowloon", "getDisableAd", "setDisableAd", "arytenoidectomy", "getVipLevel", "setVipLevel", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VipStatusResponse {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_vip")
    private boolean isVip;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("vip_level")
    private int vipLevel;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("uid")
    private String uid;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("request_time")
    private long requestTime;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("period_type")
    private String periodType;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_trial_period")
    private int isTrialPeriod;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("start")
    private long startTime;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("type")
    private String type;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(L6.H)
    private int platform;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("purchase_state")
    private int purchaseState;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("disable_ad")
    private boolean disableAd;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("auto_renewing")
    private int autoRenewing;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("product_id")
    private String productId;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("in_grace_period")
    private int inGracePeriod;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("use_vip_server")
    private boolean useVipServer;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("expire")
    private long expireTime;

    public VipStatusResponse() {
        this(null, null, 0L, 0L, 0, 0L, null, 0, 0, 0, false, null, 0, false, false, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final boolean getIsVip() {
        return this.isVip;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipStatusResponse)) {
            return false;
        }
        VipStatusResponse vipStatusResponse = (VipStatusResponse) other;
        return Intrinsics.wireman(this.uid, vipStatusResponse.uid) && Intrinsics.wireman(this.productId, vipStatusResponse.productId) && this.startTime == vipStatusResponse.startTime && this.expireTime == vipStatusResponse.expireTime && this.autoRenewing == vipStatusResponse.autoRenewing && this.requestTime == vipStatusResponse.requestTime && Intrinsics.wireman(this.periodType, vipStatusResponse.periodType) && this.purchaseState == vipStatusResponse.purchaseState && this.inGracePeriod == vipStatusResponse.inGracePeriod && this.isTrialPeriod == vipStatusResponse.isTrialPeriod && this.isVip == vipStatusResponse.isVip && Intrinsics.wireman(this.type, vipStatusResponse.type) && this.platform == vipStatusResponse.platform && this.useVipServer == vipStatusResponse.useVipServer && this.disableAd == vipStatusResponse.disableAd && this.vipLevel == vipStatusResponse.vipLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.uid.hashCode() * 31) + this.productId.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.expireTime)) * 31) + Integer.hashCode(this.autoRenewing)) * 31) + Long.hashCode(this.requestTime)) * 31) + this.periodType.hashCode()) * 31) + Integer.hashCode(this.purchaseState)) * 31) + Integer.hashCode(this.inGracePeriod)) * 31) + Integer.hashCode(this.isTrialPeriod)) * 31;
        boolean z = this.isVip;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((iHashCode + r1) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.platform)) * 31;
        boolean z2 = this.useVipServer;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        boolean z3 = this.disableAd;
        return ((i + (z3 ? 1 : z3)) * 31) + Integer.hashCode(this.vipLevel);
    }

    public String toString() {
        return "VipStatusResponse(uid=" + this.uid + ", productId=" + this.productId + ", startTime=" + this.startTime + ", expireTime=" + this.expireTime + ", autoRenewing=" + this.autoRenewing + ", requestTime=" + this.requestTime + ", periodType=" + this.periodType + ", purchaseState=" + this.purchaseState + ", inGracePeriod=" + this.inGracePeriod + ", isTrialPeriod=" + this.isTrialPeriod + ", isVip=" + this.isVip + ", type=" + this.type + ", platform=" + this.platform + ", useVipServer=" + this.useVipServer + ", disableAd=" + this.disableAd + ", vipLevel=" + this.vipLevel + ')';
    }

    public VipStatusResponse(String uid, String productId, long j, long j2, int i, long j3, String periodType, int i2, int i3, int i4, boolean z, String type, int i5, boolean z2, boolean z3, int i6) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(periodType, "periodType");
        Intrinsics.checkNotNullParameter(type, "type");
        this.uid = uid;
        this.productId = productId;
        this.startTime = j;
        this.expireTime = j2;
        this.autoRenewing = i;
        this.requestTime = j3;
        this.periodType = periodType;
        this.purchaseState = i2;
        this.inGracePeriod = i3;
        this.isTrialPeriod = i4;
        this.isVip = z;
        this.type = type;
        this.platform = i5;
        this.useVipServer = z2;
        this.disableAd = z3;
        this.vipLevel = i6;
    }

    public /* synthetic */ VipStatusResponse(String str, String str2, long j, long j2, int i, long j3, String str3, int i2, int i3, int i4, boolean z, String str4, int i5, boolean z2, boolean z3, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? 0L : j, (i7 & 8) != 0 ? 0L : j2, (i7 & 16) != 0 ? 0 : i, (i7 & 32) == 0 ? j3 : 0L, (i7 & 64) != 0 ? "" : str3, (i7 & 128) != 0 ? 0 : i2, (i7 & 256) != 0 ? 0 : i3, (i7 & 512) != 0 ? 0 : i4, (i7 & 1024) != 0 ? false : z, (i7 & 2048) == 0 ? str4 : "", (i7 & 4096) != 0 ? 0 : i5, (i7 & 8192) != 0 ? false : z2, (i7 & 16384) != 0 ? false : z3, (i7 & 32768) != 0 ? 0 : i6);
    }
}
