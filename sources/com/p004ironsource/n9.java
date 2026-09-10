package com.p004ironsource;

import android.util.Log;
import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.p004ironsource.sdk.utils.SDKUtils;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BD\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012#\u0010\u0019\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b3\u00104J \u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0006\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\f\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R4\u0010\u0019\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00150\u00128\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001c\u0010%\u001a\n \"*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/ironsource/n9;", "Lcom/ironsource/rf;", "Lkotlin/Result;", "Lorg/json/JSONObject;", "result", "", "a", "(Ljava/lang/Object;)V", "", "version", "Lcom/ironsource/m9;", "Lcom/ironsource/vh;", "b", d9.h.f24719b, "", "Lcom/ironsource/k9;", "Lcom/ironsource/k9;", com.smartdigimkt.q0.b.i0, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "onFinish", "Lcom/ironsource/wf;", "c", "Lcom/ironsource/wf;", "downloadManager", "Lcom/ironsource/s9;", "Lcom/ironsource/s9;", "()Lcom/ironsource/s9;", "currentTimeProvider", "kotlin.jvm.PlatformType", "e", "Ljava/lang/String;", "TAG", f.j, "Lcom/ironsource/vh;", "htmlFile", "", g.f40227p, "J", "mLoadControllerStartTime", "Lcom/ironsource/gq;", h.f36614b, "Lcom/ironsource/gq;", "rootFolder", i.f37957c, "htmlBuildNumber", "<init>", "(Lcom/ironsource/k9;Lkotlin/jvm/functions/Function1;Lcom/ironsource/wf;Lcom/ironsource/s9;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class n9 implements rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k9 config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<vh, Object> onFinish;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wf downloadManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final s9 currentTimeProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private vh htmlFile;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long mLoadControllerStartTime;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final gq rootFolder;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String htmlBuildNumber;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Result<? extends vh>, Unit> {
        public a(Object obj) {
            super(1, obj, n9.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((n9) this.receiver).b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            a(((Result) obj).X);
            return Unit.f43263a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Result<? extends JSONObject>, Unit> {
        public b(Object obj) {
            super(1, obj, n9.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) throws JSONException {
            ((n9) this.receiver).a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) throws JSONException {
            a(((Result) obj).X);
            return Unit.f43263a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n9(k9 config, Function1<? super vh, ? extends Object> onFinish, wf downloadManager, s9 currentTimeProvider) {
        Intrinsics.f(config, "config");
        Intrinsics.f(onFinish, "onFinish");
        Intrinsics.f(downloadManager, "downloadManager");
        Intrinsics.f(currentTimeProvider, "currentTimeProvider");
        this.config = config;
        this.onFinish = onFinish;
        this.downloadManager = downloadManager;
        this.currentTimeProvider = currentTimeProvider;
        this.TAG = "n9";
        this.htmlFile = new vh(config.getCacheFolder(), "mobileController_0.html");
        this.mLoadControllerStartTime = currentTimeProvider.a();
        this.rootFolder = new gq(config.getControllerUrl());
        this.htmlBuildNumber = "";
    }

    private final m9 a(String version) {
        return new m9(new vw(this.rootFolder, version), this.config.getCacheFolder() + "/mobileController_" + version + ".html", this.downloadManager, new a(this));
    }

    @Override // com.p004ironsource.rf
    /* JADX INFO: renamed from: b, reason: from getter */
    public vh getHtmlFile() {
        return this.htmlFile;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final s9 getCurrentTimeProvider() {
        return this.currentTimeProvider;
    }

    public final Function1<vh, Object> d() {
        return this.onFinish;
    }

    @Override // com.p004ironsource.rf
    public void a() {
        this.mLoadControllerStartTime = this.currentTimeProvider.a();
        new C3347c(new C3349d(this.rootFolder), this.config.getCacheFolder() + "/temp", this.downloadManager, new b(this)).l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Object result) {
        boolean z2 = result instanceof Result.Failure;
        if (z2) {
            new l9.a(this.config.getShouldUseVersionedFlow()).a();
        } else {
            vh vhVar = (vh) (z2 ? null : result);
            if (!Intrinsics.a(vhVar != null ? vhVar.getAbsolutePath() : null, this.htmlFile.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.htmlFile);
                    Intrinsics.c(vhVar);
                    FilesKt.b(vhVar, this.htmlFile, 4);
                } catch (Exception e2) {
                    q9.d().a(e2);
                    Log.e(this.TAG, "Unable to copy downloaded mobileController.html to cache folder: " + e2.getMessage());
                }
                Intrinsics.c(vhVar);
                this.htmlFile = vhVar;
            }
            new l9.b(this.config.getShouldUseVersionedFlow(), this.mLoadControllerStartTime, this.currentTimeProvider).a();
        }
        Function1<vh, Object> function1 = this.onFinish;
        if (z2) {
            result = null;
        }
        function1.invoke(result);
    }

    @Override // com.p004ironsource.rf
    public boolean a(vh file) {
        Intrinsics.f(file, "file");
        String name = file.getName();
        Intrinsics.e(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").b(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object result) throws JSONException {
        if (result instanceof Result.Failure) {
            result = null;
        }
        JSONObject jSONObject = (JSONObject) result;
        if (jSONObject == null || Intrinsics.a(jSONObject.optString("htmlBuildNumber"), "")) {
            a("0").l();
            return;
        }
        SDKUtils.updateControllerConfig("abTestMap", jSONObject);
        String string = jSONObject.getString("htmlBuildNumber");
        Intrinsics.e(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
        this.htmlBuildNumber = string;
        m9 m9VarA = a(string);
        if (!m9VarA.h()) {
            m9VarA.l();
            return;
        }
        vh vhVar = m9VarA.getCom.ironsource.d9.h.b java.lang.String();
        this.htmlFile = vhVar;
        this.onFinish.invoke(vhVar);
    }
}
