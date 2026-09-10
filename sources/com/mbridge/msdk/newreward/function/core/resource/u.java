package com.mbridge.msdk.newreward.function.core.resource;

import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes2.dex */
public class u extends r {
    public u(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, b bVar2) {
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
    public String d() {
        CampaignEx campaignExA;
        CampaignEx.c rewardTemplateMode;
        if (a() == null || a().a() == null || (campaignExA = a().a()) == null || (rewardTemplateMode = campaignExA.getRewardTemplateMode()) == null) {
            return "";
        }
        return "template_" + rewardTemplateMode.f();
    }

    @Override // com.mbridge.msdk.newreward.function.core.resource.r
    public boolean f() {
        com.mbridge.msdk.newreward.function.core.campaign.a aVarA = a();
        if (aVarA == null) {
            return true;
        }
        return aVarA.l();
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
