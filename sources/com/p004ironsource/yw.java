package com.p004ironsource;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class yw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27817b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27818c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Boolean> f27816a = new a();

    public class a extends HashMap<String, Boolean> {
        public a() {
            put(ch.k, Boolean.valueOf(yw.this.f27817b == 0));
            put(ch.f24530l, Boolean.valueOf(yw.this.f27818c == 0));
            Boolean bool = Boolean.FALSE;
            put(ch.m, bool);
            put(ch.f24531n, bool);
        }
    }

    public JSONObject a() {
        return new JSONObject(this.f27816a);
    }

    public void a(String str, int i2, boolean z2) {
        boolean z3 = false;
        if (this.f27816a.containsKey(str)) {
            this.f27816a.put(str, Boolean.valueOf(i2 == 0));
        }
        this.f27816a.put(ch.m, Boolean.valueOf(z2));
        if ((this.f27816a.get(ch.f24530l).booleanValue() || this.f27816a.get(ch.k).booleanValue()) && this.f27816a.get(ch.m).booleanValue()) {
            z3 = true;
        }
        this.f27816a.put(ch.f24531n, Boolean.valueOf(z3));
    }
}
