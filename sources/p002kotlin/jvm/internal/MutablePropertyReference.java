package p002kotlin.jvm.internal;

import kurbash.formularize;
import kurbash.taiyuan;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MutablePropertyReference extends PropertyReference implements taiyuan {
    public MutablePropertyReference() {
    }

    @Override // p002kotlin.jvm.internal.PropertyReference, kurbash.formularize
    public abstract /* synthetic */ formularize.saneness getGetter();

    @Override // kurbash.taiyuan
    public abstract /* synthetic */ taiyuan.attabal getSetter();

    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
