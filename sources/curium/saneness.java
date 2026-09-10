package curium;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.ri.ri.ri.ik.ik;
import com.bytedance.sdk.component.mj.ri.ri;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.component.utils.ihz;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk$SDKError;
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
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class saneness implements curium.attabal.InterfaceC0577attabal, curium.attabal.saneness, curium.attabal.dern, curium.attabal.wireman, curium.attabal.marial, curium.attabal.beachfront, curium.attabal.competently, logician.dern, igq.ri {
    private static final SparseIntArray ri = new SparseIntArray();
    private boolean aw;
    private ArrayList<Runnable> ay;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f24504co;
    private SurfaceHolder di;
    private volatile boolean dzy;
    private SurfaceTexture fi;
    private boolean igq;
    private boolean jc;
    private volatile boolean kt;
    private igq slm;
    private boolean wjv;
    private final boolean lr = false;
    private final List<WeakReference<logician.dern.attabal>> ik = new CopyOnWriteArrayList();
    private final kowloon ka = new kowloon();
    private int xha = 0;
    private int mj = 3;
    private boolean jbs = false;
    private volatile curium.attabal qt = null;
    private boolean sf = false;
    private volatile int bgr = 201;
    private long vr = -1;
    private boolean bu = false;
    private long nr = 0;
    private long tan = Long.MIN_VALUE;
    private long ac = 0;
    private long ihz = 0;
    private long uq = 0;
    private int fr = 0;
    private String su = "0";
    private ik zf = null;
    private boolean dw = false;
    private CountDownLatch ory = new CountDownLatch(1);
    private volatile int hcw = 200;
    private AtomicBoolean oh = new AtomicBoolean(false);
    private Surface xd = null;
    private long pv = 0;
    private long ig = 0;
    private boolean qd = false;
    private final Runnable srn = new beachfront();

    public class apical implements Runnable {
        public apical() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.slm == null || saneness.this.slm.getLooper() == null) {
                return;
            }
            try {
                ri.ri().ri(saneness.this.slm);
                saneness.this.slm = null;
            } catch (Throwable unused) {
            }
        }
    }

    public class attabal implements Runnable {
        public attabal() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.qt == null) {
                try {
                    saneness.this.qt = new curium.wireman();
                } catch (Throwable th) {
                    th.getMessage();
                }
                if (saneness.this.qt == null) {
                    return;
                }
                curium.attabal unused = saneness.this.qt;
                saneness.this.su = "0";
                saneness.this.qt.competently(saneness.this);
                saneness.this.qt.attabal(saneness.this);
                saneness.this.qt.marial(saneness.this);
                saneness.this.qt.taiyuan(saneness.this);
                saneness.this.qt.saneness(saneness.this);
                saneness.this.qt.wireman(saneness.this);
                saneness.this.qt.beachfront(saneness.this);
                try {
                    saneness.this.qt.cutely(false);
                } catch (Throwable unused2) {
                }
                saneness.this.sf = false;
            }
        }
    }

    public class beachfront implements Runnable {
        public beachfront() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.qt == null) {
                return;
            }
            long jNr = saneness.this.nr();
            if (jNr > 0 && saneness.this.di() && saneness.this.tan != Long.MIN_VALUE) {
                try {
                    if (saneness.this.tan == jNr) {
                        if (!saneness.this.bu && saneness.this.ac >= 400) {
                            saneness.this.lr(IronSourceError.ERROR_NT_LOAD_AFTER_LONG_INITIATION, 800);
                            saneness.this.bu = true;
                        }
                        saneness.this.ac += (long) saneness.this.hcw;
                    } else {
                        if (saneness.this.bu) {
                            saneness.this.nr += saneness.this.ac;
                            saneness.this.lr(IronSourceError.ERROR_NT_INIT_FAILED_AFTER_LOAD, 800);
                            long unused = saneness.this.nr;
                            int unused2 = saneness.this.xha;
                        }
                        saneness.this.ac = 0L;
                        saneness.this.bu = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (saneness.this.bu() > 0) {
                if (saneness.this.tan != jNr) {
                    if (logician.attabal.dern()) {
                        long unused3 = saneness.this.tan;
                    }
                    saneness sanenessVar = saneness.this;
                    sanenessVar.ri(jNr, sanenessVar.bu());
                }
                saneness.this.tan = jNr;
            }
            if (saneness.this.lr()) {
                saneness sanenessVar2 = saneness.this;
                sanenessVar2.ri(sanenessVar2.bu(), saneness.this.bu());
            } else if (saneness.this.slm != null) {
                saneness.this.slm.postDelayed(this, saneness.this.hcw);
            }
        }
    }

    public class competently implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ long f24509kowloon;

        public competently(long j) {
            this.f24509kowloon = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.slm != null) {
                saneness.this.slm.obtainMessage(106, Long.valueOf(this.f24509kowloon)).sendToTarget();
            }
        }
    }

    public class cutely implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ik f24511kowloon;

        public cutely(ik ikVar) {
            this.f24511kowloon = ikVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            saneness.this.uq();
            if (saneness.this.slm != null) {
                saneness.this.slm.obtainMessage(107, this.f24511kowloon).sendToTarget();
            }
        }
    }

    public class dern implements Runnable {
        public dern() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.slm != null) {
                saneness.this.slm.sendEmptyMessage(101);
            }
        }
    }

    public class formularize implements Runnable {
        public formularize() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                saneness.this.qt.mj();
                saneness.this.bgr = 207;
                saneness.this.dzy = false;
            } catch (Throwable unused) {
            }
        }
    }

    public class impassible implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ boolean f24515kowloon;

        public impassible(boolean z) {
            this.f24515kowloon = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.mj() || saneness.this.qt == null) {
                return;
            }
            try {
                saneness.this.dw = this.f24515kowloon;
                saneness.this.qt.ka(this.f24515kowloon);
            } catch (Throwable unused) {
            }
        }
    }

    public class impromptu implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f24517kowloon;

        public impromptu(SurfaceTexture surfaceTexture) {
            this.f24517kowloon = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public void run() {
            saneness.this.uq();
            if (saneness.this.slm != null) {
                saneness.this.slm.obtainMessage(111, this.f24517kowloon).sendToTarget();
            }
        }
    }

    public class kowloon implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f24518arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public long f24519kowloon;

        public kowloon() {
        }

        public void attabal(long j) {
            this.f24519kowloon = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.qt != null) {
                try {
                    if (!this.f24518arytenoidectomy) {
                        long jQt = saneness.this.qt.qt();
                        saneness.this.vr = Math.max(this.f24519kowloon, jQt);
                    }
                    long unused = saneness.this.vr;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            if (saneness.this.slm != null) {
                saneness.this.slm.sendEmptyMessageDelayed(100, 0L);
            }
        }

        public void saneness(boolean z) {
            this.f24518arytenoidectomy = z;
        }
    }

    public class marial implements Runnable {
        public marial() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.slm != null) {
                saneness.this.slm.sendEmptyMessage(104);
            }
        }
    }

    /* JADX INFO: renamed from: curium.saneness$saneness, reason: collision with other inner class name */
    public class RunnableC0578saneness implements Runnable {
        public RunnableC0578saneness() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!saneness.this.xha() || saneness.this.qt == null) {
                return;
            }
            try {
                saneness.this.qt.di();
                for (WeakReference weakReference : saneness.this.ik) {
                    if (weakReference != null && weakReference.get() != null) {
                        ((logician.dern.attabal) weakReference.get()).fi(saneness.this);
                    }
                }
                saneness.this.bgr = 206;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public class taiyuan implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ SurfaceHolder f24524kowloon;

        public taiyuan(SurfaceHolder surfaceHolder) {
            this.f24524kowloon = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            saneness.this.uq();
            if (saneness.this.slm != null) {
                saneness.this.slm.obtainMessage(110, this.f24524kowloon).sendToTarget();
            }
        }
    }

    public class triweekly implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ boolean f24526kowloon;

        public triweekly(boolean z) {
            this.f24526kowloon = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.qt != null) {
                saneness.this.qt.ri(this.f24526kowloon);
            }
        }
    }

    public class wireman implements Runnable {
        public wireman() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (saneness.this.slm != null) {
                saneness.this.slm.sendEmptyMessage(101);
            }
        }
    }

    public saneness() {
        ri("SSMediaPlayerWrapper");
    }

    private void ay() {
        if (this.qt == null) {
            return;
        }
        try {
            this.qt.aw();
        } catch (Throwable unused) {
        }
        this.qt.attabal(null);
        this.qt.beachfront(null);
        this.qt.taiyuan(null);
        this.qt.wireman(null);
        this.qt.marial(null);
        this.qt.competently(null);
        this.qt.saneness(null);
        try {
            this.qt.co();
        } catch (Throwable unused2) {
        }
    }

    private void dw() {
        if (this.f24504co) {
            return;
        }
        this.f24504co = true;
        Iterator it = new ArrayList(this.ay).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.ay.clear();
        this.f24504co = false;
    }

    private void fr() {
        igq igqVar = this.slm;
        if (igqVar == null || igqVar.getLooper() == null) {
            return;
        }
        try {
            this.slm.post(new apical());
        } catch (Throwable unused) {
        }
    }

    private void hcw() {
        ArrayList<Runnable> arrayList = this.ay;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.ay.clear();
    }

    private void igq() {
        this.kt = true;
        this.jbs = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.uq;
        for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ri(this, jElapsedRealtime);
            }
        }
    }

    private void ihz() {
        this.nr = 0L;
        this.xha = 0;
        this.ac = 0L;
        this.bu = false;
        this.tan = Long.MIN_VALUE;
    }

    private void ory() {
        ArrayList<Runnable> arrayList = this.ay;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        dw();
    }

    private void su() {
        SparseIntArray sparseIntArray = ri;
        sparseIntArray.put(this.fr, sparseIntArray.get(this.fr) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uq() {
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.post(new attabal());
        }
    }

    private void wjv() {
        lr(new marial());
    }

    private void zf() {
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.post(new formularize());
        }
    }

    public SurfaceTexture ac() {
        return this.fi;
    }

    public boolean aw() {
        return this.bgr == 205;
    }

    public boolean bgr() {
        return this.jc;
    }

    public long bu() {
        long j = this.ihz;
        if (j != 0) {
            return j;
        }
        if (this.bgr == 206 || this.bgr == 207) {
            try {
                this.ihz = this.qt.sf();
            } catch (Throwable unused) {
            }
        }
        return this.ihz;
    }

    public void co() {
        if (mj()) {
            return;
        }
        this.aw = true;
        hcw();
        igq igqVar = this.slm;
        if (igqVar != null) {
            try {
                igqVar.removeCallbacksAndMessages(null);
                if (this.qt != null) {
                    this.slm.sendEmptyMessage(103);
                }
                fr();
            } catch (Throwable unused) {
                fr();
            }
        }
    }

    public long nr() {
        if (mj()) {
            return 0L;
        }
        if (this.bgr == 206 || this.bgr == 207) {
            try {
                return this.qt.qt();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public int slm() {
        return this.xha;
    }

    public SurfaceHolder tan() {
        return this.di;
    }

    public long vr() {
        if (this.bu) {
            long j = this.ac;
            if (j > 0) {
                return this.nr + j;
            }
        }
        return this.nr;
    }

    @Override // logician.dern
    public boolean di() {
        igq igqVar;
        return (this.bgr == 206 || ((igqVar = this.slm) != null && igqVar.hasMessages(100))) && !this.dzy;
    }

    @Override // logician.dern
    public int fi() {
        if (this.qt == null || mj()) {
            return 0;
        }
        return this.qt.vr();
    }

    public void jbs() {
        if (mj() || this.qt == null) {
            return;
        }
        this.oh.set(true);
        if (this.bgr != 206) {
            ihz();
            this.dzy = false;
            this.ka.saneness(true);
            lr(0L);
            igq igqVar = this.slm;
            if (igqVar != null) {
                igqVar.removeCallbacks(this.srn);
                this.slm.postDelayed(this.srn, this.hcw);
            }
        }
        this.ory.countDown();
    }

    @Override // logician.dern
    public boolean mj() {
        return this.aw;
    }

    public void qt() {
        if (mj() || this.slm == null) {
            return;
        }
        this.oh.set(true);
        this.slm.post(new RunnableC0578saneness());
    }

    public void sf() {
        igq igqVar;
        if (mj() || (igqVar = this.slm) == null) {
            return;
        }
        igqVar.removeMessages(100);
        this.dzy = true;
        if (this.qd) {
            if (!this.jbs && !lr(this.zf)) {
                ri(new wireman());
                return;
            }
            igq igqVar2 = this.slm;
            if (igqVar2 != null) {
                igqVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.wjv && !lr(this.zf)) {
            ri(new dern());
            return;
        }
        igq igqVar3 = this.slm;
        if (igqVar3 != null) {
            igqVar3.sendEmptyMessage(101);
        }
    }

    @Override // logician.dern
    public boolean xha() {
        igq igqVar;
        return ((this.bgr != 207 && !this.dzy) || (igqVar = this.slm) == null || igqVar.hasMessages(100)) ? false : true;
    }

    private void lr(long j) {
        this.ka.attabal(j);
        if (this.igq) {
            lr(this.ka);
        } else if (lr(this.zf)) {
            lr(this.ka);
        } else {
            ri(this.ka);
        }
    }

    @Override // logician.dern
    public boolean ik() {
        return aw() || di() || xha();
    }

    @Override // logician.dern
    public int ka() {
        if (this.qt == null || mj()) {
            return 0;
        }
        return this.qt.bgr();
    }

    private void ik(ik ikVar) throws Throwable {
        ikVar.slm();
        this.qt.ri(ikVar);
        ikVar.slm();
    }

    @Override // curium.attabal.InterfaceC0577attabal
    public void ik(curium.attabal attabalVar) {
        for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ri((logician.dern) this, true);
            }
        }
    }

    private boolean lr(ik ikVar) {
        return ikVar != null && ikVar.xha();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(long j, long j2) {
        long j3;
        long j4;
        if (!this.kt) {
            igq();
        }
        for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
            if (weakReference == null || weakReference.get() == null) {
                j3 = j;
                j4 = j2;
            } else {
                j3 = j;
                j4 = j2;
                weakReference.get().ri(this, j3, j4);
            }
            j = j3;
            j2 = j4;
        }
    }

    @Override // logician.dern
    public boolean lr() {
        return this.bgr == 209;
    }

    private void lr(ik ikVar, File file) {
        try {
            String strAttabal = shimmery.wireman.attabal(file);
            if (ikVar.bu().equals(strAttabal)) {
                ri(file);
                return;
            }
            JSONObject jSONObjectIk = ikVar.ik();
            boolean zLr = ikVar.lr();
            if (jSONObjectIk != null) {
                jSONObjectIk.put("file_hash", ikVar.bu());
                jSONObjectIk.put("file_real_hash", strAttabal);
                jSONObjectIk.put("is_change_play_type", zLr ? 1 : 0);
                jSONObjectIk.put("error_real_code", Sdk$SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);
                jSONObjectIk.put("error_real_msg", "md5_not_match");
            }
            if (zLr) {
                boolean zDelete = file.delete();
                if (jSONObjectIk != null) {
                    jSONObjectIk.put("delete_cache_file", zDelete ? 1 : 0);
                }
                if (zDelete) {
                    ik(ikVar);
                    return;
                }
            }
            ri(file);
        } catch (Throwable unused) {
        }
    }

    private void ri(String str) {
        this.fr = 0;
        this.slm = ri.ri().ri(this, "csj_".concat(String.valueOf(str)));
        this.qd = true;
        uq();
    }

    public void ri(boolean z) {
        if (mj()) {
            return;
        }
        this.igq = z;
        if (this.qt != null) {
            this.qt.ri(z);
            return;
        }
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.post(new triweekly(z));
        }
    }

    public void ri(boolean z, long j, boolean z2) {
        if (mj()) {
            return;
        }
        uq();
        this.dw = z2;
        this.oh.set(true);
        this.dzy = false;
        lr(z2);
        if (z) {
            this.vr = j;
            wjv();
        } else {
            lr(j);
        }
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.removeCallbacks(this.srn);
            this.slm.postDelayed(this.srn, this.hcw);
        }
        this.ory.countDown();
    }

    private void lr(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.qt.apical(fileInputStream.getFD());
        fileInputStream.close();
    }

    @Override // curium.attabal.wireman
    public boolean lr(curium.attabal attabalVar, int i, int i2) {
        if (this.qt != attabalVar) {
            return false;
        }
        if (i2 == -1004) {
            com.bykv.vk.openvk.ri.ri.ri.ik.saneness sanenessVar = new com.bykv.vk.openvk.ri.ri.ri.ik.saneness(i, i2);
            for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().ri(this, sanenessVar);
                }
            }
        }
        lr(i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(int i, int i2) {
        if (i == 701) {
            this.pv = SystemClock.elapsedRealtime();
            this.xha++;
            for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().ri(this, Integer.MAX_VALUE, 0, 0);
                }
            }
            return;
        }
        if (i == 702) {
            if (this.pv > 0) {
                this.ig += SystemClock.elapsedRealtime() - this.pv;
                this.pv = 0L;
            }
            for (WeakReference<logician.dern.attabal> weakReference2 : this.ik) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().ri((logician.dern) this, Integer.MAX_VALUE);
                }
            }
            return;
        }
        if (this.qd && i == 3) {
            ory();
            igq();
            lr(this.dw);
        } else if (i == 805) {
            this.jc = true;
        }
    }

    public void ri(long j) {
        if (mj()) {
            return;
        }
        if (this.bgr == 207 || this.bgr == 206 || this.bgr == 209) {
            lr(new competently(j));
        }
    }

    @Override // logician.dern
    public boolean ri() {
        return this.jbs;
    }

    public void ri(SurfaceTexture surfaceTexture) {
        if (mj()) {
            return;
        }
        this.fi = surfaceTexture;
        ri(true);
        lr(new impromptu(surfaceTexture));
    }

    public void ri(SurfaceHolder surfaceHolder) {
        if (mj()) {
            return;
        }
        this.di = surfaceHolder;
        ri(true);
        lr(new taiyuan(surfaceHolder));
    }

    public void ri(ik ikVar) {
        if (mj()) {
            return;
        }
        this.zf = ikVar;
        if (ikVar != null) {
            this.qd = this.qd && !ikVar.xha();
        }
        lr(new cutely(ikVar));
    }

    @Override // curium.attabal.saneness
    public void lr(curium.attabal attabalVar) {
        if (mj()) {
            return;
        }
        this.bgr = 205;
        try {
            ik ikVar = this.zf;
            if (ikVar != null) {
                float fVr = ikVar.vr();
                if (fVr > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    logician.saneness sanenessVar = new logician.saneness();
                    sanenessVar.saneness(fVr);
                    this.qt.dern(sanenessVar);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.slm != null) {
            if (this.dzy) {
                zf();
            } else {
                igq igqVar = this.slm;
                igqVar.sendMessage(igqVar.obtainMessage(100, -1, -1));
            }
        }
        ri.delete(this.fr);
        boolean z = this.qd;
        boolean z2 = this.wjv;
        if (!z && !z2) {
            igq();
            this.wjv = true;
        }
        for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().lr(this);
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        int i = this.bgr;
        int i2 = message.what;
        if (this.qt != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.bgr == 205 || this.bgr == 207 || this.bgr == 209) {
                            this.qt.di();
                            this.uq = SystemClock.elapsedRealtime();
                            this.bgr = 206;
                            if (this.vr > 0) {
                                this.qt.ri(this.vr, this.mj);
                                this.vr = -1L;
                            }
                            if (this.zf != null) {
                                lr(this.dw);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.bu) {
                            this.nr += this.ac;
                        }
                        this.bu = false;
                        this.ac = 0L;
                        this.tan = Long.MIN_VALUE;
                        if (this.bgr == 206 || this.bgr == 207 || this.bgr == 209) {
                            this.qt.mj();
                            this.bgr = 207;
                            this.dzy = false;
                            for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().ka(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.qt.aw();
                        this.bgr = 201;
                        return;
                    case 103:
                        try {
                            ay();
                            break;
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<logician.dern.attabal> weakReference2 : this.ik) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().ik(this);
                            }
                        }
                        this.bgr = 203;
                        return;
                    case 104:
                        if (this.bgr == 202 || this.bgr == 208) {
                            this.qt.jbs();
                            return;
                        }
                        break;
                    case 105:
                        if (this.bgr == 205 || this.bgr == 206 || this.bgr == 208 || this.bgr == 207 || this.bgr == 209) {
                            this.qt.xha();
                            this.bgr = Sdk$SDKError.Reason.INVALID_BID_PAYLOAD_VALUE;
                            return;
                        }
                        break;
                    case 106:
                        if (this.bgr == 206 || this.bgr == 207 || this.bgr == 209) {
                            this.qt.ri(((Long) message.obj).longValue(), this.mj);
                            return;
                        }
                        break;
                    case 107:
                        ihz();
                        if (this.bgr == 201 || this.bgr == 203) {
                            ik ikVar = (ik) message.obj;
                            if (TextUtils.isEmpty(ikVar.fi())) {
                                ikVar.ri(logician.attabal.wireman());
                            }
                            if (ikVar.fr()) {
                                this.qt.ri(ikVar.slm());
                                ikVar.slm();
                            } else {
                                File file = new File(ikVar.fi(), ikVar.bu());
                                if (file.exists()) {
                                    ri(ikVar, file);
                                } else {
                                    ik(ikVar);
                                }
                            }
                            this.bgr = 202;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.qt.ri((SurfaceHolder) message.obj);
                        this.qt.lr(true);
                        this.ory.await(1L, TimeUnit.SECONDS);
                        ory();
                        return;
                    case 111:
                        this.xd = new Surface((SurfaceTexture) message.obj);
                        this.qt.impromptu(this.xd);
                        this.qt.lr(true);
                        this.ory.await(1L, TimeUnit.SECONDS);
                        ory();
                        return;
                }
                this.bgr = 200;
                if (this.sf) {
                    return;
                }
                com.bykv.vk.openvk.ri.ri.ri.ik.saneness sanenessVar = new com.bykv.vk.openvk.ri.ri.ri.ik.saneness(308, i2);
                sanenessVar.wireman(i + "," + i2);
                for (WeakReference<logician.dern.attabal> weakReference3 : this.ik) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().ri(this, sanenessVar);
                    }
                }
                this.sf = true;
            } catch (Throwable unused2) {
            }
        }
    }

    private void lr(Runnable runnable) {
        if (runnable == null || mj()) {
            return;
        }
        if (!this.aw) {
            runnable.run();
        } else {
            ri(runnable);
        }
    }

    public void lr(boolean z) {
        igq igqVar;
        if (mj() || (igqVar = this.slm) == null) {
            return;
        }
        igqVar.post(new impassible(z));
    }

    public void lr(int i) {
        this.mj = i;
    }

    private void ri(ik ikVar, File file) {
        if (ikVar.ri()) {
            lr(ikVar, file);
        } else {
            ri(file);
        }
    }

    private void ri(File file) {
        file.getAbsolutePath();
        try {
            if (ihz.ri(logician.attabal.marial())) {
                this.qt.ri(file.getAbsolutePath());
            } else {
                lr(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // curium.attabal.beachfront
    public void ri(curium.attabal attabalVar, int i) {
        if (this.qt != attabalVar) {
            return;
        }
        for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().lr(this, i);
            }
        }
    }

    @Override // curium.attabal.marial
    public void ri(curium.attabal attabalVar) {
        this.bgr = Sdk$SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE;
        ri.delete(this.fr);
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.removeCallbacks(this.srn);
        }
        for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ri(this);
            }
        }
    }

    @Override // curium.attabal.dern
    public boolean ri(curium.attabal attabalVar, int i, int i2) {
        su();
        this.bgr = 200;
        igq igqVar = this.slm;
        if (igqVar != null) {
            igqVar.removeCallbacks(this.srn);
        }
        if (ri(i, i2)) {
            fr();
        }
        if (!this.oh.get()) {
            return true;
        }
        this.oh.set(false);
        com.bykv.vk.openvk.ri.ri.ri.ik.saneness sanenessVar = new com.bykv.vk.openvk.ri.ri.ri.ik.saneness(i, i2);
        for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ri(this, sanenessVar);
            }
        }
        return true;
    }

    private boolean ri(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    private void ri(Runnable runnable) {
        try {
            if (this.ay == null) {
                this.ay = new ArrayList<>();
            }
            this.ay.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // curium.attabal.competently
    public void ri(curium.attabal attabalVar, int i, int i2, int i3, int i4) {
        for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().ri((logician.dern) this, i, i2);
            }
        }
    }

    public void ri(logician.dern.attabal attabalVar) {
        if (attabalVar == null) {
            return;
        }
        for (WeakReference<logician.dern.attabal> weakReference : this.ik) {
            if (weakReference != null && weakReference.get() == attabalVar) {
                return;
            }
        }
        this.ik.add(new WeakReference<>(attabalVar));
    }

    public void ri(int i) {
        if (mj()) {
            return;
        }
        this.hcw = i;
    }

    public boolean ri(float f) {
        PlaybackParams playbackParamsFi;
        float speed = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        try {
            if (this.qt == null || !ik()) {
                return false;
            }
            try {
                playbackParamsFi = this.qt.fi();
            } catch (Throwable th) {
                ac.ik("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParamsFi = null;
            }
            if (playbackParamsFi != null) {
                speed = playbackParamsFi.getSpeed();
            }
            if (speed == f) {
                return true;
            }
            logician.saneness sanenessVar = new logician.saneness();
            sanenessVar.saneness(f);
            this.qt.dern(sanenessVar);
            return true;
        } catch (Throwable th2) {
            ac.ri("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }
}
