package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class bu {

    public interface ri {
        void ri();

        void ri(com.bytedance.sdk.openadsdk.ac.ri.lr lrVar);
    }

    public static void ri(com.bytedance.sdk.openadsdk.ac.ri riVar, int i, int i2, ri riVar2, String str) {
        ri(riVar, i, i2, riVar2, str, 0);
    }

    public static void ri(com.bytedance.sdk.openadsdk.ac.ri riVar, int i, int i2, final ri riVar2, String str, int i3) {
        Objects.toString(riVar);
        com.bytedance.sdk.openadsdk.ac.lr.lr().ka().ri(riVar, new com.bytedance.sdk.openadsdk.ac.ri.ri.InterfaceC0221ri() { // from class: com.bytedance.sdk.openadsdk.utils.bu.1
            @Override // com.bytedance.sdk.openadsdk.ac.ri.ri.InterfaceC0221ri
            public void ri(String str2, com.bytedance.sdk.openadsdk.ac.ri.lr lrVar) {
                ri riVar3;
                if (lrVar.fi() && (riVar3 = riVar2) != null) {
                    riVar3.ri(lrVar);
                    return;
                }
                ri riVar4 = riVar2;
                if (riVar4 != null) {
                    riVar4.ri();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ac.ri.ri.InterfaceC0221ri
            public void ri(int i4, String str2, Throwable th) {
                ri riVar3 = riVar2;
                if (riVar3 != null) {
                    riVar3.ri();
                }
            }
        }, i, i2, ImageView.ScaleType.CENTER_INSIDE, str, i3, null);
    }

    public static Drawable ri(byte[] bArr, int i) {
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
