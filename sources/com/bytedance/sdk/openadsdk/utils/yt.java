package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class yt {

    public interface qdl {
        void qdl();

        void qdl(com.bytedance.sdk.openadsdk.jl.qdl.ud udVar);
    }

    public static void qdl(com.bytedance.sdk.openadsdk.jl.qdl qdlVar, int i2, int i3, qdl qdlVar2, String str) {
        qdl(qdlVar, i2, i3, qdlVar2, str, 0);
    }

    public static void qdl(com.bytedance.sdk.openadsdk.jl.qdl qdlVar, int i2, int i3, final qdl qdlVar2, String str, int i4) {
        Objects.toString(qdlVar);
        com.bytedance.sdk.openadsdk.jl.ud.ud().mml().qdl(qdlVar, new com.bytedance.sdk.openadsdk.jl.qdl.qdl.InterfaceC0141qdl() { // from class: com.bytedance.sdk.openadsdk.utils.yt.1
            @Override // com.bytedance.sdk.openadsdk.jl.qdl.qdl.InterfaceC0141qdl
            public void qdl(String str2, com.bytedance.sdk.openadsdk.jl.qdl.ud udVar) {
                qdl qdlVar3;
                if (udVar.mzz() && (qdlVar3 = qdlVar2) != null) {
                    qdlVar3.qdl(udVar);
                    return;
                }
                qdl qdlVar4 = qdlVar2;
                if (qdlVar4 != null) {
                    qdlVar4.qdl();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jl.qdl.qdl.InterfaceC0141qdl
            public void qdl(int i5, String str2, Throwable th) {
                qdl qdlVar3 = qdlVar2;
                if (qdlVar3 != null) {
                    qdlVar3.qdl();
                }
            }
        }, i2, i3, ImageView.ScaleType.CENTER_INSIDE, str, i4, null);
    }

    public static Drawable qdl(byte[] bArr, int i2) {
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
