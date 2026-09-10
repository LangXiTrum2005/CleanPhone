package com.inmobi.media;

import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2959c0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2976d0 f23473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdQualityResult f23474b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2959c0(C2976d0 c2976d0, AdQualityResult adQualityResult) {
        super(1);
        this.f23473a = c2976d0;
        this.f23474b = adQualityResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Jb jb;
        Jb jb2;
        I9 i9 = (I9) obj;
        if (EnumC3157o4.d.equals(i9)) {
            Log.i("AdQualityBeaconExecutor", "no network... skipping cleanup");
        } else {
            Log.i("AdQualityBeaconExecutor", "beacon hit completed... cleaning up");
            if (i9 == null) {
                WeakReference weakReference = (WeakReference) this.f23473a.d.get(this.f23474b.getBeaconUrl());
                if (weakReference != null && (jb2 = (Jb) weakReference.get()) != null) {
                    jb2.f22906a.c("window.mraidview.broadcastEvent('AdReportSuccess')");
                }
            } else {
                WeakReference weakReference2 = (WeakReference) this.f23473a.d.get(this.f23474b.getBeaconUrl());
                if (weakReference2 != null && (jb = (Jb) weakReference2.get()) != null) {
                    jb.f22906a.c("window.mraidview.broadcastEvent('AdReportFailed')");
                }
            }
            C2976d0 c2976d0 = this.f23473a;
            AdQualityResult result = this.f23474b;
            c2976d0.getClass();
            Intrinsics.f(result, "result");
            try {
                ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
                C3025g0 c3025g0 = (C3025g0) Nc.f23017a.getX();
                c3025g0.getClass();
                Log.i("AdQualityDao", "de-queueing");
                c3025g0.a("image_location=?", new String[]{result.getImageLocation()});
                if (c3025g0.f23619b != null) {
                    Log.i("AdQualityDao", "sending callback - dequeue");
                }
                if (result.getImageLocation().length() == 0) {
                    Log.i("AdQualityBeaconExecutor", "no image to clear. clean up done.");
                } else {
                    File file = new File(result.getImageLocation());
                    Log.i("AdQualityBeaconExecutor", "deleting file");
                    String message = "delete file result - " + file.delete();
                    Intrinsics.f(message, "message");
                    Log.i("AdQualityBeaconExecutor", message);
                }
            } catch (Exception e2) {
                Log.e("AdQualityBeaconExecutor", "exception while cleanup", e2);
            }
        }
        return Unit.f43263a;
    }
}
