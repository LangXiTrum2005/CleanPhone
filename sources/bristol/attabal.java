package bristol;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b#\u0010\u0017R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b \u0010\u0017R \u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b&\u0010\u0017¨\u0006("}, d2 = {"Lbristol/attabal;", "", "", "serialName", "<init>", "(Ljava/lang/String;)V", "elementName", "Lbristol/beachfront;", "descriptor", "", "", "annotations", "", "isOptional", "", "attabal", "(Ljava/lang/String;Lbristol/beachfront;Ljava/util/List;Z)V", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "saneness", "Ljava/util/List;", "dern", "()Ljava/util/List;", "impromptu", "(Ljava/util/List;)V", "getAnnotations$annotations", "()V", "", "beachfront", "elementNames", "", "wireman", "Ljava/util/Set;", "uniqueNames", "marial", "elementDescriptors", "elementAnnotations", "competently", "elementOptionality", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final String serialName;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final List<List<Annotation>> elementAnnotations;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final List<Boolean> elementOptionality;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final List<String> elementNames;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final List<beachfront> elementDescriptors;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public List<? extends Annotation> annotations;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Set<String> uniqueNames;

    public attabal(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.serialName = serialName;
        this.annotations = adultoid.formularize();
        this.elementNames = new ArrayList();
        this.uniqueNames = new HashSet();
        this.elementDescriptors = new ArrayList();
        this.elementAnnotations = new ArrayList();
        this.elementOptionality = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void saneness(attabal attabalVar, String str, beachfront beachfrontVar, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = adultoid.formularize();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        attabalVar.attabal(str, beachfrontVar, list, z);
    }

    public final void attabal(String elementName, beachfront descriptor, List<? extends Annotation> annotations, boolean isOptional) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.uniqueNames.add(elementName)) {
            this.elementNames.add(elementName);
            this.elementDescriptors.add(descriptor);
            this.elementAnnotations.add(annotations);
            this.elementOptionality.add(Boolean.valueOf(isOptional));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.serialName).toString());
    }

    public final List<String> beachfront() {
        return this.elementNames;
    }

    public final List<Boolean> competently() {
        return this.elementOptionality;
    }

    public final List<Annotation> dern() {
        return this.annotations;
    }

    public final void impromptu(List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.annotations = list;
    }

    public final List<beachfront> marial() {
        return this.elementDescriptors;
    }

    public final List<List<Annotation>> wireman() {
        return this.elementAnnotations;
    }
}
