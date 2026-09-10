package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class em0 implements hm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f14013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f14014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f14016g;

    public /* synthetic */ em0(String str, String str2, String str3, int i10, WebView webView, String str4, int i11) {
        this.f14010a = str;
        this.f14013d = str2;
        this.f14014e = str3;
        this.f14011b = i10;
        this.f14016g = webView;
        this.f14015f = str4;
        this.f14012c = i11;
    }

    public void a(tb.h hVar) {
        if (((HashSet) this.f14013d).contains(hVar.f50695a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f14014e).add(hVar);
    }

    public tb.a b() {
        if (((tb.d) this.f14015f) != null) {
            return new tb.a((String) this.f14010a, new HashSet((HashSet) this.f14013d), new HashSet((HashSet) this.f14014e), this.f14011b, this.f14012c, (tb.d) this.f14015f, (HashSet) this.f14016g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c(int i10) {
        if (!(this.f14011b == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f14011b = i10;
    }

    @Override // com.google.android.gms.internal.ads.hm0
    /* JADX INFO: renamed from: zza */
    public Object mo166zza() {
        String str = (String) this.f14010a;
        String str2 = (String) this.f14013d;
        String str3 = (String) this.f14014e;
        int i10 = this.f14011b;
        WebView webView = (WebView) this.f14016g;
        String str4 = (String) this.f14015f;
        int i11 = this.f14012c;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        fm fmVar = new fm(str, str2);
        py0 py0VarK = tc0.k("javascript");
        py0 py0VarK2 = tc0.k(str3);
        ly0 ly0VarM = tc0.m(com.applovin.impl.ca.c(i10));
        py0 py0Var = py0.NONE;
        if (py0VarK == py0Var) {
            int i12 = zze.zza;
            zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (ly0VarM == null) {
            String strZ = com.applovin.impl.ca.z(i10);
            int i13 = zze.zza;
            zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(strZ));
            return null;
        }
        if (ly0VarM == ly0.VIDEO && py0VarK2 == py0Var) {
            String strValueOf = String.valueOf(str3);
            int i14 = zze.zza;
            zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf));
            return null;
        }
        a8 a8Var = new a8(fmVar, webView, str4, "", jy0.JAVASCRIPT);
        m01 m01VarA = m01.a(ly0VarM, tc0.l(com.applovin.impl.ca.d(i11)), py0VarK, py0VarK2, true);
        if (pi1.L.f17679b) {
            return new km0(new ky0(m01VarA, a8Var, UUID.randomUUID().toString()), a8Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public em0(Class cls, Class[] clsArr) {
        this.f14010a = null;
        HashSet hashSet = new HashSet();
        this.f14013d = hashSet;
        this.f14014e = new HashSet();
        this.f14011b = 0;
        this.f14012c = 0;
        this.f14016g = new HashSet();
        hashSet.add(tb.q.a(cls));
        for (Class cls2 : clsArr) {
            a.a.f(cls2, "Null interface");
            ((HashSet) this.f14013d).add(tb.q.a(cls2));
        }
    }

    public em0(tb.q qVar, tb.q[] qVarArr) {
        this.f14010a = null;
        HashSet hashSet = new HashSet();
        this.f14013d = hashSet;
        this.f14014e = new HashSet();
        this.f14011b = 0;
        this.f14012c = 0;
        this.f14016g = new HashSet();
        hashSet.add(qVar);
        for (tb.q qVar2 : qVarArr) {
            a.a.f(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) this.f14013d, qVarArr);
    }

    public em0(Integer num, int i10, Boolean bool, Integer num2, int i11, Integer num3, Boolean bool2) {
        this.f14010a = num;
        this.f14011b = i10;
        this.f14013d = bool;
        this.f14014e = num2;
        this.f14012c = i11;
        this.f14015f = num3;
        this.f14016g = bool2;
    }
}
