package com.iab.omid.library.mmadbridge.walking.async;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0033b interfaceC0033b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0033b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.mmadbridge.internal.c cVarC = com.iab.omid.library.mmadbridge.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.mmadbridge.adsession.a aVar : cVarC.b()) {
                if (this.f25456c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f25458e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.mmadbridge.utils.c.h(this.f25457d, this.f25460b.a())) {
            return null;
        }
        this.f25460b.a(this.f25457d);
        return this.f25457d.toString();
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
