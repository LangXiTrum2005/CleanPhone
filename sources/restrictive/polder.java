package restrictive;

import android.graphics.Paint;
import android.graphics.Shader;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0002j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R.\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b\r\u0010!R*\u0010$\u001a\u00020#2\u0006\u0010$\u001a\u00020#8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0012\u0010%\"\u0004\b&\u0010'R*\u0010,\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00100\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020-8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R$\u00103\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010 \"\u0004\b2\u0010!R*\u00106\u001a\u0002042\u0006\u0010\u0016\u001a\u0002048V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b5\u0010)\"\u0004\b\u0017\u0010+R*\u0010:\u001a\u0002072\u0006\u0010\u0016\u001a\u0002078V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b8\u0010)\"\u0004\b9\u0010+R$\u0010=\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b;\u0010 \"\u0004\b<\u0010!R*\u0010A\u001a\u00020>2\u0006\u0010\u0016\u001a\u00020>8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b?\u0010)\"\u0004\b@\u0010+R4\u0010F\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u000e\u0010\u0016\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010L\u001a\u0004\u0018\u00010G2\b\u0010\u0016\u001a\u0004\u0018\u00010G8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Lrestrictive/polder;", "Lrestrictive/lotta;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Landroidx/compose/ui/graphics/NativePaint;", "monoploid", "()Landroid/graphics/Paint;", "attabal", "Landroid/graphics/Paint;", "Lrestrictive/saran;", "saneness", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "dern", "Landroid/graphics/Shader;", "internalShader", "Lrestrictive/empress;", "value", "wireman", "Lrestrictive/empress;", "impassible", "()Lrestrictive/empress;", "taiyuan", "(Lrestrictive/empress;)V", "pathEffect", "", "getAlpha", "()F", "(F)V", "alpha", "Lrestrictive/overspeculate;", "color", "()J", "formularize", "(J)V", "triweekly", "()I", "marial", "(I)V", "blendMode", "Lrestrictive/sayid;", "getStyle-TiuSbCo", "dovishness", TtmlNode.TAG_STYLE, "rotuma", "gintrap", "strokeWidth", "Lrestrictive/igbo;", "cutely", "strokeCap", "Lrestrictive/gusty;", "kowloon", "apical", "strokeJoin", "arytenoidectomy", "graveside", "strokeMiterLimit", "Lrestrictive/cultivated;", "adultoid", "impromptu", "filterQuality", "molybdenite", "()Landroid/graphics/Shader;", "polloi", "(Landroid/graphics/Shader;)V", "shader", "Lrestrictive/clubfoot;", "beachfront", "()Lrestrictive/clubfoot;", "competently", "(Lrestrictive/clubfoot;)V", "colorFilter", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class polder implements lotta {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public Paint internalPaint;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Shader internalShader;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int _blendMode;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public empress pathEffect;

    public polder(Paint paint) {
        this.internalPaint = paint;
        this._blendMode = saran.INSTANCE.stratoscope();
    }

    @Override // restrictive.lotta
    public int adultoid() {
        return seminary.dern(this.internalPaint);
    }

    @Override // restrictive.lotta
    public void apical(int i) {
        seminary.monoploid(this.internalPaint, i);
    }

    @Override // restrictive.lotta
    public float arytenoidectomy() {
        return seminary.beachfront(this.internalPaint);
    }

    @Override // restrictive.lotta
    public clubfoot beachfront() {
        return null;
    }

    @Override // restrictive.lotta
    public void competently(clubfoot clubfootVar) {
        seminary.formularize(this.internalPaint, clubfootVar);
    }

    @Override // restrictive.lotta
    public int cutely() {
        return seminary.wireman(this.internalPaint);
    }

    @Override // restrictive.lotta
    public long dern() {
        return seminary.saneness(this.internalPaint);
    }

    @Override // restrictive.lotta
    public void dovishness(int i) {
        seminary.graveside(this.internalPaint, i);
    }

    @Override // restrictive.lotta
    public void formularize(long j) {
        seminary.apical(this.internalPaint, j);
    }

    @Override // restrictive.lotta
    public void gintrap(float f) {
        seminary.molybdenite(this.internalPaint, f);
    }

    @Override // restrictive.lotta
    public void graveside(float f) {
        seminary.polloi(this.internalPaint, f);
    }

    @Override // restrictive.lotta
    /* JADX INFO: renamed from: impassible, reason: from getter */
    public empress getPathEffect() {
        return this.pathEffect;
    }

    @Override // restrictive.lotta
    public void impromptu(int i) {
        seminary.impassible(this.internalPaint, i);
    }

    @Override // restrictive.lotta
    public int kowloon() {
        return seminary.marial(this.internalPaint);
    }

    @Override // restrictive.lotta
    public void marial(int i) {
        if (saran.sealless(this._blendMode, i)) {
            return;
        }
        this._blendMode = i;
        seminary.cutely(this.internalPaint, i);
    }

    @Override // restrictive.lotta
    /* JADX INFO: renamed from: molybdenite, reason: from getter */
    public Shader getInternalShader() {
        return this.internalShader;
    }

    @Override // restrictive.lotta
    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public Paint getInternalPaint() {
        return this.internalPaint;
    }

    @Override // restrictive.lotta
    public void polloi(Shader shader) {
        this.internalShader = shader;
        seminary.kowloon(this.internalPaint, shader);
    }

    @Override // restrictive.lotta
    public float rotuma() {
        return seminary.competently(this.internalPaint);
    }

    @Override // restrictive.lotta
    public void saneness(float f) {
        seminary.taiyuan(this.internalPaint, f);
    }

    @Override // restrictive.lotta
    public void taiyuan(empress empressVar) {
        seminary.triweekly(this.internalPaint, empressVar);
        this.pathEffect = empressVar;
    }

    @Override // restrictive.lotta
    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public int get_blendMode() {
        return this._blendMode;
    }

    @Override // restrictive.lotta
    public void wireman(int i) {
        seminary.arytenoidectomy(this.internalPaint, i);
    }

    public polder() {
        this(seminary.impromptu());
    }
}
