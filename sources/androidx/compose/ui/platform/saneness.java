package androidx.compose.ui.platform;

import com.ironsource.C3700q2;
import java.text.BreakIterator;
import java.util.Locale;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/saneness;", "Landroidx/compose/ui/platform/attabal;", "Ljava/util/Locale;", "locale", "<init>", "(Ljava/util/Locale;)V", "", "text", "", "marial", "(Ljava/lang/String;)V", "", "current", "", "attabal", "(I)[I", "saneness", "taiyuan", "Ljava/text/BreakIterator;", "dern", "Ljava/text/BreakIterator;", "impl", "wireman", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class saneness extends attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static saneness f7492beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public BreakIterator impl;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f7493marial = 8;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/saneness$attabal;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Landroidx/compose/ui/platform/saneness;", "attabal", "(Ljava/util/Locale;)Landroidx/compose/ui/platform/saneness;", C3700q2.p, "Landroidx/compose/ui/platform/saneness;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final saneness attabal(Locale locale) {
            if (saneness.f7492beachfront == null) {
                saneness.f7492beachfront = new saneness(locale, null);
            }
            saneness sanenessVar = saneness.f7492beachfront;
            Intrinsics.competently(sanenessVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return sanenessVar;
        }

        public Companion() {
        }
    }

    public /* synthetic */ saneness(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
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
        do {
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                Intrinsics.preprohormone("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(current)) {
                BreakIterator breakIterator2 = this.impl;
                if (breakIterator2 == null) {
                    Intrinsics.preprohormone("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(current);
                if (iFollowing == -1) {
                    return null;
                }
                return dern(current, iFollowing);
            }
            BreakIterator breakIterator3 = this.impl;
            if (breakIterator3 == null) {
                Intrinsics.preprohormone("impl");
                breakIterator3 = null;
            }
            current = breakIterator3.following(current);
        } while (current != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                Intrinsics.preprohormone("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(current)) {
                BreakIterator breakIterator2 = this.impl;
                if (breakIterator2 == null) {
                    Intrinsics.preprohormone("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(current);
                if (iPreceding == -1) {
                    return null;
                }
                return dern(iPreceding, current);
            }
            BreakIterator breakIterator3 = this.impl;
            if (breakIterator3 == null) {
                Intrinsics.preprohormone("impl");
                breakIterator3 = null;
            }
            current = breakIterator3.preceding(current);
        } while (current != -1);
        return null;
    }

    public final void taiyuan(Locale locale) {
        this.impl = BreakIterator.getCharacterInstance(locale);
    }

    public saneness(Locale locale) {
        taiyuan(locale);
    }
}
