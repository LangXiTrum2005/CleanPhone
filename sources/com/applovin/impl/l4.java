package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import com.ironsource.X3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8346b = com.applovin.impl.sdk.l.p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8347c;

    public l4(com.applovin.impl.sdk.l lVar) {
        this.f8345a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f8347c != null) {
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f8346b.getResources().openRawResource(R.raw.omsdk_v1_5_3)));
            try {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            this.f8347c = sb2.toString();
                            bufferedReader.close();
                            return;
                        }
                        sb2.append(line);
                    }
                } catch (Throwable th2) {
                    try {
                        Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th2);
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
                        }
                        throw th3;
                    }
                }
            } catch (IOException e11) {
                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e11);
            }
        } catch (Throwable th4) {
            this.f8345a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f8345a.Q().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_5_3.js", th4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f8346b);
        this.f8345a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            com.applovin.impl.sdk.p pVarQ = this.f8345a.Q();
            StringBuilder sb2 = new StringBuilder("Init ");
            sb2.append(d() ? "succeeded" : X3.i.f27815t);
            sb2.append(" and took ");
            sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            defpackage.e.C(sb2, "ms", pVarQ, "OpenMeasurementService");
        }
        h();
    }

    private void h() {
        this.f8345a.s0().a((k5) new u6(this.f8345a, "OpenMeasurementService", new o9(this, 1)), f6.b.OTHER);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = this.f8345a.p0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f8345a.a(z4.f10098a0)).booleanValue()) {
            this.f8345a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f8345a.Q().a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new o9(this, 0));
        }
    }

    public String a() {
        return this.f8347c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.f8345a.a(z4.f10106b0), AppLovinSdk.VERSION);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    public String a(String str, Map map) {
        String strInjectScriptContentIntoHtml;
        try {
            if (e()) {
                String strA = m4.a(this.f8345a, map);
                if (StringUtils.isValidString(strA)) {
                    strInjectScriptContentIntoHtml = ScriptInjector.injectScriptContentIntoHtml(strA, str);
                } else {
                    strInjectScriptContentIntoHtml = str;
                }
            } else {
                strInjectScriptContentIntoHtml = str;
            }
            return ScriptInjector.injectScriptContentIntoHtml(this.f8347c, strInjectScriptContentIntoHtml);
        } catch (Throwable th2) {
            this.f8345a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.f8345a.Q().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th2);
            }
            return str;
        }
    }
}
