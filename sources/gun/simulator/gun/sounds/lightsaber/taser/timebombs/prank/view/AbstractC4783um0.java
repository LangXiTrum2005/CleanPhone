package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.sdk.component.OY.Lxb.Lxb;
import com.bytedance.sdk.component.OY.QAg;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.um0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4783um0 implements Co0, Eo0, Go0, Io0, Jo0, Ko0, Mo0, BK, com.bytedance.sdk.component.utils.aH.Lxb {
    private static final SparseIntArray aH = new SparseIntArray();
    private static boolean dR = false;
    private boolean CSn;
    private boolean DY;
    private int HD;
    private SurfaceHolder LD;
    private SurfaceTexture Lxb;
    private com.bytedance.sdk.component.utils.aH NXR;
    private boolean Pw;
    private boolean QAg;
    private ArrayList<Runnable> Sfi;
    private int ZU;
    private volatile boolean le;
    private boolean nBu;
    private int lk = 0;
    private boolean JXs = false;
    private volatile Qo0 lc = null;
    private final boolean ebl = false;
    private boolean OY = false;
    private volatile int JVA = 201;
    private long sLN = -1;
    private boolean STP = false;
    private long IeN = 0;
    private long VVE = Long.MIN_VALUE;
    private long kqm = 0;
    private long brP = 0;
    private long tD = 0;
    private String eK = "0";
    private final List<WeakReference<InterfaceC5094yK>> id = new CopyOnWriteArrayList();
    private Uo0 foI = null;
    private boolean KPU = false;
    private CountDownLatch Ivz = new CountDownLatch(1);
    private volatile int nE = 200;
    private AtomicBoolean xan = new AtomicBoolean(false);
    private Surface hg = null;
    private final Runnable CG = new RunnableC3904km0(this, 5);
    private final RunnableC4432qm0 nJ = new RunnableC4432qm0((com.bytedance.sdk.openadsdk.core.NXR.ZU.lk) this);
    private long BcA = 0;
    private long rW = 0;

    public AbstractC4783um0() {
        int i = 0;
        this.HD = 0;
        this.Pw = false;
        this.HD = 0;
        com.bytedance.sdk.component.utils.aH aHVarLxb = Lxb.Lxb().Lxb(this, QAg.THREAD_NAME_PRE.concat("SSMediaPlayerWrapper"));
        this.NXR = aHVarLxb;
        this.Pw = true;
        if (aHVarLxb != null) {
            aHVarLxb.post(new RunnableC3904km0(this, i));
        }
    }

    public static void JVA(AbstractC4783um0 abstractC4783um0) {
        com.bytedance.sdk.component.utils.aH aHVar = abstractC4783um0.NXR;
        if (aHVar != null) {
            aHVar.post(new RunnableC3904km0(abstractC4783um0, 0));
        }
    }

    public int IeN() {
        return this.lk;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:175:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02cf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x02ac, please report this as an issue */
    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        NK nk;
        int i = this.JVA;
        int i2 = message.what;
        if (this.lc != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.JVA == 205 || this.JVA == 207 || this.JVA == 209) {
                            ((OG) this.lc).i.start();
                            this.tD = SystemClock.elapsedRealtime();
                            this.JVA = 206;
                            if (this.sLN > 0) {
                                ((OG) this.lc).a(this.sLN, this.ZU);
                                this.sLN = -1L;
                            }
                            if (this.foI != null) {
                                LD(this.KPU);
                                return;
                            }
                            return;
                        }
                        this.JVA = 200;
                        if (this.OY) {
                            return;
                        }
                        HK hk = new HK(308, i2);
                        hk.c = i + "," + i2;
                        for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
                            if (weakReference == null && weakReference.get() != null) {
                                weakReference.get().Lxb(this, hk);
                            }
                        }
                        this.OY = true;
                        return;
                    case 101:
                        if (this.STP) {
                            this.IeN += this.kqm;
                        }
                        this.STP = false;
                        this.kqm = 0L;
                        this.VVE = Long.MIN_VALUE;
                        if (this.JVA == 206 || this.JVA == 207 || this.JVA == 209) {
                            ((OG) this.lc).i.pause();
                            this.JVA = 207;
                            this.le = false;
                            for (WeakReference<InterfaceC5094yK> weakReference2 : this.id) {
                                if (weakReference2 != null && weakReference2.get() != null) {
                                    weakReference2.get().ZU(this);
                                }
                            }
                            return;
                        }
                        this.JVA = 200;
                        if (this.OY) {
                            HK hk2 = new HK(308, i2);
                            hk2.c = i + "," + i2;
                            while (r2.hasNext()) {
                                if (weakReference == null) {
                                }
                            }
                            this.OY = true;
                            return;
                        }
                        return;
                    case 102:
                        OG og = (OG) this.lc;
                        og.getClass();
                        try {
                            og.i.reset();
                            break;
                        } catch (Throwable unused) {
                        }
                        if (Build.VERSION.SDK_INT >= 23 && (nk = og.k) != null) {
                            try {
                                nk.close();
                                break;
                            } catch (Throwable unused2) {
                            }
                            og.k = null;
                        }
                        og.d();
                        og.e();
                        this.JVA = 201;
                        return;
                    case 103:
                        try {
                            g();
                            break;
                        } catch (Throwable unused3) {
                        }
                        for (WeakReference<InterfaceC5094yK> weakReference3 : this.id) {
                            if (weakReference3 != null && weakReference3.get() != null) {
                                weakReference3.get().lk(this);
                            }
                        }
                        this.JVA = 203;
                        return;
                    case 104:
                        if (this.JVA == 202 || this.JVA == 208) {
                            MediaPlayer mediaPlayer = ((OG) this.lc).i;
                            if (mediaPlayer != null) {
                                mediaPlayer.prepareAsync();
                                return;
                            }
                            return;
                        }
                        this.JVA = 200;
                        if (this.OY) {
                            HK hk3 = new HK(308, i2);
                            hk3.c = i + "," + i2;
                            while (r2.hasNext()) {
                                if (weakReference == null) {
                                }
                            }
                            this.OY = true;
                            return;
                        }
                        return;
                    case 105:
                        if (this.JVA == 205 || this.JVA == 206 || this.JVA == 208 || this.JVA == 207 || this.JVA == 209) {
                            ((OG) this.lc).i.stop();
                            this.JVA = EnumC4719u30.INVALID_BID_PAYLOAD_VALUE;
                            return;
                        }
                        this.JVA = 200;
                        if (this.OY) {
                            HK hk4 = new HK(308, i2);
                            hk4.c = i + "," + i2;
                            while (r2.hasNext()) {
                                if (weakReference == null) {
                                }
                            }
                            this.OY = true;
                            return;
                        }
                        return;
                    case 106:
                        if (this.JVA == 206 || this.JVA == 207 || this.JVA == 209) {
                            ((OG) this.lc).a(((Long) message.obj).longValue(), this.ZU);
                            return;
                        }
                        this.JVA = 200;
                        if (this.OY) {
                            HK hk5 = new HK(308, i2);
                            hk5.c = i + "," + i2;
                            while (r2.hasNext()) {
                                if (weakReference == null) {
                                }
                            }
                            this.OY = true;
                            return;
                        }
                        return;
                    case 107:
                        this.IeN = 0L;
                        this.lk = 0;
                        this.kqm = 0L;
                        this.STP = false;
                        this.VVE = Long.MIN_VALUE;
                        if (this.JVA == 201 || this.JVA == 203) {
                            Uo0 uo0 = (Uo0) message.obj;
                            if (TextUtils.isEmpty(uo0.LD())) {
                                if (TextUtils.isEmpty(Ro0.b)) {
                                    try {
                                        File file = new File(Ro0.f3682a.getFilesDir(), "ttad_dir");
                                        if (!file.exists()) {
                                            file.mkdirs();
                                        }
                                        Ro0.b = file.getAbsolutePath();
                                        break;
                                    } catch (Throwable unused4) {
                                    }
                                }
                                uo0.Lxb(Ro0.b);
                            }
                            File file2 = new File(uo0.LD(), uo0.STP());
                            if (file2.exists()) {
                                file2.getAbsolutePath();
                                if (Ro0.c) {
                                    FileInputStream fileInputStream = new FileInputStream(file2.getAbsolutePath());
                                    ((OG) this.lc).i.setDataSource(fileInputStream.getFD());
                                    fileInputStream.close();
                                } else {
                                    ((OG) this.lc).c(file2.getAbsolutePath());
                                }
                            } else {
                                uo0.NXR();
                                if ((dR || uo0.LD == 1) && Build.VERSION.SDK_INT < 23) {
                                    ((OG) this.lc).c(uo0.NXR());
                                    uo0.NXR();
                                } else if (Build.VERSION.SDK_INT >= 23) {
                                    ((OG) this.lc).b(uo0);
                                    uo0.NXR();
                                } else {
                                    AbstractC4918wK.f5175a.getClass();
                                    String strA = LK.a(uo0);
                                    if (strA != null && Ro0.c && strA.startsWith("file")) {
                                        FileInputStream fileInputStream2 = new FileInputStream(Uri.parse(strA).getPath());
                                        ((OG) this.lc).i.setDataSource(fileInputStream2.getFD());
                                        fileInputStream2.close();
                                    } else {
                                        ((OG) this.lc).c(strA);
                                    }
                                }
                            }
                            this.JVA = 202;
                            return;
                        }
                        this.JVA = 200;
                        if (this.OY) {
                            HK hk6 = new HK(308, i2);
                            hk6.c = i + "," + i2;
                            while (r2.hasNext()) {
                                if (weakReference == null) {
                                }
                            }
                            this.OY = true;
                            return;
                        }
                        return;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        SurfaceHolder surfaceHolder = (SurfaceHolder) message.obj;
                        OG og2 = (OG) this.lc;
                        synchronized (og2.m) {
                            try {
                                if (!og2.n && surfaceHolder != null && surfaceHolder.getSurface() != null && og2.h) {
                                    og2.i.setDisplay(surfaceHolder);
                                }
                                break;
                            } catch (Throwable unused5) {
                            }
                            break;
                        }
                        ((OG) this.lc).i.setScreenOnWhilePlaying(true);
                        this.Ivz.await(1L, TimeUnit.SECONDS);
                        a();
                        return;
                    case 111:
                        this.hg = new Surface((SurfaceTexture) message.obj);
                        Qo0 qo0 = this.lc;
                        Surface surface = this.hg;
                        OG og3 = (OG) qo0;
                        og3.f();
                        og3.l = surface;
                        og3.i.setSurface(surface);
                        ((OG) this.lc).i.setScreenOnWhilePlaying(true);
                        this.Ivz.await(1L, TimeUnit.SECONDS);
                        a();
                        return;
                }
            } catch (Throwable unused6) {
            }
        }
    }

    public boolean NXR() {
        return this.JVA == 205;
    }

    public long STP() {
        if (Build.VERSION.SDK_INT < 23) {
            return this.rW;
        }
        if (this.STP) {
            long j = this.kqm;
            if (j > 0) {
                return this.IeN + j;
            }
        }
        return this.IeN;
    }

    public long VVE() {
        long j = this.brP;
        long duration = 0;
        if (j != 0) {
            return j;
        }
        if (this.JVA == 206 || this.JVA == 207) {
            try {
                OG og = (OG) this.lc;
                og.getClass();
                try {
                    duration = og.i.getDuration();
                } catch (Throwable unused) {
                }
                this.brP = duration;
            } catch (Throwable unused2) {
            }
        }
        return this.brP;
    }

    public final void a() {
        ArrayList<Runnable> arrayList = this.Sfi;
        if (arrayList == null || arrayList.isEmpty() || this.QAg) {
            return;
        }
        this.QAg = true;
        Iterator it = new ArrayList(this.Sfi).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.Sfi.clear();
        this.QAg = false;
    }

    public final void b(int i) {
        if (i == 701) {
            this.BcA = SystemClock.elapsedRealtime();
            this.lk++;
            for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().Lxb(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i != 702) {
            if (this.Pw && i == 3) {
                a();
                h();
                LD(this.KPU);
                return;
            }
            return;
        }
        if (this.BcA > 0) {
            this.rW = (SystemClock.elapsedRealtime() - this.BcA) + this.rW;
            this.BcA = 0L;
        }
        for (WeakReference<InterfaceC5094yK> weakReference2 : this.id) {
            if (weakReference2 != null && weakReference2.get() != null) {
                weakReference2.get().Lxb((BK) this, Integer.MAX_VALUE);
            }
        }
    }

    public SurfaceHolder brP() {
        return this.LD;
    }

    public final void c(long j) {
        RunnableC4432qm0 runnableC4432qm0 = this.nJ;
        runnableC4432qm0.f4900a = j;
        if (this.CSn) {
            d(runnableC4432qm0);
            return;
        }
        Uo0 uo0 = this.foI;
        if (uo0 == null || !uo0.ZU()) {
            e(this.nJ);
        } else {
            d(this.nJ);
        }
    }

    public final void d(Runnable runnable) {
        if (runnable == null || OY()) {
            return;
        }
        if (this.nBu) {
            e(runnable);
        } else {
            runnable.run();
        }
    }

    public final void e(Runnable runnable) {
        try {
            if (this.Sfi == null) {
                this.Sfi = new ArrayList<>();
            }
            this.Sfi.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public final void f() {
        com.bytedance.sdk.component.utils.aH aHVar = this.NXR;
        if (aHVar == null || aHVar.getLooper() == null) {
            return;
        }
        this.NXR.post(new RunnableC3904km0(this, 6));
    }

    public final void g() {
        NK nk;
        NK nk2;
        if (this.lc == null) {
            return;
        }
        try {
            OG og = (OG) this.lc;
            og.getClass();
            try {
                og.i.reset();
            } catch (Throwable unused) {
            }
            if (Build.VERSION.SDK_INT >= 23 && (nk2 = og.k) != null) {
                try {
                    nk2.close();
                } catch (Throwable unused2) {
                }
                og.k = null;
            }
            og.d();
            og.e();
        } catch (Throwable unused3) {
        }
        ((OG) this.lc).b = null;
        ((OG) this.lc).e = null;
        ((OG) this.lc).c = null;
        ((OG) this.lc).g = null;
        ((OG) this.lc).f = null;
        ((OG) this.lc).f3496a = null;
        ((OG) this.lc).d = null;
        try {
            OG og2 = (OG) this.lc;
            synchronized (og2.m) {
                try {
                    if (!og2.n) {
                        og2.i.release();
                        og2.n = true;
                        og2.f();
                        if (Build.VERSION.SDK_INT >= 23 && (nk = og2.k) != null) {
                            try {
                                nk.close();
                            } catch (Throwable unused4) {
                            }
                            og2.k = null;
                        }
                        og2.d();
                        og2.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused5) {
        }
    }

    public final void h() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.tD;
        for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Lxb(this, jElapsedRealtime);
            }
        }
        this.JXs = true;
    }

    public long kqm() {
        if (OY()) {
            return 0L;
        }
        if (this.JVA != 206 && this.JVA != 207) {
            return 0L;
        }
        try {
            OG og = (OG) this.lc;
            og.getClass();
            return og.i.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public void sLN() {
        if (OY()) {
            return;
        }
        this.nBu = true;
        ArrayList<Runnable> arrayList = this.Sfi;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.Sfi.clear();
        }
        com.bytedance.sdk.component.utils.aH aHVar = this.NXR;
        if (aHVar != null) {
            try {
                aHVar.removeCallbacksAndMessages(null);
                if (this.lc != null) {
                    this.NXR.sendEmptyMessage(103);
                }
                f();
            } catch (Throwable unused) {
                f();
            }
        }
    }

    public SurfaceTexture tD() {
        return this.Lxb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
    public int JXs() {
        MediaPlayer mediaPlayer;
        if (this.lc == null || OY() || (mediaPlayer = ((OG) this.lc).i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoHeight();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
    public boolean OY() {
        return this.nBu;
    }

    public void QAg() {
        if (OY() || this.lc == null) {
            return;
        }
        this.xan.set(true);
        if (this.JVA != 206) {
            this.IeN = 0L;
            this.lk = 0;
            this.kqm = 0L;
            this.STP = false;
            this.VVE = Long.MIN_VALUE;
            this.le = false;
            this.nJ.b = true;
            c(0L);
            com.bytedance.sdk.component.utils.aH aHVar = this.NXR;
            if (aHVar != null) {
                aHVar.removeCallbacks(this.CG);
                this.NXR.postDelayed(this.CG, this.nE);
            }
        }
        this.Ivz.countDown();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
    public boolean ebl() {
        com.bytedance.sdk.component.utils.aH aHVar;
        return ((this.JVA != 207 && !this.le) || (aHVar = this.NXR) == null || aHVar.hasMessages(100)) ? false : true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
    public boolean lc() {
        com.bytedance.sdk.component.utils.aH aHVar;
        return (this.JVA == 206 || ((aHVar = this.NXR) != null && aHVar.hasMessages(100))) && !this.le;
    }

    public void nBu() {
        if (OY() || this.NXR == null) {
            return;
        }
        this.xan.set(true);
        this.NXR.post(new RunnableC3904km0(this, 1));
    }

    public void JVA() {
        com.bytedance.sdk.component.utils.aH aHVar;
        Uo0 uo0;
        Uo0 uo1;
        if (OY() || (aHVar = this.NXR) == null) {
            return;
        }
        aHVar.removeMessages(100);
        this.le = true;
        if (!this.Pw) {
            if (!this.DY && ((uo1 = this.foI) == null || !uo1.ZU())) {
                e(new RunnableC3904km0(this, 2));
                return;
            }
            com.bytedance.sdk.component.utils.aH aHVar2 = this.NXR;
            if (aHVar2 != null) {
                aHVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.JXs && ((uo0 = this.foI) == null || !uo0.ZU())) {
            e(new RunnableC3904km0(this, 3));
            return;
        }
        com.bytedance.sdk.component.utils.aH aHVar3 = this.NXR;
        if (aHVar3 != null) {
            aHVar3.sendEmptyMessage(101);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
    public boolean LD() {
        return this.JVA == 209;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
    public int ZU() {
        MediaPlayer mediaPlayer;
        if (this.lc == null || OY() || (mediaPlayer = ((OG) this.lc).i) == null) {
            return 0;
        }
        return mediaPlayer.getVideoWidth();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
    public boolean lk() {
        return NXR() || lc() || ebl();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Io0
    public boolean LD(Qo0 qo0, int i, int i2) {
        if (this.lc != qo0) {
            return false;
        }
        if (i2 == -1004) {
            HK hk = new HK(i, i2);
            for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().Lxb(this, hk);
                }
            }
        }
        b(i);
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ko0
    public void lk(Qo0 qo0) {
        for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Lxb((BK) this, true);
            }
        }
    }

    public static void lk(boolean z) {
        dR = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Co0
    public void LD(Qo0 qo0) {
        if (OY()) {
            return;
        }
        this.JVA = 205;
        try {
            Uo0 uo0 = this.foI;
            if (uo0 != null) {
                float fSLN = uo0.sLN();
                if (fSLN > 0.0f) {
                    OG og = (OG) this.lc;
                    if (Build.VERSION.SDK_INT >= 23) {
                        MediaPlayer mediaPlayer = og.i;
                        mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(fSLN));
                    } else {
                        og.getClass();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (this.NXR != null) {
            if (this.le) {
                com.bytedance.sdk.component.utils.aH aHVar = this.NXR;
                if (aHVar != null) {
                    aHVar.post(new RunnableC3904km0(this, 7));
                }
            } else {
                com.bytedance.sdk.component.utils.aH aHVar2 = this.NXR;
                aHVar2.sendMessage(aHVar2.obtainMessage(100, -1, -1));
            }
        }
        aH.delete(this.HD);
        boolean z = this.Pw;
        boolean z2 = this.DY;
        if (!z && !z2) {
            h();
            this.DY = true;
        }
        for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().LD(this);
            }
        }
    }

    public void LD(boolean z) {
        com.bytedance.sdk.component.utils.aH aHVar;
        if (OY() || (aHVar = this.NXR) == null) {
            return;
        }
        aHVar.post(new RunnableC4256om0(this, z, 0));
    }

    public void LD(int i) {
        this.ZU = i;
    }

    public void Lxb(InterfaceC5094yK interfaceC5094yK) {
        if (interfaceC5094yK == null) {
            return;
        }
        for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
            if (weakReference != null && weakReference.get() == interfaceC5094yK) {
                return;
            }
        }
        this.id.add(new WeakReference<>(interfaceC5094yK));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Eo0
    public void Lxb(Qo0 qo0) {
        this.JVA = EnumC4719u30.INVALID_JSON_BID_PAYLOAD_VALUE;
        aH.delete(this.HD);
        com.bytedance.sdk.component.utils.aH aHVar = this.NXR;
        if (aHVar != null) {
            aHVar.removeCallbacks(this.CG);
        }
        for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Lxb(this);
            }
        }
    }

    public static void Lxb(AbstractC4783um0 abstractC4783um0, long j, long j2) {
        for (WeakReference<InterfaceC5094yK> weakReference : abstractC4783um0.id) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Lxb(abstractC4783um0, j, j2);
            }
        }
    }

    public void Lxb(boolean z) {
        if (OY()) {
            return;
        }
        this.CSn = z;
        if (this.lc != null) {
            ((OG) this.lc).h = z;
            return;
        }
        com.bytedance.sdk.component.utils.aH aHVar = this.NXR;
        if (aHVar != null) {
            aHVar.post(new RunnableC4256om0(this, z, 1));
        }
    }

    public void Lxb(boolean z, long j, boolean z2) {
        if (OY()) {
            return;
        }
        com.bytedance.sdk.component.utils.aH aHVar = this.NXR;
        int i = 0;
        if (aHVar != null) {
            aHVar.post(new RunnableC3904km0(this, i));
        }
        this.KPU = z2;
        this.xan.set(true);
        this.le = false;
        LD(z2);
        if (z) {
            this.sLN = j;
            d(new RunnableC3904km0(this, 4));
        } else {
            c(j);
        }
        com.bytedance.sdk.component.utils.aH aHVar2 = this.NXR;
        if (aHVar2 != null) {
            aHVar2.removeCallbacks(this.CG);
            this.NXR.postDelayed(this.CG, this.nE);
        }
        this.Ivz.countDown();
    }

    public void Lxb(long j) {
        if (OY()) {
            return;
        }
        if (this.JVA == 207 || this.JVA == 206 || this.JVA == 209) {
            d(new RunnableC3992lm0(this, j));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BK
    public boolean Lxb() {
        return this.JXs;
    }

    public void Lxb(SurfaceTexture surfaceTexture) {
        if (OY()) {
            return;
        }
        this.Lxb = surfaceTexture;
        Lxb(true);
        d(new RunnableC3252dN(5, this, surfaceTexture));
    }

    public void Lxb(SurfaceHolder surfaceHolder) {
        if (OY()) {
            return;
        }
        this.LD = surfaceHolder;
        Lxb(true);
        d(new RunnableC3252dN(6, this, surfaceHolder));
    }

    public void Lxb(Uo0 uo0) {
        if (OY()) {
            return;
        }
        this.foI = uo0;
        if (uo0 != null) {
            this.Pw = this.Pw && !uo0.ZU();
        }
        d(new RunnableC3252dN(7, this, uo0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Go0
    public void Lxb(Qo0 qo0, int i) {
        if (this.lc != qo0) {
            return;
        }
        for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().LD(this, i);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mo0
    public boolean Lxb(Qo0 qo0, int i, int i2) {
        SparseIntArray sparseIntArray = aH;
        sparseIntArray.put(this.HD, sparseIntArray.get(this.HD) + 1);
        this.JVA = 200;
        com.bytedance.sdk.component.utils.aH aHVar = this.NXR;
        if (aHVar != null) {
            aHVar.removeCallbacks(this.CG);
        }
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800 || z) {
            f();
        }
        if (!this.xan.get()) {
            return true;
        }
        this.xan.set(false);
        HK hk = new HK(i, i2);
        for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Lxb(this, hk);
            }
        }
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jo0
    public void Lxb(Qo0 qo0, int i, int i2, int i3, int i4) {
        for (WeakReference<InterfaceC5094yK> weakReference : this.id) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().Lxb((BK) this, i, i2);
            }
        }
    }

    public void Lxb(int i) {
        if (OY()) {
            return;
        }
        this.nE = i;
    }
}
