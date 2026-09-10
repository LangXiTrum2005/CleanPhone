package p002kotlin.jvm.internal;

import kurbash.dern;
import kurbash.triweekly;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PropertyReference1 extends PropertyReference implements triweekly {
    public PropertyReference1() {
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public dern computeReflected() {
        return polloi.cutely(this);
    }

    public abstract /* synthetic */ Object get(Object obj);

    @Override // kurbash.triweekly
    public Object getDelegate(Object obj) {
        return ((triweekly) getReflected()).getDelegate(obj);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // p002kotlin.jvm.internal.PropertyReference, kurbash.formularize
    public triweekly.attabal getGetter() {
        return ((triweekly) getReflected()).getGetter();
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
