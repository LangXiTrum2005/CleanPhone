package p002kotlin.jvm.internal;

import kurbash.competently;
import kurbash.wireman;

/* JADX INFO: loaded from: classes5.dex */
public class PropertyReference1Impl extends PropertyReference1 {
    public PropertyReference1Impl(competently competentlyVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((beachfront) competentlyVar).competently(), str, str2, !(competentlyVar instanceof wireman) ? 1 : 0);
    }

    @Override // p002kotlin.jvm.internal.PropertyReference1, kurbash.triweekly
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public PropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public PropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
