package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.o1.b;
import com.smartdigimkt.q8.i;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzboa implements zzbnn {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdxe zzb;
    private final zzbvx zzd;
    private final zzehu zze;
    private final zzcra zzf;
    private final zzczj zzg;
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzh = null;
    private final zzgyw zzi = zzcdo.zzg;

    public zzboa(com.google.android.gms.ads.internal.zzb zzbVar, zzbvx zzbvxVar, zzehu zzehuVar, zzdxe zzdxeVar, zzcra zzcraVar, zzczj zzczjVar) {
        this.zza = zzbVar;
        this.zzd = zzbvxVar;
        this.zze = zzehuVar;
        this.zzb = zzdxeVar;
        this.zzf = zzcraVar;
        this.zzg = zzczjVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri zzd(Context context, zzayq zzayqVar, Uri uri, View view, Activity activity, zzfio zzfioVar) {
        if (zzayqVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznq)).booleanValue() || zzfioVar == null) {
                    if (zzayqVar.zze(uri)) {
                        return zzayqVar.zzd(uri, context, view, activity);
                    }
                } else if (zzayqVar.zze(uri)) {
                    return zzfioVar.zza(uri, context, view, activity);
                }
            } catch (zzayr unused) {
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e2) {
            String strValueOf = String.valueOf(uri.toString());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e2);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:132:0x0369  */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzf(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean zZzb;
        zzczj zzczjVar;
        zzcir zzcirVar = (zzcir) zzaVar;
        zzfhr zzfhrVarZzC = zzcirVar.zzC();
        zzfhu zzfhuVarZzaC = zzcirVar.zzaC();
        boolean zZza = false;
        if (zzfhrVarZzC == null || zzfhuVarZzaC == null) {
            str3 = "";
            zZzb = false;
        } else {
            str3 = zzfhuVarZzaC.zzb;
            zZzb = zzfhrVarZzC.zzb();
        }
        boolean z2 = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmc)).booleanValue() && map.containsKey(b.I1) && ((String) map.get(b.I1)).equals("0")) ? false : true;
        boolean z3 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoe)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals(com.p004ironsource.mediationsdk.metadata.a.g);
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcirVar.zzW()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzl(false);
                ((zzckh) zzaVar).zzaI(zzb(map), zzc(map), z2);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzl(false);
            boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznm)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzckh) zzaVar).zzaJ(zzb(map), zzc(map), str, z2, z4);
                return;
            } else {
                ((zzckh) zzaVar).zzaK(zzb(map), zzc(map), (String) map.get("html"), (String) map.get("baseurl"), z2);
                return;
            }
        }
        Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcirVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfD)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzg(10);
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfx)).booleanValue()) {
                    String strC = CustomTabsClient.c(context, null, false);
                    if (strC != null && !context.getPackageName().equals(strC)) {
                        zZza = true;
                    }
                } else {
                    zZza = zzbhl.zza(context);
                }
                if (zZza) {
                    boolean z5 = z3;
                    boolean z6 = z2;
                    String str4 = str3;
                    zzl(true);
                    if (TextUtils.isEmpty(str)) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot open browser with null or empty url");
                        zzg(7);
                        return;
                    }
                    Uri uriZze = zze(zzd(zzcirVar.getContext(), zzcirVar.zzS(), Uri.parse(str), zzcirVar.zzE(), zzcirVar.zzj(), zzcirVar.zzT()));
                    if (zZzb && this.zze != null && zzi(zzaVar, zzcirVar.getContext(), uriZze.toString(), str4)) {
                        return;
                    }
                    this.zzh = new zzbnx(this);
                    zzckh zzckhVar = (zzckh) zzaVar;
                    String string = uriZze.toString();
                    com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzh;
                    Bundle bundle = new Bundle();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfC)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt(h.f36614b, Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e2) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct initial height parameter.", e2);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e3) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct close button position parameter.", e3);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                    }
                    zzckhVar.zzaH(new com.google.android.gms.ads.internal.overlay.zzc(null, string, null, null, null, null, null, null, ObjectWrapper.wrap(zzaaVar).asBinder(), true, bundle), z6, z5, str4);
                    return;
                }
                zzg(4);
            }
            map.put("use_first_package", com.p004ironsource.mediationsdk.metadata.a.g);
            map.put("use_running_process", com.p004ironsource.mediationsdk.metadata.a.g);
            zzk(zzaVar, map, zZzb, str3, z2, z3);
            return;
        }
        boolean z7 = z3;
        boolean z8 = z2;
        String str5 = str3;
        if ("app".equalsIgnoreCase(str2) && com.p004ironsource.mediationsdk.metadata.a.g.equalsIgnoreCase((String) map.get("system_browser"))) {
            zzk(zzaVar, map, zZzb, str5, z8, z7);
            return;
        }
        boolean z9 = zZzb;
        com.google.android.gms.ads.internal.client.zza zzaVar2 = zzaVar;
        Map map2 = map;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjv)).booleanValue()) {
                zzl(true);
                String str6 = (String) map2.get("p");
                if (str6 == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing from open app action.");
                    return;
                }
                if (z9 && this.zze != null && zzi(zzaVar2, zzcirVar.getContext(), str6, str5)) {
                    return;
                }
                PackageManager packageManager = zzcirVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                    if (launchIntentForPackage != null) {
                        ((zzckh) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z8, z7, str5);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzl(true);
        String str7 = (String) map2.get("intent_url");
        if (!TextUtils.isEmpty(str7)) {
            try {
                uri = Intent.parseUri(str7, 0);
            } catch (URISyntaxException e4) {
                String strValueOf = String.valueOf(str7);
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(strValueOf), e4);
            }
        }
        if (uri != null && uri.getData() != null) {
            Uri data = uri.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZze2 = zze(zzd(zzcirVar.getContext(), zzcirVar.zzS(), data, zzcirVar.zzE(), zzcirVar.zzj(), zzcirVar.zzT()));
                if (TextUtils.isEmpty(uri.getType())) {
                    uri.setData(uriZze2);
                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjw)).booleanValue()) {
                    uri.setDataAndType(uriZze2, uri.getType());
                } else {
                    uri.setData(uriZze2);
                }
            }
        }
        boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjR)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzoj)).booleanValue() && (zzczjVar = this.zzg) != null) {
            zzczjVar.zzl();
        }
        HashMap map3 = new HashMap();
        if (z10) {
            zzbny zzbnyVar = new zzbny(this, z8, zzaVar2, map3, map2);
            zzaVar2 = zzaVar2;
            map2 = map2;
            this.zzh = zzbnyVar;
        } else {
            zZza = z8;
        }
        if (uri != null) {
            if (!z9 || this.zze == null || !zzi(zzaVar2, zzcirVar.getContext(), uri.getData().toString(), str5)) {
                ((zzckh) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(uri, this.zzh), zZza, z7, str5);
                return;
            } else {
                if (z10) {
                    map3.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((zzbqj) zzaVar2).zze("openIntentAsync", map3);
                    return;
                }
                return;
            }
        }
        String string2 = !TextUtils.isEmpty(str) ? zze(zzd(zzcirVar.getContext(), zzcirVar.zzS(), Uri.parse(str), zzcirVar.zzE(), zzcirVar.zzj(), zzcirVar.zzT())).toString() : str;
        if (!z9 || this.zze == null || !zzi(zzaVar2, zzcirVar.getContext(), string2, str5)) {
            ((zzckh) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc((String) map2.get(i.f37957c), string2, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get(f.j), (String) map2.get("e"), this.zzh), zZza, z7, str5);
        } else if (z10) {
            map3.put((String) map2.get("event_id"), Boolean.TRUE);
            ((zzbqj) zzaVar2).zze("openIntentAsync", map3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbgk.zzjL)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbgk.zzjG)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbgk.zzjF)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzboa.zzi(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void zzj(Context context, String str, String str2) {
        zzehu zzehuVar = this.zze;
        zzehuVar.zzd(str);
        zzdxe zzdxeVar = this.zzb;
        if (zzdxeVar != null) {
            zzeif.zzk(context, zzdxeVar, zzehuVar, str, "dialog_not_shown", zzgtg.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:15:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:17:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:18:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:24:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:34:0x010d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0110  */
    /* JADX WARN: Code duplicated, block: B:49:0x0155 A[PHI: r5
  0x0155: PHI (r5v2 com.google.android.gms.internal.ads.zzcir) = 
  (r5v1 com.google.android.gms.internal.ads.zzcir)
  (r5v1 com.google.android.gms.internal.ads.zzcir)
  (r5v1 com.google.android.gms.internal.ads.zzcir)
  (r5v3 com.google.android.gms.internal.ads.zzcir)
 binds: [B:35:0x0110, B:36:0x0112, B:38:0x0118, B:68:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    private final void zzk(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z2, String str, boolean z3, boolean z4) {
        boolean z5;
        Uri uriBuild;
        ArrayList arrayList;
        Intent intentZza;
        Intent intentZza2;
        ResolveInfo resolveInfoZzc;
        zzcir zzcirVar;
        Intent intentZzd;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzb;
        zzl(true);
        zzcir zzcirVar2 = (zzcir) zzaVar;
        Context context = zzcirVar2.getContext();
        zzayq zzayqVarZzS = zzcirVar2.zzS();
        View viewZzE = zzcirVar2.zzE();
        zzfio zzfioVarZzT = zzcirVar2.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            zzcirVar = zzcirVar2;
            intentZzd = null;
        } else {
            Uri uriZze = zze(zzd(context, zzayqVarZzS, Uri.parse(str2), viewZzE, null, zzfioVarZzT));
            boolean z6 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z7 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzft)).booleanValue()) {
                    z5 = false;
                }
                if ("http".equalsIgnoreCase(uriZze.getScheme())) {
                    uriBuild = uriZze.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build();
                } else if (HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(uriZze.getScheme())) {
                    uriBuild = uriZze.buildUpon().scheme("http").build();
                } else {
                    uriBuild = null;
                }
                arrayList = new ArrayList();
                intentZza = zzbnz.zza(uriZze, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                intentZza2 = zzbnz.zza(uriBuild, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                if (z5) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzs(context, intentZza);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzs(context, intentZza2);
                }
                resolveInfoZzc = zzbnz.zzc(intentZza, arrayList, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                if (resolveInfoZzc != null) {
                    intentZzd = zzbnz.zzd(intentZza, resolveInfoZzc, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                } else {
                    if (intentZza2 != null && (resolveInfoZzb = zzbnz.zzb(intentZza2, context, zzayqVarZzS, viewZzE, zzfioVarZzT)) != null) {
                        intentZzd = zzbnz.zzd(intentZza, resolveInfoZzb, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                        if (zzbnz.zzb(intentZzd, context, zzayqVarZzS, viewZzE, zzfioVarZzT) == null) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        zzcirVar = zzcirVar2;
                    } else if (z7 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                        zzcirVar = zzcirVar2;
                        if (z6) {
                            intentZzd = zzbnz.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                        }
                    } else {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i2);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (it.hasNext()) {
                                        zzcirVar = zzcirVar2;
                                        if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                            intentZzd = zzbnz.zzd(intentZza, resolveInfo, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                                        } else {
                                            zzcirVar2 = zzcirVar;
                                        }
                                    } else {
                                        i2 = i3;
                                    }
                                }
                            } else {
                                zzcirVar = zzcirVar2;
                                if (z6) {
                                    intentZzd = zzbnz.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                                }
                            }
                        }
                    }
                    intentZzd = intentZza;
                }
                zzcirVar = zzcirVar2;
            }
            z5 = true;
            if ("http".equalsIgnoreCase(uriZze.getScheme())) {
                uriBuild = uriZze.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build();
            } else if (HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(uriZze.getScheme())) {
                uriBuild = uriZze.buildUpon().scheme("http").build();
            } else {
                uriBuild = null;
            }
            arrayList = new ArrayList();
            intentZza = zzbnz.zza(uriZze, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
            intentZza2 = zzbnz.zza(uriBuild, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
            if (z5) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzs(context, intentZza);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzs(context, intentZza2);
            }
            resolveInfoZzc = zzbnz.zzc(intentZza, arrayList, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
            if (resolveInfoZzc != null) {
                intentZzd = zzbnz.zzd(intentZza, resolveInfoZzc, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
            } else {
                if (intentZza2 != null) {
                    intentZzd = zzbnz.zzd(intentZza, resolveInfoZzb, context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                    if (zzbnz.zzb(intentZzd, context, zzayqVarZzS, viewZzE, zzfioVarZzT) == null) {
                    }
                }
                if (arrayList.isEmpty()) {
                    zzcirVar = zzcirVar2;
                } else if (z7) {
                    zzcirVar = zzcirVar2;
                    if (z6) {
                        intentZzd = zzbnz.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                    }
                } else {
                    zzcirVar = zzcirVar2;
                    if (z6) {
                        intentZzd = zzbnz.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzayqVarZzS, viewZzE, zzfioVarZzT);
                    }
                }
                intentZzd = intentZza;
            }
            zzcirVar = zzcirVar2;
        }
        if (!z2 || this.zze == null || intentZzd == null || !zzi(zzaVar, zzcirVar.getContext(), intentZzd.getData().toString(), str)) {
            try {
                ((zzckh) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intentZzd, this.zzh), z3, z4, str);
            } catch (ActivityNotFoundException e2) {
                String message = e2.getMessage();
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
    }

    private final void zzl(boolean z2) {
        zzbvx zzbvxVar = this.zzd;
        if (zzbvxVar != null) {
            zzbvxVar.zzb(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i2) {
        zzdxe zzdxeVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfw)).booleanValue() || (zzdxeVar = this.zzb) == null) {
            return;
        }
        zzdxd zzdxdVarZza = zzdxeVar.zza();
        zzdxdVarZza.zzc("action", "cct_action");
        switch (i2) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdxdVarZza.zzc("cct_open_status", str);
        zzdxdVarZza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcra zzcraVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzcir zzcirVar = (zzcir) zzaVar;
        if (zzcirVar.zzC() != null) {
            map2 = zzcirVar.zzC().zzaw;
        }
        String strZza = zzcby.zza(str, zzcirVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzgym.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlt)).booleanValue() && (zzcraVar = this.zzf) != null && zzcra.zzc(strZza)) ? zzcraVar.zzb(strZza, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgym.zza(strZza), new zzbnw(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(strZza);
        }
    }
}
