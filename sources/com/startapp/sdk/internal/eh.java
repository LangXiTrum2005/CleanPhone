package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.cache.ACMConfig;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import com.startapp.sdk.jobs.JobRequest$Network;
import com.startapp.sdk.sensors.SensorsData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class eh implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f40940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f40941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jh f40942c;

    public eh(jh jhVar, Context context, com.startapp.sdk.components.a aVar) {
        this.f40942c = jhVar;
        this.f40940a = context;
        this.f40941b = aVar;
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z2) {
        jh jhVar = this.f40942c;
        Context context = this.f40940a;
        int i2 = 0;
        if (jhVar.f41153b) {
            p pVar = (p) com.startapp.sdk.components.a.a(context).M.a();
            if (jhVar.f41159n || !CacheMetaData.b().a().g() || !MetaData.E().f0()) {
                pVar.f41335c = true;
                Context context2 = pVar.g;
                ((Executor) com.startapp.sdk.components.a.a(context2).C.a()).execute(new o6(context2, new k(pVar)));
            } else if (!pVar.f41335c && CacheMetaData.b().a().g() && MetaData.E().f0()) {
                pVar.d = true;
                Context context3 = pVar.g;
                ((Executor) com.startapp.sdk.components.a.a(context3).C.a()).execute(new p6(context3, new j(pVar)));
            }
            if (z2) {
                p pVar2 = (p) com.startapp.sdk.components.a.a(context).M.a();
                ACMConfig aCMConfigA = CacheMetaData.b().a();
                if (aCMConfigA != null) {
                    MetaData metaDataE = MetaData.E();
                    Set<StartAppAd.AdMode> setB = aCMConfigA.b();
                    if (setB != null && !setB.isEmpty() && CacheMetaData.d() && metaDataE.f0() && ((r0) pVar2.f41341p.a()).a() != null) {
                        int iZ = metaDataE.Z();
                        int i3 = AdsCommonMetaData.k().i();
                        for (StartAppAd.AdMode adMode : setB) {
                            if (adMode != null) {
                                String str = "autoLoadNotShownAdPrefix" + adMode.name();
                                int i4 = ((vf) pVar2.j.a()).getInt(str, 0);
                                if (i4 < iZ) {
                                    AdPreferences adPreferences = new AdPreferences();
                                    adPreferences.makePreCached();
                                    StartAppAd.AdMode adMode2 = StartAppAd.AdMode.FULLPAGE;
                                    if (adMode != adMode2) {
                                        StartAppAd.AdMode adMode3 = StartAppAd.AdMode.OFFERWALL;
                                        if (adMode != adMode3) {
                                            pVar2.a(null, adMode, adPreferences, null, null);
                                        } else if (i3 < 100) {
                                            pVar2.a(null, adMode3, adPreferences, null, null);
                                        }
                                    } else if (i3 > 0) {
                                        pVar2.a(null, adMode2, adPreferences, null, null);
                                    }
                                    uf ufVarEdit = ((vf) pVar2.j.a()).edit();
                                    int i5 = i4 + 1;
                                    ufVarEdit.a(str, Integer.valueOf(i5));
                                    ufVarEdit.f41545a.putInt(str, i5);
                                    ufVarEdit.apply();
                                }
                            }
                        }
                    }
                }
            }
        }
        m2 m2Var = (m2) this.f40941b.r.a();
        synchronized (m2Var) {
            m2Var.a(Math.max(0L, (Math.max(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, m2Var.d()) + ((vf) m2Var.f40876e.a()).getLong(m2Var.f40877h, 0L)) - System.currentTimeMillis()));
        }
        ((mg) this.f40941b.s.a()).e();
        ((ph) this.f40941b.f.a()).e();
        jh jhVar2 = this.f40942c;
        Context context4 = this.f40940a;
        jhVar2.getClass();
        db dbVar = (db) com.startapp.sdk.components.a.a(context4).v.a();
        if (MetaData.E().m0()) {
            long jO = ((long) MetaData.E().O()) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            fe feVar = new fe(ie.class);
            feVar.d = Long.valueOf(jO);
            feVar.f40971b = JobRequest$Network.ANY;
            dbVar.a(new ge(feVar));
        } else {
            int iA = ge.a(ie.class);
            if (!dbVar.f40907b.a(iA)) {
                dbVar.f40906a.a(iA);
            }
        }
        jh jhVar3 = this.f40942c;
        Context context5 = this.f40940a;
        jhVar3.getClass();
        db dbVar2 = (db) com.startapp.sdk.components.a.a(context5).v.a();
        if (MetaData.E().l0()) {
            long jB = ((long) MetaData.E().b(context5)) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            fe feVar2 = new fe(ee.class);
            feVar2.d = Long.valueOf(jB);
            feVar2.f40971b = JobRequest$Network.ANY;
            dbVar2.a(new ge(feVar2));
        } else {
            int iA2 = ge.a(ee.class);
            if (!dbVar2.f40907b.a(iA2)) {
                dbVar2.f40906a.a(iA2);
            }
        }
        jh jhVar4 = this.f40942c;
        Context context6 = this.f40940a;
        jhVar4.getClass();
        db dbVar3 = (db) com.startapp.sdk.components.a.a(context6).v.a();
        MetaData metaDataE2 = MetaData.E();
        if (metaDataE2.l0() && metaDataE2.k0()) {
            long millis = TimeUnit.SECONDS.toMillis(metaDataE2.a(context6));
            fe feVar3 = new fe(de.class);
            feVar3.d = Long.valueOf(millis);
            feVar3.f40971b = JobRequest$Network.ANY;
            feVar3.f40972c = true;
            dbVar3.a(new ge(feVar3));
        } else {
            int iA3 = ge.a(de.class);
            if (!dbVar3.f40907b.a(iA3)) {
                dbVar3.f40906a.a(iA3);
            }
        }
        jh jhVar5 = this.f40942c;
        Context context7 = this.f40940a;
        jhVar5.getClass();
        com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context7);
        vf vfVar = (vf) aVarA.G.a();
        if (vfVar.getBoolean("shared_prefs_first_init", true)) {
            uf ufVarEdit2 = vfVar.edit();
            ufVarEdit2.a("totalSessions", 0);
            ufVarEdit2.f41545a.putInt("totalSessions", 0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ufVarEdit2.a("firstSessionTime", Long.valueOf(jCurrentTimeMillis));
            ufVarEdit2.f41545a.putLong("firstSessionTime", jCurrentTimeMillis);
            ufVarEdit2.apply();
            ((Executor) aVarA.f40724A.a()).execute(new fh(context7, aVarA, vfVar));
        }
        if (this.f40940a != null) {
            g9 g9Var = new g9(h9.f41042i);
            g9Var.j = false;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.f40723U.f41603a;
                if (aVar != null) {
                    ((w9) aVar.q.a()).a(g9Var);
                }
            } catch (Throwable unused) {
            }
        }
        this.f40942c.getClass();
        sf sfVar = (sf) this.f40941b.f40743u.a();
        try {
            if (!sfVar.a()) {
                ((Executor) sfVar.f41484b.a()).execute(new qf(sfVar));
            }
        } catch (Throwable th) {
            g9.a(th);
        }
        hf hfVar = (hf) this.f40941b.f40739i.a();
        List listA = hfVar.a();
        hfVar.f41056b.getClass();
        RscMetadata rscMetadataS = MetaData.E().S();
        MotionMetadata motionMetadata = null;
        if (rscMetadataS == null || !rscMetadataS.d()) {
            rscMetadataS = null;
        }
        if (rscMetadataS != null && (rscMetadataS.a() & 1024) != 0) {
            g9 g9Var2 = new g9(h9.d);
            g9Var2.d = "RSC init";
            StringBuilder sb = new StringBuilder("targets: ");
            sb.append(listA != null ? Integer.valueOf(((LinkedList) listA).size()) : null);
            g9Var2.f41002e = sb.toString();
            g9Var2.a();
        }
        pc pcVar = (pc) this.f40941b.f40744w.a();
        MotionMetadata motionMetadataJ = MetaData.E().J();
        if (motionMetadataJ != null && motionMetadataJ.u()) {
            motionMetadata = motionMetadataJ;
        }
        if (motionMetadata != null) {
            pcVar.f41365e = Math.random() < motionMetadata.k();
        }
        pcVar.f41364c.post(new oc(pcVar));
        SensorsData sensorsDataU = MetaData.E().U();
        if (sensorsDataU != null && sensorsDataU.h()) {
            ((lg) this.f40941b.x.a()).a(this.f40940a);
        }
        o0 o0Var = (o0) this.f40941b.f40742p.a();
        int i6 = z2 ? 1 : 2;
        Locale locale = Locale.ENGLISH;
        String strG = android.support.v4.media.a.g(o0Var.f41289b.incrementAndGet(), i6, "cnt=", ",mds=");
        g9 g9Var3 = new g9(h9.d);
        g9Var3.d = MobileAdsBridgeBase.initializeMethodName;
        g9Var3.f41002e = strG;
        g9Var3.a();
        ((tk) this.f40941b.f40735b.a()).b();
        String strF = MetaData.E().F();
        if (strF != null) {
            String version = StartAppSDK.getVersion();
            String[] strArrSplit = strF.split("\\.");
            String[] strArrSplit2 = version.split("\\.");
            int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
            int i7 = 0;
            while (true) {
                if (i7 >= iMin) {
                    if (strArrSplit.length <= strArrSplit2.length) {
                        if (strArrSplit.length >= strArrSplit2.length) {
                            break;
                        }
                        i2 = -(iMin + 1);
                        break;
                    }
                    i2 = iMin + 1;
                    break;
                }
                try {
                    int i8 = Integer.parseInt(strArrSplit[i7]);
                    int i9 = Integer.parseInt(strArrSplit2[i7]);
                    if (i8 > i9) {
                        i2 = i7 + 1;
                        break;
                    } else {
                        if (i8 < i9) {
                            i2 = -(i7 + 1);
                            break;
                        }
                        i7++;
                    }
                } catch (NumberFormatException unused2) {
                    int iCompareTo = strArrSplit[i7].compareTo(strArrSplit2[i7]);
                    if (iCompareTo > 0) {
                        i2 = i7 + 1;
                        break;
                    } else if (iCompareTo >= 0) {
                        i7++;
                    }
                }
            }
            if (i2 > 0) {
                Log.println(5, "StartAppSDK", "Current SDK version (" + StartAppSDK.getVersion() + ") is outdated. Integrate the most recent version (" + strF + ") in order to improve your ads performance.");
            }
        }
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a() {
        o0 o0Var = (o0) this.f40941b.f40742p.a();
        Locale locale = Locale.ENGLISH;
        String strK = androidx.datastore.preferences.protobuf.a.k("cnt=", o0Var.f41289b.incrementAndGet(), ",mds=0");
        g9 g9Var = new g9(h9.d);
        g9Var.d = MobileAdsBridgeBase.initializeMethodName;
        g9Var.f41002e = strK;
        g9Var.a();
        ((tk) this.f40941b.f40735b.a()).b();
    }
}
