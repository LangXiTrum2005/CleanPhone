package com.bytedance.sdk.openadsdk.core.aw;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
import plench.attabal;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private xha lr;
    final Set<Pair<View, FriendlyObstructionPurpose>> ri = new HashSet();

    private di() {
        fi.ri(nr.ri());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void di() {
        if (this.lr != null) {
            try {
                ri((View) null, (FriendlyObstructionPurpose) null);
                this.lr.lr();
            } catch (Throwable unused) {
            }
        }
    }

    private Handler fi() {
        return com.bytedance.sdk.component.utils.jbs.lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mj() {
        xha xhaVar = this.lr;
        if (xhaVar != null) {
            try {
                xhaVar.ik();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xha() {
        xha xhaVar = this.lr;
        if (xhaVar != null) {
            try {
                xhaVar.ka();
            } catch (Throwable unused) {
            }
        }
    }

    public void ka() {
        if (attabal.attabal()) {
            mj();
        } else {
            fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.7
                @Override // java.lang.Runnable
                public void run() {
                    di.this.mj();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(WebView webView) {
        try {
            if (this.lr == null) {
                this.lr = mj.ri(webView);
            }
        } catch (Throwable th) {
            ac.ik("createWebViewSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            fi.ri(map);
        }
    }

    public void ik() {
        if (attabal.attabal()) {
            xha();
        } else {
            fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.6
                @Override // java.lang.Runnable
                public void run() {
                    di.this.xha();
                }
            });
        }
    }

    public static di ri() {
        return new di();
    }

    public void lr() {
        if (attabal.attabal()) {
            di();
        } else {
            fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.4
                @Override // java.lang.Runnable
                public void run() {
                    di.this.di();
                }
            });
        }
    }

    public void ri(final WebView webView) {
        if (webView == null || this.lr != null) {
            return;
        }
        if (attabal.attabal()) {
            lr(webView);
        } else {
            fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.1
                @Override // java.lang.Runnable
                public void run() {
                    di.this.lr(webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(boolean z, float f) {
        if (this.lr != null) {
            try {
                ri((View) null, (FriendlyObstructionPurpose) null);
                this.lr.ri(z, f);
            } catch (Throwable unused) {
            }
        }
    }

    public void ri(final View view, final wjv wjvVar) {
        if (this.lr != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = wjvVar.qc();
        final Set<qt> setLr = kaVarQc != null ? kaVarQc.lr() : null;
        if (view == null || setLr == null) {
            return;
        }
        if (attabal.attabal()) {
            ri(view, setLr, wjvVar);
        } else {
            fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.3
                @Override // java.lang.Runnable
                public void run() {
                    di.this.ri(view, (Set<qt>) setLr, wjvVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        xha xhaVar = this.lr;
        try {
            if (xhaVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.ri.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                xhaVar.ri(view, friendlyObstructionPurpose);
            }
            if (this.ri.size() > 0) {
                xhaVar.ri(this.ri);
                this.ri.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(View view, Set<qt> set, wjv wjvVar) {
        try {
            if (this.lr == null) {
                this.lr = mj.ri(view, set);
                if (wjvVar.zz()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.ka.ik.lr(wjvVar, wjvVar.fi(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th) {
            ac.ik("createVideoSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            fi.ri(map);
        }
    }

    public void lr(long j, boolean z) {
        xha xhaVar = this.lr;
        if (xhaVar != null) {
            try {
                xhaVar.ri(j / 1000.0f, z);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(boolean z) {
        xha xhaVar = this.lr;
        if (xhaVar != null) {
            try {
                xhaVar.ri(z);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(int i) {
        xha xhaVar = this.lr;
        if (xhaVar != null) {
            try {
                xhaVar.lr(i);
            } catch (Throwable unused) {
            }
        }
    }

    public void ri(final boolean z, final float f) {
        if (attabal.attabal()) {
            lr(z, f);
        } else {
            fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.5
                @Override // java.lang.Runnable
                public void run() {
                    di.this.lr(z, f);
                }
            });
        }
    }

    public void ri(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (attabal.attabal()) {
            lr(view, friendlyObstructionPurpose);
        } else {
            fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.8
                @Override // java.lang.Runnable
                public void run() {
                    di.this.lr(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    public void ri(final long j, final boolean z) {
        if (attabal.attabal()) {
            lr(j, z);
        } else {
            fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.9
                @Override // java.lang.Runnable
                public void run() {
                    di.this.lr(j, z);
                }
            });
        }
    }

    public void ri(final boolean z) {
        if (attabal.attabal()) {
            lr(z);
        } else {
            fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.10
                @Override // java.lang.Runnable
                public void run() {
                    di.this.lr(z);
                }
            });
        }
    }

    public void ri(final int i) {
        if (attabal.attabal()) {
            lr(i);
        } else {
            fi().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.aw.di.2
                @Override // java.lang.Runnable
                public void run() {
                    di.this.lr(i);
                }
            });
        }
    }
}
