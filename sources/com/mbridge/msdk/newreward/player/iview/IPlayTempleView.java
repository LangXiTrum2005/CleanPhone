package com.mbridge.msdk.newreward.player.iview;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.command.retention.ReportAnnotation;

/* JADX INFO: loaded from: classes2.dex */
public interface IPlayTempleView extends IBaseView {
    @ReportAnnotation.MethodInfo(className = "IPlayTempleView", key = "", methodName = "alertDismiss", reportType = "2")
    void alertDismiss();

    @ReportAnnotation.MethodInfo(className = "IPlayTempleView", key = "", methodName = "alertShow", reportType = "2")
    void alertShow();

    View getBaitClickView();

    View getCountDownView();

    boolean getMuteState();

    ImageView getPrivacyButton();

    MBridgeSegmentsProgressBar getSegmentsProgressBar();

    @ReportAnnotation.MethodInfo(className = "IPlayTempleView", methodName = CampaignEx.JSON_NATIVE_VIDEO_PAUSE, reportType = "2")
    void pause();

    @ReportAnnotation.MethodInfo(className = "IPlayTempleView", methodName = "play", reportType = "2")
    void play(String str, int i);

    void release();

    @ReportAnnotation.MethodInfo(className = "IPlayTempleView", methodName = CampaignEx.JSON_NATIVE_VIDEO_RESUME, reportType = "2")
    void resume();

    void setAdCloseVisibility(boolean z);

    void setAlertViewType(String str, int i, int i2);

    void setBackGroundImage(Bitmap bitmap);

    void setCountDown(String str, int i, int i2, ViewGroup.LayoutParams layoutParams);

    void setMuteState(boolean z);

    void setPlayerSize(int i, int i2, int i3);

    void setSegmentsProgressBar(int i);

    void setTemplateWidthAndHeight(int i);

    @ReportAnnotation.MethodInfo(className = "IPlayTempleView", methodName = "viewReport", reportType = ExifInterface.GPS_MEASUREMENT_3D)
    void viewReport(Object obj);
}
