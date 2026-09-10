package com.bytedance.adsdk.ud.qdl.ud;

import android.view.animation.Interpolator;
import androidx.media3.extractor.text.ttml.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl<K, A> {
    protected com.bytedance.adsdk.ud.wd.ud<A> lnr;
    private final lnr<K> mzz;
    final List<InterfaceC0060qdl> qdl = new ArrayList(1);
    private boolean mml = false;
    protected float ud = 0.0f;
    private A mo = null;
    private float wd = -1.0f;
    private float jpc = -1.0f;

    public interface lnr<T> {
        float lnr();

        float mml();

        boolean qdl();

        boolean qdl(float f);

        com.bytedance.adsdk.ud.wd.qdl<T> ud();

        boolean ud(float f);
    }

    public static final class mml<T> implements lnr<T> {
        private final List<? extends com.bytedance.adsdk.ud.wd.qdl<T>> qdl;
        private com.bytedance.adsdk.ud.wd.qdl<T> lnr = null;
        private float mml = -1.0f;
        private com.bytedance.adsdk.ud.wd.qdl<T> ud = lnr(0.0f);

        public mml(List<? extends com.bytedance.adsdk.ud.wd.qdl<T>> list) {
            this.qdl = list;
        }

        private com.bytedance.adsdk.ud.wd.qdl<T> lnr(float f) {
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar = (com.bytedance.adsdk.ud.wd.qdl) a.h(1, this.qdl);
            if (f >= qdlVar.lnr()) {
                return qdlVar;
            }
            for (int size = this.qdl.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.ud.wd.qdl<T> qdlVar2 = this.qdl.get(size);
                if (this.ud != qdlVar2 && qdlVar2.qdl(f)) {
                    return qdlVar2;
                }
            }
            return this.qdl.get(0);
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float mml() {
            return ((com.bytedance.adsdk.ud.wd.qdl) a.h(1, this.qdl)).mml();
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl() {
            return false;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public com.bytedance.adsdk.ud.wd.qdl<T> ud() {
            return this.ud;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl(float f) {
            if (this.ud.qdl(f)) {
                return !this.ud.mzz();
            }
            this.ud = lnr(f);
            return true;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean ud(float f) {
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar = this.lnr;
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar2 = this.ud;
            if (qdlVar == qdlVar2 && this.mml == f) {
                return true;
            }
            this.lnr = qdlVar2;
            this.mml = f;
            return false;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float lnr() {
            return this.qdl.get(0).lnr();
        }
    }

    public static final class mzz<T> implements lnr<T> {
        private final com.bytedance.adsdk.ud.wd.qdl<T> qdl;
        private float ud = -1.0f;

        public mzz(List<? extends com.bytedance.adsdk.ud.wd.qdl<T>> list) {
            this.qdl = list.get(0);
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float lnr() {
            return this.qdl.lnr();
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float mml() {
            return this.qdl.mml();
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl() {
            return false;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public com.bytedance.adsdk.ud.wd.qdl<T> ud() {
            return this.qdl;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl(float f) {
            return !this.qdl.mzz();
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean ud(float f) {
            if (this.ud == f) {
                return true;
            }
            this.ud = f;
            return false;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.qdl.ud.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0060qdl {
        void qdl();
    }

    public static final class ud<T> implements lnr<T> {
        private ud() {
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float lnr() {
            return 0.0f;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public float mml() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl() {
            return true;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public com.bytedance.adsdk.ud.wd.qdl<T> ud() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean qdl(float f) {
            return false;
        }

        @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.lnr
        public boolean ud(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    public qdl(List<? extends com.bytedance.adsdk.ud.wd.qdl<K>> list) {
        this.mzz = qdl(list);
    }

    private float tvp() {
        if (this.wd == -1.0f) {
            this.wd = this.mzz.lnr();
        }
        return this.wd;
    }

    public float jpc() {
        return this.ud;
    }

    public com.bytedance.adsdk.ud.wd.qdl<K> lnr() {
        com.bytedance.adsdk.ud.mzz.qdl("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.ud.wd.qdl<K> qdlVarUd = this.mzz.ud();
        com.bytedance.adsdk.ud.mzz.ud("BaseKeyframeAnimation#getCurrentKeyframe");
        return qdlVarUd;
    }

    public float mml() {
        if (this.mml) {
            return 0.0f;
        }
        com.bytedance.adsdk.ud.wd.qdl<K> qdlVarLnr = lnr();
        if (qdlVarLnr.mzz()) {
            return 0.0f;
        }
        return (this.ud - qdlVarLnr.lnr()) / (qdlVarLnr.mml() - qdlVarLnr.lnr());
    }

    public float mo() {
        if (this.jpc == -1.0f) {
            this.jpc = this.mzz.mml();
        }
        return this.jpc;
    }

    public float mzz() {
        com.bytedance.adsdk.ud.wd.qdl<K> qdlVarLnr = lnr();
        if (qdlVarLnr == null || qdlVarLnr.mzz()) {
            return 0.0f;
        }
        return qdlVarLnr.lnr.getInterpolation(mml());
    }

    public abstract A qdl(com.bytedance.adsdk.ud.wd.qdl<K> qdlVar, float f);

    public void qdl() {
        this.mml = true;
    }

    public void ud() {
        for (int i2 = 0; i2 < this.qdl.size(); i2++) {
            this.qdl.get(i2).qdl();
        }
    }

    public A wd() {
        float fMml = mml();
        if (this.lnr == null && this.mzz.ud(fMml)) {
            return this.mo;
        }
        com.bytedance.adsdk.ud.wd.qdl<K> qdlVarLnr = lnr();
        Interpolator interpolator = qdlVarLnr.mml;
        A aQdl = (interpolator == null || qdlVarLnr.mzz == null) ? qdl(qdlVarLnr, mzz()) : qdl(qdlVarLnr, fMml, interpolator.getInterpolation(fMml), qdlVarLnr.mzz.getInterpolation(fMml));
        this.mo = aQdl;
        return aQdl;
    }

    public void qdl(InterfaceC0060qdl interfaceC0060qdl) {
        this.qdl.add(interfaceC0060qdl);
    }

    public void qdl(float f) {
        if (this.mzz.qdl()) {
            return;
        }
        if (f < tvp()) {
            f = tvp();
        } else if (f > mo()) {
            f = mo();
        }
        if (f == this.ud) {
            return;
        }
        this.ud = f;
        if (this.mzz.qdl(f)) {
            ud();
        }
    }

    public A qdl(com.bytedance.adsdk.ud.wd.qdl<K> qdlVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> lnr<T> qdl(List<? extends com.bytedance.adsdk.ud.wd.qdl<T>> list) {
        if (list.isEmpty()) {
            return new ud();
        }
        if (list.size() == 1) {
            return new mzz(list);
        }
        return new mml(list);
    }
}
