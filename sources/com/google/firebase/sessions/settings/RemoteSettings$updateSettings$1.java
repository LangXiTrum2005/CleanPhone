package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {165, 78, 95}, m = "updateSettings")
final class RemoteSettings$updateSettings$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Mutex f21156Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ RemoteSettings e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$1(RemoteSettings remoteSettings, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.Z = obj;
        this.f0 |= Integer.MIN_VALUE;
        return this.e0.d(this);
    }
}
