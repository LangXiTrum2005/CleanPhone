package kh;

import ak.f;
import android.util.Log;
import ck.i;
import cn.a0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.n;
import wi.j;
import wj.r;
import xi.g;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44642f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f44644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f44645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f44646j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f10, String str, j jVar, f fVar) {
        super(2, fVar);
        this.f44644h = f10;
        this.f44645i = str;
        this.f44646j = jVar;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        switch (this.f44642f) {
            case 0:
                return new d(this.f44645i, this.f44644h, this.f44643g, (String) this.f44646j, fVar);
            default:
                return new d(this.f44644h, this.f44645i, (j) this.f44646j, fVar);
        }
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        a0 a0Var = (a0) obj;
        f fVar = (f) obj2;
        switch (this.f44642f) {
            case 0:
                d dVar = (d) create(a0Var, fVar);
                r rVar = r.f53297a;
                dVar.invokeSuspend(rVar);
                return rVar;
            default:
                return ((d) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.f44642f;
        r rVar = r.f53297a;
        String str = this.f44645i;
        float f10 = this.f44644h;
        Object obj2 = this.f44646j;
        switch (i10) {
            case 0:
                t9.e.z(obj);
                try {
                    g gVar = e.f44648b;
                    if (gVar != null) {
                        gVar.b(b0.Q(new wj.f("assetId", str), new wj.f("compressionRate", new Double(f10)), new wj.f("compressionProgress", new Integer(this.f44643g)), new wj.f("outputPath", (String) obj2)));
                    }
                    break;
                } catch (Exception e10) {
                    String message = "Error sending progress update: " + e10;
                    n.f(message, "message");
                    Log.e("VideoCompressService", message);
                }
                return rVar;
            default:
                j jVar = (j) obj2;
                int i11 = this.f44643g;
                try {
                    if (i11 == 0) {
                        t9.e.z(obj);
                        e eVar = e.f44647a;
                        this.f44643g = 1;
                        obj = eVar.d(f10, str, this);
                        bk.a aVar = bk.a.f5708a;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t9.e.z(obj);
                    }
                    jVar.a((String) obj);
                    return rVar;
                } catch (CancellationException e11) {
                    Throwable cause = e11.getCause();
                    n.d(cause, "null cannot be cast to non-null type com.storage.androidcleaner.flutter.models.ProjectFlutterException");
                    ug.a aVar2 = (ug.a) cause;
                    jVar.b(aVar2.f52209a, aVar2.f52210b, aVar2.f52211c);
                    return rVar;
                } catch (Exception e12) {
                    String tag = "Compression failed: " + e12;
                    n.f(tag, "tag");
                    Log.e(tag, "FlutterVideoCompressMethodChannelHandler");
                    jVar.b("1005", "Unknown error. See the provided details", e12.getMessage());
                    return rVar;
                } catch (ug.a e13) {
                    jVar.b(e13.f52209a, e13.f52210b, e13.f52211c);
                    return rVar;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, float f10, int i10, String str2, f fVar) {
        super(2, fVar);
        this.f44645i = str;
        this.f44644h = f10;
        this.f44643g = i10;
        this.f44646j = str2;
    }
}
