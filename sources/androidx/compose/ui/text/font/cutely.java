package androidx.compose.ui.text.font;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\u0001\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "attabal", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "saneness", "()Landroidx/compose/ui/text/font/TypefaceRequestCache;", "GlobalTypefaceRequestCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "()Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "GlobalAsyncTypefaceCache", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final TypefaceRequestCache f7748attabal = new TypefaceRequestCache();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final AsyncTypefaceCache f7749saneness = new AsyncTypefaceCache();

    public static final AsyncTypefaceCache attabal() {
        return f7749saneness;
    }

    public static final TypefaceRequestCache saneness() {
        return f7748attabal;
    }
}
