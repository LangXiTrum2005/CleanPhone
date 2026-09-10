package dj;

import d5.u;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f38909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f38910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f38911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f38912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f38913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f38914k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f38915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f38916n;

    public a(String str, String appId, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        n.f(appId, "appId");
        this.f38904a = str;
        this.f38905b = appId;
        this.f38906c = str2;
        this.f38907d = str3;
        this.f38908e = str4;
        this.f38909f = str5;
        this.f38910g = str6;
        this.f38911h = str7;
        this.f38912i = str8;
        this.f38913j = str9;
        this.f38914k = str10;
        this.l = str11;
        this.f38915m = str12;
        this.f38916n = str13;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(a.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return com.google.android.gms.internal.auth.i.h(this.f38904a, aVar.f38904a) && com.google.android.gms.internal.auth.i.h(this.f38905b, aVar.f38905b) && com.google.android.gms.internal.auth.i.h(this.f38906c, aVar.f38906c) && com.google.android.gms.internal.auth.i.h(this.f38907d, aVar.f38907d) && com.google.android.gms.internal.auth.i.h(this.f38908e, aVar.f38908e) && com.google.android.gms.internal.auth.i.h(this.f38909f, aVar.f38909f) && com.google.android.gms.internal.auth.i.h(this.f38910g, aVar.f38910g) && com.google.android.gms.internal.auth.i.h(this.f38911h, aVar.f38911h) && com.google.android.gms.internal.auth.i.h(this.f38912i, aVar.f38912i) && com.google.android.gms.internal.auth.i.h(this.f38913j, aVar.f38913j) && com.google.android.gms.internal.auth.i.h(this.f38914k, aVar.f38914k) && com.google.android.gms.internal.auth.i.h(this.l, aVar.l) && com.google.android.gms.internal.auth.i.h(this.f38915m, aVar.f38915m) && com.google.android.gms.internal.auth.i.h(this.f38916n, aVar.f38916n);
    }

    public final int hashCode() {
        return com.google.android.gms.internal.auth.i.j(this.f38916n) + ((com.google.android.gms.internal.auth.i.j(this.f38915m) + ((com.google.android.gms.internal.auth.i.j(this.l) + ((com.google.android.gms.internal.auth.i.j(this.f38914k) + ((com.google.android.gms.internal.auth.i.j(this.f38913j) + ((com.google.android.gms.internal.auth.i.j(this.f38912i) + ((com.google.android.gms.internal.auth.i.j(this.f38911h) + ((com.google.android.gms.internal.auth.i.j(this.f38910g) + ((com.google.android.gms.internal.auth.i.j(this.f38909f) + ((com.google.android.gms.internal.auth.i.j(this.f38908e) + ((com.google.android.gms.internal.auth.i.j(this.f38907d) + ((com.google.android.gms.internal.auth.i.j(this.f38906c) + ((com.google.android.gms.internal.auth.i.j(this.f38905b) + ((com.google.android.gms.internal.auth.i.j(this.f38904a) + (a.class.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("CoreFirebaseOptions(apiKey=", this.f38904a, ", appId=", this.f38905b, ", messagingSenderId=");
        u.r(sbV, this.f38906c, ", projectId=", this.f38907d, ", authDomain=");
        u.r(sbV, this.f38908e, ", databaseURL=", this.f38909f, ", storageBucket=");
        u.r(sbV, this.f38910g, ", measurementId=", this.f38911h, ", trackingId=");
        u.r(sbV, this.f38912i, ", deepLinkURLScheme=", this.f38913j, ", androidClientId=");
        u.r(sbV, this.f38914k, ", iosClientId=", this.l, ", iosBundleId=");
        return u.h(sbV, this.f38915m, ", appGroupId=", this.f38916n, ")");
    }
}
