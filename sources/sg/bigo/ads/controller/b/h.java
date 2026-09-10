package sg.bigo.ads.controller.b;

import android.content.Context;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends sg.bigo.ads.common.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, i> f47927a;

    public h(Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.common.e
    public final String a() {
        return "bigoad_slots.dat";
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "SlotData";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Map<String, i> map = this.f47927a;
        if (map != null) {
            for (i iVar : map.values()) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(iVar);
            }
        }
        return "SlotData[" + sb.toString() + AbstractJsonLexerKt.END_LIST;
    }

    public final l a(String str) {
        Map<String, i> map = this.f47927a;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        List<i> listA = n.a(parcel, new sg.bigo.ads.common.f.a<i>() { // from class: sg.bigo.ads.controller.b.h.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new i();
            }
        });
        HashMap map = new HashMap();
        for (i iVar : listA) {
            map.put(iVar.l(), iVar);
        }
        this.f47927a = map;
    }

    public final l a(sg.bigo.ads.api.b bVar) {
        l lVarH = bVar.h();
        return lVarH != null ? lVarH : a(bVar.f46987a);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        Map<String, i> map = this.f47927a;
        if (map != null) {
            arrayList.addAll(map.values());
        }
        n.a(parcel, arrayList);
    }

    public final void a(JSONArray jSONArray) {
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            i iVar = new i();
            if (iVar.a(jSONObjectOptJSONObject)) {
                map.put(iVar.l(), iVar);
            }
        }
        this.f47927a = map;
    }
}
