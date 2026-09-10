package p002kotlin.jvm.internal;

import kurbash.dern;
import kurbash.kowloon;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PropertyReference2 extends PropertyReference implements kowloon {
    public PropertyReference2() {
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public dern computeReflected() {
        return polloi.apical(this);
    }

    public abstract /* synthetic */ Object get(Object obj, Object obj2);

    @Override // kurbash.kowloon
    public Object getDelegate(Object obj, Object obj2) {
        return ((kowloon) getReflected()).getDelegate(obj, obj2);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // p002kotlin.jvm.internal.PropertyReference, kurbash.formularize
    public kowloon.attabal getGetter() {
        return ((kowloon) getReflected()).getGetter();
    }
}
