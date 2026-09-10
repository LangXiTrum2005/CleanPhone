package com.p004ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class xc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gb f27689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wc f27690c;
    private final rn d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vf f27691e = on.U().f();

    public class a implements rp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ rp f27692a;

        /* JADX INFO: renamed from: com.ironsource.xc$a$a, reason: collision with other inner class name */
        public class C0302a extends JSONObject {
            public C0302a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        public a(rp rpVar) {
            this.f27692a = rpVar;
        }

        @Override // com.p004ironsource.rp
        public void a(vh vhVar) {
            this.f27692a.a(vhVar);
            try {
                xc.this.d.a(vhVar.getName(), new C0302a());
            } catch (Exception e2) {
                q9.d().a(e2);
                IronLog.INTERNAL.error(e2.toString());
            }
        }

        @Override // com.p004ironsource.rp
        public void a(vh vhVar, nh nhVar) {
            this.f27692a.a(vhVar, nhVar);
        }
    }

    public xc(Context context, gb gbVar, wc wcVar, rn rnVar) {
        this.f27688a = context;
        this.f27689b = gbVar;
        this.f27690c = wcVar;
        this.d = rnVar;
    }

    public void b(vh vhVar) throws Exception {
        if (vhVar.exists()) {
            ArrayList<vh> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(vhVar);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(vhVar) || !vhVar.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(vh vhVar) throws Exception {
        if (vhVar.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(vhVar, this.d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(vh vhVar) throws Exception {
        if (vhVar.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(vhVar);
        }
        throw new Exception("Folder does not exist");
    }

    public void a(vh vhVar) throws Exception {
        if (vhVar.exists()) {
            if (!vhVar.delete()) {
                throw new Exception("Failed to delete file");
            }
            this.d.a(vhVar.getName());
        }
    }

    public void a(vh vhVar, String str, int i2, int i3, rp rpVar) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(vc.a.f27484a);
        }
        if (this.f27691e.a(this.f27689b.a()) <= 0) {
            throw new Exception(f9.f24983A);
        }
        if (!z8.h(this.f27688a)) {
            throw new Exception(f9.C);
        }
        this.f27690c.a(vhVar.getPath(), new a(rpVar));
        if (!vhVar.exists()) {
            this.f27689b.a(vhVar, str, i2, i3, this.f27690c);
            return;
        }
        Message message = new Message();
        message.obj = vhVar;
        message.what = 1015;
        this.f27690c.sendMessage(message);
    }

    public void a(vh vhVar, JSONObject jSONObject) throws Exception {
        if (jSONObject == null) {
            throw new Exception("Missing attributes to update");
        }
        if (!vhVar.exists()) {
            throw new Exception("File does not exist");
        }
        if (!this.d.b(vhVar.getName(), jSONObject)) {
            throw new Exception("Failed to update attribute");
        }
    }
}
