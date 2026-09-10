package oa;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class l0 extends q0 {
    private static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException(l1.d.e(i10, "Invalid key count "));
        }
        b2.p pVarD = o0.d();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i13 = objectInputStream.readInt();
            if (i13 <= 0) {
                throw new InvalidObjectException(l1.d.e(i13, "Invalid value count "));
            }
            e0 e0VarU = j0.u();
            for (int i14 = 0; i14 < i13; i14++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                e0VarU.b(object2);
            }
            pVarD.l(object, e0VarU.g());
            i11 += i13;
        }
        try {
            s1 s1VarC = pVarD.c(true);
            na.g gVar = p0.f47290a;
            gVar.getClass();
            try {
                ((Field) gVar.f46631b).set(this, s1VarC);
                na.g gVar2 = p0.f47291b;
                gVar2.getClass();
                try {
                    ((Field) gVar2.f46631b).set(this, Integer.valueOf(i11));
                } catch (IllegalAccessException e10) {
                    throw new AssertionError(e10);
                }
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        } catch (IllegalArgumentException e12) {
            throw ((InvalidObjectException) new InvalidObjectException(e12.getMessage()).initCause(e12));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(d().size());
        for (Map.Entry entry : d().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public final j0 k(Object obj) {
        j0 j0Var = (j0) this.f47296d.get(obj);
        if (j0Var != null) {
            return j0Var;
        }
        f0 f0Var = j0.f47265b;
        return n1.f47281e;
    }
}
