package androidx.compose.runtime;

import com.ironsource.mediationsdk.d;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\f\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/clubfoot;", "", "Landroidx/compose/runtime/technofreak;", "scope", "", "location", d.k, "<init>", "(Landroidx/compose/runtime/technofreak;ILjava/lang/Object;)V", "", "wireman", "()Z", "attabal", "Landroidx/compose/runtime/technofreak;", "dern", "()Landroidx/compose/runtime/technofreak;", "saneness", "I", "()I", "beachfront", "(I)V", "Ljava/lang/Object;", "()Ljava/lang/Object;", "marial", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class clubfoot {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final technofreak scope;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Object instances;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int location;

    public clubfoot(technofreak technofreakVar, int i, Object obj) {
        this.scope = technofreakVar;
        this.location = i;
        this.instances = obj;
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final Object getInstances() {
        return this.instances;
    }

    public final void beachfront(int i) {
        this.location = i;
    }

    /* JADX INFO: renamed from: dern, reason: from getter */
    public final technofreak getScope() {
        return this.scope;
    }

    public final void marial(Object obj) {
        this.instances = obj;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final int getLocation() {
        return this.location;
    }

    public final boolean wireman() {
        return this.scope.gintrap(this.instances);
    }
}
