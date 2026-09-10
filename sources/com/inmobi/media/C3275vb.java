package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3275vb implements InterfaceC3169p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdQualityResult f24060a;

    public C3275vb(AdQualityResult result) {
        Intrinsics.f(result, "result");
        this.f24060a = result;
    }

    @Override // com.inmobi.media.InterfaceC3169p0
    public final Object a() {
        boolean z2;
        try {
            ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
            ((C3025g0) Nc.f23017a.getX()).a(this.f24060a);
            z2 = true;
        } catch (SQLiteException e2) {
            Log.e("QueueProcess", "failed to queue the result", e2);
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
