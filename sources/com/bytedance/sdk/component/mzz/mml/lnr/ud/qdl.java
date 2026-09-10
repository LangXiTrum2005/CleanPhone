package com.bytedance.sdk.component.mzz.mml.lnr.ud;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.mzz.mml.lnr.mo;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.wd;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class qdl {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0089qdl {
        void qdl();

        void qdl(Drawable drawable);

        void qdl(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(byte[] bArr, mo moVar, InterfaceC0089qdl interfaceC0089qdl) {
        FileOutputStream fileOutputStream = null;
        try {
            boolean zWd = moVar.wd();
            File fileQdl = wd.qdl(moVar.qdl(), zWd, zWd ? "P_GIF_MUTIL_CACHE/" : "/P_GIF_CACHE/", "P_U_GIF_FILE");
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileQdl);
            try {
                fileOutputStream2.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileQdl));
                    if (interfaceC0089qdl != null) {
                        interfaceC0089qdl.qdl(drawableDecodeDrawable);
                    }
                } else if (interfaceC0089qdl != null) {
                    interfaceC0089qdl.qdl(bArr);
                }
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    aaj.qdl("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (interfaceC0089qdl != null) {
                        interfaceC0089qdl.qdl();
                    }
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void qdl(byte[] bArr, mo moVar, InterfaceC0089qdl interfaceC0089qdl) {
        if (Build.VERSION.SDK_INT <= 30) {
            qdl(bArr, interfaceC0089qdl, moVar);
        } else {
            qdl(bArr, interfaceC0089qdl);
        }
    }

    public void qdl(byte[] bArr, InterfaceC0089qdl interfaceC0089qdl) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0089qdl != null) {
                interfaceC0089qdl.qdl(bArr);
                return;
            }
            return;
        }
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (interfaceC0089qdl != null) {
                interfaceC0089qdl.qdl(drawableDecodeDrawable);
            }
        } catch (Throwable th) {
            aaj.lnr("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0089qdl != null) {
                interfaceC0089qdl.qdl();
            }
        }
    }

    private void qdl(final byte[] bArr, final InterfaceC0089qdl interfaceC0089qdl, final mo moVar) {
        try {
            moVar.jpc().submit(new Runnable() { // from class: com.bytedance.sdk.component.mzz.mml.lnr.ud.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    qdl.this.ud(bArr, moVar, interfaceC0089qdl);
                }
            });
        } catch (Throwable th) {
            aaj.lnr("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0089qdl != null) {
                interfaceC0089qdl.qdl();
            }
        }
    }
}
