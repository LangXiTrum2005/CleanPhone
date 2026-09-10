package com.unity3d.services.core.domain.task;

import ak.f;
import bk.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.n;
import t9.e;
import wj.g;
import wj.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u001a\u001a\u00028\u0000H\u0096Bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0011¢\u0006\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "P", "R", "Lcom/unity3d/services/core/domain/task/BaseTask;", "<init>", "()V", "Lwj/h;", "result", "Lwj/r;", "captureMetric", "(Ljava/lang/Object;)V", "sendMetric", "Lcom/unity3d/services/core/request/metrics/Metric;", "getMetric", "()Lcom/unity3d/services/core/request/metrics/Metric;", "", "", "getMetricTagsForState", "()Ljava/util/Map;", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "getSDKMetrics", "()Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "", "getStatePrefixLength", "()I", "params", "invoke-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/BaseParams;Lak/f;)Ljava/lang/Object;", "invoke", "getMetricName", "()Ljava/lang/String;", "", "task", "getMetricNameForTask", "(Ljava/lang/Object;)Ljava/lang/String;", "name", "getMetricNameForInitializeTask", "(Ljava/lang/String;)Ljava/lang/String;", "", IronSourceConstants.EVENTS_DURATION, "J", "getDuration", "()J", "setDuration", "(J)V", "taskStatus", "Ljava/lang/String;", "getTaskStatus", "setTaskStatus", "(Ljava/lang/String;)V", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public abstract class MetricTask<P extends BaseParams, R> implements BaseTask<P, R> {
    private long duration;
    private String taskStatus = "unknown";

    private final void captureMetric(Object result) {
        this.taskStatus = !(result instanceof g) ? "success" : "failure";
        sendMetric();
    }

    private final Metric getMetric() {
        return new Metric(getMetricName(), Long.valueOf(this.duration), getMetricTagsForState());
    }

    private final Map<String, String> getMetricTagsForState() {
        Map<String, String> retryTags = InitializeEventsMetricSender.getInstance().getRetryTags();
        n.e(retryTags, "getInstance().retryTags");
        return retryTags;
    }

    private final SDKMetricsSender getSDKMetrics() {
        return (SDKMetricsSender) getServiceProvider().getRegistry().getService("", d0.f44761a.b(SDKMetricsSender.class));
    }

    private final int getStatePrefixLength() {
        return 15;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke-gIAlu-s$suspendImpl, reason: not valid java name */
    public static Object m3256invokegIAlus$suspendImpl(MetricTask<? super P, R> metricTask, P p10, f fVar) {
        MetricTask$invoke$1 metricTask$invoke$1;
        c0 c0Var;
        TimeUnit timeUnit;
        long jNanoTime;
        Object objM3240invokegIAlus;
        MetricTask<? super P, R> metricTask2;
        c0 c0Var2;
        if (fVar instanceof MetricTask$invoke$1) {
            metricTask$invoke$1 = (MetricTask$invoke$1) fVar;
            int i10 = metricTask$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                metricTask$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                metricTask$invoke$1 = new MetricTask$invoke$1(metricTask, fVar);
            }
        } else {
            metricTask$invoke$1 = new MetricTask$invoke$1(metricTask, fVar);
        }
        Object obj = metricTask$invoke$1.result;
        int i11 = metricTask$invoke$1.label;
        if (i11 == 0) {
            e.z(obj);
            c0Var = new c0();
            timeUnit = TimeUnit.NANOSECONDS;
            jNanoTime = System.nanoTime();
            metricTask$invoke$1.L$0 = metricTask;
            metricTask$invoke$1.L$1 = c0Var;
            metricTask$invoke$1.L$2 = c0Var;
            metricTask$invoke$1.L$3 = metricTask;
            metricTask$invoke$1.L$4 = timeUnit;
            metricTask$invoke$1.J$0 = jNanoTime;
            metricTask$invoke$1.label = 1;
            objM3240invokegIAlus = BaseTask.DefaultImpls.m3240invokegIAlus(metricTask, p10, metricTask$invoke$1);
            a aVar = a.f5708a;
            if (objM3240invokegIAlus == aVar) {
                return aVar;
            }
            metricTask2 = metricTask;
            c0Var2 = c0Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j10 = metricTask$invoke$1.J$0;
            timeUnit = (TimeUnit) metricTask$invoke$1.L$4;
            MetricTask<? super P, R> metricTask3 = (MetricTask) metricTask$invoke$1.L$3;
            c0Var = (c0) metricTask$invoke$1.L$2;
            c0 c0Var3 = (c0) metricTask$invoke$1.L$1;
            metricTask2 = (MetricTask) metricTask$invoke$1.L$0;
            e.z(obj);
            objM3240invokegIAlus = ((h) obj).f53286a;
            c0Var2 = c0Var3;
            jNanoTime = j10;
            metricTask = metricTask3;
        }
        c0Var.f44760a = objM3240invokegIAlus;
        ((MetricTask) metricTask).duration = timeUnit.toMillis(System.nanoTime() - jNanoTime);
        metricTask2.captureMetric(c0Var2.f44760a);
        return c0Var2.f44760a;
    }

    private final void sendMetric() {
        String metricName = getMetricName();
        if (metricName == null || metricName.length() == 0) {
            return;
        }
        getSDKMetrics().sendMetric(getMetric());
    }

    public final long getDuration() {
        return this.duration;
    }

    public String getMetricName() {
        return null;
    }

    public final String getMetricNameForInitializeTask(String name) {
        n.f(name, "name");
        StringBuilder sb2 = new StringBuilder("native_");
        sb2.append(name);
        sb2.append("_task_");
        return defpackage.e.q(this.taskStatus, "_time", sb2);
    }

    public final String getMetricNameForTask(Object task) {
        n.f(task, "task");
        String simpleName = task.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            return null;
        }
        String strSubstring = simpleName.substring(getStatePrefixLength());
        n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = strSubstring.toLowerCase(Locale.ROOT);
        n.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return q4.a.j(new StringBuilder(lowerCase.length() + 13), "native_", lowerCase, "_state");
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }

    public final String getTaskStatus() {
        return this.taskStatus;
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: invoke-gIAlu-s */
    public Object mo3239invokegIAlus(P p10, f fVar) {
        return m3256invokegIAlus$suspendImpl(this, p10, fVar);
    }

    public final void setDuration(long j10) {
        this.duration = j10;
    }

    public final void setTaskStatus(String str) {
        n.f(str, "<set-?>");
        this.taskStatus = str;
    }
}
