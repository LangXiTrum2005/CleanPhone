package com.unity3d.services.core.configuration;

import ak.f;
import android.app.Application;
import android.content.Context;
import ck.e;
import ck.i;
import cn.a0;
import cn.n0;
import cn.x;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import jk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.n;
import m4.b;
import wj.r;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/services/core/configuration/AdsSdkInitializer;", "Lm4/b;", "Lwj/r;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AdsSdkInitializer implements b {

    /* JADX INFO: renamed from: com.unity3d.services.core.configuration.AdsSdkInitializer$create$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcn/a0;", "Lwj/r;", "<anonymous>", "(Lcn/a0;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.services.core.configuration.AdsSdkInitializer$create$1", f = "AdsSdkInitializer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements c {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, f fVar) {
            super(2, fVar);
            this.$context = context;
        }

        @Override // ck.a
        public final f create(Object obj, f fVar) {
            return new AnonymousClass1(this.$context, fVar);
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
            ((OrientationRepository) ServiceProvider.INSTANCE.getRegistry().getService("", d0.f44761a.b(OrientationRepository.class))).invoke();
            try {
                fa.a.a(this.$context);
            } catch (Throwable unused) {
            }
            return r.f53297a;
        }
    }

    @Override // m4.b
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m3237create(context);
        return r.f53297a;
    }

    @Override // m4.b
    public List<Class<? extends b>> dependencies() {
        return v.f53866a;
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public void m3237create(Context context) {
        n.f(context, "context");
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            n.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
        cn.d0.w(cn.d0.y(cn.d0.b(n0.f6748a), new AdsSdkInitializer$create$$inlined$CoroutineExceptionHandler$1(x.f6783a)), null, new AnonymousClass1(context, null), 3);
    }
}
