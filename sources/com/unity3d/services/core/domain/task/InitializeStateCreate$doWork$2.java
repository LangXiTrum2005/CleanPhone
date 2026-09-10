package com.unity3d.services.core.domain.task;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import java.util.concurrent.CancellationException;
import jk.c;
import kotlin.Metadata;
import wj.g;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn/a0;", "Lwj/h;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(Lcn/a0;)Lwj/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2", f = "InitializeStateCreate.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateCreate$doWork$2 extends i implements c {
    final /* synthetic */ InitializeStateCreate.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateCreate$doWork$2(InitializeStateCreate.Params params, f fVar) {
        super(2, fVar);
        this.$params = params;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new InitializeStateCreate$doWork$2(this.$params, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((InitializeStateCreate$doWork$2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Throwable thA;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        InitializeStateCreate.Params params = this.$params;
        try {
            DeviceLog.debug("Unity Ads init: creating webapp");
            Configuration config = params.getConfig();
            config.setWebViewData(params.getWebViewData());
            try {
                ErrorState errorStateCreate = WebViewApp.create(config, false);
                objC = config;
                if (errorStateCreate != null) {
                    String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                    DeviceLog.error(webAppFailureMessage);
                    throw new InitializationException(errorStateCreate, new Exception(webAppFailureMessage), config);
                }
            } catch (IllegalThreadStateException e10) {
                DeviceLog.exception("Illegal Thread", e10);
                throw new InitializationException(ErrorState.CreateWebApp, e10, config);
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        boolean z10 = objC instanceof g;
        Object objC2 = objC;
        if (z10 && (thA = h.a(objC)) != null) {
            objC2 = objC;
            objC2 = t9.e.c(thA);
        }
        objC2 = objC;
        return new h(objC2);
    }
}
