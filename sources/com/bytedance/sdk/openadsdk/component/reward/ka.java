package com.bytedance.sdk.openadsdk.component.reward;

import android.graphics.SurfaceTexture;
import android.os.CountDownTimer;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import euthanasia.attabal;
import euthanasia.saneness;
import logician.dern;

/* JADX INFO: loaded from: classes2.dex */
public class ka implements attabal {
    private final canonical.attabal ik;
    private final wjv lr;
    private com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri mj;
    private final ri ri;
    private long xha;
    private boolean ka = true;
    private long fi = 0;
    private boolean di = false;

    public static class ri implements dern {
        private CountDownTimer di;
        private int fi = 0;
        private final com.bytedance.sdk.openadsdk.ka.xha ik;
        private long jbs;
        private long ka;
        private final canonical.attabal lr;
        private long mj;
        private final long ri;
        private attabal.wireman xha;

        public ri(long j, canonical.attabal attabalVar, com.bytedance.sdk.openadsdk.ka.xha xhaVar) {
            this.ri = j;
            this.lr = attabalVar;
            this.ik = xhaVar;
        }

        public void aw() {
            this.fi = 0;
            CountDownTimer countDownTimer = this.di;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.di = null;
            }
            if (this.xha != null) {
                this.xha = null;
            }
        }

        public long bgr() {
            return 0L;
        }

        public long bu() {
            return this.mj;
        }

