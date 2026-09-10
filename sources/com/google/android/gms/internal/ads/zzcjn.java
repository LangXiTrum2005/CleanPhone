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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcjn extends FrameLayout implements zzcir {
    private final zzcir zza;
    private final zzcez zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzcjn(zzcir zzcirVar, zzdxe zzdxeVar) {
        super(zzcirVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcirVar;
        this.zzb = new zzcez(zzcirVar.zzK(), this, this, zzdxeVar);
        addView((View) zzcirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void destroy() {
        final zzeiz zzeizVarZzV;
        final zzejb zzejbVarZzU = zzU();
        if (zzejbVarZzU != null) {
            zzfxl zzfxlVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfxlVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.internal.zzt.zzu().zzf(zzejbVarZzU.zza());
                }
            });
            final zzcir zzcirVar = this.zza;
            Objects.requireNonNull(zzcirVar);
            zzfxlVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcirVar.destroy();
                }
            }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgf)).intValue());
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgh)).booleanValue() || (zzeizVarZzV = zzV()) == null) {
            this.zza.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    final zzcjn zzcjnVar = this.zza;
                    zzeizVarZzV.zze(new zzfrs() { // from class: com.google.android.gms.internal.ads.zzcjl
                        @Override // com.google.android.gms.internal.ads.zzfrs
                        public final /* synthetic */ void zza(boolean z2) {
                            zzcjnVar.zzaM(true);
                        }
                    });
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcir
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcir
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzA(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzB(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcii
    public final zzfhr zzC() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final WebView zzD() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzckm
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final List zzF() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzG() {
        this.zza.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzH(int i2) {
        this.zza.zzH(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzI() {
        this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzJ() {
        this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final Context zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzckj
    public final zzclb zzN() {
        return this.zza.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final String zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final zzckp zzP() {
        return ((zzcju) this.zza).zzaS();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final WebViewClient zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final boolean zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzckk
    public final zzayq zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final zzfio zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final zzejb zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final zzeiz zzV() {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final boolean zzW() {
        return this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final boolean zzX() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzY() {
        this.zzb.zzf();
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final boolean zzZ() {
        return this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zza(String str) {
        ((zzcju) this.zza).zzaP(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzcir
    public final boolean zzaA(boolean z2, int i2) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbq)).booleanValue()) {
            return false;
        }
        zzcir zzcirVar = this.zza;
        if (zzcirVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzcirVar.getParent()).removeView((View) zzcirVar);
        }
        zzcirVar.zzaA(z2, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcjy
    public final zzfhu zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzaD(zzfhr zzfhrVar, zzfhu zzfhuVar) {
        this.zza.zzaD(zzfhrVar, zzfhuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzaE(boolean z2) {
        this.zza.zzaE(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final ListenableFuture zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzaG(boolean z2) {
        this.zza.zzaG(true);
    }

    @Override // com.google.android.gms.internal.ads.zzckh
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z2, boolean z3, String str) {
        this.zza.zzaH(zzcVar, z2, z3, str);
    }

    @Override // com.google.android.gms.internal.ads.zzckh
    public final void zzaI(boolean z2, int i2, boolean z3) {
        this.zza.zzaI(z2, i2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzckh
    public final void zzaJ(boolean z2, int i2, String str, boolean z3, boolean z4) {
        this.zza.zzaJ(z2, i2, str, z3, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzckh
    public final void zzaK(boolean z2, int i2, String str, String str2, boolean z3) {
        this.zza.zzaK(z2, i2, str, str2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzckh
    public final void zzaL(String str, String str2, int i2) {
        this.zza.zzaL(str, str2, 14);
    }

    public final /* synthetic */ void zzaM(boolean z2) {
        final zzcir zzcirVar = this.zza;
        zzfxl zzfxlVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcirVar);
        zzfxlVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcji
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcirVar.destroy();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final boolean zzaa() {
        return this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzab(String str, zzbnn zzbnnVar) {
        this.zza.zzab(str, zzbnnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzac(String str, zzbnn zzbnnVar) {
        this.zza.zzac(str, zzbnnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzad(String str, Predicate predicate) {
        this.zza.zzad(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzae(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzaf(zzclb zzclbVar) {
        this.zza.zzaf(zzclbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzag(boolean z2) {
        this.zza.zzag(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzah() {
        this.zza.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzai(Context context) {
        this.zza.zzai(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzaj(boolean z2) {
        this.zza.zzaj(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzak(zzejb zzejbVar) {
        this.zza.zzak(zzejbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzal(zzeiz zzeizVar) {
        this.zza.zzal(zzeizVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzam(int i2) {
        this.zza.zzam(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzan(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzao(boolean z2) {
        this.zza.zzao(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzap() {
        this.zza.zzap();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzaq(zzbjl zzbjlVar) {
        this.zza.zzaq(zzbjlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final zzbjl zzar() {
        return this.zza.zzar();
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzas(boolean z2) {
        this.zza.zzas(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzat() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzau(String str, String str2, String str3) {
        this.zza.zzau(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzav() {
        zzejb zzejbVarZzU;
        zzeiz zzeizVarZzV;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzc();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzD());
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgh)).booleanValue() && (zzeizVarZzV = zzV()) != null) {
            zzeizVarZzV.zzf(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgg)).booleanValue() && (zzejbVarZzU = zzU()) != null && zzejbVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzejbVarZzU.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzaw(boolean z2) {
        this.zza.zzaw(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzax(zzbji zzbjiVar) {
        this.zza.zzax(zzbjiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzay(zzbdx zzbdxVar) {
        this.zza.zzay(zzbdxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final zzbdx zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzb(String str, JSONObject jSONObject) {
        ((zzcju) this.zza).zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzc(String str, String str2) {
        this.zza.zzc("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zzd(String str, JSONObject jSONObject) {
        this.zza.zzd(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdQ() {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbck
    public final void zzdj(zzbcj zzbcjVar) {
        this.zza.zzdj(zzbcjVar);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdk() {
        this.zza.zzdk();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdl() {
        this.zza.zzdl();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzcez zzdm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzdn(boolean z2) {
        this.zza.zzdn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdu() {
        zzcir zzcirVar = this.zza;
        if (zzcirVar != null) {
            zzcirVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    public final void zze(String str, Map map) {
        this.zza.zze(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcfk
    public final zzcjx zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzbgw zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzckd, com.google.android.gms.internal.ads.zzcfk
    public final Activity zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcfk
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzl() {
        this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final String zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final String zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzo(int i2) {
        this.zza.zzo(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcfk
    public final zzbgx zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final zzcgx zzr(String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzckl, com.google.android.gms.internal.ads.zzcfk
    public final VersionInfoParcel zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcfk
    public final void zzt(String str, zzcgx zzcgxVar) {
        this.zza.zzt(str, zzcgxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzu(boolean z2, long j) {
        this.zza.zzu(z2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzv(int i2) {
        this.zzb.zzg(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcir, com.google.android.gms.internal.ads.zzcfk
    public final void zzw(zzcjx zzcjxVar) {
        this.zza.zzw(zzcjxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzx() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeI)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final int zzy() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeI)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfk
    public final void zzz() {
        this.zza.zzz();
    }
}
