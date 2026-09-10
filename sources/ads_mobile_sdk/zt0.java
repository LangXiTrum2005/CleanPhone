package ads_mobile_sdk;

import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zt0 implements Closeable {
    public final int a;
    public final String b;
    public final Map c;
    public final dg2 d;

    public zt0(int i, String str, LinkedHashMap linkedHashMap, dg2 dg2Var) {
        this.a = i;
        this.b = str;
        this.c = linkedHashMap;
        this.d = dg2Var;
    }

    public final dg2 a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public /* synthetic */ zt0(int i, String str, LinkedHashMap linkedHashMap, dg2 dg2Var, int i2) {
        this(i, str, linkedHashMap, dg2Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
