package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ironsource.Z3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gm0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14901c;

    public /* synthetic */ gm0(int i10, Object obj, Object obj2) {
        this.f14899a = i10;
        this.f14900b = obj;
        this.f14901c = obj2;
    }

    private final void a() {
        iw0 iw0Var = (iw0) this.f14900b;
        synchronized (((xx1) this.f14901c)) {
        }
        String str = uu0.f20901a;
        d02 d02Var = ((jy1) iw0Var.f15865c).f16219a.f19727s;
        d02Var.f(d02Var.i((r32) d02Var.f13329d.f21139e), Z3.f28072i, new b02(18));
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        fv fvVar;
        Object c71Var;
        int i10;
        long j10;
        boolean z10;
        boolean z11 = true;
        int i11 = 0;
        switch (this.f14899a) {
            case 0:
                oy0 oy0Var = (oy0) this.f14900b;
                b21 b21Var = (b21) this.f14901c;
                Iterator it = oy0Var.f18408d.values().iterator();
                while (it.hasNext()) {
                    ((ky0) it.next()).c();
                }
                Timer timer = new Timer();
                timer.schedule(new vl0(oy0Var, b21Var, timer), 1000L);
                return;
            case 1:
                oy0 oy0Var2 = (oy0) this.f14900b;
                View view = (View) this.f14901c;
                my0 my0Var = my0.f17588a;
                for (ky0 ky0Var : oy0Var2.f18408d.values()) {
                    if (!ky0Var.f16562f) {
                        ky0Var.f16558b.a(view, my0Var);
                    }
                }
                oy0Var2.f18409e.a(view, my0Var);
                return;
            case 2:
                dn0 dn0Var = (dn0) this.f14900b;
                b30 b30Var = (b30) this.f14901c;
                b30Var.zzJ();
                ou0 ou0Var = dn0Var.f13603d;
                t30 t30VarZzh = b30Var.zzh();
                zzfw zzfwVar = ou0Var.f18360a;
                if (zzfwVar != null && t30VarZzh != null) {
                    t30VarZzh.x1(zzfwVar);
                }
                if (!((Boolean) zzba.zzc().a(am.Z1)).booleanValue() || b30Var.isAttachedToWindow()) {
                    return;
                }
                b30Var.onPause();
                b30Var.L();
                return;
            case 3:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f14901c).registerReceiver(new q7.c((wo0) this.f14900b, 4), intentFilter);
                return;
            case 4:
                ((wo0) ((q7.c) this.f14900b).f48672b).c((Context) this.f14901c);
                return;
            case 5:
                ((lp0) ((vu0) ((v90) ((o8) this.f14900b).f18185f).f21138d).f21276d).j0((zze) this.f14901c);
                return;
            case 6:
                ((us0) ((o8) this.f14900b).f18185f).f20884d.j0((zze) this.f14901c);
                return;
            case 7:
                ((zs0) this.f14900b).f22706d.j0((zze) this.f14901c);
                return;
            case 8:
                ((yt0) ((o8) this.f14900b).f18185f).f22366d.j0((zze) this.f14901c);
                return;
            case 9:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f14901c;
                InputStream inputStream = (InputStream) this.f14900b;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                        try {
                            p9.c.e(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } catch (Throwable th2) {
                            try {
                                autoCloseOutputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        return;
                    }
                } catch (Throwable th4) {
                    if (inputStream == null) {
                        throw th4;
                    }
                    try {
                        inputStream.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            case 10:
                hx0 hx0Var = (hx0) this.f14900b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f14901c;
                if (atomicBoolean.get()) {
                    new Thread(new gm0(12, (md0) hx0Var.f15420d, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 11:
                ((yv0) ((v90) this.f14900b).f21140f).f22380c.S0(new wv0((uv0) this.f14901c, i11));
                return;
            case 12:
                md0 md0Var = (md0) this.f14900b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f14901c;
                synchronized (md0Var) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) md0Var.f17400c) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            case 13:
                kw0 kw0Var = (kw0) this.f14900b;
                hw0 hw0Var = (hw0) this.f14901c;
                synchronized (kw0.l) {
                    try {
                        if (!kw0Var.f16555i) {
                            kw0Var.f16555i = true;
                            if (kw0.a()) {
                                try {
                                    zzt.zzc();
                                    kw0Var.f16550d = zzs.zzr(kw0Var.f16547a);
                                } catch (RemoteException | RuntimeException e10) {
                                    zzt.zzh().d("CuiMonitor.gettingAppIdFromManifest", e10);
                                }
                                i9.e eVar = i9.e.f42929b;
                                Context context = kw0Var.f16547a;
                                eVar.getClass();
                                kw0Var.f16551e = i9.e.a(context);
                                int iIntValue = ((Integer) zzba.zzc().a(am.f12152fa)).intValue();
                                if (((Boolean) zzba.zzc().a(am.Bd)).booleanValue()) {
                                    long j11 = iIntValue;
                                    l00.f16611d.scheduleWithFixedDelay(kw0Var, j11, j11, TimeUnit.MILLISECONDS);
                                } else {
                                    long j12 = iIntValue;
                                    l00.f16611d.scheduleAtFixedRate(kw0Var, j12, j12, TimeUnit.MILLISECONDS);
                                }
                                ul ulVar = am.f12243la;
                                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue()) {
                                    h40 h40Var = kw0Var.f16554h;
                                    h40Var.getClass();
                                    if (((Boolean) zzba.zzc().a(ulVar)).booleanValue() && !h40Var.f15112e.getAndSet(true)) {
                                        h40Var.a();
                                    }
                                }
                                break;
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                if (kw0.a() && hw0Var != null) {
                    synchronized (kw0.f16545k) {
                        try {
                            ow0 ow0Var = kw0Var.f16549c;
                            if (((rw0) ow0Var.f19193b).z() >= ((Integer) zzba.zzc().a(am.f12168ga)).intValue()) {
                                return;
                            }
                            lw0 lw0VarB = nw0.B();
                            int i12 = hw0Var.f15412m;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).X(i12);
                            boolean z12 = hw0Var.f15402b;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).C(z12);
                            long j13 = hw0Var.f15401a;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).D(j13);
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).Y();
                            String str = kw0Var.f16548b.afmaVersion;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).F(str);
                            String str2 = kw0Var.f16550d;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).G(str2);
                            String str3 = Build.VERSION.RELEASE;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).H(str3);
                            int i13 = Build.VERSION.SDK_INT;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).I(i13);
                            int i14 = hw0Var.f15414o;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).z(i14);
                            int i15 = hw0Var.f15403c;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).K(i15);
                            long j14 = kw0Var.f16551e;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).L(j14);
                            int i16 = hw0Var.f15413n;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).A(i16);
                            String str4 = hw0Var.f15404d;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).M(str4);
                            String str5 = hw0Var.f15405e;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).N(str5);
                            String str6 = hw0Var.f15406f;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).O(str6);
                            lh0 lh0VarB = kw0Var.f16552f.b(hw0Var.f15406f);
                            String string = (lh0VarB == null || (fvVar = lh0VarB.f16989b) == null) ? "" : fvVar.toString();
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).P(string);
                            String str7 = hw0Var.f15407g;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).Q(str7);
                            mw0 mw0Var = hw0Var.f15408h;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).U(mw0Var);
                            String str8 = hw0Var.f15411k;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).T(str8);
                            String str9 = hw0Var.f15409i;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).R(str9);
                            String str10 = hw0Var.f15410j;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).S(str10);
                            long j15 = hw0Var.l;
                            lw0VarB.b();
                            ((nw0) lw0VarB.f19193b).E(j15);
                            if (((Boolean) zzba.zzc().a(am.f12228ka)).booleanValue()) {
                                List list = kw0Var.f16553g;
                                lw0VarB.b();
                                ((nw0) lw0VarB.f19193b).J(list);
                            }
                            if (((Boolean) zzba.zzc().a(am.f12243la)).booleanValue()) {
                                h40 h40Var2 = kw0Var.f16554h;
                                vu1 vu1Var = h40Var2.f15109b;
                                String str11 = h40Var2.f15108a;
                                if (vu1Var != null) {
                                    lw0VarB.b();
                                    ((nw0) lw0VarB.f19193b).V(vu1Var);
                                }
                                if (str11 != null) {
                                    lw0VarB.b();
                                    ((nw0) lw0VarB.f19193b).W(str11);
                                }
                            }
                            pw0 pw0VarZ = qw0.z();
                            pw0VarZ.b();
                            ((qw0) pw0VarZ.f19193b).A((nw0) lw0VarB.e());
                            ow0Var.b();
                            ((rw0) ow0Var.f19193b).B((qw0) pw0VarZ.e());
                            return;
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                }
                return;
            case 14:
                ux0 ux0Var = (ux0) this.f14901c;
                zzdx zzdxVar = (zzdx) this.f14900b;
                zzcb zzcbVar = ux0Var.f20929h;
                if (zzcbVar != null) {
                    try {
                        zzcbVar.zze((zzfp) ux0Var.f20926e.get());
                    } catch (RemoteException unused2) {
                        int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Failed to call onAdsAvailable");
                    }
                    break;
                }
                zzce zzceVar = ux0Var.f20930i;
                if (zzceVar != null) {
                    try {
                        zzceVar.zze(ux0Var.l, zzdxVar);
                        return;
                    } catch (RemoteException unused3) {
                        int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Failed to call onAdPreloaded");
                        return;
                    }
                }
                return;
            case 15:
                ux0 ux0Var2 = (ux0) this.f14901c;
                zze zzeVar = (zze) this.f14900b;
                zzce zzceVar2 = ux0Var2.f20930i;
                if (zzceVar2 != null) {
                    try {
                        zzceVar2.zzg(ux0Var2.l, zzeVar);
                        return;
                    } catch (RemoteException unused4) {
                        int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzi("Failed to call onAdFailedToPreload");
                        return;
                    }
                }
                return;
            case 16:
                s6.x((WebView) this.f14900b, (String) this.f14901c);
                return;
            case 17:
                ((TaskCompletionSource) this.f14901c).setResult(q01.a((Context) this.f14900b, "GLAS"));
                return;
            case 18:
                p51 p51Var = (p51) this.f14900b;
                i01 i01Var = (i01) this.f14901c;
                if (!p51Var.f18531a.a(i01Var)) {
                    throw new aa.b(2);
                }
                p51Var.f18536f.set("2.893135394.".concat(String.valueOf(i01Var.f15463a.z())));
                return;
            case 19:
                IBinder iBinder = (IBinder) this.f14901c;
                int i20 = d71.f13446a;
                if (iBinder == null) {
                    c71Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                    c71Var = iInterfaceQueryLocalInterface instanceof e71 ? (e71) iInterfaceQueryLocalInterface : new c71(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
                }
                p71 p71Var = (p71) this.f14900b;
                ln0 ln0Var = p71Var.f18552a;
                ln0Var.f17079j = c71Var;
                ((tf1) ln0Var.f17073d).b("linkToDeath", new Object[0]);
                try {
                    IInterface iInterface = (e71) ln0Var.f17079j;
                    if (iInterface == null) {
                        throw null;
                    }
                    ((ph) iInterface).asBinder().linkToDeath((q71) ln0Var.f17077h, 0);
                    ln0 ln0Var2 = p71Var.f18552a;
                    ln0Var2.f17070a = false;
                    synchronized (((ArrayList) ln0Var2.f17075f)) {
                        try {
                            Iterator it2 = ((ArrayList) ln0Var2.f17075f).iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            ((ArrayList) ln0Var2.f17075f).clear();
                        } catch (Throwable th8) {
                            throw th8;
                        }
                        break;
                    }
                    return;
                } catch (RemoteException e11) {
                    ((tf1) p71Var.f18552a.f17073d).e(e11, "linkToDeath failed", new Object[0]);
                }
                break;
            case 20:
                ((id1) this.f14900b).u((y91) this.f14901c);
                return;
            case 21:
                ry1 ry1Var = (ry1) this.f14900b;
                androidx.recyclerview.widget.w wVar = (androidx.recyclerview.widget.w) this.f14901c;
                int i21 = ry1Var.G - wVar.f4945c;
                ry1Var.G = i21;
                if (wVar.f4946d) {
                    ry1Var.H = wVar.f4947e;
                    ry1Var.I = true;
                }
                if (i21 == 0) {
                    ci ciVar = ((nz1) wVar.f4948f).f18038a;
                    int iR0 = -1;
                    if (!ry1Var.f19708a0.f18038a.g() && ciVar.g()) {
                        ry1Var.f19709b0 = -1;
                        ry1Var.f19711c0 = 0L;
                    }
                    if (!ciVar.g()) {
                        List listAsList = Arrays.asList(((sz1) ciVar).f20099h);
                        int size = listAsList.size();
                        ArrayList arrayList = ry1Var.f19725q;
                        ps1.c0(size == arrayList.size());
                        for (int i22 = 0; i22 < listAsList.size(); i22++) {
                            ((oy1) arrayList.get(i22)).f18411b = (ci) listAsList.get(i22);
                        }
                    }
                    boolean z13 = ry1Var.I;
                    long j16 = C.TIME_UNSET;
                    if (z13) {
                        boolean z14 = ((nz1) wVar.f4948f).f18038a.g() && ry1Var.f19708a0.f18038a.g();
                        boolean zEquals = ((nz1) wVar.f4948f).f18039b.equals(ry1Var.f19708a0.f18039b);
                        long j17 = ((nz1) wVar.f4948f).f18041d;
                        long j18 = ry1Var.f19708a0.f18054r;
                        if (z14 || (zEquals && j17 == j18)) {
                            z11 = false;
                        }
                        if (z11) {
                            iR0 = ry1Var.R0();
                            if (ciVar.g() || ((nz1) wVar.f4948f).f18039b.b()) {
                                j16 = ((nz1) wVar.f4948f).f18041d;
                            } else {
                                nz1 nz1Var = (nz1) wVar.f4948f;
                                r32 r32Var = nz1Var.f18039b;
                                long j19 = nz1Var.f18041d;
                                ciVar.o(r32Var.f19359a, ry1Var.f19724p);
                                j16 = j19;
                            }
                        }
                        i10 = iR0;
                        j10 = j16;
                        z10 = z11;
                    } else {
                        i10 = -1;
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    ry1Var.I = false;
                    ry1Var.f1((nz1) wVar.f4948f, 1, z10, ry1Var.H, j10, i10);
                    return;
                }
                return;
            case 22:
                ((h02) this.f14900b).u((NetworkEvent) this.f14901c);
                return;
            case 23:
                ((h02) this.f14900b).v((PlaybackStateEvent) this.f14901c);
                return;
            case 24:
                ((h02) this.f14900b).w((TrackChangeEvent) this.f14901c);
                return;
            case 25:
                ((h02) this.f14900b).x((PlaybackMetrics) this.f14901c);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                ((h02) this.f14900b).t((PlaybackErrorEvent) this.f14901c);
                return;
            case 27:
                iw0 iw0Var = (iw0) this.f14900b;
                wx1 wx1Var = (wx1) this.f14901c;
                iw0Var.getClass();
                String str12 = uu0.f20901a;
                ((jy1) iw0Var.f15865c).f16219a.E.g(wx1Var);
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                a();
                return;
            default:
                uw uwVar = (uw) this.f14900b;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.f14901c).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) uwVar.f20921e).post(new f12(i11, uwVar, routedDevice));
                    return;
                }
                return;
        }
    }

    public gm0(s6 s6Var, WebView webView, String str) {
        this.f14899a = 16;
        this.f14900b = webView;
        this.f14901c = str;
    }

    public gm0(ux0 ux0Var, zzdx zzdxVar) {
        this.f14899a = 14;
        this.f14900b = zzdxVar;
        Objects.requireNonNull(ux0Var);
        this.f14901c = ux0Var;
    }

    public gm0(ux0 ux0Var, zze zzeVar) {
        this.f14899a = 15;
        this.f14900b = zzeVar;
        Objects.requireNonNull(ux0Var);
        this.f14901c = ux0Var;
    }
}
