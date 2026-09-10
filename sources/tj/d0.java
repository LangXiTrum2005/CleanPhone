package tj;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0 implements xi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lj.l0 f50817b;

    public /* synthetic */ d0(lj.l0 l0Var, int i10) {
        this.f50816a = i10;
        this.f50817b = l0Var;
    }

    @Override // xi.c
    public final void e(Object obj) {
        int i10 = this.f50816a;
        jk.b bVar = this.f50817b.f45408b;
        switch (i10) {
            case 0:
                if (!(obj instanceof List)) {
                    bVar.invoke(new j0(t9.e.c(new a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt'.", ""))));
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        bVar.invoke(new j0((String) list.get(0)));
                    } else {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        bVar.invoke(new j0(t9.e.c(new a((String) obj2, (String) obj3, (String) list.get(2)))));
                    }
                }
                break;
            case 1:
                if (!(obj instanceof List)) {
                    bVar.invoke(new j0(t9.e.c(new a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert'.", ""))));
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        bVar.invoke(new j0(wj.r.f53297a));
                    } else {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                        bVar.invoke(new j0(t9.e.c(new a((String) obj4, (String) obj5, (String) list2.get(2)))));
                    }
                }
                break;
            case 2:
                if (!(obj instanceof List)) {
                    bVar.invoke(new j0(t9.e.c(new a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser'.", ""))));
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                        bVar.invoke(new j0(t9.e.c(new a((String) obj6, (String) obj7, (String) list3.get(2)))));
                    } else if (list3.get(0) != null) {
                        Object obj8 = list3.get(0);
                        kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        bVar.invoke(new j0((List) obj8));
                    } else {
                        bVar.invoke(new j0(t9.e.c(new a("null-error", "Flutter api returned null value for non-null return value.", ""))));
                    }
                }
                break;
            default:
                if (!(obj instanceof List)) {
                    bVar.invoke(new j0(t9.e.c(new a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm'.", ""))));
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj9 = list4.get(0);
                        kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                        bVar.invoke(new j0(t9.e.c(new a((String) obj9, (String) obj10, (String) list4.get(2)))));
                    } else if (list4.get(0) != null) {
                        Object obj11 = list4.get(0);
                        kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                        bVar.invoke(new j0((Boolean) obj11));
                    } else {
                        bVar.invoke(new j0(t9.e.c(new a("null-error", "Flutter api returned null value for non-null return value.", ""))));
                    }
                }
                break;
        }
    }
}
