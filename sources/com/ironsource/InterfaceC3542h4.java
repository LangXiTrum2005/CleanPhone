package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3542h4 {

    /* JADX INFO: renamed from: com.ironsource.h4$a */
    public static final class a implements InterfaceC3542h4 {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // com.ironsource.InterfaceC3542h4
        public void a() {
            C3773u8.a(Ud.x, new C3689p8().a(A5.y, Boolean.valueOf(this.a)).a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.h4$b */
    public static final class b implements InterfaceC3542h4 {
        private final boolean a;
        private final long b;
        private final InterfaceC3667o4 c;

        public b(boolean z, long j, InterfaceC3667o4 currentTimeProvider) {
            Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
            this.a = z;
            this.b = j;
            this.c = currentTimeProvider;
        }

        @Override // com.ironsource.InterfaceC3542h4
        public void a() {
            C3689p8 c3689p8A = new C3689p8().a(A5.y, Boolean.valueOf(this.a));
            if (this.b > 0) {
                c3689p8A.a(A5.B, Long.valueOf(this.c.a() - this.b));
            }
            C3773u8.a(Ud.w, c3689p8A.a());
        }

        public final InterfaceC3667o4 b() {
            return this.c;
        }
    }

    void a();
}
