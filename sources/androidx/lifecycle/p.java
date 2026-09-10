package androidx.lifecycle;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.content.FileProvider;
import cn.c2;
import com.google.android.gms.internal.ads.c11;
import com.google.android.gms.internal.ads.d11;
import com.google.android.gms.internal.ads.f11;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import s0.f1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4580h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, ak.f fVar, int i10) {
        super(2, fVar);
        this.f4578f = i10;
        this.f4580h = obj;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f4578f) {
            case 0:
                p pVar = new p((q) this.f4580h, fVar, 0);
                pVar.f4579g = obj;
                return pVar;
            case 1:
                p pVar2 = new p((f.q) this.f4580h, fVar, 1);
                pVar2.f4579g = obj;
                return pVar2;
            case 2:
                p pVar3 = new p((String) this.f4580h, fVar, 2);
                pVar3.f4579g = obj;
                return pVar3;
            case 3:
                p pVar4 = new p((c11) this.f4580h, fVar, 3);
                pVar4.f4579g = obj;
                return pVar4;
            case 4:
                p pVar5 = new p((d4.c) this.f4580h, fVar, 4);
                pVar5.f4579g = obj;
                return pVar5;
            case 5:
                return new p((Map) this.f4579g, (ah.d) this.f4580h, fVar, 5);
            case 6:
                return new p((dh.b) this.f4579g, (dh.b) this.f4580h, fVar, 6);
            case 7:
                return new p((bo.e) this.f4579g, (gh.e) this.f4580h, fVar, 7);
            case 8:
                return new p((fc.f) this.f4579g, (Map) this.f4580h, fVar, 8);
            case 9:
                p pVar6 = new p((jk.b) this.f4580h, fVar, 9);
                pVar6.f4579g = obj;
                return pVar6;
            case 10:
                p pVar7 = new p((List) this.f4580h, fVar, 10);
                pVar7.f4579g = obj;
                return pVar7;
            case 11:
                p pVar8 = new p((f1) this.f4580h, fVar, 11);
                pVar8.f4579g = obj;
                return pVar8;
            case 12:
                return new p((wi.j) this.f4579g, (ArrayList) this.f4580h, fVar, 12);
            case 13:
                return new p((s5.o) this.f4579g, (wi.j) this.f4580h, fVar, 13);
            case 14:
                return new p((d8.c) this.f4579g, (Uri) this.f4580h, fVar, 14);
            default:
                p pVar9 = new p((Set) this.f4580h, fVar, 15);
                pVar9.f4579g = obj;
                return pVar9;
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4578f) {
            case 0:
                p pVar = (p) create((cn.a0) obj, (ak.f) obj2);
                wj.r rVar = wj.r.f53297a;
                pVar.invokeSuspend(rVar);
                return rVar;
            case 1:
                p pVar2 = (p) create((cn.a0) obj, (ak.f) obj2);
                wj.r rVar2 = wj.r.f53297a;
                pVar2.invokeSuspend(rVar2);
                return rVar2;
            case 2:
                return ((p) create((f11) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 3:
                return ((p) create((f11) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 4:
                ((p) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
                throw null;
            case 5:
                p pVar3 = (p) create((cn.a0) obj, (ak.f) obj2);
                wj.r rVar3 = wj.r.f53297a;
                pVar3.invokeSuspend(rVar3);
                return rVar3;
            case 6:
                return ((p) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 7:
                p pVar4 = (p) create((cn.a0) obj, (ak.f) obj2);
                wj.r rVar4 = wj.r.f53297a;
                pVar4.invokeSuspend(rVar4);
                return rVar4;
            case 8:
                return ((p) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 9:
                p pVar5 = (p) create((w0.b) obj, (ak.f) obj2);
                wj.r rVar5 = wj.r.f53297a;
                pVar5.invokeSuspend(rVar5);
                return rVar5;
            case 10:
                p pVar6 = (p) create((w0.b) obj, (ak.f) obj2);
                wj.r rVar6 = wj.r.f53297a;
                pVar6.invokeSuspend(rVar6);
                return rVar6;
            case 11:
                return ((p) create((f1) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 12:
                p pVar7 = (p) create((cn.a0) obj, (ak.f) obj2);
                wj.r rVar7 = wj.r.f53297a;
                pVar7.invokeSuspend(rVar7);
                return rVar7;
            case 13:
                p pVar8 = (p) create((cn.a0) obj, (ak.f) obj2);
                wj.r rVar8 = wj.r.f53297a;
                pVar8.invokeSuspend(rVar8);
                return rVar8;
            case 14:
                p pVar9 = (p) create((cn.a0) obj, (ak.f) obj2);
                wj.r rVar9 = wj.r.f53297a;
                pVar9.invokeSuspend(rVar9);
                return rVar9;
            default:
                return ((p) create((w0.b) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        ArrayList arrayListB;
        ArrayList arrayList;
        ArrayList arrayList2;
        String strConcat;
        boolean zP0;
        int i11 = this.f4578f;
        boolean z10 = true;
        ArrayList<? extends Parcelable> arrayList3 = null;
        byte b10 = 0;
        wj.r rVar = wj.r.f53297a;
        Object obj2 = this.f4580h;
        switch (i11) {
            case 0:
                t9.e.z(obj);
                cn.a0 a0Var = (cn.a0) this.f4579g;
                q qVar = (q) obj2;
                o oVar = qVar.f4584a;
                if (((x) oVar).f4609d.compareTo(n.f4565b) >= 0) {
                    oVar.a(qVar);
                } else {
                    cn.d0.i(a0Var.getCoroutineContext(), null);
                }
                return rVar;
            case 1:
                cn.a0 a0Var2 = (cn.a0) this.f4579g;
                t9.e.z(obj);
                ak.k coroutineContext = a0Var2.getCoroutineContext();
                f.q qVar2 = (f.q) obj2;
                try {
                    c2 c2Var = new c2();
                    c2Var.f6686f = cn.d0.u(cn.d0.r(coroutineContext), true, c2Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c2.f6684g;
                    try {
                        do {
                            i10 = atomicIntegerFieldUpdater.get(c2Var);
                            if (i10 != 0) {
                                if (i10 != 2 && i10 != 3) {
                                    c2.l(i10);
                                    throw null;
                                }
                            }
                            qVar2.invoke();
                            return rVar;
                        } while (!atomicIntegerFieldUpdater.compareAndSet(c2Var, i10, 0));
                        qVar2.invoke();
                        return rVar;
                    } finally {
                        c2Var.k();
                    }
                } catch (InterruptedException e10) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
                }
            case 2:
                t9.e.z(obj);
                d11 d11Var = (d11) ((f11) this.f4579g).r();
                kotlin.jvm.internal.n.e(Collections.unmodifiableMap(((f11) d11Var.f19193b).A()), "getQueryIdToAdQualityDataMapMap(...)");
                String key = (String) obj2;
                kotlin.jvm.internal.n.f(key, "key");
                d11Var.b();
                ((f11) d11Var.f19193b).D().remove(key);
                return (f11) d11Var.e();
            case 3:
                t9.e.z(obj);
                d11 d11Var2 = (d11) ((f11) this.f4579g).r();
                kotlin.jvm.internal.n.e(Collections.unmodifiableMap(((f11) d11Var2.f19193b).A()), "getQueryIdToAdQualityDataMapMap(...)");
                c11 c11Var = (c11) obj2;
                String strC = c11Var.C();
                kotlin.jvm.internal.n.e(strC, "getGwsQueryId(...)");
                d11Var2.b();
                ((f11) d11Var2.f19193b).D().put(strC, c11Var);
                return (f11) d11Var2.e();
            case 4:
                t9.e.z(obj);
                throw null;
            case 5:
                t9.e.z(obj);
                Map map = (Map) this.f4579g;
                ah.d dVar = (ah.d) obj2;
                eh.k kVar = eh.k.f40087a;
                int iOrdinal = dVar.ordinal();
                if (iOrdinal == 0) {
                    arrayListB = kVar.b(false);
                } else if (iOrdinal == 1) {
                    arrayListB = kVar.c(false);
                } else if (iOrdinal == 2) {
                    arrayListB = kVar.b(true);
                } else {
                    if (iOrdinal != 3) {
                        throw new aa.b((byte) 0, 20);
                    }
                    arrayListB = kVar.c(true);
                }
                map.put(dVar, arrayListB);
                return rVar;
            case 6:
                t9.e.z(obj);
                dh.b bVar = (dh.b) this.f4579g;
                dh.b other = (dh.b) obj2;
                bVar.getClass();
                kotlin.jvm.internal.n.f(other, "other");
                dh.h hVarB = bVar.b();
                return Boolean.valueOf(hVarB != null ? hVarB.b(other.b()) : false);
            case 7:
                t9.e.z(obj);
                gh.e eVar = (gh.e) obj2;
                ((jk.c) ((bo.e) this.f4579g).f5778c).invoke(eVar.f41902a, eVar.f41903b);
                return rVar;
            case 8:
                t9.e.z(obj);
                fc.f fVar = (fc.f) this.f4579g;
                Map map2 = (Map) obj2;
                Context context = (Context) fVar.f40780b;
                File fileS = fVar.s();
                File[] fileArrListFiles = fileS.listFiles();
                if (fileS.exists() && fileArrListFiles != null && fileArrListFiles.length != 0) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                    fileS.delete();
                }
                String str = (String) map2.get("text");
                String str2 = (String) map2.get("uri");
                String str3 = (String) map2.get("subject");
                String str4 = (String) map2.get("title");
                List list = (List) map2.get("paths");
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof String) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = null;
                }
                List list2 = (List) map2.get("mimeTypes");
                if (list2 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        if (obj4 instanceof String) {
                            arrayList2.add(obj4);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList != null) {
                    arrayList3 = new ArrayList<>(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file2 = new File((String) it.next());
                        try {
                            String canonicalPath = file2.getCanonicalPath();
                            kotlin.jvm.internal.n.c(canonicalPath);
                            String canonicalPath2 = fVar.s().getCanonicalPath();
                            kotlin.jvm.internal.n.e(canonicalPath2, "getCanonicalPath(...)");
                            zP0 = an.p.p0(canonicalPath, canonicalPath2, false);
                        } catch (IOException unused) {
                            zP0 = false;
                        }
                        if (zP0) {
                            throw new IOException(defpackage.e.o("Shared file can not be located in '", fVar.s().getCanonicalPath(), "'"));
                        }
                        File fileS2 = fVar.s();
                        if (!fileS2.exists()) {
                            fileS2.mkdirs();
                        }
                        File file3 = new File(fileS2, file2.getName());
                        hk.k.T(file2, file3);
                        Context context2 = (Activity) fVar.f40781c;
                        if (context2 == null) {
                            context2 = context;
                        }
                        arrayList3.add(FileProvider.getUriForFile(context2, (String) ((wj.j) fVar.f40785g).getValue(), file3));
                        break;
                    }
                }
                Intent intent = new Intent();
                if (arrayList3 == null) {
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    if (str2 != null) {
                        str = str2;
                    }
                    intent.putExtra("android.intent.extra.TEXT", str);
                    if ((str3 == null || an.h.y0(str3)) == false) {
                        intent.putExtra("android.intent.extra.SUBJECT", str3);
                    }
                    if (str4 != null && !an.h.y0(str4)) {
                        z10 = false;
                    }
                    if (!z10) {
                        intent.putExtra("android.intent.extra.TITLE", str4);
                    }
                } else {
                    if (arrayList3.isEmpty()) {
                        throw new IOException("Error sharing files: No files found");
                    }
                    String str5 = "*/*";
                    if (arrayList3.size() == 1) {
                        str5 = (arrayList2 == null || arrayList2.isEmpty()) == true ? "*/*" : (String) xj.n.o0(arrayList2);
                        intent.setAction("android.intent.action.SEND");
                        intent.setType(str5);
                        intent.putExtra("android.intent.extra.STREAM", (Parcelable) xj.n.o0(arrayList3));
                    } else {
                        intent.setAction("android.intent.action.SEND_MULTIPLE");
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            strConcat = str5;
                        } else {
                            if (arrayList2.size() == 1) {
                                str5 = (String) xj.n.o0(arrayList2);
                            } else {
                                strConcat = (String) xj.n.o0(arrayList2);
                                int iP = xj.o.P(arrayList2);
                                if (1 <= iP) {
                                    int i12 = 1;
                                    while (true) {
                                        if (!kotlin.jvm.internal.n.a(strConcat, arrayList2.get(i12))) {
                                            if (fc.f.q(strConcat).equals(fc.f.q((String) arrayList2.get(i12)))) {
                                                strConcat = fc.f.q((String) arrayList2.get(i12)).concat("/*");
                                            }
                                        }
                                        if (i12 != iP) {
                                            i12++;
                                        }
                                    }
                                }
                            }
                            strConcat = str5;
                        }
                        intent.setType(strConcat);
                        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                    }
                    if (!(str == null || an.h.y0(str))) {
                        intent.putExtra("android.intent.extra.TEXT", str);
                    }
                    if (!(str3 == null || an.h.y0(str3))) {
                        intent.putExtra("android.intent.extra.SUBJECT", str3);
                    }
                    if (!(str4 == null || an.h.y0(str4))) {
                        intent.putExtra("android.intent.extra.TITLE", str4);
                    }
                    intent.addFlags(1);
                }
                Intent intentCreateChooser = Intent.createChooser(intent, str4, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) SharePlusPendingIntent.class), ((Number) ((wj.j) fVar.f40786h).getValue()).intValue() | 134217728).getIntentSender());
                if (arrayList3 != null) {
                    Context context3 = (Activity) fVar.f40781c;
                    if (context3 == null) {
                        context3 = context;
                    }
                    List<ResolveInfo> listQueryIntentActivities = context3.getPackageManager().queryIntentActivities(intentCreateChooser, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                    kotlin.jvm.internal.n.e(listQueryIntentActivities, "queryIntentActivities(...)");
                    Iterator<T> it2 = listQueryIntentActivities.iterator();
                    while (it2.hasNext()) {
                        String str6 = ((ResolveInfo) it2.next()).activityInfo.packageName;
                        Iterator<T> it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Uri uri = (Uri) it3.next();
                            Context context4 = (Activity) fVar.f40781c;
                            if (context4 == null) {
                                context4 = context;
                            }
                            context4.grantUriPermission(str6, uri, 3);
                        }
                    }
                }
                kotlin.jvm.internal.n.c(intentCreateChooser);
                return intentCreateChooser;
            case 9:
                t9.e.z(obj);
                ((jk.b) obj2).invoke((w0.b) this.f4579g);
                return rVar;
            case 10:
                w0.b bVar2 = (w0.b) this.f4579g;
                t9.e.z(obj);
                List list3 = (List) obj2;
                if (list3 != null) {
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        bVar2.d(go.k.d((String) it4.next()));
                    }
                } else {
                    bVar2.b();
                    bVar2.f52735a.clear();
                }
                return rVar;
            case 11:
                t9.e.z(obj);
                f1 f1Var = (f1) this.f4579g;
                return Boolean.valueOf((f1Var instanceof s0.d) && f1Var.f49805a <= ((f1) obj2).f49805a);
            case 12:
                t9.e.z(obj);
                ((wi.j) this.f4579g).a((ArrayList) obj2);
                return rVar;
            case 13:
                t9.e.z(obj);
                an.g gVar = s5.h.f50155a;
                ContentResolver contentResolver = s5.o.f50181e;
                kotlin.jvm.internal.n.c(contentResolver);
                Collection<t5.e> collectionValues = x7.a.s(contentResolver).values();
                ArrayList arrayList4 = new ArrayList(xj.p.W(collectionValues, 10));
                for (t5.e eVar2 : collectionValues) {
                    arrayList4.add(xj.b0.Q(new wj.f("id", eVar2.f50506a), new wj.f("name", eVar2.f50507b)));
                }
                hn.d dVar2 = ((s5.o) this.f4579g).f50188a;
                jn.e eVar3 = cn.n0.f6748a;
                cn.d0.w(dVar2, hn.o.f42451a, new p((wi.j) obj2, arrayList4, b10 == true ? 1 : 0, 12), 2);
                return rVar;
            case 14:
                Uri uri2 = (Uri) obj2;
                d8.c cVar = (d8.c) this.f4579g;
                t9.e.z(obj);
                try {
                    d8.c.a(cVar, uri2);
                    Activity context5 = cVar.f38766b;
                    kotlin.jvm.internal.n.f(context5, "context");
                    i6.d dVar3 = new i6.d();
                    dVar3.f42896a = context5;
                    wi.j jVar = (wi.j) cVar.f38767c;
                    if (jVar != null) {
                        jVar.a(dVar3.g(uri2));
                    }
                    cVar.f38767c = null;
                    break;
                } catch (SecurityException e11) {
                    Log.d("Dialog Activity", "Security Exception while saving file" + e11.getMessage());
                    wi.j jVar2 = (wi.j) cVar.f38767c;
                    if (jVar2 != null) {
                        jVar2.b("Security Exception", e11.getLocalizedMessage(), e11);
                    }
                    cVar.f38767c = null;
                } catch (Exception e12) {
                    Log.d("Dialog Activity", "Exception while saving file" + e12.getMessage());
                    wi.j jVar3 = (wi.j) cVar.f38767c;
                    if (jVar3 != null) {
                        jVar3.b("Error", e12.getLocalizedMessage(), e12);
                    }
                    cVar.f38767c = null;
                }
                return rVar;
            default:
                t9.e.z(obj);
                Set setKeySet = ((w0.b) this.f4579g).a().keySet();
                ArrayList arrayList5 = new ArrayList(xj.p.W(setKeySet, 10));
                Iterator it5 = setKeySet.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((w0.d) it5.next()).f52738a);
                }
                Set set = (Set) obj2;
                if (set != v0.l.f52289a) {
                    if (set == null || !set.isEmpty()) {
                        Iterator it6 = set.iterator();
                        while (it6.hasNext()) {
                            if (!arrayList5.contains((String) it6.next())) {
                            }
                        }
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, ak.f fVar, int i10) {
        super(2, fVar);
        this.f4578f = i10;
        this.f4579g = obj;
        this.f4580h = obj2;
    }
}
