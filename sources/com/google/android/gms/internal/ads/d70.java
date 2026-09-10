package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d70 implements ai, oa0, zzr, na0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y60 f13436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z60 f13437b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mt f13439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f13440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p9.a f13441f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f13438c = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f13442g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c70 f13443h = new c70();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13444i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference f13445j = new WeakReference(this);

    public d70(kt ktVar, z60 z60Var, Executor executor, y60 y60Var, p9.a aVar) {
        this.f13436a = y60Var;
        ktVar.a();
        this.f13439d = new mt(0, ktVar.f16521b);
        this.f13437b = z60Var;
        this.f13440e = executor;
        this.f13441f = aVar;
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final synchronized void C(Context context) {
        this.f13443h.f13075b = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final synchronized void a(Context context) {
        this.f13443h.f13077d = "u";
        zzl();
        b();
        this.f13444i = true;
    }

    public final void b() {
        Iterator it = this.f13438c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            y60 y60Var = this.f13436a;
            if (!zHasNext) {
                kt ktVar = y60Var.f22177b;
                w60 w60Var = y60Var.f22180e;
                ListenableFuture listenableFuture = ktVar.f16521b;
                jt jtVar = new jt(0, str2, w60Var);
                k00 k00Var = l00.f16615h;
                gd1 gd1VarZ = zw1.z(listenableFuture, jtVar, k00Var);
                ktVar.f16521b = gd1VarZ;
                ktVar.f16521b = zw1.z(gd1VarZ, new jt(0, str, y60Var.f22181f), k00Var);
                return;
            }
            b30 b30Var = (b30) it.next();
            b30Var.w("/updateActiveView", y60Var.f22180e);
            b30Var.w("/untrackActiveViewUnit", y60Var.f22181f);
        }
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final synchronized void k() {
        if (this.f13442g.compareAndSet(false, true)) {
            y60 y60Var = this.f13436a;
            kt ktVar = y60Var.f22177b;
            w60 w60Var = y60Var.f22180e;
            ktVar.a();
            ListenableFuture listenableFuture = ktVar.f16521b;
            ht htVar = new ht(0, "/updateActiveView", w60Var);
            k00 k00Var = l00.f16615h;
            ktVar.f16521b = zw1.x(listenableFuture, htVar, k00Var);
            w60 w60Var2 = y60Var.f22181f;
            ktVar.a();
            ktVar.f16521b = zw1.x(ktVar.f16521b, new ht(0, "/untrackActiveViewUnit", w60Var2), k00Var);
            y60Var.f22179d = this;
            zzl();
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final synchronized void v(zh zhVar) {
        c70 c70Var = this.f13443h;
        c70Var.f13074a = zhVar.f22617j;
        c70Var.f13078e = zhVar;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.oa0
    public final synchronized void zza(Context context) {
        this.f13443h.f13075b = true;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdw() {
        this.f13443h.f13075b = true;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdx() {
        this.f13443h.f13075b = false;
        zzl();
    }

    public final synchronized void zzl() {
        try {
            if (this.f13445j.get() == null) {
                synchronized (this) {
                    b();
                    this.f13444i = true;
                }
                return;
            }
            if (this.f13444i || !this.f13442g.get()) {
                return;
            }
            try {
                c70 c70Var = this.f13443h;
                ((p9.b) this.f13441f).getClass();
                c70Var.f13076c = SystemClock.elapsedRealtime();
                JSONObject jSONObjectZzb = this.f13437b.zzb(c70Var);
                Iterator it = this.f13438c.iterator();
                while (it.hasNext()) {
                    this.f13440e.execute(new b70(jSONObjectZzb, (b30) it.next()));
                }
                mt mtVar = this.f13439d;
                mtVar.getClass();
                ht htVar = new ht(1, mtVar, jSONObjectZzb);
                ListenableFuture listenableFuture = mtVar.f17541b;
                k00 k00Var = l00.f16615h;
                fd1 fd1VarX = zw1.x(listenableFuture, htVar, k00Var);
                fd1VarX.addListener(new zd1(0, fd1VarX, new sf1("ActiveViewListener.callActiveViewJs", 4)), k00Var);
                return;
            } catch (Exception e10) {
                zze.zzb("Failed to call ActiveViewJS", e10);
                return;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i10) {
    }
}
