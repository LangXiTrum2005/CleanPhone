package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.orthocephalic;

/* JADX INFO: loaded from: classes.dex */
public final class f41 extends orthocephalic {
    public final complexometry.wireman a;
    public final Function2 b;

    public f41(complexometry.wireman loadCallback, Function2 wrap) {
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        this.a = loadCallback;
        this.b = wrap;
    }

    @Override // saneness.orthocephalic
    public final void a() {
    }

    @Override // saneness.orthocephalic
    public final void a(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.onAdFailedToLoad(error);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // saneness.orthocephalic
    public final Object a(d41 d41Var, wretchedly.dern dernVar) {
        e41 e41Var;
        complexometry.wireman wiremanVar;
        if (dernVar instanceof e41) {
            e41Var = (e41) dernVar;
            int i = e41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e41Var.d = i - Integer.MIN_VALUE;
            } else {
                e41Var = new e41(this, dernVar);
            }
        } else {
            e41Var = new e41(this, dernVar);
        }
        Object obj = e41Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = e41Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            complexometry.wireman wiremanVar2 = this.a;
            Function2 function2 = this.b;
            e41Var.a = wiremanVar2;
            e41Var.d = 1;
            Object objInvoke = function2.invoke(d41Var, e41Var);
            if (objInvoke == objBeachfront) {
                return objBeachfront;
            }
            obj = objInvoke;
            wiremanVar = wiremanVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wiremanVar = e41Var.a;
            p002kotlin.dern.saneness(obj);
        }
        wiremanVar.onAdLoaded(obj);
        return Unit.f29295attabal;
    }
}
