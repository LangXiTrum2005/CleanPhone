package kotlin.reflect.jvm.internal.impl.types.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class CaptureStatus {
    public static final CaptureStatus X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ CaptureStatus[] f44595Y;

    static {
        CaptureStatus captureStatus = new CaptureStatus("FOR_SUBTYPING", 0);
        X = captureStatus;
        f44595Y = new CaptureStatus[]{captureStatus, new CaptureStatus("FOR_INCORPORATION", 1), new CaptureStatus("FROM_EXPRESSION", 2)};
    }

    public static CaptureStatus valueOf(String str) {
        return (CaptureStatus) Enum.valueOf(CaptureStatus.class, str);
    }

    public static CaptureStatus[] values() {
        return (CaptureStatus[]) f44595Y.clone();
    }
}
