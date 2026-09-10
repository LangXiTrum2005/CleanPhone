package com.bytedance.sdk.component.mzz.mml.ud;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.mzz.exc;
import com.bytedance.sdk.component.utils.rq;

/* JADX INFO: loaded from: classes.dex */
public class mml<T> implements mo {
    private void ud(final com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar, final byte[] bArr, final com.bytedance.sdk.component.mzz.mml.lnr.qdl qdlVar) {
        try {
            new com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl().qdl(bArr, lnrVar.yt(), new com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl.InterfaceC0089qdl() { // from class: com.bytedance.sdk.component.mzz.mml.ud.mml.2
                @Override // com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl.InterfaceC0089qdl
                public void qdl(Drawable drawable) {
                    qdlVar.qdl(new com.bytedance.sdk.component.mzz.mml.lnr.mml().qdl(lnrVar, drawable, null, true));
                }

                @Override // com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl.InterfaceC0089qdl
                public void qdl() {
                    qdlVar.qdl(1002, "decode gif fail", new Exception("decode gif fail"));
                }

                @Override // com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl.InterfaceC0089qdl
                public void qdl(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.mo.qdl(bArr)) {
                        mml.this.qdl(lnrVar, bArr, true, qdlVar);
                    } else {
                        qdlVar.qdl(1001, "result type is gif but data not image", new Exception("gif not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            qdlVar.qdl(2000, "decode gif error", th);
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mml.ud.mo
    public boolean qdl(com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar, exc excVar, com.bytedance.sdk.component.mzz.mml.lnr.qdl qdlVar) {
        byte[] bArrRdp = lnrVar.rdp();
        if (bArrRdp == null) {
            qdlVar.qdl(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int iFs = lnrVar.fs();
        lnrVar.qdl(bArrRdp.length);
        if (iFs == 2) {
            boolean z2 = (com.bytedance.sdk.component.utils.mo.ud(bArrRdp) || rq.qdl(bArrRdp, 0)) ? false : true;
            if (com.bytedance.sdk.component.utils.mo.qdl(bArrRdp)) {
                qdl(lnrVar, bArrRdp, z2, qdlVar);
            } else {
                qdlVar.qdl(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (iFs == 3) {
            qdlVar.qdl(new com.bytedance.sdk.component.mzz.mml.lnr.mml().qdl(lnrVar, bArrRdp, null, com.bytedance.sdk.component.utils.mo.ud(bArrRdp)));
        } else if (com.bytedance.sdk.component.utils.mo.ud(bArrRdp)) {
            ud(lnrVar, bArrRdp, qdlVar);
        } else if (rq.qdl(bArrRdp, 0)) {
            qdl(lnrVar, bArrRdp, qdlVar);
        } else if (com.bytedance.sdk.component.utils.mo.qdl(bArrRdp)) {
            qdl(lnrVar, bArrRdp, true, qdlVar);
        } else {
            qdlVar.qdl(1001, "is not supprot image type", new Exception("not supprot image type"));
        }
        return false;
    }

    private void qdl(final com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar, final byte[] bArr, final com.bytedance.sdk.component.mzz.mml.lnr.qdl qdlVar) {
        try {
            new com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl().qdl(bArr, new com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl.InterfaceC0089qdl() { // from class: com.bytedance.sdk.component.mzz.mml.ud.mml.1
                @Override // com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl.InterfaceC0089qdl
                public void qdl(Drawable drawable) {
                    qdlVar.qdl(new com.bytedance.sdk.component.mzz.mml.lnr.mml().qdl(lnrVar, drawable, null, false));
                }

                @Override // com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl.InterfaceC0089qdl
                public void qdl() {
                    qdlVar.qdl(1002, "decode webp animate fail", new Exception("decode webp animate fail"));
                }

                @Override // com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl.InterfaceC0089qdl
                public void qdl(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.mo.qdl(bArr)) {
                        mml.this.qdl(lnrVar, bArr, true, qdlVar);
                    } else {
                        qdlVar.qdl(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            qdlVar.qdl(2000, "decode webp animation error", th);
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mml.ud.mo
    public String qdl() {
        return "decode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.component.mzz.mml.lnr.lnr lnrVar, byte[] bArr, boolean z2, com.bytedance.sdk.component.mzz.mml.lnr.qdl qdlVar) {
        try {
            com.bytedance.sdk.component.mzz.mml.lnr.mo moVarYt = lnrVar.yt();
            Bitmap bitmapQdl = moVarYt.qdl(lnrVar).qdl(bArr);
            if (bitmapQdl != null) {
                lnrVar.to();
                lnrVar.qdl();
                bitmapQdl.getWidth();
                bitmapQdl.getHeight();
                bitmapQdl.getByteCount();
                qdlVar.qdl(new com.bytedance.sdk.component.mzz.mml.lnr.mml().qdl(lnrVar, bitmapQdl, null, false));
                if (z2) {
                    qdl(lnrVar.jl(), moVarYt, lnrVar.to(), bitmapQdl);
                    return;
                }
                return;
            }
            lnrVar.to();
            lnrVar.qdl();
            qdlVar.qdl(1002, "decode failed bitmap null", new Exception("decode failed bitmap null"));
        } catch (Throwable th) {
            lnrVar.to();
            lnrVar.qdl();
            qdlVar.qdl(1002, "decode failed:" + th.getMessage(), th);
        }
    }

    private void qdl(com.bytedance.sdk.component.mzz.ud udVar, com.bytedance.sdk.component.mzz.mml.lnr.mo moVar, String str, Bitmap bitmap) {
        if (udVar == null || moVar == null || !udVar.mzz()) {
            return;
        }
        moVar.qdl(udVar).qdl(str, bitmap);
    }
}
