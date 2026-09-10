package kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: loaded from: classes7.dex */
class SingleThreadValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f44486b = Thread.currentThread();

    public SingleThreadValue(Object obj) {
        this.f44485a = obj;
    }
}
