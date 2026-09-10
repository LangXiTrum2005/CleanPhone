package com.p004ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016J:\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ironsource/ra;", "Lcom/ironsource/nf;", "Lcom/ironsource/nf$a;", "", "Lcom/ironsource/services/capping/Identifier;", "identifier", "Lcom/ironsource/n8;", "a", "Lcom/ironsource/p8;", "cappingType", "Lcom/ironsource/lf;", "cappingConfig", "Lkotlin/Result;", "", "(Ljava/lang/String;Lcom/ironsource/p8;Lcom/ironsource/lf;)Ljava/lang/Object;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ironsource/oa;", "Ljava/util/concurrent/ConcurrentHashMap;", "deliveryConfigs", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ra implements nf, nf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, oa> deliveryConfigs = new ConcurrentHashMap<>();

    @Override // com.p004ironsource.nf
    public n8 a(String identifier) {
        Intrinsics.f(identifier, "identifier");
        oa oaVar = this.deliveryConfigs.get(identifier);
        return (oaVar == null || oaVar.getEnabled()) ? new n8(false, null, 2, null) : new n8(true, p8.Delivery);
    }

    @Override // com.ironsource.nf.a
    public void b(String identifier) {
        Intrinsics.f(identifier, "identifier");
    }

    @Override // com.ironsource.nf.a
    public Object a(String identifier, p8 cappingType, lf cappingConfig) {
        Intrinsics.f(identifier, "identifier");
        Intrinsics.f(cappingType, "cappingType");
        Intrinsics.f(cappingConfig, "cappingConfig");
        Object objA = cappingConfig.a();
        boolean z2 = objA instanceof Result.Failure;
        Unit unit = Unit.f43263a;
        if (z2) {
            Throwable thA = Result.a(objA);
            if (thA != null) {
                return ResultKt.a(thA);
            }
        } else {
            oa oaVar = (oa) objA;
            if (oaVar != null) {
                this.deliveryConfigs.put(identifier, oaVar);
                return unit;
            }
        }
        return unit;
    }
}
