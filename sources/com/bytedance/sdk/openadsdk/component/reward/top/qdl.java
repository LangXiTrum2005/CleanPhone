package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;

/* JADX INFO: loaded from: classes3.dex */
public interface qdl<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i2);

    void setListener(ud udVar);

    void setShowDislike(boolean z2);

    void setShowEndCardNextAd(boolean z2, ljh ljhVar);

    void setShowPlayableNextAd(boolean z2, ljh ljhVar);

    void setShowSkip(boolean z2);

    void setShowSound(boolean z2);

    void setSkipEnable(boolean z2);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z2);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
