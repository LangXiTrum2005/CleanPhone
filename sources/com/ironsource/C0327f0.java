package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0327f0 implements InterfaceC0345g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28605b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f28606c = "ext_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f28607a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.f0$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC0345g0
    public void a(HashMap<String, String> params) {
        kotlin.jvm.internal.n.f(params, "params");
        this.f28607a.putAll(params);
    }

    @Override // com.ironsource.InterfaceC0345g0
    public void b(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        this.f28607a.put("ext_".concat(key), value);
    }

    @Override // com.ironsource.InterfaceC0345g0
    public Map<String, String> get() {
        return this.f28607a;
    }

    @Override // com.ironsource.InterfaceC0345g0
    public void a(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        this.f28607a.put(key, value);
    }
}
