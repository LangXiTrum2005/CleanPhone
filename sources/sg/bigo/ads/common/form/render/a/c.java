package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements a.InterfaceC0839a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f47187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, Object> f47188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f47189c;
    public e.c[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f47190e;
    public PrivacyCheckBox f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sg.bigo.ads.common.form.render.c.a f47191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, String> f47192i = new ConcurrentHashMap();
    public List<a> g = new ArrayList();

    public c(e eVar, Map<String, Object> map, Context context, sg.bigo.ads.common.form.render.c.a aVar) {
        this.f47187a = context;
        this.f47189c = eVar;
        this.f47188b = map;
        this.d = eVar.m();
        this.f47191h = aVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.f47192i.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    public final boolean b() {
        PrivacyCheckBox privacyCheckBox = this.f;
        return privacyCheckBox != null && privacyCheckBox.f47591a;
    }

    @Override // sg.bigo.ads.common.form.render.a.a.InterfaceC0839a
    public final void a(String str, String str2) {
        this.f47192i.put(str, str2);
        sg.bigo.ads.common.form.render.c.a aVar = this.f47191h;
        if (aVar != null) {
            aVar.a();
        }
    }
}
