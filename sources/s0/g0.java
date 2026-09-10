package s0;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class g0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f49809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f49810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f49811c;

    public g0(File file, a1 serializer) {
        kotlin.jvm.internal.n.f(serializer, "serializer");
        this.f49809a = file;
        this.f49810b = serializer;
        this.f49811c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [s0.g0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, s0.g0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [s0.g0] */
    public static Object a(g0 g0Var, ck.c cVar) {
        f0 f0Var;
        Throwable th2;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th3;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i10 = f0Var.f49804j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f0Var.f49804j = i10 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(g0Var, cVar);
            }
        } else {
            f0Var = new f0(g0Var, cVar);
        }
        Object obj = f0Var.f49802h;
        ?? r2 = f0Var.f49804j;
        bk.a aVar = bk.a.f5708a;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    fileInputStream = f0Var.f49801g;
                    r2 = (g0) f0Var.f49800f;
                    try {
                        t9.e.z(obj);
                        qk.i0.j(fileInputStream, null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        try {
                            throw th3;
                        } catch (Throwable th5) {
                            qk.i0.j(fileInputStream, th3);
                            throw th5;
                        }
                    }
                }
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) f0Var.f49800f;
                try {
                    t9.e.z(obj);
                    qk.i0.j(closeable, null);
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th2;
                    } catch (Throwable th7) {
                        qk.i0.j(closeable, th2);
                        throw th7;
                    }
                }
            }
            t9.e.z(obj);
            if (g0Var.f49811c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(g0Var.f49809a);
                try {
                    a1 a1Var = g0Var.f49810b;
                    f0Var.f49800f = g0Var;
                    f0Var.f49801g = fileInputStream2;
                    f0Var.f49804j = 1;
                    Object from = a1Var.readFrom(fileInputStream2, f0Var);
                    if (from != aVar) {
                        fileInputStream = fileInputStream2;
                        obj = from;
                        qk.i0.j(fileInputStream, null);
                        return obj;
                    }
                    return aVar;
                } catch (Throwable th8) {
                    r2 = g0Var;
                    fileInputStream = fileInputStream2;
                    th3 = th8;
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                File file = g0Var.f49809a;
                a1 a1Var2 = g0Var.f49810b;
                if (!file.exists()) {
                    return a1Var2.getDefaultValue();
                }
                FileInputStream fileInputStream3 = new FileInputStream(g0Var.f49809a);
                try {
                    f0Var.f49800f = fileInputStream3;
                    f0Var.f49801g = null;
                    f0Var.f49804j = 2;
                    Object from2 = a1Var2.readFrom(fileInputStream3, f0Var);
                    if (from2 != aVar) {
                        obj = from2;
                        closeable = fileInputStream3;
                        qk.i0.j(closeable, null);
                        return obj;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    closeable = fileInputStream3;
                    throw th2;
                }
            }
        } catch (FileNotFoundException unused2) {
            g0Var = r2;
        }
    }

    @Override // s0.a
    public final void close() {
        this.f49811c.set(true);
    }
}
