package com.bytedance.sdk.openadsdk.mml.qdl;

import android.content.Context;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.yt;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    public static AtomicInteger qdl = new AtomicInteger(0);
    public static final AtomicBoolean ud = new AtomicBoolean(false);

    public static void lnr() {
        try {
            com.bytedance.sdk.component.mo.qdl.ud.mml();
            com.bytedance.sdk.component.mo.qdl.ud.mzz();
        } catch (Throwable th) {
            aaj.lnr("AdLogSwitchUtils", th.getMessage());
        }
    }

    public static void qdl(Context context, boolean z2) {
        if (ud.compareAndSet(false, true)) {
            com.bytedance.sdk.component.mo.qdl.ud.qdl(new com.bytedance.sdk.component.mo.qdl.qdl.C0085qdl().qdl(new wd()).ud(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl.lnr()).lnr(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl.mzz()).qdl(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl.mml()).qdl(z2).qdl(new jpc()).qdl(mzz.qdl).ud(yt.mml().bjy()).qdl(yt.mml().jtx()).qdl(yt.mml().ew()).qdl(), context);
            ud();
        }
    }

    public static void ud() {
        com.bytedance.sdk.component.mo.qdl.ud.lnr();
    }

    public static void qdl(com.bytedance.sdk.openadsdk.mml.qdl qdlVar) {
        com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl qdlVar2 = new com.bytedance.sdk.component.mo.qdl.mml.qdl.qdl(qdlVar.mml(), qdlVar);
        qdlVar2.ud(qdlVar.mzz() ? (byte) 1 : (byte) 2);
        qdlVar2.qdl((byte) 0);
        if (com.bytedance.sdk.component.mo.qdl.ud.ud()) {
            qdl(yt.qdl(), com.bytedance.sdk.openadsdk.multipro.ud.lnr());
        }
        com.bytedance.sdk.component.mo.qdl.ud.qdl(qdlVar2);
    }

    public static com.bytedance.sdk.openadsdk.bjy.lnr.lnr qdl() {
        return tvp.qdl;
    }

    public static void qdl(final List<String> list, final int i2, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(new com.bytedance.sdk.component.jpc.jpc("track") { // from class: com.bytedance.sdk.openadsdk.mml.qdl.ud.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.mo.qdl.ud.ud()) {
                    ud.qdl(yt.qdl(), com.bytedance.sdk.openadsdk.multipro.ud.lnr());
                }
                com.bytedance.sdk.component.mo.qdl.ud.qdl(fs.qdl(yt.qdl()), list, true, i2, str);
            }
        });
    }

    public static void qdl(String str) {
        qdl(str, false);
    }

    public static void qdl(String str, boolean z2) {
        if (com.bytedance.sdk.component.mo.qdl.ud.ud()) {
            qdl(yt.qdl(), com.bytedance.sdk.openadsdk.multipro.ud.lnr());
        }
        com.bytedance.sdk.component.mo.qdl.ud.qdl(str, z2);
    }
}
