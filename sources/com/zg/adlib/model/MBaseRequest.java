package com.zg.adlib.model;

import com.google.gson.annotations.SerializedName;
import com.p004ironsource.d9;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.zg.adlib.ZGAd;
import com.zg.adlib.storage.AppPreferences;
import com.zg.adlib.util.AppUtil;
import com.zg.adlib.util.FunctionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/zg/adlib/model/MBaseRequest;", "", d9.h.G, "", "mac", "language", "package_name", "app_version", "org", "channel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDevice", "()Ljava/lang/String;", "getMac", "getLanguage", "getPackage_name", "getApp_version", "getOrg", "getChannel", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MBaseRequest {

    @SerializedName("app_version")
    private final String app_version;

    @SerializedName("channel")
    private final String channel;

    @SerializedName(d9.h.G)
    private final String device;

    @SerializedName("langue")
    private final String language;

    @SerializedName("mac")
    private final String mac;

    @SerializedName("org")
    private final String org;

    @SerializedName("package_name")
    private final String package_name;

    public MBaseRequest() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getMac() {
        return this.mac;
    }

    public final String getOrg() {
        return this.org;
    }

    public final String getPackage_name() {
        return this.package_name;
    }

    public MBaseRequest(String device, String mac, String language, String package_name, String app_version, String org2, String channel) {
        Intrinsics.f(device, "device");
        Intrinsics.f(mac, "mac");
        Intrinsics.f(language, "language");
        Intrinsics.f(package_name, "package_name");
        Intrinsics.f(app_version, "app_version");
        Intrinsics.f(org2, "org");
        Intrinsics.f(channel, "channel");
        this.device = device;
        this.mac = mac;
        this.language = language;
        this.package_name = package_name;
        this.app_version = app_version;
        this.org = org2;
        this.channel = channel;
    }

    public /* synthetic */ MBaseRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? d9.d : str, (i2 & 2) != 0 ? AppPreferences.INSTANCE.getDeviceId() : str2, (i2 & 4) != 0 ? FunctionsKt.languageTAG() : str3, (i2 & 8) != 0 ? ZGAd.getInstance().getContext().getPackageName() : str4, (i2 & 16) != 0 ? AppUtil.INSTANCE.getAppVersionName() : str5, (i2 & 32) != 0 ? "svpn" : str6, (i2 & 64) != 0 ? AndroidStaticDeviceInfoDataSource.STORE_GOOGLE : str7);
    }
}
