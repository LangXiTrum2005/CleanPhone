package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.thinkup.core.common.n.mo;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeiv implements zzeiw {
    public static /* synthetic */ zzejb zzl(String str, String str2, String str3, zzeix zzeixVar, String str4, WebView webView, String str5, String str6, zzeiy zzeiyVar) {
        zzfrv zzfrvVarZza = zzfrv.zza("Google", str2);
        zzfru zzfruVarZzn = zzn("javascript");
        zzfrm zzfrmVarZzp = zzp(zzeixVar.toString());
        zzfru zzfruVar = zzfru.NONE;
        if (zzfruVarZzn == zzfruVar) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfrmVarZzp == null) {
            String strValueOf = String.valueOf(zzeixVar);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzfru zzfruVarZzn2 = zzn(str4);
        if (zzfrmVarZzp != zzfrm.VIDEO || zzfruVarZzn2 != zzfruVar) {
            zzfrj zzfrjVarZza = zzfrj.zza(zzfrvVarZza, webView, str5, "");
            return new zzejb(zzfrh.zze(zzfri.zza(zzfrmVarZzp, zzo(zzeiyVar.toString()), zzfruVarZzn, zzfruVarZzn2, true), zzfrjVarZza), zzfrjVarZza);
        }
        String strValueOf2 = String.valueOf(str4);
        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    public static /* synthetic */ zzejb zzm(String str, String str2, String str3, String str4, zzeix zzeixVar, WebView webView, String str5, String str6, zzeiy zzeiyVar) {
        zzfrv zzfrvVarZza = zzfrv.zza(str, str2);
        zzfru zzfruVarZzn = zzn("javascript");
        zzfru zzfruVarZzn2 = zzn(str4);
        zzfrm zzfrmVarZzp = zzp(zzeixVar.toString());
        zzfru zzfruVar = zzfru.NONE;
        if (zzfruVarZzn == zzfruVar) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfrmVarZzp == null) {
            String strValueOf = String.valueOf(zzeixVar);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfrmVarZzp != zzfrm.VIDEO || zzfruVarZzn2 != zzfruVar) {
            zzfrj zzfrjVarZzb = zzfrj.zzb(zzfrvVarZza, webView, str5, "");
            return new zzejb(zzfrh.zze(zzfri.zza(zzfrmVarZzp, zzo(zzeiyVar.toString()), zzfruVarZzn, zzfruVarZzn2, true), zzfrjVarZzb), zzfrjVarZzb);
        }
        String strValueOf2 = String.valueOf(str4);
        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    private static zzfru zzn(String str) {
        if ("native".equals(str)) {
            return zzfru.NATIVE;
        }
        return "javascript".equals(str) ? zzfru.JAVASCRIPT : zzfru.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfrp zzo(String str) {
        byte b2;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("beginToRender")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return zzfrp.BEGIN_TO_RENDER;
        }
        if (b2 != 1) {
            return b2 != 2 ? zzfrp.UNSPECIFIED : zzfrp.ONE_PIXEL;
        }
        return zzfrp.DEFINED_BY_JAVASCRIPT;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfrm zzp(String str) {
        byte b2;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("video")) {
                b2 = 2;
            } else {
                b2 = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return zzfrm.HTML_DISPLAY;
        }
        if (b2 == 1) {
            return zzfrm.NATIVE_DISPLAY;
        }
        if (b2 != 2) {
            return null;
        }
        return zzfrm.VIDEO;
    }

    private static final Object zzq(zzeiu zzeiuVar) {
        try {
            return zzeiuVar.zza();
        } catch (RuntimeException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzge)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeiu() { // from class: com.google.android.gms.internal.ads.zzeit
                @Override // com.google.android.gms.internal.ads.zzeiu
                public final /* synthetic */ Object zza() {
                    if (zzfrf.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfrf.zza(context);
                    return Boolean.valueOf(zzfrf.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzge)).booleanValue()) {
            return (String) zzq(zzeik.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final zzejb zzc(final String str, final WebView webView, String str2, String str3, final String str4, final zzeiy zzeiyVar, final zzeix zzeixVar, final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzge)).booleanValue() || !zzfrf.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzejb) zzq(new zzeiu(str7, str, str6, zzeixVar, str4, webView, str5, str8, zzeiyVar) { // from class: com.google.android.gms.internal.ads.zzeil
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzeix zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzeiy zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzeixVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzeiyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeiu
            public final /* synthetic */ Object zza() {
                return zzeiv.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final zzejb zzd(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzeiy zzeiyVar, final zzeix zzeixVar, final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzge)).booleanValue() || !zzfrf.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzejb) zzq(new zzeiu(str5, str, str8, str4, zzeixVar, webView, str6, str7, zzeiyVar) { // from class: com.google.android.gms.internal.ads.zzeim
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzeix zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzeiy zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzeixVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzeiyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeiu
            public final /* synthetic */ Object zza() {
                return zzeiv.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final void zze(final zzfrh zzfrhVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzge)).booleanValue() && zzfrf.zzb()) {
            Objects.requireNonNull(zzfrhVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeij
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfrhVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final void zzf(final zzfrh zzfrhVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzein
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzge)).booleanValue() && zzfrf.zzb()) {
                    zzfrhVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final void zzg(final zzfrh zzfrhVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeio
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzge)).booleanValue() && zzfrf.zzb()) {
                    zzfrhVar.zzd(view, zzfro.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final void zzh(final zzfrh zzfrhVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeip
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzge)).booleanValue() && zzfrf.zzb()) {
                    zzfrhVar.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final zzfrt zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z2) {
        final boolean z3 = true;
        return (zzfrt) zzq(new zzeiu(webView, z3) { // from class: com.google.android.gms.internal.ads.zzeiq
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeiu
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                int i2 = versionInfoParcel2.buddyApkVersion;
                int i3 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(i3).length());
                sb.append(i2);
                sb.append(mo.ono);
                sb.append(i3);
                return zzfrt.zza(zzfrv.zza("Google", sb.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final void zzj(final zzfrt zzfrtVar, final zzfrs zzfrsVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeir
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfrtVar.zzb(zzfrsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    public final void zzk(final zzfrt zzfrtVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeis
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfrtVar.zzd(view, zzfro.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
