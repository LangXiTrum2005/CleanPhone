package ads_mobile_sdk;

/* JADX INFO: loaded from: classes.dex */
public final class om2 extends lk2 {
    public final /* synthetic */ pm2 b;

    public om2(pm2 pm2Var) {
        this.b = pm2Var;
    }

    @Override // ads_mobile_sdk.lk2
    public final void a() {
        qm2 qm2Var = this.b.a;
        qm2Var.b.a("unlinkToDeath", new Object[0]);
        qm2Var.n.asBinder().unlinkToDeath(qm2Var.k, 0);
        qm2 qm2Var2 = this.b.a;
        qm2Var2.n = null;
        qm2Var2.g = false;
    }
}
