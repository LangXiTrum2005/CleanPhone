package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.core.mo.jpc;
import com.bytedance.sdk.openadsdk.core.mo.mml;
import com.bytedance.sdk.openadsdk.core.mo.mzz;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.uw;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.widget.mo;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;
import com.bytedance.sdk.openadsdk.utils.rq;

/* JADX INFO: loaded from: classes3.dex */
public class TopLayoutDislike2 extends mzz implements qdl<TopLayoutDislike2> {
    mzz container;
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private mml mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private TextView mNextAdTextTv;
    private mzz mPlayableNextAd;
    private com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl mProgressBar;
    private int mProgressBgColor;
    private int mProgressColor;
    private int mProgressRadiusSize;
    private com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl mProgressRing;
    private int mProgressSize;
    private CharSequence mProgressStr;
    private int mProgressType;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private ud mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    private ImageView getCommonRingBGImageView() {
        mml mmlVar = new mml(getContext());
        int iUd = ax.ud(getContext(), 5.0f);
        mmlVar.setPadding(iUd, iUd, iUd, iUd);
        mmlVar.setScaleType(ImageView.ScaleType.CENTER);
        mmlVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.mml.qdl());
        return mmlVar;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.ud(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Drawable drawableQdl;
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    topLayoutDislike2.mIsSoundMute = !topLayoutDislike2.mIsSoundMute;
                    if (TopLayoutDislike2.this.mSkipIV != null) {
                        drawableQdl = TopLayoutDislike2.this.mIsSoundMute ? ljh.lnr(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : ljh.lnr(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                    } else {
                        drawableQdl = TopLayoutDislike2.this.mIsSoundMute ? rq.qdl(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : rq.qdl(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(drawableQdl);
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.qdl(view2, tag instanceof String ? tag.toString() : "nativeClick");
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.qdl(view2);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.qdl(view2);
                        }
                    }
                });
            }
        }
        mml mmlVar = this.mCloseBtn;
        if (mmlVar != null) {
            mmlVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.lnr(view2);
                    }
                }
            });
        }
        mzz mzzVar = this.mPlayableNextAd;
        if (mzzVar != null) {
            mzzVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.mml(view2);
                    }
                }
            });
        }
    }

    private void initProgressBar(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        uw uwVarFs;
        uw.ud udVarYt;
        if (ljhVar == null || ljhVar.mml() == null || ljhVar.mml().fs() == null || (uwVarFs = ljhVar.mml().fs()) == null || uwVarFs.yt() == null || (udVarYt = uwVarFs.yt()) == null) {
            return;
        }
        if (!TextUtils.isEmpty(udVarYt.ud())) {
            this.mProgressColor = com.bytedance.adsdk.ugeno.wd.qdl.qdl(udVarYt.ud());
        }
        if (!TextUtils.isEmpty(udVarYt.lnr())) {
            this.mProgressBgColor = com.bytedance.adsdk.ugeno.wd.qdl.qdl(udVarYt.lnr());
        }
        if (udVarYt.mml() <= 0.0f) {
            this.mProgressSize = ax.ud(getContext(), 1.0f);
        } else {
            this.mProgressSize = ax.ud(getContext(), udVarYt.mml());
        }
        if (udVarYt.mzz() > 0.0f) {
            this.mProgressRadiusSize = ax.ud(getContext(), udVarYt.mzz());
        }
        this.mProgressType = udVarYt.qdl();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void initView(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        mzz mzzVar = new mzz(getContext());
        this.container = mzzVar;
        mzzVar.setOrientation(0);
        int iUd = ax.ud(getContext(), 16.0f);
        int iUd2 = ax.ud(getContext(), 12.0f);
        int iUd3 = ax.ud(getContext(), 24.0f);
        int iUd4 = ax.ud(getContext(), 28.0f);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iUd4, iUd4);
        layoutParams.topMargin = iUd3;
        layoutParams.leftMargin = iUd;
        this.mImgDislike.setLayoutParams(layoutParams);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iUd4, iUd4);
        layoutParams2.leftMargin = iUd2;
        layoutParams2.topMargin = iUd3;
        this.mImgSound.setId(jtx.fk);
        this.mImgSound.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        jpc jpcVar = new jpc(getContext());
        this.mTextViewCountDown = jpcVar;
        jpcVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.mml.ud());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, ax.ud(getContext(), 28.0f));
        layoutParams4.topMargin = iUd3;
        layoutParams4.rightMargin = iUd;
        this.mTextViewCountDown.setPadding(iUd2, 0, iUd2, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        mzz mzzVar2 = new mzz(getContext());
        this.mPlayableNextAd = mzzVar2;
        mzzVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, iUd4);
        layoutParams5.topMargin = iUd3;
        if (ljhVar == null || !ljhVar.vg()) {
            layoutParams5.rightMargin = iUd;
        } else {
            layoutParams5.rightMargin = ax.ud(getContext(), 8.0f);
        }
        this.mPlayableNextAd.setLayoutParams(layoutParams5);
        this.mPlayableNextAd.setBackground(com.bytedance.sdk.openadsdk.core.widget.mml.ud());
        this.mPlayableNextAd.setVisibility(8);
        this.mNextAdTextTv = new jpc(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, ax.ud(getContext(), 28.0f));
        layoutParams6.gravity = 16;
        this.mNextAdTextTv.setLayoutParams(layoutParams6);
        this.mNextAdTextTv.setPadding(iUd2, 0, 0, 0);
        String strOth = vu.oth(ljhVar);
        if (TextUtils.isEmpty(strOth)) {
            this.mNextAdTextTv.setText(ljh.ud(getContext(), "tt_multiple_playable_next_ad_tips"));
        } else {
            this.mNextAdTextTv.setText(strOth);
        }
        this.mNextAdTextTv.setGravity(17);
        this.mNextAdTextTv.setTextColor(-1);
        this.mNextAdTextTv.setTextSize(14.0f);
        mml mmlVar = new mml(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(iUd2, iUd2);
        layoutParams7.rightMargin = iUd2;
        mmlVar.setScaleType(ImageView.ScaleType.CENTER);
        layoutParams7.gravity = 16;
        mmlVar.setLayoutParams(layoutParams7);
        mmlVar.setImageResource(ljh.mml(yt.qdl(), "tt_ad_arrow_right"));
        this.mPlayableNextAd.addView(this.mNextAdTextTv);
        this.mPlayableNextAd.addView(mmlVar);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(iUd4, iUd4);
        layoutParams8.topMargin = iUd3;
        layoutParams8.rightMargin = iUd;
        this.mSkipIV.setLayoutParams(layoutParams8);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        mml mmlVarUd = mo.ud(getContext());
        this.mCloseBtn = mmlVarUd;
        mmlVarUd.setId(520093708);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = 8388661;
        layoutParams9.topMargin = iUd3;
        layoutParams9.rightMargin = iUd3;
        this.mCloseBtn.setLayoutParams(layoutParams9);
        this.mCloseBtn.setContentDescription(ljh.qdl(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        if (this.mProgressType == 1) {
            this.mProgressRing = new com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#66666666"));
            gradientDrawable.setCornerRadius(ax.ud(getContext(), 14.0f));
            gradientDrawable.setShape(0);
            this.mProgressRing.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(iUd4, iUd4);
            layoutParams10.topMargin = iUd3;
            layoutParams10.rightMargin = iUd;
            this.mProgressRing.setLayoutParams(layoutParams10);
            this.mProgressRing.qdl("ring").qdl(this.mProgressSize).qdl(this.mProgressColor).ud(this.mProgressBgColor).ud(this.mProgressRadiusSize);
            this.mProgressRing.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(getContext());
        lnrVar.addView(this.mSkipIV);
        com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl qdlVar = this.mProgressRing;
        if (qdlVar != null) {
            lnrVar.addView(qdlVar);
        }
        lnrVar.addView(this.mPlayableNextAd);
        if (this.mProgressType == 2) {
            this.mProgressBar = new com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl(getContext());
            this.mProgressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.mProgressBar.qdl("line").qdl(this.mProgressSize).qdl(this.mProgressColor).ud(this.mProgressBgColor).ud(this.mProgressRadiusSize);
            this.mProgressBar.setVisibility(8);
        }
        this.container.addView(this.mImgDislike);
        this.container.addView(this.mImgSound);
        this.container.addView(view);
        this.container.addView(this.mTextViewCountDown);
        this.container.addView(lnrVar);
        this.container.addView(this.mCloseBtn);
        com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl qdlVar2 = this.mProgressBar;
        if (qdlVar2 != null) {
            addView(qdlVar2);
        }
        addView(this.container);
    }

    private void updateTime(boolean z2) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z2) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    public void clickDislike() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    public void hideCountDownText() {
        this.mTextViewCountDown.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setCountDownFor1InN(CharSequence charSequence, int i2) {
        int i3 = this.mProgressType;
        if (i3 == 1) {
            if (i2 < 0) {
                this.mProgressRing.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            }
            this.mProgressRing.setVisibility(0);
            this.mProgressRing.setAnimationDuration(1000);
            this.mProgressRing.setProgress(i2);
            this.mProgressRing.setClickable(false);
            this.mProgressRing.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            ImageView imageView = this.mSkipIV;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i3 == 2) {
            if (i2 < 0) {
                this.mProgressBar.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            } else {
                this.mProgressBar.setVisibility(0);
                this.mProgressBar.setAnimationDuration(1000);
                this.mProgressBar.setProgress(i2);
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setListener(ud udVar) {
        this.mTopListener = udVar;
    }

    public void setShouldShowSkipTime(boolean z2) {
        this.shouldShowSkipTime = z2;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setShowDislike(boolean z2) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z2 ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setShowEndCardNextAd(boolean z2, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        mzz mzzVar = this.mPlayableNextAd;
        if (mzzVar != null) {
            mzzVar.setVisibility(z2 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z2 || ljhVar == null || ljhVar.raf() == null) {
                return;
            }
            String strLnr = ljhVar.raf().lnr();
            if (TextUtils.isEmpty(strLnr)) {
                return;
            }
            this.mNextAdTextTv.setText(strLnr);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setShowPlayableNextAd(boolean z2, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        mzz mzzVar = this.mPlayableNextAd;
        if (mzzVar != null) {
            mzzVar.setVisibility(z2 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z2) {
                return;
            }
            String strOth = vu.oth(ljhVar);
            if (TextUtils.isEmpty(strOth)) {
                this.mNextAdTextTv.setText(ljh.ud(getContext(), "tt_multiple_playable_next_ad_tips"));
            } else {
                this.mNextAdTextTv.setText(strOth);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setShowSkip(boolean z2) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z2) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z2;
        this.mSkipIV.setVisibility((z2 && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z2 & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setShowSound(boolean z2) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setSkipEnable(boolean z2) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z2);
            this.mSkipIV.setClickable(z2);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z2);
            this.mTextViewCountDown.setClickable(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setSoundMute(boolean z2) {
        Drawable drawableQdl;
        this.mIsSoundMute = z2;
        if (this.mSkipIV != null) {
            drawableQdl = z2 ? ljh.lnr(getContext(), "tt_reward_full_mute") : ljh.lnr(getContext(), "tt_reward_full_unmute");
        } else {
            drawableQdl = z2 ? rq.qdl(getContext(), "tt_mute_wrapper") : rq.qdl(getContext(), "tt_unmute_wrapper");
        }
        this.mImgSound.setImageDrawable(drawableQdl);
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i2 = this.skipTime;
            int i3 = i2 == 0 ? Integer.parseInt(str) : i2 - (this.videoDuration - Integer.parseInt(str));
            if (i3 <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(i3 + "s");
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
        com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl qdlVar = this.mProgressRing;
        if (qdlVar != null) {
            qdlVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl qdlVar2 = this.mProgressBar;
        if (qdlVar2 != null) {
            qdlVar2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.qdl
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl qdlVar = this.mProgressRing;
        if (qdlVar != null) {
            qdlVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.rq.ud.lnr.qdl qdlVar2 = this.mProgressBar;
        if (qdlVar2 != null) {
            qdlVar2.setVisibility(8);
        }
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    public TopLayoutDislike2 load(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        int iOth;
        boolean z2;
        initProgressBar(ljhVar);
        initView(ljhVar);
        this.mImgDislike.setVisibility(0);
        ((ImageView) this.mImgDislike).setImageResource(ljh.mml(yt.qdl(), "tt_reward_full_feedback"));
        if (!com.bytedance.sdk.openadsdk.core.settings.rq.lnr().rdp(String.valueOf(ljhVar.fz())) || ljhVar.taz() == 5 || ljhVar.taz() == 6) {
            this.mSkipIV.setImageResource(ljh.mml(yt.qdl(), "tt_close_btn"));
        } else {
            this.mSkipIV.setImageResource(ljh.mml(yt.qdl(), "tt_skip_btn"));
        }
        if (this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        if (ljhVar.tdy() == null) {
            iOth = 0;
        } else {
            iOth = ljhVar.tdy().oth() * ((int) ljhVar.tdy().mo());
        }
        this.videoDuration = iOth;
        if (aaj.mml(ljhVar) && ljhVar.aaj() != null) {
            this.videoDuration = (int) ljhVar.aaj().ud();
        } else if (aaj.wd(ljhVar) && ljhVar.aaj() != null) {
            this.videoDuration = (int) ljhVar.aaj().mml();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (ljhVar.vz() != 8 || ljhVar.ji() == null) {
            this.skipTime = ljhVar.qg();
        } else {
            this.skipTime = ljhVar.ws();
        }
        if (!vu.lnr(ljhVar)) {
            int i2 = this.skipTime;
            if (i2 != -1 && i2 < this.videoDuration) {
                z2 = false;
            }
            this.shouldShowSkipTime = z2;
            if (ljhVar.uj()) {
                this.mImgDislike.setVisibility(8);
                this.isVast = true;
            }
            this.mTextViewCountDown.setVisibility(4);
            this.mTextViewCountDown.setText("");
            this.mTextViewCountDown.setEnabled(false);
            this.mTextViewCountDown.setClickable(false);
            initListener();
            return this;
        }
        this.skipTime = ljhVar.sxp();
        this.videoDuration = ljhVar.icv();
        z2 = true;
        this.shouldShowSkipTime = z2;
        if (ljhVar.uj()) {
            this.mImgDislike.setVisibility(8);
            this.isVast = true;
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener();
        return this;
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mProgressStr = "";
        this.mProgressColor = com.bytedance.adsdk.ugeno.wd.qdl.qdl("#FFD813");
        this.mProgressBgColor = com.bytedance.adsdk.ugeno.wd.qdl.qdl("rgba(0, 0, 0, 0.5)");
        setOrientation(1);
    }
}
