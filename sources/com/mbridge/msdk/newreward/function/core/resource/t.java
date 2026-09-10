package com.mbridge.msdk.newreward.function.core.resource;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;

/* JADX INFO: loaded from: classes2.dex */
public class t extends r {
    public t(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, b bVar2) {
        super(bVar, aVar, bVar2);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r, com.mbridge.msdk.newreward.function.core.resource.p
    public /* bridge */ /* synthetic */ void a(int i, x xVar) {
        super.a(i, xVar);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r
    public /* bridge */ /* synthetic */ a b() {
        return super.b();
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r
    public /* bridge */ /* synthetic */ com.mbridge.msdk.newreward.function.core.campaign.b c() {
        return super.c();
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r
    public String d() {
        CampaignEx campaignExA;
        if (a() != null && a().a() != null && (campaignExA = a().a()) != null && !TextUtils.isEmpty(campaignExA.getendcard_url())) {
            Context contextI = c().i();
            if (contextI == null) {
                contextI = com.mbridge.msdk.foundation.controller.c.n().d();
            }
            try {
                StringBuilder sb = new StringBuilder("template_");
                sb.append(com.mbridge.msdk.util.b.a() ? "cn" : "en");
                sb.append("_");
                sb.append(k0.F(contextI.getApplicationContext()));
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r
    public boolean f() {
        return false;
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public /* bridge */ /* synthetic */ void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
        super.onCancelDownload(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public /* bridge */ /* synthetic */ void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
        super.onDownloadComplete(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public /* bridge */ /* synthetic */ void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage, DownloadError downloadError) {
        super.onDownloadError(downloadMessage, downloadError);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public /* bridge */ /* synthetic */ void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage) {
        super.onDownloadStart(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r, com.mbridge.msdk.foundation.download.OnProgressStateListener
    public /* bridge */ /* synthetic */ void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.core.campaign.b> downloadMessage, DownloadProgress downloadProgress) {
        super.onProgress(downloadMessage, downloadProgress);
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r
    public /* bridge */ /* synthetic */ com.mbridge.msdk.newreward.function.core.campaign.a a() {
        return super.a();
    }
}
