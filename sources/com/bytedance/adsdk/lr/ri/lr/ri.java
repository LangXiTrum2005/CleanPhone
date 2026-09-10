package com.bytedance.adsdk.lr.ri.lr;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri<K, A> {
    private final ik<K> fi;
    protected com.bytedance.adsdk.lr.xha.lr<A> ik;
    final List<InterfaceC0185ri> ri = new ArrayList(1);
    private boolean ka = false;
    protected float lr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private A di = null;
    private float xha = -1.0f;
    private float mj = -1.0f;

    public static final class fi<T> implements ik<T> {
        private float lr = -1.0f;
        private final com.bytedance.adsdk.lr.xha.ri<T> ri;

        public fi(List<? extends com.bytedance.adsdk.lr.xha.ri<T>> list) {
            this.ri = list.get(0);
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public float ik() {
            return this.ri.ik();
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public float ka() {
            return this.ri.ka();
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public com.bytedance.adsdk.lr.xha.ri<T> lr() {
            return this.ri;
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public boolean ri() {
            return false;
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public boolean lr(float f) {
            if (this.lr == f) {
                return true;
            }
            this.lr = f;
            return false;
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public boolean ri(float f) {
            return !this.ri.fi();
        }
    }

    public interface ik<T> {
        float ik();

        float ka();

        com.bytedance.adsdk.lr.xha.ri<T> lr();

        boolean lr(float f);

        boolean ri();

        boolean ri(float f);
    }

    public static final class ka<T> implements ik<T> {
        private com.bytedance.adsdk.lr.xha.ri<T> ik = null;
        private float ka = -1.0f;
        private com.bytedance.adsdk.lr.xha.ri<T> lr = ik(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        private final List<? extends com.bytedance.adsdk.lr.xha.ri<T>> ri;

        public ka(List<? extends com.bytedance.adsdk.lr.xha.ri<T>> list) {
            this.ri = list;
        }

        private com.bytedance.adsdk.lr.xha.ri<T> ik(float f) {
            List<? extends com.bytedance.adsdk.lr.xha.ri<T>> list = this.ri;
            com.bytedance.adsdk.lr.xha.ri<T> riVar = list.get(list.size() - 1);
            if (f >= riVar.ik()) {
                return riVar;
            }
            for (int size = this.ri.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.lr.xha.ri<T> riVar2 = this.ri.get(size);
                if (this.lr != riVar2 && riVar2.ri(f)) {
                    return riVar2;
                }
            }
            return this.ri.get(0);
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public float ka() {
            List<? extends com.bytedance.adsdk.lr.xha.ri<T>> list = this.ri;
            return list.get(list.size() - 1).ka();
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public com.bytedance.adsdk.lr.xha.ri<T> lr() {
            return this.lr;
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public boolean ri() {
            return false;
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public boolean lr(float f) {
            com.bytedance.adsdk.lr.xha.ri<T> riVar = this.ik;
            com.bytedance.adsdk.lr.xha.ri<T> riVar2 = this.lr;
            if (riVar == riVar2 && this.ka == f) {
                return true;
            }
            this.ik = riVar2;
            this.ka = f;
            return false;
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public boolean ri(float f) {
            if (this.lr.ri(f)) {
                return !this.lr.fi();
            }
            this.lr = ik(f);
            return true;
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public float ik() {
            return this.ri.get(0).ik();
        }
    }

    public static final class lr<T> implements ik<T> {
        private lr() {
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public float ik() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public float ka() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public com.bytedance.adsdk.lr.xha.ri<T> lr() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public boolean ri() {
            return true;
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public boolean lr(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.lr.ri.lr.ri.ik
        public boolean ri(float f) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.ri.lr.ri$ri, reason: collision with other inner class name */
    public interface InterfaceC0185ri {
        void ri();
    }

    public ri(List<? extends com.bytedance.adsdk.lr.xha.ri<K>> list) {
        this.fi = ri(list);
    }

    private float jbs() {
        if (this.xha == -1.0f) {
            this.xha = this.fi.ik();
        }
        return this.xha;
    }

    public float di() {
        if (this.mj == -1.0f) {
            this.mj = this.fi.ka();
        }
        return this.mj;
    }

    public float fi() {
        com.bytedance.adsdk.lr.xha.ri<K> riVarIk = ik();
        return (riVarIk == null || riVarIk.fi()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : riVarIk.ik.getInterpolation(ka());
    }

    public com.bytedance.adsdk.lr.xha.ri<K> ik() {
        com.bytedance.adsdk.lr.fi.ri("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.lr.xha.ri<K> riVarLr = this.fi.lr();
        com.bytedance.adsdk.lr.fi.lr("BaseKeyframeAnimation#getCurrentKeyframe");
        return riVarLr;
    }

    public float ka() {
        if (this.ka) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        com.bytedance.adsdk.lr.xha.ri<K> riVarIk = ik();
        return riVarIk.fi() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.lr - riVarIk.ik()) / (riVarIk.ka() - riVarIk.ik());
    }

    public void lr() {
        for (int i = 0; i < this.ri.size(); i++) {
            this.ri.get(i).ri();
        }
    }

    public float mj() {
        return this.lr;
    }

    public abstract A ri(com.bytedance.adsdk.lr.xha.ri<K> riVar, float f);

    public void ri() {
        this.ka = true;
    }

    public A xha() {
        float fKa = ka();
        if (this.ik == null && this.fi.lr(fKa)) {
            return this.di;
        }
        com.bytedance.adsdk.lr.xha.ri<K> riVarIk = ik();
        Interpolator interpolator = riVarIk.ka;
        A aRi = (interpolator == null || riVarIk.fi == null) ? ri(riVarIk, fi()) : ri(riVarIk, fKa, interpolator.getInterpolation(fKa), riVarIk.fi.getInterpolation(fKa));
        this.di = aRi;
        return aRi;
    }

    public void ri(InterfaceC0185ri interfaceC0185ri) {
        this.ri.add(interfaceC0185ri);
    }

    public void ri(float f) {
        if (this.fi.ri()) {
            return;
        }
        if (f < jbs()) {
            f = jbs();
        } else if (f > di()) {
            f = di();
        }
        if (f == this.lr) {
            return;
        }
        this.lr = f;
        if (this.fi.ri(f)) {
            lr();
        }
    }

    public A ri(com.bytedance.adsdk.lr.xha.ri<K> riVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> ik<T> ri(List<? extends com.bytedance.adsdk.lr.xha.ri<T>> list) {
        if (list.isEmpty()) {
            return new lr();
        }
        if (list.size() == 1) {
            return new fi(list);
        }
        return new ka(list);
    }
}
