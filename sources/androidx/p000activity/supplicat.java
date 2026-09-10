package androidx.p000activity;

import androidx.p001lifecycle.arytenoidectomy;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/arytenoidectomy;", "owner", "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/sealless;", "", "onBackPressed", "attabal", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/arytenoidectomy;ZLkotlin/jvm/functions/Function1;)Landroidx/activity/sealless;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class supplicat {

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/activity/supplicat$attabal", "Landroidx/activity/sealless;", "", "handleOnBackPressed", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends sealless {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Function1<sealless, Unit> f4531attabal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public attabal(boolean z, Function1<? super sealless, Unit> function1) {
            super(z);
            this.f4531attabal = function1;
        }

        @Override // androidx.p000activity.sealless
        public void handleOnBackPressed() {
            this.f4531attabal.invoke(this);
        }
    }

    public static final sealless attabal(OnBackPressedDispatcher onBackPressedDispatcher, arytenoidectomy arytenoidectomyVar, boolean z, Function1<? super sealless, Unit> onBackPressed) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcher, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        attabal attabalVar = new attabal(z, onBackPressed);
        if (arytenoidectomyVar != null) {
            onBackPressedDispatcher.taiyuan(arytenoidectomyVar, attabalVar);
            return attabalVar;
        }
        onBackPressedDispatcher.impromptu(attabalVar);
        return attabalVar;
    }

    public static /* synthetic */ sealless saneness(OnBackPressedDispatcher onBackPressedDispatcher, arytenoidectomy arytenoidectomyVar, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            arytenoidectomyVar = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return attabal(onBackPressedDispatcher, arytenoidectomyVar, z, function1);
    }
}
