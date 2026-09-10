package com.bytedance.sdk.openadsdk.core.JVA;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.JXs.JVA;
import com.bytedance.sdk.component.JXs.VVE;
import com.bytedance.sdk.component.JXs.nBu;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.lc;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.QAg.ZU;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.widget.JXs;
import com.bytedance.sdk.openadsdk.utils.IeN;
import com.bytedance.sdk.openadsdk.utils.hg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3745j0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements com.bytedance.adsdk.ugeno.Lxb {

    public static class LD implements VVE {
        private WeakReference<JXs> Lxb;

        public LD(JXs jXs) {
            this.Lxb = new WeakReference<>(jXs);
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(JVA jva) {
            try {
                JXs jXs = this.Lxb.get();
                if (jXs == null) {
                    return;
                }
                Object objLD = jva.LD();
                if (!(objLD instanceof byte[])) {
                    if (objLD instanceof Bitmap) {
                        jXs.setImageBitmap((Bitmap) objLD);
                    }
                } else {
                    if (!jva.JXs()) {
                        jXs.setImageDrawable(IeN.Lxb((byte[]) objLD, 0));
                        return;
                    }
                    jXs.Lxb((byte[]) objLD, false);
                    jXs.setRepeatConfig(true);
                    jXs.LD();
                }
            } catch (Throwable th) {
                Lxb(1002, "", th);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.JVA.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0090Lxb {
        void Lxb(Drawable drawable);
    }

    public static class lk implements VVE {
        private final Lxb LD;
        private final WeakReference<ImageView> Lxb;
        private final int ZU;
        private final int lk;

        public lk(ImageView imageView, Lxb lxb, int i, int i2) {
            this.Lxb = new WeakReference<>(imageView);
            this.LD = lxb;
            this.lk = i;
            this.ZU = i2;
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(JVA jva) {
            try {
                final ImageView imageView = this.Lxb.get();
                if (imageView == null) {
                    return;
                }
                final Object objLD = jva.LD();
                if (!(objLD instanceof byte[])) {
                    if (objLD instanceof Bitmap) {
                        hg.Lxb((Runnable) new OY("ug_load_bitmap") { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.lk.2
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap((Bitmap) objLD);
                            }
                        });
                    }
                } else {
                    if (jva.JXs()) {
                        if (Build.VERSION.SDK_INT <= 30) {
                            this.LD.Lxb((byte[]) objLD, imageView);
                            return;
                        } else {
                            this.LD.Lxb(imageView, (byte[]) objLD, this.lk, this.ZU);
                            return;
                        }
                    }
                    if (this.LD.Lxb((byte[]) objLD)) {
                        this.LD.Lxb(imageView, (byte[]) objLD, this.lk, this.ZU);
                        return;
                    }
                    final Bitmap bitmapLxb = new com.bytedance.sdk.component.JXs.lk.LD.Lxb(this.lk, this.ZU, imageView.getScaleType(), Bitmap.Config.RGB_565, this.lk, this.ZU).Lxb((byte[]) objLD);
                    if (bitmapLxb != null) {
                        hg.Lxb((Runnable) new OY("load_static_img") { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.lk.1
                            @Override // java.lang.Runnable
                            public void run() {
                                imageView.setImageBitmap(bitmapLxb);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                sLN.Lxb("ImageLoaderProvider", th.getMessage());
            }
        }
    }

    private void LD(final ImageView imageView, byte[] bArr, int i, int i2) {
        final Bitmap bitmapLxb = new com.bytedance.sdk.component.JXs.lk.LD.Lxb(i, i2, imageView.getScaleType(), Bitmap.Config.ARGB_4444, i, i2).Lxb(bArr);
        if (bitmapLxb != null) {
            hg.Lxb((Runnable) new OY("loadStaticImage") { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.2
                @Override // java.lang.Runnable
                public void run() {
                    imageView.setImageBitmap(bitmapLxb);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable LD(byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            boolean zLk = com.bytedance.sdk.openadsdk.multipro.LD.lk();
            File fileLxb = lc.Lxb(kqm.Lxb(), zLk, zLk ? "UGEN_GIF_AD_CACHE/" : "/UGEN_GIF_CACHE/", "TT_UGEN_GIF_FILE");
            fileOutputStream = new FileOutputStream(fileLxb);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                if (Build.VERSION.SDK_INT >= 28) {
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(fileLxb));
                    try {
                        fileOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    return drawableDecodeDrawable;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(kqm.Lxb().getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                try {
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                return bitmapDrawable;
            } catch (Throwable th) {
                th = th;
                try {
                    sLN.Lxb("ImageLoaderProvider", "GifView  getSourceByFile fail : ", th);
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

    @Override // com.bytedance.adsdk.ugeno.Lxb
    public void Lxb(com.bytedance.adsdk.ugeno.core.OY oy, String str, ImageView imageView) {
        String strLxb = Lxb(str);
        if (imageView instanceof JXs) {
            JXs jXs = (JXs) imageView;
            jXs.setAdjustViewBounds(true);
            jXs.setBackgroundColor(0);
            ZU.Lxb(strLxb).lk(3).Lxb(Bitmap.Config.RGB_565).Lxb(new LD(jXs));
            return;
        }
        nBu nbuLxb = ZU.Lxb(strLxb);
        Lxb(oy, nbuLxb, strLxb);
        nbuLxb.Lxb(imageView);
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb
    public void Lxb(com.bytedance.adsdk.ugeno.core.OY oy, String str, ImageView imageView, int i, int i2) {
        String strLxb = Lxb(str);
        nBu nbuLk = ZU.Lxb(strLxb).lk(3);
        Lxb(oy, nbuLk, strLxb);
        nbuLk.Lxb(new lk(imageView, this, i, i2), 4);
    }

    public void LD(com.bytedance.adsdk.ugeno.core.OY oy, String str, final com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb interfaceC0030Lxb) {
        nBu nbuLk = ZU.Lxb(str).lk(1);
        Lxb(oy, nbuLk, str);
        nbuLk.Lxb(new VVE() { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.5
            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(JVA jva) {
                if (jva == null) {
                    interfaceC0030Lxb.Lxb(null);
                    return;
                }
                if (interfaceC0030Lxb != null) {
                    Object objLD = jva.LD();
                    if (objLD instanceof Bitmap) {
                        interfaceC0030Lxb.Lxb((Bitmap) objLD);
                        return;
                    }
                    if (jva.LD() instanceof byte[]) {
                        try {
                            interfaceC0030Lxb.Lxb(BitmapFactory.decodeByteArray((byte[]) jva.LD(), 0, ((byte[]) jva.LD()).length));
                            return;
                        } catch (Throwable unused) {
                        }
                    }
                    interfaceC0030Lxb.Lxb(null);
                }
            }

            @Override // com.bytedance.sdk.component.JXs.VVE
            public void Lxb(int i, String str2, Throwable th) {
                com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb interfaceC0030Lxb2 = interfaceC0030Lxb;
                if (interfaceC0030Lxb2 != null) {
                    interfaceC0030Lxb2.Lxb(null);
                }
            }
        }, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final ImageView imageView, byte[] bArr, int i, int i2) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                final Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(byteBufferWrap));
                if (drawableDecodeDrawable != null) {
                    hg.Lxb((Runnable) new OY("loadAnimatedDrawable") { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageDrawable(drawableDecodeDrawable);
                        }
                    });
                    return;
                }
                return;
            } catch (IOException e) {
                sLN.Lxb("ImageLoaderProvider", e.getMessage());
                return;
            }
        }
        LD(imageView, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(byte[] bArr, final ImageView imageView) {
        try {
            sLN.Lxb("ImageLoaderProvider", "load animation image");
            Lxb(bArr, new InterfaceC0090Lxb() { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.3
                @Override // com.bytedance.sdk.openadsdk.core.JVA.Lxb.InterfaceC0090Lxb
                public void Lxb(final Drawable drawable) {
                    hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && AbstractC3745j0.q(drawable)) {
                                AbstractC3745j0.c(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        } catch (Exception e) {
            sLN.Lxb("ImageLoaderProvider", e.getMessage());
        }
    }

    private void Lxb(final byte[] bArr, final InterfaceC0090Lxb interfaceC0090Lxb) {
        hg.LD(new OY("pag_animation_drawable") { // from class: com.bytedance.sdk.openadsdk.core.JVA.Lxb.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawableLD = Lxb.this.LD(bArr);
                InterfaceC0090Lxb interfaceC0090Lxb2 = interfaceC0090Lxb;
                if (interfaceC0090Lxb2 != null) {
                    interfaceC0090Lxb2.Lxb(drawableLD);
                }
            }
        });
    }

    public boolean Lxb(byte[] bArr) {
        return com.bytedance.sdk.component.adexpress.ZU.lc.Lxb(bArr, 0);
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb
    public void Lxb(com.bytedance.adsdk.ugeno.core.OY oy, String str, com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb interfaceC0030Lxb) {
        LD(oy, Lxb(str), interfaceC0030Lxb);
    }

    private void Lxb(com.bytedance.adsdk.ugeno.core.OY oy, @NonNull nBu nbu, String str) {
        Map<String, Object> mapLD;
        if (oy == null || (mapLD = oy.LD()) == null) {
            return;
        }
        Object obj = mapLD.get("image_info");
        if (obj instanceof Map) {
            nbu.Lxb((String) ((Map) obj).get(str));
        }
        String str2 = (String) mapLD.get("cache_dir");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        nbu.LD(str2);
    }

    private String Lxb(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("http://") || str.startsWith("https://")) {
            return str;
        }
        if (str.indexOf(46) < 0) {
            str = str.concat(".png");
        }
        return DM.i(com.bytedance.sdk.openadsdk.core.settings.VVE.TA().oc(), "static/", str);
    }
}
