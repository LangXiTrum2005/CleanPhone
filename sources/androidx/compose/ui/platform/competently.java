package androidx.compose.ui.platform;

import com.ironsource.C3700q2;
import java.text.BreakIterator;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\fR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/competently;", "Landroidx/compose/ui/platform/attabal;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "", "formularize", "", "index", "", "apical", "(I)Z", "taiyuan", "", "text", "marial", "(Ljava/lang/String;)V", "current", "", "attabal", "(I)[I", "saneness", "cutely", "Ljava/text/BreakIterator;", "dern", "Ljava/text/BreakIterator;", "impl", "wireman", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class competently extends attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static competently f7407beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public BreakIterator impl;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f7408marial = 8;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.competently$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/competently$attabal;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/competently;", "attabal", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/competently;", C3700q2.p, "Landroidx/compose/ui/platform/competently;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final competently attabal(Locale locale) {
            if (competently.f7407beachfront == null) {
                competently.f7407beachfront = new competently(locale, null);
            }
            competently competentlyVar = competently.f7407beachfront;
            Intrinsics.competently(competentlyVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return competentlyVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ competently(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final boolean apical(int index) {
        if (cutely(index)) {
            return index == 0 || !cutely(index - 1);
        }
        return false;
    }

    private final void formularize(Locale locale) {
        this.impl = BreakIterator.getWordInstance(locale);
    }

    private final boolean taiyuan(int index) {
        if (index <= 0 || !cutely(index - 1)) {
            return false;
        }
        return index == wireman().length() || !cutely(index);
    }

    @Override // androidx.compose.ui.platform.beachfront
    public int[] attabal(int current) {
        if (wireman().length() <= 0 || current >= wireman().length()) {
            return null;
        }
        if (current < 0) {
            current = 0;
        }
        while (!cutely(current) && !apical(current)) {
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                Intrinsics.preprohormone("impl");
                breakIterator = null;
            }
            current = breakIterator.following(current);
            if (current == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.impl;
        if (breakIterator2 == null) {
            Intrinsics.preprohormone("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(current);
        if (iFollowing == -1 || !taiyuan(iFollowing)) {
            return null;
        }
        return dern(current, iFollowing);
    }

    public final boolean cutely(int index) {
        if (index < 0 || index >= wireman().length()) {
            return false;
        }
        return Character.isLetterOrDigit(wireman().codePointAt(index));
    }

    @Override // androidx.compose.ui.platform.attabal
    public void marial(String text) {
        super.marial(text);
        BreakIterator breakIterator = this.impl;
        if (breakIterator == null) {
            Intrinsics.preprohormone("impl");
            breakIterator = null;
        }
        breakIterator.setText(text);
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
        while (current > 0 && !cutely(current - 1) && !taiyuan(current)) {
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                Intrinsics.preprohormone("impl");
                breakIterator = null;
            }
            current = breakIterator.preceding(current);
            if (current == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.impl;
        if (breakIterator2 == null) {
            Intrinsics.preprohormone("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(current);
        if (iPreceding == -1 || !apical(iPreceding)) {
            return null;
        }
        return dern(iPreceding, current);
    }

    public competently(Locale locale) {
        formularize(locale);
    }
}
