package com.unity3d.ads.core.data.datasource;

import ak.f;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.k0;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import ck.e;
import ck.i;
import cn.a0;
import cn.d0;
import fn.a1;
import fn.g;
import fn.n0;
import fn.p0;
import fn.y0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidLifecycleDataSource;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Landroidx/lifecycle/t;", "<init>", "()V", "Lwj/r;", "registerAppLifecycle", "", "appIsForeground", "()Z", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m;", NotificationCompat.CATEGORY_EVENT, "onStateChanged", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m;)V", "Lfn/n0;", "_appActive", "Lfn/n0;", "Lfn/y0;", "appActive", "Lfn/y0;", "getAppActive", "()Lfn/y0;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidLifecycleDataSource implements LifecycleDataSource, t {
    private final n0 _appActive;
    private final y0 appActive;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", f = "AndroidLifecycleDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        int label;

        public AnonymousClass1(f fVar) {
            super(2, fVar);
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return AndroidLifecycleDataSource.this.new AnonymousClass1(fVar);
        }

        @Override // jk.c
        public final Object invoke(a0 a0Var, f fVar) {
            return ((AnonymousClass1) create(a0Var, fVar)).invokeSuspend(r.f53297a);
        }

        @Override // ck.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t9.e.z(obj);
            k0 k0Var = k0.f4555h;
            k0.f4555h.f4561f.a(AndroidLifecycleDataSource.this);
            return r.f53297a;
        }
    }

    public AndroidLifecycleDataSource() {
        a1 a1VarC = g.c(Boolean.TRUE);
        this._appActive = a1VarC;
        this.appActive = new p0(a1VarC);
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        d0.w(d0.d(), null, new AnonymousClass1(null), 3);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return ((Boolean) getAppActive().getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public y0 getAppActive() {
        return this.appActive;
    }

    @Override // androidx.lifecycle.t
    public void onStateChanged(v source, m event) {
        n.f(source, "source");
        n.f(event, "event");
        n0 n0Var = this._appActive;
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean zBooleanValue = true;
        if (i10 == 1) {
            zBooleanValue = false;
        } else if (i10 != 2) {
            zBooleanValue = ((Boolean) getAppActive().getValue()).booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        a1 a1Var = (a1) n0Var;
        a1Var.getClass();
        a1Var.e0(null, boolValueOf);
    }
}
