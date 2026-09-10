package fh;

import cn.d0;
import com.google.android.gms.internal.ads.l11;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f40930a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gh.b f40931b = gh.b.f41895a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ch.c f40932c;

    static {
        ConcurrentHashMap concurrentHashMap = ch.f.f6431a;
        f40932c = ch.f.a(ch.e.f6426e);
    }

    public static void b() {
        d0.C(ak.l.f3620a, new u((Map) com.bumptech.glide.d.K(s.f40918i), (List) com.bumptech.glide.d.K(s.f40919j), null, 1));
    }

    public static void c(Map assets, List folders) {
        kotlin.jvm.internal.n.f(assets, "assets");
        kotlin.jvm.internal.n.f(folders, "folders");
        s.f40918i.a(assets);
        s.f40919j.a(folders);
        b();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ck.c cVar) {
        t tVar;
        Map map;
        List list;
        Object objF;
        Map map2;
        List list2;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i10 = tVar.f40925j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f40925j = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objF2 = tVar.f40923h;
        int i11 = tVar.f40925j;
        wj.r rVar = wj.r.f53297a;
        gh.b bVar = f40931b;
        int i12 = 2;
        ak.f fVar = null;
        bk.a aVar = bk.a.f5708a;
        if (i11 == 0) {
            t9.e.z(objF2);
            tVar.f40925j = 1;
            bVar.getClass();
            objF2 = android.support.v4.media.session.a.f(new l11(i12, fVar, 4), tVar);
            if (objF2 != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            t9.e.z(objF2);
        } else {
            if (i11 == 2) {
                map = tVar.f40921f;
                t9.e.z(objF2);
                list = (List) objF2;
                if ((!map.isEmpty()) != (true ^ list.isEmpty())) {
                    tVar.f40921f = null;
                    tVar.f40922g = null;
                    tVar.f40925j = 3;
                    if (bVar.c(tVar) == aVar) {
                        return rVar;
                    }
                } else {
                    List list3 = list;
                    kotlin.jvm.internal.n.f(list3, "<this>");
                    List listI0 = xj.n.I0(list3, new ae.l(3));
                    tVar.f40921f = map;
                    tVar.f40922g = list;
                    tVar.f40925j = 4;
                    bVar.getClass();
                    objF = android.support.v4.media.session.a.f(new a(listI0, fVar, 2), tVar);
                    if (objF != aVar) {
                        objF = rVar;
                    }
                    if (objF != aVar) {
                        map2 = map;
                        list2 = list;
                    }
                }
                return aVar;
            }
            if (i11 == 3) {
                List list4 = tVar.f40922g;
                Map map3 = tVar.f40921f;
                t9.e.z(objF2);
                ((wj.h) objF2).getClass();
                return rVar;
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = tVar.f40922g;
            map2 = tVar.f40921f;
            t9.e.z(objF2);
        }
        s.f40918i.a(map2);
        s.f40919j.a(list2);
        return rVar;
        Map map4 = (Map) objF2;
        tVar.f40921f = map4;
        tVar.f40925j = 2;
        bVar.getClass();
        Object objF3 = android.support.v4.media.session.a.f(new l11(i12, fVar, 6), tVar);
        if (objF3 != aVar) {
            map = map4;
            objF2 = objF3;
            list = (List) objF2;
            if ((!map.isEmpty()) != (true ^ list.isEmpty())) {
                tVar.f40921f = null;
                tVar.f40922g = null;
                tVar.f40925j = 3;
                if (bVar.c(tVar) == aVar) {
                    return rVar;
                }
            } else {
                List list5 = list;
                kotlin.jvm.internal.n.f(list5, "<this>");
                List listI1 = xj.n.I0(list5, new ae.l(3));
                tVar.f40921f = map;
                tVar.f40922g = list;
                tVar.f40925j = 4;
                bVar.getClass();
                objF = android.support.v4.media.session.a.f(new a(listI1, fVar, 2), tVar);
                if (objF != aVar) {
                    objF = rVar;
                }
                if (objF != aVar) {
                    map2 = map;
                    list2 = list;
                    s.f40918i.a(map2);
                    s.f40919j.a(list2);
                    return rVar;
                }
            }
        }
        return aVar;
    }
}
