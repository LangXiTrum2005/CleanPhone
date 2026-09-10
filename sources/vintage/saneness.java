package vintage;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.seminary;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DialogExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/DialogFragment;", "Landroidx/fragment/app/FragmentManager;", "manager", "", "tag", "", "saneness", "(Landroidx/fragment/app/DialogFragment;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V", "fm", "attabal", "(Landroidx/fragment/app/DialogFragment;Landroidx/fragment/app/FragmentManager;)V", "app_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class saneness {
    public static final void attabal(DialogFragment dialogFragment, FragmentManager fm) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(fm, "fm");
        try {
            Result.Companion companion = Result.INSTANCE;
            seminary seminaryVarPolloi = fm.polloi();
            Intrinsics.checkNotNullExpressionValue(seminaryVarPolloi, "beginTransaction(...)");
            seminaryVarPolloi.wireman(dialogFragment, dialogFragment.toString());
            Result.m3351constructorimpl(Integer.valueOf(seminaryVarPolloi.impromptu()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public static final void saneness(DialogFragment dialogFragment, FragmentManager manager, String str) {
        Intrinsics.checkNotNullParameter(dialogFragment, "<this>");
        Intrinsics.checkNotNullParameter(manager, "manager");
        manager.polloi().wireman(dialogFragment, str).impromptu();
    }
}
