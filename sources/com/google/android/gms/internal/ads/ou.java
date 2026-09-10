package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ou extends du {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedNativeAdMapper f18359a;

    public ou(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f18359a = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void S(s9.a aVar) {
        this.f18359a.untrackView((View) s9.b.y1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void f0(s9.a aVar, s9.a aVar2, s9.a aVar3) {
        HashMap map = (HashMap) s9.b.y1(aVar2);
        HashMap map2 = (HashMap) s9.b.y1(aVar3);
        this.f18359a.trackViews((View) s9.b.y1(aVar), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void k(s9.a aVar) {
        this.f18359a.handleClick((View) s9.b.y1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final float zzA() {
        return this.f18359a.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final float zzB() {
        return this.f18359a.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void zzC() {
        this.f18359a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zze() {
        return this.f18359a.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final List zzf() {
        List<NativeAd.Image> images = this.f18359a.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new yn(image.getDrawable(), image.getUri(), image.getScale(), image.zza(), image.zzb(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzg() {
        return this.f18359a.getBody();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final mo zzh() {
        NativeAd.Image icon = this.f18359a.getIcon();
        if (icon != null) {
            return new yn(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zza(), icon.zzb(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzi() {
        return this.f18359a.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzj() {
        return this.f18359a.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final double zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f18359a;
        if (unifiedNativeAdMapper.getStarRating() != null) {
            return unifiedNativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzl() {
        return this.f18359a.getStore();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzm() {
        return this.f18359a.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final zzea zzn() {
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f18359a;
        if (unifiedNativeAdMapper.zzc() != null) {
            return unifiedNativeAdMapper.zzc().zzb();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final ho zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final s9.a zzp() {
        View adChoicesContent = this.f18359a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return new s9.b(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final s9.a zzq() {
        View viewZzd = this.f18359a.zzd();
        if (viewZzd == null) {
            return null;
        }
        return new s9.b(viewZzd);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final s9.a zzr() {
        Object objZze = this.f18359a.zze();
        if (objZze == null) {
            return null;
        }
        return new s9.b(objZze);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final Bundle zzs() {
        return this.f18359a.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final boolean zzt() {
        return this.f18359a.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final boolean zzu() {
        return this.f18359a.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void zzv() {
        this.f18359a.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final float zzz() {
        return this.f18359a.getMediaContentAspectRatio();
    }
}
