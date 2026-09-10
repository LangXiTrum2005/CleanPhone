package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import merc.beachfront;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import restrictive.clubfoot;
import restrictive.creditor;
import restrictive.overspeculate;
import restrictive.sensatory;

/* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u0000 /2\u00020\u0001:\u0001pJ*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!R\"\u0010'\u001a\u00020\"8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020(8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u00103\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u0002048&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001e\u0010=\u001a\u0004\u0018\u0001088&@&X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010@\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u00100\"\u0004\b?\u00102R\u001c\u0010C\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\u001c\u0010F\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u00100\"\u0004\bE\u00102R\u001c\u0010I\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u00100\"\u0004\bH\u00102R\u001c\u0010L\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u00100\"\u0004\bK\u00102R\"\u0010P\u001a\u00020M8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bN\u0010*\"\u0004\bO\u0010,R\"\u0010S\u001a\u00020M8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bQ\u0010*\"\u0004\bR\u0010,R\u001c\u0010V\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bT\u00100\"\u0004\bU\u00102R\u001c\u0010Y\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bW\u00100\"\u0004\bX\u00102R\u001c\u0010\\\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bZ\u00100\"\u0004\b[\u00102R\u001c\u0010_\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b]\u00100\"\u0004\b^\u00102R\u001c\u0010e\u001a\u00020`8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001e\u0010k\u001a\u0004\u0018\u00010f8&@&X¦\u000e¢\u0006\f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001c\u0010l\u001a\u00020`8&@&X¦\u000e¢\u0006\f\u001a\u0004\bl\u0010b\"\u0004\bm\u0010dR\u0014\u0010o\u001a\u00020`8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006qÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "", "", "x", "y", "Lmilliradian/monoploid;", "size", "", "yemenite", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "adultoid", "(Landroid/graphics/Outline;)V", "Lrestrictive/creditor;", "canvas", "stratoscope", "(Lrestrictive/creditor;)V", "Lmilliradian/wireman;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Lmerc/beachfront;", "block", "trm", "(Lmilliradian/wireman;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "marial", "()V", "Landroid/graphics/Matrix;", "polder", "()Landroid/graphics/Matrix;", "Landroidx/compose/ui/graphics/layer/attabal;", "oilcan", "()I", "privatdozent", "(I)V", "compositingStrategy", "Lsupplicat/competently;", "getPivotOffset-F1C5BW0", "()J", "saran", "(J)V", "pivotOffset", "", "attabal", "()F", "saneness", "(F)V", "alpha", "Lrestrictive/saran;", "triweekly", "setBlendMode-s9anfk8", "blendMode", "Lrestrictive/clubfoot;", "beachfront", "()Lrestrictive/clubfoot;", "setColorFilter", "(Lrestrictive/clubfoot;)V", "colorFilter", "monoploid", "cutely", "scaleX", "cord", "graveside", "scaleY", "gintrap", "preprohormone", "translationX", "dovishness", "wireman", "translationY", "creditor", "grimness", "shadowElevation", "Lrestrictive/overspeculate;", "sealless", "supplicat", "ambientShadowColor", "kattegat", "merc", "spotShadowColor", "rotuma", "impassible", "rotationX", "competently", "kowloon", "rotationY", "taiyuan", "molybdenite", "rotationZ", "apical", "formularize", "cameraDistance", "", "arytenoidectomy", "()Z", "restrictive", "(Z)V", "clip", "Lrestrictive/sensatory;", "cuirassed", "()Lrestrictive/sensatory;", "polloi", "(Lrestrictive/sensatory;)V", "renderEffect", "isInvalidated", "seminary", "impromptu", "hasDisplayList", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GraphicsLayerImpl {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f6600attabal;

    /* JADX INFO: compiled from: AndroidGraphicsLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lmerc/beachfront;", "", "saneness", "Lkotlin/jvm/functions/Function1;", "attabal", "()Lkotlin/jvm/functions/Function1;", "DefaultDrawBlock", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ Companion f6600attabal = new Companion();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public static final Function1<beachfront, Unit> DefaultDrawBlock = new Function1<beachfront, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(beachfront beachfrontVar) {
                invoke2(beachfrontVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(beachfront beachfrontVar) {
                beachfront.creditor(beachfrontVar, overspeculate.INSTANCE.wireman(), 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, 126, null);
            }
        };

        public final Function1<beachfront, Unit> attabal() {
            return DefaultDrawBlock;
        }
    }

    void adultoid(Outline outline);

    /* JADX INFO: renamed from: apical */
    float getCameraDistance();

    /* JADX INFO: renamed from: arytenoidectomy */
    boolean getClip();

    /* JADX INFO: renamed from: attabal */
    float getAlpha();

    clubfoot beachfront();

    /* JADX INFO: renamed from: competently */
    float getRotationY();

    /* JADX INFO: renamed from: cord */
    float getScaleY();

    /* JADX INFO: renamed from: creditor */
    float getShadowElevation();

    sensatory cuirassed();

    void cutely(float f);

    /* JADX INFO: renamed from: dovishness */
    float getTranslationY();

    void formularize(float f);

    /* JADX INFO: renamed from: gintrap */
    float getTranslationX();

    void graveside(float f);

    void grimness(float f);

    void impassible(float f);

    default boolean impromptu() {
        return true;
    }

    /* JADX INFO: renamed from: kattegat */
    long getSpotShadowColor();

    void kowloon(float f);

    void marial();

    void merc(long j);

    void molybdenite(float f);

    /* JADX INFO: renamed from: monoploid */
    float getScaleX();

    /* JADX INFO: renamed from: oilcan */
    int getCompositingStrategy();

    Matrix polder();

    void polloi(sensatory sensatoryVar);

    void preprohormone(float f);

    void privatdozent(int i);

    void restrictive(boolean z);

    /* JADX INFO: renamed from: rotuma */
    float getRotationX();

    void saneness(float f);

    void saran(long j);

    /* JADX INFO: renamed from: sealless */
    long getAmbientShadowColor();

    void seminary(boolean z);

    void stratoscope(creditor canvas);

    void supplicat(long j);

    /* JADX INFO: renamed from: taiyuan */
    float getRotationZ();

    /* JADX INFO: renamed from: triweekly */
    int getBlendMode();

    void trm(milliradian.wireman density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1<? super beachfront, Unit> block);

    void wireman(float f);

    void yemenite(int x, int y, long size);
}
