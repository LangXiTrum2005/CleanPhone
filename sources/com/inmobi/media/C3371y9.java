package com.inmobi.media;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.taiyuan;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: renamed from: com.inmobi.media.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3371y9 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SdkInitializationListener d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3371y9(Context context, String str, SdkInitializationListener sdkInitializationListener, long j, dern dernVar) {
        super(1, dernVar);
        this.b = context;
        this.c = str;
        this.d = sdkInitializationListener;
        this.e = j;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new C3371y9(this.b, this.c, this.d, this.e, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3371y9) create((dern) obj)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = attabal.beachfront();
        int i = this.a;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                Yk.a(this.b);
                Context context = Ji.a;
                if (context != null) {
                    File file = new File(context.getFilesDir(), "im_cached_content");
                    if (file.mkdir() || !file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                    } else {
                        Intrinsics.checkNotNullExpressionValue("Ji", "TAG");
                    }
                }
                taiyuan.saneness(null, new Xk(null), 1, null);
                String primaryAccountId = this.c;
                Intrinsics.checkNotNullParameter(primaryAccountId, "primaryAccountId");
                Context context2 = Ji.a;
                if (context2 != null) {
                    ConcurrentHashMap concurrentHashMap = Ea.b;
                    Da.a(context2, "coppa_store").a("im_accid", primaryAccountId, false);
                }
                Context context3 = this.b;
                this.a = 1;
                if (taiyuan.saneness(null, new Wk(context3, null), 1, null) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            Ji.i = 2;
            InMobiSdk inMobiSdk = InMobiSdk.INSTANCE;
            InMobiSdk.access$provideCallback(inMobiSdk, this.d, null);
            Og.a.getClass();
            cutely.wireman(A9.e, null, null, new Kg(null), 3, null);
            Map mapAccess$prepareTelemetryPayload = InMobiSdk.access$prepareTelemetryPayload(inMobiSdk, this.e);
            Wj wj = Wj.a;
            Wj.b("SdkInitialized", mapAccess$prepareTelemetryPayload, EnumC2779ak.SDK);
            InMobiUnifiedIdService.push(C2766a7.b);
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue(InMobiSdk.access$getTAG$p(), "access$getTAG$p(...)");
            e.getMessage();
            Ji.c = null;
            Ji.a = null;
            Ji.i = 3;
            InMobiSdk.access$provideCallback(InMobiSdk.INSTANCE, this.d, "SDK could not be initialized; an unexpected error was encountered.");
        }
        return Unit.f29295attabal;
    }
}
