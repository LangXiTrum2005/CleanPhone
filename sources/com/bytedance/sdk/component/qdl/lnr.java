package com.bytedance.sdk.component.qdl;

/* JADX INFO: loaded from: classes.dex */
public abstract class lnr<P, R> extends com.bytedance.sdk.component.qdl.ud<P, R> {
    private mzz lnr;
    private boolean qdl = true;
    private qdl ud;

    public interface qdl {
        void qdl(Object obj);

        void qdl(Throwable th);
    }

    public interface ud {
        lnr qdl();
    }

    private boolean mo() {
        if (this.qdl) {
            return true;
        }
        jpc.qdl(new IllegalStateException("Jsb async call already finished: " + qdl() + ", hashcode: " + hashCode()));
        return false;
    }

    public final void lnr() {
        qdl((Throwable) null);
    }

    public void mml() {
        this.qdl = false;
        this.lnr = null;
    }

    public void mzz() {
        mml();
    }

    @Override // com.bytedance.sdk.component.qdl.ud
    public /* bridge */ /* synthetic */ String qdl() {
        return super.qdl();
    }

    public abstract void qdl(P p2, mzz mzzVar) throws Exception;

    public final void qdl(R r) {
        if (mo()) {
            this.ud.qdl(r);
            mml();
        }
    }

    public final void qdl(Throwable th) {
        if (mo()) {
            this.ud.qdl(th);
            mml();
        }
    }

    public void qdl(P p2, mzz mzzVar, qdl qdlVar) throws Exception {
        this.lnr = mzzVar;
        this.ud = qdlVar;
        qdl(p2, mzzVar);
    }
}
