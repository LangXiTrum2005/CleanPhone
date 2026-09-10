package bo;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b2.p;
import cn.n0;
import com.google.android.gms.internal.ads.n3;
import com.google.android.gms.internal.measurement.fc;
import com.google.android.gms.internal.measurement.kc;
import com.google.android.gms.internal.measurement.le;
import com.google.android.gms.internal.measurement.nc;
import com.google.android.gms.internal.measurement.ne;
import com.google.android.gms.internal.measurement.oc;
import com.google.android.gms.internal.measurement.rc;
import com.google.firebase.messaging.FirebaseMessaging;
import d5.u;
import fo.a0;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.n;
import l7.i0;
import oa.e2;
import oa.f0;
import oa.l1;
import oa.o0;
import oa.q;
import oa.s1;
import oa.u0;
import oa.u1;
import oa.v0;
import oa.v1;
import oa.x0;
import wj.r;
import xn.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5780e;

    /* JADX WARN: Code duplicated, block: B:110:0x0272  */
    /* JADX WARN: Code duplicated, block: B:111:0x0275  */
    /* JADX WARN: Code duplicated, block: B:114:0x027b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0293  */
    /* JADX WARN: Code duplicated, block: B:118:0x0298  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:121:0x02af  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02df  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    public e(rc rcVar, n3 n3Var) {
        s1 s1VarC;
        char c4;
        long j10;
        long j11;
        String str;
        int i10 = 1;
        this.f5776a = true;
        oc ocVar = rcVar.f23932a;
        kc kcVar = rcVar.f23933b;
        if (ocVar.f23804a.isEmpty()) {
            kc.B().equals(kcVar);
        }
        this.f5777b = kcVar.u();
        this.f5778c = kcVar.v();
        kcVar.getClass();
        kcVar.getClass();
        Map mapZ = kcVar.y() == 0 ? null : kcVar.z();
        if (mapZ != null) {
            u0.v(mapZ.keySet());
        } else {
            Object[] objArr = u1.f47327i;
        }
        oc ocVar2 = rcVar.f23932a;
        char c5 = 3;
        if (kcVar.y() > 0) {
            Collection<fc> collectionValues = kcVar.z().values();
            if (collectionValues == null) {
                s1VarC = s1.f47307g;
            } else {
                p pVarD = o0.d();
                for (fc fcVar : collectionValues) {
                    int I = fcVar.I();
                    int i11 = I - 1;
                    if (I == 0) {
                        throw null;
                    }
                    if (i11 == 0) {
                        pVarD.l(fcVar.u(), Long.valueOf(fcVar.v()));
                    } else if (i11 == 1) {
                        pVarD.l(fcVar.u(), Boolean.valueOf(fcVar.w()));
                    } else if (i11 == 2) {
                        pVarD.l(fcVar.u(), Double.valueOf(fcVar.x()));
                    } else if (i11 == 3) {
                        pVarD.l(fcVar.u(), fcVar.y());
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(fcVar.u())));
                        }
                        pVarD.l(fcVar.u(), fcVar.z().u());
                    }
                }
                s1VarC = pVarD.c(false);
            }
            if (!s1VarC.isEmpty()) {
                HashMap map = new HashMap(s1VarC);
                x0 x0Var = ocVar2.f23804a;
                v0 v0Var = new v0(l1.f47272a);
                e2 it = x0Var.iterator();
                while (true) {
                    f0 f0Var = (f0) it;
                    if (!f0Var.hasNext()) {
                        for (String str2 : map.keySet()) {
                            Object obj = map.get(str2);
                            int length = str2.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    c4 = c5;
                                } else {
                                    c4 = c5;
                                    long jCharAt = str2.charAt(0) - '0';
                                    if (jCharAt >= 1) {
                                        if (jCharAt <= 9) {
                                            int i12 = i10;
                                            while (true) {
                                                if (i12 >= length) {
                                                    j10 = 0;
                                                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                                        j11 = jCharAt;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                int iCharAt = str2.charAt(i12) - '0';
                                                j10 = 0;
                                                if (!((iCharAt < 0) | (iCharAt > 9))) {
                                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                                    i12++;
                                                }
                                            }
                                        }
                                        if (j11 == j10) {
                                            str = str2;
                                        } else {
                                            str = null;
                                        }
                                        if (obj instanceof String) {
                                            v0Var.b(new nc(j11, str, 4, 0L, obj));
                                        } else if (obj instanceof byte[]) {
                                            v0Var.b(new nc(j11, str, 5, 0L, obj));
                                        } else if (obj instanceof Boolean) {
                                            v0Var.b(new nc(j11, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                        } else if (obj instanceof Long) {
                                            v0Var.b(new nc(j11, str, 2, ((Long) obj).longValue(), null));
                                        } else {
                                            if (obj instanceof Double) {
                                                String strValueOf = String.valueOf(obj);
                                                throw new IllegalStateException(u.h(new StringBuilder(str2.length() + 28 + strValueOf.length()), "Cannot serialize override ", str2, ": ", strValueOf));
                                            }
                                            v0Var.b(new nc(j11, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                        }
                                        c5 = c4;
                                        i10 = 1;
                                    }
                                    j11 = j10;
                                    if (j11 == j10) {
                                        str = str2;
                                    } else {
                                        str = null;
                                    }
                                    if (obj instanceof String) {
                                        v0Var.b(new nc(j11, str, 4, 0L, obj));
                                    } else if (obj instanceof byte[]) {
                                        v0Var.b(new nc(j11, str, 5, 0L, obj));
                                    } else if (obj instanceof Boolean) {
                                        v0Var.b(new nc(j11, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                    } else if (obj instanceof Long) {
                                        v0Var.b(new nc(j11, str, 2, ((Long) obj).longValue(), null));
                                    } else {
                                        if (obj instanceof Double) {
                                            String strValueOf2 = String.valueOf(obj);
                                            throw new IllegalStateException(u.h(new StringBuilder(str2.length() + 28 + strValueOf2.length()), "Cannot serialize override ", str2, ": ", strValueOf2));
                                        }
                                        v0Var.b(new nc(j11, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                    }
                                    c5 = c4;
                                    i10 = 1;
                                }
                                j10 = 0;
                                j11 = 0;
                                if (j11 == j10) {
                                    str = str2;
                                } else {
                                    str = null;
                                }
                                if (obj instanceof String) {
                                    v0Var.b(new nc(j11, str, 4, 0L, obj));
                                } else if (obj instanceof byte[]) {
                                    v0Var.b(new nc(j11, str, 5, 0L, obj));
                                } else if (obj instanceof Boolean) {
                                    v0Var.b(new nc(j11, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj instanceof Long) {
                                    v0Var.b(new nc(j11, str, 2, ((Long) obj).longValue(), null));
                                } else {
                                    if (obj instanceof Double) {
                                        String strValueOf3 = String.valueOf(obj);
                                        throw new IllegalStateException(u.h(new StringBuilder(str2.length() + 28 + strValueOf3.length()), "Cannot serialize override ", str2, ": ", strValueOf3));
                                    }
                                    v0Var.b(new nc(j11, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                }
                                c5 = c4;
                                i10 = 1;
                            } else {
                                c4 = c5;
                            }
                            j10 = 0;
                            j11 = j10;
                            if (j11 == j10) {
                                str = str2;
                            } else {
                                str = null;
                            }
                            if (obj instanceof String) {
                                v0Var.b(new nc(j11, str, 4, 0L, obj));
                            } else if (obj instanceof byte[]) {
                                v0Var.b(new nc(j11, str, 5, 0L, obj));
                            } else if (obj instanceof Boolean) {
                                v0Var.b(new nc(j11, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj instanceof Long) {
                                v0Var.b(new nc(j11, str, 2, ((Long) obj).longValue(), null));
                            } else {
                                if (obj instanceof Double) {
                                    String strValueOf4 = String.valueOf(obj);
                                    throw new IllegalStateException(u.h(new StringBuilder(str2.length() + 28 + strValueOf4.length()), "Cannot serialize override ", str2, ": ", strValueOf4));
                                }
                                v0Var.b(new nc(j11, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                            }
                            c5 = c4;
                            i10 = 1;
                        }
                        ocVar2 = new oc(v0Var.i());
                        break;
                    }
                    nc ncVar = (nc) f0Var.next();
                    Object obj2 = ncVar.f23775b;
                    long j12 = ncVar.f23774a;
                    Object objRemove = map.remove(obj2 == null ? Long.toString(j12) : obj2);
                    if (objRemove == null) {
                        v0Var.b(ncVar);
                    } else if (objRemove instanceof String) {
                        v0Var.b(new nc(ncVar.f23774a, ncVar.f23775b, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        v0Var.b(new nc(ncVar.f23774a, ncVar.f23775b, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        v0Var.b(new nc(ncVar.f23774a, ncVar.f23775b, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        v0Var.b(new nc(ncVar.f23774a, ncVar.f23775b, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = ncVar.f23775b;
                            string = string == null ? Long.toString(j12) : string;
                            String string2 = objRemove.toString();
                            throw new IllegalStateException(u.h(new StringBuilder(String.valueOf(string).length() + 46 + string2.length()), "Cannot serialize override for existing flag ", string, ": ", string2));
                        }
                        v0Var.b(new nc(ncVar.f23774a, ncVar.f23775b, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
            }
        }
        int size = ((v1) ocVar2.f23804a).f47337g.size() + 3;
        q.d(size, "expectedSize");
        p pVar = new p(size);
        e2 it2 = ocVar2.f23804a.iterator();
        while (true) {
            f0 f0Var2 = (f0) it2;
            if (!f0Var2.hasNext()) {
                pVar.l("__phenotype_server_token", kcVar.w());
                pVar.l("__phenotype_snapshot_token", kcVar.u());
                pVar.l("__phenotype_configuration_version", Long.valueOf(kcVar.x()));
                this.f5779d = pVar.c(false);
                this.f5780e = n3Var;
                return;
            }
            nc ncVar2 = (nc) f0Var2.next();
            String string3 = ncVar2.f23775b;
            if (string3 == null) {
                string3 = Long.toString(ncVar2.f23774a);
            }
            pVar.l(string3, ncVar2.a());
        }
    }

    public IOException a(boolean z10, boolean z11, IOException iOException) {
        i iVar = (i) this.f5777b;
        if (iOException != null) {
            h(iOException);
        }
        return iVar.j(this, z11, z10, iOException);
    }

    public synchronized void b() {
        try {
            if (this.f5776a) {
                return;
            }
            Boolean boolF = f();
            this.f5779d = boolF;
            if (boolF == null) {
                qc.b bVar = new qc.b() { // from class: zc.n
                    @Override // qc.b
                    public final void a(qc.a aVar) {
                        bo.e eVar = this.f54847a;
                        if (eVar.c()) {
                            FirebaseMessaging firebaseMessaging = (FirebaseMessaging) eVar.f5780e;
                            i0 i0Var = FirebaseMessaging.f24672n;
                            firebaseMessaging.l();
                        }
                    }
                };
                this.f5778c = bVar;
                tb.j jVar = (tb.j) ((qc.d) this.f5777b);
                jVar.b(jVar.f50700c, bVar);
            }
            this.f5776a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean c() {
        Boolean bool;
        try {
            b();
            bool = (Boolean) this.f5779d;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f5780e).f24675a.k();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #1 {all -> 0x00f5, blocks: (B:27:0x0073, B:30:0x0079), top: B:75:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3 A[Catch: all -> 0x00ca, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00ca, blocks: (B:50:0x00b3, B:19:0x0057), top: B:78:0x0057, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a7, code lost:
    
        if (r0.get() == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
    
        if (r1.e(r2) == r10) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x009b -> B:80:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00d7 -> B:36:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(ck.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.e.d(ck.c):java.lang.Object");
    }

    public Object e(Object obj, File file, ck.i iVar) throws Throwable {
        ((AtomicReference) this.f5780e).set(new gh.e(obj, file));
        Object objD = d(iVar);
        return objD == bk.a.f5708a ? objD : r.f53297a;
    }

    public Boolean f() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        mb.g gVar = ((FirebaseMessaging) this.f5780e).f24675a;
        gVar.a();
        Context context = gVar.f45928a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public v g(boolean z10) throws IOException {
        try {
            v responseHeaders = ((co.e) this.f5779d).readResponseHeaders(z10);
            if (responseHeaders == null) {
                return responseHeaders;
            }
            responseHeaders.f54080m = this;
            return responseHeaders;
        } catch (IOException e10) {
            h(e10);
            throw e10;
        }
    }

    public void h(IOException iOException) {
        this.f5776a = true;
        ((b2.a) this.f5778c).e(iOException);
        k connection = ((co.e) this.f5779d).getConnection();
        i iVar = (i) this.f5777b;
        synchronized (connection) {
            try {
                if (!(iOException instanceof a0)) {
                    if (!(connection.f5806g != null) || (iOException instanceof fo.a)) {
                        connection.f5809j = true;
                        if (connection.f5811m == 0) {
                            k.d(iVar.f5786a, connection.f5801b, iOException);
                            connection.l++;
                        }
                    }
                } else if (((a0) iOException).f41203a == 8) {
                    int i10 = connection.f5812n + 1;
                    connection.f5812n = i10;
                    if (i10 > 1) {
                        connection.f5809j = true;
                        connection.l++;
                    }
                } else if (((a0) iOException).f41203a != 9 || !iVar.f5797m) {
                    connection.f5809j = true;
                    connection.l++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public e(le leVar, n3 n3Var) {
        this.f5776a = false;
        le.B().equals(leVar);
        this.f5777b = leVar.u();
        this.f5778c = leVar.v();
        int i10 = u0.f47325c;
        Object[] objArr = u1.f47327i;
        int iZ = leVar.z() + 3;
        q.d(iZ, "expectedSize");
        p pVar = new p(iZ);
        for (ne neVar : leVar.y()) {
            int iH = neVar.H();
            int i11 = iH - 1;
            if (iH == 0) {
                throw null;
            }
            if (i11 == 0) {
                pVar.l(neVar.u(), Long.valueOf(neVar.v()));
            } else if (i11 == 1) {
                pVar.l(neVar.u(), Boolean.valueOf(neVar.w()));
            } else if (i11 == 2) {
                pVar.l(neVar.u(), Double.valueOf(neVar.x()));
            } else if (i11 == 3) {
                pVar.l(neVar.u(), neVar.y());
            } else if (i11 == 4) {
                pVar.l(neVar.u(), neVar.z().u());
            }
        }
        pVar.l("__phenotype_server_token", leVar.w());
        pVar.l("__phenotype_snapshot_token", leVar.u());
        pVar.l("__phenotype_configuration_version", Long.valueOf(leVar.x()));
        this.f5779d = pVar.c(false);
        this.f5780e = n3Var;
    }

    public e(jk.c cVar) {
        jn.e eVar = n0.f6748a;
        jn.d ioDispatcher = jn.d.f44017b;
        n.f(ioDispatcher, "ioDispatcher");
        this.f5777b = ioDispatcher;
        this.f5778c = cVar;
        this.f5779d = new ln.c();
        this.f5780e = new AtomicReference(null);
    }
}
