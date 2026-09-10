package com.smartdigimkt.q7;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f37944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONArray f37945b;

    @Override // com.smartdigimkt.q7.a
    public void a(List<String> list) {
        this.f37944a = list;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    this.f37945b = new JSONArray((Collection) this.f37944a);
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        this.f37945b = null;
    }

    @Override // com.smartdigimkt.q7.a
    public JSONArray c() {
        return this.f37945b;
    }

    @Override // com.smartdigimkt.q7.a
    public List<String> d() {
        return this.f37944a;
    }
}
