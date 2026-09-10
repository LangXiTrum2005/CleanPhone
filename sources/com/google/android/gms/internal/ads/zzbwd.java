package com.google.android.gms.internal.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class zzbwd {
    private final zzcir zza;
    private final String zzb;

    public zzbwd(zzcir zzcirVar, String str) {
        this.zza = zzcirVar;
        this.zzb = str;
    }

    public final void zzg(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put(PglCryptUtils.KEY_MESSAGE, str).put("action", this.zzb);
            zzcir zzcirVar = this.zza;
            if (zzcirVar != null) {
                zzcirVar.zzd("onError", jSONObjectPut);
            }
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching error event.", e2);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching ready Event.", e2);
        }
    }

    public final void zzi(int i2, int i3, int i4, int i5) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5));
        } catch (JSONException e2) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching size change.", e2);
        }
    }

    public final void zzj(int i2, int i3, int i4, int i5) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5));
        } catch (JSONException e2) {
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching default position.", e2);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while dispatching state change.", e2);
        }
    }

    public final void zzl(int i2, int i3, int i4, int i5, float f, int i6) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i2).put("height", i3).put("maxSizeWidth", i4).put("maxSizeHeight", i5).put("density", f).put("rotation", i6));
        } catch (JSONException e2) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining screen information.", e2);
        }
    }
}
