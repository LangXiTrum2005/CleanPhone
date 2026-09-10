package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f33453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f33455k;
    private boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f33456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f33457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f33458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final SharedPreferences f33459p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33445a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33446b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33447c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33448d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33449e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f33450f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f33451g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f33452h = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<String> f33460q = Arrays.asList("IABTCF_gdprApplies", AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABTCF_VendorConsents", "IABTCF_PurposeConsents", "IABTCF_AddtlConsent", "IABTCF_DisclosedVendors", "IABTCF_PolicyVersion");

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a();
    }

    public e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f33459p = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        a();
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f33459p;
        if (sharedPreferences != null) {
            d(sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, ""));
            b(this.f33459p.getInt("IABTCF_gdprApplies", 0));
            c(this.f33459p.getString("IABTCF_PurposeConsents", ""));
            e(this.f33459p.getString("IABTCF_VendorConsents", ""));
            b(this.f33459p.getString("IABTCF_AddtlConsent", ""));
            a(this.f33459p.getInt("IABTCF_PolicyVersion", 0));
            f(this.f33459p.getString("IABTCF_DisclosedVendors", ""));
        }
    }

    public String b() {
        return this.f33445a;
    }

    public void c(String str) {
        this.f33453i = a(str, 1);
        this.f33454j = a(str, 2);
        this.f33446b = str;
    }

    public void d(String str) {
        this.f33445a = str;
    }

    public void e(String str) {
        this.f33455k = a(str, 867);
        this.f33447c = str;
    }

    public void f(String str) {
        this.f33457n = a(str, 867);
        this.f33449e = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            List<String> list = this.f33460q;
            if (list == null || list.contains(str)) {
                switch (str.hashCode()) {
                    case -2004976699:
                        if (str.equals("IABTCF_PurposeConsents")) {
                            c(sharedPreferences.getString("IABTCF_PurposeConsents", ""));
                        }
                        break;
                    case -1595774028:
                        if (str.equals("IABTCF_PolicyVersion")) {
                            a(sharedPreferences.getInt("IABTCF_PolicyVersion", 0));
                        }
                        break;
                    case -1573968861:
                        if (str.equals("IABTCF_DisclosedVendors")) {
                            f(sharedPreferences.getString("IABTCF_DisclosedVendors", ""));
                        }
                        break;
                    case 83641339:
                        if (str.equals("IABTCF_gdprApplies")) {
                            b(sharedPreferences.getInt("IABTCF_gdprApplies", 0));
                        }
                        break;
                    case 1218895378:
                        if (str.equals(AndroidTcfDataSource.TCF_TCSTRING_KEY)) {
                            d(sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, ""));
                        }
                        break;
                    case 1342914771:
                        if (str.equals("IABTCF_AddtlConsent")) {
                            b(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
                        }
                        break;
                    case 1450203731:
                        if (str.equals("IABTCF_VendorConsents")) {
                            e(sharedPreferences.getString("IABTCF_VendorConsents", ""));
                        }
                        break;
                }
                a aVar = this.f33458o;
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Throwable th2) {
            q0.b("TCStringManager", th2.getMessage());
        }
    }

    public void b(int i10) {
        this.f33450f = i10;
    }

    public void b(String str) {
        this.f33448d = str;
        if (TextUtils.isEmpty(str)) {
            this.l = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f33456m = false;
            return;
        }
        this.f33456m = true;
        try {
            String[] strArrSplit = str.split("~");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    this.l = false;
                } else {
                    this.l = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th2) {
            q0.b("TCStringManager", th2.getMessage());
        }
    }

    public boolean c() {
        if (this.f33450f == 0) {
            a(true);
            return this.f33452h;
        }
        if (MBridgeConstans.VERIFY_ATP_CONSENT) {
            a((this.f33455k || (this.f33456m && this.l)) && this.f33453i && this.f33454j);
        } else if (this.f33451g >= 5) {
            a(this.f33457n && this.f33455k && this.f33453i && this.f33454j);
        } else {
            a(this.f33455k && this.f33453i && this.f33454j);
        }
        return this.f33452h;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f33458o = aVar;
        }
    }

    public void a(int i10) {
        this.f33451g = i10;
    }

    public void a(boolean z10) {
        this.f33452h = z10;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private boolean a(String str, int i10) {
        return a(str) && i10 <= str.length() && i10 >= 1 && '1' == str.charAt(i10 - 1);
    }
}
