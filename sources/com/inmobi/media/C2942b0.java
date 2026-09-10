package com.inmobi.media;

import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.inmobi.media.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2942b0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2976d0 f23456a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2942b0(C2976d0 c2976d0) {
        super(0);
        this.f23456a = c2976d0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C2976d0 c2976d0 = this.f23456a;
        c2976d0.getClass();
        Log.i("AdQualityBeaconExecutor", "beacon handler execute");
        c2976d0.f23504b.set(true);
        ScheduledExecutorService scheduledExecutorService = C3009f0.f23594a;
        Lazy lazy = Nc.f23017a;
        int iA = T1.a((C3025g0) lazy.getX(), null, null, 63);
        C3025g0 c3025g0 = (C3025g0) lazy.getX();
        c3025g0.getClass();
        Log.i("AdQualityDao", "peek");
        List<AdQualityResult> listA = T1.a(c3025g0, null, null, null, null, null, Integer.valueOf(iA), 31);
        if (listA.isEmpty()) {
            listA = EmptyList.X;
        }
        for (AdQualityResult adQualityResult : listA) {
            if (adQualityResult != null) {
                AdConfig adConfig = c2976d0.f23503a;
                C3318y6 c3318y6 = new C3318y6(adQualityResult, new C3262ue(adConfig.getIncludeIds()), adConfig.getAdQuality());
                C2959c0 c2959c0 = new C2959c0(c2976d0, adQualityResult);
                Log.i("JsonBeaconRequest", "hitBeacon");
                c3318y6.f();
                c3318y6.f23015w = new C3244tc(c3318y6.f24120z.getMaxRetries(), c3318y6.f24120z.getRetryInterval());
                c3318y6.a(new C3302x6(c2959c0));
            }
        }
        c2976d0.f23505c.set(true);
        return Unit.f43263a;
    }
}
