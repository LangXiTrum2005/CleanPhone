package ea;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.ext.SdkExtensions;
import com.google.android.gms.internal.measurement.v4;
import com.unity3d.services.core.fid.Constants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f39534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f39537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f39538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f39540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f39541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f39542k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f39543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f39545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f39546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f39547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f39548r;

    public l0(m1 m1Var, long j10, long j11, String str) {
        super(m1Var);
        this.f39547q = 0L;
        this.f39548r = null;
        this.f39540i = j10;
        this.f39541j = j11;
        this.f39543m = str;
    }

    @Override // ea.f0
    public final boolean J0() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0270 A[Catch: NameNotFoundException -> 0x0278, TRY_LEAVE, TryCatch #2 {NameNotFoundException -> 0x0278, blocks: (B:98:0x026a, B:100:0x0270), top: B:129:0x026a }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0273 A[PHI: r5 r37
  0x0273: PHI (r5v13 int) = (r5v12 int), (r5v14 int) binds: [B:104:0x0278, B:99:0x026e] A[DONT_GENERATE, DONT_INLINE]
  0x0273: PHI (r37v2 long) = (r37v1 long), (r37v4 long) binds: [B:104:0x0278, B:99:0x026e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:110:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:119:0x030f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01de  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:77:0x0207  */
    /* JADX WARN: Code duplicated, block: B:78:0x020a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0231  */
    /* JADX WARN: Code duplicated, block: B:91:0x023e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0240  */
    /* JADX WARN: Code duplicated, block: B:95:0x025b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final n4 K0(String str) {
        String str2;
        long j10;
        boolean z10;
        long j11;
        boolean zA;
        boolean z11;
        boolean z12;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jMin;
        long jE;
        Boolean boolT0;
        boolean z13;
        boolean z14;
        boolean z15;
        String str4;
        Boolean boolT1;
        boolean zBooleanValue;
        m1 m1Var;
        String strM0;
        long j12;
        int i10;
        int i11;
        long j13;
        ApplicationInfo applicationInfoD;
        int i12;
        c0 c0Var;
        int i13;
        long jC1;
        G0();
        String strM1 = M0();
        String strN0 = N0();
        H0();
        String str5 = this.f39535d;
        H0();
        long j14 = this.f39536e;
        H0();
        k9.c0.h(this.f39537f);
        String str6 = this.f39537f;
        m1 m1Var2 = (m1) this.f3623a;
        g gVar = m1Var2.f39585d;
        s0 s0Var = m1Var2.f39587f;
        g gVar2 = m1Var2.f39585d;
        Context context = m1Var2.f39582a;
        l4 l4Var = m1Var2.f39590i;
        a1 a1Var = m1Var2.f39586e;
        gVar.M0();
        H0();
        G0();
        long j15 = this.f39539h;
        if (j15 == 0) {
            m1.f(l4Var);
            m1 m1Var3 = (m1) l4Var.f3623a;
            String packageName = context.getPackageName();
            l4Var.G0();
            k9.c0.e(packageName);
            PackageManager packageManager = context.getPackageManager();
            z10 = false;
            MessageDigest messageDigestZ0 = l4.Z0();
            long jA1 = -1;
            if (messageDigestZ0 == null) {
                s0 s0Var2 = m1Var3.f39587f;
                m1.h(s0Var2);
                s0Var2.f39753f.b("Could not get MD5 instance");
                str2 = str5;
                j10 = j14;
            } else {
                if (packageManager != null) {
                    try {
                        if (l4Var.n1(context, packageName)) {
                            str2 = str5;
                            j10 = j14;
                            jA1 = 0;
                        } else {
                            str2 = str5;
                            try {
                                j10 = j14;
                                try {
                                    Signature[] signatureArr = r9.c.a(context).f(64, m1Var3.f39582a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        s0 s0Var3 = m1Var3.f39587f;
                                        m1.h(s0Var3);
                                        s0Var3.f39756i.b("Could not get signatures");
                                    } else {
                                        jA1 = l4.a1(messageDigestZ0.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e10) {
                                    e = e10;
                                    s0 s0Var4 = m1Var3.f39587f;
                                    m1.h(s0Var4);
                                    s0Var4.f39753f.c(e, "Package name not found");
                                    j11 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e11) {
                                e = e11;
                                j10 = j14;
                                s0 s0Var5 = m1Var3.f39587f;
                                m1.h(s0Var5);
                                s0Var5.f39753f.c(e, "Package name not found");
                                j11 = 0;
                                this.f39539h = j11;
                                zA = m1Var2.a();
                                m1.f(a1Var);
                                z11 = !a1Var.f39218r;
                                G0();
                                if (m1Var2.a()) {
                                    if (gVar2.R0(null, d0.H0)) {
                                        m1.h(s0Var);
                                        s0Var.f39760n.b("Disabled IID for tests.");
                                        z12 = zA;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass(Constants.FID_CLASS);
                                            if (clsLoadClass == null) {
                                                z12 = zA;
                                            } else {
                                                z12 = zA;
                                                try {
                                                    Object[] objArr = {context};
                                                    str3 = null;
                                                    objInvoke = clsLoadClass.getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            m1.h(s0Var);
                                                            s0Var.f39758k.b("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    m1.h(s0Var);
                                                    s0Var.f39757j.b("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z12 = zA;
                                    str3 = null;
                                }
                                jMin = m1Var2.D;
                                m1.f(a1Var);
                                long j16 = j11;
                                jE = a1Var.f39207f.e();
                                if (jE != 0) {
                                    jMin = Math.min(jMin, jE);
                                }
                                H0();
                                int i14 = this.f39544n;
                                boolT0 = gVar2.T0("google_analytics_adid_collection_enabled");
                                if (boolT0 != null) {
                                    z13 = true;
                                } else {
                                    z13 = true;
                                }
                                m1.f(a1Var);
                                a1Var.G0();
                                boolean z16 = z13;
                                boolean z17 = a1Var.K0().getBoolean("deferred_analytics_collection", z10);
                                if (gVar2.W0("google_analytics_default_allow_ad_personalization_signals", true) != v1.GRANTED) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z14);
                                List list = this.f39542k;
                                String strG = a1Var.N0().g();
                                if (this.l == null) {
                                    m1.f(l4Var);
                                    this.l = l4Var.C1();
                                }
                                String str7 = this.l;
                                if (a1Var.N0().i(x1.ANALYTICS_STORAGE)) {
                                    G0();
                                    if (this.f39547q == 0) {
                                        z15 = z11;
                                    } else {
                                        m1Var2.f39592k.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.f39547q;
                                        z15 = z11;
                                        if (this.f39546p != null) {
                                            L0();
                                        }
                                    }
                                    if (this.f39546p == null) {
                                        L0();
                                    }
                                    str4 = this.f39546p;
                                } else {
                                    z15 = z11;
                                    str4 = null;
                                }
                                boolT1 = gVar2.T0("google_analytics_sgtm_upload_enabled");
                                if (boolT1 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolT1.booleanValue();
                                }
                                m1.f(l4Var);
                                m1Var = (m1) l4Var.f3623a;
                                String str8 = str4;
                                strM0 = M0();
                                boolean z18 = zBooleanValue;
                                if (m1Var.f39582a.getPackageManager() == null) {
                                    j12 = jMin;
                                    j13 = 0;
                                } else {
                                    try {
                                        j12 = jMin;
                                        i10 = 0;
                                        try {
                                            applicationInfoD = r9.c.a(m1Var.f39582a).d(0, strM0);
                                            if (applicationInfoD != null) {
                                                i11 = applicationInfoD.targetSdkVersion;
                                            } else {
                                                i11 = i10;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            s0 s0Var6 = m1Var.f39587f;
                                            m1.h(s0Var6);
                                            s0Var6.l.c(strM0, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        j12 = jMin;
                                        i10 = 0;
                                    }
                                    j13 = i11;
                                }
                                m1.f(a1Var);
                                i12 = a1Var.N0().f39927b;
                                m1.f(a1Var);
                                a1Var.G0();
                                String str9 = o.b(a1Var.K0().getString("dma_consent_settings", null)).f39655b;
                                v4.a();
                                c0Var = d0.P0;
                                if (gVar2.R0(null, c0Var)) {
                                    m1.f(l4Var);
                                    i13 = i12;
                                    int extensionVersion = SdkExtensions.getExtensionVersion(30) > 3 ? SdkExtensions.getExtensionVersion(1000000) : 0;
                                    v4.a();
                                    if (gVar2.R0(null, c0Var)) {
                                        m1.f(l4Var);
                                        jC1 = l4Var.c1();
                                    } else {
                                        jC1 = 0;
                                    }
                                    String str10 = gVar2.f39416c;
                                    int i15 = extensionVersion;
                                    String strValueOf = String.valueOf(y1.h(gVar2.W0("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j17 = j13;
                                    long j18 = m1Var2.D;
                                    m1.e(m1Var2.f39601u);
                                    return new n4(strM1, strN0, str2, j10, str6, 161000L, j16, str, z12, z15, str3, j12, i14, z16, z17, boolValueOf, this.f39540i, list, strG, str7, str8, z18, j17, i13, str9, i15, jC1, str10, strValueOf, j18, com.google.android.gms.internal.measurement.f2.b(m1Var2.f39601u.L0()), gVar2.R0(null, d0.f39301e1) ? m1Var2.E : 0L);
                                }
                                i13 = i12;
                                v4.a();
                                if (gVar2.R0(null, c0Var)) {
                                    m1.f(l4Var);
                                    jC1 = l4Var.c1();
                                } else {
                                    jC1 = 0;
                                }
                                String str11 = gVar2.f39416c;
                                int i16 = extensionVersion;
                                String strValueOf2 = String.valueOf(y1.h(gVar2.W0("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j19 = j13;
                                long j110 = m1Var2.D;
                                m1.e(m1Var2.f39601u);
                                return new n4(strM1, strN0, str2, j10, str6, 161000L, j16, str, z12, z15, str3, j12, i14, z16, z17, boolValueOf, this.f39540i, list, strG, str7, str8, z18, j19, i13, str9, i16, jC1, str11, strValueOf2, j110, com.google.android.gms.internal.measurement.f2.b(m1Var2.f39601u.L0()), gVar2.R0(null, d0.f39301e1) ? m1Var2.E : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e12) {
                        e = e12;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j10 = j14;
                }
                j11 = 0;
                this.f39539h = j11;
            }
            j11 = jA1;
            this.f39539h = j11;
        } else {
            str2 = str5;
            j10 = j14;
            z10 = false;
            j11 = j15;
        }
        zA = m1Var2.a();
        m1.f(a1Var);
        z11 = !a1Var.f39218r;
        G0();
        if (m1Var2.a()) {
            z12 = zA;
            str3 = null;
        } else {
            if (gVar2.R0(null, d0.H0)) {
                m1.h(s0Var);
                s0Var.f39760n.b("Disabled IID for tests.");
                z12 = zA;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass(Constants.FID_CLASS);
                if (clsLoadClass == null) {
                    z12 = zA;
                } else {
                    z12 = zA;
                    Object[] objArr2 = {context};
                    str3 = null;
                    objInvoke = clsLoadClass.getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        jMin = m1Var2.D;
        m1.f(a1Var);
        long j111 = j11;
        jE = a1Var.f39207f.e();
        if (jE != 0) {
            jMin = Math.min(jMin, jE);
        }
        H0();
        int i17 = this.f39544n;
        boolT0 = gVar2.T0("google_analytics_adid_collection_enabled");
        if (boolT0 != null || boolT0.booleanValue()) {
            z13 = true;
        } else {
            z13 = z10;
        }
        m1.f(a1Var);
        a1Var.G0();
        boolean z19 = z13;
        boolean z110 = a1Var.K0().getBoolean("deferred_analytics_collection", z10);
        if (gVar2.W0("google_analytics_default_allow_ad_personalization_signals", true) != v1.GRANTED) {
            z14 = true;
        } else {
            z14 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z14);
        List list2 = this.f39542k;
        String strG2 = a1Var.N0().g();
        if (this.l == null) {
            m1.f(l4Var);
            this.l = l4Var.C1();
        }
        String str12 = this.l;
        if (a1Var.N0().i(x1.ANALYTICS_STORAGE)) {
            z15 = z11;
            str4 = null;
        } else {
            G0();
            if (this.f39547q == 0) {
                z15 = z11;
            } else {
                m1Var2.f39592k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f39547q;
                z15 = z11;
                if (this.f39546p != null && jCurrentTimeMillis2 > 86400000 && this.f39548r == null) {
                    L0();
                }
            }
            if (this.f39546p == null) {
                L0();
            }
            str4 = this.f39546p;
        }
        boolT1 = gVar2.T0("google_analytics_sgtm_upload_enabled");
        if (boolT1 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolT1.booleanValue();
        }
        m1.f(l4Var);
        m1Var = (m1) l4Var.f3623a;
        String str13 = str4;
        strM0 = M0();
        boolean z111 = zBooleanValue;
        if (m1Var.f39582a.getPackageManager() == null) {
            j12 = jMin;
            j13 = 0;
        } else {
            j12 = jMin;
            i10 = 0;
            applicationInfoD = r9.c.a(m1Var.f39582a).d(0, strM0);
            if (applicationInfoD != null) {
                i11 = applicationInfoD.targetSdkVersion;
            } else {
                i11 = i10;
            }
            j13 = i11;
        }
        m1.f(a1Var);
        i12 = a1Var.N0().f39927b;
        m1.f(a1Var);
        a1Var.G0();
        String str14 = o.b(a1Var.K0().getString("dma_consent_settings", null)).f39655b;
        v4.a();
        c0Var = d0.P0;
        if (gVar2.R0(null, c0Var)) {
            m1.f(l4Var);
            i13 = i12;
            if (SdkExtensions.getExtensionVersion(30) > 3) {
            }
            v4.a();
            if (gVar2.R0(null, c0Var)) {
                m1.f(l4Var);
                jC1 = l4Var.c1();
            } else {
                jC1 = 0;
            }
            String str15 = gVar2.f39416c;
            int i18 = extensionVersion;
            String strValueOf3 = String.valueOf(y1.h(gVar2.W0("google_analytics_default_allow_ad_personalization_signals", true)));
            long j112 = j13;
            long j113 = m1Var2.D;
            m1.e(m1Var2.f39601u);
            return new n4(strM1, strN0, str2, j10, str6, 161000L, j111, str, z12, z15, str3, j12, i17, z19, z110, boolValueOf2, this.f39540i, list2, strG2, str12, str13, z111, j112, i13, str14, i18, jC1, str15, strValueOf3, j113, com.google.android.gms.internal.measurement.f2.b(m1Var2.f39601u.L0()), gVar2.R0(null, d0.f39301e1) ? m1Var2.E : 0L);
        }
        i13 = i12;
        v4.a();
        if (gVar2.R0(null, c0Var)) {
            m1.f(l4Var);
            jC1 = l4Var.c1();
        } else {
            jC1 = 0;
        }
        String str16 = gVar2.f39416c;
        int i19 = extensionVersion;
        String strValueOf4 = String.valueOf(y1.h(gVar2.W0("google_analytics_default_allow_ad_personalization_signals", true)));
        long j114 = j13;
        long j115 = m1Var2.D;
        m1.e(m1Var2.f39601u);
        return new n4(strM1, strN0, str2, j10, str6, 161000L, j111, str, z12, z15, str3, j12, i17, z19, z110, boolValueOf2, this.f39540i, list2, strG2, str12, str13, z111, j114, i13, str14, i19, jC1, str16, strValueOf4, j115, com.google.android.gms.internal.measurement.f2.b(m1Var2.f39601u.L0()), gVar2.R0(null, d0.f39301e1) ? m1Var2.E : 0L);
    }

    public final void L0() {
        String str;
        G0();
        m1 m1Var = (m1) this.f3623a;
        a1 a1Var = m1Var.f39586e;
        s0 s0Var = m1Var.f39587f;
        m1.f(a1Var);
        if (a1Var.N0().i(x1.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            l4 l4Var = m1Var.f39590i;
            m1.f(l4Var);
            l4Var.E1().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            m1.h(s0Var);
            s0Var.f39759m.b("Analytics Storage consent is not granted");
            str = null;
        }
        m1.h(s0Var);
        s0Var.f39759m.b("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f39546p = str;
        m1Var.f39592k.getClass();
        this.f39547q = System.currentTimeMillis();
    }

    public final String M0() {
        H0();
        k9.c0.h(this.f39534c);
        return this.f39534c;
    }

    public final String N0() {
        G0();
        H0();
        k9.c0.h(this.f39545o);
        return this.f39545o;
    }
}
