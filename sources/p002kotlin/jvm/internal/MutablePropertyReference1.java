package p002kotlin.jvm.internal;

import kurbash.apical;
import kurbash.dern;
import kurbash.triweekly;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements apical {
    public MutablePropertyReference1() {
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public dern computeReflected() {
        return polloi.competently(this);
    }

    @Override // kurbash.triweekly
    public abstract /* synthetic */ Object get(Object obj);

    @Override // kurbash.triweekly
    public Object getDelegate(Object obj) {
        return ((apical) getReflected()).getDelegate(obj);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public abstract /* synthetic */ void set(Object obj, Object obj2);

    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // p002kotlin.jvm.internal.MutablePropertyReference, p002kotlin.jvm.internal.PropertyReference, kurbash.formularize
    public triweekly.attabal getGetter() {
        return ((apical) getReflected()).getGetter();
    }

    @Override // p002kotlin.jvm.internal.MutablePropertyReference, kurbash.taiyuan
    public apical.attabal getSetter() {
        return ((apical) getReflected()).getSetter();
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
