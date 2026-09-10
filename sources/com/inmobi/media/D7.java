package com.inmobi.media;

import A.RunnableC0899k;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class D7 extends ContentObserver implements InterfaceC3207r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f22764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22765c;
    public final /* synthetic */ F7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(F7 f7, String mJsCallbackNamespace, Context context, Handler handler) {
        super(handler);
        Intrinsics.f(mJsCallbackNamespace, "mJsCallbackNamespace");
        this.d = f7;
        this.f22763a = mJsCallbackNamespace;
        this.f22764b = context;
        this.f22765c = -1;
    }

    public static final void a(D7 this$0, F7 this$1, boolean z2) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(this$1, "this$1");
        Context context = this$0.f22764b;
        if (context != null) {
            Object systemService = context.getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume != this$0.f22765c) {
                        this$0.f22765c = streamVolume;
                        InterfaceC3333z5 interfaceC3333z5 = this$1.f22818b;
                        if (interfaceC3333z5 != null) {
                            ((A5) interfaceC3333z5).a("MraidMediaProcessor", "volume change detected - " + z2);
                        }
                        String str = this$0.f22763a;
                        InterfaceC3333z5 interfaceC3333z6 = this$1.f22818b;
                        if (interfaceC3333z6 != null) {
                            ((A5) interfaceC3333z6).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
                        }
                        GestureDetectorOnGestureListenerC3005ec gestureDetectorOnGestureListenerC3005ec = this$1.f22817a;
                        if (gestureDetectorOnGestureListenerC3005ec != null) {
                            gestureDetectorOnGestureListenerC3005ec.a(str, "fireDeviceVolumeChangeEvent(" + streamVolume + ");");
                        }
                    }
                } catch (Exception e2) {
                    InterfaceC3333z5 interfaceC3333z7 = this$1.f22818b;
                    if (interfaceC3333z7 != null) {
                        ((A5) interfaceC3333z7).a("MraidMediaProcessor", "Unexpected error in volume listener", e2);
                    }
                }
            }
        }
    }

    @Override // com.inmobi.media.InterfaceC3207r7
    public final void b() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        contextD.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        super.onChange(z2);
        ((ScheduledThreadPoolExecutor) AbstractC3332z4.f24144b.getX()).execute(new RunnableC0899k(this, this.d, z2, 0));
    }

    @Override // com.inmobi.media.InterfaceC3207r7
    public final void a() {
        Context contextD = Uc.d();
        if (contextD == null) {
            return;
        }
        contextD.getContentResolver().unregisterContentObserver(this);
    }
}
