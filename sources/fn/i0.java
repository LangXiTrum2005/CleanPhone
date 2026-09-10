package fn;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f41090b;

    public i0(f fVar, int i10) {
        this.f41089a = i10;
        switch (i10) {
            case 2:
                this.f41090b = fVar;
                break;
            default:
                this.f41090b = fVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0186  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // fn.f
    public final Object emit(Object obj, ak.f fVar) throws Throwable {
        h0 h0Var;
        jh.b bVar;
        jh.d dVar;
        oj.r rVar;
        s0.r rVar2;
        switch (this.f41089a) {
            case 0:
                if (fVar instanceof h0) {
                    h0Var = (h0) fVar;
                    int i10 = h0Var.f41084g;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        h0Var.f41084g = i10 - Integer.MIN_VALUE;
                    } else {
                        h0Var = new h0(this, fVar);
                    }
                } else {
                    h0Var = new h0(this, fVar);
                }
                Object obj2 = h0Var.f41083f;
                int i11 = h0Var.f41084g;
                if (i11 == 0) {
                    t9.e.z(obj2);
                    if (obj != null) {
                        h0Var.f41084g = 1;
                        Object objEmit = this.f41090b.emit(obj, h0Var);
                        bk.a aVar = bk.a.f5708a;
                        if (objEmit == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj2);
                }
                return wj.r.f53297a;
            case 1:
                if (fVar instanceof jh.b) {
                    bVar = (jh.b) fVar;
                    int i12 = bVar.f43865g;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        bVar.f43865g = i12 - Integer.MIN_VALUE;
                    } else {
                        bVar = new jh.b(this, fVar);
                    }
                } else {
                    bVar = new jh.b(this, fVar);
                }
                Object obj3 = bVar.f43864f;
                int i13 = bVar.f43865g;
                if (i13 == 0) {
                    t9.e.z(obj3);
                    Integer num = (Integer) ((w0.b) obj).c(go.k.O("session_count"));
                    Integer num2 = new Integer(num != null ? num.intValue() : 0);
                    bVar.f43865g = 1;
                    Object objEmit2 = this.f41090b.emit(num2, bVar);
                    bk.a aVar2 = bk.a.f5708a;
                    if (objEmit2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj3);
                }
                return wj.r.f53297a;
            case 2:
                if (fVar instanceof jh.d) {
                    dVar = (jh.d) fVar;
                    int i14 = dVar.f43870g;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        dVar.f43870g = i14 - Integer.MIN_VALUE;
                    } else {
                        dVar = new jh.d(this, fVar);
                    }
                } else {
                    dVar = new jh.d(this, fVar);
                }
                Object obj4 = dVar.f43869f;
                int i15 = dVar.f43870g;
                if (i15 == 0) {
                    t9.e.z(obj4);
                    Long l = (Long) ((w0.b) obj).c(go.k.Q("last_asset_date"));
                    Long l10 = new Long(l != null ? l.longValue() : -1L);
                    dVar.f43870g = 1;
                    Object objEmit3 = this.f41090b.emit(l10, dVar);
                    bk.a aVar3 = bk.a.f5708a;
                    if (objEmit3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj4);
                }
                return wj.r.f53297a;
            case 3:
                if (fVar instanceof oj.r) {
                    rVar = (oj.r) fVar;
                    int i16 = rVar.f47525g;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        rVar.f47525g = i16 - Integer.MIN_VALUE;
                    } else {
                        rVar = new oj.r(this, fVar);
                    }
                } else {
                    rVar = new oj.r(this, fVar);
                }
                Object obj5 = rVar.f47524f;
                int i17 = rVar.f47525g;
                if (i17 == 0) {
                    t9.e.z(obj5);
                    Set setKeySet = ((w0.b) obj).a().keySet();
                    rVar.f47525g = 1;
                    Object objEmit4 = this.f41090b.emit(setKeySet, rVar);
                    bk.a aVar4 = bk.a.f5708a;
                    if (objEmit4 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj5);
                }
                return wj.r.f53297a;
            default:
                if (fVar instanceof s0.r) {
                    rVar2 = (s0.r) fVar;
                    int i18 = rVar2.f49889g;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        rVar2.f49889g = i18 - Integer.MIN_VALUE;
                    } else {
                        rVar2 = new s0.r(this, fVar);
                    }
                } else {
                    rVar2 = new s0.r(this, fVar);
                }
                Object obj6 = rVar2.f49888f;
                int i19 = rVar2.f49889g;
                if (i19 == 0) {
                    t9.e.z(obj6);
                    s0.f1 f1Var = (s0.f1) obj;
                    if (f1Var instanceof s0.y0) {
                        throw ((s0.y0) f1Var).f49955b;
                    }
                    if (!(f1Var instanceof s0.d)) {
                        if (f1Var instanceof s0.o0 ? true : f1Var instanceof s0.g1) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new aa.b((byte) 0, 20);
                    }
                    Object obj7 = ((s0.d) f1Var).f49769b;
                    rVar2.f49889g = 1;
                    Object objEmit5 = this.f41090b.emit(obj7, rVar2);
                    bk.a aVar5 = bk.a.f5708a;
                    if (objEmit5 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj6);
                }
                return wj.r.f53297a;
        }
    }

    public /* synthetic */ i0(f fVar, int i10, boolean z10) {
        this.f41089a = i10;
        this.f41090b = fVar;
    }
}
