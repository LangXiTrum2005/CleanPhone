package p002kotlin.reflect.jvm.internal.impl.load.java.components;

import byname.marial;
import genesic.attabal;
import genesic.impassible;
import genesic.saneness;
import java.util.Map;
import kurbash.formularize;
import p002kotlin.collections.graveside;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import yeast.apical;
import yeast.impromptu;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f30375impromptu = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final impromptu f30376competently;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(attabal annotation, wireman c) {
        super(c, annotation, competently.attabal.f29768supplicat);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c, "c");
        this.f30376competently = c.marial().dern(new Function0<Map<marial, ? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<? extends Object>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Map<marial, ? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<? extends Object>> invoke() {
                p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> competentlyVarDern;
                saneness sanenessVarSaneness = this.this$0.saneness();
                if (sanenessVarSaneness instanceof genesic.marial) {
                    competentlyVarDern = JavaAnnotationTargetMapper.f30368attabal.dern(((genesic.marial) this.this$0.saneness()).dern());
                } else {
                    competentlyVarDern = sanenessVarSaneness instanceof impassible ? JavaAnnotationTargetMapper.f30368attabal.dern(graveside.marial(this.this$0.saneness())) : null;
                }
                Map<marial, ? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<? extends Object>> mapBeachfront = competentlyVarDern != null ? polder.beachfront(patroclinal.formularize.attabal(saneness.f30389attabal.wireman(), competentlyVarDern)) : null;
                return mapBeachfront == null ? seminary.taiyuan() : mapBeachfront;
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public Map<marial, p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<Object>> attabal() {
        return (Map) apical.attabal(this.f30376competently, this, f30375impromptu[0]);
    }
}
