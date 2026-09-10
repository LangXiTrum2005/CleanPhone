package com.bytedance.sdk.openadsdk.ka.ri;

import android.content.Context;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.core.aw;
import com.bytedance.sdk.openadsdk.core.nr;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static AtomicInteger ri = new AtomicInteger(0);
    public static final AtomicBoolean lr = new AtomicBoolean(false);

    public static void ik() {
        try {
            com.bytedance.sdk.component.di.ri.lr.ka();
            com.bytedance.sdk.component.di.ri.lr.fi();
        } catch (Throwable th) {
            ac.ik("AdLogSwitchUtils", th.getMessage());
        }
    }

    public static void lr() {
        com.bytedance.sdk.component.di.ri.lr.ik();
    }

    public static void ri(Context context) {
        try {
            if (lr.compareAndSet(false, true)) {
                com.bytedance.sdk.component.di.ri.lr.ri(new com.bytedance.sdk.component.di.ri.ri.C0208ri().ri(new di()).lr(com.bytedance.sdk.component.di.ri.ka.lr.ri.ik()).ik(com.bytedance.sdk.component.di.ri.ka.lr.ri.fi()).ri(com.bytedance.sdk.component.di.ri.ka.lr.ri.ka()).ri(new xha()).ri(ka.ri).lr(nr.ka().bgr()).ri(nr.ka().vr()).ri(nr.ka().id()).ri(), context);
                lr();
            }
        } catch (Throwable unused) {
            lr.set(false);
        }
    }

    public static void ri(com.bytedance.sdk.openadsdk.ka.ri riVar) {
        com.bytedance.sdk.component.di.ri.ka.ri.ri riVar2 = new com.bytedance.sdk.component.di.ri.ka.ri.ri(riVar.fi(), riVar);
        riVar2.ik(riVar.di() ? (byte) 1 : (byte) 2);
        riVar2.lr((byte) 0);
        if (com.bytedance.sdk.component.di.ri.lr.lr()) {
            ri(nr.ri());
        }
        com.bytedance.sdk.component.di.ri.lr.ri(riVar2);
    }

    public static com.bytedance.sdk.openadsdk.slm.lr.ik ri() {
        return mj.ri;
    }

    public static void ri(final List<String> list, final int i, final String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(new com.bytedance.sdk.component.mj.lr.ik("track") { // from class: com.bytedance.sdk.openadsdk.ka.ri.lr.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.di.ri.lr.lr()) {
                    lr.ri(nr.ri());
                }
                com.bytedance.sdk.component.di.ri.lr.ri(aw.ri(nr.ri()), list, true, i, str);
            }
        });
    }

    public static void ri(String str) {
        ri(str, false);
    }

    public static void ri(String str, boolean z) {
        if (com.bytedance.sdk.component.di.ri.lr.lr()) {
            ri(nr.ri());
        }
        com.bytedance.sdk.component.di.ri.lr.ri(str, z);
    }
}
