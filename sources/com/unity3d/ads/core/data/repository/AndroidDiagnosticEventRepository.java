package com.unity3d.ads.core.data.repository;

import ak.f;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import cn.w;
import cn.x;
import cn.z;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import fn.a1;
import fn.g;
import fn.m0;
import fn.n0;
import fn.r0;
import fn.u0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;
import xj.v;
import zm.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R8\u0010&\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010#0# $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010#0#\u0018\u00010%0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R8\u0010(\u001a&\u0012\f\u0012\n $*\u0004\u0018\u00010#0# $*\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010#0#\u0018\u00010%0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001eR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001eR \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001c0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R&\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001c0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "flushTimer", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "getDiagnosticEventRequest", "Lcn/w;", "dispatcher", "<init>", "(Lcom/unity3d/ads/core/utils/CoroutineTimer;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;Lcn/w;)V", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "diagnosticEvent", "Lwj/r;", "addDiagnosticEvent", "(Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;)V", "flush", "()V", "clear", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "diagnosticsEventsConfiguration", "configure", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;)V", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "Lcn/a0;", "coroutineScope", "Lcn/a0;", "Lfn/n0;", "", "batch", "Lfn/n0;", "", "maxBatchSize", "I", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "kotlin.jvm.PlatformType", "", "allowedEvents", "Ljava/util/Set;", "blockedEvents", "", "enabled", "configured", "Lfn/m0;", "_diagnosticEvents", "Lfn/m0;", "Lfn/r0;", "diagnosticEvents", "Lfn/r0;", "getDiagnosticEvents", "()Lfn/r0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final m0 _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final n0 batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final n0 configured;
    private final a0 coroutineScope;
    private final r0 diagnosticEvents;
    private final n0 enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$configure$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lwj/r;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends o implements jk.a {
        public AnonymousClass1() {
            super(0);
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3220invoke();
            return r.f53297a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3220invoke() {
            AndroidDiagnosticEventRepository.this.flush();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2", f = "AndroidDiagnosticEventRepository.kt", l = {71}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements c {
        final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, f fVar) {
            super(2, fVar);
            this.$events = list;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidDiagnosticEventRepository.this.new AnonymousClass2(this.$events, fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass2) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                t9.e.z(obj);
                m0 m0Var = AndroidDiagnosticEventRepository.this._diagnosticEvents;
                List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
                this.label = 1;
                Object objEmit = m0Var.emit(list, this);
                bk.a aVar = bk.a.f5708a;
                if (objEmit == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
            return r.f53297a;
        }
    }

    public AndroidDiagnosticEventRepository(CoroutineTimer flushTimer, GetDiagnosticEventRequest getDiagnosticEventRequest, w dispatcher) {
        n.f(flushTimer, "flushTimer");
        n.f(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        n.f(dispatcher, "dispatcher");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = d0.y(d0.y(d0.b(dispatcher), new z("DiagnosticEventRepository")), new AndroidDiagnosticEventRepository$special$$inlined$CoroutineExceptionHandler$1(x.f6783a));
        this.batch = g.c(v.f53866a);
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = g.c(bool);
        this.configured = g.c(bool);
        u0 u0VarA = g.a((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, en.a.f40122a);
        this._diagnosticEvents = u0VarA;
        this.diagnosticEvents = g.g(u0VarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String flush$lambda$4(AndroidDiagnosticEventRepository this$0, List events) {
        n.f(this$0, "this$0");
        n.f(events, "$events");
        return "Unity Ads Sending diagnostic batch enabled: " + ((Boolean) ((a1) this$0.enabled).getValue()).booleanValue() + " size: " + events.size() + " :: " + events;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        a1 a1Var;
        Object value;
        a1 a1Var2;
        Object value2;
        n.f(diagnosticEvent, "diagnosticEvent");
        if (!((Boolean) ((a1) this.configured).getValue()).booleanValue()) {
            n0 n0Var = this.batch;
            do {
                a1Var2 = (a1) n0Var;
                value2 = a1Var2.getValue();
            } while (!a1Var2.c0(value2, xj.n.D0((List) value2, diagnosticEvent)));
            return;
        }
        if (((Boolean) ((a1) this.enabled).getValue()).booleanValue()) {
            n0 n0Var2 = this.batch;
            do {
                a1Var = (a1) n0Var2;
                value = a1Var.getValue();
            } while (!a1Var.c0(value, xj.n.D0((List) value, diagnosticEvent)));
            if (((List) ((a1) this.batch).getValue()).size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        a1 a1Var;
        Object value;
        n0 n0Var = this.batch;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
        } while (!a1Var.c0(value, v.f53866a));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        n.f(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        n0 n0Var = this.configured;
        Boolean bool = Boolean.TRUE;
        a1 a1Var = (a1) n0Var;
        a1Var.getClass();
        a1Var.e0(null, bool);
        n0 n0Var2 = this.enabled;
        Boolean boolValueOf = Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled());
        a1 a1Var2 = (a1) n0Var2;
        a1Var2.getClass();
        a1Var2.e0(null, boolValueOf);
        if (!((Boolean) ((a1) this.enabled).getValue()).booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        n.e(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        n.e(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new AnonymousClass1());
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        a1 a1Var;
        Object value;
        if (((Boolean) ((a1) this.enabled).getValue()).booleanValue()) {
            n0 n0Var = this.batch;
            do {
                a1Var = (a1) n0Var;
                value = a1Var.getValue();
            } while (!a1Var.c0(value, v.f53866a));
            List listW = l.W(l.P(l.P(l.U(xj.n.g0((Iterable) value), new AndroidDiagnosticEventRepository$flush$events$2(this)), new AndroidDiagnosticEventRepository$flush$events$3(this)), new AndroidDiagnosticEventRepository$flush$events$4(this)));
            if (listW.isEmpty()) {
                return;
            }
            DeviceLog.debug(new a(0, this, listW));
            d0.w(this.coroutineScope, null, new AnonymousClass2(listW, null), 3);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public r0 getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
