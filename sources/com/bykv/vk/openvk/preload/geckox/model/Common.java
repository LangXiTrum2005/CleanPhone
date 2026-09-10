package com.bykv.vk.openvk.preload.geckox.model;

import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.fl;
import com.p004ironsource.ne;
import com.smartdigimkt.b0.a;
import com.zg.adlib.storage.AppPreferencesKeys;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Common {
    public String ac;
    public long aid;
    public String appName;
    public String appVersion;
    public String deviceId;
    public String deviceModel;
    public String devicePlatform;
    public int os = 0;
    public String osVersion;
    public String region;
    public String sdkVersion;
    public String uid;

    public Common() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        this.osVersion = sb.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
    }

    public JSONObject toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(fl.f25027b, this.aid);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put(ne.f26256E, this.os);
            jSONObject.put(AppPreferencesKeys.DEVICE_ID, this.deviceId);
            jSONObject.put("app_name", this.appName);
            jSONObject.put("ac", this.ac);
            jSONObject.put(a.h1, this.osVersion);
            jSONObject.put("device_model", this.deviceModel);
            jSONObject.put("device_platform", this.devicePlatform);
            jSONObject.put(a.s1, this.sdkVersion);
            jSONObject.put(TtmlNode.TAG_REGION, this.region);
            jSONObject.put("uid", this.uid);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Common(long j, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        this.osVersion = sb.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
    }

    public Common(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        this.osVersion = sb.toString();
        this.deviceModel = Build.MODEL;
        this.devicePlatform = "android";
        this.sdkVersion = "2.0.3-rc.9-pangle";
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
