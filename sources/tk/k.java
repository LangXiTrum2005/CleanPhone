package tk;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f50999b;

    public k(Field field) {
        kotlin.jvm.internal.n.f(field, "field");
        this.f50999b = field;
    }

    @Override // tk.q1
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        Field field = this.f50999b;
        String name = field.getName();
        kotlin.jvm.internal.n.e(name, "field.name");
        sb2.append(il.x.a(name));
        sb2.append("()");
        Class<?> type = field.getType();
        kotlin.jvm.internal.n.e(type, "field.type");
        sb2.append(fl.c.b(type));
        return sb2.toString();
    }
}
