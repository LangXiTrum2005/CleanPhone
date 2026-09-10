package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.core.fid.Constants;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ze implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22587c;

    public /* synthetic */ ze(int i10, Object obj, Object obj2) {
        this.f22585a = i10;
        this.f22586b = obj;
        this.f22587c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02f6  */
    @Override // java.util.concurrent.Callable
    public final Object call() throws ExecutionException, InterruptedException, eo0 {
        px pxVarA;
        m00 m00Var;
        String strEncodeToString = null;
        switch (this.f22585a) {
            case 0:
                return ((af) this.f22586b).a((Context) this.f22587c);
            case 1:
                fg fgVar = (fg) this.f22586b;
                so0 so0Var = fgVar.f14396j;
                if ((so0Var != null ? (pe1) so0Var.f20013b : fgVar.f14395i) != null) {
                    (so0Var != null ? (pe1) so0Var.f20013b : fgVar.f14395i).get();
                }
                je jeVarB = fgVar.b();
                if (jeVarB != null) {
                    try {
                        xd xdVar = (xd) this.f22587c;
                        synchronized (xdVar) {
                            try {
                                byte[] bArrB = jeVarB.b();
                                ks1 ks1Var = ks1.f16518a;
                                int i10 = tr1.f20473a;
                                xdVar.a(bArrB, ks1.f16519b);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                    } catch (et1 | NullPointerException unused) {
                    }
                }
                return null;
            case 2:
                rx rxVar = (rx) this.f22586b;
                WeakHashMap weakHashMap = rxVar.f19694a;
                Context context = (Context) this.f22587c;
                qx qxVar = (qx) weakHashMap.get(context);
                if (qxVar != null) {
                    long jLongValue = qxVar.f19220a + ((Long) xm.f21924d.o()).longValue();
                    ((p9.b) zzt.zzk()).getClass();
                    if (jLongValue < System.currentTimeMillis()) {
                        pxVarA = new ox(context).a();
                    } else {
                        pxVarA = new ox(context, qxVar.f19221b).a();
                    }
                } else {
                    pxVarA = new ox(context).a();
                }
                rxVar.f19694a.put(context, new qx(rxVar, pxVarA));
                return pxVarA;
            case 3:
                return (String) ((kz) this.f22586b).k((Context) this.f22587c, Constants.GET_APP_INSTANCE_ID);
            case 4:
                yi0 yi0Var = (yi0) this.f22586b;
                fw0 fw0Var = (fw0) this.f22587c;
                yi0Var.f22265e.zzc(Boolean.TRUE);
                fw0Var.zzd(true);
                yi0Var.f22275p.b(fw0Var.zzm());
                return null;
            case 5:
                uw uwVar = (uw) this.f22586b;
                mx mxVar = (mx) this.f22587c;
                ok0 ok0Var = (ok0) uwVar.f20921e;
                synchronized (ok0Var.f19987b) {
                    try {
                        if (ok0Var.f19988c) {
                            m00Var = ok0Var.f19986a;
                        } else {
                            ok0Var.f19988c = true;
                            ok0Var.f19990e = mxVar;
                            ok0Var.f19991f.checkAvailabilityAndConnect();
                            m00Var = ok0Var.f19986a;
                            m00Var.addListener(new x60(ok0Var, 13), l00.f16615h);
                            sk0.b(ok0Var.f18293h, m00Var, ok0Var.f18294i);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return (zk0) m00Var.get(((Integer) zzba.zzc().a(am.J6)).intValue(), TimeUnit.SECONDS);
            case 6:
                return (zk0) ((jk0) this.f22586b).f16108d.c((mx) this.f22587c).get(((Integer) zzba.zzc().a(am.J6)).intValue(), TimeUnit.SECONDS);
            case 7:
                nk0 nk0Var = (nk0) this.f22586b;
                il0 il0Var = (il0) this.f22587c;
                nk0Var.b(35);
                int i11 = 0;
                int i12 = -1;
                while (true) {
                    try {
                        if (i11 >= ((Integer) zzba.zzc().a(am.f12255m8)).intValue()) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 40);
                            sb2.append("Received HTTP error code from ad server:");
                            sb2.append(i12);
                            throw new eo0(1, sb2.toString());
                        }
                        Context context2 = nk0Var.f17847b;
                        String str = nk0Var.f17848c.afmaVersion;
                        Binder.getCallingUid();
                        jl0 jl0VarK = new vu0(context2, str, strEncodeToString, 20).k(il0Var);
                        int i13 = jl0VarK.f16110a;
                        if (((Boolean) zzba.zzc().a(am.f12270n8)).booleanValue()) {
                            nk0Var.f17854i.b("fr", String.valueOf(i11));
                        }
                        if (i13 == 200) {
                            nk0Var.b(36);
                            return jl0VarK.f16112c;
                        }
                        i11++;
                        i12 = i13;
                    } catch (Exception e10) {
                        throw new eo0(e10.getMessage() == null ? "Fetch failed." : e10.getMessage(), e10);
                    }
                }
                break;
            case 8:
                jl0 jl0Var = (jl0) ((uv0) this.f22586b).f20915c.get();
                Object obj = ((be1) this.f22587c).f12745a;
                return new fl0(jl0Var, ((el0) obj).f14004b, ((el0) obj).f14003a);
            case 9:
                mx0 mx0Var = (mx0) this.f22586b;
                String str2 = (String) this.f22587c;
                zzu zzuVar = mx0Var.f17581d;
                if (!((Boolean) zzba.zzc().a(am.f12286oa)).booleanValue() || (!zzt.zzc().zzh(str2) && !zzt.zzc().zzi(str2))) {
                    return zzuVar.zzc(str2, null);
                }
                rw1 rw1Var = mx0Var.f17584g.f15110c;
                strEncodeToString = rw1Var != null ? Base64.encodeToString(rw1Var.b(), 10) : null;
                HashMap map = new HashMap();
                if (strEncodeToString != null) {
                    map.put((String) zzba.zzc().a(am.f12303pa), strEncodeToString);
                }
                return zzuVar.zzc(str2, map);
            case 10:
                z21 z21Var = (z21) this.f22586b;
                Object obj2 = this.f22587c;
                synchronized (z21Var) {
                    File file = z21Var.f22476a;
                    x10.p(file);
                    String parent = file.getParent();
                    String name = file.getName();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 5);
                    sb3.append(name);
                    sb3.append(".temp");
                    File file2 = new File(parent, sb3.toString());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            z21Var.f22478c.d(obj2, fileOutputStream);
                            fileOutputStream.close();
                            if (!file2.renameTo(z21Var.f22476a)) {
                                throw new IOException("Failed to rename file.");
                            }
                        } catch (Throwable th4) {
                            try {
                                fileOutputStream.close();
                                break;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (IOException e11) {
                        file2.delete();
                        throw e11;
                    }
                }
                return null;
            case 11:
                h41 h41Var = (h41) this.f22586b;
                i41 i41Var = (i41) this.f22587c;
                DexClassLoader dexClassLoader = h41Var.l;
                g41 g41Var = h41Var.f15116d;
                byte[] bArr = h41Var.f15123k;
                String str3 = i41Var.f15571a;
                String str4 = i41Var.f15572b;
                Class<?>[] clsArr = i41Var.f15573c;
                try {
                    g41Var.getClass();
                    byte[] bArrA = g41.a(str3, bArr);
                    Charset charset = g41.f14754a;
                    return dexClassLoader.loadClass(new String(bArrA, charset)).getMethod(new String(g41.a(str4, bArr), charset), clsArr);
                } catch (f41 | ClassNotFoundException | NoSuchMethodException | NullPointerException e12) {
                    throw new IllegalStateException(e12);
                }
            case 12:
                p51 p51Var = (p51) this.f22586b;
                Context context3 = (Context) this.f22587c;
                a71 a71Var = p51Var.f18534d;
                m01 m01VarB = p51Var.f18531a.b();
                if (m01VarB == null) {
                    a71Var.b(15004);
                    return "";
                }
                String strB = m01VarB.b(context3);
                if (strB != null) {
                    return strB;
                }
                a71Var.b(15006);
                return "";
            default:
                u51 u51Var = (u51) this.f22586b;
                Context context4 = (Context) this.f22587c;
                HashMap map2 = new HashMap();
                u51Var.f20636f.f(20106, new o1(u51Var, map2, context4, 11));
                String strG = u51Var.g(map2);
                map2.clear();
                return strG;
        }
    }
}
