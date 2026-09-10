package com.bytedance.sdk.openadsdk.lnr;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.vu;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class lnr implements vu {
    private mml lnr;
    private boolean mml;
    private vu.qdl mzz;
    public fs qdl;
    private final Context ud;

    public lnr(Context context, String str, List<FilterWord> list, String str2, ljh ljhVar) {
        this.ud = context;
        qdl(str, list, str2, ljhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml() {
        Context context = this.ud;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.qdl.isShowing()) {
            return;
        }
        this.qdl.show();
    }

    private void qdl(String str, List<FilterWord> list, String str2, ljh ljhVar) {
        this.lnr = new mml(this.ud, str, list);
        fs fsVar = new fs(this.ud, this.lnr.getDislikeManager());
        this.qdl = fsVar;
        fsVar.qdl(str2, ljhVar);
        this.qdl.qdl(new fs.qdl() { // from class: com.bytedance.sdk.openadsdk.lnr.lnr.1
            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void lnr() {
                lnr.this.qdl();
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void qdl() {
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void ud() {
                lnr.this.qdl();
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.fs.qdl
            public void qdl(int i2, FilterWord filterWord, String str3) {
                lnr.this.lnr.onSuggestionSubmit(str3);
                lnr.this.qdl();
            }
        });
        this.lnr.qdl(new mml.qdl() { // from class: com.bytedance.sdk.openadsdk.lnr.lnr.2
            @Override // com.bytedance.sdk.openadsdk.lnr.mml.qdl
            public void qdl() {
                lnr.this.qdl(true);
                if (lnr.this.lnr != null && lnr.this.lnr.isShowing()) {
                    lnr.this.lnr.hide();
                }
                lnr.this.mml();
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.mml.qdl
            public void ud() {
                try {
                    if (lnr.this.mzz != null) {
                        lnr.this.mzz.qdl();
                    }
                } catch (Throwable th) {
                    aaj.qdl("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.lnr.mml.qdl
            public void qdl(int i2, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && lnr.this.mzz != null) {
                        lnr.this.mzz.qdl(i2, filterWord.getName());
                    }
                    filterWord.getName();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public boolean lnr() {
        return this.mml;
    }

    @Override // com.bytedance.sdk.openadsdk.core.vu
    public void ud() {
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.destroy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.vu
    public void qdl() {
        Context context = this.ud;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.lnr.isShowing()) {
            return;
        }
        this.lnr.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.vu
    public void qdl(vu.qdl qdlVar) {
        this.mzz = qdlVar;
    }

    public void qdl(String str) {
        mml mmlVar = this.lnr;
        if (mmlVar != null) {
            mmlVar.qdl(str);
        }
    }

    public void qdl(boolean z2) {
        this.mml = z2;
    }
}
