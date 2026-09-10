package ql;

import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f49151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f49152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f49153g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, String str2, int i10) {
        super(1);
        this.f49151e = i10;
        this.f49152f = str;
        this.f49153g = str2;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f49151e) {
            case 0:
                n function = (n) obj;
                kotlin.jvm.internal.n.f(function, "$this$function");
                d dVar = k.f49155b;
                String str = this.f49152f;
                function.a(str, dVar);
                d dVar2 = k.f49154a;
                function.a(this.f49153g, dVar, dVar, dVar2, dVar2);
                function.c(str, dVar2);
                break;
            case 1:
                n function2 = (n) obj;
                kotlin.jvm.internal.n.f(function2, "$this$function");
                d dVar3 = k.f49155b;
                String str2 = this.f49152f;
                function2.a(str2, dVar3);
                function2.a(this.f49153g, dVar3, dVar3, dVar3);
                function2.c(str2, dVar3);
                break;
            case 2:
                n function3 = (n) obj;
                kotlin.jvm.internal.n.f(function3, "$this$function");
                d dVar4 = k.f49155b;
                String str3 = this.f49152f;
                function3.a(str3, dVar4);
                d dVar5 = k.f49156c;
                d dVar6 = k.f49154a;
                function3.a(this.f49153g, dVar4, dVar4, dVar5, dVar6);
                function3.c(str3, dVar6);
                break;
            case 3:
                n function4 = (n) obj;
                kotlin.jvm.internal.n.f(function4, "$this$function");
                d dVar7 = k.f49155b;
                String str4 = this.f49152f;
                function4.a(str4, dVar7);
                d dVar8 = k.f49156c;
                function4.a(str4, dVar8);
                d dVar9 = k.f49154a;
                function4.a(this.f49153g, dVar7, dVar8, dVar8, dVar9);
                function4.c(str4, dVar9);
                break;
            case 4:
                n function5 = (n) obj;
                kotlin.jvm.internal.n.f(function5, "$this$function");
                d dVar10 = k.f49156c;
                function5.a(this.f49152f, dVar10);
                function5.c(this.f49153g, k.f49155b, dVar10);
                break;
            default:
                n function6 = (n) obj;
                kotlin.jvm.internal.n.f(function6, "$this$function");
                function6.a(this.f49152f, k.f49154a);
                function6.c(this.f49153g, k.f49155b, k.f49156c);
                break;
        }
        return r.f53297a;
    }
}
