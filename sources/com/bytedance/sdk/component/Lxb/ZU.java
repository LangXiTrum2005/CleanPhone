package com.bytedance.sdk.component.Lxb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZU<P, R> extends com.bytedance.sdk.component.Lxb.LD<P, R> {
    private Lxb LD;
    private boolean Lxb = true;
    private lc lk;

    public interface LD {
        ZU Lxb();
    }

    public interface Lxb {
        void Lxb(Object obj);

        void Lxb(Throwable th);
    }

    private boolean lc() {
        if (this.Lxb) {
            return true;
        }
        QAg.Lxb(new IllegalStateException("Jsb async call already finished: " + Lxb() + ", hashcode: " + hashCode()));
        return false;
    }

    public void JXs() {
        ZU();
    }

    @Override // com.bytedance.sdk.component.Lxb.LD
    public /* bridge */ /* synthetic */ String Lxb() {
        return super.Lxb();
    }

    public abstract void Lxb(P p, lc lcVar) throws Exception;

    public void ZU() {
        this.Lxb = false;
        this.lk = null;
    }

    public final void lk() {
        Lxb((Throwable) null);
    }

    public final void Lxb(R r) {
        if (lc()) {
            this.LD.Lxb(r);
            ZU();
        }
    }

    public final void Lxb(Throwable th) {
        if (lc()) {
            this.LD.Lxb(th);
            ZU();
        }
    }

    public void Lxb(P p, lc lcVar, Lxb lxb) throws Exception {
        this.lk = lcVar;
        this.LD = lxb;
        Lxb(p, lcVar);
    }
}
