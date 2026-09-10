package ads_mobile_sdk;

import com.google.common.util.concurrent.triweekly;

/* JADX INFO: loaded from: classes.dex */
public final class t13 implements triweekly {
    public final /* synthetic */ v03 a;

    public t13(v03 v03Var) {
        this.a = v03Var;
    }

    @Override // com.google.common.util.concurrent.triweekly
    public final void onFailure(Throwable th) {
        this.a.a(th);
        this.a.a();
    }

    @Override // com.google.common.util.concurrent.triweekly
    public final void onSuccess(Object obj) {
        this.a.a();
    }
}
