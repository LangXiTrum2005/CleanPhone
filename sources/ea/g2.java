package ea;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.ads.q21;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39421a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f39424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f39425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f39426f;

    public g2(AppMeasurementDynamiteService appMeasurementDynamiteService, a7 a7Var, String str, String str2, boolean z10) {
        this.f39425e = a7Var;
        this.f39422b = str;
        this.f39423c = str2;
        this.f39424d = z10;
        this.f39426f = appMeasurementDynamiteService;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0109 A[Catch: RuntimeException -> 0x00e5, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x0109, B:55:0x0114, B:58:0x0121, B:60:0x0127, B:62:0x0141, B:64:0x014a, B:66:0x0150, B:69:0x0169, B:71:0x0178, B:70:0x0170, B:72:0x018b, B:74:0x0191, B:76:0x0197, B:78:0x019d, B:80:0x01a3, B:82:0x01ab, B:84:0x01b3, B:86:0x01b9, B:87:0x01cb, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:99:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0114 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x0109, B:55:0x0114, B:58:0x0121, B:60:0x0127, B:62:0x0141, B:64:0x014a, B:66:0x0150, B:69:0x0169, B:71:0x0178, B:70:0x0170, B:72:0x018b, B:74:0x0191, B:76:0x0197, B:78:0x019d, B:80:0x01a3, B:82:0x01ab, B:84:0x01b3, B:86:0x01b9, B:87:0x01cb, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:99:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0148  */
    /* JADX WARN: Code duplicated, block: B:66:0x0150 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x0109, B:55:0x0114, B:58:0x0121, B:60:0x0127, B:62:0x0141, B:64:0x014a, B:66:0x0150, B:69:0x0169, B:71:0x0178, B:70:0x0170, B:72:0x018b, B:74:0x0191, B:76:0x0197, B:78:0x019d, B:80:0x01a3, B:82:0x01ab, B:84:0x01b3, B:86:0x01b9, B:87:0x01cb, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:99:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0169 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x0109, B:55:0x0114, B:58:0x0121, B:60:0x0127, B:62:0x0141, B:64:0x014a, B:66:0x0150, B:69:0x0169, B:71:0x0178, B:70:0x0170, B:72:0x018b, B:74:0x0191, B:76:0x0197, B:78:0x019d, B:80:0x01a3, B:82:0x01ab, B:84:0x01b3, B:86:0x01b9, B:87:0x01cb, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:99:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0170 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x0109, B:55:0x0114, B:58:0x0121, B:60:0x0127, B:62:0x0141, B:64:0x014a, B:66:0x0150, B:69:0x0169, B:71:0x0178, B:70:0x0170, B:72:0x018b, B:74:0x0191, B:76:0x0197, B:78:0x019d, B:80:0x01a3, B:82:0x01ab, B:84:0x01b3, B:86:0x01b9, B:87:0x01cb, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:99:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x018b A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x0109, B:55:0x0114, B:58:0x0121, B:60:0x0127, B:62:0x0141, B:64:0x014a, B:66:0x0150, B:69:0x0169, B:71:0x0178, B:70:0x0170, B:72:0x018b, B:74:0x0191, B:76:0x0197, B:78:0x019d, B:80:0x01a3, B:82:0x01ab, B:84:0x01b3, B:86:0x01b9, B:87:0x01cb, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:99:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0191 A[Catch: RuntimeException -> 0x00e5, TryCatch #0 {RuntimeException -> 0x00e5, blocks: (B:53:0x0109, B:55:0x0114, B:58:0x0121, B:60:0x0127, B:62:0x0141, B:64:0x014a, B:66:0x0150, B:69:0x0169, B:71:0x0178, B:70:0x0170, B:72:0x018b, B:74:0x0191, B:76:0x0197, B:78:0x019d, B:80:0x01a3, B:82:0x01ab, B:84:0x01b3, B:86:0x01b9, B:87:0x01cb, B:26:0x0094, B:28:0x009a, B:30:0x00a4, B:32:0x00aa, B:34:0x00b0, B:36:0x00b6, B:38:0x00be, B:40:0x00c6, B:42:0x00ce, B:44:0x00d6, B:48:0x00ec, B:50:0x00fa), top: B:99:0x0094 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        s0 s0Var;
        Bundle bundleG1;
        String str;
        s0 s0Var2;
        bo.b bVar;
        Bundle bundleG2;
        switch (this.f39421a) {
            case 0:
                h3 h3VarK = ((AppMeasurementDynamiteService) this.f39426f).f24515a.k();
                a7 a7Var = (a7) this.f39425e;
                String str2 = (String) this.f39422b;
                String str3 = (String) this.f39423c;
                h3VarK.G0();
                h3VarK.H0();
                h3VarK.U0(new q21(h3VarK, str2, str3, h3VarK.W0(false), this.f39424d, a7Var));
                break;
            case 1:
                String str4 = (String) this.f39422b;
                String str5 = (String) this.f39423c;
                h3 h3VarK2 = ((m1) ((p2) this.f39426f).f3623a).k();
                AtomicReference atomicReference = (AtomicReference) this.f39425e;
                h3VarK2.G0();
                h3VarK2.H0();
                h3VarK2.U0(new q21(h3VarK2, atomicReference, str4, str5, h3VarK2.W0(false), this.f39424d));
                break;
            case 2:
                m2 m2Var = (m2) this.f39426f;
                p2 p2Var = (p2) m2Var.f39608b;
                p2Var.G0();
                m1 m1Var = (m1) p2Var.f3623a;
                l1 l1Var = p2Var.f39698q;
                String str6 = (String) this.f39423c;
                Uri uri = (Uri) this.f39425e;
                try {
                    l4 l4Var = m1Var.f39590i;
                    s0 s0Var3 = m1Var.f39587f;
                    m1.f(l4Var);
                    try {
                        String str7 = "Activity created with data 'referrer' without required params";
                        if (TextUtils.isEmpty(str6)) {
                            s0Var = s0Var3;
                        } else {
                            try {
                                if (!str6.contains("gclid")) {
                                    s0Var = s0Var3;
                                    if (!str6.contains("gbraid") && !str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_id") && !str6.contains("dclid") && !str6.contains("srsltid") && !str6.contains("sfmc_id")) {
                                        s0 s0Var4 = ((m1) l4Var.f3623a).f39587f;
                                        m1.h(s0Var4);
                                        s0Var4.f39759m.b("Activity created with data 'referrer' without required params");
                                    }
                                    str = (String) this.f39422b;
                                    if (this.f39424d) {
                                        l4 l4Var2 = m1Var.f39590i;
                                        m1.f(l4Var2);
                                        bundleG2 = l4Var2.G1(uri);
                                        if (bundleG2 != null) {
                                            bundleG2.putString("_cis", "intent");
                                            if (bundleG2.containsKey("gclid") && bundleG1 != null && bundleG1.containsKey("gclid")) {
                                                bundleG2.putString("_cer", "gclid=" + bundleG1.getString("gclid"));
                                            }
                                            p2Var.N0(str, bundleG2, "_cmp");
                                            l1Var.a(bundleG2, str);
                                        } else {
                                            str7 = "Activity created with data 'referrer' without required params";
                                        }
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        m1.h(s0Var);
                                        s0Var2 = s0Var;
                                        bVar = s0Var2.f39759m;
                                        bVar.c(str6, "Activity created with referrer");
                                        if (m1Var.f39585d.R0(null, d0.G0)) {
                                            if (bundleG1 != null) {
                                                p2Var.N0(str, bundleG1, "_cmp");
                                                l1Var.a(bundleG1, str);
                                            } else {
                                                m1.h(s0Var2);
                                                bVar.c(str6, "Referrer does not contain valid parameters");
                                            }
                                            m1Var.f39592k.getClass();
                                            p2Var.Q0("auto", "_ldl", null, true, System.currentTimeMillis());
                                        } else if (str6.contains("gclid") || (!str6.contains("utm_campaign") && !str6.contains("utm_source") && !str6.contains("utm_medium") && !str6.contains("utm_term") && !str6.contains("utm_content"))) {
                                            m1.h(s0Var2);
                                            bVar.b(str7);
                                        } else if (!TextUtils.isEmpty(str6)) {
                                            m1Var.f39592k.getClass();
                                            p2Var.Q0("auto", "_ldl", str6, true, System.currentTimeMillis());
                                        }
                                    }
                                } else {
                                    s0Var = s0Var3;
                                }
                                bundleG1 = l4Var.G1(Uri.parse("https://google.com/search?".concat(str6)));
                                if (bundleG1 != null) {
                                    bundleG1.putString("_cis", Constants.REFERRER);
                                }
                                str = (String) this.f39422b;
                                if (this.f39424d) {
                                    l4 l4Var3 = m1Var.f39590i;
                                    m1.f(l4Var3);
                                    bundleG2 = l4Var3.G1(uri);
                                    if (bundleG2 != null) {
                                        bundleG2.putString("_cis", "intent");
                                        if (bundleG2.containsKey("gclid")) {
                                        }
                                        p2Var.N0(str, bundleG2, "_cmp");
                                        l1Var.a(bundleG2, str);
                                    } else {
                                        str7 = "Activity created with data 'referrer' without required params";
                                    }
                                } else {
                                    str7 = "Activity created with data 'referrer' without required params";
                                }
                                if (!TextUtils.isEmpty(str6)) {
                                    m1.h(s0Var);
                                    s0Var2 = s0Var;
                                    bVar = s0Var2.f39759m;
                                    bVar.c(str6, "Activity created with referrer");
                                    if (m1Var.f39585d.R0(null, d0.G0)) {
                                        if (str6.contains("gclid")) {
                                        }
                                        m1.h(s0Var2);
                                        bVar.b(str7);
                                    } else {
                                        if (bundleG1 != null) {
                                            p2Var.N0(str, bundleG1, "_cmp");
                                            l1Var.a(bundleG1, str);
                                        } else {
                                            m1.h(s0Var2);
                                            bVar.c(str6, "Referrer does not contain valid parameters");
                                        }
                                        m1Var.f39592k.getClass();
                                        p2Var.Q0("auto", "_ldl", null, true, System.currentTimeMillis());
                                    }
                                }
                            } catch (RuntimeException e10) {
                                e = e10;
                                m2Var = m2Var;
                                s0 s0Var5 = ((m1) ((p2) m2Var.f39608b).f3623a).f39587f;
                                m1.h(s0Var5);
                                s0Var5.f39753f.c(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                return;
                            }
                        }
                        bundleG1 = null;
                        str = (String) this.f39422b;
                        if (this.f39424d) {
                            l4 l4Var4 = m1Var.f39590i;
                            m1.f(l4Var4);
                            bundleG2 = l4Var4.G1(uri);
                            if (bundleG2 != null) {
                                bundleG2.putString("_cis", "intent");
                                if (bundleG2.containsKey("gclid")) {
                                }
                                p2Var.N0(str, bundleG2, "_cmp");
                                l1Var.a(bundleG2, str);
                            } else {
                                str7 = "Activity created with data 'referrer' without required params";
                            }
                        } else {
                            str7 = "Activity created with data 'referrer' without required params";
                        }
                        if (!TextUtils.isEmpty(str6)) {
                            m1.h(s0Var);
                            s0Var2 = s0Var;
                            bVar = s0Var2.f39759m;
                            bVar.c(str6, "Activity created with referrer");
                            if (m1Var.f39585d.R0(null, d0.G0)) {
                                if (str6.contains("gclid")) {
                                }
                                m1.h(s0Var2);
                                bVar.b(str7);
                            } else {
                                if (bundleG1 != null) {
                                    p2Var.N0(str, bundleG1, "_cmp");
                                    l1Var.a(bundleG1, str);
                                } else {
                                    m1.h(s0Var2);
                                    bVar.c(str6, "Referrer does not contain valid parameters");
                                }
                                m1Var.f39592k.getClass();
                                p2Var.Q0("auto", "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } catch (RuntimeException e11) {
                        e = e11;
                        s0 s0Var6 = ((m1) ((p2) m2Var.f39608b).f3623a).f39587f;
                        m1.h(s0Var6);
                        s0Var6.f39753f.c(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e12) {
                    e = e12;
                }
                break;
            default:
                n4 n4Var = (n4) this.f39425e;
                h3 h3Var = (h3) this.f39426f;
                g0 g0Var = h3Var.f39458d;
                m1 m1Var2 = (m1) h3Var.f3623a;
                if (g0Var == null) {
                    s0 s0Var7 = m1Var2.f39587f;
                    m1.h(s0Var7);
                    s0Var7.f39753f.b("Failed to send default event parameters to service");
                } else if (m1Var2.f39585d.R0(null, d0.W0)) {
                    h3Var.Y0(g0Var, this.f39424d ? null : (t) this.f39422b, n4Var);
                } else {
                    try {
                        g0Var.h1((Bundle) this.f39423c, n4Var);
                        h3Var.T0();
                    } catch (RemoteException e13) {
                        s0 s0Var8 = m1Var2.f39587f;
                        m1.h(s0Var8);
                        s0Var8.f39753f.c(e13, "Failed to send default event parameters to service");
                    }
                }
                break;
        }
    }

    public g2(m2 m2Var, boolean z10, Uri uri, String str, String str2) {
        this.f39424d = z10;
        this.f39425e = uri;
        this.f39422b = str;
        this.f39423c = str2;
        this.f39426f = m2Var;
    }

    public g2(p2 p2Var, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f39425e = atomicReference;
        this.f39422b = str;
        this.f39423c = str2;
        this.f39424d = z10;
        Objects.requireNonNull(p2Var);
        this.f39426f = p2Var;
    }

    public g2(h3 h3Var, n4 n4Var, boolean z10, t tVar, Bundle bundle) {
        this.f39425e = n4Var;
        this.f39424d = z10;
        this.f39422b = tVar;
        this.f39423c = bundle;
        Objects.requireNonNull(h3Var);
        this.f39426f = h3Var;
    }
}
