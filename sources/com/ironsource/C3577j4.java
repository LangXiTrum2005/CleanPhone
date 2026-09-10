package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.FunctionReferenceImpl;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;

/* JADX INFO: renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3577j4 implements InterfaceC3738s7 {
    private final C3524g4 a;
    private final Function1<C3824x8, Object> b;
    private final InterfaceC3823x7 c;
    private final InterfaceC3667o4 d;
    private final String e;
    private C3824x8 f;
    private long g;
    private final Yc h;
    private String i;

    /* JADX INFO: renamed from: com.ironsource.j4$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Result<? extends C3824x8>, Unit> {
        public a(Object obj) {
            super(1, obj, C3577j4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C3577j4) this.receiver).b(obj);
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends C3824x8> result) {
            a(result.getValue());
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.j4$b */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Result<? extends JSONObject>, Unit> {
        public b(Object obj) {
            super(1, obj, C3577j4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) throws JSONException {
            ((C3577j4) this.receiver).a(obj);
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends JSONObject> result) throws JSONException {
            a(result.getValue());
            return Unit.f29295attabal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3577j4(C3524g4 config, Function1<? super C3824x8, ? extends Object> onFinish, InterfaceC3823x7 downloadManager, InterfaceC3667o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = config;
        this.b = onFinish;
        this.c = downloadManager;
        this.d = currentTimeProvider;
        this.e = C3577j4.class.getSimpleName();
        this.f = new C3824x8(config.d(), "mobileController_0.html");
        this.g = currentTimeProvider.a();
        this.h = new Yc(config.a());
        this.i = "";
    }

    @Override // com.ironsource.InterfaceC3738s7
    public C3824x8 c() {
        return this.f;
    }

    public final Function1<C3824x8, Object> d() {
        return this.b;
    }

    public final InterfaceC3667o4 a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3738s7
    public void b() {
        this.g = this.d.a();
        new C3447c(new C3465d(this.h), this.a.d() + "/temp", this.c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC3738s7
    public boolean a(C3824x8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) throws JSONException {
        if (Result.m3356isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !Intrinsics.wireman(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            Intrinsics.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.i = string;
            C3560i4 c3560i4A = a(string);
            if (c3560i4A.j()) {
                C3824x8 c3824x8K = c3560i4A.k();
                this.f = c3824x8K;
                this.b.invoke(c3824x8K);
                return;
            }
            c3560i4A.m();
            return;
        }
        a("0").m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object obj) {
        if (Result.m3357isSuccessimpl(obj)) {
            C3824x8 c3824x8 = (C3824x8) (Result.m3356isFailureimpl(obj) ? null : obj);
            if (!Intrinsics.wireman(c3824x8 != null ? c3824x8.getAbsolutePath() : null, this.f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f);
                    Intrinsics.beachfront(c3824x8);
                    interaction.taiyuan.graveside(c3824x8, this.f, true, 0, 4, null);
                } catch (Exception e) {
                    C3631m4.d().a(e);
                    e.getMessage();
                }
                Intrinsics.beachfront(c3824x8);
                this.f = c3824x8;
            }
            new InterfaceC3542h4.b(this.a.b(), this.g, this.d).a();
        } else {
            new InterfaceC3542h4.a(this.a.b()).a();
        }
        Function1<C3824x8, Object> function1 = this.b;
        if (Result.m3356isFailureimpl(obj)) {
            obj = null;
        }
        function1.invoke((C3824x8) obj);
    }

    private final C3560i4 a(String str) {
        return new C3560i4(new C3589jg(this.h, str), this.a.d() + "/mobileController_" + str + ".html", this.c, new a(this));
    }
}
