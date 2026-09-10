package w0;

import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.p;
import go.k;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.n;
import s0.a1;
import s0.h1;
import v0.h;
import v0.i;
import v0.j;
import wj.r;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f52740a = new g();

    @Override // s0.a1
    public final Object getDefaultValue() {
        return new b(true);
    }

    @Override // s0.a1
    public final Object readFrom(InputStream inputStream, ak.f fVar) throws s0.b {
        byte[] bArr;
        try {
            v0.e eVarO = v0.e.o((FileInputStream) inputStream);
            b bVar = new b(false);
            e[] pairs = (e[]) Arrays.copyOf(new e[0], 0);
            n.f(pairs, "pairs");
            bVar.b();
            if (pairs.length > 0) {
                e eVar = pairs[0];
                throw null;
            }
            Map mapM = eVarO.m();
            n.e(mapM, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM.entrySet()) {
                String name = (String) entry.getKey();
                j value = (j) entry.getValue();
                n.e(name, "name");
                n.e(value, "value");
                int iC = value.C();
                switch (iC == 0 ? -1 : f.f52739a[i.c(iC)]) {
                    case -1:
                        throw new s0.b("Value case is null.", null);
                    case 0:
                    default:
                        throw new aa.b((byte) 0, 20);
                    case 1:
                        bVar.f(k.d(name), Boolean.valueOf(value.t()));
                        break;
                    case 2:
                        bVar.f(new d(name), Float.valueOf(value.x()));
                        break;
                    case 3:
                        bVar.f(new d(name), Double.valueOf(value.w()));
                        break;
                    case 4:
                        bVar.f(k.O(name), Integer.valueOf(value.y()));
                        break;
                    case 5:
                        bVar.f(k.Q(name), Long.valueOf(value.z()));
                        break;
                    case 6:
                        d dVarX = k.X(name);
                        String strA = value.A();
                        n.e(strA, "value.string");
                        bVar.f(dVarX, strA);
                        break;
                    case 7:
                        d dVarY = k.Y(name);
                        d0 d0VarN = value.B().n();
                        n.e(d0VarN, "value.stringSet.stringsList");
                        bVar.f(dVarY, xj.n.R0(d0VarN));
                        break;
                    case 8:
                        d dVar = new d(name);
                        androidx.datastore.preferences.protobuf.j jVarU = value.u();
                        int size = jVarU.size();
                        if (size == 0) {
                            bArr = e0.f4068b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            jVarU.n(size, bArr2);
                            bArr = bArr2;
                        }
                        n.e(bArr, "value.bytes.toByteArray()");
                        bVar.f(dVar, bArr);
                        break;
                    case 9:
                        throw new s0.b("Value not set.", null);
                }
            }
            return new b(b0.Y(bVar.a()), true);
        } catch (g0 e10) {
            throw new s0.b("Unable to parse preferences proto.", e10);
        }
    }

    @Override // s0.a1
    public final Object writeTo(Object obj, OutputStream outputStream, ak.f fVar) throws IOException {
        androidx.datastore.preferences.protobuf.b0 b0VarA;
        Map mapA = ((b) obj).a();
        v0.c cVarN = v0.e.n();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar.f52738a;
            if (value instanceof Boolean) {
                h hVarD = j.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarD.c();
                j.q((j) hVarD.f4208b, zBooleanValue);
                b0VarA = hVarD.a();
            } else if (value instanceof Float) {
                h hVarD2 = j.D();
                float fFloatValue = ((Number) value).floatValue();
                hVarD2.c();
                j.r((j) hVarD2.f4208b, fFloatValue);
                b0VarA = hVarD2.a();
            } else if (value instanceof Double) {
                h hVarD3 = j.D();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarD3.c();
                j.o((j) hVarD3.f4208b, dDoubleValue);
                b0VarA = hVarD3.a();
            } else if (value instanceof Integer) {
                h hVarD4 = j.D();
                int iIntValue = ((Number) value).intValue();
                hVarD4.c();
                j.s((j) hVarD4.f4208b, iIntValue);
                b0VarA = hVarD4.a();
            } else if (value instanceof Long) {
                h hVarD5 = j.D();
                long jLongValue = ((Number) value).longValue();
                hVarD5.c();
                j.l((j) hVarD5.f4208b, jLongValue);
                b0VarA = hVarD5.a();
            } else if (value instanceof String) {
                h hVarD6 = j.D();
                hVarD6.c();
                j.m((j) hVarD6.f4208b, (String) value);
                b0VarA = hVarD6.a();
            } else if (value instanceof Set) {
                h hVarD7 = j.D();
                v0.f fVarO = v0.g.o();
                fVarO.c();
                v0.g.l((v0.g) fVarO.f4208b, (Set) value);
                hVarD7.c();
                j.n((j) hVarD7.f4208b, (v0.g) fVarO.a());
                b0VarA = hVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                h hVarD8 = j.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.i iVarM = androidx.datastore.preferences.protobuf.j.m(bArr, 0, bArr.length);
                hVarD8.c();
                j.p((j) hVarD8.f4208b, iVarM);
                b0VarA = hVarD8.a();
            }
            cVarN.getClass();
            str.getClass();
            cVarN.c();
            v0.e.l((v0.e) cVarN.f4208b).put(str, (j) b0VarA);
        }
        v0.e eVar = (v0.e) cVarN.a();
        int iA = eVar.a(null);
        Logger logger = p.f4144g;
        if (iA > 4096) {
            iA = 4096;
        }
        p pVar = new p((h1) outputStream, iA);
        eVar.b(pVar);
        if (pVar.f4149e > 0) {
            pVar.W();
        }
        return r.f53297a;
    }
}
