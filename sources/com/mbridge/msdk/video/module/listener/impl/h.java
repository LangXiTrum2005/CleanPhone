package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class h extends k {
    public h(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        if (i10 == 100) {
            j();
            h();
            i();
            b(2);
        } else if (i10 == 109) {
            a(2);
        } else if (i10 == 122) {
            g();
        } else if (i10 != 129) {
            String str = "";
            if (i10 == 118) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                a(3, str);
            } else if (i10 == 119) {
                if (obj != null && (obj instanceof String)) {
                    str = (String) obj;
                }
                a(4, str);
            }
        } else {
            CampaignEx campaignEx = this.f37791b;
            if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 2) {
                j();
                h();
                i();
                b(1);
            }
        }
        super.a(i10, obj);
    }
}
