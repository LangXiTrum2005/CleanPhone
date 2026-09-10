package fh;

import android.util.Log;
import cn.a0;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends ck.i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f40836h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(List list, ak.f fVar, int i10) {
        super(2, fVar);
        this.f40834f = i10;
        this.f40836h = list;
    }

    @Override // ck.a
    public final ak.f create(Object obj, ak.f fVar) {
        switch (this.f40834f) {
            case 0:
                return new a(this.f40836h, fVar, 0);
            case 1:
                return new a(this.f40836h, fVar, 1);
            default:
                return new a(this.f40836h, fVar, 2);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ak.f fVar = (ak.f) obj2;
        switch (this.f40834f) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((a) create(a0Var, fVar)).invokeSuspend(wj.r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f40834f;
        wj.r rVar = wj.r.f53297a;
        List list = this.f40836h;
        bk.a aVar = bk.a.f5708a;
        switch (i10) {
            case 0:
                int i11 = this.f40835g;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return rVar;
                }
                t9.e.z(obj);
                s sVar = s.f40910a;
                this.f40835g = 1;
                return s.f(list, this) == aVar ? aVar : rVar;
            case 1:
                int i12 = this.f40835g;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t9.e.z(obj);
                    return rVar;
                }
                t9.e.z(obj);
                s sVar2 = s.f40910a;
                this.f40835g = 1;
                return s.e(list, this) == aVar ? aVar : rVar;
            default:
                int i13 = this.f40835g;
                try {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj);
                        return rVar;
                    }
                    t9.e.z(obj);
                    File file = new File(gh.b.f41895a.h().getFilesDir(), gh.b.d().a());
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    bo.e eVar = gh.b.f41897c;
                    this.f40835g = 1;
                    return eVar.e(list, file, this) == aVar ? aVar : rVar;
                } catch (Exception e10) {
                    Log.e("ProjectLogger", "File Storage: Error saving folders", e10);
                    return rVar;
                }
        }
    }
}
