package be;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends com.google.gson.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f5648d = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5649a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5650b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5651c = new HashMap();

    public j(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r10 = (Enum) field2.get(null);
                String strName = r10.name();
                String string = r10.toString();
                zd.b bVar = (zd.b) field2.getAnnotation(zd.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        this.f5649a.put(str, r10);
                    }
                }
                this.f5649a.put(strName, r10);
                this.f5650b.put(string, r10);
                this.f5651c.put(r10, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        if (aVar.H() == 9) {
            aVar.D();
            return null;
        }
        String strF = aVar.F();
        Enum r0 = (Enum) this.f5649a.get(strF);
        return r0 == null ? (Enum) this.f5650b.get(strF) : r0;
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        bVar.B(r2 == null ? null : (String) this.f5651c.get(r2));
    }
}
