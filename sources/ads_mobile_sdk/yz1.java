package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class yz1 extends Lambda implements Function0 {
    public final /* synthetic */ a02 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz1(a02 a02Var) {
        super(0);
        this.a = a02Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        d02 d02Var;
        Context context = this.a.b;
        d02 d02Var2 = d02.h;
        synchronized (d02.class) {
            try {
                if (d02.h == null) {
                    d02.h = new d02(context);
                }
                d02Var = d02.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d02Var;
    }
}
