package p002kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import byname.dern;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu implements marial {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final boolean f29947arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final marial f29948kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Function1<dern, Boolean> f29949monoploid;

    /* JADX WARN: Multi-variable type inference failed */
    public impromptu(marial delegate, boolean z, Function1<? super dern, Boolean> fqNameFilter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        this.f29948kowloon = delegate;
        this.f29947arytenoidectomy = z;
        this.f29949monoploid = fqNameFilter;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public dern attabal(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (this.f29949monoploid.invoke(fqName).booleanValue()) {
            return this.f29948kowloon.attabal(fqName);
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean isEmpty() {
        boolean z;
        marial marialVar = this.f29948kowloon;
        if (!(marialVar instanceof Collection) || !((Collection) marialVar).isEmpty()) {
            Iterator<dern> it = marialVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (saneness(it.next())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (this.f29947arytenoidectomy) {
            return !z;
        }
        return z;
    }

    @Override // java.lang.Iterable
    public Iterator<dern> iterator() {
        marial marialVar = this.f29948kowloon;
        ArrayList arrayList = new ArrayList();
        for (dern dernVar : marialVar) {
            if (saneness(dernVar)) {
                arrayList.add(dernVar);
            }
        }
        return arrayList.iterator();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean restrictive(dern fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (this.f29949monoploid.invoke(fqName).booleanValue()) {
            return this.f29948kowloon.restrictive(fqName);
        }
        return false;
    }

    public final boolean saneness(dern dernVar) {
        dern dernVarMarial = dernVar.marial();
        return dernVarMarial != null && this.f29949monoploid.invoke(dernVarMarial).booleanValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public impromptu(marial delegate, Function1<? super dern, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
    }
}
