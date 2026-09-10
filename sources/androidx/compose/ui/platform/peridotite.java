package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: DeviceRenderNode.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0011J5\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0017H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H&¢\u0006\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u0010\u000b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010*R\u0014\u0010/\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0014\u00101\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010*R\u001c\u00107\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010:\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\u001c\u0010=\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001c\u0010@\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001c\u0010C\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\u001c\u0010F\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010*\"\u0004\bE\u0010\u0011R\u001c\u0010I\u001a\u00020\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010*\"\u0004\bH\u0010\u0011R\u001c\u0010L\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R\u001c\u0010O\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bM\u00104\"\u0004\bN\u00106R\u001c\u0010R\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bP\u00104\"\u0004\bQ\u00106R\u001c\u0010U\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bS\u00104\"\u0004\bT\u00106R\u001c\u0010X\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bV\u00104\"\u0004\bW\u00106R\u001c\u0010[\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u00104\"\u0004\bZ\u00106R\u001c\u0010`\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010c\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R\u001c\u0010f\u001a\u0002028&@&X¦\u000e¢\u0006\f\u001a\u0004\bd\u00104\"\u0004\be\u00106R\u001e\u0010l\u001a\u0004\u0018\u00010g8&@&X¦\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010]R\"\u0010r\u001a\u00020o8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bp\u0010*\"\u0004\bq\u0010\u0011ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006sÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/peridotite;", "", "Landroid/graphics/Outline;", "outline", "", "adultoid", "(Landroid/graphics/Outline;)V", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "", "apical", "(IIII)Z", "offset", "stratoscope", "(I)V", "arytenoidectomy", "Lrestrictive/starveling;", "canvasHolder", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Lkotlin/Function1;", "Lrestrictive/creditor;", "drawBlock", "merc", "(Lrestrictive/starveling;Landroidx/compose/ui/graphics/Path;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "cuirassed", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "competently", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "cord", "(Z)Z", "marial", "()V", "dern", "()I", "gintrap", "beachfront", "trm", "getWidth", "width", "getHeight", "height", "", "getScaleX", "()F", "cutely", "(F)V", "scaleX", "getScaleY", "graveside", "scaleY", "getTranslationX", "preprohormone", "translationX", "getTranslationY", "wireman", "translationY", "restrictive", "triweekly", "elevation", "getAmbientShadowColor", "sealless", "ambientShadowColor", "getSpotShadowColor", "supplicat", "spotShadowColor", "getRotationZ", "molybdenite", "rotationZ", "getRotationX", "impassible", "rotationX", "getRotationY", "kowloon", "rotationY", "getCameraDistance", "formularize", "cameraDistance", "getPivotX", "oilcan", "pivotX", "getPivotY", "yemenite", "pivotY", "rotuma", "()Z", "kattegat", "(Z)V", "clipToOutline", "dovishness", "taiyuan", "clipToBounds", "attabal", "saneness", "alpha", "Lrestrictive/sensatory;", "getRenderEffect", "()Lrestrictive/sensatory;", "polloi", "(Lrestrictive/sensatory;)V", "renderEffect", "impromptu", "hasDisplayList", "Lrestrictive/permissivist;", "getCompositingStrategy--NrFUSI", "monoploid", "compositingStrategy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface peridotite {
    void adultoid(Outline outline);

    boolean apical(int left, int top, int right, int bottom);

    void arytenoidectomy(int offset);

    float attabal();

    int beachfront();

    void competently(Canvas canvas);

    boolean cord(boolean hasOverlappingRendering);

    void cuirassed(Matrix matrix);

    void cutely(float f);

    int dern();

    boolean dovishness();

    void formularize(float f);

    int getHeight();

    int getWidth();

    int gintrap();

    void graveside(float f);

    void impassible(float f);

    boolean impromptu();

    void kattegat(boolean z);

    void kowloon(float f);

    void marial();

    void merc(restrictive.starveling canvasHolder, Path clipPath, Function1<? super restrictive.creditor, Unit> drawBlock);

    void molybdenite(float f);

    void monoploid(int i);

    void oilcan(float f);

    void polloi(restrictive.sensatory sensatoryVar);

    void preprohormone(float f);

    float restrictive();

    boolean rotuma();

    void saneness(float f);

    void sealless(int i);

    void stratoscope(int offset);

    void supplicat(int i);

    void taiyuan(boolean z);

    void triweekly(float f);

    int trm();

    void wireman(float f);

    void yemenite(float f);
}
