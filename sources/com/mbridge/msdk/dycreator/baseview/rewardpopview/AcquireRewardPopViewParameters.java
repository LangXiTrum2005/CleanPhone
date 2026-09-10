package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class AcquireRewardPopViewParameters {
    public AcquireRewardPopViewBehaviourListener behaviourListener;
    public String failTip;
    public String failTitle;
    public String language;
    public String placementId;
    public List<String> rightAnswerList;
    public String slideSuccessTitle;
    public String slideTip;
    public String slideTitle;
    public String successTip;
    public String successTitle;
    public String tips;
    public String title;
    public String unitId;
    public int viewType;
    public List<String> wrongAnswerList;
    public int autoDismissTime = 5;
    public int reduceTime = 0;
    public boolean canClickMaskArea = true;
    public int viewBackLayerTopColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFC27A;
    public int viewBackLayerBottomColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FF932B;
    public int viewForegroundTopColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBE2;
    public int viewForegroundBottomColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFE0B5;
    public int buttonBackgroundLightColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FF8B00;
    public int buttonBackgroundDarkColor = AcquireRewardPopViewConst.DEFAULT_COLOR_33EF7601;
    public int titleTextColor = AcquireRewardPopViewConst.DEFAULT_COLOR_E56F19;
    public int tipTextColor = AcquireRewardPopViewConst.DEFAULT_COLOR_89664C;
    public int buttonTextLightColor = -1;
    public int buttonTextDarkColor = AcquireRewardPopViewConst.DEFAULT_COLOR_D26700;
    public int successTipTextColor = -1;
    public int failTipTextColor = -1;
    public int containerBackgroundColor = AcquireRewardPopViewConst.DEFAULT_COLOR_50000000;
    public int successTitleGradientStartColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
    public int successTitleGradientEndColor = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
    public int successTitleShadowColor = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
    public int successTitleTextSize = 40;
    public float successTitleShadowRadius = 3.0f;
    public float successTitleShadowDx = 1.5f;
    public float successTitleShadowDy = 1.8f;
    public int failTitleGradientStartColor = -1;
    public int failTitleGradientEndColor = AcquireRewardPopViewConst.DEFAULT_COLOR_8B6B45;
    public int failTitleShadowColor = AcquireRewardPopViewConst.DEFAULT_COLOR_3B3127;
    public int failTitleTextSize = 40;
    public float failTitleShadowRadius = 3.0f;
    public float failTitleShadowDx = 1.5f;
    public float failTitleShadowDy = 1.8f;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AcquireRewardPopViewParameters f33068a;

        public Builder(String str, String str2, int i10, String str3) {
            AcquireRewardPopViewParameters acquireRewardPopViewParameters = new AcquireRewardPopViewParameters();
            this.f33068a = acquireRewardPopViewParameters;
            acquireRewardPopViewParameters.placementId = str;
            acquireRewardPopViewParameters.unitId = str2;
            acquireRewardPopViewParameters.viewType = i10;
            acquireRewardPopViewParameters.language = str3;
            a(str3);
        }

        /* JADX WARN: Code duplicated, block: B:4:0x000e  */
        private void a(String str) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                str2 = "EN";
            } else if (str.equalsIgnoreCase("CN")) {
                str2 = "ZH";
            } else if (str.equalsIgnoreCase("UK")) {
                str2 = "EN";
            } else if (str.equalsIgnoreCase("JP")) {
                str2 = "JA";
            } else if (str.equalsIgnoreCase("KR")) {
                str2 = "KO";
            } else {
                str2 = "EN";
            }
            if (str2.equalsIgnoreCase("ZH")) {
                AcquireRewardPopViewParameters acquireRewardPopViewParameters = this.f33068a;
                acquireRewardPopViewParameters.title = AcquireRewardPopViewConst.DEFAULT_QUESTION_TITLE_TEXT_CN;
                acquireRewardPopViewParameters.tips = AcquireRewardPopViewConst.DEFAULT_QUESTION_TIP_TEXT_CN;
                acquireRewardPopViewParameters.successTitle = AcquireRewardPopViewConst.DEFAULT_SUCCESS_TITLE_TEXT_CN;
                acquireRewardPopViewParameters.successTip = AcquireRewardPopViewConst.DEFAULT_SUCCESS_TIP_TEXT_CN;
                acquireRewardPopViewParameters.failTitle = AcquireRewardPopViewConst.DEFAULT_FAIL_TITLE_TEXT_CN;
                acquireRewardPopViewParameters.failTip = AcquireRewardPopViewConst.DEFAULT_FAIL_TIP_TEXT_CN;
                acquireRewardPopViewParameters.slideTitle = AcquireRewardPopViewConst.DEFAULT_SLIDE_TITLE_TEXT_CN;
                acquireRewardPopViewParameters.slideTip = AcquireRewardPopViewConst.DEFAULT_SLIDE_TIP_TEXT_CN;
                acquireRewardPopViewParameters.slideSuccessTitle = AcquireRewardPopViewConst.DEFAULT_SLIDE_SUCCESS_TEXT_CN;
                acquireRewardPopViewParameters.wrongAnswerList = Arrays.asList(AcquireRewardPopViewConst.DEFAULT_RANDOM_ANSWERS_CN);
                return;
            }
            if (str2.equalsIgnoreCase("EN")) {
                AcquireRewardPopViewParameters acquireRewardPopViewParameters2 = this.f33068a;
                acquireRewardPopViewParameters2.title = AcquireRewardPopViewConst.DEFAULT_QUESTION_TITLE_TEXT_EN;
                acquireRewardPopViewParameters2.tips = AcquireRewardPopViewConst.DEFAULT_QUESTION_TIP_TEXT_EN;
                acquireRewardPopViewParameters2.successTitle = AcquireRewardPopViewConst.DEFAULT_SUCCESS_TITLE_TEXT_EN;
                acquireRewardPopViewParameters2.successTip = AcquireRewardPopViewConst.DEFAULT_SUCCESS_TIP_TEXT_EN;
                acquireRewardPopViewParameters2.failTitle = AcquireRewardPopViewConst.DEFAULT_FAIL_TITLE_TEXT_EN;
                acquireRewardPopViewParameters2.failTip = AcquireRewardPopViewConst.DEFAULT_FAIL_TIP_TEXT_EN;
                acquireRewardPopViewParameters2.slideTitle = AcquireRewardPopViewConst.DEFAULT_SLIDE_TITLE_TEXT_EN;
                acquireRewardPopViewParameters2.slideTip = AcquireRewardPopViewConst.DEFAULT_SLIDE_TIP_TEXT_EN;
                acquireRewardPopViewParameters2.slideSuccessTitle = AcquireRewardPopViewConst.DEFAULT_SLIDE_SUCCESS_TEXT_EN;
                acquireRewardPopViewParameters2.wrongAnswerList = Arrays.asList(AcquireRewardPopViewConst.DEFAULT_RANDOM_ANSWERS_EN);
                return;
            }
            if (str2.equalsIgnoreCase("JA")) {
                AcquireRewardPopViewParameters acquireRewardPopViewParameters3 = this.f33068a;
                acquireRewardPopViewParameters3.title = AcquireRewardPopViewConst.DEFAULT_QUESTION_TITLE_TEXT_JP;
                acquireRewardPopViewParameters3.tips = AcquireRewardPopViewConst.DEFAULT_QUESTION_TIP_TEXT_JP;
                acquireRewardPopViewParameters3.successTitle = AcquireRewardPopViewConst.DEFAULT_SUCCESS_TITLE_TEXT_JP;
                acquireRewardPopViewParameters3.successTip = AcquireRewardPopViewConst.DEFAULT_SUCCESS_TIP_TEXT_JP;
                acquireRewardPopViewParameters3.failTitle = AcquireRewardPopViewConst.DEFAULT_FAIL_TITLE_TEXT_JP;
                acquireRewardPopViewParameters3.failTip = AcquireRewardPopViewConst.DEFAULT_FAIL_TIP_TEXT_JP;
                acquireRewardPopViewParameters3.slideTitle = AcquireRewardPopViewConst.DEFAULT_SLIDE_TITLE_TEXT_JP;
                acquireRewardPopViewParameters3.slideTip = AcquireRewardPopViewConst.DEFAULT_SLIDE_TIP_TEXT_JP;
                acquireRewardPopViewParameters3.slideSuccessTitle = AcquireRewardPopViewConst.DEFAULT_SLIDE_SUCCESS_TEXT_JP;
                acquireRewardPopViewParameters3.wrongAnswerList = Arrays.asList(AcquireRewardPopViewConst.DEFAULT_RANDOM_ANSWERS_JP);
                return;
            }
            if (str2.equalsIgnoreCase("KO")) {
                AcquireRewardPopViewParameters acquireRewardPopViewParameters4 = this.f33068a;
                acquireRewardPopViewParameters4.title = AcquireRewardPopViewConst.DEFAULT_QUESTION_TITLE_TEXT_KR;
                acquireRewardPopViewParameters4.tips = AcquireRewardPopViewConst.DEFAULT_QUESTION_TIP_TEXT_KR;
                acquireRewardPopViewParameters4.successTitle = AcquireRewardPopViewConst.DEFAULT_SUCCESS_TITLE_TEXT_KR;
                acquireRewardPopViewParameters4.successTip = AcquireRewardPopViewConst.DEFAULT_SUCCESS_TIP_TEXT_KR;
                acquireRewardPopViewParameters4.failTitle = AcquireRewardPopViewConst.DEFAULT_FAIL_TITLE_TEXT_KR;
                acquireRewardPopViewParameters4.failTip = AcquireRewardPopViewConst.DEFAULT_FAIL_TIP_TEXT_KR;
                acquireRewardPopViewParameters4.slideTitle = AcquireRewardPopViewConst.DEFAULT_SLIDE_TITLE_TEXT_KR;
                acquireRewardPopViewParameters4.slideTip = AcquireRewardPopViewConst.DEFAULT_SLIDE_TIP_TEXT_KR;
                acquireRewardPopViewParameters4.slideSuccessTitle = AcquireRewardPopViewConst.DEFAULT_SLIDE_SUCCESS_TEXT_KR;
                acquireRewardPopViewParameters4.wrongAnswerList = Arrays.asList(AcquireRewardPopViewConst.DEFAULT_RANDOM_ANSWERS_KR);
            }
        }

        public AcquireRewardPopViewParameters build() {
            return this.f33068a;
        }

        public Builder setAutoDismissTime(int i10) {
            this.f33068a.autoDismissTime = i10;
            return this;
        }

        public Builder setBehaviourListener(AcquireRewardPopViewBehaviourListener acquireRewardPopViewBehaviourListener) {
            this.f33068a.behaviourListener = acquireRewardPopViewBehaviourListener;
            return this;
        }

        public Builder setButtonBackgroundDarkColor(int i10) {
            this.f33068a.buttonBackgroundDarkColor = i10;
            return this;
        }

        public Builder setButtonBackgroundLightColor(int i10) {
            this.f33068a.buttonBackgroundLightColor = i10;
            return this;
        }

        public Builder setButtonTextDarkColor(int i10) {
            this.f33068a.buttonTextDarkColor = i10;
            return this;
        }

        public Builder setButtonTextLightColor(int i10) {
            this.f33068a.buttonTextLightColor = i10;
            return this;
        }

        public Builder setCanClickMaskArea(boolean z10) {
            this.f33068a.canClickMaskArea = z10;
            return this;
        }

        public Builder setContainerBackgroundColor(int i10) {
            this.f33068a.containerBackgroundColor = i10;
            return this;
        }

        public Builder setFailTip(String str) {
            this.f33068a.failTip = str;
            return this;
        }

        public Builder setFailTipTextColor(int i10) {
            this.f33068a.failTipTextColor = i10;
            return this;
        }

        public Builder setFailTitle(String str) {
            this.f33068a.failTitle = str;
            return this;
        }

        public Builder setFailTitleGradientEndColor(int i10) {
            this.f33068a.failTitleGradientEndColor = i10;
            return this;
        }

        public Builder setFailTitleGradientStartColor(int i10) {
            this.f33068a.failTitleGradientStartColor = i10;
            return this;
        }

        public Builder setFailTitleShadowColor(int i10) {
            this.f33068a.failTitleShadowColor = i10;
            return this;
        }

        public Builder setFailTitleShadowDx(float f10) {
            this.f33068a.failTitleShadowDx = f10;
            return this;
        }

        public Builder setFailTitleShadowDy(float f10) {
            this.f33068a.failTitleShadowDy = f10;
            return this;
        }

        public Builder setFailTitleShadowRadius(float f10) {
            this.f33068a.failTitleShadowRadius = f10;
            return this;
        }

        public Builder setFailTitleTextSize(int i10) {
            this.f33068a.failTitleTextSize = i10;
            return this;
        }

        public Builder setReduceTime(int i10) {
            this.f33068a.reduceTime = i10;
            return this;
        }

        public Builder setRightAnswerList(ArrayList<String> arrayList) {
            this.f33068a.rightAnswerList = arrayList;
            return this;
        }

        public Builder setSlideSuccessTitle(String str) {
            this.f33068a.slideSuccessTitle = str;
            return this;
        }

        public Builder setSlideTip(String str) {
            this.f33068a.slideTip = str;
            return this;
        }

        public Builder setSlideTitle(String str) {
            this.f33068a.slideTitle = str;
            return this;
        }

        public Builder setSuccessTip(String str) {
            this.f33068a.successTip = str;
            return this;
        }

        public Builder setSuccessTipTextColor(int i10) {
            this.f33068a.successTipTextColor = i10;
            return this;
        }

        public Builder setSuccessTitle(String str) {
            this.f33068a.successTitle = str;
            return this;
        }

        public Builder setSuccessTitleGradientEndColor(int i10) {
            this.f33068a.successTitleGradientEndColor = i10;
            return this;
        }

        public Builder setSuccessTitleGradientStartColor(int i10) {
            this.f33068a.successTitleGradientStartColor = i10;
            return this;
        }

        public Builder setSuccessTitleShadowColor(int i10) {
            this.f33068a.successTitleShadowColor = i10;
            return this;
        }

        public Builder setSuccessTitleShadowDx(float f10) {
            this.f33068a.successTitleShadowDx = f10;
            return this;
        }

        public Builder setSuccessTitleShadowDy(float f10) {
            this.f33068a.successTitleShadowDy = f10;
            return this;
        }

        public Builder setSuccessTitleShadowRadius(float f10) {
            this.f33068a.successTitleShadowRadius = f10;
            return this;
        }

        public Builder setSuccessTitleTextSize(int i10) {
            this.f33068a.successTitleTextSize = i10;
            return this;
        }

        public Builder setTipTextColor(int i10) {
            this.f33068a.tipTextColor = i10;
            return this;
        }

        public Builder setTips(String str) {
            this.f33068a.tips = str;
            return this;
        }

        public Builder setTitle(String str) {
            this.f33068a.title = str;
            return this;
        }

        public Builder setTitleTextColor(int i10) {
            this.f33068a.titleTextColor = i10;
            return this;
        }

        public Builder setViewBackLayerBottomColor(int i10) {
            this.f33068a.viewBackLayerBottomColor = i10;
            return this;
        }

        public Builder setViewBackLayerTopColor(int i10) {
            this.f33068a.viewBackLayerTopColor = i10;
            return this;
        }

        public Builder setViewForegroundBottomColor(int i10) {
            this.f33068a.viewForegroundBottomColor = i10;
            return this;
        }

        public Builder setViewForegroundTopColor(int i10) {
            this.f33068a.viewForegroundTopColor = i10;
            return this;
        }

        public Builder setWrongAnswerList(ArrayList<String> arrayList) {
            this.f33068a.wrongAnswerList = arrayList;
            return this;
        }
    }

    public static Builder builder(String str, String str2, int i10, String str3) {
        if (TextUtils.isEmpty(str2)) {
            q0.b("AcquireRewardPopViewParameters", "Unit id must not null.");
            return null;
        }
        if (i10 == 0) {
            i10 = 1;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "EN";
        }
        return new Builder(str, str2, i10, str3);
    }
}
