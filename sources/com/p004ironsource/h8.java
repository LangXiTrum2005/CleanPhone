package com.p004ironsource;

import kotlin.Metadata;
import kotlin.ResultKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ironsource/h8;", "Lcom/ironsource/mf;", "Lkotlin/Result;", "", "a", "()Ljava/lang/Object;", "Ljava/lang/Boolean;", "enabled", "", "b", "Ljava/lang/Integer;", "limit", "Lcom/ironsource/o8;", "c", "Lcom/ironsource/o8;", "unit", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ironsource/o8;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class h8 implements mf {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer limit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o8 unit;

    public h8(Boolean bool, Integer num, o8 o8Var) {
        this.enabled = bool;
        this.limit = num;
        this.unit = o8Var;
    }

    @Override // com.p004ironsource.mf
    public Object a() {
        Exception exc;
        Boolean bool = this.enabled;
        if (bool == null) {
            exc = new Exception("enabled flag is not provided or invalid");
        } else {
            if (!bool.booleanValue()) {
                return Boolean.FALSE;
            }
            Integer num = this.limit;
            if (num == null || num.intValue() <= 0) {
                exc = new Exception("limit flag is not provided or invalid");
            } else {
                if (this.unit != null) {
                    return Boolean.TRUE;
                }
                exc = new Exception("unit flag is not provided or invalid");
            }
        }
        return ResultKt.a(exc);
    }
}
