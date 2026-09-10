package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd implements ta.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23858b;

    public /* synthetic */ pd(Object obj, int i10) {
        this.f23857a = i10;
        this.f23858b = obj;
    }

    @Override // ta.z
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.f23857a) {
            case 0:
                ud udVar = (ud) this.f23858b;
                int i10 = ((gc) obj).f23512a;
                if ((i10 == 29501 || i10 == 29537 || i10 == 29538 || i10 == 29539 || i10 == 29540 || i10 == 29541 || i10 == 29542 || i10 == 29543 || i10 == 29544) && !udVar.f24046h.N()) {
                    udVar.b();
                }
                return ta.n0.f50627b;
            case 1:
                final g9.k kVar = (g9.k) this.f23858b;
                final le leVar = (le) obj;
                kVar.getClass();
                Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.je
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        le leVar2 = leVar;
                        g9.k kVar2 = kVar;
                        pb pbVar = (pb) kVar2.f41770b;
                        h6 h6Var = new h6(5);
                        try {
                            te teVar = (te) pbVar.f23850f.get();
                            Uri uri = (Uri) kVar2.f41771c;
                            h6 h6Var2 = new h6(leVar2);
                            h6Var2.f23541c = new h6[]{h6Var};
                            return null;
                        } catch (IOException | RuntimeException e10) {
                            gb.g(Level.WARNING, pbVar.a(), e10, "Failed to update snapshot for %s flags may be stale.", (String) kVar2.f41772d);
                            return null;
                        }
                    }
                };
                ta.q0 q0VarA = ((pb) kVar.f41770b).a();
                ta.x0 x0Var = new ta.x0(callable);
                ((ta.t0) q0VarA).execute(x0Var);
                return x0Var;
            case 2:
                return ta.k0.e((ListenableFuture) ((oe) this.f23858b).f23813e.get());
            case 3:
                return ta.k0.d(((sd) this.f23858b).apply(obj));
            case 4:
                return ((mf) this.f23858b).f23746e.F();
            default:
                IOException iOException = (IOException) this.f23858b;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
