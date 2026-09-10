package com.yolo.networklibrary.common.model;

import com.google.gson.annotations.SerializedName;
import com.ironsource.C3414a2;
import com.ironsource.L6;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001Bó\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010)R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010&\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010)R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010&\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010)R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010)R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010&\u001a\u0004\b1\u0010\u001e\"\u0004\b2\u0010)R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010&\u001a\u0004\b3\u0010\u001e\"\u0004\b.\u0010)R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010&\u001a\u0004\b5\u0010\u001e\"\u0004\b%\u0010)R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b\r\u0010>\"\u0004\b?\u0010@R\"\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010=\u001a\u0004\b\u000e\u0010>\"\u0004\bA\u0010@R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010&\u001a\u0004\bB\u0010\u001e\"\u0004\b6\u0010)R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010&\u001a\u0004\bD\u0010\u001e\"\u0004\b<\u0010)R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010&\u001a\u0004\bE\u0010\u001e\"\u0004\b4\u0010)R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010&\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010)R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010&\u001a\u0004\bJ\u0010\u001e\"\u0004\bF\u0010)R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010&\u001a\u0004\bL\u0010\u001e\"\u0004\bC\u0010)R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bM\u0010&\u001a\u0004\bN\u0010\u001e\"\u0004\bO\u0010)R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010&\u001a\u0004\bQ\u0010\u001e\"\u0004\bI\u0010)R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010&\u001a\u0004\bS\u0010\u001e\"\u0004\bR\u0010)R$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010&\u001a\u0004\bT\u0010\u001e\"\u0004\bK\u0010)R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010&\u001a\u0004\bU\u0010\u001e\"\u0004\bM\u0010)R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010&\u001a\u0004\bW\u0010\u001e\"\u0004\bP\u0010)¨\u0006X"}, d2 = {"Lcom/yolo/networklibrary/common/model/CommonRequest;", "", "", "did", L6.V0, "mcc", "mnc", "pkg", L6.q, "cv", "", "ts", "", "isRooted", "isVPNUsed", "phoneBrand", "phoneModel", "osVer", L6.F, "uid", "token", "utmSource", "utmCampaign", "utmMedium", "utmContent", "utmCountry", "utmCreativeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/String;", "getDid", "saneness", "(Ljava/lang/String;)V", "getGaid", "dern", "getMcc", "marial", "wireman", "getMnc", "beachfront", "getPkg", "cutely", "getLang", "competently", "getCv", "impromptu", "J", "getTs", "()J", "impassible", "(J)V", "taiyuan", "Z", "()Z", "apical", "(Z)V", "adultoid", "getPhoneBrand", "formularize", "getPhoneModel", "getOsVer", "triweekly", "getOs", "setOs", "kowloon", "getUid", "arytenoidectomy", "getToken", "monoploid", "getUtmSource", "graveside", "polloi", "getUtmCampaign", "molybdenite", "getUtmMedium", "getUtmContent", "getUtmCountry", "dovishness", "getUtmCreativeId", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CommonRequest {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("utm_country")
    private String utmCountry;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("phone_brand")
    private String phoneBrand;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("token")
    private String token;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("did")
    private String did;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(L6.q)
    private String lang;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("cv")
    private String cv;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_vpn_used")
    private boolean isVPNUsed;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("mcc")
    private String mcc;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("utm_creative_id")
    private String utmCreativeId;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("phone_model")
    private String phoneModel;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("utm_content")
    private String utmContent;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("os_ver")
    private String osVer;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("ts")
    private long ts;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("uid")
    private String uid;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("pkg")
    private String pkg;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("utm_medium")
    private String utmMedium;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("utm_source")
    private String utmSource;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("utm_campaign")
    private String utmCampaign;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(L6.V0)
    private String gaid;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("is_rooted")
    private boolean isRooted;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName(L6.F)
    private String os;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("mnc")
    private String mnc;

    public CommonRequest() {
        this(null, null, null, null, null, null, null, 0L, false, false, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public final void adultoid(boolean z) {
        this.isVPNUsed = z;
    }

    public final void apical(boolean z) {
        this.isRooted = z;
    }

    public final void arytenoidectomy(String str) {
        this.utmContent = str;
    }

    public final void attabal(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cv = str;
    }

    public final void beachfront(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mnc = str;
    }

    public final void competently(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.osVer = str;
    }

    public final void cutely(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pkg = str;
    }

    public final void dern(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.gaid = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonRequest)) {
            return false;
        }
        CommonRequest commonRequest = (CommonRequest) other;
        return Intrinsics.wireman(this.did, commonRequest.did) && Intrinsics.wireman(this.gaid, commonRequest.gaid) && Intrinsics.wireman(this.mcc, commonRequest.mcc) && Intrinsics.wireman(this.mnc, commonRequest.mnc) && Intrinsics.wireman(this.pkg, commonRequest.pkg) && Intrinsics.wireman(this.lang, commonRequest.lang) && Intrinsics.wireman(this.cv, commonRequest.cv) && this.ts == commonRequest.ts && this.isRooted == commonRequest.isRooted && this.isVPNUsed == commonRequest.isVPNUsed && Intrinsics.wireman(this.phoneBrand, commonRequest.phoneBrand) && Intrinsics.wireman(this.phoneModel, commonRequest.phoneModel) && Intrinsics.wireman(this.osVer, commonRequest.osVer) && Intrinsics.wireman(this.os, commonRequest.os) && Intrinsics.wireman(this.uid, commonRequest.uid) && Intrinsics.wireman(this.token, commonRequest.token) && Intrinsics.wireman(this.utmSource, commonRequest.utmSource) && Intrinsics.wireman(this.utmCampaign, commonRequest.utmCampaign) && Intrinsics.wireman(this.utmMedium, commonRequest.utmMedium) && Intrinsics.wireman(this.utmContent, commonRequest.utmContent) && Intrinsics.wireman(this.utmCountry, commonRequest.utmCountry) && Intrinsics.wireman(this.utmCreativeId, commonRequest.utmCreativeId);
    }

    public final void formularize(String str) {
        this.token = str;
    }

    public final void graveside(String str) {
        this.utmSource = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.did.hashCode() * 31) + this.gaid.hashCode()) * 31) + this.mcc.hashCode()) * 31) + this.mnc.hashCode()) * 31) + this.pkg.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.cv.hashCode()) * 31) + Long.hashCode(this.ts)) * 31;
        boolean z = this.isRooted;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isVPNUsed;
        int iHashCode2 = (((((((((i + (z2 ? 1 : z2)) * 31) + this.phoneBrand.hashCode()) * 31) + this.phoneModel.hashCode()) * 31) + this.osVer.hashCode()) * 31) + this.os.hashCode()) * 31;
        String str = this.uid;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.token;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.utmSource;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.utmCampaign;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.utmMedium;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.utmContent;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.utmCountry;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.utmCreativeId;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void impassible(long j) {
        this.ts = j;
    }

    public final void impromptu(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneBrand = str;
    }

    public final void kowloon(String str) {
        this.utmCampaign = str;
    }

    public final void marial(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mcc = str;
    }

    public final void molybdenite(String str) {
        this.utmMedium = str;
    }

    public final void monoploid(String str) {
        this.utmCountry = str;
    }

    public final void polloi(String str) {
        this.utmCreativeId = str;
    }

    public final void saneness(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void taiyuan(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneModel = str;
    }

    public String toString() {
        return "CommonRequest(did=" + this.did + ", gaid=" + this.gaid + ", mcc=" + this.mcc + ", mnc=" + this.mnc + ", pkg=" + this.pkg + ", lang=" + this.lang + ", cv=" + this.cv + ", ts=" + this.ts + ", isRooted=" + this.isRooted + ", isVPNUsed=" + this.isVPNUsed + ", phoneBrand=" + this.phoneBrand + ", phoneModel=" + this.phoneModel + ", osVer=" + this.osVer + ", os=" + this.os + ", uid=" + this.uid + ", token=" + this.token + ", utmSource=" + this.utmSource + ", utmCampaign=" + this.utmCampaign + ", utmMedium=" + this.utmMedium + ", utmContent=" + this.utmContent + ", utmCountry=" + this.utmCountry + ", utmCreativeId=" + this.utmCreativeId + ')';
    }

    public final void triweekly(String str) {
        this.uid = str;
    }

    public final void wireman(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lang = str;
    }

    public CommonRequest(String did, String gaid, String mcc, String mnc, String pkg, String lang, String cv, long j, boolean z, boolean z2, String phoneBrand, String phoneModel, String osVer, String os, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(gaid, "gaid");
        Intrinsics.checkNotNullParameter(mcc, "mcc");
        Intrinsics.checkNotNullParameter(mnc, "mnc");
        Intrinsics.checkNotNullParameter(pkg, "pkg");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(cv, "cv");
        Intrinsics.checkNotNullParameter(phoneBrand, "phoneBrand");
        Intrinsics.checkNotNullParameter(phoneModel, "phoneModel");
        Intrinsics.checkNotNullParameter(osVer, "osVer");
        Intrinsics.checkNotNullParameter(os, "os");
        this.did = did;
        this.gaid = gaid;
        this.mcc = mcc;
        this.mnc = mnc;
        this.pkg = pkg;
        this.lang = lang;
        this.cv = cv;
        this.ts = j;
        this.isRooted = z;
        this.isVPNUsed = z2;
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
        this.osVer = osVer;
        this.os = os;
        this.uid = str;
        this.token = str2;
        this.utmSource = str3;
        this.utmCampaign = str4;
        this.utmMedium = str5;
        this.utmContent = str6;
        this.utmCountry = str7;
        this.utmCreativeId = str8;
    }

    public /* synthetic */ CommonRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? 0L : j, (i & 256) != 0 ? false : z, (i & 512) == 0 ? z2 : false, (i & 1024) != 0 ? "" : str8, (i & 2048) != 0 ? "" : str9, (i & 4096) != 0 ? "" : str10, (i & 8192) != 0 ? X3.d : str11, (i & 16384) != 0 ? "" : str12, (i & 32768) != 0 ? "" : str13, (i & 65536) != 0 ? "" : str14, (i & 131072) != 0 ? "" : str15, (i & Opcodes.ASM4) != 0 ? "" : str16, (i & Opcodes.ASM8) != 0 ? "" : str17, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? "" : str18, (i & 2097152) != 0 ? "" : str19);
    }
}
