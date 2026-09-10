package com.bytedance.sdk.openadsdk.core.sLN;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.umeng.ccg.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PK;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private ebl LD;
    final Set<Pair<View, FriendlyObstructionPurpose>> Lxb = new HashSet();

    private lc() {
        JXs.Lxb(kqm.Lxb());
    }

    private Handler JXs() {
        return com.bytedance.sdk.component.utils.ebl.LD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OY() {
        ebl eblVar = this.LD;
        if (eblVar != null) {
            try {
                eblVar.lk();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ebl() {
        ebl eblVar = this.LD;
        if (eblVar != null) {
            try {
                eblVar.ZU();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lc() {
        if (this.LD != null) {
            try {
                Lxb((View) null, (FriendlyObstructionPurpose) null);
                this.LD.LD();
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void ZU() {
        if (PK.a()) {
            OY();
        } else {
            JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lc.8
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.OY();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(WebView webView) {
        try {
            if (this.LD == null) {
                this.LD = OY.Lxb(webView);
            }
        } catch (Throwable th) {
            sLN.LD("createWebViewSession failed : ".concat(String.valueOf(th)));
            HashMap map = new HashMap();
            map.put(a.j, "createWebViewSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            JXs.Lxb(map);
        }
    }

    @UiThread
    public void lk() {
        if (PK.a()) {
            ebl();
        } else {
            JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lc.7
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.ebl();
                }
            });
        }
    }

    public static lc Lxb() {
        return new lc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(View view, Set<nBu> set) {
        try {
            if (this.LD == null) {
                this.LD = OY.Lxb(view, set);
            }
        } catch (Throwable th) {
            sLN.LD("createVideoSession failed : ".concat(String.valueOf(th)));
            HashMap map = new HashMap();
            map.put(a.j, "createVideoSession");
            map.put(PglCryptUtils.KEY_MESSAGE, th.getMessage());
            JXs.Lxb(map);
        }
    }

    @UiThread
    public void Lxb(final WebView webView) {
        if (webView == null || this.LD != null) {
            return;
        }
        if (PK.a()) {
            LD(webView);
        } else {
            JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lc.1
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.LD(webView);
                }
            });
        }
    }

    public void Lxb(final View view, final Set<nBu> set) {
        if (this.LD != null || view == null || set == null) {
            return;
        }
        if (PK.a()) {
            LD(view, set);
        } else {
            JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lc.4
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.LD(view, (Set<nBu>) set);
                }
            });
        }
    }

    @UiThread
    public void LD() {
        if (PK.a()) {
            lc();
        } else {
            JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lc.5
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.lc();
                }
            });
        }
    }

    @UiThread
    public void Lxb(final boolean z, final float f) {
        if (PK.a()) {
            LD(z, f);
        } else {
            JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lc.6
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.LD(z, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(boolean z, float f) {
        if (this.LD != null) {
            try {
                Lxb((View) null, (FriendlyObstructionPurpose) null);
                this.LD.Lxb(z, f);
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void Lxb(@Nullable final View view, @Nullable final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (PK.a()) {
            LD(view, friendlyObstructionPurpose);
        } else {
            JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lc.9
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.LD(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        ebl eblVar = this.LD;
        try {
            if (eblVar == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.Lxb.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                eblVar.Lxb(view, friendlyObstructionPurpose);
            }
            if (this.Lxb.size() > 0) {
                eblVar.Lxb(this.Lxb);
                this.Lxb.clear();
            }
        } catch (Throwable unused) {
        }
    }

    @UiThread
    public void Lxb(final long j, final boolean z) {
        if (PK.a()) {
            LD(j, z);
        } else {
            JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lc.10
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.LD(j, z);
                }
            });
        }
    }

    @UiThread
    public void Lxb(final boolean z) {
        if (PK.a()) {
            LD(z);
        } else {
            JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lc.2
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.LD(z);
                }
            });
        }
    }

    public void LD(long j, boolean z) {
        ebl eblVar = this.LD;
        if (eblVar != null) {
            try {
                eblVar.Lxb(j / 1000.0f, z);
            } catch (Throwable unused) {
            }
        }
    }

    @UiThread
    public void Lxb(final int i) {
        if (PK.a()) {
            LD(i);
        } else {
            JXs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sLN.lc.3
                @Override // java.lang.Runnable
                public void run() {
                    lc.this.LD(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(boolean z) {
        ebl eblVar = this.LD;
        if (eblVar != null) {
            try {
                eblVar.Lxb(z);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(int i) {
        ebl eblVar = this.LD;
        if (eblVar != null) {
            try {
                eblVar.LD(i);
            } catch (Throwable unused) {
            }
        }
    }
}
