package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.applovin.impl.Z;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.metadata.a;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.internal.model.Cookie;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzlj extends zzg {
    protected zzky zza;
    final zzx zzb;
    protected boolean zzc;
    private zzjp zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private boolean zzi;
    private int zzj;
    private zzay zzk;
    private zzay zzl;
    private PriorityQueue zzm;
    private boolean zzn;
    private zzjl zzo;
    private final AtomicLong zzp;
    private long zzq;
    private zzay zzr;
    private SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private zzay zzt;
    private final zzpo zzv;

    public zzlj(zzic zzicVar) {
        super(zzicVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzv = new zzkn(this);
        this.zzg = new AtomicReference();
        this.zzo = zzjl.zza;
        this.zzq = -1L;
        this.zzp = new AtomicLong(0L);
        this.zzb = new zzx(zzicVar);
    }

    private final zzlr zzar(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.zzc).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strZzl = this.zzu.zzv().zzl();
            zzic zzicVar = this.zzu;
            zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
            Long lValueOf = Long.valueOf(zzomVar.zza);
            zzgsVarZzk.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.zzc, Integer.valueOf(zzomVar.zzb.length));
            if (!TextUtils.isEmpty(zzomVar.zzg)) {
                zzicVar.zzaV().zzk().zzc("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.zzg);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzomVar.zzd;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            zzlo zzloVarZzn = zzicVar.zzn();
            byte[] bArr = zzomVar.zzb;
            zzll zzllVar = new zzll() { // from class: com.google.android.gms.measurement.internal.zzkz
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r8
  0x002e: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzll
                public final /* synthetic */ void zza(String str2, int i2, Throwable th, byte[] bArr2, Map map2) {
                    zzlr zzlrVar;
                    zzlj zzljVar = this.zza;
                    zzljVar.zzg();
                    zzom zzomVar2 = zzomVar;
                    if (i2 == 200 || i2 == 204) {
                        if (th == null) {
                            zzljVar.zzu.zzaV().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i2), th);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i2))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else if (i2 == 304) {
                        i2 = 304;
                        if (th == null) {
                            zzljVar.zzu.zzaV().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i2), th);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i2))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else {
                        zzljVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i2), th);
                        if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i2))) {
                            zzlrVar = zzlr.BACKOFF;
                        } else {
                            zzlrVar = zzlr.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    zznl zznlVarZzt = zzljVar.zzu.zzt();
                    long j = zzomVar2.zza;
                    zznlVarZzt.zzy(new zzaf(j, zzlrVar.zza(), zzomVar2.zzf));
                    zzljVar.zzu.zzaV().zzk().zzc("[sgtm] Updated status for row_id", Long.valueOf(j), zzlrVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(zzlrVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            zzloVarZzn.zzw();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(bArr);
            Preconditions.checkNotNull(zzllVar);
            zzloVarZzn.zzu.zzaW().zzm(new zzln(zzloVarZzn, strZzl, url, bArr, map, zzllVar));
            try {
                zzic zzicVar2 = zzicVar.zzk().zzu;
                long jCurrentTimeMillis = zzicVar2.zzaZ().currentTimeMillis();
                long j = jCurrentTimeMillis + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = j - zzicVar2.zzaZ().currentTimeMillis()) {
                        try {
                            atomicReference.wait(jCurrentTimeMillis2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Z.C(this.zzu, "[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e2) {
            this.zzu.zzaV().zzb().zzd("[sgtm] Bad upload url for row_id", zzomVar.zzc, Long.valueOf(zzomVar.zza), e2);
            return zzlr.FAILURE;
        }
    }

    private final void zzas(Boolean bool, boolean z2) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzj().zzb("Setting app measurement enabled (FE)", bool);
        zzicVar.zzd().zzh(bool);
        if (z2) {
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzu.zzE() || !(bool == null || bool.booleanValue())) {
            zzal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzat, reason: merged with bridge method [inline-methods] */
    public final void zzal() {
        zzlj zzljVar;
        zzg();
        zzic zzicVar = this.zzu;
        String strZza = zzicVar.zzd().zzh.zza();
        if (strZza == null) {
            zzljVar = this;
        } else if ("unset".equals(strZza)) {
            zzljVar = this;
            zzljVar.zzN("app", "_npa", null, zzicVar.zzaZ().currentTimeMillis());
        } else {
            zzN("app", "_npa", Long.valueOf(true != a.g.equals(strZza) ? 0L : 1L), zzicVar.zzaZ().currentTimeMillis());
            zzljVar = this;
        }
        if (!zzljVar.zzu.zzB() || !zzljVar.zzc) {
            zzicVar.zzaV().zzj().zza("Updating Scion state (FE)");
            zzljVar.zzu.zzt().zzi();
        } else {
            zzicVar.zzaV().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzU();
            zzljVar.zzu.zzh().zza.zza();
            zzicVar.zzaW().zzj(new zzjz(this));
        }
    }

    public final void zzA(zzjl zzjlVar) {
        zzg();
        boolean z2 = (zzjlVar.zzo(zzjk.ANALYTICS_STORAGE) && zzjlVar.zzo(zzjk.AD_STORAGE)) || this.zzu.zzt().zzO();
        zzic zzicVar = this.zzu;
        if (z2 != zzicVar.zzE()) {
            zzicVar.zzD(z2);
            zzhh zzhhVarZzd = this.zzu.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            Boolean boolValueOf = zzhhVarZzd.zzd().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzhhVarZzd.zzd().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z2 || boolValueOf == null || boolValueOf.booleanValue()) {
                zzas(Boolean.valueOf(z2), false);
            }
        }
    }

    public final void zzB(String str, String str2, Bundle bundle) {
        zzC(str, str2, bundle, true, true, this.zzu.zzaZ().currentTimeMillis());
    }

    public final void zzC(String str, String str2, Bundle bundle, boolean z2, boolean z3, long j) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.zzu.zzs().zzj(bundle2, j);
            return;
        }
        boolean z4 = true;
        if (z3 && this.zzd != null && !zzpp.zzZ(str2)) {
            z4 = false;
        }
        boolean z5 = z4;
        if (str == null) {
            str = "app";
        }
        zzJ(str, str2, j, bundle2, z3, z5, z2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzD() {
        zzod zzodVar;
        zzod zzodVar2;
        com.google.android.gms.internal.measurement.zzkq zzkqVar;
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzj().zza("Handle tcf update.");
        SharedPreferences sharedPreferencesZze = zzicVar.zzd().zze();
        HashMap map = new HashMap();
        zzfx zzfxVar = zzfy.zzaZ;
        int i2 = 2;
        if (((Boolean) zzfxVar.zzb(null)).booleanValue()) {
            int i3 = zzof.zzb;
            com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            zzoe zzoeVar = zzoe.CONSENT;
            Objects.requireNonNull(zzkpVar);
            Objects.requireNonNull(zzoeVar);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(zzkpVar, zzoeVar);
            com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            zzoe zzoeVar2 = zzoe.FLEXIBLE_LEGITIMATE_INTEREST;
            Objects.requireNonNull(zzkpVar2);
            Objects.requireNonNull(zzoeVar2);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(zzkpVar2, zzoeVar2);
            com.google.android.gms.internal.measurement.zzkp zzkpVar3 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            Objects.requireNonNull(zzkpVar3);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = new AbstractMap.SimpleImmutableEntry(zzkpVar3, zzoeVar);
            com.google.android.gms.internal.measurement.zzkp zzkpVar4 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            Objects.requireNonNull(zzkpVar4);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry4 = new AbstractMap.SimpleImmutableEntry(zzkpVar4, zzoeVar);
            com.google.android.gms.internal.measurement.zzkp zzkpVar5 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            Objects.requireNonNull(zzkpVar5);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry5 = new AbstractMap.SimpleImmutableEntry(zzkpVar5, zzoeVar2);
            com.google.android.gms.internal.measurement.zzkp zzkpVar6 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS;
            Objects.requireNonNull(zzkpVar6);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry6 = new AbstractMap.SimpleImmutableEntry(zzkpVar6, zzoeVar2);
            com.google.android.gms.internal.measurement.zzkp zzkpVar7 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS;
            Objects.requireNonNull(zzkpVar7);
            List listAsList = Arrays.asList(simpleImmutableEntry, simpleImmutableEntry2, simpleImmutableEntry3, simpleImmutableEntry4, simpleImmutableEntry5, simpleImmutableEntry6, new AbstractMap.SimpleImmutableEntry(zzkpVar7, zzoeVar2));
            ImmutableMap.Builder builder = new ImmutableMap.Builder(listAsList instanceof Collection ? listAsList.size() : 4);
            builder.d(listAsList);
            ImmutableMap immutableMapA = builder.a(true);
            ImmutableSet immutableSetZ = ImmutableSet.z("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesZze.contains("IABTCF_TCString");
            int iZzb = zzof.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
            int iZzb2 = zzof.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
            int iZzb3 = zzof.zzb(sharedPreferencesZze, Cookie.IABTCF_GDPR_APPLIES);
            int iZzb4 = zzof.zzb(sharedPreferencesZze, "IABTCF_PurposeOneTreatment");
            int iZzb5 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
            String strZza = zzof.zza(sharedPreferencesZze, "IABTCF_PublisherCC");
            ImmutableMap.Builder builderD = ImmutableMap.d();
            UnmodifiableIterator it = immutableMapA.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzkp zzkpVar8 = (com.google.android.gms.internal.measurement.zzkp) it.next();
                int iZza = zzkpVar8.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(iZza);
                String strZza2 = zzof.zza(sharedPreferencesZze, sb.toString());
                if (TextUtils.isEmpty(strZza2) || strZza2.length() < 755) {
                    zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strZza2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.zzkq.values().length || iDigit == 0) {
                        zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != 1) {
                        zzkqVar = iDigit != i2 ? com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    } else {
                        zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                builderD.c(zzkpVar8, zzkqVar);
                i2 = 2;
            }
            ImmutableMap immutableMapA2 = builderD.a(true);
            String strZza3 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
            String strZza4 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
            boolean z2 = !TextUtils.isEmpty(strZza4) && strZza4.length() >= 755 && strZza4.charAt(754) == '1';
            String strZza5 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeLegitimateInterests");
            String strZza6 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorLegitimateInterests");
            boolean z3 = !TextUtils.isEmpty(strZza6) && strZza6.length() >= 755 && strZza6.charAt(754) == '1';
            cArr[0] = '2';
            zzodVar = new zzod(zzof.zzd(immutableMapA, immutableMapA2, immutableSetZ, cArr, iZzb, iZzb5, iZzb3, iZzb2, iZzb4, strZza, strZza3, strZza5, z2, z3, zContains));
        } else {
            String strZza7 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
            if (!"".equals(strZza7) && strZza7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strZza7.charAt(754)));
            }
            int iZzb6 = zzof.zzb(sharedPreferencesZze, Cookie.IABTCF_GDPR_APPLIES);
            if (iZzb6 != -1) {
                map.put("gdprApplies", String.valueOf(iZzb6));
            }
            int iZzb7 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
            if (iZzb7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iZzb7));
            }
            int iZzb8 = zzof.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
            if (iZzb8 != -1) {
                map.put("PolicyVersion", String.valueOf(iZzb8));
            }
            String strZza8 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
            if (!"".equals(strZza8)) {
                map.put("PurposeConsents", strZza8);
            }
            int iZzb9 = zzof.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
            if (iZzb9 != -1) {
                map.put("CmpSdkID", String.valueOf(iZzb9));
            }
            zzodVar = new zzod(map);
        }
        zzicVar.zzaV().zzk().zzb("Tcf preferences read", zzodVar);
        if (!zzicVar.zzc().zzp(null, zzfxVar)) {
            if (zzicVar.zzd().zzm(zzodVar)) {
                Bundle bundleZzb = zzodVar.zzb();
                zzicVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb);
                if (bundleZzb != Bundle.EMPTY) {
                    zzp(bundleZzb, -30, zzicVar.zzaZ().currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", zzodVar.zze());
                zzF("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzhhVarZzd.zzg();
        String string = zzhhVarZzd.zzd().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            zzodVar2 = new zzod(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split(d9.i.f24747b);
                if (strArrSplit.length >= 2 && zzof.zza.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzodVar2 = new zzod(map2);
        }
        if (zzicVar.zzd().zzm(zzodVar)) {
            Bundle bundleZzb2 = zzodVar.zzb();
            zzicVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb2);
            if (bundleZzb2 != Bundle.EMPTY) {
                zzp(bundleZzb2, -30, zzicVar.zzaZ().currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", zzodVar.zzd(zzodVar2));
            bundle2.putString("_tcfd2", zzodVar.zzc());
            bundle2.putString("_tcfd", zzodVar.zze());
            zzF("auto", "_tcf", bundle2);
        }
    }

    public final void zzE() {
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzj().zza("Register tcfPrefChangeListener.");
        if (this.zzs == null) {
            this.zzt = new zzkb(this, this.zzu);
            this.zzs = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.zza.zzag(sharedPreferences, str);
                }
            };
        }
        zzicVar.zzd().zze().registerOnSharedPreferenceChangeListener(this.zzs);
    }

    public final void zzF(String str, String str2, Bundle bundle) {
        zzg();
        zzG(str, str2, this.zzu.zzaZ().currentTimeMillis(), bundle);
    }

    public final void zzG(String str, String str2, long j, Bundle bundle) {
        zzg();
        boolean z2 = true;
        if (this.zzd != null && !zzpp.zzZ(str2)) {
            z2 = false;
        }
        zzH(str, str2, j, bundle, true, z2, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzH(String str, String str2, long j, Bundle bundle, boolean z2, boolean z3, boolean z4, String str3) {
        boolean z5;
        int i2;
        zzic zzicVar;
        long j2;
        long j3;
        String str4;
        zzic zzicVar2;
        long j4;
        Bundle[] bundleArr;
        String str5 = str;
        Preconditions.checkNotEmpty(str5);
        Preconditions.checkNotNull(bundle);
        zzg();
        zzb();
        zzic zzicVar3 = this.zzu;
        if (!zzicVar3.zzB()) {
            this.zzu.zzaV().zzj().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzp = this.zzu.zzv().zzp();
        if (listZzp != null && !listZzp.contains(str2)) {
            this.zzu.zzaV().zzj().zzc("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!zzicVar3.zzp() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzu.zzaY().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod(MobileAdsBridgeBase.initializeMethodName, Context.class).invoke(null, this.zzu.zzaY());
                } catch (Exception e2) {
                    this.zzu.zzaV().zze().zzb("Failed to invoke Tag Manager's initialize() method", e2);
                }
            } catch (ClassNotFoundException unused) {
                this.zzu.zzaV().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        zzic zzicVar4 = this.zzu;
        if (!zzicVar4.zzc().zzp(null, zzfy.zzbf) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            zzicVar4.zzaU();
            zzN("auto", "_lgclid", bundle.getString("gclid"), zzicVar4.zzaZ().currentTimeMillis());
        }
        zzlj zzljVar = this;
        zzicVar4.zzaU();
        if (z2 && zzpp.zzaf(str2)) {
            zzicVar4.zzk().zzI(bundle, zzicVar4.zzd().zzt.zza());
        }
        if (!z4) {
            zzicVar4.zzaU();
            if (!"_iap".equals(str2)) {
                zzic zzicVar5 = zzljVar.zzu;
                zzpp zzppVarZzk = zzicVar5.zzk();
                int i3 = 2;
                if (zzppVarZzk.zzj("event", str2)) {
                    if (zzppVarZzk.zzl("event", zzjm.zza, zzjm.zzb, str2)) {
                        zzppVarZzk.zzu.zzc();
                        if (zzppVarZzk.zzm("event", 40, str2)) {
                            i3 = 0;
                        }
                    } else {
                        i3 = 13;
                    }
                }
                if (i3 != 0) {
                    zzicVar4.zzaV().zzd().zzb("Invalid public event name. Event will not be logged (FE)", zzicVar4.zzl().zza(str2));
                    zzpp zzppVarZzk2 = zzicVar5.zzk();
                    zzicVar5.zzc();
                    zzicVar5.zzk().zzN(zzljVar.zzv, null, i3, "_ev", zzppVarZzk2.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzicVar4.zzaU();
        zzic zzicVar6 = zzljVar.zzu;
        zzlu zzluVarZzh = zzicVar6.zzs().zzh(false);
        if (zzluVarZzh != null && !bundle.containsKey("_sc")) {
            zzluVarZzh.zzd = true;
        }
        zzpp.zzav(zzluVarZzh, bundle, z2 && !z4);
        boolean zEquals = "am".equals(str5);
        boolean zZzZ = zzpp.zzZ(str2);
        if (!z2 || zzljVar.zzd == null || zZzZ) {
            z5 = zEquals;
        } else {
            if (!zEquals) {
                zzicVar4.zzaV().zzj().zzc("Passing event to registered event handler (FE)", zzicVar4.zzl().zza(str2), zzicVar4.zzl().zze(bundle));
                Preconditions.checkNotNull(zzljVar.zzd);
                zzljVar.zzd.interceptEvent(str5, str2, bundle, j);
                return;
            }
            z5 = true;
        }
        zzic zzicVar7 = zzljVar.zzu;
        if (zzicVar7.zzH()) {
            int iZzn = zzicVar4.zzk().zzn(str2);
            if (iZzn != 0) {
                zzicVar4.zzaV().zzd().zzb("Invalid event name. Event will not be logged (FE)", zzicVar4.zzl().zza(str2));
                zzpp zzppVarZzk3 = zzicVar4.zzk();
                zzicVar4.zzc();
                zzicVar7.zzk().zzN(zzljVar.zzv, str3, iZzn, "_ev", zzppVarZzk3.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzF = zzicVar4.zzk().zzF(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z4);
            Preconditions.checkNotNull(bundleZzF);
            zzicVar4.zzaU();
            if (zzicVar6.zzs().zzh(false) == null || !"_ae".equals(str2)) {
                i2 = 0;
                zzicVar = zzicVar6;
                j2 = 0;
            } else {
                zzoa zzoaVar = zzicVar6.zzh().zzb;
                j2 = 0;
                long jElapsedRealtime = zzoaVar.zzc.zzu.zzaZ().elapsedRealtime();
                i2 = 0;
                zzicVar = zzicVar6;
                long j5 = jElapsedRealtime - zzoaVar.zzb;
                zzoaVar.zzb = jElapsedRealtime;
                if (j5 > 0) {
                    zzicVar4.zzk().zzak(bundleZzF, j5);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                zzpp zzppVarZzk4 = zzicVar4.zzk();
                String string = bundleZzF.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                zzic zzicVar8 = zzppVarZzk4.zzu;
                if (Objects.equals(string, zzicVar8.zzd().zzq.zza())) {
                    zzicVar8.zzaV().zzj().zza("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                zzicVar8.zzd().zzq.zzb(string);
            } else if ("_ae".equals(str2)) {
                String strZza = zzicVar4.zzk().zzu.zzd().zzq.zza();
                if (!TextUtils.isEmpty(strZza)) {
                    bundleZzF.putString("_ffr", strZza);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzF);
            boolean zZzi = zzicVar4.zzc().zzp(null, zzfy.zzaU) ? zzicVar.zzh().zzi() : zzicVar4.zzd().zzn.zza();
            if (zzicVar4.zzd().zzk.zza() > j2) {
                zzicVar2 = zzicVar4;
                if (zzicVar4.zzd().zzp(j) && zZzi) {
                    zzicVar2.zzaV().zzk().zza("Current session is expired, remove the session number, ID, and engagement time");
                    j3 = j2;
                    str4 = "_ae";
                    zzN("auto", "_sid", null, zzicVar2.zzaZ().currentTimeMillis());
                    zzN("auto", "_sno", null, zzicVar2.zzaZ().currentTimeMillis());
                    zzN("auto", "_se", null, zzicVar2.zzaZ().currentTimeMillis());
                    zzljVar = this;
                    zzicVar2.zzd().zzl.zzb(j3);
                } else {
                    j3 = j2;
                    str4 = "_ae";
                }
            } else {
                j3 = j2;
                str4 = "_ae";
                zzicVar2 = zzicVar4;
            }
            if (bundleZzF.getLong("extend_session", j3) == 1) {
                zzicVar2.zzaV().zzk().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j4 = j;
                zzicVar7.zzh().zza.zzb(j4, true);
            } else {
                j4 = j;
            }
            ArrayList arrayList2 = new ArrayList(bundleZzF.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i4 = i2; i4 < size; i4++) {
                String str6 = (String) arrayList2.get(i4);
                if (str6 != null) {
                    zzicVar2.zzk();
                    Object obj = bundleZzF.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i2] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzF.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i5 = i2;
            while (i5 < arrayList.size()) {
                Bundle bundleZzab = (Bundle) arrayList.get(i5);
                String str7 = i5 != 0 ? "_ep" : str2;
                bundleZzab.putString("_o", str5);
                if (z3) {
                    bundleZzab = zzicVar2.zzk().zzab(bundleZzab, null);
                }
                Bundle bundle2 = bundleZzab;
                zzicVar.zzt().zzn(new zzbg(str7, new zzbe(bundle2), str5, j4), str3);
                if (!z5) {
                    Iterator it = zzljVar.zze.iterator();
                    while (it.hasNext()) {
                        ((zzjq) it.next()).onEvent(str, str2, new Bundle(bundle2), j);
                    }
                }
                i5++;
                str5 = str;
                j4 = j;
            }
            zzicVar2.zzaU();
            if (zzicVar.zzs().zzh(i2) == null || !str4.equals(str2)) {
                return;
            }
            zzicVar.zzh().zzb.zzd(true, true, zzicVar2.zzaZ().elapsedRealtime());
        }
    }

    public final void zzI(String str, String str2, Bundle bundle, String str3) {
        zzic.zzL();
        zzJ("auto", str2, this.zzu.zzaZ().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zzJ(String str, String str2, long j, Bundle bundle, boolean z2, boolean z3, boolean z4, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i2];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelable);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        this.zzu.zzaW().zzj(new zzkc(this, str, str2, j, bundle2, z2, z3, z4, str3));
    }

    public final void zzK(String str, String str2, Object obj, boolean z2) {
        zzL("auto", "_ldl", obj, true, this.zzu.zzaZ().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public final void zzL(String str, String str2, Object obj, boolean z2, long j) {
        int i2;
        int iZzp;
        String str3;
        zzic zzicVar;
        int iZzK;
        Object objZzL;
        if (!z2) {
            zzpp zzppVarZzk = this.zzu.zzk();
            if (!zzppVarZzk.zzj("user property", str2)) {
                i2 = 6;
            } else if (zzppVarZzk.zzl("user property", zzjo.zza, null, str2)) {
                zzppVarZzk.zzu.zzc();
                if (zzppVarZzk.zzm("user property", 24, str2)) {
                    i2 = 0;
                } else {
                    i2 = 6;
                }
            } else {
                iZzp = 15;
            }
            if (i2 != 0) {
                zzic zzicVar2 = this.zzu;
                zzpp zzppVarZzk2 = zzicVar2.zzk();
                zzicVar2.zzc();
                this.zzu.zzk().zzN(this.zzv, null, i2, "_ev", zzppVarZzk2.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            if (obj != null) {
                zzM(str3, str2, j, null);
                return;
            }
            zzicVar = this.zzu;
            iZzK = zzicVar.zzk().zzK(str2, obj);
            if (iZzK != 0) {
                objZzL = zzicVar.zzk().zzL(str2, obj);
                if (objZzL != null) {
                    zzM(str3, str2, j, objZzL);
                    return;
                }
                return;
            }
            zzpp zzppVarZzk3 = zzicVar.zzk();
            zzicVar.zzc();
            this.zzu.zzk().zzN(this.zzv, null, iZzK, "_ev", zzppVarZzk3.zzC(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        }
        iZzp = this.zzu.zzk().zzp(str2);
        i2 = iZzp;
        if (i2 != 0) {
            zzic zzicVar3 = this.zzu;
            zzpp zzppVarZzk4 = zzicVar3.zzk();
            zzicVar3.zzc();
            if (str2 != null) {
            }
            this.zzu.zzk().zzN(this.zzv, null, i2, "_ev", zzppVarZzk4.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            zzM(str3, str2, j, null);
            return;
        }
        zzicVar = this.zzu;
        iZzK = zzicVar.zzk().zzK(str2, obj);
        if (iZzK != 0) {
            objZzL = zzicVar.zzk().zzL(str2, obj);
            if (objZzL != null) {
                zzM(str3, str2, j, objZzL);
                return;
            }
            return;
        }
        zzpp zzppVarZzk5 = zzicVar.zzk();
        zzicVar.zzc();
        this.zzu.zzk().zzN(this.zzv, null, iZzK, "_ev", zzppVarZzk5.zzC(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }

    public final void zzM(String str, String str2, long j, Object obj) {
        this.zzu.zzaW().zzj(new zzkd(this, str, str2, obj, j));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    public final void zzN(String str, String str2, Object obj, long j) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzb();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j2 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    zzic zzicVar = this.zzu;
                    Long lValueOf = Long.valueOf(j2);
                    zzicVar.zzd().zzh.zzb(lValueOf.longValue() == 1 ? a.g : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.zzu.zzd().zzh.zzb("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.zzu.zzd().zzh.zzb("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.zzu.zzaV().zzk().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzB()) {
            this.zzu.zzaV().zzk().zza("User property not set since app measurement is disabled");
        } else if (zzicVar2.zzH()) {
            this.zzu.zzt().zzA(new zzpl(str4, j, obj3, str));
        }
    }

    public final List zzO(boolean z2) {
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zza("Getting user properties (FE)");
        if (zzicVar.zzaW().zze()) {
            Z.u(zzicVar, "Cannot get all user properties from analytics worker thread");
            return Collections.EMPTY_LIST;
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            Z.u(zzicVar, "Cannot get all user properties from main thread");
            return Collections.EMPTY_LIST;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new zzkf(this, atomicReference, z2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzicVar.zzaV().zzb().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z2));
        return Collections.EMPTY_LIST;
    }

    public final Map zzP(String str, String str2, boolean z2) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaW().zze()) {
            Z.u(zzicVar, "Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            Z.u(zzicVar, "Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new zzkl(this, atomicReference, null, str, str2, z2));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            zzicVar.zzaV().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z2));
            return Collections.EMPTY_MAP;
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzpl zzplVar : list) {
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                arrayMap.put(zzplVar.zzb, objZza);
            }
        }
        return arrayMap;
    }

    public final String zzQ() {
        return (String) this.zzg.get();
    }

    public final void zzR(String str) {
        this.zzg.set(str);
    }

    public final void zzS() {
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzo.zza()) {
            zzicVar.zzaV().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jZza = zzicVar.zzd().zzp.zza();
        zzicVar.zzd().zzp.zzb(1 + jZza);
        zzicVar.zzc();
        if (jZza >= 5) {
            zzicVar.zzaV().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzicVar.zzd().zzo.zzb(true);
        } else {
            if (this.zzr == null) {
                this.zzr = new zzkg(this, this.zzu);
            }
            this.zzr.zzb(0L);
        }
    }

    public final void zzT(long j) {
        this.zzg.set(null);
        this.zzu.zzaW().zzj(new zzkh(this, j));
    }

    public final void zzU() {
        zzg();
        zzb();
        if (this.zzu.zzH()) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzalVarZzc.zzu.zzaU();
            Boolean boolZzr = zzalVarZzc.zzr("google_analytics_deferred_deep_link_enabled");
            if (boolZzr != null && boolZzr.booleanValue()) {
                zzicVar.zzaV().zzj().zza("Deferred Deep Link feature enabled.");
                zzicVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlh
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzS();
                    }
                });
            }
            this.zzu.zzt().zzE();
            this.zzc = false;
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzhhVarZzd.zzg();
            String string = zzhhVarZzd.zzd().getString("previous_os_version", null);
            zzhhVarZzd.zzu.zzu().zzw();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzicVar.zzu().zzw();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzF("auto", "_ou", bundle);
        }
    }

    public final void zzV(zzjp zzjpVar) {
        zzjp zzjpVar2;
        zzg();
        zzb();
        if (zzjpVar != null && zzjpVar != (zzjpVar2 = this.zzd)) {
            Preconditions.checkState(zzjpVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzjpVar;
    }

    public final void zzW(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.add(zzjqVar)) {
            return;
        }
        Z.C(this.zzu, "OnEventListener already registered");
    }

    public final void zzX(zzjq zzjqVar) {
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.remove(zzjqVar)) {
            return;
        }
        Z.C(this.zzu, "OnEventListener had not been registered");
    }

    public final int zzY(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzu.zzc();
        return 25;
    }

    public final void zzZ(Bundle bundle) {
        zzaa(bundle, this.zzu.zzaZ().currentTimeMillis());
    }

    public final void zzaa(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            Z.C(this.zzu, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzjh.zzb(bundle2, "app_id", String.class, null);
        zzjh.zzb(bundle2, "origin", String.class, null);
        zzjh.zzb(bundle2, "name", String.class, null);
        zzjh.zzb(bundle2, "value", Object.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zzic zzicVar = this.zzu;
        if (zzicVar.zzk().zzp(string) != 0) {
            zzicVar.zzaV().zzb().zzb("Invalid conditional user property name", zzicVar.zzl().zzc(string));
            return;
        }
        if (zzicVar.zzk().zzK(string, obj) != 0) {
            zzicVar.zzaV().zzb().zzc("Invalid conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        Object objZzL = zzicVar.zzk().zzL(string, obj);
        if (objZzL == null) {
            zzicVar.zzaV().zzb().zzc("Unable to normalize conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        zzjh.zza(bundle2, objZzL);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            zzicVar.zzc();
            if (j2 > 15552000000L || j2 < 1) {
                zzicVar.zzaV().zzb().zzc("Invalid conditional user property timeout", zzicVar.zzl().zzc(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        zzicVar.zzc();
        if (j3 > 15552000000L || j3 < 1) {
            zzicVar.zzaV().zzb().zzc("Invalid conditional user property time to live", zzicVar.zzl().zzc(string), Long.valueOf(j3));
        } else {
            zzicVar.zzaW().zzj(new zzki(this, bundle2));
        }
    }

    public final void zzab(String str, String str2, Bundle bundle) {
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzaZ().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzicVar.zzaW().zzj(new zzkj(this, bundle2));
    }

    public final ArrayList zzac(String str, String str2) {
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaW().zze()) {
            zzicVar.zzaV().zzb().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            zzicVar.zzaV().zzb().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get conditional user properties", new zzkk(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzpp.zzas(list);
        }
        zzicVar.zzaV().zzb().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String zzad() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zza;
        }
        return null;
    }

    public final String zzae() {
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            return zzluVarZzl.zzb;
        }
        return null;
    }

    public final String zzaf() {
        try {
            return zzlt.zza(this.zzu.zzaY(), "google_app_id", this.zzu.zzq());
        } catch (IllegalStateException e2) {
            this.zzu.zzaV().zzb().zzb("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final /* synthetic */ void zzag(SharedPreferences sharedPreferences, String str) {
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzp(null, zzfy.zzaZ)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                zzicVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
                ((zzay) Preconditions.checkNotNull(this.zzt)).zzb(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, Cookie.IABTCF_GDPR_APPLIES) || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            zzicVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
            ((zzay) Preconditions.checkNotNull(this.zzt)).zzb(500L);
        }
    }

    public final /* synthetic */ void zzah(Bundle bundle) {
        Bundle bundle2;
        int i2;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            zzic zzicVar = this.zzu;
            bundle2 = new Bundle(zzicVar.zzd().zzt.zza());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (zzicVar.zzk().zzt(obj)) {
                        zzicVar.zzk().zzN(this.zzv, null, 27, null, null, 0);
                    }
                    zzicVar.zzaV().zzh().zzc("Invalid default event parameter type. Name, value", next, obj);
                } else if (zzpp.zzZ(next)) {
                    zzicVar.zzaV().zzh().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzicVar.zzk().zzu("param", next, zzicVar.zzc().zze(null, false), obj)) {
                    zzicVar.zzk().zzM(bundle2, next, obj);
                }
            }
            zzicVar.zzk();
            int iZzc = zzicVar.zzc().zzc();
            if (bundle2.size() > iZzc) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i2++;
                    if (i2 > iZzc) {
                        bundle2.remove(str);
                    }
                }
                zzicVar.zzk().zzN(this.zzv, null, 26, null, null, 0);
                zzicVar.zzaV().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        zzic zzicVar2 = this.zzu;
        zzicVar2.zzd().zzt.zzb(bundle2);
        if (!bundle.isEmpty() || zzicVar2.zzc().zzp(null, zzfy.zzaW)) {
            this.zzu.zzt().zzH(bundle2);
        }
    }

    public final /* synthetic */ void zzai(int i2) {
        if (this.zzk == null) {
            this.zzk = new zzjx(this, this.zzu);
        }
        this.zzk.zzb(((long) i2) * 1000);
    }

    public final /* synthetic */ void zzaj(Boolean bool, boolean z2) {
        zzas(bool, true);
    }

    public final /* synthetic */ void zzak(zzjl zzjlVar, long j, boolean z2, boolean z3) {
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzjl zzjlVarZzl = zzicVar.zzd().zzl();
        if (j <= this.zzq && zzjl.zzu(zzjlVarZzl.zzb(), zzjlVar.zzb())) {
            zzicVar.zzaV().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjlVar);
            return;
        }
        zzhh zzhhVarZzd = zzicVar.zzd();
        zzic zzicVar2 = zzhhVarZzd.zzu;
        zzhhVarZzd.zzg();
        int iZzb = zzjlVar.zzb();
        if (!zzhhVarZzd.zzk(iZzb)) {
            zzicVar.zzaV().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjlVar.zzb()));
            return;
        }
        zzic zzicVar3 = this.zzu;
        SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
        editorEdit.putString("consent_settings", zzjlVar.zzl());
        editorEdit.putInt("consent_source", iZzb);
        editorEdit.apply();
        zzicVar.zzaV().zzk().zzb("Setting storage consent(FE)", zzjlVar);
        this.zzq = j;
        if (zzicVar3.zzt().zzP()) {
            zzicVar3.zzt().zzk(z2);
        } else {
            zzicVar3.zzt().zzj(z2);
        }
        if (z3) {
            zzicVar3.zzt().zzC(new AtomicReference());
        }
    }

    public final /* synthetic */ void zzam(boolean z2) {
        this.zzi = false;
    }

    public final /* synthetic */ int zzan() {
        return this.zzj;
    }

    public final /* synthetic */ void zzao(int i2) {
        this.zzj = i2;
    }

    public final /* synthetic */ zzay zzap() {
        return this.zzr;
    }

    public final /* synthetic */ int zzaq(Throwable th) {
        String message = th.getMessage();
        this.zzn = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.zzn = true;
        return 1;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh() {
        zzic zzicVar = this.zzu;
        if (!(zzicVar.zzaY().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zzicVar.zzaY().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzu.zzaW().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "boolean test flag value", new zzke(this, atomicReference));
    }

    public final String zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzu.zzaW().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "String test flag value", new zzko(this, atomicReference));
    }

    public final Long zzk() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzu.zzaW().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "long test flag value", new zzkp(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzu.zzaW().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "int test flag value", new zzkq(this, atomicReference));
    }

    public final Double zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzu.zzaW().zzk(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "double test flag value", new zzkr(this, atomicReference));
    }

    public final void zzn(Boolean bool) {
        zzb();
        this.zzu.zzaW().zzj(new zzks(this, bool));
    }

    public final void zzp(Bundle bundle, int i2, long j) {
        Object obj;
        String string;
        zzb();
        zzjl zzjlVar = zzjl.zza;
        zzjk[] zzjkVarArrZzb = zzjj.STORAGE.zzb();
        int length = zzjkVarArrZzb.length;
        int i3 = 0;
        while (true) {
            obj = null;
            if (i3 >= length) {
                break;
            }
            String str = zzjkVarArrZzb[i3].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i3++;
        }
        if (obj != null) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaV().zzh().zzb("Ignoring invalid consent setting", obj);
            zzicVar.zzaV().zzh().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean zZze = this.zzu.zzaW().zze();
        zzjl zzjlVarZze = zzjl.zze(bundle, i2);
        if (zzjlVarZze.zzc()) {
            zzs(zzjlVarZze, zZze);
        }
        zzaz zzazVarZzh = zzaz.zzh(bundle, i2);
        if (zzazVarZzh.zzd()) {
            zzq(zzazVarZzh, zZze);
        }
        Boolean boolZzi = zzaz.zzi(bundle);
        if (boolZzi != null) {
            String str2 = i2 == -30 ? "tcf" : "app";
            if (zZze) {
                zzN(str2, "allow_personalized_ads", boolZzi.toString(), j);
            } else {
                zzL(str2, "allow_personalized_ads", boolZzi.toString(), false, j);
            }
        }
    }

    public final void zzq(zzaz zzazVar, boolean z2) {
        zzkt zzktVar = new zzkt(this, zzazVar);
        if (!z2) {
            this.zzu.zzaW().zzj(zzktVar);
        } else {
            zzg();
            zzktVar.run();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void zzs(com.google.android.gms.measurement.internal.zzjl r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzs(com.google.android.gms.measurement.internal.zzjl, boolean):void");
    }

    public final void zzt(Runnable runnable) {
        zzb();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaW().zze()) {
            Z.u(zzicVar, "Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (zzicVar.zzaW().zzf()) {
            Z.u(zzicVar, "Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            Z.u(zzicVar, "Cannot retrieve and upload batches from main thread");
            return;
        }
        zzicVar.zzaV().zzk().zza("[sgtm] Started client-side batch upload work.");
        boolean z2 = false;
        int size = 0;
        int i2 = 0;
        while (!z2) {
            zzicVar.zzaV().zzk().zza("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaW().zzk(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzli
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu.zzt().zzx(atomicReference, zzoo.zza(zzls.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.zza;
            if (!list.isEmpty()) {
                zzicVar.zzaV().zzk().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    zzlr zzlrVarZzar = zzar((zzom) it.next());
                    if (zzlrVarZzar == zzlr.SUCCESS) {
                        i2++;
                    } else if (zzlrVarZzar == zzlr.BACKOFF) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        zzicVar.zzaV().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i2));
        runnable.run();
    }

    public final void zzu(long j) {
        zzg();
        if (this.zzl == null) {
            this.zzl = new zzju(this, this.zzu);
        }
        this.zzl.zzb(j);
    }

    public final void zzv() {
        zzg();
        zzay zzayVar = this.zzl;
        if (zzayVar != null) {
            zzayVar.zzd();
        }
    }

    public final void zzw() {
        zzqp.zza();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(null, zzfy.zzaQ)) {
            if (zzicVar.zzaW().zze()) {
                Z.u(zzicVar, "Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzicVar.zzaU();
            if (zzae.zza()) {
                Z.u(zzicVar, "Cannot get trigger URIs from main thread");
                return;
            }
            zzb();
            zzicVar.zzaV().zzk().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaW().zzk(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlj zzljVar = this.zza;
                    zzljVar.zzu.zzt().zzw(atomicReference, zzljVar.zzu.zzd().zzi.zza());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzicVar.zzaV().zzd().zza("Timed out waiting for get trigger URIs");
            } else {
                zzicVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzlj zzljVar = this.zza;
                        zzljVar.zzg();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray sparseArrayZzf = zzljVar.zzu.zzd().zzf();
                        for (zzoh zzohVar : list2) {
                            int i2 = zzohVar.zzc;
                            if (!sparseArrayZzf.contains(i2) || ((Long) sparseArrayZzf.get(i2)).longValue() < zzohVar.zzb) {
                                zzljVar.zzy().add(zzohVar);
                            }
                        }
                        zzljVar.zzz();
                    }
                });
            }
        }
    }

    public final boolean zzx() {
        return this.zzn;
    }

    public final PriorityQueue zzy() {
        if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(zzlc.zza, zzld.zza));
        }
        return this.zzm;
    }

    public final void zzz() {
        zzoh zzohVar;
        zzg();
        this.zzn = false;
        if (zzy().isEmpty() || this.zzi || (zzohVar = (zzoh) zzy().poll()) == null) {
            return;
        }
        zzic zzicVar = this.zzu;
        MeasurementManagerFutures measurementManagerFuturesZzT = zzicVar.zzk().zzT();
        if (measurementManagerFuturesZzT != null) {
            this.zzi = true;
            zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
            String str = zzohVar.zza;
            zzgsVarZzk.zzb("Registering trigger URI", str);
            ListenableFuture listenableFutureD = measurementManagerFuturesZzT.d(Uri.parse(str));
            if (listenableFutureD != null) {
                Futures.a(listenableFutureD, new zzjw(this, zzohVar), new zzjv(this));
            } else {
                this.zzi = false;
                zzy().add(zzohVar);
            }
        }
    }
}
