package com.bytedance.sdk.openadsdk.core.co;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.fi.lr.ik.di;
import com.bytedance.sdk.component.fi.qt;
import com.bytedance.sdk.component.fi.sf;
import com.bytedance.sdk.component.fi.slm;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.xha;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.dzy;
import dumb.dern;
import dumb.saneness;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements com.bytedance.adsdk.ugeno.ri {

    public static class lr implements slm {
        private final int ik;
        private final int ka;
        private final ri lr;
        private final WeakReference<ImageView> ri;

        public lr(ImageView imageView, ri riVar, int i, int i2) {
            this.ri = new WeakReference<>(imageView);
            this.lr = riVar;
            this.ik = i;
            this.ka = i2;
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(sf sfVar) {
            try {
                final ImageView imageView = this.ri.get();
                if (imageView == null) {
                    return;
                }
                final Object objLr = sfVar.lr();
                if (objLr instanceof Drawable) {
                    dzy.ri((Runnable) new com.bytedance.sdk.component.mj.lr.ik("load_draw_img") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(objLr)) {
                                dern.attabal(objLr).start();
                            }
                            imageView.setImageDrawable((Drawable) objLr);
                        }
                    });
                    return;
                }
                if (!(objLr instanceof byte[])) {
                    if (objLr instanceof Bitmap) {
                        dzy.ri((Runnable) new com.bytedance.sdk.component.mj.lr.ik("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.3
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap((Bitmap) objLr);
                            }
                        });
                    }
                } else {
                    if (sfVar.fi()) {
                        if (Build.VERSION.SDK_INT <= 30) {
                            this.lr.ri((byte[]) objLr, imageView);
                            return;
                        } else {
                            this.lr.ri(imageView, (byte[]) objLr, this.ik, this.ka);
                            return;
                        }
                    }
                    if (this.lr.ri((byte[]) objLr)) {
                        this.lr.ri(imageView, (byte[]) objLr, this.ik, this.ka);
                        return;
                    }
                    final Bitmap bitmapRi = new com.bytedance.sdk.component.fi.lr.ik.lr.lr(this.ik, this.ka, imageView.getScaleType(), Bitmap.Config.RGB_565, this.ik, this.ka).ri((byte[]) objLr, new di(nr.ri(), new com.bytedance.sdk.component.fi.lr.ik.fi.ri().ri(com.bytedance.sdk.openadsdk.qt.ka.lr()).ri()));
                    if (bitmapRi != null) {
                        dzy.ri((Runnable) new com.bytedance.sdk.component.mj.lr.ik("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.lr.2
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(bitmapRi);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                ac.ik("ImageLoaderProvider", th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0248ri {
        void ri(Drawable drawable);
    }

    private void lr(final ImageView imageView, byte[] bArr, int i, int i2) {
        final Bitmap bitmapRi = new com.bytedance.sdk.component.fi.lr.ik.lr.lr(i, i2, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i, i2).ri(bArr, new di(nr.ri(), new com.bytedance.sdk.component.fi.lr.ik.fi.ri().ri(com.bytedance.sdk.openadsdk.qt.ka.lr()).ri()));
        if (bitmapRi != null) {
            dzy.ri((Runnable) new com.bytedance.sdk.component.mj.lr.ik("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapRi);
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ri
    public void ri(com.bytedance.adsdk.ugeno.core.sf sfVar, String str, ImageView imageView, int i, int i2, com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri interfaceC0195ri) {
        String strRi = ka.ri(str);
        qt qtVarIk = com.bytedance.sdk.openadsdk.qt.ka.ri(strRi).ik(1);
        ri(sfVar, qtVarIk, strRi);
        qtVarIk.ri(new lr(imageView, this, i, i2), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable lr(byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            File fileRi = xha.ri(nr.ri(), "UGEN_GIF_CACHE", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileRi);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileRi));
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    return drawableDecodeDrawable;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(nr.ri().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                return bitmapDrawable;
            } catch (Throwable th) {
                th = th;
                try {
                    ac.ri("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
                    return null;
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(final ImageView imageView, byte[] bArr, int i, int i2) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    dzy.ri((Runnable) new com.bytedance.sdk.component.mj.lr.ik("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (saneness.attabal(drawableDecodeDrawable)) {
                                dern.attabal(drawableDecodeDrawable).start();
                            }
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e) {
                ac.ik("ImageLoaderProvider", e.getMessage());
                return;
            }
        }
        lr(imageView, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(byte[] bArr, final ImageView imageView) {
        try {
            ri(bArr, new InterfaceC0248ri() { // from class: com.bytedance.sdk.openadsdk.core.co.ri.3
                @Override // com.bytedance.sdk.openadsdk.core.co.ri.InterfaceC0248ri
                public void ri(final Drawable drawable) {
                    dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.co.ri.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(drawable)) {
                                dern.attabal(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e) {
            ac.ik("ImageLoaderProvider", e.getMessage());
        }
    }

    private void ri(final byte[] bArr, final InterfaceC0248ri interfaceC0248ri) {
        dzy.ik((Runnable) new com.bytedance.sdk.component.mj.lr.ik("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.co.ri.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawableLr = ri.this.lr(bArr);
                InterfaceC0248ri interfaceC0248ri2 = interfaceC0248ri;
                if (interfaceC0248ri2 != null) {
                    interfaceC0248ri2.ri(drawableLr);
                }
            }
        });
    }

    public void lr(com.bytedance.adsdk.ugeno.core.sf sfVar, String str, final com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri interfaceC0195ri) {
        qt qtVarIk = com.bytedance.sdk.openadsdk.qt.ka.ri(str).ik(2);
        ri(sfVar, qtVarIk, str);
        qtVarIk.ri(new slm() { // from class: com.bytedance.sdk.openadsdk.core.co.ri.5
            @Override // com.bytedance.sdk.component.fi.slm
            public void ri(sf sfVar2) {
                if (sfVar2 == null) {
                    interfaceC0195ri.ri(null);
                    return;
                }
                if (interfaceC0195ri != null) {
                    Object objLr = sfVar2.lr();
                    if (objLr instanceof Bitmap) {
                        interfaceC0195ri.ri((Bitmap) objLr);
                        return;
                    }
                    if (sfVar2.lr() instanceof byte[]) {
                        try {
                            interfaceC0195ri.ri(BitmapFactory.decodeByteArray((byte[]) sfVar2.lr(), 0, ((byte[]) sfVar2.lr()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0195ri.ri(null);
                }
            }

            @Override // com.bytedance.sdk.component.fi.slm
            public void ri(int i, String str2, Throwable th) {
                com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri interfaceC0195ri2 = interfaceC0195ri;
                if (interfaceC0195ri2 != null) {
                    interfaceC0195ri2.ri(null);
                }
            }
        }, 4);
    }

    public boolean ri(byte[] bArr) {
        return com.bytedance.sdk.component.utils.sf.ri(bArr, 0);
    }

    @Override // com.bytedance.adsdk.ugeno.ri
    public void ri(com.bytedance.adsdk.ugeno.core.sf sfVar, String str, com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri interfaceC0195ri) {
        lr(sfVar, ka.ri(str), interfaceC0195ri);
    }

    private void ri(com.bytedance.adsdk.ugeno.core.sf sfVar, qt qtVar, String str) {
        Map<String, Object> mapLr;
        if (sfVar == null || (mapLr = sfVar.lr()) == null) {
            return;
        }
        Object obj = mapLr.get("image_info");
        if (obj instanceof Map) {
            qtVar.ri((String) ((Map) obj).get(str));
        }
        String str2 = (String) mapLr.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        qtVar.lr(str2);
    }
}
