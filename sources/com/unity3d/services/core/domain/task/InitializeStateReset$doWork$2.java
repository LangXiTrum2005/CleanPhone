package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
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
@e(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", l = {41}, m = "invokeSuspend")
public final class InitializeStateReset$doWork$2 extends i implements c {
    final /* synthetic */ InitializeStateReset.Params $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, f fVar) {
        super(2, fVar);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((InitializeStateReset$doWork$2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077 A[Catch: all -> 0x00bb, CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, all -> 0x00bb, blocks: (B:6:0x0010, B:23:0x005a, B:28:0x0068, B:30:0x0077, B:32:0x007d, B:34:0x008b, B:35:0x008d, B:37:0x0090, B:39:0x009c, B:40:0x00a3, B:41:0x00a6, B:42:0x00ab, B:43:0x00b2, B:44:0x00b3, B:45:0x00ba, B:26:0x0060, B:27:0x0067, B:11:0x0023, B:13:0x002e, B:15:0x0033, B:18:0x003b), top: B:58:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007d A[Catch: all -> 0x00bb, CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, all -> 0x00bb, blocks: (B:6:0x0010, B:23:0x005a, B:28:0x0068, B:30:0x0077, B:32:0x007d, B:34:0x008b, B:35:0x008d, B:37:0x0090, B:39:0x009c, B:40:0x00a3, B:41:0x00a6, B:42:0x00ab, B:43:0x00b2, B:44:0x00b3, B:45:0x00ba, B:26:0x0060, B:27:0x0067, B:11:0x0023, B:13:0x002e, B:15:0x0033, B:18:0x003b), top: B:58:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[Catch: all -> 0x00bb, CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, all -> 0x00bb, blocks: (B:6:0x0010, B:23:0x005a, B:28:0x0068, B:30:0x0077, B:32:0x007d, B:34:0x008b, B:35:0x008d, B:37:0x0090, B:39:0x009c, B:40:0x00a3, B:41:0x00a6, B:42:0x00ab, B:43:0x00b2, B:44:0x00b3, B:45:0x00ba, B:26:0x0060, B:27:0x0067, B:11:0x0023, B:13:0x002e, B:15:0x0033, B:18:0x003b), top: B:58:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[Catch: all -> 0x00bb, CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, all -> 0x00bb, blocks: (B:6:0x0010, B:23:0x005a, B:28:0x0068, B:30:0x0077, B:32:0x007d, B:34:0x008b, B:35:0x008d, B:37:0x0090, B:39:0x009c, B:40:0x00a3, B:41:0x00a6, B:42:0x00ab, B:43:0x00b2, B:44:0x00b3, B:45:0x00ba, B:26:0x0060, B:27:0x0067, B:11:0x0023, B:13:0x002e, B:15:0x0033, B:18:0x003b), top: B:58:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009c A[Catch: all -> 0x00bb, CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, all -> 0x00bb, blocks: (B:6:0x0010, B:23:0x005a, B:28:0x0068, B:30:0x0077, B:32:0x007d, B:34:0x008b, B:35:0x008d, B:37:0x0090, B:39:0x009c, B:40:0x00a3, B:41:0x00a6, B:42:0x00ab, B:43:0x00b2, B:44:0x00b3, B:45:0x00ba, B:26:0x0060, B:27:0x0067, B:11:0x0023, B:13:0x002e, B:15:0x0033, B:18:0x003b), top: B:58:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab A[Catch: all -> 0x00bb, CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, all -> 0x00bb, blocks: (B:6:0x0010, B:23:0x005a, B:28:0x0068, B:30:0x0077, B:32:0x007d, B:34:0x008b, B:35:0x008d, B:37:0x0090, B:39:0x009c, B:40:0x00a3, B:41:0x00a6, B:42:0x00ab, B:43:0x00b2, B:44:0x00b3, B:45:0x00ba, B:26:0x0060, B:27:0x0067, B:11:0x0023, B:13:0x002e, B:15:0x0033, B:18:0x003b), top: B:58:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3 A[Catch: all -> 0x00bb, CancellationException -> 0x00d5, TryCatch #2 {CancellationException -> 0x00d5, all -> 0x00bb, blocks: (B:6:0x0010, B:23:0x005a, B:28:0x0068, B:30:0x0077, B:32:0x007d, B:34:0x008b, B:35:0x008d, B:37:0x0090, B:39:0x009c, B:40:0x00a3, B:41:0x00a6, B:42:0x00ab, B:43:0x00b2, B:44:0x00b3, B:45:0x00ba, B:26:0x0060, B:27:0x0067, B:11:0x0023, B:13:0x002e, B:15:0x0033, B:18:0x003b), top: B:58:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3 A[SYNTHETIC] */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Throwable thA;
        InitializeStateReset.Params params;
        InitializeStateReset initializeStateReset;
        InitializeStateReset.Params params2;
        int i10;
        Class[] moduleConfigurationList;
        IModuleConfiguration moduleConfiguration;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                params = this.$params;
                initializeStateReset = this.this$0;
                DeviceLog.debug("Unity Ads init: starting init");
                WebViewApp currentApp = WebViewApp.getCurrentApp();
                if (currentApp != null) {
                    currentApp.resetWebViewAppInitialization();
                }
                if ((currentApp != null ? currentApp.getWebView() : null) != null) {
                    long webViewAppCreateTimeout = params.getConfig().getWebViewAppCreateTimeout();
                    InitializeStateReset$doWork$2$1$success$1 initializeStateReset$doWork$2$1$success$1 = new InitializeStateReset$doWork$2$1$success$1(initializeStateReset, currentApp, null);
                    this.L$0 = params;
                    this.L$1 = initializeStateReset;
                    this.label = 1;
                    Object objK = d0.K(webViewAppCreateTimeout, initializeStateReset$doWork$2$1$success$1, this);
                    a aVar = a.f5708a;
                    if (objK == aVar) {
                        return aVar;
                    }
                    obj = objK;
                    params2 = params;
                }
                initializeStateReset.unregisterLifecycleCallbacks();
                SdkProperties.setCacheDirectory(null);
                SdkProperties.setWebViewCacheDirectory(null);
                if (SdkProperties.getCacheDirectory() != null) {
                    throw new Exception("Cache directory is NULL");
                }
                if (SdkProperties.getWebViewCacheDirectory() != null) {
                    throw new Exception("WebView cache directory is NULL");
                }
                SdkProperties.setInitialized(false);
                moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                if (moduleConfigurationList == null) {
                    moduleConfigurationList = new Class[0];
                }
                for (Class cls : moduleConfigurationList) {
                    moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        moduleConfiguration.resetState(params.getConfig());
                    }
                }
                objC = params.getConfig();
                if ((objC instanceof g) && (thA = h.a(objC)) != null) {
                    objC = t9.e.c(thA);
                }
                return new h(objC);
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            initializeStateReset = (InitializeStateReset) this.L$1;
            params2 = (InitializeStateReset.Params) this.L$0;
            t9.e.z(obj);
            if (((r) obj) == null) {
                throw new Exception("Reset failed on opening ConditionVariable");
            }
            params = params2;
            initializeStateReset.unregisterLifecycleCallbacks();
            SdkProperties.setCacheDirectory(null);
            SdkProperties.setWebViewCacheDirectory(null);
            if (SdkProperties.getCacheDirectory() != null) {
                throw new Exception("Cache directory is NULL");
            }
            if (SdkProperties.getWebViewCacheDirectory() != null) {
                throw new Exception("WebView cache directory is NULL");
            }
            SdkProperties.setInitialized(false);
            moduleConfigurationList = params.getConfig().getModuleConfigurationList();
            if (moduleConfigurationList == null) {
                moduleConfigurationList = new Class[0];
            }
            while (i10 < r1) {
                moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.resetState(params.getConfig());
                }
            }
            objC = params.getConfig();
            if (objC instanceof g) {
                objC = t9.e.c(thA);
            }
            return new h(objC);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
    }
}
