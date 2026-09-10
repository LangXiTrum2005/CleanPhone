package kj;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.a1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f44673a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wj.j f44674b = r9.b.u(new defpackage.c(11));

    public static void a(xi.f binaryMessenger, final p pVar) {
        kotlin.jvm.internal.n.f(binaryMessenger, "binaryMessenger");
        ne.c cVarH = binaryMessenger.h(new xi.k());
        String strN = defpackage.e.n("dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages", "");
        wj.j jVar = f44674b;
        k5.g gVar = new k5.g(binaryMessenger, strN, (xi.l) jVar.getValue(), cVarH);
        Object obj = null;
        if (pVar != null) {
            final int i10 = 0;
            gVar.C(new xi.b() { // from class: kj.f
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    List listQ;
                    switch (i10) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar = (t) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                            q qVar = (q) obj4;
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar = (e) obj5;
                            hj.b bVar2 = new hj.b(bVar, 3);
                            fc.f fVar = ((p) pVar).f44702b;
                            n nVar = (fVar == null || ((Activity) fVar.f40781c) == null) ? null : (n) fVar.f40782d;
                            if (nVar == null) {
                                com.bumptech.glide.c.d(bVar2, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                od.c cVar = nVar.f44692e;
                                Activity activity = nVar.f44689b;
                                s sVar = tVar.f44711b;
                                if (sVar != null) {
                                    nVar.f44696i = sVar.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z10 = eVar.f44668a;
                                boolean z11 = eVar.f44669b;
                                i.e eVar2 = i.e.f42482a;
                                i.d dVar = i.d.f42481a;
                                i.c cVar2 = i.c.f42480a;
                                if (z10) {
                                    int iE = b6.d.e(eVar);
                                    if (!nVar.j(qVar, null, bVar2)) {
                                        n.a(bVar2);
                                    } else {
                                        if (z11) {
                                            i.b bVar3 = new i.b(iE);
                                            int iG = b6.d.g();
                                            h.k kVar = new h.k();
                                            kVar.f42073a = dVar;
                                            b6.d.g();
                                            kVar.f42073a = eVar2;
                                            kVar.f42074b = iG;
                                            kVar.f42075c = cVar2;
                                            intent2 = bVar3.d(activity, kVar);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f44710a.ordinal();
                                    if (iOrdinal == 0) {
                                        if (!nVar.j(qVar, null, bVar2)) {
                                            n.a(bVar2);
                                        } else {
                                            if (cVar == null ? false : b6.d.m((Activity) cVar.f47386b)) {
                                                if (!(b0.b.a((Activity) cVar.f47386b, "android.permission.CAMERA") == 0)) {
                                                    b0.b.i((Activity) cVar.f47386b, new String[]{"android.permission.CAMERA"}, 2345);
                                                }
                                            }
                                            nVar.h();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        if (!nVar.j(qVar, null, bVar2)) {
                                            n.a(bVar2);
                                        } else {
                                            if (z11) {
                                                a1 a1Var = new a1(1);
                                                int iG2 = b6.d.g();
                                                h.k kVar2 = new h.k();
                                                kVar2.f42073a = dVar;
                                                b6.d.g();
                                                kVar2.f42073a = eVar2;
                                                kVar2.f42074b = iG2;
                                                kVar2.f42075c = cVar2;
                                                intent = a1Var.d(activity, kVar2);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar2 = (t) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.VideoSelectionOptions");
                            v vVar = (v) obj7;
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar3 = (e) obj8;
                            hj.b bVar4 = new hj.b(bVar, 5);
                            fc.f fVar2 = ((p) pVar).f44702b;
                            n nVar2 = (fVar2 == null || ((Activity) fVar2.f40781c) == null) ? null : (n) fVar2.f40782d;
                            if (nVar2 == null) {
                                com.bumptech.glide.c.d(bVar4, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                od.c cVar3 = nVar2.f44692e;
                                Activity activity2 = nVar2.f44689b;
                                s sVar2 = tVar2.f44711b;
                                if (sVar2 != null) {
                                    nVar2.f44696i = sVar2.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z12 = eVar3.f44668a;
                                boolean z13 = eVar3.f44669b;
                                i.f fVar3 = i.f.f42483a;
                                i.d dVar2 = i.d.f42481a;
                                i.c cVar4 = i.c.f42480a;
                                if (z12) {
                                    int iE2 = b6.d.e(eVar3);
                                    if (!nVar2.j(null, vVar, bVar4)) {
                                        n.a(bVar4);
                                    } else {
                                        if (z13) {
                                            i.b bVar5 = new i.b(iE2);
                                            int iG3 = b6.d.g();
                                            h.k kVar3 = new h.k();
                                            kVar3.f42073a = dVar2;
                                            b6.d.g();
                                            kVar3.f42073a = fVar3;
                                            kVar3.f42074b = iG3;
                                            kVar3.f42075c = cVar4;
                                            intent4 = bVar5.d(activity2, kVar3);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f44710a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        if (!nVar2.j(null, vVar, bVar4)) {
                                            n.a(bVar4);
                                        } else {
                                            if (cVar3 == null ? false : b6.d.m((Activity) cVar3.f47386b)) {
                                                if (!(b0.b.a((Activity) cVar3.f47386b, "android.permission.CAMERA") == 0)) {
                                                    b0.b.i((Activity) cVar3.f47386b, new String[]{"android.permission.CAMERA"}, 2355);
                                                }
                                            }
                                            nVar2.i();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        if (!nVar2.j(null, vVar, bVar4)) {
                                            n.a(bVar4);
                                        } else {
                                            if (z13) {
                                                a1 a1Var2 = new a1(1);
                                                int iG4 = b6.d.g();
                                                h.k kVar4 = new h.k();
                                                kVar4.f42073a = dVar2;
                                                b6.d.g();
                                                kVar4.f42073a = fVar3;
                                                kVar4.f42074b = iG4;
                                                kVar4.f42075c = cVar4;
                                                intent3 = a1Var2.d(activity2, kVar4);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.MediaSelectionOptions");
                            r rVar = (r) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar4 = (e) obj10;
                            hj.b bVar6 = new hj.b(bVar, 4);
                            fc.f fVar4 = ((p) pVar).f44702b;
                            n nVar3 = (fVar4 == null || ((Activity) fVar4.f40781c) == null) ? null : (n) fVar4.f40782d;
                            if (nVar3 == null) {
                                com.bumptech.glide.c.d(bVar6, new d("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!nVar3.j(rVar.f44706a, null, bVar6)) {
                                n.a(bVar6);
                            } else {
                                Activity activity3 = nVar3.f44689b;
                                boolean z14 = eVar4.f44669b;
                                boolean z15 = eVar4.f44668a;
                                if (z14) {
                                    i.c cVar5 = i.c.f42480a;
                                    i.d dVar3 = i.d.f42481a;
                                    if (z15) {
                                        i.b bVar7 = new i.b(b6.d.e(eVar4));
                                        int iG5 = b6.d.g();
                                        h.k kVar5 = new h.k();
                                        kVar5.f42073a = dVar3;
                                        b6.d.g();
                                        kVar5.f42073a = dVar3;
                                        kVar5.f42074b = iG5;
                                        kVar5.f42075c = cVar5;
                                        intent5 = bVar7.d(activity3, kVar5);
                                    } else {
                                        a1 a1Var3 = new a1(1);
                                        int iG6 = b6.d.g();
                                        h.k kVar6 = new h.k();
                                        kVar6.f42073a = dVar3;
                                        b6.d.g();
                                        kVar6.f42073a = dVar3;
                                        kVar6.f42074b = iG6;
                                        kVar6.f42075c = cVar5;
                                        intent5 = a1Var3.d(activity3, kVar6);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", z15);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            try {
                                listQ = j1.f.C(((p) pVar).a());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof d) {
                                    d dVar4 = th2;
                                    listQ = xj.o.Q(dVar4.f44666a, dVar4.f44667b, null);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                    }
                }
            });
        } else {
            gVar.C(null);
        }
        k5.g gVar2 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos", ""), (xi.l) jVar.getValue(), cVarH);
        if (pVar != null) {
            final int i11 = 1;
            gVar2.C(new xi.b() { // from class: kj.f
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    List listQ;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar = (t) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                            q qVar = (q) obj4;
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar = (e) obj5;
                            hj.b bVar2 = new hj.b(bVar, 3);
                            fc.f fVar = ((p) pVar).f44702b;
                            n nVar = (fVar == null || ((Activity) fVar.f40781c) == null) ? null : (n) fVar.f40782d;
                            if (nVar == null) {
                                com.bumptech.glide.c.d(bVar2, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                od.c cVar = nVar.f44692e;
                                Activity activity = nVar.f44689b;
                                s sVar = tVar.f44711b;
                                if (sVar != null) {
                                    nVar.f44696i = sVar.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z10 = eVar.f44668a;
                                boolean z11 = eVar.f44669b;
                                i.e eVar2 = i.e.f42482a;
                                i.d dVar = i.d.f42481a;
                                i.c cVar2 = i.c.f42480a;
                                if (z10) {
                                    int iE = b6.d.e(eVar);
                                    if (!nVar.j(qVar, null, bVar2)) {
                                        n.a(bVar2);
                                    } else {
                                        if (z11) {
                                            i.b bVar3 = new i.b(iE);
                                            int iG = b6.d.g();
                                            h.k kVar = new h.k();
                                            kVar.f42073a = dVar;
                                            b6.d.g();
                                            kVar.f42073a = eVar2;
                                            kVar.f42074b = iG;
                                            kVar.f42075c = cVar2;
                                            intent2 = bVar3.d(activity, kVar);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f44710a.ordinal();
                                    if (iOrdinal == 0) {
                                        if (!nVar.j(qVar, null, bVar2)) {
                                            n.a(bVar2);
                                        } else {
                                            if (cVar == null ? false : b6.d.m((Activity) cVar.f47386b)) {
                                                if (!(b0.b.a((Activity) cVar.f47386b, "android.permission.CAMERA") == 0)) {
                                                    b0.b.i((Activity) cVar.f47386b, new String[]{"android.permission.CAMERA"}, 2345);
                                                }
                                            }
                                            nVar.h();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        if (!nVar.j(qVar, null, bVar2)) {
                                            n.a(bVar2);
                                        } else {
                                            if (z11) {
                                                a1 a1Var = new a1(1);
                                                int iG2 = b6.d.g();
                                                h.k kVar2 = new h.k();
                                                kVar2.f42073a = dVar;
                                                b6.d.g();
                                                kVar2.f42073a = eVar2;
                                                kVar2.f42074b = iG2;
                                                kVar2.f42075c = cVar2;
                                                intent = a1Var.d(activity, kVar2);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar2 = (t) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.VideoSelectionOptions");
                            v vVar = (v) obj7;
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar3 = (e) obj8;
                            hj.b bVar4 = new hj.b(bVar, 5);
                            fc.f fVar2 = ((p) pVar).f44702b;
                            n nVar2 = (fVar2 == null || ((Activity) fVar2.f40781c) == null) ? null : (n) fVar2.f40782d;
                            if (nVar2 == null) {
                                com.bumptech.glide.c.d(bVar4, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                od.c cVar3 = nVar2.f44692e;
                                Activity activity2 = nVar2.f44689b;
                                s sVar2 = tVar2.f44711b;
                                if (sVar2 != null) {
                                    nVar2.f44696i = sVar2.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z12 = eVar3.f44668a;
                                boolean z13 = eVar3.f44669b;
                                i.f fVar3 = i.f.f42483a;
                                i.d dVar2 = i.d.f42481a;
                                i.c cVar4 = i.c.f42480a;
                                if (z12) {
                                    int iE2 = b6.d.e(eVar3);
                                    if (!nVar2.j(null, vVar, bVar4)) {
                                        n.a(bVar4);
                                    } else {
                                        if (z13) {
                                            i.b bVar5 = new i.b(iE2);
                                            int iG3 = b6.d.g();
                                            h.k kVar3 = new h.k();
                                            kVar3.f42073a = dVar2;
                                            b6.d.g();
                                            kVar3.f42073a = fVar3;
                                            kVar3.f42074b = iG3;
                                            kVar3.f42075c = cVar4;
                                            intent4 = bVar5.d(activity2, kVar3);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f44710a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        if (!nVar2.j(null, vVar, bVar4)) {
                                            n.a(bVar4);
                                        } else {
                                            if (cVar3 == null ? false : b6.d.m((Activity) cVar3.f47386b)) {
                                                if (!(b0.b.a((Activity) cVar3.f47386b, "android.permission.CAMERA") == 0)) {
                                                    b0.b.i((Activity) cVar3.f47386b, new String[]{"android.permission.CAMERA"}, 2355);
                                                }
                                            }
                                            nVar2.i();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        if (!nVar2.j(null, vVar, bVar4)) {
                                            n.a(bVar4);
                                        } else {
                                            if (z13) {
                                                a1 a1Var2 = new a1(1);
                                                int iG4 = b6.d.g();
                                                h.k kVar4 = new h.k();
                                                kVar4.f42073a = dVar2;
                                                b6.d.g();
                                                kVar4.f42073a = fVar3;
                                                kVar4.f42074b = iG4;
                                                kVar4.f42075c = cVar4;
                                                intent3 = a1Var2.d(activity2, kVar4);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.MediaSelectionOptions");
                            r rVar = (r) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar4 = (e) obj10;
                            hj.b bVar6 = new hj.b(bVar, 4);
                            fc.f fVar4 = ((p) pVar).f44702b;
                            n nVar3 = (fVar4 == null || ((Activity) fVar4.f40781c) == null) ? null : (n) fVar4.f40782d;
                            if (nVar3 == null) {
                                com.bumptech.glide.c.d(bVar6, new d("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!nVar3.j(rVar.f44706a, null, bVar6)) {
                                n.a(bVar6);
                            } else {
                                Activity activity3 = nVar3.f44689b;
                                boolean z14 = eVar4.f44669b;
                                boolean z15 = eVar4.f44668a;
                                if (z14) {
                                    i.c cVar5 = i.c.f42480a;
                                    i.d dVar3 = i.d.f42481a;
                                    if (z15) {
                                        i.b bVar7 = new i.b(b6.d.e(eVar4));
                                        int iG5 = b6.d.g();
                                        h.k kVar5 = new h.k();
                                        kVar5.f42073a = dVar3;
                                        b6.d.g();
                                        kVar5.f42073a = dVar3;
                                        kVar5.f42074b = iG5;
                                        kVar5.f42075c = cVar5;
                                        intent5 = bVar7.d(activity3, kVar5);
                                    } else {
                                        a1 a1Var3 = new a1(1);
                                        int iG6 = b6.d.g();
                                        h.k kVar6 = new h.k();
                                        kVar6.f42073a = dVar3;
                                        b6.d.g();
                                        kVar6.f42073a = dVar3;
                                        kVar6.f42074b = iG6;
                                        kVar6.f42075c = cVar5;
                                        intent5 = a1Var3.d(activity3, kVar6);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", z15);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            try {
                                listQ = j1.f.C(((p) pVar).a());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof d) {
                                    d dVar4 = th2;
                                    listQ = xj.o.Q(dVar4.f44666a, dVar4.f44667b, null);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                    }
                }
            });
        } else {
            gVar2.C(null);
        }
        k5.g gVar3 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia", ""), (xi.l) jVar.getValue(), obj);
        if (pVar != null) {
            final int i12 = 2;
            gVar3.C(new xi.b() { // from class: kj.f
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    List listQ;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar = (t) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                            q qVar = (q) obj4;
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar = (e) obj5;
                            hj.b bVar2 = new hj.b(bVar, 3);
                            fc.f fVar = ((p) pVar).f44702b;
                            n nVar = (fVar == null || ((Activity) fVar.f40781c) == null) ? null : (n) fVar.f40782d;
                            if (nVar == null) {
                                com.bumptech.glide.c.d(bVar2, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                od.c cVar = nVar.f44692e;
                                Activity activity = nVar.f44689b;
                                s sVar = tVar.f44711b;
                                if (sVar != null) {
                                    nVar.f44696i = sVar.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z10 = eVar.f44668a;
                                boolean z11 = eVar.f44669b;
                                i.e eVar2 = i.e.f42482a;
                                i.d dVar = i.d.f42481a;
                                i.c cVar2 = i.c.f42480a;
                                if (z10) {
                                    int iE = b6.d.e(eVar);
                                    if (!nVar.j(qVar, null, bVar2)) {
                                        n.a(bVar2);
                                    } else {
                                        if (z11) {
                                            i.b bVar3 = new i.b(iE);
                                            int iG = b6.d.g();
                                            h.k kVar = new h.k();
                                            kVar.f42073a = dVar;
                                            b6.d.g();
                                            kVar.f42073a = eVar2;
                                            kVar.f42074b = iG;
                                            kVar.f42075c = cVar2;
                                            intent2 = bVar3.d(activity, kVar);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f44710a.ordinal();
                                    if (iOrdinal == 0) {
                                        if (!nVar.j(qVar, null, bVar2)) {
                                            n.a(bVar2);
                                        } else {
                                            if (cVar == null ? false : b6.d.m((Activity) cVar.f47386b)) {
                                                if (!(b0.b.a((Activity) cVar.f47386b, "android.permission.CAMERA") == 0)) {
                                                    b0.b.i((Activity) cVar.f47386b, new String[]{"android.permission.CAMERA"}, 2345);
                                                }
                                            }
                                            nVar.h();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        if (!nVar.j(qVar, null, bVar2)) {
                                            n.a(bVar2);
                                        } else {
                                            if (z11) {
                                                a1 a1Var = new a1(1);
                                                int iG2 = b6.d.g();
                                                h.k kVar2 = new h.k();
                                                kVar2.f42073a = dVar;
                                                b6.d.g();
                                                kVar2.f42073a = eVar2;
                                                kVar2.f42074b = iG2;
                                                kVar2.f42075c = cVar2;
                                                intent = a1Var.d(activity, kVar2);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar2 = (t) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.VideoSelectionOptions");
                            v vVar = (v) obj7;
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar3 = (e) obj8;
                            hj.b bVar4 = new hj.b(bVar, 5);
                            fc.f fVar2 = ((p) pVar).f44702b;
                            n nVar2 = (fVar2 == null || ((Activity) fVar2.f40781c) == null) ? null : (n) fVar2.f40782d;
                            if (nVar2 == null) {
                                com.bumptech.glide.c.d(bVar4, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                od.c cVar3 = nVar2.f44692e;
                                Activity activity2 = nVar2.f44689b;
                                s sVar2 = tVar2.f44711b;
                                if (sVar2 != null) {
                                    nVar2.f44696i = sVar2.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z12 = eVar3.f44668a;
                                boolean z13 = eVar3.f44669b;
                                i.f fVar3 = i.f.f42483a;
                                i.d dVar2 = i.d.f42481a;
                                i.c cVar4 = i.c.f42480a;
                                if (z12) {
                                    int iE2 = b6.d.e(eVar3);
                                    if (!nVar2.j(null, vVar, bVar4)) {
                                        n.a(bVar4);
                                    } else {
                                        if (z13) {
                                            i.b bVar5 = new i.b(iE2);
                                            int iG3 = b6.d.g();
                                            h.k kVar3 = new h.k();
                                            kVar3.f42073a = dVar2;
                                            b6.d.g();
                                            kVar3.f42073a = fVar3;
                                            kVar3.f42074b = iG3;
                                            kVar3.f42075c = cVar4;
                                            intent4 = bVar5.d(activity2, kVar3);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f44710a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        if (!nVar2.j(null, vVar, bVar4)) {
                                            n.a(bVar4);
                                        } else {
                                            if (cVar3 == null ? false : b6.d.m((Activity) cVar3.f47386b)) {
                                                if (!(b0.b.a((Activity) cVar3.f47386b, "android.permission.CAMERA") == 0)) {
                                                    b0.b.i((Activity) cVar3.f47386b, new String[]{"android.permission.CAMERA"}, 2355);
                                                }
                                            }
                                            nVar2.i();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        if (!nVar2.j(null, vVar, bVar4)) {
                                            n.a(bVar4);
                                        } else {
                                            if (z13) {
                                                a1 a1Var2 = new a1(1);
                                                int iG4 = b6.d.g();
                                                h.k kVar4 = new h.k();
                                                kVar4.f42073a = dVar2;
                                                b6.d.g();
                                                kVar4.f42073a = fVar3;
                                                kVar4.f42074b = iG4;
                                                kVar4.f42075c = cVar4;
                                                intent3 = a1Var2.d(activity2, kVar4);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.MediaSelectionOptions");
                            r rVar = (r) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar4 = (e) obj10;
                            hj.b bVar6 = new hj.b(bVar, 4);
                            fc.f fVar4 = ((p) pVar).f44702b;
                            n nVar3 = (fVar4 == null || ((Activity) fVar4.f40781c) == null) ? null : (n) fVar4.f40782d;
                            if (nVar3 == null) {
                                com.bumptech.glide.c.d(bVar6, new d("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!nVar3.j(rVar.f44706a, null, bVar6)) {
                                n.a(bVar6);
                            } else {
                                Activity activity3 = nVar3.f44689b;
                                boolean z14 = eVar4.f44669b;
                                boolean z15 = eVar4.f44668a;
                                if (z14) {
                                    i.c cVar5 = i.c.f42480a;
                                    i.d dVar3 = i.d.f42481a;
                                    if (z15) {
                                        i.b bVar7 = new i.b(b6.d.e(eVar4));
                                        int iG5 = b6.d.g();
                                        h.k kVar5 = new h.k();
                                        kVar5.f42073a = dVar3;
                                        b6.d.g();
                                        kVar5.f42073a = dVar3;
                                        kVar5.f42074b = iG5;
                                        kVar5.f42075c = cVar5;
                                        intent5 = bVar7.d(activity3, kVar5);
                                    } else {
                                        a1 a1Var3 = new a1(1);
                                        int iG6 = b6.d.g();
                                        h.k kVar6 = new h.k();
                                        kVar6.f42073a = dVar3;
                                        b6.d.g();
                                        kVar6.f42073a = dVar3;
                                        kVar6.f42074b = iG6;
                                        kVar6.f42075c = cVar5;
                                        intent5 = a1Var3.d(activity3, kVar6);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", z15);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            try {
                                listQ = j1.f.C(((p) pVar).a());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof d) {
                                    d dVar4 = th2;
                                    listQ = xj.o.Q(dVar4.f44666a, dVar4.f44667b, null);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                    }
                }
            });
        } else {
            gVar3.C(null);
        }
        k5.g gVar4 = new k5.g(binaryMessenger, defpackage.e.n("dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults", ""), (xi.l) jVar.getValue(), cVarH);
        if (pVar == null) {
            gVar4.C(null);
        } else {
            final int i13 = 3;
            gVar4.C(new xi.b() { // from class: kj.f
                @Override // xi.b
                public final void t(Object obj2, wi.b bVar) {
                    Intent intent;
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    List listQ;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar = (t) obj3;
                            Object obj4 = list.get(1);
                            kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.ImageSelectionOptions");
                            q qVar = (q) obj4;
                            Object obj5 = list.get(2);
                            kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar = (e) obj5;
                            hj.b bVar2 = new hj.b(bVar, 3);
                            fc.f fVar = ((p) pVar).f44702b;
                            n nVar = (fVar == null || ((Activity) fVar.f40781c) == null) ? null : (n) fVar.f40782d;
                            if (nVar == null) {
                                com.bumptech.glide.c.d(bVar2, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                od.c cVar = nVar.f44692e;
                                Activity activity = nVar.f44689b;
                                s sVar = tVar.f44711b;
                                if (sVar != null) {
                                    nVar.f44696i = sVar.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z10 = eVar.f44668a;
                                boolean z11 = eVar.f44669b;
                                i.e eVar2 = i.e.f42482a;
                                i.d dVar = i.d.f42481a;
                                i.c cVar2 = i.c.f42480a;
                                if (z10) {
                                    int iE = b6.d.e(eVar);
                                    if (!nVar.j(qVar, null, bVar2)) {
                                        n.a(bVar2);
                                    } else {
                                        if (z11) {
                                            i.b bVar3 = new i.b(iE);
                                            int iG = b6.d.g();
                                            h.k kVar = new h.k();
                                            kVar.f42073a = dVar;
                                            b6.d.g();
                                            kVar.f42073a = eVar2;
                                            kVar.f42074b = iG;
                                            kVar.f42075c = cVar2;
                                            intent2 = bVar3.d(activity, kVar);
                                        } else {
                                            intent2 = new Intent("android.intent.action.GET_CONTENT");
                                            intent2.setType("image/*");
                                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity.startActivityForResult(intent2, 2346);
                                    }
                                    break;
                                } else {
                                    int iOrdinal = tVar.f44710a.ordinal();
                                    if (iOrdinal == 0) {
                                        if (!nVar.j(qVar, null, bVar2)) {
                                            n.a(bVar2);
                                        } else {
                                            if (cVar == null ? false : b6.d.m((Activity) cVar.f47386b)) {
                                                if (!(b0.b.a((Activity) cVar.f47386b, "android.permission.CAMERA") == 0)) {
                                                    b0.b.i((Activity) cVar.f47386b, new String[]{"android.permission.CAMERA"}, 2345);
                                                }
                                            }
                                            nVar.h();
                                        }
                                        break;
                                    } else if (iOrdinal == 1) {
                                        if (!nVar.j(qVar, null, bVar2)) {
                                            n.a(bVar2);
                                        } else {
                                            if (z11) {
                                                a1 a1Var = new a1(1);
                                                int iG2 = b6.d.g();
                                                h.k kVar2 = new h.k();
                                                kVar2.f42073a = dVar;
                                                b6.d.g();
                                                kVar2.f42073a = eVar2;
                                                kVar2.f42074b = iG2;
                                                kVar2.f42075c = cVar2;
                                                intent = a1Var.d(activity, kVar2);
                                            } else {
                                                intent = new Intent("android.intent.action.GET_CONTENT");
                                                intent.setType("image/*");
                                            }
                                            activity.startActivityForResult(intent, 2342);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 1:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.SourceSpecification");
                            t tVar2 = (t) obj6;
                            Object obj7 = list2.get(1);
                            kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.VideoSelectionOptions");
                            v vVar = (v) obj7;
                            Object obj8 = list2.get(2);
                            kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar3 = (e) obj8;
                            hj.b bVar4 = new hj.b(bVar, 5);
                            fc.f fVar2 = ((p) pVar).f44702b;
                            n nVar2 = (fVar2 == null || ((Activity) fVar2.f40781c) == null) ? null : (n) fVar2.f40782d;
                            if (nVar2 == null) {
                                com.bumptech.glide.c.d(bVar4, new d("no_activity", "image_picker plugin requires a foreground activity."));
                                break;
                            } else {
                                od.c cVar3 = nVar2.f44692e;
                                Activity activity2 = nVar2.f44689b;
                                s sVar2 = tVar2.f44711b;
                                if (sVar2 != null) {
                                    nVar2.f44696i = sVar2.ordinal() != 1 ? 1 : 2;
                                }
                                boolean z12 = eVar3.f44668a;
                                boolean z13 = eVar3.f44669b;
                                i.f fVar3 = i.f.f42483a;
                                i.d dVar2 = i.d.f42481a;
                                i.c cVar4 = i.c.f42480a;
                                if (z12) {
                                    int iE2 = b6.d.e(eVar3);
                                    if (!nVar2.j(null, vVar, bVar4)) {
                                        n.a(bVar4);
                                    } else {
                                        if (z13) {
                                            i.b bVar5 = new i.b(iE2);
                                            int iG3 = b6.d.g();
                                            h.k kVar3 = new h.k();
                                            kVar3.f42073a = dVar2;
                                            b6.d.g();
                                            kVar3.f42073a = fVar3;
                                            kVar3.f42074b = iG3;
                                            kVar3.f42075c = cVar4;
                                            intent4 = bVar5.d(activity2, kVar3);
                                        } else {
                                            intent4 = new Intent("android.intent.action.GET_CONTENT");
                                            intent4.setType("video/*");
                                            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                                        }
                                        activity2.startActivityForResult(intent4, 2348);
                                    }
                                    break;
                                } else {
                                    int iOrdinal2 = tVar2.f44710a.ordinal();
                                    if (iOrdinal2 == 0) {
                                        if (!nVar2.j(null, vVar, bVar4)) {
                                            n.a(bVar4);
                                        } else {
                                            if (cVar3 == null ? false : b6.d.m((Activity) cVar3.f47386b)) {
                                                if (!(b0.b.a((Activity) cVar3.f47386b, "android.permission.CAMERA") == 0)) {
                                                    b0.b.i((Activity) cVar3.f47386b, new String[]{"android.permission.CAMERA"}, 2355);
                                                }
                                            }
                                            nVar2.i();
                                        }
                                        break;
                                    } else if (iOrdinal2 == 1) {
                                        if (!nVar2.j(null, vVar, bVar4)) {
                                            n.a(bVar4);
                                        } else {
                                            if (z13) {
                                                a1 a1Var2 = new a1(1);
                                                int iG4 = b6.d.g();
                                                h.k kVar4 = new h.k();
                                                kVar4.f42073a = dVar2;
                                                b6.d.g();
                                                kVar4.f42073a = fVar3;
                                                kVar4.f42074b = iG4;
                                                kVar4.f42075c = cVar4;
                                                intent3 = a1Var2.d(activity2, kVar4);
                                            } else {
                                                intent3 = new Intent("android.intent.action.GET_CONTENT");
                                                intent3.setType("video/*");
                                            }
                                            activity2.startActivityForResult(intent3, 2352);
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj9 = list3.get(0);
                            kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.MediaSelectionOptions");
                            r rVar = (r) obj9;
                            Object obj10 = list3.get(1);
                            kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type io.flutter.plugins.imagepicker.GeneralOptions");
                            e eVar4 = (e) obj10;
                            hj.b bVar6 = new hj.b(bVar, 4);
                            fc.f fVar4 = ((p) pVar).f44702b;
                            n nVar3 = (fVar4 == null || ((Activity) fVar4.f40781c) == null) ? null : (n) fVar4.f40782d;
                            if (nVar3 == null) {
                                com.bumptech.glide.c.d(bVar6, new d("no_activity", "image_picker plugin requires a foreground activity."));
                            } else if (!nVar3.j(rVar.f44706a, null, bVar6)) {
                                n.a(bVar6);
                            } else {
                                Activity activity3 = nVar3.f44689b;
                                boolean z14 = eVar4.f44669b;
                                boolean z15 = eVar4.f44668a;
                                if (z14) {
                                    i.c cVar5 = i.c.f42480a;
                                    i.d dVar3 = i.d.f42481a;
                                    if (z15) {
                                        i.b bVar7 = new i.b(b6.d.e(eVar4));
                                        int iG5 = b6.d.g();
                                        h.k kVar5 = new h.k();
                                        kVar5.f42073a = dVar3;
                                        b6.d.g();
                                        kVar5.f42073a = dVar3;
                                        kVar5.f42074b = iG5;
                                        kVar5.f42075c = cVar5;
                                        intent5 = bVar7.d(activity3, kVar5);
                                    } else {
                                        a1 a1Var3 = new a1(1);
                                        int iG6 = b6.d.g();
                                        h.k kVar6 = new h.k();
                                        kVar6.f42073a = dVar3;
                                        b6.d.g();
                                        kVar6.f42073a = dVar3;
                                        kVar6.f42074b = iG6;
                                        kVar6.f42075c = cVar5;
                                        intent5 = a1Var3.d(activity3, kVar6);
                                    }
                                } else {
                                    intent5 = new Intent("android.intent.action.GET_CONTENT");
                                    intent5.setType("*/*");
                                    intent5.putExtra("CONTENT_TYPE", new String[]{"video/*", "image/*"});
                                    intent5.putExtra("android.intent.extra.ALLOW_MULTIPLE", z15);
                                }
                                activity3.startActivityForResult(intent5, 2347);
                            }
                            break;
                        default:
                            try {
                                listQ = j1.f.C(((p) pVar).a());
                                break;
                            } catch (Throwable th2) {
                                if (th2 instanceof d) {
                                    d dVar4 = th2;
                                    listQ = xj.o.Q(dVar4.f44666a, dVar4.f44667b, null);
                                } else {
                                    listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            bVar.e(listQ);
                            break;
                    }
                }
            });
        }
    }
}
