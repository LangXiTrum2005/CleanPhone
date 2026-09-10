package com.startapp.sdk.internal;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class h9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f41039c = new HashMap();
    public static final h9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h9 f41040e;
    public static final h9 f;
    public static final h9 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h9 f41041h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h9 f41042i;
    public static final h9 j;
    public static final h9 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h9 f41043l;
    public static final h9 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h9 f41044n;
    public static final h9 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h9 f41045p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9 f41047b;

    static {
        i9 i9Var = new i9();
        i9Var.f41085b = 23;
        i9Var.f41086c = 50;
        i9Var.d = true;
        l9 l9Var = new l9();
        String[] strArr = {MobileAdsBridgeBase.initializeMethodName};
        ArrayList arrayList = l9Var.f41207a;
        if (arrayList == null) {
            arrayList = new ArrayList();
            l9Var.f41207a = arrayList;
        }
        String str = strArr[0];
        if (str != null) {
            arrayList.add(str);
        }
        l9 l9VarA = l9Var.a("value");
        l9VarA.d = "8h";
        i9 i9VarA = i9Var.a(new m9(l9VarA));
        l9 l9VarA2 = new l9().a("value", "details");
        l9VarA2.d = "30m";
        i9 i9VarA2 = i9VarA.a(new m9(l9VarA2));
        l9 l9Var2 = new l9();
        String[] strArr2 = {"CNS.shown", "CNS.closed"};
        ArrayList arrayList2 = l9Var2.f41208b;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            l9Var2.f41208b = arrayList2;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            String str2 = strArr2[i2];
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        l9 l9VarA3 = l9Var2.a("value");
        l9VarA3.d = "10s";
        i9 i9VarA3 = i9VarA2.a(new m9(l9VarA3));
        i9VarA3.f41087e = "2h";
        i9VarA3.f = "2s";
        d = new h9("general", new j9(i9VarA3));
        i9 i9Var2 = new i9();
        i9Var2.f41085b = 17;
        i9Var2.f41086c = 20;
        i9Var2.d = true;
        l9 l9Var3 = new l9();
        String[] strArr3 = {"fake_click"};
        ArrayList arrayList3 = l9Var3.f41208b;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            l9Var3.f41208b = arrayList3;
        }
        String str3 = strArr3[0];
        if (str3 != null) {
            arrayList3.add(str3);
        }
        l9 l9VarA4 = l9Var3.a("appActivity", "value", "details");
        l9VarA4.d = "30m";
        i9 i9VarA4 = i9Var2.a(new m9(l9VarA4));
        l9 l9Var4 = new l9();
        String[] strArr4 = {"fake_click"};
        ArrayList arrayList4 = l9Var4.f41208b;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            l9Var4.f41208b = arrayList4;
        }
        String str4 = strArr4[0];
        if (str4 != null) {
            arrayList4.add(str4);
        }
        l9 l9VarA5 = l9Var4.a("appActivity", "value");
        l9VarA5.d = "10s";
        i9 i9VarA5 = i9VarA4.a(new m9(l9VarA5));
        i9VarA5.f41087e = "4h";
        i9VarA5.f = "5s";
        f41040e = new h9("error", new j9(i9VarA5));
        i9 i9Var3 = new i9();
        i9Var3.f41084a = 0.0d;
        i9Var3.f41085b = 17;
        i9Var3.f41086c = 30;
        i9Var3.d = true;
        l9 l9VarA6 = new l9().a("appActivity", "value", "details");
        l9VarA6.d = "12h";
        i9 i9VarA6 = i9Var3.a(new m9(l9VarA6));
        l9 l9VarA7 = new l9().a("appActivity", "value");
        l9VarA7.d = "1h";
        i9 i9VarA7 = i9VarA6.a(new m9(l9VarA7));
        i9VarA7.f41087e = "1d";
        i9VarA7.f = "5s";
        j9 j9Var = new j9(i9VarA7);
        f = new h9(com.smartdigimkt.x.g.f39715A, j9Var);
        new h9("exception_nt", j9Var);
        i9 i9Var4 = new i9();
        i9Var4.f41085b = 17;
        i9Var4.f41086c = 40;
        i9Var4.d = true;
        l9 l9VarA8 = new l9().a("value", "details");
        l9VarA8.d = "1h";
        i9 i9VarA8 = i9Var4.a(new m9(l9VarA8));
        i9VarA8.f41087e = "2d";
        i9VarA8.f = "5s";
        g = new h9("exception_fatal", new j9(i9VarA8));
        f41041h = new h9("anr", j9Var);
        i9 i9Var5 = new i9();
        i9Var5.f41084a = 0.0d;
        i9Var5.f41085b = 17;
        i9Var5.f41086c = 10;
        i9Var5.d = false;
        i9Var5.f = "10s";
        new h9("netdiag", new j9(i9Var5));
        i9 i9Var6 = new i9();
        i9Var6.f41085b = 3007;
        i9Var6.f41086c = 90;
        i9Var6.d = true;
        l9 l9VarA9 = new l9().a(NotificationCompat.CATEGORY_SERVICE);
        l9VarA9.d = "1m";
        i9 i9VarA9 = i9Var6.a(new m9(l9VarA9));
        i9VarA9.f41087e = "1h";
        f41042i = new h9("periodic", new j9(i9VarA9));
        i9 i9Var7 = new i9();
        i9Var7.f41086c = 90;
        i9Var7.d = true;
        i9Var7.f41087e = "4h";
        j = new h9("nonimpression", new j9(i9Var7));
        i9 i9Var8 = new i9();
        i9Var8.f41085b = 17;
        i9Var8.f41086c = 10;
        i9Var8.d = true;
        i9Var8.f41087e = "4h";
        k = new h9("impression_responses", new j9(i9Var8));
        i9 i9Var9 = new i9();
        i9Var9.f41084a = 0.0d;
        i9Var9.f41085b = 17;
        i9Var9.f41086c = 60;
        i9Var9.d = true;
        i9Var9.f41087e = "1d";
        i9Var9.f = "5s";
        f41043l = new h9("success_smart_redirect_hop_info", new j9(i9Var9));
        i9 i9Var10 = new i9();
        i9Var10.f41085b = 17;
        i9Var10.f41086c = 70;
        i9Var10.d = false;
        new h9("triggeredLink", new j9(i9Var10));
        i9 i9Var11 = new i9();
        i9Var11.f41085b = 23;
        i9Var11.f41086c = 80;
        i9Var11.d = true;
        i9Var11.f41087e = "1d";
        m = new h9(com.smartdigimkt.o1.b.y3, new j9(i9Var11));
        i9 i9Var12 = new i9();
        i9Var12.f41085b = 23;
        i9Var12.f41086c = 80;
        i9Var12.d = true;
        i9Var12.f41087e = "1d";
        f41044n = new h9("lt", new j9(i9Var12));
        i9 i9Var13 = new i9();
        i9Var13.f41085b = 23;
        i9Var13.f41086c = 80;
        i9Var13.d = true;
        i9Var13.f41087e = "1d";
        o = new h9("nir", new j9(i9Var13));
        i9 i9Var14 = new i9();
        i9Var14.f41085b = 19;
        i9Var14.f41086c = 10;
        i9Var14.d = true;
        i9Var14.f41087e = "12h";
        f41045p = new h9("sensors", new j9(i9Var14));
    }

    public h9(String str, j9 j9Var) {
        this.f41046a = str;
        this.f41047b = j9Var;
        f41039c.put(str, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h9.class != obj.getClass()) {
            return false;
        }
        return vi.a((Object) this.f41046a, (Object) ((h9) obj).f41046a);
    }

    public final int hashCode() {
        return this.f41046a.hashCode();
    }

    public final String toString() {
        return this.f41046a;
    }
}
