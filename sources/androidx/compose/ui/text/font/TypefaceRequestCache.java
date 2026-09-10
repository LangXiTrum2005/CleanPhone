package androidx.compose.ui.text.font;

import androidx.compose.runtime.tout;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequestCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/seminary;", "typefaceRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/grimness;", "", "resolveTypeface", "Landroidx/compose/runtime/tout;", "dern", "(Landroidx/compose/ui/text/font/seminary;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/tout;", "Lcultivated/impromptu;", "attabal", "Lcultivated/impromptu;", "saneness", "()Lcultivated/impromptu;", "lock", "Ldent/saneness;", "Ldent/saneness;", "resultCache", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TypefaceRequestCache {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final cultivated.impromptu lock = cultivated.competently.attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final dent.saneness<TypefaceRequest, grimness> resultCache = new dent.saneness<>(16);

    public final tout<Object> dern(final TypefaceRequest typefaceRequest, Function1<? super Function1<? super grimness, Unit>, ? extends grimness> resolveTypeface) {
        synchronized (this.lock) {
            grimness grimnessVarWireman = this.resultCache.wireman(typefaceRequest);
            if (grimnessVarWireman != null) {
                if (grimnessVarWireman.getCacheable()) {
                    return grimnessVarWireman;
                }
                this.resultCache.beachfront(typefaceRequest);
            }
            try {
                grimness grimnessVarInvoke = resolveTypeface.invoke(new Function1<grimness, Unit>() { // from class: androidx.compose.ui.text.font.TypefaceRequestCache$runCached$currentTypefaceResult$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p002kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(grimness grimnessVar) {
                        invoke2(grimnessVar);
                        return Unit.f29295attabal;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(grimness grimnessVar) {
                        cultivated.impromptu lock = this.this$0.getLock();
                        TypefaceRequestCache typefaceRequestCache = this.this$0;
                        TypefaceRequest typefaceRequest2 = typefaceRequest;
                        synchronized (lock) {
                            try {
                                if (grimnessVar.getCacheable()) {
                                    typefaceRequestCache.resultCache.marial(typefaceRequest2, grimnessVar);
                                } else {
                                    typefaceRequestCache.resultCache.beachfront(typefaceRequest2);
                                }
                                Unit unit = Unit.f29295attabal;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                });
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.wireman(typefaceRequest) == null && grimnessVarInvoke.getCacheable()) {
                            this.resultCache.marial(typefaceRequest, grimnessVarInvoke);
                        }
                        Unit unit = Unit.f29295attabal;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return grimnessVarInvoke;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final cultivated.impromptu getLock() {
        return this.lock;
    }
}
