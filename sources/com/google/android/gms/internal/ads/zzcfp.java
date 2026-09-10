package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcfp extends FrameLayout implements zzcex {
    private final zzcex zza;
    private final zzcbh zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcfp(zzcex zzcexVar) {
        super(zzcexVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcexVar;
        this.zzb = new zzcbh(zzcexVar.zzE(), this, this);
        addView((View) zzcexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void destroy() {
        final zzecp zzecpVarZzP;
        final zzecr zzecrVarZzQ = zzQ();
        if (zzecrVarZzQ != null) {
            zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfqwVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfm
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzv.zzB().zzi(zzecrVarZzQ.zza());
                }
            });
            zzcex zzcexVar = this.zza;
            Objects.requireNonNull(zzcexVar);
            zzfqwVar.postDelayed(new zzcfl(zzcexVar), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfd)).intValue());
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzff)).booleanValue() || (zzecpVarZzP = zzP()) == null) {
            this.zza.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfn
                @Override // java.lang.Runnable
                public final void run() {
                    zzecpVarZzP.zzf(new zzcfo(this.zza));
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", C.UTF8_NAME, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcex
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcex
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzA(int i) {
        this.zza.zzA(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzB(int i) {
        this.zzb.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final void zzC(zzcfz zzcfzVar) {
        this.zza.zzC(zzcfzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzceo
    public final zzfbo zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgm
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgk
    public final zzava zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final zzazx zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    @Nullable
    public final zzbfk zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final zzcgp zzN() {
        return ((zzcfw) this.zza).zzaO();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgj
    public final zzcgr zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final zzecp zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final zzecr zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcga
    public final zzfbr zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final zzfcn zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final AI zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final List zzV() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzW(zzfbo zzfboVar, zzfbr zzfbrVar) {
        this.zza.zzW(zzfboVar, zzfbrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzX() {
        this.zzb.zze();
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzY() {
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzZ(int i) {
        this.zza.zzZ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zza(String str) {
        ((zzcfw) this.zza).zzaT(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaA(String str, Predicate predicate) {
        this.zza.zzaA(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaD(boolean z, int i) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaW)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzaD(z, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaG() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final boolean zzaH() {
        return this.zza.zzaH();
    }

    public final /* synthetic */ void zzaI(boolean z) {
        zzcex zzcexVar = this.zza;
        zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcexVar);
        zzfqwVar.post(new zzcfl(zzcexVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaJ(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.zza.zzaJ(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaK(String str, String str2, int i) {
        this.zza.zzaK(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaL(boolean z, int i, boolean z2) {
        this.zza.zzaL(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaM(boolean z, int i, String str, String str2, boolean z2) {
        this.zza.zzaM(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final void zzaN(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zza.zzaN(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzab() {
        this.zza.zzab();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzac(boolean z) {
        this.zza.zzac(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzad() {
        this.zza.zzad();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzae(String str, String str2, @Nullable String str3) {
        this.zza.zzae(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaf() {
        this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzag(String str, zzbjp zzbjpVar) {
        this.zza.zzag(str, zzbjpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzah() {
        zzecr zzecrVarZzQ;
        zzecp zzecpVarZzP;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzv.zzq();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzz());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && (zzecpVarZzP = zzP()) != null) {
            zzecpVarZzP.zza(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfe)).booleanValue() && (zzecrVarZzQ = zzQ()) != null && zzecrVarZzQ.zzb()) {
            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzecrVarZzQ.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzai(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzai(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaj(zzcgr zzcgrVar) {
        this.zza.zzaj(zzcgrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzak(zzazx zzazxVar) {
        this.zza.zzak(zzazxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzal(boolean z) {
        this.zza.zzal(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzam() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzan(Context context) {
        this.zza.zzan(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzao(boolean z) {
        this.zza.zzao(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzap(zzbfi zzbfiVar) {
        this.zza.zzap(zzbfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaq(boolean z) {
        this.zza.zzaq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzar(@Nullable zzbfk zzbfkVar) {
        this.zza.zzar(zzbfkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzas(@Nullable zzecp zzecpVar) {
        this.zza.zzas(zzecpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzat(zzecr zzecrVar) {
        this.zza.zzat(zzecrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzau(int i) {
        this.zza.zzau(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzav(boolean z) {
        this.zza.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaw(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzaw(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzax(boolean z) {
        this.zza.zzax(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzay(boolean z) {
        this.zza.zzay(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcex
    public final void zzaz(String str, zzbjp zzbjpVar) {
        this.zza.zzaz(str, zzbjpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.zzdd();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzde() {
        this.zza.zzde();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdf() {
        this.zza.zzdf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzdg() {
        this.zza.zzdg();
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayjVar) {
        this.zza.zzdn(zzayjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmk
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdW)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final int zzh() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdW)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcge, com.google.android.gms.internal.ads.zzcbs
    @Nullable
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final zzbcx zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbmw
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcfw) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final zzbcy zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcgl, com.google.android.gms.internal.ads.zzcbs
    public final VersionInfoParcel zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final zzcbh zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final zzcde zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final zzcfz zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final String zzr() {
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final String zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcex, com.google.android.gms.internal.ads.zzcbs
    public final void zzt(String str, zzcde zzcdeVar) {
        this.zza.zzt(str, zzcdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzv(boolean z, long j) {
        this.zza.zzv(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbs
    public final void zzz(boolean z) {
        this.zza.zzz(false);
    }
}
