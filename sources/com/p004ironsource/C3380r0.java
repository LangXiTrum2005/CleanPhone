package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/r0;", "Lcom/ironsource/uw;", "", "a", "", "Ljava/lang/String;", "adm", "Lcom/ironsource/cj;", "b", "Lcom/ironsource/cj;", "adapterConfig", "", "c", "Z", "isSDKInitialized", "<init>", "(Ljava/lang/String;Lcom/ironsource/cj;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class C3380r0 implements uw {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String adm;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cj adapterConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isSDKInitialized;

    /* JADX INFO: renamed from: com.ironsource.r0$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26651a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f27568a.r();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r0$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26652a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f27568a.o();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r0$c */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26653a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f27568a.n();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r0$d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26654a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f27568a.q();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r0$e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;"}, k = 3, mv = {1, 8, 0})
    public static final class e extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f26655a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f27568a.o();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r0$f */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;"}, k = 3, mv = {1, 8, 0})
    public static final class f extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f26656a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f27568a.g();
        }
    }

    public C3380r0(String adm, cj cjVar, boolean z2) {
        Intrinsics.f(adm, "adm");
        this.adm = adm;
        this.adapterConfig = cjVar;
        this.isSDKInitialized = z2;
    }

    @Override // com.p004ironsource.uw
    public void a() throws rs {
        a(this.isSDKInitialized, a.f26651a);
        a(this.adapterConfig != null, b.f26652a);
        cj cjVar = this.adapterConfig;
        if (cjVar != null) {
            if (cjVar.c() == ej.NonBidder) {
                a(this.adm.length() == 0, c.f26653a);
            }
            if (cjVar.c() == ej.Bidder) {
                a(this.adm.length() > 0, d.f26654a);
            }
            a(cjVar.c() != ej.NotSupported, e.f26655a);
            a(cjVar.b().length() > 0, f.f26656a);
        }
    }
}
