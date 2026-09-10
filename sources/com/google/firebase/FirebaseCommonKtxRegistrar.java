package com.google.firebase;

import androidx.annotation.Keep;
import cn.w;
import com.google.android.gms.internal.ads.em0;
import com.google.firebase.components.ComponentRegistrar;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import sb.b;
import sb.c;
import sb.d;
import tb.a;
import tb.h;
import tb.q;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Ltb/a;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        em0 em0VarB = a.b(new q(sb.a.class, w.class));
        em0VarB.a(new h(new q(sb.a.class, Executor.class), 1, 0));
        em0VarB.f14015f = mb.h.f45938b;
        a aVarB = em0VarB.b();
        em0 em0VarB2 = a.b(new q(c.class, w.class));
        em0VarB2.a(new h(new q(c.class, Executor.class), 1, 0));
        em0VarB2.f14015f = mb.h.f45939c;
        a aVarB2 = em0VarB2.b();
        em0 em0VarB3 = a.b(new q(b.class, w.class));
        em0VarB3.a(new h(new q(b.class, Executor.class), 1, 0));
        em0VarB3.f14015f = mb.h.f45940d;
        a aVarB3 = em0VarB3.b();
        em0 em0VarB4 = a.b(new q(d.class, w.class));
        em0VarB4.a(new h(new q(d.class, Executor.class), 1, 0));
        em0VarB4.f14015f = mb.h.f45941e;
        return o.Q(aVarB, aVarB2, aVarB3, em0VarB4.b());
    }
}
