package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    @Override // kotlin.jvm.internal.CallableReference
    public final KCallable computeReflected() {
        return Reflection.f43333a.j(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PropertyReference2Impl) this).getGetter().call(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}
