package minuteness;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PermissionLauncher.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B%\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, d2 = {"Lminuteness/competently;", "I", "O", "", "Lwireman/saneness;", "activityResultCaller", "Lmarial/attabal;", "activityResultContract", "<init>", "(Lwireman/saneness;Lmarial/attabal;)V", "input", "Lwireman/attabal;", "activityResultCallback", "", "saneness", "(Ljava/lang/Object;Lwireman/attabal;)V", "wireman", "()V", "attabal", "Lwireman/attabal;", "Lwireman/dern;", "Lwireman/dern;", "launcher", "tools_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class competently<I, O> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public wireman.attabal<O> activityResultCallback;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final wireman.dern<I> launcher;

    public competently(wireman.saneness activityResultCaller, marial.attabal<I, O> activityResultContract) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultContract, "activityResultContract");
        wireman.dern<I> dernVarRegisterForActivityResult = activityResultCaller.registerForActivityResult(activityResultContract, new wireman.attabal() { // from class: minuteness.beachfront
            @Override // wireman.attabal
            public final void onActivityResult(Object obj) {
                competently.dern(this.f33493attabal, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(dernVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.launcher = dernVarRegisterForActivityResult;
    }

    public static final void dern(competently competentlyVar, Object obj) {
        wireman.attabal<O> attabalVar = competentlyVar.activityResultCallback;
        if (attabalVar != null) {
            attabalVar.onActivityResult(obj);
        }
    }

    public final void saneness(I input, wireman.attabal<O> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        this.activityResultCallback = activityResultCallback;
        this.launcher.attabal(input);
    }

    public final void wireman() {
        this.activityResultCallback = null;
        this.launcher.dern();
    }
}
