package com.startapp.sdk.adsbase.model;

import android.content.Context;
import android.media.AudioManager;
import com.iab.omid.library.startio.Omid;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.advertisingid.b;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.internal.AbstractC3396g;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h6;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.q;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.rg;
import com.startapp.sdk.internal.sg;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.v0;
import com.startapp.sdk.internal.ve;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.z1;
import com.thinkup.core.api.TUCustomRuleKeys;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a extends z1 {
    public Integer A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public Set F0;
    public Set G0;
    public HashSet H0;
    public Set I0;
    public HashSet J0;
    public Pair K0;
    public boolean L0;
    public final long M0;
    public final int N0;
    public final String O0;
    public String P0;
    public String Q0;
    public boolean R0;
    public Boolean S0;
    public String T0;
    public Ad.AdType U0;
    public AdPreferences.Placement j0;
    public String k0;
    public boolean l0;
    public boolean m0;
    public Integer n0;
    public Long o0;
    public Boolean p0;
    public String q0;
    public SDKAdPreferences.Gender r0;
    public String s0;
    public int t0;
    public boolean u0;
    public Boolean v0;
    public boolean w0;
    public Double x0;
    public String y0;
    public String z0;

    public a() {
        super(4);
        this.t0 = 1;
        this.u0 = true;
        this.w0 = AdsCommonMetaData.k().J();
        this.C0 = true;
        this.E0 = 0;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.L0 = true;
        this.U0 = null;
        this.M0 = System.currentTimeMillis() - pg.d.f41372b;
        WeakHashMap weakHashMap = vi.f41589a;
        this.N0 = t.d.f41492a.size();
        this.O0 = MetaData.E().Q();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    public void a(Context context, AdPreferences adPreferences, AdPreferences.Placement placement, Pair pair) {
        Set setA;
        boolean z2;
        this.j0 = placement;
        this.k0 = adPreferences.getPlacementId();
        this.K0 = pair;
        this.S0 = adPreferences.getAi();
        this.r0 = adPreferences.getGender(context);
        this.s0 = adPreferences.getKeywords();
        this.l0 = adPreferences.isTestMode();
        this.F0 = adPreferences.getCategories();
        this.G0 = adPreferences.getCategoriesExclude();
        this.u0 = adPreferences.isHardwareAccelerated();
        this.A0 = adPreferences.getAutoLoadAmount();
        this.B0 = adPreferences.isPreCached();
        this.v0 = Boolean.valueOf(q0.c(context));
        this.x0 = adPreferences.getMinCpm();
        this.y0 = adPreferences.getAdTag();
        HashSet hashSet = MetaData.f;
        boolean z3 = true;
        this.C0 = !context.getFileStreamPath("StartappMetadata").exists();
        this.U0 = adPreferences.type;
        this.f41742b = adPreferences.getCustomProductId();
        VideoConfig videoConfigF = AdsCommonMetaData.k().F();
        if ((videoConfigF == null || videoConfigF.m() == null) ? false : videoConfigF.m().equals("muted")) {
            this.D0 = false;
        } else {
            try {
                Object systemService = context.getSystemService("audio");
                if (systemService instanceof AudioManager) {
                    this.D0 = ((AudioManager) systemService).getStreamVolume(3) > 0;
                }
            } catch (Throwable th) {
                g9.a(th);
            }
        }
        try {
            if (!ih.f41097a.t) {
                q qVar = (q) com.startapp.sdk.components.a.a(context).f40731P.a();
                AdDebuggerMetadata adDebuggerMetadataD = MetaData.E().d();
                if (adDebuggerMetadataD != null) {
                    AdDebuggerMetadata adDebuggerMetadataD2 = MetaData.E().d();
                    if (((adDebuggerMetadataD2 == null || (setA = adDebuggerMetadataD2.a()) == null) ? false : setA.contains(((b) qVar.f41380b.a()).a().f41193a)) && adDebuggerMetadataD.c()) {
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    }
                }
                z2 = false;
                if (z2) {
                    z3 = false;
                }
            }
            this.m0 = z3;
        } catch (Throwable unused) {
        }
        this.I0 = adPreferences.packageInclude;
    }

    @Override // com.startapp.sdk.internal.z1
    public final boolean b() {
        return true;
    }

    public void f(Context context) {
        sg sgVar = (sg) com.startapp.sdk.components.a.a(context).f40740l.a();
        AdPreferences.Placement placement = this.j0;
        this.z0 = placement == null ? null : (String) sgVar.f41489a.get(new rg(placement));
    }

    public final void g(Context context) {
        com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context);
        h6 h6Var = (h6) aVarA.j.a();
        this.n0 = h6Var.c();
        this.o0 = (h6Var.d() && ((vf) h6Var.f41034b.a()).contains("consentTimestamp")) ? Long.valueOf(((vf) h6Var.f41034b.a()).getLong("consentTimestamp", 0L)) : null;
        this.p0 = h6Var.b();
        this.q0 = ((vf) aVarA.H.a()).getString("IABTCF_TCString", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.z1
    public void a(ve veVar) {
        super.a(veVar);
        veVar.a("placement", this.j0.name(), true, true);
        veVar.a("placementId", this.k0, false, true);
        veVar.a("testMode", Boolean.toString(this.l0), false, true);
        veVar.a(TUCustomRuleKeys.GENDER, this.r0, false, true);
        veVar.a("keywords", this.s0, false, true);
        veVar.a("adsNumber", Integer.toString(this.t0), false, true);
        veVar.a("category", this.F0);
        veVar.a("categoryExclude", this.G0);
        veVar.a("packageExclude", this.H0);
        veVar.a("campaignExclude", this.J0);
        veVar.a("offset", Integer.toString(this.E0), false, true);
        veVar.a(com.smartdigimkt.o1.b.a3, this.S0, false, true);
        Double d = this.x0;
        WeakHashMap weakHashMap = vi.f41589a;
        veVar.a("minCPM", d != null ? String.format(Locale.US, "%.2f", d) : null, false, true);
        veVar.a("previousAdId", this.z0, false, true);
        veVar.a("twoClicks", Boolean.valueOf(!this.w0), false, true);
        veVar.a("engInclude", Boolean.toString(this.L0), false, true);
        Object obj = this.U0;
        if (obj == Ad.AdType.INTERSTITIAL || obj == Ad.AdType.RICH_TEXT) {
            veVar.a("type", obj, false, true);
        }
        veVar.a("timeSinceSessionStart", Long.valueOf(this.M0), true, true);
        veVar.a("adsDisplayed", Integer.valueOf(this.N0), true, true);
        veVar.a("profileId", this.O0, false, true);
        veVar.a("hardwareAccelerated", Boolean.valueOf(this.u0), false, true);
        veVar.a("autoLoadAmount", this.A0, false, true);
        veVar.a("dts", this.v0, false, true);
        if (this.B0) {
            veVar.a("downloadingMode", "CACHE", false, true);
        }
        veVar.a("primaryImg", this.P0, false, true);
        veVar.a("moreImg", this.Q0, false, true);
        veVar.a("contentAd", Boolean.toString(this.R0), false, true);
        veVar.a(com.smartdigimkt.o1.b.y3, this.n0, false, true);
        veVar.a("tsc", this.o0, false, true);
        veVar.a("apc", this.p0, false, true);
        veVar.a("IABTCF_TCString", this.q0, false, true);
        if (this.m0) {
            veVar.a("testAdsEnabled", Boolean.TRUE, false, true);
        } else {
            veVar.a("adTag", this.y0, false, true);
        }
        String strA = AbstractC3396g.a();
        veVar.a(AbstractC3396g.f40988b, strA, true, true);
        String str = AbstractC3396g.d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41742b);
        sb.append(this.j0.name());
        String str2 = this.f41736Q;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(this.f41744c);
        sb.append(strA);
        veVar.a(str, AbstractC3396g.a(sb.toString()), true, false);
        veVar.a("sound", Boolean.valueOf(this.D0), false, true);
        Set set = this.I0;
        if (set != null) {
            veVar.a("packageInclude", set);
        }
        veVar.a("defaultMetaData", Boolean.valueOf(this.C0), true, true);
        Pair pair = this.K0;
        veVar.a((String) pair.first, pair.second, false, true);
        Object obj2 = this.T0;
        if (obj2 != null) {
            veVar.a("trv", obj2, false, false);
        }
        v0 v0Var = this.g0;
        if (v0Var != null) {
            Integer num = (Integer) v0Var.f41555c.get(this.j0);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue > 0) {
                veVar.a("adsDisplayed", Integer.valueOf(iIntValue), false, false);
            }
        }
        veVar.a("omsdkv", Omid.getVersion(), false, true);
    }
}
