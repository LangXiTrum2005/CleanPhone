package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class IeN extends com.bytedance.sdk.openadsdk.core.JXs.lk implements com.bytedance.sdk.openadsdk.lk.nBu.LD {
    private String JXs;
    private tD LD;
    private View Lxb;
    private Context ZU;
    private final com.bytedance.sdk.openadsdk.lk.nBu ebl;
    private boolean lc;
    private Lxb lk;

    public interface Lxb {
        void LD(View view);

        void Lxb(View view);

        void Lxb(FilterWord filterWord);
    }

    public IeN(@NonNull Context context, @NonNull tD tDVar) {
        this(context.getApplicationContext());
        this.LD = tDVar;
        this.ZU = context;
        ZU();
        JXs();
    }

    private void JXs() {
        com.bytedance.sdk.openadsdk.lk.nBu nbu;
        tD tDVar = this.LD;
        if (tDVar == null || (nbu = this.ebl) == null) {
            return;
        }
        nbu.Lxb(tDVar.Wi());
    }

    private void ZU() {
        this.ebl.Lxb(this.LD.Lv());
        this.ebl.Lxb(this);
    }

    private com.bytedance.sdk.openadsdk.lk.sLN.Lxb lc() {
        return new com.bytedance.sdk.openadsdk.lk.sLN.Lxb() { // from class: com.bytedance.sdk.openadsdk.common.IeN.2
            @Override // com.bytedance.sdk.openadsdk.lk.sLN.Lxb
            public void LD() {
                IeN.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.lk.sLN.Lxb
            public void Lxb() {
                IeN.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.lk.sLN.Lxb
            public void lk() {
                IeN.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.lk.sLN.Lxb
            public void Lxb(int i, FilterWord filterWord, String str) {
                IeN.this.ebl.lk(str);
                IeN.this.setVisibility(0);
            }
        };
    }

    public void LD() {
        setVisibility(8);
        this.lc = false;
        Lxb lxb = this.lk;
        if (lxb != null) {
            lxb.LD(this);
        }
    }

    public void lk() {
        Context context = this.ZU;
        if (context instanceof Activity) {
            boolean z = !((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.lk.sLN sln = new com.bytedance.sdk.openadsdk.lk.sLN(this.ZU, this.ebl);
            sln.Lxb(lc());
            sln.Lxb(this.LD.Lv(), this.LD.JD().toString());
            sln.Lxb(this.JXs);
            if (!z || sln.isShowing()) {
                return;
            }
            sln.show();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.lk.nBu nbu = this.ebl;
        if (nbu != null) {
            nbu.Lxb();
        }
    }

    public void setCallback(Lxb lxb) {
        this.lk = lxb;
    }

    public void setDislikeSource(String str) {
        this.JXs = str;
        this.ebl.LD(str);
    }

    private void Lxb(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.IeN.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (IeN.this.ebl != null) {
                    IeN.this.ebl.JXs();
                } else {
                    IeN.this.LD();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.Lxb = new com.bytedance.sdk.openadsdk.lk.QAg(context, this.ebl);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = le.lk(getContext(), 20.0f);
        layoutParams.rightMargin = le.lk(getContext(), 20.0f);
        this.Lxb.setLayoutParams(layoutParams);
        this.Lxb.setClickable(true);
        JXs();
    }

    public IeN(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public IeN(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IeN(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lc = false;
        this.ebl = new com.bytedance.sdk.openadsdk.lk.nBu();
        Lxb(context, attributeSet);
    }

    public void Lxb() {
        if (this.Lxb.getParent() == null) {
            addView(this.Lxb);
        }
        setVisibility(0);
        this.lc = true;
        Lxb lxb = this.lk;
        if (lxb != null) {
            lxb.Lxb(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lk.nBu.LD
    public void Lxb(int i) {
        if (com.bytedance.sdk.openadsdk.lk.nBu.LD == i) {
            FilterWord filterWordLD = this.ebl.LD();
            if (filterWordLD == null || com.bytedance.sdk.openadsdk.lk.nBu.Lxb.equals(filterWordLD)) {
                return;
            }
            Lxb lxb = this.lk;
            if (lxb != null) {
                try {
                    lxb.Lxb(filterWordLD);
                } catch (Throwable unused) {
                }
            }
            LD();
            return;
        }
        if (com.bytedance.sdk.openadsdk.lk.nBu.lk == i) {
            LD();
        } else if (com.bytedance.sdk.openadsdk.lk.nBu.JXs == i) {
            lk();
        }
    }
}
