package com.startapp.sdk.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.consent.ConsentActivity;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.consent.ConsentTypeInfoConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.vungle.ads.internal.Constants;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class h6 implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f41034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41035c;
    public Intent d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41036e = false;
    public boolean f = true;

    public h6(Context context, lb lbVar, lb lbVar2) {
        this.f41033a = context;
        this.f41034b = lbVar;
        this.f41035c = lbVar2;
    }

    public static boolean a(int i2) {
        ConsentConfig consentConfigR = MetaData.E().r();
        ComponentInfoEventConfig componentInfoEventConfigF = consentConfigR != null ? consentConfigR.f() : null;
        return componentInfoEventConfigF != null && componentInfoEventConfigF.a((long) i2);
    }

    public final Boolean b() {
        if (d() && ((vf) this.f41034b.a()).contains("consentApc")) {
            return Boolean.valueOf(((vf) this.f41034b.a()).getBoolean("consentApc", false));
        }
        return null;
    }

    public final Integer c() {
        if (d()) {
            int iHashCode = ((com.startapp.sdk.common.advertisingid.b) this.f41035c.a()).a().f41193a.hashCode();
            if (!((vf) this.f41034b.a()).contains("advIdHash") || ((vf) this.f41034b.a()).getInt("advIdHash", 0) != iHashCode) {
                uf ufVarEdit = ((vf) this.f41034b.a()).edit();
                if (ufVarEdit.f41546b.containsKey("consentType")) {
                    ufVarEdit.d = true;
                }
                ufVarEdit.f41545a.remove("consentType");
                if (ufVarEdit.f41546b.containsKey("consentTimestamp")) {
                    ufVarEdit.d = true;
                }
                ufVarEdit.f41545a.remove("consentTimestamp");
                ufVarEdit.a("advIdHash", Integer.valueOf(iHashCode));
                ufVarEdit.f41545a.putInt("advIdHash", iHashCode);
                ufVarEdit.apply();
            }
        }
        if (d() && ((vf) this.f41034b.a()).contains("consentType")) {
            return Integer.valueOf(((vf) this.f41034b.a()).getInt("consentType", -1));
        }
        return null;
    }

    public final boolean d() {
        ConsentConfig consentConfigR = MetaData.E().r();
        return this.f && consentConfigR != null && consentConfigR.l();
    }

    public final void a(Integer num, Long l2, Boolean bool, boolean z2, boolean z3) {
        if (d()) {
            long j = ((vf) this.f41034b.a()).getLong("consentTimestamp", 0L);
            int i2 = ((vf) this.f41034b.a()).getInt("consentType", -1);
            boolean zContains = ((vf) this.f41034b.a()).contains("consentApc");
            boolean z4 = (num == null || i2 == num.intValue()) ? false : true;
            boolean z5 = (bool == null || (zContains && ((vf) this.f41034b.a()).getBoolean("consentApc", false) == bool.booleanValue())) ? false : true;
            boolean z6 = l2 != null && l2.longValue() > j;
            if (z2 || z6) {
                if (z4 || z5) {
                    uf ufVarEdit = ((vf) this.f41034b.a()).edit();
                    if (z4) {
                        int iIntValue = num.intValue();
                        ufVarEdit.a("consentType", num);
                        ufVarEdit.f41545a.putInt("consentType", iIntValue);
                    }
                    if (z5) {
                        boolean zBooleanValue = bool.booleanValue();
                        ufVarEdit.a("consentApc", bool);
                        ufVarEdit.f41545a.putBoolean("consentApc", zBooleanValue);
                    }
                    if (z6) {
                        long jLongValue = l2.longValue();
                        ufVarEdit.a("consentTimestamp", l2);
                        ufVarEdit.f41545a.putLong("consentTimestamp", jLongValue);
                    }
                    ufVarEdit.apply();
                    if (z3) {
                        MetaData.E().a(this.f41033a, new AdPreferences(), MetaDataRequest$RequestReason.CONSENT, false, null, true);
                    }
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z2) {
        MetaData.E().a(this);
        ConsentConfig consentConfigR = MetaData.E().r();
        if (consentConfigR == null || !d()) {
            return;
        }
        Integer numB = consentConfigR.b();
        if (numB != null) {
            a(numB, Long.valueOf(consentConfigR.j()), null, false, false);
        }
        if (metaDataRequest$RequestReason == MetaDataRequest$RequestReason.CONSENT) {
            uf ufVarEdit = ((vf) this.f41034b.a()).edit();
            long j = consentConfigR.j();
            ufVarEdit.a("consentTimestamp", Long.valueOf(j));
            ufVarEdit.f41545a.putLong("consentTimestamp", j);
            ufVarEdit.apply();
            return;
        }
        if (metaDataRequest$RequestReason == MetaDataRequest$RequestReason.LAUNCH) {
            a(false, null, null, null, null, null);
        }
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a() {
        MetaData.E().a(this);
    }

    public final boolean a(boolean z2, String str, String str2, String str3, String str4, String str5) {
        ConsentConfig consentConfigR;
        String strG;
        Integer consentTypeInfo;
        if ((z2 || jh.f41150u == 2) && (consentConfigR = MetaData.E().r()) != null && ((d() || z2) && !this.f41036e)) {
            Context context = this.f41033a;
            WeakHashMap weakHashMap = vi.f41589a;
            if (((g6) com.startapp.sdk.components.a.a(context).t.a()).b() && vi.c(this.f41033a)) {
                if (!z2 && (consentConfigR.i() == null || consentConfigR.h() == null || ((vf) this.f41034b.a()).contains("consentApc"))) {
                    return false;
                }
                if (z2) {
                    strG = AdInformationMetaData.c().a().getDialogUrl();
                } else {
                    strG = consentConfigR.g();
                }
                if (strG == null) {
                    return false;
                }
                Intent intent = new Intent(this.f41033a, (Class<?>) ConsentActivity.class);
                intent.setFlags(805306368);
                intent.setData(Uri.parse(strG));
                intent.putExtra("allowCT", consentConfigR.l());
                intent.putExtra("timestamp", consentConfigR.j());
                intent.putExtra("templateName", Integer.valueOf(z2 ? 4 : consentConfigR.i().intValue()));
                intent.putExtra("templateId", Integer.valueOf(z2 ? 7 : consentConfigR.h().intValue()));
                if (!z2) {
                    str = consentConfigR.d();
                }
                if (str != null) {
                    intent.putExtra("dParam", str);
                }
                if (!z2) {
                    str2 = consentConfigR.e();
                }
                if (str2 != null) {
                    intent.putExtra("impressionUrl", str2);
                }
                if (!z2) {
                    str3 = consentConfigR.a();
                }
                if (str3 != null) {
                    intent.putExtra(Constants.CLICK_URL, str3);
                }
                if (z2) {
                    intent.putExtra("advertisingId", ((com.startapp.sdk.common.advertisingid.b) this.f41035c.a()).a().f41193a);
                    if (((vf) this.f41034b.a()).contains("consentType")) {
                        intent.putExtra("consentType", ((vf) this.f41034b.a()).getInt("consentType", -1));
                    }
                    if (str4 != null) {
                        intent.putExtra("erid", str4);
                    }
                    if (str5 != null) {
                        intent.putExtra("eridUrl", str5);
                    }
                }
                ConsentTypeInfoConfig consentTypeInfoConfigC = consentConfigR.c();
                if (consentTypeInfoConfigC != null) {
                    if (consentTypeInfoConfigC.b() != null) {
                        intent.putExtra("impression", consentTypeInfoConfigC.b());
                    }
                    if (consentTypeInfoConfigC.a() != null) {
                        intent.putExtra("falseClick", consentTypeInfoConfigC.a());
                    }
                    if (consentTypeInfoConfigC.c() != null) {
                        intent.putExtra("trueClick", consentTypeInfoConfigC.c());
                    }
                }
                if (z2 && (consentTypeInfo = AdInformationMetaData.c().a().getConsentTypeInfo()) != null) {
                    intent.putExtra("trueClick", consentTypeInfo);
                }
                try {
                    this.f41033a.startActivity(intent);
                    this.f41036e = true;
                    if (a(1)) {
                        g9 g9Var = new g9(h9.d);
                        g9Var.d = "CNS.shown";
                        g9Var.f41004i = String.valueOf(z2);
                        g9Var.f41002e = String.valueOf(System.currentTimeMillis());
                        g9Var.a();
                    }
                } catch (ActivityNotFoundException unused) {
                } catch (Throwable th) {
                    if (a(2)) {
                        g9.a(th);
                    }
                }
                return this.f41036e;
            }
        }
        return false;
    }
}
