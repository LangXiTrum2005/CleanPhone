package p002kotlin.reflect.jvm.internal.impl.load.java.components;

import byname.marial;
import genesic.attabal;
import java.util.Map;
import kurbash.formularize;
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
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f30373impromptu = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(JavaRetentionAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final impromptu f30374competently;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(attabal annotation, wireman c) {
        super(c, annotation, competently.attabal.f29762seminary);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c, "c");
        this.f30374competently = c.marial().dern(new Function0<Map<marial, ? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Map<marial, ? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> invoke() {
                p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?> competentlyVarAttabal = JavaAnnotationTargetMapper.f30368attabal.attabal(this.this$0.saneness());
                Map<marial, ? extends p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> mapBeachfront = competentlyVarAttabal != null ? polder.beachfront(patroclinal.formularize.attabal(saneness.f30389attabal.dern(), competentlyVarAttabal)) : null;
                return mapBeachfront == null ? seminary.taiyuan() : mapBeachfront;
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public Map<marial, p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> attabal() {
        return (Map) apical.attabal(this.f30374competently, this, f30373impromptu[0]);
    }
}
