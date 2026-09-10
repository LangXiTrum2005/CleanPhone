package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.google.android.material.navigation.NavigationBarView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ac extends com.bytedance.sdk.openadsdk.core.di.ik {
    private ri ik;
    private boolean ka;
    private LinearLayout lr;
    private Context ri;

    public interface ri {
        void ik();

        void ka();

        void lr();

        void ri();
    }

    public ac(Context context, boolean z) {
        super(context);
        this.ri = context;
        this.ka = z;
        lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void di(View view) {
        ri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fi(View view) {
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ri();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ik(View view) {
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ik();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ka(View view) {
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.lr();
        }
    }

    private void lr() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.attabal
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f18081kowloon.ri(view, motionEvent);
            }
        });
        LinearLayout linearLayout = new LinearLayout(this.ri);
        this.lr = linearLayout;
        linearLayout.setOrientation(1);
        this.lr.setGravity(80);
        this.lr.setPadding(ri(16.0f), 0, ri(16.0f), ri(58.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(ri(16.0f));
        gradientDrawable.setColor(Color.parseColor("#E1E1E1"));
        this.lr.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = ri(16.0f);
        this.lr.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(this.ri);
        ikVar.setPadding(ri(6.0f), 0, ri(6.0f), 0);
        ikVar.setLayoutParams(new LinearLayout.LayoutParams(-1, ri(44.0f)));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(this.ri);
        Context context = this.ri;
        mjVar.setText(context.getString(uq.lr(context, "tt_more_title")));
        mjVar.setTextColor(Color.parseColor("#000000"));
        mjVar.setTextSize(2, 17.0f);
        mjVar.setGravity(17);
        mjVar.setTypeface(Typeface.defaultFromStyle(1));
        ikVar.addView(mjVar, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(this.ri);
        imageView.setImageResource(uq.ka(this.ri, "tt_titlebar_close_drawable"));
        imageView.setPadding(ri(10.0f), ri(10.0f), ri(10.0f), ri(10.0f));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.saneness
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18088kowloon.di(view);
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ri(44.0f), ri(44.0f));
        layoutParams2.gravity = 8388629;
        ikVar.addView(imageView, layoutParams2);
        this.lr.addView(ikVar);
        com.bytedance.sdk.openadsdk.core.di.fi fiVarRi = ri(8);
        Context context2 = this.ri;
        ri(fiVarRi, context2.getString(uq.lr(context2, "tt_more_retry")), "tt_more_retry_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.dern
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18084kowloon.fi(view);
            }
        });
        Context context3 = this.ri;
        ri(fiVarRi, context3.getString(uq.lr(context3, "tt_more_copy_link")), "tt_more_copy_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.wireman
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18089kowloon.ka(view);
            }
        });
        Context context4 = this.ri;
        ri(fiVarRi, context4.getString(uq.lr(context4, "tt_more_open_browser")), "tt_more_browser_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.marial
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18087kowloon.ik(view);
            }
        });
        this.lr.addView(fiVarRi);
        com.bytedance.sdk.openadsdk.core.di.fi fiVarRi2 = ri(8);
        Context context5 = this.ri;
        ri(fiVarRi2, context5.getString(uq.lr(context5, "tt_more_report")), "tt_more_report_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.beachfront
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18082kowloon.lr(view);
            }
        });
        this.lr.addView(fiVarRi2);
        addView(this.lr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean ri(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            this.lr.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                ri();
            }
        }
        return true;
    }

    public void setOnMenuItemClickListener(ri riVar) {
        this.ik = riVar;
    }

    private void ri(com.bytedance.sdk.openadsdk.core.di.fi fiVar, String str, String str2, View.OnClickListener onClickListener) {
        com.bytedance.sdk.openadsdk.core.di.fi fiVar2 = new com.bytedance.sdk.openadsdk.core.di.fi(this.ri);
        fiVar2.setOrientation(0);
        fiVar2.setGravity(16);
        fiVar2.setOnClickListener(onClickListener);
        ImageView imageView = new ImageView(this.ri);
        imageView.setImageResource(uq.ka(this.ri, str2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ri(20.0f), ri(20.0f));
        layoutParams.setMargins(ri(16.0f), ri(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ri(16.0f), ri(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        fiVar2.addView(imageView, layoutParams);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(this.ri);
        mjVar.setText(str);
        mjVar.setTextColor(Color.parseColor("#000000"));
        mjVar.setTextSize(2, 16.0f);
        mjVar.setGravity(NavigationBarView.ITEM_GRAVITY_START_CENTER);
        mjVar.setTypeface(Typeface.defaultFromStyle(0));
        fiVar2.addView(mjVar, new LinearLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, ri(52.0f));
        if (fiVar.getChildCount() > 0) {
            View view = new View(this.ri);
            view.setBackgroundColor(Color.parseColor("#1F000000"));
            fiVar.addView(view, new LinearLayout.LayoutParams(-1, ri(1.0f)));
        }
        fiVar.addView(fiVar2, layoutParams2);
    }

    private com.bytedance.sdk.openadsdk.core.di.fi ri(int i) {
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(this.ri);
        fiVar.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(ri(i));
        gradientDrawable.setColor(-1);
        fiVar.setBackgroundDrawable(gradientDrawable);
        fiVar.setPadding(ri(8.0f), ri(8.0f), ri(8.0f), ri(8.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ri(8.0f);
        fiVar.setLayoutParams(layoutParams);
        return fiVar;
    }

    public void ri(View view) {
        View viewFindViewById = view.getRootView().findViewById(R.id.content);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (getParent() == null) {
            ((ViewGroup) viewFindViewById).addView(this, layoutParams);
        }
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lr(View view) {
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ka();
        }
    }

    public void ri() {
        setVisibility(8);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    private int ri(float f) {
        return qd.lr(this.ri, f);
    }
}
