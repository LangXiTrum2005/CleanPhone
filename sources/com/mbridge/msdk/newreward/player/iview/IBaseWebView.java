package com.mbridge.msdk.newreward.player.iview;

import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.command.retention.ReportAnnotation;
import com.mbridge.msdk.newreward.player.view.hybrid.MBWebView;

/* JADX INFO: loaded from: classes2.dex */
public interface IBaseWebView extends IBaseView {
    ImageView getPrivacyButton();

    MBWebView getWebView();

    void hideCTAView();

    @ReportAnnotation.MethodInfo(isParameter = true, key = "2000134", reportType = "1")
    void onCloseViewClick(int i);

    @ReportAnnotation.MethodInfo(isParameter = true, key = "2000135", reportType = "1")
    void onDestroyWebContent(int i);

    @ReportAnnotation.MethodInfo(isParameter = true, key = "2000133", reportType = "1")
    boolean onWebViewShow(int i);

    void setNativeCloseButtonVisibility(int i);

    void showCTAView(String str, CampaignEx campaignEx);

    void showMRAIDExpandView(String str, int i);

    void showMiniCard();
}
