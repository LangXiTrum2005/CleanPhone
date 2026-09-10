package uk;

import cl.e0;
import cl.t0;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import zk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f52228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f52229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, int i10) {
        super(0);
        this.f52228e = i10;
        this.f52229f = obj;
    }

    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, jk.b] */
    @Override // jk.a
    public final Object invoke() {
        int iHashCode;
        switch (this.f52228e) {
            case 0:
                int iHashCode2 = 0;
                for (Map.Entry entry : ((Map) this.f52229f).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 1:
                File file = (File) ((t0) this.f52229f).invoke();
                String name = file.getName();
                kotlin.jvm.internal.n.e(name, "getName(...)");
                if (an.h.N0('.', name, "").equals("preferences_pb")) {
                    File absoluteFile = file.getAbsoluteFile();
                    kotlin.jvm.internal.n.e(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                return (List) this.f52229f;
            case 3:
                yk.i iVar = (yk.i) this.f52229f;
                e0 e0Var = iVar.f54473f;
                if (e0Var == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                yk.h hVar = (yk.h) e0Var.invoke();
                iVar.f54473f = null;
                return hVar;
            default:
                return (im.n) ((i0) this.f52229f).f54969b.invoke(qm.f.f49175a);
        }
    }
}
