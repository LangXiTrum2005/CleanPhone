package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f45414c;

    public m0(Object obj) {
        this.f45412a = obj;
        this.f45413b = obj instanceof wj.g ? null : obj;
        this.f45414c = wj.h.a(obj);
    }

    public static final void a(Object obj, Object callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        kotlin.jvm.internal.h0.d(1, callback);
        ((jk.b) callback).invoke(new wj.h(obj));
    }
}
