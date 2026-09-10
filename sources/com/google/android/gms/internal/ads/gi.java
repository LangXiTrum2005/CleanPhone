package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2.w f14865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q5 f14866f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14873n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f14867g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f14868h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f14869i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f14870j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14871k = 0;
    public int l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14872m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f14874o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f14875p = "";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f14876q = "";

    public gi(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.f14861a = i10;
        this.f14862b = i11;
        this.f14863c = i12;
        this.f14864d = z10;
        this.f14865e = new b2.w(i13, 4);
        q5 q5Var = new q5();
        q5Var.f18932a = i14;
        i15 = (i15 > 64 || i15 < 0) ? 64 : i15;
        if (i16 <= 0) {
            q5Var.f18933b = 1;
        } else {
            q5Var.f18933b = i16;
        }
        q5Var.f18934c = new qi(i15);
        this.f14866f = q5Var;
    }

    public static final String d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            sb2.append((String) arrayList.get(i10));
            sb2.append(' ');
            i10++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String string = sb2.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final void a(String str, boolean z10, float f10, float f11, float f12, float f13) {
        c(str, z10, f10, f11, f12, f13);
        synchronized (this.f14867g) {
            try {
                if (this.f14872m < 0) {
                    int i10 = zze.zza;
                    zzo.zzd("ActivityContent: negative number of WebViews.");
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f14867g) {
            try {
                int i10 = this.f14871k;
                int i11 = this.l;
                int i12 = this.f14862b;
                if (!this.f14864d) {
                    i12 = (i11 * i12) + (i10 * this.f14861a);
                }
                if (i12 > this.f14873n) {
                    this.f14873n = i12;
                    if (!zzt.zzh().g().zzc()) {
                        b2.w wVar = this.f14865e;
                        this.f14874o = wVar.k(this.f14868h);
                        this.f14875p = wVar.k(this.f14869i);
                    }
                    if (!zzt.zzh().g().zze()) {
                        this.f14876q = this.f14866f.a(this.f14869i, this.f14870j);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str != null) {
            if (str.length() < this.f14863c) {
                return;
            }
            synchronized (this.f14867g) {
                try {
                    this.f14868h.add(str);
                    this.f14871k += str.length();
                    if (z10) {
                        ArrayList arrayList = this.f14869i;
                        arrayList.add(str);
                        this.f14870j.add(new mi(f10, f11, f12, f13, arrayList.size() - 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gi)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((gi) obj).f14874o;
        return str != null && str.equals(this.f14874o);
    }

    public final int hashCode() {
        return this.f14874o.hashCode();
    }

    public final String toString() {
        int i10 = this.l;
        int i11 = this.f14873n;
        int i12 = this.f14871k;
        String strD = d(this.f14868h);
        String strD2 = d(this.f14869i);
        String str = this.f14874o;
        String str2 = this.f14875p;
        String str3 = this.f14876q;
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(i11).length();
        int length3 = String.valueOf(i12).length();
        int length4 = String.valueOf(strD).length();
        int length5 = String.valueOf(strD2).length();
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + String.valueOf(str).length(), 20, String.valueOf(str2).length(), 32, String.valueOf(str3).length()));
        l1.d.p(sb2, "ActivityContent fetchId: ", i10, " score:", i11);
        sb2.append(" total_length:");
        sb2.append(i12);
        sb2.append("\n text: ");
        sb2.append(strD);
        d5.u.r(sb2, "\n viewableText", strD2, "\n signture: ", str);
        return d5.u.h(sb2, "\n viewableSignture: ", str2, "\n viewableSignatureForVertical: ", str3);
    }
}
