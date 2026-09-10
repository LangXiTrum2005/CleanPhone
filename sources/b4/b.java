package b4;

import ak.f;
import an.o;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.work.CoroutineWorker;
import ck.i;
import cl.t0;
import cn.d0;
import cn.n0;
import cn.w;
import com.adjust.sdk.Constants;
import com.applovin.impl.da;
import com.google.android.gms.internal.ads.u22;
import com.google.android.gms.internal.ads.u71;
import d5.j;
import ea.f2;
import en.l;
import en.q;
import en.u;
import fh.s;
import fh.z;
import fn.a1;
import fn.g1;
import fn.k;
import fn.q0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.a0;
import ln.h;
import s0.e0;
import s0.f1;
import s0.o0;
import s0.x0;
import s0.y0;
import t9.e;
import wj.g;
import wj.r;
import xj.b0;
import xj.n;
import xj.p;
import xj.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f5483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f5484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5485j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, f fVar, int i10) {
        super(2, fVar);
        this.f5481f = i10;
        this.f5485j = obj;
    }

    /* JADX WARN: Type inference failed for: r10v19, types: [ck.i, jk.c] */
    @Override // ck.a
    public final f create(Object obj, f fVar) {
        switch (this.f5481f) {
            case 0:
                return new b((d) this.f5483h, (Uri) this.f5484i, (InputEvent) this.f5485j, fVar, 0);
            case 1:
                return new b((j) this.f5484i, (CoroutineWorker) this.f5485j, fVar, 1);
            case 2:
                b bVar = new b((Collection) this.f5484i, (h) this.f5485j, fVar, 2);
                bVar.f5483h = obj;
                return bVar;
            case 3:
                b bVar2 = new b((u) this.f5484i, this.f5485j, fVar, 3);
                bVar2.f5483h = obj;
                return bVar2;
            case 4:
                return new b((List) this.f5485j, fVar, 4);
            case 5:
                b bVar3 = new b((fn.f) this.f5484i, (fn.d) this.f5485j, fVar, 5);
                bVar3.f5483h = obj;
                return bVar3;
            case 6:
                return new b((fc.f) this.f5483h, (dn.d) this.f5484i, (Map) this.f5485j, fVar, 6);
            case 7:
                b bVar4 = new b((String) this.f5484i, (ah.d) this.f5485j, fVar, 7);
                bVar4.f5483h = obj;
                return bVar4;
            case 8:
                return new b((jc.c) this.f5483h, (w0.d) this.f5484i, this.f5485j, fVar, 8);
            case 9:
                return new b((jc.c) this.f5483h, (w0.d) this.f5484i, (Long) this.f5485j, fVar, 9);
            case 10:
                b bVar5 = new b((jh.i) this.f5484i, (a0) this.f5485j, this.f5482g, fVar);
                bVar5.f5483h = obj;
                return bVar5;
            case 11:
                b bVar6 = new b((e0) this.f5485j, fVar, 11);
                bVar6.f5484i = obj;
                return bVar6;
            case 12:
                b bVar7 = new b((e0) this.f5484i, (jk.c) this.f5485j, fVar);
                bVar7.f5483h = obj;
                return bVar7;
            case 13:
                b bVar8 = new b((File) this.f5485j, fVar, 13);
                bVar8.f5484i = obj;
                return bVar8;
            case 14:
                return new b((wi.j) this.f5484i, (List) this.f5485j, fVar, 14);
            default:
                b bVar9 = new b((x4.b) this.f5484i, (Activity) this.f5485j, fVar, 15);
                bVar9.f5483h = obj;
                return bVar9;
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f5481f) {
            case 0:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 1:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 2:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 3:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 4:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 5:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 6:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 7:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 8:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 9:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 10:
                b bVar = (b) create((w0.b) obj, (f) obj2);
                r rVar = r.f53297a;
                bVar.invokeSuspend(rVar);
                return rVar;
            case 11:
                return ((b) create((fn.f) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 12:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 13:
                return ((b) create((en.r) obj, (f) obj2)).invokeSuspend(r.f53297a);
            case 14:
                return ((b) create((cn.a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
            default:
                return ((b) create((en.r) obj, (f) obj2)).invokeSuspend(r.f53297a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0283  */
    /* JADX WARN: Code duplicated, block: B:112:0x028a  */
    /* JADX WARN: Code duplicated, block: B:116:0x028f  */
    /* JADX WARN: Code duplicated, block: B:428:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r9v25, types: [ck.i, jk.c] */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object foregroundInfo;
        j jVar;
        Object objC;
        Set setR0;
        wj.f info;
        Object objJ;
        Long l;
        Object objJ2;
        Object obj2;
        ah.d dVar;
        List listC;
        ArrayList arrayListA;
        Object objH;
        Long lF0;
        Object objM;
        Object objC2;
        fn.f fVar;
        Object objJ3;
        f1 f1Var;
        fn.f fVar2;
        f1 f1Var2;
        k kVar;
        Object objCollect;
        en.r rVar;
        dn.c cVar;
        Object objJ4;
        wi.j jVar2;
        int i10 = 11;
        int i11 = 7;
        int i12 = 4;
        String str = 3;
        int i13 = 2;
        int iIntValue = 0;
        f fVar3 = null;
        int i14 = 1;
        switch (this.f5481f) {
            case 0:
                bk.a aVar = bk.a.f5708a;
                int i15 = this.f5482g;
                if (i15 == 0) {
                    e.z(obj);
                    e eVar = ((d) this.f5483h).f5490a;
                    Uri uri = (Uri) this.f5484i;
                    InputEvent inputEvent = (InputEvent) this.f5485j;
                    this.f5482g = 1;
                    if (eVar.q(uri, inputEvent, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.z(obj);
                }
                return r.f53297a;
            case 1:
                bk.a aVar2 = bk.a.f5708a;
                int i16 = this.f5482g;
                if (i16 == 0) {
                    e.z(obj);
                    j jVar3 = (j) this.f5484i;
                    CoroutineWorker coroutineWorker = (CoroutineWorker) this.f5485j;
                    this.f5483h = jVar3;
                    this.f5482g = 1;
                    foregroundInfo = coroutineWorker.getForegroundInfo(this);
                    if (foregroundInfo == aVar2) {
                        return aVar2;
                    }
                    jVar = jVar3;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = (j) this.f5483h;
                    e.z(obj);
                    foregroundInfo = obj;
                }
                jVar.f38698a.h(foregroundInfo);
                return r.f53297a;
            case 2:
                cn.a0 a0Var = (cn.a0) this.f5483h;
                bk.a aVar3 = bk.a.f5708a;
                int i17 = this.f5482g;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.z(obj);
                    return obj;
                }
                e.z(obj);
                Collection collection = (Collection) this.f5484i;
                h hVar = (h) this.f5485j;
                ArrayList arrayList = new ArrayList(p.W(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(d0.g(a0Var, new u71(hVar, (dh.b) it.next(), (f) null), 3));
                }
                this.f5483h = null;
                this.f5482g = 1;
                Object objH2 = d0.h(arrayList, this);
                return objH2 == aVar3 ? aVar3 : objH2;
            case 3:
                Object jVar4 = r.f53297a;
                bk.a aVar4 = bk.a.f5708a;
                int i18 = this.f5482g;
                try {
                    if (i18 == 0) {
                        e.z(obj);
                        u uVar = (u) this.f5484i;
                        Object obj3 = this.f5485j;
                        this.f5483h = null;
                        this.f5482g = 1;
                        if (uVar.b(this, obj3) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i18 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e.z(obj);
                    }
                    objC = jVar4;
                    break;
                } catch (Throwable th2) {
                    objC = e.c(th2);
                }
                if (objC instanceof g) {
                    jVar4 = new en.j(wj.h.a(objC));
                }
                return new l(jVar4);
            case 4:
                bk.a aVar5 = bk.a.f5708a;
                int i19 = this.f5482g;
                if (i19 == 0) {
                    e.z(obj);
                    setR0 = n.R0((List) this.f5485j);
                    z zVar = z.f40950a;
                    Iterable iterable = (Iterable) com.bumptech.glide.d.K(s.f40919j);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        t.a0(((dh.a) it2.next()).f38871c, arrayList2);
                    }
                    int iO = b0.O(p.W(arrayList2, 10));
                    if (iO < 16) {
                        iO = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
                    for (Object obj4 : arrayList2) {
                        linkedHashMap.put(((dh.b) obj4).f38876a, obj4);
                    }
                    Iterator it3 = setR0.iterator();
                    long jLongValue = 0;
                    while (it3.hasNext()) {
                        dh.b bVar = (dh.b) linkedHashMap.get((String) it3.next());
                        jLongValue += (bVar == null || (l = bVar.f38881f) == null) ? 0L : l.longValue();
                    }
                    wj.f fVar4 = new wj.f(Integer.valueOf(setR0.size()), Long.valueOf(jLongValue));
                    try {
                        a aVar6 = new a(setR0, null, 5);
                        this.f5483h = setR0;
                        this.f5484i = fVar4;
                        this.f5482g = 1;
                        objJ = d0.J(n0.f6748a, aVar6, this);
                        if (objJ == aVar5) {
                            return aVar5;
                        }
                        info = fVar4;
                    } catch (Exception unused) {
                        info = fVar4;
                        kotlin.jvm.internal.n.f(info, "info");
                        return b0.Q(new wj.f(Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, b0.Q(new wj.f("first", info.f53283a), new wj.f("second", info.f53284b))), new wj.f("deletionStatus", 1));
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    info = (wj.f) this.f5484i;
                    Set set = (Set) this.f5483h;
                    try {
                        e.z(obj);
                        setR0 = set;
                        objJ = obj;
                    } catch (Exception unused2) {
                        kotlin.jvm.internal.n.f(info, "info");
                        return b0.Q(new wj.f(Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, b0.Q(new wj.f("first", info.f53283a), new wj.f("second", info.f53284b))), new wj.f("deletionStatus", 1));
                    }
                }
                Map map = (Map) objJ;
                Object obj5 = map.get("deletedCount");
                Integer num = obj5 instanceof Integer ? (Integer) obj5 : null;
                int iIntValue2 = num != null ? num.intValue() : 0;
                Object obj6 = map.get("failedCount");
                Integer num2 = obj6 instanceof Integer ? (Integer) obj6 : null;
                ah.b bVar2 = (iIntValue2 > 0 || (num2 != null ? num2.intValue() : 0) < setR0.size()) ? ah.b.SUCCESS : ah.b.FAILURE;
                kotlin.jvm.internal.n.f(info, "info");
                return b0.Q(new wj.f(Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, b0.Q(new wj.f("first", info.f53283a), new wj.f("second", info.f53284b))), new wj.f("deletionStatus", Integer.valueOf(bVar2.f3585a)));
            case 5:
                r rVar2 = r.f53297a;
                cn.a0 a0Var2 = (cn.a0) this.f5483h;
                bk.a aVar7 = bk.a.f5708a;
                int i20 = this.f5482g;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.z(obj);
                    return rVar2;
                }
                e.z(obj);
                fn.f fVar5 = (fn.f) this.f5484i;
                fn.d dVar2 = (fn.d) this.f5485j;
                ak.k kVar2 = dVar2.f41046a;
                int i21 = dVar2.f41047b;
                if (i21 == -3) {
                    i21 = -2;
                }
                en.a aVar8 = dVar2.f41048c;
                cn.b0 b0Var = cn.b0.f6675c;
                jk.c cVar2 = new c(dVar2, (f) null, i12);
                q qVar = new q(d0.x(a0Var2, kVar2), r9.b.a(i21, 4, aVar8));
                qVar.d0(b0Var, qVar, cVar2);
                this.f5483h = null;
                this.f5482g = 1;
                Object objJ5 = fn.g.j(fVar5, qVar, true, this);
                if (objJ5 != aVar7) {
                    objJ5 = rVar2;
                }
                return objJ5 == aVar7 ? aVar7 : rVar2;
            case 6:
                r rVar3 = r.f53297a;
                dn.d dVar3 = (dn.d) this.f5484i;
                wi.j jVar5 = (wi.j) dVar3.f38969c;
                f2 f2Var = (f2) dVar3.f38968b;
                fc.f fVar6 = (fc.f) this.f5483h;
                bk.a aVar9 = bk.a.f5708a;
                int i22 = this.f5482g;
                try {
                    if (i22 == 0) {
                        e.z(obj);
                        w wVar = (w) fVar6.f40784f;
                        androidx.lifecycle.p pVar = new androidx.lifecycle.p(fVar6, (Map) this.f5485j, null, 8);
                        this.f5482g = 1;
                        objJ2 = d0.J(wVar, pVar, this);
                        if (objJ2 == aVar9) {
                            return aVar9;
                        }
                    } else {
                        if (i22 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e.z(obj);
                        objJ2 = obj;
                    }
                    fc.f.a(fVar6, (Intent) objJ2);
                    Throwable thA = wj.h.a(rVar3);
                    if (thA == null) {
                        return rVar3;
                    }
                    hi.b bVar3 = (hi.b) f2Var.f39410c;
                    bVar3.f42358b.set(true);
                    bVar3.f42357a = null;
                    jVar5.b("Share failed", thA.getMessage(), thA);
                    return rVar3;
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th3) {
                    Object objC3 = e.c(th3);
                    Throwable thA2 = wj.h.a(objC3);
                    if (thA2 == null) {
                        return rVar3;
                    }
                    hi.b bVar4 = (hi.b) f2Var.f39410c;
                    bVar4.f42358b.set(true);
                    bVar4.f42357a = null;
                    jVar5.b("Share failed", thA2.getMessage(), thA2);
                    return rVar3;
                }
            case 7:
                ah.d dVar4 = (ah.d) this.f5485j;
                String str2 = (String) this.f5484i;
                cn.a0 a0Var3 = (cn.a0) this.f5483h;
                bk.a aVar10 = bk.a.f5708a;
                int i23 = this.f5482g;
                try {
                    try {
                        if (i23 == 0) {
                            e.z(obj);
                            File file = new File(str2);
                            if (!file.exists() || !file.canRead()) {
                                String message = "File does not exist or cannot be read: ".concat(str2);
                                kotlin.jvm.internal.n.f(message, "message");
                                Log.w("FrameExtractionUtils", message);
                                return j1.f.C(new dh.h(new dh.c(-1L, new double[0][]), dVar4));
                            }
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(str2);
                            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                            long jLongValue2 = (strExtractMetadata == null || (lF0 = o.f0(strExtractMetadata)) == null) ? 0L : lF0.longValue();
                            try {
                                mediaMetadataRetriever.release();
                            } catch (Throwable th4) {
                                e.c(th4);
                            }
                            if (jLongValue2 <= 0) {
                                return j1.f.C(new dh.h(new dh.c(-1L, new double[0][]), dVar4));
                            }
                            dh.e eVar2 = ih.b.f43031a.f38897a;
                            if (jLongValue2 < 0) {
                                throw new IllegalArgumentException("duration must be >= 0");
                            }
                            Object obj7 = "FrameExtractionUtils";
                            double d10 = jLongValue2;
                            double d11 = d10 / ((double) 6);
                            try {
                                if (d11 <= 10.0d && 2.0d <= d11) {
                                    arrayListA = ih.b.a(7, jLongValue2);
                                } else if (d11 < 2.0d) {
                                    arrayListA = ih.b.b(jLongValue2, (long) 2.0d);
                                } else {
                                    double d12 = d10 / ((double) 13);
                                    arrayListA = (2.0d > d12 || d12 > 10.0d) ? ih.b.a(13, jLongValue2) : ih.b.b(jLongValue2, (long) 10.0d);
                                }
                                if (arrayListA.isEmpty()) {
                                    return j1.f.C(new dh.h(new dh.c(-1L, new double[0][]), dVar4));
                                }
                                ArrayList arrayList3 = new ArrayList(p.W(arrayListA, 10));
                                Iterator it4 = arrayListA.iterator();
                                while (it4.hasNext()) {
                                    arrayList3.add(new Long(((Number) it4.next()).longValue() * 1000));
                                }
                                int i24 = ln.i.f45615a;
                                h hVar2 = new h(3);
                                ArrayList arrayList4 = new ArrayList(p.W(arrayList3, 10));
                                Iterator it5 = arrayList3.iterator();
                                while (it5.hasNext()) {
                                    cn.a0 a0Var4 = a0Var3;
                                    ah.d dVar5 = dVar4;
                                    try {
                                        arrayList4.add(d0.g(a0Var4, new ih.a(hVar2, str2, ((Number) it5.next()).longValue(), dVar5, null), 3));
                                        a0Var3 = a0Var4;
                                        dVar4 = dVar5;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        dVar = dVar5;
                                        str = obj7;
                                    }
                                }
                                this.f5483h = null;
                                this.f5482g = 1;
                                objH = d0.h(arrayList4, this);
                                if (objH == aVar10) {
                                    return aVar10;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                obj2 = obj7;
                                dVar = dVar4;
                                str = obj2;
                            }
                            break;
                            dVar = dVar4;
                            str = obj2;
                            String message2 = "generateCGImagesAsynchronously error for path: ".concat(str2);
                            kotlin.jvm.internal.n.f(message2, "message");
                            Log.e(str, message2, th);
                            listC = j1.f.C(new dh.h(new dh.c(-1L, new double[0][]), dVar));
                            return listC;
                        }
                        if (i23 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e.z(obj);
                        objH = obj;
                        listC = (List) objH;
                    } catch (Throwable th7) {
                        th = th7;
                        obj2 = "FrameExtractionUtils";
                    }
                } catch (Throwable th8) {
                    th = th8;
                }
                return listC;
            case 8:
                bk.a aVar11 = bk.a.f5708a;
                int i25 = this.f5482g;
                if (i25 == 0) {
                    e.z(obj);
                    fn.e data = ((jc.c) this.f5483h).f43815c.getData();
                    this.f5482g = 1;
                    objM = fn.g.m(data, this);
                    if (objM == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.z(obj);
                    objM = obj;
                }
                w0.b bVar5 = (w0.b) objM;
                return (bVar5 == null || (objC2 = bVar5.c((w0.d) this.f5484i)) == null) ? this.f5485j : objC2;
            case 9:
                bk.a aVar12 = bk.a.f5708a;
                int i26 = this.f5482g;
                if (i26 != 0) {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.z(obj);
                    return obj;
                }
                e.z(obj);
                s0.i iVar = ((jc.c) this.f5483h).f43815c;
                jc.b bVar6 = new jc.b((w0.d) this.f5484i, (Long) this.f5485j, fVar3, iIntValue);
                this.f5482g = 1;
                Object objR = j1.f.r(iVar, bVar6, this);
                return objR == aVar12 ? aVar12 : objR;
            case 10:
                w0.b bVar7 = (w0.b) this.f5483h;
                e.z(obj);
                w0.d dVarO = go.k.O(((jh.i) this.f5484i).f43882a);
                Integer num3 = (Integer) bVar7.c(dVarO);
                iIntValue = num3 != null ? num3.intValue() : 0;
                a0 a0Var5 = (a0) this.f5485j;
                int i27 = iIntValue + this.f5482g;
                a0Var5.f44754a = i27;
                bVar7.f(dVarO, new Integer(i27));
                return r.f53297a;
            case 11:
                r rVar4 = r.f53297a;
                e0 e0Var = (e0) this.f5485j;
                bk.a aVar13 = bk.a.f5708a;
                int i28 = this.f5482g;
                if (i28 == 0) {
                    e.z(obj);
                    fVar = (fn.f) this.f5484i;
                    this.f5484i = fVar;
                    this.f5482g = 1;
                    objJ3 = d0.J(e0Var.f49784c.getCoroutineContext(), new s0.p(e0Var, fVar3, i13), this);
                    if (objJ3 != aVar13) {
                    }
                    return aVar13;
                }
                if (i28 == 1) {
                    fVar = (fn.f) this.f5484i;
                    e.z(obj);
                    objJ3 = obj;
                } else {
                    if (i28 != 2) {
                        if (i28 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e.z(obj);
                        return rVar4;
                    }
                    f1Var2 = (s0.d) this.f5483h;
                    fVar2 = (fn.f) this.f5484i;
                    e.z(obj);
                }
                fn.f fVar7 = fVar2;
                f1Var = f1Var2;
                fVar = fVar7;
                kVar = new k(new q0(new fn.s(new fn.s(new k(new s0.p(e0Var, fVar3, iIntValue), (a1) e0Var.f49789h.f49096b), new jh.f(i13, fVar3, i14), i14), new androidx.lifecycle.p(f1Var, fVar3, i10), iIntValue)), new s0.q(e0Var, (f) null), 0);
                this.f5484i = null;
                this.f5483h = null;
                this.f5482g = 3;
                if (fVar instanceof g1) {
                    throw ((g1) fVar).f41076a;
                }
                objCollect = kVar.collect(fVar, this);
                if (objCollect != aVar13) {
                    objCollect = rVar4;
                }
                if (objCollect != aVar13) {
                    return rVar4;
                }
                return aVar13;
                f1Var = (f1) objJ3;
                if (f1Var instanceof s0.d) {
                    s0.d dVar6 = (s0.d) f1Var;
                    Object obj8 = dVar6.f49769b;
                    this.f5484i = fVar;
                    this.f5483h = dVar6;
                    this.f5482g = 2;
                    if (fVar.emit(obj8, this) != aVar13) {
                        fVar2 = fVar;
                        f1Var2 = f1Var;
                        fn.f fVar8 = fVar2;
                        f1Var = f1Var2;
                        fVar = fVar8;
                        kVar = new k(new q0(new fn.s(new fn.s(new k(new s0.p(e0Var, fVar3, iIntValue), (a1) e0Var.f49789h.f49096b), new jh.f(i13, fVar3, i14), i14), new androidx.lifecycle.p(f1Var, fVar3, i10), iIntValue)), new s0.q(e0Var, (f) null), 0);
                        this.f5484i = null;
                        this.f5483h = null;
                        this.f5482g = 3;
                        if (fVar instanceof g1) {
                            throw ((g1) fVar).f41076a;
                        }
                        objCollect = kVar.collect(fVar, this);
                        if (objCollect != aVar13) {
                            objCollect = rVar4;
                        }
                        if (objCollect != aVar13) {
                            return rVar4;
                        }
                    }
                } else {
                    if (f1Var instanceof s0.g1) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    if (f1Var instanceof y0) {
                        throw ((y0) f1Var).f49955b;
                    }
                    if (f1Var instanceof o0) {
                        return rVar4;
                    }
                    kVar = new k(new q0(new fn.s(new fn.s(new k(new s0.p(e0Var, fVar3, iIntValue), (a1) e0Var.f49789h.f49096b), new jh.f(i13, fVar3, i14), i14), new androidx.lifecycle.p(f1Var, fVar3, i10), iIntValue)), new s0.q(e0Var, (f) null), 0);
                    this.f5484i = null;
                    this.f5483h = null;
                    this.f5482g = 3;
                    if (fVar instanceof g1) {
                        throw ((g1) fVar).f41076a;
                    }
                    objCollect = kVar.collect(fVar, this);
                    if (objCollect != aVar13) {
                        objCollect = rVar4;
                    }
                    if (objCollect != aVar13) {
                        return rVar4;
                    }
                }
                return aVar13;
            case 12:
                e0 e0Var2 = (e0) this.f5484i;
                bk.a aVar14 = bk.a.f5708a;
                int i29 = this.f5482g;
                if (i29 != 0) {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.z(obj);
                    return obj;
                }
                e.z(obj);
                cn.a0 a0Var6 = (cn.a0) this.f5483h;
                cn.r rVarA = d0.a();
                s0.q0 q0Var = new s0.q0((i) this.f5485j, rVarA, e0Var2.f49789h.u(), a0Var6.getCoroutineContext());
                zc.u uVar2 = e0Var2.l;
                Object objI = ((en.e) uVar2.f54881d).i(q0Var);
                if (objI instanceof en.j) {
                    Throwable th9 = ((en.j) objI).f40167a;
                    if (th9 == null) {
                        throw new u22("Channel was closed normally");
                    }
                    throw th9;
                }
                if (objI instanceof en.k) {
                    throw new IllegalStateException("Check failed.");
                }
                if (((AtomicInteger) ((na.g) uVar2.f54882e).f46631b).getAndIncrement() == 0) {
                    d0.w((cn.a0) uVar2.f54879b, null, new c(uVar2, fVar3, i10), 3);
                }
                this.f5482g = 1;
                Object objS = rVarA.s(this);
                return objS == aVar14 ? aVar14 : objS;
            case 13:
                bk.a aVar15 = bk.a.f5708a;
                int i30 = this.f5482g;
                if (i30 != 0) {
                    if (i30 == 1) {
                        cVar = (dn.c) this.f5483h;
                        rVar = (en.r) this.f5484i;
                        e.z(obj);
                    } else {
                        if (i30 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        e.z(obj);
                    }
                    return r.f53297a;
                }
                e.z(obj);
                rVar = (en.r) this.f5484i;
                File file2 = (File) this.f5485j;
                a4.b bVar8 = new a4.b(i11, file2, rVar);
                Object obj9 = x0.f49949b;
                File parentFile = file2.getParentFile();
                kotlin.jvm.internal.n.c(parentFile);
                String key = parentFile.getCanonicalFile().getPath();
                synchronized (x0.f49949b) {
                    try {
                        LinkedHashMap linkedHashMap2 = x0.f49950c;
                        kotlin.jvm.internal.n.e(key, "key");
                        Object x0Var = linkedHashMap2.get(key);
                        if (x0Var == null) {
                            x0Var = new x0(key);
                            linkedHashMap2.put(key, x0Var);
                        }
                        x0 x0Var2 = (x0) x0Var;
                        x0Var2.f49951a.add(bVar8);
                        if (x0Var2.f49951a.size() == 1) {
                            x0Var2.startWatching();
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                dn.c cVar3 = new dn.c(i14, key, bVar8);
                r rVar5 = r.f53297a;
                this.f5484i = rVar;
                this.f5483h = cVar3;
                this.f5482g = 1;
                if (((q) rVar).f40176d.b(this, rVar5) == aVar15) {
                    return aVar15;
                }
                cVar = cVar3;
                al.l lVar = new al.l(cVar, 23);
                this.f5484i = null;
                this.f5483h = null;
                this.f5482g = 2;
                if (x7.a.a(rVar, lVar, this) == aVar15) {
                    return aVar15;
                }
                return r.f53297a;
            case 14:
                bk.a aVar16 = bk.a.f5708a;
                int i31 = this.f5482g;
                if (i31 == 0) {
                    e.z(obj);
                    wi.j jVar6 = (wi.j) this.f5484i;
                    z zVar2 = z.f40950a;
                    List list = (List) this.f5485j;
                    this.f5483h = jVar6;
                    this.f5482g = 1;
                    b bVar9 = new b(list, fVar3, i12);
                    jn.e eVar3 = n0.f6748a;
                    objJ4 = d0.J(hn.o.f42451a, bVar9, this);
                    if (objJ4 == aVar16) {
                        return aVar16;
                    }
                    jVar2 = jVar6;
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar2 = (wi.j) this.f5483h;
                    e.z(obj);
                    objJ4 = obj;
                }
                jVar2.a(objJ4);
                return r.f53297a;
            default:
                x4.b bVar10 = (x4.b) this.f5484i;
                bk.a aVar17 = bk.a.f5708a;
                int i32 = this.f5482g;
                if (i32 == 0) {
                    e.z(obj);
                    en.r rVar6 = (en.r) this.f5483h;
                    com.applovin.impl.sdk.ad.d dVar7 = new com.applovin.impl.sdk.ad.d(rVar6, 2);
                    ((y4.a) bVar10.f53613b).b((Activity) this.f5485j, new da(1), dVar7);
                    t0 t0Var = new t0(15, bVar10, dVar7);
                    this.f5482g = 1;
                    if (x7.a.a(rVar6, t0Var, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.z(obj);
                }
                return r.f53297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, f fVar, int i10) {
        super(2, fVar);
        this.f5481f = i10;
        this.f5484i = obj;
        this.f5485j = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, f fVar, int i10) {
        super(2, fVar);
        this.f5481f = i10;
        this.f5483h = obj;
        this.f5484i = obj2;
        this.f5485j = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jh.i iVar, a0 a0Var, int i10, f fVar) {
        super(2, fVar);
        this.f5481f = 10;
        this.f5484i = iVar;
        this.f5485j = a0Var;
        this.f5482g = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(e0 e0Var, jk.c cVar, f fVar) {
        super(2, fVar);
        this.f5481f = 12;
        this.f5484i = e0Var;
        this.f5485j = (i) cVar;
    }
}
