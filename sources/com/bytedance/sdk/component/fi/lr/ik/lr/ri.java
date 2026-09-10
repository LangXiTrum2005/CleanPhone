package com.bytedance.sdk.component.fi.lr.ik.lr;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.sdk.component.fi.lr.ik.di;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.xha;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class ri {

    /* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.lr.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0210ri {
        void ri();

        void ri(Drawable drawable);

        void ri(byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(byte[] bArr, di diVar, InterfaceC0210ri interfaceC0210ri) {
        FileOutputStream fileOutputStream = null;
        try {
            File fileRi = xha.ri(diVar.ri(), "P_GIF_CACHE", "P_U_GIF_FILE");
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileRi);
            try {
                fileOutputStream2.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT < 28) {
                    if (interfaceC0210ri != null) {
                        interfaceC0210ri.ri(bArr);
                    }
                    try {
                        fileOutputStream2.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileRi));
                if (interfaceC0210ri != null) {
                    interfaceC0210ri.ri(drawableDecodeDrawable);
                }
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    ac.ri("PAGGifDefaultDecoder", "Gif  getSourceByFile fail : ", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (interfaceC0210ri != null) {
                        interfaceC0210ri.ri();
                    }
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void ri(byte[] bArr, di diVar, InterfaceC0210ri interfaceC0210ri) {
        if (Build.VERSION.SDK_INT <= 30) {
            ri(bArr, interfaceC0210ri, diVar);
        } else {
            ri(bArr, interfaceC0210ri);
        }
    }

    public void ri(byte[] bArr, InterfaceC0210ri interfaceC0210ri) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT < 28) {
            if (interfaceC0210ri != null) {
                interfaceC0210ri.ri(bArr);
                return;
            }
            return;
        }
        try {
            Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
            if (interfaceC0210ri != null) {
                interfaceC0210ri.ri(drawableDecodeDrawable);
            }
        } catch (Throwable th) {
            ac.ik("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0210ri != null) {
                interfaceC0210ri.ri();
            }
        }
    }

    private void ri(final byte[] bArr, final InterfaceC0210ri interfaceC0210ri, final di diVar) {
        try {
            diVar.mj().submit(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.lr.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ri.this.lr(bArr, diVar, interfaceC0210ri);
                }
            });
        } catch (Throwable th) {
            ac.ik("PAGGifDefaultDecoder", th.getMessage());
            if (interfaceC0210ri != null) {
                interfaceC0210ri.ri();
            }
        }
    }
}
