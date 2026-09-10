package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbgi implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbgm.zza(new zzgqs() { // from class: com.google.android.gms.internal.ads.zzbgf
                    @Override // com.google.android.gms.internal.ads.zzgqs
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a9 A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00de A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0121 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:42:0x009f, B:43:0x00a6, B:52:0x00d6, B:66:0x0121, B:79:0x016a, B:80:0x0171, B:82:0x0173, B:83:0x017a, B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:93:0x0009, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x012a A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0137 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015c A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0137, B:72:0x0145, B:73:0x014e, B:75:0x015c, B:77:0x0160, B:78:0x0163, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:88:0x0046, outer: #3 }] */
    public final void zza(Context context) {
        SharedPreferences sharedPreferencesZzb;
        final SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        zzbhu zzbhuVar;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzd) {
                    return;
                }
                if (!this.zza) {
                    this.zza = true;
                }
                this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zzg = context;
                try {
                    this.zzf = Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context2 = this.zzg;
                    Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context2);
                    if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                        context2 = remoteContext;
                    }
                    if (context2 != null) {
                        com.google.android.gms.ads.internal.client.zzbd.zza();
                        sharedPreferencesZzb = zzbgd.zzb(context2);
                    } else {
                        sharedPreferencesZzb = null;
                    }
                    if (sharedPreferencesZzb != null) {
                        zzbjc.zzc(new zzbge(this, sharedPreferencesZzb));
                    }
                    if (!this.zzi) {
                        zzbhu zzbhuVar2 = zzbic.zzd;
                        if (((Long) zzbhuVar2.zze()).longValue() > 0 && zzbfv.zzd(this.zzg) >= ((Long) zzbhuVar2.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                        } else if (this.zzi) {
                            Context context3 = this.zzg;
                            if (!((Boolean) zzbik.zzk.zze()).booleanValue()) {
                                if (((Boolean) zzbik.zzl.zze()).booleanValue()) {
                                    if (new JSONObject((String) zzbgm.zza(new zzgqs() { // from class: com.google.android.gms.internal.ads.zzbgg
                                        @Override // com.google.android.gms.internal.ads.zzgqs
                                        public final /* synthetic */ Object zza() {
                                            return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    com.google.android.gms.ads.internal.client.zzbd.zza();
                                    this.zze = zzbgd.zzb(context2);
                                    if (!this.zzi) {
                                        com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                                    }
                                    if (!((Boolean) zzbik.zzc.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                this.zzc.open();
                            }
                            context2 = this.zzg;
                            if (context2 == null) {
                                com.google.android.gms.ads.internal.client.zzbd.zza();
                                this.zze = zzbgd.zzb(context2);
                                if (!this.zzi) {
                                    com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                                }
                                if (!((Boolean) zzbik.zzc.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        } else {
                            zzbhuVar = zzbic.zzf;
                            if (((Long) zzbhuVar.zze()).longValue() > 0 || zzbfv.zzc(this.zzg) < ((Long) zzbhuVar.zze()).longValue()) {
                                Context context4 = this.zzg;
                                if (!((Boolean) zzbik.zzk.zze()).booleanValue()) {
                                    if (((Boolean) zzbik.zzl.zze()).booleanValue() && (sharedPreferences = context4.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0)) != null) {
                                        try {
                                            if (new JSONObject((String) zzbgm.zza(new zzgqs() { // from class: com.google.android.gms.internal.ads.zzbgg
                                                @Override // com.google.android.gms.internal.ads.zzgqs
                                                public final /* synthetic */ Object zza() {
                                                    return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                                }
                                            })).optBoolean("local_flags_enabled")) {
                                            }
                                        } catch (JSONException unused2) {
                                        }
                                    }
                                    if (context2 == null) {
                                        com.google.android.gms.ads.internal.client.zzbd.zza();
                                        this.zze = zzbgd.zzb(context2);
                                        if (!this.zzi && ((Boolean) zzbik.zze.zze()).booleanValue()) {
                                            com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                                        }
                                        if (!((Boolean) zzbik.zzc.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                                            sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                        }
                                        zzg(this.zze);
                                        this.zzd = true;
                                        this.zza = false;
                                        this.zzc.open();
                                        return;
                                    }
                                    this.zza = false;
                                    this.zzc.open();
                                }
                                context2 = this.zzg;
                                if (context2 == null) {
                                    com.google.android.gms.ads.internal.client.zzbd.zza();
                                    this.zze = zzbgd.zzb(context2);
                                    if (!this.zzi) {
                                        com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                                    }
                                    if (!((Boolean) zzbik.zzc.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                this.zzc.open();
                            } else {
                                this.zzj = true;
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                            }
                        }
                    } else if (this.zzi) {
                        zzbhuVar = zzbic.zzf;
                        if (((Long) zzbhuVar.zze()).longValue() > 0) {
                            Context context5 = this.zzg;
                            if (!((Boolean) zzbik.zzk.zze()).booleanValue()) {
                                if (((Boolean) zzbik.zzl.zze()).booleanValue()) {
                                    if (new JSONObject((String) zzbgm.zza(new zzgqs() { // from class: com.google.android.gms.internal.ads.zzbgg
                                        @Override // com.google.android.gms.internal.ads.zzgqs
                                        public final /* synthetic */ Object zza() {
                                            return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    com.google.android.gms.ads.internal.client.zzbd.zza();
                                    this.zze = zzbgd.zzb(context2);
                                    if (!this.zzi) {
                                        com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                                    }
                                    if (!((Boolean) zzbik.zzc.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                this.zzc.open();
                            }
                            context2 = this.zzg;
                            if (context2 == null) {
                                com.google.android.gms.ads.internal.client.zzbd.zza();
                                this.zze = zzbgd.zzb(context2);
                                if (!this.zzi) {
                                    com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                                }
                                if (!((Boolean) zzbik.zzc.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        } else {
                            Context context6 = this.zzg;
                            if (!((Boolean) zzbik.zzk.zze()).booleanValue()) {
                                if (((Boolean) zzbik.zzl.zze()).booleanValue()) {
                                    if (new JSONObject((String) zzbgm.zza(new zzgqs() { // from class: com.google.android.gms.internal.ads.zzbgg
                                        @Override // com.google.android.gms.internal.ads.zzgqs
                                        public final /* synthetic */ Object zza() {
                                            return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                        }
                                    })).optBoolean("local_flags_enabled")) {
                                    }
                                }
                                if (context2 == null) {
                                    com.google.android.gms.ads.internal.client.zzbd.zza();
                                    this.zze = zzbgd.zzb(context2);
                                    if (!this.zzi) {
                                        com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                                    }
                                    if (!((Boolean) zzbik.zzc.zze()).booleanValue()) {
                                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                    }
                                    zzg(this.zze);
                                    this.zzd = true;
                                    this.zza = false;
                                    this.zzc.open();
                                    return;
                                }
                                this.zza = false;
                                this.zzc.open();
                            }
                            context2 = this.zzg;
                            if (context2 == null) {
                                com.google.android.gms.ads.internal.client.zzbd.zza();
                                this.zze = zzbgd.zzb(context2);
                                if (!this.zzi) {
                                    com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                                }
                                if (!((Boolean) zzbik.zzc.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        }
                    } else {
                        Context context7 = this.zzg;
                        if (!((Boolean) zzbik.zzk.zze()).booleanValue()) {
                            if (((Boolean) zzbik.zzl.zze()).booleanValue()) {
                                if (new JSONObject((String) zzbgm.zza(new zzgqs() { // from class: com.google.android.gms.internal.ads.zzbgg
                                    @Override // com.google.android.gms.internal.ads.zzgqs
                                    public final /* synthetic */ Object zza() {
                                        return sharedPreferences.getString("app_settings_json", JsonUtils.EMPTY_JSON);
                                    }
                                })).optBoolean("local_flags_enabled")) {
                                }
                            }
                            if (context2 == null) {
                                com.google.android.gms.ads.internal.client.zzbd.zza();
                                this.zze = zzbgd.zzb(context2);
                                if (!this.zzi) {
                                    com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                                }
                                if (!((Boolean) zzbik.zzc.zze()).booleanValue()) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                                }
                                zzg(this.zze);
                                this.zzd = true;
                                this.zza = false;
                                this.zzc.open();
                                return;
                            }
                            this.zza = false;
                            this.zzc.open();
                        }
                        context2 = this.zzg;
                        if (context2 == null) {
                            com.google.android.gms.ads.internal.client.zzbd.zza();
                            this.zze = zzbgd.zzb(context2);
                            if (!this.zzi) {
                                com.google.android.gms.ads.internal.client.zzbd.zzd().zza(this.zzg);
                            }
                            if (!((Boolean) zzbik.zzc.zze()).booleanValue()) {
                                sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                            }
                            zzg(this.zze);
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                        this.zza = false;
                        this.zzc.open();
                    }
                } catch (Throwable th) {
                    this.zza = false;
                    this.zzc.open();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbgb zzbgbVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbgbVar.zzf();
            }
        }
        if (zzbgbVar.zzm() != 2) {
            return (zzbgbVar.zzm() == 1 && this.zzh.has(zzbgbVar.zze())) ? zzbgbVar.zzc(this.zzh) : zzbgm.zza(new zzgqs() { // from class: com.google.android.gms.internal.ads.zzbgh
                @Override // com.google.android.gms.internal.ads.zzgqs
                public final /* synthetic */ Object zza() {
                    return this.zza.zzf(zzbgbVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbgbVar.zzf() : zzbgbVar.zza(bundle);
    }

    public final Object zze(zzbgb zzbgbVar) {
        return (this.zzd || this.zza) ? zzd(zzbgbVar) : zzbgbVar.zzf();
    }

    public final /* synthetic */ Object zzf(zzbgb zzbgbVar) {
        return zzbgbVar.zzd(this.zze);
    }
}
