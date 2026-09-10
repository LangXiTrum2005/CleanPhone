package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LayoutNodeDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JY\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u0018*\u00020\u001cH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u0018*\u00020\rH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\r*\u00020\u001cH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001eJ\u0017\u0010$\u001a\u00020\u000b*\u00020#H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J<\u0010.\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0000ø\u0001\u0000¢\u0006\u0004\b.\u0010/J<\u00101\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u0002002\b\u0010-\u001a\u0004\u0018\u00010,H\u0000ø\u0001\u0000¢\u0006\u0004\b1\u00102R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u0010+\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0014\u0010:\u001a\u00020\r8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\r8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b?\u00109R\u001a\u0010\f\u001a\u00020\u000b8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/ui/node/cord;", "Lmerc/beachfront;", "Lmerc/dern;", "Lmerc/attabal;", "canvasDrawScope", "<init>", "(Lmerc/attabal;)V", "Lrestrictive/overspeculate;", "color", "Lsupplicat/competently;", "topLeft", "Lsupplicat/impassible;", "size", "", "alpha", "Lmerc/competently;", TtmlNode.TAG_STYLE, "Lrestrictive/clubfoot;", "colorFilter", "Lrestrictive/saran;", "blendMode", "", "seminary", "(JJJFLmerc/competently;Lrestrictive/clubfoot;I)V", "Lmilliradian/impromptu;", "", "arytenoidectomy", "(F)I", "Lmilliradian/graveside;", "impromptu", "(J)F", "trm", "(F)F", "restrictive", "graveside", "Lmilliradian/cutely;", "saran", "(J)J", "Lrestrictive/creditor;", "canvas", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/attabal$dern;", "drawNode", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "attabal", "(Lrestrictive/creditor;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/attabal$dern;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/apical;", "saneness", "(Lrestrictive/creditor;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/apical;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "kowloon", "Lmerc/attabal;", "getCanvasDrawScope", "()Lmerc/attabal;", "Landroidx/compose/ui/node/apical;", "getDensity", "()F", "density", "Lmerc/wireman;", "merc", "()Lmerc/wireman;", "drawContext", "kattegat", "fontScale", "dern", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class cord implements merc.beachfront, merc.dern {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public apical drawNode;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final merc.attabal canvasDrawScope;

    public cord(merc.attabal attabalVar) {
        this.canvasDrawScope = attabalVar;
    }

    @Override // milliradian.wireman
    public int arytenoidectomy(float f) {
        return this.canvasDrawScope.arytenoidectomy(f);
    }

    public final void attabal(restrictive.creditor canvas, long size, NodeCoordinator coordinator, androidx.compose.ui.attabal.dern drawNode, GraphicsLayer layer) {
        int iAttabal = saran.attabal(4);
        androidx.compose.ui.attabal.dern dernVarBeachfront = drawNode;
        androidx.compose.runtime.collection.dern dernVar = null;
        while (dernVarBeachfront != null) {
            if (dernVarBeachfront instanceof apical) {
                saneness(canvas, size, coordinator, (apical) dernVarBeachfront, layer);
            } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof competently)) {
                int i = 0;
                for (androidx.compose.ui.attabal.dern delegate = ((competently) dernVarBeachfront).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                    if ((delegate.getKindSet() & iAttabal) != 0) {
                        i++;
                        if (i == 1) {
                            dernVarBeachfront = delegate;
                        } else {
                            if (dernVar == null) {
                                dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                            }
                            if (dernVarBeachfront != null) {
                                dernVar.saneness(dernVarBeachfront);
                                dernVarBeachfront = null;
                            }
                            dernVar.saneness(delegate);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            dernVarBeachfront = beachfront.beachfront(dernVar);
        }
    }

    @Override // merc.beachfront
    public long dern() {
        return this.canvasDrawScope.dern();
    }

    @Override // milliradian.wireman
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // milliradian.wireman
    public float graveside(long j) {
        return this.canvasDrawScope.graveside(j);
    }

    @Override // milliradian.apical
    public float impromptu(long j) {
        return this.canvasDrawScope.impromptu(j);
    }

    @Override // milliradian.apical
    /* JADX INFO: renamed from: kattegat */
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // merc.beachfront
    /* JADX INFO: renamed from: merc */
    public merc.wireman getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // milliradian.wireman
    public float restrictive(float f) {
        return this.canvasDrawScope.restrictive(f);
    }

    public final void saneness(restrictive.creditor canvas, long size, NodeCoordinator coordinator, apical drawNode, GraphicsLayer layer) {
        apical apicalVar = this.drawNode;
        this.drawNode = drawNode;
        merc.attabal attabalVar = this.canvasDrawScope;
        LayoutDirection layoutDirection = coordinator.getLayoutDirection();
        milliradian.wireman density = attabalVar.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = attabalVar.getDrawContext().getLayoutDirection();
        restrictive.creditor creditorVarBeachfront = attabalVar.getDrawContext().beachfront();
        long jDern = attabalVar.getDrawContext().dern();
        GraphicsLayer graphicsLayer = attabalVar.getDrawContext().getGraphicsLayer();
        merc.wireman drawContext = attabalVar.getDrawContext();
        drawContext.cutely(coordinator);
        drawContext.marial(layoutDirection);
        drawContext.taiyuan(canvas);
        drawContext.competently(size);
        drawContext.wireman(layer);
        canvas.formularize();
        try {
            drawNode.beachfront(this);
            canvas.impromptu();
            merc.wireman drawContext2 = attabalVar.getDrawContext();
            drawContext2.cutely(density);
            drawContext2.marial(layoutDirection2);
            drawContext2.taiyuan(creditorVarBeachfront);
            drawContext2.competently(jDern);
            drawContext2.wireman(graphicsLayer);
            this.drawNode = apicalVar;
        } catch (Throwable th) {
            canvas.impromptu();
            merc.wireman drawContext3 = attabalVar.getDrawContext();
            drawContext3.cutely(density);
            drawContext3.marial(layoutDirection2);
            drawContext3.taiyuan(creditorVarBeachfront);
            drawContext3.competently(jDern);
            drawContext3.wireman(graphicsLayer);
            throw th;
        }
    }

    @Override // milliradian.wireman
    public long saran(long j) {
        return this.canvasDrawScope.saran(j);
    }

    @Override // merc.beachfront
    public void seminary(long color, long topLeft, long size, float alpha, merc.competently style, restrictive.clubfoot colorFilter, int blendMode) {
        this.canvasDrawScope.seminary(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // milliradian.wireman
    public float trm(float f) {
        return this.canvasDrawScope.trm(f);
    }

    public /* synthetic */ cord(merc.attabal attabalVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new merc.attabal() : attabalVar);
    }
}
