package com.ironsource;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0314e5 f27879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W5 f27880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ob f27881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0674y7 f27882e = Kb.Y().a();

    public X5(Context context, C0314e5 c0314e5, W5 w10, Ob ob2) {
        this.f27878a = context;
        this.f27879b = c0314e5;
        this.f27880c = w10;
        this.f27881d = ob2;
    }

    public void b(C0693z8 c0693z8) throws Exception {
        if (c0693z8.exists()) {
            ArrayList<C0693z8> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(c0693z8);
            if (!IronSourceStorageUtils.deleteFolderContentRecursive(c0693z8) || !c0693z8.delete()) {
                throw new Exception("Failed to delete folder");
            }
            this.f27881d.a(filesInFolderRecursive);
        }
    }

    public JSONObject c(C0693z8 c0693z8) throws Exception {
        if (c0693z8.exists()) {
            return IronSourceStorageUtils.buildFilesMapOfDirectory(c0693z8, this.f27881d.b());
        }
        throw new Exception("Folder does not exist");
    }

    public long d(C0693z8 c0693z8) throws Exception {
        if (c0693z8.exists()) {
            return IronSourceStorageUtils.getTotalSizeOfDir(c0693z8);
        }
        throw new Exception("Folder does not exist");
    }

    public void a(C0693z8 c0693z8, String str, int i10, int i11, Oc oc2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception(V5.a.f27351a);
        }
        if (this.f27882e.a(this.f27879b.a()) <= 0) {
            throw new Exception(Z3.A);
        }
        if (!T3.h(this.f27878a)) {
            throw new Exception(Z3.C);
        }
        this.f27880c.a(c0693z8.getPath(), new a(oc2));
        if (!c0693z8.exists()) {
            this.f27879b.a(c0693z8, str, i10, i11, this.f27880c);
            return;
        }
        Message message = new Message();
        message.obj = c0693z8;
        message.what = 1015;
        this.f27880c.sendMessage(message);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Oc {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Oc f27883a;

        /* JADX INFO: renamed from: com.ironsource.X5$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class C0049a extends JSONObject {
            public C0049a() throws JSONException {
                put("lastReferencedTime", System.currentTimeMillis());
            }
        }

        public a(Oc oc2) {
            this.f27883a = oc2;
        }

        @Override // com.ironsource.Oc
        public void a(C0693z8 c0693z8) {
            this.f27883a.a(c0693z8);
            try {
                X5.this.f27881d.a(c0693z8.getName(), new C0049a());
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }

        @Override // com.ironsource.Oc
        public void a(C0693z8 c0693z8, C0532q8 c0532q8) {
            this.f27883a.a(c0693z8, c0532q8);
        }
    }

    public void a(C0693z8 c0693z8) throws Exception {
        if (c0693z8.exists()) {
            if (c0693z8.delete()) {
                this.f27881d.a(c0693z8.getName());
                return;
            }
            throw new Exception("Failed to delete file");
        }
    }

    public void a(C0693z8 c0693z8, JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            if (c0693z8.exists()) {
                if (!this.f27881d.b(c0693z8.getName(), jSONObject)) {
                    throw new Exception("Failed to update attribute");
                }
                return;
            }
            throw new Exception("File does not exist");
        }
        throw new Exception("Missing attributes to update");
    }
}
