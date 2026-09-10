package l6;

import com.bumptech.glide.load.data.l;
import e6.h;
import java.util.ArrayDeque;
import k6.o;
import k6.p;
import k6.q;
import k6.r;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f45052b = h.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f45053a;

    public a(i iVar) {
        this.f45053a = iVar;
    }

    @Override // k6.r
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // k6.r
    public final q b(Object obj, int i10, int i11, e6.i iVar) {
        k6.h hVar = (k6.h) obj;
        i iVar2 = this.f45053a;
        if (iVar2 != null) {
            o oVar = (o) iVar2.f50111a;
            p pVarA = p.a(hVar);
            Object objA = oVar.a(pVarA);
            ArrayDeque arrayDeque = p.f44367b;
            synchronized (arrayDeque) {
                arrayDeque.offer(pVarA);
            }
            k6.h hVar2 = (k6.h) objA;
            if (hVar2 == null) {
                oVar.e(p.a(hVar), hVar);
            } else {
                hVar = hVar2;
            }
        }
        return new q(hVar, new l(hVar, ((Integer) iVar.c(f45052b)).intValue()));
    }
}
