package ads_mobile_sdk;

/* JADX INFO: loaded from: classes.dex */
public final class o4 {
    public final sz1 a;
    public final sz1 b;
    public final boolean c;
    public final fw d;
    public final iv0 e;

    public o4(fw fwVar, iv0 iv0Var, sz1 sz1Var, sz1 sz1Var2, boolean z) {
        this.d = fwVar;
        this.e = iv0Var;
        this.a = sz1Var;
        if (sz1Var2 == null) {
            this.b = sz1.d;
        } else {
            this.b = sz1Var2;
        }
        this.c = z;
    }

    public static o4 a(fw fwVar, iv0 iv0Var, sz1 sz1Var, sz1 sz1Var2, boolean z) {
        if (fwVar == null) {
            throw new IllegalArgumentException("CreativeType is null");
        }
        if (iv0Var == null) {
            throw new IllegalArgumentException("ImpressionType is null");
        }
        if (sz1Var == null) {
            throw new IllegalArgumentException("Impression owner is null");
        }
        if (sz1Var == sz1.d) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (fwVar == fw.b && sz1Var == sz1.b) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (iv0Var == iv0.b && sz1Var == sz1.b) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new o4(fwVar, iv0Var, sz1Var, sz1Var2, z);
    }
}
