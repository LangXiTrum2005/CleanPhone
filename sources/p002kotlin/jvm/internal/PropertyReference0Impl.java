package p002kotlin.jvm.internal;

import kurbash.competently;
import kurbash.wireman;

/* JADX INFO: loaded from: classes5.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(competently competentlyVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((beachfront) competentlyVar).competently(), str, str2, !(competentlyVar instanceof wireman) ? 1 : 0);
    }

    @Override // p002kotlin.jvm.internal.PropertyReference0
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
