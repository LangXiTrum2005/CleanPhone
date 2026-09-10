package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hb implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb f15232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb f15237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f15238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ib f15239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wa f15241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public hz f15242k;
    public final za l;

    public hb(int i10, String str, jb jbVar) {
        Uri uri;
        String host;
        this.f15232a = nb.f17730c ? new nb() : null;
        this.f15236e = new Object();
        int iHashCode = 0;
        this.f15240i = false;
        this.f15241j = null;
        this.f15233b = i10;
        this.f15234c = str;
        this.f15237f = jbVar;
        za zaVar = new za();
        zaVar.f22573a = 2500;
        this.l = zaVar;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.f15235d = iHashCode;
    }

    public final void a(String str) {
        ib ibVar = this.f15239h;
        if (ibVar != null) {
            HashSet hashSet = ibVar.f15695b;
            synchronized (hashSet) {
                hashSet.remove(this);
            }
            ArrayList arrayList = ibVar.f15702i;
            synchronized (arrayList) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            ibVar.c();
        }
        if (nb.f17730c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new q1(this, str, id2));
                return;
            }
            nb nbVar = this.f15232a;
            nbVar.a(id2, str);
            nbVar.b(toString());
        }
    }

    public final void b() {
        ib ibVar = this.f15239h;
        if (ibVar != null) {
            ibVar.c();
        }
    }

    public abstract bc.s c(fb fbVar);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f15238g.intValue() - ((hb) obj).f15238g.intValue();
    }

    public abstract void d(Object obj);

    public final void e(bc.s sVar) {
        hz hzVar;
        List list;
        synchronized (this.f15236e) {
            hzVar = this.f15242k;
        }
        if (hzVar != null) {
            wa waVar = (wa) sVar.f5582c;
            if (waVar != null) {
                if (waVar.f21473e >= System.currentTimeMillis()) {
                    String strZzi = zzi();
                    synchronized (hzVar) {
                        list = (List) ((HashMap) hzVar.f15433b).remove(strZzi);
                    }
                    if (list != null) {
                        if (ob.f18214a) {
                            ob.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzi);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((b21) hzVar.f15436e).e((hb) it.next(), sVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            hzVar.i(this);
        }
    }

    public final void f() {
        hz hzVar;
        synchronized (this.f15236e) {
            hzVar = this.f15242k;
        }
        if (hzVar != null) {
            hzVar.i(this);
        }
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.f15235d));
        zzl();
        Integer num = this.f15238g;
        String str = this.f15234c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(num).length();
        String strConcat = "0x".concat(strValueOf);
        StringBuilder sb2 = new StringBuilder(strConcat.length() + length + 5 + 8 + length2);
        d5.u.r(sb2, "[ ] ", str, " ", strConcat);
        sb2.append(" NORMAL ");
        sb2.append(num);
        return sb2.toString();
    }

    public final int zza() {
        return this.f15233b;
    }

    public final int zzb() {
        return this.f15235d;
    }

    public final void zzc(String str) {
        if (nb.f17730c) {
            this.f15232a.a(Thread.currentThread().getId(), str);
        }
    }

    public final hb zzf(ib ibVar) {
        this.f15239h = ibVar;
        return this;
    }

    public final hb zzg(int i10) {
        this.f15238g = Integer.valueOf(i10);
        return this;
    }

    public final String zzh() {
        return this.f15234c;
    }

    public final String zzi() {
        int i10 = this.f15233b;
        String str = this.f15234c;
        if (i10 == 0) {
            return str;
        }
        String string = Integer.toString(1);
        return q4.a.j(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length()), string, "-", str);
    }

    public final hb zzj(wa waVar) {
        this.f15241j = waVar;
        return this;
    }

    @Nullable
    public final wa zzk() {
        return this.f15241j;
    }

    public final boolean zzl() {
        synchronized (this.f15236e) {
        }
        return false;
    }

    public Map zzm() throws va {
        return Collections.EMPTY_MAP;
    }

    public byte[] zzn() throws va {
        return null;
    }

    public final int zzo() {
        return this.l.f22573a;
    }

    public final void zzp() {
        synchronized (this.f15236e) {
            this.f15240i = true;
        }
    }

    public final boolean zzq() {
        boolean z10;
        synchronized (this.f15236e) {
            z10 = this.f15240i;
        }
        return z10;
    }

    public final void zzt(lb lbVar) {
        jb jbVar;
        synchronized (this.f15236e) {
            jbVar = this.f15237f;
        }
        jbVar.zza(lbVar);
    }

    public final za zzy() {
        return this.l;
    }
}
