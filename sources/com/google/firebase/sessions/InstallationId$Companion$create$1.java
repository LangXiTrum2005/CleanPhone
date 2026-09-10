package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {31, 39}, m = "create")
final class InstallationId$Companion$create$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f21083Y;
    public final /* synthetic */ InstallationId.Companion Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallationId$Companion$create$1(InstallationId.Companion companion, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Z = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21083Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
