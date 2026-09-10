package com.mbridge.msdk.video.signal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface j {
    void alertWebViewShowed();

    void closeVideoOperate(int i10, int i11);

    void dismissAllAlert();

    int getBorderViewHeight();

    int getBorderViewLeft();

    int getBorderViewRadius();

    int getBorderViewTop();

    int getBorderViewWidth();

    String getCurrentProgress();

    void hideAlertView(int i10);

    boolean isH5Canvas();

    void notifyCloseBtn(int i10);

    void progressBarOperate(int i10);

    void progressOperate(int i10, int i11);

    void setCover(boolean z10);

    void setMiniEndCardState(boolean z10);

    void setScaleFitXY(int i10);

    void setVisible(int i10);

    void showAlertView();

    void showIVRewardAlertView(String str);

    void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    void soundOperate(int i10, int i11);

    void soundOperate(int i10, int i11, String str);

    void videoOperate(int i10);
}
