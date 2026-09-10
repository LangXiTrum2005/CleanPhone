package i9;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.fb;
import com.google.android.gms.internal.ads.hb;
import com.google.android.gms.internal.ads.hj;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.lb;
import com.google.android.gms.internal.ads.lj1;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.nr;
import com.google.android.gms.internal.ads.or;
import com.google.android.gms.internal.ads.rr;
import com.google.android.gms.internal.ads.sr;
import com.google.android.gms.internal.ads.ts;
import com.google.android.gms.internal.ads.tx;
import com.google.android.gms.internal.ads.zw1;
import com.google.android.gms.internal.measurement.ge;
import com.google.android.gms.internal.measurement.md;
import com.google.android.gms.internal.measurement.nd;
import com.google.android.gms.internal.measurement.pb;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.ud;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import ea.a0;
import ea.f2;
import eb.d0;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import k9.c0;
import k9.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements a7.i, cb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static i f42936c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f42937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f42938b;

    public /* synthetic */ i(Object obj) {
        this.f42938b = obj;
    }

    public static i b(Context context) {
        c0.h(context);
        synchronized (i.class) {
            if (f42936c == null) {
                l lVar = q.f42955a;
                synchronized (q.class) {
                    if (q.f42959e == null) {
                        q.f42959e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                i iVar = new i();
                iVar.f42938b = context.getApplicationContext();
                f42936c = iVar;
            }
        }
        return f42936c;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z10) {
        z9.f fVar;
        int i10;
        if (packageInfo != null) {
            if (z10 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) == 0) ? false : true;
            }
            try {
                z9.f fVar2 = z10 ? p.f42954c : p.f42953b;
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                    z9.b bVar = z9.e.f54663b;
                    fVar = z9.f.f54664e;
                } else {
                    z9.b bVar2 = z9.e.f54663b;
                    Object[] objArrCopyOf = new Object[4];
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length) {
                        byte[] byteArray = signingCertificateHistory[i11].toByteArray();
                        byteArray.getClass();
                        int length2 = objArrCopyOf.length;
                        int i13 = i12 + 1;
                        if (i13 < 0) {
                            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                        }
                        if (i13 <= length2) {
                            i10 = length2;
                        } else {
                            i10 = (length2 >> 1) + length2 + 1;
                            if (i10 < i13) {
                                int iHighestOneBit = Integer.highestOneBit(i12);
                                i10 = iHighestOneBit + iHighestOneBit;
                            }
                            if (i10 < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                        }
                        if (i10 > length2) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
                        }
                        objArrCopyOf[i12] = byteArray;
                        i11++;
                        i12 = i13;
                    }
                    fVar = i12 == 0 ? z9.f.f54664e : new z9.f(i12, objArrCopyOf);
                }
                if (fVar.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                z9.e eVarQ = fVar.q();
                int size = eVarQ.size();
                int i14 = 0;
                while (i14 < size) {
                    byte[] bArr = (byte[]) eVarQ.get(i14);
                    z9.b bVarS = fVar2.listIterator(0);
                    do {
                        int i15 = i14 + 1;
                        if (!bVarS.hasNext()) {
                            i14 = i15;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) bVarS.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z10 ? f(packageInfo, p.f42952a) : f(packageInfo, p.f42952a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static m f(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < mVarArr.length; i10++) {
                if (mVarArr[i10].equals(nVar)) {
                    return mVarArr[i10];
                }
            }
        }
        return null;
    }

    public i6.a a() {
        if (((i6.a) this.f42937a) == null) {
            synchronized (this) {
                try {
                    if (((i6.a) this.f42937a) == null) {
                        File cacheDir = ((i6.d) ((n5.f) this.f42938b).f46523b).f42896a.getCacheDir();
                        ts tsVar = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            tsVar = new ts();
                            tsVar.f20477d = new f2(19);
                            tsVar.f20476c = file;
                            tsVar.f20474a = 262144000L;
                            tsVar.f20475b = new d0(20);
                        }
                        this.f42937a = tsVar;
                    }
                    if (((i6.a) this.f42937a) == null) {
                        this.f42937a = new a0(27);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (i6.a) this.f42937a;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01c4  */
    public boolean c(int i10) {
        t tVarB;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = ((Context) this.f42938b).getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            tVarB = t.b("no pkgs");
        } else {
            tVarB = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    c0.h(tVarB);
                    break;
                }
                String str = packagesForUid[i11];
                if (str == null) {
                    tVarB = t.b("null pkg");
                } else if (str.equals((String) this.f42937a)) {
                    tVarB = t.f42966d;
                } else {
                    l lVar = q.f42955a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            q.a();
                            boolean zZzg = ((z) q.f42957c).zzg();
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            if (zZzg) {
                                boolean zB = h.b((Context) this.f42938b);
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                try {
                                    c0.h(q.f42959e);
                                    try {
                                        q.a();
                                        c0.h(q.f42959e);
                                        Context context = (Context) s9.b.y1(s9.b.x1(new s9.b(q.f42959e)));
                                        try {
                                            z zVar = (z) q.f42957c;
                                            Parcel parcelU1 = zVar.u1();
                                            int i12 = z9.g.f54667a;
                                            parcelU1.writeInt(1);
                                            int iR = r9.b.R(parcelU1, 20293);
                                            r9.b.J(parcelU1, 1, str);
                                            r9.b.Q(parcelU1, 2, 4);
                                            parcelU1.writeInt(zB ? 1 : 0);
                                            r9.b.Q(parcelU1, 3, 4);
                                            parcelU1.writeInt(0);
                                            r9.b.F(parcelU1, 4, new s9.b(context));
                                            r9.b.Q(parcelU1, 5, 4);
                                            parcelU1.writeInt(0);
                                            r9.b.Q(parcelU1, 6, 4);
                                            parcelU1.writeInt(1);
                                            r9.b.Q(parcelU1, 8, 4);
                                            parcelU1.writeInt(0);
                                            r9.b.S(parcelU1, iR);
                                            Parcel parcelR = zVar.r(parcelU1, 6);
                                            r rVar = (r) z9.g.a(parcelR, r.CREATOR);
                                            parcelR.recycle();
                                            if (rVar.f42960a) {
                                                com.google.android.gms.internal.auth.i.H(rVar.f42963d);
                                                tVarB = new t(null, true, null);
                                            } else {
                                                String str2 = rVar.f42961b;
                                                PackageManager.NameNotFoundException nameNotFoundException = com.google.android.gms.internal.auth.o.B(rVar.f42962c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                if (str2 == null) {
                                                    str2 = "error checking package certificate";
                                                }
                                                com.google.android.gms.internal.auth.i.H(rVar.f42963d);
                                                com.google.android.gms.internal.auth.o.B(rVar.f42962c);
                                                tVarB = new t(str2, false, nameNotFoundException);
                                            }
                                        } catch (RemoteException e10) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                                            tVarB = t.c("module call", e10);
                                        }
                                    } catch (t9.a e11) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                                        tVarB = t.c("module init: ".concat(String.valueOf(e11.getMessage())), e11);
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                } catch (Throwable th2) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    throw th2;
                                }
                            } else {
                                try {
                                    PackageInfo packageInfo = ((Context) this.f42938b).getPackageManager().getPackageInfo(str, 134217792);
                                    boolean zB2 = h.b((Context) this.f42938b);
                                    if (packageInfo == null) {
                                        tVarB = t.b("null pkg");
                                    } else {
                                        Signature[] signatureArr = packageInfo.signatures;
                                        if (signatureArr == null || signatureArr.length != 1) {
                                            tVarB = t.b("single cert required");
                                        } else {
                                            n nVar = new n(packageInfo.signatures[0].toByteArray());
                                            String str3 = packageInfo.packageName;
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                            try {
                                                t tVarB2 = q.b(str3, nVar, zB2, false);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                if (tVarB2.f42967a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        t tVarB3 = q.b(str3, nVar, false, true);
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        if (tVarB3.f42967a) {
                                                            tVarB = t.b("debuggable release cert app rejected");
                                                        }
                                                    } catch (Throwable th3) {
                                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                        throw th3;
                                                    }
                                                }
                                                tVarB = tVarB2;
                                            } catch (Throwable th4) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                throw th4;
                                            }
                                        }
                                    }
                                    if (tVarB.f42967a) {
                                        this.f42937a = str;
                                    }
                                } catch (PackageManager.NameNotFoundException e12) {
                                    tVarB = t.c("no pkg ".concat(str), e12);
                                }
                            }
                        } catch (RemoteException | t9.a e13) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e13);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        if (tVarB.f42967a) {
                            this.f42937a = str;
                        }
                    } catch (Throwable th5) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th5;
                    }
                }
                if (tVarB.f42967a) {
                    break;
                }
                i11++;
            }
        }
        if (!tVarB.f42967a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th6 = tVarB.f42969c;
            if (th6 != null) {
                Log.d("GoogleCertificatesRslt", tVarB.a(), th6);
            } else {
                Log.d("GoogleCertificatesRslt", tVarB.a());
            }
        }
        return tVarB.f42967a;
    }

    public ud d(final pb pbVar) {
        final md mdVar = (md) this.f42937a;
        md mdVar2 = ud.f24038j;
        if (mdVar != mdVar2) {
            q6 q6Var = ud.f24037i;
            q6Var.getClass();
            final mb.b bVar = new mb.b();
            bVar.f45919a = false;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) q6Var.f23891b;
            Context context = pbVar.f23846b;
            String str = mdVar.f23741d;
            if (str == null) {
                str = (String) mdVar.f23738a.apply(context);
                mdVar.f23741d = str;
            }
            nd ndVar = (nd) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: com.google.android.gms.internal.measurement.td
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    nd ndVar2 = new nd(new ud(pbVar, mdVar));
                    bVar.f45919a = true;
                    return ndVar2;
                }
            });
            if (bVar.f45919a) {
                Context context2 = pbVar.f23846b;
                q6 q6Var2 = new q6(q6Var, 12);
                if (ge.f23514b == null) {
                    synchronized (ge.class) {
                        try {
                            if (ge.f23514b == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new ge(0), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new ge(0), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                ge.f23514b = q6Var2;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            this.f42938b = ndVar.f23780a;
            this.f42937a = mdVar2;
        }
        return (ud) this.f42938b;
    }

    @Override // a7.i
    public Object get() {
        if (this.f42937a == null) {
            synchronized (this) {
                try {
                    if (this.f42937a == null) {
                        Object obj = ((a7.i) this.f42938b).get();
                        a7.h.c(obj, "Argument must not be null");
                        this.f42937a = obj;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f42937a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0139 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x013a  */
    /* JADX WARN: Code duplicated, block: B:35:0x013e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0147  */
    /* JADX WARN: Code duplicated, block: B:41:0x014f A[LOOP:1: B:39:0x014c->B:41:0x014f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x016a  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.cb
    public fb zza(hb hbVar) throws lb {
        or orVar;
        or orVar2;
        String[] strArr;
        String[] strArr2;
        HashMap map;
        Map mapZzm = hbVar.zzm();
        int size = mapZzm.size();
        String[] strArr3 = new String[size];
        String[] strArr4 = new String[size];
        int i10 = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr3[i10] = (String) entry.getKey();
            strArr4[i10] = (String) entry.getValue();
            i10++;
        }
        nr nrVar = new nr(hbVar.zzh(), strArr3, strArr4);
        ((p9.b) zzt.zzk()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            m00 m00Var = new m00();
            lj1 lj1Var = new lj1(8, this, m00Var);
            sr srVar = new sr(this, m00Var);
            Context context = (Context) this.f42938b;
            Looper looperZza = zzt.zzs().zza();
            int i11 = tx.f20518a;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f42937a = new hj(context, looperZza, 166, lj1Var, srVar);
            ((hj) this.f42937a).checkAvailabilityAndConnect();
            rr rrVar = new rr(this, nrVar);
            k00 k00Var = l00.f16608a;
            ListenableFuture listenableFutureV = zw1.v(zw1.x(m00Var, rrVar, k00Var), ((Integer) zzba.zzc().a(am.A5)).intValue(), TimeUnit.MILLISECONDS, l00.f16611d);
            listenableFutureV.addListener(new com.google.android.gms.internal.ads.d(this, 15), k00Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) listenableFutureV.get();
            ((p9.b) zzt.zzk()).getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            zze.zza(sb2.toString());
            Parcelable.Creator<or> creator = or.CREATOR;
            if (parcelFileDescriptor != null) {
                DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                try {
                    try {
                        int i12 = dataInputStream.readInt();
                        byte[] bArr = new byte[i12];
                        dataInputStream.readFully(bArr, 0, i12);
                        p9.c.d(dataInputStream);
                        Parcel parcelObtain = Parcel.obtain();
                        try {
                            parcelObtain.unmarshall(bArr, 0, i12);
                            parcelObtain.setDataPosition(0);
                            or orVarCreateFromParcel = creator.createFromParcel(parcelObtain);
                            parcelObtain.recycle();
                            orVar = orVarCreateFromParcel;
                        } catch (Throwable th2) {
                            parcelObtain.recycle();
                            throw th2;
                        }
                    } catch (IOException e10) {
                        int i13 = zze.zza;
                        zzo.zzg("Could not read from parcel file descriptor", e10);
                        p9.c.d(dataInputStream);
                        orVar = null;
                        orVar2 = orVar;
                        if (orVar2 == null) {
                            return null;
                        }
                        if (orVar2.f18340a) {
                            throw new lb(orVar2.f18341b);
                        }
                        strArr = orVar2.f18344e;
                        strArr2 = orVar2.f18345f;
                        if (strArr.length != strArr2.length) {
                            return null;
                        }
                        map = new HashMap();
                        for (int i14 = 0; i14 < strArr.length; i14++) {
                            map.put(strArr[i14], strArr2[i14]);
                        }
                        return new fb(orVar2.f18342c, orVar2.f18343d, map, fb.a(map), orVar2.f18346g);
                    }
                    orVar2 = orVar;
                    if (orVar2 == null) {
                        return null;
                    }
                    if (orVar2.f18340a) {
                        throw new lb(orVar2.f18341b);
                    }
                    strArr = orVar2.f18344e;
                    strArr2 = orVar2.f18345f;
                    if (strArr.length != strArr2.length) {
                        return null;
                    }
                    map = new HashMap();
                    while (i14 < strArr.length) {
                        map.put(strArr[i14], strArr2[i14]);
                    }
                    return new fb(orVar2.f18342c, orVar2.f18343d, map, fb.a(map), orVar2.f18346g);
                } catch (Throwable th3) {
                    p9.c.d(dataInputStream);
                    throw th3;
                }
            }
            zzo.zzf("File descriptor is empty, returning null.");
            orVar = null;
            orVar2 = orVar;
            if (orVar2 == null) {
                return null;
            }
            if (orVar2.f18340a) {
                throw new lb(orVar2.f18341b);
            }
            strArr = orVar2.f18344e;
            strArr2 = orVar2.f18345f;
            if (strArr.length != strArr2.length) {
                return null;
            }
            map = new HashMap();
            while (i14 < strArr.length) {
                map.put(strArr[i14], strArr2[i14]);
            }
            return new fb(orVar2.f18342c, orVar2.f18343d, map, fb.a(map), orVar2.f18346g);
        } catch (InterruptedException | ExecutionException unused) {
            ((p9.b) zzt.zzk()).getClass();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime3);
            sb3.append("ms");
            zze.zza(sb3.toString());
            return null;
        } catch (Throwable th4) {
            ((p9.b) zzt.zzk()).getClass();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb4.append("Http assets remote cache took ");
            sb4.append(jElapsedRealtime4);
            sb4.append("ms");
            zze.zza(sb4.toString());
            throw th4;
        }
    }
}
