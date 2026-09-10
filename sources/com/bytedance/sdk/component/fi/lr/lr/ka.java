package com.bytedance.sdk.component.fi.lr.lr;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.fi.tan;
import com.bytedance.sdk.component.utils.sf;

/* JADX INFO: loaded from: classes2.dex */
public class ka<T> implements di {
    private void lr(final com.bytedance.sdk.component.fi.lr.ik.ik ikVar, final byte[] bArr, final com.bytedance.sdk.component.fi.lr.ik.ri riVar) {
        try {
            new com.bytedance.sdk.component.fi.lr.ik.lr.ri().ri(bArr, ikVar.slm(), new com.bytedance.sdk.component.fi.lr.ik.lr.ri.InterfaceC0210ri() { // from class: com.bytedance.sdk.component.fi.lr.lr.ka.2
                @Override // com.bytedance.sdk.component.fi.lr.ik.lr.ri.InterfaceC0210ri
                public void ri(Drawable drawable) {
                    riVar.ri(new com.bytedance.sdk.component.fi.lr.ik.ka().ri(ikVar, drawable, null, true));
                }

                @Override // com.bytedance.sdk.component.fi.lr.ik.lr.ri.InterfaceC0210ri
                public void ri() {
                    riVar.ri(1002, "decode gif fail", new Exception("decode gif fail"));
                }

                @Override // com.bytedance.sdk.component.fi.lr.ik.lr.ri.InterfaceC0210ri
                public void ri(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.di.ri(bArr)) {
                        ka.this.ri(ikVar, bArr, true, riVar);
                    } else {
                        riVar.ri(1001, "result type is gif but data not image", new Exception("gif not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            riVar.ri(2000, "decode gif error", th);
        }
    }

    @Override // com.bytedance.sdk.component.fi.lr.lr.di
    public boolean ri(com.bytedance.sdk.component.fi.lr.ik.ik ikVar, tan tanVar, com.bytedance.sdk.component.fi.lr.ik.ri riVar) {
        byte[] bArrAw = ikVar.aw();
        if (bArrAw == null) {
            riVar.ri(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int iSf = ikVar.sf();
        ikVar.ri(bArrAw.length);
        if (iSf == 2) {
            boolean z = (com.bytedance.sdk.component.utils.di.lr(bArrAw) || sf.ri(bArrAw, 0)) ? false : true;
            if (com.bytedance.sdk.component.utils.di.ri(bArrAw)) {
                ri(ikVar, bArrAw, z, riVar);
            } else {
                riVar.ri(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (iSf == 3) {
            riVar.ri(new com.bytedance.sdk.component.fi.lr.ik.ka().ri(ikVar, bArrAw, null, com.bytedance.sdk.component.utils.di.lr(bArrAw)));
        } else if (com.bytedance.sdk.component.utils.di.lr(bArrAw)) {
            lr(ikVar, bArrAw, riVar);
        } else if (sf.ri(bArrAw, 0)) {
            ri(ikVar, bArrAw, riVar);
        } else if (com.bytedance.sdk.component.utils.di.ri(bArrAw)) {
            ri(ikVar, bArrAw, true, riVar);
        } else {
            riVar.ri(1001, "is not supprot image type", new Exception("not supprot image type"));
        }
        return false;
    }

    private void ri(final com.bytedance.sdk.component.fi.lr.ik.ik ikVar, final byte[] bArr, final com.bytedance.sdk.component.fi.lr.ik.ri riVar) {
        try {
            new com.bytedance.sdk.component.fi.lr.ik.lr.ri().ri(bArr, new com.bytedance.sdk.component.fi.lr.ik.lr.ri.InterfaceC0210ri() { // from class: com.bytedance.sdk.component.fi.lr.lr.ka.1
                @Override // com.bytedance.sdk.component.fi.lr.ik.lr.ri.InterfaceC0210ri
                public void ri(Drawable drawable) {
                    riVar.ri(new com.bytedance.sdk.component.fi.lr.ik.ka().ri(ikVar, drawable, null, false));
                }

                @Override // com.bytedance.sdk.component.fi.lr.ik.lr.ri.InterfaceC0210ri
                public void ri() {
                    riVar.ri(1002, "decode webp animate fail", new Exception("decode webp animate fail"));
                }

                @Override // com.bytedance.sdk.component.fi.lr.ik.lr.ri.InterfaceC0210ri
                public void ri(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.di.ri(bArr)) {
                        ka.this.ri(ikVar, bArr, true, riVar);
                    } else {
                        riVar.ri(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                    }
                }
            });
        } catch (Throwable th) {
            riVar.ri(2000, "decode webp animation error", th);
        }
    }

    @Override // com.bytedance.sdk.component.fi.lr.lr.di
    public String ri() {
        return "decode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.component.fi.lr.ik.ik ikVar, byte[] bArr, boolean z, com.bytedance.sdk.component.fi.lr.ik.ri riVar) {
        try {
            com.bytedance.sdk.component.fi.lr.ik.di diVarSlm = ikVar.slm();
            Bitmap bitmapRi = diVarSlm.ri(ikVar).ri(bArr, diVarSlm);
            if (bitmapRi != null) {
                ikVar.mj();
                ikVar.ri();
                bitmapRi.getWidth();
                bitmapRi.getHeight();
                bitmapRi.getByteCount();
                riVar.ri(new com.bytedance.sdk.component.fi.lr.ik.ka().ri(ikVar, bitmapRi, null, false));
                if (z) {
                    ri(ikVar.bu(), diVarSlm, ikVar.mj(), bitmapRi);
                    return;
                }
                return;
            }
            ikVar.mj();
            ikVar.ri();
            riVar.ri(1002, "decode failed bitmap null", new Exception("decode failed bitmap null"));
        } catch (Throwable th) {
            ikVar.mj();
            ikVar.ri();
            riVar.ri(1002, "decode failed:" + th.getMessage(), th);
        }
    }

    private void ri(com.bytedance.sdk.component.fi.lr lrVar, com.bytedance.sdk.component.fi.lr.ik.di diVar, String str, Bitmap bitmap) {
        if (lrVar == null || diVar == null || !lrVar.fi()) {
            return;
        }
        diVar.ri(lrVar).ri(str, bitmap);
    }
}
