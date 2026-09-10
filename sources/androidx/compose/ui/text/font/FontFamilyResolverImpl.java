package androidx.compose.ui.text.font;

import androidx.compose.runtime.tout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/taiyuan$saneness;", "Landroidx/compose/ui/text/font/cord;", "platformFontLoader", "Landroidx/compose/ui/text/font/cuirassed;", "platformResolveInterceptor", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "typefaceRequestCache", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "fontListFontFamilyTypefaceAdapter", "Landroidx/compose/ui/text/font/preprohormone;", "platformFamilyTypefaceAdapter", "<init>", "(Landroidx/compose/ui/text/font/cord;Landroidx/compose/ui/text/font/cuirassed;Landroidx/compose/ui/text/font/TypefaceRequestCache;Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;Landroidx/compose/ui/text/font/preprohormone;)V", "Landroidx/compose/ui/text/font/taiyuan;", TtmlNode.ATTR_TTS_FONT_FAMILY, "Landroidx/compose/ui/text/font/graveside;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/arytenoidectomy;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroidx/compose/ui/text/font/monoploid;", "fontSynthesis", "Landroidx/compose/runtime/tout;", "", "attabal", "(Landroidx/compose/ui/text/font/taiyuan;Landroidx/compose/ui/text/font/graveside;II)Landroidx/compose/runtime/tout;", "Landroidx/compose/ui/text/font/seminary;", "typefaceRequest", "impromptu", "(Landroidx/compose/ui/text/font/seminary;)Landroidx/compose/runtime/tout;", "Landroidx/compose/ui/text/font/cord;", "competently", "()Landroidx/compose/ui/text/font/cord;", "saneness", "Landroidx/compose/ui/text/font/cuirassed;", "dern", "Landroidx/compose/ui/text/font/TypefaceRequestCache;", "wireman", "Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "marial", "Landroidx/compose/ui/text/font/preprohormone;", "Lkotlin/Function1;", "beachfront", "Lkotlin/jvm/functions/Function1;", "createDefaultTypeface", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontFamilyResolverImpl implements taiyuan.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final cord platformFontLoader;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final Function1<TypefaceRequest, Object> createDefaultTypeface;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final TypefaceRequestCache typefaceRequestCache;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final preprohormone platformFamilyTypefaceAdapter;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final cuirassed platformResolveInterceptor;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;

    public FontFamilyResolverImpl(cord cordVar, cuirassed cuirassedVar, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, preprohormone preprohormoneVar) {
        this.platformFontLoader = cordVar;
        this.platformResolveInterceptor = cuirassedVar;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = preprohormoneVar;
        this.createDefaultTypeface = new Function1<TypefaceRequest, Object>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(TypefaceRequest typefaceRequest) {
                return this.this$0.impromptu(TypefaceRequest.saneness(typefaceRequest, null, null, 0, 0, null, 30, null)).getValue();
            }
        };
    }

    @Override // androidx.compose.ui.text.font.taiyuan.saneness
    public tout<Object> attabal(taiyuan fontFamily, FontWeight fontWeight, int fontStyle, int fontSynthesis) {
        return impromptu(new TypefaceRequest(this.platformResolveInterceptor.wireman(fontFamily), this.platformResolveInterceptor.attabal(fontWeight), this.platformResolveInterceptor.saneness(fontStyle), this.platformResolveInterceptor.dern(fontSynthesis), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final cord getPlatformFontLoader() {
        return this.platformFontLoader;
    }

    public final tout<Object> impromptu(final TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.dern(typefaceRequest, new Function1<Function1<? super grimness, ? extends Unit>, grimness>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ grimness invoke(Function1<? super grimness, ? extends Unit> function1) {
                return invoke2((Function1<? super grimness, Unit>) function1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final grimness invoke2(Function1<? super grimness, Unit> function1) {
                grimness grimnessVarAttabal = this.this$0.fontListFontFamilyTypefaceAdapter.attabal(typefaceRequest, this.this$0.getPlatformFontLoader(), function1, this.this$0.createDefaultTypeface);
                if (grimnessVarAttabal != null) {
                    return grimnessVarAttabal;
                }
                grimness grimnessVarAttabal2 = this.this$0.platformFamilyTypefaceAdapter.attabal(typefaceRequest, this.this$0.getPlatformFontLoader(), function1, this.this$0.createDefaultTypeface);
                if (grimnessVarAttabal2 != null) {
                    return grimnessVarAttabal2;
                }
                throw new IllegalStateException("Could not load font");
            }
        });
    }

    public /* synthetic */ FontFamilyResolverImpl(cord cordVar, cuirassed cuirassedVar, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, preprohormone preprohormoneVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cordVar, (i & 2) != 0 ? cuirassed.INSTANCE.attabal() : cuirassedVar, (i & 4) != 0 ? cutely.saneness() : typefaceRequestCache, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(cutely.attabal(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new preprohormone() : preprohormoneVar);
    }
}
