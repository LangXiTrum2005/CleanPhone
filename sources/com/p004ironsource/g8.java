package com.p004ironsource;

import com.smartdigimkt.h5.f;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\nJ \u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\nR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ironsource/g8;", "Lcom/ironsource/lf;", "Lcom/ironsource/o8;", "unit", "Lkotlin/Result;", "", "a", "(Lcom/ironsource/o8;)Ljava/lang/Object;", "Lcom/ironsource/nu;", "c", "()Ljava/lang/Object;", "Lcom/ironsource/aq;", "b", "Lcom/ironsource/oa;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "enabled", "", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "limit", "Lcom/ironsource/o8;", f.j, "()Lcom/ironsource/o8;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ironsource/o8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class g8 implements lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer limit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o8 unit;

    public g8(Boolean bool, Integer num, o8 o8Var) {
        this.enabled = bool;
        this.limit = num;
        this.unit = o8Var;
    }

    @Override // com.p004ironsource.lf
    public Object a() {
        Throwable thA = Result.a(new pa(this.enabled).a());
        if (thA != null) {
            return ResultKt.a(thA);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            return new oa(bool.booleanValue());
        }
        return null;
    }

    @Override // com.p004ironsource.lf
    public Object b() {
        Integer num;
        o8 o8Var = o8.Second;
        Throwable thA = Result.a(a(o8Var));
        if (thA != null) {
            return ResultKt.a(thA);
        }
        if (!Intrinsics.a(this.enabled, Boolean.TRUE) || (num = this.limit) == null) {
            return null;
        }
        return new aq(o8Var.a(num), null, 2, null);
    }

    @Override // com.p004ironsource.lf
    public Object c() {
        Integer num;
        Throwable thA = Result.a(a(this.unit));
        if (thA != null) {
            return ResultKt.a(thA);
        }
        if (!Intrinsics.a(this.enabled, Boolean.TRUE) || (num = this.limit) == null) {
            return null;
        }
        int iIntValue = num.intValue();
        o8 o8Var = this.unit;
        if (o8Var != null) {
            return new nu(iIntValue, o8Var);
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final o8 getUnit() {
        return this.unit;
    }

    public /* synthetic */ g8(Boolean bool, Integer num, o8 o8Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : o8Var);
    }

    private final Object a(o8 unit) {
        return new h8(this.enabled, this.limit, unit).a();
    }
}
