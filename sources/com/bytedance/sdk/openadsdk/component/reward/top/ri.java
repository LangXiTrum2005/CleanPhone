package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;

/* JADX INFO: loaded from: classes2.dex */
public interface ri<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i);

    void setListener(lr lrVar);

    void setShowDislike(boolean z);

    void setShowEndCardNextAd(boolean z, wjv wjvVar);

    void setShowPlayableNextAd(boolean z, wjv wjvVar);

    void setShowSkip(boolean z);

    void setShowSound(boolean z);

    void setSkipEnable(boolean z);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
