package androidx.compose.ui.text.font;

import java.util.List;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/coroutines/CoroutineContext;", "injectedContext", "<init>", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/ui/text/font/seminary;", "typefaceRequest", "Landroidx/compose/ui/text/font/cord;", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/grimness$saneness;", "", "onAsyncCompletion", "createDefaultTypeface", "Landroidx/compose/ui/text/font/grimness;", "attabal", "(Landroidx/compose/ui/text/font/seminary;Landroidx/compose/ui/text/font/cord;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/font/grimness;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "Lkotlinx/coroutines/saran;", "saneness", "Lkotlinx/coroutines/saran;", "asyncLoadScope", "dern", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontListFontFamilyTypefaceAdapter {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final AsyncTypefaceCache asyncTypefaceCache;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public saran asyncLoadScope;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f7736wireman = 8;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final kowloon f7735marial = new kowloon();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final kotlinx.coroutines.polder f7733beachfront = new saneness(kotlinx.coroutines.polder.INSTANCE);

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = privatdozent.attabal(f7733beachfront.plus(cultivated.beachfront.attabal()).plus(coroutineContext).plus(sakeen.attabal((monroe) coroutineContext.get(monroe.INSTANCE))));
    }

    public grimness attabal(TypefaceRequest typefaceRequest, cord platformFontLoader, Function1<? super grimness.saneness, Unit> onAsyncCompletion, Function1<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        Pair pairSaneness = impassible.saneness(f7735marial.attabal(((FontListFontFamily) typefaceRequest.getFontFamily()).marial(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
        List list = (List) pairSaneness.component1();
        Object objComponent2 = pairSaneness.component2();
        if (list == null) {
            return new grimness.saneness(objComponent2, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, objComponent2, typefaceRequest, this.asyncTypefaceCache, onAsyncCompletion, platformFontLoader);
        kotlinx.coroutines.cutely.wireman(this.asyncLoadScope, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
        return new grimness.attabal(asyncFontListLoader);
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext);
    }

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$saneness", "Lkotlin/coroutines/attabal;", "Lkotlinx/coroutines/polder;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness extends p002kotlin.coroutines.attabal implements kotlinx.coroutines.polder {
        public saneness(kotlinx.coroutines.polder.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.polder
        public void handleException(CoroutineContext context, Throwable exception) {
        }
    }
}
