package com.p004ironsource;

import com.p004ironsource.sdk.utils.IronSourceStorageUtils;
import com.smartdigimkt.q8.i;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B<\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u0018ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R/\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b\u000f\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/ironsource/c;", "Lcom/ironsource/hb;", "Lorg/json/JSONObject;", "Lcom/ironsource/vh;", d9.h.f24719b, "c", "", "a", "Lcom/ironsource/nh;", "error", "Lcom/ironsource/yc;", "Lcom/ironsource/yc;", "()Lcom/ironsource/yc;", vc.c.f27493a, "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "destinationPath", "Lcom/ironsource/wf;", "Lcom/ironsource/wf;", "k", "()Lcom/ironsource/wf;", "downloadManager", "Lkotlin/Function1;", "Lkotlin/Result;", "d", "Lkotlin/jvm/functions/Function1;", i.f37957c, "()Lkotlin/jvm/functions/Function1;", "onFinish", "e", "Lcom/ironsource/vh;", "j", "()Lcom/ironsource/vh;", "(Lcom/ironsource/vh;)V", "<init>", "(Lcom/ironsource/yc;Ljava/lang/String;Lcom/ironsource/wf;Lkotlin/jvm/functions/Function1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class C3347c implements hb<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yc fileUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String destinationPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wf downloadManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<Result<? extends JSONObject>, Unit> onFinish;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private vh file;

    /* JADX WARN: Multi-variable type inference failed */
    public C3347c(yc fileUrl, String destinationPath, wf downloadManager, Function1<? super Result<? extends JSONObject>, Unit> onFinish) {
        Intrinsics.f(fileUrl, "fileUrl");
        Intrinsics.f(destinationPath, "destinationPath");
        Intrinsics.f(downloadManager, "downloadManager");
        Intrinsics.f(onFinish, "onFinish");
        this.fileUrl = fileUrl;
        this.destinationPath = destinationPath;
        this.downloadManager = downloadManager;
        this.onFinish = onFinish;
        this.file = new vh(getDestinationPath(), d9.f24626h);
    }

    @Override // com.p004ironsource.rp
    public void a(vh file) {
        Intrinsics.f(file, "file");
        if (Intrinsics.a(file.getName(), d9.f24626h)) {
            try {
                i().invoke(new Result(c(file)));
            } catch (Exception e2) {
                q9.d().a(e2);
                i().invoke(new Result(ResultKt.a(e2)));
            }
        }
    }

    @Override // com.p004ironsource.hb
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getDestinationPath() {
        return this.destinationPath;
    }

    @Override // com.p004ironsource.hb
    /* JADX INFO: renamed from: c, reason: from getter */
    public yc getFileUrl() {
        return this.fileUrl;
    }

    @Override // com.p004ironsource.hb
    public Function1<Result<? extends JSONObject>, Unit> i() {
        return this.onFinish;
    }

    @Override // com.p004ironsource.hb
    /* JADX INFO: renamed from: j, reason: from getter */
    public vh getFile() {
        return this.file;
    }

    @Override // com.p004ironsource.hb
    /* JADX INFO: renamed from: k, reason: from getter */
    public wf getDownloadManager() {
        return this.downloadManager;
    }

    private final JSONObject c(vh file) {
        return new JSONObject(IronSourceStorageUtils.readFile(file));
    }

    @Override // com.p004ironsource.hb
    public void b(vh vhVar) {
        Intrinsics.f(vhVar, "<set-?>");
        this.file = vhVar;
    }

    @Override // com.p004ironsource.rp
    public void a(vh file, nh error) {
        Intrinsics.f(error, "error");
        i().invoke(new Result(ResultKt.a(new Exception("Unable to download abTestMap.json: " + error.b()))));
    }
}
