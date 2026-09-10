package com.iab.omid.library.toponad.walking.async;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0249b interfaceC0249b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0249b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.toponad.internal.c cVarC = com.iab.omid.library.toponad.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.toponad.adsession.a aVar : cVarC.b()) {
                if (this.f22407c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f22408e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.toponad.utils.c.h(this.d, this.f22410b.a())) {
            return null;
        }
        this.f22410b.a(this.d);
        return this.d.toString();
    }

    @Override // com.iab.omid.library.toponad.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
