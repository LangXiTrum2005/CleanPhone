package com.bytedance.sdk.component.ebl;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.OY;
import com.bytedance.sdk.component.ebl.LD.ZU;
import com.bytedance.sdk.component.ebl.ZU.lk;
import com.bytedance.sdk.component.ebl.lk.ebl;
import com.bytedance.sdk.component.utils.kqm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private ebl LD;
    private JVA Lxb;
    private int lk;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ebl.Lxb$Lxb, reason: collision with other inner class name */
    public static final class C0062Lxb {
        private Bundle ebl;
        private Set<String> lc;
        boolean ZU = true;
        final List<OY> JXs = new ArrayList();
        int Lxb = 10000;
        int LD = 10000;
        int lk = 10000;

        public C0062Lxb lk(long j, TimeUnit timeUnit) {
            this.lk = Lxb("timeout", j, timeUnit);
            return this;
        }

        public C0062Lxb LD(long j, TimeUnit timeUnit) {
            this.LD = Lxb("timeout", j, timeUnit);
            return this;
        }

        public C0062Lxb Lxb(long j, TimeUnit timeUnit) {
            this.Lxb = Lxb("timeout", j, timeUnit);
            return this;
        }

        public C0062Lxb Lxb(boolean z) {
            this.ZU = z;
            return this;
        }

        private static int Lxb(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException(DM.h(str, " < 0"));
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(DM.h(str, " too large."));
                }
                if (millis != 0 || j <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(DM.h(str, " too small."));
            }
            throw new NullPointerException("unit == null");
        }

        public Lxb Lxb() {
            return new Lxb(this);
        }
    }

    public JVA JXs() {
        return this.Lxb;
    }

    public ZU LD() {
        return new ZU(this.Lxb);
    }

    public void Lxb(Context context, boolean z, com.bytedance.sdk.component.ebl.lk.LD ld) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        }
        if (ld == null) {
            throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
        }
        int iLxb = ld.Lxb();
        this.lk = iLxb;
        ebl eblVar = this.LD;
        if (eblVar != null) {
            eblVar.Lxb(iLxb);
        }
        com.bytedance.sdk.component.ebl.lk.OY.Lxb().Lxb(this.lk).Lxb(z);
        com.bytedance.sdk.component.ebl.lk.OY.Lxb().Lxb(this.lk).Lxb(ld);
        com.bytedance.sdk.component.ebl.lk.OY.Lxb().Lxb(this.lk).Lxb(context, kqm.Lxb(context));
    }

    public com.bytedance.sdk.component.ebl.LD.Lxb ZU() {
        return new com.bytedance.sdk.component.ebl.LD.Lxb(this.Lxb);
    }

    public com.bytedance.sdk.component.ebl.LD.LD lk() {
        return new com.bytedance.sdk.component.ebl.LD.LD(this.Lxb);
    }

    private Lxb(C0062Lxb c0062Lxb) {
        JVA.Lxb lxb = new JVA.Lxb();
        long j = c0062Lxb.Lxb;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        JVA.Lxb lxbLD = lxb.Lxb(j, timeUnit).lk(c0062Lxb.lk, timeUnit).LD(c0062Lxb.LD, timeUnit);
        if (c0062Lxb.ZU) {
            ebl eblVar = new ebl();
            this.LD = eblVar;
            lxbLD.Lxb(eblVar);
        }
        List<OY> list = c0062Lxb.JXs;
        if (list != null && list.size() > 0) {
            Iterator<OY> it = c0062Lxb.JXs.iterator();
            while (it.hasNext()) {
                lxbLD.Lxb(it.next());
            }
        }
        if (c0062Lxb.ebl != null) {
            Bundle unused = c0062Lxb.ebl;
        }
        Set unused2 = c0062Lxb.lc;
        this.Lxb = lxbLD.Lxb();
    }

    public void Lxb(Context context, boolean z) {
        com.bytedance.sdk.component.ebl.lk.Lxb.LD(true);
        if (Lxb(context) || (!kqm.Lxb(context) && z)) {
            com.bytedance.sdk.component.ebl.lk.OY.Lxb().Lxb(this.lk, context).ZU();
            com.bytedance.sdk.component.ebl.lk.OY.Lxb().Lxb(this.lk, context).Lxb();
        }
        if (kqm.Lxb(context)) {
            com.bytedance.sdk.component.ebl.lk.OY.Lxb().Lxb(this.lk, context).ZU();
            com.bytedance.sdk.component.ebl.lk.OY.Lxb().Lxb(this.lk, context).Lxb();
        }
    }

    public static void Lxb() {
        lk.Lxb(lk.Lxb.DEBUG);
    }

    private static boolean Lxb(Context context) {
        String strLD = kqm.LD(context);
        if (strLD != null) {
            return strLD.endsWith(":push") || strLD.endsWith(":pushservice");
        }
        return false;
    }
}
