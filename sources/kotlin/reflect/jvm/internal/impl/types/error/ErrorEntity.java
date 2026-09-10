package kotlin.reflect.jvm.internal.impl.types.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ErrorEntity {
    public static final /* synthetic */ ErrorEntity[] X = {new ErrorEntity("ERROR_CLASS", 0), new ErrorEntity("ERROR_FUNCTION", 1), new ErrorEntity("ERROR_SCOPE", 2), new ErrorEntity("ERROR_MODULE", 3), new ErrorEntity("ERROR_PROPERTY", 4), new ErrorEntity("ERROR_TYPE", 5), new ErrorEntity("PARENT_OF_ERROR_SCOPE", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    ErrorEntity EF5;

    public static ErrorEntity valueOf(String str) {
        return (ErrorEntity) Enum.valueOf(ErrorEntity.class, str);
    }

    public static ErrorEntity[] values() {
        return (ErrorEntity[]) X.clone();
    }
}
