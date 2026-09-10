package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class q {
    public static String a(CampaignEx campaignEx, String str) {
        return str;
    }

    public static void a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, com.mbridge.msdk.click.entity.a aVar, String str, String str2, Context context, o.f fVar, Semaphore semaphore) {
        if (a(jumpLoaderResult.getUrl()) || 200 != aVar.f31653f || TextUtils.isEmpty(jumpLoaderResult.getContent()) || jumpLoaderResult.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
            if (aVar != null) {
                jumpLoaderResult.setType(1);
                jumpLoaderResult.setExceptionMsg(aVar.f31655h);
                jumpLoaderResult.setStatusCode(aVar.f31653f);
                jumpLoaderResult.setHeader(aVar.a());
                jumpLoaderResult.setContent(aVar.f31654g);
            }
            a(jumpLoaderResult.getUrl(), campaignEx, jumpLoaderResult);
            return;
        }
        jumpLoaderResult.setType(2);
        if (TextUtils.isEmpty(jumpLoaderResult.getContent())) {
            try {
                new o().a(str, str2, context, jumpLoaderResult.getUrl(), fVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WebViewSpiderLoaderDiff", e10.getMessage());
                }
            }
        } else {
            new o().a(str, str2, context, jumpLoaderResult.getUrl(), jumpLoaderResult.getContent(), fVar);
        }
        semaphore.acquireUninterruptibly();
    }

    private static boolean a(String str) {
        return u0.a.b(str);
    }

    public static boolean a(String str, CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult) {
        if (campaignEx != null) {
            campaignEx.getLinkType();
        }
        if (a(str)) {
            jumpLoaderResult.setCode(1);
            jumpLoaderResult.setUrl(str);
            jumpLoaderResult.setjumpDone(true);
            return true;
        }
        jumpLoaderResult.setCode(2);
        jumpLoaderResult.setUrl(str);
        return false;
    }
}
