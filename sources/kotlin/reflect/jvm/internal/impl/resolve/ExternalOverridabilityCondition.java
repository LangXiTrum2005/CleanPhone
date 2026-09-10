package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* JADX INFO: loaded from: classes7.dex */
public interface ExternalOverridabilityCondition {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Contract {
        public static final Contract X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Contract f44281Y;
        public static final Contract Z;
        public static final /* synthetic */ Contract[] e0;

        static {
            Contract contract = new Contract("CONFLICTS_ONLY", 0);
            X = contract;
            Contract contract2 = new Contract("SUCCESS_ONLY", 1);
            f44281Y = contract2;
            Contract contract3 = new Contract("BOTH", 2);
            Z = contract3;
            e0 = new Contract[]{contract, contract2, contract3};
        }

        public static Contract valueOf(String str) {
            return (Contract) Enum.valueOf(Contract.class, str);
        }

        public static Contract[] values() {
            return (Contract[]) e0.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Result {
        public static final Result X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Result f44282Y;
        public static final Result Z;
        public static final /* synthetic */ Result[] e0;

        static {
            Result result = new Result("OVERRIDABLE", 0);
            X = result;
            Result result2 = new Result("CONFLICT", 1);
            Result result3 = new Result("INCOMPATIBLE", 2);
            f44282Y = result3;
            Result result4 = new Result("UNKNOWN", 3);
            Z = result4;
            e0 = new Result[]{result, result2, result3, result4};
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) e0.clone();
        }
    }

    Contract a();

    Result b(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor);
}
