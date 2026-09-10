package com.bytedance.sdk.openadsdk.core.exu.qdl;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr;
import com.bykv.vk.openvk.qdl.qdl.qdl.mo.mml;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.exu.ud.mzz;
import com.bytedance.sdk.openadsdk.core.fs.mo;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.aaj;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.bjy;
import com.bytedance.sdk.openadsdk.mml.wd;
import com.bytedance.sdk.openadsdk.utils.gy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qdl implements lnr, koa.qdl, com.bytedance.sdk.openadsdk.core.exu.ud.qdl {
    protected ud bch;
    protected WeakReference<lnr.ud> bqt;
    protected long ekw;
    private long hzv;
    protected final ljh jpc;
    protected boolean jtx;
    protected lnr.qdl koa;
    protected SurfaceHolder mml;
    protected com.bytedance.sdk.openadsdk.core.exu.mml.lnr mo;
    protected SurfaceTexture mzz;
    protected boolean oth;
    protected long rc;
    protected final Context rq;
    protected boolean uw;
    protected mo vu;
    protected mzz wd;
    protected final ViewGroup xmv;
    protected String qdl = "TTAD.VideoController";
    protected final int ud = 100;
    protected final koa lnr = new koa(Looper.getMainLooper(), this);
    protected long tvp = 0;
    protected long to = 0;
    protected final List<Runnable> fs = new ArrayList();
    protected boolean exu = false;
    protected boolean rdp = false;
    protected boolean bjy = true;
    protected boolean yt = false;
    protected boolean jl = false;
    protected boolean exc = false;
    protected AtomicBoolean aaj = new AtomicBoolean(false);
    protected AtomicBoolean jyq = new AtomicBoolean(false);
    protected boolean ljh = true;
    protected boolean kdv = false;
    protected Runnable hkc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.qdl.qdl.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z2 = qdl.this.exu;
            qdl.this.aaj();
        }
    };
    private long fco = 0;
    private boolean mrf = true;
    private int gy = 1;
    private final AtomicBoolean ax = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.exu.qdl.qdl$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[aaj.qdl.values().length];
            qdl = iArr;
            try {
                iArr[aaj.qdl.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[aaj.qdl.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[aaj.qdl.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public qdl(Context context, ljh ljhVar, ViewGroup viewGroup) {
        this.jpc = ljhVar;
        this.rq = context;
        this.xmv = viewGroup;
        this.qdl += hashCode();
    }

    private void fco() {
        mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.mml(0);
            this.wd.qdl(false, false);
            this.wd.lnr(false);
            this.wd.mzz();
            this.wd.wd();
        }
    }

    private boolean jtx() {
        mzz mzzVar = this.wd;
        if (mzzVar != null) {
            return mzzVar.exu() instanceof mml;
        }
        return false;
    }

    public void aaj() {
        this.lnr.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.qdl.qdl.3
            @Override // java.lang.Runnable
            public void run() {
                qdl qdlVar = qdl.this;
                if (qdlVar.mo != null) {
                    boolean z2 = qdlVar.exu;
                    qdl.this.mo.to();
                }
            }
        });
    }

    public boolean bch() {
        return this.jtx;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean bjy() {
        return true;
    }

    public final boolean bqt() {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        return lnrVar != null && lnrVar.mo();
    }

    public int ekw() {
        return this.gy;
    }

    public void exc() {
        if (this.fs.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.fs).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.fs.clear();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean exu() {
        return this.rdp;
    }

    public final long hkc() {
        return wd() + mo();
    }

    public final void hzv() {
        com.bytedance.sdk.openadsdk.mml.qdl.ud.qdl(com.bytedance.sdk.openadsdk.bch.qdl.qdl(this.jpc.auu(), true, this.jpc), 5, this.jpc.yre());
    }

    public void jl() {
        if (this.mo == null) {
            return;
        }
        if (jtx()) {
            SurfaceTexture surfaceTexture = this.mzz;
            if (surfaceTexture == null || surfaceTexture == this.mo.exc()) {
                return;
            }
            this.mo.qdl(this.mzz);
            return;
        }
        SurfaceHolder surfaceHolder = this.mml;
        if (surfaceHolder == null || surfaceHolder == this.mo.jl()) {
            return;
        }
        this.mo.qdl(this.mml);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public final int jpc() {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar == null) {
            return 0;
        }
        return lnrVar.bjy();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    /* JADX INFO: renamed from: jyq, reason: merged with bridge method [inline-methods] */
    public final mzz fs() {
        return this.wd;
    }

    public final void kdv() {
        this.kdv = true;
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(this.jpc, this.wd, this.bch);
    }

    public final void koa() {
        if (ljh.mo(this.jpc) && this.jyq.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.yt.lnr.ud(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.exu.qdl.qdl.5
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                    try {
                        qdlVar.ud("video_player");
                        qdlVar.mml(gy.qdl(qdl.this.jpc));
                        qdlVar.qdl(BuildConfig.VERSION_NAME);
                    } catch (Throwable unused) {
                    }
                    return qdlVar;
                }
            });
        }
    }

    public boolean ljh() {
        return this.yt;
    }

    public void lnr(long j) {
        this.fco = j;
    }

    public void mml(long j) {
        this.ekw = j;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public long mo() {
        return this.tvp;
    }

    public void mzz(boolean z2) {
        this.ljh = z2;
    }

    public boolean oth() {
        return this.bjy;
    }

    @Override // com.bytedance.sdk.component.utils.koa.qdl
    public void qdl(Message message) {
    }

    public final void rc() {
        this.kdv = true;
        bjy.qdl qdlVar = new bjy.qdl();
        qdlVar.ud(mo());
        qdlVar.mml(tvp() / ((long) ekw()));
        qdlVar.lnr(wd());
        qdlVar.qdl(yt());
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(this.wd, qdlVar);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public final boolean rdp() {
        return this.uw;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public com.bykv.vk.openvk.qdl.qdl.qdl.qdl rq() {
        return this.mo;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public final int to() {
        return com.bykv.vk.openvk.qdl.qdl.ud.mml.qdl.qdl(this.to, this.ekw);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public final long tvp() {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar == null) {
            return 0L;
        }
        return lnrVar.jtx();
    }

    public void ud(long j) {
        this.tvp = j;
        this.to = Math.max(this.to, j);
    }

    public boolean uw() {
        return this.mrf;
    }

    public final void vu() {
        this.kdv = true;
        bjy.qdl qdlVar = new bjy.qdl();
        qdlVar.ud(mo());
        qdlVar.mml(tvp() / ((long) ekw()));
        qdlVar.lnr(wd());
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.ud(fs(), qdlVar);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public final long wd() {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar == null) {
            return 0L;
        }
        return lnrVar.rdp();
    }

    public final boolean xmv() {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        return lnrVar == null || lnrVar.ud();
    }

    public long yt() {
        return this.rc;
    }

    public void lnr(boolean z2) {
        this.exc = z2;
    }

    public final void mml(boolean z2) {
        this.mrf = z2;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public final void mzz(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, View view) {
        qdl(udVar, view, false);
    }

    public void qdl(lnr.mml mmlVar) {
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public final void lnr(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, View view) {
        mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.tvp();
        }
        qdl(true, 3);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public final void mml(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, View view) {
        if (this.exc) {
            lnr(false);
            mzz mzzVar = this.wd;
            if (mzzVar != null) {
                mzzVar.ud(this.xmv);
            }
            qdl(1);
            return;
        }
        qdl(true, 3);
    }

    public final void mzz(long j) {
        this.tvp = j;
        this.to = Math.max(this.to, j);
        mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.qdl();
        }
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.qdl(true, this.tvp, this.jtx);
        }
    }

    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, View view, boolean z2) {
    }

    public void ud(Runnable runnable) {
        this.fs.add(runnable);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        if (!ljh.mo(this.jpc)) {
            return false;
        }
        com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.exu.qdl.qdl.2
            @Override // com.bytedance.sdk.openadsdk.yt.mml
            public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                try {
                    qdlVar.ud("video_player");
                    qdlVar.mml(gy.qdl(qdl.this.jpc));
                    qdlVar.qdl(BuildConfig.VERSION_NAME);
                } catch (Throwable unused) {
                }
                return qdlVar;
            }
        });
        return false;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, SurfaceHolder surfaceHolder) {
        this.exu = false;
        this.mml = null;
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.qdl(false);
        }
    }

    private boolean lnr(int i2) {
        return this.wd.ud(i2);
    }

    public void qdl(Runnable runnable) {
        if (this.wd.oth() && this.exu) {
            runnable.run();
        } else {
            ud(runnable);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, SurfaceTexture surfaceTexture) {
        this.exu = false;
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.qdl(false);
        }
        this.mzz = null;
        exc();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, SurfaceHolder surfaceHolder) {
        this.exu = true;
        this.mml = surfaceHolder;
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar == null) {
            return;
        }
        lnrVar.qdl(surfaceHolder);
        exc();
    }

    public final void ud(boolean z2) {
        this.rdp = z2;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, SurfaceTexture surfaceTexture) {
        this.exu = true;
        this.mzz = surfaceTexture;
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.qdl(surfaceTexture);
            this.mo.qdl(this.exu);
        }
        exc();
    }

    public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        ud udVar = (ud) lnrVar;
        this.bch = udVar;
        this.jtx = udVar.rq();
        lnrVar.mml(String.valueOf(this.jpc.fz()));
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public final void ud(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, View view) {
        ud(udVar, view, false, false);
    }

    public final void ud(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, View view, boolean z2, boolean z3) {
        lnr(!this.exc);
        Context context = this.rq;
        if (context != null && (context instanceof Activity)) {
            if (this.exc) {
                qdl(z2 ? 8 : 0);
                mzz mzzVar = this.wd;
                if (mzzVar != null) {
                    mzzVar.qdl(this.xmv);
                    this.wd.lnr(false);
                }
            } else {
                qdl(1);
                mzz mzzVar2 = this.wd;
                if (mzzVar2 != null) {
                    mzzVar2.ud(this.xmv);
                    this.wd.lnr(false);
                }
            }
            WeakReference<lnr.ud> weakReference = this.bqt;
            lnr.ud udVar2 = weakReference != null ? weakReference.get() : null;
            if (udVar2 != null) {
                udVar2.qdl(this.exc);
            }
        }
    }

    public void qdl(boolean z2) {
        this.bjy = z2;
        mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.mml(z2);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public final void qdl(final boolean z2, String str) {
        this.jtx = z2;
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.ud(z2);
            com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(this.wd, z2, str);
        }
        if (this.vu != null) {
            if (com.bykv.vk.openvk.qdl.qdl.ud.ud.qdl.qdl()) {
                this.vu.qdl(z2);
            } else {
                this.lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.qdl.qdl.4
                    @Override // java.lang.Runnable
                    public void run() {
                        qdl.this.vu.qdl(z2);
                    }
                });
            }
        }
    }

    public final void qdl(lnr.ud udVar) {
        this.bqt = new WeakReference<>(udVar);
    }

    public final void qdl(int i2) {
        Context context = this.rq;
        if (context == null) {
            return;
        }
        boolean z2 = i2 == 0 || i2 == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i2);
            } catch (Throwable unused) {
            }
            if (!z2) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public final void ud(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, int i2) {
        mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.mo();
        }
    }

    public final void ud(wd wdVar) {
        this.kdv = true;
        bjy.qdl qdlVar = new bjy.qdl();
        qdlVar.ud(mo());
        qdlVar.mml(tvp() / ((long) ekw()));
        qdlVar.lnr(wd());
        qdlVar.mml(jpc());
        qdlVar.qdl(yt());
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.ud(this.wd, qdlVar, wdVar);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public final void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, View view, boolean z2, boolean z3) {
        if (this.bjy) {
            ud();
        }
        if (z2 && !this.bjy && !xmv()) {
            this.wd.ud(!bqt(), false);
            this.wd.qdl(z3, true, false);
        }
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null && lnrVar.mo()) {
            this.wd.mo();
            this.wd.mzz();
        } else {
            this.wd.mo();
        }
    }

    public void ud(int i2) {
        this.gy = i2;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public final void ud() {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            lnrVar.rq();
        }
        if (this.oth || !this.aaj.get()) {
            return;
        }
        rc();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public final void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, int i2, boolean z2) {
        if (this.rq == null) {
            return;
        }
        long j = this.ekw;
        long j2 = (long) (((((long) i2) * j) * 1.0f) / 100.0f);
        if (j > 0) {
            this.hzv = (int) j2;
        } else {
            this.hzv = 0L;
        }
        mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.qdl(this.hzv);
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public final void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, int i2) {
        if (this.mo == null) {
            return;
        }
        qdl(this.hzv, lnr(i2));
    }

    private void qdl(long j, boolean z2) {
        if (this.mo == null) {
            return;
        }
        if (z2) {
            fco();
        }
        this.mo.qdl(j);
    }

    public final void qdl(wd wdVar) {
        if (this.aaj.compareAndSet(false, true)) {
            this.kdv = true;
            mo moVar = this.vu;
            if (moVar != null) {
                moVar.qdl(tvp(), bch());
            }
            bjy.qdl qdlVar = new bjy.qdl();
            qdlVar.qdl(uw());
            qdlVar.mml(tvp());
            com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.qdl(yt.qdl(), this.wd, qdlVar, wdVar);
        }
    }

    public final void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl qdlVar) {
        this.kdv = true;
        bjy.qdl qdlVar2 = new bjy.qdl();
        qdlVar2.lnr(wd());
        qdlVar2.mml(tvp() / ((long) ekw()));
        qdlVar2.ud(mo());
        qdlVar2.qdl(qdlVar);
        com.bytedance.sdk.openadsdk.mml.mzz.qdl.qdl.lnr(fs(), qdlVar2);
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public final void qdl(lnr.qdl qdlVar) {
        this.koa = qdlVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.ud.qdl
    public final void qdl(aaj.qdl qdlVar, String str) {
        int i2 = AnonymousClass6.qdl[qdlVar.ordinal()];
        if (i2 == 1) {
            ud();
            return;
        }
        if (i2 == 2) {
            mml();
        } else {
            if (i2 != 3) {
                return;
            }
            lnr();
            this.yt = false;
            this.jl = true;
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void qdl(long j) {
        this.rc = j;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean qdl(float f) {
        com.bytedance.sdk.openadsdk.core.exu.mml.lnr lnrVar = this.mo;
        if (lnrVar != null) {
            return lnrVar.qdl(f);
        }
        return false;
    }

    public void qdl(long j, long j2) {
        if (!this.ax.get() && com.bytedance.sdk.openadsdk.mo.qdl.qdl().lnr() && (j * 1.0d) / j2 > 0.3d) {
            this.ax.set(true);
            if (this.jpc != null) {
                com.bytedance.sdk.openadsdk.mo.ud.qdl().qdl("videoPercent30", this.jpc);
            }
        }
    }
}
