package oj;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends xi.u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f47467e = new b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47468d;

    public /* synthetic */ b(int i10) {
        this.f47468d = i10;
    }

    @Override // xi.u
    public Object f(byte b10, ByteBuffer byteBuffer) {
        switch (this.f47468d) {
            case 1:
                if (b10 == -127) {
                    Long l = (Long) e(byteBuffer);
                    if (l == null) {
                        return null;
                    }
                    int iLongValue = (int) l.longValue();
                    b0.f47469b.getClass();
                    for (b0 b0Var : b0.values()) {
                        if (b0Var.f47474a == iLongValue) {
                            return b0Var;
                        }
                    }
                    return null;
                }
                if (b10 == -126) {
                    Object objE = e(byteBuffer);
                    List list = objE instanceof List ? (List) objE : null;
                    if (list == null) {
                        return null;
                    }
                    String str = (String) list.get(0);
                    Object obj = list.get(1);
                    kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new g(str, ((Boolean) obj).booleanValue());
                }
                if (b10 != -125) {
                    return super.f(b10, byteBuffer);
                }
                Object objE2 = e(byteBuffer);
                List list2 = objE2 instanceof List ? (List) objE2 : null;
                if (list2 == null) {
                    return null;
                }
                String str2 = (String) list2.get(0);
                Object obj2 = list2.get(1);
                kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                return new d0(str2, (b0) obj2);
            default:
                return super.f(b10, byteBuffer);
        }
    }

    @Override // xi.u
    public void k(ByteArrayOutputStream stream, Object obj) {
        switch (this.f47468d) {
            case 1:
                kotlin.jvm.internal.n.f(stream, "stream");
                if (obj instanceof b0) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                    k(stream, Long.valueOf(((b0) obj).f47474a));
                } else if (obj instanceof g) {
                    stream.write(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    k(stream, ((g) obj).a());
                } else if (!(obj instanceof d0)) {
                    super.k(stream, obj);
                } else {
                    stream.write(131);
                    d0 d0Var = (d0) obj;
                    k(stream, xj.o.Q(d0Var.f47479a, d0Var.f47480b));
                }
                break;
            default:
                super.k(stream, obj);
                break;
        }
    }
}
