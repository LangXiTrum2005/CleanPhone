package com.unity3d.ads.core.domain;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import bn.f;
import bn.h;
import ck.e;
import ck.i;
import cn.w;
import com.ironsource.X3;
import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import fn.a1;
import fn.g;
import fn.n0;
import fn.s;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.concurrent.ConcurrentHashMap;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR*\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b$\u0010\u0019\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0012R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleFocusCounters;", "", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "focusRepository", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "isAdActivity", "Lcn/w;", "defaultDispatcher", "Lbn/h;", "timeSource", "<init>", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/FocusRepository;Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;Lcn/w;Lbn/h;)V", "", "activityName", "Lwj/r;", X3.i.f27817u0, "(Ljava/lang/String;)V", X3.i.t0, "Lcom/unity3d/ads/core/data/repository/FocusState;", "newState", "onFocusStateChange", "(Lcom/unity3d/ads/core/data/repository/FocusState;)V", "invoke", "()V", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/FocusRepository;", "Lcom/unity3d/ads/core/domain/AndroidGetIsAdActivity;", "Lcn/w;", "Lbn/h;", "latestKnownActivityResumed", "Ljava/lang/String;", "getLatestKnownActivityResumed", "()Ljava/lang/String;", "setLatestKnownActivityResumed", "getLatestKnownActivityResumed$annotations", "Ljava/util/concurrent/ConcurrentHashMap;", "Lbn/f;", "focusTimesPerActivity", "Ljava/util/concurrent/ConcurrentHashMap;", "Lfn/n0;", "previousFocusState", "Lfn/n0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidHandleFocusCounters {
    private final w defaultDispatcher;
    private final FocusRepository focusRepository;
    private final ConcurrentHashMap<String, f> focusTimesPerActivity;
    private final AndroidGetIsAdActivity isAdActivity;
    private volatile String latestKnownActivityResumed;
    private final n0 previousFocusState;
    private final SessionRepository sessionRepository;
    private final h timeSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusState;", NotificationCompat.CATEGORY_EVENT, "Lwj/r;", "<anonymous>", "(Lcom/unity3d/ads/core/data/repository/FocusState;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(ak.f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final ak.f create(Object obj, ak.f fVar) {
            AnonymousClass1 anonymousClass1 = AndroidHandleFocusCounters.this.new AnonymousClass1(fVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // jk.c
        public final Object invoke(FocusState focusState, ak.f fVar) {
            return ((AnonymousClass1) create(focusState, fVar)).invokeSuspend(r.f53297a);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x002c  */
        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            String strD;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            FocusState focusState = (FocusState) this.L$0;
            AndroidHandleFocusCounters.this.onFocusStateChange(focusState);
            Activity activity = focusState.getActivity().get();
            if (activity != null) {
                strD = d0.f44761a.b(activity.getClass()).d();
                if (strD == null) {
                    strD = "unknown_activity_name";
                }
            } else {
                strD = "unknown_activity_name";
            }
            boolean zInvoke = AndroidHandleFocusCounters.this.isAdActivity.invoke(strD);
            r rVar = r.f53297a;
            if (zInvoke) {
                AndroidHandleFocusCounters.this.sessionRepository.incrementGlobalAdsFocusChangeCount();
                if (focusState instanceof FocusState.Focused) {
                    AndroidHandleFocusCounters.this.onResume(strD);
                    return rVar;
                }
                if (focusState instanceof FocusState.Unfocused) {
                    AndroidHandleFocusCounters.this.onPause(strD);
                }
            }
            return rVar;
        }
    }

    public AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity isAdActivity, w defaultDispatcher, h timeSource) {
        n.f(sessionRepository, "sessionRepository");
        n.f(focusRepository, "focusRepository");
        n.f(isAdActivity, "isAdActivity");
        n.f(defaultDispatcher, "defaultDispatcher");
        n.f(timeSource, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = isAdActivity;
        this.defaultDispatcher = defaultDispatcher;
        this.timeSource = timeSource;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = g.c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState newState) {
        a1 a1Var;
        Object value;
        FocusState focusState;
        n0 n0Var = this.previousFocusState;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            focusState = (FocusState) value;
        } while (!a1Var.c0(value, newState));
        if (focusState == null || newState.getClass() == focusState.getClass()) {
            return;
        }
        this.sessionRepository.incrementFocusChangeCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String activityName) {
        String str = this.latestKnownActivityResumed;
        if (str == null || str.equals(activityName)) {
            f fVarRemove = this.focusTimesPerActivity.remove(activityName);
            if (fVarRemove == null) {
                fVarRemove = this.timeSource.a();
            }
            this.sessionRepository.addTimeToGlobalAdsFocusTime((int) bn.a.d(f.a(fVarRemove.f5756a)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String activityName) {
        this.latestKnownActivityResumed = activityName;
        this.focusTimesPerActivity.put(activityName, this.timeSource.a());
    }

    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        g.o(new s(this.focusRepository.getFocusState(), new AnonymousClass1(null), 2), cn.d0.b(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(String str) {
        this.latestKnownActivityResumed = str;
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, w wVar, h hVar, int i10, kotlin.jvm.internal.g gVar) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, wVar, (i10 & 16) != 0 ? bn.g.f5757a : hVar);
    }

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }
}
