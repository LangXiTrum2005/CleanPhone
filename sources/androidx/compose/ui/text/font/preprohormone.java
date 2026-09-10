package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/preprohormone;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/seminary;", "typefaceRequest", "Landroidx/compose/ui/text/font/cord;", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/grimness$saneness;", "", "onAsyncCompletion", "createDefaultTypeface", "Landroidx/compose/ui/text/font/grimness;", "attabal", "(Landroidx/compose/ui/text/font/seminary;Landroidx/compose/ui/text/font/cord;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/font/grimness;", "Landroidx/compose/ui/text/font/stratoscope;", "Landroidx/compose/ui/text/font/stratoscope;", "platformTypefaceResolver", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class preprohormone {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final stratoscope platformTypefaceResolver = sealless.attabal();

    public grimness attabal(TypefaceRequest typefaceRequest, cord platformFontLoader, Function1<? super grimness.saneness, Unit> onAsyncCompletion, Function1<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        Typeface typefaceAttabal;
        taiyuan fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null ? true : fontFamily instanceof beachfront) {
            typefaceAttabal = this.platformTypefaceResolver.saneness(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else if (fontFamily instanceof gintrap) {
            typefaceAttabal = this.platformTypefaceResolver.attabal((gintrap) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            restrictive typeface = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            Intrinsics.competently(typeface, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typefaceAttabal = ((cultivated.dern) typeface).attabal(typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle(), typefaceRequest.getFontSynthesis());
        }
        return new grimness.saneness(typefaceAttabal, false, 2, null);
    }
}
