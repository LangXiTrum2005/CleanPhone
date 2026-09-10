package com.ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3643mg {
    private int b = 4;
    private int c = 4;
    private HashMap<String, Boolean> a = new a();

    /* JADX INFO: renamed from: com.ironsource.mg$a */
    public class a extends HashMap<String, Boolean> {
        public a() {
            put(C3474d8.k, Boolean.valueOf(C3643mg.this.b == 0));
            put(C3474d8.l, Boolean.valueOf(C3643mg.this.c == 0));
            Boolean bool = Boolean.FALSE;
            put(C3474d8.m, bool);
            put(C3474d8.n, bool);
        }
    }

    public void a(String str, int i, boolean z) {
        boolean z2 = false;
        if (this.a.containsKey(str)) {
            this.a.put(str, Boolean.valueOf(i == 0));
        }
        this.a.put(C3474d8.m, Boolean.valueOf(z));
        if ((this.a.get(C3474d8.l).booleanValue() || this.a.get(C3474d8.k).booleanValue()) && this.a.get(C3474d8.m).booleanValue()) {
            z2 = true;
        }
        this.a.put(C3474d8.n, Boolean.valueOf(z2));
    }

    public JSONObject a() {
        return new JSONObject(this.a);
    }
}
