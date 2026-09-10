package com.iab.omid.library.inmobi.walking.async;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0233b interfaceC0233b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0233b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.inmobi.internal.c cVarC = com.iab.omid.library.inmobi.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : cVarC.b()) {
                if (this.f22011c.contains(aVar.c())) {
                    aVar.d().b(str, this.f22012e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.inmobi.utils.c.h(this.d, this.f22014b.a())) {
            return null;
        }
        this.f22014b.a(this.d);
        return this.d.toString();
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
