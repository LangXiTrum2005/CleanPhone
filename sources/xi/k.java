package xi;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f53821a = new k();

    @Override // xi.q
    public m a(ByteBuffer byteBuffer) {
        Object objNextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                objNextValue = null;
            } else {
                try {
                    w.f53833b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(w.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e10) {
                    throw new IllegalArgumentException("Invalid JSON", e10);
                }
            }
            if (objNextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objNextValue;
                Object obj2 = jSONObject.get("method");
                Object objOpt = jSONObject.opt("args");
                if (objOpt != JSONObject.NULL) {
                    obj = objOpt;
                }
                if (obj2 instanceof String) {
                    return new m((String) obj2, obj);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objNextValue);
        } catch (JSONException e11) {
            throw new IllegalArgumentException("Invalid JSON", e11);
        }
    }

    @Override // xi.q
    public ByteBuffer b(Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(go.c.J(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objJ = go.c.J(jSONArrayPut);
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

    @Override // xi.q
    public Object c(ByteBuffer byteBuffer) {
        try {
            try {
                w.f53833b.getClass();
                JSONTokener jSONTokener = new JSONTokener(w.c(byteBuffer));
                Object objNextValue = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
                if (objNextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objNextValue;
                    Object obj = null;
                    if (jSONArray.length() == 1) {
                        Object objOpt = jSONArray.opt(0);
                        if (objOpt == JSONObject.NULL) {
                            return null;
                        }
                        return objOpt;
                    }
                    if (jSONArray.length() == 3) {
                        Object obj2 = jSONArray.get(0);
                        Object objOpt2 = jSONArray.opt(1);
                        Object obj3 = JSONObject.NULL;
                        if (objOpt2 == obj3) {
                            objOpt2 = null;
                        }
                        Object objOpt3 = jSONArray.opt(2);
                        if (objOpt3 != obj3) {
                            obj = objOpt3;
                        }
                        if ((obj2 instanceof String) && (objOpt2 == null || (objOpt2 instanceof String))) {
                            throw new i((String) obj2, (String) objOpt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + objNextValue);
            } catch (JSONException e10) {
                throw new IllegalArgumentException("Invalid JSON", e10);
            }
        } catch (JSONException e11) {
            throw new IllegalArgumentException("Invalid JSON", e11);
        }
    }

    @Override // xi.q
    public ByteBuffer d(m mVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", mVar.f53822a);
            jSONObject.put("args", go.c.J(mVar.f53823b));
            Object objJ = go.c.J(jSONObject);
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
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    @Override // xi.q
    public ByteBuffer e(String str, String str2) {
        JSONArray jSONArrayPut = new JSONArray().put("error").put(go.c.J(str)).put(JSONObject.NULL).put(go.c.J(str2));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objJ = go.c.J(jSONArrayPut);
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

    @Override // xi.q
    public ByteBuffer f(String str, String str2, Object obj) {
        JSONArray jSONArrayPut = new JSONArray().put(str).put(go.c.J(str2)).put(go.c.J(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objJ = go.c.J(jSONArrayPut);
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
}
