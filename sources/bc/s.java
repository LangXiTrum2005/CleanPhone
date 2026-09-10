package bc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.SparseArray;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.a3;
import com.google.android.gms.internal.ads.aa1;
import com.google.android.gms.internal.ads.ca1;
import com.google.android.gms.internal.ads.h3;
import com.google.android.gms.internal.ads.lb;
import com.google.android.gms.internal.ads.ni;
import com.google.android.gms.internal.ads.o2;
import com.google.android.gms.internal.ads.p7;
import com.google.android.gms.internal.ads.r7;
import com.google.android.gms.internal.ads.rb0;
import com.google.android.gms.internal.ads.uf;
import com.google.android.gms.internal.ads.wa;
import com.google.android.gms.internal.ads.x91;
import com.google.android.gms.internal.ads.y42;
import com.google.android.gms.internal.ads.ya1;
import ea.a1;
import ea.f2;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k9.c0;
import l1.u;
import l1.w;
import n2.a0;
import n2.t;
import p1.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements com.google.android.gms.internal.ads.j, o2, n2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5583d;

    public s(bo.e eVar, i9.i iVar, i9.c[] cVarArr, boolean z10) {
        this.f5583d = eVar;
        this.f5581b = iVar;
        this.f5582c = cVarArr;
        this.f5580a = z10;
    }

    public void a() {
        c6.d.a((c6.d) this.f5583d, this, false);
    }

    public File b() {
        File file;
        synchronized (((c6.d) this.f5583d)) {
            try {
                c6.c cVar = (c6.c) this.f5581b;
                if (cVar.f5932f != this) {
                    throw new IllegalStateException();
                }
                if (!cVar.f5931e) {
                    ((boolean[]) this.f5582c)[0] = true;
                }
                file = cVar.f5930d[0];
                ((c6.d) this.f5583d).f5934a.mkdirs();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return file;
    }

    public void c() {
        w wVar = (w) this.f5583d;
        if (this.f5580a) {
            wVar.c(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this, 17));
            this.f5580a = false;
        }
    }

    public boolean d(String str, String str2) {
        synchronized (this) {
            try {
                if (!((e) ((AtomicMarkableReference) this.f5581b).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f5581b;
                atomicMarkableReference.set((e) atomicMarkableReference.getReference(), true);
                androidx.fragment.app.n nVar = new androidx.fragment.app.n(this, 6);
                AtomicReference atomicReference = (AtomicReference) this.f5582c;
                while (!atomicReference.compareAndSet(null, nVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((ac.g) ((fc.f) this.f5583d).f40782d).f3463b.a(nVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o2
    public h3 e(int i10, int i11) {
        o2 o2Var = (o2) this.f5581b;
        if (i11 != 3 && i11 != 5) {
            this.f5580a = true;
        }
        if (i11 != 3) {
            return o2Var.e(i10, i11);
        }
        SparseArray sparseArray = (SparseArray) this.f5583d;
        r7 r7Var = (r7) sparseArray.get(i10);
        if (r7Var != null) {
            return r7Var;
        }
        r7 r7Var2 = new r7(o2Var.e(i10, 3), (p7) this.f5582c);
        sparseArray.put(i10, r7Var2);
        return r7Var2;
    }

    @Override // n2.m
    public void endTracks() {
        SparseArray sparseArray = (SparseArray) this.f5583d;
        ((n2.m) this.f5581b).endTracks();
        if (this.f5580a) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((k3.o) sparseArray.valueAt(i10)).f44309i = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j
    public ya1 f(int i10, ni niVar, int[] iArr) {
        com.google.android.gms.internal.ads.m mVar = (com.google.android.gms.internal.ads.m) this.f5581b;
        com.google.android.gms.internal.ads.h hVar = (com.google.android.gms.internal.ads.h) this.f5582c;
        com.google.android.gms.internal.ads.c cVar = new com.google.android.gms.internal.ads.c(mVar, hVar);
        int i11 = ((int[]) this.f5583d)[i10];
        aa1 aa1Var = ca1.f13122b;
        rb0.p(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i12 = 0;
        int i13 = 0;
        while (i12 < niVar.f17829a) {
            int i14 = i10;
            ni niVar2 = niVar;
            y42 y42Var = new y42(i14, niVar2, i12, hVar, iArr[i12], this.f5580a, cVar);
            int length = objArrCopyOf.length;
            int i15 = i13 + 1;
            int iD = x91.d(length, i15);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i13] = y42Var;
            i12++;
            i13 = i15;
            i10 = i14;
            niVar = niVar2;
        }
        return ca1.A(i13, objArrCopyOf);
    }

    public String g() {
        if (!this.f5580a) {
            this.f5580a = true;
            a1 a1Var = (a1) this.f5583d;
            this.f5582c = a1Var.K0().getString((String) this.f5581b, null);
        }
        return (String) this.f5582c;
    }

    public void h(String str) {
        SharedPreferences.Editor editorEdit = ((a1) this.f5583d).K0().edit();
        editorEdit.putString((String) this.f5581b, str);
        editorEdit.apply();
        this.f5582c = str;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void o(a3 a3Var) {
        ((o2) this.f5581b).o(a3Var);
    }

    @Override // n2.m
    public a0 track(int i10, int i11) {
        SparseArray sparseArray = (SparseArray) this.f5583d;
        n2.m mVar = (n2.m) this.f5581b;
        if (i11 != 3) {
            this.f5580a = true;
            return mVar.track(i10, i11);
        }
        k3.o oVar = (k3.o) sparseArray.get(i10);
        if (oVar != null) {
            return oVar;
        }
        k3.o oVar2 = new k3.o(mVar.track(i10, i11), (k3.k) this.f5582c);
        sparseArray.put(i10, oVar2);
        return oVar2;
    }

    @Override // n2.m
    public void u(t tVar) {
        ((n2.m) this.f5581b).u(tVar);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public void zzv() {
        ((o2) this.f5581b).zzv();
        if (!this.f5580a) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.f5583d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            ((r7) sparseArray.valueAt(i10)).f19450i = true;
            i10++;
        }
    }

    public /* synthetic */ s(com.google.android.gms.internal.ads.m mVar, com.google.android.gms.internal.ads.h hVar, boolean z10, int[] iArr) {
        this.f5581b = mVar;
        this.f5582c = hVar;
        this.f5580a = z10;
        this.f5583d = iArr;
    }

    public s(lb lbVar) {
        this.f5580a = false;
        this.f5581b = null;
        this.f5582c = null;
        this.f5583d = lbVar;
    }

    public s(Object obj, wa waVar) {
        this.f5580a = false;
        this.f5581b = obj;
        this.f5582c = waVar;
        this.f5583d = null;
    }

    public s(o2 o2Var, p7 p7Var) {
        this.f5581b = o2Var;
        this.f5582c = p7Var;
        this.f5583d = new SparseArray();
    }

    public s(a1 a1Var, String str) {
        this.f5583d = a1Var;
        c0.e(str);
        this.f5581b = str;
    }

    public s(n2.m mVar, k3.k kVar) {
        this.f5581b = mVar;
        this.f5582c = kVar;
        this.f5583d = new SparseArray();
    }

    public s(Context context, Looper looper, Looper looper2, v vVar, u uVar) {
        this.f5581b = context.getApplicationContext();
        this.f5583d = uVar.a(looper, null);
        this.f5582c = new j1.a(this, uVar.a(looper2, null), vVar);
    }

    public s(i9.i iVar, t6.k kVar) {
        this.f5583d = new uf(this, 7);
        this.f5582c = iVar;
        this.f5581b = kVar;
    }

    public s(fc.f fVar, boolean z10) {
        this.f5583d = fVar;
        this.f5582c = new AtomicReference(null);
        this.f5580a = z10;
        this.f5581b = new AtomicMarkableReference(new e(z10 ? Segment.SIZE : 1024), false);
    }

    public s(Context context, String str, f2 f2Var, boolean z10) {
        this.f5581b = context;
        this.f5582c = str;
        this.f5583d = f2Var;
        this.f5580a = z10;
    }

    public s(c6.d dVar, c6.c cVar) {
        this.f5583d = dVar;
        this.f5581b = cVar;
        this.f5582c = cVar.f5931e ? null : new boolean[dVar.f5940g];
    }
}
