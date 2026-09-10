package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzx;
import com.google.android.gms.ads.internal.zzg;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o8 implements n7, zzg, yd1, k9.b, k9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f18184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f18185f;

    public /* synthetic */ o8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f18180a = i10;
        this.f18181b = obj2;
        this.f18182c = obj3;
        this.f18183d = obj4;
        this.f18184e = obj5;
        this.f18185f = obj;
    }

    public static je e() {
        xd xdVarA0 = je.A0();
        xdVarA0.i(32768L);
        return (je) xdVarA0.e();
    }

    public ListenableFuture a(String str) {
        if (str != null) {
            if (!((Boolean) zzba.zzc().a(am.f12158g)).booleanValue() || !str.isEmpty()) {
                try {
                    return f(1, 0L, str);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return zw1.d(zzt.zzb);
                }
            }
        }
        return zw1.d(zzt.zzb);
    }

    @Override // com.google.android.gms.internal.ads.n7
    public ArrayList b(long j10) {
        Map map = (Map) this.f18183d;
        HashMap map2 = (HashMap) this.f18184e;
        HashMap map3 = (HashMap) this.f18185f;
        j8 j8Var = (j8) this.f18181b;
        ArrayList arrayList = new ArrayList();
        String str = j8Var.f16016h;
        j8Var.g(j10, str, arrayList);
        TreeMap treeMap = new TreeMap();
        j8Var.h(j10, false, str, treeMap);
        j8Var.j(j10, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                m8 m8Var = (m8) map2.get(pair.first);
                m8Var.getClass();
                arrayList2.add(new l80(null, null, null, bitmapDecodeByteArray, m8Var.f17326c, 0, m8Var.f17328e, m8Var.f17325b, 0, Integer.MIN_VALUE, -3.4028235E38f, m8Var.f17329f, m8Var.f17330g, m8Var.f17333j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            m8 m8Var2 = (m8) map2.get(entry.getKey());
            m8Var2.getClass();
            z70 z70Var = (z70) entry.getValue();
            CharSequence charSequence = z70Var.f22533a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (h8 h8Var : (h8[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h8.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(h8Var), spannableStringBuilder.getSpanEnd(h8Var), (CharSequence) "");
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = m8Var2.f17326c;
            int i19 = m8Var2.f17327d;
            z70Var.f22537e = f10;
            z70Var.f22538f = i19;
            z70Var.f22539g = m8Var2.f17328e;
            z70Var.f22540h = m8Var2.f17325b;
            z70Var.l = m8Var2.f17329f;
            float f11 = m8Var2.f17332i;
            int i20 = m8Var2.f17331h;
            z70Var.f22543k = f11;
            z70Var.f22542j = i20;
            z70Var.f22545n = m8Var2.f17333j;
            arrayList2.add(z70Var.a());
        }
        return arrayList2;
    }

    @Override // k9.b
    public void d(Bundle bundle) {
        h01 h01Var;
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f18184e;
        HandlerThread handlerThread = (HandlerThread) this.f18185f;
        try {
            h01Var = (h01) ((e01) this.f18181b).getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            h01Var = null;
        }
        if (h01Var != null) {
            try {
                try {
                    f01 f01Var = new f01(1, (String) this.f18182c, (String) this.f18183d);
                    Parcel parcelQ = h01Var.q();
                    rh.c(parcelQ, f01Var);
                    Parcel parcelR = h01Var.r(parcelQ, 1);
                    g01 g01Var = (g01) rh.b(parcelR, g01.CREATOR);
                    parcelR.recycle();
                    if (g01Var.f14643b == null) {
                        try {
                            byte[] bArr = g01Var.f14644c;
                            ks1 ks1Var = ks1.f16518a;
                            int i10 = tr1.f20473a;
                            g01Var.f14643b = je.z0(bArr, ks1.f16519b);
                            g01Var.f14644c = null;
                        } catch (et1 | NullPointerException e10) {
                            throw new IllegalStateException(e10);
                        }
                    }
                    g01Var.zzb();
                    linkedBlockingQueue.put(g01Var.f14643b);
                } catch (InterruptedException unused2) {
                } finally {
                    zzb();
                    handlerThread.quit();
                }
            } catch (Throwable unused3) {
                linkedBlockingQueue.put(e());
            }
        }
    }

    public ListenableFuture f(final int i10, final long j10, final String str) {
        final String strJ;
        fe1 fe1Var = (ge1) this.f18183d;
        zzx zzxVar = (zzx) this.f18181b;
        if (i10 > zzxVar.zza()) {
            kx0 kx0Var = (kx0) this.f18184e;
            if (kx0Var == null || !zzxVar.zzd()) {
                return zw1.d(zzt.zzc);
            }
            ((p9.b) com.google.android.gms.ads.internal.zzt.zzk()).getClass();
            tb tbVar = new tb("", 2, str, System.currentTimeMillis());
            ul0 ul0Var = kx0Var.f16556a;
            ul0Var.getClass();
            ul0Var.a(new md0(23, ul0Var, tbVar));
            return zw1.d(zzt.zzd);
        }
        if (((Boolean) zzba.zzc().a(am.W9)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i10));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strJ = q4.a.j(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, X3.j.f27832c, encodedQuery);
        } else {
            strJ = str;
        }
        od1 od1Var = new od1() { // from class: com.google.android.gms.internal.ads.jx0
            @Override // com.google.android.gms.internal.ads.od1
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzt zztVar = (zzt) obj;
                if (zztVar != zzt.zzc) {
                    return zw1.d(zztVar);
                }
                o8 o8Var = this.f16211a;
                zzx zzxVar2 = (zzx) o8Var.f18181b;
                long jZzb = zzxVar2.zzb();
                int i11 = i10;
                if (i11 != 1) {
                    jZzb = (long) (zzxVar2.zzc() * j10);
                }
                return o8Var.f(i11 + 1, jZzb, str);
            }
        };
        if (j10 == 0) {
            final int i11 = 1;
            return zw1.x(((k00) fe1Var).b(new Callable(this) { // from class: com.google.android.gms.internal.ads.ix0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ o8 f15867b;

                {
                    this.f15867b = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    switch (i11) {
                        case 0:
                            break;
                    }
                    return this.f15867b.g(strJ);
                }
            }), od1Var, fe1Var);
        }
        final int i12 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.ads.ix0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o8 f15867b;

            {
                this.f15867b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i12) {
                    case 0:
                        break;
                }
                return this.f15867b.g(strJ);
            }
        };
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ke1 ke1Var = (ke1) fe1Var;
        ke1Var.getClass();
        pe1 pe1Var = new pe1(callable);
        return zw1.x(new ie1(pe1Var, ke1Var.f16420c.schedule(pe1Var, j10, timeUnit)), od1Var, ke1Var);
    }

    public zzt g(String str) {
        h40 h40Var;
        zzu zzuVar = (zzu) this.f18182c;
        if (!((Boolean) zzba.zzc().a(am.f12286oa)).booleanValue() || (h40Var = (h40) this.f18185f) == null || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return zzuVar.zzc(str, null);
        }
        rw1 rw1Var = h40Var.f15110c;
        String strEncodeToString = rw1Var != null ? Base64.encodeToString(rw1Var.b(), 10) : null;
        HashMap map = new HashMap();
        if (strEncodeToString != null) {
            map.put((String) zzba.zzc().a(am.f12303pa), strEncodeToString);
        }
        return zzuVar.zzc(str, map);
    }

    @Override // k9.b
    public void q(int i10) {
        try {
            ((LinkedBlockingQueue) this.f18184e).put(e());
        } catch (InterruptedException unused) {
        }
    }

    @Override // k9.c
    public void r(ConnectionResult connectionResult) {
        try {
            ((LinkedBlockingQueue) this.f18184e).put(e());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.n7
    public int zza() {
        return ((long[]) this.f18182c).length;
    }

    @Override // com.google.android.gms.internal.ads.n7
    public long zzb(int i10) {
        return ((long[]) this.f18182c)[i10];
    }

    public /* synthetic */ o8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, boolean z10) {
        this.f18180a = i10;
        this.f18181b = obj;
        this.f18182c = obj2;
        this.f18183d = obj3;
        this.f18184e = obj4;
        this.f18185f = obj5;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zza(View view) {
        vf vfVar = (vf) this.f18184e;
        b21 b21Var = (b21) ((po0) this.f18185f).f18748e;
        ju0 ju0Var = (ju0) this.f18182c;
        du0 du0Var = (du0) this.f18183d;
        m00 m00Var = (m00) this.f18181b;
        wg0 wg0Var = new wg0(new uo0(b21Var, du0Var), null, 1);
        vu0 vu0Var = new vu0(ju0Var, du0Var, (String) null);
        i50 i50Var = (i50) ((ed0) b21Var.f12616b);
        h50 h50Var = new h50(i50Var.f15577b, i50Var.f15578c, vu0Var, wg0Var);
        x11 x11Var = new x11(b21Var, h50Var);
        synchronized (vfVar) {
            vfVar.f21157b = x11Var;
        }
        m00Var.zzc(h50Var.W());
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public void zzb() {
        switch (this.f18180a) {
            case 2:
                break;
            default:
                e01 e01Var = (e01) this.f18181b;
                if (e01Var != null) {
                    if (e01Var.isConnected() || e01Var.isConnecting()) {
                        e01Var.disconnect();
                    }
                }
                break;
        }
    }

    public o8(Context context, n30 n30Var, n30 n30Var2, yh0 yh0Var) {
        this.f18180a = 1;
        this.f18181b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f18183d = n30Var;
        this.f18182c = n30Var2;
        this.f18185f = null;
        this.f18184e = yh0Var;
    }

    public o8(Context context, String str, String str2) {
        this.f18180a = 8;
        this.f18182c = str;
        this.f18183d = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f18185f = handlerThread;
        handlerThread.start();
        e01 e01Var = new e01(context, handlerThread.getLooper(), this, this, 9200000);
        this.f18181b = e01Var;
        this.f18184e = new LinkedBlockingQueue();
        e01Var.checkAvailabilityAndConnect();
    }

    @Override // com.google.android.gms.internal.ads.yd1
    /* JADX INFO: renamed from: zzb */
    public void mo164zzb(Object obj) {
        jw0 jw0Var;
        jw0 jw0Var2;
        jw0 jw0Var3;
        jw0 jw0Var4;
        switch (this.f18180a) {
            case 3:
                v90 v90Var = (v90) this.f18185f;
                m80 m80Var = (m80) obj;
                synchronized (v90Var) {
                    if (m80Var != null) {
                        try {
                            m80Var.b();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    ((nb0) m80Var.f17340g.f17733a.f21703b).f17734b = (hp0) ((vu0) v90Var.f21138d).f21275c;
                    ((x11) this.f18181b).f(m80Var);
                    ((a50) v90Var.f21137c).b().execute(new r80(this, 1));
                    if (((Boolean) an.f12466c.o()).booleanValue() && (jw0Var = (jw0) this.f18182c) != null) {
                        jw0Var.e(m80Var.f17334a.f16196b);
                        jw0Var.g(m80Var.f17339f.f11954a);
                        fw0 fw0Var = (fw0) this.f18183d;
                        fw0Var.zzd(true);
                        jw0Var.a(fw0Var);
                        jw0Var.h();
                    } else {
                        kw0 kw0Var = (kw0) v90Var.f21139e;
                        fw0 fw0Var2 = (fw0) this.f18183d;
                        fw0Var2.b(m80Var.f17334a.f16196b);
                        fw0Var2.zzi(m80Var.f17339f.f11954a);
                        fw0Var2.zzd(true);
                        kw0Var.b(fw0Var2.zzm());
                    }
                    break;
                }
                return;
            case 4:
                us0 us0Var = (us0) this.f18185f;
                m80 m80Var2 = (m80) obj;
                synchronized (us0Var) {
                    if (m80Var2 != null) {
                        try {
                            m80Var2.b();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    us0Var.f20890j = null;
                    if (((Boolean) zzba.zzc().a(am.B9)).booleanValue()) {
                        ((nb0) m80Var2.f17340g.f17733a.f21703b).f17736d = us0Var.f20884d;
                    }
                    ((mp0) this.f18181b).f(m80Var2);
                    if (((Boolean) an.f12466c.o()).booleanValue() && (jw0Var2 = (jw0) this.f18182c) != null) {
                        jw0Var2.e(m80Var2.f17334a.f16196b);
                        jw0Var2.g(m80Var2.f17339f.f11954a);
                        fw0 fw0Var3 = (fw0) this.f18183d;
                        fw0Var3.zzd(true);
                        jw0Var2.a(fw0Var3);
                        jw0Var2.h();
                    } else {
                        kw0 kw0Var2 = us0Var.f20888h;
                        fw0 fw0Var4 = (fw0) this.f18183d;
                        fw0Var4.b(m80Var2.f17334a.f16196b);
                        fw0Var4.zzi(m80Var2.f17339f.f11954a);
                        fw0Var4.zzd(true);
                        kw0Var2.b(fw0Var4.zzm());
                    }
                    break;
                }
                return;
            case 5:
                rt0 rt0Var = (rt0) this.f18185f;
                ad0 ad0Var = (ad0) obj;
                synchronized (rt0Var) {
                    if (ad0Var != null) {
                        try {
                            ad0Var.b();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    rt0Var.f19665i = null;
                    ul ulVar = am.C9;
                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                        x11 x11Var = ad0Var.f17340g.f17733a;
                        hp0 hp0Var = rt0Var.f19660d;
                        nb0 nb0Var = (nb0) x11Var.f21703b;
                        nb0Var.f17734b = hp0Var;
                        nb0Var.f17737e = rt0Var.f19661e;
                    }
                    ((mp0) this.f18181b).f(ad0Var);
                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                        final int i10 = 1;
                        rt0Var.f19658b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.pt0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ o8 f18814b;

                            {
                                this.f18814b = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i10) {
                                    case 0:
                                        ((rt0) this.f18814b.f18185f).f19661e.zzg();
                                        break;
                                    default:
                                        ((rt0) this.f18814b.f18185f).f19660d.zzg();
                                        break;
                                }
                            }
                        });
                        final int i11 = 0;
                        rt0Var.f19658b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.pt0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ o8 f18814b;

                            {
                                this.f18814b = this;
                            }

                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                switch (i11) {
                                    case 0:
                                        ((rt0) this.f18814b.f18185f).f19661e.zzg();
                                        break;
                                    default:
                                        ((rt0) this.f18814b.f18185f).f19660d.zzg();
                                        break;
                                }
                            }
                        });
                    }
                    if (((Boolean) an.f12466c.o()).booleanValue() && (jw0Var3 = (jw0) this.f18182c) != null) {
                        jw0Var3.e(ad0Var.f17334a.f16196b);
                        jw0Var3.g(ad0Var.f17339f.f11954a);
                        fw0 fw0Var5 = (fw0) this.f18183d;
                        fw0Var5.zzd(true);
                        jw0Var3.a(fw0Var5);
                        jw0Var3.h();
                    } else {
                        kw0 kw0Var3 = rt0Var.f19663g;
                        fw0 fw0Var6 = (fw0) this.f18183d;
                        fw0Var6.b(ad0Var.f17334a.f16196b);
                        fw0Var6.zzi(ad0Var.f17339f.f11954a);
                        fw0Var6.zzd(true);
                        kw0Var3.b(fw0Var6.zzm());
                    }
                    break;
                }
                return;
            default:
                yt0 yt0Var = (yt0) this.f18185f;
                ug0 ug0Var = (ug0) obj;
                synchronized (yt0Var) {
                    if (ug0Var != null) {
                        try {
                            ug0Var.b();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    ((nb0) ug0Var.f17340g.f17733a.f21703b).f17737e = yt0Var.f22366d;
                    ((mp0) this.f18181b).f(ug0Var);
                    Executor executor = yt0Var.f22364b;
                    ut0 ut0Var = yt0Var.f22366d;
                    Objects.requireNonNull(ut0Var);
                    executor.execute(new x60(ut0Var, 26));
                    yt0Var.f22366d.onAdMetadataChanged();
                    if (((Boolean) an.f12466c.o()).booleanValue() && (jw0Var4 = (jw0) this.f18182c) != null) {
                        jw0Var4.e(ug0Var.f17334a.f16196b);
                        jw0Var4.g(ug0Var.f17339f.f11954a);
                        fw0 fw0Var7 = (fw0) this.f18183d;
                        fw0Var7.zzd(true);
                        jw0Var4.a(fw0Var7);
                        jw0Var4.h();
                    } else {
                        kw0 kw0Var4 = yt0Var.f22369g;
                        fw0 fw0Var8 = (fw0) this.f18183d;
                        fw0Var8.b(ug0Var.f17334a.f16196b);
                        fw0Var8.zzi(ug0Var.f17339f.f11954a);
                        fw0Var8.zzd(true);
                        kw0Var4.b(fw0Var8.zzm());
                    }
                    break;
                }
                return;
        }
    }

    public o8(j8 j8Var, HashMap map, HashMap map2, HashMap map3) {
        this.f18180a = 0;
        this.f18181b = j8Var;
        this.f18184e = map2;
        this.f18185f = map3;
        this.f18183d = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        j8Var.f(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.f18182c = jArr;
    }

    @Override // com.google.android.gms.internal.ads.yd1
    public void zza(Throwable th2) {
        jw0 jw0Var;
        zze zzeVarR;
        jw0 jw0Var2;
        jw0 jw0Var3;
        zze zzeVarR2;
        jw0 jw0Var4;
        switch (this.f18180a) {
            case 3:
                fw0 fw0Var = (fw0) this.f18183d;
                if (((Boolean) zzba.zzc().a(am.R6)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th2);
                }
                y40 y40Var = (y40) this.f18184e;
                zze zzeVarR3 = pi1.r(th2, ((v80) y40Var.f22116p.zzb()).l);
                ((ga0) y40Var.l.zzb()).j0(zzeVarR3);
                v90 v90Var = (v90) this.f18185f;
                ((a50) v90Var.f21137c).b().execute(new gm0(5, this, zzeVarR3));
                v71.g(zzeVarR3.zza, "NativeAdLoader.onFailure", th2);
                ((x11) this.f18181b).mo168zza();
                if (((Boolean) an.f12466c.o()).booleanValue() && (jw0Var = (jw0) this.f18182c) != null) {
                    jw0Var.f(zzeVarR3);
                    fw0Var.a(th2);
                    fw0Var.zzd(false);
                    jw0Var.a(fw0Var);
                    jw0Var.h();
                    return;
                }
                kw0 kw0Var = (kw0) v90Var.f21139e;
                fw0Var.c(zzeVarR3);
                fw0Var.a(th2);
                fw0Var.zzd(false);
                kw0Var.b(fw0Var.zzm());
                return;
            case 4:
                if (((Boolean) zzba.zzc().a(am.R6)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th2);
                }
                us0 us0Var = (us0) this.f18185f;
                k70 k70Var = (k70) us0Var.f20885e.zzd();
                if (k70Var == null) {
                    zzeVarR = pi1.r(th2, null);
                } else {
                    zzeVarR = pi1.r(th2, ((d50) k70Var).zza().l);
                }
                synchronized (us0Var) {
                    try {
                        us0Var.f20890j = null;
                        if (k70Var != null) {
                            ((ga0) ((d50) k70Var).f13412m.zzb()).j0(zzeVarR);
                            if (((Boolean) zzba.zzc().a(am.B9)).booleanValue()) {
                                us0Var.f20882b.execute(new gm0(6, this, zzeVarR));
                            }
                        } else {
                            us0Var.f20884d.j0(zzeVarR);
                            us0Var.b((rs0) this.f18184e).a().zza().f21107f.zzo();
                        }
                        v71.g(zzeVarR.zza, "AppOpenAdLoader.onFailure", th2);
                        ((mp0) this.f18181b).mo168zza();
                        if (((Boolean) an.f12466c.o()).booleanValue() && (jw0Var2 = (jw0) this.f18182c) != null) {
                            jw0Var2.f(zzeVarR);
                            fw0 fw0Var2 = (fw0) this.f18183d;
                            fw0Var2.a(th2);
                            fw0Var2.zzd(false);
                            jw0Var2.a(fw0Var2);
                            jw0Var2.h();
                        } else {
                            kw0 kw0Var2 = us0Var.f20888h;
                            fw0 fw0Var3 = (fw0) this.f18183d;
                            fw0Var3.c(zzeVarR);
                            fw0Var3.a(th2);
                            fw0Var3.zzd(false);
                            kw0Var2.b(fw0Var3.zzm());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case 5:
                if (((Boolean) zzba.zzc().a(am.R6)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th2);
                }
                i50 i50Var = (i50) this.f18184e;
                final zze zzeVarR4 = pi1.r(th2, ((v80) i50Var.f15589o.zzb()).l);
                rt0 rt0Var = (rt0) this.f18185f;
                synchronized (rt0Var) {
                    try {
                        rt0Var.f19665i = null;
                        ((ga0) i50Var.f15585j.zzb()).j0(zzeVarR4);
                        if (((Boolean) zzba.zzc().a(am.C9)).booleanValue()) {
                            final int i10 = 0;
                            rt0Var.f19658b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.qt0

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ o8 f19195b;

                                {
                                    this.f19195b = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i10) {
                                        case 0:
                                            ((rt0) this.f19195b.f18185f).f19660d.j0(zzeVarR4);
                                            break;
                                        default:
                                            ((rt0) this.f19195b.f18185f).f19661e.j0(zzeVarR4);
                                            break;
                                    }
                                }
                            });
                            final int i11 = 1;
                            rt0Var.f19658b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.qt0

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ o8 f19195b;

                                {
                                    this.f19195b = this;
                                }

                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    switch (i11) {
                                        case 0:
                                            ((rt0) this.f19195b.f18185f).f19660d.j0(zzeVarR4);
                                            break;
                                        default:
                                            ((rt0) this.f19195b.f18185f).f19661e.j0(zzeVarR4);
                                            break;
                                    }
                                }
                            });
                        }
                        v71.g(zzeVarR4.zza, "InterstitialAdLoader.onFailure", th2);
                        ((mp0) this.f18181b).mo168zza();
                        if (((Boolean) an.f12466c.o()).booleanValue() && (jw0Var3 = (jw0) this.f18182c) != null) {
                            jw0Var3.f(zzeVarR4);
                            fw0 fw0Var4 = (fw0) this.f18183d;
                            fw0Var4.a(th2);
                            fw0Var4.zzd(false);
                            jw0Var3.a(fw0Var4);
                            jw0Var3.h();
                        } else {
                            kw0 kw0Var3 = rt0Var.f19663g;
                            fw0 fw0Var5 = (fw0) this.f18183d;
                            fw0Var5.c(zzeVarR4);
                            fw0Var5.a(th2);
                            fw0Var5.zzd(false);
                            kw0Var3.b(fw0Var5.zzm());
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
            default:
                if (((Boolean) zzba.zzc().a(am.R6)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th2);
                }
                yt0 yt0Var = (yt0) this.f18185f;
                xg0 xg0Var = (xg0) yt0Var.f22367e.zzd();
                if (xg0Var == null) {
                    zzeVarR2 = pi1.r(th2, null);
                } else {
                    zzeVarR2 = pi1.r(th2, ((m50) xg0Var).zza().l);
                }
                synchronized (yt0Var) {
                    try {
                        if (xg0Var != null) {
                            ((ga0) ((m50) xg0Var).f17265o.zzb()).j0(zzeVarR2);
                            yt0Var.f22364b.execute(new gm0(8, this, zzeVarR2));
                        } else {
                            yt0Var.f22366d.j0(zzeVarR2);
                            yt0Var.b((wt0) this.f18184e).b().zza().f21107f.zzo();
                        }
                        v71.g(zzeVarR2.zza, "RewardedAdLoader.onFailure", th2);
                        ((mp0) this.f18181b).mo168zza();
                        if (((Boolean) an.f12466c.o()).booleanValue() && (jw0Var4 = (jw0) this.f18182c) != null) {
                            jw0Var4.f(zzeVarR2);
                            fw0 fw0Var6 = (fw0) this.f18183d;
                            fw0Var6.a(th2);
                            fw0Var6.zzd(false);
                            jw0Var4.a(fw0Var6);
                            jw0Var4.h();
                        } else {
                            kw0 kw0Var4 = yt0Var.f22369g;
                            fw0 fw0Var7 = (fw0) this.f18183d;
                            fw0Var7.c(zzeVarR2);
                            fw0Var7.a(th2);
                            fw0Var7.zzd(false);
                            kw0Var4.b(fw0Var7.zzm());
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                    break;
                }
                return;
        }
    }

    private final void c() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: zzc */
    public void mo169zzc() {
    }
}
