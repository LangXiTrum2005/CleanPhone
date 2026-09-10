package com.p004ironsource;

import com.smartdigimkt.q8.i;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B<\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0017ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R/\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00178\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u000e\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/ironsource/m9;", "Lcom/ironsource/hb;", "Lcom/ironsource/vh;", d9.h.f24719b, "", "a", "Lcom/ironsource/nh;", "error", "Lcom/ironsource/yc;", "Lcom/ironsource/yc;", "c", "()Lcom/ironsource/yc;", vc.c.f27493a, "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "destinationPath", "Lcom/ironsource/wf;", "Lcom/ironsource/wf;", "k", "()Lcom/ironsource/wf;", "downloadManager", "Lkotlin/Function1;", "Lkotlin/Result;", "d", "Lkotlin/jvm/functions/Function1;", i.f37957c, "()Lkotlin/jvm/functions/Function1;", "onFinish", "e", "Lcom/ironsource/vh;", "j", "()Lcom/ironsource/vh;", "(Lcom/ironsource/vh;)V", "<init>", "(Lcom/ironsource/yc;Ljava/lang/String;Lcom/ironsource/wf;Lkotlin/jvm/functions/Function1;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class m9 implements hb<vh> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yc fileUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String destinationPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wf downloadManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<Result<? extends vh>, Unit> onFinish;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private vh file;

    /* JADX WARN: Multi-variable type inference failed */
    public m9(yc fileUrl, String destinationPath, wf downloadManager, Function1<? super Result<? extends vh>, Unit> onFinish) {
        Intrinsics.f(fileUrl, "fileUrl");
        Intrinsics.f(destinationPath, "destinationPath");
        Intrinsics.f(downloadManager, "downloadManager");
        Intrinsics.f(onFinish, "onFinish");
        this.fileUrl = fileUrl;
        this.destinationPath = destinationPath;
        this.downloadManager = downloadManager;
        this.onFinish = onFinish;
        this.file = new vh(getDestinationPath());
    }

    @Override // com.p004ironsource.rp
    public void a(vh file) {
        Intrinsics.f(file, "file");
        i().invoke(new Result(file));
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
    public Function1<Result<? extends vh>, Unit> i() {
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

    @Override // com.p004ironsource.hb
    public void b(vh vhVar) {
        Intrinsics.f(vhVar, "<set-?>");
        this.file = vhVar;
    }

    @Override // com.p004ironsource.rp
    public void a(vh file, nh error) {
        Intrinsics.f(error, "error");
        i().invoke(new Result(ResultKt.a(new Exception("Unable to download mobileController.html: " + error.b()))));
    }
}
