package com.p004ironsource;

import com.smartdigimkt.q0.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0005j\u0002`\tH\u0016J:\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0010\u0006\u001a\u00060\u0005j\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00102\n\u0010\u0006\u001a\u00060\u0005j\u0002`\tH\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R#\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\b\u0010\u001c\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/ironsource/bq;", "Lcom/ironsource/nf;", "Lcom/ironsource/nf$a;", "Lcom/ironsource/aq;", b.i0, "", "identifier", "", "a", "Lcom/ironsource/services/capping/Identifier;", "Lcom/ironsource/n8;", "Lcom/ironsource/p8;", "cappingType", "Lcom/ironsource/lf;", "cappingConfig", "Lkotlin/Result;", "", "(Ljava/lang/String;Lcom/ironsource/p8;Lcom/ironsource/lf;)Ljava/lang/Object;", "b", "Lcom/ironsource/s9;", "Lcom/ironsource/s9;", "currentTimeProvider", "Lcom/ironsource/gg;", "Lcom/ironsource/gg;", "repository", "", "c", "Ljava/util/Map;", "()Ljava/util/Map;", ch.f24532p, "<init>", "(Lcom/ironsource/s9;Lcom/ironsource/gg;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bq implements nf, nf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s9 currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gg repository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, aq> configs;

    public bq(s9 currentTimeProvider, gg repository) {
        Intrinsics.f(currentTimeProvider, "currentTimeProvider");
        Intrinsics.f(repository, "repository");
        this.currentTimeProvider = currentTimeProvider;
        this.repository = repository;
        this.configs = new LinkedHashMap();
    }

    @Override // com.p004ironsource.nf
    public n8 a(String identifier) {
        Intrinsics.f(identifier, "identifier");
        aq aqVar = this.configs.get(identifier);
        if (aqVar != null && a(aqVar, identifier)) {
            return new n8(true, p8.Pacing);
        }
        return new n8(false, null, 2, null);
    }

    @Override // com.ironsource.nf.a
    public void b(String identifier) {
        Intrinsics.f(identifier, "identifier");
        if (this.configs.get(identifier) == null) {
            return;
        }
        this.repository.a(this.currentTimeProvider.a(), identifier);
    }

    public final Map<String, aq> a() {
        return this.configs;
    }

    private final boolean a(aq config, String identifier) {
        Long lA = this.repository.a(identifier);
        return lA != null && this.currentTimeProvider.a() - lA.longValue() < config.getTimeInterval();
    }

    @Override // com.ironsource.nf.a
    public Object a(String identifier, p8 cappingType, lf cappingConfig) {
        Intrinsics.f(identifier, "identifier");
        Intrinsics.f(cappingType, "cappingType");
        Intrinsics.f(cappingConfig, "cappingConfig");
        Object objB = cappingConfig.b();
        boolean z2 = objB instanceof Result.Failure;
        Unit unit = Unit.f43263a;
        if (z2) {
            Throwable thA = Result.a(objB);
            if (thA != null) {
                return ResultKt.a(thA);
            }
        } else {
            aq aqVar = (aq) objB;
            if (aqVar != null) {
                this.configs.put(identifier, aqVar);
                return unit;
            }
        }
        return unit;
    }
}
