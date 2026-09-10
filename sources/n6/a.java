package n6;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.internal.ads.dm0;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f46564c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f46562a = i10;
        this.f46563b = obj;
        this.f46564c = obj2;
    }

    @Override // e6.k
    public final g6.a0 a(Object obj, int i10, int i11, e6.i iVar) {
        boolean z10;
        v vVar;
        a7.f fVar;
        switch (this.f46562a) {
            case 0:
                g6.a0 a0VarA = ((e6.k) this.f46563b).a(obj, i10, i11, iVar);
                Resources resources = (Resources) this.f46564c;
                if (a0VarA == null) {
                    return null;
                }
                return new d(resources, a0VarA);
            case 1:
                g6.a0 a0VarC = ((p6.c) this.f46563b).c((Uri) obj, iVar);
                if (a0VarC == null) {
                    return null;
                }
                return p.a((h6.a) this.f46564c, (Drawable) ((p6.b) a0VarC).get(), i10, i11);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof v) {
                    vVar = (v) inputStream;
                    z10 = false;
                } else {
                    z10 = true;
                    vVar = new v(inputStream, (dm0) this.f46564c);
                }
                ArrayDeque arrayDeque = a7.f.f3422c;
                synchronized (arrayDeque) {
                    fVar = (a7.f) arrayDeque.poll();
                    break;
                }
                if (fVar == null) {
                    fVar = new a7.f();
                }
                a7.f fVar2 = fVar;
                fVar2.f3423a = vVar;
                a7.m mVar = new a7.m(fVar2);
                m5.k kVar = new m5.k(4, vVar, fVar2);
                try {
                    n nVar = (n) this.f46563b;
                    d dVarA = nVar.a(new v9.e(mVar, nVar.f46603d, nVar.f46602c), i10, i11, iVar, kVar);
                    fVar2.f3424b = null;
                    fVar2.f3423a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(fVar2);
                        break;
                    }
                    return dVarA;
                } finally {
                    fVar2.f3424b = null;
                    fVar2.f3423a = null;
                    ArrayDeque arrayDeque2 = a7.f.f3422c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(fVar2);
                        if (z10) {
                            vVar.d();
                        }
                    }
                }
        }
    }

    @Override // e6.k
    public final boolean b(Object obj, e6.i iVar) {
        switch (this.f46562a) {
            case 0:
                return ((e6.k) this.f46563b).b(obj, iVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    public a(Resources resources, e6.k kVar) {
        this.f46562a = 0;
        this.f46564c = resources;
        this.f46563b = kVar;
    }
}
