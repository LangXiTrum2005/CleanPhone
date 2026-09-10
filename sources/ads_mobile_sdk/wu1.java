package ads_mobile_sdk;

import java.util.UUID;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;
import saneness.labourwallah;

/* JADX INFO: loaded from: classes.dex */
public final class wu1 extends Lambda implements Function0 {
    public final /* synthetic */ lv1 a;
    public final /* synthetic */ gq0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fw d;
    public final /* synthetic */ iv0 e;
    public final /* synthetic */ sz1 f;
    public final /* synthetic */ sz1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu1(lv1 lv1Var, gq0 gq0Var, String str, fw fwVar, iv0 iv0Var, sz1 sz1Var, sz1 sz1Var2) {
        super(0);
        this.a = lv1Var;
        this.b = gq0Var;
        this.c = str;
        this.d = fwVar;
        this.e = iv0Var;
        this.f = sz1Var;
        this.g = sz1Var2;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        p4 p4VarA = p4.a(this.a.j, this.b, this.c, "");
        o4 o4VarA = o4.a(this.d, this.e, this.f, this.g, true);
        labourwallah.attabal();
        return new r4(o4VarA, p4VarA, UUID.randomUUID().toString());
    }
}
