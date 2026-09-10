package com.smartdigimkt.n4;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f37035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0<? super h> f37036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h.a f37037c;

    public o(Context context, String str) {
        this(context, str, (a0<? super h>) null);
    }

    @Override // com.smartdigimkt.n4.h.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n a() {
        return new n(this.f37035a, this.f37036b, this.f37037c.a());
    }

    public o(Context context, String str, a0<? super h> a0Var) {
        this(context, a0Var, new q(str, a0Var));
    }

    public o(Context context, a0<? super h> a0Var, h.a aVar) {
        this.f37035a = context.getApplicationContext();
        this.f37036b = a0Var;
        this.f37037c = aVar;
    }
}
