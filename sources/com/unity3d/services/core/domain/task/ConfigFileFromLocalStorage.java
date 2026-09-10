package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import cn.d0;
import cn.w;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import t9.e;
import wj.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage$Params;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "dispatchers", "<init>", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "", "getMetricName", "()Ljava/lang/String;", "params", "Lwj/h;", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage$Params;Lak/f;)Ljava/lang/Object;", "doWork", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "Params", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ConfigFileFromLocalStorage extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "defaultConfiguration", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "getDefaultConfiguration", "()Lcom/unity3d/services/core/configuration/Configuration;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Params implements BaseParams {
        private final Configuration defaultConfiguration;

        public Params() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Configuration getDefaultConfiguration() {
            return this.defaultConfiguration;
        }

        public Params(Configuration defaultConfiguration) {
            n.f(defaultConfiguration, "defaultConfiguration");
            this.defaultConfiguration = defaultConfiguration;
        }

        public /* synthetic */ Params(Configuration configuration, int i10, g gVar) {
            this((i10 & 1) != 0 ? new Configuration() : configuration);
        }
    }

    public ConfigFileFromLocalStorage(ISDKDispatchers dispatchers) {
        n.f(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("read_local_config");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo3238doWorkgIAlus(Params params, f fVar) {
        ConfigFileFromLocalStorage$doWork$1 configFileFromLocalStorage$doWork$1;
        if (fVar instanceof ConfigFileFromLocalStorage$doWork$1) {
            configFileFromLocalStorage$doWork$1 = (ConfigFileFromLocalStorage$doWork$1) fVar;
            int i10 = configFileFromLocalStorage$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                configFileFromLocalStorage$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                configFileFromLocalStorage$doWork$1 = new ConfigFileFromLocalStorage$doWork$1(this, fVar);
            }
        } else {
            configFileFromLocalStorage$doWork$1 = new ConfigFileFromLocalStorage$doWork$1(this, fVar);
        }
        Object objJ = configFileFromLocalStorage$doWork$1.result;
        int i11 = configFileFromLocalStorage$doWork$1.label;
        if (i11 == 0) {
            e.z(objJ);
            w io2 = this.dispatchers.getIo();
            ConfigFileFromLocalStorage$doWork$2 configFileFromLocalStorage$doWork$2 = new ConfigFileFromLocalStorage$doWork$2(params, null);
            configFileFromLocalStorage$doWork$1.label = 1;
            objJ = d0.J(io2, configFileFromLocalStorage$doWork$2, configFileFromLocalStorage$doWork$1);
            a aVar = a.f5708a;
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.z(objJ);
        }
        return ((h) objJ).f53286a;
    }
}
