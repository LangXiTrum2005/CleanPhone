package com.mbridge.msdk.config.component.common.express.operator.parts;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f31926b;

    private a(boolean z10, Object obj) {
        this.f31925a = z10;
        this.f31926b = obj;
    }

    public static a a(Object obj) {
        return new a(true, obj);
    }

    public static a c() {
        return new a(false, null);
    }

    public boolean b() {
        return this.f31925a;
    }

    public Object a() {
        Object obj = this.f31926b;
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        return obj instanceof Integer ? String.valueOf(obj) : obj;
    }
}
