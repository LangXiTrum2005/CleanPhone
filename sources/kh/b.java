package kh;

import ak.f;
import android.net.Uri;
import android.util.Log;
import ck.i;
import cn.a0;
import cn.l;
import com.google.android.gms.internal.ads.ur1;
import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.util.concurrent.Future;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements jk.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f44635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f44636h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, float f10, f fVar) {
        super(2, fVar);
        this.f44635g = str;
        this.f44636h = f10;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new b(this.f44635g, this.f44636h, fVar);
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((a0) obj, (f) obj2)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) throws ug.a {
        int i10 = this.f44634f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            return obj;
        }
        t9.e.z(obj);
        e eVar = e.f44647a;
        String str = this.f44635g;
        String strB = e.b(str);
        if (strB == null) {
            throw new ug.a("1001", "No asset found", "");
        }
        Uri uriFromFile = Uri.fromFile(new File(strB));
        String strA = e.a();
        File parentFile = new File(strA).getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            throw new ug.a("1003", "No valid directory", "");
        }
        n.c(uriFromFile);
        int iC = e.c(uriFromFile);
        float f10 = this.f44636h;
        int i11 = (int) (iC * ((100 - f10) / 100.0f));
        this.f44634f = 1;
        l lVar = new l(1, q1.t(this));
        lVar.t();
        try {
            e.f44649c = false;
            hg.b bVar = new hg.b(1);
            kg.b bVar2 = new kg.b();
            bVar2.f44624a = bVar;
            bVar2.f44626c = 30;
            bVar2.f44625b = i11;
            bVar2.f44627d = 3.0f;
            bVar2.f44628e = "video/avc";
            kg.c cVar = new kg.c(bVar2);
            ur1 ur1Var = new ur1();
            ur1Var.f20874a = -1;
            ur1Var.f20877d = -1;
            ur1Var.f20876c = MimeTypes.AUDIO_AAC;
            ur1Var.f20875b = Long.MIN_VALUE;
            kg.a aVar = new kg.a();
            aVar.f44623a = ur1Var;
            uf.b bVar3 = new uf.b(strA);
            jg.e eVar2 = new jg.e(eVar.h(), uriFromFile);
            bVar3.f52199b.add(eVar2);
            bVar3.f52200c.add(eVar2);
            bVar3.f52202e = cVar;
            bVar3.f52201d = aVar;
            bVar3.f52207j = new i6.f(lVar, str, f10, strA);
            Future futureA = bVar3.a();
            n.e(futureA, "transcode(...)");
            lVar.v(new cl.a(futureA, 4));
        } catch (Exception e10) {
            if (e.f44649c) {
                lVar.resumeWith(t9.e.c(e.f44650d));
            }
            String message = "Error in compressVideoFile: " + e10.getMessage();
            n.f(message, "message");
            Log.e("VideoCompressService", message);
            String message2 = e10.getMessage();
            lVar.resumeWith(t9.e.c(new ug.a("1005", "Unknown error. See the provided details", message2 != null ? message2 : "")));
        }
        Object objS = lVar.s();
        bk.a aVar2 = bk.a.f5708a;
        return objS == aVar2 ? aVar2 : objS;
    }
}
