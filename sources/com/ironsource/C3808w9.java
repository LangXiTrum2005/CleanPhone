package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3808w9 implements InterfaceC3536gg {
    private final C3844yb a;

    /* JADX INFO: renamed from: com.ironsource.w9$a */
    public static final class a extends Lambda implements Function0<IronSourceError> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3753t5.a.b("Load task config is null");
        }
    }

    public C3808w9(C3844yb c3844yb) {
        this.a = c3844yb;
    }

    @Override // com.ironsource.InterfaceC3536gg
    public void a() {
        a(this.a != null, a.a);
    }
}
