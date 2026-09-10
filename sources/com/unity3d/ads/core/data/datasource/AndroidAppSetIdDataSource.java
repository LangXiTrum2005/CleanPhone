package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import fn.a1;
import fn.g;
import fn.n0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import jk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Lwj/r;", "invoke", "()V", "Landroid/content/Context;", "Lfn/n0;", "", "isCollecting", "Lfn/n0;", "", "_appSetIdFlow", "getAppSetId", "()Ljava/lang/String;", "appSetId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidAppSetIdDataSource {
    private final n0 _appSetIdFlow;
    private final Context applicationContext;
    private final n0 isCollecting;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/appset/AppSetIdInfo;", "kotlin.jvm.PlatformType", "it", "Lwj/r;", "invoke", "(Lcom/google/android/gms/appset/AppSetIdInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends o implements b {
        public AnonymousClass2() {
            super(1);
        }

        @Override // jk.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AppSetIdInfo) obj);
            return r.f53297a;
        }

        public final void invoke(AppSetIdInfo appSetIdInfo) {
            String id2 = appSetIdInfo.getId();
            n.e(id2, "it.id");
            a1 a1Var = (a1) AndroidAppSetIdDataSource.this._appSetIdFlow;
            a1Var.getClass();
            a1Var.e0(null, id2);
        }
    }

    public AndroidAppSetIdDataSource(Context applicationContext) {
        n.f(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        this.isCollecting = g.c(Boolean.FALSE);
        this._appSetIdFlow = g.c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(b tmp0, Object obj) {
        n.f(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public final String getAppSetId() {
        return (String) ((a1) this._appSetIdFlow).getValue();
    }

    public final void invoke() {
        a1 a1Var;
        Object value;
        Boolean bool;
        n0 n0Var = this.isCollecting;
        do {
            a1Var = (a1) n0Var;
            value = a1Var.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!a1Var.c0(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            AppSet.getClient(this.applicationContext).getAppSetIdInfo().addOnSuccessListener(new a(new AnonymousClass2()));
        } catch (Throwable unused) {
        }
    }
}
