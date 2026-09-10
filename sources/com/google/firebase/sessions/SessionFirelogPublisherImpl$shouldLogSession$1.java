package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {98, 104}, m = "shouldLogSession")
final class SessionFirelogPublisherImpl$shouldLogSession$1 extends ContinuationImpl {
    public SessionFirelogPublisherImpl X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f21108Y;
    public final /* synthetic */ SessionFirelogPublisherImpl Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$shouldLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Z = sessionFirelogPublisherImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21108Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return SessionFirelogPublisherImpl.b(this.Z, this);
    }
}
