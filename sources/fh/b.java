package fh;

import android.media.AudioManager;
import cn.a0;
import cn.d0;
import cn.n0;
import com.google.android.gms.internal.ads.l11;
import java.util.Date;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40838g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, ak.f fVar, int i11) {
        super(i10, fVar);
        this.f40837f = i11;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f40837f) {
            case 0:
                return new b(2, fVar, 0);
            case 1:
                return new b(2, fVar, 1);
            case 2:
                return new b(2, fVar, 2);
            case 3:
                return new b(2, fVar, 3);
            case 4:
                return new b(2, fVar, 4);
            default:
                return new b(2, fVar, 5);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f40837f) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((b) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.f40837f;
        jh.h hVar = jh.h.f43879a;
        wj.r rVar = wj.r.f53297a;
        ak.f fVar = null;
        int i11 = 2;
        bk.a aVar = bk.a.f5708a;
        int i12 = 1;
        switch (i10) {
            case 0:
                int i13 = this.f40838g;
                if (i13 == 0) {
                    t9.e.z(obj);
                    v vVar = v.f40930a;
                    this.f40838g = 1;
                    Object objJ = d0.J(v.f40932c.f6421b.f42424a, new l11(i11, fVar, i12), this);
                    if (objJ != aVar) {
                        objJ = rVar;
                    }
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                xi.g gVar = s.f40912c;
                if (gVar == null) {
                    return rVar;
                }
                gVar.b("scanEnded");
                return rVar;
            case 1:
                int i14 = this.f40838g;
                if (i14 == 0) {
                    t9.e.z(obj);
                    this.f40838g = 1;
                    obj = fn.g.k(new jh.c(new fn.k(hVar.a().getData(), new jh.e(3, null), 2), 1), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                long jLongValue = ((Number) obj).longValue();
                if (jLongValue != -1) {
                    return new Date(jLongValue);
                }
                return null;
            case 2:
                int i15 = this.f40838g;
                if (i15 == 0) {
                    t9.e.z(obj);
                    gh.b bVar = gh.b.f41895a;
                    this.f40838g = 1;
                    Object objF = android.support.v4.media.session.a.f(new l11(i11, fVar, i11), this);
                    if (objF != aVar) {
                        objF = rVar;
                    }
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                s sVar = s.f40910a;
                s.f40913d = true;
                ch.g.f6432a.a();
                bf.b bVar2 = s.f40918i;
                android.support.v4.media.session.a.B(new b4.a(new vg.g(((Map) com.bumptech.glide.d.K(bVar2)).isEmpty()), fVar, 10));
                if (!((Map) com.bumptech.glide.d.K(bVar2)).isEmpty()) {
                    return rVar;
                }
                d0.C(ak.l.f3620a, new b4.a(fVar, fVar, 4));
                return rVar;
            case 3:
                int i16 = this.f40838g;
                if (i16 == 0) {
                    t9.e.z(obj);
                    this.f40838g = 1;
                    return hVar.c(jh.i.SESSION_COUNT, 1, this) == aVar ? aVar : rVar;
                }
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
                return rVar;
            case 4:
                int i17 = this.f40838g;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return rVar;
                }
                t9.e.z(obj);
                zg.a aVar2 = zg.a.f54953a;
                this.f40838g = 1;
                AudioManager audioManager = zg.a.f54955c;
                s5.n nVar = new s5.n(audioManager.getRingerMode() == 0 || audioManager.getRingerMode() == 1, fVar, i11);
                jn.e eVar = n0.f6748a;
                return d0.J(hn.o.f42451a, nVar, this) == aVar ? aVar : rVar;
            default:
                int i18 = this.f40838g;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return rVar;
                }
                t9.e.z(obj);
                zg.a aVar3 = zg.a.f54953a;
                this.f40838g = 1;
                AudioManager audioManager2 = zg.a.f54955c;
                s5.n nVar2 = new s5.n(audioManager2.getRingerMode() == 0 || audioManager2.getRingerMode() == 1, fVar, i11);
                jn.e eVar2 = n0.f6748a;
                return d0.J(hn.o.f42451a, nVar2, this) == aVar ? aVar : rVar;
        }
    }
}
