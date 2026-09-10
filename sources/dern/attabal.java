package dern;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContextAwareHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Ldern/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "wireman", "()Landroid/content/Context;", "Ldern/saneness;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "attabal", "(Ldern/saneness;)V", "marial", "context", "dern", "(Landroid/content/Context;)V", "saneness", "", "Ljava/util/Set;", "listeners", "Landroid/content/Context;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Set<saneness> listeners = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public volatile Context context;

    public final void attabal(saneness listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.context;
        if (context != null) {
            listener.attabal(context);
        }
        this.listeners.add(listener);
    }

    public final void dern(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Iterator<saneness> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().attabal(context);
        }
    }

    public final void marial(saneness listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void saneness() {
        this.context = null;
    }

    /* JADX INFO: renamed from: wireman, reason: from getter */
    public final Context getContext() {
        return this.context;
    }
}
