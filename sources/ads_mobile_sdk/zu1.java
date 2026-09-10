package ads_mobile_sdk;

import java.util.UUID;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;
import saneness.labourwallah;

/* JADX INFO: loaded from: classes.dex */
public final class zu1 extends Lambda implements Function0 {
    public final /* synthetic */ String a;
    public final /* synthetic */ lv1 b;
    public final /* synthetic */ gq0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ fw e;
    public final /* synthetic */ iv0 f;
    public final /* synthetic */ sz1 g;
    public final /* synthetic */ sz1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu1(String str, lv1 lv1Var, gq0 gq0Var, String str2, fw fwVar, iv0 iv0Var, sz1 sz1Var, sz1 sz1Var2) {
        super(0);
        this.a = str;
        this.b = lv1Var;
        this.c = gq0Var;
        this.d = str2;
        this.e = fwVar;
        this.f = iv0Var;
        this.g = sz1Var;
        this.h = sz1Var2;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        p4 p4VarB = p4.b(w02.a(this.a, this.b.h), this.c, this.d, "");
        o4 o4VarA = o4.a(this.e, this.f, this.g, this.h, true);
        labourwallah.attabal();
        return new r4(o4VarA, p4VarB, UUID.randomUUID().toString());
    }
}
