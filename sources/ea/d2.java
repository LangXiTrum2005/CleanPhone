package ea;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.X3;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2 f39346f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(p2 p2Var, u1 u1Var, int i10) {
        super(u1Var);
        this.f39345e = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(p2Var);
                this.f39346f = p2Var;
                super(u1Var);
                break;
            case 2:
                Objects.requireNonNull(p2Var);
                this.f39346f = p2Var;
                super(u1Var);
                break;
            case 3:
                this.f39346f = p2Var;
                super(u1Var);
                break;
            default:
                Objects.requireNonNull(p2Var);
                this.f39346f = p2Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:49:0x0155  */
    /* JADX WARN: Code duplicated, block: B:51:0x0166  */
    /* JADX WARN: Code duplicated, block: B:57:0x0182  */
    /* JADX WARN: Code duplicated, block: B:58:0x0185  */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:62:0x0192  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x0206  */
    /* JADX WARN: Code duplicated, block: B:75:0x0209  */
    /* JADX WARN: Code duplicated, block: B:76:0x020b  */
    /* JADX WARN: Code duplicated, block: B:81:0x029a A[Catch: IllegalArgumentException | MalformedURLException -> 0x02a1, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x02a1, blocks: (B:79:0x0252, B:81:0x029a, B:84:0x02a3, B:86:0x02a9, B:88:0x02b1, B:89:0x02b7, B:90:0x02bb), top: B:113:0x0252 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x02a9 A[Catch: IllegalArgumentException | MalformedURLException -> 0x02a1, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x02a1, blocks: (B:79:0x0252, B:81:0x029a, B:84:0x02a3, B:86:0x02a9, B:88:0x02b1, B:89:0x02b7, B:90:0x02bb), top: B:113:0x0252 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02b1 A[Catch: IllegalArgumentException | MalformedURLException -> 0x02a1, TryCatch #3 {IllegalArgumentException | MalformedURLException -> 0x02a1, blocks: (B:79:0x0252, B:81:0x029a, B:84:0x02a3, B:86:0x02a9, B:88:0x02b1, B:89:0x02b7, B:90:0x02bb), top: B:113:0x0252 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02d5  */
    @Override // ea.n
    public final void a() throws Throwable {
        boolean z10;
        Pair pair;
        NetworkInfo activeNetworkInfo;
        h3 h3VarK;
        m1 m1Var;
        g0 g0Var;
        i iVarT0;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i10;
        String str2;
        String string;
        m1 m1Var2;
        URL url;
        String strConcat;
        switch (this.f39345e) {
            case 0:
                p2 p2Var = ((m1) this.f39346f.f3623a).f39593m;
                m1.g(p2Var);
                new Thread(new c2(p2Var, 0)).start();
                break;
            case 1:
                this.f39346f.f1();
                break;
            case 2:
                this.f39346f.M0();
                break;
            default:
                p2 p2Var2 = this.f39346f;
                m1 m1Var3 = (m1) p2Var2.f3623a;
                a1 a1Var = m1Var3.f39586e;
                s0 s0Var = m1Var3.f39587f;
                j1 j1Var = m1Var3.f39588g;
                m1.h(j1Var);
                j1Var.G0();
                s2 s2Var = m1Var3.f39595o;
                m1.h(s2Var);
                m1 m1Var4 = (m1) s2Var.f3623a;
                m1.h(s2Var);
                String strM0 = m1Var3.m().M0();
                Boolean boolT0 = m1Var3.f39585d.T0("google_analytics_adid_collection_enabled");
                boolean z11 = false;
                if (boolT0 == null || boolT0.booleanValue()) {
                    m1.f(a1Var);
                    m1 m1Var5 = (m1) a1Var.f3623a;
                    a1Var.G0();
                    if (a1Var.N0().i(x1.AD_STORAGE)) {
                        m1Var5.f39592k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = a1Var.f39209h;
                        z10 = true;
                        if (str3 == null || jElapsedRealtime >= a1Var.f39211j) {
                            a1Var.f39211j = m1Var5.f39585d.O0(strM0, d0.f39290b) + jElapsedRealtime;
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                            try {
                                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(m1Var5.f39582a);
                                a1Var.f39209h = "";
                                String id2 = advertisingIdInfo.getId();
                                if (id2 != null) {
                                    a1Var.f39209h = id2;
                                }
                                a1Var.f39210i = advertisingIdInfo.isLimitAdTrackingEnabled();
                            } catch (Exception e10) {
                                s0 s0Var2 = m1Var5.f39587f;
                                m1.h(s0Var2);
                                s0Var2.f39759m.c(e10, "Unable to get advertising id");
                                a1Var.f39209h = "";
                            }
                            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                            pair = new Pair(a1Var.f39209h, Boolean.valueOf(a1Var.f39210i));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(a1Var.f39210i));
                        }
                    } else {
                        z10 = true;
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        m1.h(s2Var);
                        s2Var.I0();
                        ConnectivityManager connectivityManager = (ConnectivityManager) m1Var4.f39582a.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb2 = new StringBuilder();
                            h3 h3VarK2 = m1Var3.k();
                            h3VarK2.G0();
                            h3VarK2.H0();
                            if (!h3VarK2.N0()) {
                                p2 p2Var3 = m1Var3.f39593m;
                                m1.g(p2Var3);
                                m1 m1Var6 = (m1) p2Var3.f3623a;
                                p2Var3.G0();
                                h3VarK = m1Var6.k();
                                m1Var = (m1) h3VarK.f3623a;
                                h3VarK.G0();
                                h3VarK.H0();
                                g0Var = h3VarK.f39458d;
                                if (g0Var == null) {
                                    h3VarK.M0();
                                    s0 s0Var3 = m1Var.f39587f;
                                    m1.h(s0Var3);
                                    s0Var3.f39759m.b("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        iVarT0 = g0Var.T0(h3VarK.W0(false));
                                        h3VarK.T0();
                                    } catch (RemoteException e11) {
                                        s0 s0Var4 = m1Var.f39587f;
                                        m1.h(s0Var4);
                                        s0Var4.f39753f.c(e11, "Failed to get consents; remote exception");
                                        iVarT0 = null;
                                    }
                                    if (iVarT0 != null) {
                                        bundle = iVarT0.f39467a;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i10 = m1Var3.B;
                                        m1Var3.B = i10 + 1;
                                        z11 = i10 < 10 ? z10 : false;
                                        m1.h(s0Var);
                                        bo.b bVar = s0Var.f39759m;
                                        StringBuilder sb3 = new StringBuilder(69);
                                        sb3.append("Failed to retrieve DMA consent from the service, ");
                                        if (i10 < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        bVar.c(Integer.valueOf(m1Var3.B), defpackage.e.q(str2, " retryCount", sb3));
                                    } else {
                                        y1 y1VarB = y1.b(100, bundle);
                                        sb2.append("&gcs=");
                                        sb2.append(y1VarB.f());
                                        o oVarC = o.c(100, bundle);
                                        str = oVarC.f39657d;
                                        sb2.append("&dma=");
                                        Boolean bool2 = oVarC.f39656c;
                                        bool = Boolean.FALSE;
                                        sb2.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb2.append("&dma_cps=");
                                            sb2.append(str);
                                        }
                                        iOrdinal = y1.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i11 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb2.append("&npa=");
                                        sb2.append(i11);
                                        m1.h(s0Var);
                                        s0Var.f39760n.c(sb2, "Consent query parameters to Bow");
                                        l4 l4Var = m1Var3.f39590i;
                                        m1.f(l4Var);
                                        ((m1) m1Var3.m().f3623a).f39585d.M0();
                                        String str4 = (String) pair.first;
                                        long jE = a1Var.f39221u.e() - 1;
                                        string = sb2.toString();
                                        m1Var2 = (m1) l4Var.f3623a;
                                        try {
                                            k9.c0.e(str4);
                                            k9.c0.e(strM0);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + l4Var.q1()) + "&rdid=" + str4 + "&bundleid=" + strM0 + "&retry=" + jE;
                                            if (strM0.equals(m1Var2.f39585d.K0("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat(X3.j.f27832c);
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException | MalformedURLException e12) {
                                            s0 s0Var5 = m1Var2.f39587f;
                                            m1.h(s0Var5);
                                            s0Var5.f39753f.c(e12.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            m1.h(s2Var);
                                            l1 l1Var = new l1(m1Var3);
                                            s2Var.I0();
                                            j1 j1Var2 = m1Var4.f39588g;
                                            m1.h(j1Var2);
                                            j1Var2.S0(new u0(s2Var, strM0, url, (byte[]) null, (HashMap) null, l1Var));
                                        }
                                    }
                                }
                                iVarT0 = null;
                                if (iVarT0 != null) {
                                    bundle = iVarT0.f39467a;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i10 = m1Var3.B;
                                    m1Var3.B = i10 + 1;
                                    if (i10 < 10) {
                                    }
                                    m1.h(s0Var);
                                    bo.b bVar2 = s0Var.f39759m;
                                    StringBuilder sb4 = new StringBuilder(69);
                                    sb4.append("Failed to retrieve DMA consent from the service, ");
                                    if (i10 < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    bVar2.c(Integer.valueOf(m1Var3.B), defpackage.e.q(str2, " retryCount", sb4));
                                } else {
                                    y1 y1VarB2 = y1.b(100, bundle);
                                    sb2.append("&gcs=");
                                    sb2.append(y1VarB2.f());
                                    o oVarC2 = o.c(100, bundle);
                                    str = oVarC2.f39657d;
                                    sb2.append("&dma=");
                                    Boolean bool3 = oVarC2.f39656c;
                                    bool = Boolean.FALSE;
                                    sb2.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb2.append("&dma_cps=");
                                        sb2.append(str);
                                    }
                                    iOrdinal = y1.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i12 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb2.append("&npa=");
                                    sb2.append(i12);
                                    m1.h(s0Var);
                                    s0Var.f39760n.c(sb2, "Consent query parameters to Bow");
                                    l4 l4Var2 = m1Var3.f39590i;
                                    m1.f(l4Var2);
                                    ((m1) m1Var3.m().f3623a).f39585d.M0();
                                    String str5 = (String) pair.first;
                                    long jE2 = a1Var.f39221u.e() - 1;
                                    string = sb2.toString();
                                    m1Var2 = (m1) l4Var2.f3623a;
                                    k9.c0.e(str5);
                                    k9.c0.e(strM0);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + l4Var2.q1()) + "&rdid=" + str5 + "&bundleid=" + strM0 + "&retry=" + jE2;
                                    if (strM0.equals(m1Var2.f39585d.K0("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat(X3.j.f27832c);
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        m1.h(s2Var);
                                        l1 l1Var2 = new l1(m1Var3);
                                        s2Var.I0();
                                        j1 j1Var3 = m1Var4.f39588g;
                                        m1.h(j1Var3);
                                        j1Var3.S0(new u0(s2Var, strM0, url, (byte[]) null, (HashMap) null, l1Var2));
                                    }
                                }
                                break;
                            } else {
                                l4 l4Var3 = ((m1) h3VarK2.f3623a).f39590i;
                                m1.f(l4Var3);
                                if (l4Var3.q1() >= 234200) {
                                    p2 p2Var4 = m1Var3.f39593m;
                                    m1.g(p2Var4);
                                    m1 m1Var7 = (m1) p2Var4.f3623a;
                                    p2Var4.G0();
                                    h3VarK = m1Var7.k();
                                    m1Var = (m1) h3VarK.f3623a;
                                    h3VarK.G0();
                                    h3VarK.H0();
                                    g0Var = h3VarK.f39458d;
                                    if (g0Var == null) {
                                        h3VarK.M0();
                                        s0 s0Var6 = m1Var.f39587f;
                                        m1.h(s0Var6);
                                        s0Var6.f39759m.b("Failed to get consents; not connected to service yet.");
                                    } else {
                                        iVarT0 = g0Var.T0(h3VarK.W0(false));
                                        h3VarK.T0();
                                        if (iVarT0 != null) {
                                            bundle = iVarT0.f39467a;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i10 = m1Var3.B;
                                            m1Var3.B = i10 + 1;
                                            if (i10 < 10) {
                                            }
                                            m1.h(s0Var);
                                            bo.b bVar3 = s0Var.f39759m;
                                            StringBuilder sb5 = new StringBuilder(69);
                                            sb5.append("Failed to retrieve DMA consent from the service, ");
                                            if (i10 < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            bVar3.c(Integer.valueOf(m1Var3.B), defpackage.e.q(str2, " retryCount", sb5));
                                        } else {
                                            y1 y1VarB3 = y1.b(100, bundle);
                                            sb2.append("&gcs=");
                                            sb2.append(y1VarB3.f());
                                            o oVarC3 = o.c(100, bundle);
                                            str = oVarC3.f39657d;
                                            sb2.append("&dma=");
                                            Boolean bool4 = oVarC3.f39656c;
                                            bool = Boolean.FALSE;
                                            sb2.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb2.append("&dma_cps=");
                                                sb2.append(str);
                                            }
                                            iOrdinal = y1.d(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i13 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb2.append("&npa=");
                                            sb2.append(i13);
                                            m1.h(s0Var);
                                            s0Var.f39760n.c(sb2, "Consent query parameters to Bow");
                                            l4 l4Var4 = m1Var3.f39590i;
                                            m1.f(l4Var4);
                                            ((m1) m1Var3.m().f3623a).f39585d.M0();
                                            String str6 = (String) pair.first;
                                            long jE3 = a1Var.f39221u.e() - 1;
                                            string = sb2.toString();
                                            m1Var2 = (m1) l4Var4.f3623a;
                                            k9.c0.e(str6);
                                            k9.c0.e(strM0);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + l4Var4.q1()) + "&rdid=" + str6 + "&bundleid=" + strM0 + "&retry=" + jE3;
                                            if (strM0.equals(m1Var2.f39585d.K0("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat(X3.j.f27832c);
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                m1.h(s2Var);
                                                l1 l1Var3 = new l1(m1Var3);
                                                s2Var.I0();
                                                j1 j1Var4 = m1Var4.f39588g;
                                                m1.h(j1Var4);
                                                j1Var4.S0(new u0(s2Var, strM0, url, (byte[]) null, (HashMap) null, l1Var3));
                                            }
                                        }
                                    }
                                    iVarT0 = null;
                                    if (iVarT0 != null) {
                                        bundle = iVarT0.f39467a;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i10 = m1Var3.B;
                                        m1Var3.B = i10 + 1;
                                        if (i10 < 10) {
                                        }
                                        m1.h(s0Var);
                                        bo.b bVar4 = s0Var.f39759m;
                                        StringBuilder sb6 = new StringBuilder(69);
                                        sb6.append("Failed to retrieve DMA consent from the service, ");
                                        if (i10 < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        bVar4.c(Integer.valueOf(m1Var3.B), defpackage.e.q(str2, " retryCount", sb6));
                                    } else {
                                        y1 y1VarB4 = y1.b(100, bundle);
                                        sb2.append("&gcs=");
                                        sb2.append(y1VarB4.f());
                                        o oVarC4 = o.c(100, bundle);
                                        str = oVarC4.f39657d;
                                        sb2.append("&dma=");
                                        Boolean bool5 = oVarC4.f39656c;
                                        bool = Boolean.FALSE;
                                        sb2.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb2.append("&dma_cps=");
                                            sb2.append(str);
                                        }
                                        iOrdinal = y1.d(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i14 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb2.append("&npa=");
                                        sb2.append(i14);
                                        m1.h(s0Var);
                                        s0Var.f39760n.c(sb2, "Consent query parameters to Bow");
                                        l4 l4Var5 = m1Var3.f39590i;
                                        m1.f(l4Var5);
                                        ((m1) m1Var3.m().f3623a).f39585d.M0();
                                        String str7 = (String) pair.first;
                                        long jE4 = a1Var.f39221u.e() - 1;
                                        string = sb2.toString();
                                        m1Var2 = (m1) l4Var5.f3623a;
                                        k9.c0.e(str7);
                                        k9.c0.e(strM0);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + l4Var5.q1()) + "&rdid=" + str7 + "&bundleid=" + strM0 + "&retry=" + jE4;
                                        if (strM0.equals(m1Var2.f39585d.K0("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat(X3.j.f27832c);
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            m1.h(s2Var);
                                            l1 l1Var4 = new l1(m1Var3);
                                            s2Var.I0();
                                            j1 j1Var5 = m1Var4.f39588g;
                                            m1.h(j1Var5);
                                            j1Var5.S0(new u0(s2Var, strM0, url, (byte[]) null, (HashMap) null, l1Var4));
                                        }
                                    }
                                } else {
                                    l4 l4Var6 = m1Var3.f39590i;
                                    m1.f(l4Var6);
                                    ((m1) m1Var3.m().f3623a).f39585d.M0();
                                    String str8 = (String) pair.first;
                                    long jE5 = a1Var.f39221u.e() - 1;
                                    string = sb2.toString();
                                    m1Var2 = (m1) l4Var6.f3623a;
                                    k9.c0.e(str8);
                                    k9.c0.e(strM0);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + l4Var6.q1()) + "&rdid=" + str8 + "&bundleid=" + strM0 + "&retry=" + jE5;
                                    if (strM0.equals(m1Var2.f39585d.K0("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat(X3.j.f27832c);
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        m1.h(s2Var);
                                        l1 l1Var5 = new l1(m1Var3);
                                        s2Var.I0();
                                        j1 j1Var6 = m1Var4.f39588g;
                                        m1.h(j1Var6);
                                        j1Var6.S0(new u0(s2Var, strM0, url, (byte[]) null, (HashMap) null, l1Var5));
                                    }
                                }
                            }
                        } else {
                            m1.h(s0Var);
                            s0Var.f39756i.b("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        m1.h(s0Var);
                        s0Var.f39760n.b("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    m1.h(s0Var);
                    s0Var.f39760n.b("ADID collection is disabled from Manifest. Skipping");
                }
                if (z11) {
                    p2Var2.f39700s.b(2000L);
                }
                break;
        }
    }
}
