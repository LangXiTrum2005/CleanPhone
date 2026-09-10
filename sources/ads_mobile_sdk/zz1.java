package ads_mobile_sdk;

import android.content.Context;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class zz1 extends Lambda implements Function0 {
    public final /* synthetic */ a02 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz1(a02 a02Var) {
        super(0);
        this.a = a02Var;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        f02 f02Var;
        Context context = this.a.b;
        f02 f02Var2 = f02.h;
        synchronized (f02.class) {
            try {
                if (f02.h == null) {
                    f02.h = new f02(context);
                }
                f02Var = f02.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f02Var;
    }
}
