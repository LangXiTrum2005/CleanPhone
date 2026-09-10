package oj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f47535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f47537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f47538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f47539j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(z zVar, String str, String str2, ak.f fVar, int i10) {
        super(2, fVar);
        this.f47535f = i10;
        this.f47537h = zVar;
        this.f47538i = str;
        this.f47539j = str2;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f47535f) {
            case 0:
                return new u(this.f47537h, this.f47538i, this.f47539j, fVar, 0);
            case 1:
                return new u(this.f47537h, this.f47538i, this.f47539j, fVar, 1);
            default:
                return new u(this.f47537h, this.f47538i, this.f47539j, fVar, 2);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        cn.a0 a0Var = (cn.a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f47535f) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((u) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f47535f) {
            case 0:
                int i10 = this.f47536g;
                if (i10 == 0) {
                    t9.e.z(obj);
                    this.f47536g = 1;
                    Object objB = z.b(this.f47537h, this.f47538i, this.f47539j, this);
                    bk.a aVar = bk.a.f5708a;
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return wj.r.f53297a;
            case 1:
                int i11 = this.f47536g;
                if (i11 == 0) {
                    t9.e.z(obj);
                    this.f47536g = 1;
                    Object objB2 = z.b(this.f47537h, this.f47538i, this.f47539j, this);
                    bk.a aVar2 = bk.a.f5708a;
                    if (objB2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return wj.r.f53297a;
            default:
                int i12 = this.f47536g;
                if (i12 == 0) {
                    t9.e.z(obj);
                    this.f47536g = 1;
                    Object objB3 = z.b(this.f47537h, this.f47538i, this.f47539j, this);
                    bk.a aVar3 = bk.a.f5708a;
                    if (objB3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                }
                return wj.r.f53297a;
        }
    }
}
