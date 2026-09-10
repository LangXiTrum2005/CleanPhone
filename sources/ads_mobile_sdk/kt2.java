package ads_mobile_sdk;

import com.google.common.util.concurrent.triweekly;
import saneness.glutethimide;

/* JADX INFO: loaded from: classes.dex */
public final class kt2 implements triweekly {
    public final /* synthetic */ lt2 a;

    public kt2(lt2 lt2Var) {
        this.a = lt2Var;
    }

    @Override // com.google.common.util.concurrent.triweekly
    public final void onSuccess(Object obj) {
        glutethimide glutethimideVar = (glutethimide) obj;
        kc1 kc1Var = (kc1) this.a.c;
        synchronized (kc1Var.m) {
            kc1Var.p.marial(glutethimideVar.b());
        }
    }

    @Override // com.google.common.util.concurrent.triweekly
    public final void onFailure(Throwable th) {
    }
}
