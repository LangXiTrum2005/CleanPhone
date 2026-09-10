package be;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f0 extends com.google.gson.t {
    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.u()) {
            try {
                arrayList.add(Integer.valueOf(aVar.z()));
            } catch (NumberFormatException e10) {
                throw new com.google.gson.m(e10);
            }
        }
        aVar.o();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        bVar.h();
        int length = atomicIntegerArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.y(atomicIntegerArray.get(i10));
        }
        bVar.o();
    }
}
