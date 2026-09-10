package com.facebook.appevents.gps.ara;

import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppEvent f10586c;

    public /* synthetic */ a(String str, AppEvent appEvent, int i10) {
        this.f10584a = i10;
        this.f10585b = str;
        this.f10586c = appEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10584a) {
            case 0:
                GpsAraTriggersManager.registerTriggerAsync$lambda$0(this.f10585b, this.f10586c);
                break;
            default:
                OnDeviceProcessingManager.sendCustomEventAsync$lambda$1(this.f10585b, this.f10586c);
                break;
        }
    }
}
