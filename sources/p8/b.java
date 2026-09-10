package p8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.internal.ads.z40;
import com.ironsource.O6;
import com.ironsource.X3;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import oc.d;
import q8.a0;
import q8.b0;
import q8.c;
import q8.c0;
import q8.d0;
import q8.e0;
import q8.f;
import q8.f0;
import q8.g;
import q8.g0;
import q8.h;
import q8.h0;
import q8.i;
import q8.i0;
import q8.j;
import q8.k;
import q8.l;
import q8.m;
import q8.n;
import q8.o;
import q8.p;
import q8.q;
import q8.r;
import q8.s;
import q8.t;
import q8.v;
import q8.w;
import q8.y;
import s8.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final am.e f48271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f48272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f48273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f48274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a9.a f48275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a9.a f48276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f48277g;

    public b(Context context, a9.a aVar, a9.a aVar2) {
        d dVar = new d();
        c cVar = c.f48814a;
        dVar.a(w.class, cVar);
        dVar.a(m.class, cVar);
        j jVar = j.f48843a;
        dVar.a(f0.class, jVar);
        dVar.a(t.class, jVar);
        q8.d dVar2 = q8.d.f48816a;
        dVar.a(y.class, dVar2);
        dVar.a(n.class, dVar2);
        q8.b bVar = q8.b.f48802a;
        dVar.a(q8.a.class, bVar);
        dVar.a(l.class, bVar);
        i iVar = i.f48833a;
        dVar.a(e0.class, iVar);
        dVar.a(s.class, iVar);
        q8.e eVar = q8.e.f48819a;
        dVar.a(a0.class, eVar);
        dVar.a(o.class, eVar);
        h hVar = h.f48829a;
        dVar.a(d0.class, hVar);
        dVar.a(r.class, hVar);
        g gVar = g.f48825a;
        dVar.a(c0.class, gVar);
        dVar.a(q.class, gVar);
        k kVar = k.f48853a;
        dVar.a(i0.class, kVar);
        dVar.a(v.class, kVar);
        f fVar = f.f48822a;
        dVar.a(b0.class, fVar);
        dVar.a(p.class, fVar);
        dVar.f47373d = true;
        this.f48271a = new am.e(dVar, 25);
        this.f48273c = context;
        this.f48272b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f48274d = b(a.f48265c);
        this.f48275e = aVar2;
        this.f48276f = aVar;
        this.f48277g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(defpackage.e.n("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x010f  */
    public final r8.h a(r8.h hVar) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.f48272b.getActiveNetworkInfo();
        z40 z40VarC = hVar.c();
        int i10 = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) z40VarC.f22496f;
        if (map2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map2.put("sdk-version", String.valueOf(i10));
        z40VarC.a(O6.B, Build.MODEL);
        z40VarC.a("hardware", Build.HARDWARE);
        z40VarC.a(X3.i.G, Build.DEVICE);
        z40VarC.a(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT);
        z40VarC.a("os-uild", Build.ID);
        z40VarC.a("manufacturer", Build.MANUFACTURER);
        z40VarC.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) z40VarC.f22496f;
        if (map3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i11 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = h0.f48831a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) z40VarC.f22496f;
        if (map4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = g0.f48827a;
                subtype = 100;
            } else if (((g0) g0.f48827a.get(subtype)) == null) {
            }
            map = (HashMap) z40VarC.f22496f;
            if (map != null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            z40VarC.a("country", Locale.getDefault().getCountry());
            z40VarC.a("locale", Locale.getDefault().getLanguage());
            Context context = this.f48273c;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            z40VarC.a("mcc_mnc", simOperator);
            try {
                i11 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e10) {
                no.b.t("CctTransportBackend", "Unable to find version code for package", e10);
            }
            z40VarC.a("application_build", Integer.toString(i11));
            return z40VarC.b();
        }
        SparseArray sparseArray3 = g0.f48827a;
        subtype = 0;
        map = (HashMap) z40VarC.f22496f;
        if (map != null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        z40VarC.a("country", Locale.getDefault().getCountry());
        z40VarC.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f48273c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        z40VarC.a("mcc_mnc", simOperator);
        i11 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        z40VarC.a("application_build", Integer.toString(i11));
        return z40VarC.b();
    }
}
