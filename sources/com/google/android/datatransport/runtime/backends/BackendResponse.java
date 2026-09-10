package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BackendResponse {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final Status X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Status f16859Y;
        public static final Status Z;
        public static final Status e0;
        public static final /* synthetic */ Status[] f0;

        static {
            Status status = new Status("OK", 0);
            X = status;
            Status status2 = new Status("TRANSIENT_ERROR", 1);
            f16859Y = status2;
            Status status3 = new Status("FATAL_ERROR", 2);
            Z = status3;
            Status status4 = new Status("INVALID_PAYLOAD", 3);
            e0 = status4;
            f0 = new Status[]{status, status2, status3, status4};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f0.clone();
        }
    }

    public static BackendResponse a() {
        return new AutoValue_BackendResponse(Status.Z, -1L);
    }

    public static BackendResponse d() {
        return new AutoValue_BackendResponse(Status.e0, -1L);
    }

    public static BackendResponse e(long j) {
        return new AutoValue_BackendResponse(Status.X, j);
    }

    public static BackendResponse f() {
        return new AutoValue_BackendResponse(Status.f16859Y, -1L);
    }

    public abstract long b();

    public abstract Status c();
}
