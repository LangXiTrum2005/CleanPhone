package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC0457m5;
import com.ironsource.Jb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface o extends InterfaceC0457m5<String> {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29502a;

        public a(String rowAdm) {
            kotlin.jvm.internal.n.f(rowAdm, "rowAdm");
            this.f29502a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC0457m5
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f29502a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(Jb<String, T> mapper) {
            kotlin.jvm.internal.n.f(mapper, "mapper");
            return mapper.a(this.f29502a);
        }
    }

    <T> T a(Jb<String, T> jb2);
}
