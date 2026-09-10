package com.bytedance.sdk.openadsdk.jl.qdl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.mzz.jpc;
import com.bytedance.sdk.component.mzz.jtx;
import com.bytedance.sdk.component.mzz.rq;
import com.bytedance.sdk.component.mzz.to;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.tvp.mml;
import com.bytedance.sdk.openadsdk.utils.ax;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.jl.qdl.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0141qdl {
        void qdl(int i2, String str, Throwable th);

        void qdl(String str, ud udVar);
    }

    public void qdl(com.bytedance.sdk.openadsdk.jl.qdl qdlVar, final InterfaceC0141qdl interfaceC0141qdl, int i2, int i3, ImageView.ScaleType scaleType, String str, final int i4, ljh ljhVar) {
        to toVarQdl = mml.qdl(qdlVar.qdl).qdl(qdlVar.ud).qdl(i2).ud(i3).mzz(ax.mzz(yt.qdl())).mml(ax.lnr(yt.qdl())).ud(str).qdl(scaleType).qdl(!TextUtils.isEmpty(str));
        if (i4 <= 0 || Build.VERSION.SDK_INT < 26) {
            toVarQdl.lnr(1);
        } else {
            toVarQdl.lnr(2).qdl(new jpc() { // from class: com.bytedance.sdk.openadsdk.jl.qdl.qdl.1
                @Override // com.bytedance.sdk.component.mzz.jpc
                public Bitmap qdl(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.mml.qdl.qdl(yt.qdl(), bitmap, i4);
                }
            });
        }
        toVarQdl.qdl(new com.bytedance.sdk.openadsdk.tvp.ud(ljhVar, qdlVar.qdl, new jtx() { // from class: com.bytedance.sdk.openadsdk.jl.qdl.qdl.2
            @Override // com.bytedance.sdk.component.mzz.jtx
            public void qdl(rq rqVar) {
                qdl.this.qdl(rqVar, interfaceC0141qdl);
            }

            @Override // com.bytedance.sdk.component.mzz.jtx
            public void qdl(int i5, String str2, Throwable th) {
                qdl.this.qdl(i5, str2, th, interfaceC0141qdl);
            }
        }));
    }

    public void qdl(rq rqVar, InterfaceC0141qdl interfaceC0141qdl) {
        if (interfaceC0141qdl != null) {
            Object objUd = rqVar.ud();
            int iQdl = qdl(rqVar);
            if (objUd instanceof Drawable) {
                interfaceC0141qdl.qdl(rqVar.qdl(), new ud((Drawable) objUd, iQdl));
                return;
            }
            if (objUd instanceof byte[]) {
                interfaceC0141qdl.qdl(rqVar.qdl(), new ud((byte[]) objUd, iQdl));
                return;
            }
            if (objUd instanceof Bitmap) {
                interfaceC0141qdl.qdl(rqVar.qdl(), new ud((Bitmap) objUd, rqVar.lnr() instanceof Bitmap ? (Bitmap) rqVar.lnr() : null, iQdl));
            } else {
                interfaceC0141qdl.qdl(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int qdl(rq rqVar) {
        Object obj;
        Map<String, String> mapMml = rqVar.mml();
        if (mapMml == null || (obj = mapMml.get("image_size")) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void qdl(int i2, String str, Throwable th, InterfaceC0141qdl interfaceC0141qdl) {
        if (interfaceC0141qdl != null) {
            interfaceC0141qdl.qdl(i2, str, th);
        }
    }
}
