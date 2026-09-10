package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.InterfaceC0341fe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class c7 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f7658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f7659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f7660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f7661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f7662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f7663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f7664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f7665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7666j;

    public c7(com.applovin.impl.sdk.l lVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.l.p());
        this.f7658b = defaultSharedPreferences;
        this.f7657a = lVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f7659c = a(b5.f7562u.a());
        this.f7660d = a(b5.f7563v.a());
        this.f7661e = h();
        this.f7662f = (String) c5.a(b5.f7565x, (Object) null, defaultSharedPreferences, false);
        this.f7663g = (String) c5.a(b5.f7566y, (Object) null, defaultSharedPreferences, false);
        this.f7664h = (String) c5.a(b5.f7567z, (Object) null, defaultSharedPreferences, false);
        this.f7665i = (String) c5.a(b5.B, (Object) null, defaultSharedPreferences, false);
        this.f7666j = (String) c5.a(b5.D, (Object) null, defaultSharedPreferences, false);
        b(this.f7663g);
    }

    private Integer h() {
        String strA = b5.f7564w.a();
        if (this.f7658b.contains(strA)) {
            Integer num = (Integer) c5.a(strA, null, Integer.class, this.f7658b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f7657a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7657a.Q().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l = (Long) c5.a(strA, null, Long.class, this.f7658b, false);
            if (l != null) {
                if (l.longValue() == 1 || l.longValue() == 0) {
                    return Integer.valueOf(l.intValue());
                }
                this.f7657a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7657a.Q().b("TcfManager", "Long value (" + l + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Boolean bool = (Boolean) c5.a(strA, null, Boolean.class, this.f7658b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) c5.a(strA, null, String.class, this.f7658b, false);
            if (str != null) {
                if ("1".equals(str) || com.ironsource.mediationsdk.metadata.a.f29610g.equals(str)) {
                    return 1;
                }
                if ("0".equals(str) || "false".equals(str)) {
                    return 0;
                }
                this.f7657a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7657a.Q().b("TcfManager", l1.d.h("String value (", str, ") for ", strA, " is invalid - setting GDPR Applies to null"));
                }
                return null;
            }
        }
        return null;
    }

    public Boolean a(int i10) {
        return f7.a(i10, this.f7663g);
    }

    public boolean b() {
        return f7.a(this.f7663g);
    }

    public String c() {
        return this.f7663g;
    }

    public String d() {
        return a7.a(this.f7659c);
    }

    public Integer e() {
        return this.f7659c;
    }

    public Integer f() {
        return this.f7660d;
    }

    public Integer g() {
        return this.f7661e;
    }

    public String i() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.f7659c) + a("CMP SDK Version", this.f7660d) + a(b5.f7564w.a(), this.f7661e) + a(b5.f7565x.a(), this.f7662f) + a(b5.f7566y.a(), this.f7663g);
    }

    public String j() {
        return this.f7662f;
    }

    public String k() {
        return this.f7664h;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7657a.Q().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(b5.f7562u.a())) {
            this.f7659c = a(str);
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVarQ = this.f7657a.Q();
                StringBuilder sbK = d5.u.k("SharedPreferences entry updated - key: ", str, ", value: ");
                sbK.append(this.f7659c);
                pVarQ.a("TcfManager", sbK.toString());
            }
            this.f7657a.S0();
            return;
        }
        if (str.equals(b5.f7563v.a())) {
            this.f7660d = a(str);
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVarQ2 = this.f7657a.Q();
                StringBuilder sbK2 = d5.u.k("SharedPreferences entry updated - key: ", str, ", value: ");
                sbK2.append(this.f7660d);
                pVarQ2.a("TcfManager", sbK2.toString());
                return;
            }
            return;
        }
        if (str.equals(b5.f7564w.a())) {
            this.f7661e = h();
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                com.applovin.impl.sdk.p pVarQ3 = this.f7657a.Q();
                StringBuilder sbK3 = d5.u.k("SharedPreferences entry updated - key: ", str, ", value: ");
                sbK3.append(this.f7661e);
                pVarQ3.a("TcfManager", sbK3.toString());
                return;
            }
            return;
        }
        if (str.equals(b5.f7565x.a())) {
            this.f7662f = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.C(d5.u.k("SharedPreferences entry updated - key: ", str, ", value: "), this.f7662f, this.f7657a.Q(), "TcfManager");
            }
            this.f7657a.S0();
            return;
        }
        if (str.equals(b5.f7566y.a())) {
            this.f7663g = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.C(d5.u.k("SharedPreferences entry updated - key: ", str, ", value: "), this.f7663g, this.f7657a.Q(), "TcfManager");
            }
            b(this.f7663g);
            return;
        }
        if (str.equals(b5.f7567z.a())) {
            this.f7664h = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.C(d5.u.k("SharedPreferences entry updated - key: ", str, ", value: "), this.f7664h, this.f7657a.Q(), "TcfManager");
                return;
            }
            return;
        }
        if (str.equals(b5.A.a())) {
            String str2 = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7657a.Q().a("TcfManager", l1.d.g("SharedPreferences entry updated - key: ", str, ", value: ", str2));
                return;
            }
            return;
        }
        if (str.equals(b5.B.a())) {
            this.f7665i = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.C(d5.u.k("SharedPreferences entry updated - key: ", str, ", value: "), this.f7665i, this.f7657a.Q(), "TcfManager");
                return;
            }
            return;
        }
        if (str.equals(b5.C.a())) {
            String str3 = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7657a.Q().a("TcfManager", l1.d.g("SharedPreferences entry updated - key: ", str, ", value: ", str3));
                return;
            }
            return;
        }
        if (str.equals(b5.D.a())) {
            this.f7666j = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                defpackage.e.C(d5.u.k("SharedPreferences entry updated - key: ", str, ", value: "), this.f7666j, this.f7657a.Q(), "TcfManager");
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) c5.a(str, (Object) null, String.class, sharedPreferences);
            this.f7657a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f7657a.Q().a("TcfManager", l1.d.g("SharedPreferences entry updated - key: ", str, ", value: ", str4));
            }
        }
    }

    private Integer a(String str) {
        if (this.f7658b.contains(str)) {
            Integer num = (Integer) c5.a(str, null, Integer.class, this.f7658b, false);
            if (num != null) {
                return num;
            }
            Long l = (Long) c5.a(str, null, Long.class, this.f7658b, false);
            if (l != null && l.longValue() >= -2147483648L && l.longValue() <= 2147483647L) {
                return Integer.valueOf(l.intValue());
            }
            String str2 = (String) c5.a(str, null, String.class, this.f7658b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f7657a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7657a.Q().b("TcfManager", l1.d.h("String value (", str2, ") for ", str, " is not numeric - storing value as null"));
                }
            }
        }
        return null;
    }

    public Boolean b(int i10) {
        String str = this.f7665i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(f7.a(str, i10 - 1));
    }

    public Boolean c(int i10) {
        String str = this.f7666j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(f7.a(str, i10 - 1));
    }

    public Boolean d(int i10) {
        String str = this.f7664h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(f7.a(str, i10 - 1));
    }

    private void b(String str) {
        this.f7657a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            defpackage.e.A("Attempting to update consent from Additional Consent string: ", str, this.f7657a.Q(), "TcfManager");
        }
        Boolean boolA = f7.a(InterfaceC0341fe.c.f28695e, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f7657a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7657a.Q().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                q0.b(true, com.applovin.impl.sdk.l.p());
            } else {
                this.f7657a.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f7657a.Q().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                q0.b(false, com.applovin.impl.sdk.l.p());
            }
            this.f7657a.S0();
            return;
        }
        this.f7657a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.f7657a.Q().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void a() {
        this.f7659c = null;
        this.f7661e = null;
        this.f7662f = null;
        this.f7663g = null;
        this.f7664h = null;
    }

    private String a(String str, Object obj) {
        StringBuilder sbK = d5.u.k("\n", str, " - ");
        sbK.append(obj != null ? obj.toString() : "No value set");
        return sbK.toString();
    }
}
