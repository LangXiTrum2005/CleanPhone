package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.applovin.impl.Z;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.smartdigimkt.b0.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ekw implements rc {
    private static final Map<Integer, String> lnr = new HashMap<Integer, String>(12) { // from class: com.bytedance.sdk.openadsdk.core.ekw.1
        {
            put(1, "abtest");
            put(2, "user_data");
            put(3, "gaid");
            put(4, "apk-sign");
            put(5, "screen_scale");
            put(6, "app_set_id_scope");
            put(7, "app_set_id");
            put(8, "installed_source");
            put(9, "app_running_time");
            put(10, "vendor");
            put(11, "model");
            put(12, "user_agent_device");
            put(13, "user_agent_webview");
            put(14, "sys_compiling_time");
            put(15, "sec_did");
            put(16, "url");
            put(17, "X-Argus");
            put(18, "X-Ladon");
            put(19, "X-Khronos");
            put(20, "X-Gorgon");
            put(21, "pangle_m");
            put(22, "screen_height");
            put(23, "screen_width");
            put(24, "rom_version");
            put(25, "carrier_name");
            put(26, a.h1);
            put(27, "conn_type");
            put(28, "boot");
            put(29, "feature_data");
            put(30, "t_ver");
            put(31, "aab");
            put(32, "w_ver");
            put(33, "is_fold");
            put(34, "abi");
            put(35, "is_multi");
        }
    };
    String qdl = "com.union_test.internationad";
    String ud = "8025677";
    private int mml = 0;

    public static void jpc() {
        try {
            com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ekw.4
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    return Z.i("bidding_token");
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAdManagerImpl", th.getMessage());
        }
    }

    public static void mo() {
        try {
            com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ekw.2
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    return Z.i("bidding_token");
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAdManagerImpl", th.getMessage());
        }
    }

    private boolean tvp() {
        return "TX".equals(com.bytedance.sdk.openadsdk.core.settings.rq.lnr().gt()) || TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.rq.lnr().gt());
    }

    public static void wd() {
        try {
            com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.ekw.3
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    return Z.i("bidding_token");
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.lnr("TTAdManagerImpl", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public String lnr() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    /* JADX INFO: renamed from: mml, reason: merged with bridge method [inline-methods] */
    public ekw qdl(String str) {
        tvp.ud().qdl(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    /* JADX INFO: renamed from: mzz, reason: merged with bridge method [inline-methods] */
    public ekw ud(String str) {
        tvp.ud().lnr(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public rc lnr(int i2) {
        this.mml = i2;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public int mml() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public rc mzz(int i2) {
        tvp.ud().mzz(i2);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public rc qdl(int i2) {
        tvp.ud().mo(i2);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public rc ud(int i2) {
        tvp.ud().mml(i2);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public rc lnr(String str) {
        tvp.ud().jpc(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public rc mml(int i2) {
        tvp.ud().lnr(i2);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public int mzz() {
        return tvp.ud().rq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public rc qdl() {
        com.bytedance.sdk.component.utils.bjy.qdl("PangleSDK-7702");
        com.bykv.vk.openvk.qdl.qdl.qdl.wd.lnr.qdl("PangleSDK-7702");
        com.bytedance.sdk.component.utils.aaj.qdl("PangleSDK-7702");
        com.bytedance.sdk.component.utils.bjy.ud();
        com.bytedance.sdk.component.wd.qdl.qdl();
        com.bykv.vk.openvk.qdl.qdl.qdl.wd.lnr.qdl();
        com.bytedance.sdk.component.utils.aaj.qdl();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public int ud() {
        return tvp.ud().to();
    }

    private JSONObject ud(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1 A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ef A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f5 A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0101 A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0123 A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0130 A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x020a A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0233  */
    /* JADX WARN: Code duplicated, block: B:67:0x029c A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:70:0x02a5 A[Catch: all -> 0x02bc, TryCatch #0 {all -> 0x02bc, blocks: (B:3:0x000a, B:5:0x0017, B:7:0x001d, B:9:0x0023, B:11:0x0031, B:18:0x004c, B:20:0x0050, B:22:0x005a, B:24:0x005e, B:27:0x0082, B:28:0x0096, B:30:0x00b1, B:34:0x00d0, B:33:0x00bf, B:35:0x00d7, B:37:0x00ef, B:41:0x0106, B:43:0x0123, B:45:0x0130, B:46:0x0139, B:48:0x020a, B:49:0x021a, B:52:0x0236, B:54:0x0241, B:55:0x0253, B:57:0x0260, B:60:0x026d, B:62:0x0273, B:64:0x0280, B:65:0x0296, B:67:0x029c, B:68:0x029f, B:70:0x02a5, B:71:0x02b1, B:38:0x00f5, B:40:0x0101, B:14:0x003c, B:16:0x0042), top: B:75:0x000a }] */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (com.bytedance.sdk.openadsdk.core.yt.mml().koa(r5) == false) goto L18;
     */
    @Override // com.bytedance.sdk.openadsdk.core.rc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String qdl(com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest r19) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ekw.qdl(com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest):java.lang.String");
    }

    private JSONObject qdl(JSONObject jSONObject, boolean z2) {
        JSONObject jSONObjectQdl;
        if (z2) {
            jSONObjectQdl = PangleEncryptManager.encryptType4(jSONObject, new bch(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
            uw.qdl(jSONObjectQdl);
        } else {
            jSONObjectQdl = com.bytedance.sdk.component.utils.qdl.qdl(jSONObject);
        }
        return jSONObjectQdl != null ? jSONObjectQdl : new JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.rc
    public boolean qdl(String str, int i2, String str2, String str3, String str4) {
        if (!this.qdl.equals(yt.qdl().getPackageName()) || !this.ud.equals(tvp.ud().mml()) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.component.reward.to.qdl(str, i2, str2, str3, str4);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }
}
