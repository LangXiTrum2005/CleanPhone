package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import byname.dern;
import byname.marial;
import java.util.Map;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: AnnotationDescriptorImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class wireman implements dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final oilcan f29954attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final walach f29955dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<marial, competently<?>> f29956saneness;

    public wireman(oilcan oilcanVar, Map<marial, competently<?>> map, walach walachVar) {
        if (oilcanVar == null) {
            saneness(0);
        }
        if (map == null) {
            saneness(1);
        }
        if (walachVar == null) {
            saneness(2);
        }
        this.f29954attabal = oilcanVar;
        this.f29956saneness = map;
        this.f29955dern = walachVar;
    }

    public static /* synthetic */ void saneness(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 3 && i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public Map<marial, competently<?>> attabal() {
        Map<marial, competently<?>> map = this.f29956saneness;
        if (map == null) {
            saneness(4);
        }
        return map;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public walach competently() {
        walach walachVar = this.f29955dern;
        if (walachVar == null) {
            saneness(5);
        }
        return walachVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public oilcan getType() {
        oilcan oilcanVar = this.f29954attabal;
        if (oilcanVar == null) {
            saneness(3);
        }
        return oilcanVar;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern
    public dern marial() {
        return dern.attabal.attabal(this);
    }

    public String toString() {
        return DescriptorRenderer.f31198competently.arytenoidectomy(this, null);
    }
}
