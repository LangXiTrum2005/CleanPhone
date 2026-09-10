package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.AdSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/ironsource/d7;", "Lcom/ironsource/uw;", "", "a", "Lcom/ironsource/en;", "Lcom/ironsource/en;", "loadTaskConfig", "Lcom/unity3d/ironsourceads/AdSize;", "b", "Lcom/unity3d/ironsourceads/AdSize;", "size", "<init>", "(Lcom/ironsource/en;Lcom/unity3d/ironsourceads/AdSize;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class d7 implements uw {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final en loadTaskConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AdSize size;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24620a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f27568a.a("Load task config is null");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "()Lcom/ironsource/mediationsdk/logger/IronSourceError;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends Lambda implements Function0<IronSourceError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f24621a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IronSourceError invoke() {
            return wb.f27568a.l();
        }
    }

    public d7(en enVar, AdSize adSize) {
        this.loadTaskConfig = enVar;
        this.size = adSize;
    }

    @Override // com.p004ironsource.uw
    public void a() {
        a(this.loadTaskConfig != null, a.f24620a);
        a(this.size != null, b.f24621a);
    }
}
