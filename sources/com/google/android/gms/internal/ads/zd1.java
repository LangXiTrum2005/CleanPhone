package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.AudioManager;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zd1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f22584c;

    public /* synthetic */ zd1(int i10, Object obj, Object obj2) {
        this.f22582a = i10;
        this.f22583b = obj;
        this.f22584c = obj2;
    }

    private final void a() {
        b30 b30Var;
        b21 b21Var = new b21((n30) this.f22583b, 12);
        jm0 jm0Var = (jm0) this.f22584c;
        synchronized (jm0Var) {
            oy0 oy0Var = jm0Var.f16119f;
            if (oy0Var == null || (b30Var = jm0Var.f16117d) == null) {
                return;
            }
            ((tc0) zzt.zzu()).getClass();
            tc0.o(new gm0(0, oy0Var, b21Var));
            jm0Var.f16119f = null;
            b30Var.T(null);
        }
    }

    private final void b() {
        View view;
        se0 se0Var = (se0) this.f22583b;
        ViewGroup viewGroup = (ViewGroup) this.f22584c;
        ou0 ou0Var = se0Var.f19940b;
        zzg zzgVar = se0Var.f19939a;
        je0 je0Var = se0Var.f19942d;
        synchronized (je0Var) {
            view = je0Var.f16063o;
        }
        if (view != null) {
            boolean z10 = viewGroup != null;
            if (je0Var.q() == 2 || je0Var.q() == 1) {
                zzgVar.zzr(ou0Var.f18366g, String.valueOf(je0Var.q()), z10);
            } else if (je0Var.q() == 6) {
                String str = ou0Var.f18366g;
                zzgVar.zzr(str, "2", z10);
                zzgVar.zzr(str, "1", z10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x027c  */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.df0, com.google.android.gms.internal.ads.qh] */
    private final void c() {
        ViewGroup viewGroup;
        View view;
        View view2;
        ViewGroup viewGroup2;
        ko koVar;
        Drawable drawable;
        se0 se0Var = (se0) this.f22583b;
        ?? r15 = (qh) this.f22584c;
        le0 le0Var = se0Var.f19941c;
        if (!le0Var.d() && !le0Var.b()) {
            viewGroup = null;
            break;
        }
        String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                viewGroup = null;
                break;
            }
            View viewQ = r15.q(strArr[i10]);
            if (viewQ instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewQ;
                break;
            }
            i10++;
        }
        Context context = r15.w1().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        je0 je0Var = se0Var.f19942d;
        synchronized (je0Var) {
            view = je0Var.f16053d;
        }
        if (view != null) {
            synchronized (je0Var) {
                view2 = je0Var.f16053d;
            }
            eo eoVar = se0Var.f19947i;
            if (eoVar != null && viewGroup == null) {
                se0.b(layoutParams, eoVar.f14034e);
                view2.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (je0Var.s() instanceof wn) {
            wn wnVar = (wn) je0Var.s();
            if (viewGroup == null) {
                se0.b(layoutParams, wnVar.f21554h);
                viewGroup = null;
            }
            xn xnVar = new xn(context);
            k9.c0.h(wnVar);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(xn.f21938b, null, null));
            shapeDrawable.getPaint().setColor(wnVar.f21550d);
            xnVar.setLayoutParams(layoutParams);
            xnVar.setBackground(shapeDrawable);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            String str = wnVar.f21547a;
            if (!TextUtils.isEmpty(str)) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                TextView textView = new TextView(context);
                textView.setLayoutParams(layoutParams3);
                textView.setId(1195835393);
                textView.setTypeface(Typeface.DEFAULT);
                textView.setText(str);
                textView.setTextColor(wnVar.f21551e);
                textView.setTextSize(wnVar.f21552f);
                zzay.zza();
                int iZzE = zzf.zzE(context, 4);
                zzay.zza();
                textView.setPadding(iZzE, 0, zzf.zzE(context, 4), 0);
                xnVar.addView(textView);
                layoutParams2.addRule(1, textView.getId());
            }
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(layoutParams2);
            imageView.setId(1195835394);
            ArrayList arrayList = wnVar.f21548b;
            if (arrayList != null && arrayList.size() > 1) {
                xnVar.f21939a = new AnimationDrawable();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        xnVar.f21939a.addFrame((Drawable) s9.b.y1(((yn) it.next()).zzb()), wnVar.f21553g);
                    } catch (Exception e10) {
                        int i11 = zze.zza;
                        zzo.zzg("Error while getting drawable.", e10);
                    }
                }
                imageView.setBackground(xnVar.f21939a);
            } else if (arrayList.size() == 1) {
                try {
                    imageView.setImageDrawable((Drawable) s9.b.y1(((yn) arrayList.get(0)).zzb()));
                } catch (Exception e11) {
                    int i12 = zze.zza;
                    zzo.zzg("Error while getting drawable.", e11);
                }
            }
            xnVar.addView(imageView);
            xnVar.setContentDescription((CharSequence) zzba.zzc().a(am.Q4));
            view2 = xnVar;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            if (view2.getParent() instanceof ViewGroup) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view2);
            } else {
                zza zzaVar = new zza(r15.w1().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view2);
                FrameLayout frameLayoutV1 = r15.v1();
                if (frameLayoutV1 != null) {
                    frameLayoutV1.addView(zzaVar);
                }
            }
            r15.r(view2, r15.zzm());
        }
        ya1 ya1Var = qe0.f19028o;
        int i13 = ya1Var.f22210d;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                viewGroup2 = null;
                break;
            }
            View viewQ2 = r15.q((String) ya1Var.get(i14));
            i14++;
            if (viewQ2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewQ2;
                break;
            }
        }
        se0Var.f19946h.execute(new zd1(24, se0Var, viewGroup2));
        if (viewGroup2 == null) {
            return;
        }
        if (se0Var.c(viewGroup2, true)) {
            if (je0Var.h() != null) {
                je0Var.h().x0(new lj1(r15, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) zzba.zzc().a(am.Gb)).booleanValue() && se0Var.c(viewGroup2, false)) {
            if (je0Var.i() != null) {
                je0Var.i().x0(new lj1(r15, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View viewW1 = r15.w1();
        Context context2 = viewW1 != null ? viewW1.getContext() : null;
        if (context2 != null) {
            ge0 ge0Var = se0Var.f19948j;
            synchronized (ge0Var) {
                koVar = ge0Var.f14835a;
            }
            if (koVar != null) {
                try {
                    s9.a aVarZzg = koVar.zzg();
                    if (aVarZzg == null || (drawable = (Drawable) s9.b.y1(aVarZzg)) == null) {
                        return;
                    }
                    ImageView imageView2 = new ImageView(context2);
                    imageView2.setImageDrawable(drawable);
                    s9.a aVarZzn = r15.zzn();
                    if (aVarZzn == null) {
                        imageView2.setScaleType(se0.f19938k);
                    } else if (((Boolean) zzba.zzc().a(am.m7)).booleanValue()) {
                        imageView2.setScaleType((ImageView.ScaleType) s9.b.y1(aVarZzn));
                    } else {
                        imageView2.setScaleType(se0.f19938k);
                    }
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView2);
                } catch (RemoteException unused) {
                    int i15 = zze.zza;
                    zzo.zzi("Could not get main image drawable");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01ab A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:55:0x01ad A[Catch: all -> 0x01e4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:51:0x0199, B:55:0x01ad), top: B:63:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0199 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final void d() {
        fi0 fi0Var;
        final yi0 yi0Var = (yi0) ((x11) this.f22583b).f21703b;
        String str = (String) this.f22584c;
        Context context = yi0Var.f22266f;
        int i10 = 5;
        fw0 fw0VarF = fw0.f(context, 5);
        fw0VarF.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final fw0 fw0VarF2 = fw0.f(context, i10);
                fw0VarF2.zza();
                fw0VarF2.zzi(next);
                final Object obj = new Object();
                final m00 m00Var = new m00();
                ListenableFuture listenableFutureV = zw1.v(m00Var, ((Long) zzba.zzc().a(am.E2)).longValue(), TimeUnit.SECONDS, yi0Var.f22271k);
                yi0Var.l.a(next);
                yi0Var.f22274o.zza(next);
                ((p9.b) zzt.zzk()).getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                listenableFutureV.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.wi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        yi0 yi0Var2 = yi0Var;
                        Object obj2 = obj;
                        m00 m00Var2 = m00Var;
                        String str2 = next;
                        long j10 = jElapsedRealtime;
                        fw0 fw0Var = fw0VarF2;
                        yi0Var2.getClass();
                        synchronized (obj2) {
                            try {
                                if (!m00Var2.isDone()) {
                                    ((p9.b) zzt.zzk()).getClass();
                                    yi0Var2.d(str2, (int) (SystemClock.elapsedRealtime() - j10), "Timeout.", false);
                                    yi0Var2.l.c(str2, "timeout");
                                    yi0Var2.f22274o.a(str2, "timeout");
                                    kw0 kw0Var = yi0Var2.f22275p;
                                    fw0Var.zzk(AndroidInitializeBoldSDK.MSG_TIMEOUT);
                                    fw0Var.zzd(false);
                                    kw0Var.b(fw0Var.zzm());
                                    m00Var2.zzc(Boolean.FALSE);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }, yi0Var.f22269i);
                arrayList.add(listenableFutureV);
                ui0 ui0Var = new ui0(jElapsedRealtime, m00Var, yi0Var, fw0VarF2, obj, next);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i11 = 0;
                        while (i11 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new as(bundle, strOptString));
                            i11++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                yi0Var.d(next, 0, "", false);
                try {
                    wu0 wu0VarA = yi0Var.f22268h.a(next, new JSONObject());
                    Executor executor = yi0Var.f22270j;
                    try {
                        yi0 yi0Var2 = yi0Var;
                        try {
                            d20 d20Var = new d20(yi0Var2, next, ui0Var, wu0VarA, arrayList2);
                            yi0Var = yi0Var2;
                            ui0Var = ui0Var;
                            executor.execute(d20Var);
                        } catch (qu0 e10) {
                            e = e10;
                            yi0Var = yi0Var2;
                            ui0Var = ui0Var;
                            try {
                                String string = "Failed to create Adapter.";
                                if (((Boolean) zzba.zzc().a(am.Je)).booleanValue()) {
                                    String message = e.getMessage();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 26);
                                    sb2.append("Failed to create Adapter.");
                                    sb2.append(" ");
                                    sb2.append(message);
                                    string = sb2.toString();
                                }
                                ui0Var.zzf(string);
                            } catch (RemoteException e11) {
                                int i12 = zze.zza;
                                zzo.zzg("", e11);
                            }
                        } catch (JSONException e12) {
                            e = e12;
                            yi0Var = yi0Var2;
                            zze.zzb("Malformed CLD response", e);
                            yi0Var.f22274o.f("MalformedJson");
                            fi0Var = yi0Var.l;
                            synchronized (fi0Var) {
                                if (!((Boolean) zzba.zzc().a(am.P2)).booleanValue()) {
                                    HashMap mapE = fi0Var.e();
                                    mapE.put("action", "aaia");
                                    mapE.put("aair", "MalformedJson");
                                    fi0Var.f14437b.add(mapE);
                                }
                                yi0Var.f22265e.zzd(e);
                                zzt.zzh().d("AdapterInitializer.updateAdapterStatus", e);
                                kw0 kw0Var = yi0Var.f22275p;
                                fw0VarF.a(e);
                                fw0VarF.zzd(false);
                                kw0Var.b(fw0VarF.zzm());
                            }
                        }
                    } catch (qu0 e13) {
                        e = e13;
                    }
                } catch (qu0 e14) {
                    e = e14;
                }
                i10 = 5;
            }
            ca1 ca1VarY = ca1.y(arrayList);
            ze zeVar = new ze(4, yi0Var, fw0VarF);
            Executor executor2 = yi0Var.f22269i;
            sd1 sd1Var = new sd1(ca1VarY, false, false);
            sd1Var.f19937p = new rd1(sd1Var, zeVar, executor2);
            sd1Var.v();
        } catch (JSONException e15) {
            e = e15;
            zze.zzb("Malformed CLD response", e);
            yi0Var.f22274o.f("MalformedJson");
            fi0Var = yi0Var.l;
            synchronized (fi0Var) {
                if (!((Boolean) zzba.zzc().a(am.P2)).booleanValue()) {
                    HashMap mapE2 = fi0Var.e();
                    mapE2.put("action", "aaia");
                    mapE2.put("aair", "MalformedJson");
                    fi0Var.f14437b.add(mapE2);
                }
            }
            yi0Var.f22265e.zzd(e);
            zzt.zzh().d("AdapterInitializer.updateAdapterStatus", e);
            kw0 kw0Var2 = yi0Var.f22275p;
            fw0VarF.a(e);
            fw0VarF.zzd(false);
            kw0Var2.b(fw0VarF.zzm());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        MediaFormat format;
        String strB;
        int i10 = 10;
        int i11 = 2;
        Application application = null;
        int i12 = 0;
        int i13 = 1;
        switch (this.f22582a) {
            case 0:
                yd1 yd1Var = (yd1) this.f22584c;
                ListenableFuture listenableFuture = (ListenableFuture) this.f22583b;
                if ((listenableFuture instanceof qe1) && (thA = ((qe1) listenableFuture).a()) != null) {
                    yd1Var.zza(thA);
                    return;
                }
                try {
                    yd1Var.mo164zzb(zw1.G(listenableFuture));
                    return;
                } catch (ExecutionException e10) {
                    yd1Var.zza(e10.getCause());
                    return;
                } catch (Throwable th2) {
                    yd1Var.zza(th2);
                    return;
                }
            case 1:
                md0 md0Var = (md0) this.f22583b;
                lt ltVar = (lt) this.f22584c;
                String str = uu0.f20901a;
                jy1 jy1Var = (jy1) md0Var.f17400c;
                jy1Var.getClass();
                at0 at0Var = new at0(ltVar, 12);
                mk0 mk0Var = jy1Var.f16219a.f19722n;
                mk0Var.i(25, at0Var);
                mk0Var.j();
                return;
            case 2:
                md0 md0Var2 = (md0) this.f22583b;
                xx1 xx1Var = (xx1) this.f22584c;
                synchronized (xx1Var) {
                }
                String str2 = uu0.f20901a;
                d02 d02Var = ((jy1) md0Var2.f17400c).f16219a.f19727s;
                zz1 zz1VarI = d02Var.i((r32) d02Var.f13329d.f21139e);
                d02Var.f(zz1VarI, 1020, new wv0(zz1VarI, xx1Var, 11));
                return;
            case 3:
                md0 md0Var3 = (md0) this.f22583b;
                wx1 wx1Var = (wx1) this.f22584c;
                md0Var3.getClass();
                String str3 = uu0.f20901a;
                ((jy1) md0Var3.f17400c).f16219a.F.g(wx1Var);
                return;
            case 4:
                try {
                    ((xa) this.f22584c).f21803b.put((hb) this.f22583b);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 5:
                li liVar = (li) this.f22584c;
                View view = (View) this.f22583b;
                liVar.getClass();
                try {
                    gi giVar = new gi(liVar.f17000f, liVar.f17001g, liVar.f17002h, liVar.f17003i, liVar.f17004j, liVar.f17005k, liVar.l, liVar.f17008o);
                    ji jiVarZzg = zzt.zzg();
                    synchronized (jiVarZzg.f16100a) {
                        try {
                            hi hiVar = jiVarZzg.f16101b;
                            if (hiVar != null) {
                                application = hiVar.f15295b;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (application != null) {
                        String str4 = liVar.f17006m;
                        if (!TextUtils.isEmpty(str4)) {
                            String str5 = (String) view.getTag(application.getResources().getIdentifier((String) zzba.zzc().a(am.O0), "id", application.getPackageName()));
                            if (str5 != null && str5.equals(str4)) {
                                return;
                            }
                        }
                    }
                    n3 n3VarA = liVar.a(view, giVar);
                    giVar.b();
                    if (n3VarA.f17624a == 0 && n3VarA.f17625b == 0) {
                        return;
                    }
                    int i14 = n3VarA.f17625b;
                    if (i14 == 0 && giVar.f14871k == 0) {
                        return;
                    }
                    if (i14 == 0) {
                        pb pbVar = liVar.f16998d;
                        synchronized (pbVar.f18583b) {
                            try {
                                if (((LinkedList) pbVar.f18584c).contains(giVar)) {
                                    return;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                    liVar.f16998d.n(giVar);
                    return;
                } catch (Exception e11) {
                    int i15 = zze.zza;
                    zzo.zzg("Exception in fetchContentOnUIThread", e11);
                    zzt.zzh().d("ContentFetchTask.fetchContent", e11);
                    return;
                }
            case 6:
                if (((kj) this.f22583b).isCancelled()) {
                    ((Future) this.f22584c).cancel(true);
                    return;
                }
                return;
            case 7:
                boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12225k6)).booleanValue();
                Context context = (Context) this.f22584c;
                t6.l lVar = (t6.l) this.f22583b;
                if (zBooleanValue) {
                    try {
                        lVar.f50550c = (xh) zzs.zza(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", s6.f19871p);
                        ((vh) ((xh) lVar.f50550c)).v1(new s9.b(context));
                        lVar.f50549b = true;
                        return;
                    } catch (RemoteException | zzr | NullPointerException unused2) {
                        zzo.zzd("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 8:
                vs vsVar = (vs) this.f22584c;
                ws wsVar = (ws) this.f22583b;
                ((p9.b) zzt.zzk()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
                    Context context2 = (Context) wsVar.f21597e;
                    VersionInfoParcel versionInfoParcel = (VersionInfoParcel) wsVar.f21598f;
                    ms msVar = new ms();
                    zzt.zzd();
                    b30 b30VarA = l30.a(context2, new t0(0, 0, 0), "", false, false, null, null, versionInfoParcel, null, null, new pj(), null, null, null, null, null);
                    msVar.f17535a = b30VarA;
                    b30VarA.zzE().setWillNotDraw(true);
                    zze.zza("loadJavascriptEngine > After createJavascriptEngine");
                    zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
                    ts tsVar = new ts();
                    tsVar.f20475b = wsVar;
                    tsVar.f20476c = arrayList;
                    tsVar.f20474a = jCurrentTimeMillis;
                    tsVar.f20477d = vsVar;
                    tsVar.f20478e = msVar;
                    b30 b30Var = msVar.f17535a;
                    if (b30Var != null) {
                        b30Var.zzP().f14701h = new so0(tsVar, i10);
                    }
                    zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    msVar.z("/jsLoaded", new os(wsVar, jCurrentTimeMillis, vsVar, msVar));
                    zzbv zzbvVar = new zzbv();
                    ps psVar = new ps(wsVar, msVar, zzbvVar);
                    zzbvVar.zzb(psVar);
                    zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    if (!((Boolean) fn.f14466d.o()).booleanValue() || TextUtils.equals(((Context) wsVar.f21597e).getPackageName(), "com.google.android.gms")) {
                        msVar.z("/requestReload", psVar);
                    }
                    String str6 = wsVar.f21594b;
                    zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str6)));
                    if (str6.endsWith(".js")) {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                        zze.zza("loadJavascript on adWebView from path: ".concat(str6));
                        ms.v(new ls(msVar, "<!DOCTYPE html><html><head><script src=\"" + str6 + "\"></script></head><body></body></html>", i12));
                        zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str6.startsWith("<html>")) {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                        zze.zza("loadHtml on adWebView from html");
                        ms.v(new ls(msVar, str6, 1));
                        zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        zze.zza("loadHtmlWrapper on adWebView from path: ".concat(str6));
                        ms.v(new ls(msVar, str6, 2));
                        zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new rs(wsVar, vsVar, msVar, arrayList, jCurrentTimeMillis, 0), ((Integer) zzba.zzc().a(am.f12125e)).intValue());
                    return;
                } catch (Throwable th5) {
                    int i16 = zze.zza;
                    zzo.zzg("Error creating webview.", th5);
                    if (((Boolean) zzba.zzc().a(am.L8)).booleanValue()) {
                        vsVar.s("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th5);
                        return;
                    } else if (((Boolean) zzba.zzc().a(am.N8)).booleanValue()) {
                        zzt.zzh().e("SdkJavascriptFactory.loadJavascriptEngine", th5);
                        vsVar.r();
                        return;
                    } else {
                        zzt.zzh().d("SdkJavascriptFactory.loadJavascriptEngine", th5);
                        vsVar.r();
                        return;
                    }
                }
            case 9:
                zzt.zzb();
                zzn.zza(((zzbyb) this.f22584c).f22785a, (AdOverlayInfoParcel) this.f22583b, true, null);
                return;
            case 10:
                ((zzu) this.f22583b).zzc((String) this.f22584c, null);
                return;
            case 11:
                zy zyVar = (zy) this.f22583b;
                Bitmap bitmap = (Bitmap) this.f22584c;
                zyVar.getClass();
                as1 as1Var = cs1.f13248b;
                bs1 bs1Var = new bs1();
                bitmap.compress(Bitmap.CompressFormat.PNG, 0, bs1Var);
                synchronized (zyVar.f22769h) {
                    dv1 dv1Var = zyVar.f22762a;
                    tv1 tv1VarZ = uv1.z();
                    cs1 cs1VarD = bs1Var.d();
                    tv1VarZ.b();
                    ((uv1) tv1VarZ.f19193b).B(cs1VarD);
                    tv1VarZ.b();
                    ((uv1) tv1VarZ.f19193b).A("image/png");
                    tv1VarZ.b();
                    ((uv1) tv1VarZ.f19193b).C(2);
                    uv1 uv1Var = (uv1) tv1VarZ.e();
                    dv1Var.b();
                    ((ew1) dv1Var.f19193b).J(uv1Var);
                    break;
                }
                return;
            case 12:
                w00 w00Var = (w00) this.f22584c;
                MediaPlayer mediaPlayer = (MediaPlayer) this.f22583b;
                b30 b30Var2 = w00Var.f21337c;
                if (((Boolean) zzba.zzc().a(am.G2)).booleanValue() && b30Var2 != null && mediaPlayer != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap map = new HashMap();
                            while (i12 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i12];
                                if (trackInfo2 != null) {
                                    int trackType = trackInfo2.getTrackType();
                                    if (trackType == i13) {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused3) {
                                                    map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                w00Var.f21352s = numValueOf;
                                                map.put("bitRate", String.valueOf(numValueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                int integer = format2.getInteger("width");
                                                int integer2 = format2.getInteger("height");
                                                StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.e(integer, i13) + String.valueOf(integer2).length());
                                                sb2.append(integer);
                                                sb2.append("x");
                                                sb2.append(integer2);
                                                map.put("resolution", sb2.toString());
                                            }
                                            if (format2.containsKey("mime")) {
                                                map.put("videoMime", format2.getString("mime"));
                                            }
                                            if (format2.containsKey("codecs-string")) {
                                                map.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                        }
                                    } else if (trackType == i11 && (format = trackInfo2.getFormat()) != null) {
                                        if (format.containsKey("mime")) {
                                            map.put("audioMime", format.getString("mime"));
                                        }
                                        if (format.containsKey("codecs-string")) {
                                            map.put("audioCodec", format.getString("codecs-string"));
                                        }
                                    }
                                    trackInfo = trackInfo;
                                } else {
                                    trackInfo = trackInfo;
                                }
                                i12++;
                                trackInfo = trackInfo;
                                i11 = 2;
                                i13 = 1;
                                break;
                            }
                            if (!map.isEmpty()) {
                                b30Var2.e("onMetadataEvent", map);
                            }
                        }
                    } catch (RuntimeException e12) {
                        zzt.zzh().d("AdMediaPlayerView.reportMetadata", e12);
                    }
                }
                d10 d10Var = w00Var.f21350q;
                if (d10Var != null) {
                    d10Var.e();
                    return;
                }
                return;
            case 13:
                Context context3 = (Context) this.f22583b;
                qf0 qf0Var = (qf0) this.f22584c;
                x10.f21675a = (AudioManager) context3.getSystemService("audio");
                qf0Var.a();
                return;
            case 14:
                AtomicInteger atomicInteger = r20.f19281u;
                ((b30) this.f22583b).e("onGcacheInfoEvent", (HashMap) this.f22584c);
                return;
            case 15:
                a();
                return;
            case 16:
                ((r30) this.f22583b).j0((String) this.f22584c);
                return;
            case 17:
                ((t30) this.f22583b).f20139a.e("pubVideoCmd", (HashMap) this.f22584c);
                return;
            case 18:
                u30 u30Var = (u30) this.f22583b;
                String str7 = (String) this.f22584c;
                vf vfVar = u30Var.f20607a;
                Uri uri = Uri.parse(str7);
                g30 g30Var = ((r30) vfVar.f21157b).f19339n;
                if (g30Var != null) {
                    g30Var.v(uri);
                    return;
                } else {
                    int i17 = zze.zza;
                    zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                }
            case 19:
                f70 f70Var = (f70) this.f22583b;
                JSONObject jSONObject = (JSONObject) this.f22584c;
                String string = jSONObject.toString();
                String strJ = q4.a.j(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
                int i18 = zze.zza;
                zzo.zzd(strJ);
                f70Var.f14297a.b("AFMA_updateActiveView", jSONObject);
                return;
            case 20:
                try {
                    ((zb0) this.f22583b).mo160zza(this.f22584c);
                    return;
                } catch (Throwable th6) {
                    zzt.zzh().e("EventEmitter.notify", th6);
                    zze.zzb("Event emitter exception.", th6);
                    return;
                }
            case 21:
                kj1 kj1Var = (kj1) this.f22583b;
                Integer num = (Integer) this.f22584c;
                if (kj1Var.f16462a == 0) {
                    kj1Var.x(num);
                    return;
                }
                return;
            case 22:
                kj1 kj1Var2 = (kj1) this.f22583b;
                Object obj = this.f22584c;
                int i19 = kj1Var2.f16462a - 1;
                kj1Var2.f16462a = i19;
                if (i19 == 0) {
                    kj1Var2.x(obj);
                    return;
                }
                return;
            case 23:
                kj1 kj1Var3 = (kj1) this.f22583b;
                Object objApply = ((iy1) this.f22584c).apply(kj1Var3.f16467f);
                kj1Var3.f16467f = objApply;
                zd1 zd1Var = new zd1(22, kj1Var3, objApply);
                ys0 ys0Var = (ys0) kj1Var3.f16464c;
                if (ys0Var.f22362a.getLooper().getThread().isAlive()) {
                    ys0Var.e(zd1Var);
                    return;
                }
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                d();
                return;
            case 27:
                ((yi0) this.f22583b).f22269i.execute(new x60((m00) this.f22584c, i10));
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                try {
                    ((yr) this.f22584c).zzb(((yi0) this.f22583b).b());
                    return;
                } catch (RemoteException e13) {
                    int i20 = zze.zza;
                    zzo.zzg("", e13);
                    return;
                }
            default:
                dk0 dk0Var = (dk0) this.f22583b;
                Context context4 = (Context) this.f22584c;
                yh0 yh0Var = dk0Var.f13573b;
                lm lmVarZzn = zzt.zzn();
                if (lmVarZzn.f17055b.getAndSet(true)) {
                    return;
                }
                lmVarZzn.f17056c = context4;
                lmVarZzn.f17057d = yh0Var;
                if (lmVarZzn.f17059f != null || (strB = u.g.b(context4, null, false)) == null || strB.equals(context4.getPackageName())) {
                    return;
                }
                u.g.a(context4, strB, lmVarZzn);
                return;
        }
    }

    public String toString() {
        switch (this.f22582a) {
            case 0:
                ay0 ay0Var = new ay0(zd1.class.getSimpleName());
                yd1 yd1Var = (yd1) this.f22584c;
                f81 f81Var = new f81(0, false);
                ((f81) ay0Var.f12539d).f14318c = f81Var;
                ay0Var.f12539d = f81Var;
                f81Var.f14317b = yd1Var;
                return ay0Var.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zd1(se0 se0Var, df0 df0Var) {
        this.f22582a = 25;
        this.f22583b = se0Var;
        this.f22584c = (qh) df0Var;
    }

    public /* synthetic */ zd1(Object obj, boolean z10, Object obj2, int i10) {
        this.f22582a = i10;
        this.f22583b = obj2;
        this.f22584c = obj;
    }
}
