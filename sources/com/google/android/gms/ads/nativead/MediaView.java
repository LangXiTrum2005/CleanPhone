package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.ap;
import com.google.android.gms.internal.ads.bo;
import com.google.android.gms.internal.ads.zn;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MediaView extends FrameLayout {

    @Nullable
    private MediaContent zza;
    private boolean zzb;
    private zn zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private bo zzf;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    @Nullable
    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        bo boVar = this.zzf;
        if (boVar != null) {
            boVar.zza(scaleType);
        }
    }

    public void setMediaContent(@Nullable MediaContent mediaContent) {
        boolean zO;
        this.zzb = true;
        this.zza = mediaContent;
        zn znVar = this.zzc;
        if (znVar != null) {
            znVar.zza(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            ap apVarZzb = mediaContent.zzb();
            if (apVarZzb != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zza()) {
                        zO = apVarZzb.o(new b(this));
                    }
                    removeAllViews();
                }
                zO = apVarZzb.zzn(new b(this));
                if (zO) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e10) {
            removeAllViews();
            zzo.zzg("", e10);
        }
    }

    public final synchronized void zza(zn znVar) {
        this.zzc = znVar;
        if (this.zzb) {
            znVar.zza(this.zza);
        }
    }

    public final synchronized void zzb(bo boVar) {
        this.zzf = boVar;
        if (this.zze) {
            boVar.zza(this.zzd);
        }
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
