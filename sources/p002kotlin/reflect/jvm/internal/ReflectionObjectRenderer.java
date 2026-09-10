package p002kotlin.reflect.jvm.internal;

import byname.marial;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.io.IOException;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt___CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.KParameter;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001b\u001a\u00020\u001a*\u00060\u0016j\u0002`\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001a*\u00060\u0016j\u0002`\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$¨\u0006&"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "descriptor", "", "competently", "(Lkotlin/reflect/jvm/internal/impl/descriptors/saran;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;", "wireman", "(Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;)Ljava/lang/String;", "invoke", "marial", "Lkotlin/reflect/jvm/internal/KParameterImpl;", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "beachfront", "(Lkotlin/reflect/jvm/internal/KParameterImpl;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/oilcan;", "type", "impromptu", "(Lkotlin/reflect/jvm/internal/impl/types/oilcan;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lkotlin/reflect/jvm/internal/impl/descriptors/starveling;", "receiver", "", "attabal", "(Ljava/lang/StringBuilder;Lkotlin/reflect/jvm/internal/impl/descriptors/starveling;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/attabal;", "callable", "saneness", "(Ljava/lang/StringBuilder;Lkotlin/reflect/jvm/internal/impl/descriptors/attabal;)V", "dern", "(Lkotlin/reflect/jvm/internal/impl/descriptors/attabal;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderer", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReflectionObjectRenderer {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final ReflectionObjectRenderer f29548attabal = new ReflectionObjectRenderer();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final DescriptorRenderer renderer = DescriptorRenderer.f31198competently;

    /* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f29550attabal;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KParameter.Kind.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KParameter.Kind.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29550attabal = iArr;
        }
    }

    public final void attabal(StringBuilder sb, starveling starvelingVar) {
        if (starvelingVar != null) {
            oilcan type = starvelingVar.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(impromptu(type));
            sb.append(".");
        }
    }

    public final String beachfront(KParameterImpl parameter) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        StringBuilder sb = new StringBuilder();
        int i = attabal.f29550attabal[parameter.getKind().ordinal()];
        if (i == 1) {
            sb.append("extension receiver parameter");
        } else if (i == 2) {
            sb.append("instance parameter");
        } else if (i == 3) {
            sb.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb.append(" of ");
        sb.append(f29548attabal.dern(parameter.impassible().trm()));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String competently(saran descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(descriptor.restrictive() ? "var " : "val ");
        ReflectionObjectRenderer reflectionObjectRenderer = f29548attabal;
        reflectionObjectRenderer.saneness(sb, descriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        marial name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb.append(descriptorRenderer.graveside(name, true));
        sb.append(": ");
        oilcan type = descriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb.append(reflectionObjectRenderer.impromptu(type));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String dern(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal descriptor) {
        if (descriptor instanceof saran) {
            return competently((saran) descriptor);
        }
        if (descriptor instanceof dovishness) {
            return wireman((dovishness) descriptor);
        }
        throw new IllegalStateException(("Illegal callable: " + descriptor).toString());
    }

    public final String impromptu(oilcan type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return renderer.adultoid(type);
    }

    public final String marial(dovishness invoke) throws IOException {
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = f29548attabal;
        reflectionObjectRenderer.saneness(sb, invoke);
        List<cultivated> listBeachfront = invoke.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.czestochowa(listBeachfront, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1<cultivated, CharSequence>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderLambda$1$1
            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(cultivated cultivatedVar) {
                ReflectionObjectRenderer reflectionObjectRenderer2 = ReflectionObjectRenderer.f29548attabal;
                oilcan type = cultivatedVar.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return reflectionObjectRenderer2.impromptu(type);
            }
        });
        sb.append(" -> ");
        oilcan returnType = invoke.getReturnType();
        Intrinsics.beachfront(returnType);
        sb.append(reflectionObjectRenderer.impromptu(returnType));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void saneness(StringBuilder sb, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar) {
        starveling starvelingVarTaiyuan = molybdenite.taiyuan(attabalVar);
        starveling starvelingVarPolder = attabalVar.polder();
        attabal(sb, starvelingVarTaiyuan);
        boolean z = (starvelingVarTaiyuan == null || starvelingVarPolder == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        attabal(sb, starvelingVarPolder);
        if (z) {
            sb.append(")");
        }
    }

    public final String wireman(dovishness descriptor) throws IOException {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = f29548attabal;
        reflectionObjectRenderer.saneness(sb, descriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        marial name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb.append(descriptorRenderer.graveside(name, true));
        List<cultivated> listBeachfront = descriptor.beachfront();
        Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.czestochowa(listBeachfront, sb, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1<cultivated, CharSequence>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderFunction$1$1
            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(cultivated cultivatedVar) {
                ReflectionObjectRenderer reflectionObjectRenderer2 = ReflectionObjectRenderer.f29548attabal;
                oilcan type = cultivatedVar.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return reflectionObjectRenderer2.impromptu(type);
            }
        });
        sb.append(": ");
        oilcan returnType = descriptor.getReturnType();
        Intrinsics.beachfront(returnType);
        sb.append(reflectionObjectRenderer.impromptu(returnType));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
