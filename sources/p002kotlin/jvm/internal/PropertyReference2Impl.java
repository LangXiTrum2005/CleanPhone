package p002kotlin.jvm.internal;

import kurbash.competently;
import kurbash.wireman;

/* JADX INFO: loaded from: classes5.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    public PropertyReference2Impl(competently competentlyVar, String str, String str2) {
        super(((beachfront) competentlyVar).competently(), str, str2, !(competentlyVar instanceof wireman) ? 1 : 0);
    }

    @Override // p002kotlin.jvm.internal.PropertyReference2
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }

    public PropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }
}
