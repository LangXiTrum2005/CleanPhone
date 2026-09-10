package ads_mobile_sdk;

import kotlinx.coroutines.oilcan;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.sudan;

/* JADX INFO: loaded from: classes.dex */
public final class s13 implements oilcan {
    public static final sudan b = new sudan();
    public final h13 a = new h13();

    @Override // kotlinx.coroutines.oilcan
    public final oilcan copyForChild() {
        return new s13();
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return oilcan.attabal.attabal(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.saneness sanenessVar) {
        return oilcan.attabal.saneness(this, sanenessVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.saneness getKey() {
        return b;
    }

    @Override // kotlinx.coroutines.oilcan
    public final CoroutineContext mergeForChild(CoroutineContext.Element overwritingElement) {
        Intrinsics.checkNotNullParameter(overwritingElement, "overwritingElement");
        return new s13();
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.saneness sanenessVar) {
        return oilcan.attabal.dern(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return oilcan.attabal.wireman(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.immediately
    public final void restoreThreadContext(CoroutineContext context, Object obj) {
        g13 oldState = (g13) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        this.a.getClass();
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        i13 i13VarB = j13.b();
        i13VarB.c = null;
        j13.a(i13VarB, oldState.a);
        i13VarB.c = oldState.b;
    }

    @Override // kotlinx.coroutines.immediately
    public final Object updateThreadContext(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        h13 h13Var = this.a;
        h13Var.getClass();
        i13 i13VarB = j13.b();
        g13 g13Var = new g13(j13.a(i13VarB, h13Var.a), i13VarB.c);
        i13VarB.c = h13Var;
        return g13Var;
    }
}
