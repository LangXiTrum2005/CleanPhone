package zl;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements v {
    static {
        int i10 = g.f55039b;
    }

    public final a b(ByteArrayInputStream byteArrayInputStream, g gVar) throws q {
        a aVar;
        try {
            int i10 = byteArrayInputStream.read();
            if (i10 == -1) {
                aVar = null;
            } else {
                if ((i10 & 128) != 0) {
                    i10 &= 127;
                    int i11 = 7;
                    while (true) {
                        if (i11 < 32) {
                            int i12 = byteArrayInputStream.read();
                            if (i12 == -1) {
                                throw q.d();
                            }
                            i10 |= (i12 & 127) << i11;
                            if ((i12 & 128) == 0) {
                                break;
                            }
                            i11 += 7;
                        } else {
                            while (true) {
                                if (i11 >= 64) {
                                    throw new q("CodedInputStream encountered a malformed varint.");
                                }
                                int i13 = byteArrayInputStream.read();
                                if (i13 == -1) {
                                    throw q.d();
                                }
                                if ((i13 & 128) == 0) {
                                    break;
                                }
                                i11 += 7;
                            }
                        }
                    }
                }
                e eVar = new e(new a7.m(byteArrayInputStream, i10));
                aVar = (a) a(eVar, gVar);
                try {
                    eVar.a(0);
                } catch (q e10) {
                    e10.f55076a = aVar;
                    throw e10;
                }
            }
            if (aVar == null || aVar.isInitialized()) {
                return aVar;
            }
            q qVar = new q(new aa.b().getMessage());
            qVar.f55076a = aVar;
            throw qVar;
        } catch (IOException e11) {
            throw new q(e11.getMessage());
        }
    }
}
