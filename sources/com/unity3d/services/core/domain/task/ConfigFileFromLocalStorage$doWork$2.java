package com.unity3d.services.core.domain.task;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.properties.SdkProperties;
import hk.k;
import java.io.File;
import java.util.concurrent.CancellationException;
import jk.c;
import kotlin.Metadata;
import org.json.JSONObject;
import wj.g;
import wj.h;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcn/a0;", "Lwj/h;", "Lcom/unity3d/services/core/configuration/Configuration;", "<anonymous>", "(Lcn/a0;)Lwj/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2", f = "ConfigFileFromLocalStorage.kt", l = {}, m = "invokeSuspend")
public final class ConfigFileFromLocalStorage$doWork$2 extends i implements c {
    final /* synthetic */ ConfigFileFromLocalStorage.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$2(ConfigFileFromLocalStorage.Params params, f fVar) {
        super(2, fVar);
        this.$params = params;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new ConfigFileFromLocalStorage$doWork$2(this.$params, fVar);
    }

    @Override // jk.c
    public final Object invoke(a0 a0Var, f fVar) {
        return ((ConfigFileFromLocalStorage$doWork$2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Throwable thA;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t9.e.z(obj);
        ConfigFileFromLocalStorage.Params params = this.$params;
        try {
            File file = new File(SdkProperties.getLocalConfigurationFilepath());
            objC = !file.exists() ? params.getDefaultConfiguration() : new Configuration(new JSONObject(k.V(file)));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            objC = t9.e.c(th2);
        }
        if ((objC instanceof g) && (thA = h.a(objC)) != null) {
            objC = t9.e.c(thA);
        }
        return new h(objC);
    }
}
