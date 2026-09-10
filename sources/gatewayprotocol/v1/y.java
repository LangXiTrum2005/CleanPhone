package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class y implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticTagType.forNumber(((Integer) obj).intValue());
        return diagnosticTagTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticTagType.UNRECOGNIZED : diagnosticTagTypeForNumber;
    }
}
