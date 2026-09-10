package androidx.compose.ui.focus;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/attabal;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusProperties;", "", "scope", "attabal", "(Landroidx/compose/ui/attabal;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/attabal;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class formularize {

    /* JADX INFO: compiled from: FocusProperties.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements arytenoidectomy, p002kotlin.jvm.internal.apical {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Function1 f6448kowloon;

        public attabal(Function1 function1) {
            this.f6448kowloon = function1;
        }

        @Override // androidx.compose.ui.focus.arytenoidectomy
        public final /* synthetic */ void attabal(FocusProperties focusProperties) {
            this.f6448kowloon.invoke(focusProperties);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof arytenoidectomy) && (obj instanceof p002kotlin.jvm.internal.apical)) {
                return Intrinsics.wireman(getFunctionDelegate(), ((p002kotlin.jvm.internal.apical) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p002kotlin.jvm.internal.apical
        public final patroclinal.beachfront<?> getFunctionDelegate() {
            return this.f6448kowloon;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static final androidx.compose.ui.attabal attabal(androidx.compose.ui.attabal attabalVar, Function1<? super FocusProperties, Unit> function1) {
        return attabalVar.impassible(new FocusPropertiesElement(new attabal(function1)));
    }
}
