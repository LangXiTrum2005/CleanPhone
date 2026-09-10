package p002kotlin.jvm.internal;

import kurbash.dern;
import kurbash.impassible;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PropertyReference0 extends PropertyReference implements impassible {
    public PropertyReference0() {
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public dern computeReflected() {
        return polloi.taiyuan(this);
    }

    public abstract /* synthetic */ Object get();

    @Override // kurbash.impassible
    public Object getDelegate() {
        return ((impassible) getReflected()).getDelegate();
    }

    @Override // p002kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // p002kotlin.jvm.internal.PropertyReference, kurbash.formularize
    public impassible.attabal getGetter() {
        return ((impassible) getReflected()).getGetter();
    }

    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
