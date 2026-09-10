package p002kotlin.jvm.internal;

import kurbash.competently;
import kurbash.wireman;

/* JADX INFO: loaded from: classes5.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(competently competentlyVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((beachfront) competentlyVar).competently(), str, str2, !(competentlyVar instanceof wireman) ? 1 : 0);
    }

    @Override // p002kotlin.jvm.internal.MutablePropertyReference1, kurbash.triweekly
    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    @Override // p002kotlin.jvm.internal.MutablePropertyReference1
    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
