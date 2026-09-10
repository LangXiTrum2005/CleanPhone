package com.bytedance.adsdk.LD.Lxb.LD;

import android.view.animation.Interpolator;
import com.bytedance.component.sdk.annotation.FloatRange;
import com.google.android.material.color.utilities.Contrast;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb<K, A> {
    private final lk<K> JXs;
    protected com.bytedance.adsdk.LD.ebl.LD<A> lk;
    final List<InterfaceC0024Lxb> Lxb = new ArrayList(1);
    private boolean ZU = false;
    protected float LD = 0.0f;
    private A lc = null;
    private float ebl = -1.0f;
    private float OY = -1.0f;

    public static final class JXs<T> implements lk<T> {
        private float LD = -1.0f;
        private final com.bytedance.adsdk.LD.ebl.Lxb<T> Lxb;

        public JXs(List<? extends com.bytedance.adsdk.LD.ebl.Lxb<T>> list) {
            this.Lxb = list.get(0);
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public com.bytedance.adsdk.LD.ebl.Lxb<T> LD() {
            return this.Lxb;
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public boolean Lxb() {
            return false;
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public float ZU() {
            return this.Lxb.ZU();
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public float lk() {
            return this.Lxb.lk();
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public boolean LD(float f) {
            if (this.LD == f) {
                return true;
            }
            this.LD = f;
            return false;
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public boolean Lxb(float f) {
            return !this.Lxb.JXs();
        }
    }

    public static final class LD<T> implements lk<T> {
        private LD() {
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public com.bytedance.adsdk.LD.ebl.Lxb<T> LD() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public boolean Lxb() {
            return true;
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public float ZU() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public float lk() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public boolean LD(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public boolean Lxb(float f) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.LD.Lxb.LD.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0024Lxb {
        void Lxb();
    }

    public static final class ZU<T> implements lk<T> {
        private final List<? extends com.bytedance.adsdk.LD.ebl.Lxb<T>> Lxb;
        private com.bytedance.adsdk.LD.ebl.Lxb<T> lk = null;
        private float ZU = -1.0f;
        private com.bytedance.adsdk.LD.ebl.Lxb<T> LD = lk(0.0f);

        public ZU(List<? extends com.bytedance.adsdk.LD.ebl.Lxb<T>> list) {
            this.Lxb = list;
        }

        private com.bytedance.adsdk.LD.ebl.Lxb<T> lk(float f) {
            com.bytedance.adsdk.LD.ebl.Lxb<T> lxb = (com.bytedance.adsdk.LD.ebl.Lxb) DM.f(this.Lxb, 1);
            if (f >= lxb.lk()) {
                return lxb;
            }
            for (int size = this.Lxb.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.LD.ebl.Lxb<T> lxb2 = this.Lxb.get(size);
                if (this.LD != lxb2 && lxb2.Lxb(f)) {
                    return lxb2;
                }
            }
            return this.Lxb.get(0);
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public com.bytedance.adsdk.LD.ebl.Lxb<T> LD() {
            return this.LD;
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public boolean Lxb() {
            return false;
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public float ZU() {
            return ((com.bytedance.adsdk.LD.ebl.Lxb) DM.f(this.Lxb, 1)).ZU();
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public boolean LD(float f) {
            com.bytedance.adsdk.LD.ebl.Lxb<T> lxb = this.lk;
            com.bytedance.adsdk.LD.ebl.Lxb<T> lxb2 = this.LD;
            if (lxb == lxb2 && this.ZU == f) {
                return true;
            }
            this.lk = lxb2;
            this.ZU = f;
            return false;
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public boolean Lxb(float f) {
            if (this.LD.Lxb(f)) {
                return !this.LD.JXs();
            }
            this.LD = lk(f);
            return true;
        }

        @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.lk
        public float lk() {
            return this.Lxb.get(0).lk();
        }
    }

    public interface lk<T> {
        com.bytedance.adsdk.LD.ebl.Lxb<T> LD();

        boolean LD(float f);

        boolean Lxb();

        boolean Lxb(float f);

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float ZU();

        @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
        float lk();
    }

    public Lxb(List<? extends com.bytedance.adsdk.LD.ebl.Lxb<K>> list) {
        this.JXs = Lxb(list);
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    private float QAg() {
        if (this.ebl == -1.0f) {
            this.ebl = this.JXs.lk();
        }
        return this.ebl;
    }

    public float JXs() {
        com.bytedance.adsdk.LD.ebl.Lxb<K> lxbLk = lk();
        if (lxbLk == null || lxbLk.JXs()) {
            return 0.0f;
        }
        return lxbLk.lk.getInterpolation(ZU());
    }

    public void LD() {
        for (int i = 0; i < this.Lxb.size(); i++) {
            this.Lxb.get(i).Lxb();
        }
    }

    public abstract A Lxb(com.bytedance.adsdk.LD.ebl.Lxb<K> lxb, float f);

    public void Lxb() {
        this.ZU = true;
    }

    public float OY() {
        return this.LD;
    }

    public float ZU() {
        if (this.ZU) {
            return 0.0f;
        }
        com.bytedance.adsdk.LD.ebl.Lxb<K> lxbLk = lk();
        if (lxbLk.JXs()) {
            return 0.0f;
        }
        return (this.LD - lxbLk.lk()) / (lxbLk.ZU() - lxbLk.lk());
    }

    public A ebl() {
        float fZU = ZU();
        if (this.lk == null && this.JXs.LD(fZU)) {
            return this.lc;
        }
        com.bytedance.adsdk.LD.ebl.Lxb<K> lxbLk = lk();
        Interpolator interpolator = lxbLk.ZU;
        A aLxb = (interpolator == null || lxbLk.JXs == null) ? Lxb(lxbLk, JXs()) : Lxb(lxbLk, fZU, interpolator.getInterpolation(fZU), lxbLk.JXs.getInterpolation(fZU));
        this.lc = aLxb;
        return aLxb;
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float lc() {
        if (this.OY == -1.0f) {
            this.OY = this.JXs.ZU();
        }
        return this.OY;
    }

    public com.bytedance.adsdk.LD.ebl.Lxb<K> lk() {
        com.bytedance.adsdk.LD.JXs.Lxb("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.LD.ebl.Lxb<K> lxbLD = this.JXs.LD();
        com.bytedance.adsdk.LD.JXs.LD("BaseKeyframeAnimation#getCurrentKeyframe");
        return lxbLD;
    }

    public void Lxb(InterfaceC0024Lxb interfaceC0024Lxb) {
        this.Lxb.add(interfaceC0024Lxb);
    }

    public void Lxb(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        if (this.JXs.Lxb()) {
            return;
        }
        if (f < QAg()) {
            f = QAg();
        } else if (f > lc()) {
            f = lc();
        }
        if (f == this.LD) {
            return;
        }
        this.LD = f;
        if (this.JXs.Lxb(f)) {
            LD();
        }
    }

    public A Lxb(com.bytedance.adsdk.LD.ebl.Lxb<K> lxb, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> lk<T> Lxb(List<? extends com.bytedance.adsdk.LD.ebl.Lxb<T>> list) {
        if (list.isEmpty()) {
            return new LD();
        }
        if (list.size() == 1) {
            return new JXs(list);
        }
        return new ZU(list);
    }
}
