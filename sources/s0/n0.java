package s0;

import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends g0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, ck.c cVar) {
        m0 m0Var;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i10 = m0Var.f49866j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                m0Var.f49866j = i10 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object obj2 = m0Var.f49864h;
        int i11 = m0Var.f49866j;
        if (i11 == 0) {
            t9.e.z(obj2);
            if (this.f49811c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f49809a);
            try {
                a1 a1Var = this.f49810b;
                h1 h1Var = new h1(fileOutputStream3);
                m0Var.f49862f = fileOutputStream3;
                m0Var.f49863g = fileOutputStream3;
                m0Var.f49866j = 1;
                Object objWriteTo = a1Var.writeTo(obj, h1Var, m0Var);
                bk.a aVar = bk.a.f5708a;
                if (objWriteTo == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = m0Var.f49863g;
            fileOutputStream = m0Var.f49862f;
            try {
                t9.e.z(obj2);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    qk.i0.j(fileOutputStream, th);
                    throw th4;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        qk.i0.j(fileOutputStream, null);
        return wj.r.f53297a;
    }
}
