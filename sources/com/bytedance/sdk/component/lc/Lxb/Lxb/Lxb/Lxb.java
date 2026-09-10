package com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb extends LD {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Lxb Lxb;

    private Lxb(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.lc.Lxb.Lxb.Lxb.LD
    public /* bridge */ /* synthetic */ LD.C0065LD Lxb() {
        return super.Lxb();
    }

    public static Lxb Lxb(Context context) {
        if (Lxb == null) {
            synchronized (Lxb.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new Lxb(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }
}
