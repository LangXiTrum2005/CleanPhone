package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.adquality.models.AdQualityControl;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3121m0 implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3153o0 f23800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V1 f23801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23802c;
    public final /* synthetic */ Jb d;

    public C3121m0(C3153o0 c3153o0, V1 v1, boolean z2, Jb jb) {
        this.f23800a = c3153o0;
        this.f23801b = v1;
        this.f23802c = z2;
        this.d = jb;
    }

    @Override // com.inmobi.media.Va
    public final void a(Object obj) {
        String beacon;
        Bitmap bitmap = (Bitmap) obj;
        C3153o0 c3153o0 = this.f23800a;
        V1 process = this.f23801b;
        boolean z2 = this.f23802c;
        Jb jb = this.d;
        c3153o0.getClass();
        Intrinsics.f(process, "process");
        c3153o0.a("Screen shot result received - isReporting - " + z2);
        c3153o0.f.remove(process);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (bitmap != null && jb != null) {
            jb.f22906a.c("window.mraidview.broadcastEvent('ScreenshotSuccess')");
        }
        if (z2) {
            String str = c3153o0.j;
            Intrinsics.c(byteArray);
            c3153o0.a(str, byteArray, true);
        } else {
            AdQualityControl adQualityControl = c3153o0.g;
            if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                c3153o0.a("saving to file - beacon - ".concat(beacon));
                Intrinsics.c(byteArray);
                c3153o0.a(beacon, byteArray, false);
            }
        }
        c3153o0.f23848l.set(false);
    }

    @Override // com.inmobi.media.Va
    public final void onError(Exception exc) {
        C3153o0 c3153o0 = this.f23800a;
        V1 process = this.f23801b;
        c3153o0.getClass();
        Intrinsics.f(process, "process");
        c3153o0.a(exc, "error in running process - ".concat(process.getClass().getSimpleName()));
        c3153o0.f.remove(process);
        c3153o0.a(true);
    }
}
