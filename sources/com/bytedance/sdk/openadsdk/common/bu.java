package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class bu extends com.bytedance.sdk.openadsdk.core.di.ik implements com.bytedance.sdk.openadsdk.ik.qt.lr {
    private boolean di;
    private String fi;
    private ri ik;
    private Context ka;
    private wjv lr;
    private View ri;
    private final com.bytedance.sdk.openadsdk.ik.qt xha;

    public interface ri {
        void lr(View view);

        void ri(View view);

        void ri(FilterWord filterWord);
    }

    public bu(Context context, wjv wjvVar) {
        this(context.getApplicationContext());
        this.lr = wjvVar;
        this.ka = context;
        ka();
        fi();
    }

    private com.bytedance.sdk.openadsdk.ik.co.ri di() {
        return new com.bytedance.sdk.openadsdk.ik.co.ri() { // from class: com.bytedance.sdk.openadsdk.common.bu.2
            @Override // com.bytedance.sdk.openadsdk.ik.co.ri
            public void ik() {
                bu.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.ik.co.ri
            public void lr() {
                bu.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.ik.co.ri
            public void ri() {
                bu.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.ik.co.ri
            public void ri(int i, FilterWord filterWord, String str) {
                bu.this.xha.ik(str);
                bu.this.setVisibility(0);
            }
        };
    }

    private void fi() {
        com.bytedance.sdk.openadsdk.ik.qt qtVar;
        wjv wjvVar = this.lr;
        if (wjvVar == null || (qtVar = this.xha) == null) {
            return;
        }
        qtVar.ri(wjvVar.ib());
    }

    private void ka() {
        this.xha.ri(this.lr.yjg());
        this.xha.ri(this);
    }

    public void ik() {
        Context context = this.ka;
        if (context instanceof Activity) {
            boolean zIsFinishing = ((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.ik.co coVar = new com.bytedance.sdk.openadsdk.ik.co(this.ka, this.xha);
            coVar.ri(di());
            coVar.ri(this.lr);
            if (zIsFinishing || coVar.isShowing()) {
                return;
            }
            coVar.show();
        }
    }

    public void lr() {
        setVisibility(8);
        this.di = false;
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.lr(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.ik.qt qtVar = this.xha;
        if (qtVar != null) {
            qtVar.ri();
        }
    }

    public void setCallback(ri riVar) {
        this.ik = riVar;
    }

    public void setDislikeSource(String str) {
        this.fi = str;
        this.xha.lr(str);
    }

    private void ri(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.bu.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (bu.this.xha != null) {
                    bu.this.xha.fi();
                } else {
                    bu.this.lr();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.ri = new com.bytedance.sdk.openadsdk.ik.jbs(context, this.xha);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = qd.lr(getContext(), 20.0f);
        layoutParams.rightMargin = qd.lr(getContext(), 20.0f);
        this.ri.setLayoutParams(layoutParams);
        this.ri.setClickable(true);
        fi();
    }

    public bu(Context context) {
        this(context, (AttributeSet) null);
    }

    public bu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.di = false;
        this.xha = new com.bytedance.sdk.openadsdk.ik.qt();
        ri(context, attributeSet);
    }

    public void ri() {
        if (this.ri.getParent() == null) {
            addView(this.ri);
        }
        setVisibility(0);
        this.di = true;
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ri(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ik.qt.lr
    public void ri(int i) {
        if (com.bytedance.sdk.openadsdk.ik.qt.lr == i) {
            FilterWord filterWordLr = this.xha.lr();
            if (filterWordLr == null || com.bytedance.sdk.openadsdk.ik.qt.ri.equals(filterWordLr)) {
                return;
            }
            ri riVar = this.ik;
            if (riVar != null) {
                try {
                    riVar.ri(filterWordLr);
                } catch (Throwable unused) {
                }
            }
            lr();
            return;
        }
        if (com.bytedance.sdk.openadsdk.ik.qt.ik == i) {
            lr();
        } else if (com.bytedance.sdk.openadsdk.ik.qt.fi == i) {
            ik();
        }
    }
}
