package xi;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f53820a = new j();

    @Override // xi.l
    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objJ = go.c.J(obj);
        if (objJ instanceof String) {
            w wVar = w.f53833b;
            String strQuote = JSONObject.quote((String) objJ);
            wVar.getClass();
            return w.d(strQuote);
        }
        w wVar2 = w.f53833b;
        String string = objJ.toString();
        wVar2.getClass();
        return w.d(string);
    }

    @Override // xi.l
    public final Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            w.f53833b.getClass();
            JSONTokener jSONTokener = new JSONTokener(w.c(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }
}
