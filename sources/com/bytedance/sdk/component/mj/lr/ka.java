package com.bytedance.sdk.component.mj.lr;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public class ka {
    public static Handler ik;
    public static ri lr;
    public static di ri;

    public static Handler lr() {
        return ik;
    }

    public static void ri(ri riVar) {
        lr = riVar;
    }

    public static ri ri() {
        return lr;
    }

    public static void ri(Handler handler) {
        ik = handler;
    }
}
