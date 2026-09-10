package p002kotlin.reflect.jvm.internal.impl.renderer;

import com.ironsource.D1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.CollectionsKt___CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.builtins.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p002kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cord;
import p002kotlin.reflect.jvm.internal.impl.descriptors.creditor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cutely;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.grimness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.merc;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic;
import p002kotlin.reflect.jvm.internal.impl.descriptors.privatdozent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.seminary;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.kowloon;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.coi;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.preprohormone;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.triweekly;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;
import p002kotlin.text.CharsKt;
import p002kotlin.text.StringsKt;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: DescriptorRendererImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements p002kotlin.reflect.jvm.internal.impl.renderer.saneness {

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public final DescriptorRendererOptionsImpl f31208formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public final taiyuan f31209impassible;

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    public final class attabal implements impassible<Unit, StringBuilder> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
        public /* synthetic */ class C0697attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public static final /* synthetic */ int[] f31211attabal;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f31211attabal = iArr;
            }
        }

        public attabal() {
        }

        public void adultoid(saran descriptor, StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.hydromechanics(descriptor, builder);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit apical(trm trmVar, StringBuilder sb) {
            monoploid(trmVar, sb);
            return Unit.f29295attabal;
        }

        public void arytenoidectomy(dovishness descriptor, StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.linendraper(descriptor, builder);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit attabal(wireman wiremanVar, StringBuilder sb) throws IOException {
            triweekly(wiremanVar, sb);
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit beachfront(cultivated cultivatedVar, StringBuilder sb) {
            cuirassed(cultivatedVar, sb);
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit competently(privatdozent privatdozentVar, StringBuilder sb) throws IOException {
            dovishness(privatdozentVar, sb);
            return Unit.f29295attabal;
        }

        public void cord(clubfoot descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.nomenclative(descriptor, builder, true);
        }

        public void cuirassed(cultivated descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.brighton(descriptor, true, builder, true);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit cutely(cutely cutelyVar, StringBuilder sb) throws IOException {
            kowloon(cutelyVar, sb);
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit dern(saran saranVar, StringBuilder sb) throws IOException {
            adultoid(saranVar, sb);
            return Unit.f29295attabal;
        }

        public void dovishness(privatdozent descriptor, StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            graveside(descriptor, builder, "getter");
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit formularize(starveling starvelingVar, StringBuilder sb) {
            rotuma(starvelingVar, sb);
            return Unit.f29295attabal;
        }

        public void gintrap(creditor descriptor, StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            graveside(descriptor, builder, "setter");
        }

        public final void graveside(grimness grimnessVar, StringBuilder sb, String str) throws IOException {
            int i = C0697attabal.f31211attabal[DescriptorRendererImpl.this.nosophobia().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                arytenoidectomy(grimnessVar, sb);
                return;
            }
            DescriptorRendererImpl.this.deadwork(grimnessVar, sb);
            sb.append(str + " for ");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            saran saranVarStarveling = grimnessVar.starveling();
            Intrinsics.checkNotNullExpressionValue(saranVarStarveling, "getCorrespondingProperty(...)");
            descriptorRendererImpl.hydromechanics(saranVarStarveling, sb);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit impassible(clubfoot clubfootVar, StringBuilder sb) {
            cord(clubfootVar, sb);
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit impromptu(sealless seallessVar, StringBuilder sb) {
            polloi(seallessVar, sb);
            return Unit.f29295attabal;
        }

        public void kowloon(cutely constructorDescriptor, StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(constructorDescriptor, "constructorDescriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.cosy(constructorDescriptor, builder);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit marial(creditor creditorVar, StringBuilder sb) throws IOException {
            gintrap(creditorVar, sb);
            return Unit.f29295attabal;
        }

        public void molybdenite(merc descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.ethene(descriptor, builder);
        }

        public void monoploid(trm descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.hyalinization(descriptor, builder, true);
        }

        public void polloi(sealless descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.tout(descriptor, builder);
        }

        public void preprohormone(overspeculate descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.genii(descriptor, builder);
        }

        public void rotuma(starveling descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.append(descriptor.getName());
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit saneness(merc mercVar, StringBuilder sb) {
            molybdenite(mercVar, sb);
            return Unit.f29295attabal;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit taiyuan(dovishness dovishnessVar, StringBuilder sb) throws IOException {
            arytenoidectomy(dovishnessVar, sb);
            return Unit.f29295attabal;
        }

        public void triweekly(wireman descriptor, StringBuilder builder) throws IOException {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            DescriptorRendererImpl.this.prefect(descriptor, builder);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
        public /* bridge */ /* synthetic */ Unit wireman(overspeculate overspeculateVar, StringBuilder sb) {
            preprohormone(overspeculateVar, sb);
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: compiled from: DescriptorRendererImpl.kt */
    public /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31212attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f31213saneness;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31212attabal = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f31213saneness = iArr2;
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f31208formularize = options;
        options.lotta();
        this.f31209impassible = p002kotlin.saneness.saneness(new Function0<DescriptorRendererImpl>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final DescriptorRendererImpl invoke() {
                DescriptorRenderer descriptorRendererGintrap = this.this$0.gintrap(new Function1<saneness, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$functionTypeAnnotationsRenderer$2.1
                    @Override // p002kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(saneness sanenessVar) {
                        invoke2(sanenessVar);
                        return Unit.f29295attabal;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(saneness withOptions) {
                        Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                        withOptions.cutely(p002kotlin.collections.starveling.apical(withOptions.impromptu(), adultoid.kowloon(competently.attabal.f29774trm, competently.attabal.f29743oilcan)));
                    }
                });
                Intrinsics.competently(descriptorRendererGintrap, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
                return (DescriptorRendererImpl) descriptorRendererGintrap;
            }
        });
    }

    public static /* synthetic */ void basify(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal attabalVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        if ((i & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.immediately(sb, attabalVar, annotationUseSiteTarget);
    }

    public static /* synthetic */ void imparkation(DescriptorRendererImpl descriptorRendererImpl, premeiotic premeioticVar, StringBuilder sb, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        descriptorRendererImpl.untruth(premeioticVar, sb, z);
    }

    public static /* synthetic */ void livable(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, oilcan oilcanVar, permissivist permissivistVar, int i, Object obj) {
        if ((i & 2) != 0) {
            permissivistVar = oilcanVar.setterwort();
        }
        descriptorRendererImpl.palewise(sb, oilcanVar, permissivistVar);
    }

    public boolean achondroplasia() {
        return this.f31208formularize.premeiotic();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String adultoid(oilcan type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb = new StringBuilder();
        puffin(sb, monroe().invoke(type));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public String alloy(permissivist typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        beachfront beachfrontVarWireman = typeConstructor.wireman();
        if (beachfrontVarWireman instanceof clubfoot ? true : beachfrontVarWireman instanceof wireman ? true : beachfrontVarWireman instanceof overspeculate) {
            return licking(beachfrontVarWireman);
        }
        if (beachfrontVarWireman == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).taiyuan(new Function1<oilcan, Object>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderTypeConstructor$1
                @Override // p002kotlin.jvm.functions.Function1
                public final Object invoke(oilcan it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it instanceof p002kotlin.reflect.jvm.internal.impl.types.starveling ? ((p002kotlin.reflect.jvm.internal.impl.types.starveling) it).immediately() : it;
                }
            }) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + beachfrontVarWireman.getClass()).toString());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void apical(Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f31208formularize.apical(set);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String arytenoidectomy(dern annotation, AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        oilcan type = annotation.getType();
        sb.append(adultoid(type));
        if (clubfoot()) {
            List<String> listSakeen = sakeen(annotation);
            if (dent() || !listSakeen.isEmpty()) {
                CollectionsKt___CollectionsKt.czestochowa(listSakeen, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (claque() && (yemenite.attabal(type) || (type.setterwort().wireman() instanceof NotFoundClasses.saneness))) {
            sb.append(" /* annotation class not found */");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void attabal(boolean z) {
        this.f31208formularize.attabal(z);
    }

    public final boolean attendance(dern dernVar) {
        return Intrinsics.wireman(dernVar.marial(), competently.attabal.f29781yemenite);
    }

    public final boolean balance(molybdenite molybdeniteVar, StringBuilder sb) {
        if (!premeiotic().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (timberyard()) {
            molybdeniteVar = molybdeniteVar.beachfront();
        }
        if (!underbelly() && Intrinsics.wireman(molybdeniteVar, polloi.f30208formularize)) {
            return false;
        }
        sb.append(decarock(molybdeniteVar.dern()));
        sb.append(" ");
        return true;
    }

    public final boolean bavaria(oilcan oilcanVar) {
        if (!marial.arytenoidectomy(oilcanVar)) {
            return false;
        }
        List<timberyard> listDhss = oilcanVar.dhss();
        if ((listDhss instanceof Collection) && listDhss.isEmpty()) {
            return true;
        }
        Iterator<T> it = listDhss.iterator();
        while (it.hasNext()) {
            if (((timberyard) it.next()).saneness()) {
                return false;
            }
        }
        return true;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void beachfront(boolean z) {
        this.f31208formularize.beachfront(z);
    }

    public final boolean bleacherite(boolean z) {
        int i = saneness.f31213saneness[itchy().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return !z;
        }
        if (i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void bluecoat(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, StringBuilder sb) {
        starveling starvelingVarPolder = attabalVar.polder();
        if (starvelingVarPolder != null) {
            immediately(sb, starvelingVarPolder, AnnotationUseSiteTarget.RECEIVER);
            oilcan type = starvelingVarPolder.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(demilitarize(type));
            sb.append(".");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    public final void brighton(cultivated cultivatedVar, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(decarock("value-parameter"));
            sb.append(" ");
        }
        if (claque()) {
            sb.append("/*");
            sb.append(cultivatedVar.getIndex());
            sb.append("*/ ");
        }
        basify(this, sb, cultivatedVar, null, 2, null);
        incorrectly(sb, cultivatedVar.czestochowa(), "crossinline");
        incorrectly(sb, cultivatedVar.sayid(), "noinline");
        boolean z4 = false;
        if (preterite()) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVarSaneness = cultivatedVar.saneness();
            p002kotlin.reflect.jvm.internal.impl.descriptors.dern dernVar = attabalVarSaneness instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.dern ? (p002kotlin.reflect.jvm.internal.impl.descriptors.dern) attabalVarSaneness : null;
            if (dernVar == null || !dernVar.clubfoot()) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            incorrectly(sb, grimness(), "actual");
        }
        polliwog(cultivatedVar, z, sb, z2, z3);
        if (walach() != null) {
            if (getDebugMode() ? cultivatedVar.lightstruck() : DescriptorUtilsKt.dern(cultivatedVar)) {
                z4 = true;
            }
        }
        if (z4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" = ");
            Function1<cultivated, String> function1Walach = walach();
            Intrinsics.beachfront(function1Walach);
            sb2.append(function1Walach.invoke(cultivatedVar));
            sb.append(sb2.toString());
        }
    }

    public final String cig(String str) {
        int i = saneness.f31212attabal[lightstruck().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<font color=red><b>" + str + "</b></font>";
    }

    public boolean claque() {
        return this.f31208formularize.milliradian();
    }

    public boolean clubfoot() {
        return this.f31208formularize.cord();
    }

    public boolean coffeecake() {
        return this.f31208formularize.supplicat();
    }

    public boolean coi() {
        return this.f31208formularize.privatdozent();
    }

    public final void collection(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void competently(RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "<set-?>");
        this.f31208formularize.competently(renderingFormat);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    public final void cosy(cutely cutelyVar, StringBuilder sb) throws IOException {
        boolean z;
        p002kotlin.reflect.jvm.internal.impl.descriptors.dern dernVarCord;
        basify(this, sb, cutelyVar, null, 2, null);
        if (this.f31208formularize.hydrovane() || cutelyVar.dent().kowloon() != Modality.SEALED) {
            molybdenite visibility = cutelyVar.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
            if (balance(visibility, sb)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        tailoring(cutelyVar, sb);
        boolean z2 = coi() || !cutelyVar.clubfoot() || z;
        if (z2) {
            sb.append(decarock("constructor"));
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.competently competentlyVarSaneness = cutelyVar.saneness();
        Intrinsics.checkNotNullExpressionValue(competentlyVarSaneness, "getContainingDeclaration(...)");
        if (gusty()) {
            if (z2) {
                sb.append(" ");
            }
            hyalinization(competentlyVarSaneness, sb, true);
            List<clubfoot> typeParameters = cutelyVar.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            murrine(typeParameters, sb, false);
        }
        List<cultivated> listBeachfront = cutelyVar.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        infiltration(listBeachfront, cutelyVar.premeiotic(), sb);
        if (empress() && !cutelyVar.clubfoot() && (competentlyVarSaneness instanceof wireman) && (dernVarCord = ((wireman) competentlyVarSaneness).cord()) != null) {
            List<cultivated> listBeachfront2 = dernVarCord.beachfront();
            Intrinsics.checkNotNullExpressionValue(listBeachfront2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listBeachfront2) {
                cultivated cultivatedVar = (cultivated) obj;
                if (!cultivatedVar.lightstruck() && cultivatedVar.wostteth() == null) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(decarock("this"));
                sb.append(CollectionsKt.preterite(arrayList, ", ", "(", ")", 0, null, new Function1<cultivated, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstructor$1
                    @Override // p002kotlin.jvm.functions.Function1
                    public final CharSequence invoke(cultivated cultivatedVar2) {
                        return "";
                    }
                }, 24, null));
            }
        }
        if (gusty()) {
            List<clubfoot> typeParameters2 = cutelyVar.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
            nattier(typeParameters2, sb);
        }
    }

    public boolean creditor() {
        return this.f31208formularize.molybdenite();
    }

    public final void ctenidium(StringBuilder sb, oilcan oilcanVar) {
        if ((oilcanVar instanceof coi) && getDebugMode() && !((coi) oilcanVar).libyan()) {
            sb.append("<Not computed yet>");
            return;
        }
        empress empressVarHomozygous = oilcanVar.homozygous();
        if (empressVarHomozygous instanceof preprohormone) {
            sb.append(((preprohormone) empressVarHomozygous).basify(this, this));
        } else if (empressVarHomozygous instanceof p002kotlin.reflect.jvm.internal.impl.types.merc) {
            cybernatic(sb, (p002kotlin.reflect.jvm.internal.impl.types.merc) empressVarHomozygous);
        }
    }

    public boolean cultivated() {
        return this.f31208formularize.trm();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void cutely(Set<byname.dern> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f31208formularize.cutely(set);
    }

    public final void cybernatic(StringBuilder sb, p002kotlin.reflect.jvm.internal.impl.types.merc mercVar) {
        if (Intrinsics.wireman(mercVar, nosophobia.f31794saneness) || nosophobia.apical(mercVar)) {
            sb.append("???");
            return;
        }
        if (prescient.competently.kowloon(mercVar)) {
            if (!julian()) {
                sb.append("???");
                return;
            }
            permissivist permissivistVar = mercVar.setterwort();
            Intrinsics.competently(permissivistVar, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb.append(cig(((prescient.beachfront) permissivistVar).competently(0)));
            return;
        }
        if (yemenite.attabal(mercVar)) {
            tarboosh(sb, mercVar);
        } else if (bavaria(mercVar)) {
            stupefactive(sb, mercVar);
        } else {
            tarboosh(sb, mercVar);
        }
    }

    public boolean czestochowa() {
        return this.f31208formularize.creditor();
    }

    public final void deadwork(grimness grimnessVar, StringBuilder sb) {
        liable(grimnessVar, sb);
    }

    public final String decarock(String str) {
        int i = saneness.f31212attabal[lightstruck().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!creditor()) {
                return "<b>" + str + "</b>";
            }
        }
        return str;
    }

    public final String demilitarize(oilcan oilcanVar) {
        String strAdultoid = adultoid(oilcanVar);
        if ((!bavaria(oilcanVar) || nosophobia.formularize(oilcanVar)) && !(oilcanVar instanceof triweekly)) {
            return strAdultoid;
        }
        return '(' + strAdultoid + ')';
    }

    public boolean dent() {
        return this.f31208formularize.cuirassed();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void dern(boolean z) {
        this.f31208formularize.dern(z);
    }

    public boolean dhss() {
        return this.f31208formularize.nosophobia();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String dovishness(timberyard typeProjection) throws IOException {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        StringBuilder sb = new StringBuilder();
        merc(sb, graveside.marial(typeProjection));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public boolean empress() {
        return this.f31208formularize.saran();
    }

    public final void ethene(merc mercVar, StringBuilder sb) {
        undecorated(mercVar.marial(), "package", sb);
        if (getDebugMode()) {
            sb.append(" in context of ");
            hyalinization(mercVar.monroe(), sb, false);
        }
    }

    public final String fastrack(p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> competentlyVar) {
        Function1<p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>, String> function1Polder = this.f31208formularize.polder();
        if (function1Polder != null) {
            return function1Polder.invoke(competentlyVar);
        }
        if (competentlyVar instanceof p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness) {
            List<? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> listSaneness = ((p002kotlin.reflect.jvm.internal.impl.resolve.constants.saneness) competentlyVar).saneness();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listSaneness.iterator();
            while (it.hasNext()) {
                String strFastrack = fastrack((p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently) it.next());
                if (strFastrack != null) {
                    arrayList.add(strFastrack);
                }
            }
            return CollectionsKt.preterite(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (competentlyVar instanceof p002kotlin.reflect.jvm.internal.impl.resolve.constants.attabal) {
            return StringsKt.hardpan(DescriptorRenderer.monoploid(this, ((p002kotlin.reflect.jvm.internal.impl.resolve.constants.attabal) competentlyVar).saneness(), null, 2, null), "@");
        }
        if (!(competentlyVar instanceof kowloon)) {
            return competentlyVar.toString();
        }
        kowloon.saneness sanenessVarSaneness = ((kowloon) competentlyVar).saneness();
        if (sanenessVarSaneness instanceof kowloon.saneness.attabal) {
            return ((kowloon.saneness.attabal) sanenessVarSaneness).attabal() + "::class";
        }
        if (!(sanenessVarSaneness instanceof kowloon.saneness.C0700saneness)) {
            throw new NoWhenBranchMatchedException();
        }
        kowloon.saneness.C0700saneness c0700saneness = (kowloon.saneness.C0700saneness) sanenessVarSaneness;
        String strSaneness = c0700saneness.saneness().saneness().saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        for (int i = 0; i < c0700saneness.attabal(); i++) {
            strSaneness = "kotlin.Array<" + strSaneness + '>';
        }
        return strSaneness + "::class";
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void formularize(p002kotlin.reflect.jvm.internal.impl.renderer.attabal attabalVar) {
        Intrinsics.checkNotNullParameter(attabalVar, "<set-?>");
        this.f31208formularize.formularize(attabalVar);
    }

    public final void genii(overspeculate overspeculateVar, StringBuilder sb) {
        basify(this, sb, overspeculateVar, null, 2, null);
        molybdenite visibility = overspeculateVar.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        balance(visibility, sb);
        liable(overspeculateVar, sb);
        sb.append(decarock("typealias"));
        sb.append(" ");
        hyalinization(overspeculateVar, sb, true);
        List<clubfoot> listTriweekly = overspeculateVar.triweekly();
        Intrinsics.checkNotNullExpressionValue(listTriweekly, "getDeclaredTypeParameters(...)");
        murrine(listTriweekly, sb, false);
        tectonization(overspeculateVar, sb);
        sb.append(" = ");
        sb.append(adultoid(overspeculateVar.underbelly()));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public boolean getDebugMode() {
        return this.f31208formularize.getDebugMode();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String graveside(byname.marial name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strSeminary = seminary(marial.saneness(name));
        if (!creditor() || lightstruck() != RenderingFormat.HTML || !z) {
            return strSeminary;
        }
        return "<b>" + strSeminary + "</b>";
    }

    public boolean grimness() {
        return this.f31208formularize.arytenoidectomy();
    }

    public boolean gusty() {
        return this.f31208formularize.splinterproof();
    }

    public boolean hardpan() {
        return this.f31208formularize.treadless();
    }

    public final void harlequinade(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, StringBuilder sb) {
        starveling starvelingVarPolder;
        if (lotta() && (starvelingVarPolder = attabalVar.polder()) != null) {
            sb.append(" on ");
            oilcan type = starvelingVarPolder.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(adultoid(type));
        }
    }

    public boolean herdbook() {
        return this.f31208formularize.itchy();
    }

    public final void homophylic(dovishness dovishnessVar, StringBuilder sb) {
        incorrectly(sb, dovishnessVar.isSuspend(), "suspend");
    }

    public final String homozygous() {
        return seminary("<");
    }

    public final void hyalinization(apical apicalVar, StringBuilder sb, boolean z) {
        byname.marial name = apicalVar.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb.append(graveside(name, z));
    }

    public final void hydromechanics(saran saranVar, StringBuilder sb) throws IOException {
        saran saranVar2;
        StringBuilder sb2;
        if (palmyra()) {
            saranVar2 = saranVar;
            sb2 = sb;
        } else {
            if (!picketboat()) {
                polyfoil(saranVar, sb);
                List<starveling> listGusty = saranVar.gusty();
                Intrinsics.checkNotNullExpressionValue(listGusty, "getContextReceiverParameters(...)");
                pruinose(listGusty, sb);
                molybdenite visibility = saranVar.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                balance(visibility, sb);
                boolean z = false;
                incorrectly(sb, premeiotic().contains(DescriptorRendererModifier.CONST) && saranVar.isConst(), "const");
                liable(saranVar, sb);
                miliaria(saranVar, sb);
                rajahship(saranVar, sb);
                if (premeiotic().contains(DescriptorRendererModifier.LATEINIT) && saranVar.picketboat()) {
                    z = true;
                }
                incorrectly(sb, z, "lateinit");
                tailoring(saranVar, sb);
            }
            saranVar2 = saranVar;
            sb2 = sb;
            imparkation(this, saranVar2, sb2, false, 4, null);
            List<clubfoot> typeParameters = saranVar2.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            murrine(typeParameters, sb2, true);
            bluecoat(saranVar2, sb2);
        }
        hyalinization(saranVar2, sb2, true);
        sb2.append(": ");
        oilcan type = saranVar2.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(adultoid(type));
        harlequinade(saranVar2, sb2);
        libya(saranVar2, sb2);
        List<clubfoot> typeParameters2 = saranVar2.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        nattier(typeParameters2, sb2);
    }

    public p002kotlin.reflect.jvm.internal.impl.renderer.attabal hydrovane() {
        return this.f31208formularize.adultoid();
    }

    public final void hypokinesis(StringBuilder sb, List<? extends clubfoot> list) {
        Iterator<? extends clubfoot> it = list.iterator();
        while (it.hasNext()) {
            nomenclative(it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public boolean igbo() {
        return this.f31208formularize.mathsort();
    }

    public final void immediately(StringBuilder sb, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal attabalVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (premeiotic().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<byname.dern> setImpromptu = attabalVar instanceof oilcan ? impromptu() : mathsort();
            Function1<dern, Boolean> function1Privatdozent = privatdozent();
            for (dern dernVar : attabalVar.getAnnotations()) {
                if (!CollectionsKt.permissivist(setImpromptu, dernVar.marial()) && !attendance(dernVar) && (function1Privatdozent == null || function1Privatdozent.invoke(dernVar).booleanValue())) {
                    sb.append(arytenoidectomy(dernVar, annotationUseSiteTarget));
                    if (peridotite()) {
                        sb.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void impassible(boolean z) {
        this.f31208formularize.impassible(z);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public Set<byname.dern> impromptu() {
        return this.f31208formularize.impromptu();
    }

    public final void incorrectly(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(decarock(str));
            sb.append(" ");
        }
    }

    public final void infiltration(Collection<? extends cultivated> collection2, boolean z, StringBuilder sb) {
        boolean zBleacherite = bleacherite(z);
        int size = collection2.size();
        unconsolidated().saneness(size, sb);
        int i = 0;
        for (cultivated cultivatedVar : collection2) {
            unconsolidated().attabal(cultivatedVar, i, size, sb);
            brighton(cultivatedVar, zBleacherite, sb, false);
            unconsolidated().dern(cultivatedVar, i, size, sb);
            i++;
        }
        unconsolidated().wireman(size, sb);
    }

    public ParameterNameRenderingPolicy itchy() {
        return this.f31208formularize.kattegat();
    }

    public boolean julian() {
        return this.f31208formularize.cultivated();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String kowloon(apical declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.dovishness(new attabal(), sb);
        if (hardpan()) {
            restrictive(sb, declarationDescriptor);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final boolean lampshade(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.wireman().isEmpty();
    }

    public boolean lerp() {
        return this.f31208formularize.restrictive();
    }

    public final void liable(cord cordVar, StringBuilder sb) {
        incorrectly(sb, cordVar.isExternal(), D1.e);
        boolean z = false;
        incorrectly(sb, premeiotic().contains(DescriptorRendererModifier.EXPECT) && cordVar.coffeecake(), "expect");
        if (premeiotic().contains(DescriptorRendererModifier.ACTUAL) && cordVar.peridotite()) {
            z = true;
        }
        incorrectly(sb, z, "actual");
    }

    public final void libya(premeiotic premeioticVar, StringBuilder sb) {
        p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> competentlyVarLotta;
        String strFastrack;
        if (!permissivist() || (competentlyVarLotta = premeioticVar.lotta()) == null || (strFastrack = fastrack(competentlyVarLotta)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(seminary(strFastrack));
    }

    public final void libyan(StringBuilder sb, p002kotlin.reflect.jvm.internal.impl.types.attabal attabalVar) {
        RenderingFormat renderingFormatLightstruck = lightstruck();
        RenderingFormat renderingFormat = RenderingFormat.HTML;
        if (renderingFormatLightstruck == renderingFormat) {
            sb.append("<font color=\"808080\"><i>");
        }
        sb.append(" /* = ");
        ctenidium(sb, attabalVar.trm());
        sb.append(" */");
        if (lightstruck() == renderingFormat) {
            sb.append("</i></font>");
        }
    }

    public String licking(beachfront klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return prescient.competently.impassible(klass) ? klass.impromptu().toString() : hydrovane().attabal(klass, this);
    }

    public RenderingFormat lightstruck() {
        return this.f31208formularize.dent();
    }

    public final void likeable(wireman wiremanVar, StringBuilder sb) throws IOException {
        if (outmarry() || p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.czestochowa(wiremanVar.impassible())) {
            return;
        }
        Collection<oilcan> collectionCutely = wiremanVar.impromptu().cutely();
        Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
        if (collectionCutely.isEmpty()) {
            return;
        }
        if (collectionCutely.size() == 1 && p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.premeiotic(collectionCutely.iterator().next())) {
            return;
        }
        collection(sb);
        sb.append(": ");
        CollectionsKt___CollectionsKt.czestochowa(collectionCutely, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1<oilcan, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderSuperTypes$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(oilcan oilcanVar) {
                DescriptorRendererImpl descriptorRendererImpl = this.this$0;
                Intrinsics.beachfront(oilcanVar);
                return descriptorRendererImpl.adultoid(oilcanVar);
            }
        });
    }

    public final void linendraper(dovishness dovishnessVar, StringBuilder sb) throws IOException {
        dovishness dovishnessVar2;
        StringBuilder sb2;
        if (palmyra()) {
            dovishnessVar2 = dovishnessVar;
            sb2 = sb;
        } else {
            if (picketboat()) {
                dovishnessVar2 = dovishnessVar;
                sb2 = sb;
            } else {
                dovishnessVar2 = dovishnessVar;
                sb2 = sb;
                basify(this, sb2, dovishnessVar2, null, 2, null);
                List<starveling> listGusty = dovishnessVar2.gusty();
                Intrinsics.checkNotNullExpressionValue(listGusty, "getContextReceiverParameters(...)");
                pruinose(listGusty, sb2);
                molybdenite visibility = dovishnessVar2.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                balance(visibility, sb2);
                miliaria(dovishnessVar2, sb2);
                if (overspeculate()) {
                    liable(dovishnessVar2, sb2);
                }
                rajahship(dovishnessVar2, sb2);
                if (overspeculate()) {
                    molet(dovishnessVar2, sb2);
                } else {
                    homophylic(dovishnessVar2, sb2);
                }
                tailoring(dovishnessVar2, sb2);
                if (claque()) {
                    if (dovishnessVar2.julian()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (dovishnessVar2.claque()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(decarock("fun"));
            sb2.append(" ");
            List<clubfoot> typeParameters = dovishnessVar2.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            murrine(typeParameters, sb2, true);
            bluecoat(dovishnessVar2, sb2);
        }
        hyalinization(dovishnessVar2, sb2, true);
        List<cultivated> listBeachfront = dovishnessVar2.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        infiltration(listBeachfront, dovishnessVar2.premeiotic(), sb2);
        harlequinade(dovishnessVar2, sb2);
        oilcan returnType = dovishnessVar2.getReturnType();
        if (!technofreak() && (achondroplasia() || returnType == null || !p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.hardpan(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : adultoid(returnType));
        }
        List<clubfoot> typeParameters2 = dovishnessVar2.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        nattier(typeParameters2, sb2);
    }

    public boolean lotta() {
        return this.f31208formularize.seminary();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void marial(boolean z) {
        this.f31208formularize.marial(z);
    }

    public final Modality mastfed(cord cordVar) {
        if (cordVar instanceof wireman) {
            return ((wireman) cordVar).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        apical apicalVarSaneness = cordVar.saneness();
        wireman wiremanVar = apicalVarSaneness instanceof wireman ? (wireman) apicalVarSaneness : null;
        if (wiremanVar == null) {
            return Modality.FINAL;
        }
        if (!(cordVar instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) cordVar;
        Collection<? extends CallableMemberDescriptor> collectionWireman = callableMemberDescriptor.wireman();
        Intrinsics.checkNotNullExpressionValue(collectionWireman, "getOverriddenDescriptors(...)");
        if (!collectionWireman.isEmpty() && wiremanVar.kowloon() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (wiremanVar.getKind() != ClassKind.INTERFACE || Intrinsics.wireman(callableMemberDescriptor.getVisibility(), polloi.f30203attabal)) {
            return Modality.FINAL;
        }
        Modality modalityKowloon = callableMemberDescriptor.kowloon();
        Modality modality = Modality.ABSTRACT;
        return modalityKowloon == modality ? modality : Modality.OPEN;
    }

    public Set<byname.dern> mathsort() {
        return this.f31208formularize.rotuma();
    }

    public final void merc(StringBuilder sb, List<? extends timberyard> list) throws IOException {
        CollectionsKt___CollectionsKt.czestochowa(list, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1<timberyard, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$appendTypeProjections$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(timberyard it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.saneness()) {
                    return "*";
                }
                DescriptorRendererImpl descriptorRendererImpl = this.this$0;
                oilcan type = it.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                String strAdultoid = descriptorRendererImpl.adultoid(type);
                if (it.dern() == Variance.INVARIANT) {
                    return strAdultoid;
                }
                return it.dern() + ' ' + strAdultoid;
            }
        });
    }

    public final void microanalysis(StringBuilder sb, seminary seminaryVar) {
        seminary seminaryVarDern = seminaryVar.dern();
        if (seminaryVarDern != null) {
            microanalysis(sb, seminaryVarDern);
            sb.append('.');
            byname.marial name = seminaryVar.saneness().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb.append(graveside(name, false));
        } else {
            permissivist permissivistVarImpromptu = seminaryVar.saneness().impromptu();
            Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
            sb.append(alloy(permissivistVarImpromptu));
        }
        sb.append(saccharic(seminaryVar.attabal()));
    }

    public final void microchemistry(apical apicalVar, StringBuilder sb) {
        if (sayid()) {
            if (palmyra()) {
                sb.append("companion object");
            }
            collection(sb);
            apical apicalVarSaneness = apicalVar.saneness();
            if (apicalVarSaneness != null) {
                sb.append("of ");
                byname.marial name = apicalVarSaneness.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb.append(graveside(name, false));
            }
        }
        if (claque() || !Intrinsics.wireman(apicalVar.getName(), byname.competently.f15247wireman)) {
            if (!palmyra()) {
                collection(sb);
            }
            byname.marial name2 = apicalVar.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb.append(graveside(name2, true));
        }
    }

    public final void miliaria(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (p002kotlin.reflect.jvm.internal.impl.resolve.marial.merc(callableMemberDescriptor) && callableMemberDescriptor.kowloon() == Modality.FINAL) {
            return;
        }
        if (treadless() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.kowloon() == Modality.OPEN && lampshade(callableMemberDescriptor)) {
            return;
        }
        Modality modalityKowloon = callableMemberDescriptor.kowloon();
        Intrinsics.checkNotNullExpressionValue(modalityKowloon, "getModality(...)");
        twybill(modalityKowloon, sb, mastfed(callableMemberDescriptor));
    }

    public final DescriptorRendererOptionsImpl milliradian() {
        return this.f31208formularize;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    public final void molet(dovishness dovishnessVar, StringBuilder sb) {
        boolean z;
        boolean z2 = false;
        if (dovishnessVar.isOperator()) {
            Collection<? extends dovishness> collectionWireman = dovishnessVar.wireman();
            Intrinsics.checkNotNullExpressionValue(collectionWireman, "getOverriddenDescriptors(...)");
            Collection<? extends dovishness> collection2 = collectionWireman;
            if (!collection2.isEmpty()) {
                Iterator<T> it = collection2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((dovishness) it.next()).isOperator()) {
                            if (!saran()) {
                                z = false;
                            }
                        }
                    }
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (dovishnessVar.isInfix()) {
            Collection<? extends dovishness> collectionWireman2 = dovishnessVar.wireman();
            Intrinsics.checkNotNullExpressionValue(collectionWireman2, "getOverriddenDescriptors(...)");
            Collection<? extends dovishness> collection3 = collectionWireman2;
            if (collection3.isEmpty()) {
                z2 = true;
            } else {
                Iterator<T> it2 = collection3.iterator();
                while (it2.hasNext()) {
                    if (((dovishness) it2.next()).isInfix()) {
                        if (saran()) {
                            break;
                        }
                    }
                }
                z2 = true;
            }
        }
        incorrectly(sb, dovishnessVar.preprohormone(), "tailrec");
        homophylic(dovishnessVar, sb);
        incorrectly(sb, dovishnessVar.isInline(), "inline");
        incorrectly(sb, z2, "infix");
        incorrectly(sb, z, "operator");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String molybdenite(byname.wireman fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List<byname.marial> listImpromptu = fqName.impromptu();
        Intrinsics.checkNotNullExpressionValue(listImpromptu, "pathSegments(...)");
        return sultanate(listImpromptu);
    }

    public Function1<oilcan, oilcan> monroe() {
        return this.f31208formularize.permissivist();
    }

    public final void murrine(List<? extends clubfoot> list, StringBuilder sb, boolean z) {
        if (dhss() || list.isEmpty()) {
            return;
        }
        sb.append(homozygous());
        hypokinesis(sb, list);
        sb.append(vesuvio());
        if (z) {
            sb.append(" ");
        }
    }

    public final void nattier(List<? extends clubfoot> list, StringBuilder sb) throws IOException {
        if (dhss()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        for (clubfoot clubfootVar : list) {
            List<oilcan> upperBounds = clubfootVar.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            for (oilcan oilcanVar : CollectionsKt.premeiotic(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                byname.marial name = clubfootVar.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb2.append(graveside(name, false));
                sb2.append(" : ");
                Intrinsics.beachfront(oilcanVar);
                sb2.append(adultoid(oilcanVar));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(decarock("where"));
        sb.append(" ");
        CollectionsKt___CollectionsKt.czestochowa(arrayList, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
    }

    public final void nomenclative(clubfoot clubfootVar, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(homozygous());
        }
        if (claque()) {
            sb.append("/*");
            sb.append(clubfootVar.getIndex());
            sb.append("*/ ");
        }
        incorrectly(sb, clubfootVar.graveside(), "reified");
        String label = clubfootVar.cutely().getLabel();
        boolean z2 = true;
        incorrectly(sb, label.length() > 0, label);
        basify(this, sb, clubfootVar, null, 2, null);
        hyalinization(clubfootVar, sb, z);
        int size = clubfootVar.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            oilcan next = clubfootVar.getUpperBounds().iterator().next();
            if (!p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.lotta(next)) {
                sb.append(" : ");
                Intrinsics.beachfront(next);
                sb.append(adultoid(next));
            }
        } else if (z) {
            for (oilcan oilcanVar : clubfootVar.getUpperBounds()) {
                if (!p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.lotta(oilcanVar)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    Intrinsics.beachfront(oilcanVar);
                    sb.append(adultoid(oilcanVar));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(vesuvio());
        }
    }

    public PropertyAccessorRenderingPolicy nosophobia() {
        return this.f31208formularize.merc();
    }

    public final void osteal(wireman wiremanVar, StringBuilder sb) {
        sb.append(decarock(DescriptorRenderer.f31196attabal.attabal(wiremanVar)));
    }

    public boolean outmarry() {
        return this.f31208formularize.lerp();
    }

    public boolean overspeculate() {
        return this.f31208formularize.preprohormone();
    }

    public final void palewise(StringBuilder sb, oilcan oilcanVar, permissivist permissivistVar) {
        seminary seminaryVarAttabal = TypeParameterUtilsKt.attabal(oilcanVar);
        if (seminaryVarAttabal != null) {
            microanalysis(sb, seminaryVarAttabal);
        } else {
            sb.append(alloy(permissivistVar));
            sb.append(saccharic(oilcanVar.dhss()));
        }
    }

    public boolean palmyra() {
        return this.f31208formularize.clubfoot();
    }

    public boolean peridotite() {
        return this.f31208formularize.gintrap();
    }

    public boolean permissivist() {
        return this.f31208formularize.stratoscope();
    }

    public boolean picketboat() {
        return this.f31208formularize.overspeculate();
    }

    public final String polder() {
        int i = saneness.f31212attabal[lightstruck().ordinal()];
        if (i == 1) {
            return seminary("->");
        }
        if (i == 2) {
            return "&rarr;";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void polliwog(premeiotic premeioticVar, boolean z, StringBuilder sb, boolean z2, boolean z3) {
        oilcan type = premeioticVar.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        cultivated cultivatedVar = premeioticVar instanceof cultivated ? (cultivated) premeioticVar : null;
        oilcan oilcanVarWostteth = cultivatedVar != null ? cultivatedVar.wostteth() : null;
        oilcan oilcanVar = oilcanVarWostteth == null ? type : oilcanVarWostteth;
        incorrectly(sb, oilcanVarWostteth != null, "vararg");
        if (z3 || (z2 && !palmyra())) {
            untruth(premeioticVar, sb, z3);
        }
        if (z) {
            hyalinization(premeioticVar, sb, z2);
            sb.append(": ");
        }
        sb.append(adultoid(oilcanVar));
        libya(premeioticVar, sb);
        if (!claque() || oilcanVarWostteth == null) {
            return;
        }
        sb.append(" /*");
        sb.append(adultoid(type));
        sb.append("*/");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String polloi(String lowerRendered, String upperRendered, p002kotlin.reflect.jvm.internal.impl.builtins.beachfront builtIns) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (marial.beachfront(lowerRendered, upperRendered)) {
            if (!p002kotlin.text.dovishness.starveling(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        p002kotlin.reflect.jvm.internal.impl.renderer.attabal attabalVarHydrovane = hydrovane();
        wireman wiremanVarGintrap = builtIns.gintrap();
        Intrinsics.checkNotNullExpressionValue(wiremanVarGintrap, "getCollection(...)");
        String strCig = StringsKt.cig(attabalVarHydrovane.attabal(wiremanVarGintrap, this), "Collection", null, 2, null);
        String strWireman = marial.wireman(lowerRendered, strCig + "Mutable", upperRendered, strCig, strCig + "(Mutable)");
        if (strWireman != null) {
            return strWireman;
        }
        String strWireman2 = marial.wireman(lowerRendered, strCig + "MutableMap.MutableEntry", upperRendered, strCig + "Map.Entry", strCig + "(Mutable)Map.(Mutable)Entry");
        if (strWireman2 != null) {
            return strWireman2;
        }
        p002kotlin.reflect.jvm.internal.impl.renderer.attabal attabalVarHydrovane2 = hydrovane();
        wireman wiremanVarCutely = builtIns.cutely();
        Intrinsics.checkNotNullExpressionValue(wiremanVarCutely, "getArray(...)");
        String strCig2 = StringsKt.cig(attabalVarHydrovane2.attabal(wiremanVarCutely, this), "Array", null, 2, null);
        String strWireman3 = marial.wireman(lowerRendered, strCig2 + seminary("Array<"), upperRendered, strCig2 + seminary("Array<out "), strCig2 + seminary("Array<(out) "));
        if (strWireman3 != null) {
            return strWireman3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    public final void polyfoil(saran saranVar, StringBuilder sb) {
        if (premeiotic().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            basify(this, sb, saranVar, null, 2, null);
            p002kotlin.reflect.jvm.internal.impl.descriptors.adultoid adultoidVarIgbo = saranVar.igbo();
            if (adultoidVarIgbo != null) {
                immediately(sb, adultoidVarIgbo, AnnotationUseSiteTarget.FIELD);
            }
            p002kotlin.reflect.jvm.internal.impl.descriptors.adultoid adultoidVarSeminary = saranVar.seminary();
            if (adultoidVarSeminary != null) {
                immediately(sb, adultoidVarSeminary, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
            }
            if (nosophobia() == PropertyAccessorRenderingPolicy.NONE) {
                privatdozent getter = saranVar.getGetter();
                if (getter != null) {
                    immediately(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                }
                creditor setter = saranVar.getSetter();
                if (setter != null) {
                    immediately(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                    List<cultivated> listBeachfront = setter.beachfront();
                    Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
                    cultivated cultivatedVar = (cultivated) CollectionsKt.herdbook(listBeachfront);
                    Intrinsics.beachfront(cultivatedVar);
                    immediately(sb, cultivatedVar, AnnotationUseSiteTarget.SETTER_PARAMETER);
                }
            }
        }
    }

    public final void prefect(wireman wiremanVar, StringBuilder sb) throws IOException {
        p002kotlin.reflect.jvm.internal.impl.descriptors.dern dernVarCord;
        boolean z = wiremanVar.getKind() == ClassKind.ENUM_ENTRY;
        if (!palmyra()) {
            basify(this, sb, wiremanVar, null, 2, null);
            List<starveling> listMathsort = wiremanVar.mathsort();
            Intrinsics.checkNotNullExpressionValue(listMathsort, "getContextReceivers(...)");
            pruinose(listMathsort, sb);
            if (!z) {
                molybdenite visibility = wiremanVar.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                balance(visibility, sb);
            }
            if ((wiremanVar.getKind() != ClassKind.INTERFACE || wiremanVar.kowloon() != Modality.ABSTRACT) && (!wiremanVar.getKind().isSingleton() || wiremanVar.kowloon() != Modality.FINAL)) {
                Modality modalityKowloon = wiremanVar.kowloon();
                Intrinsics.checkNotNullExpressionValue(modalityKowloon, "getModality(...)");
                twybill(modalityKowloon, sb, mastfed(wiremanVar));
            }
            liable(wiremanVar, sb);
            incorrectly(sb, premeiotic().contains(DescriptorRendererModifier.INNER) && wiremanVar.gintrap(), "inner");
            incorrectly(sb, premeiotic().contains(DescriptorRendererModifier.DATA) && wiremanVar.herdbook(), "data");
            incorrectly(sb, premeiotic().contains(DescriptorRendererModifier.INLINE) && wiremanVar.isInline(), "inline");
            incorrectly(sb, premeiotic().contains(DescriptorRendererModifier.VALUE) && wiremanVar.treadless(), "value");
            incorrectly(sb, premeiotic().contains(DescriptorRendererModifier.FUN) && wiremanVar.permissivist(), "fun");
            osteal(wiremanVar, sb);
        }
        if (p002kotlin.reflect.jvm.internal.impl.resolve.marial.rotuma(wiremanVar)) {
            microchemistry(wiremanVar, sb);
        } else {
            if (!palmyra()) {
                collection(sb);
            }
            hyalinization(wiremanVar, sb, true);
        }
        if (z) {
            return;
        }
        List<clubfoot> listTriweekly = wiremanVar.triweekly();
        Intrinsics.checkNotNullExpressionValue(listTriweekly, "getDeclaredTypeParameters(...)");
        murrine(listTriweekly, sb, false);
        tectonization(wiremanVar, sb);
        if (!wiremanVar.getKind().isSingleton() && starveling() && (dernVarCord = wiremanVar.cord()) != null) {
            sb.append(" ");
            basify(this, sb, dernVarCord, null, 2, null);
            molybdenite visibility2 = dernVarCord.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility2, "getVisibility(...)");
            balance(visibility2, sb);
            sb.append(decarock("constructor"));
            List<cultivated> listBeachfront = dernVarCord.beachfront();
            Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
            infiltration(listBeachfront, dernVarCord.premeiotic(), sb);
        }
        likeable(wiremanVar, sb);
        nattier(listTriweekly, sb);
    }

    public Set<DescriptorRendererModifier> premeiotic() {
        return this.f31208formularize.oilcan();
    }

    public boolean preterite() {
        return this.f31208formularize.walach();
    }

    public Function1<dern, Boolean> privatdozent() {
        return this.f31208formularize.polloi();
    }

    public final void pruinose(List<? extends starveling> list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        int i = 0;
        for (starveling starvelingVar : list) {
            int i2 = i + 1;
            immediately(sb, starvelingVar, AnnotationUseSiteTarget.RECEIVER);
            oilcan type = starvelingVar.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(demilitarize(type));
            if (i == adultoid.triweekly(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    public final void puffin(StringBuilder sb, oilcan oilcanVar) {
        empress empressVarHomozygous = oilcanVar.homozygous();
        p002kotlin.reflect.jvm.internal.impl.types.attabal attabalVar = empressVarHomozygous instanceof p002kotlin.reflect.jvm.internal.impl.types.attabal ? (p002kotlin.reflect.jvm.internal.impl.types.attabal) empressVarHomozygous : null;
        if (attabalVar == null) {
            ctenidium(sb, oilcanVar);
            return;
        }
        if (wostteth()) {
            ctenidium(sb, attabalVar.trm());
            return;
        }
        ctenidium(sb, attabalVar.prefect());
        if (igbo()) {
            libyan(sb, attabalVar);
        }
    }

    public final void rajahship(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (premeiotic().contains(DescriptorRendererModifier.OVERRIDE) && lampshade(callableMemberDescriptor) && treadless() != OverrideRenderingPolicy.RENDER_OPEN) {
            incorrectly(sb, true, "override");
            if (claque()) {
                sb.append("/*");
                sb.append(callableMemberDescriptor.wireman().size());
                sb.append("*/ ");
            }
        }
    }

    public final void restrictive(StringBuilder sb, apical apicalVar) {
        apical apicalVarSaneness;
        String name;
        if ((apicalVar instanceof sealless) || (apicalVar instanceof merc) || (apicalVarSaneness = apicalVar.saneness()) == null || (apicalVarSaneness instanceof trm)) {
            return;
        }
        sb.append(" ");
        sb.append(vir("defined in"));
        sb.append(" ");
        byname.wireman wiremanVarImpassible = p002kotlin.reflect.jvm.internal.impl.resolve.marial.impassible(apicalVarSaneness);
        Intrinsics.checkNotNullExpressionValue(wiremanVarImpassible, "getFqName(...)");
        sb.append(wiremanVarImpassible.marial() ? "root package" : molybdenite(wiremanVarImpassible));
        if (herdbook() && (apicalVarSaneness instanceof sealless) && (apicalVar instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly) && (name = ((p002kotlin.reflect.jvm.internal.impl.descriptors.triweekly) apicalVar).competently().saneness().getName()) != null) {
            sb.append(" ");
            sb.append(vir("in file"));
            sb.append(" ");
            sb.append(name);
        }
    }

    public String saccharic(List<? extends timberyard> typeArguments) throws IOException {
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(homozygous());
        merc(sb, typeArguments);
        sb.append(vesuvio());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final List<String> sakeen(dern dernVar) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.dern dernVarCord;
        List<cultivated> listBeachfront;
        Map<byname.marial, p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> mapAttabal = dernVar.attabal();
        List listFormularize = null;
        wireman wiremanVarTaiyuan = czestochowa() ? DescriptorUtilsKt.taiyuan(dernVar) : null;
        if (wiremanVarTaiyuan != null && (dernVarCord = wiremanVarTaiyuan.cord()) != null && (listBeachfront = dernVarCord.beachfront()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listBeachfront) {
                if (((cultivated) obj).lightstruck()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((cultivated) it.next()).getName());
            }
            listFormularize = arrayList2;
        }
        if (listFormularize == null) {
            listFormularize = adultoid.formularize();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listFormularize) {
            byname.marial marialVar = (byname.marial) obj2;
            Intrinsics.beachfront(marialVar);
            if (!mapAttabal.containsKey(marialVar)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(p002kotlin.collections.dovishness.gintrap(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((byname.marial) it2.next()).dern() + " = ...");
        }
        Set<Map.Entry<byname.marial, p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>>> setEntrySet = mapAttabal.entrySet();
        ArrayList arrayList5 = new ArrayList(p002kotlin.collections.dovishness.gintrap(setEntrySet, 10));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            byname.marial marialVar2 = (byname.marial) entry.getKey();
            p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> competentlyVar = (p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently) entry.getValue();
            StringBuilder sb = new StringBuilder();
            sb.append(marialVar2.dern());
            sb.append(" = ");
            sb.append(!listFormularize.contains(marialVar2) ? fastrack(competentlyVar) : "...");
            arrayList5.add(sb.toString());
        }
        return CollectionsKt.vesuvio(CollectionsKt.unconsolidated(arrayList4, arrayList5));
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void saneness(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "<set-?>");
        this.f31208formularize.saneness(parameterNameRenderingPolicy);
    }

    public boolean saran() {
        return this.f31208formularize.monoploid();
    }

    public boolean sayid() {
        return this.f31208formularize.grimness();
    }

    public final String seminary(String str) {
        return lightstruck().escape(str);
    }

    public boolean sensatory() {
        return this.f31208formularize.starveling();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void setDebugMode(boolean z) {
        this.f31208formularize.setDebugMode(z);
    }

    public final boolean setterwort(oilcan oilcanVar) {
        return marial.polloi(oilcanVar) || !oilcanVar.getAnnotations().isEmpty();
    }

    public final DescriptorRendererImpl splinterproof() {
        return (DescriptorRendererImpl) this.f31209impassible.getValue();
    }

    public boolean starveling() {
        return this.f31208formularize.graveside();
    }

    public final void stupefactive(StringBuilder sb, oilcan oilcanVar) {
        byname.marial marialVarWireman;
        int length = sb.length();
        basify(splinterproof(), sb, oilcanVar, null, 2, null);
        boolean z = sb.length() != length;
        oilcan oilcanVarApical = marial.apical(oilcanVar);
        List<oilcan> listMarial = marial.marial(oilcanVar);
        if (!listMarial.isEmpty()) {
            sb.append("context(");
            Iterator<oilcan> it = listMarial.subList(0, adultoid.triweekly(listMarial)).iterator();
            while (it.hasNext()) {
                puffin(sb, it.next());
                sb.append(", ");
            }
            puffin(sb, (oilcan) CollectionsKt.igbo(listMarial));
            sb.append(") ");
        }
        boolean zPolloi = marial.polloi(oilcanVar);
        boolean zMastfed = oilcanVar.mastfed();
        boolean z2 = zMastfed || (z && oilcanVarApical != null);
        if (z2) {
            if (zPolloi) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    CharsKt.saneness(p002kotlin.text.cord.liable(sb));
                    if (sb.charAt(StringsKt.milliradian(sb) - 1) != ')') {
                        sb.insert(StringsKt.milliradian(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        incorrectly(sb, zPolloi, "suspend");
        if (oilcanVarApical != null) {
            boolean z3 = (bavaria(oilcanVarApical) && !oilcanVarApical.mastfed()) || setterwort(oilcanVarApical) || (oilcanVarApical instanceof triweekly);
            if (z3) {
                sb.append("(");
            }
            puffin(sb, oilcanVarApical);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!marial.triweekly(oilcanVar) || oilcanVar.dhss().size() > 1) {
            int i = 0;
            for (timberyard timberyardVar : marial.impassible(oilcanVar)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (coffeecake()) {
                    oilcan type = timberyardVar.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    marialVarWireman = marial.wireman(type);
                } else {
                    marialVarWireman = null;
                }
                if (marialVarWireman != null) {
                    sb.append(graveside(marialVarWireman, false));
                    sb.append(": ");
                }
                sb.append(dovishness(timberyardVar));
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        sb.append(polder());
        sb.append(" ");
        puffin(sb, marial.formularize(oilcanVar));
        if (z2) {
            sb.append(")");
        }
        if (zMastfed) {
            sb.append("?");
        }
    }

    public final String sultanate(List<byname.marial> list) {
        return seminary(marial.dern(list));
    }

    public final void tailoring(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (premeiotic().contains(DescriptorRendererModifier.MEMBER_KIND) && claque() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            sb.append(saccharine.attabal.beachfront(callableMemberDescriptor.getKind().name()));
            sb.append("*/ ");
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public AnnotationArgumentsRenderingPolicy taiyuan() {
        return this.f31208formularize.taiyuan();
    }

    public final void tarboosh(StringBuilder sb, oilcan oilcanVar) {
        basify(this, sb, oilcanVar, null, 2, null);
        triweekly triweeklyVar = oilcanVar instanceof triweekly ? (triweekly) oilcanVar : null;
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarPrefect = triweeklyVar != null ? triweeklyVar.prefect() : null;
        if (yemenite.attabal(oilcanVar)) {
            if (TypeUtilsKt.adultoid(oilcanVar) && lerp()) {
                sb.append(cig(prescient.competently.f35667attabal.arytenoidectomy(oilcanVar)));
            } else {
                if (!(oilcanVar instanceof prescient.marial) || cultivated()) {
                    sb.append(oilcanVar.setterwort().toString());
                } else {
                    sb.append(((prescient.marial) oilcanVar).immediately());
                }
                sb.append(saccharic(oilcanVar.dhss()));
            }
        } else if (oilcanVar instanceof p002kotlin.reflect.jvm.internal.impl.types.starveling) {
            sb.append(((p002kotlin.reflect.jvm.internal.impl.types.starveling) oilcanVar).immediately().toString());
        } else if (mercVarPrefect instanceof p002kotlin.reflect.jvm.internal.impl.types.starveling) {
            sb.append(((p002kotlin.reflect.jvm.internal.impl.types.starveling) mercVarPrefect).immediately().toString());
        } else {
            livable(this, sb, oilcanVar, null, 2, null);
        }
        if (oilcanVar.mastfed()) {
            sb.append("?");
        }
        if (p002kotlin.reflect.jvm.internal.impl.types.saran.dern(oilcanVar)) {
            sb.append(" & Any");
        }
    }

    public boolean technofreak() {
        return this.f31208formularize.coffeecake();
    }

    public final void tectonization(p002kotlin.reflect.jvm.internal.impl.descriptors.competently competentlyVar, StringBuilder sb) {
        List<clubfoot> listTriweekly = competentlyVar.triweekly();
        Intrinsics.checkNotNullExpressionValue(listTriweekly, "getDeclaredTypeParameters(...)");
        List<clubfoot> parameters = competentlyVar.impromptu().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (claque() && competentlyVar.gintrap() && parameters.size() > listTriweekly.size()) {
            sb.append(" /*captured type parameters: ");
            hypokinesis(sb, parameters.subList(listTriweekly.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public boolean timberyard() {
        return this.f31208formularize.yemenite();
    }

    public final void tout(sealless seallessVar, StringBuilder sb) {
        undecorated(seallessVar.marial(), "package-fragment", sb);
        if (getDebugMode()) {
            sb.append(" in ");
            hyalinization(seallessVar.saneness(), sb, false);
        }
    }

    public OverrideRenderingPolicy treadless() {
        return this.f31208formularize.sealless();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public void triweekly(boolean z) {
        this.f31208formularize.triweekly(z);
    }

    public final void twybill(Modality modality, StringBuilder sb, Modality modality2) {
        if (sensatory() || modality != modality2) {
            incorrectly(sb, premeiotic().contains(DescriptorRendererModifier.MODALITY), saccharine.attabal.beachfront(modality.name()));
        }
    }

    public DescriptorRenderer.saneness unconsolidated() {
        return this.f31208formularize.timberyard();
    }

    public final void undecorated(byname.dern dernVar, String str, StringBuilder sb) {
        sb.append(decarock(str));
        byname.wireman wiremanVarCutely = dernVar.cutely();
        Intrinsics.checkNotNullExpressionValue(wiremanVarCutely, "toUnsafe(...)");
        String strMolybdenite = molybdenite(wiremanVarCutely);
        if (strMolybdenite.length() > 0) {
            sb.append(" ");
            sb.append(strMolybdenite);
        }
    }

    public boolean underbelly() {
        return this.f31208formularize.hydrovane();
    }

    public final void untruth(premeiotic premeioticVar, StringBuilder sb, boolean z) {
        if (z || !(premeioticVar instanceof cultivated)) {
            sb.append(decarock(premeioticVar.restrictive() ? "var" : "val"));
            sb.append(" ");
        }
    }

    public final String vesuvio() {
        return seminary(">");
    }

    public String vir(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i = saneness.f31212attabal[lightstruck().ordinal()];
        if (i == 1) {
            return message;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + message + "</i>";
    }

    public Function1<cultivated, String> walach() {
        return this.f31208formularize.dovishness();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.renderer.saneness
    public boolean wireman() {
        return this.f31208formularize.wireman();
    }

    public boolean wostteth() {
        return this.f31208formularize.peridotite();
    }
}
