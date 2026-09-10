package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

/* JADX INFO: loaded from: classes3.dex */
public final class LogEventDropped {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Reason f16884b;

    public static final class Builder {
    }

    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        public final int X;

        Reason(int i2) {
            this.X = i2;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int getNumber() {
            return this.X;
        }
    }

    public LogEventDropped(long j, Reason reason) {
        this.f16883a = j;
        this.f16884b = reason;
    }
}
