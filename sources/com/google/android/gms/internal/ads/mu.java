package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mu extends du {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdMapper f17547a;

    public mu(NativeAdMapper nativeAdMapper) {
        this.f17547a = nativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void S(s9.a aVar) {
        this.f17547a.untrackView((View) s9.b.y1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void f0(s9.a aVar, s9.a aVar2, s9.a aVar3) {
        HashMap map = (HashMap) s9.b.y1(aVar2);
        HashMap map2 = (HashMap) s9.b.y1(aVar3);
        this.f17547a.trackViews((View) s9.b.y1(aVar), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void k(s9.a aVar) {
        this.f17547a.handleClick((View) s9.b.y1(aVar));
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final float zzA() {
        return this.f17547a.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final float zzB() {
        return this.f17547a.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void zzC() {
        this.f17547a.destroy();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zze() {
        return this.f17547a.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final List zzf() {
        List<NativeAd.Image> images = this.f17547a.getImages();
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
        return this.f17547a.getBody();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final mo zzh() {
        NativeAd.Image icon = this.f17547a.getIcon();
        if (icon != null) {
            return new yn(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zza(), icon.zzb(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzi() {
        return this.f17547a.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzj() {
        return this.f17547a.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final double zzk() {
        NativeAdMapper nativeAdMapper = this.f17547a;
        if (nativeAdMapper.getStarRating() != null) {
            return nativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzl() {
        return this.f17547a.getStore();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final String zzm() {
        return this.f17547a.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final zzea zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final ho zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final s9.a zzp() {
        View adChoicesContent = this.f17547a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return new s9.b(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final s9.a zzq() {
        View viewZza = this.f17547a.zza();
        if (viewZza == null) {
            return null;
        }
        return new s9.b(viewZza);
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final s9.a zzr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final Bundle zzs() {
        return this.f17547a.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final boolean zzt() {
        return this.f17547a.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final boolean zzu() {
        return this.f17547a.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final void zzv() {
        this.f17547a.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.eu
    public final float zzz() {
        return this.f17547a.getMediaContentAspectRatio();
    }
}
