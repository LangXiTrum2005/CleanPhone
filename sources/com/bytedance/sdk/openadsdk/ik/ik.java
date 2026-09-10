package com.bytedance.sdk.openadsdk.ik;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.ory;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements ory {
    private ory.ri fi;
    private ka ik;
    private boolean ka;
    private final Context lr;
    public co ri;

    public ik(Context context, String str, List<FilterWord> list, wjv wjvVar) {
        this.lr = context;
        ri(str, list, wjvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka() {
        Context context = this.lr;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.ri.isShowing()) {
            return;
        }
        this.ri.show();
    }

    private void ri(String str, List<FilterWord> list, wjv wjvVar) {
        this.ik = new ka(this.lr, str, list);
        co coVar = new co(this.lr, this.ik.getDislikeManager());
        this.ri = coVar;
        coVar.ri(wjvVar);
        this.ri.ri(new co.ri() { // from class: com.bytedance.sdk.openadsdk.ik.ik.1
            @Override // com.bytedance.sdk.openadsdk.ik.co.ri
            public void ik() {
                ik.this.ri();
            }

            @Override // com.bytedance.sdk.openadsdk.ik.co.ri
            public void lr() {
                ik.this.ri();
            }

            @Override // com.bytedance.sdk.openadsdk.ik.co.ri
            public void ri() {
            }

            @Override // com.bytedance.sdk.openadsdk.ik.co.ri
            public void ri(int i, FilterWord filterWord, String str2) {
                ik.this.ik.onSuggestionSubmit(str2);
                ik.this.ri();
            }
        });
        this.ik.ri(new ka.ri() { // from class: com.bytedance.sdk.openadsdk.ik.ik.2
            @Override // com.bytedance.sdk.openadsdk.ik.ka.ri
            public void lr() {
                try {
                    if (ik.this.fi != null) {
                        ik.this.fi.ri();
                    }
                } catch (Throwable th) {
                    ac.ri("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ik.ka.ri
            public void ri() {
                ik.this.ri(true);
                if (ik.this.ik != null && ik.this.ik.isShowing()) {
                    ik.this.ik.hide();
                }
                ik.this.ka();
            }

            @Override // com.bytedance.sdk.openadsdk.ik.ka.ri
            public void ri(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && ik.this.fi != null) {
                        ik.this.fi.ri(i, filterWord.getName());
                    }
                    filterWord.getName();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public boolean ik() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ory
    public void lr() {
        ka kaVar = this.ik;
        if (kaVar != null) {
            kaVar.destroy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ory
    public void ri() {
        Context context = this.lr;
        if (!(context instanceof Activity) || ((Activity) context).isFinishing() || this.ik.isShowing()) {
            return;
        }
        this.ik.show();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ory
    public void ri(ory.ri riVar) {
        this.fi = riVar;
    }

    public void ri(boolean z) {
        this.ka = z;
    }
}
