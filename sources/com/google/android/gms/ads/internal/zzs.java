package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.jm;
import com.google.android.gms.internal.ads.nw;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.um;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.zi;
import k9.c0;
import q4.a;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs extends zzbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VersionInfoParcel f11220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.client.zzr f11221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f11222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzr f11223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f11224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zzbh f11225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AsyncTask f11226g;

    public zzs(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, VersionInfoParcel versionInfoParcel) {
        this.f11222c = context;
        this.f11220a = versionInfoParcel;
        this.f11221b = zzrVar;
        this.f11224e = new WebView(context);
        this.f11223d = new zzr(context, str);
        x1(0);
        this.f11224e.setVerticalScrollBarEnabled(false);
        this.f11224e.getSettings().setJavaScriptEnabled(true);
        this.f11224e.setWebViewClient(new zzo(this));
        this.f11224e.setOnTouchListener(new zzp());
    }

    public final void x1(int i10) {
        if (this.f11224e == null) {
            return;
        }
        this.f11224e.setLayoutParams(new ViewGroup.LayoutParams(-1, i10));
    }

    public final String y1() {
        String strZza = this.f11223d.zza();
        if (true == TextUtils.isEmpty(strZza)) {
            strZza = "www.google.com";
        }
        String str = (String) um.f20822d.o();
        return a.j(new StringBuilder(String.valueOf(strZza).length() + 8 + String.valueOf(str).length()), "https://", strZza, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzB() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(xx xxVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final zzea zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzfw zzfwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzee zzeeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzx zzxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zi ziVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(boolean z10) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzU() {
        return 0L;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzY(zzcp zzcpVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final s9.a zzb() throws RemoteException {
        c0.d("getAdFrame must be called on the main UI thread.");
        return new b(this.f11224e);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzc() throws RemoteException {
        c0.d("destroy must be called on the main UI thread.");
        this.f11226g.cancel(true);
        this.f11224e.destroy();
        this.f11224e = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(zzbh zzbhVar) throws RemoteException {
        this.f11225f = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        c0.i(this.f11224e, "This Search Ad has already been torn down");
        this.f11223d.zzf(zzmVar, this.f11220a);
        this.f11226g = new zzq(this).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() throws RemoteException {
        c0.d("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg() throws RemoteException {
        c0.d("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzcl zzclVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzby zzbyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzr zzn() throws RemoteException {
        return this.f11221b;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(nw nwVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(pw pwVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final String zzr() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final zzdx zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzu() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcl zzv() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzw() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(jm jmVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(zzbe zzbeVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(s9.a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(long j10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbk zzbkVar) {
    }
}
