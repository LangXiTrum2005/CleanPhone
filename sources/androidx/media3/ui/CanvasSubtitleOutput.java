package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.Output {
    public final ArrayList e0;
    public List f0;
    public float g0;
    public CaptionStyleCompat h0;
    public float i0;

    public CanvasSubtitleOutput(Context context) {
        super(context, null);
        this.e0 = new ArrayList();
        this.f0 = Collections.EMPTY_LIST;
        this.g0 = 0.0533f;
        this.h0 = CaptionStyleCompat.g;
        this.i0 = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.Output
    public final void a(List list, CaptionStyleCompat captionStyleCompat, float f, float f2) {
        this.f0 = list;
        this.h0 = captionStyleCompat;
        this.g0 = f;
        this.i0 = f2;
        while (true) {
            ArrayList arrayList = this.e0;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new SubtitlePainter(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:191:0x0469  */
    /* JADX WARN: Code duplicated, block: B:193:0x046c  */
    /* JADX WARN: Code duplicated, block: B:195:0x046f  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        boolean z2;
        int iRound;
        float f2;
        int i6;
        float f3;
        int i7;
        int iMax;
        int iMin;
        int iRound2;
        CanvasSubtitleOutput canvasSubtitleOutput = this;
        List list = canvasSubtitleOutput.f0;
        if (list.isEmpty()) {
            return;
        }
        int height = canvasSubtitleOutput.getHeight();
        int paddingLeft = canvasSubtitleOutput.getPaddingLeft();
        int paddingTop = canvasSubtitleOutput.getPaddingTop();
        int width = canvasSubtitleOutput.getWidth() - canvasSubtitleOutput.getPaddingRight();
        int paddingBottom = height - canvasSubtitleOutput.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i8 = paddingBottom - paddingTop;
        float fB = SubtitleViewUtils.b(0, canvasSubtitleOutput.g0, height, i8);
        float f4 = 0.0f;
        if (fB <= 0.0f) {
            return;
        }
        int size = list.size();
        int i9 = 0;
        while (i9 < size) {
            Cue cueA = (Cue) list.get(i9);
            float f5 = f4;
            if (cueA.f5603p != Integer.MIN_VALUE) {
                Cue.Builder builderA = cueA.a();
                builderA.f5608h = -3.4028235E38f;
                builderA.f5609i = Integer.MIN_VALUE;
                builderA.f5606c = null;
                int i10 = cueA.f;
                float f6 = cueA.f5598e;
                if (i10 == 0) {
                    builderA.f5607e = 1.0f - f6;
                    builderA.f = 0;
                } else {
                    builderA.f5607e = (-f6) - 1.0f;
                    builderA.f = 1;
                }
                int i11 = cueA.g;
                if (i11 == 0) {
                    builderA.g = 2;
                } else if (i11 == 2) {
                    builderA.g = 0;
                }
                cueA = builderA.a();
            }
            float fB2 = SubtitleViewUtils.b(cueA.f5602n, cueA.o, height, i8);
            SubtitlePainter subtitlePainter = (SubtitlePainter) canvasSubtitleOutput.e0.get(i9);
            CaptionStyleCompat captionStyleCompat = canvasSubtitleOutput.h0;
            List list2 = list;
            float f7 = canvasSubtitleOutput.i0;
            subtitlePainter.getClass();
            Bitmap bitmap = cueA.d;
            int i12 = height;
            boolean z3 = bitmap == null;
            int i13 = i8;
            CharSequence charSequence = cueA.f5595a;
            if (z3) {
                if (TextUtils.isEmpty(charSequence)) {
                    f = fB;
                    i2 = size;
                    i4 = i9;
                } else {
                    i2 = size;
                    i3 = cueA.f5601l ? cueA.m : captionStyleCompat.f7688c;
                }
                z2 = false;
                i9 = i4 + 1;
                canvasSubtitleOutput = this;
                f4 = f5;
                list = list2;
                height = i12;
                i8 = i13;
                size = i2;
                fB = f;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
            } else {
                i2 = size;
                i3 = -16777216;
            }
            i4 = i9;
            CharSequence charSequence2 = subtitlePainter.f7742i;
            TextPaint textPaint = subtitlePainter.f;
            float f8 = cueA.k;
            f = fB;
            float f9 = cueA.j;
            int i14 = cueA.f5600i;
            float f10 = cueA.f5599h;
            int i15 = cueA.g;
            int i16 = cueA.f;
            float f11 = cueA.f5598e;
            Layout.Alignment alignment = cueA.f5596b;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Util.a(subtitlePainter.j, alignment) && subtitlePainter.k == bitmap && subtitlePainter.f7743l == f11 && subtitlePainter.m == i16) {
                i5 = i15;
                if (Integer.valueOf(subtitlePainter.f7744n).equals(Integer.valueOf(i5)) && subtitlePainter.o == f10 && Integer.valueOf(subtitlePainter.f7745p).equals(Integer.valueOf(i14)) && subtitlePainter.q == f9 && subtitlePainter.r == f8 && subtitlePainter.s == captionStyleCompat.f7686a && subtitlePainter.t == captionStyleCompat.f7687b && subtitlePainter.f7746u == i3 && subtitlePainter.f7747w == captionStyleCompat.d && subtitlePainter.v == captionStyleCompat.f7689e && Util.a(textPaint.getTypeface(), captionStyleCompat.f) && subtitlePainter.x == f && subtitlePainter.y == fB2 && subtitlePainter.f7748z == f7 && subtitlePainter.f7731A == paddingLeft && subtitlePainter.f7732B == paddingTop && subtitlePainter.C == width && subtitlePainter.D == paddingBottom) {
                    subtitlePainter.a(canvas, z3);
                    z2 = false;
                }
                i9 = i4 + 1;
                canvasSubtitleOutput = this;
                f4 = f5;
                list = list2;
                height = i12;
                i8 = i13;
                size = i2;
                fB = f;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
            } else {
                i5 = i15;
            }
            subtitlePainter.f7742i = charSequence;
            subtitlePainter.j = alignment;
            subtitlePainter.k = bitmap;
            subtitlePainter.f7743l = f11;
            subtitlePainter.m = i16;
            subtitlePainter.f7744n = i5;
            subtitlePainter.o = f10;
            subtitlePainter.f7745p = i14;
            subtitlePainter.q = f9;
            subtitlePainter.r = f8;
            subtitlePainter.s = captionStyleCompat.f7686a;
            subtitlePainter.t = captionStyleCompat.f7687b;
            subtitlePainter.f7746u = i3;
            subtitlePainter.f7747w = captionStyleCompat.d;
            subtitlePainter.v = captionStyleCompat.f7689e;
            textPaint.setTypeface(captionStyleCompat.f);
            subtitlePainter.x = f;
            subtitlePainter.y = fB2;
            subtitlePainter.f7748z = f7;
            subtitlePainter.f7731A = paddingLeft;
            subtitlePainter.f7732B = paddingTop;
            subtitlePainter.C = width;
            subtitlePainter.D = paddingBottom;
            if (z3) {
                subtitlePainter.f7742i.getClass();
                CharSequence charSequence3 = subtitlePainter.f7742i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(subtitlePainter.f7742i);
                int i17 = subtitlePainter.C - subtitlePainter.f7731A;
                int i18 = subtitlePainter.D - subtitlePainter.f7732B;
                textPaint.setTextSize(subtitlePainter.x);
                int i19 = (int) ((subtitlePainter.x * 0.125f) + 0.5f);
                int i20 = i19 * 2;
                int i21 = i17 - i20;
                float f12 = subtitlePainter.q;
                if (f12 != r11) {
                    i21 = (int) (i21 * f12);
                }
                int i22 = i21;
                if (i22 <= 0) {
                    Log.g("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f = f;
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                } else {
                    if (subtitlePainter.y > f5) {
                        f = f;
                        i7 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) subtitlePainter.y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        f = f;
                        i7 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (subtitlePainter.f7747w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i7, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i23 = 0;
                        for (int length = foregroundColorSpanArr.length; i23 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i23]);
                            i23++;
                        }
                    }
                    if (Color.alpha(subtitlePainter.t) > 0) {
                        int i24 = subtitlePainter.f7747w;
                        if (i24 == 0 || i24 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(subtitlePainter.t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(subtitlePainter.t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = subtitlePainter.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02e6: CONSTRUCTOR (r24v2 'staticLayout' android.text.StaticLayout) = 
                          (r25v1 'spannableStringBuilder3' android.text.SpannableStringBuilder)
                          (r2v6 ?? I:??[OBJECT, ARRAY])
                          (r27v1 'i22' int)
                          (r28v1 'alignment3' android.text.Layout$Alignment)
                          (wrap float:0x02de: IGET (r11v6 'subtitlePainter' androidx.media3.ui.SubtitlePainter) A[WRAPPED] (LINE:735) androidx.media3.ui.SubtitlePainter.d float)
                          (wrap float:0x02da: IGET (r11v6 'subtitlePainter' androidx.media3.ui.SubtitlePainter) A[WRAPPED] (LINE:731) androidx.media3.ui.SubtitlePainter.e float)
                          true
                         A[DECLARE_VAR, MD:(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, float, float, boolean):void (c)] (LINE:743) call: android.text.StaticLayout.<init>(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, float, float, boolean):void type: CONSTRUCTOR in method: androidx.media3.ui.CanvasSubtitleOutput.dispatchDraw(android.graphics.Canvas):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
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
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v6 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1179
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.CanvasSubtitleOutput.dispatchDraw(android.graphics.Canvas):void");
                }
            }
