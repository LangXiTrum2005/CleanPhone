package com.p004ironsource;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ironsource/us;", "", "", "a", "I", "b", "()I", "value", "<init>", "(Ljava/lang/String;II)V", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public enum us {
    LEVEL_PLAY_INIT(0),
    EXTERNAL_MEDIATION_INIT(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    us(int i2) {
        this.value = i2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
