package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import t9.e;
import wj.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096Bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/unity3d/services/core/domain/task/BaseTask;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "P", "R", "Lcom/unity3d/services/core/di/IServiceComponent;", "params", "Lwj/h;", "invoke-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/BaseParams;Lak/f;)Ljava/lang/Object;", "invoke", "doWork-gIAlu-s", "doWork", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class DefaultImpls {
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
        public static <P extends BaseParams, R> Object m3240invokegIAlus(BaseTask<? super P, R> baseTask, P p10, f fVar) {
            BaseTask$invoke$1 baseTask$invoke$1;
            if (fVar instanceof BaseTask$invoke$1) {
                baseTask$invoke$1 = (BaseTask$invoke$1) fVar;
                int i10 = baseTask$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    baseTask$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    baseTask$invoke$1 = new BaseTask$invoke$1(fVar);
                }
            } else {
                baseTask$invoke$1 = new BaseTask$invoke$1(fVar);
            }
            Object obj = baseTask$invoke$1.result;
            int i11 = baseTask$invoke$1.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.z(obj);
                return ((h) obj).f53286a;
            }
            e.z(obj);
            baseTask$invoke$1.label = 1;
            Object objMo3238doWorkgIAlus = baseTask.mo3238doWorkgIAlus(p10, baseTask$invoke$1);
            a aVar = a.f5708a;
            return objMo3238doWorkgIAlus == aVar ? aVar : objMo3238doWorkgIAlus;
        }
    }

    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    Object mo3238doWorkgIAlus(P p10, f fVar);

    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    Object mo3239invokegIAlus(P p10, f fVar);
}
