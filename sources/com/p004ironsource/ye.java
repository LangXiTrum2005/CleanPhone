package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/ironsource/ye;", "", "Lcom/ironsource/af;", "b", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface ye {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/ye$a;", "Lcom/ironsource/ye;", "Lcom/ironsource/af;", "b", "", "a", "Lcom/ironsource/af;", "c", "()Lcom/ironsource/af;", com.smartdigimkt.m6.a.r.f36787A, "<init>", "(Lcom/ironsource/af;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ye {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final af strategy;

        public a(af strategy) {
            Intrinsics.f(strategy, "strategy");
            this.strategy = strategy;
        }

        @Override // com.p004ironsource.ye
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.p004ironsource.ye
        /* JADX INFO: renamed from: b, reason: from getter */
        public af getStrategy() {
            return this.strategy;
        }

        public final af c() {
            return this.strategy;
        }
    }

    String a();

    /* JADX INFO: renamed from: b */
    af getStrategy();
}
