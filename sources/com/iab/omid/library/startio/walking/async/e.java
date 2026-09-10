package com.iab.omid.library.startio.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class e extends a {
    public e(b.InterfaceC0245b interfaceC0245b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0245b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.startio.internal.c cVarC = com.iab.omid.library.startio.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.startio.adsession.a aVar : cVarC.b()) {
                if (this.f22307c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f22308e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.d.toString();
    }

    @Override // com.iab.omid.library.startio.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
