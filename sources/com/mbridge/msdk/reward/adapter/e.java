package com.mbridge.msdk.reward.adapter;

import android.text.TextUtils;
import com.ironsource.C0594u;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f35408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.videocommon.setting.c f35409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f35410e;

    public e(String str, String str2, boolean z10, com.mbridge.msdk.videocommon.setting.c cVar, String str3) {
        this.f35406a = str;
        this.f35407b = str2;
        this.f35408c = z10;
        this.f35409d = cVar;
        this.f35410e = str3;
    }

    public com.mbridge.msdk.foundation.same.net.wrapper.e a(boolean z10, String str, int i10, String str2, String str3, String str4, String str5, boolean z11, int i11) {
        int iE;
        int iB;
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.n().b() + com.mbridge.msdk.foundation.controller.c.n().c());
        int i12 = z10 ? 2 : 3;
        com.mbridge.msdk.videocommon.setting.c cVar = this.f35409d;
        if (cVar != null) {
            iE = cVar.e();
            iB = this.f35409d.b();
        } else {
            iE = 0;
            iB = 0;
        }
        String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.f35407b, C0594u.f30746j);
        int i13 = this.f35408c ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94;
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.APP_ID, strB);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f35407b);
        if (!TextUtils.isEmpty(this.f35406a)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f35406a);
        }
        if (com.mbridge.msdk.util.b.a()) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ttc_ids", str4 == null ? "" : str4);
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "install_ids", str3 == null ? "" : str3);
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "req_type", String.valueOf(i12));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", String.valueOf(iE));
        if (this.f35408c) {
            iB = 1;
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "tnum", String.valueOf(iB));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f33882g, strA);
        String str6 = com.mbridge.msdk.foundation.same.net.wrapper.e.f33883h;
        if (str == null) {
            str = "";
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, str6, str);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, String.valueOf(1));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f33884i, str2 == null ? "" : str2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", String.valueOf(i13));
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "offset", String.valueOf(i10));
        if (!TextUtils.isEmpty(str5)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "token", str5);
        }
        if (this.f35408c) {
            if (i11 == com.mbridge.msdk.foundation.same.a.I || i11 == com.mbridge.msdk.foundation.same.a.H) {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ivrwd", "1");
            } else {
                com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ivrwd", "0");
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar2 = this.f35409d;
        if (cVar2 != null && !TextUtils.isEmpty(cVar2.a())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "u_stid", this.f35409d.a());
        }
        com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
        if (aVarC != null && !TextUtils.isEmpty(aVarC.a())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "r_stid", aVarC.a());
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "rw_plus", z11 ? "1" : "0");
        String strD = v0.d(this.f35407b);
        if (!TextUtils.isEmpty(strD)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "j", strD);
        }
        String str7 = this.f35410e;
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, str7 != null ? str7 : "");
        return eVar;
    }
}
