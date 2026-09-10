package com.bytedance.sdk.component.mj;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private static com.bytedance.sdk.component.ri ri;

    public static void ri(com.bytedance.sdk.component.ri riVar) {
        ri = riVar;
    }

    public static void ri(Runnable runnable) {
        com.bytedance.sdk.component.ri riVar = ri;
        if (riVar == null) {
            return;
        }
        riVar.ri(runnable);
    }
}
