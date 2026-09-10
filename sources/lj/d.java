package lj;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.GetBillingConfigParams;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f45357a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wj.j f45358b = r9.b.u(new defpackage.c(12));

    public static xi.l a() {
        return (xi.l) f45358b.getValue();
    }

    public static void b(xi.f binaryMessenger, final i iVar) {
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        Object obj = null;
        k5.g gVar = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isReady", ""), a(), obj);
        if (iVar != null) {
            final int i10 = 4;
            gVar.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i10) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar2 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar2, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar2, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.startConnection", ""), a(), obj);
        if (iVar != null) {
            final int i11 = 8;
            gVar2.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar3 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar3, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar3, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.endConnection", ""), a(), obj);
        if (iVar != null) {
            final int i12 = 9;
            gVar3.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar4 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar4, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar4, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.getBillingConfigAsync", ""), a(), obj);
        if (iVar != null) {
            final int i13 = 10;
            gVar4.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar5 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar5, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar5, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar4.C(null);
        }
        k5.g gVar5 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.launchBillingFlow", ""), a(), obj);
        if (iVar != null) {
            final int i14 = 11;
            gVar5.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i14) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar6 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar6, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar6, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar5.C(null);
        }
        k5.g gVar6 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.acknowledgePurchase", ""), a(), obj);
        if (iVar != null) {
            final int i15 = 12;
            gVar6.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar7 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar7, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar7, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar6.C(null);
        }
        k5.g gVar7 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.consumeAsync", ""), a(), obj);
        if (iVar != null) {
            final int i16 = 0;
            gVar7.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i16) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar8 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar8, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar8, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar7.C(null);
        }
        k5.g gVar8 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchasesAsync", ""), a(), obj);
        if (iVar != null) {
            final int i17 = 1;
            gVar8.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i17) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar9 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar9, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar9, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar8.C(null);
        }
        k5.g gVar9 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryProductDetailsAsync", ""), a(), obj);
        if (iVar != null) {
            final int i18 = 2;
            gVar9.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i18) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar10 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar10, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar10, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar9.C(null);
        }
        k5.g gVar10 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isFeatureSupported", ""), a(), obj);
        if (iVar != null) {
            final int i19 = 3;
            gVar10.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i19) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar11 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar11, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar11, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar10.C(null);
        }
        k5.g gVar11 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync", ""), a(), obj);
        if (iVar != null) {
            final int i20 = 5;
            gVar11.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i20) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar12 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar12, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar12, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar11.C(null);
        }
        k5.g gVar12 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.showAlternativeBillingOnlyInformationDialog", ""), a(), obj);
        if (iVar != null) {
            final int i21 = 6;
            gVar12.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i21) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar13 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar13, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar13, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        } else {
            gVar12.C(null);
        }
        k5.g gVar13 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync", ""), a(), obj);
        if (iVar == null) {
            gVar13.C(null);
        } else {
            final int i22 = 7;
            gVar13.C(new xi.b() { // from class: lj.c
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    String str;
                    List listQ;
                    List listQ2;
                    List listQ3;
                    List listQ4;
                    switch (i22) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            hj.b bVar2 = new hj.b(bVar, 14);
                            i iVar2 = (i) iVar;
                            if (iVar2.f45387a == null) {
                                x7.a.f(bVar2, i.a());
                                return;
                            }
                            try {
                                iVar2.f45387a.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str2).build(), new k3.j(bVar2, 7));
                                return;
                            } catch (RuntimeException e10) {
                                x7.a.f(bVar2, new b("error", e10.getMessage(), Log.getStackTraceString(e10)));
                                return;
                            }
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformProductType");
                            y yVar = (y) obj4;
                            hj.b bVar3 = new hj.b(bVar, 11);
                            i iVar3 = (i) iVar;
                            if (iVar3.f45387a == null) {
                                x7.a.f(bVar3, i.a());
                                return;
                            }
                            try {
                                QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
                                int iOrdinal = yVar.ordinal();
                                if (iOrdinal == 0) {
                                    str = "inapp";
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new aa.b((byte) 0, 20);
                                    }
                                    str = "subs";
                                }
                                builderNewBuilder.setProductType(str);
                                iVar3.f45387a.queryPurchasesAsync(builderNewBuilder.build(), new k3.j(bVar3, 5));
                                return;
                            } catch (RuntimeException e11) {
                                x7.a.f(bVar3, new b("error", e11.getMessage(), Log.getStackTraceString(e11)));
                                return;
                            }
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.collections.List<io.flutter.plugins.inapppurchase.PlatformQueryProduct>");
                            List list = (List) obj5;
                            hj.b bVar4 = new hj.b(bVar, 13);
                            i iVar4 = (i) iVar;
                            if (iVar4.f45387a == null) {
                                x7.a.f(bVar4, i.a());
                                return;
                            }
                            try {
                                iVar4.f45387a.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(n0.c(list)).build(), new cj.h(19, iVar4, bVar4));
                                return;
                            } catch (RuntimeException e12) {
                                x7.a.f(bVar4, new b("error", e12.getMessage(), Log.getStackTraceString(e12)));
                                return;
                            }
                        case 3:
                            e eVar = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingClientFeature");
                            try {
                                listQ = j1.f.C(Boolean.valueOf(((i) eVar).b((m) obj6)));
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar5 = th2;
                                    listQ = xj.o.Q(bVar5.f45344a, bVar5.f45345b, bVar5.f45346c);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            return;
                        case 4:
                            try {
                                BillingClient billingClient = ((i) iVar).f45387a;
                                if (billingClient == null) {
                                    throw i.a();
                                }
                                listQ2 = j1.f.C(Boolean.valueOf(billingClient.isReady()));
                                bVar.e(listQ2);
                                return;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar6 = th3;
                                    listQ2 = xj.o.Q(bVar6.f45344a, bVar6.f45345b, bVar6.f45346c);
                                } else {
                                    listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            break;
                        case 5:
                            hj.b bVar7 = new hj.b(bVar, 6);
                            BillingClient billingClient2 = ((i) iVar).f45387a;
                            if (billingClient2 == null) {
                                x7.a.f(bVar7, i.a());
                                return;
                            }
                            try {
                                billingClient2.isAlternativeBillingOnlyAvailableAsync(new k3.j(bVar7, 9));
                                return;
                            } catch (RuntimeException e13) {
                                x7.a.f(bVar7, new b("error", e13.getMessage(), Log.getStackTraceString(e13)));
                                return;
                            }
                        case 6:
                            hj.b bVar8 = new hj.b(bVar, 7);
                            i iVar5 = (i) iVar;
                            BillingClient billingClient3 = iVar5.f45387a;
                            if (billingClient3 == null) {
                                x7.a.f(bVar8, i.a());
                                return;
                            }
                            Activity activity = iVar5.f45389c;
                            if (activity == null) {
                                x7.a.f(bVar8, new b("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null));
                                return;
                            }
                            try {
                                billingClient3.showAlternativeBillingOnlyInformationDialog(activity, new k3.j(bVar8, 8));
                                return;
                            } catch (RuntimeException e14) {
                                x7.a.f(bVar8, new b("error", e14.getMessage(), Log.getStackTraceString(e14)));
                                return;
                            }
                        case 7:
                            hj.b bVar9 = new hj.b(bVar, 9);
                            BillingClient billingClient4 = ((i) iVar).f45387a;
                            if (billingClient4 == null) {
                                x7.a.f(bVar9, i.a());
                                return;
                            }
                            try {
                                billingClient4.createAlternativeBillingOnlyReportingDetailsAsync(new k3.j(bVar9, 3));
                                return;
                            } catch (RuntimeException e15) {
                                x7.a.f(bVar9, new b("error", e15.getMessage(), Log.getStackTraceString(e15)));
                                return;
                            }
                        case 8:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj7 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj7).longValue();
                            Object obj8 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingChoiceMode");
                            l lVar = (l) obj8;
                            Object obj9 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformPendingPurchasesParams");
                            u uVar = (u) obj9;
                            hj.b bVar10 = new hj.b(bVar, 12);
                            i iVar6 = (i) iVar;
                            if (iVar6.f45387a == null) {
                                a aVar = iVar6.f45388b;
                                Context context = iVar6.f45390d;
                                g gVar14 = iVar6.f45391e;
                                aVar.getClass();
                                BillingClient.Builder builderNewBuilder2 = BillingClient.newBuilder(context);
                                PendingPurchasesParams.Builder builderEnableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
                                kotlin.jvm.internal.n.e(builderEnableOneTimeProducts, "enableOneTimeProducts(...)");
                                if (uVar.f45448a) {
                                    builderEnableOneTimeProducts.enablePrepaidPlans();
                                }
                                PendingPurchasesParams pendingPurchasesParamsBuild = builderEnableOneTimeProducts.build();
                                kotlin.jvm.internal.n.e(pendingPurchasesParamsBuild, "build(...)");
                                BillingClient.Builder builderEnablePendingPurchases = builderNewBuilder2.enablePendingPurchases(pendingPurchasesParamsBuild);
                                int iOrdinal2 = lVar.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        builderEnablePendingPurchases.enableAlternativeBillingOnly();
                                    } else if (iOrdinal2 != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + lVar + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        builderEnablePendingPurchases.enableUserChoiceBilling(new k3.j(gVar14, 2));
                                    }
                                }
                                iVar6.f45387a = builderEnablePendingPurchases.setListener(new n5.f(gVar14, 25)).build();
                            }
                            try {
                                iVar6.f45387a.startConnection(new l7.l0(iVar6, bVar10, jLongValue));
                                return;
                            } catch (RuntimeException e16) {
                                x7.a.f(bVar10, new b("error", e16.getMessage(), Log.getStackTraceString(e16)));
                                return;
                            }
                        case 9:
                            try {
                                i iVar7 = (i) iVar;
                                BillingClient billingClient5 = iVar7.f45387a;
                                if (billingClient5 != null) {
                                    billingClient5.endConnection();
                                    iVar7.f45387a = null;
                                }
                                listQ3 = j1.f.C(null);
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar11 = th4;
                                    listQ3 = xj.o.Q(bVar11.f45344a, bVar11.f45345b, bVar11.f45346c);
                                } else {
                                    listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            bVar.e(listQ3);
                            return;
                        case 10:
                            hj.b bVar12 = new hj.b(bVar, 10);
                            BillingClient billingClient6 = ((i) iVar).f45387a;
                            if (billingClient6 == null) {
                                x7.a.f(bVar12, i.a());
                                return;
                            }
                            try {
                                billingClient6.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), new k3.j(bVar12, 4));
                                return;
                            } catch (RuntimeException e17) {
                                x7.a.f(bVar12, new b("error", e17.getMessage(), Log.getStackTraceString(e17)));
                                return;
                            }
                        case 11:
                            e eVar2 = iVar;
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj10 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.inapppurchase.PlatformBillingFlowParams");
                            try {
                                listQ4 = j1.f.C(((i) eVar2).c((o) obj10));
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar13 = th5;
                                    listQ4 = xj.o.Q(bVar13.f45344a, bVar13.f45345b, bVar13.f45346c);
                                } else {
                                    listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            bVar.e(listQ4);
                            return;
                        default:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj11 = ((List) obj2).get(0);
                            kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj11;
                            hj.b bVar14 = new hj.b(bVar, 8);
                            i iVar8 = (i) iVar;
                            if (iVar8.f45387a == null) {
                                x7.a.f(bVar14, i.a());
                                return;
                            }
                            try {
                                iVar8.f45387a.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str3).build(), new k3.j(bVar14, 6));
                                return;
                            } catch (RuntimeException e18) {
                                x7.a.f(bVar14, new b("error", e18.getMessage(), Log.getStackTraceString(e18)));
                                return;
                            }
                    }
                }
            });
        }
    }
}
