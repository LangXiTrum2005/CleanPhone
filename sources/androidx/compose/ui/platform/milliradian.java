package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.graphics.Path;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OutlineResolver.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J0\u0010'\u001a\u00020\b*\u0004\u0018\u00010\u001d2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R$\u00108\u001a\u00020\b2\u0006\u00106\u001a\u00020\b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b/\u00107R\u0016\u00109\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010)R\u0018\u0010:\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00102R\u0018\u0010<\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010;R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010=R\u001c\u0010@\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010?R\u001c\u0010A\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010?R\u0016\u0010C\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010)R\u0018\u0010E\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00102R\u0018\u0010G\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00102R\u0013\u0010I\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010HR\u0011\u0010J\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u00107R\u0013\u0010L\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b1\u0010K\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/platform/milliradian;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/dern;", "outline", "", "alpha", "", "clipToOutline", "elevation", "Lsupplicat/impassible;", "size", "impromptu", "(Landroidx/compose/ui/graphics/dern;FZFJ)Z", "Lsupplicat/competently;", X3.i.L, "beachfront", "(J)Z", "Lrestrictive/creditor;", "canvas", "", "attabal", "(Lrestrictive/creditor;)V", "taiyuan", "Lsupplicat/taiyuan;", "rect", "apical", "(Lsupplicat/taiyuan;)V", "Lsupplicat/apical;", "roundRect", "formularize", "(Lsupplicat/apical;)V", "Landroidx/compose/ui/graphics/Path;", "composePath", "cutely", "(Landroidx/compose/ui/graphics/Path;)V", "offset", "radius", "competently", "(Lsupplicat/apical;JJF)Z", "Z", "isSupportedOutline", "Landroid/graphics/Outline;", "saneness", "Landroid/graphics/Outline;", "cachedOutline", "dern", "Landroidx/compose/ui/graphics/dern;", "wireman", "Landroidx/compose/ui/graphics/Path;", "cachedRrectPath", "marial", "outlinePath", "<set-?>", "()Z", "cacheIsDirty", "usePathForClip", "tmpPath", "Lsupplicat/apical;", "tmpRoundRect", "F", "roundedCornerRadius", "J", "rectTopLeft", "rectSize", "impassible", "outlineNeeded", "triweekly", "tmpTouchPointPath", "kowloon", "tmpOpPath", "()Landroid/graphics/Outline;", "androidOutline", "outlineClipSupported", "()Landroidx/compose/ui/graphics/Path;", "clipPath", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class milliradian {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public long rectTopLeft;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public boolean isSupportedOutline = true;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public boolean cacheIsDirty;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public boolean usePathForClip;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public float roundedCornerRadius;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.graphics.dern outline;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public long rectSize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public boolean outlineNeeded;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public Path tmpPath;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public Path tmpOpPath;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public Path outlinePath;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Outline cachedOutline;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public supplicat.apical tmpRoundRect;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public Path tmpTouchPointPath;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Path cachedRrectPath;

    public milliradian() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = supplicat.competently.INSTANCE.dern();
        this.rectSize = supplicat.impassible.INSTANCE.saneness();
    }

    public final void apical(supplicat.taiyuan rect) {
        this.rectTopLeft = supplicat.impromptu.attabal(rect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), rect.getTop());
        this.rectSize = supplicat.triweekly.attabal(rect.cutely(), rect.marial());
        this.cachedOutline.setRect(Math.round(rect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String()), Math.round(rect.getTop()), Math.round(rect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String()), Math.round(rect.getBottom()));
    }

    public final void attabal(restrictive.creditor canvas) {
        Path pathWireman = wireman();
        if (pathWireman != null) {
            restrictive.creditor.attabal(canvas, pathWireman, 0, 2, null);
            return;
        }
        float f = this.roundedCornerRadius;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            restrictive.creditor.wireman(canvas, supplicat.competently.apical(this.rectTopLeft), supplicat.competently.formularize(this.rectTopLeft), supplicat.impassible.competently(this.rectSize) + supplicat.competently.apical(this.rectTopLeft), supplicat.impassible.beachfront(this.rectSize) + supplicat.competently.formularize(this.rectTopLeft), 0, 16, null);
            return;
        }
        Path pathAttabal = this.tmpPath;
        supplicat.apical apicalVar = this.tmpRoundRect;
        if (pathAttabal == null || !competently(apicalVar, this.rectTopLeft, this.rectSize, f)) {
            supplicat.apical apicalVarSaneness = supplicat.formularize.saneness(supplicat.competently.apical(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0059: INVOKE (r0v12 'apicalVarSaneness' supplicat.apical) = 
                  (wrap float:0x002d: INVOKE 
                  (wrap long:0x002b: IGET (r0v0 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:44) androidx.compose.ui.platform.milliradian.apical long)
                 STATIC call: supplicat.competently.apical(long):float A[MD:(long):float (m), WRAPPED] (LINE:46))
                  (wrap float:0x0033: INVOKE 
                  (wrap long:0x0031: IGET (r0v0 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:50) androidx.compose.ui.platform.milliradian.apical long)
                 STATIC call: supplicat.competently.formularize(long):float A[MD:(long):float (m), WRAPPED] (LINE:52))
                  (wrap float:0x0043: ARITH (wrap float:0x0039: INVOKE 
                  (wrap long:0x0037: IGET (r0v0 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:56) androidx.compose.ui.platform.milliradian.apical long)
                 STATIC call: supplicat.competently.apical(long):float A[MD:(long):float (m), WRAPPED] (LINE:58)) + (wrap float:0x003f: INVOKE 
                  (wrap long:0x003d: IGET (r0v0 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:62) androidx.compose.ui.platform.milliradian.formularize long)
                 STATIC call: supplicat.impassible.competently(long):float A[MD:(long):float (m), WRAPPED] (LINE:64)) A[WRAPPED] (LINE:68))
                  (wrap float:0x0051: ARITH (wrap float:0x0047: INVOKE 
                  (wrap long:0x0045: IGET (r0v0 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:70) androidx.compose.ui.platform.milliradian.apical long)
                 STATIC call: supplicat.competently.formularize(long):float A[MD:(long):float (m), WRAPPED] (LINE:72)) + (wrap float:0x004d: INVOKE 
                  (wrap long:0x004b: IGET (r0v0 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:76) androidx.compose.ui.platform.milliradian.formularize long)
                 STATIC call: supplicat.impassible.beachfront(long):float A[MD:(long):float (m), WRAPPED] (LINE:78)) A[WRAPPED] (LINE:82))
                  (wrap long:0x0055: INVOKE 
                  (wrap float:0x0053: IGET (r0v0 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:84) androidx.compose.ui.platform.milliradian.cutely float)
                  (wrap float:SGET  A[WRAPPED] com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT float)
                  (2 int)
                  (null java.lang.Object)
                 STATIC call: supplicat.saneness.saneness(float, float, int, java.lang.Object):long A[MD:(float, float, int, java.lang.Object):long (m), WRAPPED] (LINE:86))
                 STATIC call: supplicat.formularize.saneness(float, float, float, float, long):supplicat.apical A[DECLARE_VAR, MD:(float, float, float, float, long):supplicat.apical (m)] (LINE:90) in method: androidx.compose.ui.platform.milliradian.attabal(restrictive.creditor):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                this = this;
                r0 = r20
                r7 = r21
                androidx.compose.ui.graphics.Path r1 = r0.wireman()
                r8 = 0
                r9 = 2
                r10 = 0
                if (r1 == 0) goto L11
                restrictive.creditor.attabal(r7, r1, r8, r9, r10)
                return
            L11:
                float r6 = r0.roundedCornerRadius
                r11 = 0
                int r1 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r1 <= 0) goto L72
                androidx.compose.ui.graphics.Path r12 = r0.tmpPath
                supplicat.apical r1 = r0.tmpRoundRect
                if (r12 == 0) goto L2a
                long r2 = r0.rectTopLeft
                long r4 = r0.rectSize
                boolean r1 = r0.competently(r1, r2, r4, r6)
                r13 = r0
                if (r1 != 0) goto L6e
                goto L2b
            L2a:
                r13 = r0
            L2b:
                long r0 = r13.rectTopLeft
                float r14 = supplicat.competently.apical(r0)
                long r0 = r13.rectTopLeft
                float r15 = supplicat.competently.formularize(r0)
                long r0 = r13.rectTopLeft
                float r0 = supplicat.competently.apical(r0)
                long r1 = r13.rectSize
                float r1 = supplicat.impassible.competently(r1)
                float r16 = r0 + r1
                long r0 = r13.rectTopLeft
                float r0 = supplicat.competently.formularize(r0)
                long r1 = r13.rectSize
                float r1 = supplicat.impassible.beachfront(r1)
                float r17 = r0 + r1
                float r0 = r13.roundedCornerRadius
                long r18 = supplicat.saneness.saneness(r0, r11, r9, r10)
                supplicat.apical r0 = supplicat.formularize.saneness(r14, r15, r16, r17, r18)
                if (r12 != 0) goto L64
                androidx.compose.ui.graphics.Path r12 = androidx.compose.ui.graphics.saneness.attabal()
                goto L67
            L64:
                r12.reset()
            L67:
                androidx.compose.ui.graphics.Path.wireman(r12, r0, r10, r9, r10)
                r13.tmpRoundRect = r0
                r13.tmpPath = r12
            L6e:
                restrictive.creditor.attabal(r7, r12, r8, r9, r10)
                return
            L72:
                r13 = r0
                long r0 = r13.rectTopLeft
                float r1 = supplicat.competently.apical(r0)
                long r2 = r13.rectTopLeft
                float r2 = supplicat.competently.formularize(r2)
                long r3 = r13.rectTopLeft
                float r0 = supplicat.competently.apical(r3)
                long r3 = r13.rectSize
                float r3 = supplicat.impassible.competently(r3)
                float r3 = r3 + r0
                long r4 = r13.rectTopLeft
                float r0 = supplicat.competently.formularize(r4)
                long r4 = r13.rectSize
                float r4 = supplicat.impassible.beachfront(r4)
                float r4 = r4 + r0
                r6 = 16
                r7 = 0
                r5 = 0
                r0 = r21
                restrictive.creditor.wireman(r0, r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.milliradian.attabal(restrictive.creditor):void");
        }

        public final boolean beachfront(long position) {
            androidx.compose.ui.graphics.dern dernVar;
            if (this.outlineNeeded && (dernVar = this.outline) != null) {
                return achondroplasia.saneness(dernVar, supplicat.competently.apical(position), supplicat.competently.formularize(position), this.tmpTouchPointPath, this.tmpOpPath);
            }
            return true;
        }

        public final boolean competently(supplicat.apical apicalVar, long j, long j2, float f) {
            return apicalVar != null && supplicat.formularize.wireman(apicalVar) && apicalVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() == supplicat.competently.apical(j) && apicalVar.getTop() == supplicat.competently.formularize(j) && apicalVar.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() == supplicat.competently.apical(j) + supplicat.impassible.competently(j2) && apicalVar.getBottom() == supplicat.competently.formularize(j) + supplicat.impassible.beachfront(j2) && supplicat.attabal.wireman(apicalVar.getTopLeftCornerRadius()) == f;
        }

        public final void cutely(Path composePath) {
            if (Build.VERSION.SDK_INT > 28 || composePath.attabal()) {
                Outline outline = this.cachedOutline;
                if (!(composePath instanceof androidx.compose.ui.graphics.attabal)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((androidx.compose.ui.graphics.attabal) composePath).getInternalPath());
                this.usePathForClip = !this.cachedOutline.canClip();
            } else {
                this.isSupportedOutline = false;
                this.cachedOutline.setEmpty();
                this.usePathForClip = true;
            }
            this.outlinePath = composePath;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final boolean getCacheIsDirty() {
            return this.cacheIsDirty;
        }

        public final void formularize(supplicat.apical roundRect) {
            float fWireman = supplicat.attabal.wireman(roundRect.getTopLeftCornerRadius());
            this.rectTopLeft = supplicat.impromptu.attabal(roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String(), roundRect.getTop());
            this.rectSize = supplicat.triweekly.attabal(roundRect.cutely(), roundRect.wireman());
            if (supplicat.formularize.wireman(roundRect)) {
                this.cachedOutline.setRoundRect(Math.round(roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String()), Math.round(roundRect.getTop()), Math.round(roundRect.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String()), Math.round(roundRect.getBottom()), fWireman);
                this.roundedCornerRadius = fWireman;
                return;
            }
            Path pathAttabal = this.cachedRrectPath;
            if (pathAttabal == null) {
                pathAttabal = androidx.compose.ui.graphics.saneness.attabal();
                this.cachedRrectPath = pathAttabal;
            }
            pathAttabal.reset();
            Path.wireman(pathAttabal, roundRect, null, 2, null);
            cutely(pathAttabal);
        }

        public final boolean impromptu(androidx.compose.ui.graphics.dern outline, float alpha, boolean clipToOutline, float elevation, long size) {
            this.cachedOutline.setAlpha(alpha);
            boolean zWireman = Intrinsics.wireman(this.outline, outline);
            boolean z = !zWireman;
            if (!zWireman) {
                this.outline = outline;
                this.cacheIsDirty = true;
            }
            this.rectSize = size;
            boolean z2 = outline != null && (clipToOutline || elevation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (this.outlineNeeded != z2) {
                this.outlineNeeded = z2;
                this.cacheIsDirty = true;
            }
            return z;
        }

        public final boolean marial() {
            return !this.usePathForClip;
        }

        public final Outline saneness() {
            taiyuan();
            if (this.outlineNeeded && this.isSupportedOutline) {
                return this.cachedOutline;
            }
            return null;
        }

        public final void taiyuan() {
            if (this.cacheIsDirty) {
                this.rectTopLeft = supplicat.competently.INSTANCE.dern();
                this.roundedCornerRadius = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.outlinePath = null;
                this.cacheIsDirty = false;
                this.usePathForClip = false;
                androidx.compose.ui.graphics.dern dernVar = this.outline;
                if (dernVar == null || !this.outlineNeeded || supplicat.impassible.competently(this.rectSize) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || supplicat.impassible.beachfront(this.rectSize) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.cachedOutline.setEmpty();
                    return;
                }
                this.isSupportedOutline = true;
                if (dernVar instanceof androidx.compose.ui.graphics.dern.saneness) {
                    apical(((androidx.compose.ui.graphics.dern.saneness) dernVar).saneness());
                } else if (dernVar instanceof androidx.compose.ui.graphics.dern.C0046dern) {
                    formularize(((androidx.compose.ui.graphics.dern.C0046dern) dernVar).getRoundRect());
                } else if (dernVar instanceof androidx.compose.ui.graphics.dern.attabal) {
                    cutely(((androidx.compose.ui.graphics.dern.attabal) dernVar).getPath());
                }
            }
        }

        public final Path wireman() {
            taiyuan();
            return this.outlinePath;
        }
    }
