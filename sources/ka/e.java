package ka;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.google.android.gms.internal.auth.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final la.e f44540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f44541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f44542d;

    public e(f fVar, TaskCompletionSource taskCompletionSource) {
        la.e eVar = new la.e("OnRequestInstallCallback");
        this.f44542d = fVar;
        super(2);
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f44540b = eVar;
        this.f44541c = taskCompletionSource;
    }
}
