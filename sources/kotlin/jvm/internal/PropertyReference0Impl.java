package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes7.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    @Override // kotlin.reflect.KProperty0
    public Object get() {
        return getGetter().call(new Object[0]);
    }
}
