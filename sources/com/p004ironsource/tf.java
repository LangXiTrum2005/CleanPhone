package com.p004ironsource;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/ironsource/tf;", "", "Ljava/util/UUID;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tf f27296a = new tf();

    private tf() {
    }

    public final UUID a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.e(uuidRandomUUID, "randomUUID()");
        return uuidRandomUUID;
    }
}
