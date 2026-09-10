package com.mbridge.msdk.foundation.same.webview;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f34029b;

    public a(CampaignEx campaignEx) {
        this.f34029b = campaignEx;
    }

    public void a(String str) {
        this.f34028a = str;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
    }
}
