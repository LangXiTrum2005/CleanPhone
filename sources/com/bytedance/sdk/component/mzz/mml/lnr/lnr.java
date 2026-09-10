package com.bytedance.sdk.component.mzz.mml.lnr;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bytedance.sdk.component.mzz.exc;
import com.bytedance.sdk.component.mzz.jpc;
import com.bytedance.sdk.component.mzz.jtx;
import com.bytedance.sdk.component.mzz.jyq;
import com.bytedance.sdk.component.mzz.rdp;
import com.bytedance.sdk.component.mzz.rq;
import com.bytedance.sdk.component.mzz.to;
import com.bytedance.sdk.component.mzz.tvp;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements tvp {
    private com.bytedance.sdk.component.mzz.wd aaj;
    private int bch;
    private boolean bjy;
    private boolean bqt;
    private boolean exc;
    private volatile boolean exu;
    private WeakReference<ImageView> fs;
    private final Handler jl;
    private int jpc;
    private exc jtx;
    private int jyq;
    private rdp koa;
    private com.bytedance.sdk.component.mzz.ud ljh;
    private String lnr;
    private String mml;
    private ImageView.ScaleType mo;
    private jtx mzz;
    private mo oth;
    Future<?> qdl;
    private boolean rdp;
    private int rq;
    private jpc to;
    private int tvp;
    private String ud;
    private int uw;
    private byte[] vu;
    private Bitmap.Config wd;
    private ExecutorService xmv;
    private int yt;

    public class qdl implements jtx {
        private jtx ud;

        public qdl(jtx jtxVar) {
            this.ud = jtxVar;
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(final rq rqVar) {
            Bitmap bitmapQdl;
            final ImageView imageView = (ImageView) lnr.this.fs.get();
            if (imageView != null && lnr.this.rq != 3 && qdl(imageView)) {
                Object objUd = rqVar.ud();
                if (objUd instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) rqVar.ud();
                    lnr.this.jl.post(new Runnable() { // from class: com.bytedance.sdk.component.mzz.mml.lnr.lnr.qdl.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objUd instanceof Drawable) {
                    final Drawable drawable = (Drawable) rqVar.ud();
                    lnr.this.jl.post(new Runnable() { // from class: com.bytedance.sdk.component.mzz.mml.lnr.lnr.qdl.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && a.w(drawable)) {
                                a.l(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (lnr.this.to != null && (rqVar.ud() instanceof Bitmap) && (bitmapQdl = lnr.this.to.qdl((Bitmap) rqVar.ud())) != null) {
                    rqVar.qdl(bitmapQdl);
                }
            } catch (Throwable unused) {
            }
            if (lnr.this.yt == 5) {
                lnr.this.jl.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.mzz.mml.lnr.lnr.qdl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (qdl.this.ud != null) {
                            qdl.this.ud.qdl(rqVar);
                        }
                    }
                });
                return;
            }
            jtx jtxVar = this.ud;
            if (jtxVar != null) {
                jtxVar.qdl(rqVar);
            }
        }

        private boolean qdl(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(lnr.this.lnr)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.mzz.jtx
        public void qdl(final int i2, final String str, final Throwable th) {
            if (lnr.this.yt == 5) {
                lnr.this.jl.post(new Runnable() { // from class: com.bytedance.sdk.component.mzz.mml.lnr.lnr.qdl.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (qdl.this.ud != null) {
                            qdl.this.ud.qdl(i2, str, th);
                        }
                    }
                });
                return;
            }
            jtx jtxVar = this.ud;
            if (jtxVar != null) {
                jtxVar.qdl(i2, str, th);
            }
        }
    }

    public static class ud implements to {
        private ExecutorService aaj;
        private com.bytedance.sdk.component.mzz.ud bjy;
        private int exc;
        private boolean exu;
        private boolean fs;
        private int jl;
        private int jpc;
        private mo jtx;
        private boolean jyq;
        private String lnr;
        private String mml;
        private Bitmap.Config mo;
        private ImageView.ScaleType mzz;
        private rdp oth;
        private jtx qdl;
        private String rdp;
        private exc rq;
        private ImageView ud;
        private int wd;
        private jpc yt;
        private int tvp = 1;
        private int to = 5;

        public ud(mo moVar) {
            this.jtx = moVar;
        }

        public to lnr(String str) {
            this.mml = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to mml(int i2) {
            this.jl = i2;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to mzz(int i2) {
            this.exc = i2;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to qdl(String str) {
            this.lnr = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to ud(int i2) {
            this.jpc = i2;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to lnr(int i2) {
            this.tvp = i2;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to qdl(ImageView.ScaleType scaleType) {
            this.mzz = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to ud(String str) {
            this.rdp = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to qdl(Bitmap.Config config) {
            this.mo = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to qdl(int i2) {
            this.wd = i2;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to qdl(exc excVar) {
            this.rq = excVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to qdl(boolean z2) {
            this.exu = z2;
            return this;
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public tvp qdl(jtx jtxVar, int i2) {
            this.to = i2;
            return qdl(jtxVar);
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public tvp qdl(jtx jtxVar) {
            this.qdl = jtxVar;
            return new lnr(this).jyq();
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public tvp qdl(ImageView imageView) {
            this.ud = imageView;
            return new lnr(this).jyq();
        }

        @Override // com.bytedance.sdk.component.mzz.to
        public to qdl(jpc jpcVar) {
            this.yt = jpcVar;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public tvp jyq() {
        try {
            if (this.oth == null) {
                jtx jtxVar = this.mzz;
                if (jtxVar != null) {
                    jtxVar.qdl(1005, "not init !", null);
                    return this;
                }
            } else {
                String strQdl = qdl();
                if (TextUtils.isEmpty(strQdl)) {
                    this.mzz.qdl(2000, "url is empty", null);
                    return this;
                }
                jyq jyqVarMo = this.oth.mo();
                if (!strQdl.startsWith("http://") && !strQdl.startsWith("https://") && jyqVarMo != null) {
                    jyqVarMo.qdl(1006, "url is not validate ".concat(strQdl));
                }
                ExecutorService executorServiceMzz = this.xmv == null ? this.oth.mzz() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.mzz.mml.lnr.lnr.1
                    @Override // java.lang.Runnable
                    public void run() {
                        lnr lnrVar = lnr.this;
                        com.bytedance.sdk.component.mzz.mml.lnr.qdl qdlVar = new com.bytedance.sdk.component.mzz.mml.lnr.qdl(lnrVar, lnrVar.jtx);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.mzz.mml.ud.ud());
                            arrayList.add(new com.bytedance.sdk.component.mzz.mml.ud.mzz());
                            arrayList.add(new com.bytedance.sdk.component.mzz.mml.ud.qdl());
                            arrayList.add(new com.bytedance.sdk.component.mzz.mml.ud.lnr());
                            arrayList.add(new com.bytedance.sdk.component.mzz.mml.ud.mml());
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                if (lnr.this.exu) {
                                    qdlVar.qdl(1003, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.mzz.mml.ud.mo moVar = (com.bytedance.sdk.component.mzz.mml.ud.mo) arrayList.get(i2);
                                if (lnr.this.jtx != null && moVar != null && !"data_intercept".equals(moVar.qdl())) {
                                    lnr.this.jtx.qdl(moVar.qdl(), lnr.this);
                                }
                                lnr lnrVar2 = lnr.this;
                                boolean zQdl = moVar.qdl(lnrVar2, lnrVar2.jtx, qdlVar);
                                if (lnr.this.jtx != null && !"data_intercept".equals(moVar.qdl())) {
                                    lnr.this.jtx.ud(moVar.qdl(), lnr.this);
                                }
                                if (!zQdl) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            qdlVar.qdl(2000, th.getMessage(), th);
                        }
                    }
                };
                if (this.bqt) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.xmv;
                if (executorService != null) {
                    this.qdl = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceMzz != null) {
                    this.qdl = executorServiceMzz.submit(runnable);
                    return this;
                }
            }
        } catch (Exception e2) {
            Log.e("ImageRequest", e2.getMessage());
        }
        return this;
    }

    public String aaj() {
        return to() + fs();
    }

    public com.bytedance.sdk.component.mzz.wd bjy() {
        return this.aaj;
    }

    public rdp exc() {
        return this.koa;
    }

    public boolean exu() {
        return this.exc;
    }

    public int fs() {
        return this.rq;
    }

    public com.bytedance.sdk.component.mzz.ud jl() {
        return this.ljh;
    }

    public int jtx() {
        return this.jyq;
    }

    public byte[] rdp() {
        return this.vu;
    }

    public Bitmap.Config rq() {
        return this.wd;
    }

    public String to() {
        return this.lnr;
    }

    public mo yt() {
        return this.oth;
    }

    private lnr(ud udVar) {
        this.jl = new Handler(Looper.getMainLooper());
        this.exc = true;
        this.vu = null;
        this.ud = udVar.mml;
        this.mzz = new qdl(udVar.qdl);
        this.fs = new WeakReference<>(udVar.ud);
        this.mo = udVar.mzz;
        this.wd = udVar.mo;
        this.jpc = udVar.wd;
        this.tvp = udVar.jpc;
        this.rq = udVar.tvp;
        this.yt = udVar.to;
        this.jtx = udVar.rq;
        this.ljh = qdl(udVar);
        if (!TextUtils.isEmpty(udVar.lnr)) {
            ud(udVar.lnr);
            qdl(udVar.lnr);
        }
        this.rdp = udVar.fs;
        this.bjy = udVar.exu;
        this.oth = udVar.jtx;
        this.to = udVar.yt;
        this.uw = udVar.exc;
        this.bch = udVar.jl;
        this.xmv = udVar.aaj;
        this.bqt = udVar.jyq;
        this.koa = udVar.oth;
    }

    private com.bytedance.sdk.component.mzz.ud qdl(ud udVar) {
        if (udVar.bjy != null) {
            return udVar.bjy;
        }
        return !TextUtils.isEmpty(udVar.rdp) ? com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.qdl(new File(udVar.rdp)) : com.bytedance.sdk.component.mzz.mml.lnr.qdl.ud.to();
    }

    public jtx jpc() {
        return this.mzz;
    }

    @Override // com.bytedance.sdk.component.mzz.tvp
    public int lnr() {
        return this.tvp;
    }

    @Override // com.bytedance.sdk.component.mzz.tvp
    public ImageView.ScaleType mml() {
        return this.mo;
    }

    public int mo() {
        return this.bch;
    }

    @Override // com.bytedance.sdk.component.mzz.tvp
    public Bitmap.Config mzz() {
        return this.wd;
    }

    public String tvp() {
        return this.mml;
    }

    public void ud(String str) {
        WeakReference<ImageView> weakReference = this.fs;
        if (weakReference != null && weakReference.get() != null) {
            this.fs.get().setTag(1094453505, str);
        }
        this.lnr = str;
    }

    public int wd() {
        return this.uw;
    }

    @Override // com.bytedance.sdk.component.mzz.tvp
    public int ud() {
        return this.jpc;
    }

    @Override // com.bytedance.sdk.component.mzz.tvp
    public String qdl() {
        return this.ud;
    }

    public void qdl(String str) {
        this.mml = str;
    }

    public void qdl(boolean z2) {
        this.exc = z2;
    }

    public void qdl(byte[] bArr) {
        this.vu = bArr;
    }

    public void qdl(int i2) {
        this.jyq = i2;
    }
}
