package com.iab.omid.library.adcolony.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f21522a;
    protected final InterfaceC0213b d;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.adcolony.walking.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0213b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC0213b interfaceC0213b) {
        this.d = interfaceC0213b;
    }

    public void a(a aVar) {
        this.f21522a = aVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f21522a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
