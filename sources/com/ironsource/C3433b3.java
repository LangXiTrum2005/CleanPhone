package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3433b3 implements InterfaceC3536gg {
    private final C3844yb a;
    private final AdSize b;

    /* JADX INFO: renamed from: com.ironsource.b3$a */
    public static final class a extends Lambda implements Function0<IronSourceError> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3753t5.a.a("Load task config is null");
        }
    }

    /* JADX INFO: renamed from: com.ironsource.b3$b */
    public static final class b extends Lambda implements Function0<IronSourceError> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return C3753t5.a.l();
        }
    }

    public C3433b3(C3844yb c3844yb, AdSize adSize) {
        this.a = c3844yb;
        this.b = adSize;
    }

    @Override // com.ironsource.InterfaceC3536gg
    public void a() {
        a(this.a != null, a.a);
        a(this.b != null, b.a);
    }
}
