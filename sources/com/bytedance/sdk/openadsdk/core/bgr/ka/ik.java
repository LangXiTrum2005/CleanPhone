package com.bytedance.sdk.openadsdk.core.bgr.ka;

import curium.saneness;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import logician.dern;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends saneness {
    private final ri ka;
    private final List<lr> ri = Collections.synchronizedList(new ArrayList());
    private int lr = 1;
    private int ik = 1;

    public interface lr extends dern.attabal {
        @Override // logician.dern.attabal
        /* synthetic */ void fi(dern dernVar);

        @Override // logician.dern.attabal
        /* synthetic */ void ik(dern dernVar);

        @Override // logician.dern.attabal
        /* synthetic */ void ka(dern dernVar);

        @Override // logician.dern.attabal
        /* synthetic */ void lr(dern dernVar);

        @Override // logician.dern.attabal
        /* synthetic */ void lr(dern dernVar, int i);

        void ri(int i, int i2);

        @Override // logician.dern.attabal
        /* synthetic */ void ri(dern dernVar);

        @Override // logician.dern.attabal
        /* synthetic */ void ri(dern dernVar, int i);

        @Override // logician.dern.attabal
        /* synthetic */ void ri(dern dernVar, int i, int i2);

        @Override // logician.dern.attabal
        /* synthetic */ void ri(dern dernVar, int i, int i2, int i3);

        @Override // logician.dern.attabal
        /* synthetic */ void ri(dern dernVar, long j);

        @Override // logician.dern.attabal
        /* synthetic */ void ri(dern dernVar, long j, long j2);

        @Override // logician.dern.attabal
        /* synthetic */ void ri(dern dernVar, com.bykv.vk.openvk.ri.ri.ri.ik.saneness sanenessVar);

        @Override // logician.dern.attabal
        /* synthetic */ void ri(dern dernVar, boolean z);
    }

    public ik() {
        ri riVar = new ri();
        this.ka = riVar;
        super.ri(riVar);
        ri(500);
    }

    public static /* synthetic */ int ri(ik ikVar) {
        int i = ikVar.ik;
        ikVar.ik = i + 1;
        return i;
    }

    @Override // curium.saneness
    public long bu() {
        return super.bu() * ((long) this.lr);
    }

    public int ihz() {
        return this.ik;
    }

    @Override // curium.saneness
    public long nr() {
        long jNr = super.nr();
        return this.lr == 1 ? jNr : jNr + (((long) (this.ik - 1)) * super.bu());
    }

    public class ri implements dern.attabal {
        private ri() {
        }

        @Override // logician.dern.attabal
        public void fi(dern dernVar) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).fi(dernVar);
            }
        }

        @Override // logician.dern.attabal
        public void ik(dern dernVar) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).ik(dernVar);
            }
        }

        @Override // logician.dern.attabal
        public void ka(dern dernVar) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).ka(dernVar);
            }
        }

        @Override // logician.dern.attabal
        public void lr(dern dernVar) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).lr(dernVar);
            }
        }

        @Override // logician.dern.attabal
        public void ri(dern dernVar) {
            ik.ri(ik.this);
            if (ik.this.ik > ik.this.lr) {
                Iterator it = ik.this.ri.iterator();
                while (it.hasNext()) {
                    ((lr) it.next()).ri(dernVar);
                }
            } else {
                Iterator it2 = ik.this.ri.iterator();
                while (it2.hasNext()) {
                    ((lr) it2.next()).ri(ik.this.ik, ik.this.lr);
                }
                ik.this.jbs();
            }
        }

        @Override // logician.dern.attabal
        public void lr(dern dernVar, int i) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).lr(dernVar, i);
            }
        }

        @Override // logician.dern.attabal
        public void ri(dern dernVar, long j) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).ri(dernVar, j);
            }
        }

        @Override // logician.dern.attabal
        public void ri(dern dernVar, com.bykv.vk.openvk.ri.ri.ri.ik.saneness sanenessVar) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).ri(dernVar, sanenessVar);
            }
        }

        @Override // logician.dern.attabal
        public void ri(dern dernVar, boolean z) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).ri(dernVar, z);
            }
        }

        @Override // logician.dern.attabal
        public void ri(dern dernVar, int i, int i2) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).ri(dernVar, i, i2);
            }
        }

        @Override // logician.dern.attabal
        public void ri(dern dernVar, int i, int i2, int i3) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).ri(dernVar, i, i2, i3);
            }
        }

        @Override // logician.dern.attabal
        public void ri(dern dernVar, int i) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).ri(dernVar, i);
            }
        }

        @Override // logician.dern.attabal
        public void ri(dern dernVar, long j, long j2) {
            Iterator it = ik.this.ri.iterator();
            while (it.hasNext()) {
                ((lr) it.next()).ri(dernVar, j, j2);
            }
        }
    }

    public void ik(int i) {
        this.lr = Math.max(1, i);
    }

    @Override // curium.saneness
    public void ri(dern.attabal attabalVar) {
        if (!(attabalVar instanceof lr)) {
            super.ri(attabalVar);
        } else {
            if (this.ri.contains(attabalVar)) {
                return;
            }
            this.ri.add((lr) attabalVar);
        }
    }
}
