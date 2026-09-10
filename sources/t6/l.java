package t6;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.ConnectivityManager;
import android.os.Binder;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import bc.s;
import cc.a2;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.b81;
import com.google.android.gms.internal.ads.e22;
import com.google.android.gms.internal.ads.fw0;
import com.google.android.gms.internal.ads.hj;
import com.google.android.gms.internal.ads.jw0;
import com.google.android.gms.internal.ads.kd;
import com.google.android.gms.internal.ads.m00;
import com.google.android.gms.internal.ads.o81;
import com.google.android.gms.internal.ads.p81;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.qm0;
import com.google.android.gms.internal.ads.rm0;
import com.google.android.gms.internal.ads.uf;
import com.google.android.gms.internal.ads.wv0;
import com.google.android.gms.internal.ads.y71;
import com.google.android.gms.internal.ads.yd1;
import com.google.android.gms.internal.ads.z71;
import com.google.android.gms.internal.ads.zd1;
import com.google.android.gms.internal.auth.o;
import com.google.android.gms.internal.consent_sdk.x;
import ea.f4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.n;
import pm.n0;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements qm.c, a7.i, yd1, y1.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile l f50547e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f50549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f50550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f50551d;

    public l(jw0 jw0Var, fw0 fw0Var, boolean z10) {
        this.f50548a = 7;
        this.f50550c = jw0Var;
        this.f50551d = fw0Var;
        this.f50549b = z10;
    }

    public static l e(Context context) {
        if (f50547e == null) {
            synchronized (l.class) {
                try {
                    if (f50547e == null) {
                        f50547e = new l(context.getApplicationContext(), 0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f50547e;
    }

    public static l h(z71 z71Var) {
        return new l(new wv0(z71Var, 5));
    }

    @Override // qm.c
    public boolean a(n0 c4, n0 c5) {
        boolean z10 = this.f50549b;
        zk.b a8 = (zk.b) this.f50550c;
        zk.b b10 = (zk.b) this.f50551d;
        n.f(a8, "$a");
        n.f(b10, "$b");
        n.f(c4, "c1");
        n.f(c5, "c2");
        if (c4.equals(c5)) {
            return true;
        }
        zk.g gVarE = c4.e();
        zk.g gVarE2 = c5.e();
        if (!(gVarE instanceof m0) || !(gVarE2 instanceof m0)) {
            return false;
        }
        bm.a aVar = new bm.a(a8, b10);
        return bm.c.f5727a.d((m0) gVarE, (m0) gVarE2, z10, aVar);
    }

    public boolean b(w6.c cVar) {
        boolean z10 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f50550c).remove(cVar);
        if (!((HashSet) this.f50551d).remove(cVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            cVar.clear();
        }
        return z10;
    }

    @Override // y1.i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e22 d(x xVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        y1.k dVar;
        int i10;
        String str = ((y1.m) xVar.f23260a).f54127a;
        e22 e22Var = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.f50549b || Build.VERSION.SDK_INT < 36) {
                    dVar = new y1.d(mediaCodecCreateByCodecName, (HandlerThread) ((y1.b) this.f50551d).get());
                    i10 = 0;
                } else {
                    dVar = new rb.c(mediaCodecCreateByCodecName, 20);
                    i10 = 4;
                }
                e22 e22Var2 = new e22(mediaCodecCreateByCodecName, (HandlerThread) ((y1.b) this.f50550c).get(), dVar, (y1.h) xVar.f23265f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) xVar.f23263d;
                    if (surface == null && ((y1.m) xVar.f23260a).f54134h && Build.VERSION.SDK_INT >= 35) {
                        i10 |= 8;
                    }
                    e22.D(e22Var2, (MediaFormat) xVar.f23261b, surface, (MediaCrypto) xVar.f23264e, i10);
                    return e22Var2;
                } catch (Exception e10) {
                    e = e10;
                    e22Var = e22Var2;
                    if (e22Var != null) {
                        e22Var.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateByCodecName = null;
        }
    }

    public void f(double d10, double d11) {
        double[] dArr = (double[]) this.f50550c;
        double d12 = 1.0d;
        if (!this.f50549b) {
            d12 = 1.0d / (((dArr[7] * d11) + (dArr[3] * d10)) + dArr[15]);
        }
        double d13 = ((dArr[4] * d11) + (dArr[0] * d10) + dArr[12]) * d12;
        double d14 = ((dArr[5] * d11) + (dArr[1] * d10) + dArr[13]) * d12;
        double[] dArr2 = (double[]) this.f50551d;
        if (d13 < dArr2[0]) {
            dArr2[0] = d13;
        } else if (d13 > dArr2[1]) {
            dArr2[1] = d13;
        }
        if (d14 < dArr2[2]) {
            dArr2[2] = d14;
        } else if (d14 > dArr2[3]) {
            dArr2[3] = d14;
        }
    }

    public void g() {
        if (this.f50549b || ((HashSet) this.f50551d).isEmpty()) {
            return;
        }
        s sVar = (s) this.f50550c;
        i9.i iVar = (i9.i) sVar.f5582c;
        boolean z10 = false;
        sVar.f5580a = ((ConnectivityManager) iVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) iVar.get()).registerDefaultNetworkCallback((uf) sVar.f5583d);
            z10 = true;
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e10);
            }
        }
        this.f50549b = z10;
    }

    @Override // a7.i
    public Object get() {
        if (this.f50549b) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection(o.z("Glide registry"));
        this.f50549b = true;
        try {
            return o.e((com.bumptech.glide.b) this.f50550c, (ArrayList) this.f50551d);
        } finally {
            this.f50549b = false;
            Trace.endSection();
        }
    }

    public /* synthetic */ void i() {
        synchronized (this.f50551d) {
            try {
                hj hjVar = (hj) this.f50550c;
                if (hjVar == null) {
                    return;
                }
                hjVar.disconnect();
                this.f50550c = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void j(int i10) {
        if (this.f50549b) {
            return;
        }
        this.f50549b = true;
        l(new zze(i10, po0.c(i10, ((qm0) this.f50550c).f19126a), AdError.UNDEFINED_DOMAIN, null, null));
    }

    public l k(y71 y71Var) {
        y71Var.getClass();
        return new l((p81) this.f50551d, this.f50549b, y71Var);
    }

    public synchronized void l(zze zzeVar) {
        int i10 = 1;
        if (true == ((Boolean) zzba.zzc().a(am.F6)).booleanValue()) {
            i10 = 3;
        }
        ((m00) this.f50551d).zzd(new rm0(i10, zzeVar));
    }

    public List m(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itE = ((p81) this.f50551d).e(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            o81 o81Var = (o81) itE;
            if (!o81Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) o81Var.next());
        }
    }

    public String toString() {
        switch (this.f50548a) {
            case 12:
                return super.toString() + "{numRequests=" + ((Set) this.f50550c).size() + ", isPaused=" + this.f50549b + "}";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        fw0 fw0Var = (fw0) this.f50551d;
        if (fw0Var.zzb()) {
            jw0 jw0Var = (jw0) this.f50550c;
            fw0Var.a(th2);
            fw0Var.zzd(false);
            jw0Var.a(fw0Var);
            if (this.f50549b) {
                jw0Var.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        fw0 fw0Var = (fw0) this.f50551d;
        fw0Var.zzd(true);
        jw0 jw0Var = (jw0) this.f50550c;
        jw0Var.a(fw0Var);
        if (this.f50549b) {
            jw0Var.h();
        }
    }

    public l(p81 p81Var, boolean z10, y71 y71Var) {
        this.f50548a = 8;
        this.f50551d = p81Var;
        this.f50549b = z10;
        this.f50550c = y71Var;
    }

    public /* synthetic */ l(boolean z10, Object obj, Object obj2, int i10) {
        this.f50548a = i10;
        this.f50549b = z10;
        this.f50550c = obj;
        this.f50551d = obj2;
    }

    public l(int i10) {
        this.f50548a = i10;
        switch (i10) {
            case 9:
                this.f50550c = new ArrayList();
                this.f50551d = new HashMap();
                this.f50549b = false;
                break;
            case 10:
            case 11:
            default:
                this.f50551d = zzb.zzb;
                break;
            case 12:
                this.f50550c = Collections.newSetFromMap(new WeakHashMap());
                this.f50551d = new HashSet();
                break;
            case 13:
                break;
        }
    }

    public l(kd kdVar) {
        this.f50548a = 3;
        this.f50550c = kdVar.z();
        this.f50549b = kdVar.A();
        this.f50551d = kdVar.B();
        kdVar.C();
    }

    public l(po0 po0Var, qm0 qm0Var, m00 m00Var) {
        this.f50548a = 6;
        this.f50550c = qm0Var;
        this.f50551d = m00Var;
        this.f50549b = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(p81 p81Var) {
        this(p81Var, false, (y71) b81.f12686b);
        this.f50548a = 8;
    }

    public l(Context context, int i10) {
        this.f50548a = i10;
        switch (i10) {
            case 4:
                this.f50551d = new Object();
                break;
            case 5:
                ExecutorService executorService = zzb.zzb;
                this.f50551d = executorService;
                executorService.execute(new zd1(7, this, context));
                break;
            default:
                this.f50551d = new HashSet();
                this.f50550c = new s(new i9.i(new f4(context, 5, false)), new k(this));
                break;
        }
    }

    public l(n1.g gVar) {
        this.f50548a = 10;
        this.f50550c = gVar;
        this.f50551d = new j2.n(3);
    }

    public l(y1.b bVar, y1.b bVar2) {
        this.f50548a = 14;
        this.f50550c = bVar;
        this.f50551d = bVar2;
        this.f50549b = true;
    }

    public l(com.bumptech.glide.b bVar, ArrayList arrayList, a2 a2Var) {
        this.f50548a = 2;
        this.f50550c = bVar;
        this.f50551d = arrayList;
    }
}
