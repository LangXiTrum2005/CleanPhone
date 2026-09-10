package com.bytedance.sdk.component.ri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ik<P, R> extends com.bytedance.sdk.component.ri.lr<P, R> {
    private fi ik;
    private ri lr;
    private boolean ri = true;

    public interface lr {
        ik ri();
    }

    public interface ri {
        void ri(Object obj);

        void ri(Throwable th);
    }

    private boolean di() {
        if (this.ri) {
            return true;
        }
        mj.ri(new IllegalStateException("Jsb async call already finished: " + ri() + ", hashcode: " + hashCode()));
        return false;
    }

    public void fi() {
        ka();
    }

    public final void ik() {
        ri((Throwable) null);
    }

    public void ka() {
        this.ri = false;
        this.ik = null;
    }

    @Override // com.bytedance.sdk.component.ri.lr
    public /* bridge */ /* synthetic */ String ri() {
        return super.ri();
    }

    public abstract void ri(P p, fi fiVar) throws Exception;

    public final void ri(R r) {
        if (di()) {
            this.lr.ri(r);
            ka();
        }
    }

    public final void ri(Throwable th) {
        if (di()) {
            this.lr.ri(th);
            ka();
        }
    }

    public void ri(P p, fi fiVar, ri riVar) throws Exception {
        this.ik = fiVar;
        this.lr = riVar;
        ri(p, fiVar);
    }
}
