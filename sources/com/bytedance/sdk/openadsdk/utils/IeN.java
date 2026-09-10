package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public class IeN {

    public interface Lxb {
        void Lxb();

        void Lxb(com.bytedance.sdk.openadsdk.kqm.Lxb.LD ld);
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.kqm.Lxb lxb, int i, int i2, Lxb lxb2, String str) {
        Lxb(lxb, i, i2, lxb2, str, 0);
    }

    public static void Lxb(com.bytedance.sdk.openadsdk.kqm.Lxb lxb, int i, int i2, final Lxb lxb2, String str, int i3) {
        com.bytedance.sdk.component.utils.sLN.Lxb("splashLoadAd", " getImageBytes url ".concat(String.valueOf(lxb)));
        com.bytedance.sdk.openadsdk.kqm.lk.Lxb().lk().Lxb(lxb, new com.bytedance.sdk.openadsdk.kqm.Lxb.Lxb.InterfaceC0114Lxb() { // from class: com.bytedance.sdk.openadsdk.utils.IeN.1
            @Override // com.bytedance.sdk.openadsdk.kqm.Lxb.Lxb.InterfaceC0114Lxb
            public void Lxb(String str2, com.bytedance.sdk.openadsdk.kqm.Lxb.LD ld) {
                Lxb lxb3;
                if (ld.ZU() && (lxb3 = lxb2) != null) {
                    lxb3.Lxb(ld);
                    return;
                }
                Lxb lxb4 = lxb2;
                if (lxb4 != null) {
                    lxb4.Lxb();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.kqm.Lxb.Lxb.InterfaceC0114Lxb
            public void Lxb(int i4, String str2, Throwable th) {
                Lxb lxb3 = lxb2;
                if (lxb3 != null) {
                    lxb3.Lxb();
                }
            }
        }, i, i2, ImageView.ScaleType.CENTER_INSIDE, str, i3, null);
    }

    public static Drawable Lxb(byte[] bArr, int i) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}
