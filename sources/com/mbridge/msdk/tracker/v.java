package com.mbridge.msdk.tracker;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class v<T> extends com.mbridge.msdk.tracker.network.t<T> {
    private com.mbridge.msdk.tracker.network.e A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<String, String> f37080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.t.a f37081x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.v.b<T> f37082y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private w f37083z;

    public v(String str, int i10) {
        super(i10, str);
    }

    public com.mbridge.msdk.tracker.network.v.b<T> C() {
        return this.f37082y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("Content-Type", "application/x-www-form-urlencoded");
        map.put("Charset", "UTF-8");
        return map;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        return this.f37080w;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.t.a l() {
        return this.f37081x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.x o() {
        if (y.b(this.A)) {
            this.A = new com.mbridge.msdk.tracker.network.e(30000, 0);
        }
        return this.A;
    }

    public v(String str, int i10, int i11) {
        super(i10, str, i11);
    }

    public void a(w wVar) {
        this.f37083z = wVar;
    }

    public void a(com.mbridge.msdk.tracker.network.t.a aVar) {
        this.f37081x = aVar;
    }

    public void a(Map<String, String> map) {
        this.f37080w = map;
    }

    public void a(com.mbridge.msdk.tracker.network.v.b<T> bVar) {
        this.f37082y = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.v<T> a(com.mbridge.msdk.tracker.network.q qVar) {
        return this.f37083z.a(qVar);
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public void a(T t10) {
        com.mbridge.msdk.tracker.network.v.b<T> bVarC = C();
        this.f37082y = bVarC;
        if (bVarC != null) {
            bVarC.a(t10);
        }
    }
}
