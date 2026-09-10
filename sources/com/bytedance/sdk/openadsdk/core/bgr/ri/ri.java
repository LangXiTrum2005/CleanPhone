package com.bytedance.sdk.openadsdk.core.bgr.ri;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import benzoyl.saneness;
import com.bykv.vk.openvk.ri.ri.ri.di.ka;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.aw.di;
import com.bytedance.sdk.openadsdk.core.bgr.ka.ik;
import com.bytedance.sdk.openadsdk.core.bgr.lr.fi;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.widget.ac;
import com.bytedance.sdk.openadsdk.ka.fi.lr.vr;
import com.bytedance.sdk.openadsdk.ka.xha;
import euthanasia.attabal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import logician.dern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri implements attabal, igq.ri, com.bytedance.sdk.openadsdk.core.bgr.lr.ri {
    protected boolean ay;
    protected ik di;
    protected boolean dw;
    private long dzy;
    protected SurfaceTexture fi;
    protected final ViewGroup fr;
    protected attabal.wireman igq;
    protected boolean ihz;
    protected SurfaceHolder ka;
    protected final wjv mj;
    protected long oh;
    protected long ory;
    protected final Context sf;
    protected boolean slm;
    protected WeakReference<attabal.dern> su;
    protected lr wjv;
    protected fi xha;
    protected di zf;
    protected String ri = "TTAD.VideoController";
    protected final int lr = 100;
    protected final igq ik = new igq(Looper.getMainLooper(), this);
    protected long jbs = 0;
    protected long qt = 0;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    protected final List<Runnable> f18105co = new ArrayList();
    protected boolean aw = false;
    protected boolean bgr = false;
    protected boolean vr = true;
    protected boolean bu = false;
    protected boolean nr = false;
    protected boolean tan = false;
    protected AtomicBoolean ac = new AtomicBoolean(false);
    protected boolean uq = true;
    protected boolean hcw = false;
    protected Runnable xd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ri.ri.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z = ri.this.aw;
            ri.this.ac();
        }
    };
    private long pv = 0;
    private boolean ig = true;
    private int qd = 1;
    private final AtomicBoolean srn = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bgr.ri.ri$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] ri;

        static {
            int[] iArr = new int[ac.ri.values().length];
            ri = iArr;
            try {
                iArr[ac.ri.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ri[ac.ri.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ri[ac.ri.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ri(Context context, wjv wjvVar, ViewGroup viewGroup) {
        this.mj = wjvVar;
        this.sf = context;
        this.fr = viewGroup;
        this.ri += hashCode();
    }

    private void dzy() {
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.ka(0);
            this.xha.ri(false, false);
            this.xha.ik(false);
            this.xha.fi();
            this.xha.xha();
        }
    }

    private boolean slm() {
        fi fiVar = this.xha;
        if (fiVar != null) {
            return fiVar.aw() instanceof ka;
        }
        return false;
    }

    public void ac() {
        this.ik.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ri.ri.2
            @Override // java.lang.Runnable
            public void run() {
                ri riVar = ri.this;
                if (riVar.di != null) {
                    boolean z = riVar.aw;
                    ri.this.di.qt();
                }
            }
        });
    }

    @Override // euthanasia.attabal
    public boolean aw() {
        return this.bgr;
    }

    public boolean ay() {
        return this.slm;
    }

    @Override // euthanasia.attabal
    public final boolean bgr() {
        return this.ay;
    }

    public long bu() {
        return this.ory;
    }

    @Override // euthanasia.attabal
    public long di() {
        return this.jbs;
    }

    public final void dw() {
        this.hcw = true;
        vr.ri riVar = new vr.ri();
        riVar.lr(di());
        riVar.ka(jbs() / ((long) hcw()));
        riVar.ik(xha());
        riVar.ri(bu());
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(this.xha, riVar);
    }

    @Override // euthanasia.attabal
    public abstract /* synthetic */ void fi();

    public void fi(boolean z) {
        this.uq = z;
    }

    public boolean fr() {
        return this.ig;
    }

    public int hcw() {
        return this.qd;
    }

    public final boolean igq() {
        ik ikVar = this.di;
        return ikVar != null && ikVar.di();
    }

    @Override // euthanasia.attabal
    /* JADX INFO: renamed from: ihz, reason: merged with bridge method [inline-methods] */
    public final fi co() {
        return this.xha;
    }

    @Override // euthanasia.attabal
    public abstract /* synthetic */ void ik();

    public void ik(long j) {
        this.pv = j;
    }

    @Override // euthanasia.attabal
    public final long jbs() {
        ik ikVar = this.di;
        if (ikVar == null) {
            return 0L;
        }
        return ikVar.bu();
    }

    @Override // euthanasia.attabal
    public abstract /* synthetic */ void ka();

    public void ka(long j) {
        this.oh = j;
    }

    public void lr(long j) {
        this.jbs = j;
        this.qt = Math.max(this.qt, j);
    }

    @Override // euthanasia.attabal
    public final int mj() {
        ik ikVar = this.di;
        if (ikVar == null) {
            return 0;
        }
        return ikVar.slm();
    }

    public void nr() {
        if (this.di == null) {
            return;
        }
        if (slm()) {
            SurfaceTexture surfaceTexture = this.fi;
            if (surfaceTexture == null || surfaceTexture == this.di.ac()) {
                return;
            }
            this.di.ri(this.fi);
            return;
        }
        SurfaceHolder surfaceHolder = this.ka;
        if (surfaceHolder == null || surfaceHolder == this.di.tan()) {
            return;
        }
        this.di.ri(this.ka);
    }

    public final long oh() {
        return di() + xha();
    }

    public final void ory() {
        this.hcw = true;
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(this.mj, this.xha, this.wjv);
    }

    @Override // euthanasia.attabal
    public final int qt() {
        return saneness.attabal(this.qt, this.oh);
    }

    @Override // euthanasia.attabal
    public abstract /* synthetic */ void ri();

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
    }

    public abstract /* synthetic */ void ri(euthanasia.saneness sanenessVar, View view);

    public abstract /* synthetic */ void ri(boolean z, int i);

    @Override // euthanasia.attabal
    public dern sf() {
        return this.di;
    }

    public final boolean su() {
        ik ikVar = this.di;
        return ikVar == null || ikVar.lr();
    }

    public void tan() {
        if (this.f18105co.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.f18105co).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f18105co.clear();
    }

    public boolean uq() {
        return this.vr;
    }

    @Override // euthanasia.attabal
    public boolean vr() {
        return true;
    }

    public boolean wjv() {
        return this.bu;
    }

    public final void xd() {
        com.bytedance.sdk.openadsdk.ka.ri.lr.ri(com.bytedance.sdk.openadsdk.ay.ri.ri(this.mj.fn(), true, this.mj), 5, this.mj.tn());
    }

    @Override // euthanasia.attabal
    public final long xha() {
        ik ikVar = this.di;
        if (ikVar == null) {
            return 0L;
        }
        return ikVar.vr();
    }

    public final void zf() {
        this.hcw = true;
        vr.ri riVar = new vr.ri();
        riVar.lr(di());
        riVar.ka(jbs() / ((long) hcw()));
        riVar.ik(xha());
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.lr(co(), riVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri, euthanasia.dern
    public final void fi(euthanasia.saneness sanenessVar, View view) {
        ri(sanenessVar, view, false);
    }

    public void ik(boolean z) {
        this.tan = z;
    }

    public final void ka(boolean z) {
        this.ig = z;
    }

    @Override // euthanasia.attabal
    public boolean ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar) {
        return false;
    }

    public final void fi(long j) {
        this.jbs = j;
        this.qt = Math.max(this.qt, j);
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.ri();
        }
        ik ikVar = this.di;
        if (ikVar != null) {
            ikVar.ri(true, this.jbs, this.slm);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public final void ik(euthanasia.saneness sanenessVar, View view) {
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.jbs();
        }
        ri(true, 3);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public final void ka(euthanasia.saneness sanenessVar, View view) {
        if (this.tan) {
            ik(false);
            fi fiVar = this.xha;
            if (fiVar != null) {
                fiVar.lr(this.fr);
            }
            ri(1);
            return;
        }
        ri(true, 3);
    }

    public void lr(Runnable runnable) {
        this.f18105co.add(runnable);
    }

    public void ri(Runnable runnable) {
        if (this.xha.uq() && this.aw) {
            runnable.run();
        } else {
            lr(runnable);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public void lr(euthanasia.saneness sanenessVar, SurfaceHolder surfaceHolder) {
        this.aw = false;
        this.ka = null;
        ik ikVar = this.di;
        if (ikVar != null) {
            ikVar.ri(false);
        }
    }

    private boolean ik(int i) {
        return this.xha.lr(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public void ri(euthanasia.saneness sanenessVar, SurfaceHolder surfaceHolder) {
        this.aw = true;
        this.ka = surfaceHolder;
        ik ikVar = this.di;
        if (ikVar == null) {
            return;
        }
        ikVar.ri(surfaceHolder);
        tan();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public void lr(euthanasia.saneness sanenessVar, SurfaceTexture surfaceTexture) {
        this.aw = false;
        ik ikVar = this.di;
        if (ikVar != null) {
            ikVar.ri(false);
        }
        this.fi = null;
        tan();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public void ri(euthanasia.saneness sanenessVar, SurfaceTexture surfaceTexture) {
        this.aw = true;
        this.fi = surfaceTexture;
        ik ikVar = this.di;
        if (ikVar != null) {
            ikVar.ri(surfaceTexture);
            this.di.ri(this.aw);
        }
        tan();
    }

    public final void lr(boolean z) {
        this.bgr = z;
    }

    public void lr(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar) {
        lr lrVar = (lr) ikVar;
        this.wjv = lrVar;
        this.slm = lrVar.sf();
        ikVar.ka(String.valueOf(this.mj.ur()));
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public final void lr(euthanasia.saneness sanenessVar, View view) {
        lr(sanenessVar, view, false, false);
    }

    public void ri(boolean z) {
        this.vr = z;
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.ka(z);
        }
    }

    public final void lr(euthanasia.saneness sanenessVar, View view, boolean z, boolean z2) {
        ik(!this.tan);
        Context context = this.sf;
        if (context != null && (context instanceof Activity)) {
            if (this.tan) {
                ri(z ? 8 : 0);
                fi fiVar = this.xha;
                if (fiVar != null) {
                    fiVar.ri(this.fr);
                    this.xha.ik(false);
                }
            } else {
                ri(1);
                fi fiVar2 = this.xha;
                if (fiVar2 != null) {
                    fiVar2.lr(this.fr);
                    this.xha.ik(false);
                }
            }
            WeakReference<attabal.dern> weakReference = this.su;
            attabal.dern dernVar = weakReference != null ? weakReference.get() : null;
            if (dernVar != null) {
                dernVar.ri(this.tan);
            }
        }
    }

    @Override // euthanasia.attabal
    public final void ri(final boolean z, String str) {
        this.slm = z;
        ik ikVar = this.di;
        if (ikVar != null) {
            ikVar.lr(z);
            com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(this.xha, z, str);
        }
        if (this.zf != null) {
            if (plench.attabal.attabal()) {
                this.zf.ri(z);
            } else {
                this.ik.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bgr.ri.ri.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ri.this.zf.ri(z);
                    }
                });
            }
        }
    }

    public final void ri(attabal.dern dernVar) {
        this.su = new WeakReference<>(dernVar);
    }

    public void ri(euthanasia.saneness sanenessVar, View view, boolean z) {
    }

    public final void ri(int i) {
        Context context = this.sf;
        if (context == null) {
            return;
        }
        boolean z = i == 0 || i == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
            if (!z) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public final void lr(euthanasia.saneness sanenessVar, int i) {
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.di();
        }
    }

    public final void lr(xha xhaVar) {
        this.hcw = true;
        vr.ri riVar = new vr.ri();
        riVar.lr(di());
        riVar.ka(jbs() / ((long) hcw()));
        riVar.ik(xha());
        riVar.ka(mj());
        riVar.ri(bu());
        riVar.ik(this.dw);
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.lr(this.xha, riVar, xhaVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public final void ri(euthanasia.saneness sanenessVar, View view, boolean z, boolean z2) {
        if (this.vr) {
            lr();
        }
        if (z && !this.vr && !su()) {
            this.xha.lr(!igq(), false);
            this.xha.ri(z2, true, false);
        }
        ik ikVar = this.di;
        if (ikVar != null && ikVar.di()) {
            this.xha.di();
            this.xha.fi();
        } else {
            this.xha.di();
        }
    }

    public void lr(int i) {
        this.qd = i;
    }

    @Override // euthanasia.attabal
    public final void lr() {
        ik ikVar = this.di;
        if (ikVar != null) {
            ikVar.sf();
        }
        if (this.ihz || !this.ac.get()) {
            return;
        }
        dw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public final void ri(euthanasia.saneness sanenessVar, int i, boolean z) {
        if (this.sf == null) {
            return;
        }
        long j = this.oh;
        long j2 = (long) (((((long) i) * j) * 1.0f) / 100.0f);
        if (j > 0) {
            this.dzy = (int) j2;
        } else {
            this.dzy = 0L;
        }
        fi fiVar = this.xha;
        if (fiVar != null) {
            fiVar.ri(this.dzy);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public final void ri(euthanasia.saneness sanenessVar, int i) {
        if (this.di == null) {
            return;
        }
        ri(this.dzy, ik(i));
    }

    private void ri(long j, boolean z) {
        if (this.di == null) {
            return;
        }
        if (z) {
            dzy();
        }
        this.di.ri(j);
    }

    public final void ri(xha xhaVar) {
        boolean z = false;
        if (this.ac.compareAndSet(false, true)) {
            this.hcw = true;
            di diVar = this.zf;
            if (diVar != null) {
                diVar.ri(jbs(), ay());
            }
            vr.ri riVar = new vr.ri();
            riVar.ri(fr());
            riVar.ka(jbs());
            ik ikVar = this.di;
            if (ikVar != null && ikVar.bgr()) {
                z = true;
            }
            riVar.lr(z);
            com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(nr.ri(), this.xha, riVar, xhaVar);
        }
    }

    public final void ri(com.bykv.vk.openvk.ri.ri.ri.ik.saneness sanenessVar) {
        this.hcw = true;
        vr.ri riVar = new vr.ri();
        riVar.ik(xha());
        riVar.ka(jbs() / ((long) hcw()));
        riVar.lr(di());
        riVar.ri(sanenessVar);
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ik(co(), riVar);
    }

    @Override // euthanasia.attabal
    public final void ri(attabal.wireman wiremanVar) {
        this.igq = wiremanVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bgr.lr.ri
    public final void ri(ac.ri riVar, String str) {
        int i = AnonymousClass4.ri[riVar.ordinal()];
        if (i == 1) {
            lr();
            return;
        }
        if (i == 2) {
            ka();
        } else {
            if (i != 3) {
                return;
            }
            ik();
            this.bu = false;
            this.nr = true;
        }
    }

    public void ri(attabal.saneness sanenessVar) {
    }

    @Override // euthanasia.attabal
    public void ri(long j) {
        this.ory = j;
    }

    @Override // euthanasia.attabal
    public boolean ri(float f) {
        ik ikVar = this.di;
        if (ikVar != null) {
            return ikVar.ri(f);
        }
        return false;
    }

    public void ri(long j, long j2) {
        if (!this.srn.get() && com.bytedance.sdk.openadsdk.di.ri.ri().ik() && (j * 1.0d) / j2 > 0.3d) {
            this.srn.set(true);
            if (this.mj != null) {
                com.bytedance.sdk.openadsdk.di.lr.ri().ri("videoPercent30", this.mj);
            }
        }
    }

    @Override // euthanasia.attabal
    public void ri(SurfaceTexture surfaceTexture) {
        this.dw = true;
    }
}
