package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import p002kotlin.Metadata;
import p002kotlin.Result;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\n \r*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/cord;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/impromptu;", "font", "Landroid/graphics/Typeface;", "wireman", "(Landroidx/compose/ui/text/font/impromptu;)Landroid/graphics/Typeface;", "attabal", "(Landroidx/compose/ui/text/font/impromptu;Lwretchedly/dern;)Ljava/lang/Object;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "", "saneness", "Ljava/lang/Object;", "dern", "()Ljava/lang/Object;", "cacheKey", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidFontLoader implements cord {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Object cacheKey;

    public AndroidFontLoader(Context context) {
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.cord
    public Object attabal(impromptu impromptuVar, wretchedly.dern<? super Typeface> dernVar) {
        AndroidFontLoader$awaitLoad$1 androidFontLoader$awaitLoad$1;
        AndroidFontLoader androidFontLoader;
        if (dernVar instanceof AndroidFontLoader$awaitLoad$1) {
            androidFontLoader$awaitLoad$1 = (AndroidFontLoader$awaitLoad$1) dernVar;
            int i = androidFontLoader$awaitLoad$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidFontLoader$awaitLoad$1.label = i - Integer.MIN_VALUE;
            } else {
                androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, dernVar);
            }
        } else {
            androidFontLoader$awaitLoad$1 = new AndroidFontLoader$awaitLoad$1(this, dernVar);
        }
        Object objWireman = androidFontLoader$awaitLoad$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = androidFontLoader$awaitLoad$1.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objWireman);
            if (impromptuVar instanceof attabal) {
                ((attabal) impromptuVar).wireman();
                androidFontLoader$awaitLoad$1.label = 1;
                throw null;
            }
            if (!(impromptuVar instanceof ResourceFont)) {
                throw new IllegalArgumentException("Unknown font type: " + impromptuVar);
            }
            Context context = this.context;
            androidFontLoader$awaitLoad$1.L$0 = this;
            androidFontLoader$awaitLoad$1.L$1 = impromptuVar;
            androidFontLoader$awaitLoad$1.label = 2;
            objWireman = saneness.wireman((ResourceFont) impromptuVar, context, androidFontLoader$awaitLoad$1);
            if (objWireman == objBeachfront) {
                return objBeachfront;
            }
            androidFontLoader = this;
        } else {
            if (i2 == 1) {
                p002kotlin.dern.saneness(objWireman);
                return objWireman;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            impromptuVar = (impromptu) androidFontLoader$awaitLoad$1.L$1;
            androidFontLoader = (AndroidFontLoader) androidFontLoader$awaitLoad$1.L$0;
            p002kotlin.dern.saneness(objWireman);
        }
        ((ResourceFont) impromptuVar).marial();
        return sealless.dern((Typeface) objWireman, null, androidFontLoader.context);
    }

    @Override // androidx.compose.ui.text.font.cord
    /* JADX INFO: renamed from: dern, reason: from getter */
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.cord
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public Typeface saneness(impromptu font) {
        Object objM3351constructorimpl;
        Typeface typefaceDern;
        if (font instanceof attabal) {
            ((attabal) font).wireman();
            throw null;
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        triweekly.Companion companion = triweekly.INSTANCE;
        if (triweekly.beachfront(loadingStrategy, companion.saneness())) {
            typefaceDern = saneness.dern((ResourceFont) font, this.context);
        } else {
            if (!triweekly.beachfront(loadingStrategy, companion.dern())) {
                if (triweekly.beachfront(loadingStrategy, companion.attabal())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) triweekly.impromptu(font.getLoadingStrategy())));
            }
            try {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(saneness.dern((ResourceFont) font, this.context));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
                objM3351constructorimpl = null;
            }
            typefaceDern = (Typeface) objM3351constructorimpl;
        }
        ((ResourceFont) font).marial();
        return sealless.dern(typefaceDern, null, this.context);
    }
}
