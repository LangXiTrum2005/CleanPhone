package com.mbridge.msdk.newreward.player.iview;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public interface IECTempleView extends IBaseView {
    void addShakeView(View view);

    View getBaitClickView();

    ImageView getNoticeIV();

    IECTempleView getParentObject();

    void setBlurBackGround(Bitmap bitmap);

    void setCTAText(String str);

    void setCloseViewBtnDelayShow(int i);

    void setHeatCount(int i);

    void setImageBitMap(int i, Bitmap bitmap);

    void setNLogo(int i, String str, Drawable drawable);

    void setRatingAndUser(double d, int i);

    void setTextByID(int i, String str);
}
