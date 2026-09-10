package be;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends com.google.gson.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5679a;

    @Override // com.google.gson.t
    public final Object b(ge.a aVar) throws IOException {
        switch (this.f5679a) {
            case 0:
                aVar.N();
                return null;
            case 1:
                if (aVar.H() != 9) {
                    return Double.valueOf(aVar.y());
                }
                aVar.D();
                return null;
            default:
                if (aVar.H() != 9) {
                    return Float.valueOf((float) aVar.y());
                }
                aVar.D();
                return null;
        }
    }

    @Override // com.google.gson.t
    public final void c(ge.b bVar, Object obj) throws IOException {
        switch (this.f5679a) {
            case 0:
                bVar.s();
                break;
            case 1:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    com.google.gson.d.a(dDoubleValue);
                    bVar.x(dDoubleValue);
                } else {
                    bVar.s();
                }
                break;
            default:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    com.google.gson.d.a(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    bVar.A(numberValueOf);
                } else {
                    bVar.s();
                }
                break;
        }
    }

    public String toString() {
        switch (this.f5679a) {
            case 0:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
