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
public class m {
    public static String a(CampaignEx campaignEx, String str) {
        return str;
    }

    public static void a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, com.mbridge.msdk.click.entity.a aVar, String str, String str2, Context context, o.f fVar, k kVar, Semaphore semaphore) {
        if (!u0.a.b(jumpLoaderResult.getUrl()) && 200 == aVar.f31653f && !TextUtils.isEmpty(jumpLoaderResult.getContent()) && !jumpLoaderResult.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
            jumpLoaderResult.setType(2);
            if (TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                try {
                    new o().a(str, str2, context, jumpLoaderResult.getUrl(), fVar);
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("TAG", "webview spider start error");
                    }
                }
            } else {
                new o().a(str, str2, context, jumpLoaderResult.getUrl(), jumpLoaderResult.getContent(), fVar);
            }
            semaphore.acquireUninterruptibly();
            return;
        }
        if (aVar != null) {
            jumpLoaderResult.setType(1);
            jumpLoaderResult.setExceptionMsg(aVar.f31655h);
            jumpLoaderResult.setStatusCode(aVar.f31653f);
            jumpLoaderResult.setHeader(aVar.a());
            jumpLoaderResult.setContent(aVar.f31654g);
        }
        String url = jumpLoaderResult.getUrl();
        if (u0.a.b(url)) {
            jumpLoaderResult.setCode(1);
            jumpLoaderResult.setUrl(url);
            jumpLoaderResult.setjumpDone(true);
        } else {
            jumpLoaderResult.setCode(2);
            jumpLoaderResult.setUrl(url);
        }
        if (kVar != null) {
            kVar.a(jumpLoaderResult);
        }
    }

    public static boolean a(String str, CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult) {
        if (u0.a.b(jumpLoaderResult.getUrl())) {
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
