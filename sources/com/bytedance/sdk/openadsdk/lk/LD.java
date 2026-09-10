package com.bytedance.sdk.openadsdk.lk;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.tD;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private static volatile LD Lxb;
    private final tD<com.bytedance.sdk.openadsdk.ZU.Lxb> LD = kqm.lk();

    private LD() {
    }

    public static LD Lxb() {
        if (Lxb == null) {
            synchronized (LD.class) {
                try {
                    if (Lxb == null) {
                        Lxb = new LD();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public void Lxb(@NonNull String str, List<FilterWord> list, String str2) {
        Lxb(str, list, null, null, str2);
    }

    public void Lxb(@NonNull String str, List<FilterWord> list, String str2, String str3, String str4) {
        this.LD.Lxb(str, list, str2, str3, str4);
    }
}
