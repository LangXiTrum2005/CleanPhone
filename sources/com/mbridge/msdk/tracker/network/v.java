package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f37035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.tracker.network.b.a f37036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f37037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37038d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(b0 b0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b<T> {
        void a(T t10);
    }

    private v(T t10, com.mbridge.msdk.tracker.network.b.a aVar) {
        this.f37038d = false;
        this.f37035a = t10;
        this.f37036b = aVar;
        this.f37037c = null;
    }

    public static <T> v<T> a(T t10, com.mbridge.msdk.tracker.network.b.a aVar) {
        return new v<>(t10, aVar);
    }

    public static <T> v<T> a(b0 b0Var) {
        return new v<>(b0Var);
    }

    public boolean a() {
        return this.f37037c == null;
    }

    private v(b0 b0Var) {
        this.f37038d = false;
        this.f37035a = null;
        this.f37036b = null;
        this.f37037c = b0Var;
    }
}
