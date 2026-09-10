package p002kotlin.reflect.jvm.internal.impl.load.java.components;

import byname.marial;
import genesic.attabal;
import java.util.Map;
import kurbash.formularize;
import p002kotlin.collections.polder;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.graveside;
import yeast.apical;
import yeast.impromptu;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f30371impromptu = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(JavaDeprecatedAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final impromptu f30372competently;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(attabal attabalVar, wireman c) {
        super(c, attabalVar, competently.attabal.f29753preprohormone);
        Intrinsics.checkNotNullParameter(c, "c");
        this.f30372competently = c.marial().dern(new Function0<Map<marial, ? extends graveside>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaDeprecatedAnnotationDescriptor$allValueArguments$2
            @Override // p002kotlin.jvm.functions.Function0
            public final Map<marial, ? extends graveside> invoke() {
                return polder.beachfront(patroclinal.formularize.attabal(saneness.f30389attabal.saneness(), new graveside("Deprecated in Java")));
            }
        });
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public Map<marial, p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently<?>> attabal() {
        return (Map) apical.attabal(this.f30372competently, this, f30371impromptu[0]);
    }
}
