package com.bytedance.sdk.openadsdk.core.NXR.Lxb;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.openadsdk.ZU.JXs.LD.IeN;
import com.bytedance.sdk.openadsdk.ZU.Lxb.ZU;
import com.bytedance.sdk.openadsdk.ZU.ebl;
import com.bytedance.sdk.openadsdk.core.NXR.LD.JXs;
import com.bytedance.sdk.openadsdk.core.NXR.ZU.lk;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.sLN.lc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Do0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ho0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TextureViewSurfaceTextureListenerC4871vm0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uo0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Lxb implements So0, aH.Lxb, com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb {
    protected final ViewGroup CSn;
    protected long Ivz;

    @NonNull
    protected final Context JVA;
    protected SurfaceTexture JXs;
    protected lc KPU;

    @NonNull
    protected final tD OY;
    protected boolean Sfi;
    protected boolean VVE;
    protected SurfaceHolder ZU;
    protected boolean aH;
    protected LD eK;
    protected JXs ebl;
    protected Fo0 foI;
    protected WeakReference<Do0> id;
    protected lk lc;
    private long xan;
    protected String Lxb = "TTAD.VideoController";
    protected final int LD = 100;
    protected final aH lk = new aH(Looper.getMainLooper(), this);
    protected long QAg = 0;
    protected long nBu = 0;
    protected final List<Runnable> sLN = new ArrayList();
    protected boolean NXR = false;
    protected boolean STP = false;
    protected boolean IeN = true;
    protected boolean kqm = false;
    protected boolean brP = false;
    protected boolean tD = false;
    protected AtomicBoolean DY = new AtomicBoolean(false);
    protected boolean HD = true;
    protected Runnable nE = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z = Lxb.this.NXR;
            Lxb.this.Sfi();
        }
    };
    private long hg = 0;
    private boolean CG = true;
    private int nJ = 1;
    private final AtomicBoolean le = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] Lxb;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.widget.tD.Lxb.values().length];
            Lxb = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.widget.tD.Lxb.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Lxb[com.bytedance.sdk.openadsdk.core.widget.tD.Lxb.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Lxb[com.bytedance.sdk.openadsdk.core.widget.tD.Lxb.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Lxb(Context context, @NonNull tD tDVar, ViewGroup viewGroup) {
        this.OY = tDVar;
        this.JVA = context;
        this.CSn = viewGroup;
        this.Lxb += hashCode();
    }

    private boolean brP() {
        JXs jXs = this.ebl;
        if (jXs != null) {
            return jXs.NXR() instanceof TextureViewSurfaceTextureListenerC4871vm0;
        }
        return false;
    }

    private void hg() {
        JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.ZU(0);
            this.ebl.Lxb(false, false);
            this.ebl.lk(false);
            this.ebl.JXs();
            this.ebl.ebl();
        }
    }

    public final boolean CSn() {
        lk lkVar = this.lc;
        return lkVar == null || lkVar.LD();
    }

    public void DY() {
        if (this.sLN.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.sLN).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.sLN.clear();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    /* JADX INFO: renamed from: HD, reason: merged with bridge method [inline-methods] */
    public final JXs NXR() {
        return this.ebl;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean IeN() {
        return this.STP;
    }

    public final void Ivz() {
        com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(this.OY, this.ebl, this.eK);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean JVA() {
        return this.kqm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FK
    public final void JXs(RG rg, View view) {
        Lxb(rg, view, false);
    }

    public final void KPU() {
        IeN.Lxb lxb = new IeN.Lxb();
        lxb.Lxb(JXs());
        lxb.lk(OY() / ((long) nE()));
        lxb.LD(lc());
        com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(this.ebl, lxb);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public abstract /* synthetic */ void LD();

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public void LD(RG rg, SurfaceTexture surfaceTexture) {
        this.NXR = false;
        lk lkVar = this.lc;
        if (lkVar != null) {
            lkVar.Lxb(false);
        }
        this.JXs = null;
        DY();
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
    }

    public abstract /* synthetic */ void Lxb(RG rg, View view);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public abstract /* synthetic */ void Lxb(boolean z, int i);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public abstract /* synthetic */ boolean Lxb(Uo0 uo0);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final long OY() {
        lk lkVar = this.lc;
        if (lkVar == null) {
            return 0L;
        }
        return lkVar.VVE();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final long QAg() {
        return lc() + JXs();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean STP() {
        return this.VVE;
    }

    public void Sfi() {
        this.lk.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb.2
            @Override // java.lang.Runnable
            public void run() {
                Lxb lxb = Lxb.this;
                if (lxb.lc != null) {
                    boolean z = lxb.NXR;
                    Lxb.this.lc.nBu();
                }
            }
        });
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final boolean VVE() {
        return this.aH;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public abstract /* synthetic */ void ZU();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final void ZU(boolean z) {
        this.CG = z;
    }

    public boolean aH() {
        return this.CG;
    }

    public boolean eK() {
        return this.IeN;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final int ebl() {
        lk lkVar = this.lc;
        if (lkVar == null) {
            return 0;
        }
        return lkVar.IeN();
    }

    public final void foI() {
        IeN.Lxb lxb = new IeN.Lxb();
        lxb.Lxb(JXs());
        lxb.lk(OY() / ((long) nE()));
        lxb.LD(lc());
        com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.LD(NXR(), lxb);
    }

    public final boolean id() {
        lk lkVar = this.lc;
        return lkVar != null && lkVar.lc();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public boolean kqm() {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final long lc() {
        lk lkVar = this.lc;
        if (lkVar == null) {
            return 0L;
        }
        return lkVar.STP();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public abstract /* synthetic */ void lk();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void lk(long j) {
        this.Ivz = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final int nBu() {
        return IK.a(this.nBu, this.Ivz);
    }

    public int nE() {
        return this.nJ;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public BK sLN() {
        return this.lc;
    }

    public void tD() {
        if (this.lc == null) {
            return;
        }
        if (brP()) {
            SurfaceTexture surfaceTexture = this.JXs;
            if (surfaceTexture == null || surfaceTexture == this.lc.tD()) {
                return;
            }
            this.lc.Lxb(this.JXs);
            return;
        }
        SurfaceHolder surfaceHolder = this.ZU;
        if (surfaceHolder == null || surfaceHolder == this.lc.brP()) {
            return;
        }
        this.lc.Lxb(this.ZU);
    }

    public final void xan() {
        ZU.Lxb(com.bytedance.sdk.openadsdk.eK.Lxb.Lxb(this.OY.wbY(), true, this.OY), 5, this.OY.bG());
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public void Lxb(RG rg, SurfaceTexture surfaceTexture) {
        this.NXR = true;
        this.JXs = surfaceTexture;
        lk lkVar = this.lc;
        if (lkVar != null) {
            lkVar.Lxb(surfaceTexture);
            this.lc.Lxb(this.NXR);
        }
        DY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public final void ZU(RG rg, View view) {
        if (!this.tD) {
            Lxb(true, 3);
            return;
        }
        lc(false);
        JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.LD(this.CSn);
        }
        Lxb(1);
    }

    public void lc(boolean z) {
        this.tD = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final void lk(boolean z) {
        this.STP = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public long JXs() {
        return this.QAg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public final void lk(RG rg, View view) {
        JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.QAg();
        }
        Lxb(true, 3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void JXs(boolean z) {
        this.HD = z;
    }

    private boolean lk(int i) {
        return this.ebl.LD(i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public void LD(RG rg, SurfaceHolder surfaceHolder) {
        this.NXR = false;
        this.ZU = null;
        lk lkVar = this.lc;
        if (lkVar != null) {
            lkVar.Lxb(false);
        }
    }

    public final void ZU(long j) {
        this.QAg = j;
        this.nBu = Math.max(this.nBu, j);
        JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.Lxb();
        }
        lk lkVar = this.lc;
        if (lkVar != null) {
            lkVar.Lxb(true, this.QAg, this.VVE);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public void Lxb(RG rg, SurfaceHolder surfaceHolder) {
        this.NXR = true;
        this.ZU = surfaceHolder;
        lk lkVar = this.lc;
        if (lkVar == null) {
            return;
        }
        lkVar.Lxb(surfaceHolder);
        DY();
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public final void LD(RG rg, View view) {
        LD(rg, view, false, false);
    }

    public void LD(Runnable runnable) {
        this.sLN.add(runnable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void LD(long j) {
        this.hg = j;
    }

    public void Lxb(RG rg, View view, boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final void LD(final boolean z) {
        this.VVE = z;
        lk lkVar = this.lc;
        if (lkVar != null) {
            lkVar.LD(z);
            com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(this.ebl, z);
        }
        if (this.KPU != null) {
            if (PK.a()) {
                this.KPU.Lxb(z);
            } else {
                this.lk.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.Lxb.Lxb.3
                    @Override // java.lang.Runnable
                    public void run() {
                        Lxb.this.KPU.Lxb(z);
                    }
                });
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(Ho0 ho0) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(long j) {
        this.QAg = j;
        this.nBu = Math.max(this.nBu, j);
    }

    public void Lxb(Runnable runnable) {
        if (this.ebl.HD() && this.NXR) {
            runnable.run();
        } else {
            LD(runnable);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void Lxb(boolean z) {
        this.IeN = z;
        JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.ZU(z);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public void LD(Uo0 uo0) {
        LD ld = (LD) uo0;
        this.eK = ld;
        this.VVE = ld.OY();
        uo0.ZU(String.valueOf(this.OY.Td()));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final void Lxb(Do0 do0) {
        this.id = new WeakReference<>(do0);
    }

    public final void Lxb(int i) {
        Context context = this.JVA;
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

    public final void LD(RG rg, View view, boolean z, boolean z2) {
        lc(!this.tD);
        Context context = this.JVA;
        if (context != null && (context instanceof Activity)) {
            if (this.tD) {
                Lxb(z ? 8 : 0);
                JXs jXs = this.ebl;
                if (jXs != null) {
                    jXs.Lxb(this.CSn);
                    this.ebl.lk(false);
                }
            } else {
                Lxb(1);
                JXs jXs2 = this.ebl;
                if (jXs2 != null) {
                    jXs2.LD(this.CSn);
                    this.ebl.lk(false);
                }
            }
            WeakReference<Do0> weakReference = this.id;
            Do0 do0 = weakReference != null ? weakReference.get() : null;
            if (do0 != null) {
                do0.Lxb(this.tD);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public final void Lxb(RG rg, View view, boolean z, boolean z2) {
        if (this.IeN) {
            Lxb();
        }
        if (z && !this.IeN && !CSn()) {
            this.ebl.LD(!id(), false);
            this.ebl.Lxb(z2, true, false);
        }
        lk lkVar = this.lc;
        if (lkVar != null && lkVar.lc()) {
            this.ebl.lc();
            this.ebl.JXs();
        } else {
            this.ebl.lc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public final void LD(RG rg, int i) {
        JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.lc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public final void Lxb(RG rg, int i, boolean z) {
        if (this.JVA == null) {
            return;
        }
        long j = this.Ivz;
        long j2 = (long) (((((long) i) * j) * 1.0f) / 100.0f);
        if (j > 0) {
            this.xan = (int) j2;
        } else {
            this.xan = 0L;
        }
        JXs jXs = this.ebl;
        if (jXs != null) {
            jXs.Lxb(this.xan);
        }
    }

    public final void LD(ebl eblVar) {
        IeN.Lxb lxb = new IeN.Lxb();
        lxb.Lxb(JXs());
        lxb.lk(OY() / ((long) nE()));
        lxb.LD(lc());
        lxb.ZU(ebl());
        com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.LD(this.ebl, lxb, eblVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public final void Lxb(RG rg, int i) {
        if (this.lc == null) {
            return;
        }
        Lxb(this.xan, lk(i));
    }

    private void Lxb(long j, boolean z) {
        if (this.lc == null) {
            return;
        }
        if (z) {
            hg();
        }
        this.lc.Lxb(j);
    }

    public void LD(int i) {
        this.nJ = i;
    }

    public final void Lxb(ebl eblVar) {
        if (this.DY.compareAndSet(false, true)) {
            lc lcVar = this.KPU;
            if (lcVar != null) {
                lcVar.Lxb(OY(), STP());
            }
            IeN.Lxb lxb = new IeN.Lxb();
            lxb.Lxb(aH());
            lxb.lk(OY());
            com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.Lxb(kqm.Lxb(), this.ebl, lxb, eblVar);
        }
    }

    public final void Lxb(HK hk) {
        IeN.Lxb lxb = new IeN.Lxb();
        lxb.LD(lc());
        lxb.lk(OY() / ((long) nE()));
        lxb.Lxb(JXs());
        lxb.Lxb(hk);
        com.bytedance.sdk.openadsdk.ZU.JXs.Lxb.Lxb.lk(NXR(), lxb);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final void Lxb(Fo0 fo0) {
        this.foI = fo0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.NXR.LD.Lxb
    public final void Lxb(com.bytedance.sdk.openadsdk.core.widget.tD.Lxb lxb, String str) {
        int i = AnonymousClass4.Lxb[lxb.ordinal()];
        if (i == 1) {
            Lxb();
            return;
        }
        if (i == 2) {
            lk();
        } else {
            if (i != 3) {
                return;
            }
            LD();
            this.kqm = false;
            this.brP = true;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0
    public final void Lxb() {
        lk lkVar = this.lc;
        if (lkVar != null) {
            lkVar.JVA();
        }
        if (this.Sfi || !this.DY.get()) {
            return;
        }
        KPU();
    }

    public void Lxb(long j, long j2) {
        if (!this.le.get() && com.bytedance.sdk.openadsdk.lc.Lxb.Lxb().lk() && (j * 1.0d) / j2 > 0.3d) {
            this.le.set(true);
            if (this.OY != null) {
                com.bytedance.sdk.openadsdk.lc.LD.Lxb().Lxb("videoPercent30", this.OY);
            }
        }
    }
}
