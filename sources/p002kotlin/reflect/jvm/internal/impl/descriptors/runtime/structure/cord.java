package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.dern;
import byname.marial;
import genesic.stratoscope;
import java.lang.annotation.Annotation;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaValueParameter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cord extends triweekly implements stratoscope {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final rotuma f30232attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f30233dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Annotation[] f30234saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f30235wireman;

    public cord(rotuma type, Annotation[] reflectAnnotations, String str, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reflectAnnotations, "reflectAnnotations");
        this.f30232attabal = type;
        this.f30234saneness = reflectAnnotations;
        this.f30233dern = str;
        this.f30235wireman = z;
    }

    @Override // genesic.stratoscope
    public marial getName() {
        String str = this.f30233dern;
        if (str != null) {
            return marial.taiyuan(str);
        }
        return null;
    }

    @Override // genesic.stratoscope
    public boolean saneness() {
        return this.f30235wireman;
    }

    @Override // genesic.stratoscope
    /* JADX INFO: renamed from: saran, reason: merged with bridge method [inline-methods] */
    public rotuma getType() {
        return this.f30232attabal;
    }

    @Override // genesic.wireman
    public boolean stratoscope() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(cord.class.getName());
        sb.append(": ");
        sb.append(saneness() ? "vararg " : "");
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }

    @Override // genesic.wireman
    public wireman attabal(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return impromptu.attabal(this.f30234saneness, fqName);
    }

    @Override // genesic.wireman
    public List<wireman> getAnnotations() {
        return impromptu.saneness(this.f30234saneness);
    }
}
