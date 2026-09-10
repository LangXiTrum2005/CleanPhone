package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Fg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26114b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26115c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Boolean> f26113a = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends HashMap<String, Boolean> {
        public a() {
            put(C0335f8.f28653k, Boolean.valueOf(Fg.this.f26114b == 0));
            put(C0335f8.l, Boolean.valueOf(Fg.this.f26115c == 0));
            Boolean bool = Boolean.FALSE;
            put(C0335f8.f28654m, bool);
            put(C0335f8.f28655n, bool);
        }
    }

    public void a(String str, int i10, boolean z10) {
        boolean z11 = false;
        if (this.f26113a.containsKey(str)) {
            this.f26113a.put(str, Boolean.valueOf(i10 == 0));
        }
        this.f26113a.put(C0335f8.f28654m, Boolean.valueOf(z10));
        if ((this.f26113a.get(C0335f8.l).booleanValue() || this.f26113a.get(C0335f8.f28653k).booleanValue()) && this.f26113a.get(C0335f8.f28654m).booleanValue()) {
            z11 = true;
        }
        this.f26113a.put(C0335f8.f28655n, Boolean.valueOf(z11));
    }

    public JSONObject a() {
        return new JSONObject(this.f26113a);
    }
}
