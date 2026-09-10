package com.iab.omid.library.toponad.walking.async;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class e extends a {
    public e(b.InterfaceC0249b interfaceC0249b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0249b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.toponad.internal.c cVarC = com.iab.omid.library.toponad.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.toponad.adsession.a aVar : cVarC.b()) {
                if (this.f22407c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f22408e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.d.toString();
    }

    @Override // com.iab.omid.library.toponad.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
