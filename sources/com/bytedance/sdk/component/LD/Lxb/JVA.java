package com.bytedance.sdk.component.LD.Lxb;

import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JVA implements Cloneable {
    public TimeUnit JXs;
    public long LD;
    public List<OY> Lxb;
    public long ZU;
    public TimeUnit ebl;
    public long lc;
    public TimeUnit lk;

    public JVA(Lxb lxb) {
        this.LD = lxb.LD;
        this.ZU = lxb.ZU;
        this.lc = lxb.lc;
        List<OY> list = lxb.Lxb;
        this.lk = lxb.lk;
        this.JXs = lxb.JXs;
        this.ebl = lxb.ebl;
        this.Lxb = list;
    }

    public Lxb LD() {
        return new Lxb(this);
    }

    public abstract LD Lxb(NXR nxr);

    public abstract ZU Lxb();

    public static final class Lxb {
        public TimeUnit JXs;
        public long LD;
        public final List<OY> Lxb;
        public long ZU;
        public TimeUnit ebl;
        public long lc;
        public TimeUnit lk;

        public Lxb() {
            this.Lxb = new ArrayList();
            this.LD = WorkRequest.MIN_BACKOFF_MILLIS;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.lk = timeUnit;
            this.ZU = WorkRequest.MIN_BACKOFF_MILLIS;
            this.JXs = timeUnit;
            this.lc = WorkRequest.MIN_BACKOFF_MILLIS;
            this.ebl = timeUnit;
        }

        public Lxb LD(long j, TimeUnit timeUnit) {
            this.ZU = j;
            this.JXs = timeUnit;
            return this;
        }

        public Lxb Lxb(long j, TimeUnit timeUnit) {
            this.LD = j;
            this.lk = timeUnit;
            return this;
        }

        public Lxb lk(long j, TimeUnit timeUnit) {
            this.lc = j;
            this.ebl = timeUnit;
            return this;
        }

        public Lxb Lxb(OY oy) {
            this.Lxb.add(oy);
            return this;
        }

        public JVA Lxb() {
            return com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb.Lxb(this);
        }

        public Lxb(String str) {
            this.Lxb = new ArrayList();
            this.LD = WorkRequest.MIN_BACKOFF_MILLIS;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.lk = timeUnit;
            this.ZU = WorkRequest.MIN_BACKOFF_MILLIS;
            this.JXs = timeUnit;
            this.lc = WorkRequest.MIN_BACKOFF_MILLIS;
            this.ebl = timeUnit;
        }

        public Lxb(JVA jva) {
            this.Lxb = new ArrayList();
            this.LD = WorkRequest.MIN_BACKOFF_MILLIS;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.lk = timeUnit;
            this.ZU = WorkRequest.MIN_BACKOFF_MILLIS;
            this.JXs = timeUnit;
            this.lc = WorkRequest.MIN_BACKOFF_MILLIS;
            this.ebl = timeUnit;
            this.LD = jva.LD;
            this.lk = jva.lk;
            this.ZU = jva.ZU;
            this.JXs = jva.JXs;
            this.lc = jva.lc;
            this.ebl = jva.ebl;
        }
    }
}
