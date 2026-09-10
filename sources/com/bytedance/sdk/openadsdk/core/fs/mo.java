package com.bytedance.sdk.openadsdk.core.fs;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mo {
    final Set<Pair<View, FriendlyObstructionPurpose>> qdl = new HashSet();
    private wd ud;

    private mo() {
        mzz.qdl(yt.qdl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpc() {
        wd wdVar = this.ud;
        if (wdVar != null) {
            try {
                wdVar.lnr();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mo() {
        if (this.ud != null) {
            try {
                qdl((View) null, (FriendlyObstructionPurpose) null);
                this.ud.ud();
            } catch (Throwable unused) {
            }
        }
    }

    private Handler mzz() {
        return com.bytedance.sdk.component.utils.tvp.ud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wd() {
        wd wdVar = this.ud;
        if (wdVar != null) {
            try {
                wdVar.mml();
            } catch (Throwable unused) {
            }
        }
    }

    public void mml() {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            jpc();
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.7
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.jpc();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(WebView webView) {
        try {
            if (this.ud == null) {
                this.ud = jpc.qdl(webView);
            }
        } catch (Throwable th) {
            aaj.lnr("createWebViewSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            mzz.qdl(map);
        }
    }

    public void lnr() {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            wd();
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.6
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.wd();
                }
            });
        }
    }

    public static mo qdl() {
        return new mo();
    }

    public void qdl(final WebView webView) {
        if (webView == null || this.ud != null) {
            return;
        }
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(webView);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.1
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(webView);
                }
            });
        }
    }

    public void ud() {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            mo();
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.4
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.mo();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(boolean z2, float f) {
        if (this.ud != null) {
            try {
                qdl((View) null, (FriendlyObstructionPurpose) null);
                this.ud.qdl(z2, f);
            } catch (Throwable unused) {
            }
        }
    }

    public void qdl(final View view, final ljh ljhVar) {
        if (this.ud != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ljhVar.zm();
        final Set<to> setUd = mmlVarZm != null ? mmlVarZm.ud() : null;
        if (view == null || setUd == null) {
            return;
        }
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            qdl(view, setUd, ljhVar);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.3
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.qdl(view, (Set<to>) setUd, ljhVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        wd wdVar = this.ud;
        try {
            if (wdVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.qdl.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                wdVar.qdl(view, friendlyObstructionPurpose);
            }
            if (this.qdl.size() > 0) {
                wdVar.qdl(this.qdl);
                this.qdl.clear();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(View view, Set<to> set, ljh ljhVar) {
        try {
            if (this.ud == null) {
                this.ud = jpc.qdl(view, set);
                if (ljhVar.uj()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, ljhVar.mzz(), "track_create", (JSONObject) null);
            }
        } catch (Throwable th) {
            aaj.lnr("createVideoSession failed : ".concat(String.valueOf(th)), new Object[0]);
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            mzz.qdl(map);
        }
    }

    public void ud(long j, boolean z2) {
        wd wdVar = this.ud;
        if (wdVar != null) {
            try {
                wdVar.qdl(j / 1000.0f, z2);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(boolean z2) {
        wd wdVar = this.ud;
        if (wdVar != null) {
            try {
                wdVar.qdl(z2);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(int i2) {
        wd wdVar = this.ud;
        if (wdVar != null) {
            try {
                wdVar.ud(i2);
            } catch (Throwable unused) {
            }
        }
    }

    public void qdl(final boolean z2, final float f) {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(z2, f);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.5
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(z2, f);
                }
            });
        }
    }

    public void qdl(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(view, friendlyObstructionPurpose);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.8
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    public void qdl(final long j, final boolean z2) {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(j, z2);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.9
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(j, z2);
                }
            });
        }
    }

    public void qdl(final boolean z2) {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(z2);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.10
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(z2);
                }
            });
        }
    }

    public void qdl(final int i2) {
        if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
            ud(i2);
        } else {
            mzz().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.fs.mo.2
                @Override // java.lang.Runnable
                public void run() {
                    mo.this.ud(i2);
                }
            });
        }
    }
}
