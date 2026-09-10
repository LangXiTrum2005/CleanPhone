package com.bytedance.sdk.component.JXs.lk;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.view.PointerIconCompat;
import com.bytedance.sdk.component.JXs.DY;
import com.bytedance.sdk.component.JXs.JVA;
import com.bytedance.sdk.component.JXs.QAg;
import com.bytedance.sdk.component.JXs.STP;
import com.bytedance.sdk.component.JXs.VVE;
import com.bytedance.sdk.component.JXs.nBu;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class lk implements QAg {
    private com.bytedance.sdk.component.JXs.LD CSn;
    private boolean DY;
    private int HD;
    private boolean IeN;
    private ExecutorService Ivz;
    private int JVA;
    private VVE JXs;
    private boolean KPU;
    private String LD;
    Future<?> Lxb;
    private volatile boolean NXR;
    private int OY;
    private int QAg;
    private boolean STP;
    private com.bytedance.sdk.component.JXs.ebl Sfi;
    private DY VVE;
    private String ZU;
    private com.bytedance.sdk.component.JXs.lk.Lxb aH;
    private Queue<com.bytedance.sdk.component.JXs.ZU.QAg> brP;
    private lc eK;
    private Bitmap.Config ebl;
    private int foI;
    private int id;
    private int kqm;
    private ImageView.ScaleType lc;
    private String lk;
    private com.bytedance.sdk.component.JXs.OY nBu;
    private boolean nE;
    private WeakReference<ImageView> sLN;
    private final Handler tD;
    private STP xan;

    public static class LD implements nBu {
        private boolean DY;
        private boolean HD;
        private com.bytedance.sdk.component.JXs.LD IeN;
        private DY JVA;
        private ImageView.ScaleType JXs;
        private ImageView LD;
        private VVE Lxb;
        private boolean NXR;
        private int OY;
        private String STP;
        private ExecutorService Sfi;
        private lc VVE;
        private String ZU;
        private int brP;
        private STP eK;
        private int ebl;
        private com.bytedance.sdk.component.JXs.OY kqm;
        private Bitmap.Config lc;
        private String lk;
        private boolean sLN;
        private int tD;
        private int QAg = 1;
        private int nBu = 5;

        public LD(lc lcVar) {
            this.VVE = lcVar;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu JXs(int i) {
            this.tD = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu LD(int i) {
            this.OY = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu Lxb(String str) {
            this.lk = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu ZU(int i) {
            this.brP = i;
            return this;
        }

        public nBu lk(String str) {
            this.ZU = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu LD(String str) {
            this.STP = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu Lxb(ImageView.ScaleType scaleType) {
            this.JXs = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu lk(int i) {
            this.QAg = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu Lxb(Bitmap.Config config) {
            this.lc = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu Lxb(int i) {
            this.ebl = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu Lxb(DY dy) {
            this.JVA = dy;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu Lxb(boolean z) {
            this.NXR = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public QAg Lxb(VVE vve, int i) {
            this.nBu = i;
            return Lxb(vve);
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public QAg Lxb(VVE vve) {
            this.Lxb = vve;
            return new lk(this).aH();
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public QAg Lxb(ImageView imageView) {
            this.LD = imageView;
            return new lk(this).aH();
        }

        @Override // com.bytedance.sdk.component.JXs.nBu
        public nBu Lxb(com.bytedance.sdk.component.JXs.OY oy) {
            this.kqm = oy;
            return this;
        }
    }

    public class Lxb implements VVE {
        private VVE LD;

        public Lxb(VVE vve) {
            this.LD = vve;
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(final JVA jva) {
            Bitmap bitmapLxb;
            final ImageView imageView = (ImageView) lk.this.sLN.get();
            if (imageView != null && lk.this.JVA != 3 && Lxb(imageView) && (jva.LD() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) jva.LD();
                lk.this.tD.post(new Runnable() { // from class: com.bytedance.sdk.component.JXs.lk.lk.Lxb.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (lk.this.nBu != null && (jva.LD() instanceof Bitmap) && (bitmapLxb = lk.this.nBu.Lxb((Bitmap) jva.LD())) != null) {
                    jva.Lxb(bitmapLxb);
                }
            } catch (Throwable unused) {
            }
            if (lk.this.kqm == 5) {
                lk.this.tD.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.JXs.lk.lk.Lxb.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Lxb.this.LD != null) {
                            Lxb.this.LD.Lxb(jva);
                        }
                    }
                });
                return;
            }
            VVE vve = this.LD;
            if (vve != null) {
                vve.Lxb(jva);
            }
        }

        private boolean Lxb(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(lk.this.lk)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.JXs.VVE
        public void Lxb(final int i, final String str, final Throwable th) {
            if (lk.this.kqm == 5) {
                lk.this.tD.post(new Runnable() { // from class: com.bytedance.sdk.component.JXs.lk.lk.Lxb.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Lxb.this.LD != null) {
                            Lxb.this.LD.Lxb(i, str, th);
                        }
                    }
                });
                return;
            }
            VVE vve = this.LD;
            if (vve != null) {
                vve.Lxb(i, str, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public QAg aH() {
        try {
            lc lcVar = this.eK;
            if (lcVar == null) {
                VVE vve = this.JXs;
                if (vve != null) {
                    vve.Lxb(1005, "not init !", null);
                }
                return this;
            }
            ExecutorService executorServiceLc = this.Ivz == null ? lcVar.lc() : null;
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.JXs.lk.lk.1
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.JXs.ZU.QAg qAg;
                    while (!lk.this.NXR && (qAg = (com.bytedance.sdk.component.JXs.ZU.QAg) lk.this.brP.poll()) != null) {
                        try {
                            if (lk.this.VVE != null) {
                                lk.this.VVE.Lxb(qAg.Lxb(), lk.this);
                            }
                            qAg.Lxb(lk.this);
                            if (lk.this.VVE != null) {
                                lk.this.VVE.LD(qAg.Lxb(), lk.this);
                            }
                        } catch (Throwable th) {
                            lk.this.Lxb(2000, th.getMessage(), th);
                            if (lk.this.VVE != null) {
                                lk.this.VVE.LD("exception", lk.this);
                                return;
                            }
                            return;
                        }
                    }
                    if (lk.this.NXR) {
                        lk.this.Lxb(PointerIconCompat.TYPE_HELP, "canceled", null);
                    }
                }
            };
            if (this.nE) {
                runnable.run();
            } else {
                ExecutorService executorService = this.Ivz;
                if (executorService != null) {
                    this.Lxb = executorService.submit(runnable);
                } else if (executorServiceLc != null) {
                    this.Lxb = executorServiceLc.submit(runnable);
                }
            }
            return this;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public com.bytedance.sdk.component.JXs.LD DY() {
        return this.CSn;
    }

    public STP HD() {
        return this.xan;
    }

    public boolean IeN() {
        return this.DY;
    }

    public Bitmap.Config JVA() {
        return this.ebl;
    }

    public boolean NXR() {
        return this.STP;
    }

    public boolean STP() {
        return this.IeN;
    }

    public boolean Sfi() {
        return this.KPU;
    }

    public com.bytedance.sdk.component.JXs.ebl VVE() {
        return this.Sfi;
    }

    public com.bytedance.sdk.component.JXs.lk.Lxb brP() {
        return this.aH;
    }

    public String eK() {
        return JXs() + sLN();
    }

    public int kqm() {
        return this.HD;
    }

    public int sLN() {
        return this.JVA;
    }

    public lc tD() {
        return this.eK;
    }

    private lk(LD ld) {
        this.brP = new LinkedBlockingQueue();
        this.tD = new Handler(Looper.getMainLooper());
        this.DY = true;
        this.LD = ld.ZU;
        this.JXs = new Lxb(ld.Lxb);
        this.sLN = new WeakReference<>(ld.LD);
        this.lc = ld.JXs;
        this.ebl = ld.lc;
        this.OY = ld.ebl;
        this.QAg = ld.OY;
        this.JVA = ld.QAg;
        this.kqm = ld.nBu;
        this.VVE = ld.JVA;
        this.CSn = Lxb(ld);
        if (!TextUtils.isEmpty(ld.lk)) {
            LD(ld.lk);
            Lxb(ld.lk);
        }
        this.STP = ld.sLN;
        this.IeN = ld.NXR;
        this.eK = ld.VVE;
        this.nBu = ld.kqm;
        this.foI = ld.tD;
        this.id = ld.brP;
        this.Ivz = ld.Sfi;
        this.KPU = ld.DY;
        this.nE = ld.HD;
        this.xan = ld.eK;
        this.brP.add(new com.bytedance.sdk.component.JXs.ZU.lk());
    }

    @Override // com.bytedance.sdk.component.JXs.QAg
    public String JXs() {
        return this.lk;
    }

    public void LD(String str) {
        WeakReference<ImageView> weakReference = this.sLN;
        if (weakReference != null && weakReference.get() != null) {
            this.sLN.get().setTag(1094453505, str);
        }
        this.lk = str;
    }

    public int OY() {
        return this.foI;
    }

    public VVE QAg() {
        return this.JXs;
    }

    @Override // com.bytedance.sdk.component.JXs.QAg
    public ImageView.ScaleType ZU() {
        return this.lc;
    }

    public int ebl() {
        return this.id;
    }

    @Override // com.bytedance.sdk.component.JXs.QAg
    public Bitmap.Config lc() {
        return this.ebl;
    }

    @Override // com.bytedance.sdk.component.JXs.QAg
    public int lk() {
        return this.QAg;
    }

    public String nBu() {
        return this.ZU;
    }

    private com.bytedance.sdk.component.JXs.LD Lxb(LD ld) {
        if (ld.IeN != null) {
            return ld.IeN;
        }
        if (!TextUtils.isEmpty(ld.STP)) {
            return com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.Lxb(new File(ld.STP));
        }
        return com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.ebl();
    }

    @Override // com.bytedance.sdk.component.JXs.QAg
    public int LD() {
        return this.OY;
    }

    @Override // com.bytedance.sdk.component.JXs.QAg
    public String Lxb() {
        return this.LD;
    }

    public void Lxb(String str) {
        this.ZU = str;
    }

    public void Lxb(boolean z) {
        this.DY = z;
    }

    public void Lxb(com.bytedance.sdk.component.JXs.ebl eblVar) {
        this.Sfi = eblVar;
    }

    public void Lxb(int i) {
        this.HD = i;
    }

    public void Lxb(com.bytedance.sdk.component.JXs.lk.Lxb lxb) {
        this.aH = lxb;
    }

    public boolean Lxb(com.bytedance.sdk.component.JXs.ZU.QAg qAg) {
        if (this.NXR) {
            return false;
        }
        return this.brP.add(qAg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(int i, String str, Throwable th) {
        new com.bytedance.sdk.component.JXs.ZU.OY(i, str, th).Lxb(this);
        this.brP.clear();
    }
}
