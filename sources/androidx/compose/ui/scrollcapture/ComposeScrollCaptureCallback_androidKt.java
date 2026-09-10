package androidx.compose.ui.scrollcapture;

import android.os.CancellationSignal;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/saran;", "Landroid/os/CancellationSignal;", "signal", "Lkotlin/Function2;", "Lwretchedly/dern;", "", "", "block", "Lkotlinx/coroutines/monroe;", "dern", "(Lkotlinx/coroutines/saran;Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/monroe;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComposeScrollCaptureCallback_androidKt {
    public static final monroe dern(saran saranVar, final CancellationSignal cancellationSignal, Function2<? super saran, ? super wretchedly.dern<? super Unit>, ? extends Object> function2) {
        final monroe monroeVarWireman = kotlinx.coroutines.cutely.wireman(saranVar, null, null, function2, 3, null);
        monroeVarWireman.restrictive(new Function1<Throwable, Unit>() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th != null) {
                    cancellationSignal.cancel();
                }
            }
        });
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.wireman
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                ComposeScrollCaptureCallback_androidKt.wireman(monroeVarWireman);
            }
        });
        return monroeVarWireman;
    }

    public static final void wireman(monroe monroeVar) {
        monroe.attabal.attabal(monroeVar, null, 1, null);
    }
}
