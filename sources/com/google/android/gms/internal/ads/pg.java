package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pg extends yg {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b21 f18641k = new b21();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final td f18642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f18643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final af f18644j;

    public pg(fg fgVar, xd xdVar, int i10, Context context, td tdVar, af afVar) {
        super(fgVar, "Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", xdVar, i10, 27);
        this.f18643i = context;
        this.f18642h = tdVar;
        this.f18644j = afVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0077, B:28:0x007d, B:30:0x0083, B:33:0x008b, B:39:0x0097, B:41:0x009d, B:45:0x00a8, B:47:0x00af, B:46:0x00ad, B:48:0x00b2, B:50:0x00b8, B:52:0x00be, B:42:0x00a2, B:55:0x00c5, B:57:0x00da, B:61:0x00e3), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0077, B:28:0x007d, B:30:0x0083, B:33:0x008b, B:39:0x0097, B:41:0x009d, B:45:0x00a8, B:47:0x00af, B:46:0x00ad, B:48:0x00b2, B:50:0x00b8, B:52:0x00be, B:42:0x00a2, B:55:0x00c5, B:57:0x00da, B:61:0x00e3), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0077, B:28:0x007d, B:30:0x0083, B:33:0x008b, B:39:0x0097, B:41:0x009d, B:45:0x00a8, B:47:0x00af, B:46:0x00ad, B:48:0x00b2, B:50:0x00b8, B:52:0x00be, B:42:0x00a2, B:55:0x00c5, B:57:0x00da, B:61:0x00e3), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0077, B:28:0x007d, B:30:0x0083, B:33:0x008b, B:39:0x0097, B:41:0x009d, B:45:0x00a8, B:47:0x00af, B:46:0x00ad, B:48:0x00b2, B:50:0x00b8, B:52:0x00be, B:42:0x00a2, B:55:0x00c5, B:57:0x00da, B:61:0x00e3), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00c4, TryCatch #0 {InterruptedException | ExecutionException -> 0x00c4, blocks: (B:39:0x0097, B:41:0x009d, B:45:0x00a8, B:47:0x00af, B:46:0x00ad, B:48:0x00b2, B:50:0x00b8, B:52:0x00be, B:42:0x00a2), top: B:79:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2 A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00c4, TryCatch #0 {InterruptedException | ExecutionException -> 0x00c4, blocks: (B:39:0x0097, B:41:0x009d, B:45:0x00a8, B:47:0x00af, B:46:0x00ad, B:48:0x00b2, B:50:0x00b8, B:52:0x00be, B:42:0x00a2), top: B:79:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00c4, TryCatch #0 {InterruptedException | ExecutionException -> 0x00c4, blocks: (B:39:0x0097, B:41:0x009d, B:45:0x00a8, B:47:0x00af, B:46:0x00ad, B:48:0x00b2, B:50:0x00b8, B:52:0x00be, B:42:0x00a2), top: B:79:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad A[Catch: all -> 0x003e, InterruptedException | ExecutionException -> 0x00c4, TryCatch #0 {InterruptedException | ExecutionException -> 0x00c4, blocks: (B:39:0x0097, B:41:0x009d, B:45:0x00a8, B:47:0x00af, B:46:0x00ad, B:48:0x00b2, B:50:0x00b8, B:52:0x00be, B:42:0x00a2), top: B:79:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e3 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:14:0x0029, B:16:0x0033, B:64:0x00ed, B:65:0x00f3, B:21:0x0041, B:23:0x0047, B:63:0x00ea, B:24:0x004d, B:26:0x0077, B:28:0x007d, B:30:0x0083, B:33:0x008b, B:39:0x0097, B:41:0x009d, B:45:0x00a8, B:47:0x00af, B:46:0x00ad, B:48:0x00b2, B:50:0x00b8, B:52:0x00be, B:42:0x00a2, B:55:0x00c5, B:57:0x00da, B:61:0x00e3), top: B:83:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.yg
    public final void a() {
        Boolean bool;
        String strU0;
        String str;
        xe xeVarC;
        boolean z10;
        fg fgVar;
        so0 so0Var;
        Object obj;
        je jeVarB;
        Future future;
        xe xeVar;
        b21 b21Var = f18641k;
        Context context = this.f18643i;
        AtomicReference atomicReferenceD = b21Var.d(context.getPackageName());
        synchronized (atomicReferenceD) {
            try {
                xe xeVar2 = (xe) atomicReferenceD.get();
                if (xeVar2 != null) {
                    String str2 = xeVar2.S;
                    char[] cArr = ig.f15734a;
                    if ((str2 == null || str2.isEmpty()) || xeVar2.S.equals("E") || xeVar2.S.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                        char[] cArr2 = ig.f15734a;
                        if (this.f18644j != null) {
                            xeVarC = c();
                        } else {
                            Boolean boolValueOf = Boolean.valueOf(!this.f18642h.z());
                            bool = (Boolean) zzba.zzc().a(am.f12388v3);
                            if (((Boolean) zzba.zzc().a(am.f12372u3)).booleanValue()) {
                                strU0 = b();
                            } else {
                                strU0 = null;
                            }
                            if (bool.booleanValue() && this.f22231a.l) {
                                if (strU0 != null || strU0.isEmpty()) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    try {
                                        fgVar = this.f22231a;
                                        so0Var = fgVar.f14396j;
                                        if (so0Var != null) {
                                            obj = (pe1) so0Var.f20013b;
                                        } else {
                                            obj = fgVar.f14395i;
                                        }
                                        if (obj != null) {
                                            if (so0Var != null) {
                                                future = (pe1) so0Var.f20013b;
                                            } else {
                                                future = fgVar.f14395i;
                                            }
                                            future.get();
                                        }
                                        jeVarB = fgVar.b();
                                        if (jeVarB == null && jeVarB.Z()) {
                                            strU0 = jeVarB.u0();
                                        } else {
                                            strU0 = null;
                                        }
                                    } catch (InterruptedException | ExecutionException unused) {
                                    }
                                }
                            }
                            xe xeVar3 = new xe((String) this.f22235e.invoke(null, context, boolValueOf, strU0));
                            str = xeVar3.S;
                            if (!(str != null || str.isEmpty())) {
                                str.equals("E");
                            }
                            xeVarC = xeVar3;
                        }
                        atomicReferenceD.set(xeVarC);
                    }
                } else {
                    char[] cArr3 = ig.f15734a;
                    if (this.f18644j != null) {
                        xeVarC = c();
                    } else {
                        Boolean boolValueOf2 = Boolean.valueOf(!this.f18642h.z());
                        bool = (Boolean) zzba.zzc().a(am.f12388v3);
                        if (((Boolean) zzba.zzc().a(am.f12372u3)).booleanValue()) {
                            strU0 = b();
                        } else {
                            strU0 = null;
                        }
                        if (bool.booleanValue()) {
                            if (strU0 != null) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                fgVar = this.f22231a;
                                so0Var = fgVar.f14396j;
                                if (so0Var != null) {
                                    obj = (pe1) so0Var.f20013b;
                                } else {
                                    obj = fgVar.f14395i;
                                }
                                if (obj != null) {
                                    if (so0Var != null) {
                                        future = (pe1) so0Var.f20013b;
                                    } else {
                                        future = fgVar.f14395i;
                                    }
                                    future.get();
                                }
                                jeVarB = fgVar.b();
                                if (jeVarB == null) {
                                    strU0 = null;
                                } else {
                                    strU0 = null;
                                }
                            }
                        }
                        xe xeVar4 = new xe((String) this.f22235e.invoke(null, context, boolValueOf2, strU0));
                        str = xeVar4.S;
                        if (!(str != null || str.isEmpty())) {
                            str.equals("E");
                        }
                        xeVarC = xeVar4;
                    }
                    atomicReferenceD.set(xeVarC);
                }
                xeVar = (xe) atomicReferenceD.get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        xd xdVar = this.f22234d;
        synchronized (xdVar) {
            if (xeVar != null) {
                try {
                    String str3 = xeVar.S;
                    xdVar.b();
                    ((je) xdVar.f19193b).Q0(str3);
                    long j10 = xeVar.T;
                    xdVar.b();
                    ((je) xdVar.f19193b).E(j10);
                    String str4 = xeVar.U;
                    xdVar.b();
                    ((je) xdVar.f19193b).D(str4);
                    String str5 = xeVar.V;
                    xdVar.b();
                    ((je) xdVar.f19193b).N(str5);
                    String str6 = xeVar.W;
                    xdVar.b();
                    ((je) xdVar.f19193b).O(str6);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            byte[] bArrA = ig.a((String) zzba.zzc().a(am.w3));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrA)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(ig.a((String) zzba.zzc().a(am.f12417x3)))));
            }
            Context context = this.f18643i;
            String packageName = context.getPackageName();
            ExecutorService executorService = this.f22231a.f14388b;
            return zg.b(context, packageName, arrayList);
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final xe c() {
        String str;
        pe1 pe1Var;
        ul ulVar = am.J3;
        int iIntValue = ((Integer) zzba.zzc().a(ulVar)).intValue();
        td tdVar = this.f18642h;
        int iA = (iIntValue <= 0 || ((Integer) zzba.zzc().a(ulVar)).intValue() >= tdVar.A()) ? tdVar.A() : ((Integer) zzba.zzc().a(ulVar)).intValue();
        xe xeVar = new xe((String) this.f22235e.invoke(null, this.f18643i, Boolean.FALSE, ""));
        af afVar = this.f18644j;
        if (afVar == null || (pe1Var = afVar.f12003a) == null) {
            str = "E";
        } else {
            try {
                str = (String) pe1Var.get(iA, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = "E";
            }
        }
        xeVar.S = str;
        return xeVar;
    }
}
