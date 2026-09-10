package ads_mobile_sdk;

import saneness.cyclery;
import saneness.salutatory;

/* JADX INFO: loaded from: classes.dex */
public enum mv2 implements salutatory {
    STATUS_UNKNOWN(0),
    STATUS_UPDATE_PROGRAM_BYTECODE(1),
    STATUS_UPDATE_VM_AND_PROGRAM_BYTECODE(2),
    STATUS_NO_UPDATE(3),
    STATUS_FAILURE_ARCHITECTURE_NOT_SUPPORTED(4),
    STATUS_FAILURE_INVALID_RESPONSE_DECODE_FAILURE(5),
    STATUS_FAILURE_INVALID_RESPONSE_HTTP_ERROR(6),
    STATUS_FAILURE_INVALID_RESPONSE_EMPTY_BYTECODE(7),
    STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR(8),
    STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR_NPE(9),
    STATUS_FAILURE_INVALID_RESPONSE_PROGRAM_VALIDATION_FAILED(10),
    STATUS_FAILURE_INVALID_RESPONSE_SIGNATURE_VALIDATION_FAILED(11),
    STATUS_FAILURE_INVALID_RESPONSE_HTTP_RUNTIME_EXCEPTION(12);

    public final int a;

    mv2(int i) {
        this.a = i;
    }

    public static mv2 a(int i) {
        switch (i) {
            case 0:
                return STATUS_UNKNOWN;
            case 1:
                return STATUS_UPDATE_PROGRAM_BYTECODE;
            case 2:
                return STATUS_UPDATE_VM_AND_PROGRAM_BYTECODE;
            case 3:
                return STATUS_NO_UPDATE;
            case 4:
                return STATUS_FAILURE_ARCHITECTURE_NOT_SUPPORTED;
            case 5:
                return STATUS_FAILURE_INVALID_RESPONSE_DECODE_FAILURE;
            case 6:
                return STATUS_FAILURE_INVALID_RESPONSE_HTTP_ERROR;
            case 7:
                return STATUS_FAILURE_INVALID_RESPONSE_EMPTY_BYTECODE;
            case 8:
                return STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR;
            case 9:
                return STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR_NPE;
            case 10:
                return STATUS_FAILURE_INVALID_RESPONSE_PROGRAM_VALIDATION_FAILED;
            case 11:
                return STATUS_FAILURE_INVALID_RESPONSE_SIGNATURE_VALIDATION_FAILED;
            case 12:
                return STATUS_FAILURE_INVALID_RESPONSE_HTTP_RUNTIME_EXCEPTION;
            default:
                return null;
        }
    }

    @Override // saneness.salutatory
    public final int getNumber() {
        return this.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        cyclery.attabal(mv2.class, sb, '@').append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.a);
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }
}
