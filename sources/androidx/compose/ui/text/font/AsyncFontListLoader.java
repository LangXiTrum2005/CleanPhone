package androidx.compose.ui.text.font;

import androidx.compose.runtime.czestochowa;
import androidx.compose.runtime.miliaria;
import androidx.compose.runtime.tout;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.achondroplasia;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR+\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/tout;", "", "", "Landroidx/compose/ui/text/font/impromptu;", "fontList", "initialType", "Landroidx/compose/ui/text/font/seminary;", "typefaceRequest", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/grimness$saneness;", "", "onCompletion", "Landroidx/compose/ui/text/font/cord;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/seminary;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/cord;)V", "triweekly", "(Lwretchedly/dern;)Ljava/lang/Object;", "kowloon", "(Landroidx/compose/ui/text/font/impromptu;Lwretchedly/dern;)Ljava/lang/Object;", "Ljava/util/List;", "arytenoidectomy", "Landroidx/compose/ui/text/font/seminary;", "monoploid", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "polloi", "Lkotlin/jvm/functions/Function1;", "molybdenite", "Landroidx/compose/ui/text/font/cord;", "<set-?>", "graveside", "Landroidx/compose/runtime/czestochowa;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "adultoid", "Z", "impassible", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AsyncFontListLoader implements tout<Object> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public boolean cacheable = true;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final TypefaceRequest typefaceRequest;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final czestochowa value;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final List<impromptu> fontList;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final cord platformFontLoader;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final AsyncTypefaceCache asyncTypefaceCache;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final Function1<grimness.saneness, Unit> onCompletion;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends impromptu> list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, Function1<? super grimness.saneness, Unit> function1, cord cordVar) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = function1;
        this.platformFontLoader = cordVar;
        this.value = miliaria.saneness(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    @Override // androidx.compose.runtime.tout, androidx.compose.runtime.czestochowa
    public Object getValue() {
        return this.value.getValue();
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object kowloon(impromptu impromptuVar, wretchedly.dern<Object> dernVar) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        if (dernVar instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) dernVar;
            int i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                asyncFontListLoader$loadWithTimeoutOrNull$1.label = i - Integer.MIN_VALUE;
            } else {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, dernVar);
            }
        } else {
            asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, dernVar);
        }
        Object obj = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
                return obj;
            }
            p002kotlin.dern.saneness(obj);
            AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, impromptuVar, null);
            asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = impromptuVar;
            asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
            Object objMarial = TimeoutKt.marial(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
            return objMarial == objBeachfront ? objBeachfront : objMarial;
        } catch (CancellationException e) {
            if (!achondroplasia.impassible(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            kotlinx.coroutines.polder polderVar = (kotlinx.coroutines.polder) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(kotlinx.coroutines.polder.INSTANCE);
            if (polderVar != null) {
                polderVar.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + impromptuVar, e2));
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c A[Catch: all -> 0x00fe, TRY_LEAVE, TryCatch #2 {all -> 0x00fe, blocks: (B:28:0x0075, B:30:0x008c), top: B:56:0x0075 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:45:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f8 -> B:42:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object triweekly(wretchedly.dern<? super p002kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.triweekly(wretchedly.dern):java.lang.Object");
    }
}
