package com.google.android.gms.internal.ads;

import com.ironsource.B5;
import com.ironsource.C0375hc;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u71 extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20673f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f20675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f20676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f20677j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f20678k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u71(uo0 uo0Var, jk.c cVar, ak.f fVar) {
        super(2, fVar);
        this.f20678k = uo0Var;
        this.f20676i = (ck.i) cVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ck.i, jk.c] */
    /* JADX WARN: Type inference failed for: r7v6, types: [ck.i, jk.d] */
    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f20673f) {
            case 0:
                u71 u71Var = new u71((uo0) this.f20678k, (jk.c) this.f20676i, fVar);
                u71Var.f20677j = obj;
                return u71Var;
            case 1:
                return new u71((ln.h) this.f20677j, (dh.b) this.f20678k, fVar);
            case 2:
                u71 u71Var2 = new u71((fn.e) this.f20678k, (jk.d) this.f20675h, fVar);
                u71Var2.f20677j = obj;
                return u71Var2;
            case 3:
                return new u71((wi.j) this.f20676i, (List) this.f20677j, (List) this.f20678k, fVar);
            default:
                return new u71((xd.d) this.f20675h, this.f20677j, (b4.c) this.f20676i, (jh.f) this.f20678k, fVar);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20673f) {
            case 0:
                return ((u71) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 1:
                return ((u71) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 2:
                return ((u71) create((fn.f) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            case 3:
                return ((u71) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
            default:
                return ((u71) create((cn.a0) obj, (ak.f) obj2)).invokeSuspend(wj.r.f53297a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ck.i, jk.d] */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th2;
        ln.a aVar;
        dh.b bVar;
        Object fVar;
        ln.h hVar;
        fn.p pVar;
        wi.j jVar;
        switch (this.f20673f) {
            case 0:
                int i10 = this.f20674g;
                bk.a aVar2 = bk.a.f5708a;
                if (i10 == 0) {
                    t9.e.z(obj);
                    cn.d0.m(((cn.a0) this.f20677j).getCoroutineContext());
                    uo0 uo0Var = (uo0) this.f20678k;
                    ck.i iVar = (ck.i) this.f20676i;
                    ln.c cVar = (ln.c) uo0Var.f20839b;
                    this.f20677j = cVar;
                    this.f20675h = iVar;
                    this.f20674g = 1;
                    if (com.google.android.gms.internal.play_billing.q1.I(t71.f20234b, cVar, this) == aVar2) {
                        return aVar2;
                    }
                    com.google.android.gms.internal.play_billing.q1.t(this).resumeWith(wj.r.f53297a);
                    return aVar2;
                }
                if (i10 != 1) {
                    aVar = (ln.a) this.f20677j;
                    try {
                        t9.e.z(obj);
                        ((ln.c) aVar).g(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        ((ln.c) aVar).g(null);
                        throw th2;
                    }
                }
                jk.c cVar2 = (jk.c) ((ck.i) this.f20675h);
                ln.a aVar3 = (ln.a) this.f20677j;
                t9.e.z(obj);
                try {
                    this.f20677j = aVar3;
                    this.f20675h = null;
                    this.f20674g = 2;
                    obj = cn.d0.k(cVar2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    aVar = aVar3;
                    ((ln.c) aVar).g(null);
                    return obj;
                } catch (Throwable th4) {
                    th2 = th4;
                    aVar = aVar3;
                    ((ln.c) aVar).g(null);
                    throw th2;
                }
            case 1:
                int i11 = this.f20674g;
                try {
                    if (i11 == 0) {
                        t9.e.z(obj);
                        ln.h hVar2 = (ln.h) this.f20677j;
                        bVar = (dh.b) this.f20678k;
                        this.f20675h = hVar2;
                        this.f20676i = bVar;
                        this.f20674g = 1;
                        Object objA = hVar2.a(this);
                        fVar = bk.a.f5708a;
                        if (objA != fVar) {
                            hVar = hVar2;
                        }
                        return fVar;
                    }
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (dh.b) this.f20676i;
                    hVar = (ln.h) this.f20675h;
                    t9.e.z(obj);
                    fVar = new wj.f(bVar, bVar.a());
                    return fVar;
                } finally {
                    hVar.c();
                }
            case 2:
                fn.f fVar2 = (fn.f) this.f20677j;
                int i12 = this.f20674g;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (fn.p) this.f20676i;
                    try {
                        t9.e.z(obj);
                    } catch (gn.a e10) {
                        e = e10;
                        if (e.f41980a == pVar) {
                            throw e;
                        }
                        cn.d0.m(getContext());
                    }
                    break;
                } else {
                    t9.e.z(obj);
                    fn.e eVar = (fn.e) this.f20678k;
                    fn.p pVar2 = new fn.p((ck.i) this.f20675h, fVar2);
                    try {
                        this.f20677j = null;
                        this.f20676i = pVar2;
                        this.f20674g = 1;
                        Object objCollect = eVar.collect(pVar2, this);
                        bk.a aVar4 = bk.a.f5708a;
                        if (objCollect == aVar4) {
                            return aVar4;
                        }
                    } catch (gn.a e11) {
                        e = e11;
                        pVar = pVar2;
                        if (e.f41980a == pVar) {
                            throw e;
                        }
                        cn.d0.m(getContext());
                    }
                }
                return wj.r.f53297a;
            case 3:
                int i13 = this.f20674g;
                if (i13 == 0) {
                    t9.e.z(obj);
                    wi.j jVar2 = (wi.j) this.f20676i;
                    kh.e eVar2 = kh.e.f44647a;
                    List list = (List) this.f20677j;
                    List list2 = (List) this.f20678k;
                    this.f20675h = jVar2;
                    this.f20674g = 1;
                    Object objE = eVar2.e(list, list2, this);
                    bk.a aVar5 = bk.a.f5708a;
                    if (objE == aVar5) {
                        return aVar5;
                    }
                    obj = objE;
                    jVar = jVar2;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = (wi.j) this.f20675h;
                    t9.e.z(obj);
                }
                jVar.a(obj);
                return wj.r.f53297a;
            default:
                jh.f fVar3 = (jh.f) this.f20678k;
                int i14 = this.f20674g;
                wj.r rVar = wj.r.f53297a;
                bk.a aVar6 = bk.a.f5708a;
                try {
                    if (i14 != 0) {
                        if (i14 == 1 || i14 == 2) {
                            t9.e.z(obj);
                            return rVar;
                        }
                        if (i14 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj);
                        return rVar;
                    }
                    t9.e.z(obj);
                    URLConnection uRLConnectionOpenConnection = xd.d.a((xd.d) this.f20675h).openConnection();
                    kotlin.jvm.internal.n.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod(C0375hc.f28788a);
                    httpsURLConnection.setRequestProperty("Accept", B5.M);
                    for (Map.Entry entry : this.f20677j.entrySet()) {
                        httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                sb2.append(line);
                            } else {
                                bufferedReader.close();
                                inputStream.close();
                                JSONObject jSONObject = new JSONObject(sb2.toString());
                                b4.c cVar3 = (b4.c) this.f20676i;
                                this.f20674g = 1;
                                if (cVar3.invoke(jSONObject, this) != aVar6) {
                                    return rVar;
                                }
                            }
                        }
                    } else {
                        this.f20674g = 2;
                        fVar3.invoke("Bad response code: " + responseCode, this);
                        if (rVar != aVar6) {
                            return rVar;
                        }
                    }
                    return aVar6;
                } catch (Exception e12) {
                    String message = e12.getMessage();
                    if (message == null) {
                        message = e12.toString();
                    }
                    this.f20674g = 3;
                    fVar3.invoke(message, this);
                    if (rVar != aVar6) {
                        return rVar;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u71(fn.e eVar, jk.d dVar, ak.f fVar) {
        super(2, fVar);
        this.f20678k = eVar;
        this.f20675h = (ck.i) dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u71(ln.h hVar, dh.b bVar, ak.f fVar) {
        super(2, fVar);
        this.f20677j = hVar;
        this.f20678k = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u71(wi.j jVar, List list, List list2, ak.f fVar) {
        super(2, fVar);
        this.f20676i = jVar;
        this.f20677j = list;
        this.f20678k = list2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u71(xd.d dVar, Map map, b4.c cVar, jh.f fVar, ak.f fVar2) {
        super(2, fVar2);
        this.f20675h = dVar;
        this.f20677j = map;
        this.f20676i = cVar;
        this.f20678k = fVar;
    }
}
