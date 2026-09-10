package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class bjy extends com.bytedance.sdk.openadsdk.core.mo.lnr implements com.bytedance.sdk.openadsdk.lnr.to.ud {
    private qdl lnr;
    private Context mml;
    private boolean mo;
    private String mzz;
    private View qdl;
    private ljh ud;
    private final com.bytedance.sdk.openadsdk.lnr.to wd;

    public interface qdl {
        void qdl(View view);

        void qdl(FilterWord filterWord);

        void ud(View view);
    }

    public bjy(Context context, ljh ljhVar) {
        this(context.getApplicationContext());
        this.ud = ljhVar;
        this.mml = context;
        mml();
        mzz();
    }

    private void mml() {
        this.wd.qdl(this.ud.ir());
        this.wd.qdl(this);
    }

    private com.bytedance.sdk.openadsdk.lnr.fs.qdl mo() {
        return new com.bytedance.sdk.openadsdk.lnr.fs.qdl() { // from class: com.bytedance.sdk.openadsdk.common.bjy.2
            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void lnr() {
                bjy.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void qdl() {
                bjy.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void ud() {
                bjy.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void qdl(int i2, FilterWord filterWord, String str) {
                bjy.this.wd.lnr(str);
                bjy.this.setVisibility(0);
            }
        };
    }

    private void mzz() {
        com.bytedance.sdk.openadsdk.lnr.to toVar;
        ljh ljhVar = this.ud;
        if (ljhVar == null || (toVar = this.wd) == null) {
            return;
        }
        toVar.qdl(ljhVar.fc());
    }

    public void lnr() {
        Context context = this.mml;
        if (context instanceof Activity) {
            boolean zIsFinishing = ((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.lnr.fs fsVar = new com.bytedance.sdk.openadsdk.lnr.fs(this.mml, this.wd);
            fsVar.qdl(mo());
            fsVar.qdl("", this.ud);
            if (zIsFinishing || fsVar.isShowing()) {
                return;
            }
            fsVar.show();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.lnr.to toVar = this.wd;
        if (toVar != null) {
            toVar.qdl();
        }
    }

    public void setCallback(qdl qdlVar) {
        this.lnr = qdlVar;
    }

    public void setDislikeSource(String str) {
        this.mzz = str;
        this.wd.ud(str);
    }

    public void ud() {
        setVisibility(8);
        this.mo = false;
        qdl qdlVar = this.lnr;
        if (qdlVar != null) {
            qdlVar.ud(this);
        }
    }

    private void qdl(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.bjy.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (bjy.this.wd != null) {
                    bjy.this.wd.mzz();
                } else {
                    bjy.this.ud();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.qdl = new com.bytedance.sdk.openadsdk.lnr.tvp(context, this.wd);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = ax.ud(getContext(), 20.0f);
        layoutParams.rightMargin = ax.ud(getContext(), 20.0f);
        this.qdl.setLayoutParams(layoutParams);
        this.qdl.setClickable(true);
        mzz();
    }

    public bjy(Context context) {
        this(context, (AttributeSet) null);
    }

    public bjy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bjy(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mo = false;
        this.wd = new com.bytedance.sdk.openadsdk.lnr.to();
        qdl(context, attributeSet);
    }

    public void qdl() {
        if (this.qdl.getParent() == null) {
            addView(this.qdl);
        }
        setVisibility(0);
        this.mo = true;
        qdl qdlVar = this.lnr;
        if (qdlVar != null) {
            qdlVar.qdl(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lnr.to.ud
    public void qdl(int i2) {
        if (com.bytedance.sdk.openadsdk.lnr.to.ud == i2) {
            FilterWord filterWordUd = this.wd.ud();
            if (filterWordUd == null || com.bytedance.sdk.openadsdk.lnr.to.qdl.equals(filterWordUd)) {
                return;
            }
            qdl qdlVar = this.lnr;
            if (qdlVar != null) {
                try {
                    qdlVar.qdl(filterWordUd);
                } catch (Throwable unused) {
                }
            }
            ud();
            return;
        }
        if (com.bytedance.sdk.openadsdk.lnr.to.lnr == i2) {
            ud();
        } else if (com.bytedance.sdk.openadsdk.lnr.to.mzz == i2) {
            lnr();
        }
    }
}
