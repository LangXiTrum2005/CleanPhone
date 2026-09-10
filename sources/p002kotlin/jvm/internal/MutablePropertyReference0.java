package p002kotlin.jvm.internal;

import kurbash.cutely;
import kurbash.dern;
import kurbash.impassible;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MutablePropertyReference0 extends MutablePropertyReference implements cutely {
    public MutablePropertyReference0() {
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public dern computeReflected() {
        return polloi.beachfront(this);
    }

    public abstract /* synthetic */ Object get();

    @Override // kurbash.impassible
    public Object getDelegate() {
        return ((cutely) getReflected()).getDelegate();
    }

    @Override // p002kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    public abstract /* synthetic */ void set(Object obj);

    public MutablePropertyReference0(Object obj) {
        super(obj);
    }

    @Override // p002kotlin.jvm.internal.MutablePropertyReference, p002kotlin.jvm.internal.PropertyReference, kurbash.formularize
    public impassible.attabal getGetter() {
        return ((cutely) getReflected()).getGetter();
    }

    @Override // p002kotlin.jvm.internal.MutablePropertyReference, kurbash.taiyuan
    public cutely.attabal getSetter() {
        return ((cutely) getReflected()).getSetter();
    }

    public MutablePropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
