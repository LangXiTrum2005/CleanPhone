package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dm0 implements hm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13588f;

    public /* synthetic */ dm0(int i10, int i11, WebView webView, String str, String str2, String str3) {
        this.f13585c = str;
        this.f13583a = i10;
        this.f13586d = str2;
        this.f13588f = webView;
        this.f13587e = str3;
        this.f13584b = i11;
    }

    public static boolean a(dm0 dm0Var) {
        return Objects.equals(((i1.p) dm0Var.f13585c).f42643n, MimeTypes.AUDIO_RAW);
    }

    public void b(Class cls, int i10) {
        NavigableMap navigableMapG = g(cls);
        Integer num = (Integer) navigableMapG.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapG.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapG.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    public void c(int i10) {
        while (this.f13584b > i10) {
            Object objB = ((ea.f2) this.f13585c).B();
            a7.h.b(objB);
            h6.b bVarE = e(objB.getClass());
            this.f13584b -= bVarE.b() * bVarE.a(objB);
            b(objB.getClass(), bVarE.a(objB));
            if (Log.isLoggable(bVarE.c(), 2)) {
                Log.v(bVarE.c(), "evicted: " + bVarE.a(objB));
            }
        }
    }

    public synchronized Object d(Class cls, int i10) {
        h6.d dVar;
        int i11;
        try {
            Integer num = (Integer) g(cls).ceilingKey(Integer.valueOf(i10));
            if (num == null || ((i11 = this.f13584b) != 0 && this.f13583a / i11 < 2 && num.intValue() > i10 * 8)) {
                h6.e eVar = (h6.e) this.f13586d;
                h6.g gVarH0 = (h6.g) ((ArrayDeque) eVar.f3623a).poll();
                if (gVarH0 == null) {
                    gVarH0 = eVar.H0();
                }
                dVar = (h6.d) gVarH0;
                dVar.f42222b = i10;
                dVar.f42223c = cls;
            } else {
                h6.e eVar2 = (h6.e) this.f13586d;
                int iIntValue = num.intValue();
                h6.g gVarH1 = (h6.g) ((ArrayDeque) eVar2.f3623a).poll();
                if (gVarH1 == null) {
                    gVarH1 = eVar2.H0();
                }
                dVar = (h6.d) gVarH1;
                dVar.f42222b = iIntValue;
                dVar.f42223c = cls;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f(dVar, cls);
    }

    public h6.b e(Class cls) {
        h6.b bVar;
        HashMap map = (HashMap) this.f13588f;
        h6.b bVar2 = (h6.b) map.get(cls);
        if (bVar2 != null) {
            return bVar2;
        }
        if (cls.equals(int[].class)) {
            bVar = new h6.b(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            bVar = new h6.b(0);
        }
        map.put(cls, bVar);
        return bVar;
    }

    public Object f(h6.d dVar, Class cls) {
        h6.b bVarE = e(cls);
        Object objM = ((ea.f2) this.f13585c).m(dVar);
        if (objM != null) {
            this.f13584b -= bVarE.b() * bVarE.a(objM);
            b(cls, bVarE.a(objM));
        }
        if (objM != null) {
            return objM;
        }
        if (Log.isLoggable(bVarE.c(), 2)) {
            Log.v(bVarE.c(), "Allocated " + dVar.f42222b + " bytes");
        }
        int i10 = dVar.f42222b;
        switch (bVarE.f42216a) {
            case 0:
                return new byte[i10];
            default:
                return new int[i10];
        }
    }

    public NavigableMap g(Class cls) {
        HashMap map = (HashMap) this.f13587e;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public synchronized void h(Object obj) {
        Class<?> cls = obj.getClass();
        h6.b bVarE = e(cls);
        int iA = bVarE.a(obj);
        int iB = bVarE.b() * iA;
        if (iB <= this.f13583a / 2) {
            h6.e eVar = (h6.e) this.f13586d;
            h6.g gVarH0 = (h6.g) ((ArrayDeque) eVar.f3623a).poll();
            if (gVarH0 == null) {
                gVarH0 = eVar.H0();
            }
            h6.d dVar = (h6.d) gVarH0;
            dVar.f42222b = iA;
            dVar.f42223c = cls;
            ((ea.f2) this.f13585c).z(dVar, obj);
            NavigableMap navigableMapG = g(cls);
            Integer num = (Integer) navigableMapG.get(Integer.valueOf(dVar.f42222b));
            Integer numValueOf = Integer.valueOf(dVar.f42222b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapG.put(numValueOf, Integer.valueOf(iIntValue));
            this.f13584b += iB;
            c(this.f13583a);
        }
    }

    @Override // com.google.android.gms.internal.ads.hm0
    /* JADX INFO: renamed from: zza */
    public Object mo166zza() {
        String str = (String) this.f13585c;
        String str2 = (String) this.f13586d;
        WebView webView = (WebView) this.f13588f;
        String str3 = (String) this.f13587e;
        int i10 = this.f13584b;
        if (TextUtils.isEmpty("Google")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        fm fmVar = new fm("Google", str);
        py0 py0VarK = tc0.k("javascript");
        int i11 = this.f13583a;
        ly0 ly0VarM = tc0.m(com.applovin.impl.ca.c(i11));
        py0 py0Var = py0.NONE;
        if (py0VarK == py0Var) {
            int i12 = zze.zza;
            zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (ly0VarM == null) {
            String strZ = com.applovin.impl.ca.z(i11);
            int i13 = zze.zza;
            zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(strZ));
            return null;
        }
        py0 py0VarK2 = tc0.k(str2);
        if (ly0VarM == ly0.VIDEO && py0VarK2 == py0Var) {
            String strValueOf = String.valueOf(str2);
            int i14 = zze.zza;
            zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf));
            return null;
        }
        a8 a8Var = new a8(fmVar, webView, str3, "", jy0.HTML);
        m01 m01VarA = m01.a(ly0VarM, tc0.l(com.applovin.impl.ca.d(i10)), py0VarK, py0VarK2, true);
        if (pi1.L.f17679b) {
            return new km0(new ky0(m01VarA, a8Var, UUID.randomUUID().toString()), a8Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public dm0(int i10) {
        this.f13585c = new ea.f2(16);
        this.f13586d = new h6.e(0);
        this.f13587e = new HashMap();
        this.f13588f = new HashMap();
        this.f13583a = i10;
    }

    public dm0(i1.p pVar, i1.p pVar2, int i10, int i11, r1.j jVar, j1.g gVar) {
        this.f13585c = pVar;
        this.f13586d = pVar2;
        this.f13583a = i10;
        this.f13584b = i11;
        this.f13587e = jVar;
        this.f13588f = gVar;
    }
}