        public void co() {
            this.fi = 2;
            this.ka = this.mj;
            CountDownTimer countDownTimer = this.di;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.di = null;
            }
        }

        @Override // logician.dern
        public int fi() {
            return 0;
        }

        @Override // logician.dern
        public boolean ik() {
            return false;
        }

        public long jbs() {
            return this.jbs;
        }

        @Override // logician.dern
        public int ka() {
            return 0;
        }

        @Override // logician.dern
        public boolean mj() {
            return this.fi == 0;
        }

        public void qt() {
            this.mj = 0L;
            sf();
        }

        @Override // logician.dern
        public boolean ri() {
            return false;
        }

        public void sf() {
            if (this.fi == 1) {
                return;
            }
            this.fi = 1;
            final long jSlm = slm();
            if (this.ka >= jSlm) {
                this.ka = 0L;
            }
            final long j = jSlm - this.ka;
            CountDownTimer countDownTimer = new CountDownTimer(j, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.ka.ri.1
                @Override // android.os.CountDownTimer
                public void onFinish() {
                    if (ri.this.xha != null) {
                        attabal.wireman wiremanVar = ri.this.xha;
                        long j2 = jSlm;
                        wiremanVar.ri(j2, j2);
                    }
                    ri.this.fi = 4;
                    ri.this.mj = jSlm;
                    ri.this.ka = jSlm;
                    if (ri.this.xha != null) {
                        ri.this.xha.ri(ri.this.bu(), 100);
                    }
                    com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri riVar = new com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri();
                    riVar.lr(jSlm);
                    riVar.ka(jSlm);
                    riVar.ik(ri.this.bgr());
                    riVar.ka(ri.this.vr());
                    riVar.ri(ri.this.jbs());
                    com.bytedance.sdk.openadsdk.ka.fi.ri.ri.lr(ri.this.lr, riVar, ri.this.ik);
                }

                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    long j3 = (j - j2) + ri.this.ka;
                    ri.this.mj = j3;
                    if (ri.this.xha != null) {
                        ri.this.xha.ri(j3, jSlm);
                    }
                }
            };
            this.di = countDownTimer;
            countDownTimer.start();
        }

        public long slm() {
            return this.ri;
        }

        public int vr() {
            return 0;
        }

        @Override // logician.dern
        public boolean xha() {
            return this.fi == 2;
        }

        @Override // logician.dern
        public boolean di() {
            return this.fi == 1;
        }

        @Override // logician.dern
        public boolean lr() {
            return this.fi == 4;
        }

        public void lr(long j) {
            this.ka = j;
        }

        public void ri(long j) {
            this.jbs = j;
        }

        public void ri(attabal.wireman wiremanVar) {
            this.xha = wiremanVar;
        }
    }

    public ka(wjv wjvVar, com.bytedance.sdk.openadsdk.ka.xha xhaVar) {
        canonical.attabal attabalVar = new canonical.attabal() { // from class: com.bytedance.sdk.openadsdk.component.reward.ka.1
        };
        this.ik = attabalVar;
        this.lr = wjvVar;
        com.bykv.vk.openvk.ri.ri.ri.ik.attabal attabalVarEu = wjvVar.eu();
        long j = 10;
        long jBeachfront = attabalVarEu != null ? (long) attabalVarEu.beachfront() : 10L;
        if (jBeachfront <= 0) {
            attabalVarEu.oilcan(10.0d);
        } else {
            j = jBeachfront;
        }
        this.ri = new ri(j * 1000, attabalVar, xhaVar);
    }

    @Override // euthanasia.attabal
    public boolean aw() {
        return this.ri.lr();
    }

    @Override // euthanasia.attabal
    public boolean bgr() {
        return false;
    }

    public canonical.attabal bu() {
        return this.ik;
    }

    @Override // euthanasia.attabal
    public saneness co() {
        return null;
    }

    @Override // euthanasia.attabal
    public long di() {
        return this.ri.bu();
    }

    @Override // euthanasia.attabal
    public void fi() {
        ka();
    }

    @Override // euthanasia.attabal
    public void ik() {
        this.ri.sf();
        com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri riVar = new com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri();
        riVar.lr(di());
        riVar.ka(jbs());
        riVar.ik(xha());
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.lr(this.ik, riVar);
        com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri interfaceC0235ri = this.mj;
        if (interfaceC0235ri != null) {
            interfaceC0235ri.ri(1);
        }
    }

    @Override // euthanasia.attabal
    public long jbs() {
        return this.ri.slm();
    }

    @Override // euthanasia.attabal
    public void ka() {
        this.ri.aw();
    }

    @Override // euthanasia.attabal
    public void lr() {
        this.ri.co();
        com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri riVar = new com.bytedance.sdk.openadsdk.ka.fi.lr.vr.ri();
        riVar.lr(di());
        riVar.ka(jbs());
        riVar.ik(xha());
        riVar.ri(slm());
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(this.ik, riVar);
        com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri interfaceC0235ri = this.mj;
        if (interfaceC0235ri != null) {
            interfaceC0235ri.ri(2);
        }
    }

    @Override // euthanasia.attabal
    public int mj() {
        return 0;
    }

    @Override // euthanasia.attabal
    public int qt() {
        return benzoyl.saneness.attabal(this.ri.mj, this.ri.ri);
    }

    @Override // euthanasia.attabal
    public void ri(SurfaceTexture surfaceTexture) {
    }

    @Override // euthanasia.attabal
    public dern sf() {
        return this.ri;
    }

    public long slm() {
        return this.xha;
    }

    @Override // euthanasia.attabal
    public boolean vr() {
        return false;
    }

    @Override // euthanasia.attabal
    public long xha() {
        return 0L;
    }

    @Override // euthanasia.attabal
    public boolean ri(float f) {
        return false;
    }

    @Override // euthanasia.attabal
    public void ri(long j) {
        this.xha = j;
        ri riVar = this.ri;
        if (riVar != null) {
            riVar.ri(j);
        }
    }

    public void ri(boolean z, int i) {
        ka();
    }

    @Override // euthanasia.attabal
    public boolean ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar) {
        this.di = ikVar.sf();
        if (ikVar.qt() > 0) {
            this.ri.lr(ikVar.qt());
        }
        ikVar.lr(com.bytedance.sdk.openadsdk.wjv.fi.ri("player_force_raw_url", 0) == 1);
        com.bytedance.sdk.openadsdk.ka.fi.ri.ri.ri(this.lr, this.ik, ikVar);
        this.ri.sf();
        com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri interfaceC0235ri = this.mj;
        if (interfaceC0235ri != null) {
            interfaceC0235ri.ri(1);
        }
        return true;
    }

    @Override // euthanasia.attabal
    public void ri(boolean z, String str) {
        this.di = z;
    }

    @Override // euthanasia.attabal
    public void ri(attabal.wireman wiremanVar) {
        this.ri.ri(wiremanVar);
    }

    public void ri(com.bytedance.sdk.openadsdk.core.bgr.ka.ri.InterfaceC0235ri interfaceC0235ri) {
        this.mj = interfaceC0235ri;
    }

    @Override // euthanasia.attabal
    public void ri() {
        this.ri.qt();
    }
}
