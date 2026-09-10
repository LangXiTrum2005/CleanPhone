package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes2.dex */
public class sf extends FrameLayout {
    private com.bytedance.sdk.openadsdk.core.di.mj di;
    private PAGLogoView fi;
    private TextView ik;
    private com.bytedance.sdk.openadsdk.core.ik.ri jbs;
    private slm ka;
    private bu lr;
    private String mj;
    private boolean ri;
    private wjv xha;

    public sf(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.slm.vt);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.ik.ri riVar) {
        this.jbs = riVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            ri();
        }
    }

    private void lr() {
        Context context = getContext();
        boolean z = this.xha.bbu() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setGravity(1);
        fiVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(qd.lr(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iLr = qd.lr(context, 24.0f);
        layoutParams.rightMargin = iLr;
        layoutParams.leftMargin = iLr;
        addView(fiVar, layoutParams);
        bu buVar = new bu(context);
        this.lr = buVar;
        buVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(qd.lr(context, 80.0f), qd.lr(context, 80.0f));
        layoutParams2.bottomMargin = qd.lr(context, 12.0f);
        fiVar.addView(this.lr, layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.ik = mjVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mjVar.setEllipsize(truncateAt);
        this.ik.setGravity(17);
        this.ik.setMaxLines(2);
        this.ik.setMaxWidth(qd.lr(context, 180.0f));
        this.ik.setTextColor(-1);
        this.ik.setTextSize(2, 24.0f);
        fiVar.addView(this.ik, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.di.mj mjVar2 = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.di = mjVar2;
        mjVar2.setEllipsize(truncateAt);
        this.di.setGravity(17);
        this.di.setMaxLines(2);
        this.di.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.di.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = qd.lr(context, 8.0f);
        fiVar.addView(this.di, layoutParams3);
        this.ka = new slm(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, qd.lr(context, 16.0f));
        layoutParams4.topMargin = qd.lr(context, 12.0f);
        this.ka.setVisibility(8);
        fiVar.addView(this.ka, layoutParams4);
        this.fi = PAGLogoView.createPAGLogoViewByMaterial(context, this.xha);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, qd.lr(context, 14.0f));
        layoutParams5.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
        layoutParams5.leftMargin = qd.lr(context, 18.0f);
        if (z) {
            layoutParams5.bottomMargin = qd.lr(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = qd.lr(context, 24.0f);
        }
        addView(this.fi, layoutParams5);
    }

    public void ri(wjv wjvVar, String str, com.bytedance.sdk.openadsdk.core.ik.ri riVar) {
        this.xha = wjvVar;
        this.mj = str;
        this.jbs = riVar;
    }

    private void ri() {
        if (this.ri) {
            return;
        }
        this.ri = true;
        lr();
        if (this.lr != null && this.xha.fb() != null && !TextUtils.isEmpty(this.xha.fb().ri())) {
            com.bytedance.sdk.openadsdk.ac.lr.lr().ri(this.xha.fb(), this.lr, this.xha);
        }
        slm slmVar = this.ka;
        if (slmVar != null) {
            qd.ri((TextView) null, slmVar, this.xha);
            if (this.xha.tyz() != null) {
                this.ka.setVisibility(0);
            }
        }
        if (this.ik != null) {
            if (this.xha.tyz() != null && !TextUtils.isEmpty(this.xha.tyz().lr())) {
                this.ik.setText(this.xha.tyz().lr());
            } else if (!TextUtils.isEmpty(this.xha.tpb())) {
                this.ik.setText(this.xha.tpb());
            } else {
                this.ik.setVisibility(8);
            }
        }
        if (this.di != null) {
            String strXh = this.xha.xh();
            if (!TextUtils.isEmpty(strXh)) {
                this.di.setText(strXh);
            } else {
                this.di.setVisibility(8);
            }
        }
        this.fi.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.sf.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.ri(sf.this.getContext(), sf.this.xha, sf.this.mj);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
