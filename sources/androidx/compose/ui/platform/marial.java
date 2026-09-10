package androidx.compose.ui.platform;

import com.ironsource.C3700q2;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/marial;", "Landroidx/compose/ui/platform/attabal;", "<init>", "()V", "", "current", "", "attabal", "(I)[I", "saneness", "index", "", "cutely", "(I)Z", "taiyuan", "dern", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class marial extends attabal {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static marial f7449wireman;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.marial$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/marial$attabal;", "", "<init>", "()V", "Landroidx/compose/ui/platform/marial;", "attabal", "()Landroidx/compose/ui/platform/marial;", C3700q2.p, "Landroidx/compose/ui/platform/marial;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final marial attabal() {
            if (marial.f7449wireman == null) {
                marial.f7449wireman = new marial(null);
            }
            marial marialVar = marial.f7449wireman;
            Intrinsics.competently(marialVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return marialVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ marial(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // androidx.compose.ui.platform.beachfront
    public int[] attabal(int current) {
        int length = wireman().length();
        if (length <= 0 || current >= length) {
            return null;
        }
        if (current < 0) {
            current = 0;
        }
        while (current < length && wireman().charAt(current) == '\n' && !cutely(current)) {
            current++;
        }
        if (current >= length) {
            return null;
        }
        int i = current + 1;
        while (i < length && !taiyuan(i)) {
            i++;
        }
        return dern(current, i);
    }

    public final boolean cutely(int index) {
        if (wireman().charAt(index) != '\n') {
            return index == 0 || wireman().charAt(index - 1) == '\n';
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.beachfront
    public int[] saneness(int current) {
        int length = wireman().length();
        if (length <= 0 || current <= 0) {
            return null;
        }
        if (current > length) {
            current = length;
        }
        while (current > 0 && wireman().charAt(current - 1) == '\n' && !taiyuan(current)) {
            current--;
        }
        if (current <= 0) {
            return null;
        }
        int i = current - 1;
        while (i > 0 && !cutely(i)) {
            i--;
        }
        return dern(i, current);
    }

    public final boolean taiyuan(int index) {
        if (index <= 0 || wireman().charAt(index - 1) == '\n') {
            return false;
        }
        return index == wireman().length() || wireman().charAt(index) == '\n';
    }

    public marial() {
    }
}
