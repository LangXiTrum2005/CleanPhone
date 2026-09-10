package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.internal.ads.tz;
import com.google.android.gms.internal.ads.uw;
import java.util.List;
import k9.c0;
import s9.b;
import u.a;
import u.g;
import u.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MobileAds {

    @NonNull
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@NonNull Context context) {
        zzeu.zzb().zzm(context);
    }

    @Nullable
    public static InitializationStatus getInitializationStatus() {
        return zzeu.zzb().zzl();
    }

    private static String getInternalVersion() {
        return zzeu.zzb().zzo();
    }

    @NonNull
    public static RequestConfiguration getRequestConfiguration() {
        return zzeu.zzb().zzp();
    }

    @NonNull
    public static VersionInfo getVersion() {
        zzeu.zzb();
        String[] strArrSplit = TextUtils.split("25.3.0", "\\.");
        if (strArrSplit.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(@NonNull Context context) {
        zzeu.zzb().zzc(context, null, null);
    }

    public static void openAdInspector(@NonNull Context context, @NonNull OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzeu.zzb().zzn(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(@NonNull Context context, @NonNull String str) {
        zzeu.zzb().zzj(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z10) {
        return zzeu.zzb().zzr(z10);
    }

    @Nullable
    public static l registerCustomTabsSession(@NonNull Context context, @NonNull g gVar, @NonNull String str, @Nullable a aVar) {
        zzeu.zzb();
        c0.d("#008 Must be called on the main UI thread.");
        tz tzVarC = uw.c(context);
        if (tzVarC == null) {
            zzo.zzf("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (l) b.y1(tzVarC.zzm(new b(context), new b(gVar), str, new b(aVar)));
        } catch (RemoteException | IllegalArgumentException e10) {
            zzo.zzg("Unable to register custom tabs session. Error: ", e10);
            return null;
        }
    }

    public static void registerRtbAdapter(@NonNull Class<? extends RtbAdapter> cls) {
        zzeu.zzb().zzk(cls);
    }

    public static void registerWebView(@NonNull WebView webView) {
        zzeu.zzb();
        c0.d("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzo.zzf("The webview to be registered cannot be null.");
            return;
        }
        tz tzVarC = uw.c(webView.getContext());
        if (tzVarC == null) {
            zzo.zzf("Internal error, query info generator is null.");
            return;
        }
        try {
            tzVarC.zzj(new b(webView));
        } catch (RemoteException e10) {
            zzo.zzg("", e10);
        }
    }

    public static void setAppMuted(boolean z10) {
        zzeu.zzb().zzh(z10);
    }

    public static void setAppVolume(float f10) {
        zzeu.zzb().zzf(f10);
    }

    private static void setPlugin(String str) {
        zzeu.zzb().zzs(str);
    }

    public static void setRequestConfiguration(@NonNull RequestConfiguration requestConfiguration) {
        zzeu.zzb().zzq(requestConfiguration);
    }

    @Deprecated
    public static void startPreload(@NonNull Context context, @NonNull List<PreloadConfiguration> list, @NonNull PreloadCallback preloadCallback) {
        zzeu.zzb().zze(context, list, preloadCallback);
    }

    private static void stop() {
        zzeu.zzb().zzd();
    }

    public static void initialize(@NonNull Context context, @NonNull OnInitializationCompleteListener onInitializationCompleteListener) {
        zzeu.zzb().zzc(context, null, onInitializationCompleteListener);
    }
}
