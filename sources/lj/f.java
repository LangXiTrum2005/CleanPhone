package lj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements xi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f45365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f45366c;

    public /* synthetic */ f(l0 l0Var, String str, int i10) {
        this.f45364a = i10;
        this.f45365b = l0Var;
        this.f45366c = str;
    }

    @Override // xi.c
    public final void e(Object obj) {
        switch (this.f45364a) {
            case 0:
                jk.b bVar = this.f45365b.f45408b;
                if (!(obj instanceof List)) {
                    String channelName = this.f45366c;
                    kotlin.jvm.internal.n.f(channelName, "channelName");
                    bVar.invoke(new m0(t9.e.c(new b("channel-error", defpackage.e.o("Unable to establish connection on channel: '", channelName, "'."), ""))));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        bVar.invoke(new m0(wj.r.f53297a));
                    } else {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        bVar.invoke(new m0(t9.e.c(new b((String) obj2, (String) obj3, (String) list.get(2)))));
                    }
                }
                break;
            case 1:
                jk.b bVar2 = this.f45365b.f45408b;
                if (!(obj instanceof List)) {
                    String channelName2 = this.f45366c;
                    kotlin.jvm.internal.n.f(channelName2, "channelName");
                    bVar2.invoke(new m0(t9.e.c(new b("channel-error", defpackage.e.o("Unable to establish connection on channel: '", channelName2, "'."), ""))));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        bVar2.invoke(new m0(wj.r.f53297a));
                    } else {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                        bVar2.invoke(new m0(t9.e.c(new b((String) obj4, (String) obj5, (String) list2.get(2)))));
                    }
                }
                break;
            default:
                jk.b bVar3 = this.f45365b.f45408b;
                if (!(obj instanceof List)) {
                    String channelName3 = this.f45366c;
                    kotlin.jvm.internal.n.f(channelName3, "channelName");
                    bVar3.invoke(new m0(t9.e.c(new b("channel-error", defpackage.e.o("Unable to establish connection on channel: '", channelName3, "'."), ""))));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        bVar3.invoke(new m0(wj.r.f53297a));
                    } else {
                        Object obj6 = list3.get(0);
                        kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                        bVar3.invoke(new m0(t9.e.c(new b((String) obj6, (String) obj7, (String) list3.get(2)))));
                    }
                }
                break;
        }
    }
}
