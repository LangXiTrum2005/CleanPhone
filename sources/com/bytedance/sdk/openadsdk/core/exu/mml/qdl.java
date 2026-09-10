package com.bytedance.sdk.openadsdk.core.exu.mml;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.tvp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.bch.ud.mzz;
import com.bytedance.sdk.openadsdk.core.fs.mml;
import com.bytedance.sdk.openadsdk.core.fs.mo;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.wd;
import com.bytedance.sdk.openadsdk.rdp.rdp;
import com.bytedance.sdk.openadsdk.utils.ag;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.bytedance.sdk.openadsdk.utils.jtx;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class qdl extends com.bytedance.sdk.openadsdk.core.exu.qdl.qdl {
    private long ag;
    private long ax;
    private final AtomicBoolean cx;
    protected boolean fco;
    private InterfaceC0111qdl gt;
    private final wd gy;
    protected long hzv;
    final lnr.ud mrf;
    private final int om;
    private final Runnable wak;
    private boolean wc;
    private boolean yh;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.exu.mml.qdl$1, reason: invalid class name */
    public class AnonymousClass1 implements lnr.ud {
        private boolean ud = true;

        public AnonymousClass1() {
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void lnr(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl;
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void mml(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            mml mmlVarQdl;
            com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc.zm();
            if (mmlVarZm != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                mmlVarQdl.ud(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).tvp);
            }
            mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc, 3);
            if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu != null) {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu.qdl(0);
            }
            if (qdl.this.gt != null) {
                qdl.this.gt.qdl(2);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void mzz(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc, 0);
            if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu != null) {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu.qdl(1);
            }
            if (qdl.this.gt != null) {
                qdl.this.gt.qdl(1);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            mml mmlVarQdl;
            if (qdl.this.cx.compareAndSet(false, true)) {
                String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl;
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu != null) {
                            try {
                                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu.qdl(9);
                            } catch (Exception unused2) {
                            }
                        }
                        qdl.this.yh();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc.zm();
                if (mmlVarZm != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                    long jMo = qdl.this.mo();
                    mmlVarQdl.mml(jMo);
                    mmlVarQdl.mzz(jMo);
                }
                mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc, 5);
                com.bytedance.sdk.openadsdk.bch.qdl.lnr.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc, 5);
                if (qdl.this.gt != null) {
                    qdl.this.gt.qdl(3);
                }
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i2) {
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void ud(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl;
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.removeCallbacks(qdl.this.wak);
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd != null) {
                        ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd.ud();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, long j) {
            String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl;
            if (!((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).aaj.get()) {
                qdl.this.koa();
            }
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).uw = false;
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.removeCallbacks(qdl.this.wak);
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd != null) {
                        ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd.ud();
                    }
                }
            });
            if (!((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).aaj.get()) {
                qdl qdlVar2 = qdl.this;
                qdlVar2.hzv = j;
                qdlVar2.qdl(qdlVar2.gy);
                qdl.this.hzv();
            }
            if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu != null) {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu.lnr();
            }
            mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc, 0);
            if (qdl.this.gt != null) {
                qdl.this.gt.qdl(1);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, com.bykv.vk.openvk.qdl.qdl.qdl.lnr.qdl qdlVar2) {
            mml mmlVarQdl;
            String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl;
            qdlVar2.qdl();
            qdlVar2.ud();
            qdlVar2.lnr();
            if (ljh.mo(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc)) {
                com.bytedance.sdk.openadsdk.yt.lnr.lnr(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.5
                    @Override // com.bytedance.sdk.openadsdk.yt.mml
                    public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                        com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar3 = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                        try {
                            qdlVar3.ud("video_player");
                            qdlVar3.mml(gy.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc));
                            qdlVar3.qdl(BuildConfig.VERSION_NAME);
                        } catch (Throwable unused2) {
                        }
                        return qdlVar3;
                    }
                });
            }
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.removeCallbacks(qdl.this.wak);
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd != null) {
                        ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd.ud();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).koa != null) {
                        ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).koa.ud(qdl.this.ag, com.bykv.vk.openvk.qdl.qdl.ud.mml.qdl.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).tvp, ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).ekw));
                    }
                }
            });
            qdl.this.qdl(qdlVar2);
            mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc, 6);
            com.bytedance.sdk.openadsdk.bch.qdl.lnr.ud(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc);
            if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu != null) {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu.qdl(14);
            }
            if (qdl.this.gt != null) {
                qdl.this.gt.qdl(4);
            }
            com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc.zm();
            if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
                return;
            }
            mmlVarQdl.qdl(com.bytedance.sdk.openadsdk.core.fs.qdl.qdl.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, boolean z2) {
            String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl;
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.removeCallbacks(qdl.this.wak);
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd != null) {
                        ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd.ud();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i2, int i3) {
            String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl;
            tvp.qdl().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).mo == null) {
                        return;
                    }
                    try {
                        final float fMml = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).mo.mml();
                        final float fMzz = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).mo.mzz();
                        if (fMml == 0.0f || fMzz == 0.0f) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (!qdl.this.wak()) {
                                    qdl.this.qdl(fMml, fMzz);
                                    return;
                                }
                                if (aaj.ud(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc) || ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).bch.mo == 4) {
                                    qdl.this.qdl(true, fMml, fMzz);
                                    return;
                                }
                                if (aaj.lnr(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc)) {
                                    qdl.this.qdl(true, fMml, fMzz);
                                    return;
                                }
                                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc.fzn() == 3) {
                                    qdl.this.qdl(true, fMml, fMzz);
                                } else if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc.fzn() == 0) {
                                    qdl.this.lnr(fMml, fMzz);
                                } else {
                                    qdl.this.ud(fMml, fMzz);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.aaj.lnr(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl, th.getMessage());
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i2, int i3, int i4) {
            String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl;
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).uw = true;
            qdl.this.cx();
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.9
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd != null) {
                        ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd.yt();
                    }
                }
            });
            mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc, 3);
            if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu != null) {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu.qdl(4);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, int i2) {
            String unused = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl;
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).uw = false;
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.removeCallbacks(qdl.this.wak);
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.10
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd != null) {
                        ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd.ud();
                    }
                }
            });
            mzz.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc, 0);
            if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu != null) {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu.qdl(5);
            }
        }

        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.qdl.InterfaceC0057qdl
        public void qdl(final com.bykv.vk.openvk.qdl.qdl.qdl.qdl qdlVar, long j, long j2) {
            long j3;
            long j4;
            mml mmlVarQdl;
            if (Math.abs(j - ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).tvp) < 50) {
                return;
            }
            if (!((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).aaj.get()) {
                qdl.this.koa();
            }
            qdl qdlVar2 = qdl.this;
            qdlVar2.qdl(qdlVar2.gy);
            qdl.this.qdl(j, j2);
            qdl.this.ud(j, j2);
            com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc.zm();
            if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
                j3 = j;
                j4 = j2;
            } else {
                j3 = j;
                j4 = j2;
                mmlVarQdl.qdl(j3, j4, ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).vu);
            }
            if (!this.ud || j4 - j3 >= 500) {
                return;
            }
            this.ud = false;
            ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).lnr.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.1.2
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.qdl(qdlVar);
                }
            }, 1000L);
        }

        @Override // com.bytedance.sdk.openadsdk.core.exu.mml.lnr.ud
        public void qdl(int i2, int i3) {
            qdl.this.wc();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.exu.mml.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0111qdl {
        void qdl(int i2);
    }

    public qdl(Context context, ViewGroup viewGroup, ljh ljhVar, wd wdVar) {
        super(context, ljhVar, viewGroup);
        this.ax = 0L;
        this.ag = 0L;
        this.wc = false;
        this.hzv = 0L;
        this.fco = false;
        this.cx = new AtomicBoolean(false);
        this.mrf = new AnonymousClass1();
        this.wak = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).koa != null) {
                    qdl.this.jtx();
                    ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).koa.qdl();
                }
            }
        };
        this.gy = wdVar;
        this.om = ljhVar.fz();
        if (ljhVar.qh() && this.xmv != null) {
            if (this.vu == null) {
                this.vu = mo.qdl();
            }
            this.vu.qdl(this.xmv, ljhVar);
        }
        com.bytedance.sdk.openadsdk.core.exu.ud.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.exu.ud.mzz(context.getApplicationContext(), new rdp(context), true, 17, this.jpc, this);
        this.wd = mzzVar;
        mzzVar.qdl(this);
    }

    public void jtx() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.qdl.qdl
    public boolean uw() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cx() {
        int iXi;
        int i2 = this.bch.mo;
        if (i2 == 2 || i2 == 1) {
            iXi = yt.mml().xi() * 1000;
        } else {
            iXi = i2 == 4 ? yt.mml().tvp(String.valueOf(this.om)) : 5000;
        }
        this.lnr.removeCallbacks(this.wak);
        this.lnr.postDelayed(this.wak, iXi);
    }

    private boolean gt() {
        return gy() == null || this.mo == null || (!com.bytedance.sdk.openadsdk.core.rq.mml.qdl(this.jpc.ra()) ? this.jpc.xdk() != null : this.jpc.kr() != null) || this.jpc.gg() == 1;
    }

    private void om() {
        this.mo.lnr(ekw());
        this.mo.qdl(this.bch);
        this.ax = System.currentTimeMillis();
        this.wd.lnr(8);
        this.wd.lnr(0);
        qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).mo == null) {
                    return;
                }
                qdl.this.ax = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd.mml(0);
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).mo.qdl(true, ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).tvp, ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jtx);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean wak() {
        return this.jpc.nv() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wc() {
        ud(this.gy);
        this.bch.mzz = this.mo.aaj();
        if (ljh.mo(this.jpc)) {
            com.bytedance.sdk.openadsdk.yt.lnr.qdl(new com.bytedance.sdk.openadsdk.yt.mml() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.2
                @Override // com.bytedance.sdk.openadsdk.yt.mml
                public com.bytedance.sdk.openadsdk.yt.ud.qdl generatorModel() {
                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                    try {
                        qdlVar.ud("video_player");
                        qdlVar.mml(gy.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).jpc));
                        qdlVar.qdl(BuildConfig.VERSION_NAME);
                    } catch (Throwable unused) {
                    }
                    return qdlVar;
                }
            });
        }
        kdv();
        this.aaj.set(false);
        this.cx.set(false);
        qdl(this.gy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yh() {
        if (this.wd == null) {
            return;
        }
        this.lnr.removeCallbacks(this.wak);
        this.wd.ud();
        this.ag = System.currentTimeMillis() - this.ax;
        if (!this.wc) {
            this.wc = true;
            long j = this.ekw;
            ud(j, j);
            long j2 = this.ekw;
            this.tvp = j2;
            this.to = j2;
            ud(this.gy);
        }
        com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr.qdl qdlVar = this.koa;
        if (qdlVar != null) {
            qdlVar.qdl(this.ag, com.bykv.vk.openvk.qdl.qdl.ud.mml.qdl.qdl(this.tvp, this.ekw));
        }
        this.rdp = true;
    }

    public void ag() {
        mo moVar = this.vu;
        if (moVar != null) {
            moVar.qdl(13);
        }
    }

    public void ax() {
        mo moVar = this.vu;
        if (moVar != null) {
            moVar.qdl(2);
        }
    }

    public void fco() {
        this.mrf.qdl((com.bykv.vk.openvk.qdl.qdl.qdl.qdl) null, 0, 0);
    }

    public com.bykv.vk.openvk.qdl.qdl.qdl.mo.ud gy() {
        com.bytedance.sdk.openadsdk.core.exu.ud.mzz mzzVar = this.wd;
        if (mzzVar != null) {
            return mzzVar.exu();
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void mml() {
        lnr lnrVar = this.mo;
        if (lnrVar == null) {
            return;
        }
        lnrVar.fs();
        this.mo = null;
        com.bytedance.sdk.openadsdk.core.exu.ud.mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.tvp();
        }
        this.lnr.removeCallbacks(this.wak);
        this.lnr.removeCallbacksAndMessages(null);
        mo moVar = this.vu;
        if (moVar != null) {
            moVar.mml();
        }
    }

    public void mo(boolean z2) {
        this.yh = z2;
    }

    public void mrf() {
        mml mmlVarQdl;
        if (this.wc || !this.aaj.get()) {
            return;
        }
        vu();
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = this.jpc.zm();
        if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
            return;
        }
        mmlVarQdl.lnr(mo());
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void mzz() {
        mml();
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void lnr() {
        mml mmlVarQdl;
        com.bytedance.sdk.openadsdk.core.exu.ud.mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.qdl();
            this.wd.bjy();
            this.wd.jl();
        }
        lnr lnrVar = this.mo;
        if (lnrVar != null) {
            if (lnrVar.wd()) {
                if (this.exu) {
                    if (com.bytedance.sdk.openadsdk.core.tvp.oth()) {
                        this.mo.ud(3);
                        lnr lnrVar2 = this.mo;
                        lnrVar2.qdl(false, lnrVar2.yt(), this.jtx);
                    } else {
                        aaj();
                    }
                } else {
                    ud(this.hkc);
                }
            } else {
                this.mo.qdl(false, this.tvp, this.jtx);
            }
        }
        if (this.wc || !this.aaj.get()) {
            return;
        }
        vu();
        com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = this.jpc.zm();
        if (mmlVarZm == null || (mmlVarQdl = mmlVarZm.qdl()) == null) {
            return;
        }
        mmlVarQdl.lnr(mo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    public void ud(float f, float f2) {
        Throwable th;
        float f3;
        float f4;
        float f5;
        float f6;
        try {
            Objects.toString(this.jpc.ji());
            if (gt()) {
                return;
            }
            int[] iArrUd = ax.ud(yt.qdl());
            boolean z2 = false;
            boolean z3 = this.jpc.jb() == 1;
            float f7 = iArrUd[0];
            float f8 = iArrUd[1];
            try {
                if (!z3) {
                    f3 = f;
                    f4 = f2;
                    if (f3 < f4) {
                        qdl(f7, f8, f3, f4, false);
                        return;
                    }
                } else if (f > f2) {
                    try {
                        qdl(f7, f8, f, f2, true);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    f3 = f;
                    f4 = f2;
                }
                float f9 = f3 / f4;
                float f10 = f7 / f8;
                if (z3) {
                    if (f10 >= 0.5625f || f9 != 0.5625f) {
                        f6 = f3;
                        f5 = f4;
                    } else {
                        f6 = (f8 * 9.0f) / 16.0f;
                        z2 = true;
                        f5 = f8;
                    }
                } else if (f10 <= 1.7777778f || f9 != 1.7777778f) {
                    f6 = f3;
                    f5 = f4;
                } else {
                    f5 = (f7 * 9.0f) / 16.0f;
                    z2 = true;
                    f6 = f7;
                }
                if (z2) {
                    f7 = f6;
                    f8 = f5;
                }
                int i2 = (int) f7;
                int i3 = (int) f8;
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i3);
                layoutParams.addRule(13);
                if (gy() != null) {
                    if (gy() instanceof TextureView) {
                        ((TextureView) gy()).setLayoutParams(layoutParams);
                    } else if (gy() instanceof SurfaceView) {
                        ((SurfaceView) gy()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.xmv.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = i3;
                        layoutParams2.width = i2;
                        this.xmv.setLayoutParams(layoutParams2);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        com.bytedance.sdk.component.utils.aaj.qdl(this.qdl, "changeSize error", th);
    }

    public void qdl(boolean z2, float f, float f2) {
        try {
            Objects.toString(this.jpc.ji());
            if (!gt() || z2) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                layoutParams.addRule(13);
                if (gy() != null) {
                    if (gy() instanceof TextureView) {
                        ((TextureView) gy()).setLayoutParams(layoutParams);
                    } else if (gy() instanceof SurfaceView) {
                        ((SurfaceView) gy()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.xmv.getLayoutParams();
                    if (this.xmv.getHeight() > 0) {
                        float fMin = Math.min(this.xmv.getWidth() / f, this.xmv.getHeight() / f2);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f * fMin);
                            layoutParams.height = (int) (f2 * fMin);
                            if (gy() instanceof TextureView) {
                                ((TextureView) gy()).setLayoutParams(layoutParams);
                            } else if (gy() instanceof SurfaceView) {
                                ((SurfaceView) gy()).setLayoutParams(layoutParams);
                            }
                            if (this.bch.mo == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.xmv.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.qdl(this.qdl, "changeSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(float f, float f2) {
        try {
            if (gy() != null && this.mo != null) {
                boolean z2 = this.jpc.jb() == 1;
                int[] iArrUd = ax.ud(yt.qdl());
                qdl(iArrUd[0], iArrUd[1], f, f2, z2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(final long j, final long j2) {
        this.jpc.lnr(j);
        this.tvp = j;
        this.ekw = j2;
        final int iQdl = com.bykv.vk.openvk.qdl.qdl.ud.mml.qdl.qdl(j, j2);
        this.lnr.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.exu.mml.qdl.5
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd.qdl(j, j2);
                ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).wd.qdl(iQdl);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).koa != null) {
                        ((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).koa.qdl(j, j2);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.aaj.qdl(((com.bytedance.sdk.openadsdk.core.exu.qdl.qdl) qdl.this).qdl, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.exu.qdl.qdl, com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public boolean qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar) {
        int iWs;
        super.qdl(lnrVar);
        if (this.mo != null) {
            return false;
        }
        lnrVar.jtx();
        if (TextUtils.isEmpty(lnrVar.jtx())) {
            return false;
        }
        lnrVar.ud(com.bytedance.sdk.openadsdk.jyq.qdl.qdl("player_force_raw_url", 0) == 1);
        ud(lnrVar);
        lnrVar.mml(1);
        this.fco = !lnrVar.jtx().startsWith("http");
        if (this.vu != null) {
            if (this.bch.mo == 1) {
                iWs = this.jpc.qg();
            } else {
                iWs = this.jpc.ws();
            }
            if (this.xmv != null) {
                try {
                    int iOk = this.jpc.ok();
                    if (iOk == 7 || iOk == 8) {
                        View viewQdl = ag.qdl(this.xmv, (Class<? extends View>) com.bytedance.sdk.openadsdk.component.reward.view.tvp.class);
                        if (viewQdl != null) {
                            View viewFindViewById = viewQdl.findViewById(jtx.fs);
                            View viewFindViewById2 = viewQdl.findViewById(jtx.uj);
                            View viewFindViewById3 = viewQdl.findViewById(jtx.fc);
                            mo moVar = this.vu;
                            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                            moVar.qdl(viewFindViewById2, friendlyObstructionPurpose);
                            this.vu.qdl(viewFindViewById, friendlyObstructionPurpose);
                            this.vu.qdl(viewFindViewById3, friendlyObstructionPurpose);
                            if (this.yh) {
                                View viewQdl2 = ag.qdl(this.xmv, (Class<? extends View>) com.bytedance.sdk.openadsdk.core.rq.ud.mzz.qdl.class);
                                if (viewQdl2 instanceof com.bytedance.sdk.openadsdk.core.rq.ud.mzz.qdl) {
                                    this.vu.qdl(((com.bytedance.sdk.openadsdk.core.rq.ud.mzz.qdl) viewQdl2).getMarkView(), friendlyObstructionPurpose);
                                }
                            }
                        }
                        Iterator<View> it = ag.qdl(this.xmv, 1).iterator();
                        while (it.hasNext()) {
                            this.vu.qdl(it.next(), FriendlyObstructionPurpose.OTHER);
                        }
                    } else if (iOk == 3) {
                        Iterator<View> it2 = ag.qdl(this.xmv, 2).iterator();
                        while (it2.hasNext()) {
                            this.vu.qdl(it2.next(), FriendlyObstructionPurpose.OTHER);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            this.vu.qdl(iWs > 0, iWs / 1000.0f);
        }
        kdv();
        if (lnrVar.to() > 0) {
            long j = lnrVar.to();
            this.tvp = j;
            this.to = Math.max(this.to, j);
        }
        if (this.tvp == this.ekw) {
            this.tvp = 0L;
        }
        com.bytedance.sdk.openadsdk.core.exu.ud.mzz mzzVar = this.wd;
        if (mzzVar != null) {
            mzzVar.qdl();
            this.wd.wd();
            this.wd.lnr(lnrVar.jpc(), lnrVar.tvp());
            this.wd.lnr(this.xmv);
        }
        lnr lnrVar2 = new lnr();
        this.mo = lnrVar2;
        lnrVar2.qdl(this.mrf);
        jl();
        this.ag = 0L;
        om();
        return true;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void qdl(boolean z2, int i2) {
        mml();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(float f, float f2) {
        ViewGroup viewGroup;
        try {
            if (gy() != null && this.mo != null && (viewGroup = this.xmv) != null) {
                float width = viewGroup.getWidth();
                float f3 = f / (width * 1.0f);
                float height = this.xmv.getHeight();
                if (f3 <= f2 / (1.0f * height)) {
                    width = (height / f2) * f;
                } else {
                    height = (width / f) * f2;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (gy() instanceof TextureView) {
                    ((TextureView) gy()).setLayoutParams(layoutParams);
                } else if (gy() instanceof SurfaceView) {
                    ((SurfaceView) gy()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.aaj.qdl(this.qdl, "changeVideoSizeSupportInteraction error", th);
        }
    }

    private void qdl(float f, float f2, float f3, float f4, boolean z2) {
        RelativeLayout.LayoutParams layoutParams;
        if (f3 <= 0.0f || f4 <= 0.0f) {
            try {
                f3 = this.jpc.tdy().lnr();
                f4 = this.jpc.tdy().ud();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f4 > 0.0f && f3 > 0.0f) {
            if (z2) {
                if (f3 < f4) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
            } else if (f3 > f4) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
            }
            layoutParams.addRule(13);
            if (gy() != null) {
                if (gy() instanceof TextureView) {
                    ((TextureView) gy()).setLayoutParams(layoutParams);
                } else if (gy() instanceof SurfaceView) {
                    ((SurfaceView) gy()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.xmv.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.mml.ud.qdl(yt.qdl()) || this.xmv.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.xmv.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.qdl
    public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.mml.ud udVar, View view) {
        lnr lnrVar = this.mo;
        if (lnrVar == null) {
            return;
        }
        if (lnrVar.mo()) {
            ud();
            this.wd.ud(true, false);
            this.wd.mo();
            return;
        }
        if (!this.mo.wd()) {
            com.bytedance.sdk.openadsdk.core.exu.ud.mzz mzzVar = this.wd;
            if (mzzVar != null) {
                mzzVar.lnr(this.xmv);
            }
            mzz(this.tvp);
            com.bytedance.sdk.openadsdk.core.exu.ud.mzz mzzVar2 = this.wd;
            if (mzzVar2 != null) {
                mzzVar2.ud(false, false);
                return;
            }
            return;
        }
        lnr();
        com.bytedance.sdk.openadsdk.core.exu.ud.mzz mzzVar3 = this.wd;
        if (mzzVar3 != null) {
            mzzVar3.ud(false, false);
        }
    }

    public void qdl(InterfaceC0111qdl interfaceC0111qdl) {
        this.gt = interfaceC0111qdl;
    }

    @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mml.lnr
    public void qdl() {
        if (this.mo != null) {
            wc();
            this.mo.tvp();
        }
    }
}
