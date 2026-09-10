package com.iab.omid.library.adcolony.walking.a;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0213b interfaceC0213b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0213b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.adcolony.b.a aVarA = com.iab.omid.library.adcolony.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.adcolony.adsession.a aVar : aVarA.b()) {
                if (((a) this).f21519a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f21521c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.adcolony.d.b.b(this.f21520b, this.d.b())) {
            return null;
        }
        this.d.a(this.f21520b);
        return this.f21520b.toString();
    }

    @Override // com.iab.omid.library.adcolony.walking.a.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
