package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m02 extends AudioDeviceCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17191b;

    public /* synthetic */ m02(Object obj, int i10) {
        this.f17190a = i10;
        this.f17191b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        switch (this.f17190a) {
            case 0:
                ((zw) this.f17191b).l();
                break;
            default:
                ln0 ln0Var = (ln0) this.f17191b;
                ln0Var.e(r1.b.c((Context) ln0Var.f17071b, (i1.e) ln0Var.f17079j, (AudioDeviceInfo) ln0Var.f17078i));
                break;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i10 = this.f17190a;
        Object obj = this.f17191b;
        switch (i10) {
            case 0:
                zw zwVar = (zw) obj;
                String str = uu0.f20901a;
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (Objects.equals(audioDeviceInfo, (AudioDeviceInfo) zwVar.f22737j)) {
                        zwVar.f22737j = null;
                        zwVar.l();
                    }
                    break;
                }
                zwVar.l();
                break;
            default:
                ln0 ln0Var = (ln0) obj;
                if (l1.y.m(audioDeviceInfoArr, (AudioDeviceInfo) ln0Var.f17078i)) {
                    ln0Var.f17078i = null;
                }
                ln0Var.e(r1.b.c((Context) ln0Var.f17071b, (i1.e) ln0Var.f17079j, (AudioDeviceInfo) ln0Var.f17078i));
                break;
        }
    }
}
