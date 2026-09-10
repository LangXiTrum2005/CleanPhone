package ads_mobile_sdk;

import kotlinx.coroutines.splinterproof;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Ref$BooleanRef;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class n91 extends SuspendLambda implements Function1 {
    public String a;
    public int b;
    public final /* synthetic */ Ref$BooleanRef c;
    public final /* synthetic */ y91 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Ref$ObjectRef f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n91(Ref$BooleanRef ref$BooleanRef, y91 y91Var, String str, Ref$ObjectRef ref$ObjectRef, wretchedly.dern dernVar) {
        super(1, dernVar);
        this.c = ref$BooleanRef;
        this.d = y91Var;
        this.e = str;
        this.f = ref$ObjectRef;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(wretchedly.dern dernVar) {
        return new n91(this.c, this.d, this.e, this.f, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((n91) create((wretchedly.dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CharSequence charSequence;
        y91 y91Var;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.b;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            if (!this.c.element) {
                long j = y91.q;
                this.b = 1;
                if (splinterproof.saneness(j, this) != objBeachfront) {
                }
            }
            return objBeachfront;
        }
        if (i == 1) {
            p002kotlin.dern.saneness(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = this.a;
                p002kotlin.dern.saneness(obj);
                return str2;
            }
            p002kotlin.dern.saneness(obj);
        }
        str = (String) obj;
        if (!this.c.element && (charSequence = (CharSequence) this.f.element) != null && !StringsKt.empress(charSequence) && str != null && !StringsKt.empress(str)) {
            y91Var = this.d;
            this.a = str;
            this.b = 3;
            if (y91.a(y91Var, str, this) == objBeachfront) {
                return objBeachfront;
            }
        }
        return str;
        y91 y91Var2 = this.d;
        String str3 = this.e;
        this.b = 2;
        obj = y91.b(y91Var2, str3, this);
        if (obj != objBeachfront) {
            str = (String) obj;
            if (!this.c.element) {
                y91Var = this.d;
                this.a = str;
                this.b = 3;
                if (y91.a(y91Var, str, this) == objBeachfront) {
                }
            }
            return str;
        }
        return objBeachfront;
    }
}
