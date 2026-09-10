package com.bytedance.sdk.component.fi.lr.ik;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.fi.bgr;
import com.bytedance.sdk.component.fi.ihz;
import com.bytedance.sdk.component.fi.jbs;
import com.bytedance.sdk.component.fi.mj;
import com.bytedance.sdk.component.fi.qt;
import com.bytedance.sdk.component.fi.sf;
import com.bytedance.sdk.component.fi.slm;
import com.bytedance.sdk.component.fi.tan;
import dumb.dern;
import dumb.saneness;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements jbs {
    private com.bytedance.sdk.component.fi.xha ac;
    private volatile boolean aw;
    private int ay;
    private boolean bgr;
    private int bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private WeakReference<ImageView> f18052co;
    private ImageView.ScaleType di;
    private byte[] dw;
    private slm fi;
    private int fr;
    private boolean igq;
    private int ihz;
    private String ik;
    private int jbs;
    private String ka;
    private String lr;
    private int mj;
    private final Handler nr;
    private mj qt;
    Future<?> ri;
    private int sf;
    private tan slm;
    private ExecutorService su;
    private boolean tan;
    private di uq;
    private boolean vr;
    private com.bytedance.sdk.component.fi.lr wjv;
    private Bitmap.Config xha;
    private bgr zf;

    public static class lr implements qt {
        private ExecutorService ac;
        private boolean aw;
        private String bgr;
        private mj bu;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private boolean f18053co;
        private Bitmap.Config di;
        private ImageView.ScaleType fi;
        private boolean ihz;
        private String ik;
        private String ka;
        private ImageView lr;
        private int mj;
        private int nr;
        private slm ri;
        private tan sf;
        private di slm;
        private int tan;
        private bgr uq;
        private com.bytedance.sdk.component.fi.lr vr;
        private int xha;
        private int jbs = 1;
        private int qt = 5;

        public lr(di diVar) {
            this.slm = diVar;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt fi(int i) {
            this.tan = i;
            return this;
        }

        public qt ik(String str) {
            this.ka = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt ka(int i) {
            this.nr = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt lr(int i) {
            this.mj = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt ri(String str) {
            this.ik = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt ik(int i) {
            this.jbs = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt lr(String str) {
            this.bgr = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt ri(ImageView.ScaleType scaleType) {
            this.fi = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt ri(Bitmap.Config config) {
            this.di = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt ri(int i) {
            this.xha = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt ri(tan tanVar) {
            this.sf = tanVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt ri(boolean z) {
            this.aw = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public jbs ri(slm slmVar, int i) {
            this.qt = i;
            return ri(slmVar);
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public jbs ri(slm slmVar) {
            this.ri = slmVar;
            return new ik(this).ac();
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public jbs ri(ImageView imageView) {
            this.lr = imageView;
            return new ik(this).ac();
        }

        @Override // com.bytedance.sdk.component.fi.qt
        public qt ri(mj mjVar) {
            this.bu = mjVar;
            return this;
        }
    }

    public class ri implements slm {
        private slm lr;

        public ri(slm slmVar) {
            this.lr = slmVar;
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(final sf sfVar) {
            Bitmap bitmapRi;
            final ImageView imageView = (ImageView) ik.this.f18052co.get();
            if (imageView != null && ik.this.sf != 3 && ri(imageView)) {
                Object objLr = sfVar.lr();
                if (objLr instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) sfVar.lr();
                    ik.this.nr.post(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.ik.ri.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objLr instanceof Drawable) {
                    final Drawable drawable = (Drawable) sfVar.lr();
                    ik.this.nr.post(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.ik.ri.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && saneness.attabal(drawable)) {
                                dern.attabal(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (ik.this.qt != null && (sfVar.lr() instanceof Bitmap) && (bitmapRi = ik.this.qt.ri((Bitmap) sfVar.lr())) != null) {
                    sfVar.ri(bitmapRi);
                }
            } catch (Throwable unused) {
            }
            if (ik.this.bu == 5) {
                ik.this.nr.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.ik.ri.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ri.this.lr != null) {
                            ri.this.lr.ri(sfVar);
                        }
                    }
                });
                return;
            }
            slm slmVar = this.lr;
            if (slmVar != null) {
                slmVar.ri(sfVar);
            }
        }

        private boolean ri(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(ik.this.ik)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.fi.slm
        public void ri(final int i, final String str, final Throwable th) {
            if (ik.this.bu == 5) {
                ik.this.nr.post(new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.ik.ri.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (ri.this.lr != null) {
                            ri.this.lr.ri(i, str, th);
                        }
                    }
                });
                return;
            }
            slm slmVar = this.lr;
            if (slmVar != null) {
                slmVar.ri(i, str, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jbs ac() {
        try {
            if (this.uq == null) {
                slm slmVar = this.fi;
                if (slmVar != null) {
                    slmVar.ri(1005, "not init !", null);
                    return this;
                }
            } else {
                String strRi = ri();
                if (TextUtils.isEmpty(strRi)) {
                    this.fi.ri(2000, "url is empty", null);
                    return this;
                }
                ihz ihzVarXha = this.uq.xha();
                if (!strRi.startsWith("http://") && !strRi.startsWith("https://") && ihzVarXha != null) {
                    ihzVarXha.ri(1006, "url is not validate ".concat(strRi));
                }
                ExecutorService executorServiceDi = this.su == null ? this.uq.di() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.fi.lr.ik.ik.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ik ikVar = ik.this;
                        com.bytedance.sdk.component.fi.lr.ik.ri riVar = new com.bytedance.sdk.component.fi.lr.ik.ri(ikVar, ikVar.slm);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.fi.lr.lr.lr());
                            arrayList.add(new com.bytedance.sdk.component.fi.lr.lr.fi());
                            arrayList.add(new com.bytedance.sdk.component.fi.lr.lr.ri());
                            arrayList.add(new com.bytedance.sdk.component.fi.lr.lr.ik());
                            arrayList.add(new com.bytedance.sdk.component.fi.lr.lr.ka());
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (ik.this.aw) {
                                    riVar.ri(1003, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.fi.lr.lr.di diVar = (com.bytedance.sdk.component.fi.lr.lr.di) arrayList.get(i);
                                if (ik.this.slm != null && diVar != null && !"data_intercept".equals(diVar.ri())) {
                                    ik.this.slm.ri(diVar.ri(), ik.this);
                                }
                                ik ikVar2 = ik.this;
                                boolean zRi = diVar.ri(ikVar2, ikVar2.slm, riVar);
                                if (ik.this.slm != null && !"data_intercept".equals(diVar.ri())) {
                                    ik.this.slm.lr(diVar.ri(), ik.this);
                                }
                                if (!zRi) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            riVar.ri(2000, th.getMessage(), th);
                        }
                    }
                };
                if (this.igq) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.su;
                if (executorService != null) {
                    this.ri = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceDi != null) {
                    this.ri = executorServiceDi.submit(runnable);
                }
            }
            return this;
        } catch (Exception e) {
            e.getMessage();
            return this;
        }
    }

    public byte[] aw() {
        return this.dw;
    }

    public com.bytedance.sdk.component.fi.xha bgr() {
        return this.ac;
    }

    public com.bytedance.sdk.component.fi.lr bu() {
        return this.wjv;
    }

    public boolean co() {
        return this.tan;
    }

    public bgr nr() {
        return this.zf;
    }

    public Bitmap.Config qt() {
        return this.xha;
    }

    public int sf() {
        return this.sf;
    }

    public di slm() {
        return this.uq;
    }

    public String tan() {
        return mj() + sf();
    }

    public int vr() {
        return this.ihz;
    }

    private ik(lr lrVar) {
        this.nr = new Handler(Looper.getMainLooper());
        this.tan = true;
        this.dw = null;
        this.lr = lrVar.ka;
        this.fi = new ri(lrVar.ri);
        this.f18052co = new WeakReference<>(lrVar.lr);
        this.di = lrVar.fi;
        this.xha = lrVar.di;
        this.mj = lrVar.xha;
        this.jbs = lrVar.mj;
        this.sf = lrVar.jbs;
        this.bu = lrVar.qt;
        this.slm = lrVar.sf;
        this.wjv = ri(lrVar);
        if (!TextUtils.isEmpty(lrVar.ik)) {
            lr(lrVar.ik);
            ri(lrVar.ik);
        }
        this.bgr = lrVar.f18053co;
        this.vr = lrVar.aw;
        this.uq = lrVar.slm;
        this.qt = lrVar.bu;
        this.fr = lrVar.tan;
        this.ay = lrVar.nr;
        this.su = lrVar.ac;
        this.igq = lrVar.ihz;
        this.zf = lrVar.uq;
    }

    private com.bytedance.sdk.component.fi.lr ri(lr lrVar) {
        if (lrVar.vr != null) {
            return lrVar.vr;
        }
        return !TextUtils.isEmpty(lrVar.bgr) ? com.bytedance.sdk.component.fi.lr.ik.ri.lr.ri(new File(lrVar.bgr)) : com.bytedance.sdk.component.fi.lr.ik.ri.lr.jbs();
    }

    public slm di() {
        return this.fi;
    }

    public int fi() {
        return this.fr;
    }

    @Override // com.bytedance.sdk.component.fi.jbs
    public int ik() {
        return this.jbs;
    }

    public ImageView.ScaleType jbs() {
        return this.di;
    }

    public int ka() {
        return this.ay;
    }

    public void lr(String str) {
        WeakReference<ImageView> weakReference = this.f18052co;
        if (weakReference != null && weakReference.get() != null) {
            this.f18052co.get().setTag(1094453505, str);
        }
        this.ik = str;
    }

    public String mj() {
        return this.ik;
    }

    public String xha() {
        return this.ka;
    }

    @Override // com.bytedance.sdk.component.fi.jbs
    public int lr() {
        return this.mj;
    }

    @Override // com.bytedance.sdk.component.fi.jbs
    public String ri() {
        return this.lr;
    }

    public void ri(String str) {
        this.ka = str;
    }

    public void ri(boolean z) {
        this.tan = z;
    }

    public void ri(byte[] bArr) {
        this.dw = bArr;
    }

    public void ri(int i) {
        this.ihz = i;
    }
}
