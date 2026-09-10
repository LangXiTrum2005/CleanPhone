package com.ironsource;

import android.util.Log;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0402j4 implements InterfaceC0602u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0349g4 f28964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final jk.b f28965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0692z7 f28966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0510p4 f28967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f28968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0693z8 f28969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f28970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C0286cd f28971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f28972i;

    /* JADX INFO: renamed from: com.ironsource.j4$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements jk.b {
        public a(Object obj) {
            super(1, obj, C0402j4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C0402j4) this.receiver).b(obj);
        }

        @Override // jk.b
        public /* synthetic */ Object invoke(Object obj) {
            a(((wj.h) obj).f53286a);
            return wj.r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j4$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class b extends kotlin.jvm.internal.k implements jk.b {
        public b(Object obj) {
            super(1, obj, C0402j4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) throws JSONException {
            ((C0402j4) this.receiver).a(obj);
        }

        @Override // jk.b
        public /* synthetic */ Object invoke(Object obj) throws JSONException {
            a(((wj.h) obj).f53286a);
            return wj.r.f53297a;
        }
    }

    public C0402j4(C0349g4 config, jk.b onFinish, InterfaceC0692z7 downloadManager, InterfaceC0510p4 currentTimeProvider) {
        kotlin.jvm.internal.n.f(config, "config");
        kotlin.jvm.internal.n.f(onFinish, "onFinish");
        kotlin.jvm.internal.n.f(downloadManager, "downloadManager");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f28964a = config;
        this.f28965b = onFinish;
        this.f28966c = downloadManager;
        this.f28967d = currentTimeProvider;
        this.f28968e = "j4";
        this.f28969f = new C0693z8(config.d(), "mobileController_0.html");
        this.f28970g = currentTimeProvider.a();
        this.f28971h = new C0286cd(config.a());
        this.f28972i = "";
    }

    @Override // com.ironsource.InterfaceC0602u7
    public C0693z8 c() {
        return this.f28969f;
    }

    public final jk.b d() {
        return this.f28965b;
    }

    public final InterfaceC0510p4 a() {
        return this.f28967d;
    }

    @Override // com.ironsource.InterfaceC0602u7
    public void b() {
        this.f28970g = this.f28967d.a();
        new C0272c(new C0290d(this.f28971h), wi.d.h(this.f28964a.d(), "/temp"), this.f28966c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC0602u7
    public boolean a(C0693z8 file) {
        kotlin.jvm.internal.n.f(file, "file");
        String name = file.getName();
        kotlin.jvm.internal.n.e(name, "file.name");
        Pattern patternCompile = Pattern.compile("mobileController(_\\d+)?\\.html");
        kotlin.jvm.internal.n.e(patternCompile, "compile(...)");
        return patternCompile.matcher(name).matches();
    }

    private final C0385i4 a(String str) {
        return new C0385i4(new Cg(this.f28971h, str), q4.a.i(this.f28964a.d(), "/mobileController_", str, ".html"), this.f28966c, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj) {
        boolean z10 = obj instanceof wj.g;
        if (!z10) {
            C0693z8 c0693z8 = (C0693z8) (z10 ? null : obj);
            if (!kotlin.jvm.internal.n.a(c0693z8 != null ? c0693z8.getAbsolutePath() : null, this.f28969f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f28969f);
                    kotlin.jvm.internal.n.c(c0693z8);
                    hk.k.T(c0693z8, this.f28969f);
                } catch (Exception e10) {
                    C0474n4.d().a(e10);
                    Log.e(this.f28968e, "Unable to copy downloaded mobileController.html to cache folder: " + e10.getMessage());
                }
                kotlin.jvm.internal.n.c(c0693z8);
                this.f28969f = c0693z8;
            }
            new InterfaceC0367h4.b(this.f28964a.b(), this.f28970g, this.f28967d).a();
        } else {
            new InterfaceC0367h4.a(this.f28964a.b()).a();
        }
        jk.b bVar = this.f28965b;
        if (z10) {
            obj = null;
        }
        bVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) throws JSONException {
        if (obj instanceof wj.g) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !kotlin.jvm.internal.n.a(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            kotlin.jvm.internal.n.e(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.f28972i = string;
            C0385i4 c0385i4A = a(string);
            if (c0385i4A.j()) {
                C0693z8 c0693z8K = c0385i4A.k();
                this.f28969f = c0693z8K;
                this.f28965b.invoke(c0693z8K);
                return;
            }
            c0385i4A.m();
            return;
        }
        a("0").m();
    }
}
