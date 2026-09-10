package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f12 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14170c;

    public /* synthetic */ f12(int i10, Object obj, Object obj2) {
        this.f14168a = i10;
        this.f14169b = obj;
        this.f14170c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zw zwVar;
        boolean z10 = false;
        switch (this.f14168a) {
            case 0:
                uw uwVar = (uw) this.f14169b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f14170c;
                if (((g12) uwVar.f20918b) == null || (zwVar = ((k12) ((wv0) uwVar.f20920d).f21612b).f16272f) == null || audioDeviceInfo.equals((AudioDeviceInfo) zwVar.f22737j)) {
                    return;
                }
                zwVar.f22737j = audioDeviceInfo;
                Context context = zwVar.f22728a;
                z80 z80Var = (z80) zwVar.f22738k;
                List listJ = zwVar.j();
                ya1 ya1Var = l02.f16619e;
                zwVar.k(l02.a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), z80Var, audioDeviceInfo, listJ));
                return;
            case 1:
                e22 e22Var = (e22) this.f14169b;
                f12 f12Var = (f12) this.f14170c;
                ((n22) e22Var.f13814e).zzg();
                i22 i22Var = (i22) e22Var.f13813d;
                synchronized (i22Var.f15534b) {
                    i22Var.d();
                    f12Var.run();
                    break;
                }
                return;
            case 2:
                s22 s22Var = (s22) this.f14169b;
                s22Var.E.set(s22Var.k((f81) this.f14170c, s22Var.f19808y, 0));
                return;
            case 3:
                ((ag0) this.f14169b).mo161zza(this.f14170c);
                return;
            default:
                h42 h42Var = (h42) this.f14169b;
                a3 a3Var = (a3) this.f14170c;
                h42Var.f15148z = h42Var.f15139q == null ? a3Var : new r2(C.TIME_UNSET, 0L);
                h42Var.A = a3Var.zza();
                if (!h42Var.H && a3Var.zza() == C.TIME_UNSET) {
                    z10 = true;
                }
                h42Var.B = z10;
                h42Var.C = true == z10 ? 7 : 1;
                if (h42Var.f15144v) {
                    h42Var.f15129f.s(h42Var.A, a3Var, z10);
                    return;
                } else {
                    h42Var.p();
                    return;
                }
        }
    }
}
