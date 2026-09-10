package androidx.p001lifecycle;

import android.content.Context;
import java.util.List;
import montera.attabal;
import montera.saneness;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProcessLifecycleInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lmontera/saneness;", "Landroidx/lifecycle/arytenoidectomy;", "<init>", "()V", "Landroid/content/Context;", "context", "attabal", "(Landroid/content/Context;)Landroidx/lifecycle/arytenoidectomy;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements saneness<arytenoidectomy> {
    @Override // montera.saneness
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public arytenoidectomy create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        attabal attabalVarMarial = attabal.marial(context);
        Intrinsics.checkNotNullExpressionValue(attabalVarMarial, "getInstance(...)");
        if (!attabalVarMarial.competently(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        formularize.attabal(context);
        trm.Companion companion = trm.INSTANCE;
        companion.saneness(context);
        return companion.attabal();
    }

    @Override // montera.saneness
    public List<Class<? extends saneness<?>>> dependencies() {
        return adultoid.formularize();
    }
}
