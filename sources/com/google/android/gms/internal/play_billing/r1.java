package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r1 f24459b = new r1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24460a;

    public /* synthetic */ r1(int i10) {
        this.f24460a = i10;
    }

    public static final i2 c(Object obj, Object obj2) {
        i2 i2Var = (i2) obj;
        i2 i2Var2 = (i2) obj2;
        if (!i2Var2.isEmpty()) {
            if (!i2Var.f24289a) {
                if (i2Var.isEmpty()) {
                    i2Var = new i2();
                } else {
                    i2 i2Var3 = new i2(i2Var);
                    i2Var3.f24289a = true;
                    i2Var = i2Var3;
                }
            }
            i2Var.g();
            if (!i2Var2.isEmpty()) {
                i2Var.putAll(i2Var2);
            }
        }
        return i2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    public r2 a(Class cls) {
        switch (this.f24460a) {
            case 0:
                if (!t1.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (r2) t1.h(cls.asSubclass(t1.class)).d(3);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    public boolean b(Class cls) {
        switch (this.f24460a) {
            case 0:
                return t1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
