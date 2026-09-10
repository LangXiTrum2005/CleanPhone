package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f22869b = new l0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22870a;

    public /* synthetic */ l0(int i10) {
        this.f22870a = i10;
    }

    @Override // com.google.android.gms.internal.auth.b1
    public final k1 a(Class cls) {
        switch (this.f22870a) {
            case 0:
                if (!m0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (k1) m0.a(cls.asSubclass(m0.class)).h(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.auth.b1
    public final boolean b(Class cls) {
        switch (this.f22870a) {
            case 0:
                return m0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
