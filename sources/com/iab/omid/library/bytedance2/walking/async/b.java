package com.iab.omid.library.bytedance2.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f21808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final InterfaceC0224b f21809b;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0224b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0224b interfaceC0224b) {
        this.f21809b = interfaceC0224b;
    }

    public void a(a aVar) {
        this.f21808a = aVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f21808a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
