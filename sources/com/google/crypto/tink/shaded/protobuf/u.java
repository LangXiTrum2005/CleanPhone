package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f24640b = new u(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24641a;

    public /* synthetic */ u(int i10) {
        this.f24641a = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final y0 a(Class cls) {
        switch (this.f24641a) {
            case 0:
                if (!x.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (y0) x.j(cls.asSubclass(x.class)).i(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public final boolean b(Class cls) {
        switch (this.f24641a) {
            case 0:
                return x.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
