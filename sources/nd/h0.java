package nd;

import com.google.protobuf.Internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        m0 m0VarA = m0.a(((Integer) obj).intValue());
        return m0VarA == null ? m0.SESSION_VERBOSITY_NONE : m0VarA;
    }
}
