package com.iab.omid.library.bigosg.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f21713a;
    protected final InterfaceC0220b d;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bigosg.walking.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0220b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC0220b interfaceC0220b) {
        this.d = interfaceC0220b;
    }

    public void a(a aVar) {
        this.f21713a = aVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f21713a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
