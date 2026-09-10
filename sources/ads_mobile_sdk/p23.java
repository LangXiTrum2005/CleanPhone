package ads_mobile_sdk;

import saneness.radula;

/* JADX INFO: loaded from: classes.dex */
public final class p23 implements Runnable {
    public final /* synthetic */ s23 a;

    public p23(s23 s23Var) {
        this.a = s23Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zu2 zu2Var = this.a.e;
        zu2Var.b.a(new radula(zu2Var));
    }
}
