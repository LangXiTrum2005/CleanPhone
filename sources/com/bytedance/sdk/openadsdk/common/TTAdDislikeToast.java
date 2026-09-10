package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.mo.lnr {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context contextQdl = com.bytedance.sdk.openadsdk.core.yt.qdl();
            sDislikeSendTip = ljh.qdl(contextQdl, "tt_feedback_thank_text") + IOUtils.LINE_SEPARATOR_UNIX + ljh.qdl(contextQdl, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = ljh.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = ljh.qdl(com.bytedance.sdk.openadsdk.core.yt.qdl(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    private void initToast(Context context) {
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = ax.ud(getContext(), 75.0f);
        int iUd = ax.ud(com.bytedance.sdk.openadsdk.core.yt.qdl(), 16.0f);
        int iUd2 = ax.ud(com.bytedance.sdk.openadsdk.core.yt.qdl(), 12.0f);
        this.mTextView.setPadding(iUd, iUd2, iUd, iUd2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(8388611);
        Drawable drawableLnr = ljh.lnr(getContext(), "tt_dislike_toast");
        int iUd3 = ax.ud(getContext(), 16.0f);
        drawableLnr.setBounds(0, 0, iUd3, iUd3);
        this.mTextView.setCompoundDrawablePadding(iUd3 / 2);
        this.mTextView.setCompoundDrawables(drawableLnr, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(209, 37, 37, 37));
        gradientDrawable.setCornerRadius(ax.ud(com.bytedance.sdk.openadsdk.core.yt.qdl(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public static void onResourceUpdated() {
        Context contextQdl = com.bytedance.sdk.openadsdk.core.yt.qdl();
        sSkipText = ljh.qdl(contextQdl, "tt_reward_screen_skip_tx");
        sDislikeTip = ljh.qdl(contextQdl, "tt_feedback_submit_text");
        sDislikeSendTip = ljh.qdl(contextQdl, "tt_feedback_thank_text") + IOUtils.LINE_SEPARATOR_UNIX + ljh.qdl(contextQdl, "tt_feedback_experience_text");
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }
}
