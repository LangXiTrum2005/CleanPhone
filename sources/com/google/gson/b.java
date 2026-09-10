package com.google.gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f24740b;

    public /* synthetic */ b(t tVar, int i10) {
        this.f24739a = i10;
        this.f24740b = tVar;
    }

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        switch (this.f24739a) {
            case 0:
                return new AtomicLong(((Number) this.f24740b.b(aVar)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.u()) {
                    arrayList.add(Long.valueOf(((Number) this.f24740b.b(aVar)).longValue()));
                }
                aVar.o();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        switch (this.f24739a) {
            case 0:
                this.f24740b.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.h();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.f24740b.c(bVar, Long.valueOf(atomicLongArray.get(i10)));
                }
                bVar.o();
                break;
        }
    }
}
