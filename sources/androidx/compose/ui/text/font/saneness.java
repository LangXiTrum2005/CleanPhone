package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/font/kattegat;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "dern", "(Landroidx/compose/ui/text/font/kattegat;Landroid/content/Context;)Landroid/graphics/Typeface;", "wireman", "(Landroidx/compose/ui/text/font/kattegat;Landroid/content/Context;Lwretchedly/dern;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: compiled from: AndroidFontLoader.android.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/ui/text/font/saneness$attabal", "Llightstruck/impromptu$marial;", "Landroid/graphics/Typeface;", "typeface", "", "competently", "(Landroid/graphics/Typeface;)V", "", "reason", "beachfront", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal extends lightstruck.impromptu.marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.impassible<Typeface> f7793attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ ResourceFont f7794saneness;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(kotlinx.coroutines.impassible<? super Typeface> impassibleVar, ResourceFont resourceFont) {
            this.f7793attabal = impassibleVar;
            this.f7794saneness = resourceFont;
        }

        @Override // lightstruck.impromptu.marial
        public void beachfront(int reason) {
            this.f7793attabal.taiyuan(new IllegalStateException("Unable to load font " + this.f7794saneness + " (reason=" + reason + ')'));
        }

        @Override // lightstruck.impromptu.marial
        public void competently(Typeface typeface) {
            this.f7793attabal.resumeWith(Result.m3351constructorimpl(typeface));
        }
    }

    public static final Typeface dern(ResourceFont resourceFont, Context context) {
        Typeface typefaceCompetently = lightstruck.impromptu.competently(context, resourceFont.getResId());
        Intrinsics.beachfront(typefaceCompetently);
        return typefaceCompetently;
    }

    public static final Object wireman(ResourceFont resourceFont, Context context, wretchedly.dern<? super Typeface> dernVar) {
        kotlinx.coroutines.kowloon kowloonVar = new kotlinx.coroutines.kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar), 1);
        kowloonVar.kattegat();
        lightstruck.impromptu.taiyuan(context, resourceFont.getResId(), new attabal(kowloonVar, resourceFont), null);
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objCuirassed;
    }
}
