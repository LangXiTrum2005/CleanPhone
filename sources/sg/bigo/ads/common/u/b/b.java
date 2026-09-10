package sg.bigo.ads.common.u.b;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.ko;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.u.a;
import sg.bigo.ads.common.u.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public class b<T extends sg.bigo.ads.common.u.a> extends c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f47466a = f.a("text/plain;charset=utf-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f47467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f47468c;
    public f d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47469e;
    public boolean f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f47470h;
    private String o;

    public b(int i2, T t, Context context) {
        super(i2, t, true, context);
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final String a() {
        return ko.f25535b;
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final f b() {
        f fVar = this.d;
        return fVar != null ? fVar : f47466a;
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final byte[] c() {
        JSONObject jSONObject;
        if (this.f47468c == null && (jSONObject = this.f47467b) != null) {
            String string = jSONObject.toString();
            this.o = string;
            try {
                if (this.f47469e) {
                    String strA = sg.bigo.ads.common.j.a.a(string, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F");
                    if (TextUtils.isEmpty(strA)) {
                        this.f = false;
                    } else {
                        this.f = true;
                        this.o = strA;
                        a("enc", "1");
                    }
                }
            } catch (Exception unused) {
                this.f = false;
            }
            try {
                this.f47468c = this.o.getBytes("utf-8");
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        return this.f47468c;
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final String d() {
        return e() >= 0 ? this.o : "content is null.";
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final int e() {
        byte[] bArrC = c();
        return bArrC != null ? bArrC.length : super.e();
    }

    @Override // sg.bigo.ads.common.u.b.c
    public final boolean f() {
        return this.f;
    }

    public final void a(Map<String, Object> map) {
        if (this.f47467b == null || k.a(map)) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                this.f47467b.putOpt(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        this.f47468c = null;
    }
}
