package com.mbridge.msdk.video.module.listener.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class d extends k {
    public d(CampaignEx campaignEx, com.mbridge.msdk.videocommon.download.a aVar, com.mbridge.msdk.videocommon.entity.c cVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (this.f37790a) {
            try {
                CampaignEx campaignEx = this.f37791b;
                if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
                    a(obj.toString());
                }
            } catch (Exception unused) {
            }
            if (i10 != 105 && i10 != 106 && i10 != 113) {
                if (i10 == 122) {
                    g();
                    return;
                }
                switch (i10) {
                    case InterfaceC0435l1.d.b.f29110g /* 109 */:
                        a(2);
                        b(2);
                        break;
                    case InterfaceC0435l1.d.b.f29111h /* 110 */:
                        a(1);
                        b(1);
                        break;
                    case InterfaceC0435l1.d.b.f29112i /* 111 */:
                        b(1);
                        break;
                }
            }
            com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b);
            if (i10 != 105) {
                String noticeUrl = this.f37791b.getNoticeUrl();
                if (!TextUtils.isEmpty(noticeUrl)) {
                    if (noticeUrl.contains(com.mbridge.msdk.foundation.same.a.f33726m)) {
                        noticeUrl = noticeUrl.replace(q4.a.j(new StringBuilder(), com.mbridge.msdk.foundation.same.a.f33726m, X3.j.f27830b, Uri.parse(noticeUrl).getQueryParameter(com.mbridge.msdk.foundation.same.a.f33726m)), com.mbridge.msdk.foundation.same.a.f33726m + "=2");
                    } else {
                        noticeUrl = defpackage.e.q(com.mbridge.msdk.foundation.same.a.f33726m, "=2", u.j(noticeUrl, X3.j.f27832c));
                    }
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37791b, this.f37796g, noticeUrl, true, false, com.mbridge.msdk.click.retry.a.f31754o);
            }
        }
    }
}
