package com.iab.omid.library.startio.walking.async;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0245b interfaceC0245b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0245b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.startio.internal.c cVarC = com.iab.omid.library.startio.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.startio.adsession.a aVar : cVarC.b()) {
                if (this.f22307c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f22308e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.startio.utils.c.h(this.d, this.f22310b.a())) {
            return null;
        }
        this.f22310b.a(this.d);
        return this.d.toString();
    }

    @Override // com.iab.omid.library.startio.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
