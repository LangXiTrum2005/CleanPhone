package com.p004ironsource;

import android.content.Context;
import com.p004ironsource.environment.ContextProvider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016J:\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\r2\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/ironsource/l8;", "Lcom/ironsource/nf;", "Lcom/ironsource/nf$a;", "", "Lcom/ironsource/services/capping/Identifier;", "identifier", "Lcom/ironsource/n8;", "a", "Lcom/ironsource/p8;", "cappingType", "Lcom/ironsource/lf;", "cappingConfig", "Lkotlin/Result;", "", "(Ljava/lang/String;Lcom/ironsource/p8;Lcom/ironsource/lf;)Ljava/lang/Object;", "b", "Lcom/ironsource/bq;", "Lcom/ironsource/bq;", "pacingHandler", "Lcom/ironsource/qu;", "Lcom/ironsource/qu;", "showCountHandler", "Lcom/ironsource/s9;", "currentTimeProvider", "Lcom/ironsource/gg;", "pacingDataRepository", "Lcom/ironsource/mi;", "showCountDataRepository", "<init>", "(Lcom/ironsource/s9;Lcom/ironsource/gg;Lcom/ironsource/mi;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class l8 implements nf, nf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bq pacingHandler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qu showCountHandler;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25565a;

        static {
            int[] iArr = new int[p8.values().length];
            try {
                iArr[p8.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p8.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p8.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25565a = iArr;
        }
    }

    public l8() {
        this(null, null, null, 7, null);
    }

    @Override // com.p004ironsource.nf
    public synchronized n8 a(String identifier) {
        Intrinsics.f(identifier, "identifier");
        n8 n8VarA = this.pacingHandler.a(identifier);
        if (n8VarA.d()) {
            return n8VarA;
        }
        return this.showCountHandler.a(identifier);
    }

    @Override // com.ironsource.nf.a
    public synchronized void b(String identifier) {
        Intrinsics.f(identifier, "identifier");
        this.pacingHandler.b(identifier);
        this.showCountHandler.b(identifier);
    }

    public l8(s9 currentTimeProvider, gg pacingDataRepository, mi showCountDataRepository) {
        Intrinsics.f(currentTimeProvider, "currentTimeProvider");
        Intrinsics.f(pacingDataRepository, "pacingDataRepository");
        Intrinsics.f(showCountDataRepository, "showCountDataRepository");
        this.pacingHandler = new bq(currentTimeProvider, pacingDataRepository);
        this.showCountHandler = new qu(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.nf.a
    public synchronized Object a(String identifier, p8 cappingType, lf cappingConfig) {
        Object objA;
        try {
            Intrinsics.f(identifier, "identifier");
            Intrinsics.f(cappingType, "cappingType");
            Intrinsics.f(cappingConfig, "cappingConfig");
            int i2 = a.f25565a[cappingType.ordinal()];
            if (i2 == 1) {
                objA = this.pacingHandler.a(identifier, cappingType, cappingConfig);
            } else if (i2 == 2) {
                objA = this.showCountHandler.a(identifier, cappingType, cappingConfig);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                objA = Unit.f43263a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return objA;
    }

    public /* synthetic */ l8(s9 s9Var, gg ggVar, mi miVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        s9Var = (i2 & 1) != 0 ? new s9.a() : s9Var;
        if ((i2 & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.e(applicationContext, "getInstance().applicationContext");
            ggVar = new cq(new lu(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i2 & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.e(applicationContext2, "getInstance().applicationContext");
            miVar = new ou(new lu(applicationContext2, "capping_service", null, 4, null));
        }
        this(s9Var, ggVar, miVar);
    }
}
