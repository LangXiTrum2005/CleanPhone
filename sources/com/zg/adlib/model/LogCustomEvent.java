package com.zg.adlib.model;

import android.os.Build;
import androidx.datastore.preferences.protobuf.a;
import com.applovin.impl.Z;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.d9;
import com.p004ironsource.x4;
import com.zg.adlib.ZGAd;
import com.zg.adlib.util.AppUtil;
import com.zg.adlib.util.LanguageUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u0002000/j\b\u0012\u0004\u0012\u000200`1J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u009f\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u0010B\u001a\u00020\u00062\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0016\"\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0016¨\u0006G"}, d2 = {"Lcom/zg/adlib/model/LogCustomEvent;", "", "userId", "", "isVip", "canFloat", "", "canPost", d9.h.j0, "value_1", "value_2", "value_3", "isNewUser", "app_version", "package_name", "language", "country", "sdkVersion", "phoneModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "setVip", "getCanFloat", "()Z", "setCanFloat", "(Z)V", "getCanPost", "setCanPost", "getEventName", "setEventName", "getValue_1", "setValue_1", "getValue_2", "setValue_2", "getValue_3", "setValue_3", "getApp_version", "getPackage_name", "getLanguage", "getCountry", "getSdkVersion", "getPhoneModel", "generateMsgList", "Ljava/util/ArrayList;", "Lcom/zg/adlib/model/MKv;", "Lkotlin/collections/ArrayList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LogCustomEvent {
    private final String app_version;
    private boolean canFloat;
    private boolean canPost;
    private final String country;
    private String eventName;
    private final boolean isNewUser;
    private String isVip;
    private final String language;
    private final String package_name;
    private final String phoneModel;
    private final String sdkVersion;
    private String userId;
    private String value_1;
    private String value_2;
    private String value_3;

    public LogCustomEvent(String userId, String isVip, boolean z2, boolean z3, String eventName, String value_1, String value_2, String value_3, boolean z4, String app_version, String package_name, String language, String country, String sdkVersion, String phoneModel) {
        Intrinsics.f(userId, "userId");
        Intrinsics.f(isVip, "isVip");
        Intrinsics.f(eventName, "eventName");
        Intrinsics.f(value_1, "value_1");
        Intrinsics.f(value_2, "value_2");
        Intrinsics.f(value_3, "value_3");
        Intrinsics.f(app_version, "app_version");
        Intrinsics.f(package_name, "package_name");
        Intrinsics.f(language, "language");
        Intrinsics.f(country, "country");
        Intrinsics.f(sdkVersion, "sdkVersion");
        Intrinsics.f(phoneModel, "phoneModel");
        this.userId = userId;
        this.isVip = isVip;
        this.canFloat = z2;
        this.canPost = z3;
        this.eventName = eventName;
        this.value_1 = value_1;
        this.value_2 = value_2;
        this.value_3 = value_3;
        this.isNewUser = z4;
        this.app_version = app_version;
        this.package_name = package_name;
        this.language = language;
        this.country = country;
        this.sdkVersion = sdkVersion;
        this.phoneModel = phoneModel;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPackage_name() {
        return this.package_name;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPhoneModel() {
        return this.phoneModel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIsVip() {
        return this.isVip;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCanFloat() {
        return this.canFloat;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCanPost() {
        return this.canPost;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getValue_1() {
        return this.value_1;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getValue_2() {
        return this.value_2;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getValue_3() {
        return this.value_3;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsNewUser() {
        return this.isNewUser;
    }

    public final LogCustomEvent copy(String userId, String isVip, boolean canFloat, boolean canPost, String eventName, String value_1, String value_2, String value_3, boolean isNewUser, String app_version, String package_name, String language, String country, String sdkVersion, String phoneModel) {
        Intrinsics.f(userId, "userId");
        Intrinsics.f(isVip, "isVip");
        Intrinsics.f(eventName, "eventName");
        Intrinsics.f(value_1, "value_1");
        Intrinsics.f(value_2, "value_2");
        Intrinsics.f(value_3, "value_3");
        Intrinsics.f(app_version, "app_version");
        Intrinsics.f(package_name, "package_name");
        Intrinsics.f(language, "language");
        Intrinsics.f(country, "country");
        Intrinsics.f(sdkVersion, "sdkVersion");
        Intrinsics.f(phoneModel, "phoneModel");
        return new LogCustomEvent(userId, isVip, canFloat, canPost, eventName, value_1, value_2, value_3, isNewUser, app_version, package_name, language, country, sdkVersion, phoneModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogCustomEvent)) {
            return false;
        }
        LogCustomEvent logCustomEvent = (LogCustomEvent) other;
        return Intrinsics.a(this.userId, logCustomEvent.userId) && Intrinsics.a(this.isVip, logCustomEvent.isVip) && this.canFloat == logCustomEvent.canFloat && this.canPost == logCustomEvent.canPost && Intrinsics.a(this.eventName, logCustomEvent.eventName) && Intrinsics.a(this.value_1, logCustomEvent.value_1) && Intrinsics.a(this.value_2, logCustomEvent.value_2) && Intrinsics.a(this.value_3, logCustomEvent.value_3) && this.isNewUser == logCustomEvent.isNewUser && Intrinsics.a(this.app_version, logCustomEvent.app_version) && Intrinsics.a(this.package_name, logCustomEvent.package_name) && Intrinsics.a(this.language, logCustomEvent.language) && Intrinsics.a(this.country, logCustomEvent.country) && Intrinsics.a(this.sdkVersion, logCustomEvent.sdkVersion) && Intrinsics.a(this.phoneModel, logCustomEvent.phoneModel);
    }

    public final ArrayList<MKv> generateMsgList() {
        ArrayList<MKv> arrayList = new ArrayList<>();
        arrayList.add(new MKv("userId", this.userId));
        arrayList.add(new MKv("isVip", this.isVip));
        arrayList.add(new MKv("canFloat", String.valueOf(this.canFloat)));
        arrayList.add(new MKv("canPost", String.valueOf(this.canPost)));
        arrayList.add(new MKv(d9.h.j0, this.eventName));
        arrayList.add(new MKv("value_1", this.value_1));
        arrayList.add(new MKv("value_2", this.value_2));
        arrayList.add(new MKv("value_3", this.value_3));
        arrayList.add(new MKv("isNewUser", String.valueOf(this.isNewUser)));
        arrayList.add(new MKv("app_version", this.app_version));
        arrayList.add(new MKv("package_name", this.package_name));
        arrayList.add(new MKv("language", this.language));
        arrayList.add(new MKv("country", this.country));
        arrayList.add(new MKv("sdkVersion", this.sdkVersion));
        arrayList.add(new MKv("phoneModel", this.phoneModel));
        return arrayList;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final boolean getCanFloat() {
        return this.canFloat;
    }

    public final boolean getCanPost() {
        return this.canPost;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getPackage_name() {
        return this.package_name;
    }

    public final String getPhoneModel() {
        return this.phoneModel;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getValue_1() {
        return this.value_1;
    }

    public final String getValue_2() {
        return this.value_2;
    }

    public final String getValue_3() {
        return this.value_3;
    }

    public int hashCode() {
        return this.phoneModel.hashCode() + a.b(this.sdkVersion, a.b(this.country, a.b(this.language, a.b(this.package_name, a.b(this.app_version, Z.e(this.isNewUser, a.b(this.value_3, a.b(this.value_2, a.b(this.value_1, a.b(this.eventName, Z.e(this.canPost, Z.e(this.canFloat, a.b(this.isVip, this.userId.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isNewUser() {
        return this.isNewUser;
    }

    public final String isVip() {
        return this.isVip;
    }

    public final void setCanFloat(boolean z2) {
        this.canFloat = z2;
    }

    public final void setCanPost(boolean z2) {
        this.canPost = z2;
    }

    public final void setEventName(String str) {
        Intrinsics.f(str, "<set-?>");
        this.eventName = str;
    }

    public final void setUserId(String str) {
        Intrinsics.f(str, "<set-?>");
        this.userId = str;
    }

    public final void setValue_1(String str) {
        Intrinsics.f(str, "<set-?>");
        this.value_1 = str;
    }

    public final void setValue_2(String str) {
        Intrinsics.f(str, "<set-?>");
        this.value_2 = str;
    }

    public final void setValue_3(String str) {
        Intrinsics.f(str, "<set-?>");
        this.value_3 = str;
    }

    public final void setVip(String str) {
        Intrinsics.f(str, "<set-?>");
        this.isVip = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LogCustomEvent(userId=");
        sb.append(this.userId);
        sb.append(", isVip=");
        sb.append(this.isVip);
        sb.append(", canFloat=");
        sb.append(this.canFloat);
        sb.append(", canPost=");
        sb.append(this.canPost);
        sb.append(", eventName=");
        sb.append(this.eventName);
        sb.append(", value_1=");
        sb.append(this.value_1);
        sb.append(", value_2=");
        sb.append(this.value_2);
        sb.append(", value_3=");
        sb.append(this.value_3);
        sb.append(", isNewUser=");
        sb.append(this.isNewUser);
        sb.append(", app_version=");
        sb.append(this.app_version);
        sb.append(", package_name=");
        sb.append(this.package_name);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", sdkVersion=");
        sb.append(this.sdkVersion);
        sb.append(", phoneModel=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.phoneModel, ')');
    }

    public /* synthetic */ LogCustomEvent(String str, String str2, boolean z2, boolean z3, String str3, String str4, String str5, String str6, boolean z4, String str7, String str8, String str9, String str10, String str11, String str12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z2, z3, str3, str4, str5, str6, z4, (i2 & 512) != 0 ? AppUtil.INSTANCE.getAppVersionName() : str7, (i2 & 1024) != 0 ? ZGAd.getInstance().getContext().getPackageName() : str8, (i2 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? LanguageUtil.INSTANCE.getDefaultLanguageTag() : str9, (i2 & 4096) != 0 ? ZGAd.getInstance().getCountry() : str10, (i2 & Segment.SIZE) != 0 ? String.valueOf(Build.VERSION.SDK_INT) : str11, (i2 & 16384) != 0 ? Build.DEVICE : str12);
    }
}
